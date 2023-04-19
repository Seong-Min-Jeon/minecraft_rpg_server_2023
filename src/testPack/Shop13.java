package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class Shop13 {
	
	public Shop13() {}

	public Shop13(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.MAP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "1만안 수표");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 1만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "1만안 수표");
		itemIm.setLocalizedName("10000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 1만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.MAP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "10만안 수표");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 10만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "10만안 수표");
		itemIm.setLocalizedName("100000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 10만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.MAP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "100만안 수표");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 100만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "100만안 수표");
		itemIm.setLocalizedName("1000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 100만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 1000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.MAP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "1000만안 수표");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 1000만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "1000만안 수표");
		itemIm.setLocalizedName("10000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "사용하면 바로 1000만안을 얻을 수 있는 수표");
		itemLore.add(ChatColor.GRAY + "남부지역의 공증 사무소인 지팡이 사무소에서");
		itemLore.add(ChatColor.GRAY + "발행하고 관리한다.");
		itemLore.add(ChatColor.GRAY + "지팡이 사무소는 모종의 사건으로 사무소가");
		itemLore.add(ChatColor.GRAY + "망해버렸지만 둥지에 작게나마 자리를 열고");
		itemLore.add(ChatColor.GRAY + "사무소를 이어가고 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	
}
