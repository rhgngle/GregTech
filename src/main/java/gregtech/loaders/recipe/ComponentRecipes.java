package gregtech.loaders.recipe;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials.Tier;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.stack.UnificationEntry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.init.Items;

import java.util.Map;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLER_RECIPES;
import static gregtech.api.recipes.RecipeMaps.ASSEMBLY_LINE_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;
import static gregtech.common.items.MetaItems.*;

public class ComponentRecipes {

    public static void register() {

        //Motors Start--------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "electric_motor_steam", ELECTRIC_MOTOR_STEAM.getStackForm(4), " WR", "WMW", "RW ", 'W', new UnificationEntry(pipeTinyFluid, Bronze), 'R', new UnificationEntry(stick, Brass), 'M', new UnificationEntry(plate, Brass));
        ModHandler.addShapedRecipe(true, "electric_motor_lv", ELECTRIC_MOTOR_LV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtSingle, Tin), 'W', new UnificationEntry(wireGtSingle, Copper), 'R', new UnificationEntry(stick, Steel), 'M', new UnificationEntry(stick, IronMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor_mv", ELECTRIC_MOTOR_MV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtSingle, Copper), 'W', new UnificationEntry(wireGtDouble, Cupronickel), 'R', new UnificationEntry(stick, birmabright), 'M', new UnificationEntry(stick, SteelMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor_hv", ELECTRIC_MOTOR_HV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Silver), 'W', new UnificationEntry(wireGtDouble, Electrum), 'R', new UnificationEntry(stick, udimet69420), 'M', new UnificationEntry(stick, SteelMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor_ev", ELECTRIC_MOTOR_EV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Aluminium), 'W', new UnificationEntry(wireGtDouble, Kanthal), 'R', new UnificationEntry(stick, scandalloy), 'M', new UnificationEntry(stick, NeodymiumMagnetic));
        ModHandler.addShapedRecipe(true, "electric_motor_iv", ELECTRIC_MOTOR_IV.getStackForm(), "CWR", "WMW", "RWC", 'C', new UnificationEntry(cableGtDouble, Tungsten), 'W', new UnificationEntry(wireGtDouble, Graphene), 'R', new UnificationEntry(stick, IncoloyMA956), 'M', new UnificationEntry(stick, NeodymiumMagnetic));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass, 2)
                .input(plate, Brass)
                .input(pipeTinyFluid, Bronze, 4)
                .outputs(ELECTRIC_MOTOR_LV.getStackForm(4))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tin, 2)
                .input(stick, Iron, 2)
                .input(stick, IronMagnetic)
                .input(wireGtSingle, Copper, 4)
                .outputs(ELECTRIC_MOTOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Copper, 2)
                .input(stick, birmabright, 2)
                .input(stick, SteelMagnetic)
                .input(wireGtDouble, Cupronickel, 4)
                .outputs(ELECTRIC_MOTOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Silver, 2)
                .input(stick, udimet69420, 2)
                .input(stick, SteelMagnetic)
                .input(wireGtDouble, Electrum, 4)
                .outputs(ELECTRIC_MOTOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Aluminium, 2)
                .input(stick, scandalloy, 2)
                .input(stick, NeodymiumMagnetic)
                .input(wireGtDouble, Kanthal, 4)
                .outputs(ELECTRIC_MOTOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtDouble, Tungsten, 2)
                .input(stick, IncoloyMA956, 2)
                .input(stick, NeodymiumMagnetic)
                .input(wireGtDouble, Graphene, 4)
                .outputs(ELECTRIC_MOTOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, sicSicMatrixComposite, 2)
                .input(ring, HSSS, 2)
                .input(round, HSSS, 4)
                .input(wireFine, Ruridit, 64)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_MOTOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, sicSicMatrixComposite, 2)
                .input(ring, HSSS, 2)
                .input(round, HSSS, 4)
                .input(wireFine, Ruridit, 64)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L / 2))
                .fluidInputs(advancedLubricant.getFluid(125))
                .output(ELECTRIC_MOTOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, tungstenTechnetium, 4)
                .input(ring, Osmiridium, 4)
                .input(round, Osmiridium, 8)
                .input(wireFine, Europium, 64)
                .input(wireFine, Europium, 32)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .fluidInputs(advancedLubricant.getFluid(500))
                .output(ELECTRIC_MOTOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, SamariumMagnetic)
                .input(stickLong, rheniumDiborideCoatedDuralloy, 4)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 8)
                .input(wireFine, Americium, 64)
                .input(wireFine, Americium, 64)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .fluidInputs(advancedLubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_MOTOR_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //ULV Conveyor, Pump-----------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "conveyor_module_steam", CONVEYOR_MODULE_STEAM.getStackForm(4), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, kelpDried), 'C', new UnificationEntry(pipeTinyFluid, Bronze), 'M', ELECTRIC_MOTOR_STEAM.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_pump_steam", ELECTRIC_PUMP_STEAM.getStackForm(4), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, Brass), 'X', new UnificationEntry(rotor, Brass), 'P', new UnificationEntry(pipeNormalFluid, Bronze), 'R', new UnificationEntry(ring, Brass), 'C', new UnificationEntry(pipeTinyFluid, Bronze), 'M', ELECTRIC_MOTOR_STEAM.getStackForm());

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_MOTOR_STEAM.getStackForm(2))
                .input(plate, kelpDried, 6)
                .outputs(CONVEYOR_MODULE_STEAM.getStackForm(4))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(pipeTinyFluid, Bronze)
                .input(pipeNormalFluid, Bronze)
                .input(screw, Brass)
                .input(rotor, Brass)
                .input(ring, Brass, 2)
                .inputs(ELECTRIC_MOTOR_STEAM.getStackForm())
                .outputs(ELECTRIC_PUMP_STEAM.getStackForm(4))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        //Conveyors Start-----------------------------------------------------------------------------------------------
        final Map<String, Material> rubberMaterials = new Object2ObjectOpenHashMap<>();
        rubberMaterials.put("rubber", Rubber);
        rubberMaterials.put("silicone_rubber", SiliconeRubber);
        rubberMaterials.put("styrene_butadiene_rubber", StyreneButadieneRubber);

        for (Map.Entry<String, Material> materialEntry : rubberMaterials.entrySet()) {
            Material material = materialEntry.getValue();
            String name = materialEntry.getKey();

            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("conveyor_module_lv_%s", name), CONVEYOR_MODULE_LV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, material), 'C', new UnificationEntry(cableGtSingle, Tin), 'M', ELECTRIC_MOTOR_LV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("conveyor_module_mv_%s", name), CONVEYOR_MODULE_MV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, material), 'C', new UnificationEntry(cableGtSingle, Copper), 'M', ELECTRIC_MOTOR_MV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("conveyor_module_hv_%s", name), CONVEYOR_MODULE_HV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, material), 'C', new UnificationEntry(cableGtSingle, Gold), 'M', ELECTRIC_MOTOR_HV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("conveyor_module_ev_%s", name), CONVEYOR_MODULE_EV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, material), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'M', ELECTRIC_MOTOR_EV.getStackForm());
            if (!materialEntry.getValue().equals(Rubber))
                ModHandler.addShapedRecipe(material.equals(SiliconeRubber), String.format("conveyor_module_iv_%s", materialEntry.getKey()), CONVEYOR_MODULE_IV.getStackForm(), "RRR", "MCM", "RRR", 'R', new UnificationEntry(plate, material), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'M', ELECTRIC_MOTOR_IV.getStackForm());

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Tin)
                    .inputs(ELECTRIC_MOTOR_LV.getStackForm(2))
                    .fluidInputs(materialEntry.getValue().getFluid(L * 6))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_LV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Copper)
                    .inputs(ELECTRIC_MOTOR_MV.getStackForm(2))
                    .fluidInputs(materialEntry.getValue().getFluid(L * 6))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_MV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Gold)
                    .inputs(ELECTRIC_MOTOR_HV.getStackForm(2))
                    .fluidInputs(materialEntry.getValue().getFluid(L * 6))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_HV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Aluminium)
                    .inputs(ELECTRIC_MOTOR_EV.getStackForm(2))
                    .fluidInputs(materialEntry.getValue().getFluid(L * 6))
                    .circuitMeta(1)
                    .outputs(CONVEYOR_MODULE_EV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            if (!materialEntry.getValue().equals(Rubber))
                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(cableGtSingle, Tungsten)
                        .inputs(ELECTRIC_MOTOR_IV.getStackForm(2))
                        .fluidInputs(materialEntry.getValue().getFluid(L * 6))
                        .circuitMeta(1)
                        .outputs(CONVEYOR_MODULE_IV.getStackForm())
                        .duration(100).EUt(VA[LV]).buildAndRegister();


            //Pumps Start---------------------------------------------------------------------------------------------------
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("electric_pump_lv_%s", name), ELECTRIC_PUMP_LV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, Steel), 'X', new UnificationEntry(rotor, Steel), 'P', new UnificationEntry(pipeNormalFluid, Steel), 'R', new UnificationEntry(ring, material), 'C', new UnificationEntry(cableGtSingle, Tin), 'M', ELECTRIC_MOTOR_LV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("electric_pump_mv_%s", name), ELECTRIC_PUMP_MV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, birmabright), 'X', new UnificationEntry(rotor, birmabright), 'P', new UnificationEntry(pipeNormalFluid, Aluminium), 'R', new UnificationEntry(ring, material), 'C', new UnificationEntry(cableGtSingle, Copper), 'M', ELECTRIC_MOTOR_MV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("electric_pump_hv_%s", name), ELECTRIC_PUMP_HV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, udimet69420), 'X', new UnificationEntry(rotor, udimet69420), 'P', new UnificationEntry(pipeNormalFluid, StainlessSteel), 'R', new UnificationEntry(ring, material), 'C', new UnificationEntry(cableGtSingle, Gold), 'M', ELECTRIC_MOTOR_HV.getStackForm());
            ModHandler.addShapedRecipe(material.equals(Rubber), String.format("electric_pump_ev_%s", name), ELECTRIC_PUMP_EV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, scandalloy), 'X', new UnificationEntry(rotor, scandalloy), 'P', new UnificationEntry(pipeNormalFluid, Titanium), 'R', new UnificationEntry(ring, material), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'M', ELECTRIC_MOTOR_EV.getStackForm());
            if (!material.equals(Rubber))
                ModHandler.addShapedRecipe(material.equals(SiliconeRubber), String.format("electric_pump_iv_%s", name), ELECTRIC_PUMP_IV.getStackForm(), "SXR", "dPw", "RMC", 'S', new UnificationEntry(screw, IncoloyMA956), 'X', new UnificationEntry(rotor, IncoloyMA956), 'P', new UnificationEntry(pipeNormalFluid, TungstenSteel), 'R', new UnificationEntry(ring, material), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'M', ELECTRIC_MOTOR_IV.getStackForm());

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Tin)
                    .input(pipeNormalFluid, Steel)
                    .input(screw, Steel)
                    .input(rotor, Steel)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_LV.getStackForm())
                    .outputs(ELECTRIC_PUMP_LV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Copper)
                    .input(pipeNormalFluid, Aluminium)
                    .input(screw, birmabright)
                    .input(rotor, birmabright)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_MV.getStackForm())
                    .outputs(ELECTRIC_PUMP_MV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Gold)
                    .input(pipeNormalFluid, StainlessSteel)
                    .input(screw, udimet69420)
                    .input(rotor, udimet69420)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_HV.getStackForm())
                    .outputs(ELECTRIC_PUMP_HV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            ASSEMBLER_RECIPES.recipeBuilder()
                    .input(cableGtSingle, Aluminium)
                    .input(pipeNormalFluid, Titanium)
                    .input(screw, scandalloy)
                    .input(rotor, scandalloy)
                    .input(ring, materialEntry.getValue(), 2)
                    .inputs(ELECTRIC_MOTOR_EV.getStackForm())
                    .outputs(ELECTRIC_PUMP_EV.getStackForm())
                    .duration(100).EUt(VA[LV]).buildAndRegister();

            if (!materialEntry.getValue().equals(Rubber))
                ASSEMBLER_RECIPES.recipeBuilder()
                        .input(cableGtSingle, Tungsten)
                        .input(pipeNormalFluid, TungstenSteel)
                        .input(screw, IncoloyMA956)
                        .input(rotor, IncoloyMA956)
                        .input(ring, materialEntry.getValue(), 2)
                        .inputs(ELECTRIC_MOTOR_IV.getStackForm())
                        .outputs(ELECTRIC_PUMP_IV.getStackForm())
                        .duration(100).EUt(VA[LV]).buildAndRegister();
        }

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV, 2)
                .input(plate, sicSicMatrixComposite, 2)
                .input(ring, HSSS, 4)
                .input(round, HSSS, 16)
                .input(screw, HSSS, 4)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 8))
                .output(CONVEYOR_MODULE_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV, 2)
                .input(plate, sicSicMatrixComposite, 2)
                .input(ring, HSSS, 4)
                .input(round, HSSS, 16)
                .input(screw, HSSS, 4)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L / 2))
                .fluidInputs(advancedLubricant.getFluid(125))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 8))
                .output(CONVEYOR_MODULE_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM, 2)
                .input(plate, tungstenTechnetium, 2)
                .input(ring, Osmiridium, 4)
                .input(round, Osmiridium, 16)
                .input(screw, Osmiridium, 4)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .fluidInputs(advancedLubricant.getFluid(500))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 16))
                .output(CONVEYOR_MODULE_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV, 2)
                .input(plate, rheniumDiborideCoatedDuralloy, 2)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 16)
                .input(screw, Tritanium, 4)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .fluidInputs(advancedLubricant.getFluid(1000))
                .fluidInputs(StyreneButadieneRubber.getFluid(L * 24))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(CONVEYOR_MODULE_UV)
                .duration(600).EUt(100000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV)
                .input(pipeSmallFluid, NiobiumTitanium)
                .input(plate, HSSS, 2)
                .input(screw, sicSicMatrixComposite, 8)
                .input(ring, SiliconeRubber, 4)
                .input(rotor, sicSicMatrixComposite)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_PUMP_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV)
                .input(pipeSmallFluid, NiobiumTitanium)
                .input(plate, HSSS, 2)
                .input(screw, sicSicMatrixComposite, 8)
                .input(ring, SiliconeRubber, 4)
                .input(rotor, sicSicMatrixComposite)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L / 2))
                .fluidInputs(advancedLubricant.getFluid(125))
                .output(ELECTRIC_PUMP_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM)
                .input(pipeNormalFluid, Polybenzimidazole)
                .input(plate, Osmiridium, 2)
                .input(screw, tungstenTechnetium, 8)
                .input(ring, SiliconeRubber, 8)
                .input(rotor, tungstenTechnetium)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .fluidInputs(advancedLubricant.getFluid(500))
                .output(ELECTRIC_PUMP_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(pipeLargeFluid, Naquadah)
                .input(plate, Tritanium, 2)
                .input(screw, rheniumDiborideCoatedDuralloy, 8)
                .input(ring, SiliconeRubber, 16)
                .input(rotor, rheniumDiborideCoatedDuralloy)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .fluidInputs(advancedLubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_PUMP_UV)
                .duration(600).EUt(100000).buildAndRegister();

        //Fluid Regulators----------------------------------------------------------------------------------------------

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_STEAM.getStackForm())
                .input(ring, Rubber, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_STEAM.getStackForm())
                .EUt(VA[ULV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_LV.getStackForm())
                .input(circuit, Tier.LV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_LV.getStackForm())
                .EUt(VA[LV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_MV.getStackForm())
                .input(circuit, Tier.MV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_MV.getStackForm())
                .EUt(VA[MV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_HV.getStackForm())
                .input(circuit, Tier.HV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_HV.getStackForm())
                .EUt(VA[HV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_EV.getStackForm())
                .input(circuit, Tier.EV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_EV.getStackForm())
                .EUt(VA[EV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_IV.getStackForm())
                .input(circuit, Tier.IV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_IV.getStackForm())
                .EUt(VA[IV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_LuV.getStackForm())
                .input(circuit, Tier.LuV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_LUV.getStackForm())
                .EUt(VA[LuV])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_ZPM.getStackForm())
                .input(circuit, Tier.ZPM, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_ZPM.getStackForm())
                .EUt(VA[ZPM])
                .duration(200)
                .buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .inputs(ELECTRIC_PUMP_UV.getStackForm())
                .input(circuit, Tier.UV, 2)
                .circuitMeta(1)
                .outputs(FLUID_REGULATOR_UV.getStackForm())
                .EUt(VA[UV])
                .duration(200)
                .buildAndRegister();

        //Voiding Covers Start-----------------------------------------------------------------------------------------

        ModHandler.addShapedRecipe(true, "cover_item_voiding", COVER_ITEM_VOIDING.getStackForm(), "SDS", "dPw", " E ", 'S', new UnificationEntry(screw, Steel), 'D', COVER_ITEM_DETECTOR.getStackForm(), 'P', new UnificationEntry(pipeNormalItem, Brass), 'E', Items.ENDER_PEARL);

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(screw, Steel, 2)
                .inputs(COVER_ITEM_DETECTOR.getStackForm())
                .input(pipeNormalItem, Brass)
                .input(Items.ENDER_PEARL)
                .outputs(COVER_ITEM_VOIDING.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(COVER_ITEM_VOIDING)
                .input(circuit, Tier.MV, 1)
                .outputs(COVER_ITEM_VOIDING_ADVANCED.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ModHandler.addShapedRecipe(true, "cover_fluid_voiding", COVER_FLUID_VOIDING.getStackForm(), "SDS", "dPw", " E ", 'S', new UnificationEntry(screw, Steel), 'D', COVER_FLUID_DETECTOR.getStackForm(), 'P', new UnificationEntry(pipeNormalFluid, Bronze), 'E', Items.ENDER_PEARL);

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(screw, Steel, 2)
                .inputs(COVER_FLUID_DETECTOR.getStackForm())
                .input(pipeNormalFluid, Bronze)
                .input(Items.ENDER_PEARL)
                .outputs(COVER_FLUID_VOIDING.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(COVER_FLUID_VOIDING)
                .input(circuit, Tier.MV, 1)
                .outputs(COVER_FLUID_VOIDING_ADVANCED.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        //Pistons Start-------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "electric_piston_steam", ELECTRIC_PISTON_STEAM.getStackForm(4), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Bronze), 'C', new UnificationEntry(pipeTinyFluid, Bronze), 'R', new UnificationEntry(stick, Brass), 'G', new UnificationEntry(gearSmall, Brass), 'M', ELECTRIC_MOTOR_STEAM.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston_lv", ELECTRIC_PISTON_LV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Steel), 'C', new UnificationEntry(cableGtSingle, Tin), 'R', new UnificationEntry(stick, Steel), 'G', new UnificationEntry(gearSmall, Steel), 'M', ELECTRIC_MOTOR_LV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston_mv", ELECTRIC_PISTON_MV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Aluminium), 'C', new UnificationEntry(cableGtSingle, Copper), 'R', new UnificationEntry(stick, birmabright), 'G', new UnificationEntry(gearSmall, birmabright), 'M', ELECTRIC_MOTOR_MV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston_hv", ELECTRIC_PISTON_HV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, StainlessSteel), 'C', new UnificationEntry(cableGtSingle, Gold), 'R', new UnificationEntry(stick, udimet69420), 'G', new UnificationEntry(gearSmall, udimet69420), 'M', ELECTRIC_MOTOR_HV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston_ev", ELECTRIC_PISTON_EV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Titanium), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'R', new UnificationEntry(stick, scandalloy), 'G', new UnificationEntry(gearSmall, scandalloy), 'M', ELECTRIC_MOTOR_EV.getStackForm());
        ModHandler.addShapedRecipe(true, "electric_piston_iv", ELECTRIC_PISTON_IV.getStackForm(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, TungstenSteel), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'R', new UnificationEntry(stick, IncoloyMA956), 'G', new UnificationEntry(gearSmall, IncoloyMA956), 'M', ELECTRIC_MOTOR_IV.getStackForm());

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass, 2)
                .input(pipeTinyFluid, Bronze, 2)
                .input(plate, Bronze, 3)
                .input(gearSmall, Brass)
                .inputs(ELECTRIC_MOTOR_STEAM.getStackForm())
                .outputs(ELECTRIC_PISTON_STEAM.getStackForm(4))
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Steel, 2)
                .input(cableGtSingle, Tin, 2)
                .input(plate, Steel, 3)
                .input(gearSmall, Steel)
                .inputs(ELECTRIC_MOTOR_LV.getStackForm())
                .outputs(ELECTRIC_PISTON_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, birmabright, 2)
                .input(cableGtSingle, Copper, 2)
                .input(plate, Aluminium, 3)
                .input(gearSmall, birmabright)
                .inputs(ELECTRIC_MOTOR_MV.getStackForm())
                .outputs(ELECTRIC_PISTON_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, udimet69420, 2)
                .input(cableGtSingle, Gold, 2)
                .input(plate, StainlessSteel, 3)
                .input(gearSmall, udimet69420)
                .inputs(ELECTRIC_MOTOR_HV.getStackForm())
                .outputs(ELECTRIC_PISTON_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, scandalloy, 2)
                .input(cableGtSingle, Aluminium, 2)
                .input(plate, Titanium, 3)
                .input(gearSmall, scandalloy)
                .inputs(ELECTRIC_MOTOR_EV.getStackForm())
                .outputs(ELECTRIC_PISTON_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, IncoloyMA956, 2)
                .input(cableGtSingle, Tungsten, 2)
                .input(plate, TungstenSteel, 3)
                .input(gearSmall, IncoloyMA956)
                .inputs(ELECTRIC_MOTOR_IV.getStackForm())
                .outputs(ELECTRIC_PISTON_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();


        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV)
                .input(plate, RhodiumPlatedPalladium, 4)
                .input(ring, HSSS, 4)
                .input(round, HSSS, 16)
                .input(stick, HSSS, 4)
                .input(gear, sicSicMatrixComposite)
                .input(gearSmall, sicSicMatrixComposite, 2)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(SolderingAlloy.getFluid(L))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ELECTRIC_PISTON_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_LuV)
                .input(plate, RhodiumPlatedPalladium, 4)
                .input(ring, HSSS, 4)
                .input(round, HSSS, 16)
                .input(stick, HSSS, 4)
                .input(gear, sicSicMatrixComposite)
                .input(gearSmall, sicSicMatrixComposite, 2)
                .input(cableGtSingle, NiobiumTitanium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L / 2))
                .fluidInputs(advancedLubricant.getFluid(125))
                .output(ELECTRIC_PISTON_LUV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_ZPM)
                .input(plate, NaquadahAlloy, 4)
                .input(ring, Osmiridium, 4)
                .input(round, Osmiridium, 16)
                .input(stick, Osmiridium, 4)
                .input(gear, tungstenTechnetium)
                .input(gearSmall, tungstenTechnetium, 2)
                .input(cableGtSingle, VanadiumGallium, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .fluidInputs(advancedLubricant.getFluid(500))
                .output(ELECTRIC_PISTON_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(ELECTRIC_MOTOR_UV)
                .input(plate, Darmstadtium, 4)
                .input(ring, Tritanium, 4)
                .input(round, Tritanium, 16)
                .input(stick, Tritanium, 4)
                .input(gear, rheniumDiborideCoatedDuralloy)
                .input(gearSmall, rheniumDiborideCoatedDuralloy, 2)
                .input(cableGtSingle, YttriumBariumCuprate, 2)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .fluidInputs(advancedLubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ELECTRIC_PISTON_UV)
                .duration(600).EUt(100000).buildAndRegister();



        //Robot Arms Start ---------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "robot_arm_steam", ROBOT_ARM_STEAM.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(pipeTinyFluid, Bronze), 'R', new UnificationEntry(stick, Brass), 'M', ELECTRIC_MOTOR_STEAM.getStackForm(), 'P', ELECTRIC_PISTON_STEAM.getStackForm(), 'X', new UnificationEntry(plate, Rubber));
        ModHandler.addShapedRecipe(true, "robot_arm_lv", ROBOT_ARM_LV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Tin), 'R', new UnificationEntry(stick, Steel), 'M', ELECTRIC_MOTOR_LV.getStackForm(), 'P', ELECTRIC_PISTON_LV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.LV));
        ModHandler.addShapedRecipe(true, "robot_arm_mv", ROBOT_ARM_MV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Copper), 'R', new UnificationEntry(stick, birmabright), 'M', ELECTRIC_MOTOR_MV.getStackForm(), 'P', ELECTRIC_PISTON_MV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.MV));
        ModHandler.addShapedRecipe(true, "robot_arm_hv", ROBOT_ARM_HV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Gold), 'R', new UnificationEntry(stick, udimet69420), 'M', ELECTRIC_MOTOR_HV.getStackForm(), 'P', ELECTRIC_PISTON_HV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.HV));
        ModHandler.addShapedRecipe(true, "robot_arm_ev", ROBOT_ARM_EV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Aluminium), 'R', new UnificationEntry(stick, scandalloy), 'M', ELECTRIC_MOTOR_EV.getStackForm(), 'P', ELECTRIC_PISTON_EV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.EV));
        ModHandler.addShapedRecipe(true, "robot_arm_iv", ROBOT_ARM_IV.getStackForm(), "CCC", "MRM", "PXR", 'C', new UnificationEntry(cableGtSingle, Tungsten), 'R', new UnificationEntry(stick, IncoloyMA956), 'M', ELECTRIC_MOTOR_IV.getStackForm(), 'P', ELECTRIC_PISTON_IV.getStackForm(), 'X', new UnificationEntry(circuit, Tier.IV));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(pipeTinyFluid, Bronze, 3)
                .input(stick, Brass, 2)
                .inputs(ELECTRIC_MOTOR_STEAM.getStackForm(2))
                .inputs(ELECTRIC_PISTON_STEAM.getStackForm())
                .fluidInputs(Rubber.getFluid(144))
                .outputs(ROBOT_ARM_STEAM.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tin, 3)
                .input(stick, Steel, 2)
                .inputs(ELECTRIC_MOTOR_LV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_LV.getStackForm())
                .input(circuit, Tier.LV)
                .outputs(ROBOT_ARM_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Copper, 3)
                .input(stick, birmabright, 2)
                .inputs(ELECTRIC_MOTOR_MV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_MV.getStackForm())
                .input(circuit, Tier.MV)
                .outputs(ROBOT_ARM_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Gold, 3)
                .input(stick, udimet69420, 2)
                .inputs(ELECTRIC_MOTOR_HV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_HV.getStackForm())
                .input(circuit, Tier.HV)
                .outputs(ROBOT_ARM_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Aluminium, 3)
                .input(stick, scandalloy, 2)
                .inputs(ELECTRIC_MOTOR_EV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_EV.getStackForm())
                .input(circuit, Tier.EV)
                .outputs(ROBOT_ARM_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(cableGtSingle, Tungsten, 3)
                .input(stick, IncoloyMA956, 2)
                .inputs(ELECTRIC_MOTOR_IV.getStackForm(2))
                .inputs(ELECTRIC_PISTON_IV.getStackForm())
                .input(circuit, Tier.IV)
                .outputs(ROBOT_ARM_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, HSSS, 4)
                .input(gear, sicSicMatrixComposite)
                .input(gearSmall, sicSicMatrixComposite, 3)
                .input(ELECTRIC_MOTOR_LuV, 2)
                .input(ELECTRIC_PISTON_LUV)
                .input(circuit, Tier.LuV)
                .input(circuit, Tier.IV, 2)
                .input(circuit, Tier.EV, 4)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .fluidInputs(Lubricant.getFluid(250))
                .output(ROBOT_ARM_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, HSSS, 4)
                .input(gear, sicSicMatrixComposite)
                .input(gearSmall, sicSicMatrixComposite, 3)
                .input(ELECTRIC_MOTOR_LuV, 2)
                .input(ELECTRIC_PISTON_LUV)
                .input(circuit, Tier.LuV)
                .input(circuit, Tier.IV, 2)
                .input(circuit, Tier.EV, 4)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .fluidInputs(advancedLubricant.getFluid(125))
                .output(ROBOT_ARM_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Osmiridium, 4)
                .input(gear, tungstenTechnetium)
                .input(gearSmall, tungstenTechnetium, 3)
                .input(ELECTRIC_MOTOR_ZPM, 2)
                .input(ELECTRIC_PISTON_ZPM)
                .input(circuit, Tier.ZPM)
                .input(circuit, Tier.LuV, 2)
                .input(circuit, Tier.IV, 4)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 8))
                .fluidInputs(advancedLubricant.getFluid(500))
                .output(ROBOT_ARM_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(stickLong, Tritanium, 4)
                .input(gear, rheniumDiborideCoatedDuralloy)
                .input(gearSmall, rheniumDiborideCoatedDuralloy, 3)
                .input(ELECTRIC_MOTOR_UV, 2)
                .input(ELECTRIC_PISTON_UV)
                .input(circuit, Tier.UV)
                .input(circuit, Tier.ZPM, 2)
                .input(circuit, Tier.LuV, 4)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 12))
                .fluidInputs(advancedLubricant.getFluid(1000))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(ROBOT_ARM_UV)
                .duration(600).EUt(100000).buildAndRegister();



        //Field Generators Start ---------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "field_generator_lv", FIELD_GENERATOR_LV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, ManganesePhosphide), 'P', new UnificationEntry(plate, Steel), 'G', new UnificationEntry(gem, EnderPearl), 'X', new UnificationEntry(circuit, Tier.LV));
        ModHandler.addShapedRecipe(true, "field_generator_mv", FIELD_GENERATOR_MV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, MagnesiumDiboride), 'P', new UnificationEntry(plate, Aluminium), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.MV));
        ModHandler.addShapedRecipe(true, "field_generator_hv", FIELD_GENERATOR_HV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, MercuryBariumCalciumCuprate), 'P', new UnificationEntry(plate, StainlessSteel), 'G', QUANTUM_EYE.getStackForm(), 'X', new UnificationEntry(circuit, Tier.HV));
        ModHandler.addShapedRecipe(true, "field_generator_ev", FIELD_GENERATOR_EV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, UraniumTriplatinum), 'P', new UnificationEntry(plateDouble, Titanium), 'G', new UnificationEntry(gem, NetherStar), 'X', new UnificationEntry(circuit, Tier.EV));
        ModHandler.addShapedRecipe(true, "field_generator_iv", FIELD_GENERATOR_IV.getStackForm(), "WPW", "XGX", "WPW", 'W', new UnificationEntry(wireGtQuadruple, SamariumIronArsenicOxide), 'P', new UnificationEntry(plateDouble, TungstenSteel), 'G', QUANTUM_STAR.getStackForm(), 'X', new UnificationEntry(circuit, Tier.IV));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gem, EnderPearl)
                .input(plate, Steel, 2)
                .input(circuit, Tier.LV, 2)
                .input(wireGtQuadruple, ManganesePhosphide, 4)
                .outputs(FIELD_GENERATOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gem, EnderEye)
                .input(plate, Aluminium, 2)
                .input(circuit, Tier.MV, 2)
                .input(wireGtQuadruple, MagnesiumDiboride, 4)
                .outputs(FIELD_GENERATOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(QUANTUM_EYE)
                .input(plate, StainlessSteel, 2)
                .input(circuit, Tier.HV, 2)
                .input(wireGtQuadruple, MercuryBariumCalciumCuprate, 4)
                .outputs(FIELD_GENERATOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(gem, NetherStar)
                .input(plateDouble, Titanium, 2)
                .input(circuit, Tier.EV, 2)
                .input(wireGtQuadruple, UraniumTriplatinum, 4)
                .outputs(FIELD_GENERATOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(QUANTUM_STAR)
                .input(plateDouble, TungstenSteel, 2)
                .input(circuit, Tier.IV, 2)
                .input(wireGtQuadruple, SamariumIronArsenicOxide, 4)
                .outputs(FIELD_GENERATOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(plate, RhodiumPlatedPalladium, 6)
                .input(QUANTUM_STAR)
                .input(EMITTER_LuV, 2)
                .input(circuit, Tier.LuV, 2)
                .input(wireFine, IndiumTinBariumTitaniumCuprate, 64)
                .input(wireFine, IndiumTinBariumTitaniumCuprate, 64)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 4))
                .output(FIELD_GENERATOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(plate, RhodiumPlatedPalladium, 6)
                .input(QUANTUM_STAR)
                .input(EMITTER_LuV, 2)
                .input(circuit, Tier.LuV, 2)
                .input(wireFine, IndiumTinBariumTitaniumCuprate, 64)
                .input(wireFine, IndiumTinBariumTitaniumCuprate, 64)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 2))
                .output(FIELD_GENERATOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Osmiridium)
                .input(plate, NaquadahAlloy, 6)
                .input(QUANTUM_STAR)
                .input(EMITTER_ZPM, 2)
                .input(circuit, Tier.ZPM, 2)
                .input(wireFine, UraniumRhodiumDinaquadide, 64)
                .input(wireFine, UraniumRhodiumDinaquadide, 64)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 8))
                .output(FIELD_GENERATOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(plate, Darmstadtium, 6)
                .input(GRAVI_STAR)
                .input(EMITTER_UV, 2)
                .input(circuit, Tier.UV, 2)
                .input(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 12))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(FIELD_GENERATOR_UV)
                .duration(600).EUt(100000).buildAndRegister();



        //Sensors Start-------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "sensor_lv", SENSOR_LV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Steel), 'R', new UnificationEntry(stick, Brass), 'G', new UnificationEntry(gem, Quartzite), 'X', new UnificationEntry(circuit, Tier.LV));
        ModHandler.addShapedRecipe(true, "sensor_mv", SENSOR_MV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Aluminium), 'R', new UnificationEntry(stick, Electrum), 'G', new UnificationEntry(gemFlawless, Emerald), 'X', new UnificationEntry(circuit, Tier.MV));
        ModHandler.addShapedRecipe(true, "sensor_hv", SENSOR_HV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, StainlessSteel), 'R', new UnificationEntry(stick, Chrome), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.HV));
        ModHandler.addShapedRecipe(true, "sensor_ev", SENSOR_EV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, Titanium), 'R', new UnificationEntry(stick, Platinum), 'G', QUANTUM_EYE.getStackForm(), 'X', new UnificationEntry(circuit, Tier.EV));
        ModHandler.addShapedRecipe(true, "sensor_iv", SENSOR_IV.getStackForm(), "P G", "PR ", "XPP", 'P', new UnificationEntry(plate, TungstenSteel), 'R', new UnificationEntry(stick, Iridium), 'G', QUANTUM_STAR.getStackForm(), 'X', new UnificationEntry(circuit, Tier.IV));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass)
                .input(plate, Steel, 4)
                .input(circuit, Tier.LV)
                .input(gem, Quartzite)
                .outputs(SENSOR_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Electrum)
                .input(plate, Aluminium, 4)
                .input(circuit, Tier.MV)
                .input(gemFlawless, Emerald)
                .outputs(SENSOR_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Chrome)
                .input(plate, StainlessSteel, 4)
                .input(circuit, Tier.HV)
                .input(gem, EnderEye)
                .outputs(SENSOR_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Platinum)
                .input(plate, Titanium, 4)
                .input(circuit, Tier.EV)
                .input(QUANTUM_EYE)
                .outputs(SENSOR_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Iridium)
                .input(plate, TungstenSteel, 4)
                .input(circuit, Tier.IV)
                .input(QUANTUM_STAR)
                .outputs(SENSOR_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LuV)
                .input(plate, Europium, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.LuV, 2)
                .input(foil, Rhodium, 64)
                .input(foil, Rhodium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .output(SENSOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LuV)
                .input(plate, Europium, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.LuV, 2)
                .input(foil, Rhodium, 64)
                .input(foil, Rhodium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L))
                .output(SENSOR_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Osmiridium)
                .input(ELECTRIC_MOTOR_ZPM)
                .input(plate, Rhenium, 4)
                .input(QUANTUM_STAR, 2)
                .input(circuit, Tier.ZPM, 2)
                .input(foil, Trinium, 64)
                .input(foil, Trinium, 32)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .output(SENSOR_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(ELECTRIC_MOTOR_UV)
                .input(plate, duralloy, 4)
                .input(GRAVI_STAR)
                .input(circuit, Tier.UV, 2)
                .input(foil, Naquadria, 64)
                .input(foil, Naquadria, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 8))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(SENSOR_UV)
                .duration(600).EUt(100000).buildAndRegister();


        //Emitters Start------------------------------------------------------------------------------------------------
        ModHandler.addShapedRecipe(true, "emitter_lv", EMITTER_LV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Brass), 'C', new UnificationEntry(cableGtSingle, Tin), 'G', new UnificationEntry(gem, Quartzite), 'X', new UnificationEntry(circuit, Tier.LV));
        ModHandler.addShapedRecipe(true, "emitter_mv", EMITTER_MV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Electrum), 'C', new UnificationEntry(cableGtSingle, Copper), 'G', new UnificationEntry(gemFlawless, Emerald), 'X', new UnificationEntry(circuit, Tier.MV));
        ModHandler.addShapedRecipe(true, "emitter_hv", EMITTER_HV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Chrome), 'C', new UnificationEntry(cableGtSingle, Gold), 'G', new UnificationEntry(gem, EnderEye), 'X', new UnificationEntry(circuit, Tier.HV));
        ModHandler.addShapedRecipe(true, "emitter_ev", EMITTER_EV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Platinum), 'C', new UnificationEntry(cableGtSingle, Aluminium), 'G', QUANTUM_EYE.getStackForm(), 'X', new UnificationEntry(circuit, Tier.EV));
        ModHandler.addShapedRecipe(true, "emitter_iv", EMITTER_IV.getStackForm(), "CRX", "RGR", "XRC", 'R', new UnificationEntry(stick, Iridium), 'C', new UnificationEntry(cableGtSingle, Tungsten), 'G', QUANTUM_STAR.getStackForm(), 'X', new UnificationEntry(circuit, Tier.IV));

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Brass, 4)
                .input(cableGtSingle, Tin, 2)
                .input(circuit, Tier.LV, 2)
                .input(gem, Quartzite)
                .circuitMeta(1)
                .outputs(EMITTER_LV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Electrum, 4)
                .input(cableGtSingle, Copper, 2)
                .input(circuit, Tier.MV, 2)
                .input(gemFlawless, Emerald)
                .circuitMeta(1)
                .outputs(EMITTER_MV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Chrome, 4)
                .input(cableGtSingle, Gold, 2)
                .input(circuit, Tier.HV, 2)
                .input(gem, EnderEye)
                .circuitMeta(1)
                .outputs(EMITTER_HV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Platinum, 4)
                .input(cableGtSingle, Aluminium, 2)
                .input(circuit, Tier.EV, 2)
                .input(QUANTUM_EYE)
                .circuitMeta(1)
                .outputs(EMITTER_EV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLER_RECIPES.recipeBuilder()
                .input(stick, Iridium, 4)
                .input(cableGtSingle, Tungsten, 2)
                .input(circuit, Tier.IV, 2)
                .input(QUANTUM_STAR)
                .circuitMeta(1)
                .outputs(EMITTER_IV.getStackForm())
                .duration(100).EUt(VA[LV]).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LuV)
                .input(stickLong, Europium, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.LuV, 2)
                .input(foil, Palladium, 64)
                .input(foil, Palladium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(SolderingAlloy.getFluid(L * 2))
                .output(EMITTER_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, HSSS)
                .input(ELECTRIC_MOTOR_LuV)
                .input(stickLong, Europium, 4)
                .input(QUANTUM_STAR)
                .input(circuit, Tier.LuV, 2)
                .input(foil, Palladium, 64)
                .input(foil, Palladium, 32)
                .input(cableGtSingle, NiobiumTitanium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L))
                .output(EMITTER_LuV)
                .duration(600).EUt(6000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Osmiridium)
                .input(ELECTRIC_MOTOR_ZPM)
                .input(stickLong, Rhenium, 4)
                .input(QUANTUM_STAR, 2)
                .input(circuit, Tier.ZPM, 2)
                .input(foil, Trinium, 64)
                .input(foil, Trinium, 32)
                .input(cableGtSingle, VanadiumGallium, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 4))
                .output(EMITTER_ZPM)
                .duration(600).EUt(24000).buildAndRegister();

        ASSEMBLY_LINE_RECIPES.recipeBuilder()
                .input(frameGt, Tritanium)
                .input(ELECTRIC_MOTOR_UV)
                .input(stickLong, duralloy, 4)
                .input(GRAVI_STAR)
                .input(circuit, Tier.UV, 2)
                .input(foil, Naquadria, 64)
                .input(foil, Naquadria, 32)
                .input(cableGtSingle, YttriumBariumCuprate, 4)
                .fluidInputs(advancedSolderingAlloy.getFluid(L * 8))
                .fluidInputs(Naquadria.getFluid(L * 4))
                .output(EMITTER_UV)
                .duration(600).EUt(100000).buildAndRegister();
    }
}
