package com.maideniles.maidensmaterials.blocks.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class MaidenLogBlock extends RotatedPillarBlock {
    public MaidenLogBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack axe = player.getHeldItem(handIn);
        BlockState log = worldIn.getBlockState(pos);

        if (!worldIn.isRemote() && player.getHeldItem(handIn).toString().toLowerCase().contains("axe")) {


            if (log.getBlock() == ModBlocks.CRABAPPLE_LOG.get()) {

                System.out.print("TESTING WOOD STRIPPING");
                worldIn.setBlockState(pos, ModBlocks.CRABAPPLE_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.POINCIANA_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.POINCIANA_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.LABURNUM_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.LABURNUM_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.JADE_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.JADE_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.PAULOWNIA_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.POINCIANA_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.WISTERIA_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.WISTERIA_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.JACARANDA_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.JACARANDA_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.DOGWOOD_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.DOGWOOD_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.SILVERBELL_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.SILVERBELL_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.CEDAR_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.CEDAR_STRIPPED_LOG.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.PALM_LOG.get()) {


                worldIn.setBlockState(pos, ModBlocks.PALM_STRIPPED_LOG.get().getDefaultState());
            }


        }

        return ActionResultType.FAIL;
    }



}

