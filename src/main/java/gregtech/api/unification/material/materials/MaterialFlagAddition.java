package gregtech.api.unification.material.materials;

import gregtech.api.unification.material.properties.OreProperty;
import gregtech.api.unification.material.properties.PropertyKey;

import static gregtech.api.unification.material.Materials.*;

public class MaterialFlagAddition {

    public static void register() {
        OreProperty oreProp = Aluminium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Bauxite, Bauxite, Ilmenite, Rutile);
        oreProp.setWashedIn(sodiumPersulfateSolution);

        oreProp = Beryllium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Emerald, Emerald, thorite);

        oreProp = Cobalt.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CobaltOxide, Cobaltite);
        oreProp.setWashedIn(sodiumPersulfateSolution);

        oreProp = Copper.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cobaltite, Gold, Garnierite, Gold);
        oreProp.setWashedIn(Mercury);

        oreProp = Gold.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CupricOxide, Garnierite, Silver);
        oreProp.setWashedIn(Mercury);

        oreProp = Iron.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Garnierite, Cassiterite, Cassiterite, Gold);
        oreProp.setWashedIn(sodiumPersulfateSolution);

        oreProp = Lead.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Silver, Galena);

        oreProp = Lithium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(LithiumChloride);

        oreProp = Molybdenum.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Molybdenite);

        //oreProp = Magnesium.getProperty(PropertyKey.ORE);
        //oreProp.setOreByProducts(Olivine);

        //oreProp = Manganese.getProperty(PropertyKey.ORE);
        //oreProp.setOreByProducts(Chromite, Iron);
        //oreProp.setSeparatedInto(Iron);

        oreProp = Neodymium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(RareEarth);

        oreProp = Nickel.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cobaltite, Magnetite);
        oreProp.setSeparatedInto(Magnetite);
        oreProp.setWashedIn(Mercury);

        oreProp = Platinum.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pentlandite, Garnierite, Cobaltite);
        oreProp.setWashedIn(Mercury);

        oreProp = Plutonium239.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Uraninite, Galena, Uraninite);

        //oreProp = Silicon.getProperty(PropertyKey.ORE);
        //oreProp.setOreByProducts(SiliconDioxide);

        oreProp = Silver.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Galena, Galena, Silver, Gold);
        oreProp.setWashedIn(Mercury);

        oreProp = Sulfur.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Sulfur);

        oreProp = Thorium.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Uraninite, Galena, thorite);

        oreProp = Tin.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BandedIron, Sphalerite);
        oreProp.setSeparatedInto(BandedIron);
        oreProp.setWashedIn(sodiumPersulfateSolution);

        //oreProp = Titanium.getProperty(PropertyKey.ORE);
        //oreProp.setOreByProducts(Rutile, Ilmenite);

        //oreProp = Tungsten.getProperty(PropertyKey.ORE);
        //oreProp.setOreByProducts(Pyrolusite, Molybdenite);

        oreProp = Naquadah.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(strontianite, Barite);
        oreProp.setSeparatedInto(NaquadahEnriched);

        oreProp = CertusQuartz.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(NetherQuartz, Barite);

        oreProp = Almandine.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetRed, Aluminium);

        oreProp = Asbestos.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Diatomite, SiliconDioxide, Magnesia);

        oreProp = BlueTopaz.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Topaz);

        oreProp = BrownLimonite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Malachite, YellowLimonite);
        oreProp.setSeparatedInto(BandedIron);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = Calcite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Calcium, Calcium, Sodalite);

        oreProp = Cassiterite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cassiterite, Bismuth);
        oreProp.setDirectSmeltResult(Tin);

        oreProp = CassiteriteSand.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cassiterite);
        oreProp.setDirectSmeltResult(Tin);

        oreProp = Chalcopyrite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Cobaltite, Cadmium, Gold);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Copper);

        oreProp = Chromite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BandedIron, Magnesia, Chromite);
        oreProp.setSeparatedInto(BandedIron);

        oreProp = Cinnabar.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Redstone, Sulfur, Glowstone);

        oreProp = Coal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Coal, Coal, thorite);

        oreProp = Cobaltite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cobaltite, CobaltOxide);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Cobalt);

        oreProp = Cooperite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pentlandite, Pentlandite, Cobaltite, Cooperite);
        oreProp.setWashedIn(Mercury);

        oreProp = Diamond.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Graphite);

        oreProp = Emerald.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(beryl, alumina);

        oreProp = Galena.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Galena, Silver);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Lead);

        oreProp = Garnierite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Pentlandite);
        oreProp.setDirectSmeltResult(Nickel);

        oreProp = GreenSapphire.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(alumina, Sapphire);

        oreProp = Grossular.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetYellow, Calcite);

        oreProp = Ilmenite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BandedIron, Rutile);
        oreProp.setSeparatedInto(BandedIron);

        oreProp = Bauxite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Grossular, Rutile, Ilmenite);
        oreProp.setWashedIn(sodiumPersulfateSolution);

        oreProp = Lazurite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Sodalite, Lapis);

        oreProp = Magnesite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Magnesia, Magnesia, Cobaltite);

        oreProp = Magnetite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Magnetite, Gold);
        oreProp.setSeparatedInto(Gold);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = Molybdenite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Molybdenite, Pyrite, Quartzite);
        oreProp.setDirectSmeltResult(Molybdenum);

        oreProp = Pyrite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, TricalciumPhosphate, Pentlandite);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = Pyrolusite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrolusite, Tantalite, Niobium);
        oreProp.setDirectSmeltResult(Manganese);

        oreProp = Pyrope.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetRed, Magnesia);

        oreProp = Realgar.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Realgar, Stibnite, Barite);

        oreProp = RockSalt.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Salt, Borax);

        oreProp = Ruby.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Chromite, GarnetRed, Chromite);

        oreProp = Salt.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(RockSalt, Borax);

        oreProp = Saltpeter.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Saltpeter, RockSalt, Salt);

        oreProp = Sapphire.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(alumina, GreenSapphire);

        oreProp = Scheelite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrolusite, Molybdenite, Calcite);

        oreProp = Sodalite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Lazurite, Lapis);

        oreProp = Tantalite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrolusite, Niobium, Tantalite);

        oreProp = Spessartine.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetRed, Pyrolusite);

        oreProp = Sphalerite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetYellow, Sphalerite, Cadmium, Sphalerite);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Zinc);

        oreProp = Stibnite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(AntimonyTrioxide, Stibnite, Cinnabar);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Antimony);

        oreProp = Tetrahedrite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Stibnite, Sphalerite, Cadmium);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Copper);

        oreProp = Topaz.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BlueTopaz);

        oreProp = Tungstate.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrolusite, Silver, LithiumChloride);
        oreProp.setWashedIn(Mercury);

        oreProp = Uraninite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Uraninite, thorite, Silver);

        oreProp = YellowLimonite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Garnierite, BrownLimonite, CobaltOxide);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = NetherQuartz.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Quartzite);

        oreProp = Quartzite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(CertusQuartz, Barite);

        oreProp = Graphite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Graphite);

        oreProp = Bornite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Cobaltite, Cadmium, Gold);
        oreProp.setWashedIn(Mercury);
        oreProp.setDirectSmeltResult(Copper);

        oreProp = Chalcocite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Massicot, Silver);
        oreProp.setDirectSmeltResult(Copper);

        oreProp = Bastnasite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Neodymium, RareEarth);
        oreProp.setSeparatedInto(Neodymium);

        oreProp = Pentlandite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Sulfur, Cobalt);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Nickel);

        oreProp = Spodumene.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(alumina, LithiumChloride);

        oreProp = Lepidolite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(LithiumChloride, Caesium, Borax);

        oreProp = GlauconiteSand.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Salt, alumina, BandedIron);
        oreProp.setSeparatedInto(Iron);

        oreProp = Malachite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BrownLimonite, Calcite, Zincite);
        oreProp.setWashedIn(sodiumPersulfateSolution);
        oreProp.setDirectSmeltResult(Copper);

        oreProp = Olivine.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrope, Magnesia, Pyrolusite);

        oreProp = Opal.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Opal);

        oreProp = Amethyst.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Amethyst);

        oreProp = Lapis.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Lazurite, Sodalite, Pyrite);

        oreProp = Apatite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(TricalciumPhosphate, Phosphate, Pyrochlore);

        oreProp = TricalciumPhosphate.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Apatite, Phosphate, Pyrochlore);

        oreProp = GarnetRed.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Spessartine, Pyrope, Almandine);

        oreProp = GarnetYellow.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Andradite, Grossular, Uvarovite);

        oreProp = VanadiumMagnetite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Magnetite, Magnetite, vanadiumPentoxide);
        oreProp.setSeparatedInto(Gold);

        oreProp = Pollucite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Caesium, alumina, RockSalt);

        oreProp = Bentonite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(alumina, Calcite, Magnesia);

        oreProp = FullersEarth.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(alumina, SiliconDioxide, Magnesia);

        oreProp = Pitchblende.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(thorite, Uraninite, Galena);

        oreProp = Monazite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(thorite, Neodymium, RareEarth);
        oreProp.setSeparatedInto(Neodymium);

        oreProp = Redstone.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Cinnabar, RareEarth, Glowstone);

        oreProp = Diatomite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BandedIron, Sapphire);

        oreProp = GraniticMineralSand.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GraniteBlack, Magnetite);
        oreProp.setSeparatedInto(Gold);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = GarnetSand.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(GarnetRed, GarnetYellow);

        oreProp = BasalticMineralSand.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Basalt, Magnetite);
        oreProp.setSeparatedInto(Gold);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = BandedIron.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Magnetite, Calcite, Magnesia);
        oreProp.setSeparatedInto(Iron);
        oreProp.setDirectSmeltResult(Iron);

        oreProp = Wulfenite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Pyrite, Pyrolusite, Pyrolusite, Galena);

        oreProp = Soapstone.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(SiliconDioxide, Magnesia, Calcite, Talc);

        oreProp = Kyanite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Talc, alumina, SiliconDioxide);

        oreProp = Gypsum.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(SodaAsh, Calcite, Salt);

        oreProp = Talc.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Clay, Clay, Clay);

        oreProp = Powellite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(BandedIron, RockSalt, Molybdenite);

        oreProp = Trona.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(SodiumBicarbonate, SodaAsh, SodaAsh);

        oreProp = Mica.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(RockSalt, alumina);

        oreProp = Zeolite.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Calcite, SiliconDioxide, alumina);

        oreProp = Electrotine.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Redstone, Electrum, Diamond);

        oreProp = Pyrochlore.getProperty(PropertyKey.ORE);
        oreProp.setOreByProducts(Apatite, Calcite, Niobium);
    }
}
