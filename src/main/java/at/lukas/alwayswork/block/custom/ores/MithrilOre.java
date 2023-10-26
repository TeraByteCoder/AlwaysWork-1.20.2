package at.lukas.alwayswork.block.custom.ores;

import at.lukas.alwayswork.util.RandomnesElements;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MithrilOre extends Block {
    public MithrilOre(Settings settings) {
        super(settings);
    }


    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        int explosionSize = RandomnesElements.generateInt(1,6);
        world.createExplosion(player, pos.getX()+0.5,pos.getY()+1.5,pos.getZ()+0.5, explosionSize, World.ExplosionSourceType.BLOCK);
        world.createExplosion(player, pos.getX()+0.5,pos.getY()-0.5,pos.getZ()+0.5, explosionSize, World.ExplosionSourceType.BLOCK);
        super.onBreak(world, pos, state, player);
    }
}
