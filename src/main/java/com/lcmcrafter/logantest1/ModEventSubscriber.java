package com.lcmcrafter.logantest1;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

import com.lcmcrafter.logantest1.init.ModBlocks;
import com.lcmcrafter.logantest1.init.ModItemGroups;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(
				setup(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)), "example_ore")
			);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) { 

		final IForgeRegistry<Item> registry = event.getRegistry();
		
		// Obtain a block item for the "example ore" block registered in onRegisterBlocks
		final Item.Properties properties = new Item.Properties().group(ModItemGroups.MOD_BLOCK_GROUP);
		final BlockItem blockItem = new BlockItem(ModBlocks.EXAMPLE_ORE, properties);
		
		// Register the custom item and block item
		registry.registerAll(
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_item"),
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "dragon_egg"),
				setup(blockItem, "example_ore")
				);
		
	}
			
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(Main.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}
}



