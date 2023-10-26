package at.lukas.alwayswork.block.custom.ores;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;

public class InferniteOre extends Block {
    public InferniteOre(Settings settings) {
        super(settings);
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        world.setBlockState(pos, Blocks.LAVA.getDefaultState(), 11);
        super.onBroken(world, pos, state);
    }
}
