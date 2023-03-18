package gregtech.api.unification.material.materials;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPIOrganicMaterials {
    /**
     * ID RANGE: 31000-31999 (incl.)
     */
    public static void register() {
        int counter = 31000;
        // Petroleum Refining Chain
        tripropylene = new Material.Builder(counter, "tripropylene")
                .fluid()
                .color(0x409970)
                .build()
                .setFormula("C9H18", true);
        counter++;

        nonylphenol = new Material.Builder(counter, "nonylphenol")
                .fluid()
                .color(0x8b9136)
                .build()
                .setFormula("C15H24O", true);
        counter++;

        nonylphenolFormaldehydeResin = new Material.Builder(counter, "nonylphenol_formaldehyde_resin")
                .polymer()
                .color(0x593c06).iconSet(DULL)
                .flags(FLAMMABLE, GENERATE_PLATE)
                .build()
                .setFormula("(C15H24O)(CH2O)", true);
        counter++;

        ethoxylatedNonylphenolFormaldehydeResin = new Material.Builder(counter, "ethoxylated_nonylphenol_formaldehyde_resin")
                .dust()
                .color(0xd43b52).iconSet(DULL)
                .build()
                .setFormula("(C15H24O)(CH2O)(C2H4O)", true);
        counter++;

        deacidifiedOil = new Material.Builder(counter, "deacidified_oil")
                .fluid()
                .color(Oil.getMaterialRGB())
                .build();
        counter++;

        deacidifiedHeavyOil = new Material.Builder(counter, "deacidified_heavy_oil")
                .fluid()
                .color(OilHeavy.getMaterialRGB())
                .build();
        counter++;

        deacidifiedRawOil = new Material.Builder(counter, "deacidified_raw_oil")
                .fluid()
                .color(RawOil.getMaterialRGB())
                .build();
        counter++;

        deacidifiedLightOil = new Material.Builder(counter, "deacidified_light_oil")
                .fluid()
                .color(OilLight.getMaterialRGB())
                .build();
        counter++;

        deacidifiedDesaltedOil = new Material.Builder(counter, "deacidified_desalted_oil")
                .fluid()
                .color(Oil.getMaterialRGB())
                .build();
        counter++;

        deacidifiedDesaltedHeavyOil = new Material.Builder(counter, "deacidified_desalted_heavy_oil")
                .fluid()
                .color(OilHeavy.getMaterialRGB())
                .build();
        counter++;

        deacidifiedDesaltedRawOil = new Material.Builder(counter, "deacidified_desalted_raw_oil")
                .fluid()
                .color(RawOil.getMaterialRGB())
                .build();
        counter++;

        deacidifiedDesaltedLightOil = new Material.Builder(counter, "deacidified_desalted_light_oil")
                .fluid()
                .color(OilLight.getMaterialRGB())
                .build();
        counter++;

        naphthenateRichPetroleumWastewater = new Material.Builder(counter, "naphthenate_rich_petroleum_wastewater")
                .fluid()
                .color(0x95dce8)
                .build()
                .setFormula("(Na2SO4)(MgCl2)(CaCl2)(H2O)?", true);
        counter++;

        naphthenicAcid = new Material.Builder(counter, "naphthenic_acid")
                .fluid()
                .color(0xe0e0e0)
                .build();
        counter++;

        petroleumWastewater = new Material.Builder(counter, "petroleum_wastewater")
                .fluid()
                .color(0x95dce8)
                .build()
                .setFormula("(Na2SO4)(MgCl2)(CaCl2)(H2O)", true);
        counter++;

        magnesiumDepletedpetroleumWastewater = new Material.Builder(counter, "magnesium_depleted_petroleum_wastewater")
                .fluid()
                .color(0x95dce8)
                .build()
                .setFormula("(Na2SO4)(NaCl)(CaCl2)(H2O)", true);
        counter++;

        magnesiumCalciumDepletedpetroleumWastewater = new Material.Builder(counter, "magnesium_calcium_depleted_petroleum_wastewater")
                .fluid()
                .color(0x95dce8)
                .build()
                .setFormula("(Na2SO4)(NaCl)(H2O)", true);
        counter++;

        atmosphericResidue = new Material.Builder(counter, "atmospheric_residue")
                .fluid()
                .color(0x383838).iconSet(DULL)
                .build();
        counter++;

        olefinRichRefineryGas = new Material.Builder(counter, "olefin_rich_refinery_gas")
                .fluid(FluidTypes.GAS)
                .color(0xdedede)
                .build();
        counter++;

        ultraLowSulfurHeavyFuel = new Material.Builder(counter, "ultra_low_sulfur_heavy_fuel")
                .fluid()
                .color(0xedda2f)
                .build();
        counter++;

        ultraLowSulfurLightFuel = new Material.Builder(counter, "ultra_low_sulfur_light_fuel")
                .fluid()
                .color(0xedda2f)
                .build();
        counter++;

        ultraLowSulfurNaphtha = new Material.Builder(counter, "ultra_low_sulfur_naphtha")
                .fluid()
                .color(0xedda2f)
                .build();
        counter++;

        nonane = new Material.Builder(counter, "nonane")
                .fluid()
                .color(0x4d6e41)
                .build()
                .setFormula("C9H20", true);
        counter++;

        undecane = new Material.Builder(counter, "undecane")
                .fluid()
                .color(0x36544b)
                .build()
                .setFormula("C11H24", true);
        counter++;

        tridecane = new Material.Builder(counter, "tridecane")
                .fluid()
                .color(0x30494a)
                .build()
                .setFormula("C13H28", true);
        counter++;

        tetradecane = new Material.Builder(counter, "tetradecane")
                .fluid()
                .color(0x3c515c)
                .build()
                .setFormula("C14H30", true);
        counter++;

        pentadecane = new Material.Builder(counter, "pentadecane")
                .fluid()
                .color(0x47536e)
                .build()
                .setFormula("C15H32", true);
        counter++;

        hexadecane = new Material.Builder(counter, "hexadecane")
                .fluid()
                .color(0x42415c)
                .build()
                .setFormula("C16H34", true);
        counter++;

        naphthaReformate = new Material.Builder(counter, "naphtha_reformate")
                .fluid()
                .color(0xedda2f).iconSet(DULL)
                .build();
        counter++;

        ultraLowSulfurNaphthaReformate = new Material.Builder(counter, "ultra_low_sulfur_naphtha_reformate")
                .fluid()
                .color(0xedda2f).iconSet(DULL)
                .build();
        counter++;

        btxMixture = new Material.Builder(counter, "btx_mixture")
                .fluid()
                .color(0x210e0a).iconSet(DULL)
                .build()
                .setFormula("(C6H6)(C7H8)(C8H10)(C5H4O2)", true);
        counter++;

        xylene = new Material.Builder(counter, "xylene")
                .fluid()
                .color(0x8a8a8a)
                .build()
                .setFormula("C8H10", true);
        counter++;

        aromaticsDepletedNaphthaReformate = new Material.Builder(counter, "aromatics_depleted_naphtha_reformate")
                .fluid()
                .color(0xffe369)
                .build();
        counter++;

        aromaticsDepletedUltraLowSulfurNaphthaReformate = new Material.Builder(counter, "aromatics_depleted_ultra_low_sulfur_naphtha_reformate")
                .fluid()
                .color(0xffe369)
                .build();
        counter++;

        octaneBoostedLightFuel = new Material.Builder(counter, "octane_boosted_light_fuel")
                .fluid()
                .color(0xed9f18)
                .build();
        counter++;

        octaneBoostedNaphtha = new Material.Builder(counter, "octane_boosted_naphtha")
                .fluid()
                .color(0xed9f18)
                .build();
        counter++;

        ultraLowSulfurOctaneBoostedLightFuel = new Material.Builder(counter, "ultra_low_sulfur_octane_boosted_light_fuel")
                .fluid()
                .color(0xed9f18)
                .build();
        counter++;

        ultraLowSulfurOctaneBoostedNaphtha = new Material.Builder(counter, "ultra_low_sulfur_octane_boosted_naphtha")
                .fluid()
                .color(0xed9f18)
                .build();
        counter++;

        ultraLowSulfurDiesel = new Material.Builder(counter, "ultra_low_sulfur_diesel")
                .fluid()
                .color(0xc4c400)
                .build();
        counter++;

        ultraLowSulfurCetaneBoostedDiesel = new Material.Builder(counter, "ultra_low_sulfur_cetane_boosted_diesel")
                .fluid()
                .color(CetaneBoostedDiesel.getMaterialRGB())
                .build();
        counter++;

        ultraLowSulfurGasoline = new Material.Builder(counter, "ultra_low_sulfur_gasoline")
                .fluid()
                .color(Gasoline.getMaterialRGB())
                .build();
        counter++;

        ultraLowSulfurHighOctaneGasoline = new Material.Builder(counter, "ultra_low_sulfur_high_octane_gasoline")
                .fluid()
                .color(HighOctaneGasoline.getMaterialRGB())
                .build();
        counter++;

        dimethylEther = new Material.Builder(counter, "dimethyl_ether")
                .fluid(FluidTypes.GAS)
                .color(0xe3b86d)
                .build()
                .setFormula("C2H6O", true);
        counter++;

        nitroform = new Material.Builder(counter, "nitroform")
                .fluid()
                .color(0x27a88a)
                .build()
                .setFormula("CHN3O6", true);
        counter++;

        nitratedAlkanes = new Material.Builder(counter, "nitrated_alkanes")
                .fluid(FluidTypes.GAS)
                .color(0x27a88a)
                .build()
                .setFormula("(CH3NO2)(C2H5NO2)(C3H7NO2)(C3H7NO2)(H2O)", true);
        counter++;

        nitromethane = new Material.Builder(counter, "nitromethane")
                .fluid()
                .color(0x27a88a)
                .build()
                .setFormula("CH3NO2", true);
        counter++;

        nitroethane = new Material.Builder(counter, "nitroethane")
                .fluid()
                .color(0x27a88a)
                .build()
                .setFormula("C2H5NO2", true);
        counter++;

        nitropropane1 = new Material.Builder(counter, "nitropropane_1")
                .fluid()
                .color(0x27a88a)
                .build()
                .setFormula("C3H7NO2", true);
        counter++;

        nitropropane2 = new Material.Builder(counter, "nitropropane_2")
                .fluid()
                .color(0x27a88a)
                .build()
                .setFormula("C3H7NO2", true);
        counter++;

        isobutane = new Material.Builder(counter, "isobutane")
                .fluid(FluidTypes.GAS)
                .color(0x423013)
                .build()
                .setFormula("C4H10", true);
        counter++;

        isobutylene = new Material.Builder(counter, "isobutylene")
                .fluid(FluidTypes.GAS)
                .color(0x734527)
                .build()
                .setFormula("C4H8", true);
        counter++;

        vacuumDistillationResidue = new Material.Builder(counter, "vacuum_distillation_residue")
                .fluid()
                .color(0x3d3d3d)
                .build();
        counter++;

        sulfuricDeasphaltedOil = new Material.Builder(counter, "sulfuric_deasphalted_oil")
                .fluid()
                .color(0x9c8e2a).iconSet(DULL)
                .build();
        counter++;

        deasphaltedOil = new Material.Builder(counter, "deasphalted_oil")
                .fluid()
                .color(0x666666)
                .build();
        counter++;

        asphalt = new Material.Builder(counter, "asphalt")
                .dust()
                .color(0x242424).iconSet(DULL)
                .build();
        counter++;

        petroleumCoke = new Material.Builder(counter, "petroleum_coke")
                .gem()
                .color(0x131313).iconSet(LIGNITE)
                .build()
                .setFormula("C", true);
        counter++;

        rawLubricant = new Material.Builder(counter, "raw_lubricant")
                .fluid()
                .color(0xfcf86a)
                .build();
        counter++;

        // Solvents Chain
        dodecene = new Material.Builder(counter, "dodecene")
                .fluid()
                .color(0x4da387)
                .build()
                .setFormula("C12H24", true);
        counter++;

        isopropylAlcohol = new Material.Builder(counter, "isopropyl_alcohol")
                .fluid()
                .color(0xe3c920)
                .build()
                .setFormula("C3H8O", true);
        counter++;

        chloromethanesMixture = new Material.Builder(counter, "chloromethanes_mixture")
                .fluid(FluidTypes.GAS)
                .color(0xaf8bb0)
                .fluidTemp(360)
                .build()
                .setFormula("(CH3Cl)(CH2Cl2)(CHCl3)(CCl4)(HCl)", true);
        counter++;

        dichloromethane = new Material.Builder(counter, "dichloromethane")
                .fluid()
                .color(0x9230a1)
                .build()
                .setFormula("CH2Cl2", true);
        counter++;

        carbonTetrachloride = new Material.Builder(counter, "carbon_tetrachloride")
                .fluid()
                .color(0x523157)
                .build()
                .setFormula("CCl4", true);
        counter++;

        butanediol = new Material.Builder(counter, "butanediol")
                .fluid()
                .color(0x749c5c)
                .build()
                .setFormula("C4H10O2", true);
        counter++;

        butyrolactone = new Material.Builder(counter, "butyrolactone")
                .fluid()
                .color(0x438f8a)
                .build()
                .setFormula("C4H6O2", true);
        counter++;

        methylpyrrolidone = new Material.Builder(counter, "methylpyrrolidone")
                .fluid()
                .color(0x2abfb5)
                .build()
                .setFormula("C5H9NO", true);
        counter++;

        zincChloride = new Material.Builder(counter, "zinc_chloride")
                .dust()
                .color(0x6e1e38).iconSet(DULL)
                .build()
                .setFormula("ZnCl2", true);
        counter++;

        chlorohexane = new Material.Builder(counter, "chlorohexane")
                .fluid()
                .color(0xa8ba57)
                .build()
                .setFormula("C6H13Cl", true);
        counter++;

        methylimidazole = new Material.Builder(counter, "methylimidazole")
                .fluid()
                .color(0x773e78)
                .build()
                .setFormula("C4H6N2", true);
        counter++;

        hexylmethylimidazoliumChloride = new Material.Builder(counter, "hexylmethylimidazolium_chloride")
                .fluid()
                .color(0xe286e3).iconSet(DULL)
                .build()
                .setFormula("[C10H19N2]Cl", true);
        counter++;

        potassiumHexafluorophosphate = new Material.Builder(counter, "potassium_hexafluorophosphate")
                .dust()
                .color(0x50d943).iconSet(DULL)
                .build()
                .setFormula("KPF6", true);
        counter++;

        hexylmethylimidazoliumHexafluorophosphate = new Material.Builder(counter, "hexylmethylimidazolium_hexafluorophosphate")
                .fluid()
                .color(0xac4bad).iconSet(DULL)
                .build()
                .setFormula("[C10H19N2]PF6", true);
        counter++;

        octylmethylimidazoliumChloride = new Material.Builder(counter, "octylmethylimidazolium_chloride")
                .fluid()
                .color(0x6c42c7).iconSet(DULL)
                .build()
                .setFormula("[C12H23N2]Cl", true);
        counter++;

        octylmethylimidazoliumBistriflimide = new Material.Builder(counter, "octylmethylimidazolium_bistriflimide")
                .fluid()
                .color(0x5d24d6).iconSet(DULL)
                .build()
                .setFormula("[C12H23N2][C2F6NO4S2]", true);
        counter++;

        ethylhydroxycaproaldehyde = new Material.Builder(counter, "ethylhydroxycaproaldehyde")
                .fluid()
                .color(0x687cc4)
                .build()
                .setFormula("C8H14O2", true);
        counter++;

        ethylhexanol = new Material.Builder(counter, "ethylhexanol")
                .fluid()
                .color(0x5d6687)
                .build()
                .setFormula("C8H18O", true);
        counter++;

        diethylhexylphosphoricAcid = new Material.Builder(counter, "diethylhexylphosphoric_acid")
                .fluid(FluidTypes.ACID)
                .color(0x644fc2)
                .build()
                .setFormula("C16H35O4P", true);
        counter++;

        chlorooctane = new Material.Builder(counter, "chlorooctane")
                .fluid()
                .color(0x7dd12e)
                .build()
                .setFormula("C8H17Cl", true);
        counter++;

        trioctylphosphine = new Material.Builder(counter, "trioctylphosphine")
                .fluid()
                .color(0xd1c162)
                .build()
                .setFormula("C24H51P", true);
        counter++;

        trioctylphosphineOxide = new Material.Builder(counter, "trioctylphosphine_oxide")
                .fluid()
                .color(0x968d56)
                .build()
                .setFormula("C24H51OP", true);
        counter++;

        tributyl_phosphate = new Material.Builder(counter, "tributyl_phosphate")
                .fluid()
                .color(0xb85911)
                .build()
                .setFormula("C12H27O4P", true);
        counter++;

        xyloseSolution = new Material.Builder(counter, "xylose_solution")
                .fluid()
                .color(0xc48d64)
                .build()
                .setFormula("(C5H10O5)(HCl)(H2O)", true);
        counter++;

        lignin = new Material.Builder(counter, "lignin")
                .dust()
                .color(0x704c31).iconSet(ROUGH)
                .build();
        counter++;

        xylose = new Material.Builder(counter, "xylose")
                .dust()
                .color(0xadadad).iconSet(ROUGH)
                .build()
                .setFormula("C5H10O5", true);
        counter++;

        furfural = new Material.Builder(counter, "furfural")
                .fluid()
                .color(0xa88a8a)
                .build()
                .setFormula("C5H4O2", true);
        counter++;

        tetrahydrofurfurylAlcohol = new Material.Builder(counter, "tetrahydrofurfuryl_alcohol")
                .fluid()
                .color(0xba7d7d)
                .build()
                .setFormula("C5H10O2", true);
        counter++;

        trioctylamine = new Material.Builder(counter, "trioctylamine")
                .fluid()
                .color(0x46bdab)
                .build()
                .setFormula("C24H51N", true);
        counter++;

        trioctylmethylammoniumChloride = new Material.Builder(counter, "trioctylmethylammonium_chloride")
                .fluid()
                .color(0xc2870a).iconSet(DULL)
                .build()
                .setFormula("[C25H54N]Cl", true);
        counter++;

        tridecylamine = new Material.Builder(counter, "tridecylamine")
                .fluid()
                .color(0x7fc78c)
                .build()
                .setFormula("C30H63N", true);
        counter++;

        tridecylmethylammoniumChloride = new Material.Builder(counter, "tridecylmethylammonium_chloride")
                .fluid()
                .color(0x2dad28).iconSet(DULL)
                .build()
                .setFormula("[C31H66N]Cl", true);
        counter++;

        aliquat366Nitrate = new Material.Builder(counter, "aliquat_366_nitrate")
                .fluid()
                .color(0x2dad28).iconSet(DULL)
                .build()
                .setFormula("([C25H54N](NO3))([C31H66N]NO3)", true);
        counter++;

        trioctylmethylammoniumHydroxide = new Material.Builder(counter, "trioctylmethylammonium_hydroxide")
                .fluid()
                .color(0xe0a21d).iconSet(DULL)
                .build()
                .setFormula("[C25H54N]OH", true);
        counter++;

        trioctylmethylammoniumDiethylhexylphosphate = new Material.Builder(counter, "trioctylmethylammonium_diethylhexylphosphate")
                .fluid()
                .color(0xffae00).iconSet(DULL)
                .build()
                .setFormula("[C25H54N][C16H34O4P]", true);
        counter++;

        // Vanilla GTCEu Polymers Chain
        emulsionPolymerizationMixture = new Material.Builder(counter, "emulsion_polymerization_mixture")
                .fluid()
                .color(0x00ff6a).iconSet(DULL)
                .build()
                .setFormula("(C16H31O6SNa)(Na2S2O8)(NaHCO3)(H2O)", true);
        counter++;

        polypropylene = new Material.Builder(counter, "polypropylene")
                .polymer()
                .color(0xbfbfbf).iconSet(DULL)
                .flags(NO_SMELTING, FLAMMABLE, GENERATE_PLATE, GENERATE_FOIL)
            .build()
                .setFormula("(C3H6)", true);
        counter++;

        polymethylpentene = new Material.Builder(counter, "polymethylpentene")
                .polymer()
                .color(0x828282).iconSet(DULL)
                .flags(NO_SMELTING, FLAMMABLE, GENERATE_PLATE, GENERATE_FOIL)
            .build()
                .setFormula("(C6H12)", true);
        counter++;

        polystyrene = new Material.Builder(counter, "polystyrene")
                .dust()
                .color(0xd1d1d1).iconSet(DULL)
                .build()
                .setFormula("(C8H8)", true);
        counter++;

        styreneDivinylbenzene = new Material.Builder(counter, "styrene_divinylbenzene")
                .dust()
                .color(0xbdac2f).iconSet(DULL)
                .build()
                .setFormula("(C8H8)(C10H10)", true);
        counter++;

        polyvinylAlcohol = new Material.Builder(counter, "polyvinyl_alcohol")
                .polymer()
                .color(0xa7d6c5).iconSet(DULL)
                .flags(NO_SMELTING, FLAMMABLE, GENERATE_PLATE, GENERATE_FOIL)
            .build()
                .setFormula("(C2H4O)", true);
        counter++;

        // Fluoropolymers Chain
        caprylicAcid = new Material.Builder(counter, "caprylic_acid")
                .dust()
                .color(0x416123).iconSet(DULL)
                .build()
                .setFormula("C8H16O2", true);
        counter++;

        perfluorooctanoylFluoride = new Material.Builder(counter, "perfluorooctanoyl_fluoride")
                .dust()
                .color(0x96c429).iconSet(DULL)
                .build()
                .setFormula("C8F16O", true);
        counter++;

        perfluorooctanoicAcid = new Material.Builder(counter, "perfluorooctanoic_acid")
                .dust()
                .color(0x96c429).iconSet(DULL)
                .build()
                .setFormula("C8HF15O2", true);
        counter++;

        hexafluoropropylene = new Material.Builder(counter, "hexafluoropropylene")
                .fluid(FluidTypes.GAS)
                .color(0x398c2e)
                .build()
                .setFormula("C3F6", true);
        counter++;

        hexafluoropropyleneOxide = new Material.Builder(counter, "hexafluoropropylene_oxide")
                .fluid(FluidTypes.GAS)
                .color(0x64b327)
                .build()
                .setFormula("C3F6O", true);
        counter++;

        perfluorofluorosulfonylacetylFluoride = new Material.Builder(counter, "perfluorofluorosulfonylacetyl_fluoride")
                .fluid()
                .color(0x24bd43)
                .build()
                .setFormula("C2F4O3S", true);
        counter++;

        perfluorofluorosulfonylethoxypropoxypropanoylFluoride = new Material.Builder(counter, "perfluorofluorosulfonylethoxypropoxypropanoyl_fluoride")
                .fluid()
                .color(0x608f6b)
                .build()
                .setFormula("C8F16O5S", true);
        counter++;

        perfluoroethenyloxypropanyloxyethanesulfonylFluoride = new Material.Builder(counter, "perfluoroethenyloxypropanyloxyethanesulfonyl_fluoride")
                .fluid()
                .color(0x69c77f)
                .build()
                .setFormula("C7F14O4S", true);
        counter++;

        rawNafion = new Material.Builder(counter, "raw_nafion")
                .fluid()
                .color(0x00ff4c).iconSet(DULL)
                .build()
                .setFormula("(C9F18O4S)", true);
        counter++;

        nafion = new Material.Builder(counter, "nafion")
                .polymer()
                .color(0x6fff00).iconSet(DULL)
                .flags(FLAMMABLE, GENERATE_PLATE, GENERATE_FOIL)
            .build()
                .setFormula("(C9HF17O5S)", true);
        counter++;

        // PEDOT:PSS Chain
        tetrachlorobutane = new Material.Builder(counter, "tetrachlorobutane")
                .fluid()
                .color(0xcf9415)
                .build()
                .setFormula("C4H6Cl4", true);
        counter++;

        dichlorobutadiene = new Material.Builder(counter, "dichlorobutadiene")
                .fluid()
                .color(0xb08427)
                .build()
                .setFormula("C4H4Cl2", true);
        counter++;

        dimethoxybutadiene = new Material.Builder(counter, "dimethoxybutadiene")
                .fluid()
                .color(0xc7a45a)
                .build()
                .setFormula("C6H10O2", true);
        counter++;

        sulfurDichloride = new Material.Builder(counter, "sulfur_dichloride")
                .fluid()
                .color(0xb1bd42)
                .build()
                .setFormula("SCl2", true);
        counter++;

        iodobutane = new Material.Builder(counter, "iodobutane")
                .fluid()
                .color(0xac65c2)
                .build()
                .setFormula("C4H9I", true);
        counter++;

        tetrabutylammoniumIodide = new Material.Builder(counter, "tetrabutylammonium_iodide")
                .dust()
                .color(0x8681a1).iconSet(DULL)
                .build()
                .setFormula("[C16H36N]I", true);
        counter++;

        ethylenedioxythiophene = new Material.Builder(counter, "ethylenedioxythiophene")
                .fluid()
                .color(0x439945)
                .build()
                .setFormula("C6H8O2S", true);
        counter++;

        ferricSulfate = new Material.Builder(counter, "ferric_sulfate")
                .dust()
                .color(0x3de040).iconSet(ROUGH)
                .build()
                .setFormula("Fe2(SO4)3", true);
        counter++;

        polyethylenedioxythiophenePolystyreneSulfonate = new Material.Builder(counter, "polyethylenedioxythiophene_polystyrene_sulfonate")
                .polymer()
                .color(0x07fa0c)
                .flags(FLAMMABLE)
            .build()
                .setFormula("([C6H4O2S][C8H7O3S])", true);
        counter++;

        highlyConductivePedotPssSolution = new Material.Builder(counter, "highly_conductive_pedot_pss_solution")
                .fluid()
                .color(0x439945)
                .build()
                .setFormula("(PEDOT:PSS)(H2O)", true);
        counter++;

        iridiumDioxide = new Material.Builder(counter, "iridium_dioxide")
                .ingot()
                .color(0xffc0ab).iconSet(ROUGH)
                .flags(GENERATE_PLATE, GENERATE_FOIL)
            .build()
                .setFormula("IrO2", true);
        counter++;

        highlyConductivePedotPssFilmOnIridiumDioxide = new Material.Builder(counter, "highly_conductive_pedot_pss_film_on_iridium_dioxide")
                .color(0xff906b).iconSet(DULL)
                .flags(GENERATE_PLATE, GENERATE_FOIL)
                .build()
                .setFormula("(IrO2)(PEDOT:PSS)", true);
        counter++;

        // Zylon Chain
        resourcinol = new Material.Builder(counter, "resourcinol")
                .dust()
                .color(0x61101a).iconSet(DULL)
                .build()
                .setFormula("C6H6O2", true);
        counter++;

        dinitroresourcinol = new Material.Builder(counter, "dinitroresourcinol")
                .dust()
                .color(0x222873).iconSet(DULL)
                .build()
                .setFormula("C6H4N2O6", true);
        counter++;

        diaminoresourcinol = new Material.Builder(counter, "diaminoresourcinol")
                .dust()
                .color(0x2f336e).iconSet(DULL)
                .build()
                .setFormula("C6H8N2O2", true);
        counter++;

        tetratertbutyldiaminoresourcinol = new Material.Builder(counter, "tetratertbutyldiaminoresourcinol")
                .dust()
                .color(0x505491).iconSet(DULL)
                .build()
                .setFormula("C30H64N2O2", true);
        counter++;

        orthoXylene = new Material.Builder(counter, "ortho_xylene")
                .fluid()
                .color(0x859c40)
                .components(Carbon, 8, Hydrogen, 10)
                .build();
        counter++;

        Dimethylbenzene = new Material.Builder(counter, "meta_xylene")
                .fluid()
                .color(0x669C40)
                .components(Carbon, 8, Hydrogen, 10)
                .build();
        counter++;

        paraXylene = new Material.Builder(counter, "para_xylene")
                .fluid()
                .color(0x469c40)
                .components(Carbon, 8, Hydrogen, 10)
                .build();
        counter++;

        bistrichloromethylbenzene = new Material.Builder(counter, "bistrichloromethylbenzene")
                .dust()
                .color(0x2abd87).iconSet(DULL)
                .build()
                .setFormula("C8H4Cl6", true);
        counter++;

        terephthalicAcid = new Material.Builder(counter, "terephthalic_acid")
                .dust()
                .color(0x2abd87).iconSet(DULL)
                .build()
                .setFormula("C8H6O4", true);
        counter++;

        terephthaloylChloride = new Material.Builder(counter, "terephthaloyl_chloride")
                .dust()
                .color(0x308a50).iconSet(DULL)
                .build()
                .setFormula("C8H4Cl2O2", true);
        counter++;

        preZylon = new Material.Builder(counter, "pre_zylon")
                .dust()
                .color(0x657d99).iconSet(DULL)
                .build()
                .setFormula("C26H38N2O4Si2", true);
        counter++;

        zylon = new Material.Builder(counter, "zylon")
                .polymer()
                .color(0x5d6875).iconSet(DULL)
                .flags(GENERATE_PLATE, NO_SMASHING)
                .fluidPipeProperties(1200, 400, true)
                .build()
                .setFormula("C14H6N2O4", true);
        counter++;

        // Hydrogen Peroxide Chain
        ethylanthraquinone = new Material.Builder(counter, "ethylanthraquinone")
                .dust()
                .color(0x470063).iconSet(DULL)
                .build()
                .setFormula("C16H12O2", true);
        counter++;

        hydrogenPeroxide = new Material.Builder(counter, "hydrogen_peroxide")
                .fluid()
                .color(0x9ce0ff)
                .build()
                .setFormula("H2O2", true);
        counter++;

        // Simple Amines Chain
        methylaminesMixture = new Material.Builder(counter, "methylamines_mixture")
                .fluid(FluidTypes.GAS)
                .color(0x222e85)
                .build()
                .setFormula("(CH5N)(C2H7N)(C3H9N)(H2O)", true);
        counter++;

        trimethylamine = new Material.Builder(counter, "trimethylamine")
                .fluid(FluidTypes.GAS)
                .color(0x55446b)
                .build()
                .setFormula("C3H9N", true);
        counter++;

        ethylaminesMixture = new Material.Builder(counter, "ethylamines_mixture")
                .fluid(FluidTypes.GAS)
                .color(0x4752a1)
                .fluidTemp(410)
                .build()
                .setFormula("(C2H7N)(C4H11N)(C6H15N)(H2O)", true);
        counter++;

        ethylamine = new Material.Builder(counter, "ethylamine")
                .fluid(FluidTypes.GAS)
                .color(0x373a54)
                .build()
                .setFormula("C2H7N", true);
        counter++;

        diethylamine = new Material.Builder(counter, "diethylamine")
                .fluid()
                .color(0x373a56)
                .build()
                .setFormula("C4H11N", true);
        counter++;

        triethylamine = new Material.Builder(counter, "triethylamine")
                .fluid()
                .color(0x373a58)
                .build()
                .setFormula("C6H15N", true);
        counter++;

        isopropylaminesMixture = new Material.Builder(counter, "isopropylamines_mixture")
                .fluid(FluidTypes.GAS)
                .color(0x3a5e7a)
                .fluidTemp(610)
                .build()
                .setFormula("(C3H9N)(C6H15N)(C9H21N)(H2O)", true);
        counter++;

        isopropylamine = new Material.Builder(counter, "isopropylamine")
                .fluid()
                .color(0x616e78)
                .build()
                .setFormula("C3H9N", true);
        counter++;

        diisopropylamine = new Material.Builder(counter, "diisopropylamine")
                .fluid()
                .color(0x616e7a)
                .build()
                .setFormula("C6H15N", true);
        counter++;

        triisopropylamine = new Material.Builder(counter, "triisopropylamine")
                .fluid()
                .color(0x616e7c)
                .build()
                .setFormula("C9H21N", true);
        counter++;

        ethanolaminesMixture = new Material.Builder(counter, "ethanolamines_mixture")
                .fluid(FluidTypes.GAS)
                .color(0x2d1a57)
                .fluidTemp(610)
                .build()
                .setFormula("(C2H7NO)(C4H11NO2)(C6H15NO3)(H2O)", true);
        counter++;

        ethanolamine = new Material.Builder(counter, "ethanolamine")
                .fluid()
                .color(0x675491)
                .build()
                .setFormula("C2H7NO", true);
        counter++;

        diethanolamine = new Material.Builder(counter, "diethanolamine")
                .dust().fluid()
                .color(0x675493).iconSet(FINE)
                .build()
                .setFormula("C4H11NO2", true);
        counter++;

        triethanolamine = new Material.Builder(counter, "triethanolamine")
                .fluid()
                .color(0x675495)
                .build()
                .setFormula("C6H15NO3", true);
        counter++;

        isopropanolaminesMixture = new Material.Builder(counter, "isopropanolamines_mixture")
                .fluid(FluidTypes.GAS)
                .color(0x5e2e8f)
                .fluidTemp(580)
                .build()
                .setFormula("(C3H9NO)(C6H15NO2)(C9H21NO3)(H2O)", true);
        counter++;

        isopropanolamine = new Material.Builder(counter, "isopropanolamine")
                .fluid()
                .color(0x473559)
                .build()
                .setFormula("C3H9NO", true);
        counter++;

        diisopropanolamine = new Material.Builder(counter, "diisopropanolamine")
                .dust().fluid()
                .color(0x47355b).iconSet(FINE)
                .build()
                .setFormula("C6H15NO2", true);
        counter++;

        triisopropanolamine = new Material.Builder(counter, "triisopropanolamine")
                .dust().fluid()
                .color(0x47355d).iconSet(FINE)
                .build()
                .setFormula("C9H21NO3", true);
        counter++;

        ethyleneOxide = new Material.Builder(counter, "ethylene_oxide")
                .fluid(FluidTypes.GAS)
                .color(0x658a66)
                .build()
                .setFormula("C2H4O", true);
        counter++;

        propyleneOxide = new Material.Builder(counter, "propylene_oxide")
                .fluid()
                .color(0x4d5e4e)
                .build()
                .setFormula("C3H6O", true);
        counter++;

        // Adamantane Chain
        cyclopentadiene = new Material.Builder(counter, "cyclopentadiene")
                .fluid()
                .color(0x9a9c54)
                .build()
                .setFormula("C5H6", true);
        counter++;

        tetrahydrodicyclopentadiene = new Material.Builder(counter, "tetrahydrodicyclopentadiene")
                .dust()
                .color(0xced152).iconSet(DULL)
                .build()
                .setFormula("C10H16", true);
        counter++;

        adamantane = new Material.Builder(counter, "adamantane")
                .dust()
                .color(0x97cf57).iconSet(DULL)
                .build()
                .setFormula("C10H16", true);
        counter++;

        alkylatedAdamantanes = new Material.Builder(counter, "alkylated_adamantanes")
                .fluid()
                .color(0x88e61e).iconSet(DULL)
                .build();
        counter++;

        adamantaneOil = new Material.Builder(counter, "adamantane_oil")
                .fluid()
                .color(0x87ff00)
                .build();
        counter++;

        // Other Organics
        propionaldehyde = new Material.Builder(counter, "propionaldehyde")
                .fluid()
                .color(0xdbbf1f)
                .build()
                .setFormula("C3H6O", true);
        counter++;

        propanol = new Material.Builder(counter, "propanol")
                .fluid()
                .color(0xbda831)
                .build()
                .setFormula("C3H8O", true);
        counter++;

        isobutyraldehyde = new Material.Builder(counter, "isobutyraldehyde")
                .fluid()
                .color(0x524132)
                .build()
                .setFormula("C4H8O", true);
        counter++;

        butanol = new Material.Builder(counter, "butanol")
                .fluid()
                .color(0xc46a7e)
                .build()
                .setFormula("C4H10O", true);
        counter++;

        valeraldehyde = new Material.Builder(counter, "valeraldehyde")
                .fluid()
                .color(0xded037)
                .build()
                .setFormula("C5H10O", true);
        counter++;

        pentanol = new Material.Builder(counter, "pentanol")
                .fluid()
                .color(0xc4b93d)
                .build()
                .setFormula("C5H12O", true);
        counter++;

        pentene = new Material.Builder(counter, "pentene")
                .fluid()
                .color(0x9c9440)
                .build()
                .setFormula("C5H10", true);
        counter++;

        pentane = new Material.Builder(counter, "pentane")
                .fluid()
                .color(0x6e693a)
                .build()
                .setFormula("C5H12", true);
        counter++;

        caproaldehyde = new Material.Builder(counter, "caproaldehyde")
                .fluid()
                .color(0xaccc2b)
                .build()
                .setFormula("C6H12O", true);
        counter++;

        hexanol = new Material.Builder(counter, "hexanol")
                .fluid()
                .color(0x8da336)
                .build()
                .setFormula("C6H14O", true);
        counter++;

        hexene = new Material.Builder(counter, "hexene")
                .fluid()
                .color(0x78873d)
                .build()
                .setFormula("C6H12", true);
        counter++;

        hexane = new Material.Builder(counter, "hexane")
                .fluid()
                .color(0x656e41)
                .build()
                .setFormula("C6H14", true);
        counter++;

        enanthaldehyde = new Material.Builder(counter, "enanthaldehyde")
                .fluid()
                .color(0xaccc2b)
                .build()
                .setFormula("C7H14O", true);
        counter++;

        heptanol = new Material.Builder(counter, "heptanol")
                .fluid()
                .color(0x8da336)
                .build()
                .setFormula("C7H16O", true);
        counter++;

        heptene = new Material.Builder(counter, "heptene")
                .fluid()
                .color(0x78873d)
                .build()
                .setFormula("C7H14", true);
        counter++;

        heptane = new Material.Builder(counter, "heptane")
                .fluid()
                .color(0x5d663b)
                .build()
                .setFormula("C7H16", true);
        counter++;

        caprylaldehyde = new Material.Builder(counter, "caprylaldehyde")
                .fluid()
                .color(0x77c72c)
                .build()
                .setFormula("C8H16O", true);
        counter++;

        octanol = new Material.Builder(counter, "octanol")
                .fluid()
                .color(0x669c33)
                .build()
                .setFormula("C8H18O", true);
        counter++;

        octene = new Material.Builder(counter, "octene")
                .fluid()
                .color(0x558c41)
                .build()
                .setFormula("C8H16", true);
        counter++;

        octane = new Material.Builder(counter, "octane")
                .fluid()
                    .color(0x4d6e41)
                .build()
                .setFormula("C8H18", true);
        counter++;

        butyricAcid = new Material.Builder(counter, "butyric_acid")
                .fluid()
                .color(0xa757ad)
                .build()
                .setFormula("C4H8O2", true);
        counter++;

        isobutyricAcid = new Material.Builder(counter, "isobutyric_acid")
                .fluid()
                .color(0x86508a)
                .build()
                .setFormula("C4H8O2", true);
        counter++;

        bromopropane = new Material.Builder(counter, "bromopropane")
                .fluid()
                .color(0x76db4b)
                .build()
                .setFormula("C3H7Br", true);
        counter++;

        ethyleneGlycol = new Material.Builder(counter, "ethylene_glycol")
                .fluid()
                .color(0x5a8253)
                .build()
                .setFormula("C2H6O2", true);
        counter++;

        acetylene = new Material.Builder(counter, "acetylene")
                .fluid()
                .color(0x3bd9c9)
                .build()
                .setFormula("C2H2", true);
        counter++;

        ethylbenzenesMixture = new Material.Builder(counter, "ethylbenzenes_mixture")
                .fluid()
                .color(0xbdbdbd)
                .build()
                .setFormula("(C8H10)(C10H14)", true);
        counter++;

        diethylbenzene = new Material.Builder(counter, "diethylbenzene")
                .fluid()
                .color(0xa6a6a6)
                .build()
                .setFormula("C10H14", true);
        counter++;

        divinylbenzene = new Material.Builder(counter, "divinylbenzene")
                .fluid()
                .color(0xc2c2c2)
                .build()
                .setFormula("C10H10", true);
        counter++;

        acetylChloride = new Material.Builder(counter, "acetyl_chloride")
                .fluid()
                .color(0x79a63f)
                .build()
                .setFormula("C2H3OCl", true);
        counter++;

        dimethoxymethane = new Material.Builder(counter, "dimethoxymethane")
                .fluid()
                .color(0xacbd2f)
                .build()
                .setFormula("C3H8O2", true);
        counter++;

        zincBromide = new Material.Builder(counter, "zinc_bromide")
                .dust()
                .color(0x591322).iconSet(DULL)
                .build()
                .setFormula("ZnBr2", true);
        counter++;

        chloromethylMethylEther = new Material.Builder(counter, "chloromethyl_methyl_ether")
                .fluid()
                .color(0x9ccf25)
                .build()
                .setFormula("C2H5OCl", true);
        counter++;

        potassiumHydride = new Material.Builder(counter, "potassium_hydride")
                .dust()
                .color(0x71bf9b).iconSet(ROUGH)
                .build()
                .setFormula("KH", true);
        counter++;

        methylpentene = new Material.Builder(counter, "methylpentene")
                .fluid()
                .color(0x86b39f)
                .build()
                .setFormula("C5H10", true);
        counter++;

        tetrapropylammoniumBromide = new Material.Builder(counter, "tetrapropylammonium_bromide")
                .dust()
                .color(0x634249).iconSet(DULL)
                .build()
                .setFormula("[C12H28N]Br", true);
        counter++;

        tetrapropylammoniumHydroxide = new Material.Builder(counter, "tetrapropylammonium_hydroxide")
                .dust()
                .color(0x996b75).iconSet(DULL)
                .build()
                .setFormula("[C12H28N]OH", true);
        counter++;

        hydrogenLaurylSulfate = new Material.Builder(counter, "hydrogen_lauryl_sulfate")
                .dust()
                .color(0x34c7bb).iconSet(DULL)
                .build()
                .setFormula("C12H24O4S", true);
        counter++;

        sodiumLaurylSulfate = new Material.Builder(counter, "sodium_lauryl_sulfate")
                .dust()
                .color(0x13877e).iconSet(DULL)
                .build()
                .setFormula("Na[C12H23O4S]", true);
        counter++;

        sodiumBromide = new Material.Builder(counter, "sodium_bromide")
                .dust()
                .color(0x6d6e6e).iconSet(DULL)
                .build()
                .setFormula("NaBr", true);
        counter++;

        triethylaluminium = new Material.Builder(counter, "triethylaluminium")
                .fluid()
                .color(0x51b587)
                .build()
                .setFormula("C6H15Al", true);
        counter++;

        ethylaluminiumDichloride = new Material.Builder(counter, "ethylaluminium_dichloride")
                .fluid()
                .color(0x00ff91)
                .build()
                .setFormula("C2H5AlCl2", true);
        counter++;

        trialkylaluminiumMixture = new Material.Builder(counter, "trialkylaluminium_mixture")
                .fluid()
                .color(0x66ad80)
                .build()
                .setFormula("(C18H39Al)(C24H51Al)(C30H63Al)(C36H75Al)", true);
        counter++;

        fattyAlcoholsMixture = new Material.Builder(counter, "fatty_alcohols_mixture")
                .fluid()
                .color(0x57c27e)
                .build()
                .setFormula("(C6H14O)(C8H18O)(C10H22O)(C12H26O)", true);
        counter++;

        decanol = new Material.Builder(counter, "decanol")
                .fluid()
                .color(0x308a40)
                .build()
                .setFormula("C10H22O", true);
        counter++;

        decene = new Material.Builder(counter, "decene")
                .fluid()
                .color(0x346e3e)
                .build()
                .setFormula("C10H20", true);
        counter++;

        decane = new Material.Builder(counter, "decane")
                .fluid()
                .color(0x2f4d34)
                .build()
                .setFormula("C10H22", true);
        counter++;

        dodecanol = new Material.Builder(counter, "dodecanol")
                .dust().fluid()
                .color(0x308a6d)
                .build()
                .setFormula("C12H26O", true);
        counter++;

        dodecene = new Material.Builder(counter, "dodecene")
                .fluid()
                .color(0x356e5b)
                .build()
                .setFormula("C12H24", true);
        counter++;

        dodecane = new Material.Builder(counter, "dodecane")
                .fluid()
                .color(0x304a41)
                .build()
                .setFormula("C12H26", true);
        counter++;

        methylchlorosilanesMixture = new Material.Builder(counter, "methylchlorosilanes_mixture")
                .fluid()
                .color(0xa478ad)
                .fluidTemp(373)
                .build()
                .setFormula("(CH3Cl3Si)(C2H6Cl2Si)(C3H9ClSi)", true);
        counter++;

        methyltrichlorosilane = new Material.Builder(counter, "methyltrichlorosilane")
                .fluid()
                .color(0x832d96)
                .build()
                .setFormula("CH3Cl3Si", true);
        counter++;

        trimethylchlorosilane = new Material.Builder(counter, "trimethylchlorosilane")
                .fluid()
                .color(0x2a172e)
                .build()
                .setFormula("C3H9ClSi", true);
        counter++;

        tertbutanol = new Material.Builder(counter, "tertbutanol")
                .fluid()
                .color(0xc43950)
                .build()
                .setFormula("C4H10O", true);
        counter++;

        tertbutylChloride = new Material.Builder(counter, "tertbutyl_chloride")
                .fluid()
                .color(0xba3479)
                .build()
                .setFormula("C4H9Cl", true);
        counter++;

        tertbutyldimethylchlorosilane = new Material.Builder(counter, "tertbutyldimethylchlorosilane")
                .dust()
                .color(0x9f34ba).iconSet(DULL)
                .build()
                .setFormula("C6H15ClSi", true);
        counter++;

        siliconTetrachloride = new Material.Builder(counter, "silicon_tetrachloride")
                .fluid()
                .color(0xca19e6)
                .build()
                .setFormula("SiCl4", true);
        counter++;

        tetraethylOrthosilicate = new Material.Builder(counter, "tetraethyl_orthosilicate")
                .fluid()
                .color(0xca19e6)
                .build()
                .setFormula("SiC8H20O4", true);
        counter++;

        hydrazine = new Material.Builder(counter, "hydrazine")
                .fluid()
                .color(0x3d66bf)
                .build()
                .setFormula("N2H4", true);
        counter++;

        ascorbicAcid = new Material.Builder(counter, "ascorbic_acid")
                .dust()
                .color(0xff6a00).iconSet(DULL)
                .build()
                .setFormula("C6H8O6", true);
        counter++;

        dehydroascorbicAcid = new Material.Builder(counter, "dehydroascorbic_acid")
                .dust()
                .color(0xe89051).iconSet(DULL)
                .build()
                .setFormula("C6H6O6", true);
        counter++;

        phthalicAcid = new Material.Builder(counter, "phthalic_acid")
                .dust()
                .color(0x43a8a3).iconSet(ROUGH)
                .build()
                .setFormula("C8H6O4", true);
        counter++;

        lauricAcid = new Material.Builder(counter, "lauric_acid")
                .dust()
                .color(0x30825d).iconSet(DULL)
                .build()
                .setFormula("C12H26O2", true);
        counter++;

    }
}
