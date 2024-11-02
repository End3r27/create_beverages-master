package ender.create_beverages;

import ender.create_beverages.fluid.ModFluids;
import ender.create_beverages.item.ModItemGroups;
import ender.create_beverages.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateBeverages implements ModInitializer {
	public static final String MOD_ID = "create-beverages";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModFluids.register();








		LOGGER.info("owo");
	}
}