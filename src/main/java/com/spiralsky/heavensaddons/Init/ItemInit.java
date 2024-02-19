package com.spiralsky.heavensaddons.Init;

import com.spiralsky.heavensaddons.Classes.Item.HolyGrailItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.spiralsky.heavensaddons.HeavensAddons.MODID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> HOLY_GRAIL_1 = ITEMS.register("holy_grail_1", () -> new HolyGrailItem(new Item.Properties()));
}
