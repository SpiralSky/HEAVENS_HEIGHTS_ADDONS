package com.spiralsky.heavensaddons.Init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.spiralsky.heavensaddons.HeavensAddons.MODID;
import static com.spiralsky.heavensaddons.Init.BlockInit.HOLY_STONE;
import static com.spiralsky.heavensaddons.Init.ItemInit.*;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    public static final RegistryObject<CreativeModeTab> HEAVENS_ADDONS_TAB = CREATIVE_MODE_TABS.register("heavens_addons_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.literal("Heavens Addons"))
            .icon(() -> HOLY_GRAIL_1.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(HOLY_GRAIL_1.get());
                output.accept(HOLY_DUST.get());
                output.accept(HOLY_STONE.get());
                output.accept(LORDS_IRON_INGOT.get());
                output.accept(LORDS_IRON_SWORD.get());
            }).build());
}
