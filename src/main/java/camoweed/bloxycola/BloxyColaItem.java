package camoweed.bloxycola;

import static camoweed.bloxycola.BloxyColaMain.LOGGER;
import static camoweed.bloxycola.BloxyColaMain.MOD_ID;

import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemFood;
import turniplabs.halplibe.helper.ItemBuilder;

public class BloxyColaItem {

	private static int startingID = ModConfig.CFG.getInt("IDs.startingItemID");
	private static int nextID() {return startingID++;}

	public static Item bloxycola; 


	public static void initItems() {

		bloxycola = new ItemBuilder(MOD_ID)
			.build(new ItemFood("item.bloxycola", MOD_ID + ":item/bloxycola", nextID(), 2, 5, false, 6));
		LOGGER.info("Item initialized.");
	}
}
