package com.spiralsky.heavensaddons.Init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.spiralsky.heavensaddons.HeavensAddons.MODID;
import static com.spiralsky.heavensaddons.Init.ItemInit.HOLY_GRAIL_1;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final RegistryObject<CreativeModeTab> HEAVENS_ADDONS_TAB = CREATIVE_MODE_TABS.register("heavens_addons_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> HOLY_GRAIL_1.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(HOLY_GRAIL_1.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());
}
