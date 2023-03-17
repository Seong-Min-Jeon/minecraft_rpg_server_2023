package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InteractVillager {

	Player player;
	Location loc;
	Entity ent;
	Random rnd = new Random();
	
	public boolean interactVillager(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
		loc = ent.getLocation();
		
		int i = 0;
		Inventory inv = player.getInventory();
		for (int j = 0 ; j < 36 ; j++) {
			if(inv.getItem(j) == null) {
				i++;
			}
		}
		if(i == 0) {
			if(((Villager)ent).getCanPickupItems() == false) {
				return false;
			} 
			player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
			return true;
		}
		
		return vil0() || vil1() || vil2() || vil3() || vil4();
	}
	
	public boolean vil0() {
		//전설의 시작 -1494 2037  -1491 2033
		if(loc.getX() <= -1489 && loc.getZ() <= 2037 
				&& loc.getX() >= -1495 && loc.getZ() >= 2032) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
					int qNum = cb.getNum(player);
					cb.q1(player, qNum+1);		
				} else {
					player.sendMessage(ChatColor.GRAY + "빛나는 검이 있다.");
				}
			} catch(Exception e) {
				player.sendMessage(ChatColor.GRAY + "빛나는 검이 있다.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil1() {
		//티르 경비병 -680 51 1956  -672 46 1943
		if(loc.getX() <= -672 && loc.getZ() <= 1956 
				&& loc.getX() >= -680 && loc.getZ() >= 1943) {
			player.sendMessage("티르 경비병: 이곳은 티르요. 내가 지켜야할 곳이지.");
			return true;
		}
		return false;
	}

	public boolean vil2() {
		//에일땅으로 퀘스트 -1875 2690 -1863 2702
		if(loc.getX() <= -1863 && loc.getZ() <= 2702 
				&& loc.getX() >= -1875 && loc.getZ() >= 2690) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에일 땅으로===")) {
					int qNum = cb.getNum(player);
					cb.q1(player, qNum+1);		
				} else {
					player.sendMessage("포르간 촌장: 허허.. 어서오시게.");
				}
			} catch(Exception e) {
				player.sendMessage("포르간 촌장: 허허.. 어서오시게.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil3() {
		//시드 광산 광부 -1152 43 1727  -1169 44 1742
		if(loc.getX() <= -1152 && loc.getZ() <= 1742 
				&& loc.getX() >= -1169 && loc.getZ() >= 1727) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산===")) {
    				int qNum = cb.getNum(player);
    				cb.q1(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===")) {
					Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					ItemStack weapon1 = chest.getInventory().getItem(6);
					if(player.getInventory().contains(weapon1)) {
						int qNum = cb.getNum(player);
        				cb.q1(player, qNum + 1);
					} else {
						player.sendMessage("광부: 물건은 어디에 있는가?");
					}
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===")) {
    				int qNum = cb.getNum(player);
    				cb.q1(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===")) {
    				int qNum = cb.getNum(player);
    				cb.q1(player, qNum + 1);
    			} else {
    				player.sendMessage("광부: 이곳에는 이제 남은게 없다만 필요하다면 둘러보시게.");
    			}
			} catch(Exception e) {
				player.sendMessage("광부: 이곳에는 이제 남은게 없다만 필요하다면 둘러보시게.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil4() {
		//미푀르유 식량창고 -862 58 1370  -879 69 1389
		if(loc.getX() <= -862 && loc.getZ() <= 1389 
				&& loc.getX() >= -879 && loc.getZ() >= 1370) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미푀르유 성===")) {
					int qNum = cb.getNum(player);
					cb.q1(player, qNum+1);		
				} else {
					player.sendMessage("불안한 주민: 날 좀 살려줘");
				}
			} catch(Exception e) {
				player.sendMessage("불안한 주민: 날 좀 살려줘");
			}
			return true;
		}
		return false;
	}
	
}
