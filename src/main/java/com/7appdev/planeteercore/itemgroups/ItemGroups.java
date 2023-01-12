package com.7appdev.planeteercore.itemgroups;

import com.7appdev.planeteercore.registries.ItemsRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class ItemGroups {

    public static CreativeModeTab TAB_ORES = new CreativeModeTab("planeteer_core.tab_ores") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.MARS_COPPER_ORE_ITEM.get(), 1);
        }
    };
    public static CreativeModeTab TAB_ITEMS = new CreativeModeTab("planeteer_core.tab_items") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.RAW_LEAD_ITEM.get(), 1);
        }
    };
    public static CreativeModeTab TAB_BUILDING_BLOCKS = new CreativeModeTab("planeteer_core.tab_building_blocks") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.LEAD_BLOCK_RAW_BLOCKITEM.get(), 1);
        }
    };
}