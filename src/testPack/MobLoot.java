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
			String name = null;
			for(Objective obj : list) {
				if(obj.getDisplayName().charAt(2) == '[') {
					name = obj.getName();
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return null;
		}
	}
}
