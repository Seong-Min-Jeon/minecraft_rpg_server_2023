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

public class Shop5 {
	
	public Shop5() {}

	public Shop5(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		inv.setItem(4, item5D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFCCCC") + "눈물의 병");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "이온음료와 딸기도넛을 함께");
		itemLore.add(ChatColor.GRAY + "즐길 수 있는 디저트이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "눈물의 병을 마실 땐");
		itemLore.add(ChatColor.GRAY + "익사하지 않도록 조심하자.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(255, 204, 204));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFCCCC") + "눈물의 병");
		itemIm.setLocalizedName("69000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "이온음료와 딸기도넛을 함께");
		itemLore.add(ChatColor.GRAY + "즐길 수 있는 디저트이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "눈물의 병을 마실 땐");
		itemLore.add(ChatColor.GRAY + "익사하지 않도록 조심하자.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 69000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(255, 204, 204));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#0033CC") + "진실의 삼키는 거짓말");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "푸른색의 무알콜 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "푸른목동의 걸리적거리는 말은");
		itemLore.add(ChatColor.GRAY + "무시하고 마시자.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(0, 51, 204));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#0033CC") + "진실의 삼키는 거짓말");
		itemIm.setLocalizedName("60000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "푸른색의 무알콜 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "푸른목동의 걸리적거리는 말은");
		itemLore.add(ChatColor.GRAY + "무시하고 마시자.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 60000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(0, 51, 204));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFCC99") + "베스파의 계피차");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "생각을 정리하고 싶을 때는 계피차를");
		itemLore.add(ChatColor.GRAY + "마시면 기분이 좋아진다.");
		itemLore.add(ChatColor.GRAY + "달콤한걸 원한다면 시럽도 추가 가능하다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(255, 204, 153));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFCC99") + "베스파의 계피차");
		itemIm.setLocalizedName("40000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "생각을 정리하고 싶을 때는 계피차를");
		itemLore.add(ChatColor.GRAY + "마시면 기분이 좋아진다.");
		itemLore.add(ChatColor.GRAY + "달콤한걸 원한다면 시럽도 추가 가능하다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 40000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(255, 204, 153));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#6699FF") + "눈의 여왕의 입맞춤");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "마스카포네 치즈가 듬뿍 들어간");
		itemLore.add(ChatColor.GRAY + "부드러운 바바로아 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "주의! 가슴에 얼음이 박혀");
		itemLore.add(ChatColor.BLUE + "굉장히 추울 수 있다. 동상주의!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(102, 153, 255));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#6699FF") + "눈의 여왕의 입맞춤");
		itemIm.setLocalizedName("70000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "마스카포네 치즈가 듬뿍 들어간");
		itemLore.add(ChatColor.GRAY + "부드러운 바바로아 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "주의! 가슴에 얼음이 박혀");
		itemLore.add(ChatColor.BLUE + "굉장히 추울 수 있다. 동상주의!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 70000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(102, 153, 255));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#99FFFF") + "마법의 손키스");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "달콤한 바닐라향 밀크음료이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사랑과 정의의 이름으로 지금 이곳에 등장!");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 255, 255));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#99FFFF") + "마법의 손키스");
		itemIm.setLocalizedName("65000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "달콤한 바닐라향 밀크음료이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사랑과 정의의 이름으로 지금 이곳에 등장!");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 65000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 255, 255));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
}
