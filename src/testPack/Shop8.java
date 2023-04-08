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

public class Shop8 {
	
	public Shop8() {}

	public Shop8(Player player) {
		Inventory inv = Bukkit.createInventory(player, 36, "상점");
		
		inv.setItem(0, item1D());
		inv.setItem(1, item2D());
		inv.setItem(2, item3D());
		
		player.openInventory(inv);
	}
	
	public ItemStack item1() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#999999") + "호크앤쿠");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "코어 억제 들어가기 10분 전입니다.");
		itemLore.add(ChatColor.GRAY + "관리자님들은 하던 배치 작업을 잠깐 멈추시고");
		itemLore.add(ChatColor.GRAY + "피로회복에 좋은 호크앤쿠를 드시기 바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "코어 억제에 들어가면 피로도가 상승하실 겁니다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 153, 153));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item1D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#999999") + "호크앤쿠");
		itemIm.setLocalizedName("800000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "코어 억제 들어가기 10분 전입니다.");
		itemLore.add(ChatColor.GRAY + "관리자님들은 하던 배치 작업을 잠깐 멈추시고");
		itemLore.add(ChatColor.GRAY + "피로회복에 좋은 호크앤쿠를 드시기 바랍니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "코어 억제에 들어가면 피로도가 상승하실 겁니다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 800000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(153, 153, 153));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#333333") + "추출팀의 우물에서 떠온 ■■");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "까만 콜라에 노란 레몬의");
		itemLore.add(ChatColor.GRAY + "상큼함이 어우러진 탄산음료이다.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(51, 51, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item2D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#333333") + "추출팀의 우물에서 떠온 ■■");
		itemIm.setLocalizedName("850000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "까만 콜라에 노란 레몬의");
		itemLore.add(ChatColor.GRAY + "상큼함이 어우러진 탄산음료이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 850000안");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(51, 51, 51));
		itemIm = pm;
		item.setItemMeta(itemIm);
		return item;
	}
	
	public ItemStack item3() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#33CC33") + "예술");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "고통뿐인 삶 속에서 계속 살아가야 하는 이유를 묻는다면,");
		itemLore.add(ChatColor.GRAY + "아직도 정확히 대답하지는 못하겠어요.");
		itemLore.add(ChatColor.GRAY + "깨운 건 당신이지만,");
		itemLore.add(ChatColor.GRAY + "그 뒤부터는 저의 몫인 거겠죠.");
		itemLore.add(ChatColor.GRAY + "저는 용기를 좀 더 내보기로 선택했어요.");
		itemLore.add(ChatColor.GRAY + "그럼에도 불구하고 살아가자 라는 생각을 가지기까지");
		itemLore.add(ChatColor.GRAY + "저한테는 대단한 용기가 필요했거든요.");
		itemLore.add(ChatColor.GRAY + "당신도 일단, 한 번 살아보세요.");
		itemLore.add(ChatColor.GRAY + "저도 해낸 일을 당신이라고 못할 게 뭐가 있겠어요?");
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
	
	public ItemStack item3D() {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(net.md_5.bungee.api.ChatColor.of("#33CC33") + "예술");
		itemIm.setLocalizedName("1000000");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "고통뿐인 삶 속에서 계속 살아가야 하는 이유를 묻는다면,");
		itemLore.add(ChatColor.GRAY + "아직도 정확히 대답하지는 못하겠어요.");
		itemLore.add(ChatColor.GRAY + "깨운 건 당신이지만,");
		itemLore.add(ChatColor.GRAY + "그 뒤부터는 저의 몫인 거겠죠.");
		itemLore.add(ChatColor.GRAY + "저는 용기를 좀 더 내보기로 선택했어요.");
		itemLore.add(ChatColor.GRAY + "그럼에도 불구하고 살아가자 라는 생각을 가지기까지");
		itemLore.add(ChatColor.GRAY + "저한테는 대단한 용기가 필요했거든요.");
		itemLore.add(ChatColor.GRAY + "당신도 일단, 한 번 살아보세요.");
		itemLore.add(ChatColor.GRAY + "저도 해낸 일을 당신이라고 못할 게 뭐가 있겠어요?");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.BLUE + "가격: 1000000안");
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
