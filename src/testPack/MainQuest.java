package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainQuest {

	public MainQuest(Player player) {
		int lvl = player.getLevel();
		if(lvl == 5) {
			main1(player);
		} else if(lvl == 10) {
			main2(player);
		} else if(lvl == 15) {
			main3(player);
		} else if(lvl == 20) {
			main4(player);
		} else if(lvl == 30) {
			main5(player);
		} else if(lvl == 40) {
			main6(player);
		} else if(lvl == 50) {
			main7(player);
		} else if(lvl == 60) {
			main8(player);
		} else if(lvl == 70) {
			main9(player);
		} else if(lvl == 80) {
			main10(player);
		} else if(lvl == 90) {
			main11(player);
		} else if(lvl == 100) {
			main12(player);
		} else if(lvl == 110) {
			main13(player);
		} else if(lvl == 120) {
			main14(player);
		} else if(lvl == 130) {
			main15(player);
		} else if(lvl == 140) {
			main16(player);
		} else if(lvl == 150) {
			main17(player);
		} else if(lvl == 160) {
			main18(player);
		} else if(lvl == 170) {
			main19(player);
		} else if(lvl == 180) {
			main20(player);
		} else if(lvl == 190) {
			main21(player);
		} else if(lvl == 200) {
			main22(player);
		} else if(lvl == 210) {
			main23(player);
		} else if(lvl == 220) {
			main24(player);
		} else if(lvl == 230) {
			main25(player);
		} else if(lvl == 240) {
			main26(player);
		} else if(lvl == 250) {
			main27(player);
		} else if(lvl == 260) {
			main28(player);
		} else if(lvl == 270) {
			main29(player);
		} else if(lvl == 280) {
			main30(player);
		} else if(lvl == 290) {
			main31(player);
		} else if(lvl == 300) {
			main32(player);
		} else if(lvl == 310) {
			main33(player);
		} else if(lvl == 320) {
			main34(player);
		} else if(lvl == 330) {
			main35(player);
		} else if(lvl == 340) {
			main36(player);
		} else if(lvl == 350) {
			main37(player);
		} else if(lvl == 360) {
			main38(player);
		} else if(lvl == 370) {
			main39(player);
		} else if(lvl == 380) {
			main40(player);
		} else if(lvl == 390) {
			main41(player);
		} else if(lvl == 400) {
			main42(player);
		} else if(lvl == 410) {
			main43(player);
		} else if(lvl == 420) {
			main44(player);
		} else if(lvl == 430) {
			main45(player);
		} else if(lvl == 500) {
			main46(player);
		} else if(lvl == 530) {
			main47(player);
		} else if(lvl == 550) {
			main48(player);
		} else if(lvl == 620) {
			main49(player);
		} else if(lvl == 625) {
			main50(player);
		} else if(lvl == 650) {
			main51(player);
		} else if(lvl == 680) {
			main52(player);
		} else if(lvl == 700) {
			// 프렐리우드(마을) 모르가나산 이베르모어
			main53(player);
		} else if(lvl == 800) {
			
		} else if(lvl == 900) {
			
		} else if(lvl == 1000) {
			main_last(player);
		}
	}
	
	public void main1(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 1장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'워그닐 섬의 비밀' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main2(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 2장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'수련의 시작' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main3(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 3장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'에일 땅으로' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main4(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 4장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'촌장의 부탁1' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main5(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 5장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'촌장의 부탁2' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main6(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 6장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'촌장의 부탁3' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main7(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 7장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'전설의 시작' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main8(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 8장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'파르홀론의 역사' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main9(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 9장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'앞으로 나아가기 위한 여정' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main10(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 10장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'등대지기 시험' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}

	public void main11(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 11장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'등대에 숨겨진 비밀' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}

	public void main12(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 12장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'등대를 밝히는 힘' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main13(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 13장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'시드 광산으로 가는 길' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main14(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 14장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'시드 광산' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main15(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 15장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'포보르의 무기' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main16(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 16장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'미푀르유 성' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main17(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 17장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'은빛의 영역' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main18(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 18장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'진실을 아는 자1' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main19(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 19장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'진실을 아는 자2' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main20(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 20장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'진실을 아는 자3' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main21(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 21장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'진실을 아는 자6' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main22(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 22장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'아란모어' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main23(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 23장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'던전 탐색' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main24(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 24장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'카루 던전' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main25(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 25장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'설원의 보물1' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main26(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 26장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'설원의 보물2' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main27(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 27장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'새로운 만남' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main28(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 28장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'늪지의 마신왕' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main29(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 29장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'죽음의 탑' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main30(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 30장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'되살아난 해골' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main31(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 31장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'영혼 요정 가루' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main32(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 32장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'너의 근육을 먹고 싶어' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main33(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 33장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'그대는 빨간모자' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main34(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 34장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'또다시 빨간모자' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main35(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 35장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'마법탑을 향해' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main36(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 36장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'이것이 포보르 왕?' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main37(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 37장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'누가 우는 소리를 내었는가' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main38(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 38장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'누가 또 우는 소리를 내었는가' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main39(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 39장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'네비의 힘' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main40(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 40장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'아라크네의 저주' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main41(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 41장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'검은 흐름의 힘' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main42(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 42장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'항구 마을, 하마베 마을' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main43(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 43장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'광신도 집단2' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main44(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 44장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'광신도 집단3' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main45(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 45장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'대사막' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 사막의");
		scrollLore.add(ChatColor.RED + "모든 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 500레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main46(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 46장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'죽어가는 섬' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 라파누이의");
		scrollLore.add(ChatColor.RED + "모든 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 530레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main47(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 47장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'3개의 종' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 라히무호나의");
		scrollLore.add(ChatColor.RED + "모든 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 550레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main48(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 48장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'시오카나 섬' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 마지막 종을 울리기 위한");
		scrollLore.add(ChatColor.RED + "모든 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 620레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main49(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 49장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'마지막 종' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 마지막 종을 울리기 위한");
		scrollLore.add(ChatColor.RED + "모든 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 625레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main50(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 50장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'신대륙 칼라아릿' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 칼라아릿의");
		scrollLore.add(ChatColor.RED + "메인 퀘스트(상)를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 650레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main51(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 51장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'찾아온 불청객' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 칼라아릿의");
		scrollLore.add(ChatColor.RED + "메인 퀘스트(중)를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 680레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main52(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 52장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'변이된 원시의 땅' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 칼라아릿의");
		scrollLore.add(ChatColor.RED + "메인 퀘스트(하)를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 700레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main53(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 53장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'이베르모어' 퀘스트를 진행할 수 있다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.RED + "※주의 사항※");
		scrollLore.add(ChatColor.RED + "1. 해당 퀘스트 스크롤을 사용하면 세계의 문을");
		scrollLore.add(ChatColor.RED + "열기 위한 메인 퀘스트를 순서대로 진행할 수 있습니다.");
		scrollLore.add(ChatColor.RED + "2. 다음 메인 퀘스트 스크롤은 800레벨에 받을 수 있습니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
	public void main_last(Player player) {
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "메인퀘스트 마지막장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'최후의 전투' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
	}
	
}
