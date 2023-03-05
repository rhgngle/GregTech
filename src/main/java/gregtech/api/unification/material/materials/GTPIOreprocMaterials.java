package gregtech.api.unification.material.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPIOreprocMaterials {
    /**
     * ID RANGE: 28000-28999 (incl.)
     */
    public static void register() {
        int counter = 28000;

        // Iodine Chain
        kelpAsh = new Material.Builder(counter, "kelp_ash")
                .dust()
                .color(0x3d3c40).iconSet(DULL)
                .build()
                .setFormula("(NaCl)(NaSO4)(NaI)", true);
        counter++;

        kelpAshBrine = new Material.Builder(counter, "kelp_ash_brine")
                .fluid()
                .color(0x616066)
                .build()
                .setFormula("(NaCl)(NaSO4)(NaI)(H2O)", true);
        counter++;

        iodideBrine = new Material.Builder(counter, "iodide_brine")
                .fluid()
                .color(0x4d2c22)
                .build()
                .setFormula("(NaI)(H2O)", true);
        counter++;

        cuprousIodide = new Material.Builder(counter, "cuprous_iodide")
                .dust()
                .color(0x805f38).iconSet(DULL)
                .build()
                .setFormula("CuI", true);
        counter++;

        sodiumIodide = new Material.Builder(counter, "sodium_iodide")
                .dust()
                .color(0x58476b).iconSet(DULL)
                .build()
                .setFormula("NaI", true);
        counter++;

        sodiumIodate = new Material.Builder(counter, "sodium_iodate")
                .dust()
                .color(0x9355d9).iconSet(DULL)
                .build()
                .setFormula("NaIO3", true);
        counter++;

        hydroiodicAcid = new Material.Builder(counter, "hydroiodic_acid")
                .fluid(FluidTypes.ACID)
                .color(0xbdc28a)
                .build()
                .setFormula("HI", true);
        counter++;

        trisodiumPhosphate = new Material.Builder(counter, "trisodium_phosphate")
                .dust()
                .color(0x5e6328).iconSet(DULL)
                .build()
                .setFormula("Na3PO4", true);
        counter++;

        // Aluminium Chain
        aluminiumChloride = new Material.Builder(counter, "aluminium_chloride")
                .dust()
                .color(0x71a7d1).iconSet(SHINY)
                .build()
                .setFormula("AlCl3", true);
        counter++;

        redMud = new Material.Builder(counter, "red_mud")
                .dust()
                .color(0xbf3115).iconSet(DULL)
                .build()
                .setFormula("(Fe2O3)(TiO2)(Sc2O3)", true);
        counter++;

        digestedBauxiteSolution = new Material.Builder(counter, "digested_bauxite_solution")
                .fluid()
                .color(0x572117)
                .build()
                .setFormula("(NaAlO2)(NaAl(OH)4)(H2O)", true);
        counter++;

        aluminiumHydroxide = new Material.Builder(counter, "aluminium_hydroxide")
                .dust()
                .color(0x2f9962).iconSet(DULL)
                .build()
                .setFormula("Al(OH)3", true);
        counter++;

        alumina = new Material.Builder(counter, "alumina")
                .ingot()
                .color(0x82a3b5).iconSet(SHINY)
                .build()
                .setFormula("Al2O3", true);
        counter++;

        redMudPigIron = new Material.Builder(counter, "red_mud_pig_iron")
                .ingot()
                .color(0x8a4e5e).iconSet(METALLIC)
                .build()
                .setFormula("(Fe)(TiO2)(Sc2O3)", true);
        counter++;

        redMudTailings = new Material.Builder(counter, "red_mud_tailings")
                .dust()
                .color(0x82081a).iconSet(DULL)
                .build()
                .setFormula("(TiO2)(Sc2O3)", true);
        counter++;

        scandiumRichConcentrate = new Material.Builder(counter, "scandium_rich_concentrate")
                .fluid(FluidTypes.ACID)
                .color(0x659960)
                .build()
                .setFormula("(Sc2O3)(HCl)", true);
        counter++;

        scandia = new Material.Builder(counter, "scandia")
                .dust()
                .color(0x9abd97).iconSet(ROUGH)
                .build()
                .setFormula("Sc2O3", true);
        counter++;

        scandiumFluoride = new Material.Builder(counter, "scandium_fluoride")
                .dust()
                .color(0x61e856).iconSet(ROUGH)
                .build()
                .setFormula("ScF3", true);
        counter++;

        scandalloy = new Material.Builder(counter, "scandalloy")
                .ingot().fluid()
                .color(0x9efff0).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(Scandium, 1, Aluminium, 5)
                .blastTemp(2100, GasTier.LOW, 480)
                .rotorStats(9.0f, 4.0f, 2048)
                .build();
        counter++;

        // Chromium Chain
        ferrochrome = new Material.Builder(counter, "ferrochrome")
                .dust()
                .color(0x6b4251).iconSet(ROUGH)
                .components(Iron, 1, Chrome, 1)
                .build();
        counter++;

        potassiumCarbonate = new Material.Builder(counter, "potassium_carbonate")
                .dust()
                .color(0x471f27).iconSet(ROUGH)
                .build()
                .setFormula("K2CO3", true);
        counter++;

        potassiumChromate = new Material.Builder(counter, "potassium_chromate")
                .dust()
                .color(0xb53851).iconSet(DULL)
                .build()
                .setFormula("K2CrO4", true);
        counter++;

        chromia = new Material.Builder(counter, "chromia")
                .dust()
                .color(0xba8cc2).iconSet(ROUGH)
                .build()
                .setFormula("Cr2O3", true);
        counter++;

        potassiumSulfate = new Material.Builder(counter, "potassium_sulfate")
                .dust()
                .color(0x787569).iconSet(DULL)
                .build()
                .setFormula("K2SO4", true);
        counter++;

        // Fluorine Chain
        fluorite = new Material.Builder(counter, "fluorite")
                .gem().ore()
                .color(0x00b52d).iconSet(EMERALD)
                .addOreByproducts(Galena, Quartzite, Sphalerite)
                .build()
                .setFormula("CaF2", true);
        counter++;

        fluorosilicicAcid = new Material.Builder(counter, "fluorosilicic_acid")
                .fluid(FluidTypes.ACID)
                .color(0x5eff00)
                .build()
                .setFormula("(H2SiF6)(H2O)2", true);
        counter++;

        fluoroaluminicAcid = new Material.Builder(counter, "fluoroaluminic_acid")
                .fluid(FluidTypes.ACID)
                .color(0x00ff51)
                .build()
                .setFormula("(H3AlF6)(H2O)2", true);
        counter++;

        cryolite = new Material.Builder(counter, "cryolite")
                .dust()
                .fluid()
                .color(0x70ff9e).iconSet(SHINY)
                .build()
                .setFormula("Na3AlF6", true);
        counter++;

        ammoniumFluoride = new Material.Builder(counter, "ammonium_fluoride")
                .dust()
                .color(0x649c82).iconSet(DULL)
                .build()
                .setFormula("NH4F", true);
        counter++;

        ammoniumBifluoride = new Material.Builder(counter, "ammonium_bifluoride")
                .dust()
                .color(0x63ba92).iconSet(DULL)
                .build()
                .setFormula("NH4HF2", true);
        counter++;

        potassiumFluoride = new Material.Builder(counter, "potassium_fluoride")
                .dust().fluid()
                .color(0x487a52).iconSet(DULL)
                .build()
                .setFormula("KF", true);
        counter++;

        // Vanadium Chain
        vanadiumResidue = new Material.Builder(counter, "vanadium_residue")
                .dust()
                .color(0x806554).iconSet(ROUGH)
                .build()
                .setFormula("(V2O5)", true);
        counter++;

        sodiumMetavanadate = new Material.Builder(counter, "sodium_metavanadate")
                .dust()
                .color(0xffc94a).iconSet(DULL)
                .build()
                .setFormula("NaVO3", true);
        counter++;

        vanadiumPentoxide = new Material.Builder(counter, "vanadium_pentoxide")
                .dust()
                .color(0xff9500).iconSet(SHINY)
                .build()
                .setFormula("V2O5", true);
        counter++;

        oleum = new Material.Builder(counter, "oleum")
                .fluid(FluidTypes.ACID)
                .color(0xbdbdbd)
                .build()
                .setFormula("H2S2O7", true);
        counter++;

        // Tungsten Chain
        sodiumTungstate = new Material.Builder(counter, "sodium_tungstate")
                .dust()
                .color(0xa16732).iconSet(ROUGH)
                .build()
                .setFormula("Na2WO4", true);
        counter++;

        calciumHydroxide = new Material.Builder(counter, "calcium_hydroxide")
                .dust()
                .color(0xadadad).iconSet(DULL)
                .build()
                .setFormula("Ca(OH)2", true);
        counter++;

        lithiumHydroxide = new Material.Builder(counter, "lithium_hydroxide")
                .dust()
                .color(0x798582).iconSet(DULL)
                .build()
                .setFormula("LiOH", true);
        counter++;

        tungstenTrioxide = new Material.Builder(counter, "tungsten_trioxide")
                .dust()
                .color(0xf2ff00).iconSet(DULL)
                .build()
                .setFormula("WO3", true);
        counter++;

        // Molybdenum Chain
        molybdeniteConcentrate = new Material.Builder(counter, "molybdenite_concentrate")
                .fluid(FluidTypes.ACID)
                .color(0x504f80)
                .build()
                .setFormula("(MoO2SO4)(H2SO4)(H2O)", true);
        counter++;

        ammoniumMolybdate = new Material.Builder(counter, "ammonium_molybdate")
                .dust()
                .color(0x547475e).iconSet(DULL)
                .build()
                .setFormula("(NH4)2MoO4", true);
        counter++;

        goldDepletedMolybdenite = new Material.Builder(counter, "gold_depleted_molybdenite")
                .dust()
                .color(0x171d3b).iconSet(ROUGH)
                .build()
                .setFormula("(MoS2)", true);
        counter++;

        sodiumDicyanoaurate = new Material.Builder(counter, "sodium_dicyanoaurate")
                .dust()
                .color(0xd1d100).iconSet(DULL)
                .build()
                .setFormula("NaAu(CN)2", true);
        counter++;

        goldDepletedMolybdeniteConcentrate = new Material.Builder(counter, "gold_depleted_molybdenite_concentrate")
                .fluid(FluidTypes.ACID)
                .color(0x948db5)
                .build()
                .setFormula("(MoO2SO4)(HReO4)(H2SO4)(H2O)", true);
        counter++;

        organicMolybdenumSolution = new Material.Builder(counter, "organic_molybdenum_solution")
                .fluid()
                .color(0x363852)
                .build()
                .setFormula("(MoO2[DEHP]2)(OMIM-Tf2N)", true);
        counter++;

        organicPerrhenateSolution = new Material.Builder(counter, "organic_perrhenate_solution")
                .fluid()
                .color(0x363852)
                .build()
                .setFormula("([TOMA]ReO4)(OMIM-Tf2N)", true);
        counter++;

        ammoniumPerrhenate = new Material.Builder(counter, "ammonium_perrhenate")
                .dust()
                .color(0x5029ab).iconSet(DULL)
                .build()
                .setFormula("NH4ReO4", true);
        counter++;

        // Platline
        roastedCooperite = new Material.Builder(counter, "roasted_cooperite")
                .dust()
                .color(0x727357).iconSet(ROUGH)
                .build()
                .setFormula("Pt3PdNi", true);
        counter++;

        nickelDepletedCooperite = new Material.Builder(counter, "nickel_depleted_cooperite")
                .dust()
                .color(0x727357).iconSet(ROUGH)
                .build()
                .setFormula("Pt3Pd", true);
        counter++;

        cooperiteSolution = new Material.Builder(counter, "cooperite_solution")
                .fluid(FluidTypes.ACID)
                .color(0xa8c75f)
                .build()
                .setFormula("(H2PtCl6)(H2PdCl4)(H2O)", true);
        counter++;

        platinumDepletedCooperiteSolution = new Material.Builder(counter, "platinum_depleted_cooperite_solution")
                .fluid(FluidTypes.ACID)
                .color(0xb4d663)
                .build()
                .setFormula("(H2PdCl4)(H2O)", true);
        counter++;

        silverRichResidue = new Material.Builder(counter, "silver_rich_residue")
                .dust()
                .color(0x758182).iconSet(ROUGH)
                .build()
                .setFormula("AgCl?", true);
        counter++;

        leadAlloyedSilverRichResidue = new Material.Builder(counter, "lead_alloyed_silver_rich_residue")
                .ingot()
                .color(0x545596).iconSet(DULL)
                .build()
                .setFormula("PbAgCl?", true);
        counter++;

        leadSilverNitrates = new Material.Builder(counter, "lead_silver_nitrates")
                .dust()
                .color(0x7698a8).iconSet(ROUGH)
                .build()
                .setFormula("(Pb(NO3)2)(AgNO3)", true);
        counter++;

        leadSilverOxides = new Material.Builder(counter, "lead_silver_oxides")
                .dust()
                .color(0x404c52).iconSet(ROUGH)
                .build()
                .setFormula("(PbO)(Ag2O)", true);
        counter++;

        platinumGroupSludgeSolution = new Material.Builder(counter, "platinum_group_sludge_solution")
                .fluid(FluidTypes.ACID)
                .color(0x364f15)
                .build()
                .setFormula("(HAuCl4)(H2PtCl6)(H2PdCl4)(H2O)", true);
        counter++;

        goldDepletedPlatinumGroupSludgeSolution = new Material.Builder(counter, "gold_depleted_platinum_group_sludge_solution")
                .fluid(FluidTypes.ACID)
                .color(0x445e21)
                .build()
                .setFormula("(H2PtCl6)(H2PdCl4)(H2O)", true);
        counter++;

        goldPlatinumDepletedPlatinumGroupSludgeSolution = new Material.Builder(counter, "gold_platinum_depleted_platinum_group_sludge_solution")
                .fluid(FluidTypes.ACID)
                .color(0x486126)
                .build()
                .setFormula("(H2PdCl4)(H2O)", true);
        counter++;

        insolublePlatinumGroupResidue = new Material.Builder(counter, "insoluble_platinum_group_residue")
                .dust()
                .color(0x422115).iconSet(ROUGH)
                .build()
                .setFormula("(RhRuOsIr)", true);
        counter++;

        rhodiumDepletedInsolublePlatinumGroupResidue = new Material.Builder(counter, "rhodium_depleted_insoluble_platinum_group_residue")
                .dust()
                .color(0x422115).iconSet(ROUGH)
                .build()
                .setFormula("(RuOsIr)", true);
        counter++;

        rhodiumRutheniumOsmiumDepletedInsolublePlatinumGroupResidue = new Material.Builder(counter, "rhodium_ruthenium_osmium_depleted_insoluble_platinum_group_residue")
                .dust()
                .color(0x422115).iconSet(ROUGH)
                .build()
                .setFormula("(Ir)", true);
        counter++;

        ammoniumHexachloroplatinate = new Material.Builder(counter, "ammonium_hexachloroplatinate")
                .dust()
                .color(0xc72c4b).iconSet(DULL)
                .build()
                .setFormula("(NH4)2PtCl6", true);
        counter++;

        ammoniumHexachloropalladate = new Material.Builder(counter, "ammonium_hexachloropalladate")
                .dust()
                .color(0x873243).iconSet(DULL)
                .build()
                .setFormula("(NH4)2PdCl6", true);
        counter++;

        tetraamminePalladiumChloride = new Material.Builder(counter, "tetraammine_palladium_chloride")
                .dust()
                .color(0xfc5cff).iconSet(DULL)
                .build()
                .setFormula("Pd(NH3)4Cl2", true);
        counter++;

        crudeRhodium = new Material.Builder(counter, "crude_rhodium")
                .dust()
                .color(Rhodium.getMaterialRGB()).iconSet(ROUGH)
                .build()
                .setFormula("(Rh)", true);
        counter++;

        sodiumHexachlororhodate = new Material.Builder(counter, "sodium_hexachlororhodate")
                .dust()
                .color(0x6e1f1f).iconSet(DULL)
                .build()
                .setFormula("Na3RhCl6", true);
        counter++;

        sodiumRuthenatePerosmateSolution = new Material.Builder(counter, "sodium_ruthenate_perosmate_solution")
                .fluid()
                .color(0x6d7058)
                .build()
                .setFormula("(Na2RuO4)(Na2OsO4(OH)2)(NaOH)(H2O)", true);
        counter++;

        rutheniumOsmiumTetroxidesSolution = new Material.Builder(counter, "ruthenium_osmium_tetroxides_solution")
                .fluid()
                .color(0x8a8f68)
                .build()
                .setFormula("(RuO4)(OsO4)(NaOH)(NaCl)(H2O)", true);
        counter++;

        chlororuthenicAcid = new Material.Builder(counter, "chlororuthenic_acid")
                .fluid(FluidTypes.ACID)
                .color(0xb8656d)
                .build()
                .setFormula("(H2RuCl6)(H2O)", true);
        counter++;

        ammoniumHexachlororuthenate = new Material.Builder(counter, "ammonium_hexachlororuthenate")
                .dust()
                .color(0xdb0016).iconSet(DULL)
                .build()
                .setFormula("(NH4)2RuCl6", true);
        counter++;

        impureOsmiumTetroxide = new Material.Builder(counter, "impure_osmium_tetroxide")
                .dust()
                .color(0xd8d9b4).iconSet(ROUGH)
                .build()
                .setFormula("(OsO4)(NaCl)", true);
        counter++;

        sodiumOsmate = new Material.Builder(counter, "sodium_osmate")
                .dust()
                .color(0x822b61).iconSet(DULL)
                .build()
                .setFormula("Na2OsO2(OH)4", true);
        counter++;

        tetraammineOsmylChloride = new Material.Builder(counter, "tetraammine_osmyl_chloride")
                .dust()
                .color(0xa62876).iconSet(DULL)
                .build()
                .setFormula("OsO2(NH3)4Cl2", true);
        counter++;

        chloroiridicAcid = new Material.Builder(counter, "chloroiridic_acid")
                .fluid(FluidTypes.ACID)
                .color(0x853b36)
                .build()
                .setFormula("(H2IrCl6)(H2O)", true);
        counter++;

        ammoniumHexachloroiridate = new Material.Builder(counter, "ammonium_hexachloroiridate")
                .dust()
                .color(0xba1a0f).iconSet(DULL)
                .build()
                .setFormula("(NH4)2IrCl6", true);
        counter++;

        ferrousChloride = new Material.Builder(counter, "ferrous_chloride")
                .dust()
                .color(0x758182).iconSet(ROUGH)
                .build()
                .setFormula("FeCl2", true);
        counter++;

        sodiumOxide = new Material.Builder(counter, "sodium_oxide")
                .dust()
                .color(0x4f5f78).iconSet(ROUGH)
                .build()
                .setFormula("Na2O", true);
        counter++;

        sodiumPeroxide = new Material.Builder(counter, "sodium_peroxide")
                .dust()
                .color(0x000a63).iconSet(SHINY)
                .build()
                .setFormula("Na2O2", true);
        counter++;

        sodiumAcetate = new Material.Builder(counter, "sodium_acetate")
                .dust()
                .color(0x828282).iconSet(ROUGH)
                .build()
                .setFormula("C2H4O2Na", true);
        counter++;

        rhodiumChloride = new Material.Builder(counter, "rhodium_chloride")
                .dust()
                .color(0x260d2e).iconSet(DULL)
                .build()
                .setFormula("RhCl3", true);
        counter++;

        rhodiumPhosphate = new Material.Builder(counter, "rhodium_phosphate")
                .dust()
                .color(0x3b1a45).iconSet(DULL)
                .build()
                .setFormula("RhPO4", true);
        counter++;

        // Barium Strontium Chain
        celestine = new Material.Builder(counter, "celestine")
                .dust().ore()
                .addOreByproducts(Calcite, Galena, Barite)
                .color(0xc3dbd3).iconSet(SHINY)
                .build()
                .setFormula("SrSO4", true);
        counter++;

        strontiumSulfide = new Material.Builder(counter, "strontium_sulfide")
                .dust()
                .color(0xd9b257).iconSet(ROUGH)
                .build()
                .setFormula("SrS", true);
        counter++;

        witherite = new Material.Builder(counter, "witherite")
                .dust().ore()
                .addOreByproducts(Barite, Galena, fluorite)
                .color(0xdbc881).iconSet(ROUGH)
                .build()
                .setFormula("BaCO3", true);
        counter++;

        strontianite = new Material.Builder(counter, "strontianite")
                .dust().ore()
                .addOreByproducts(celestine, Galena, fluorite)
                .color(0x734038).iconSet(ROUGH)
                .build()
                .setFormula("SrCO3", true);
        counter++;

        bariumOxide = new Material.Builder(counter, "barium_oxide")
                .dust()
                .color(0xabaaa6).iconSet(ROUGH)
                .build()
                .setFormula("BaO", true);
        counter++;

        strontiumOxide = new Material.Builder(counter, "strontium_oxide")
                .dust()
                .color(0xc4911a).iconSet(ROUGH)
                .build()
                .setFormula("SrO", true);
        counter++;

        bariumPeroxide = new Material.Builder(counter, "barium_peroxide")
                .dust()
                .color(0xccc3a1).iconSet(ROUGH)
                .build()
                .setFormula("BaO2", true);
        counter++;

        // Nickel Chain
        crudeNickel = new Material.Builder(counter, "crude_nickel")
                .dust()
                .color(0x86c4a0).iconSet(ROUGH)
                .build()
                .setFormula("(Ni)", true);
        counter++;

        nickelCarbonyl = new Material.Builder(counter, "nickel_carbonyl")
                .fluid()
                .color(0x79ad8d)
                .build()
                .setFormula("Ni(CO)4", true);
        counter++;

        cobaltCarbonyl = new Material.Builder(counter, "cobalt_carbonyl")
                .dust()
                .color(0x2a4761).iconSet(ROUGH)
                .build()
                .setFormula("Co2(CO)8", true);
        counter++;

        // Phosphorus Chain
        calciumMetasilicate = new Material.Builder(counter, "calcium_metasilicate")
                .dust()
                .color(0xcaccc2).iconSet(ROUGH)
                .build()
                .setFormula("CaSiO3", true);
        counter++;

        monoammoniumPhosphate = new Material.Builder(counter, "monoammonium_phosphate")
                .dust()
                .color(0x93a353).iconSet(DULL)
                .build()
                .setFormula("NH4H2PO4", true);
        counter++;

        diammoniumPhosphate = new Material.Builder(counter, "diammonium_phosphate")
                .dust()
                .color(0x606b31).iconSet(DULL)
                .build()
                .setFormula("(NH4)2HPO4", true);
        counter++;

        urea = new Material.Builder(counter, "urea")
                .dust()
                .color(0x31591c).iconSet(ROUGH)
                .build()
                .setFormula("CH4NO", true);
        counter++;

        phosphorusTrichloride = new Material.Builder(counter, "phosphorus_trichloride")
                .fluid()
                .color(0xdfe38a)
                .build()
                .setFormula("PCl3", true);
        counter++;

        // Bromine Chain
        hydrobromicAcid = new Material.Builder(counter, "hydrobromic_acid")
                .fluid(FluidTypes.ACID)
                .color(0x702e3c)
                .build()
                .setFormula("HBr", true);
        counter++;

        // Zirconium Hafnium Chain
        zircon = new Material.Builder(counter, "zircon")
                .dust()
                .color(0xed4b00).iconSet(ROUGH)
                .build()
                .setFormula("ZrSiO4", true);
        counter++;

        zircaloy = new Material.Builder(counter, "zircaloy")
                .ingot().fluid()
                .color(0xc99c99).iconSet(METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_SPRING_SMALL, GENERATE_FRAME, GENERATE_ROUND)
                .components(Zirconium, 7, Tin, 1)
                .blastTemp(3600, GasTier.HIGH, 1920)
                .build();
        counter++;

        // Mineral Sand Chain
        mineralSand = new Material.Builder(counter, "mineral_sand")
                .dust()
                .color(0x3b3b3b).iconSet(ROUGH)
                .build()
                .setFormula("(Fe3O4)(FeTiO3)(Al2Fe2Si3O12)(Ca3Fe2Si3O12)(Ca3Al2Si3O12)(Al2Mg3Si3O12)(Al2Mn3Si3O12)(Ca3Cr2Si3O12)((RETh)PO4)(TiO2)(ZrSiO4)", true);
        counter++;

        ironDepletedMineralSand = new Material.Builder(counter, "iron_depleted_mineral_sand")
                .dust()
                .color(0x212121).iconSet(ROUGH)
                .build()
                .setFormula("(Al2Fe2Si3O12)(Ca3Fe2Si3O12)(Ca3Al2Si3O12)(Al2Mg3Si3O12)(Al2Mn3Si3O12)(Ca3Cr2Si3O12)((RETh)PO4)(TiO2)(ZrSiO4)", true);
        counter++;

        ironGarnetDepletedMineralSand = new Material.Builder(counter, "iron_garnet_depleted_mineral_sand")
                .dust()
                .color(0x171717).iconSet(ROUGH)
                .build()
                .setFormula("((RETh)PO4)(TiO2)(ZrSiO4)", true);
        counter++;

        ironGarnetMonaziteDepletedMineralSand = new Material.Builder(counter, "iron_garnet_monazite_depleted_mineral_sand")
                .dust()
                .color(0x101010).iconSet(ROUGH)
                .build()
                .setFormula("(TiO2)(ZrSiO4)", true);
        counter++;

        // Magnesium Chain
        magnesiumHydroxide = new Material.Builder(counter, "magnesium_hydroxide")
                .dust()
                .color(0xc8c5d6).iconSet(DULL)
                .build()
                .setFormula("Mg(OH)2", true);
        counter++;

        // Beryllium Chain
        beryl = new Material.Builder(counter, "beryl")
                .gem().ore()
                .fluid()
                .color(0x93ab90).iconSet(EMERALD)
                .addOreByproducts(Emerald, Cassiterite, Scheelite)
                .build()
                .setFormula("Be3Ai2Si6O18", true);
        counter++;

        berylliumSulfate = new Material.Builder(counter, "beryllium_sulfate")
                .dust()
                .color(0x99cf93).iconSet(DULL)
                .build()
                .setFormula("BeSO4", true);
        counter++;

        aluminiumSulfate = new Material.Builder(counter, "aluminium_sulfate")
                .dust()
                .color(0x87abaa).iconSet(ROUGH)
                .build()
                .setFormula("Al2(SO4)3", true);
        counter++;

        chromiumSulfate = new Material.Builder(counter, "chromium_sulfate")
                .dust()
                .color(0x544663).iconSet(ROUGH)
                .build()
                .setFormula("Cr2(SO4)3", true);
        counter++;

        berylliumHydroxide = new Material.Builder(counter, "beryllium_hydroxide")
                .dust()
                .color(0x49524a).iconSet(DULL)
                .build()
                .setFormula("Be(OH)2", true);
        counter++;

        ammoniumSulfate = new Material.Builder(counter, "ammonium_sulfate")
                .dust().fluid()
                .color(0xededed).iconSet(FINE)
                .build()
                .setFormula("(NH4)2SO4", true);
        counter++;

        ammoniumTetrafluoroberyllate = new Material.Builder(counter, "ammonium_tetrafluoroberyllate")
                .dust()
                .color(0x55ab5f).iconSet(DULL)
                .build()
                .setFormula("(NH4)2BeF4", true);
        counter++;

        berylliumFluoride = new Material.Builder(counter, "beryllium_fluoride")
                .dust()
                .color(0x49524a).iconSet(DULL)
                .build()
                .setFormula("BeF2", true);
        counter++;

        magnesiumFluoride = new Material.Builder(counter, "magnesium_fluoride")
                .dust().fluid()
                .color(0x605a63).iconSet(FINE)
                .build()
                .setFormula("MgF2", true);
        counter++;

        // Sphalerite Chain
        sphaleriteConcentrate = new Material.Builder(counter, "sphalerite_concentrate")
                .fluid(FluidTypes.ACID)
                .color(0xd9c6b0)
                .build()
                .setFormula("(ZnSO4)(Ga2O3)(GeO2)(In2O3)(H2SO4)(H2O)", true);
        counter++;

        sphaleriteResidue = new Material.Builder(counter, "sphalerite_residue")
                .dust()
                .color(0xab79ba).iconSet(ROUGH)
                .build()
                .setFormula("(PbSO4)(Ag2O)", true);
        counter++;

        galliumTrichloride = new Material.Builder(counter, "gallium_trichloride")
                .dust()
                .color(0x2fa352).iconSet(ROUGH)
                .build()
                .setFormula("GaCl3", true);
        counter++;

        germaniumTetrachloride = new Material.Builder(counter, "germanium_tetrachloride")
                .dust()
                .color(0x798a86).iconSet(ROUGH)
                .build()
                .setFormula("GeCl4", true);
        counter++;

        indiumTrichloride = new Material.Builder(counter, "indium_trichloride")
                .dust()
                .color(0x78d6a7).iconSet(ROUGH)
                .build()
                .setFormula("InCl3", true);
        counter++;

        germaniumDioxide = new Material.Builder(counter, "germanium_dioxide")
                .dust()
                .color(0xb5b5b5).iconSet(SHINY)
                .build()
                .setFormula("GeO2", true);
        counter++;

        lithiumPotassiumChloride = new Material.Builder(counter, "lithium_potassium_chloride")
                .fluid()
                .color(0xcf6348).iconSet(DULL)
                .build()
                .setFormula("(LiCl)(KCl)", true);
        counter++;

        // Boron Chain
        boronTrioxide = new Material.Builder(counter, "boron_trioxide")
                .dust()
                .color(0x709e71).iconSet(DULL)
                .build()
                .setFormula("B2O3", true);
        counter++;

        boronTrifluoride = new Material.Builder(counter, "boron_trifluoride")
                .fluid(FluidTypes.GAS)
                .color(0x72d474)
                .build()
                .setFormula("BF3", true);
        counter++;

        lithiumHydride = new Material.Builder(counter, "lithium_hydride")
                .dust()
                .color(0x5b8cb5).iconSet(ROUGH)
                .build()
                .setFormula("LiH", true);
        counter++;

        lithiumTetrafluoroborate = new Material.Builder(counter, "lithium_tetrafluoroborate")
                .dust()
                .color(0x1d77c2).iconSet(ROUGH)
                .build()
                .setFormula("LiBF4", true);
        counter++;

        diborane = new Material.Builder(counter, "diborane")
                .fluid(FluidTypes.GAS)
                .color(0xb099a4)
                .build()
                .setFormula("B2H6", true);
        counter++;

        semiconductorGradeBoron = new Material.Builder(counter, "semiconductor_grade_boron")
                .ingot()
                .color(Boron.getMaterialRGB()).iconSet(BRIGHT)
                .build()
                .setFormula("B", true);
        counter++;

        // REE Chain
        sodiumFluoride = new Material.Builder(counter, "sodium_fluoride")
                .dust().fluid()
                .color(0x993b2b).iconSet(ROUGH)
                .build()
                .setFormula("NaF", true);
        counter++;

        rareEarthThoriumHydroxides = new Material.Builder(counter, "rare_earth_thorium_hydroxides")
                .dust()
                .color(0x406337).iconSet(SAND)
                .build()
                .setFormula("RETh(OH)7", true);
       counter++;

        rareEarthThoriumNitratesSolution = new Material.Builder(counter, "rare_earth_thorium_nitrates_solution")
                .fluid()
                .color(0x469133)
                .build()
                .setFormula("RETh(NO3)7", true);
       counter++;

        aqueousRareEarthsSolution = new Material.Builder(counter, "aqueous_rare_earths_solution")
                .fluid()
                .color(0x6642b3)
                .build()
                .setFormula("(RE(NO3)3)(HNO3)", true);
       counter++;

        organicMediumHeavyRareEarthsSolution = new Material.Builder(counter, "organic_medium_heavy_rare_earths_solution")
                .fluid()
                .color(0xb316c4)
                .build()
                .setFormula("(RE[DEHP]3)(C12H26)", true);
       counter++;

        aqueousLightRareEarthsSolution = new Material.Builder(counter, "aqueous_light_rare_earths_solution")
                .fluid()
                .color(0x392b54)
                .build()
                .setFormula("(RE[DEHP]3)(HNO3)", true);
       counter++;

        organicHeavyRareEarthsSolution = new Material.Builder(counter, "organic_heavy_rare_earths_solution")
                .fluid()
                .color(0xc41687)
                .build()
                .setFormula("(RE[DEHP]3)([C25H54N](NO3))([C31H66N]NO3)(C12H26)", true);
       counter++;

        aqueousMediumRareEarthsSolution = new Material.Builder(counter, "aqueous_medium_rare_earths_solution")
                .fluid()
                .color(0x2b2f54)
                .build()
                .setFormula("(RE[DEHP]3)(HNO3)", true);
       counter++;

        aqueousHeavyRareEarthsSolution = new Material.Builder(counter, "aqueous_heavy_rare_earths_solution")
                .fluid()
                .color(0x2b2c3b)
                .build()
                .setFormula("(RE[DEHP]3)(HNO3)", true);
        counter++;

        lanthanumNitrate = new Material.Builder(counter, "lanthanum_nitrate")
                .dust()
                .color(0x25c2c2).iconSet(ROUGH)
                .build()
                .setFormula("La(NO3)3", true);
       counter++;

        ceriumNitrate = new Material.Builder(counter, "cerium_nitrate")
                .dust()
                .color(0x73c223).iconSet(ROUGH)
                .build()
                .setFormula("Ce(NO3)3", true);
       counter++;

        praseodymiumNitrate = new Material.Builder(counter, "praseodymium_nitrate")
                .dust()
                .color(0x262626).iconSet(ROUGH)
                .build()
                .setFormula("Pr(NO3)3", true);
       counter++;

        neodymiumNitrate = new Material.Builder(counter, "neodymium_nitrate")
                .dust()
                .color(0xd4b75f).iconSet(ROUGH)
                .build()
                .setFormula("Nd(NO3)3", true);
       counter++;

        samariumNitrate = new Material.Builder(counter, "samarium_nitrate")
                .dust()
                .color(0xbfbf21).iconSet(ROUGH)
                .build()
                .setFormula("Sm(NO3)3", true);
       counter++;

        europiumNitrate = new Material.Builder(counter, "europium_nitrate")
                .dust()
                .color(0x385454).iconSet(ROUGH)
                .build()
                .setFormula("Eu(NO3)3", true);
       counter++;

        gadoliniumNitrate = new Material.Builder(counter, "gadolinium_nitrate")
                .dust()
                .color(0x242440).iconSet(ROUGH)
                .build()
                .setFormula("Gd(NO3)3", true);
       counter++;

        terbiumNitrate = new Material.Builder(counter, "terbium_nitrate")
                .dust()
                .color(0x412b52).iconSet(ROUGH)
                .build()
                .setFormula("Tb(NO3)3", true);
       counter++;

        dysprosiumNitrate = new Material.Builder(counter, "dysprosium_nitrate")
                .dust()
                .color(0x4a4248).iconSet(ROUGH)
                .build()
                .setFormula("Dy(NO3)3", true);
       counter++;

        holmiumNitrate = new Material.Builder(counter, "holmium_nitrate")
                .dust()
                .color(0x838ac7).iconSet(ROUGH)
                .build()
                .setFormula("Ho(NO3)3", true);
       counter++;

        erbiumNitrate = new Material.Builder(counter, "erbium_nitrate")
                .dust()
                .color(0x3c524c).iconSet(ROUGH)
                .build()
                .setFormula("Er(NO3)3", true);
       counter++;

        thuliumNitrate = new Material.Builder(counter, "thulium_nitrate")
                .dust()
                .color(0x45f545).iconSet(ROUGH)
                .build()
                .setFormula("Tm(NO3)3", true);
       counter++;

        ytterbiumNitrate = new Material.Builder(counter, "ytterbium_nitrate")
                .dust()
                .color(0xdb4f4f).iconSet(ROUGH)
                .build()
                .setFormula("Yb(NO3)3", true);
       counter++;

        lutetiumNitrate = new Material.Builder(counter, "lutetium_nitrate")
                .dust()
                .color(0xbfd5e0).iconSet(ROUGH)
                .build()
                .setFormula("Lu(NO3)3", true);
       counter++;

        yttriumNitrate = new Material.Builder(counter, "yttrium_nitrate")
                .dust()
                .color(0xf0482b).iconSet(ROUGH)
                .build()
                .setFormula("Y(NO3)3", true);
       counter++;

        lanthana = new Material.Builder(counter, "lanthana")
                .dust()
                .color(0x4eb5b5).iconSet(ROUGH)
                .build()
                .setFormula("La2O3", true);
       counter++;

        ceria = new Material.Builder(counter, "ceria")
                .dust()
                .color(0x6c9641).iconSet(ROUGH)
                .build()
                .setFormula("Ce2O3", true);
       counter++;

        praseodymia = new Material.Builder(counter, "praseodymia")
                .dust()
                .color(0x575757).iconSet(ROUGH)
                .build()
                .setFormula("Pr2O3", true);
       counter++;

        neodymia = new Material.Builder(counter, "neodymia")
                .dust()
                .color(0x877a52).iconSet(ROUGH)
                .build()
                .setFormula("Nd2O3", true);
       counter++;

        samaria = new Material.Builder(counter, "samaria")
                .dust()
                .color(0xc9c951).iconSet(ROUGH)
                .build()
                .setFormula("Sm2O3", true);
       counter++;

        europia = new Material.Builder(counter, "europia")
                .dust()
                .color(0x538c8c).iconSet(ROUGH)
                .build()
                .setFormula("Eu2O3", true);
       counter++;

        gadolinia = new Material.Builder(counter, "gadolinia")
                .dust()
                .color(0x5f5f87).iconSet(ROUGH)
                .build()
                .setFormula("Gd2O3", true);
       counter++;

        terbia = new Material.Builder(counter, "terbia")
                .dust()
                .color(0x593178).iconSet(ROUGH)
                .build()
                .setFormula("Tb2O3", true);
       counter++;

        dysprosia = new Material.Builder(counter, "dysprosia")
                .dust()
                .color(0x6b5266).iconSet(ROUGH)
                .build()
                .setFormula("Dy2O3", true);
       counter++;

        holmia = new Material.Builder(counter, "holmia")
                .dust()
                .color(0x616ac2).iconSet(ROUGH)
                .build()
                .setFormula("Ho2O3", true);
       counter++;

        erbia = new Material.Builder(counter, "erbia")
                .dust()
                .color(0x508577).iconSet(ROUGH)
                .build()
                .setFormula("Er2O3", true);
       counter++;

        thulia = new Material.Builder(counter, "thulia")
                .dust()
                .color(0x67f067).iconSet(ROUGH)
                .build()
                .setFormula("Tm2O3", true);
       counter++;

        ytterbia = new Material.Builder(counter, "ytterbia")
                .dust()
                .color(0xbf6969).iconSet(ROUGH)
                .build()
                .setFormula("Yb2O3", true);
       counter++;

        lutetia = new Material.Builder(counter, "lutetia")
                .dust()
                .color(0x9ac4d9).iconSet(ROUGH)
                .build()
                .setFormula("Lu2O3", true);
       counter++;

        yttria = new Material.Builder(counter, "yttria")
                .dust()
                .color(0xed654e).iconSet(ROUGH)
                .build()
                .setFormula("Y2O3", true);
       counter++;

        lanthanumFluoride = new Material.Builder(counter, "lanthanum_fluoride")
                .dust()
                .color(0x5f9999).iconSet(ROUGH)
                .build()
                .setFormula("LaF3", true);
       counter++;

        ceriumFluoride = new Material.Builder(counter, "cerium_fluoride")
                .dust()
                .color(0x60754b).iconSet(ROUGH)
                .build()
                .setFormula("CeF3", true);
       counter++;

        praseodymiumFluoride = new Material.Builder(counter, "praseodymium_fluoride")
                .dust()
                .color(0x8c8c8c).iconSet(ROUGH)
                .build()
                .setFormula("PrF3", true);
       counter++;

        neodymiumFluoride = new Material.Builder(counter, "neodymium_fluoride")
                .dust()
                .color(0x6b6552).iconSet(ROUGH)
                .build()
                .setFormula("NdF3", true);
       counter++;

        samariumFluoride = new Material.Builder(counter, "samarium_fluoride")
                .dust()
                .color(0xcfcf82).iconSet(ROUGH)
                .build()
                .setFormula("SmF3", true);
       counter++;

        europiumFluoride = new Material.Builder(counter, "europium_fluoride")
                .dust()
                .color(0x61c2c2).iconSet(ROUGH)
                .build()
                .setFormula("EuF3", true);
       counter++;

        gadoliniumFluoride = new Material.Builder(counter, "gadolinium_fluoride")
                .dust()
                .color(0x9c9cba).iconSet(ROUGH)
                .build()
                .setFormula("GdF3", true);
       counter++;

        terbiumFluoride = new Material.Builder(counter, "terbium_fluoride")
                .dust()
                .color(0x8550ad).iconSet(ROUGH)
                .build()
                .setFormula("TbF3", true);
       counter++;

        dysprosiumFluoride = new Material.Builder(counter, "dysprosium_fluoride")
                .dust()
                .color(0xab6f9f).iconSet(ROUGH)
                .build()
                .setFormula("DyF3", true);
       counter++;

        holmiumFluoride = new Material.Builder(counter, "holmium_fluoride")
                .dust()
                .color(0x3540ab).iconSet(ROUGH)
                .build()
                .setFormula("HoF3", true);
       counter++;

        erbiumFluoride = new Material.Builder(counter, "erbium_fluoride")
                .dust()
                .color(0x50a38e).iconSet(ROUGH)
                .build()
                .setFormula("ErF3", true);
       counter++;

        thuliumFluoride = new Material.Builder(counter, "thulium_fluoride")
                .dust()
                .color(0x7ed97e).iconSet(ROUGH)
                .build()
                .setFormula("TmF3", true);
       counter++;

        ytterbiumFluoride = new Material.Builder(counter, "ytterbium_fluoride")
                .dust()
                .color(0xcc9f9f).iconSet(ROUGH)
                .build()
                .setFormula("YbF3", true);
       counter++;

        lutetiumFluoride = new Material.Builder(counter, "lutetium_fluoride")
                .dust()
                .color(0x6ab7de).iconSet(ROUGH)
                .build()
                .setFormula("LuF3", true);
       counter++;

        yttriumFluoride = new Material.Builder(counter, "yttrium_fluoride")
                .dust()
                .color(0xcc7566).iconSet(ROUGH)
                .build()
                .setFormula("YF3", true);
       counter++;

        
    }
}
