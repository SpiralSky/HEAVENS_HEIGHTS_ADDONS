package com.spiralsky.heavensaddons.Init;

import com.spiralsky.heavensaddons.Classes.Item.HolyGrailItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.spiralsky.heavensaddons.HeavensAddons.MODID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> HOLY_GRAIL_1 = ITEMS.register("holy_grail_1", () ->
            new HolyGrailItem(new Item.Properties()));
    public static final RegistryObject<Item> HOLY_DUST = ITEMS.register("holy_dust", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> LORDS_IRON_INGOT = ITEMS.register("lords_iron_ingot", () ->
            new Item(new Item.Properties()));
    public static final RegistryObject<Item> LORDS_IRON_SWORD = ITEMS.register("lords_iron_sword", () ->
            new SwordItem(TierInit.LORDS_IRON,7,10f,new Item.Properties()
                    .durability(100)));
}
