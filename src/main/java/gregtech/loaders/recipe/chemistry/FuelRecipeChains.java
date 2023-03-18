package gregtech.loaders.recipe.chemistry;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.CHEMICAL_RECIPES;
import static gregtech.api.recipes.RecipeMaps.LARGE_CHEMICAL_RECIPES;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;

public class FuelRecipeChains {

    public static void init() {

        // Gasoline
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(100)
                .fluidInputs(Naphtha.getFluid(16000))
                .fluidInputs(RefineryGas.getFluid(2000))
                .fluidInputs(Methanol.getFluid(1000))
                .fluidInputs(Acetone.getFluid(1000))
                .circuitMeta(24)
                .fluidOutputs(RawGasoline.getFluid(20000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(10)
                .fluidInputs(RawGasoline.getFluid(10000))
                .fluidInputs(Toluene.getFluid(1000))
                .fluidOutputs(Gasoline.getFluid(11000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(100)
                .fluidInputs(ultraLowSulfurNaphthaReformate.getFluid(10000))
                .fluidInputs(ultraLowSulfurOctaneBoostedNaphtha.getFluid(10000))
                .fluidInputs(RefineryGas.getFluid(2000))
                .fluidInputs(Methanol.getFluid(1000))
                .fluidInputs(Acetone.getFluid(1000))
                .circuitMeta(24)
                .fluidOutputs(ultraLowSulfurGasoline.getFluid(24000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(100)
                .fluidInputs(aromaticsDepletedUltraLowSulfurNaphthaReformate.getFluid(10000))
                .fluidInputs(ultraLowSulfurOctaneBoostedNaphtha.getFluid(10000))
                .fluidInputs(RefineryGas.getFluid(4000))
                .fluidInputs(Methanol.getFluid(2000))
                .fluidInputs(Acetone.getFluid(2000))
                .circuitMeta(24)
                .fluidOutputs(ultraLowSulfurGasoline.getFluid(20000))
                .buildAndRegister();

        // Nitrous Oxide
        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[LV]).duration(100)
                .fluidInputs(Nitrogen.getFluid(2000))
                .fluidInputs(Oxygen.getFluid(1000))
                .circuitMeta(4)
                .fluidOutputs(NitrousOxide.getFluid(1000))
                .buildAndRegister();

        // Ethyl Tert-Butyl Ether
        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(400)
                .fluidInputs(isobutylene.getFluid(1000))
                .fluidInputs(Ethanol.getFluid(1000))
                .notConsumable(dust, polystyreneCationExchangeResin)
                .notConsumable(HydrochloricAcid.getFluid(10))
                .fluidOutputs(EthylTertButylEther.getFluid(1000))
                .buildAndRegister();

        // High Octane Gasoline
        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[EV]).duration(50)
                .fluidInputs(Gasoline.getFluid(20000))
                .fluidInputs(Octane.getFluid(2000))
                .fluidInputs(NitrousOxide.getFluid(2000))
                .fluidInputs(Toluene.getFluid(1000))
                .fluidInputs(EthylTertButylEther.getFluid(1000))
                .circuitMeta(24)
                .fluidOutputs(HighOctaneGasoline.getFluid(32000))
                .buildAndRegister();

        LARGE_CHEMICAL_RECIPES.recipeBuilder().EUt(VA[EV]).duration(50)
                .fluidInputs(ultraLowSulfurGasoline.getFluid(20000))
                .fluidInputs(Octane.getFluid(4000))
                .fluidInputs(NitrousOxide.getFluid(2000))
                .fluidInputs(Toluene.getFluid(2000))
                .fluidInputs(EthylTertButylEther.getFluid(2000))
                .circuitMeta(24)
                .fluidOutputs(ultraLowSulfurHighOctaneGasoline.getFluid(36000))
                .buildAndRegister();

        // Nitrobenzene
        CHEMICAL_RECIPES.recipeBuilder().EUt(VA[HV]).duration(160)
                .fluidInputs(Benzene.getFluid(1000))
                .fluidInputs(NitrationMixture.getFluid(2000))
                .fluidOutputs(Nitrobenzene.getFluid(1000))
                .fluidOutputs(DilutedSulfuricAcid.getFluid(2000))
                .buildAndRegister();
    }
}
