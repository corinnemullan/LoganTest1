package com.lcmcrafter.logantest1.init;

import java.util.function.Supplier;

import com.lcmcrafter.logantest1.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
	
	public static class ModItemGroup extends ItemGroup {

		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}

	}
	
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(Main.MODID, () -> new ItemStack(ModItems.EXAMPLE_ITEM));
	public static final ItemGroup MOD_BLOCK_GROUP = new ModItemGroup(Main.MODID, () -> new ItemStack(ModItems.EXAMPLE_ORE));
}
