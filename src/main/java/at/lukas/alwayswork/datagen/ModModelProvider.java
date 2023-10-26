package at.lukas.alwayswork.datagen;

import at.lukas.alwayswork.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import at.lukas.alwayswork.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFERNITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIBRANIUM_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {

        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MITHRIL_BOOTS));
        itemModelGenerator.register(ModItems.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.INFERNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_INFERNITE, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INFERNITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INFERNITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INFERNITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.INFERNITE_BOOTS));
        itemModelGenerator.register(ModItems.INFERNITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFERNITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFERNITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFERNITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFERNITE_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ENDERALD, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERALD_BOOTS));
        itemModelGenerator.register(ModItems.ENDERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERALD_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.VIBRANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_VIBRANIUM, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIBRANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIBRANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIBRANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VIBRANIUM_BOOTS));
        itemModelGenerator.register(ModItems.VIBRANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIBRANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIBRANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIBRANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIBRANIUM_HOE, Models.HANDHELD);





    }
}
