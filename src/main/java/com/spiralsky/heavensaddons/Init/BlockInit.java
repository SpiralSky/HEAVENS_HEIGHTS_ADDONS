package com.spiralsky.heavensaddons.Init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.spiralsky.heavensaddons.HeavensAddons.MODID;
import static com.spiralsky.heavensaddons.Init.ItemInit.ITEMS;

public class BlockInit{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final RegistryObject<Block> HOLY_STONE = BLOCKS.register("holy_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(MapColor.STONE).strength(2f,1200f)));
    //BlockItem Initialisation
    public static final RegistryObject<Item> HOLY_STONE_ITEM = ITEMS.register("holy_stone", () -> new BlockItem(HOLY_STONE.get(), new Item.Properties()));

}
