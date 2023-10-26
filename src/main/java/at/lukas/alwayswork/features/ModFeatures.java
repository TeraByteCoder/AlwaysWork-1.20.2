package at.lukas.alwayswork.features;

import at.lukas.alwayswork.AlwaysWork;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModFeatures
{
    public static final RegistryKey<PlacedFeature> MITHRRIL = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AlwaysWork.MOD_ID,"ore_mithril"));
    public static final RegistryKey<PlacedFeature> INFERNITE = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AlwaysWork.MOD_ID,"ore_infernite"));
    public static final RegistryKey<PlacedFeature> ENDERALD = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AlwaysWork.MOD_ID,"ore_enderald"));

    //public static final RegistryKey<Biome> OBSIDIAN_SPIKES = RegistryKey.of(RegistryKeys.BIOME, new Identifier(AlwaysWork.MOD_ID,"obsidian_spikes"));


    public static void registerFeatures()
    {
        AlwaysWork.LOGGER.info("Registering Features " + AlwaysWork.MOD_ID);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, MITHRRIL);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, INFERNITE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, ENDERALD);
        //TheEndBiomes.addSmallIslandsBiome(OBSIDIAN_SPIKES, 20);
    }
}
