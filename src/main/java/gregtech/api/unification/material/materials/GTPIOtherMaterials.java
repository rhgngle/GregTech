package gregtech.api.unification.material.materials;

import gregtech.api.unification.material.Material;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class GTPIOtherMaterials {
    /**
     * ID RANGE: 27000-27999 (incl.)
     */
    public static void register(){
        int counter = 27000;

        // GTFO Ported Materials
        codeine = new Material.Builder(counter, "codeine")
                .dust()
                .color(0x0fff00).iconSet(DULL)
                .build()
                .setFormula("C18H21NO3", true);;
        counter++;

        diphenylamine = new Material.Builder(counter, "diphenylamine")
                .dust()
                .color(0x0fff00).iconSet(DULL)
                .build()
                .setFormula("C12H11N", true);
        counter++;

        phenothiazine = new Material.Builder(counter, "phenothiazine")
                .dust()
                .color(0x0fff00).iconSet(DULL)
                .build()
                .setFormula("C12H9NS", true);
        counter++;

        promethazine = new Material.Builder(counter, "promethazine")
                .dust()
                .color(0x0fff00).iconSet(DULL)
                .build()
                .setFormula("C17H20N2S", true);
        counter++;

        ammoniumPerchlorate = new Material.Builder(counter, "ammonium_perchlorate")
                .dust()
                .color(0x8a9acf).iconSet(DULL)
                .build()
                .setFormula("NH4ClO4", true);
        counter++;

        potassiumPerchlorate = new Material.Builder(counter, "potassium_perchlorate")
                .dust()
                .color(0x666f8c).iconSet(ROUGH)
                .build()
                .setFormula("KClO4", true);
        counter++;

        sodiumPerchlorate = new Material.Builder(counter, "sodium_perchlorate")
                .dust()
                .color(0x717582).iconSet(ROUGH)
                .build()
                .setFormula("NaClO4", true);
        counter++;

        sodiumChlorate = new Material.Builder(counter, "sodium_chlorate")
                .dust()
                .color(0x80828a).iconSet(ROUGH)
                .build()
                .setFormula("NaClO3", true);
        counter++;

        vanillylmandelicAcid = new Material.Builder(counter, "vanillylmandelic_acid")
                .dust()
                .color(0xf2efbd).iconSet(ROUGH)
                .build()
                .setFormula("C9H10O5", true);
        counter++;

        vanilglycolicAcid = new Material.Builder(counter, "vanilglycolic_acid")
                .dust()
                .color(0xebe7a4).iconSet(DULL)
                .build()
                .setFormula("C9H8O5", true);
        counter++;

        vanillin = new Material.Builder(counter, "vanillin")
                .dust()
                .color(0xfbfbfb).iconSet(SHINY)
                .build()
                .setFormula("C9H8O5", true);
        counter++;

        cupricHydrogenArsenite = new Material.Builder(counter, "cupric_hydrogen_arsenite")
                .dust()
                .color(0x0fff00).iconSet(SHINY)
                .build()
                .setFormula("CuHAsO3", true);
        counter++;

        sodiumCyanide = new Material.Builder(counter, "sodium_cyanide")
                .dust()
                .color(0x688199).iconSet(DULL)
                .build()
                .setFormula("NaCN", true);
        counter++;

        thoriumDioxide = new Material.Builder(counter, "thorium_dioxide")
                .dust()
                .color(0x354733).iconSet(SHINY)
                .build()
                .setFormula("ThO2", true);
        counter++;

        sodiumMethoxide = new Material.Builder(counter, "sodium_methoxide")
                .dust()
                .color(0x448fca).iconSet(ROUGH)
                .build()
                .setFormula("CH3ONa", true);
        counter++;

        nitrophenol2 = new Material.Builder(counter, "ii_nitrophenol")
                .dust().fluid()
                .color(0xa0d42a).iconSet(SHINY)
                .build()
                .setFormula("C6H5NO2", true);
        counter++;

        nitrophenol4 = new Material.Builder(counter, "iv_nitrophenol")
                .dust().fluid()
                .color(0xa7bf71).iconSet(SHINY)
                .build()
                .setFormula("C6H5NO2", true);
        counter++;

        aminophenol = new Material.Builder(counter, "aminophenol")
                .dust()
                .color(0xa8b58b).iconSet(DULL)
                .build()
                .setFormula("C6H7N", true);
        counter++;

        paracetamol = new Material.Builder(counter, "paracetamol")
                .dust()
                .color(0xd9e0ca).iconSet(DULL)
                .build()
                .setFormula("C8H9NO2", true);
        counter++;

        phenylaceticAcid = new Material.Builder(counter, "phenylacetic_acid")
                .dust()
                .color(0x217a53).iconSet(DULL)
                .build()
                .setFormula("C8H8O2", true);
        counter++;

        phenylacetone = new Material.Builder(counter, "phenylacetone")
                .dust()
                .color(0x1fab6e).iconSet(DULL)
                .build()
                .setFormula("C9H10O", true);
        counter++;

        formylImpostramine = new Material.Builder(counter, "formyl_impostramine")
                .dust()
                .color(0x16a18a).iconSet(DULL)
                .build()
                .setFormula("C11H15NO", true);
        counter++;

        impostramineHydrochloride = new Material.Builder(counter, "impostramine_hydrochloride")
                .dust()
                .color(0x3cf0d2).iconSet(SHINY)
                .build()
                .setFormula("[C10H16N]Cl", true);
        counter++;

        oxalicAcid = new Material.Builder(counter, "oxalic_acid")
                .dust()
                .color(0x4aaae2).iconSet(ROUGH)
                .build()
                .setFormula("C2H2O4", true);
        counter++;

        hydroxyphenylethylpiperidine = new Material.Builder(counter, "hydroxyphenylethylpiperidine")
                .dust()
                .color(0x8f578f).iconSet(DULL)
                .build()
                .setFormula("C13H19NO", true);
        counter++;

        phenylethylpiperidone = new Material.Builder(counter, "phenylethylpiperidone")
                .dust()
                .color(0x6e346e).iconSet(DULL)
                .build()
                .setFormula("C13H17NO", true);
        counter++;

        anilinophenylethylpiperidine = new Material.Builder(counter, "anilinophenylethylpiperidine")
                .dust()
                .color(0xa12da1).iconSet(DULL)
                .build()
                .setFormula("C19H24N2", true);
        counter++;

        greganyl = new Material.Builder(counter, "greganyl")
                .dust()
                .color(0xd927d9).iconSet(SHINY)
                .build()
                .setFormula("C22H28N2O", true);
        counter++;

        cupricChloride = new Material.Builder(counter, "cupric_chloride")
                .dust()
                .color(0x360900).iconSet(DULL)
                .build()
                .setFormula("CuCl2", true);
        counter++;

        phthalicAnhydride = new Material.Builder(counter, "phthalic_anhydride")
                .dust()
                .color(0xbababa).iconSet(ROUGH)
                .build()
                .setFormula("C6H4O3", true);
        counter++;

        phthalimide = new Material.Builder(counter, "phthalimide")
                .dust()
                .color(0x4d7a23).iconSet(ROUGH)
                .build()
                .setFormula("C6H5NO2", true);
        counter++;

        potassiumPhthalimide = new Material.Builder(counter, "potassium_phthalimide")
                .dust()
                .color(0x2f6132).iconSet(ROUGH)
                .build()
                .setFormula("C6H4KNO2", true);
        counter++;

        glucose = new Material.Builder(counter, "glucose")
                .dust()
                .color(0xe3e1e1).iconSet(ROUGH)
                .build()
                .setFormula("C6H12O6", true);
        counter++;

        fructose = new Material.Builder(counter, "fructose")
                .dust()
                .color(0xc9c9c9).iconSet(ROUGH)
                .build()
                .setFormula("C6H12O6", true);
        counter++;

        levulinicAcid = new Material.Builder(counter, "levulinic_acid")
                .dust()
                .color(0xdb8cc6).iconSet(ROUGH)
                .build()
                .setFormula("C5H8O3", true);
        counter++;

        methylLevulinate = new Material.Builder(counter, "methyl_levulinate")
                .dust()
                .color(0xab5093).iconSet(ROUGH)
                .build()
                .setFormula("C6H10O3", true);
        counter++;

        methylChlorolevulinate = new Material.Builder(counter, "methyl_chlorolevulinate")
                .dust()
                .color(0xbd4679).iconSet(DULL)
                .build()
                .setFormula("C6H9ClO3", true);
        counter++;

        aminolevulinicAcid = new Material.Builder(counter, "aminolevulinic_acid")
                .dust()
                .color(0xcd4c6a).iconSet(DULL)
                .build()
                .setFormula("C5H9NO3", true);
        counter++;

        sodiumFormate = new Material.Builder(counter, "sodium_formate")
                .dust()
                .color(0xffaaa).iconSet(ROUGH)
                .build()
                .setFormula("CHO2Na", true);
        counter++;

        dinitrodimethylbenzene = new Material.Builder(counter, "dinitrodimethylbenzene")
                .dust()
                .color(0x855139).iconSet(ROUGH)
                .build()
                .setFormula("C8H8N2O4", true);
        counter++;

        dimethylphenylenediamine = new Material.Builder(counter, "dimethylphenylenediamine")
                .dust()
                .color(0xb5562a).iconSet(ROUGH)
                .build()
                .setFormula("C8H12N2", true);
        counter++;

        dimethylbenzimidazole = new Material.Builder(counter, "dimethylbenzimidazole")
                .dust()
                .color(0xe85510).iconSet(DULL)
                .build()
                .setFormula("C9H10N2", true);
        counter++;

        phosphorusPentachloride = new Material.Builder(counter, "phosphorus_pentachloride")
                .dust()
                .color(0xd1d669).iconSet(DULL)
                .build()
                .setFormula("PCl5", true);
        counter++;

        cobaltChloride = new Material.Builder(counter, "cobalt_chloride")
                .dust()
                .color(0x127a6d).iconSet(ROUGH)
                .build()
                .setFormula("CoCl2", true);
        counter++;

        sodiumNitrate = new Material.Builder(counter, "sodium_nitrite")
                .dust()
                .color(0x98c48b).iconSet(DULL)
                .build()
                .setFormula("NaNO2", true);
        counter++;

        sodiumNitrite = new Material.Builder(counter, "sodium_nitrite")
                .dust()
                .color(0x9ca133).iconSet(DULL)
                .build()
                .setFormula("NaNO2", true);
        counter++;

        zincSulfate = new Material.Builder(counter, "zinc_sulfate")
                .dust()
                .color(0x747d76).iconSet(ROUGH)
                .build()
                .setFormula("ZnSO4", true);
        counter++;

        cobalaminMixture = new Material.Builder(counter, "cobalamin_mixture")
                .dust()
                .color(0x4d2228).iconSet(ROUGH)
                .build();
        counter++;

        cyanocobalamin = new Material.Builder(counter, "cyanocobalamin")
                .dust()
                .color(0x4f1920).iconSet(SHINY)
                .build()
                .setFormula("C63H88CoN14O14P", true);
        counter++;

        cobalamin = new Material.Builder(counter, "cobalamin")
                .dust()
                .color(0x6e1420).iconSet(ROUGH)
                .build()
                .setFormula("C62H89CoN13O14P", true);
        counter++;

        hydroxycobalamin = new Material.Builder(counter, "hydroxycobalamin")
                .dust()
                .color(0x8c0b1c).iconSet(BRIGHT)
                .build()
                .setFormula("C62H89CoN13O15P", true);
        counter++;

        // Placeholder Materials
        corundum = new Material.Builder(counter, "corundum")
                .build()
                .setFormula("Al2O3", true);
        counter++;

        kelpDried = new Material.Builder(counter, "kelp_dried")
                .build();
        counter++;

        fusedSilica = new Material.Builder(counter, "fused_silica")
                .build()
                .setFormula("SiO2", true);
        counter++;

    }
}
