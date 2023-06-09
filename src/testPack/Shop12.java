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
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		inv.setItem(4, item5D());
		inv.setItem(5, item6D());
		inv.setItem(6, item7D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "나태의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "나태를 벌하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
		itemIm.setDisplayName(ChatColor.AQUA + "나태의 유적행 열차 티켓");
		itemIm.setLocalizedName("50000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "나태를 벌하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
		itemLore.add(ChatColor.GRAY + "도착하는 것으로 알려져있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "일반석 1인");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 50000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "분노의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "분노의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "색욕의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "색욕을 감추는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "색욕의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "색욕을 감추는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "탐식의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "탐식을 꾀하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "탐식의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "탐식을 꾀하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item5() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "우울의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "우울을 비추는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item5D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "우울의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "우울을 비추는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item6() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "질투의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "질투를 부르는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item6D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "질투의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "질투를 부르는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item7() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "오만의 유적행 열차 티켓");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "오만을 행하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
	
	public ItemStack item7D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "오만의 유적행 열차 티켓");
		itemIm.setLocalizedName("999999999");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "오만을 행하는 유적으로 향하는 워프 열차의 티켓.");
		itemLore.add(ChatColor.GRAY + "W사의 특이점인 공간이동을 이용해");
		itemLore.add(ChatColor.GRAY + "열차가 출발하고 5초면 도착역에");
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
