package at.lukas.alwayswork.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import at.lukas.alwayswork.block.ModBlocks;
import at.lukas.alwayswork.util.ModTags;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.INFERNITE_ORE)
                .add(ModBlocks.ENDERALD_ORE)
                .add(ModBlocks.VIBRANIUM_ORE)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.INFERNITE_ORE)
                .add(ModBlocks.ENDERALD_ORE)
                ;
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                .add(ModBlocks.VIBRANIUM_ORE)
                ;
    }
}
