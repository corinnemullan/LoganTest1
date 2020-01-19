package com.lcmcrafter.logantest1.init;

import com.lcmcrafter.logantest1.Main;

import net.minecraft.block.Block;
//import net.minecraft.block.material.Material;
//import net.minecraft.item.Item;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

//public final class ModBlocks {
//
//	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Main.MODID);
//
//	// This block has the ROCK material, meaning it needs at least a wooden pickaxe to break it. It is very similar to Iron Ore
//	public static final RegistryObject<Block> EXAMPLE_ORE = BLOCKS.register("example_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)));
//	
//}

@ObjectHolder(Main.MODID)
public class ModBlocks {
	public static final Block EXAMPLE_ORE = null;
}
