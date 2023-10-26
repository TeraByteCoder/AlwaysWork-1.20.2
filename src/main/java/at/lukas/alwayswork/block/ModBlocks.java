package at.lukas.alwayswork.block;

import at.lukas.alwayswork.AlwaysWork;
import at.lukas.alwayswork.block.custom.ores.EnderaldOre;
import at.lukas.alwayswork.block.custom.ores.MithrilOre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import at.lukas.alwayswork.block.custom.ores.InferniteOre;
import at.lukas.alwayswork.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new MithrilOre(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));
    public static final Block INFERNITE_ORE = registerBlock("infernite_ore",
            new InferniteOre(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));
    public static final Block VIBRANIUM_ORE = registerBlock("vibranium_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));
    public static final Block ENDERALD_ORE = registerBlock("enderald_ore",
            new EnderaldOre(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AlwaysWork.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AlwaysWork.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AlwaysWork.LOGGER.info("Registering ModBlocks for " + AlwaysWork.MOD_ID);
    }
}
