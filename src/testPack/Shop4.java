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

public class Shop4 {
	
	public Shop4() {}

	public Shop4(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "두뇌 자극 회로 V1");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "두뇌에 작은 칩을 심어 전기 자극에");
		itemLore.add(ChatColor.GRAY + "더욱 더 용이하게 작용되도록 한다.");
		itemLore.add(ChatColor.GRAY + "위치가 조금만 잘못되어도 신체를");
		itemLore.add(ChatColor.GRAY + "사용하지 못할 지경이 된다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-치명적인 공격을 받을 확률 -10%");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "두뇌 자극 회로 V1");
		itemIm.setLocalizedName("90000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "두뇌에 작은 칩을 심어 전기 자극에");
		itemLore.add(ChatColor.GRAY + "더욱 더 용이하게 작용되도록 한다.");
		itemLore.add(ChatColor.GRAY + "위치가 조금만 잘못되어도 신체를");
		itemLore.add(ChatColor.GRAY + "사용하지 못할 지경이 된다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-치명적인 공격을 받을 확률 -10%");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 90000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "유니온 공방제 슈트");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "유니온 공방은 몸에 붙이는 생체장비를 제작하는 공방이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "유니온 공방에서 특수 제작한 슈트형 생체장비.");
		itemLore.add(ChatColor.GRAY + "생체무기는 신체의 일부처럼 생각으로 조종할 수 있으며");
		itemLore.add(ChatColor.GRAY + "열량을 위해 무언가를 섭취할 필요도 있다.");
		itemLore.add(ChatColor.GRAY + "가장 저렴한 클래스의 슈트지만 성능 또한 좋고");
		itemLore.add(ChatColor.GRAY + "알레르기 반응을 신경 쓰지 않아도 된다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-데미지 경감 2");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "유니온 공방제 슈트");
		itemIm.setLocalizedName("120000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "유니온 공방은 몸에 붙이는 생체장비를 제작하는 공방이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "유니온 공방에서 특수 제작한 슈트형 생체장비.");
		itemLore.add(ChatColor.GRAY + "생체무기는 신체의 일부처럼 생각으로 조종할 수 있으며");
		itemLore.add(ChatColor.GRAY + "열량을 위해 무언가를 섭취할 필요도 있다.");
		itemLore.add(ChatColor.GRAY + "가장 저렴한 클래스의 슈트지만 성능 또한 좋고");
		itemLore.add(ChatColor.GRAY + "알레르기 반응을 신경 쓰지 않아도 된다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-데미지 경감 2");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 120000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "알라스 공방제 팬츠");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "알라스 공방에서 만든 제품은 움직임에 빠른 가속도를 준다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "알라스 공방에서 회피에 특화를 두고 만든 팬츠.");
		itemLore.add(ChatColor.GRAY + "특색인 검은침묵이 사용하는 랜스와 건틀릿이");
		itemLore.add(ChatColor.GRAY + "해당 공방에서 제작되었을 정도로 성능은 확실하다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-회피 쿨타임 0.2초 감소");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "알라스 공방제 팬츠");
		itemIm.setLocalizedName("80000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "알라스 공방에서 만든 제품은 움직임에 빠른 가속도를 준다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "알라스 공방에서 회피에 특화를 두고 만든 팬츠.");
		itemLore.add(ChatColor.GRAY + "특색인 검은침묵이 사용하는 랜스와 건틀릿이");
		itemLore.add(ChatColor.GRAY + "해당 공방에서 제작되었을 정도로 성능은 확실하다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-회피 쿨타임 0.2초 감소");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 80000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "나미르 공방제 부츠");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "나미르 공방의 제품은 G사의 특이점을 사용한다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "G사의 특이점을 이용하여 무게를 자유롭게");
		itemLore.add(ChatColor.GRAY + "조절할 수 있는 부츠.");
		itemLore.add(ChatColor.GRAY + "전투 중 어느정도 빠른 속도로 이동할 수 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-전투 중 속도 1");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.GOLD + "나미르 공방제 부츠");
		itemIm.setLocalizedName("100000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "나미르 공방의 제품은 G사의 특이점을 사용한다고 한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "G사의 특이점을 이용하여 무게를 자유롭게");
		itemLore.add(ChatColor.GRAY + "조절할 수 있는 부츠.");
		itemLore.add(ChatColor.GRAY + "전투 중 어느정도 빠른 속도로 이동할 수 있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "-전투 중 속도 1");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
