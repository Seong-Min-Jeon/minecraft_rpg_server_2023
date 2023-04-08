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

public class Shop11 {
	
	public Shop11() {}

	public Shop11(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GREEN + "혈청K");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "K사의 특이점을 이용해 만든 특수한 액체.");
		itemLore.add(ChatColor.GRAY + "순식간에 모든 피해를 치료해주고 재생이 되지만");
		itemLore.add(ChatColor.GRAY + "날개에서도 비싸다고 함부로 못 쓸 정도로 매우 고가이다.");
		itemLore.add(ChatColor.GRAY + "날개 소속 직원이 아니라면 공식적으로 구할 수 있는");
		itemLore.add(ChatColor.GRAY + "방법은 없지만 뒷골목의 암거래상을 통해 구할 수 있다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(51, 204, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GREEN + "혈청K");
		itemIm.setLocalizedName("10000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "K사의 특이점을 이용해 만든 특수한 액체.");
		itemLore.add(ChatColor.GRAY + "순식간에 모든 피해를 치료해주고 재생이 되지만");
		itemLore.add(ChatColor.GRAY + "날개에서도 비싸다고 함부로 못 쓸 정도로 매우 고가이다.");
		itemLore.add(ChatColor.GRAY + "날개 소속 직원이 아니라면 공식적으로 구할 수 있는");
		itemLore.add(ChatColor.GRAY + "방법은 없지만 뒷골목의 암거래상을 통해 구할 수 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(51, 204, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
}
