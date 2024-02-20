package com.spiralsky.heavensaddons.Init;

import com.spiralsky.heavensaddons.HeavensAddons;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_LORDS_IRON_TOOL = tag("needs_holy_steel_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(HeavensAddons.MODID, name));
    }
}
