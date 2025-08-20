package camoweed.bloxycola;

import turniplabs.halplibe.util.TomlConfigHandler;
import turniplabs.halplibe.util.toml.Toml;

public class ModConfig {
	private static final Toml TOML = new Toml("Waltuh's TOML Config");
	public static final TomlConfigHandler CFG;

	static {
		TOML.addCategory("IDs")
			.addEntry("startingItemID", "Default: 22000", 23333) 
			.addEntry("startingBlockID", "Default: 15000", 15000); 

		CFG = new TomlConfigHandler(BloxyColaMain.MOD_ID, TOML);
	}
}
