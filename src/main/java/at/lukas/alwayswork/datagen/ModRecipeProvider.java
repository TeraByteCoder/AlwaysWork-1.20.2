package at.lukas.alwayswork.datagen;

import at.lukas.alwayswork.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import at.lukas.alwayswork.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> MITHRIL_SMELTABLES = List.of(ModItems.RAW_MITHRIL,
            ModBlocks.MITHRIL_ORE);
    private static final List<ItemConvertible> INFERNITE_SMELTABLES = List.of(ModItems.RAW_INFERNITE,
            ModBlocks.INFERNITE_ORE);
    private static final List<ItemConvertible> VIBRANIUM_SMELTABLES = List.of(ModItems.RAW_VIBRANIUM,
            ModBlocks.VIBRANIUM_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerBlasting(exporter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT,
                2.5f, 400, "mithril");
        offerBlasting(exporter, INFERNITE_SMELTABLES, RecipeCategory.MISC, ModItems.INFERNITE_INGOT,
                2.5f, 400, "infernite");
        offerBlasting(exporter, VIBRANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.VIBRANIUM_INGOT,
                3.6f, 600, "vibranium");


        createSword(Items.IRON_INGOT, ModItems.MITHRIL_INGOT, ModItems.MITHRIL_SWORD, exporter);
        createAxe(Items.IRON_INGOT, ModItems.MITHRIL_INGOT, ModItems.MITHRIL_AXE, exporter);
        createPickaxe(Items.IRON_INGOT, ModItems.MITHRIL_INGOT, ModItems.MITHRIL_PICKAXE, exporter);
        createHoe(Items.IRON_INGOT, ModItems.MITHRIL_INGOT, ModItems.MITHRIL_HOE, exporter);
        createShovel(Items.IRON_INGOT, ModItems.MITHRIL_INGOT, ModItems.MITHRIL_SHOVEL, exporter);

        createSword(Items.IRON_INGOT, ModItems.INFERNITE_INGOT, ModItems.INFERNITE_SWORD, exporter);
        createAxe(Items.IRON_INGOT, ModItems.INFERNITE_INGOT, ModItems.INFERNITE_AXE, exporter);
        createPickaxe(Items.IRON_INGOT, ModItems.INFERNITE_INGOT, ModItems.INFERNITE_PICKAXE, exporter);
        createHoe(Items.IRON_INGOT, ModItems.INFERNITE_INGOT, ModItems.INFERNITE_HOE, exporter);
        createShovel(Items.IRON_INGOT, ModItems.INFERNITE_INGOT, ModItems.INFERNITE_SHOVEL, exporter);

        createSword(Items.IRON_INGOT, ModItems.ENDERALD, ModItems.ENDERALD_SWORD, exporter);
        createAxe(Items.IRON_INGOT, ModItems.ENDERALD, ModItems.ENDERALD_AXE, exporter);
        createPickaxe(Items.IRON_INGOT, ModItems.ENDERALD, ModItems.ENDERALD_PICKAXE, exporter);
        createHoe(Items.IRON_INGOT, ModItems.ENDERALD, ModItems.ENDERALD_HOE, exporter);
        createShovel(Items.IRON_INGOT, ModItems.ENDERALD, ModItems.ENDERALD_SHOVEL, exporter);

        createSword(Items.IRON_INGOT, ModItems.VIBRANIUM_INGOT, ModItems.VIBRANIUM_SWORD,exporter);
        createAxe(Items.IRON_INGOT, ModItems.VIBRANIUM_INGOT, ModItems.VIBRANIUM_AXE,exporter);
        createPickaxe(Items.IRON_INGOT, ModItems.VIBRANIUM_INGOT, ModItems.VIBRANIUM_PICKAXE,exporter);
        createHoe(Items.IRON_INGOT, ModItems.VIBRANIUM_INGOT, ModItems.VIBRANIUM_HOE,exporter);
        createShovel(Items.IRON_INGOT, ModItems.VIBRANIUM_INGOT, ModItems.VIBRANIUM_SHOVEL,exporter);
    }
    public static void createSword(Item grip, Item blade, Item result, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 1)
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" G ")
                .input('B', blade)
                .input('G', grip)
                .criterion(hasItem(blade), conditionsFromItem(blade))
                .criterion(hasItem(grip), conditionsFromItem(grip))
                .offerTo(exporter, new Identifier(getRecipeName(result)));
    }
    public static void createAxe(Item grip, Item tip, Item result, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 1)
                .pattern("BB ")
                .pattern("BG ")
                .pattern(" G ")
                .input('B', tip)
                .input('G', grip)
                .criterion(hasItem(tip), conditionsFromItem(tip))
                .criterion(hasItem(grip), conditionsFromItem(grip))
                .offerTo(exporter, new Identifier(getRecipeName(result)));
    }
    public static void createPickaxe(Item grip, Item tip, Item result, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 1)
                .pattern("BBB")
                .pattern(" G ")
                .pattern(" G ")
                .input('B', tip)
                .input('G', grip)
                .criterion(hasItem(tip), conditionsFromItem(tip))
                .criterion(hasItem(grip), conditionsFromItem(grip))
                .offerTo(exporter, new Identifier(getRecipeName(result)));
    }
    public static void createShovel(Item grip, Item tip, Item result, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 1)
                .pattern(" B ")
                .pattern(" G ")
                .pattern(" G ")
                .input('B', tip)
                .input('G', grip)
                .criterion(hasItem(tip), conditionsFromItem(tip))
                .criterion(hasItem(grip), conditionsFromItem(grip))
                .offerTo(exporter, new Identifier(getRecipeName(result)));
    }
    public static void createHoe(Item grip, Item tip, Item result, RecipeExporter exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, result, 1)
                .pattern("BB ")
                .pattern(" G ")
                .pattern(" G ")
                .input('B', tip)
                .input('G', grip)
                .criterion(hasItem(tip), conditionsFromItem(tip))
                .criterion(hasItem(grip), conditionsFromItem(grip))
                .offerTo(exporter, new Identifier(getRecipeName(result)));
    }
}
