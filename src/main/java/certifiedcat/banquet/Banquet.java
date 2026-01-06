package certifiedcat.banquet;

import certifiedcat.banquet.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banquet implements ModInitializer {
	public static final String MOD_ID = "banquet";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("WHAT DOES THE FOX SAY?");
	}
}