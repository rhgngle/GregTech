package gregtech.loaders.recipe.chemistry;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

public class LCRCombined {

    static void init() {

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .circuitMeta(24)
                .fluidInputs(Hydrogen.getFluid(6000))
                .fluidInputs(CarbonMonoxide.getFluid(1000))
                .fluidOutputs(Methane.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .EUt(VA[LV])
                .duration(160)
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .circuitMeta(24)
                .fluidInputs(Propene.getFluid(1000))
                .fluidInputs(Benzene.getFluid(1000))
                .fluidInputs(Oxygen.getFluid(1000))
                .notConsumable(PhosphoricAcid.getFluid(10))
                .output(dust, Phenol, 8)
                .fluidOutputs(Acetone.getFluid(1000))
                .duration(480).EUt(VA[LV]).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .circuitMeta(24)
                .fluidInputs(Benzene.getFluid(2000))
                .fluidInputs(Chlorine.getFluid(4000))
                .input(dust, SodiumHydroxide, 6)
                .output(dust, Phenol, 8)
                .output(dust, Salt, 4)
                .fluidOutputs(HydrochloricAcid.getFluid(2000))
                .duration(1120).EUt(VA[LV]).buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(AceticAcid.getFluid(3000))
                .notConsumable(dust, Quicklime)
                .circuitMeta(24)
                .fluidOutputs(Acetone.getFluid(2000))
                .fluidOutputs(Oxygen.getFluid(1000))
                .duration(400).EUt(VA[HV]).buildAndRegister();
    }
}
