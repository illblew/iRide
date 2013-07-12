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
        ShapedRecipe nametag = new ShapedRecipe(new ItemStack(Material.NAME_TAG,1)).shape(" I ", " I ", " B ").setIngredient('B', Material.BLAZE_ROD).setIngredient('I', Material.IRON_INGOT);
        ShapedRecipe ghorsearmor = new ShapedRecipe(new ItemStack(418)).shape("***", "*G*", "G G").setIngredient('*', Material.LEATHER).setIngredient('G', Material.GOLD_INGOT);
        ShapedRecipe ihorsearmor = new ShapedRecipe(new ItemStack(417)).shape("***", "*I*", "I I").setIngredient('*', Material.LEATHER).setIngredient('I', Material.IRON_INGOT);
        ShapedRecipe dhorsearmor = new ShapedRecipe(new ItemStack(419)).shape("***", "*D*", "D D").setIngredient('*', Material.LEATHER).setIngredient('D', Material.DIAMOND);
        //add the shizz
        getServer().addRecipe(saddle);
        getServer().addRecipe(nametag);
        getServer().addRecipe(ghorsearmor);
        getServer().addRecipe(ihorsearmor);
        getServer().addRecipe(dhorsearmor);
    }
    //end ons
    //logger
    public void log(String text) {
    	this.getLogger().log(Level.INFO, text);
    }

}
