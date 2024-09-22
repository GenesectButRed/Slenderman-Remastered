package net.red.slenderman;

import net.fabricmc.api.ModInitializer;

import net.red.slenderman.item.ModItemGroups;
import net.red.slenderman.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlendermanRemastered implements ModInitializer {
	public static final String MOD_ID = "slendermanremastered";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}