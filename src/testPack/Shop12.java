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

public class Shop12 {
	
	public Shop12() {}

	public Shop12(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item1D());
		inv.setItem(2, item1D());
		inv.setItem(3, item1D());
		inv.setItem(4, item1D());
		inv.setItem(5, item1D());
		inv.setItem(6, item1D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "유적1행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "유적1로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 10초면 목표 역에");
		itemLore.add(ChatColor.GRAY + "도착하는 것으로 알려져있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "일반석 1인");
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
		itemIm.setDisplayName(ChatColor.AQUA + "유적1행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "유적1로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 10초면 목표 역에");
		itemLore.add(ChatColor.GRAY + "도착하는 것으로 알려져있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "일반석 1인");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 999999999안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	
}
