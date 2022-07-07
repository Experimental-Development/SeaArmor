package me.experimental;
/*
    
    This file is licensed by ExperimentalX. Unless you have
    specific permission from ExperimentalX, you are not
    permitted to touch this file at all. It is open
    sourced so you can see how I did it, not for
    you to copy off of it.
    
    Please. If you are trying to learn, don't copy off of
    other people, see what they did, and try to do it better.
    See if you can figure out why it works the way it does.
    
    This was written by ExperimentalX on 7/6/2022 for
    SeaArmor
    
*/

import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {

    public void onEnable() {

        Bukkit.addRecipe(registerHat());
        Bukkit.addRecipe(registerShirt());
        Bukkit.addRecipe(registerPants());
        Bukkit.addRecipe(registerShoes());
        getLogger().info("Registered recipies");

    }
    public void onDisable() {
        getLogger().severe("See you on the other side :)");
    }

    /*
     * Item Methods
     */


    public ItemStack getHat() {
        ItemStack hat = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta hatMeta = hat.getItemMeta();
        LeatherArmorMeta hatMeta2 = (LeatherArmorMeta) hatMeta;
        hatMeta2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Sea Hat");
        List<String> hatLore = new ArrayList<String>();
        hatLore.add("");
        hatLore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Unbreaking III");
        hatMeta2.setLore(hatLore);
        hatMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        hatMeta2.setUnbreakable(true);
        hatMeta2.addEnchant(Enchantment.DURABILITY, 255, true);
        hatMeta2.setColor(Color.fromRGB(85, 255, 255));

        hat.setItemMeta(hatMeta2);
        return hat;
    }
    public ItemStack getShirt() {
        ItemStack shirt = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta shirtMeta = shirt.getItemMeta();
        LeatherArmorMeta shirtMeta2 = (LeatherArmorMeta)shirtMeta;
        shirtMeta2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Sea Shirt");
        List<String> hatLore = new ArrayList<String>();
        hatLore.add("");
        hatLore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Unbreaking III");
        shirtMeta2.setLore(hatLore);
        shirtMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        shirtMeta2.setUnbreakable(true);
        shirtMeta2.addEnchant(Enchantment.DURABILITY, 255, true);
        shirtMeta2.setColor(Color.fromRGB(85, 255, 255));

        shirt.setItemMeta(shirtMeta2);
        return shirt;
    }
    public ItemStack getPants() {
        ItemStack pants = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta pantsMeta = pants.getItemMeta();
        LeatherArmorMeta pantsMeta2 = (LeatherArmorMeta)pantsMeta;
        pantsMeta2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Sea Pants");
        List<String> hatLore = new ArrayList<String>();
        hatLore.add("");
        hatLore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Unbreaking III");
        pantsMeta2.setLore(hatLore);
        pantsMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        pantsMeta2.setUnbreakable(true);
        pantsMeta2.addEnchant(Enchantment.DURABILITY, 255, true);
        pantsMeta2.setColor(Color.fromRGB(85, 255, 255));

        pants.setItemMeta(pantsMeta2);
        return pants;
    }
    public ItemStack getShoes() {
        ItemStack shoes = new ItemStack(Material.LEATHER_HELMET);
        ItemMeta shoesMeta = shoes.getItemMeta();
        LeatherArmorMeta shoesMeta2 = (LeatherArmorMeta)shoesMeta;
        shoesMeta2.setDisplayName(ChatColor.AQUA + "" + ChatColor.BOLD + "Sea Shoes");
        List<String> hatLore = new ArrayList<String>();
        hatLore.add("");
        hatLore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Unbreaking III");
        shoesMeta2.setLore(hatLore);
        shoesMeta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_DYE, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        shoesMeta2.setUnbreakable(true);
        shoesMeta2.addEnchant(Enchantment.DURABILITY, 255, true);
        shoesMeta2.setColor(Color.fromRGB(85, 255, 255));

        shoes.setItemMeta(shoesMeta2);
        return shoes;
    }

    /*
     * Register Recipe Methods
     */

    public ShapedRecipe registerHat() {
        ShapedRecipe hat = new ShapedRecipe(new NamespacedKey(this, "sea-hat"), getHat());
        hat.shape("CCC", "C  C", "   ");
        hat.setIngredient('C', Material.CYAN_WOOL);
        return hat;
    }

    public ShapedRecipe registerShirt() {
        ShapedRecipe shirt = new ShapedRecipe(new NamespacedKey(this, "sea-shirt"), getShirt());
        shirt.shape("C C", "CCC", "CCC");
        shirt.setIngredient('C', Material.CYAN_WOOL);
        return shirt;
    }

    public ShapedRecipe registerPants() {
        ShapedRecipe pants = new ShapedRecipe(new NamespacedKey(this, "sea-pants"), getPants());
        pants.shape("CCC", "C C", "C C");
        pants.setIngredient('C', Material.CYAN_WOOL);
        return pants;
    }

    public ShapedRecipe registerShoes() {
        ShapedRecipe shoes = new ShapedRecipe(new NamespacedKey(this, "sea-shoes"), getShoes());
        shoes.shape("   ", "C  C", "C C");
        shoes.setIngredient('C', Material.CYAN_WOOL);
        return shoes;
    }
}
