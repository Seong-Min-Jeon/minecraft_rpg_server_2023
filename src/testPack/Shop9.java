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

public class Shop9 {
	
	public Shop9() {}

	public Shop9(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.GLOW_BERRIES);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFFFFF") + "침묵 교향곡 op.19");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "디저트로 최고인 교향곡이다.");
		itemLore.add(ChatColor.GRAY + "한번에 다양한 맛을 즐길 수 있는 메뉴이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "주의! 4악장이 시작되기 전에 드시기 바랍니다!");
		itemLore.add(ChatColor.RED + "!죄송합니다. 오늘은 토끼팀 호출이 불가능합니다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.GLOW_BERRIES);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#FFFFFF") + "침묵 교향곡 op.19");
		itemIm.setLocalizedName("850000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "디저트로 최고인 교향곡이다.");
		itemLore.add(ChatColor.GRAY + "한번에 다양한 맛을 즐길 수 있는 메뉴이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "주의! 4악장이 시작되기 전에 드시기 바랍니다!");
		itemLore.add(ChatColor.RED + "!죄송합니다. 오늘은 토끼팀 호출이 불가능합니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 850000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.COOKIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#000066") + "마탄의 쿠키");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "죽기 전에 꼭 먹어봐야 할 뉴욕 3대");
		itemLore.add(ChatColor.GRAY + "쿠키 중 하나인 르뱅블랙쿠키이다.");
		itemLore.add(ChatColor.GRAY + "쫀득하고 촉촉하며 토핑이 가득 들어있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "의뢰를 마치신 관리자님에게 마탄 E.G.O");
		itemLore.add(ChatColor.RED + "무기를 드릴 수도 있습니다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.COOKIE);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#000066") + "마탄의 쿠키");
		itemIm.setLocalizedName("450000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "죽기 전에 꼭 먹어봐야 할 뉴욕 3대");
		itemLore.add(ChatColor.GRAY + "쿠키 중 하나인 르뱅블랙쿠키이다.");
		itemLore.add(ChatColor.GRAY + "쫀득하고 촉촉하며 토핑이 가득 들어있다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "의뢰를 마치신 관리자님에게 마탄 E.G.O");
		itemLore.add(ChatColor.RED + "무기를 드릴 수도 있습니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 450000안");
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
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#990000") + "파고드는 포테이토");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "매콤한 칠리파우더에 고소한 체다치즈가");
		itemLore.add(ChatColor.GRAY + "어우러진 포테이토이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "!주의! 포테이토를 다 먹을 때까진");
		itemLore.add(ChatColor.RED + "자리를 비우시면 안됩니다.");
		itemLore.add(ChatColor.RED + "반드시 눈을 때지 말고 드세요.");
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
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#990000") + "파고드는 포테이토");
		itemIm.setLocalizedName("500000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "매콤한 칠리파우더에 고소한 체다치즈가");
		itemLore.add(ChatColor.GRAY + "어우러진 포테이토이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.RED + "!주의! 포테이토를 다 먹을 때까진");
		itemLore.add(ChatColor.RED + "자리를 비우시면 안됩니다.");
		itemLore.add(ChatColor.RED + "반드시 눈을 때지 말고 드세요.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 500000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		item.setItemMeta(itemIm);
		return item;
	}
	
}
