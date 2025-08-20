package camoweed.bloxycola;

import static camoweed.bloxycola.BloxyColaItem.*;
import static camoweed.bloxycola.BloxyColaMain.LOGGER;
import static camoweed.bloxycola.BloxyColaMain.MOD_ID;

import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class BloxyColaRecipe implements RecipeEntrypoint { 

	@Override
	public void onRecipesReady() { 

		// Crafting recipe
RecipeBuilder.Shapeless(MOD_ID)
	.addInput(Items.BUCKET_WATER)
	.addInput(Items.DUST_SUGAR)
	.addInput(Items.JAR)
	.addInput(Items.JAR)
	.create("bloxycola", new ItemStack(bloxycola, 2));

		LOGGER.info("Recipes initialized.");
	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
	}

}
