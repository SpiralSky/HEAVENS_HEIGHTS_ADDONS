package com.spiralsky.heavensaddons.Classes.Item;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

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
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.literal("Right click to make off-hand item Unbreakable"));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
