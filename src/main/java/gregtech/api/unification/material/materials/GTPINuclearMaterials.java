package gregtech.api.unification.material.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPINuclearMaterials {
    /**
     * ID RANGE: 29000-29999 (incl.)
     */
    public static void register() {
        int counter = 29000;
        // Uranium
        uraniniteConcentrate = new Material.Builder(counter, "uraninite_concentrate")
                .fluid(FluidTypes.ACID)
                .color(0xd9ad29)
                .build()
                .setFormula("(H4UO2(SO4)3)(NaCl)(H2O)", true);
        counter++;

        organicUranylConcentrate = new Material.Builder(counter, "organic_uranyl_concentrate")
                .fluid()
                .color(0xfff45c)
                .build()
                .setFormula("(UO2[DEHP]2)(TOPO)(C12H26)", true);
        counter++;

        aqueousUraniniteWasteSolution = new Material.Builder(counter, "aqueous_uraninite_waste_solution")
                .fluid(FluidTypes.ACID)
                .color(0xe8a831)
                .build()
                .setFormula("(NaCl)(H2SO4)(H2O)", true);
        counter++;

        carnotiteConcentrate = new Material.Builder(counter, "carnotite_concentrate")
                .fluid()
                .color(0x872244)
                .build()
                .setFormula("(K4(UO2)(CO3)3)(K3VO4)(H2O)", true);
        counter++;

        aqueousCarnotiteWasteSolution = new Material.Builder(counter, "aqueous_carnotite_waste_solution")
                .fluid()
                .color(0x9c6778)
                .build()
                .setFormula("(K3VO4)(K2CO3)(CO2)(H2O)", true);
        counter++;

        potassiumOrthovanadate = new Material.Builder(counter, "potassium_orthovanadate")
                .dust()
                .color(0xc45e2b).iconSet(DULL)
                .build()
                .setFormula("K3VO4", true);
        counter++;

        organicThoriumSolution = new Material.Builder(counter, "organic_thorium_solution")
                .fluid()
                .color(0xb8b78d)
                .build()
                .setFormula("(Th(NO3)4)(TBP)(C12H26)", true);
        counter++;

        thoriumNitrate = new Material.Builder(counter, "thorium_nitrate")
                .dust()
                .color(0xb0af9d).iconSet(ROUGH)
                .build()
                .setFormula("Th(NO3)4", true);
        counter++;

        potassiumOrthovanadate = new Material.Builder(counter, "potassium_orthovanadate")
                .dust()
                .color(0xc45e2b).iconSet(DULL)
                .build()
                .setFormula("K3VO4", true);
        counter++;

        sodiumUranylTricarbonate = new Material.Builder(counter, "sodium_uranyl_tricarbonate")
                .dust()
                .color(0xfffb00).iconSet(DULL)
                .build()
                .setFormula("Na4UO2(CO3)3", true);
        counter++;

        yellowcake = new Material.Builder(counter, "yellowcake")
                .dust()
                .color(0x302900).iconSet(ROUGH)
                .build()
                .setFormula("U3O8", true);
        counter++;

        radioactiveOreGases = new Material.Builder(counter, "radioactive_ore_gases")
                .fluid(FluidTypes.GAS)
                .color(0xd9ad29)
                .build()
                .setFormula("(CO2)(H2O)(He)(Rn)", true);
        counter++;

        radioactiveOreNobleGases = new Material.Builder(counter, "radioactive_ore_noble_gases")
                .fluid(FluidTypes.GAS)
                .color(0xd9ad29)
                .build()
                .setFormula("(He)(Rn)", true);
        counter++;

        liquidRadioactiveOreNobleGases = new Material.Builder(counter, "liquid_radioactive_ore_noble_gases")
                .fluid(FluidTypes.GAS)
                .color(0xd9ad29)
                .fluidTemp(77)
                .build()
                .setFormula("(He)(Rn)", true);
        counter++;

        organicUranylNitrateSolution = new Material.Builder(counter, "organic_uranyl_nitrate_solution")
                .fluid()
                .color(0xbf7d43)
                .build()
                .setFormula("(UO2(NO3)2)(TBP)(C12H26)", true);
        counter++;

        uraniumTrioxide = new Material.Builder(counter, "uranium_trioxide")
                .dust()
                .color(0x261d00).iconSet(ROUGH)
                .build()
                .setFormula("UO3", true);
        counter++;

        uraniumDioxide = new Material.Builder(counter, "uranium_dioxide")
                .dust()
                .color(0x141000).iconSet(ROUGH)
                .build()
                .setFormula("UO2", true);
        counter++;

        uraniumTetrafluoride = new Material.Builder(counter, "uranium_tetrafluoride")
                .dust()
                .color(0x5d8a4a).iconSet(ROUGH)
                .build()
                .setFormula("UF4", true);
        counter++;

        supercriticalUraniumHexafluoride = new Material.Builder(counter, "supercritical_uranium_hexafluoride")
                .fluid(FluidTypes.GAS)
                .color(0xa3fa96)
                .fluidTemp(333)
                .build()
                .setFormula("UF6", true);
        counter++;

        highlyEnrichedUraniumHexafluoride = new Material.Builder(counter, "highly_enriched_uranium_hexafluoride")
                .fluid(FluidTypes.GAS)
                .color(0x1cff20)
                .build()
                .setFormula("UF6", true);
        counter++;

        depletedUraniumTetrafluoride = new Material.Builder(counter, "depleted_uranium_tetrafluoride")
                .dust()
                .color(0x527559).iconSet(DULL)
                .build()
                .setFormula("UF4", true);
        counter++;

        highlyEnrichedUraniumTetrafluoride = new Material.Builder(counter, "highly_enriched_uranium_tetrafluoride")
                .dust()
                .color(0x6ed482).iconSet(DULL)
                .build()
                .setFormula("UF4", true);
        counter++;

        lowEnrichedUranylFluoride = new Material.Builder(counter, "low_enriched_uranyl_fluoride")
                .dust()
                .color(0x5a8054).iconSet(DULL)
                .build()
                .setFormula("UO2F2", true);
        counter++;

        lowEnrichedUraniumDioxide = new Material.Builder(counter, "low_enriched_uranium_dioxide")
                .dust()
                .color(0x163612).iconSet(SHINY)
                .build()
                .setFormula("UO2", true);
        counter++;

        highlyEnrichedUranylFluoride = new Material.Builder(counter, "highly_enriched_uranyl_fluoride")
                .dust()
                .color(0x6aad5f).iconSet(DULL)
                .build()
                .setFormula("UO2F2", true);
        counter++;

        highlyEnrichedUraniumDioxide = new Material.Builder(counter, "highly_enriched_uranium_dioxide")
                .dust()
                .color(0x21451c).iconSet(SHINY)
                .build()
                .setFormula("UO2", true);
        counter++;

        highlyEnrichedUranylNitrate = new Material.Builder(counter, "highly_enriched_uranyl_nitrate")
                .dust()
                .color(0x1d331a).iconSet(SHINY)
                .build()
                .setFormula("UO2(NO3)2", true);
        counter++;

        thoriumTetrafluoride = new Material.Builder(counter, "thorium_tetrafluoride")
                .dust()
                .color(0x246907).iconSet(DULL)
                .build()
                .setFormula("ThF4", true);
        counter++;

        // Fuels
        leuFuelUnsintered = new Material.Builder(counter, "leu_fuel_unsintered")
                .color(0x68e019).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        leuFuel = new Material.Builder(counter, "leu_fuel")
                .color(0x68e019).iconSet(BRIGHT)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        heuFuelUncalcined = new Material.Builder(counter, "heu_fuel_uncalcined")
                .color(0x62ad31).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        heuFuelUnsintered = new Material.Builder(counter, "heu_fuel_unsintered")
                .color(0x62ad31).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        heuFuelUncoated = new Material.Builder(counter, "heu_fuel_uncoated")
                .color(0x62ad31).iconSet(SHINY)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        heuFuel = new Material.Builder(counter, "heu_fuel")
                .color(0x62ad31).iconSet(BRIGHT)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxNpFuelUncalcined = new Material.Builder(counter, "mox_np_fuel_uncalcined")
                .color(0x456b0c).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxNpFuelUnsintered = new Material.Builder(counter, "mox_np_fuel_unsintered")
                .color(0x456b0c).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxNpFuelUncoated = new Material.Builder(counter, "mox_np_fuel_uncoated")
                .color(0x456b0c).iconSet(SHINY)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxNpFuel = new Material.Builder(counter, "mox_np_fuel")
                .color(0x456b0c).iconSet(BRIGHT)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxPuFuelUncalcined = new Material.Builder(counter, "mox_pu_fuel_uncalcined")
                .color(0x6e7a1b).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxPuFuelUnsintered = new Material.Builder(counter, "mox_pu_fuel_unsintered")
                .color(0x6e7a1b).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxPuFuelUncoated = new Material.Builder(counter, "mox_pu_fuel_uncoated")
                .color(0x6e7a1b).iconSet(SHINY)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        moxPuFuel = new Material.Builder(counter, "mox_pu_fuel")
                .color(0x6e7a1b).iconSet(BRIGHT)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        uraniumFuelSpent = new Material.Builder(counter, "uranium_fuel_spent")
                .color(0x122e09).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        neptuniumFuelSpent = new Material.Builder(counter, "neptunium_fuel_spent")
                .color(0x1c2e09).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        plutoniumFuelSpent = new Material.Builder(counter, "plutonium_fuel_spent")
                .color(0x292e09).iconSet(METALLIC)
                .flags(GENERATE_ROUND)
                .build();
        counter++;

        // Fuel Reprocessing
        voloxidatedSpentUraniumFuel = new Material.Builder(counter, "voloxidated_spent_uranium_fuel")
                .dust()
                .color(0x367a3c).iconSet(ROUGH)
                .build();
        counter++;

        volatileFissionProducts = new Material.Builder(counter, "volatile_fission_products")
                .fluid(FluidTypes.GAS)
                .color(0xbad69f)
                .build();
        counter++;

        ammoniumMetavanadate = new Material.Builder(counter, "ammonium_metavanadate")
                .dust()
                .color(0xb08625).iconSet(DULL)
                .build()
                .setFormula("NH4VO3", true);
        counter++;

        spentUraniumFuelSolution = new Material.Builder(counter, "spent_uranium_fuel_solution")
                .fluid()
                .color(0x57a10d)
                .build()
                .setFormula("(UO2(NO3)2)(NpO2NO3)(Pu(NO3)4)(HTcO4)(HNO3)(H2O)", true);
        counter++;

        organicPurexDecontaminatedSolution = new Material.Builder(counter, "organic_purex_decontaminated_solution")
                .fluid()
                .color(0x79e012)
                .build()
                .setFormula("(UO2(NO3)2)(NpO2(NO3)2)(Pu(NO3)4)(HTcO4)(TBP)(C12H26)", true);
        counter++;

        aqueousPurexHighActivityWasteSolution = new Material.Builder(counter, "aqueous_purex_high_activity_waste_solution")
                .fluid()
                .color(0x3a690c)
                .build()
                .setFormula("(HNO3)(H2O)", true);
        counter++;

        organicPurexNeptuniumDepletedSolution = new Material.Builder(counter, "organic_purex_neptunium_depleted_solution")
                .fluid()
                .color(0x8ede3e)
                .build()
                .setFormula("(UO2(NO3)2)(Pu(NO3)4)(HTcO4)(TBP)(C12H26)", true);
        counter++;

        aqueousPurexNeptuniumSolution = new Material.Builder(counter, "aqueous_purex_neptunium_solution")
                .fluid()
                .color(0x42d44b)
                .build()
                .setFormula("(NpO2NO3)(C4H8O2)(HNO3)", true);
        counter++;

        organicPurexNeptuniumTechnetiumDepletedSolution = new Material.Builder(counter, "organic_purex_neptunium_technetium_depleted_solution")
                .fluid()
                .color(0xa3e065)
                .build()
                .setFormula("(UO2(NO3)2)(Pu(NO3)4)(TBP)(C12H26)", true);
        counter++;

        aqueousPurexTechnetiumSolution = new Material.Builder(counter, "aqueous_purex_technetium_solution")
                .fluid()
                .color(0x6e000b)
                .build()
                .setFormula("(HTcO4)(HNO3)", true);
        counter++;

        organicPurexUraniumSolution = new Material.Builder(counter, "organic_purex_uranium_solution")
                .fluid()
                .color(0xd9b60b)
                .build()
                .setFormula("(UO2(NO3)2)(TBP)(C12H26)", true);
        counter++;

        aqueousPurexPlutoniumSolution = new Material.Builder(counter, "aqueous_purex_plutonium_solution")
                .fluid()
                .color(0x877209)
                .build()
                .setFormula("(Pu(NO3)4)(C4H8O2)(HNO3)", true);
        counter++;

        aqueousPurexNeptuniumProduct = new Material.Builder(counter, "aqueous_purex_neptunium_product")
                .fluid()
                .color(0x1fbf29)
                .build()
                .setFormula("(NpO2NO3)(C4H8O2)(HNO3)(H2O)", true);
        counter++;

        aqueousPurexReducedNeptuniumProduct = new Material.Builder(counter, "aqueous_purex_reduced_neptunium_product")
                .fluid()
                .color(0x6d871e)
                .build()
                .setFormula("(Np(NO3)4)(C4H8O2)(HNO3)(H2O)", true);
        counter++;

        neptuniumOxalate = new Material.Builder(counter, "neptunium_oxalate")
                .dust()
                .color(0x89bd11).iconSet(ROUGH)
                .build()
                .setFormula("Np(C2O4)2", true);
        counter++;

        neptuniumDioxide = new Material.Builder(counter, "neptunium_dioxide")
                .dust()
                .color(0x567312).iconSet(SHINY)
                .build()
                .setFormula("NpO2", true);
        counter++;

        neptuniumNitrate = new Material.Builder(counter, "neptunium_nitrate")
                .dust()
                .color(0x405904).iconSet(SHINY)
                .build()
                .setFormula("Np(NO3)4", true);
        counter++;

        ammoniumPertechnetate = new Material.Builder(counter, "ammonium_pertechnetate")
                .dust()
                .color(0xc77e6d).iconSet(DULL)
                .build()
                .setFormula("NH4TcO4", true);
        counter++;

        pertechnetatePassivatedSteel = new Material.Builder(counter, "pertechnetate_passivated_steel")
                .ingot()
                .color(0x6e65f0).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME)
                .blastTemp(4200, GasTier.HIGH, 900)
                .build()
                .setFormula("(Ni8Fe3W4Mo2CrNb)(TcO2)", true);
        counter++;

        aqueousPurexPlutoniumProduct = new Material.Builder(counter, "aqueous_purex_plutonium_product")
                .fluid()
                .color(0x5c5014)
                .build()
                .setFormula("(Pu(NO3)4)(C4H8O2)(HNO3)(H2O)", true);
        counter++;

        plutoniumOxalate = new Material.Builder(counter, "plutonium_oxalate")
                .dust()
                .color(0xe0c71f).iconSet(ROUGH)
                .build()
                .setFormula("Pu(C2O4)2", true);
        counter++;

        plutoniumDioxide = new Material.Builder(counter, "plutonium_dioxide")
                .dust()
                .color(0xf5d607).iconSet(SHINY)
                .build()
                .setFormula("PuO2", true);
        counter++;

        plutoniumNitrate = new Material.Builder(counter, "plutonium_nitrate")
                .dust()
                .color(0xb8a000).iconSet(SHINY)
                .build()
                .setFormula("Pu(NO3)4", true);
        counter++;

        aqueousPurexUraniumProduct = new Material.Builder(counter, "aqueous_purex_uranium_product")
                .fluid()
                .color(0x5c5014)
                .build()
                .setFormula("(UO2(NO3)2)(HNO3)(H2O)", true);
        counter++;

    }
}
