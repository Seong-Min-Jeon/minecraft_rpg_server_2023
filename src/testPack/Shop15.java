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

public class Shop15 {
	
	public Shop15() {}

	public Shop15(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [1]");
		itemIm.setLocalizedName("1");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [1]");
		itemIm.setLocalizedName("100000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [2]");
		itemIm.setLocalizedName("2");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [2]");
		itemIm.setLocalizedName("1000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 1000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [3]");
		itemIm.setLocalizedName("3");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [3]");
		itemIm.setLocalizedName("10000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [4]");
		itemIm.setLocalizedName("4");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.BREWING_STAND);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "불완전한 빛 [4]");
		itemIm.setLocalizedName("100000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "무한한 에너지와 미덕을 깨우쳐 얻은");
		itemLore.add(ChatColor.GRAY + "빛의 씨앗의 일부.");
		itemLore.add(ChatColor.GRAY + "도시가 빛으로 가득찼던 3일간의 흔적이다.");
		itemLore.add(ChatColor.GRAY + "자신의 열망을 자각하고, 폭발시키는 힘이");
		itemLore.add(ChatColor.GRAY + "담겨져 있다.");
		itemLore.add(ChatColor.GRAY + "매일을 불안과 고통에 사는 뒷골목의 쥐에게");
		itemLore.add(ChatColor.GRAY + "사용하면 특별한 일이 일어날 것 같다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100000000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		itemIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		itemIm.setUnbreakable(true);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
