package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InteractNPC {

	QuestBoard qb = new QuestBoard();
	Player player;
	Location loc;
	
	public boolean interactNPC(Player player, Entity ent) {
		this.player = player;
		loc = ent.getLocation();
		
		int i = 0;
		Inventory inv = player.getInventory();
		for (int j = 0 ; j < 36 ; j++) {
			if(inv.getItem(j) == null) {
				i++;
			}
		}
		if(i == 0) {
			player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
			return true;
		}
		
		return npc1() || npc2() || npc3() || npc4();
	}
	
	public boolean npc1() {
		//의문의 소녀 -2503 53 531
		if(loc.getX() == -2503 && loc.getY() == 53 && loc.getZ() == 531) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
					player.sendMessage("의문의 소녀: ...");
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
					if(player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
						int qNum = cb.getNum(player);
						cb.eq1_1(player, qNum+1);	
					} else {
						player.sendMessage("의문의 소녀: ...");
					}
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc2() {
		//기사 -2453 84 751
		if(loc.getX() == -2453 && loc.getY() == 84 && loc.getZ() == 751) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
					player.sendMessage("기사: 의장께서는 §e카루 던전§f에 계실 것이다.");
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희4===")) {
					int qNum = cb.getNum(player);
					cb.eq1_3(player, qNum+1);	
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc3() {
		//의장 -2433 28 796
		if(loc.getX() == -2433 && loc.getY() == 28 && loc.getZ() == 796) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희6===")) {
					int qNum = cb.getNum(player);
					cb.eq1_5(player, qNum+1);
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
					
					boolean wear = false;
					
					if (player.getInventory().getHelmet() != null) {
						if (player.getInventory().getChestplate() != null) {
							if (player.getInventory().getLeggings() != null) {
								if (player.getInventory().getBoots() != null) {
									
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 헬멧")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 갑옷")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 각반")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 신발")) {
													wear = true;
												}
											}
										}
									}
									if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 헬멧")) {
										if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 갑옷")) {
											if (player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 각반")) {
												if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 신발")) {
													wear = true;
												}
											}
										}
									}
									
								}
							}
						}
					}
					
					if(player.getInventory().contains(Material.ORANGE_DYE)) {
						int qNum = cb.getNum(player);
						cb.eq1_4(player, qNum+1);
						return true;
					}
					
					if(wear == true) {
						player.getInventory().setHelmet(null);
						player.getInventory().setChestplate(null);
						player.getInventory().setLeggings(null);
						player.getInventory().setBoots(null);
						
						int qNum = cb.getNum(player);
						cb.eq1_4(player, qNum+1);
					} else {
						player.sendMessage("§7의장께서는 바빠보인다. 나중에 다시 오자.");
					}
					
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}
	
	public boolean npc4() {
		//빨간모자 
		if(loc.getX() == 291 && loc.getY() == 55 && loc.getZ() == 153) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===")) {
					int qNum = cb.getNum(player);
					cb.mq33(player, qNum+1);	
				}
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===")) {
					int qNum = cb.getNum(player);
					cb.mq34(player, qNum+1);	
				}
			} catch(Exception e) {

			}
			return true;
		}
		return false;
	}

	
}
