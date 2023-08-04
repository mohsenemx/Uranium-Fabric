package net.mohsenemx.uranium;

import net.fabricmc.api.ModInitializer;

import net.mohsenemx.uranium.item.ModItemGroups;
import net.mohsenemx.uranium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UraniumMod implements ModInitializer {
	public static final String MOD_ID = "uranium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}