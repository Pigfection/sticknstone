package net.pigfection.sticknstone;

import net.fabricmc.api.ModInitializer;

import net.pigfection.sticknstone.item.ModItemGroups;
import net.pigfection.sticknstone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StickNStone implements ModInitializer {
	public static final String MOD_ID = "sticknstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModitems();
	}
}