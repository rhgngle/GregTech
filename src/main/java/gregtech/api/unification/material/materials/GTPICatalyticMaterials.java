package gregtech.api.unification.material.materials;

import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPICatalyticMaterials {
    /**
     * ID RANGE: 32000-32766 (incl.)
     */
    public static void register() {
        int counter = 32000;
        activatedCarbon = new Material.Builder(counter, "activated_carbon")
                .dust()
                .color(0x000000).iconSet(ROUGH)
                .build()
                .setFormula("C", true);
        counter++;

        glassyCarbon = new Material.Builder(counter, "glassy_carbon")
                .ingot()
                .color(0x000000).iconSet(BRIGHT)
                .flags(GENERATE_PLATE)
                .build()
                .setFormula("C", true);
        counter++;

        sodiumMetasilicate = new Material.Builder(counter, "sodium_metasilicate")
                .dust()
                .color(0x9fbdcc).iconSet(SHINY)
                .build()
                .setFormula("Na2SiO3", true);
        counter++;

        silicaGel = new Material.Builder(counter, "silica_gel")
                .dust()
                .color(SiliconDioxide.getMaterialRGB()).iconSet(SHINY)
                .build()
                .setFormula("SiO2", true);
        counter++;

        activatedAlumina = new Material.Builder(counter, "activated_alumina")
                .dust()
                .color(0xb2c7d1).iconSet(SHINY)
                .build()
                .setFormula("Al2O3", true);
        counter++;

        sodiumAluminate = new Material.Builder(counter, "sodium_aluminate")
                .dust()
                .color(0x8ca4ab).iconSet(ROUGH)
                .build()
                .setFormula("NaAlO2", true);
        counter++;

        ZSM5 = new Material.Builder(counter, "zsm_5")
                .dust()
                .color(0x6b6b6b).iconSet(ROUGH)
                .build()
                .setFormula("Na27Al27Si69O192", true);
        counter++;

        HZSM5 = new Material.Builder(counter, "hzsm_5")
                .dust()
                .color(0xb0b0b0).iconSet(ROUGH)
                .build()
                .setFormula("H27Al27Si69O192", true);
        counter++;

        palladiumChloride = new Material.Builder(counter, "palladium_chloride")
                .dust()
                .color(0x591629).iconSet(DULL)
                .build()
                .setFormula("PdCl2", true);
        counter++;

        uncalcinedPalladiumOnAlumina = new Material.Builder(counter, "uncalcined_palladium_on_alumina")
                .dust()
                .color(0x9198b3).iconSet(ROUGH)
                .build()
                .setFormula("(PdCl2)(Al2O3)", true);
        counter++;

        palladiumOnAlumina = new Material.Builder(counter, "palladium_on_alumina")
                .dust()
                .color(0x9198b3).iconSet(BRIGHT)
                .build()
                .setFormula("Pd/Al2O3", true);
        counter++;

        rutheniumChloride = new Material.Builder(counter, "ruthenium_chloride")
                .dust()
                .color(0x303030).iconSet(ROUGH)
                .build()
                .setFormula("RuCl3", true);
        counter++;

        ceriumChloride = new Material.Builder(counter, "cerium_chloride")
                .dust()
                .color(0xa3d1b2).iconSet(DULL)
                .build()
                .setFormula("CeCl3", true);
        counter++;

        rutheniumCeriumOxidesCoatedNickel = new Material.Builder(counter, "ruthenium_cerium_oxides_coated_nickel")
                .color(0x1c6634).iconSet(METALLIC)
                .flags(GENERATE_PLATE)
                .build()
                .setFormula("RuO2-CeO2/Ni", true);
        counter++;

        titaniumButoxide = new Material.Builder(counter, "titanium_butoxide")
                .fluid()
                .color(0xc4518c)
                .build()
                .setFormula("C16H36O4Ti", true);
        counter++;

        titaniaSilicaTpaohSolution = new Material.Builder(counter, "titania_silica_tpaoh_solution")
                .fluid()
                .color(0xc4518c)
                .build()
                .setFormula("(TiO2)(SiO2)(TPAOH)(H2O)", true);
        counter++;

        titaniumSilicalite = new Material.Builder(counter, "titanium_silicalite")
                .dust()
                .color(0xbfa3b1).iconSet(BRIGHT)
                .build()
                .setFormula("(TiO2)(SiO2)", true);
        counter++;

        bismuthChloride = new Material.Builder(counter, "bismuth_chloride")
                .dust()
                .color(0xc7ba8b).iconSet(DULL)
                .build()
                .setFormula("BiCl3", true);
        counter++;

        uncalcinedCopperBismuthOnSilica = new Material.Builder(counter, "uncalcined_copper_bismuth_on_silica")
                .dust()
                .color(0x465e4c).iconSet(ROUGH)
                .build()
                .setFormula("(CuCl2)(BiCl3)(SiO2)", true);
        counter++;

        copperBismuthOnSilica = new Material.Builder(counter, "copper_bismuth_on_silica")
                .dust()
                .color(0x4c5363).iconSet(BRIGHT)
                .build()
                .setFormula("Cu-Bi/SiO2", true);
        counter++;

        palladiumOnCarbon = new Material.Builder(counter, "palladium_on_carbon")
                .dust()
                .color(0x45393f).iconSet(BRIGHT)
                .build()
                .setFormula("Pd/C", true);
        counter++;

        magnesiumEthoxide = new Material.Builder(counter, "magnesium_ethoxide")
                .dust()
                .color(0xc76ccc).iconSet(ROUGH)
                .build()
                .setFormula("C4H10O2Mg", true);
        counter++;

        zieglerNattaCatalyst = new Material.Builder(counter, "ziegler_natta_catalyst")
                .dust()
                .color(0xb3ff00).iconSet(BRIGHT)
                .build()
                .setFormula("TiCl3/MgCl2", true);
        counter++;

        polystyreneCationExchangeResin = new Material.Builder(counter, "polystyrene_cation_exchange_resin")
                .dust()
                .color(0xbf783d).iconSet(DULL)
                .build()
                .setFormula("(Na[C8H7O3S])", true);
        counter++;

        stannicChloride = new Material.Builder(counter, "stannic_chloride")
                .dust()
                .color(0x86cc58).iconSet(DULL)
                .build()
                .setFormula("SnCl4", true);
        counter++;

        chloromethylatedPolystyrene = new Material.Builder(counter, "chloromethylated_polystyrene")
                .dust()
                .color(0x997f57).iconSet(DULL)
                .build()
                .setFormula("(C9H9Cl)", true);
        counter++;

        polystyreneAnionExchangeResin = new Material.Builder(counter, "polystyrene_anion_exchange_resin")
                .dust()
                .color(0xbf4a3d).iconSet(DULL)
                .build()
                .setFormula("([C12H18N]Cl)", true);
        counter++;

        chloromethylatedStyreneDivinylbenzene = new Material.Builder(counter, "chloromethylated_styrene_divinylbenzene")
                .dust()
                .color(0xbdb157).iconSet(DULL)
                .build()
                .setFormula("(C9H9Cl)(C10H10)", true);
        counter++;

        styreneDivinylbenzeneAnionExchangeResin = new Material.Builder(counter, "styrene_divinylbenzene_anion_exchange_resin")
                .dust()
                .color(0xa6497a).iconSet(DULL)
                .build()
                .setFormula("([C13H20N]Cl)(C10H10)", true);
        counter++;

        phosphotungsticAcid = new Material.Builder(counter, "phosphotungstic_acid")
                .dust()
                .color(0xb9c77f).iconSet(ROUGH)
                .build()
                .setFormula("H3PW12O40", true);
        counter++;

        cobaltAcetate = new Material.Builder(counter, "cobalt_acetate")
                .dust()
                .color(0xc7939e).iconSet(ROUGH)
                .build()
                .setFormula("Co(C2H3O2)2", true);
        counter++;

        manganeseNitrate = new Material.Builder(counter, "manganese_nitrate")
                .dust()
                .color(0xf7c3cf).iconSet(ROUGH)
                .build()
                .setFormula("Mn(NO3)2", true);
        counter++;

        manganeseCarbonate = new Material.Builder(counter, "manganese_carbonate")
                .dust()
                .color(0xd18e9e).iconSet(ROUGH)
                .build()
                .setFormula("MnCO3", true);
        counter++;

        ammoniumNitrate = new Material.Builder(counter, "ammonium_nitrate")
                .dust()
                .color(0xababab).iconSet(DULL)
                .build()
                .setFormula("NH4NO3", true);
        counter++;

        manganeseAcetate = new Material.Builder(counter, "manganese_acetate")
                .dust()
                .color(0xc4adb2).iconSet(ROUGH)
                .build()
                .setFormula("Mn(C2H3O2)2", true);
        counter++;

        cupricNitrate = new Material.Builder(counter, "cupric_nitrate")
                .dust()
                .color(0x5c462f).iconSet(ROUGH)
                .build()
                .setFormula("Cu(NO3)2", true);
        counter++;

        chromiumNitrate = new Material.Builder(counter, "chromium_nitrate")
                .dust()
                .color(0x124710).iconSet(ROUGH)
                .build()
                .setFormula("Cr(NO3)3", true);
        counter++;

        unpyrolyzedCuCrMnNaCatalyst = new Material.Builder(counter, "unpyrolyzed_cu_cr_mn_na_catalyst")
                .dust()
                .color(0x2f542c).iconSet(ROUGH)
                .build()
                .setFormula("(Cu(NO3)2)(Cr(NO3)3)(Mn(NO3)2)(Na2SiO3)", true);
        counter++;

        uncalcinedCuCrMnNaCatalyst = new Material.Builder(counter, "uncalcined_cu_cr_mn_na_catalyst")
                .dust()
                .color(0x306e2b).iconSet(ROUGH)
                .build()
                .setFormula("(CuO)(Cr2O3)(MnO)(Na2O)", true);
        counter++;

        cuCrMnNaCatalyst = new Material.Builder(counter, "cu_cr_mn_na_catalyst")
                .dust()
                .color(0x2a7823).iconSet(BRIGHT)
                .build()
                .setFormula("CuCrMnNa", true);
        counter++;

        nickelChloride = new Material.Builder(counter, "nickel_chloride")
                .dust()
                .color(0x18f545).iconSet(ROUGH)
                .build()
                .setFormula("NiCl2", true);
        counter++;

        uncalcinedNickelPalladiumOnSilica = new Material.Builder(counter, "uncalcined_nickel_palladium_on_silica")
                .dust()
                .color(0xa5b86c).iconSet(ROUGH)
                .build()
                .setFormula("(NiCl2)(PdCl2)(SiO2)", true);
        counter++;

        nickelPalladiumOnSilica = new Material.Builder(counter, "nickel_palladium_on_silica")
                .dust()
                .color(0x485424).iconSet(BRIGHT)
                .build()
                .setFormula("Ni-Pd/SiO2", true);
        counter++;

        boricAcid = new Material.Builder(counter, "boric_acid")
                .dust()
                .color(0xe6e6e6).iconSet(SHINY)
                .build()
                .setFormula("H3BO3", true);
        counter++;

        strontiumNitrate = new Material.Builder(counter, "strontium_nitrate")
                .dust()
                .color(0xba7956).iconSet(ROUGH)
                .build()
                .setFormula("Sr(NO3)2", true);
        counter++;

        uncalcinedEuropiumDopedStrontiumBorate = new Material.Builder(counter, "uncalcined_europium_doped_strontium_borate")
                .dust()
                .color(0x665c7d).iconSet(ROUGH)
                .build()
                .setFormula("(Eu2O3)(Sr(NO3)2)(H3BO3)", true);
        counter++;

        europiumDopedStrontiumBorate = new Material.Builder(counter, "europium_doped_strontium_borate")
                .dust()
                .color(0x542dad).iconSet(BRIGHT)
                .build()
                .setFormula("Eu(II):SrB4O7", true);
        counter++;

        rutheniumDisulfide = new Material.Builder(counter, "ruthenium_disulfide")
                .dust()
                .color(0xf945ff).iconSet(ROUGH)
                .build()
                .setFormula("RuS2", true);
        counter++;

        uncalcinedRutheniumDisulfideOnAlumina = new Material.Builder(counter, "uncalcined_ruthenium_disulfide_on_alumina")
                .dust()
                .color(0xab324e).iconSet(ROUGH)
                .build()
                .setFormula("(RuS2)(Al2O3)", true);
        counter++;

        rutheniumDisulfideOnAlumina = new Material.Builder(counter, "ruthenium_disulfide_on_alumina")
                .dust()
                .color(0xab3877).iconSet(BRIGHT)
                .build()
                .setFormula("RuS2/Al2O3", true);
        counter++;

        rutheniumDisulfideCoatedGlassyCarbon = new Material.Builder(counter, "ruthenium_disulfide_coated_glassy_carbon")
                .color(0xd91844).iconSet(BRIGHT)
                .flags(GENERATE_PLATE)
                .build()
                .setFormula("RuS2/C", true);
        counter++;

        nickelNitrate = new Material.Builder(counter, "nickel_nitrate")
                .dust()
                .color(0x2bad2e).iconSet(ROUGH)
                .build()
                .setFormula("Ni(NO3)2", true);
        counter++;

        zincNitrate = new Material.Builder(counter, "zinc_nitrate")
                .dust()
                .color(0xb39e6b).iconSet(ROUGH)
                .build()
                .setFormula("Zn(NO3)2", true);
        counter++;

        uncalcinedNickelDopedZincOxideOnHZSM5 = new Material.Builder(counter, "uncalcined_nickel_doped_zinc_oxide_on_hzsm_5")
                .dust()
                .color(0xe3dab3).iconSet(ROUGH)
                .build()
                .setFormula("(Ni(NO3)2)(Zn(NO3)2)(Zeolite)", true);
        counter++;

        nickelDopedZincOxideOnHZSM5 = new Material.Builder(counter, "nickel_doped_zinc_oxide_on_hzsm_5")
                .dust()
                .color(0xe0cb72).iconSet(BRIGHT)
                .build()
                .setFormula("Ni/ZnO-Zeolite", true);
        counter++;

        rutheniumNitrosylNitrate = new Material.Builder(counter, "ruthenium_nitrosyl_nitrate")
                .dust()
                .color(0xd45719).iconSet(ROUGH)
                .build()
                .setFormula("RuNO(NO3)3", true);
        counter++;

        bariumNitrate = new Material.Builder(counter, "barium_nitrate")
                .dust()
                .color(0xa1837d).iconSet(ROUGH)
                .build()
                .setFormula("Ba(NO3)2", true);
        counter++;

        uncalcinedRutheniumOnAlumina = new Material.Builder(counter, "uncalcined_ruthenium_on_alumina")
                .dust()
                .color(0xb83c23).iconSet(ROUGH)
                .build()
                .setFormula("(RuNO(NO3)3)(Al2O3)", true);
        counter++;

        rutheniumOnAlumina = new Material.Builder(counter, "ruthenium_on_alumina")
                .dust()
                .color(0xeb5e42).iconSet(BRIGHT)
                .build()
                .setFormula("Ru/Al2O3", true);
        counter++;

        bariumRutheniumOnAlumina = new Material.Builder(counter, "barium_ruthenium_on_alumina")
                .dust()
                .color(0xe67e6a).iconSet(BRIGHT)
                .build()
                .setFormula("Ba-Ru/Al2O3", true);
        counter++;

        fluidCatalyticCrackingCatalyst = new Material.Builder(counter, "fluid_catalytic_cracking_catalyst")
                .dust()
                .color(0xad621c).iconSet(BRIGHT)
                .build()
                .setFormula("Zeolite/SiO2-FeAlSi4O11", true);
        counter++;

        nitrogenFixationCatalyst = new Material.Builder(counter, "nitrogen_fixation_catalyst")
                .dust()
                .color(0x1c1c1c).iconSet(BRIGHT)
                .build()
                .setFormula("(Fe)(Fe2O3)(Fe3O4)", true);
        counter++;

    }
}
