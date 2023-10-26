package at.lukas.alwayswork.screen;

import at.lukas.alwayswork.AlwaysWork;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static void registerScreenHandlers() {
        AlwaysWork.LOGGER.info("Registering Screen Handlers for " + AlwaysWork.MOD_ID);
    }
}
