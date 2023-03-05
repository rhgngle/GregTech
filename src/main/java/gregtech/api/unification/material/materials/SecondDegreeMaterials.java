package gregtech.api.unification.material.materials;

import gregtech.api.GTValues;
import gregtech.api.fluids.fluidType.FluidTypes;
import gregtech.api.unification.material.Material;
import gregtech.api.unification.material.info.MaterialIconSet;
import gregtech.api.unification.material.properties.BlastProperty;
import gregtech.api.unification.material.properties.BlastProperty.GasTier;
import gregtech.api.unification.material.properties.PropertyKey;
import gregtech.api.unification.material.properties.ToolProperty;
import net.minecraft.init.Enchantments;

import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.info.MaterialFlags.*;
import static gregtech.api.unification.material.info.MaterialIconSet.*;

public class SecondDegreeMaterials {

    public static void register() {

        Glass = new Material.Builder(2000, "glass")
                .gem(0).fluid()
                .color(0xFAFAFA).iconSet(GLASS)
                .flags(GENERATE_LENS, NO_SMASHING, EXCLUDE_BLOCK_CRAFTING_RECIPES)
                .components(SiliconDioxide, 1)
                .fluidTemp(1200)
                .build();

        Perlite = new Material.Builder(2001, "perlite")
                .dust(1)
                .color(0x1E141E)
                .components(Obsidian, 2, Water, 1)
                .build();

        Borax = new Material.Builder(2002, "borax")
                .ore().dust(1)
                .color(0xFAFAFA).iconSet(FINE)
                .build()
                .setFormula("Na2B4O5(OH)4(H2O)8", true);

        SaltWater = new Material.Builder(2003, "salt_water")
                .fluid()
                .color(0x0000C8)
                .components(Salt, 1, Water, 1)
                .build();

        Olivine = new Material.Builder(2004, "olivine")
                .gem().ore(2, 1)
                .color(0x96FF96).iconSet(RUBY)
                .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(Magnesium, 1, Iron, 1, Silicon, 1, Oxygen, 4)
                .build();

        Opal = new Material.Builder(2005, "opal")
                .gem().ore()
                .color(0x0000FF).iconSet(OPAL)
                .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(SiliconDioxide, 1)
                .build();

        Amethyst = new Material.Builder(2006, "amethyst")
                .gem(3).ore()
                .color(0xD232D2).iconSet(RUBY)
                .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(SiliconDioxide, 4, Iron, 1)
                .build();

        Lapis = new Material.Builder(2007, "lapis")
                .gem(1).ore(6, 4)
                .color(0x4646DC).iconSet(LAPIS)
                .flags(NO_SMASHING, NO_SMELTING, CRYSTALLIZABLE, NO_WORKING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        GENERATE_PLATE, GENERATE_ROD)
                .components(Lazurite, 12, Sodalite, 2, Pyrite, 1, Calcite, 1)
                .build();

        Blaze = new Material.Builder(2008, "blaze")
                .dust(1).fluid()
                .color(0xFFC800, false).iconSet(FINE)
                .flags(NO_SMELTING, MORTAR_GRINDABLE, GENERATE_SPRING, GENERATE_FINE_WIRE) //todo burning flag
                .cableProperties(GTValues.V[ULV], 2, 2)
                .fluidTemp(4000)
                .build();

        // Free ID 2009

        Apatite = new Material.Builder(2010, "chloroapatite")
                .gem(1).ore(4, 2)
                .color(0xC8C8FF).iconSet(DIAMOND)
                .flags(NO_SMASHING, NO_SMELTING, CRYSTALLIZABLE, GENERATE_BOLT_SCREW)
                .build()
                .setFormula("Ca5(PO4)3Cl", true);

        BlackSteel = new Material.Builder(2011, "black_steel")
                .ingot().fluid()
                .color(0x646464).iconSet(METALLIC)
                .flags(EXT_METAL, GENERATE_FINE_WIRE, GENERATE_GEAR, GENERATE_FRAME)
                .components(Nickel, 1, BlackBronze, 1, Steel, 3)
                .cableProperties(GTValues.V[4], 3, 2)
                .blastTemp(1200, GasTier.LOW)
                .build();

        DamascusSteel = new Material.Builder(2012, "damascus_steel")
                .ingot(3).fluid()
                .color(0x6E6E6E).iconSet(METALLIC)
                .flags(EXT_METAL)
                .components(Steel, 1)
                .toolStats(ToolProperty.Builder.of(6.0F, 4.0F, 1024, 3)
                        .attackSpeed(0.3F).enchantability(33)
                        .enchantment(Enchantments.LOOTING, 3)
                        .enchantment(Enchantments.FORTUNE, 3).build())
                .blastTemp(1500, GasTier.LOW)
                .build();

        TungstenSteel = new Material.Builder(2013, "tungsten_steel")
                .ingot(4).fluid()
                .color(0x6464A0).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_DENSE, GENERATE_FRAME, GENERATE_SPRING, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_GEAR)
                .components(Steel, 1, Tungsten, 1)
                .toolStats(ToolProperty.Builder.of(9.0F, 7.0F, 2048, 4)
                        .enchantability(14).build())
                .fluidPipeProperties(3587, 225, true)
                .blastTemp(3000, GasTier.MID, GTValues.VA[EV], 1000)
                .build();

        CobaltBrass = new Material.Builder(2014, "cobalt_brass")
                .ingot().fluid()
                .color(0xB4B4A0).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_GEAR)
                .components(Brass, 7, Aluminium, 1, Cobalt, 1)
                .toolStats(ToolProperty.Builder.of(2.5F, 2.0F, 1024, 2)
                        .attackSpeed(-0.2F).enchantability(5).build())
                .rotorStats(8.0f, 2.0f, 256)
                .itemPipeProperties(2048, 1)
                .fluidTemp(1202)
                .build();

        TricalciumPhosphate = new Material.Builder(2015, "tricalcium_phosphate")
                .dust().ore(3, 1)
                .color(0xFFFF00).iconSet(FLINT)
                .flags(NO_SMASHING, NO_SMELTING, FLAMMABLE, EXPLOSIVE)
                .build()
                .setFormula("Ca3(PO4)2", true);

        GarnetRed = new Material.Builder(2016, "garnet_red")
                .gem().ore(4, 1)
                .color(0xC85050).iconSet(RUBY)
                .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(Pyrope, 3, Almandine, 5, Spessartine, 8)
                .build();

        GarnetYellow = new Material.Builder(2017, "garnet_yellow")
                .gem().ore(4, 1)
                .color(0xC8C850).iconSet(RUBY)
                .flags(EXT_METAL, NO_SMASHING, NO_SMELTING, HIGH_SIFTER_OUTPUT)
                .components(Andradite, 5, Grossular, 8, Uvarovite, 3)
                .build();

        Marble = new Material.Builder(2018, "marble")
                .dust()
                .color(0xC8C8C8).iconSet(ROUGH)
                .flags(NO_SMASHING)
                .components(Magnesia, 1, Calcite, 7)
                .build();

        GraniteBlack = new Material.Builder(2019, "granite_black")
                .dust()
                .color(0x0A0A0A).iconSet(ROUGH)
                .flags(NO_SMASHING)
                .components(SiliconDioxide, 4, Biotite, 1)
                .build();

        GraniteRed = new Material.Builder(2020, "granite_red")
                .dust()
                .color(0xFF0080).iconSet(ROUGH)
                .flags(NO_SMASHING)
                .components(Aluminium, 2, PotassiumFeldspar, 1, Oxygen, 3)
                .build();

        // Free ID 2021

        VanadiumMagnetite = new Material.Builder(2022, "vanadium_magnetite")
                .dust().ore()
                .color(0x23233C).iconSet(METALLIC)
                .build()
                .setFormula("(Fe3O4)(V2O5)", true);

        QuartzSand = new Material.Builder(2023, "quartz_sand")
                .dust(1)
                .color(0xC8C8C8).iconSet(SAND)
                .components(CertusQuartz, 1, Quartzite, 1)
                .build();

        Pollucite = new Material.Builder(2024, "pollucite")
                .dust().ore()
                .color(0xF0D2D2)
                .components(Caesium, 2, Aluminium, 2, Silicon, 4, Oxygen, 12, Water, 2)
                .build();

        // Free ID 2025

        Bentonite = new Material.Builder(2026, "bentonite")
                .dust().ore(3, 1)
                .color(0xF5D7D2).iconSet(ROUGH)
                .build()
                .setFormula("NaMg6Si12O29(OH)3(H2O)5", true);

        FullersEarth = new Material.Builder(2027, "fullers_earth")
                .dust().ore(2, 1)
                .color(0xA0A078).iconSet(FINE)
                .build()
                .setFormula("MgSi4O8(OH)2(H2O)4", true);

        Pitchblende = new Material.Builder(2028, "uraninite")
                .dust(3).ore(true)
                .color(0xC8D200)
                .components(Uranium238, 1, Oxygen, 2)
                .build();

        Monazite = new Material.Builder(2029, "monazite")
                .dust().ore(4, 2, true)
                .color(0x324632).iconSet(SAND)
                .build()
                .setFormula("RE3Th3(PO4)7", true);

        Mirabilite = new Material.Builder(2030, "mirabilite")
                .dust()
                .color(0xF0FAD2)
                .components(Sodium, 2, Sulfur, 1, Oxygen, 4, Water, 10)
                .build();

        Trona = new Material.Builder(2031, "trona")
                .dust(1).ore(2, 1)
                .color(0x87875F).iconSet(METALLIC)
                .build()
                .setFormula("(Na2CO3)(NaHCO3)(H2O)", true);

        Gypsum = new Material.Builder(2032, "gypsum")
                .dust(1).ore()
                .color(0xE6E6FA)
                .components(Calcium, 1, Sulfur, 1, Oxygen, 4, Water, 2)
                .build();

        Zeolite = new Material.Builder(2033, "zeolite")
                .dust().ore(3, 1)
                .color(0xF0E6E6)
                .components(Sodium, 1, Calcium, 4, Silicon, 27, Aluminium, 9, Oxygen, 72, Water, 28)
                .build();

        Concrete = new Material.Builder(2034, "concrete")
                .dust().fluid()
                .color(0x646464).iconSet(ROUGH)
                .flags(NO_SMASHING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES)
                .components(Stone, 1)
                .fluidTemp(286)
                .build();

        SteelMagnetic = new Material.Builder(2035, "steel_magnetic")
                .ingot()
                .color(0x808080).iconSet(MAGNETIC)
                .flags(GENERATE_ROD, IS_MAGNETIC)
                .components(Steel, 1)
                .ingotSmeltInto(Steel)
                .arcSmeltInto(Steel)
                .macerateInto(Steel)
                .build();
        Steel.getProperty(PropertyKey.INGOT).setMagneticMaterial(SteelMagnetic);

        VanadiumSteel = new Material.Builder(2036, "vanadium_steel")
                .ingot(3).fluid()
                .color(0xc0c0c0).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_GEAR)
                .components(Vanadium, 1, Chrome, 1, Steel, 7)
                .toolStats(ToolProperty.Builder.of(3.0F, 3.0F, 1536, 3)
                        .attackSpeed(-0.2F).enchantability(5).build())
                .rotorStats(7.0f, 3.0f, 1920)
                .fluidPipeProperties(2073, 50, true, true, false, false)
                .blastTemp(1453, GasTier.LOW)
                .fluidTemp(2073)
                .build();

        Potin = new Material.Builder(2037, "potin")
                .ingot().fluid()
                .color(0xc99781).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_GEAR, GENERATE_BOLT_SCREW)
                .components(Copper, 6, Tin, 2, Lead, 1)
                .fluidPipeProperties(1456, 32, true)
                .fluidTemp(1084)
                .build();

        BorosilicateGlass = new Material.Builder(2038, "borosilicate_glass")
                .ingot(1).fluid()
                .color(0xE6F3E6).iconSet(SHINY)
                .flags(GENERATE_PLATE, GENERATE_FINE_WIRE)
                .fluidTemp(1921)
                .build()
                .setFormula("(SiO2)(B2O3)", true);

        Andesite = new Material.Builder(2039, "andesite")
                .dust()
                .color(0xBEBEBE).iconSet(ROUGH)
                .components(Asbestos, 4, Saltpeter, 1)
                .build();

        // FREE ID 2040

        // FREE ID 2041

        NaquadahAlloy = new Material.Builder(2042, "naquadah_alloy")
                .ingot(5).fluid()
                .color(0x282828).iconSet(METALLIC)
                .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_FRAME)
                .components(Naquadah, 2, Osmiridium, 1, Trinium, 1)
                .cableProperties(GTValues.V[8], 2, 4)
                .blastTemp(7200, GasTier.HIGH, VA[LuV], 1000)
                .build();

        SulfuricNickelSolution = new Material.Builder(2043, "sulfuric_nickel_solution")
                .fluid(FluidTypes.ACID)
                .color(0x3EB640)
                .components(Nickel, 1, Oxygen, 1, SulfuricAcid, 1)
                .build();

        SulfuricCopperSolution = new Material.Builder(2044, "sulfuric_copper_solution")
                .fluid(FluidTypes.ACID)
                .color(0x48A5C0)
                .components(Copper, 1, Oxygen, 1, SulfuricAcid, 1)
                .build();

        // Fre ID 2045

        NitrationMixture = new Material.Builder(2046, "nitration_mixture")
                .fluid(FluidTypes.ACID)
                .color(0xE6E2AB)
                .components(NitricAcid, 1, SulfuricAcid, 1)
                .build();

        DilutedSulfuricAcid = new Material.Builder(2047, "diluted_sulfuric_acid")
                .fluid(FluidTypes.ACID)
                .color(0xC07820)
                .components(SulfuricAcid, 1, Water, 1)
                .build();

        DilutedHydrochloricAcid = new Material.Builder(2048, "diluted_hydrochloric_acid")
                .fluid(FluidTypes.ACID)
                .color(0x99A7A3)
                .components(HydrochloricAcid, 1, Water, 1)
                .build();

        Flint = new Material.Builder(2049, "flint")
                .gem(1)
                .color(0x002040).iconSet(FLINT)
                .flags(NO_SMASHING, MORTAR_GRINDABLE)
                .components(SiliconDioxide, 1)
                .toolStats(ToolProperty.Builder.of(0.0F, 1.0F, 64, 1)
                        .enchantability(5).ignoreCraftingTools()
                        .enchantment(Enchantments.FIRE_ASPECT, 2).build())
                .build();

        Air = new Material.Builder(2050, "air")
                .fluid(FluidTypes.GAS)
                .color(0xA9D0F5)
                .components(Nitrogen, 78, Oxygen, 21, Argon, 9)
                .build();

        LiquidAir = new Material.Builder(2051, "liquid_air")
                .fluid()
                .color(0xA9D0F5)
                .components(Nitrogen, 70, Oxygen, 22, CarbonDioxide, 5, Helium, 2, Argon, 1, Ice, 1)
                .fluidTemp(79)
                .build();

        NetherAir = new Material.Builder(2052, "nether_air")
                .fluid(FluidTypes.GAS)
                .color(0x4C3434)
                .components(CarbonMonoxide, 78, HydrogenSulfide, 21, Neon, 9)
                .build();

        LiquidNetherAir = new Material.Builder(2053, "liquid_nether_air")
                .fluid()
                .color(0x4C3434)
                .components(CarbonMonoxide, 144, CoalGas, 20, HydrogenSulfide, 15, SulfurDioxide, 15, Helium3, 5, Neon, 1, Ash, 1)
                .fluidTemp(58)
                .build();

        EnderAir = new Material.Builder(2054, "ender_air")
                .fluid(FluidTypes.GAS)
                .color(0x283454)
                .components(NitrogenDioxide, 78, Deuterium, 21, Xenon, 9)
                .build();

        LiquidEnderAir = new Material.Builder(2055, "liquid_ender_air")
                .fluid()
                .color(0x283454)
                .components(NitrogenDioxide, 122, Deuterium, 50, Helium, 15, Tritium, 10, Krypton, 1, Xenon, 1, Radon, 1, EnderPearl, 1)
                .fluidTemp(36)
                .build();

        AquaRegia = new Material.Builder(2056, "aqua_regia")
                .fluid(FluidTypes.ACID)
                .color(0xFFB132)
                .components(NitricAcid, 1, HydrochloricAcid, 2)
                .build();

        PlatinumSludgeResidue = new Material.Builder(2057, "platinum_sludge_residue")
                .dust()
                .color(0x827951)
                .components(SiliconDioxide, 2, Gold, 3)
                .build();

        PalladiumRaw = new Material.Builder(2058, "palladium_raw")
                .dust()
                .color(Palladium.getMaterialRGB()).iconSet(METALLIC)
                .components(Palladium, 1, Ammonia, 1)
                .build();

        RarestMetalMixture = new Material.Builder(2059, "rarest_metal_mixture")
                .dust()
                .color(0x832E11).iconSet(SHINY)
                .components(Iridium, 1, Osmium, 1, Oxygen, 4, Water, 1)
                .build();

        AmmoniumChloride = new Material.Builder(2060, "ammonium_chloride")
                .dust()
                .color(0x9711A6)
                .components(Ammonia, 1, HydrochloricAcid, 1)
                .build()
                .setFormula("NH4Cl", true);

        AcidicOsmiumSolution = new Material.Builder(2061, "acidic_osmium_solution")
                .fluid(FluidTypes.ACID)
                .color(0xA3AA8A)
                .build()
                .setFormula("(H2RuCl6)(OsO4)(NaCl)(Cl)(H2O)", true);

        RhodiumPlatedPalladium = new Material.Builder(2062, "rhodium_plated_palladium")
                .ingot()
                .color(0xDAC5C5).iconSet(SHINY)
                .flags(EXT2_METAL, GENERATE_ROTOR, GENERATE_DENSE, GENERATE_SMALL_GEAR, NO_UNIFICATION)
                //.blastTemp(4500, GasTier.HIGH, VA[IV], 1200)
                .build()
                .setFormula("PdRh", true);

        Clay = new Material.Builder(2063, "clay")
                .dust(1)
                .color(0xC8C8DC).iconSet(ROUGH)
                .flags(MORTAR_GRINDABLE, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES)
                .components(Sodium, 2, Lithium, 1, Aluminium, 2, Silicon, 2, Water, 6)
                .build();

        Redstone = new Material.Builder(2064, "redstone")
                .dust().ore(5, 1, true).fluid()
                .color(0xC80000).iconSet(ROUGH)
                .flags(GENERATE_PLATE, NO_SMASHING, NO_SMELTING, EXCLUDE_BLOCK_CRAFTING_BY_HAND_RECIPES,
                        EXCLUDE_PLATE_COMPRESSOR_RECIPE)
                .components(Silicon, 1, Pyrite, 5, Ruby, 1, Mercury, 3)
                .fluidTemp(500)
                .build();

        HSLASteel = new Material.Builder(3020, "hsla_steel")
                .ingot().fluid()
                .color(0x808080).iconSet(MaterialIconSet.METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_FRAME)
                .components(Invar, 2, Vanadium, 1, Titanium, 1, Molybdenum, 1)
                .blastTemp(1711, BlastProperty.GasTier.LOW, GTValues.VA[GTValues.HV], 1000)
                .build();

        TitaniumTungstenCarbide = new Material.Builder(3021, "titanium_tungsten_carbide")
                .ingot().fluid()
                .color(0x800D0D).iconSet(MaterialIconSet.METALLIC)
                .flags(GENERATE_PLATE, NO_UNIFICATION)
                .components(TungstenCarbide, 1, TitaniumCarbide, 2)
                .blastTemp(3800, BlastProperty.GasTier.HIGH, GTValues.VA[GTValues.EV], 1000)
                .build();

        IncoloyMA956 = new Material.Builder(3022, "incoloy_ma_956")
                .ingot().fluid()
                .color(0x37BF7E).iconSet(MaterialIconSet.METALLIC)
                .flags(GENERATE_PLATE, GENERATE_ROD, GENERATE_FRAME, GENERATE_ROTOR, GENERATE_BOLT_SCREW, GENERATE_GEAR, GENERATE_SMALL_GEAR)
                .components(VanadiumSteel, 4, Manganese, 2, Aluminium, 5, Yttrium, 2)
                .blastTemp(3625, BlastProperty.GasTier.MID, GTValues.VA[GTValues.EV], 800)
                .rotorStats(7.0f, 3.0f, 2560)
                .build();

    }
}
