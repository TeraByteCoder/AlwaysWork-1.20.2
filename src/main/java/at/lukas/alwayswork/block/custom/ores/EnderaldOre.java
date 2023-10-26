package at.lukas.alwayswork.block.custom.ores;

import at.lukas.alwayswork.util.RandomnesElements;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EnderaldOre extends Block {
    public EnderaldOre(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (RandomnesElements.generateRandomBoolean(0.5))
        {
            player.teleport(player.getX(),player.getY()+ RandomnesElements.generateInt(10,50),player.getZ());
        }
        super.onBreak(world, pos, state, player);
    }
}
