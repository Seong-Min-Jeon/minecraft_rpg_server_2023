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

public class Shop3 {
	
	public Shop3() {}

	public Shop3(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.SUSPICIOUS_STEW);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "보노 삼색" + ChatColor.GREEN + "비" + ChatColor.YELLOW + "빔" + ChatColor.RED + "밥");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "먹물 오징어 튀김과 향긋한 깻잎,");
		itemLore.add(ChatColor.GRAY + "계란지단, 매콤달콤한 제육볶음이");
		itemLore.add(ChatColor.GRAY + "잘 어우러진 삼색 제육비빔밥이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "도시에 별천지 같은 비빔밥이 많다고");
		itemLore.add(ChatColor.GRAY + "해도 이렇게 맛있는 비빔밥이 있을");
		itemLore.add(ChatColor.GRAY + "리가 없을 텐데. -보노");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.SUSPICIOUS_STEW);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "보노 삼색" + ChatColor.GREEN + "비" + ChatColor.YELLOW + "빔" + ChatColor.RED + "밥");
		itemIm.setLocalizedName("12500");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "먹물 오징어 튀김과 향긋한 깻잎,");
		itemLore.add(ChatColor.GRAY + "계란지단, 매콤달콤한 제육볶음이");
		itemLore.add(ChatColor.GRAY + "잘 어우러진 삼색 제육비빔밥이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "도시에 별천지 같은 비빔밥이 많다고");
		itemLore.add(ChatColor.GRAY + "해도 이렇게 맛있는 비빔밥이 있을");
		itemLore.add(ChatColor.GRAY + "리가 없을 텐데. -보노");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 12500안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.MUSHROOM_STEW);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#663333") + "사랑마을의 토머리조또");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "돈마호크, 토마토리조또, 풀드포크가");
		itemLore.add(ChatColor.GRAY + "곁들어진 플래터이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "붉게물든 또띠아에 싸서 네모로 접고");
		itemLore.add(ChatColor.GRAY + "세모로 접어 드시기 바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "또띠아를 네모로 접을까? 세모가 좋을 것 같아!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.MUSHROOM_STEW);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#663333") + "사랑마을의 토머리조또");
		itemIm.setLocalizedName("30000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "돈마호크, 토마토리조또, 풀드포크가");
		itemLore.add(ChatColor.GRAY + "곁들어진 플래터이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "붉게물든 또띠아에 싸서 네모로 접고");
		itemLore.add(ChatColor.GRAY + "세모로 접어 드시기 바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "또띠아를 네모로 접을까? 세모가 좋을 것 같아!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 30000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.PUMPKIN_PIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#996633") + "피에르 찰떡손파이");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "달달하고 쫀득한 피에르 인기메뉴");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "잭이 너무나 좋아하는 찰떡손파이!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.PUMPKIN_PIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#996633") + "피에르 찰떡손파이");
		itemIm.setLocalizedName("7000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "달달하고 쫀득한 피에르 인기메뉴");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "잭이 너무나 좋아하는 찰떡손파이!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 7000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.COOKIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#993333") + "단테 에그타르트");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "주문 즉시 구워 만드는 정통 에그타르트이다.");
		itemLore.add(ChatColor.GRAY + "단테의 시계 머리 초콜릿이 올라가");
		itemLore.add(ChatColor.GRAY + "한층 맛을 더했다고 한다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.COOKIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#993333") + "단테 에그타르트");
		itemIm.setLocalizedName("3900");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "주문 즉시 구워 만드는 정통 에그타르트이다.");
		itemLore.add(ChatColor.GRAY + "단테의 시계 머리 초콜릿이 올라가");
		itemLore.add(ChatColor.GRAY + "한층 맛을 더했다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 3900안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
