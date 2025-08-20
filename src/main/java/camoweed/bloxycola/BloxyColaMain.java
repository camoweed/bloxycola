package camoweed.bloxycola;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;




public class BloxyColaMain implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
    public static final String MOD_ID = "bloxycola";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
 

   

    @Override
    public void onInitialize() {
        LOGGER.info("ExampleMod initialized.");
        BloxyColaItem.initItems();
    }

    @Override
    public void onRecipesReady() {
    }

    @Override
    public void initNamespaces() {}

    @Override
    public void beforeGameStart() {}       

    @Override
    public void afterGameStart() {}
}