package gregtech.api.unification.material;

import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.info.MaterialFlag;
import gregtech.api.unification.material.materials.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static gregtech.api.unification.material.info.MaterialFlags.*;

/**
 * Material Registration.
 * <p>
 * All Material Builders should follow this general formatting:
 * <p>
 * material = new MaterialBuilder(id, name)
 * .ingot().fluid().ore()                <--- types
 * .color().iconSet()                    <--- appearance
 * .flags()                              <--- special generation
 * .element() / .components()            <--- composition
 * .toolStats()                          <---
 * .oreByProducts()                         | additional properties
 * ...                                   <---
 * .blastTemp()                          <--- blast temperature
 * .build();
 * <p>
 * Use defaults to your advantage! Some defaults:
 * - iconSet: DULL
 * - color: 0xFFFFFF
 */
public class Materials {

    private static final AtomicBoolean INIT = new AtomicBoolean(false);

    public static Material[] CHEMICAL_DYES;

    public static void register() {
        if (INIT.getAndSet(true)) {
            return;
        }

        MarkerMaterials.register();

        /*
         * Ranges 1-249
         */
        ElementMaterials.register();

        /*
         * Ranges 250-999, 3000-3019
         */
        FirstDegreeMaterials.register();

        /*
         * Ranges 1000-1499
         */
        OrganicChemistryMaterials.register();

        /*
         * Ranges 1500-1999
         */
        UnknownCompositionMaterials.register();

        /*
         * Ranges 2000-2499, 3020-3039
         */
        SecondDegreeMaterials.register();

        /*
         * Ranges 2500-2999
         */
        HigherDegreeMaterials.register();

        /*
         * Ranges 27000-27999
         */
        GTPIOtherMaterials.register();

        /*
         * Ranges 28000-28999
         */
        GTPIOreprocMaterials.register();

        /*
         * Ranges 29000-29999
         */
        GTPINuclearMaterials.register();

        /*
         * Ranges 30000-30999
         */
        GTPIInorganicMaterials.register();

        /*
         * Ranges 31000-31999
         */
        GTPIOrganicMaterials.register();

        /*
         * Ranges 32000-32766
         */
        GTPICatalyticMaterials.register();

        /*
         * Register info for cyclical references
         */
        MaterialFlagAddition.register();

        /*
         * FOR ADDON DEVELOPERS:
         *
         * GTCEu will not take more than 3000 IDs. Anything past ID 2999
         * is considered FAIR GAME, take whatever you like.
         *
         * If you would like to reserve IDs, feel free to reach out to the
         * development team and claim a range of IDs! We will mark any
         * claimed ranges below this comment. Max value is 32767.
         *
         * - Gregicality: 3000-19999
         * - Gregification: 20000-20999
         * - HtmlTech: 21000-21499
         * - GregTech Food Option: 21500-21999
         * - PCM's Ore Addon: 22000-23599
         * - MechTech: 23600-23999
         * - FREE RANGE 24000-31999
         * - Reserved for CraftTweaker: 32000-32767
         */

        CHEMICAL_DYES = new Material[]{
                Materials.DyeWhite, Materials.DyeOrange,
                Materials.DyeMagenta, Materials.DyeLightBlue,
                Materials.DyeYellow, Materials.DyeLime,
                Materials.DyePink, Materials.DyeGray,
                Materials.DyeLightGray, Materials.DyeCyan,
                Materials.DyePurple, Materials.DyeBlue,
                Materials.DyeBrown, Materials.DyeGreen,
                Materials.DyeRed, Materials.DyeBlack
        };
    }

    public static final List<MaterialFlag> STD_METAL = new ArrayList<>();
    public static final List<MaterialFlag> EXT_METAL = new ArrayList<>();
    public static final List<MaterialFlag> EXT2_METAL = new ArrayList<>();

    static {
        STD_METAL.add(GENERATE_PLATE);

        EXT_METAL.addAll(STD_METAL);
        EXT_METAL.add(GENERATE_ROD);

        EXT2_METAL.addAll(EXT_METAL);
        EXT2_METAL.addAll(Arrays.asList(GENERATE_LONG_ROD, GENERATE_BOLT_SCREW));
    }

    public static final MarkerMaterial NULL = new MarkerMaterial("null");

    /**
     * Direct Elements
     */
    public static Material Actinium;
    public static Material Aluminium;
    public static Material Americium;
    public static Material Antimony;
    public static Material Argon;
    public static Material Arsenic;
    public static Material Astatine;
    public static Material Barium;
    public static Material Berkelium;
    public static Material Beryllium;
    public static Material Bismuth;
    public static Material Bohrium;
    public static Material Boron;
    public static Material Bromine;
    public static Material Caesium;
    public static Material Calcium;
    public static Material Californium;
    public static Material Carbon;
    public static Material Cadmium;
    public static Material Cerium;
    public static Material Chlorine;
    public static Material Chrome;
    public static Material Cobalt;
    public static Material Copernicium;
    public static Material Copper;
    public static Material Curium;
    public static Material Darmstadtium;
    public static Material Deuterium;
    public static Material Dubnium;
    public static Material Dysprosium;
    public static Material Einsteinium;
    public static Material Erbium;
    public static Material Europium;
    public static Material Fermium;
    public static Material Flerovium;
    public static Material Fluorine;
    public static Material Francium;
    public static Material Gadolinium;
    public static Material Gallium;
    public static Material Germanium;
    public static Material Gold;
    public static Material Hafnium;
    public static Material Hassium;
    public static Material Holmium;
    public static Material Hydrogen;
    public static Material Helium;
    public static Material Helium3;
    public static Material Indium;
    public static Material Iodine;
    public static Material Iridium;
    public static Material Iron;
    public static Material Krypton;
    public static Material Lanthanum;
    public static Material Lawrencium;
    public static Material Lead;
    public static Material Lithium;
    public static Material Livermorium;
    public static Material Lutetium;
    public static Material Magnesium;
    public static Material Mendelevium;
    public static Material Manganese;
    public static Material Meitnerium;
    public static Material Mercury;
    public static Material Molybdenum;
    public static Material Moscovium;
    public static Material Neodymium;
    public static Material Neon;
    public static Material Neptunium;
    public static Material Nickel;
    public static Material Nihonium;
    public static Material Niobium;
    public static Material Nitrogen;
    public static Material Nobelium;
    public static Material Oganesson;
    public static Material Osmium;
    public static Material Oxygen;
    public static Material Palladium;
    public static Material Phosphorus;
    public static Material Polonium;
    public static Material Platinum;
    public static Material Plutonium239;
    public static Material Plutonium241;
    public static Material Potassium;
    public static Material Praseodymium;
    public static Material Promethium;
    public static Material Protactinium;
    public static Material Radon;
    public static Material Radium;
    public static Material Rhenium;
    public static Material Rhodium;
    public static Material Roentgenium;
    public static Material Rubidium;
    public static Material Ruthenium;
    public static Material Rutherfordium;
    public static Material Samarium;
    public static Material Scandium;
    public static Material Seaborgium;
    public static Material Selenium;
    public static Material Silicon;
    public static Material Silver;
    public static Material Sodium;
    public static Material Strontium;
    public static Material Sulfur;
    public static Material Tantalum;
    public static Material Technetium;
    public static Material Tellurium;
    public static Material Tennessine;
    public static Material Terbium;
    public static Material Thorium;
    public static Material Thallium;
    public static Material Thulium;
    public static Material Tin;
    public static Material Titanium;
    public static Material Tritium;
    public static Material Tungsten;
    public static Material Uranium238;
    public static Material Uranium235;
    public static Material Vanadium;
    public static Material Xenon;
    public static Material Ytterbium;
    public static Material Yttrium;
    public static Material Zinc;
    public static Material Zirconium;

    /**
     * Fantasy Elements
     */
    public static Material Naquadah;
    public static Material NaquadahEnriched;
    public static Material Naquadria;
    public static Material Neutronium;
    public static Material Tritanium;
    public static Material Duranium;
    public static Material Trinium;

    /**
     * First Degree Compounds
     */
    public static Material Almandine;
    public static Material Andradite;
    public static Material AnnealedCopper;
    public static Material Asbestos;
    public static Material Ash;
    public static Material BandedIron;
    public static Material BatteryAlloy;
    public static Material BlueTopaz;
    public static Material Bone;
    public static Material Brass;
    public static Material Bronze;
    public static Material BrownLimonite;
    public static Material Calcite;
    public static Material Cassiterite;
    public static Material CassiteriteSand;
    public static Material Chalcopyrite;
    public static Material Charcoal;
    public static Material Chromite;
    public static Material Cinnabar;
    public static Material Water;
    public static Material LiquidOxygen;
    public static Material Coal;
    public static Material Cobaltite;
    public static Material Cooperite;
    public static Material Cupronickel;
    public static Material DarkAsh;
    public static Material Diamond;
    public static Material Electrum;
    public static Material Emerald;
    public static Material Galena;
    public static Material Garnierite;
    public static Material GreenSapphire;
    public static Material Grossular;
    public static Material Ice;
    public static Material Ilmenite;
    public static Material Rutile;
    public static Material Bauxite;
    public static Material Invar;
    public static Material Kanthal;
    public static Material Lazurite;
    public static Material LiquidHelium;
    public static Material Magnalium;
    public static Material Magnesite;
    public static Material Magnetite;
    public static Material Molybdenite;
    public static Material Nichrome;
    public static Material NiobiumNitride;
    public static Material NiobiumTitanium;
    public static Material Obsidian;
    public static Material Phosphate;
    public static Material SterlingSilver;
    public static Material RoseGold;
    public static Material BlackBronze;
    public static Material BismuthBronze;
    public static Material Biotite;
    public static Material Powellite;
    public static Material Pyrite;
    public static Material Pyrolusite;
    public static Material Pyrope;
    public static Material RockSalt;
    public static Material Ruridit;
    public static Material Rubber;
    public static Material Ruby;
    public static Material Salt;
    public static Material Saltpeter;
    public static Material Sapphire;
    public static Material Scheelite;
    public static Material Sodalite;
    public static Material Tantalite;
    public static Material Coke;


    public static Material SolderingAlloy;
    public static Material Spessartine;
    public static Material Sphalerite;
    public static Material StainlessSteel;
    public static Material Steel;
    public static Material Stibnite;
    public static Material Tetrahedrite;
    public static Material TinAlloy;
    public static Material Topaz;
    public static Material Tungstate;
    public static Material Ultimet;
    public static Material Uraninite;
    public static Material Uvarovite;
    public static Material VanadiumGallium;
    public static Material WroughtIron;
    public static Material Wulfenite;
    public static Material YellowLimonite;
    public static Material YttriumBariumCuprate;
    public static Material NetherQuartz;
    public static Material CertusQuartz;
    public static Material Quartzite;
    public static Material Graphite;
    public static Material Graphene;
    public static Material TungsticAcid;
    public static Material Osmiridium;
    public static Material LithiumChloride;
    public static Material CalciumChloride;
    public static Material Bornite;
    public static Material Chalcocite;

    public static Material GalliumArsenide;
    public static Material Potash;
    public static Material SodaAsh;
    public static Material IndiumGalliumPhosphide;
    public static Material NickelZincFerrite;
    public static Material SiliconDioxide;
    public static Material MagnesiumChloride;
    public static Material SodiumSulfide;
    public static Material PhosphorusPentoxide;
    public static Material Quicklime;
    public static Material SodiumBisulfate;
    public static Material FerriteMixture;
    public static Material Magnesia;
    public static Material PlatinumGroupSludge;
    public static Material Realgar;
    public static Material SodiumBicarbonate;
    public static Material PotassiumDichromate;
    public static Material ChromiumTrioxide;
    public static Material AntimonyTrioxide;
    public static Material Zincite;
    public static Material CupricOxide;
    public static Material CobaltOxide;
    public static Material ArsenicTrioxide;
    public static Material Massicot;
    public static Material Ferrosilite;
    public static Material MetalMixture;
    public static Material SodiumHydroxide;
    public static Material SodiumPersulfate;
    public static Material Bastnasite;
    public static Material Pentlandite;
    public static Material Spodumene;
    public static Material Lepidolite;
    public static Material GlauconiteSand;
    public static Material Malachite;
    public static Material Mica;
    public static Material Barite;
    public static Material Alunite;
    public static Material Talc;
    public static Material Soapstone;
    public static Material Kyanite;
    public static Material IronMagnetic;
    public static Material TungstenCarbide;
    public static Material CarbonDioxide;
    public static Material TitaniumTetrachloride;
    public static Material NitrogenDioxide;
    public static Material HydrogenSulfide;
    public static Material NitricAcid;
    public static Material SulfuricAcid;
    public static Material PhosphoricAcid;
    public static Material SulfurTrioxide;
    public static Material SulfurDioxide;
    public static Material CarbonMonoxide;
    public static Material HypochlorousAcid;
    public static Material Ammonia;
    public static Material HydrofluoricAcid;
    public static Material NitricOxide;
    public static Material Iron3Chloride;
    public static Material UraniumHexafluoride;
    public static Material EnrichedUraniumHexafluoride;
    public static Material DepletedUraniumHexafluoride;
    public static Material NitrousOxide;
    public static Material EnderPearl;
    public static Material PotassiumFeldspar;
    public static Material NeodymiumMagnetic;
    public static Material HydrochloricAcid;
    public static Material Steam;
    public static Material DistilledWater;
    public static Material SodiumPotassium;
    public static Material SamariumMagnetic;
    public static Material ManganesePhosphide;
    public static Material MagnesiumDiboride;
    public static Material MercuryBariumCalciumCuprate;
    public static Material UraniumTriplatinum;
    public static Material SamariumIronArsenicOxide;
    public static Material IndiumTinBariumTitaniumCuprate;
    public static Material UraniumRhodiumDinaquadide;
    public static Material EnrichedNaquadahTriniumEuropiumDuranide;
    public static Material RutheniumTriniumAmericiumNeutronate;
    public static Material PlatinumRaw;
    public static Material InertMetalMixture;
    public static Material RhodiumSulfate;
    public static Material RutheniumTetroxide;
    public static Material OsmiumTetroxide;
    public static Material IridiumChloride;
    public static Material FluoroantimonicAcid;
    public static Material TitaniumTrifluoride;
    public static Material CalciumPhosphide;
    public static Material IndiumPhosphide;
    public static Material BariumSulfide;
    public static Material TriniumSulfide;
    public static Material ZincSulfide;
    public static Material GalliumSulfide;
    public static Material AntimonyTrifluoride;
    public static Material EnrichedNaquadahSulfate;
    public static Material NaquadriaSulfate;
    public static Material Pyrochlore;

    /**
     * GCYM First Degree Materials 3000-3019
     */
    public static Material Stellite100;
    public static Material WatertightSteel;
    public static Material MaragingSteel300;
    public static Material HastelloyC276;
    public static Material HastelloyX;
    public static Material Trinaquadalloy;
    public static Material Zeron100;
    public static Material TitaniumCarbide;
    public static Material TantalumCarbide;
    public static Material MolybdenumDisilicide;

    /**
     * Organic chemistry
     */
    public static Material SiliconeRubber;
    public static Material RawRubber;
    public static Material RawStyreneButadieneRubber;
    public static Material StyreneButadieneRubber;
    public static Material PolyvinylAcetate;
    public static Material ReinforcedEpoxyResin;
    public static Material PolyvinylChloride;
    public static Material PolyphenyleneSulfide;
    public static Material GlycerylTrinitrate;
    public static Material Polybenzimidazole;
    public static Material Polydimethylsiloxane;
    public static Material Polyethylene;
    public static Material Epoxy;
    public static Material Polycaprolactam;
    public static Material Polytetrafluoroethylene;
    public static Material Sugar;
    public static Material Methane;
    public static Material Epichlorohydrin;
    public static Material Monochloramine;
    public static Material Chloroform;
    public static Material Cumene;
    public static Material Tetrafluoroethylene;
    public static Material Chloromethane;
    public static Material AllylChloride;
    public static Material Isoprene;
    public static Material Propane;
    public static Material Propene;
    public static Material Ethane;
    public static Material Butene;
    public static Material Butane;
    public static Material DissolvedCalciumAcetate;
    public static Material VinylAcetate;
    public static Material MethylAcetate;
    public static Material Ethenone;
    public static Material Tetranitromethane;
    public static Material Dimethylamine;
    public static Material Dimethylhydrazine;
    public static Material DinitrogenTetroxide;
    public static Material Dimethyldichlorosilane;
    public static Material Styrene;
    public static Material Butadiene;
    public static Material Dichlorobenzene;
    public static Material AceticAcid;
    public static Material Phenol;
    public static Material BisphenolA;
    public static Material VinylChloride;
    public static Material Ethylene;
    public static Material Benzene;
    public static Material Acetone;
    public static Material Glycerol;
    public static Material Methanol;
    public static Material Ethanol;
    public static Material Toluene;
    public static Material DiphenylIsophtalate;
    public static Material PhthalicAcid;
    public static Material Diaminobenzidine;
    public static Material Dichlorobenzidine;
    public static Material Nitrochlorobenzene;
    public static Material Chlorobenzene;
    public static Material Octane;
    public static Material EthylTertButylEther;
    public static Material Ethylbenzene;
    public static Material Naphthalene;
    public static Material Nitrobenzene;
    public static Material Cyclohexane;
    public static Material NitrosylChloride;
    public static Material CyclohexanoneOxime;
    public static Material Caprolactam;
    public static Material PlatinumSludgeResidue;
    public static Material PalladiumRaw;
    public static Material RarestMetalMixture;
    public static Material AmmoniumChloride;
    public static Material AcidicOsmiumSolution;
    public static Material RhodiumPlatedPalladium;
    public static Material Butyraldehyde;
    public static Material PolyvinylButyral;

    /**
     * Not possible to determine exact Components
     */
    public static Material WoodGas;
    public static Material WoodVinegar;
    public static Material WoodTar;
    public static Material CharcoalByproducts;
    public static Material Biomass;
    public static Material BioDiesel;
    public static Material FermentedBiomass;
    public static Material Creosote;
    public static Material Diesel;
    public static Material RocketFuel;
    public static Material Glue;
    public static Material Lubricant;
    public static Material McGuffium239;
    public static Material SeedOil;
    public static Material DrillingFluid;
    public static Material ConstructionFoam;

    public static Material Oil;
    public static Material OilHeavy;
    public static Material RawOil;
    public static Material OilLight;
    public static Material NaturalGas;
    public static Material SulfuricHeavyFuel;
    public static Material HeavyFuel;
    public static Material LightlyHydroCrackedHeavyFuel;
    public static Material SeverelyHydroCrackedHeavyFuel;
    public static Material LightlySteamCrackedHeavyFuel;
    public static Material SeverelySteamCrackedHeavyFuel;
    public static Material SulfuricLightFuel;
    public static Material LightFuel;
    public static Material LightlyHydroCrackedLightFuel;
    public static Material SeverelyHydroCrackedLightFuel;
    public static Material LightlySteamCrackedLightFuel;
    public static Material SeverelySteamCrackedLightFuel;
    public static Material SulfuricNaphtha;
    public static Material Naphtha;
    public static Material LightlyHydroCrackedNaphtha;
    public static Material SeverelyHydroCrackedNaphtha;
    public static Material LightlySteamCrackedNaphtha;
    public static Material SeverelySteamCrackedNaphtha;
    public static Material SulfuricGas;
    public static Material RefineryGas;
    public static Material LightlyHydroCrackedGas;
    public static Material SeverelyHydroCrackedGas;
    public static Material LightlySteamCrackedGas;
    public static Material SeverelySteamCrackedGas;
    public static Material HydroCrackedEthane;
    public static Material HydroCrackedEthylene;
    public static Material HydroCrackedPropene;
    public static Material HydroCrackedPropane;
    public static Material HydroCrackedButane;
    public static Material HydroCrackedButene;
    public static Material HydroCrackedButadiene;
    public static Material SteamCrackedEthane;
    public static Material SteamCrackedEthylene;
    public static Material SteamCrackedPropene;
    public static Material SteamCrackedPropane;
    public static Material SteamCrackedButane;
    public static Material SteamCrackedButene;
    public static Material SteamCrackedButadiene;
    public static Material LPG;

    public static Material RawGrowthMedium;
    public static Material SterileGrowthMedium;
    public static Material Bacteria;
    public static Material BacterialSludge;
    public static Material EnrichedBacterialSludge;
    public static Material Mutagen;
    public static Material GelatinMixture;
    public static Material RawGasoline;
    public static Material Gasoline;
    public static Material HighOctaneGasoline;
    public static Material CoalGas;
    public static Material CoalTar;
    public static Material Gunpowder;
    public static Material Oilsands;
    public static Material RareEarth;
    public static Material Stone;
    public static Material Lava;
    public static Material Glowstone;
    public static Material NetherStar;
    public static Material Endstone;
    public static Material Netherrack;
    public static Material CetaneBoostedDiesel;
    public static Material Collagen;
    public static Material Gelatin;
    public static Material Agar;
    public static Material Andesite;
    public static Material Milk;
    public static Material Cocoa;
    public static Material Wheat;
    public static Material Meat;
    public static Material Wood;
    public static Material TreatedWood;
    public static Material Paper;
    public static Material FishOil;
    public static Material RubySlurry;
    public static Material SapphireSlurry;
    public static Material GreenSapphireSlurry;
    public static Material DyeBlack;
    public static Material DyeRed;
    public static Material DyeGreen;
    public static Material DyeBrown;
    public static Material DyeBlue;
    public static Material DyePurple;
    public static Material DyeCyan;
    public static Material DyeLightGray;
    public static Material DyeGray;
    public static Material DyePink;
    public static Material DyeLime;
    public static Material DyeYellow;
    public static Material DyeLightBlue;
    public static Material DyeMagenta;
    public static Material DyeOrange;
    public static Material DyeWhite;

    public static Material ImpureEnrichedNaquadahSolution;
    public static Material EnrichedNaquadahSolution;
    public static Material AcidicEnrichedNaquadahSolution;
    public static Material EnrichedNaquadahWaste;
    public static Material ImpureNaquadriaSolution;
    public static Material NaquadriaSolution;
    public static Material AcidicNaquadriaSolution;
    public static Material NaquadriaWaste;
    public static Material Lapotron;
    public static Material UUMatter;

    /**
     * Second Degree Compounds
     */
    public static Material Glass;
    public static Material Perlite;
    public static Material Borax;
    public static Material Olivine;
    public static Material Opal;
    public static Material Amethyst;
    public static Material Lapis;
    public static Material Blaze;
    public static Material Apatite;
    public static Material BlackSteel;
    public static Material DamascusSteel;
    public static Material TungstenSteel;
    public static Material CobaltBrass;
    public static Material TricalciumPhosphate;
    public static Material GarnetRed;
    public static Material GarnetYellow;
    public static Material Marble;
    public static Material GraniteBlack;
    public static Material GraniteRed;
    public static Material VanadiumMagnetite;
    public static Material QuartzSand;
    public static Material Pollucite;
    public static Material Bentonite;
    public static Material FullersEarth;
    public static Material Pitchblende;
    public static Material Monazite;
    public static Material Mirabilite;
    public static Material Trona;
    public static Material Gypsum;
    public static Material Zeolite;
    public static Material Concrete;
    public static Material SteelMagnetic;
    public static Material VanadiumSteel;
    public static Material Potin;
    public static Material BorosilicateGlass;
    public static Material NaquadahAlloy;
    public static Material SulfuricNickelSolution;
    public static Material SulfuricCopperSolution;
    public static Material NitrationMixture;
    public static Material DilutedSulfuricAcid;
    public static Material DilutedHydrochloricAcid;
    public static Material Flint;
    public static Material Air;
    public static Material LiquidAir;
    public static Material NetherAir;
    public static Material LiquidNetherAir;
    public static Material EnderAir;
    public static Material LiquidEnderAir;
    public static Material AquaRegia;
    public static Material SaltWater;
    public static Material Clay;
    public static Material Redstone;
    public static Material HSLASteel;
    public static Material TitaniumTungstenCarbide;
    public static Material IncoloyMA956;


    /**
     * Third Degree Materials
     */
    public static Material Electrotine;
    public static Material EnderEye;
    public static Material Diatomite;
    public static Material RedSteel;
    public static Material BlueSteel;
    public static Material Basalt;
    public static Material GraniticMineralSand;
    public static Material Redrock;
    public static Material GarnetSand;
    public static Material HSSG;
    public static Material IridiumMetalResidue;
    public static Material Granite;
    public static Material Brick;
    public static Material Fireclay;
    public static Material Diorite;

    /**
     * Fourth Degree Materials
     */
    public static Material RedAlloy;
    public static Material BlueAlloy;
    public static Material BasalticMineralSand;
    public static Material HSSE;
    public static Material HSSS;

    /**
     * GTPI Other Materials
     */
    public static Material codeine;
    public static Material diphenylamine;
    public static Material phenothiazine;
    public static Material promethazine;
    public static Material ammoniumPerchlorate;
    public static Material potassiumPerchlorate;
    public static Material sodiumPerchlorate;
    public static Material sodiumChlorate;
    public static Material vanillylmandelicAcid;
    public static Material vanilglycolicAcid;
    public static Material vanillin;
    public static Material cupricHydrogenArsenite;
    public static Material sodiumCyanide;
    public static Material thoriumDioxide;
    public static Material sodiumMethoxide;
    public static Material nitrophenol2;
    public static Material nitrophenol4;
    public static Material aminophenol;
    public static Material paracetamol;
    public static Material phenylaceticAcid;
    public static Material phenylacetone;
    public static Material formylImpostramine;
    public static Material impostramineHydrochloride;
    public static Material oxalicAcid;
    public static Material hydroxyphenylethylpiperidine;
    public static Material phenylethylpiperidone;
    public static Material anilinophenylethylpiperidine;
    public static Material greganyl;
    public static Material cupricChloride;
    public static Material phthalicAnhydride;
    public static Material phthalimide;
    public static Material potassiumPhthalimide;
    public static Material glucose;
    public static Material fructose;
    public static Material levulinicAcid;
    public static Material methylLevulinate;
    public static Material methylChlorolevulinate;
    public static Material aminolevulinicAcid;
    public static Material sodiumFormate;
    public static Material dinitrodimethylbenzene;
    public static Material dimethylphenylenediamine;
    public static Material dimethylbenzimidazole;
    public static Material phosphorusPentachloride;
    public static Material cobaltChloride;
    public static Material sodiumNitrate;
    public static Material sodiumNitrite;
    public static Material zincSulfate;
    public static Material cobalaminMixture;
    public static Material cyanocobalamin;
    public static Material cobalamin;
    public static Material hydroxycobalamin;
    public static Material corundum;
    public static Material kelpDried;
    public static Material fusedSilica;

    /**
     * GTPI OreProc Materials
     */
    public static Material kelpAsh;
    public static Material kelpAshBrine;
    public static Material iodideBrine;
    public static Material cuprousIodide;
    public static Material sodiumIodide;
    public static Material sodiumIodate;
    public static Material hydroiodicAcid;
    public static Material trisodiumPhosphate;
    public static Material aluminiumChloride;
    public static Material redMud;
    public static Material digestedBauxiteSolution;
    public static Material aluminiumHydroxide;
    public static Material alumina;
    public static Material redMudPigIron;
    public static Material redMudTailings;
    public static Material scandiumRichConcentrate;
    public static Material scandia;
    public static Material scandiumFluoride;
    public static Material scandalloy;
    public static Material ferrochrome;
    public static Material potassiumCarbonate;
    public static Material potassiumChromate;
    public static Material chromia;
    public static Material potassiumSulfate;
    public static Material fluorite;
    public static Material fluorosilicicAcid;
    public static Material fluoroaluminicAcid;
    public static Material cryolite;
    public static Material ammoniumFluoride;
    public static Material ammoniumBifluoride;
    public static Material potassiumFluoride;
    public static Material vanadiumResidue;
    public static Material sodiumMetavanadate;
    public static Material vanadiumPentoxide;
    public static Material oleum;
    public static Material sodiumTungstate;
    public static Material calciumHydroxide;
    public static Material lithiumHydroxide;
    public static Material tungstenTrioxide;
    public static Material molybdeniteConcentrate;
    public static Material ammoniumMolybdate;
    public static Material goldDepletedMolybdenite;
    public static Material sodiumDicyanoaurate;
    public static Material goldDepletedMolybdeniteConcentrate;
    public static Material organicMolybdenumSolution;
    public static Material organicPerrhenateSolution;
    public static Material ammoniumPerrhenate;
    public static Material roastedCooperite;
    public static Material nickelDepletedCooperite;
    public static Material cooperiteSolution;
    public static Material platinumDepletedCooperiteSolution;
    public static Material silverRichResidue;
    public static Material leadAlloyedSilverRichResidue;
    public static Material leadSilverNitrates;
    public static Material leadSilverOxides;
    public static Material platinumGroupSludgeSolution;
    public static Material goldDepletedPlatinumGroupSludgeSolution;
    public static Material goldPlatinumDepletedPlatinumGroupSludgeSolution;
    public static Material insolublePlatinumGroupResidue;
    public static Material rhodiumDepletedInsolublePlatinumGroupResidue;
    public static Material rhodiumRutheniumOsmiumDepletedInsolublePlatinumGroupResidue;
    public static Material ammoniumHexachloroplatinate;
    public static Material ammoniumHexachloropalladate;
    public static Material tetraamminePalladiumChloride;
    public static Material crudeRhodium;
    public static Material sodiumHexachlororhodate;
    public static Material sodiumRuthenatePerosmateSolution;
    public static Material rutheniumOsmiumTetroxidesSolution;
    public static Material chlororuthenicAcid;
    public static Material ammoniumHexachlororuthenate;
    public static Material impureOsmiumTetroxide;
    public static Material sodiumOsmate;
    public static Material tetraammineOsmylChloride;
    public static Material chloroiridicAcid;
    public static Material ammoniumHexachloroiridate;
    public static Material ferrousChloride;
    public static Material sodiumOxide;
    public static Material sodiumPeroxide;
    public static Material sodiumAcetate;
    public static Material rhodiumChloride;
    public static Material rhodiumPhosphate;
    public static Material celestine;
    public static Material strontiumSulfide;
    public static Material witherite;
    public static Material strontianite;
    public static Material bariumOxide;
    public static Material strontiumOxide;
    public static Material bariumPeroxide;
    public static Material crudeNickel;
    public static Material nickelCarbonyl;
    public static Material cobaltCarbonyl;
    public static Material calciumMetasilicate;
    public static Material monoammoniumPhosphate;
    public static Material diammoniumPhosphate;
    public static Material urea;
    public static Material phosphorusTrichloride;
    public static Material hydrobromicAcid;
    public static Material zircon;
    public static Material zircaloy;
    public static Material mineralSand;
    public static Material ironDepletedMineralSand;
    public static Material ironGarnetDepletedMineralSand;
    public static Material ironGarnetMonaziteDepletedMineralSand;
    public static Material magnesiumHydroxide;
    public static Material beryl;
    public static Material berylliumSulfate;
    public static Material aluminiumSulfate;
    public static Material chromiumSulfate;
    public static Material berylliumHydroxide;
    public static Material ammoniumSulfate;
    public static Material ammoniumTetrafluoroberyllate;
    public static Material berylliumFluoride;
    public static Material magnesiumFluoride;
    public static Material sphaleriteConcentrate;
    public static Material sphaleriteResidue;
    public static Material galliumTrichloride;
    public static Material germaniumTetrachloride;
    public static Material indiumTrichloride;
    public static Material germaniumDioxide;
    public static Material lithiumPotassiumChloride;
    public static Material boronTrioxide;
    public static Material boronTrifluoride;
    public static Material lithiumHydride;
    public static Material lithiumTetrafluoroborate;
    public static Material diborane;
    public static Material semiconductorGradeBoron;
    public static Material sodiumFluoride;
    public static Material rareEarthThoriumHydroxides;
    public static Material rareEarthThoriumNitratesSolution;
    public static Material aqueousRareEarthsSolution;
    public static Material organicMediumHeavyRareEarthsSolution;
    public static Material aqueousLightRareEarthsSolution;
    public static Material organicHeavyRareEarthsSolution;
    public static Material aqueousMediumRareEarthsSolution;
    public static Material aqueousHeavyRareEarthsSolution;
    public static Material lanthanumNitrate;
    public static Material ceriumNitrate;
    public static Material praseodymiumNitrate;
    public static Material neodymiumNitrate;
    public static Material samariumNitrate;
    public static Material europiumNitrate;
    public static Material gadoliniumNitrate;
    public static Material terbiumNitrate;
    public static Material dysprosiumNitrate;
    public static Material holmiumNitrate;
    public static Material erbiumNitrate;
    public static Material thuliumNitrate;
    public static Material ytterbiumNitrate;
    public static Material lutetiumNitrate;
    public static Material yttriumNitrate;
    public static Material lanthana;
    public static Material ceria;
    public static Material praseodymia;
    public static Material neodymia;
    public static Material samaria;
    public static Material europia;
    public static Material gadolinia;
    public static Material terbia;
    public static Material dysprosia;
    public static Material holmia;
    public static Material erbia;
    public static Material thulia;
    public static Material ytterbia;
    public static Material lutetia;
    public static Material yttria;
    public static Material lanthanumFluoride;
    public static Material ceriumFluoride;
    public static Material praseodymiumFluoride;
    public static Material neodymiumFluoride;
    public static Material samariumFluoride;
    public static Material europiumFluoride;
    public static Material gadoliniumFluoride;
    public static Material terbiumFluoride;
    public static Material dysprosiumFluoride;
    public static Material holmiumFluoride;
    public static Material erbiumFluoride;
    public static Material thuliumFluoride;
    public static Material ytterbiumFluoride;
    public static Material lutetiumFluoride;
    public static Material yttriumFluoride;

    /**
     * GTPI Nuclear Materials
     */
    public static Material uraniniteConcentrate;
    public static Material organicUranylConcentrate;
    public static Material aqueousUraniniteWasteSolution;
    public static Material carnotiteConcentrate;
    public static Material aqueousCarnotiteWasteSolution;
    public static Material potassiumOrthovanadate;
    public static Material thorite;
    public static Material organicThoriumSolution;
    public static Material thoriumNitrate;
    public static Material sodiumUranylTricarbonate;
    public static Material yellowcake;
    public static Material radioactiveOreGases;
    public static Material radioactiveOreNobleGases;
    public static Material liquidRadioactiveOreNobleGases;
    public static Material organicUranylNitrateSolution;
    public static Material uraniumTrioxide;
    public static Material uraniumDioxide;
    public static Material uraniumTetrafluoride;
    public static Material supercriticalUraniumHexafluoride;
    public static Material highlyEnrichedUraniumHexafluoride;
    public static Material depletedUraniumTetrafluoride;
    public static Material highlyEnrichedUraniumTetrafluoride;
    public static Material lowEnrichedUranylFluoride;
    public static Material lowEnrichedUraniumDioxide;
    public static Material highlyEnrichedUranylFluoride;
    public static Material highlyEnrichedUraniumDioxide;
    public static Material highlyEnrichedUranylNitrate;
    public static Material thoriumTetrafluoride;
    public static Material leuFuelUnsintered;
    public static Material leuFuel;
    public static Material heuFuelUncalcined;
    public static Material heuFuelUnsintered;
    public static Material heuFuelUncoated;
    public static Material heuFuel;
    public static Material moxNpFuelUncalcined;
    public static Material moxNpFuelUnsintered;
    public static Material moxNpFuelUncoated;
    public static Material moxNpFuel;
    public static Material moxPuFuelUncalcined;
    public static Material moxPuFuelUnsintered;
    public static Material moxPuFuelUncoated;
    public static Material moxPuFuel;
    public static Material uraniumFuelSpent;
    public static Material neptuniumFuelSpent;
    public static Material plutoniumFuelSpent;
    public static Material voloxidatedSpentUraniumFuel;
    public static Material volatileFissionProducts;
    public static Material ammoniumMetavanadate;
    public static Material spentUraniumFuelSolution;
    public static Material organicPurexDecontaminatedSolution;
    public static Material aqueousPurexHighActivityWasteSolution;
    public static Material organicPurexNeptuniumDepletedSolution;
    public static Material aqueousPurexNeptuniumSolution;
    public static Material organicPurexNeptuniumTechnetiumDepletedSolution;
    public static Material aqueousPurexTechnetiumSolution;
    public static Material organicPurexUraniumSolution;
    public static Material aqueousPurexPlutoniumSolution;
    public static Material aqueousPurexNeptuniumProduct;
    public static Material aqueousPurexReducedNeptuniumProduct;
    public static Material neptuniumOxalate;
    public static Material neptuniumDioxide;
    public static Material neptuniumNitrate;
    public static Material ammoniumPertechnetate;
    public static Material pertechnetatePassivatedSteel;
    public static Material aqueousPurexPlutoniumProduct;
    public static Material plutoniumOxalate;
    public static Material plutoniumDioxide;
    public static Material plutoniumNitrate;
    public static Material aqueousPurexUraniumProduct;

    /**
     * GTPI Inorganic Materials
     */
    public static Material sodiumPersulfateSolution;
    public static Material ferricChlorideSolution;
    public static Material advancedSolderingAlloy;
    public static Material advancedLubricant;
    public static Material ferrofluid;
    public static Material unmagnetizedNeodymiumMagnet;
    public static Material unmagnetizedSamariumCobaltMagnet;
    public static Material praseodymiumRheniumCarbide;
    public static Material unmagnetizedPraseodymiumRheniumCarbide;
    public static Material bismuthStrontiumCalciumCuprate;
    public static Material thalliumBariumCalciumCuprate;
    public static Material impregnatedWoodChips;
    public static Material cookedWoodChips;
    public static Material woodPulp;
    public static Material bleachedPaper;
    public static Material nitrocellulose;
    public static Material trinitrotoluene;
    public static Material seawater;
    public static Material magnesiumDepletedseawater;
    public static Material magnesiumCalciumDepletedseawater;
    public static Material pretreatedWater;
    public static Material deionizedWater;
    public static Material sterileWater;
    public static Material ultraPureWater1;
    public static Material ozone;
    public static Material ozonatedWater;
    public static Material ultraPureWater2;
    public static Material ultraPureWater3;
    public static Material ultraPureWater4;
    public static Material potassiumSulfide;
    public static Material calciumSulfide;
    public static Material siliconCarbide;
    public static Material yttriaStabilizedZirconia;
    public static Material bismuthHydroxide;
    public static Material bismuthTrioxide;
    public static Material bismuthTitanate;
    public static Material liquidNitrogen;
    public static Material supercriticalSteam;
    public static Material supercriticalCarbonDioxide;
    public static Material hotSodiumPotassium;
    public static Material lithiumTetrafluoroberyllate;
    public static Material hotLithiumTetrafluoroberyllate;
    public static Material mesylicAcid;
    public static Material triflylFluoride;
    public static Material triflicAcid;
    public static Material lithiumNitride;
    public static Material lithiumBistriflimide;
    public static Material lithiumFluoride;
    public static Material bistriflimidicAcid;
    public static Material lithiumSulfate;
    public static Material semiconductorGradeSilicon;
    public static Material bufferedOxideEtch;
    public static Material piranhaSolution;
    public static Material bakelite;
    public static Material birmabright;
    public static Material udimet69420;
    public static Material sicSicMatrixComposite;
    public static Material tungstenTechnetium;
    public static Material duralloy;
    public static Material rheniumDiboride;
    public static Material rheniumDiborideCoatedDuralloy;
    public static Material regalohm62;


    /**
     * GTPI Organic Materials
     */
    public static Material tripropylene;
    public static Material nonylphenol;
    public static Material nonylphenolFormaldehydeResin;
    public static Material ethoxylatedNonylphenolFormaldehydeResin;
    public static Material desaltedOil;
    public static Material desaltedHeavyOil;
    public static Material desaltedRawOil;
    public static Material desaltedLightOil;
    public static Material oilDepletedBrine;
    public static Material atmosphericResidue;
    public static Material isobutane;
    public static Material isobutylene;
    public static Material dodecene;
    public static Material dodecane;
    public static Material isopropylAlcohol;
    public static Material chloromethanesMixture;
    public static Material dichloromethane;
    public static Material carbonTetrachloride;
    public static Material butanediol;
    public static Material butyrolactone;
    public static Material methylpyrrolidone;
    public static Material zincChloride;
    public static Material chlorohexane;
    public static Material methylimidazole;
    public static Material hexylmethylimidazoliumChloride;
    public static Material potassiumHexafluorophosphate;
    public static Material hexylmethylimidazoliumHexafluorophosphate;
    public static Material octylmethylimidazoliumChloride;
    public static Material octylmethylimidazoliumBistriflimide;
    public static Material ethylhydroxycaproaldehyde;
    public static Material ethylhexanol;
    public static Material diethylhexylphosphoricAcid;
    public static Material chlorooctane;
    public static Material trioctylphosphine;
    public static Material trioctylphosphineOxide;
    public static Material tributyl_phosphate;
    public static Material xyloseSolution;
    public static Material lignin;
    public static Material xylose;
    public static Material furfural;
    public static Material tetrahydrofurfurylAlcohol;
    public static Material trioctylamine;
    public static Material trioctylmethylammoniumChloride;
    public static Material tridecylamine;
    public static Material tridecylmethylammoniumChloride;
    public static Material aliquat366Nitrate;
    public static Material trioctylmethylammoniumHydroxide;
    public static Material trioctylmethylammoniumDiethylhexylphosphate;
    public static Material emulsionPolymerizationMixture;
    public static Material polypropylene;
    public static Material polymethylpentene;
    public static Material polystyrene;
    public static Material styreneDivinylbenzene;
    public static Material polyvinylAlcohol;
    public static Material caprylicAcid;
    public static Material perfluorooctanoylFluoride;
    public static Material perfluorooctanoicAcid;
    public static Material hexafluoropropylene;
    public static Material hexafluoropropyleneOxide;
    public static Material perfluorofluorosulfonylacetylFluoride;
    public static Material perfluorofluorosulfonylethoxypropoxypropanoylFluoride;
    public static Material perfluoroethenyloxypropanyloxyethanesulfonylFluoride;
    public static Material rawNafion;
    public static Material nafion;
    public static Material tetrachlorobutane;
    public static Material dichlorobutadiene;
    public static Material dimethoxybutadiene;
    public static Material sulfurDichloride;
    public static Material iodobutane;
    public static Material tetrabutylammoniumIodide;
    public static Material ethylenedioxythiophene;
    public static Material ferricSulfate;
    public static Material polyethylenedioxythiophenePolystyreneSulfonate;
    public static Material highlyConductivePedotPssSolution;
    public static Material iridiumDioxide;
    public static Material highlyConductivePedotPssFilmOnIridiumDioxide;
    public static Material resourcinol;
    public static Material dinitroresourcinol;
    public static Material diaminoresourcinol;
    public static Material tetratertbutyldiaminoresourcinol;
    public static Material orthoXylene;
    public static Material Dimethylbenzene;
    public static Material paraXylene;
    public static Material bistrichloromethylbenzene;
    public static Material terephthalicAcid;
    public static Material terephthaloylChloride;
    public static Material preZylon;
    public static Material zylon;
    public static Material ethylanthraquinone;
    public static Material hydrogenPeroxide;
    public static Material methylaminesMixture;
    public static Material trimethylamine;
    public static Material ethylaminesMixture;
    public static Material ethylamine;
    public static Material diethylamine;
    public static Material triethylamine;
    public static Material isopropylaminesMixture;
    public static Material isopropylamine;
    public static Material diisopropylamine;
    public static Material triisopropylamine;
    public static Material ethanolaminesMixture;
    public static Material ethanolamine;
    public static Material diethanolamine;
    public static Material triethanolamine;
    public static Material isopropanolaminesMixture;
    public static Material isopropanolamine;
    public static Material diisopropanolamine;
    public static Material triisopropanolamine;
    public static Material ethyleneOxide;
    public static Material propyleneOxide;
    public static Material dicyclopentadiene;
    public static Material tetrahydrodicyclopentadiene;
    public static Material adamantane;
    public static Material alkylatedAdamantanes;
    public static Material crudeAdvancedLubricant;
    public static Material propionaldehyde;
    public static Material propanol;
    public static Material isobutyraldehyde;
    public static Material butanol;
    public static Material valeraldehyde;
    public static Material pentanol;
    public static Material pentene;
    public static Material caproaldehyde;
    public static Material hexanol;
    public static Material hexene;
    public static Material enanthaldehyde;
    public static Material heptanol;
    public static Material heptene;
    public static Material caprylaldehyde;
    public static Material octanol;
    public static Material butyricAcid;
    public static Material isobutyricAcid;
    public static Material bromopropane;
    public static Material ethyleneGlycol;
    public static Material acetylene;
    public static Material ethylbenzenesMixture;
    public static Material diethylbenzene;
    public static Material divinylbenzene;
    public static Material acetylChloride;
    public static Material dimethoxymethane;
    public static Material zincBromide;
    public static Material chloromethylMethylEther;
    public static Material potassiumHydride;
    public static Material methylpentene;
    public static Material tetrapropylammoniumBromide;
    public static Material tetrapropylammoniumHydroxide;
    public static Material hydrogenLaurylSulfate;
    public static Material sodiumLaurylSulfate;
    public static Material sodiumBromide;
    public static Material triethylaluminium;
    public static Material ethylaluminiumDichloride;
    public static Material trialkylaluminiumMixture;
    public static Material fattyAlcoholsMixture;
    public static Material decanol;
    public static Material dodecanol;
    public static Material methylchlorosilanesMixture;
    public static Material methyltrichlorosilane;
    public static Material trimethylchlorosilane;
    public static Material tertbutanol;
    public static Material tertbutylChloride;
    public static Material tertbutyldimethylchlorosilane;
    public static Material siliconTetrachloride;
    public static Material tetraethylOrthosilicate;
    public static Material hydrazine;
    public static Material ascorbicAcid;
    public static Material dehydroascorbicAcid;
    public static Material phthalicAcid;
    public static Material lauricAcid;

    /**
     * GTPI Catalytic Materials
     */
    public static Material activatedCarbon;
    public static Material glassyCarbon;
    public static Material sodiumMetasilicate;
    public static Material silicaGel;
    public static Material activatedAlumina;
    public static Material sodiumAluminate;
    public static Material ZSM5;
    public static Material HZSM5;
    public static Material palladiumChloride;
    public static Material uncalcinedPalladiumOnAlumina;
    public static Material palladiumOnAlumina;
    public static Material rutheniumChloride;
    public static Material ceriumChloride;
    public static Material rutheniumCeriumOxidesCoatedNickel;
    public static Material titaniumButoxide;
    public static Material titaniaSilicaTpaohSolution;
    public static Material titaniumSilicalite;
    public static Material bismuthChloride;
    public static Material uncalcinedCopperBismuthOnSilica;
    public static Material copperBismuthOnSilica;
    public static Material palladiumOnCarbon;
    public static Material magnesiumEthoxide;
    public static Material zieglerNattaCatalyst;
    public static Material polystyreneCationExchangeResin;
    public static Material stannicChloride;
    public static Material chloromethylatedPolystyrene;
    public static Material polystyreneAnionExchangeResin;
    public static Material chloromethylatedStyreneDivinylbenzene;
    public static Material styreneDivinylbenzeneAnionExchangeResin;
    public static Material phosphotungsticAcid;
    public static Material cobaltAcetate;
    public static Material manganeseNitrate;
    public static Material manganeseCarbonate;
    public static Material ammoniumNitrate;
    public static Material manganeseAcetate;
    public static Material cupricNitrate;
    public static Material chromiumNitrate;
    public static Material unpyrolyzedCuCrMnNaCatalyst;
    public static Material uncalcinedCuCrMnNaCatalyst;
    public static Material cuCrMnNaCatalyst;
    public static Material nickelChloride;
    public static Material uncalcinedNickelPalladiumOnSilica;
    public static Material nickelPalladiumOnSilica;
    public static Material boricAcid;
    public static Material strontiumNitrate;
    public static Material uncalcinedEuropiumDopedStrontiumBorate;
    public static Material europiumDopedStrontiumBorate;
    public static Material rutheniumDisulfide;
    public static Material uncalcinedRutheniumDisulfideOnAlumina;
    public static Material rutheniumDisulfideOnAlumina;
    public static Material rutheniumDisulfideCoatedGlassyCarbon;
    public static Material nickelNitrate;
    public static Material zincNitrate;
    public static Material uncalcinedNickelDopedZincOxideOnHZSM5;
    public static Material nickelDopedZincOxideOnHZSM5;

}
