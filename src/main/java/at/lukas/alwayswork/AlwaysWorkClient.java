package at.lukas.alwayswork;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import at.lukas.alwayswork.entity.ModEntities;
import at.lukas.alwayswork.entity.client.ModModelLayers;
import at.lukas.alwayswork.entity.client.PorcupineModel;
import at.lukas.alwayswork.entity.client.PorcupineRenderer;
import at.lukas.alwayswork.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class AlwaysWorkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);



    }
}
