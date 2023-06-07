package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Shop1 {
	
	public Shop1() {}

	public Shop1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		inv.setItem(3, item4D());
		inv.setItem(4, item5D());
		inv.setItem(5, item6D());
		inv.setItem(6, item7D());
		inv.setItem(7, item8D());
		inv.setItem(8, item9D());
		inv.setItem(9, item10D());
		inv.setItem(10, item11D());
		inv.setItem(11, item12D());
		inv.setItem(12, item13D());
		inv.setItem(13, item14D());
		inv.setItem(14, item15D());
		inv.setItem(15, item16D());
		inv.setItem(16, item17D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +1");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 0->1강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +1");
		itemIm.setLocalizedName("20");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 0->1강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 20광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +2");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 1->2강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +2");
		itemIm.setLocalizedName("40");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 1->2강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 40광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +3");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 2->3강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +3");
		itemIm.setLocalizedName("100");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 2->3강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +4");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 3->4강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item4D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +4");
		itemIm.setLocalizedName("500");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 3->4강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 500광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +5");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 4->5강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item5D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +5");
		itemIm.setLocalizedName("2000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 4->5강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 2000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item6() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +6");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 5->6강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item6D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +6");
		itemIm.setLocalizedName("5000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 5->6강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 5000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item7() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +7");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 6->7강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item7D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +7");
		itemIm.setLocalizedName("10000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 6->7강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item8() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +8");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 7->8강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item8D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +8");
		itemIm.setLocalizedName("30000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 7->8강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 30000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item9() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +9");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 8->9강화 시킬 수 있는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item9D() {
		ItemStack item = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.WHITE + "인격 강화서 +9");
		itemIm.setLocalizedName("50000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "선택한 인격을 8->9강화 시킬 수 있는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 50000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item10() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "W사 정리요원 인격 개방서");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "W사 정리요원 인격에 동화될 수 있게 해주는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item10D() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "W사 정리요원 인격 개방서");
		itemIm.setLocalizedName("2600");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "W사 정리요원 인격에 동화될 수 있게 해주는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 2600광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item11() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "K사 진압요원 인격 개방서");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "K사 진압요원 인격에 동화될 수 있게 해주는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item11D() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "K사 진압요원 인격 개방서");
		itemIm.setLocalizedName("2600");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "K사 진압요원 인격에 동화될 수 있게 해주는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 2600광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item12() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.LIGHT_PURPLE + "R사 토끼팀 인격 개방서");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "R사 토끼팀 인격에 동화될 수 있게 해주는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item12D() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.LIGHT_PURPLE + "R사 토끼팀 인격 개방서");
		itemIm.setLocalizedName("13000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "R사 토끼팀 인격에 동화될 수 있게 해주는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 13000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item13() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.LIGHT_PURPLE + "N사 쥐는 자 인격 개방서");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "N사 쥐는 자 인격에 동화될 수 있게 해주는 문서");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item13D() {
		ItemStack item = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.LIGHT_PURPLE + "N사 쥐는 자 인격 개방서");
		itemIm.setLocalizedName("13000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "N사 쥐는 자 인격에 동화될 수 있게 해주는 문서");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 13000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item14() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 1단계");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 1개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item14D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 1단계");
		itemIm.setLocalizedName("100");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 1개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item15() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 2단계");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 2개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item15D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 2단계");
		itemIm.setLocalizedName("1000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 2개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 1000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item16() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 3단계");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 3개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item16D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 3단계");
		itemIm.setLocalizedName("10000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 3개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 10000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item17() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 4단계");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 4개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item17D() {
		ItemStack item = new ItemStack(Material.MOJANG_BANNER_PATTERN);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.AQUA + "워프마커 슬롯 확장권 4단계");
		itemIm.setLocalizedName("100000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.RED + "WARNING: 이 문서를 구입 후 사용하지 않고 인격에");
		itemLore.add(ChatColor.RED + "동화되면 소멸합니다. 구입 즉시 사용바랍니다.");
		itemLore.add(ChatColor.RED + "워프마커 슬롯이 최대 4개인 플레이어만 사용할 수 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "사용하면 워프마커 슬롯이 하나 증가한다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 100000광기");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
