package at.lukas.alwayswork.commands;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import java.util.function.Supplier;

import static com.mojang.brigadier.arguments.StringArgumentType.getString;
// word()
import static com.mojang.brigadier.arguments.StringArgumentType.word;
// literal("foo")
import static net.minecraft.server.command.CommandManager.literal;
// argument("bar", word())
import static net.minecraft.server.command.CommandManager.argument;
// Import everything in the CommandManager
import static net.minecraft.server.command.CommandManager.*;

public class ModCommands
{
    public static void registerCommands()
    {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
        {
                dispatcher.register(literal("foo")
                        //.requires(source -> source.hasPermissionLevel(4))
                        .executes(ctx ->
                        {
                            ctx.getSource().sendMessage(Text.literal("You are an operator"));
                            return 1;
                        }));
        });
    }
}