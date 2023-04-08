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

public class Shop2 {
	
	public Shop2() {}

	public Shop2(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "알록달록 " + ChatColor.GREEN + "칵" + ChatColor.YELLOW + "테" + ChatColor.RED + "일");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "빨간 자몽, 노랑 오랜지, 초록 청포도 맛을 더해");
		itemLore.add(ChatColor.GRAY + "알록의 눈을 표현한 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "칵테일을 다 마실 때까지 끈질긴");
		itemLore.add(ChatColor.GRAY + "시선이 계속된다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(82, 31, 10));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "알록달록 " + ChatColor.GREEN + "칵" + ChatColor.YELLOW + "테" + ChatColor.RED + "일");
		itemIm.setLocalizedName("9500");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "빨간 자몽, 노랑 오랜지, 초록 청포도 맛을 더해");
		itemLore.add(ChatColor.GRAY + "알록의 눈을 표현한 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "칵테일을 다 마실 때까지 끈질긴");
		itemLore.add(ChatColor.GRAY + "시선이 계속된다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 9500안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(82, 31, 10));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#CC9933") + "올가의 홍차칵테일");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "보드카와 얼그레이의 황금비율.");
		itemLore.add(ChatColor.GRAY + "그리고 해장에 좋은 꿀을 첨가한");
		itemLore.add(ChatColor.GRAY + "홍차칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "하아.. 누님 또 얼마나 마실거에요?");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(204, 153, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#CC9933") + "올가의 홍차칵테일");
		itemIm.setLocalizedName("8000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "보드카와 얼그레이의 황금비율.");
		itemLore.add(ChatColor.GRAY + "그리고 해장에 좋은 꿀을 첨가한");
		itemLore.add(ChatColor.GRAY + "홍차칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "하아.. 누님 또 얼마나 마실거에요?");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 8000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(204, 153, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#993333") + "단테주");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "강렬한 보드카, 은은한 베리향.");
		itemLore.add(ChatColor.GRAY + "그리고 불꽃처럼 반짝이는 금가루 펄까지");
		itemLore.add(ChatColor.GRAY + "영롱하고 상큼한 단테 시그니쳐 칵테일이다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 51, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#993333") + "단테주");
		itemIm.setLocalizedName("8500");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "강렬한 보드카, 은은한 베리향.");
		itemLore.add(ChatColor.GRAY + "그리고 불꽃처럼 반짝이는 금가루 펄까지");
		itemLore.add(ChatColor.GRAY + "영롱하고 상큼한 단테 시그니쳐 칵테일이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 8500안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 51, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
}
