package gregtech.client.model.pipeline;

import gregtech.client.shader.Shaders;

import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.util.math.MathHelper;

// This is a verbatim copy of VertexLighterSmoothAo except with a custom base class.
// Ao Features are disabled when the shader is active.
public class VertexLighterSmoothAoSpecial extends VertexLighterFlatSpecial {

    public VertexLighterSmoothAoSpecial(BlockColors colors) {
        super(colors);
    }

    @Override
    protected void updateLightmap(float[] normal, float[] lightmap, float x, float y, float z) {
        if (Shaders.isOptiFineShaderPackLoaded()) {
            super.updateLightmap(normal, lightmap, x, y, z);
            return;
        }

        lightmap[0] = calcLightmap(blockInfo.getBlockLight(), x, y, z);
        lightmap[1] = calcLightmap(blockInfo.getSkyLight(), x, y, z);
    }

    @Override
    protected void updateColor(float[] normal, float[] color, float x, float y, float z, float tint, int multiplier) {
        super.updateColor(normal, color, x, y, z, tint, multiplier);

        if (Shaders.isOptiFineShaderPackLoaded()) {
            return;
        }

        float a = getAo(x, y, z);
        color[0] *= a;
        color[1] *= a;
        color[2] *= a;
    }

    protected static float calcLightmap(float[][][][] light, float x, float y, float z) {
        x *= 2;
        y *= 2;
        z *= 2;
        float l2 = x * x + y * y + z * z;
        if (l2 > 6 - 2e-2f) {
            float s = (float) Math.sqrt((6 - 2e-2f) / l2);
            x *= s;
            y *= s;
            z *= s;
        }
        float ax = x > 0 ? x : -x;
        float ay = y > 0 ? y : -y;
        float az = z > 0 ? z : -z;
        float e1 = 1 + 1e-4f;
        if (ax > 2 - 1e-4f && ay <= e1 && az <= e1) {
            x = x < 0 ? -2 + 1e-4f : 2 - 1e-4f;
        } else if (ay > 2 - 1e-4f && az <= e1 && ax <= e1) {
            y = y < 0 ? -2 + 1e-4f : 2 - 1e-4f;
        } else if (az > 2 - 1e-4f && ax <= e1 && ay <= e1) {
            z = z < 0 ? -2 + 1e-4f : 2 - 1e-4f;
        }
        ax = x > 0 ? x : -x;
        ay = y > 0 ? y : -y;
        az = z > 0 ? z : -z;
        if (ax <= e1 && ay + az > 3f - 1e-4f) {
            float s = (3f - 1e-4f) / (ay + az);
            y *= s;
            z *= s;
        } else if (ay <= e1 && az + ax > 3f - 1e-4f) {
            float s = (3f - 1e-4f) / (az + ax);
            z *= s;
            x *= s;
        } else if (az <= e1 && ax + ay > 3f - 1e-4f) {
            float s = (3f - 1e-4f) / (ax + ay);
            x *= s;
            y *= s;
        } else if (ax + ay + az > 4 - 1e-4f) {
            float s = (4 - 1e-4f) / (ax + ay + az);
            x *= s;
            y *= s;
            z *= s;
        }

        float l = 0;
        float s = 0;

        for (int ix = 0; ix <= 1; ix++) {
            for (int iy = 0; iy <= 1; iy++) {
                for (int iz = 0; iz <= 1; iz++) {
                    float vx = x * (1 - ix * 2);
                    float vy = y * (1 - iy * 2);
                    float vz = z * (1 - iz * 2);

                    float s3 = vx + vy + vz + 4;
                    float sx = vy + vz + 3;
                    float sy = vz + vx + 3;
                    float sz = vx + vy + 3;

                    float bx = (2 * vx + vy + vz + 6) / (s3 * sy * sz * (vx + 2));
                    s += bx;
                    l += bx * light[0][ix][iy][iz];

                    float by = (2 * vy + vz + vx + 6) / (s3 * sz * sx * (vy + 2));
                    s += by;
                    l += by * light[1][ix][iy][iz];

                    float bz = (2 * vz + vx + vy + 6) / (s3 * sx * sy * (vz + 2));
                    s += bz;
                    l += bz * light[2][ix][iy][iz];
                }
            }
        }

        l /= s;

        if (l > 15f * 0x20 / 0xFFFF) l = 15f * 0x20 / 0xFFFF;
        if (l < 0) l = 0;

        return l;
    }

    protected float getAo(float x, float y, float z) {
        int sx = x < 0 ? 1 : 2;
        int sy = y < 0 ? 1 : 2;
        int sz = z < 0 ? 1 : 2;

        if (x < 0) x++;
        if (y < 0) y++;
        if (z < 0) z++;

        float a = 0;
        float[][][] ao = blockInfo.getAo();
        a += ao[sx - 1][sy - 1][sz - 1] * (1 - x) * (1 - y) * (1 - z);
        a += ao[sx - 1][sy - 1][sz - 0] * (1 - x) * (1 - y) * (0 + z);
        a += ao[sx - 1][sy - 0][sz - 1] * (1 - x) * (0 + y) * (1 - z);
        a += ao[sx - 1][sy - 0][sz - 0] * (1 - x) * (0 + y) * (0 + z);
        a += ao[sx - 0][sy - 1][sz - 1] * (0 + x) * (1 - y) * (1 - z);
        a += ao[sx - 0][sy - 1][sz - 0] * (0 + x) * (1 - y) * (0 + z);
        a += ao[sx - 0][sy - 0][sz - 1] * (0 + x) * (0 + y) * (1 - z);
        a += ao[sx - 0][sy - 0][sz - 0] * (0 + x) * (0 + y) * (0 + z);

        a = MathHelper.clamp(a, 0, 1);
        return a;
    }

    @Override
    public void updateBlockInfo() {
        if (Shaders.isOptiFineShaderPackLoaded()) {
            super.updateBlockInfo();
            return;
        }

        blockInfo.updateShift();
        blockInfo.updateLightMatrix();
    }
}
