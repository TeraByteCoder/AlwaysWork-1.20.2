package at.lukas.alwayswork.item;

import at.lukas.alwayswork.AlwaysWork;
import at.lukas.alwayswork.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NEW_STUFF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AlwaysWork.MOD_ID, "new_stuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.new_stuff"))
                    .icon(() -> new ItemStack(ModBlocks.MITHRIL_ORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_HOE);

                        entries.add(ModItems.INFERNITE_INGOT);
                        entries.add(ModItems.RAW_INFERNITE);
                        entries.add(ModBlocks.INFERNITE_ORE);
                        entries.add(ModItems.INFERNITE_HELMET);
                        entries.add(ModItems.INFERNITE_CHESTPLATE);
                        entries.add(ModItems.INFERNITE_LEGGINGS);
                        entries.add(ModItems.INFERNITE_BOOTS);
                        entries.add(ModItems.INFERNITE_PICKAXE);
                        entries.add(ModItems.INFERNITE_AXE);
                        entries.add(ModItems.INFERNITE_SHOVEL);
                        entries.add(ModItems.INFERNITE_SWORD);
                        entries.add(ModItems.INFERNITE_HOE);


                        entries.add(ModItems.ENDERALD);
                        entries.add(ModBlocks.ENDERALD_ORE);
                        entries.add(ModItems.ENDERALD_PICKAXE);
                        entries.add(ModItems.ENDERALD_AXE);
                        entries.add(ModItems.ENDERALD_SHOVEL);
                        entries.add(ModItems.ENDERALD_SWORD);
                        entries.add(ModItems.ENDERALD_HOE);
                        entries.add(ModItems.ENDERALD_HELMET);
                        entries.add(ModItems.ENDERALD_CHESTPLATE);
                        entries.add(ModItems.ENDERALD_LEGGINGS);
                        entries.add(ModItems.ENDERALD_BOOTS);

                        entries.add(ModItems.VIBRANIUM_INGOT);
                        entries.add(ModItems.RAW_VIBRANIUM);
                        entries.add(ModBlocks.VIBRANIUM_ORE);
                        entries.add(ModItems.VIBRANIUM_HELMET);
                        entries.add(ModItems.VIBRANIUM_CHESTPLATE);
                        entries.add(ModItems.VIBRANIUM_LEGGINGS);
                        entries.add(ModItems.VIBRANIUM_BOOTS);
                        entries.add(ModItems.VIBRANIUM_PICKAXE);
                        entries.add(ModItems.VIBRANIUM_AXE);
                        entries.add(ModItems.VIBRANIUM_SHOVEL);
                        entries.add(ModItems.VIBRANIUM_SWORD);
                        entries.add(ModItems.VIBRANIUM_HOE);


                    }).build());


    public static void registerItemGroups() {
        AlwaysWork.LOGGER.info("Registering Item Groups for " + AlwaysWork.MOD_ID);
    }
}
