package com.spiralsky.heavensaddons.Init;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier LORDS_IRON = new ForgeTier(
            4,
            1800,
            1.5f,
            7,
            20,
            TagInit.NEEDS_LORDS_IRON_TOOL,
            () -> Ingredient.of(ItemInit.LORDS_IRON_INGOT::get)
    );
}