package gregtech.loaders.recipe.chemistry;

import gregtech.api.recipes.ingredients.IntCircuitIngredient;

import static gregtech.api.GTValues.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class PetrochemRecipes {

    public static void init() {

        CRUDE_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Oil.getFluid(50))
                .fluidOutputs(atmosphericResidue.getFluid(50))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(15))
                .fluidOutputs(SulfuricLightFuel.getFluid(50))
                .fluidOutputs(SulfuricNaphtha.getFluid(20))
                .fluidOutputs(SulfuricGas.getFluid(60))
                .duration(20).EUt(96).buildAndRegister();

        CRUDE_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(OilLight.getFluid(150))
                .fluidOutputs(atmosphericResidue.getFluid(25))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(10))
                .fluidOutputs(SulfuricLightFuel.getFluid(20))
                .fluidOutputs(SulfuricNaphtha.getFluid(30))
                .fluidOutputs(SulfuricGas.getFluid(240))
                .duration(20).EUt(96).buildAndRegister();

        CRUDE_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(OilHeavy.getFluid(100))
                .fluidOutputs(atmosphericResidue.getFluid(200))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(250))
                .fluidOutputs(SulfuricLightFuel.getFluid(45))
                .fluidOutputs(SulfuricNaphtha.getFluid(15))
                .fluidOutputs(SulfuricGas.getFluid(60))
                .duration(20).EUt(288).buildAndRegister();

        CRUDE_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(RawOil.getFluid(100))
                .fluidOutputs(atmosphericResidue.getFluid(50))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(15))
                .fluidOutputs(SulfuricLightFuel.getFluid(50))
                .fluidOutputs(SulfuricNaphtha.getFluid(20))
                .fluidOutputs(SulfuricGas.getFluid(60))
                .duration(20).EUt(96).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(deacidifiedDesaltedOil.getFluid(25))
                .fluidOutputs(atmosphericResidue.getFluid(100))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(30))
                .fluidOutputs(SulfuricLightFuel.getFluid(100))
                .fluidOutputs(SulfuricNaphtha.getFluid(40))
                .fluidOutputs(SulfuricGas.getFluid(120))
                .duration(20).EUt(96).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(deacidifiedDesaltedLightOil.getFluid(75))
                .fluidOutputs(atmosphericResidue.getFluid(50))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(20))
                .fluidOutputs(SulfuricLightFuel.getFluid(40))
                .fluidOutputs(SulfuricNaphtha.getFluid(60))
                .fluidOutputs(SulfuricGas.getFluid(480))
                .duration(20).EUt(96).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(deacidifiedDesaltedHeavyOil.getFluid(50))
                .fluidOutputs(atmosphericResidue.getFluid(400))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(500))
                .fluidOutputs(SulfuricLightFuel.getFluid(90))
                .fluidOutputs(SulfuricNaphtha.getFluid(30))
                .fluidOutputs(SulfuricGas.getFluid(120))
                .duration(20).EUt(288).buildAndRegister();

        DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(deacidifiedDesaltedRawOil.getFluid(50))
                .fluidOutputs(atmosphericResidue.getFluid(100))
                .fluidOutputs(SulfuricHeavyFuel.getFluid(30))
                .fluidOutputs(SulfuricLightFuel.getFluid(100))
                .fluidOutputs(SulfuricNaphtha.getFluid(40))
                .fluidOutputs(SulfuricGas.getFluid(120))
                .duration(20).EUt(96).buildAndRegister();

        desulfurizationRecipes();
        crackingRecipes();
        distillationRecipes();
    }

    private static void desulfurizationRecipes() {

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(sulfuricDeasphaltedOil.getFluid(6000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(deasphaltedOil.getFluid(6000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(sulfuricDeasphaltedOil.getFluid(6000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(deasphaltedOil.getFluid(6000))
                .duration(8).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricHeavyFuel.getFluid(8000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(HeavyFuel.getFluid(8000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricHeavyFuel.getFluid(8000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(HeavyFuel.getFluid(8000))
                .duration(8).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricLightFuel.getFluid(12000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(LightFuel.getFluid(12000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricLightFuel.getFluid(12000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(LightFuel.getFluid(12000))
                .duration(8).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricNaphtha.getFluid(12000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(Naphtha.getFluid(12000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricNaphtha.getFluid(12000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(Naphtha.getFluid(12000))
                .duration(8).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricGas.getFluid(16000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(RefineryGas.getFluid(16000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(SulfuricGas.getFluid(16000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(RefineryGas.getFluid(16000))
                .duration(8).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NaturalGas.getFluid(16000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, Molybdenite)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(RefineryGas.getFluid(16000))
                .duration(160).EUt(VA[LV]).buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder()
                .fluidInputs(NaturalGas.getFluid(16000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(dust, rutheniumDisulfideOnAlumina)
                .fluidOutputs(HydrogenSulfide.getFluid(1000))
                .fluidOutputs(RefineryGas.getFluid(16000))
                .duration(8).EUt(VA[LV]).buildAndRegister();
    }

    private static void distillationRecipes() {

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(RefineryGas.getFluid(1000))
                .fluidOutputs(Butane.getFluid(60))
                .fluidOutputs(Propane.getFluid(70))
                .fluidOutputs(Ethane.getFluid(100))
                .fluidOutputs(Methane.getFluid(750))
                .fluidOutputs(Helium.getFluid(20))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(olefinRichRefineryGas.getFluid(1000))
                .fluidOutputs(Butane.getFluid(20))
                .fluidOutputs(Butene.getFluid(110))
                .fluidOutputs(Butadiene.getFluid(90))
                .fluidOutputs(Propane.getFluid(20))
                .fluidOutputs(Propene.getFluid(190))
                .fluidOutputs(Ethane.getFluid(25))
                .fluidOutputs(Ethylene.getFluid(210))
                .fluidOutputs(acetylene.getFluid(70))
                .fluidOutputs(Methane.getFluid(200))
                .fluidOutputs(Helium.getFluid(20))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidOutputs(pentane.getFluid(150))
                .fluidOutputs(hexane.getFluid(125))
                .fluidOutputs(heptane.getFluid(100))
                .fluidOutputs(octane.getFluid(75))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ultraLowSulfurNaphtha.getFluid(1000))
                .fluidOutputs(pentane.getFluid(300))
                .fluidOutputs(hexane.getFluid(250))
                .fluidOutputs(heptane.getFluid(200))
                .fluidOutputs(octane.getFluid(150))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .fluidOutputs(nonane.getFluid(60))
                .fluidOutputs(decane.getFluid(45))
                .fluidOutputs(undecane.getFluid(30))
                .fluidOutputs(dodecane.getFluid(15))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ultraLowSulfurLightFuel.getFluid(1000))
                .fluidOutputs(nonane.getFluid(120))
                .fluidOutputs(decane.getFluid(90))
                .fluidOutputs(undecane.getFluid(60))
                .fluidOutputs(dodecane.getFluid(30))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .fluidOutputs(tridecane.getFluid(12))
                .fluidOutputs(tetradecane.getFluid(9))
                .fluidOutputs(pentadecane.getFluid(6))
                .fluidOutputs(hexadecane.getFluid(3))
                .duration(240).EUt(VA[MV]).buildAndRegister();

        VACUUM_DISTILLATION_RECIPES.recipeBuilder()
                .fluidInputs(ultraLowSulfurHeavyFuel.getFluid(1000))
                .fluidOutputs(tridecane.getFluid(24))
                .fluidOutputs(tetradecane.getFluid(18))
                .fluidOutputs(pentadecane.getFluid(12))
                .fluidOutputs(hexadecane.getFluid(6))
                .duration(240).EUt(VA[MV]).buildAndRegister();
    }

    private static void crackingRecipes() {

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(deasphaltedOil.getFluid(1000))
                .notConsumable(dust, fluidCatalyticCrackingCatalyst)
                .chancedOutput(dust, petroleumCoke, 1, 800, 0)
                .fluidOutputs(octaneBoostedLightFuel.getFluid(2000))
                .fluidOutputs(octaneBoostedNaphtha.getFluid(1200))
                .fluidOutputs(olefinRichRefineryGas.getFluid(50))
                .duration(60).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(deasphaltedOil.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 2, 1600, 0)
                .fluidOutputs(HeavyFuel.getFluid(1000))
                .fluidOutputs(LightFuel.getFluid(500))
                .fluidOutputs(RefineryGas.getFluid(300))
                .duration(60).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(deasphaltedOil.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(6000))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 2, 4800, 0)
                .fluidOutputs(HeavyFuel.getFluid(2000))
                .fluidOutputs(LightFuel.getFluid(1000))
                .fluidOutputs(RefineryGas.getFluid(600))
                .duration(60).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(deasphaltedOil.getFluid(1000))
                .fluidInputs(Steam.getFluid(1600))
                .chancedOutput(dust, petroleumCoke, 2, 3200, 0)
                .notConsumable(new IntCircuitIngredient(1))
                .fluidOutputs(HeavyFuel.getFluid(1000))
                .fluidOutputs(LightFuel.getFluid(500))
                .fluidOutputs(olefinRichRefineryGas.getFluid(300))
                .duration(60).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(deasphaltedOil.getFluid(1000))
                .fluidInputs(Steam.getFluid(4800))
                .chancedOutput(dust, petroleumCoke, 2, 9600, 0)
                .notConsumable(new IntCircuitIngredient(2))
                .fluidOutputs(HeavyFuel.getFluid(2000))
                .fluidOutputs(LightFuel.getFluid(1000))
                .fluidOutputs(olefinRichRefineryGas.getFluid(600))
                .duration(60).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .notConsumable(dust, fluidCatalyticCrackingCatalyst)
                .fluidOutputs(octaneBoostedLightFuel.getFluid(700))
                .fluidOutputs(octaneBoostedNaphtha.getFluid(500))
                .fluidOutputs(olefinRichRefineryGas.getFluid(400))
                .duration(30).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(ultraLowSulfurHeavyFuel.getFluid(1000))
                .notConsumable(dust, fluidCatalyticCrackingCatalyst)
                .fluidOutputs(ultraLowSulfurOctaneBoostedLightFuel.getFluid(1400))
                .fluidOutputs(ultraLowSulfurOctaneBoostedNaphtha.getFluid(1000))
                .fluidOutputs(olefinRichRefineryGas.getFluid(800))
                .duration(30).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 1600, 0)
                .fluidOutputs(LightFuel.getFluid(700))
                .fluidOutputs(Naphtha.getFluid(500))
                .fluidOutputs(RefineryGas.getFluid(400))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(6000))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 4800, 0)
                .fluidOutputs(LightFuel.getFluid(500))
                .fluidOutputs(Naphtha.getFluid(800))
                .fluidOutputs(RefineryGas.getFluid(500))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .fluidInputs(Steam.getFluid(1600))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 3200, 0)
                .fluidOutputs(LightFuel.getFluid(700))
                .fluidOutputs(Naphtha.getFluid(500))
                .fluidOutputs(olefinRichRefineryGas.getFluid(400))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(HeavyFuel.getFluid(1000))
                .fluidInputs(Steam.getFluid(4800))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 9600, 0)
                .fluidOutputs(LightFuel.getFluid(500))
                .fluidOutputs(Naphtha.getFluid(800))
                .fluidOutputs(olefinRichRefineryGas.getFluid(500))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .notConsumable(dust, fluidCatalyticCrackingCatalyst)
                .fluidOutputs(octaneBoostedNaphtha.getFluid(900))
                .fluidOutputs(olefinRichRefineryGas.getFluid(500))
                .duration(30).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(ultraLowSulfurLightFuel.getFluid(1000))
                .notConsumable(dust, fluidCatalyticCrackingCatalyst)
                .fluidOutputs(ultraLowSulfurOctaneBoostedNaphtha.getFluid(1800))
                .fluidOutputs(olefinRichRefineryGas.getFluid(1000))
                .duration(30).EUt(VA[EV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 800, 0)
                .fluidOutputs(Naphtha.getFluid(900))
                .fluidOutputs(RefineryGas.getFluid(500))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(6000))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 2400, 0)
                .fluidOutputs(Naphtha.getFluid(700))
                .fluidOutputs(RefineryGas.getFluid(900))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .fluidInputs(Steam.getFluid(1600))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 1600, 0)
                .fluidOutputs(Naphtha.getFluid(900))
                .fluidOutputs(olefinRichRefineryGas.getFluid(500))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(LightFuel.getFluid(1000))
                .fluidInputs(Steam.getFluid(4800))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 4800, 0)
                .fluidOutputs(Naphtha.getFluid(700))
                .fluidOutputs(olefinRichRefineryGas.getFluid(900))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(2000))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 400, 0)
                .fluidOutputs(RefineryGas.getFluid(1200))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidInputs(Hydrogen.getFluid(6000))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 1200, 0)
                .fluidOutputs(RefineryGas.getFluid(1400))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidInputs(Steam.getFluid(1600))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 800, 0)
                .fluidOutputs(olefinRichRefineryGas.getFluid(1200))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(Naphtha.getFluid(1000))
                .fluidInputs(Steam.getFluid(4800))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 2400, 0)
                .fluidOutputs(olefinRichRefineryGas.getFluid(1400))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(RefineryGas.getFluid(1000))
                .fluidInputs(Steam.getFluid(1600))
                .notConsumable(new IntCircuitIngredient(1))
                .chancedOutput(dust, petroleumCoke, 1, 400, 0)
                .fluidOutputs(olefinRichRefineryGas.getFluid(1000))
                .fluidOutputs(Hydrogen.getFluid(500))
                .duration(120).EUt(VA[MV]).buildAndRegister();

        CRACKING_RECIPES.recipeBuilder()
                .fluidInputs(RefineryGas.getFluid(1000))
                .fluidInputs(Steam.getFluid(4800))
                .notConsumable(new IntCircuitIngredient(2))
                .chancedOutput(dust, petroleumCoke, 1, 1200, 0)
                .fluidOutputs(olefinRichRefineryGas.getFluid(1200))
                .fluidOutputs(Hydrogen.getFluid(600))
                .duration(120).EUt(VA[MV]).buildAndRegister();
    }

}
