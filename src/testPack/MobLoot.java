package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
	static File folder = null; 
	
	public MobLoot() {}
	
	public MobLoot(Player player) {}

	public void setFolder(File f) {
		folder = f;
	}
	
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 9);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 1, 9);
		}
	}
	
	//청소부
	public void cleaner(Player player) {
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta itemIm = item.getItemMeta();
		itemIm.setDisplayName(ChatColor.RED + "청소부의 액체연료");
		ArrayList<String> itemLore = new ArrayList<>();
		itemLore.add(ChatColor.GRAY + "체리향 연료가 들어간 젤리이다.");
		itemLore.add(ChatColor.GRAY + "");
		itemLore.add(ChatColor.GRAY + "이 연료를 먹고 청소부의 식량이");
		itemLore.add(ChatColor.GRAY + "될 수 있으니 주의하세요.");
		itemIm.setLore(itemLore);
		itemIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		itemIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		itemIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		PotionMeta pm = (PotionMeta) itemIm;
		pm.setColor(Color.fromRGB(255, 10, 10));
		itemIm = pm;
		item.setItemMeta(itemIm);
		player.getInventory().addItem(item);
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 3, 36);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 10);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 11);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 12);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 13);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 1, 14);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 2, 21);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 2, 22);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 2, 23);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 2, 24);
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
		
		if(rnd.nextInt(50) == 0) {
			fixFile(player, 2, 25);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 2, 21);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 2, 22);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 2, 23);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 2, 24);
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
		
		if(rnd.nextInt(100) == 0) {
			fixFile(player, 2, 25);
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
				} else if (getQuestName(p).equals("q0136")) {
					int qNum = qb.getNum(p);
					qb.q0136(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0161")) {
					int qNum = qb.getNum(p);
					qb.q0161(p, qNum + 1, false);
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
		} else if (getQuestName(player).equals("q0136")) {
			int qNum = qb.getNum(player);
			qb.q0136(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0161")) {
			int qNum = qb.getNum(player);
			qb.q0161(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 2, 26);
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
				} else if (getQuestName(p).equals("q0137")) {
					int qNum = qb.getNum(p);
					qb.q0137(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0162")) {
					int qNum = qb.getNum(p);
					qb.q0162(p, qNum + 1, false);
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
		} else if (getQuestName(player).equals("q0137")) {
			int qNum = qb.getNum(player);
			qb.q0137(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0162")) {
			int qNum = qb.getNum(player);
			qb.q0162(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 2, 27);
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
				} else if (getQuestName(p).equals("q0138")) {
					int qNum = qb.getNum(p);
					qb.q0138(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0163")) {
					int qNum = qb.getNum(p);
					qb.q0163(p, qNum + 1, false);
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
		} else if (getQuestName(player).equals("q0138")) {
			int qNum = qb.getNum(player);
			qb.q0138(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0163")) {
			int qNum = qb.getNum(player);
			qb.q0163(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 28);
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
				} else if (getQuestName(p).equals("q0139")) {
					int qNum = qb.getNum(p);
					qb.q0139(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0164")) {
					int qNum = qb.getNum(p);
					qb.q0164(p, qNum + 1, false);
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
		} else if (getQuestName(player).equals("q0139")) {
			int qNum = qb.getNum(player);
			qb.q0139(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0164")) {
			int qNum = qb.getNum(player);
			qb.q0164(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 29);
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
				} else if (getQuestName(p).equals("q0126")) {
					int qNum = qb.getNum(p);
					qb.q0126(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0149")) {
					int qNum = qb.getNum(p);
					qb.q0149(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0173")) {
					int qNum = qb.getNum(p);
					qb.q0173(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0115")) {
			int qNum = qb.getNum(player);
			qb.q0115(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0126")) {
			int qNum = qb.getNum(player);
			qb.q0126(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0149")) {
			int qNum = qb.getNum(player);
			qb.q0149(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0173")) {
			int qNum = qb.getNum(player);
			qb.q0173(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 2, 26);
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
				} else if (getQuestName(p).equals("q0127")) {
					int qNum = qb.getNum(p);
					qb.q0127(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0150")) {
					int qNum = qb.getNum(p);
					qb.q0150(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0174")) {
					int qNum = qb.getNum(p);
					qb.q0174(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0116")) {
			int qNum = qb.getNum(player);
			qb.q0116(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0127")) {
			int qNum = qb.getNum(player);
			qb.q0127(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0150")) {
			int qNum = qb.getNum(player);
			qb.q0150(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0174")) {
			int qNum = qb.getNum(player);
			qb.q0174(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 2, 27);
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
				} else if (getQuestName(p).equals("q0128")) {
					int qNum = qb.getNum(p);
					qb.q0128(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0151")) {
					int qNum = qb.getNum(p);
					qb.q0151(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0175")) {
					int qNum = qb.getNum(p);
					qb.q0175(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0117")) {
			int qNum = qb.getNum(player);
			qb.q0117(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0128")) {
			int qNum = qb.getNum(player);
			qb.q0128(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0151")) {
			int qNum = qb.getNum(player);
			qb.q0151(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0175")) {
			int qNum = qb.getNum(player);
			qb.q0175(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 28);
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
				} else if (getQuestName(p).equals("q0129")) {
					int qNum = qb.getNum(p);
					qb.q0129(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0152")) {
					int qNum = qb.getNum(p);
					qb.q0152(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0176")) {
					int qNum = qb.getNum(p);
					qb.q0176(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0118")) {
			int qNum = qb.getNum(player);
			qb.q0118(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0129")) {
			int qNum = qb.getNum(player);
			qb.q0129(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0152")) {
			int qNum = qb.getNum(player);
			qb.q0152(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0176")) {
			int qNum = qb.getNum(player);
			qb.q0176(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 29);
		}
	}
	
	public void thumbCP(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(40000) + 80000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0140")) {
					int qNum = qb.getNum(p);
					qb.q0140(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0165")) {
					int qNum = qb.getNum(p);
					qb.q0165(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0189")) {
					int qNum = qb.getNum(p);
					qb.q0189(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0140")) {
			int qNum = qb.getNum(player);
			qb.q0140(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0165")) {
			int qNum = qb.getNum(player);
			qb.q0165(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0189")) {
			int qNum = qb.getNum(player);
			qb.q0189(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 33);
		}
	}
	
	public void indexMS(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(70000) + 50000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0141")) {
					int qNum = qb.getNum(p);
					qb.q0141(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0166")) {
					int qNum = qb.getNum(p);
					qb.q0166(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0190")) {
					int qNum = qb.getNum(p);
					qb.q0190(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0141")) {
			int qNum = qb.getNum(player);
			qb.q0141(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0166")) {
			int qNum = qb.getNum(player);
			qb.q0166(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0190")) {
			int qNum = qb.getNum(player);
			qb.q0190(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 35);
		}
	}
	
	public void indexSD(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(70000) + 50000));
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 34);
		}
	}
	
	public void kong(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(50000) + 150000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0142")) {
					int qNum = qb.getNum(p);
					qb.q0142(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0167")) {
					int qNum = qb.getNum(p);
					qb.q0167(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0191")) {
					int qNum = qb.getNum(p);
					qb.q0191(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0142")) {
			int qNum = qb.getNum(player);
			qb.q0142(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0167")) {
			int qNum = qb.getNum(player);
			qb.q0167(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0191")) {
			int qNum = qb.getNum(player);
			qb.q0191(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 30);
		}
	}
	
	public void sword(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(50000) + 50000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0143")) {
					int qNum = qb.getNum(p);
					qb.q0143(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0168")) {
					int qNum = qb.getNum(p);
					qb.q0168(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0192")) {
					int qNum = qb.getNum(p);
					qb.q0192(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0143")) {
			int qNum = qb.getNum(player);
			qb.q0143(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0168")) {
			int qNum = qb.getNum(player);
			qb.q0168(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0192")) {
			int qNum = qb.getNum(player);
			qb.q0192(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 31);
		}
	}
	
	public void awl(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(30000) + 80000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0144")) {
					int qNum = qb.getNum(p);
					qb.q0144(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0169")) {
					int qNum = qb.getNum(p);
					qb.q0169(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0193")) {
					int qNum = qb.getNum(p);
					qb.q0193(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0144")) {
			int qNum = qb.getNum(player);
			qb.q0144(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0169")) {
			int qNum = qb.getNum(player);
			qb.q0169(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0193")) {
			int qNum = qb.getNum(player);
			qb.q0193(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(150) == 0) {
			fixFile(player, 3, 32);
		}
	}
	
	public void thumbCPB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(40000) + 120000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0153")) {
					int qNum = qb.getNum(p);
					qb.q0153(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0177")) {
					int qNum = qb.getNum(p);
					qb.q0177(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0197")) {
					int qNum = qb.getNum(p);
					qb.q0197(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0153")) {
			int qNum = qb.getNum(player);
			qb.q0153(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0177")) {
			int qNum = qb.getNum(player);
			qb.q0177(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0197")) {
			int qNum = qb.getNum(player);
			qb.q0197(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 33);
		}
	}
	
	public void indexMSB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(70000) + 90000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0154")) {
					int qNum = qb.getNum(p);
					qb.q0154(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0178")) {
					int qNum = qb.getNum(p);
					qb.q0178(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0198")) {
					int qNum = qb.getNum(p);
					qb.q0198(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0154")) {
			int qNum = qb.getNum(player);
			qb.q0154(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0178")) {
			int qNum = qb.getNum(player);
			qb.q0178(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0198")) {
			int qNum = qb.getNum(player);
			qb.q0198(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 35);
		}
	}
	
	public void kongB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(50000) + 220000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0155")) {
					int qNum = qb.getNum(p);
					qb.q0155(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0179")) {
					int qNum = qb.getNum(p);
					qb.q0179(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0199")) {
					int qNum = qb.getNum(p);
					qb.q0199(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0155")) {
			int qNum = qb.getNum(player);
			qb.q0155(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0179")) {
			int qNum = qb.getNum(player);
			qb.q0179(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0199")) {
			int qNum = qb.getNum(player);
			qb.q0199(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 30);
		}
	}
	
	public void swordB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(50000) + 90000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0156")) {
					int qNum = qb.getNum(p);
					qb.q0156(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0180")) {
					int qNum = qb.getNum(p);
					qb.q0180(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0200")) {
					int qNum = qb.getNum(p);
					qb.q0200(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0156")) {
			int qNum = qb.getNum(player);
			qb.q0156(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0180")) {
			int qNum = qb.getNum(player);
			qb.q0180(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0200")) {
			int qNum = qb.getNum(player);
			qb.q0200(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 31);
		}
	}
	
	public void awlB(Player player) {
		player.setLevel(player.getLevel() + (rnd.nextInt(30000) + 140000));
		
		List<Entity> nearPlayer = player.getNearbyEntities(7, 2, 7);
		for(Entity np : nearPlayer) {
			if(np instanceof Player) {
				Player p = (Player) np;
				QuestBoard qb = new QuestBoard();
				if (getQuestName(p).equals("q0157")) {
					int qNum = qb.getNum(p);
					qb.q0157(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0181")) {
					int qNum = qb.getNum(p);
					qb.q0181(p, qNum + 1, false);
				} else if (getQuestName(p).equals("q0201")) {
					int qNum = qb.getNum(p);
					qb.q0201(p, qNum + 1, false);
				}
			}
		}
		
		QuestBoard qb = new QuestBoard();
		if (getQuestName(player).equals("q0157")) {
			int qNum = qb.getNum(player);
			qb.q0157(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0181")) {
			int qNum = qb.getNum(player);
			qb.q0181(player, qNum + 1, false);
		} else if (getQuestName(player).equals("q0201")) {
			int qNum = qb.getNum(player);
			qb.q0201(player, qNum + 1, false);
		}
		
		if(rnd.nextInt(80) == 0) {
			fixFile(player, 3, 32);
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
	
	public void fixFile(Player player, int rare, int order) {
		try {
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(folder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "personality_grade.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String first = bufReader.readLine();
    				String second = bufReader.readLine();
    				String third = bufReader.readLine();
    				String fourth = bufReader.readLine();
    				
    				if(rare == 1) {
    					String[] num = first.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 2) {
    					String[] num = second.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 3) {
    					String[] num = third.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 4) {
    					String[] num = fourth.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				}
    				
	                bufReader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e2) {
			
		}
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
