package com.lcmcrafter.logantest1;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MODID)
public final class Main {
	
	public static final String MODID = "logantest1";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public Main() {
		LOGGER.debug("Hello World from Logan Test 1's first mod");
	}
} 
