package at.lukas.alwayswork;

import at.lukas.alwayswork.block.ModBlocks;
import at.lukas.alwayswork.commands.ModCommands;
import at.lukas.alwayswork.entity.ModEntities;
import at.lukas.alwayswork.entity.custom.PorcupineEntity;
import at.lukas.alwayswork.features.ModFeatures;
import at.lukas.alwayswork.item.ModItemGroups;
import at.lukas.alwayswork.item.ModItems;
import at.lukas.alwayswork.recipe.ModRecipes;
import at.lukas.alwayswork.screen.ModScreenHandlers;
import at.lukas.alwayswork.sound.ModSounds;
import at.lukas.alwayswork.util.ModCustomTrades;
import at.lukas.alwayswork.util.ModLootTableModifiers;
import at.lukas.alwayswork.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlwaysWork implements ModInitializer {
	public static final String MOD_ID = "alwayswork";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModFeatures.registerFeatures();
		ModItemGroups.registerItemGroups();
		ModCommands.registerCommands();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();

		ModVillagers.registerVillagers();
		ModSounds.registerSounds();

		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();
	}
}