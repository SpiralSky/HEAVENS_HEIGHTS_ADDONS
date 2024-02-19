package com.spiralsky.heavensaddons.Classes.Item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class HolyGrailItem extends Item {
    public HolyGrailItem(Properties properties) {
        super(properties);
    }
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack mainhandItem = player.getItemInHand(hand);
        ItemStack offhandItem = player.getOffhandItem();


        if (!world.isClientSide) {
            if (offhandItem.getTag() == null) {
                offhandItem.setTag(new CompoundTag());
            }

            offhandItem.getTag().putBoolean("Unbreakable", true);
        }

        return new InteractionResultHolder<>(InteractionResult.SUCCESS, mainhandItem);

    }
}
