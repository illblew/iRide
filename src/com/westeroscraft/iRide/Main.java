package com.westeroscraft.iRide;
//This plugin was coded by Will Blew for Westeroscraft in 2012
import java.util.logging.Level;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	//on info
	
	public void onDisable() {
	       getServer().clearRecipes();
        log("iRide has been disabled.");
    }
 
    public void onEnable() {   	
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this, this);
        log("iRide is now enabled.");	
        
        ShapedRecipe saddle = new ShapedRecipe(new ItemStack(Material.SADDLE,1)).shape("***", "S*S", "I I").setIngredient('*', Material.LEATHER).setIngredient('S', Material.STRING).setIngredient('I', Material.IRON_INGOT);
   //add the shizz
        getServer().addRecipe(saddle);
    }
    //end ons
    //logger
    public void log(String text) {
    	this.getLogger().log(Level.INFO, text);
    }

}
