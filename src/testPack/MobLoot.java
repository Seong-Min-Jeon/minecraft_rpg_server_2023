package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.scoreboard.Objective;

public class MobLoot {

	Random rnd = new Random();

	public MobLoot(Player player) {}

	// 메세지
	public void sendMessage(Player player, String msg) {player.sendMessage(msg);}
	
	//쥐
	public void rat(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(500) + 100));
		
		ItemStack food = new ItemStack(Material.BEEF);
		ItemMeta foodIm = food.getItemMeta();
		foodIm.setDisplayName(ChatColor.RED + "누군가의 살점");
		ArrayList<String> foodLore = new ArrayList<>();
		foodLore.add(ChatColor.GRAY + "뒷골목에서 채취한 신선한 고기");
		foodLore.add(ChatColor.GRAY + "");
		foodLore.add(ChatColor.GRAY + "호사유피 인사유명이라 하였소.");
		foodLore.add(ChatColor.GRAY + "혈에는 말갛게 꽃이 피었소.");
		foodLore.add(ChatColor.GRAY + "이런 척박한 도시에서도 결국");
		foodLore.add(ChatColor.GRAY + "봉오리는 피우는구려.");
		foodIm.setLore(foodLore);
		food.setItemMeta(foodIm);
		player.getInventory().addItem(food);
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0004")) {
					int qNum = qb.getNum(p);
					qb.q0004(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0014")) {
					int qNum = qb.getNum(p);
					qb.q0014(p, qNum + 1, false);
				} else if (getQuestName(p).equals("uq9")) {
					int qNum = qb.getNum(p);
					qb.uq9(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0004")) {
			int qNum = qb.getNum(player);
			qb.q0004(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0014")) {
			int qNum = qb.getNum(player);
			qb.q0014(player, qNum + 1, false);
		} else if (getQuestName(player).equals("uq9")) {
			int qNum = qb.getNum(player);
			qb.uq9(player, qNum + 1, false);
		}
	}
	
	//쥐 두목
	public void ratBoss(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(2000) + 100));
		
		ItemStack food = new ItemStack(Material.BEEF);
		ItemMeta foodIm = food.getItemMeta();
		foodIm.setDisplayName(ChatColor.RED + "누군가의 살점");
		ArrayList<String> foodLore = new ArrayList<>();
		foodLore.add(ChatColor.GRAY + "뒷골목에서 채취한 신선한 고기");
		foodLore.add(ChatColor.GRAY + "");
		foodLore.add(ChatColor.GRAY + "호사유피 인사유명이라 하였소.");
		foodLore.add(ChatColor.GRAY + "혈에는 말갛게 꽃이 피었소.");
		foodLore.add(ChatColor.GRAY + "이런 척박한 도시에서도 결국");
		foodLore.add(ChatColor.GRAY + "봉오리는 피우는구려.");
		foodIm.setLore(foodLore);
		food.setItemMeta(foodIm);
		player.getInventory().addItem(food);
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0004")) {
					int qNum = qb.getNum(p);
					qb.q0004(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0014")) {
					int qNum = qb.getNum(p);
					qb.q0014(p, qNum + 1, false);
				} else if (getQuestName(p).equals("uq9")) {
					int qNum = qb.getNum(p);
					qb.uq9(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0004")) {
			int qNum = qb.getNum(player);
			qb.q0004(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0014")) {
			int qNum = qb.getNum(player);
			qb.q0014(player, qNum + 1, false);
		} else if (getQuestName(player).equals("uq9")) {
			int qNum = qb.getNum(player);
			qb.uq9(player, qNum + 1, false);
		}
	}
	
	//이름없는 9급 해결사
	public void fixer9(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 1000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0007")) {
					int qNum = qb.getNum(p);
					qb.q0007(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0007")) {
			int qNum = qb.getNum(player);
			qb.q0007(player, qNum + 1, false);
		}
	}
	
	//이름없는 8급 해결사
	public void fixer8(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 5000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0008")) {
					int qNum = qb.getNum(p);
					qb.q0008(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0008")) {
			int qNum = qb.getNum(player);
			qb.q0008(player, qNum + 1, false);
		}
	}
	
	//이름없는 7급 해결사
	public void fixer7(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(10000) + 10000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0009")) {
					int qNum = qb.getNum(p);
					qb.q0009(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0009")) {
			int qNum = qb.getNum(player);
			qb.q0009(player, qNum + 1, false);
		}
	}
	
	//갈고리 사무소 해결사
	public void galgori(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 1000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0015")) {
					int qNum = qb.getNum(p);
					qb.q0015(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0015")) {
			int qNum = qb.getNum(player);
			qb.q0015(player, qNum + 1, false);
		}
	}
	
	//철의 형제 조직원
	public void ironman(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 500));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0019")) {
					int qNum = qb.getNum(p);
					qb.q0019(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0019")) {
			int qNum = qb.getNum(player);
			qb.q0019(player, qNum + 1, false);
		}
	}
	
	//버림받은 개
	public void dog(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(500) + 2000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0021")) {
					int qNum = qb.getNum(p);
					qb.q0021(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0027")) {
					int qNum = qb.getNum(p);
					qb.q0027(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0021")) {
			int qNum = qb.getNum(player);
			qb.q0021(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0027")) {
			int qNum = qb.getNum(player);
			qb.q0027(player, qNum + 1, false);
		}
	}
	
	//꿀꿀이네
	public void ggul(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 1000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0022")) {
					int qNum = qb.getNum(p);
					qb.q0022(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0028")) {
					int qNum = qb.getNum(p);
					qb.q0028(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0022")) {
			int qNum = qb.getNum(player);
			qb.q0022(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0028")) {
			int qNum = qb.getNum(player);
			qb.q0028(player, qNum + 1, false);
		}
	}
	
	//도끼파
	public void axe(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 2000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0023")) {
					int qNum = qb.getNum(p);
					qb.q0023(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0029")) {
					int qNum = qb.getNum(p);
					qb.q0029(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0023")) {
			int qNum = qb.getNum(player);
			qb.q0023(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0029")) {
			int qNum = qb.getNum(player);
			qb.q0029(player, qNum + 1, false);
		}
	}
	
	//정육점파
	public void meat(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1500) + 1000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0024")) {
					int qNum = qb.getNum(p);
					qb.q0024(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0030")) {
					int qNum = qb.getNum(p);
					qb.q0030(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0024")) {
			int qNum = qb.getNum(player);
			qb.q0024(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0030")) {
			int qNum = qb.getNum(player);
			qb.q0030(player, qNum + 1, false);
		}
	}
	
	public void chainB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(3000) + 5000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0034")) {
					int qNum = qb.getNum(p);
					qb.q0034(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0085")) {
					int qNum = qb.getNum(p);
					qb.q0085(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0098")) {
					int qNum = qb.getNum(p);
					qb.q0098(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0034")) {
			int qNum = qb.getNum(player);
			qb.q0034(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0085")) {
			int qNum = qb.getNum(player);
			qb.q0085(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0098")) {
			int qNum = qb.getNum(player);
			qb.q0098(player, qNum + 1, false);
		}
	}
	
	public void kuroB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(2000) + 6000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0035")) {
					int qNum = qb.getNum(p);
					qb.q0035(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0086")) {
					int qNum = qb.getNum(p);
					qb.q0086(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0099")) {
					int qNum = qb.getNum(p);
					qb.q0099(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0035")) {
			int qNum = qb.getNum(player);
			qb.q0035(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0086")) {
			int qNum = qb.getNum(player);
			qb.q0086(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0099")) {
			int qNum = qb.getNum(player);
			qb.q0099(player, qNum + 1, false);
		}
	}
	
	public void carniB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1000) + 100));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0036")) {
					int qNum = qb.getNum(p);
					qb.q0036(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0087")) {
					int qNum = qb.getNum(p);
					qb.q0087(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0100")) {
					int qNum = qb.getNum(p);
					qb.q0100(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0036")) {
			int qNum = qb.getNum(player);
			qb.q0036(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0087")) {
			int qNum = qb.getNum(player);
			qb.q0087(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0100")) {
			int qNum = qb.getNum(player);
			qb.q0100(player, qNum + 1, false);
		}
	}
	
	public void ironballB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(5000) + 6000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0037")) {
					int qNum = qb.getNum(p);
					qb.q0037(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0088")) {
					int qNum = qb.getNum(p);
					qb.q0088(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0101")) {
					int qNum = qb.getNum(p);
					qb.q0101(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0037")) {
			int qNum = qb.getNum(player);
			qb.q0037(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0088")) {
			int qNum = qb.getNum(player);
			qb.q0088(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0101")) {
			int qNum = qb.getNum(player);
			qb.q0101(player, qNum + 1, false);
		}
	}
	
	public void habaB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(12000) + 2000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0038")) {
					int qNum = qb.getNum(p);
					qb.q0038(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0089")) {
					int qNum = qb.getNum(p);
					qb.q0089(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0102")) {
					int qNum = qb.getNum(p);
					qb.q0102(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0038")) {
			int qNum = qb.getNum(player);
			qb.q0038(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0089")) {
			int qNum = qb.getNum(player);
			qb.q0089(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0102")) {
			int qNum = qb.getNum(player);
			qb.q0102(player, qNum + 1, false);
		}
	}
	
	public void chain(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(2000) + 3000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0043")) {
					int qNum = qb.getNum(p);
					qb.q0043(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0049")) {
					int qNum = qb.getNum(p);
					qb.q0049(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0057")) {
					int qNum = qb.getNum(p);
					qb.q0057(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0063")) {
					int qNum = qb.getNum(p);
					qb.q0063(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0077")) {
					int qNum = qb.getNum(p);
					qb.q0077(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0091")) {
					int qNum = qb.getNum(p);
					qb.q0091(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0043")) {
			int qNum = qb.getNum(player);
			qb.q0043(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0049")) {
			int qNum = qb.getNum(player);
			qb.q0049(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0057")) {
			int qNum = qb.getNum(player);
			qb.q0057(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0063")) {
			int qNum = qb.getNum(player);
			qb.q0063(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0077")) {
			int qNum = qb.getNum(player);
			qb.q0077(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0091")) {
			int qNum = qb.getNum(player);
			qb.q0091(player, qNum + 1, false);
		}
	}
	
	public void kuro(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(1500) + 4000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0035")) {
					int qNum = qb.getNum(p);
					qb.q0035(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0050")) {
					int qNum = qb.getNum(p);
					qb.q0050(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0058")) {
					int qNum = qb.getNum(p);
					qb.q0058(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0064")) {
					int qNum = qb.getNum(p);
					qb.q0064(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0078")) {
					int qNum = qb.getNum(p);
					qb.q0078(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0092")) {
					int qNum = qb.getNum(p);
					qb.q0092(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0035")) {
			int qNum = qb.getNum(player);
			qb.q0035(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0050")) {
			int qNum = qb.getNum(player);
			qb.q0050(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0058")) {
			int qNum = qb.getNum(player);
			qb.q0058(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0064")) {
			int qNum = qb.getNum(player);
			qb.q0064(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0078")) {
			int qNum = qb.getNum(player);
			qb.q0078(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0092")) {
			int qNum = qb.getNum(player);
			qb.q0092(player, qNum + 1, false);
		}
	}
	
	public void carni(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(500) + 100));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0036")) {
					int qNum = qb.getNum(p);
					qb.q0036(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0051")) {
					int qNum = qb.getNum(p);
					qb.q0051(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0059")) {
					int qNum = qb.getNum(p);
					qb.q0059(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0065")) {
					int qNum = qb.getNum(p);
					qb.q0065(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0079")) {
					int qNum = qb.getNum(p);
					qb.q0079(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0093")) {
					int qNum = qb.getNum(p);
					qb.q0093(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0036")) {
			int qNum = qb.getNum(player);
			qb.q0036(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0051")) {
			int qNum = qb.getNum(player);
			qb.q0051(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0059")) {
			int qNum = qb.getNum(player);
			qb.q0059(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0065")) {
			int qNum = qb.getNum(player);
			qb.q0065(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0079")) {
			int qNum = qb.getNum(player);
			qb.q0079(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0093")) {
			int qNum = qb.getNum(player);
			qb.q0093(player, qNum + 1, false);
		}
	}
	
	public void ironball(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(3000) + 4000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0037")) {
					int qNum = qb.getNum(p);
					qb.q0037(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0052")) {
					int qNum = qb.getNum(p);
					qb.q0052(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0060")) {
					int qNum = qb.getNum(p);
					qb.q0060(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0066")) {
					int qNum = qb.getNum(p);
					qb.q0066(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0080")) {
					int qNum = qb.getNum(p);
					qb.q0080(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0094")) {
					int qNum = qb.getNum(p);
					qb.q0094(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0037")) {
			int qNum = qb.getNum(player);
			qb.q0037(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0052")) {
			int qNum = qb.getNum(player);
			qb.q0052(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0060")) {
			int qNum = qb.getNum(player);
			qb.q0060(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0066")) {
			int qNum = qb.getNum(player);
			qb.q0066(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0080")) {
			int qNum = qb.getNum(player);
			qb.q0080(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0094")) {
			int qNum = qb.getNum(player);
			qb.q0094(player, qNum + 1, false);
		}
	}
	
	public void haba(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(7000) + 1000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0038")) {
					int qNum = qb.getNum(p);
					qb.q0038(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0053")) {
					int qNum = qb.getNum(p);
					qb.q0053(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0061")) {
					int qNum = qb.getNum(p);
					qb.q0061(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0067")) {
					int qNum = qb.getNum(p);
					qb.q0067(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0081")) {
					int qNum = qb.getNum(p);
					qb.q0081(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0095")) {
					int qNum = qb.getNum(p);
					qb.q0095(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0038")) {
			int qNum = qb.getNum(player);
			qb.q0038(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0053")) {
			int qNum = qb.getNum(player);
			qb.q0053(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0061")) {
			int qNum = qb.getNum(player);
			qb.q0061(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0067")) {
			int qNum = qb.getNum(player);
			qb.q0067(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0081")) {
			int qNum = qb.getNum(player);
			qb.q0081(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0095")) {
			int qNum = qb.getNum(player);
			qb.q0095(player, qNum + 1, false);
		}
	}
	
	public void thumb(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(20000) + 20000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0107")) {
					int qNum = qb.getNum(p);
					qb.q0107(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0120")) {
					int qNum = qb.getNum(p);
					qb.q0120(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0107")) {
			int qNum = qb.getNum(player);
			qb.q0107(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0120")) {
			int qNum = qb.getNum(player);
			qb.q0120(player, qNum + 1, false);
		}
	}
	
	public void index(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(30000) + 15000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0108")) {
					int qNum = qb.getNum(p);
					qb.q0108(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0121")) {
					int qNum = qb.getNum(p);
					qb.q0121(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0108")) {
			int qNum = qb.getNum(player);
			qb.q0108(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0121")) {
			int qNum = qb.getNum(player);
			qb.q0121(player, qNum + 1, false);
		}
	}
	
	public void laugh(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(10000) + 5000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0109")) {
					int qNum = qb.getNum(p);
					qb.q0109(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0122")) {
					int qNum = qb.getNum(p);
					qb.q0122(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0109")) {
			int qNum = qb.getNum(player);
			qb.q0109(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0122")) {
			int qNum = qb.getNum(player);
			qb.q0122(player, qNum + 1, false);
		}
	}
	
	public void mariachi(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(10000) + 20000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0110")) {
					int qNum = qb.getNum(p);
					qb.q0110(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0123")) {
					int qNum = qb.getNum(p);
					qb.q0123(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0110")) {
			int qNum = qb.getNum(player);
			qb.q0110(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0123")) {
			int qNum = qb.getNum(player);
			qb.q0123(player, qNum + 1, false);
		}
	}
	
	public void thumbB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(20000) + 30000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0115")) {
					int qNum = qb.getNum(p);
					qb.q0115(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0115")) {
			int qNum = qb.getNum(player);
			qb.q0115(player, qNum + 1, false);
		}
	}
	
	public void indexB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(30000) + 25000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0116")) {
					int qNum = qb.getNum(p);
					qb.q0116(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0116")) {
			int qNum = qb.getNum(player);
			qb.q0116(player, qNum + 1, false);
		}
	}
	
	public void laughB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(10000) + 12000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0117")) {
					int qNum = qb.getNum(p);
					qb.q0117(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0117")) {
			int qNum = qb.getNum(player);
			qb.q0117(player, qNum + 1, false);
		}
	}
	
	public void mariachiB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(10000) + 30000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0118")) {
					int qNum = qb.getNum(p);
					qb.q0118(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0118")) {
			int qNum = qb.getNum(player);
			qb.q0118(player, qNum + 1, false);
		}
	}
	
	
	
	//============================
	
	//변이된 나뭇잎
	public void d1_1(Player player) {
		World world = player.getWorld();
		int num2 = rnd.nextInt(5);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3515.5, 48, 3706));
			sendMessage(player, "유적 어딘가로 이동했다.");
		}
		
		List<Entity> entitylist = player.getNearbyEntities(30, 12, 30);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.teleport(player.getLocation());
			}
		}
	}

	// 보스 스켈이
	public void mob2(Player player) {
		ItemStack ticket = new ItemStack(Material.PAPER);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "낫 교환권");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "낫과 교환할 수 있을 것 같다.");
		ticketLore.add(ChatColor.GRAY + "주민과 대화해 사용해보자");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		sendMessage(player, ChatColor.YELLOW + "낫 교환권" + ChatColor.WHITE + "을 획득했다.");
	}
	
	public String getQuestName(Player player) {
		try {
			ArrayList<Objective> list = new ArrayList<Objective>(player.getScoreboard().getObjectives());
			String name = "N";
			for(Objective obj : list) {
				if(obj.getDisplayName().charAt(2) == '[') {
					name = obj.getName();
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return "N";
		}
	}
}
