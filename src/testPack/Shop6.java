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

public class Shop6 {
	
	public Shop6() {}

	public Shop6(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		inv.setItem(4, item5D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.SUSPICIOUS_STEW);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FF9933") + "네모네모 짜장쫄면");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "네모의 명대사인 \"네! 개쫄리는데요?\"에서");
		itemLore.add(ChatColor.GRAY + "영감을 받아 ■■■■이 개발한 쫄면요리이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "그런데 말입니다! 지금까지 우리가 먹어서");
		itemLore.add(ChatColor.GRAY + "처리한 짜장쫄면만 11그릇입니다!");
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
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FF9933") + "네모네모 짜장쫄면");
		itemIm.setLocalizedName("120000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "네모의 명대사인 \"네! 개쫄리는데요?\"에서");
		itemLore.add(ChatColor.GRAY + "영감을 받아 ■■■■이 개발한 쫄면요리이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "그런데 말입니다! 지금까지 우리가 먹어서");
		itemLore.add(ChatColor.GRAY + "처리한 짜장쫄면만 11그릇입니다!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 120000안");
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
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FF66CC") + "인어스테이크");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "여러 야채들과 어우려져 특제소스와 함께");
		itemLore.add(ChatColor.GRAY + "담백하게 구워낸 분홍색 인어고기이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "억압을 위해 바다소금을 왕창 뿌렸으나");
		itemLore.add(ChatColor.GRAY + "맛에는 지장이 없으니 안심하고 드세요!");
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
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FF66CC") + "인어스테이크");
		itemIm.setLocalizedName("199000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "여러 야채들과 어우려져 특제소스와 함께");
		itemLore.add(ChatColor.GRAY + "담백하게 구워낸 분홍색 인어고기이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "억압을 위해 바다소금을 왕창 뿌렸으나");
		itemLore.add(ChatColor.GRAY + "맛에는 지장이 없으니 안심하고 드세요!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 199000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.BEETROOT_SOUP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#99FF66") + "꽃밭 위의 티타니아");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "시금치로 만든 나비 모양의 면과");
		itemLore.add(ChatColor.GRAY + "마늘, 베이컨, 채소의 조합으로");
		itemLore.add(ChatColor.GRAY + "부드럽게 만들어낸 오일 파스타이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "작은 요정들까지 전부 제압하고");
		itemLore.add(ChatColor.GRAY + "드셔주시길 바랍니다!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.BEETROOT_SOUP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#99FF66") + "꽃밭 위의 티타니아");
		itemIm.setLocalizedName("159000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "시금치로 만든 나비 모양의 면과");
		itemLore.add(ChatColor.GRAY + "마늘, 베이컨, 채소의 조합으로");
		itemLore.add(ChatColor.GRAY + "부드럽게 만들어낸 오일 파스타이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "작은 요정들까지 전부 제압하고");
		itemLore.add(ChatColor.GRAY + "드셔주시길 바랍니다!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 159000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.POISONOUS_POTATO);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#33CC00") + "분노의 푸딩");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "수많은 연구 끝에 만들어낸 초록색 푸딩이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "독 때문에 그릇과 식기류가 부식되기");
		itemLore.add(ChatColor.GRAY + "전에 드셔주시길 바랍니다!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.POISONOUS_POTATO);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#33CC00") + "분노의 푸딩");
		itemIm.setLocalizedName("40000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "수많은 연구 끝에 만들어낸 초록색 푸딩이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "독 때문에 그릇과 식기류가 부식되기");
		itemLore.add(ChatColor.GRAY + "전에 드셔주시길 바랍니다!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 40000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5() {
		ItemStack item = new ItemStack(Material.DRIED_KELP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#CC0000") + "소녀의 잿더미 케이크");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "스위스의 한조각이라고 불리는");
		itemLore.add(ChatColor.GRAY + "에멘탈 치즈케이크이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "주의! 불타버린 소녀가 다가오면 피하세요!");
		itemLore.add(ChatColor.RED + "폭발위험이 있습니다.");
		itemIm.setLore(itemLore);	
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5D() {
		ItemStack item = new ItemStack(Material.DRIED_KELP);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#CC0000") + "소녀의 잿더미 케이크");
		itemIm.setLocalizedName("80000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "스위스의 한조각이라고 불리는");
		itemLore.add(ChatColor.GRAY + "에멘탈 치즈케이크이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "주의! 불타버린 소녀가 다가오면 피하세요!");
		itemLore.add(ChatColor.RED + "폭발위험이 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 80000안");
		itemIm.setLore(itemLore);	
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
