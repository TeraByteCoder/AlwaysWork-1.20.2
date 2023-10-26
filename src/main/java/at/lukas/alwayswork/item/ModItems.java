package at.lukas.alwayswork.item;

import at.lukas.alwayswork.AlwaysWork;
import at.lukas.alwayswork.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import at.lukas.alwayswork.block.ModBlocks;
import at.lukas.alwayswork.entity.ModEntities;
import at.lukas.alwayswork.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item(new FabricItemSettings()));
    public static final Item RAW_INFERNITE = registerItem("raw_infernite",
            new Item(new FabricItemSettings()));
    public static final Item RAW_VIBRANIUM = registerItem("raw_vibranium",
            new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot",
            new Item(new FabricItemSettings()));
    public static final Item INFERNITE_INGOT = registerItem("infernite_ingot",
            new Item(new FabricItemSettings()));
    public static final Item VIBRANIUM_INGOT = registerItem("vibranium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ModArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item INFERNITE_HELMET = registerItem("infernite_helmet",
            new ModArmorItem(ModArmorMaterials.INFERNITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item INFERNITE_CHESTPLATE = registerItem("infernite_chestplate",
            new ArmorItem(ModArmorMaterials.INFERNITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item INFERNITE_LEGGINGS = registerItem("infernite_leggings",
            new ArmorItem(ModArmorMaterials.INFERNITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item INFERNITE_BOOTS = registerItem("infernite_boots",
            new ArmorItem(ModArmorMaterials.INFERNITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item VIBRANIUM_HELMET = registerItem("vibranium_helmet",
            new ModArmorItem(ModArmorMaterials.VIBRANIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item VIBRANIUM_CHESTPLATE = registerItem("vibranium_chestplate",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item VIBRANIUM_LEGGINGS = registerItem("vibranium_leggings",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item VIBRANIUM_BOOTS = registerItem("vibranium_boots",
            new ArmorItem(ModArmorMaterials.VIBRANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new PickaxeItem(ModToolMaterial.MITHRIL, 5, 2f, new FabricItemSettings()));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new AxeItem(ModToolMaterial.MITHRIL, 9, 1f, new FabricItemSettings()));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterial.MITHRIL, 5, 0f, new FabricItemSettings()));
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterial.MITHRIL, 10, 5f, new FabricItemSettings()));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new HoeItem(ModToolMaterial.MITHRIL, 2, 0f, new FabricItemSettings()));

    public static final Item INFERNITE_PICKAXE = registerItem("infernite_pickaxe",
            new PickaxeItem(ModToolMaterial.INFERNITE, 5, 2f, new FabricItemSettings()));
    public static final Item INFERNITE_AXE = registerItem("infernite_axe",
            new AxeItem(ModToolMaterial.INFERNITE, 9, 1f, new FabricItemSettings()));
    public static final Item INFERNITE_SHOVEL = registerItem("infernite_shovel",
            new ShovelItem(ModToolMaterial.INFERNITE, 5, 0f, new FabricItemSettings()));
    public static final Item INFERNITE_SWORD = registerItem("infernite_sword",
            new SwordItem(ModToolMaterial.INFERNITE, 10, 5f, new FabricItemSettings()));
    public static final Item INFERNITE_HOE = registerItem("infernite_hoe",
            new HoeItem(ModToolMaterial.INFERNITE, 2, 0f, new FabricItemSettings()));

    public static final Item VIBRANIUM_PICKAXE = registerItem("vibranium_pickaxe",
            new PickaxeItem(ModToolMaterial.VIBRANIUM, 6, 2f, new FabricItemSettings()));
    public static final Item VIBRANIUM_AXE = registerItem("vibranium_axe",
            new AxeItem(ModToolMaterial.INFERNITE, 15, 1f, new FabricItemSettings()));
    public static final Item VIBRANIUM_SHOVEL = registerItem("vibranium_shovel",
            new ShovelItem(ModToolMaterial.INFERNITE, 6, 0f, new FabricItemSettings()));
    public static final Item VIBRANIUM_SWORD = registerItem("vibranium_sword",
            new SwordItem(ModToolMaterial.INFERNITE, 13, 5f, new FabricItemSettings()));
    public static final Item VIBRANIUM_HOE = registerItem("vibranium_hoe",
            new HoeItem(ModToolMaterial.INFERNITE, 2, 0f, new FabricItemSettings()));
    public static final Item ENDERALD = registerItem("enderald",
            new Item(new FabricItemSettings()));

    public static final Item ENDERALD_PICKAXE = registerItem("enderald_pickaxe",
            new PickaxeItem(ModToolMaterial.ENDERALD, 5, 2f, new FabricItemSettings()));
    public static final Item ENDERALD_AXE = registerItem("enderald_axe",
            new AxeItem(ModToolMaterial.ENDERALD, 9, 1f, new FabricItemSettings()));
    public static final Item ENDERALD_SHOVEL = registerItem("enderald_shovel",
            new ShovelItem(ModToolMaterial.ENDERALD, 5, 0f, new FabricItemSettings()));
    public static final Item ENDERALD_SWORD = registerItem("enderald_sword",
            new SwordItem(ModToolMaterial.ENDERALD, 10, 5f, new FabricItemSettings()));
    public static final Item ENDERALD_HOE = registerItem("enderald_hoe",
            new HoeItem(ModToolMaterial.ENDERALD, 2, 0f, new FabricItemSettings()));

    public static final Item ENDERALD_HELMET = registerItem("enderald_helmet",
            new ModArmorItem(ModArmorMaterials.ENDERALD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ENDERALD_CHESTPLATE = registerItem("enderald_chestplate",
            new ArmorItem(ModArmorMaterials.ENDERALD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item ENDERALD_LEGGINGS = registerItem("enderald_leggings",
            new ArmorItem(ModArmorMaterials.ENDERALD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ENDERALD_BOOTS = registerItem("enderald_boots",
            new ArmorItem(ModArmorMaterials.ENDERALD, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AlwaysWork.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AlwaysWork.LOGGER.info("Registering Mod Items for " + AlwaysWork.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
