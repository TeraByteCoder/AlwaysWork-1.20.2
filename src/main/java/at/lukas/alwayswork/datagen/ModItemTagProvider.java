package at.lukas.alwayswork.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import at.lukas.alwayswork.block.ModBlocks;
import at.lukas.alwayswork.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MITHRIL_HELMET, ModItems.MITHRIL_CHESTPLATE, ModItems.MITHRIL_LEGGINGS, ModItems.MITHRIL_BOOTS)
                .add(ModItems.INFERNITE_HELMET, ModItems.INFERNITE_CHESTPLATE, ModItems.INFERNITE_LEGGINGS, ModItems.INFERNITE_BOOTS)
                .add(ModItems.VIBRANIUM_HELMET, ModItems.VIBRANIUM_CHESTPLATE, ModItems.VIBRANIUM_LEGGINGS, ModItems.VIBRANIUM_BOOTS);
    }
}
