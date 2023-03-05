package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPIInorganicMaterials {
    /**
     * ID RANGE: 30000-30999 (incl.)
     */
    public static void register() {
        int counter = 30000;
        // Component and Circuit Overhaul
        sodiumPersulfateSolution = new Material.Builder(counter, "sodium_persulfate_solution")
                .fluid()
                .color(0x30ab6f)
                .components(SodiumPersulfate, 1, Water, 1)
                .build();
        counter++;

        ferricChlorideSolution = new Material.Builder(counter, "ferric_chloride_solution")
                .fluid()
                .color(0x060b0b)
                .components(Iron3Chloride, 1, Water, 1)
                .build();
        counter++;

        advancedSolderingAlloy = new Material.Builder(counter, "advanced_soldering_alloy")
                .ingot()
                .fluid()
                .color(0x29c28a).iconSet(DULL)
                .components(Silver, 3, Tin, 1, Holmium, 1)
                .build();
        counter++;

        advancedLubricant = new Material.Builder(counter, "advanced_lubricant")
                .fluid()
                .color(0x54c73a)
                .build();
        counter++;

        // Magnetics Chain
        unmagnetizedNeodymiumMagnet = new Material.Builder(counter, "unmagnetized_neodymium")
                .ingot()
                .color(0x6d756e).iconSet(METALLIC)
                .blastTemp(1297, GasTier.MID)
                .polarizesInto(NeodymiumMagnetic)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Neodymium, 2, Iron, 14, Boron, 1)
                .build();
        counter++;

        NeodymiumMagnetic = new Material.Builder(counter, "neodymium_magnetic")
                .ingot()
                .color(0x6d756e).iconSet(MAGNETIC)
                .flags(GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(Neodymium, 2, Iron, 14, Boron, 1)
                .ingotSmeltInto(unmagnetizedNeodymiumMagnet)
                .arcSmeltInto(unmagnetizedNeodymiumMagnet)
                .macerateInto(unmagnetizedNeodymiumMagnet)
                .build();
        unmagnetizedNeodymiumMagnet.getProperty(PropertyKey.INGOT).setMagneticMaterial(NeodymiumMagnetic);
        counter++;

        unmagnetizedSamariumCobaltMagnet = new Material.Builder(counter, "unmagnetized_samarium_cobalt")
                .ingot()
                .color(0xded2ab).iconSet(METALLIC)
                .blastTemp(5400, GasTier.HIGH)
                .polarizesInto(SamariumMagnetic)
                .flags(GENERATE_ROD, GENERATE_LONG_ROD)
                .components(Samarium, 1, Cobalt, 5)
                .build();
        counter++;

        SamariumMagnetic = new Material.Builder(counter, "samarium_magnetic")
                .ingot()
                .color(0xded2ab).iconSet(MAGNETIC)
                .flags(GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(Samarium, 1, Cobalt, 5)
                .ingotSmeltInto(unmagnetizedSamariumCobaltMagnet)
                .arcSmeltInto(unmagnetizedSamariumCobaltMagnet)
                .macerateInto(unmagnetizedSamariumCobaltMagnet)
                .build();
        unmagnetizedSamariumCobaltMagnet.getProperty(PropertyKey.INGOT).setMagneticMaterial(SamariumMagnetic);
        counter++;

        unmagnetizedPraseodymiumRheniumCarbide = new Material.Builder(counter, "unmagnetized_praseodymium_rhenium_carbide")
                .ingot()
                .color(0x2a616e).iconSet(METALLIC)
                .blastTemp(9001, GasTier.HIGHER, 30720, -1)
                .polarizesInto(praseodymiumRheniumCarbide)
                .flags(GENERATE_LONG_ROD)
                .components(Praseodymium, 2, Rhenium, 1, Carbon, 2)
                .build();
        counter++;

        praseodymiumRheniumCarbide = new Material.Builder(counter, "praseodymium_rhenium_carbide_magnetic")
                .ingot()
                .color(0x2a616e).iconSet(MAGNETIC)
                .flags(GENERATE_LONG_ROD, IS_MAGNETIC)
                .components(Praseodymium, 2, Rhenium, 1, Carbon, 2)
                .ingotSmeltInto(unmagnetizedPraseodymiumRheniumCarbide)
                .arcSmeltInto(unmagnetizedPraseodymiumRheniumCarbide)
                .macerateInto(unmagnetizedPraseodymiumRheniumCarbide)
                .build();
        unmagnetizedPraseodymiumRheniumCarbide.getProperty(PropertyKey.INGOT).setMagneticMaterial(praseodymiumRheniumCarbide);
        counter++;

        // Superconductors Chain
        bismuthStrontiumCalciumCuprate = new Material.Builder(counter, "bismuth_strontium_calcium_cuprate")
                .ingot()
                .color(0x614c13)
                .blastTemp(4500, GasTier.HIGH, 480, -1).iconSet(METALLIC)
                .flags(GENERATE_ROD)
                .build()
                .setFormula("Bi2Sr2CaCu2O8", true);;
        counter++;

        thalliumBariumCalciumCuprate = new Material.Builder(counter, "thallium_barium_calcium_cuprate")
                .ingot()
                .color(0x59b33b)
                .blastTemp(5400, GasTier.HIGH, 1920, -1).iconSet(METALLIC)
                .flags(GENERATE_ROD)
                .build()
                .setFormula("Tl2Ba2Ca2Cu3O10", true);;
        counter++;

        // Explosives Chain
        impregnatedWoodChips = new Material.Builder(counter, "impregnated_wood_chips")
                .dust()
                .color(0x634e3a).iconSet(WOOD)
                .flags(FLAMMABLE)
                .build();
        counter++;

        cookedWoodChips = new Material.Builder(counter, "cooked_wood_chips")
                .dust()
                .color(0x3b3025).iconSet(WOOD)
                .flags(FLAMMABLE)
                .build();
        counter++;

        woodPulp = new Material.Builder(counter, "unbleached_paper")
                .dust()
                .color(0x736a60).iconSet(WOOD)
                .flags(FLAMMABLE)
                .build();
        counter++;

        bleachedPaper = new Material.Builder(counter, "bleached_paper")
                .dust()
                .color(0xffffff).iconSet(WOOD)
                .flags(GENERATE_PLATE, FLAMMABLE)
                .build();
        counter++;

        nitrocellulose = new Material.Builder(counter, "nitrocellulose")
                .dust()
                .color(0xe6ffad).iconSet(WOOD)
                .flags(GENERATE_PLATE, EXPLOSIVE, FLAMMABLE)
                .build()
                .setFormula("C6H7N3O11", true);
        counter++;

        trinitrotoluene = new Material.Builder(counter, "trinitrotoluene")
                .dust()
                .color(0xc6c99f).iconSet(DULL)
                .flags(EXPLOSIVE)
                .build()
                .setFormula("C7H5N3O6", true);
        counter++;

        // Water Chain
        seawater = new Material.Builder(counter, "seawater")
                .fluid(FluidTypes.LIQUID, true)
                .color(0x001742)
                .build()
                .setFormula("(MgCl2)(NaBr)(NaCl)(H2O)", true);
        counter++;

        magnesiumDepletedseawater = new Material.Builder(counter, "magnesium_depleted_seawater")
                .fluid()
                .color(0x001c52)
                .build()
                .setFormula("(CaCl2)(NaBr)(NaCl)(H2O)", true);;
        counter++;

        magnesiumCalciumDepletedseawater = new Material.Builder(counter, "magnesium_calcium_depleted_seawater")
                .fluid()
                .color(0x002263)
                .build()
                .setFormula("(NaBr)(NaCl)(H2O)", true);;
        counter++;

        pretreatedWater = new Material.Builder(counter, "pretreated_water")
                .fluid()
                .color(0x6ea7c2)
                .build()
                .setFormula("H2O", true);
        counter++;

        deionizedWater = new Material.Builder(counter, "deionized_water")
                .fluid()
                .color(0x81b2c9)
                .build()
                .setFormula("H2O", true);
        counter++;

        sterileWater = new Material.Builder(counter, "sterile_water")
                .fluid()
                .color(0x97bed1)
                .build()
                .setFormula("H2O", true);
        counter++;

        ultraPureWater1 = new Material.Builder(counter, "ultrapure_water_1")
                .fluid()
                .color(0xa9c9d9)
                .build()
                .setFormula("H2O", true);
        counter++;

        ozone = new Material.Builder(counter, "ozone")
                .fluid(FluidTypes.GAS)
                .color(0x00a6ed)
                .build()
                .setFormula("O3", true);
        counter++;

        ozonatedWater = new Material.Builder(counter, "ozonated_water")
                .fluid()
                .color(0xb6cfdb)
                .build()
                .setFormula("H2O", true);
        counter++;

        ultraPureWater2 = new Material.Builder(counter, "ultrapure_water_2")
                .fluid()
                .color(0xcad9e0)
                .build()
                .setFormula("H2O", true);
        counter++;

        ultraPureWater3 = new Material.Builder(counter, "ultrapure_water_3")
                .fluid()
                .color(0xd3dee3)
                .build()
                .setFormula("H2O", true);
        counter++;

        ultraPureWater4 = new Material.Builder(counter, "ultrapure_water_4")
                .fluid()
                .color(0xdce3e6)
                .build()
                .setFormula("H2O", true);
        counter++;

        // Ash Chain
        potassiumSulfide = new Material.Builder(counter, "potassium_sulfide")
                .dust()
                .color(0x9e6646).iconSet(DULL)
                .build()
                .setFormula("K2S", true);
        counter++;

        calciumSulfide = new Material.Builder(counter, "calcium_sulfide")
                .dust()
                .color(0xdbcf8a).iconSet(DULL)
                .build()
                .setFormula("CaS", true);
        counter++;

        // Ceramics Chain
        siliconCarbide = new Material.Builder(counter, "silicon_carbide")
                .gem()
                .color(0x857769).iconSet(ROUGH)
                .flags(GENERATE_PLATE)
                .build()
                .setFormula("SiC", true);
        counter++;

        yttriaStabilizedZirconia = new Material.Builder(counter, "yttria_stabilized_zirconia")
                .dust()
                .color(0x806142).iconSet(DULL)
                .build()
                .setFormula("Zr8Y2O19", true);
        counter++;

        // Graphene Chain
        bismuthHydroxide = new Material.Builder(counter, "bismuth_hydroxide")
                .dust()
                .color(0xccc478).iconSet(ROUGH)
                .build()
                .setFormula("Bi(OH)3", true);
        counter++;

        bismuthTrioxide = new Material.Builder(counter, "bismuth_trioxide")
                .dust()
                .color(0xe3e650).iconSet(ROUGH)
                .build()
                .setFormula("Bi2O3", true);
        counter++;

        bismuthTitanate = new Material.Builder(counter, "bismuth_titanate")
                .gem()
                .color(0xdb9a44).iconSet(GEM_HORIZONTAL)
                .build()
                .setFormula("Bi4Ti3O12", true);
        counter++;

        // Coolants Chain
        liquidNitrogen = new Material.Builder(counter, "liquid_nitrogen")
                .fluid()
                .color(0x8ad1bc)
                .fluidTemp(77)
                .build()
                .setFormula("N2", true);
        counter++;

        supercriticalSteam = new Material.Builder(counter, "supercritical_steam")
                .fluid(FluidTypes.GAS)
                .color(0xdbdbdb)
                .fluidTemp(623)
                .build()
                .setFormula("H2O", true);
        counter++;

        supercriticalCarbonDioxide = new Material.Builder(counter, "supercritical_carbon_dioxide")
                .fluid(FluidTypes.GAS)
                .color(0xbed4cc)
                .fluidTemp(873)
                .build()
                .setFormula("CO2", true);
        counter++;

        hotSodiumPotassium = new Material.Builder(counter, "hot_sodium_potassium")
                .fluid()
                .color(SodiumPotassium.getMaterialRGB()).iconSet(DULL)
                .fluidTemp(923)
                .build()
                .setFormula("NaK", true);
        counter++;

        lithiumTetrafluoroberyllate = new Material.Builder(counter, "lithium_tetrafluoroberyllate")
                .fluid()
                .color(0x687554)
                .build()
                .setFormula("Li2BeF4", true);
        counter++;

        hotLithiumTetrafluoroberyllate = new Material.Builder(counter, "hot_lithium_tetrafluoroberyllate")
                .fluid()
                .color(lithiumTetrafluoroberyllate.getMaterialRGB()).iconSet(DULL)
                .fluidTemp(973)
                .build()
                .setFormula("Li2BeF4", true);
        counter++;

        // Battery Chain
        mesylicAcid = new Material.Builder(counter, "mesylic_acid")
                .fluid(FluidTypes.ACID)
                .color(0xcfc44e)
                .build()
                .setFormula("CH4O3S", true);
        counter++;

        triflylFluoride = new Material.Builder(counter, "triflyl_fluoride")
                .fluid(FluidTypes.ACID)
                .color(0x339618)
                .build()
                .setFormula("CF4O2S", true);
        counter++;

        triflicAcid = new Material.Builder(counter, "triflic_acid")
                .fluid(FluidTypes.ACID)
                .color(0x3bf707)
                .build()
                .setFormula("CHF3O3S", true);
        counter++;

        lithiumNitride = new Material.Builder(counter, "lithium_nitride")
                .dust()
                .color(0xd188bc).iconSet(ROUGH)
                .build()
                .setFormula("Li3N", true);
        counter++;

        lithiumBistriflimide = new Material.Builder(counter, "lithium_bistriflimide")
                .dust()
                .color(0xaec282).iconSet(DULL)
                .build()
                .setFormula("Li[C2F6NO4S2]", true);
        counter++;

        lithiumFluoride = new Material.Builder(counter, "lithium_fluoride")
                .dust().fluid()
                .color(0x478026).iconSet(ROUGH)
                .build()
                .setFormula("LiF", true);
        counter++;

        bistriflimidicAcid = new Material.Builder(counter, "bistriflimidic_acid")
                .dust()
                .color(0x84ff00).iconSet(DULL)
                .build()
                .setFormula("C2HF6NO4S2", true);
        counter++;

        lithiumSulfate = new Material.Builder(counter, "lithium_sulfate")
                .dust()
                .color(0x98b579).iconSet(ROUGH)
                .build()
                .setFormula("Li2SO4", true);
        counter++;

        // Circuit Production Chain
        semiconductorGradeSilicon = new Material.Builder(counter, "semiconductor_grade_silicon")
                .ingot().fluid()
                .color(Silicon.getMaterialRGB()).iconSet(BRIGHT)
                .blastTemp(1687, GasTier.LOW)
                .build()
                .setFormula("Si", true);
        counter++;

        bufferedOxideEtch = new Material.Builder(counter, "buffered_oxide_etch")
                .fluid(FluidTypes.ACID)
                .color(0x00ff48)
                .build()
                .setFormula("(NH4F)(HF)(H2O)", true);
        counter++;

        piranhaSolution = new Material.Builder(counter, "piranha_solution")
                .fluid(FluidTypes.ACID)
                .color(0xb9cc97)
                .build()
                .setFormula("(H2SO4)(H2O2)", true);
        counter++;

        bakelite = new Material.Builder(counter, "bakelite")
                .ingot()
                .color(0x85593a).iconSet(DULL)
                .flags(GENERATE_PLATE)
                .build()
                .setFormula("C7H6O", true);
        counter++;

        // Alternate Materials Chain
        birmabright = new Material.Builder(counter, "birmabright")
                .ingot()
                .color(0x4779d6).iconSet(METALLIC)
                .blastTemp(1700, GasTier.LOW, 120, -1)
                .flags(GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(Aluminium, 5, Magnesium, 2, Manganese, 1)
                .rotorStats(10.0f, 2.0f, 164)
                .fluidPipeProperties(1166, 100, true)
                .build();
        counter++;

        udimet69420 = new Material.Builder(counter, "udimet_69420")
                .ingot()
                .color(0xc95a1e).iconSet(METALLIC)
                .blastTemp(1700, GasTier.LOW, 120, 400)
                .flags(GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(BlueAlloy, 6, Chrome, 2, Cobalt, 2, Boron, 5)
                .rotorStats(7.0f, 4.0f, 512)
                .build();
        counter++;

        sicSicMatrixComposite = new Material.Builder(counter, "sic_sic_matrix_composite")
                .ingot()
                .color(0x9e9757).iconSet(ROUGH)
                .flags(GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(Silicon, 1, Carbon, 1)
                .rotorStats(11.0f, 3.0f, 2048)
                .build();
        counter++;

        tungstenTechnetium = new Material.Builder(counter, "tungsten_technetium")
                .ingot()
                .color(0x545454).iconSet(METALLIC)
                .blastTemp(5400, GasTier.HIGH, 1920, 1200)
                .flags(GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(Tungsten, 1, Technetium, 1)
                .rotorStats(9.0f, 3.0f, 4096)
                .build();
        counter++;

        duralloy = new Material.Builder(counter, "duralloy")
                .ingot()
                .color(0x927ceb).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(Duranium, 4, NaquadahAlloy, 3, Molybdenum, 1)
                .blastTemp(7000, GasTier.HIGHER, 7680, 2400)
                .toolStats(ToolProperty.Builder.of(20.0F, 6.0F, 1024, 3)
                        .attackSpeed(0.2F).enchantability(25).build())
                .rotorStats(8.0f, 5.0f, 4096)
                .build();
        counter++;

        rheniumDiboride = new Material.Builder(counter, "rhenium_carbide")
                .ingot()
                .color(0x677778).iconSet(METALLIC)
                .components(Rhenium, 1, Boron, 2)
                .build();
        counter++;

        rheniumDiborideCoatedDuralloy = new Material.Builder(counter, "rhenium_carbide_coated_duralloy")
                .ingot()
                .color(0x3c10eb).iconSet(SHINY)
                .flags(GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_LONG_ROD, GENERATE_GEAR, GENERATE_SMALL_GEAR, NO_UNIFICATION)
                .components(duralloy, 1, rheniumDiboride, 1)
                .toolStats(ToolProperty.Builder.of(40.0F, 12.0F, 3072, 5)
                        .attackSpeed(0.3F).enchantability(33).magnetic().build())
                .rotorStats(8.5f, 6.0f, 6144)
                .build();
        counter++;

        regalohm62 = new Material.Builder(counter, "regalohm_62")
                .ingot()
                .color(0x7c7394).iconSet(SHINY)
                .flags(GENERATE_SPRING)
                .components(Platinum, 9, Tungsten, 1)
                .blastTemp(3600, GasTier.HIGH, 1920, 1000)
                .cableProperties(GTValues.V[5], 3, 2)
                .build();
        counter++;

    }
}
