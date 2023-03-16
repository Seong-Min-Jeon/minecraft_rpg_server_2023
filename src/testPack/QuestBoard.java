package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Stray;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class QuestBoard {
	
	private Message msg = new Message();
	ExpSystem es = new ExpSystem();

	public void q1(Player player, int num) {
		//상점
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,20);
			player.getInventory().addItem(item);
			es.giveExp(player, 50);
			player.sendMessage(ChatColor.WHITE + "에메랄드" + ChatColor.WHITE + " 20개를 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===해안의 위협===");
		score.setScore(2);
		Score score2 = obj.getScore("해안가 좀비 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q2(Player player, int num) {
		//잊혀진 해안 던전 보상
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(1);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "검은 해적단의 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===해적선의 보물===");
		score.setScore(3);
		Score score2 = obj.getScore("워그닐 바다의 해적선에서");
		score2.setScore(2);
		Score score3 = obj.getScore("보물 상자를 찾아보자");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q3(Player player, int num) {
		//상점
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,50);
			player.getInventory().addItem(item);
			es.giveExp(player, 300);
			player.sendMessage(ChatColor.WHITE + "에메랄드" + ChatColor.WHITE + " 50개를 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GRAY + "C급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 말단===");
		score.setScore(2);
		Score score2 = obj.getScore("크리스탈 워리어 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q4(Player player, int num) {
		//포레스트 고스트 드랍
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.WHEAT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "상처가 많은 밀");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "상처가 많은 밀" + ChatColor.WHITE + " 64개를 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===밀 사냥꾼===");
		score.setScore(2);
		Score score2 = obj.getScore("포레스트 고스트 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q5(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.COAL_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.GRAY + "흠집이 생긴 석탄 광석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "흠집이 생긴 석탄 광석" + ChatColor.WHITE + " 64개를 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===침략자===");
		score.setScore(2);
		Score score2 = obj.getScore("침략자 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q6(Player player, int num) {
		//숲의 황소 드랍
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(2);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.YELLOW + "숲의 정기가 느껴지는 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===숲 깊은 곳===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q7(Player player, int num) {
		//파르홀론의 유령 드랍
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(3);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "깊은 숲의 정기가 느껴지는 보물" + ChatColor.WHITE + "을 획득했다.");
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===유적을 정화하는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 10번 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q8(Player player, int num) {
		//고블린 드랍
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.YELLOW + "에메랄드 주머니" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 30000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===");
		score.setScore(2);
		Score score2 = obj.getScore("오크 5마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q9(Player player, int num) {
		//상점
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD_BLOCK, 3);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			es.giveExp(player, 50000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 위협===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 정찰병 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q10(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());			
			es.giveExp(player, 700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===탈환===");
		score.setScore(2);
		Score score2 = obj.getScore("성 안의 몬스터 100마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/100)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q11(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());		
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(8);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "왕가의 제물" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===네크로벨리===");
		score.setScore(2);
		Score score2 = obj.getScore("묘지기 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q12(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(9);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.YELLOW + "데빌 인자" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 2000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===데빌 인자===");
		score.setScore(2);
		Score score2 = obj.getScore("데빌 몬스터 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q13(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===새로운 고블린===");
		score.setScore(2);
		Score score2 = obj.getScore("푸르 고블린 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q14(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 2550000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===불의 악마===");
		score.setScore(2);
		Score score2 = obj.getScore("캘시퍼 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q15(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(11);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "하급 파괴수의 원천" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 2700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===");
		score.setScore(2);
		Score score2 = obj.getScore("하급 파괴수 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q16(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			es.giveExp(player, 3600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("네크로벨리 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q17(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var1 = new ItemStack(Material.GOLD_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.YELLOW + "가치가 떨어진 금광석" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 4000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===폭탄병===");
		score.setScore(2);
		Score score2 = obj.getScore("TNTZ 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q18(Player player, int num) {
		//상점
		if(num>=1000) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());	
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(13);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.AQUA + "에밀의 헤드" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 9999999);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===에밀의 결의===");
		score.setScore(2);
		Score score2 = obj.getScore("에밀 1000마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1000)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q19(Player player, int num) {
		//상점
		if(num>=3) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.GOLD_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금광석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "금광석" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 6000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===악마 자미엘===");
		score.setScore(2);
		Score score2 = obj.getScore("자미엘 3마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/3)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q20(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_HIDE, 15);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.AQUA + "에메랄드 결정" + ChatColor.WHITE + " 15개를 획득했다.");
			es.giveExp(player, 6500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===붉은 악마===");
		score.setScore(3);
		Score score2 = obj.getScore("레드 블럭 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 849,6,-18");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q21(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack col1 = new ItemStack(Material.ACACIA_DOOR, 5);
			ItemMeta col1im = col1.getItemMeta();
			col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
			col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			col1.setItemMeta(col1im);
			player.getInventory().addItem(col1);
			player.sendMessage(ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + " 5개를 획득했다.");
			es.giveExp(player, 7000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===과거의 영광===");
		score.setScore(2);
		Score score2 = obj.getScore("루 라바다 석상 50마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q22(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 20);
			ItemMeta var1im = var1.getItemMeta();
			var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 피");
			var1.setItemMeta(var1im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.GRAY + "최상급 포보르의 피" + ChatColor.WHITE + " 20개를 획득했다.");
			es.giveExp(player, 7000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===군도의 강자===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르화 도마뱀 30마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/30)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q23(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.GOLD_INGOT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "금");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "금" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 7500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.WHITE + "B급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===라파누이의 불청객===");
		score.setScore(2);
		Score score2 = obj.getScore("불타는 석탄 30마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/30)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q24(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_HIDE, 15);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.AQUA + "에메랄드 결정" + ChatColor.WHITE + " 15개를 획득했다.");
			es.giveExp(player, 7500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마의 오른팔===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마의 애완곰 30마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/30)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q25(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(15);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "환영병의 북" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===환영하는 병사===");
		score.setScore(2);
		Score score2 = obj.getScore("환영병 30마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/30)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q26(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.DIAMOND_ORE, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===움직이지 않는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("유혹하는 나무 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q27(Player player, int num) {
		//상점
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 7000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===백일몽 토끼===");
		score.setScore(2);
		Score score2 = obj.getScore("야생 토끼 30마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/30)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q28(Player player, int num) {
		//상점
		if(num>=3) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_HIDE, 20);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.AQUA + "에메랄드 결정" + ChatColor.WHITE + " 20개를 획득했다.");
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===위 러브 팬더===");
		score.setScore(2);
		Score score2 = obj.getScore("솟 3마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/3)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q29(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(18);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.AQUA + "초록 괴물의 헤드" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 13000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===초록의 그 녀석===");
		score.setScore(2);
		Score score2 = obj.getScore("초록 괴물 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q30(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(19);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "고양이의 털뭉치" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 8500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===귀여운 고양이===");
		score.setScore(2);
		Score score2 = obj.getScore("검은 수염의 고양이 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q31(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_HIDE, 40);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.AQUA + "에메랄드 결정" + ChatColor.WHITE + " 40개를 획득했다.");
			es.giveExp(player, 9000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===성 밖의 이단===");
		score.setScore(2);
		Score score2 = obj.getScore("페라리교의 교단원 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q32(Player player, int num) {
		//상점
		if(num>=200) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.DIAMOND, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.AQUA + "다이아몬드" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===워터파크===");
		score.setScore(2);
		Score score2 = obj.getScore("물풍선 200마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/200)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q33(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.IRON_INGOT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.AQUA + "순백의 철");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.AQUA + "순백의 철" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 8500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===철분 덩어리===");
		score.setScore(2);
		Score score2 = obj.getScore("철을 먹는 벌레 50마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q34(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(21);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.AQUA + "토끼의 털뭉치" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===주문은 토끼입니까?===");
		score.setScore(2);
		Score score2 = obj.getScore("귀여움의 조종자 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q35(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE, 10);
			ItemMeta var5im = var5.getItemMeta();
			var5im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 심장");
			var5.setItemMeta(var5im);
			player.getInventory().addItem(var5);
			player.sendMessage(ChatColor.AQUA + "심연의 포보르의 심장" + ChatColor.WHITE + " 10개를 획득했다.");
			es.giveExp(player, 8500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===흐콰===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르화 모험가 50마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q36(Player player, int num) {
		//상점
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_HIDE, 64);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.AQUA + "에메랄드 결정" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 8800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===의적===");
		score.setScore(2);
		Score score2 = obj.getScore("반란을 두려워하는 귀족 50마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q37(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(23);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.YELLOW + "병사의 낡은 코어" + ChatColor.WHITE + "를 획득했다.");
			es.giveExp(player, 9500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.YELLOW + "A급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===족장을 지키는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("변이된 원시의 땅 보초병 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q38(Player player, int num) {
		//상점
		if(num>=200) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack var1 = new ItemStack(Material.GOLD_INGOT, 64);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			player.sendMessage(ChatColor.AQUA + "쉽게 녹지 않는 금" + ChatColor.WHITE + " 64개를 획득했다.");
			es.giveExp(player, 12000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===원인 해결===");
		score.setScore(2);
		Score score2 = obj.getScore("변이의 근원 200마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/200)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q39(Player player, int num) {
		//상점
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack item = new ItemStack(Material.RABBIT_FOOT, 2);
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(ChatColor.DARK_RED + "에메랄드 결정+");
			item.setItemMeta(im);
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.DARK_RED + "에메랄드 결정+" + ChatColor.WHITE + " 2개를 획득했다.");
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===길을 지키는 자===");
		score.setScore(2);
		Score score2 = obj.getScore("미지의 땅을 지키는 것 100마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q40(Player player, int num) {
		//상점
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7족장 <바람을 가르는 늑대>는 생각보다 강하지 않았다.%§7이 녀석이 이 정도 수준이면 족장 <붉은 날개>의 수준도 그리 높지 않을 것 같다.%"
					+ "§7족장 <붉은 날개>가 변이의 힘으로 더욱 강해지기 전에 미리 손을 봐주자.");
			QuestBoard qb = new QuestBoard();
			qb.q40_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.DARK_RED + "SSS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===싸우는 자1===");
		score.setScore(2);
		Score score2 = obj.getScore("족장 <바람을 가르는 늑대> 3마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/3)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q40_1(Player player, int num) {
		//상점
		if(num>=3) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(22);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.DARK_RED + "고대의 잔해 유물" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 12000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.DARK_RED + "SSS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===싸우는 자2===");
		score.setScore(2);
		Score score2 = obj.getScore("족장 <붉은 날개> 3마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/3)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q41(Player player, int num) {
		//상점
		if(num>=60) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(25);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.AQUA + "상급 파괴수의 알" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 11000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.AQUA + "SS급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===고대 생물, 파괴수===");
		score.setScore(2);
		Score score2 = obj.getScore("상급 파괴수 60마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/60)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q42(Player player, int num) {
		//상점
		if(num>=200) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(26);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "현상금" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 14000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.LIGHT_PURPLE + "S급 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===레드 플레이어===");
		score.setScore(2);
		Score score2 = obj.getScore("인간 사냥꾼 200마리 사냥");
		score2.setScore(1);
		Score score4 = obj.getScore("(" + num + "/200)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1(Player player, int num) {
		// mq23 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "얼음 장인: 그래.%얼음 장인: 네가 다른 곳에서 온 모험가구나.%얼음 장인: 이곳에 적응은 하였는가?%얼음 장인: 여기선 따뜻하게 입고 다니는게 안전하다네.%얼음 장인: 크흠. 그건 자네가 알아서 할것이고..%얼음 장인: 본론을 말하도록 하지.%"
					+ "얼음 장인: 얼마전부터 밤만 되면 우리 마을에서 소녀가 흐느끼는 소리가 들리지 뭔가.%얼음 장인: 사람들은 그녀가 귀신이라고 생각하고 있다네.%얼음 장인: 나는 귀신이 너무 무서워..%얼음 장인: 자네가 그 진위를 알아네주길 바라네.%"
					+ "얼음 장인: 소리는 §e은행 뒤의 큰 나무§f에서 들린다네.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희1===");
		score.setScore(2);
		Score score2 = obj.getScore("콘노 마을의 얼음 장인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_1(Player player, int num) {
		// eq1 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7푸른 달빛이 연상되는 소녀가 있다.%의문의 소녀: ...%의문의 소녀: 당신은 누구..?%§7귀신이냐고 물었다.%의문의 소녀: 귀신..?%의문의 소녀: 나는 내 이름도, 어디 사는지도 모두 기억이 나지 않아..%"
					+ "§7아무래도 소녀는 기억을 잃은 것 같다.%§7일단 얼음 장인에게 보고를 하는 것이 좋을 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희2===");
		score.setScore(2);
		Score score2 = obj.getScore("밤 중에 소녀와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_2(Player player, int num) {
		// eq1_1보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "얼음 장인: 뭐?%얼음 장인: 귀신의 정체가 §e기억을 잃은 여자 아이§f라고?%얼음 장인: ...%얼음 장인: 이 마을엔 10년 전부터 여자가 존재하지 않았단다..%얼음 장인: 이거 정말 큰 일이군.%"
					+ "얼음 장인: 내 생각에는 원로원에 이 상황을 알리는게 좋을 것 같구나.%얼음 장인: 의장께서는 지금 어디에 계신지 모르겠고..%얼음 장인: 그의 직속 기사가 §e아란모어 정찰 캠프§f에 있다는구나.%얼음 장인: 거기로 한번 가보게나.%"
					+ "얼음 장인: 정찰캠프는 마을의 길을 따라 언덕을 올라가면 보이는 계단 위에 있단다.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희3===");
		score.setScore(2);
		Score score2 = obj.getScore("다시 얼음 장인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq1_3(Player player, int num) {
		// eq1_2보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "기사: 의장님을 만나뵙고 싶다고?%기사: 이유를 먼저 듣도록 하지.%§7의문의 소녀에 대해 설명하였다.%기사: 마을에선 그런 일이 있었군.%기사: 다만. 이쪽도 지금 한가하지만은 않다.%"
					+ "기사: 의장께서는 조금 특이하신 분이라..%기사: 지금 §e카루 던전§f에 가서 오질 않고 계시다네.%기사: 무언가를 꼭 찾아야한다는 말과 함께 가셨지.%기사: 그리고 누군가 올 지 모르니 나는 이곳에서 대기하라 명하셨네.%"
					+ "기사: 의장께서도 아마 혼자 던전에 들어가지는 않으셨을 것 같다.%기사: 의장님을 만나뵙고 싶다면 던전으로 가보게.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희4===");
		score.setScore(2);
		Score score2 = obj.getScore("아란모어 정찰캠프에서 기사와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_4(Player player, int num) {
		// eq1_3보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "tp-2465 52 543%의장: 호오옹??%의장: 자네.%의장: 그 옷은 매우 따뜻해보이는구만!%의장: 아주 고맙네!");
			QuestBoard qb = new QuestBoard();
			qb.eq1_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희5===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 입구에서 의장과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_5(Player player, int num) {
		// eq1_4보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "의장: 크흐흠.%의장: 자네 옷은 내가 잘 입겠네.%의장: 대신 그 소녀의 §e비밀§f을 풀 단서를 주지.%의장: 나는 자네가 말하지 않아도 다 알고 있다네.%"
					+ "의장: 이 던전에 들어가시게.%의장: 그럼 도움이 될게야.");
			QuestBoard qb = new QuestBoard();
			qb.eq1_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희6===");
		score.setScore(2);
		Score score2 = obj.getScore("의장과 다시 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void eq1_6(Player player, int num) {
		// eq1_5보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "의문의 소녀?: 결국... 오셨군요%의문의 소녀?: 당신이어서. 특별한 당신만이 할 수 있었어요.%의문의 소녀?: 아무도 볼 수 없었던 저의 모습을..%의문의 소녀?: 당신이 저를 보고 말을 걸어준 순간..%"
					+ "의문의 소녀?: 저는 잠에서 깨어났고..%의문의 소녀?: 다시 한번 현신할 수 있었어요.%의문의 소녀?: 참, 제 소개가 늦었군요.%스카디: 저는 겨울의 여신 스카디입니다.%스카디: 아란모어에 사시사철 눈이 오는 것도 제 영향이죠.%"
					+ "스카디: 저는 §e신의 공간인 팔리아스§f가 무너지던 그 날.%스카디: §e그 녀석§f을 막기 위해 지나친 힘을 써버려서%스카디: 그 후로 실체를 잃고 기나긴 잠에 빠지게 되었습니다.%스카디: 당신은 그런 저를 깨워준 은인이니 이것을 드리겠습니다.%"
					+ "스카디: §e크리스탈라이트 주괴§f입니다.%스카디: 이것으로 §e부조화의 검§f의 힘을 각성시킬 수 있을 겁니다.%스카디: 부조화의 검은 이 카루 던전에서 얻을 수 있을 것입니다.%스카디: 그럼 감사했습니다..%tp-2465 52 543");
			ItemStack var7 = new ItemStack(Material.NETHERITE_INGOT);
			ItemMeta var7Im = var7.getItemMeta();
			var7Im.setDisplayName(ChatColor.DARK_RED + "크리스탈라이즈 주괴");
			ArrayList<String> var7Lore = new ArrayList();
			var7Lore.add(ChatColor.GRAY + "부조화의 검의 초월 소재");
			var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			var7Im.setUnbreakable(true);
			var7Im.setLore(var7Lore);
			var7.setItemMeta(var7Im);
			player.getInventory().addItem(var7);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 가희7===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}

	public void eq2(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 10) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 훗훗훗. 잘하였다. 모험가여.%마신왕: 두번째 명령을 내려주도록 하지.%마신왕: 날 처음 본 늪에서 §e북동쪽§f으로 가면 언덕에 민가가 있을 것이다.%마신왕: 그곳 산장의 주인과 만나야겠구나.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===");
		score.setScore(2);
		Score score2 = obj.getScore("늪에서 거미 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_1(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 크하하하하하. 놀랐느냐.%마신왕: 그 녀석은 날 봉인하려한 인간이다.%마신왕: 너의 힘을 빌리니 나의 힘이 더욱 강해지는 것 같구나.%마신왕: 이제 회복도 어느정도 되었으니 니 몸에서 나가야겠구나.%마신왕: 날 위해 죽어라.");
			QuestBoard qb = new QuestBoard();
			qb.eq2_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약2===");
		score.setScore(2);
		Score score2 = obj.getScore("산장의 주인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq2_2(Player player, int num) {
		// 늪지의 마신왕 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마신왕: 난 이제 떠나가겠다.%마신왕: 언젠가 다시 만나게 된다면 또 한번 겨루어주지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마신왕의 계약3===");
		score.setScore(2);
		Score score2 = obj.getScore("사망하기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void eq3(Player player, int num) {
		// 되살아난 피르볼그의 제사장 보상
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7이 유적은 피르볼그 시대에 포보르를 생성하고%§7검은 흐름을 찬양하던 의식을 하던 장소임을 알게 되었다.%"
					+ "§7제사장은 이곳에서 포보르들을 소탕하고자 하였다고 한다.%§7다음 기록은 죽음의 탑으로 이어져있다.");
			QuestBoard qb = new QuestBoard();
			qb.eq3_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===제사장의 기억1===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void eq3_1(Player player, int num) {
		if (num >= 1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7네메드 왕국의 보물들은 피르볼그 시대에 와서야 봉인될 수 있었다.%§7보통 나라가 망하기 이전 고위계층에 의해 봉인되는 것이 일반적이나%"
					+ "§7피르볼그는 네메드 왕국의 왕좌를 찬탈하여 생긴 나라였다.%§7때문에 네메드의 보물들은 피르볼그의 전리품이었고%"
					+ "§7피르볼그 왕가는 그를 봉인하고자 하였다.%§7죽음의 탑은 네메드의 보물들을 봉인해둔 탑이다.%"
					+ "§7이곳에서 제사장은 화염의 돌을 봉인하는 역할을 하였다고 한다.%§7다음 기록은 바로 사막으로 이어져있다.%"
					+ "§7어쩌다 이 제사장이 타락하게 된 것인지 단서가 잡히지 않는다.%§7아무래도 동물들에게서 단서를 찾는 것이 좋을 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.eq3_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===제사장의 기억2===");
		score.setScore(2);
		Score score2 = obj.getScore("죽음의 탑 3층 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void eq3_2(Player player, int num) {
		if (num >= 50) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7복어를 통해 제사장의 남은 기록을 얻게 되었다.%§7그는 현존하는 포보르 왕과 조우하였고%"
					+ "§7그에 압도당해 정신이 나가버린 것 같다.%§7그가 제정신일 때 남겨놓은 장비들이 있다고도 한다.%"
					+ "§7장비를 얻기 위한 열쇠도 받았다.%§d피르볼그의 유산§f을 획득했다.%§7사막 마을에 장비를 보관하고 있는 후손이 있다고 한다.");
			ItemStack scroll = new ItemStack(Material.PRISMARINE_SHARD);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "피르볼그의 유산");
			ArrayList<String> scrollLore = new ArrayList();
			scrollLore.add(ChatColor.GRAY + "피르볼그의 제사장이 남긴 유산");
			scrollLore.add(ChatColor.GRAY + "사막 마을에 그의 후손이 있다고 한다.");
			scrollIm.setLore(scrollLore);
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);		
			player.getInventory().addItem(scroll);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "엑스트라 퀘스트");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===제사장의 기억3===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르화 복어 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq1(Player player, int num) {
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 100);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 1장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===");
		score.setScore(2);
		Score score2 = obj.getScore("워그닐에 배신당한 자 5마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	 
	public void mq2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack var2 = new ItemStack(Material.GRANITE_STAIRS);
			ItemMeta var2Im = var2.getItemMeta();
			var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,10");
			var2Im.setDisplayName(ChatColor.AQUA + "일꾼의 증표");
			ArrayList<String> var2Lore = new ArrayList();
			var2Lore.add(ChatColor.GRAY + "레벨 제한: 10");
			var2Lore.add(ChatColor.GRAY + " ");
			var2Lore.add(ChatColor.GRAY + "열심히 일한 대가를 다른 식으로");
			var2Lore.add(ChatColor.GRAY + "받고 싶은 사람을 위한 증표");
			var2Lore.add(ChatColor.GRAY + " ");
			var2Lore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 30% 증가");
			var2Lore.add(ChatColor.BLUE + "-전투 경험치 1000% 감소");
			var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			var2Im.setUnbreakable(true);
			var2Im.setLore(var2Lore);
			var2.setItemMeta(var2Im);
			player.getInventory().addItem(var2);
			es.giveExp(player, 1000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 2장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===수련의 시작===");
		score.setScore(2);
		Score score2 = obj.getScore("잊혀진 바다 신전 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq3(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 3000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 허허 어서오시게..%포르간 촌장: 길을 따라 §e오른쪽§f으로 가면 우리 마을이 나올껄세.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 3장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===에일 땅으로===");
		score.setScore(3);
		Score score2 = obj.getScore("워그닐에서 배를 타고 에일 땅으로 이동해");
		score2.setScore(2);
		Score score3 = obj.getScore("선착장 주변의 포르간 촌장과 대화");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq4(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 5000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 마녀들은 청년들이 어디에 있는지 모른다고 했다라..%포르간 촌장: 알겠네. 내가 정보를 더 모아보지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 4장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 마녀 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq5(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,10);
			player.getInventory().addItem(item);
			es.giveExp(player, 10000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 수고했네.%포르간 촌장: 내 마을 일이 정리되면 바로 연락을 주겠네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 5장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁2===");
		score.setScore(2);
		Score score2 = obj.getScore("숲의 유적 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq6(Player player, int num) {
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 20000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 허허허.. 역시 성공했구만%포르간 촌장: 하지만 아직 모자른 듯하네.%포르간 촌장: 자네가 더욱 강해지면 연락하도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 6장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===");
		score.setScore(2);
		Score score2 = obj.getScore("고블린 5마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq7(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item5 = new ItemStack(Material.MOSSY_COBBLESTONE_WALL);
			ItemMeta item5Im = item5.getItemMeta();
			item5Im.setLocalizedName("30,10,0,0,0,10,0,0,0,10,50");
			item5Im.setDisplayName(ChatColor.LIGHT_PURPLE + "용사의 검");
			item5Im.setCustomModelData(0);
			ArrayList<String> item5Lore = new ArrayList();
			item5Lore.add(ChatColor.GRAY + "레벨 제한: 50");
			item5Lore.add(ChatColor.GRAY + " ");
			item5Lore.add(ChatColor.GRAY + "파르홀론의 수장이 신에게서 받았다고 알려진 검");
			item5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			item5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			item5Im.setUnbreakable(true);
			item5Im.setLore(item5Lore);
			item5.setItemMeta(item5Im);
			player.getWorld().dropItem(player.getLocation(), item5);
			es.giveExp(player, 40000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: 축하하네. 더 넓은 세상으로 떠나 이 세게를 구해주길 바라네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 7장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===전설의 시작===");
		score.setScore(2);
		Score score2 = obj.getScore("센 마그 평원에서 전설의 검을 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq8(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 50000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 8장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===파르홀론의 역사===");
		score.setScore(2);
		Score score2 = obj.getScore("센 마그 평원 어딘가의 탑에서 파르홀론의 흔적 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq9(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 80000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "포르간 촌장: §e티르§f에 가본적이 있는가?%포르간 촌장: 티르에서 등대지기를 뽑는다는 소식을 들었네.%포르간 촌장: 등대에는 수많은 지식과 비밀이 남아있으니 참고하시게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 9장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 정찰병 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq10(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			es.giveExp(player, 100000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "티르의 생존자: 그래.%티르의 생존자: 당신을 믿어보겠다.%티르의 생존자: 마을 사람들과 상의를 해서 연락을 주도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 10장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대지기 시험===");
		score.setScore(2);
		Score score2 = obj.getScore("외눈의 포보르 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq11(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 150000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7알지 못하는 곳으로 이동되었다.%§7앞이 너무 깜깜해서 아무것도 보이지 않으며%§7너무 고요해서 아무것도 들리지 않았다.%§7나는 계속 기다렸다.%§7눈은 뜨고 있으나 아무것도 보이지 않으니 눈이 아파온다.%"
					+ "§7그 순간이었다.%§7어디선가 알 수 없는 목소리가 들려온다.%???: 네 이름을 불러줘.%§7나는 잠시 뜸을 들이다 대답하였다.%" + player.getDisplayName() + ": " + player.getDisplayName() + "입니다.%"
					+ "§7잠시 뒤, 다시 그 목소리가 들려왔다.%???: 몇날 몇실진 모르겠지만%???: 네가 있을 미래에서%???: 혹시 내가 헤맨다면%???: 너를 알아볼 수 있게%???: 내 이름을 불러줘.%§7목소리가 멈추자마자 알 수 없는 힘이 몸을 감싼다.%"
					+ "tp-699 52 2135%[System] 2차 직업의 캐릭터를 생성할 수 있게 되었습니다.");
			// 죽어가는 상황
			// 그곳에서 만난 것은 명백히 나 자신이었다. 
			// 혹시 나의 모습을 따라한 포보르일까 걱정이 되어 한번 떠보기로 하였다.
			// 내 이름을 불러줘.
			// 그에 대한 대답은 잠시 후에 들려왔다.
			// [이름]: [이름]입니다.
			// 그래. 저 인물은 나인 듯하다.
			// 행색을 보아하니 과거의 나일까.
			// 너무나도 약해보인다.
			// 지금 남은 힘이라도 저 당시의 나에게 주면 저 아이가 존재하는 미래가 달라질까
			// 내가 지금 사라지더라도 힘을 보내주려고 마음먹는다.
			// 그 아이에게 말한다.
			// 몇날 몇실진 모르겠지만/ 네가 있을 미래에서/ 혹시 내가 헤맨다면/ 너를 알아볼 수 있게/ 내 이름을 불러줘.
			// 힘을 모두 쏟은 채로 '나는 이제 끝이구나'라고 생각하려던 찰나에 빛이 보이기 시작하였다.
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 11장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대에 숨겨진 비밀===");
		score.setScore(2);
		Score score2 = obj.getScore("등대에서 비밀 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq12(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(4);
			ItemStack weapon2 = chest.getInventory().getItem(5);
			if(player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				player.getInventory().addItem(weapon1);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "달의 힘" + ChatColor.WHITE + "을 획득했다.");
			} else {
				player.getInventory().addItem(weapon2);
				player.sendMessage(ChatColor.LIGHT_PURPLE + "태양의 힘" + ChatColor.WHITE + "을 획득했다.");
			}
			es.giveExp(player, 200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7이것으로 §e용사의 검§7을 초월해보자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 12장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===등대를 밝히는 힘===");
		score.setScore(2);
		Score score2 = obj.getScore("등대에서 달의 힘 또는 태양의 힘 얻기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq13(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 13장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 세력 플레이어 [Lv.96] 10명 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq14(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "광부: 시드 광산은 값비싼 광물은 나오지 않았지만 꽤나 붐비던 광산이었네.%광부: 하지만 포보르들이 광산을 점령하고 인간들을 노예로 삼아 일을 시키는 바람에%광부: 이곳 사람들은 거의 도망가버렸다네.%광부: 때문에 이 광산은 텅 비게 되었지..%광부: 이곳을 둘러보고 싶다고?%광부: 마음대로 하시게나.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 14장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시드 광산===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산에 남아있는 광부와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq15(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(6);
			player.getInventory().addItem(weapon1);
			player.sendMessage(ChatColor.WHITE + "알 수 없는 광석" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq15_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 15장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 무기1===");
		score.setScore(2);
		Score score2 = obj.getScore("이계의 운석에서 특이한 광물을 얻기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq15_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			if(player.getInventory().contains(Material.PLAYER_HEAD)) {
				for (ItemStack is : player.getInventory().getContents()) {
					if(is == null) continue;
				    if (is.getType() == Material.PLAYER_HEAD) {			
				        if (is.getItemMeta().getDisplayName().equals(ChatColor.WHITE + "알 수 없는 광석")) {
				        	 is.setAmount(0);
				        }
				    }
				}
			}
			es.giveExp(player, 800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "광부: 고맙네.%광부: 그런데 혹시 그걸 아는가?%광부: 몬스터들을 사냥하다보면 그들의 피나 심장을 얻거나 하였을걸세.%광부: 나중에 장비를 제작할 때 그것들을 재료로 삼으면%광부: 더욱 질 좋은 장비가 만들어질껄세.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 15장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===");
		score.setScore(2);
		Score score2 = obj.getScore("광부에게 광물을 가져다주기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq16(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "불안한 주민: 으아악 날 내보내 주거라.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 16장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미푀르유 성===");
		score.setScore(3);
		Score score2 = obj.getScore("미푀르유 성 동문 밖에 있는");
		score2.setScore(2);
		Score score3 = obj.getScore("식량창고에 가보기");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq17(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "불안한 주민: §e성 안쪽§f에는 아직 사람들이 있어.%불안한 주민: 그리고 몇 달 전에..%불안한 주민: 어느 모험가가 왔어..%불안한 주민: 그는 이 에일땅의 역사를 파해치는 이상한 놈이였어..%불안한 주민: 고서적을 연구하던 사람을 찾아 여기까지 왔다는데..%"
					+ "불안한 주민: 결국 §e진실§f을 깨닫고는 미쳐 날뛰게 되었지..%불안한 주민: 케케케케케켘..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 17장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===은빛의 영역===");
		score.setScore(2);
		Score score2 = obj.getScore("성 안의 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq18(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			
			ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
			BookMeta bm = (BookMeta)book.getItemMeta();
			bm.setAuthor("히포넨시스");
			bm.setTitle(ChatColor.DARK_RED + "신이 되는 포션");
			ArrayList<String> pages = new ArrayList<String>();
			pages.add("신이 되는 방법은 간단하다.\n그것은 모든 인간들이 나를 믿게하면 되는 일이다.\n따라서 나는 인간의 감정을 조종하는 약을 만들고 있다.");
			pages.add("레시피(1인분 기준)\n\n용의 눈물 50ml\n검은 장미 2잎\n정령의 심장 1개\n불꽃 민들레 씨앗 2개\n키어컬의 발걸음 1개");
			pages.add("기록1\n\n상급 포션을 만들 때 사용되는 용의 눈물은 필수이다.");
			pages.add("기록2\n\n일종의 최면제이기 때문에 검은 장미를 넣었더니 효과적이였다.");
			pages.add("기록3\n\n예로부터 인간들을 홀리는 종족에는 몽마와 정령이 있었다.\n우선 정령의 심장을 사용해보았다.");
			pages.add("기록4\n\n인간들을 무언가에 빠졌을 때 불탄다는 표현을 쓴다.\n나는 안다. 그것은 실제로 불타는 것이다.\n그래서 불꽃 민들레 씨앗도 넣어보았다.");
			pages.add("기록5\n\n키어컬의 발걸음이 이 포션의 핵심이다.\n키어컬은 포보르의 수장이었다.\n그의 특기는 인간들의 정기를 빨아먹는 것이며, 그의 힘도 거기에서 비롯된 것이다.");
			pages.add(ChatColor.DARK_RED + "" + ChatColor.MAGIC + "이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어.. 이 부분은 읽을 수가 없어..");
			bm.setPages(pages);			
			book.setItemMeta(bm);
			player.getInventory().addItem(book);
			
			es.giveExp(player, 1100000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7이미 사망한 듯하다.%§7소지품을 수색해보니 §e책§7이 한권있다.%§7가져가야 할 것 같다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 18장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자1===");
		score.setScore(2);
		Score score2 = obj.getScore("미푀르유 성에서 역사가 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq19(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "용도를 모르는 열쇠");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "모험가가 흘리고 간 것으로 추정되는 열쇠");
			rewardLore.add(ChatColor.GRAY + "모험가는 시드 광산을 향한 것으로 추측된다.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			es.giveExp(player, 1200000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7모험가는 §e시드 광산§7으로 간 것 같다.%§7§e용도를 모르는 열쇠§7를 찾았다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 19장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자2===");
		score.setScore(2);
		Score score2 = obj.getScore("역사가를 살해한 모험가의 흔적 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1300000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "광부: 뭐?%광부: 누가 왔다간 적 없냐고?%광부: 너 같은 모험가는 많이 왔다갔지.%광부: 계속 여기서 채광하는 놈들도 있었다고.%광부: ...%광부: 사실 어떤 놈이 §e봉인된 문§f을 열어버렸지 뭔가.%광부: 위험할 것 같아서 말하지 않으려 했는데 말이지.%"
					+ "광부: 거기에 §e신의 보물§f이 숨겨져있다는 소문이 있어.%광부: 아마 너가 찾는 사람은 그걸 가지러 간거겠지.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산의 광부와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1400000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7모험가는 여러 던전들을 돌아다니며%§7신의 보물을 찾으려하는 것 같다.%§7신의 보물에 대해 알아보러 가야할 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.mq20_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자4===");
		score.setScore(2);
		Score score2 = obj.getScore("타락한 요정 왕국 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq20_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "광부: 신의 보물?%광부: 이 땅에 몇개나 존재하는지는 모르겠군.%광부: 내가 아는 정보도 거의 없고 말이야.%광부: 하나 확실히 아는 건 §e서쪽 섬인 아란모어§f에%광부: 신의 보물이 있다는거지.%광부: 거기는 내 고향이라 잘 알고 있지.%광부: 마을의 전설이긴 했다만..%"
					+ "광부: 마을 사람중에 한 사람이 우연히 토끼를 따라가다 던전을 발견했고%광부: 거기에 전설 속의 신의 물건인 것 같은 물건을 발견했다지.%광부: 어찌되었건 거긴 위험한 지역이야.%광부: 내 크고 아름다운 근육을 보면 알겠지만%광부: 이게 어릴 적 그 설원에 살면서 커진 근육이거든.%"
					+ "광부: 여기 주변과는 비교가 안될만큼 강한 몬스터가 출몰한다.%광부: 조심해라.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 20장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===");
		score.setScore(2);
		Score score2 = obj.getScore("시드 광산의 광부와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq21(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1600000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "모험가: 넌 누구냐?%모험가: 누군데 날 계속 쫓아다니는거지?%모험가: 내가 모른다고 생각했다면 오산이다.%모험가: 흠..%모험가: 너에게선 나와 비슷한 향기가 나는군.%모험가: 그래. 네 녀석도 다른 차원에서 온 §e플레이어§f구나.%"
					+ "모험가: 넌 뭘 위해 싸우지?%모험가: 역시.. 알리가 없지.%모험가: 싸움의 이유도 모르는 잔챙이는 관심없다.%모험가: 나는 이제부터 설원 지대에 갈꺼다.%모험가: 날 만나고 싶다면%더 강해져서 돌아와라.%tp-1143 181 1461");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 21장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===진실을 아는 자6===");
		score.setScore(2);
		Score score2 = obj.getScore("티르 등대의 숨겨진 장소로 가기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq22(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1700000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7날씨가 너무 추운 것 같다.%§7마을에 가서 따뜻하게 할 수 있는 무언가를 찾아보자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 22장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===아란모어===");
		score.setScore(2);
		Score score2 = obj.getScore("아란모어 지역에 도착해 콘노 마을로 가는 썰매타기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq23(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack reward = new ItemStack(Material.GLOBE_BANNER_PATTERN);
			ItemMeta rewardIm = reward.getItemMeta();
			rewardIm.setDisplayName(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "'설원의 가희' 퀘스트를 진행할 수 있다.");
			rewardIm.setLore(rewardLore);
			rewardIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			rewardIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			rewardIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			rewardIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			rewardIm.setUnbreakable(true);
			reward.setItemMeta(rewardIm);
			player.getInventory().addItem(reward);	
			player.sendMessage(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1800000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7정찰자들에게 §e카루 던전§7에 대한 정보를 듣게 되었다.%§7모험가를 찾아 떠나도록 하자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 23장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===던전 탐색===");
		score.setScore(2);
		Score score2 = obj.getScore("설원 정찰자 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq24(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1900000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "모험가: 여기까지 오느라 수고했다.%모험가: 이곳을 지키는 보스는 §e발로르§f더군.%모험가: 물론 진짜 발로르일리가 없지.%모험가: 그저 포보르들이 연성해낸 불안정한 가짜 일 뿐.%모험가: 아.. 네 녀석이 뭘 생각하는진 모르겠지만%모험가: 나는 몬스터들과 싸우는 §e플레이어§f라고?%"
					+ "모험가: 그렇게 이상하게 쳐다보지마.%모험가: 나 또한 너와같은 플레이어. 이름은 §e데히트라§f다.%데히트라: 몬스터를 죽이며 강해지는건 당연한 일 아닌가?%데히트라: 우린 앞으로도 많이 만나게 될 운명이야.%데히트라: 그러니 친하게 지내는게 좋지.%데히트라: 나는 이만 퀘스트를 달성했기 때문에 가보겠어.%"
					+ "데히트라: 그럼...%데히트라: 씨 유 넥스트 타임 바~이!%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 24장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===카루 던전===");
		score.setScore(2);
		Score score2 = obj.getScore("카루 던전 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq25(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 2000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "얼음 장인: 기다렸다네.%얼음 장인: 사실 나의 아들이 당신이 광산에서 만난 광부라네.%얼음 장인: 우리 아들에게 당신에 대한 많은 이야기를 들었다네.%얼음 장인: §e신의 보물§f을 찾고 있다지?%얼음 장인: 아란모어에 있는 신의 보물은 카루 던전에 있는 것이 전부네.%"
					+ "얼음 장인: 하지만 실망하지 말게나.%얼음 장인: 신급 아이템은 아니지만..%얼음 장인: §e과거 영웅이 쓰던 무구§f가 있는 장소가 있다네.%얼음 장인: 지금 그곳으로 가기 위한 통행증을 만들고 있으니%얼음 장인: 조금만 나중에 와주시게나.%얼음 장인: 이곳 서점에 §e흥미로운 내용의 책§f을 판매하니%"
					+ "얼음 장인: 관심이 있다면 한번 가보시게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 25장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물1===");
		score.setScore(2);
		Score score2 = obj.getScore("콘노 마을의 얼음 장인과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq26(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "노인: 허허.. 또다른 모험가가 오셨구만..%노인: 나는 이곳의 관리자라우.%노인: 안타깝지만 이곳에서 관리하던 무구들은 전부 도둑맞았다네. 허허허허.%노인: 검은 옷을 입은 사내가 아주 실력이 뛰어났지. 허허허허.%"
					+ "노인: 아주 싹 쓸어가버렸다네. 허허허허.%노인: 그래도 그 녀석이 보는 눈은 없는 것 같소. 허허허허.%노인: 막대기 하나는 놓고 갔지 뭔가. 허허허허.%노인: 저 아래에 상자가 있을걸세. 허허허허.");
			QuestBoard qb = new QuestBoard();
			qb.mq26_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 26장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물2===");
		score.setScore(2);
		Score score2 = obj.getScore("마법 수정 앞에서 성스러운 통행증을 사용");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq26_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			ItemStack rewardKey = new ItemStack(Material.STICK);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.LIGHT_PURPLE + "검의 손잡이");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "영웅 루 라바다가 사용했다는 검의 손잡이");
			rewardLore.add(ChatColor.GRAY + "이것으로 달의 힘이 깃든 검/태양의 힘이 깃든 검을 초월할 수 있다고 한다.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "검의 손잡이" + ChatColor.WHITE + "을 획득했다.");
			es.giveExp(player, 1500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "노인: 허허허허.%노인: 그 막대기는 그냥 막대기가 아니라우.%노인: 무려 고대의 영웅 §e루 라바다§f님이 사용하시던 검의 손잡이지.%노인: 자네가 가지고 있는 용사의 검의 힘을 더욱 강하게 해줄걸세. 허허허허.%"
					+ "노인: 그럼 이만 떠나게나.%노인: 나는 더 이상 존재의 이유가 없구먼. 허허허허.%tp-2465 52 543");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 26장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===설원의 보물3===");
		score.setScore(2);
		Score score2 = obj.getScore("상자를 열기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq27(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 아까는 저 때문에 깜짝 놀라셨나요?%네비: 앞으로는 우리의 목표를 위해 " + player.getDisplayName() + "님이 더욱 강해지실 수 있도록 제가 옆에서 도와드릴꺼에요!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 27장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===새로운 만남===");
		score.setScore(2);
		Score score2 = obj.getScore("늪에서 거미 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq28(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 28장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===");
		score.setScore(2);
		Score score2 = obj.getScore("늪지의 마신왕 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq29(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마법사: 네메드 왕국의 보물인 §e화염의 돌§f이 어디에 있는지 알려주지.%마법사: §e죽음의 탑§f으로 가보시게.");
			QuestBoard qb = new QuestBoard();
			qb.mq29_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 29장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽음의 탑1===");
		score.setScore(3);
		Score score2 = obj.getScore("유적에서 마법사와 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -926,51,858");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq29_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 3500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "탑의 관리인: 이 탑은 §e네메드의 무덤§f이라는 이름을 가지고 있었다네.%탑의 관리인: 이 탑에 화염의 돌이 있다는 사실이 알려지자%탑의 관리인: 많은 모험가들이 찾아왔지.%"
					+ "탑의 관리인: 그런 자들이 계속 죽어나갔기 때문에%탑의 관리인: 죽음의 탑이라는 별명을 얻게 되었지.%탑의 관리인: 자네가 이 탑을 오를 자격이 있는지는 차후에 보도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 29장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽음의 탑2===");
		score.setScore(3);
		Score score2 = obj.getScore("죽음의 탑에서 관리인과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 76,63,-22");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq30(Player player, int num) {
		if(num>=20) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 4500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "탑의 관리인: 그래.%탑의 관리인: 그 정도의 힘이라면 이 탑에 도전해볼만은 하군.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 30장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===되살아난 해골===");
		score.setScore(2);
		Score score2 = obj.getScore("되살아난 해골 20마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/20)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq31(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "탑의 관리인: 고맙네.%탑의 관리인: 이곳에서 §e북쪽§f으로 쭉 가면 언덕에 마을이 하나 있을꺼다.%탑의 관리인: 참고하게.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 31장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===");
		score.setScore(2);
		Score score2 = obj.getScore("영혼 요정 가루 수집");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq32(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "관장: 헛헛.%관장: 너도 너의 힘을 알고 싶은거냐?%관장: 이곳에 들어가면 너의 힘을 알게 될거다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 32장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===너의 근육을 먹고 싶어===");
		score.setScore(2);
		Score score2 = obj.getScore("베아그 마을의 관장과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq33(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "빨간모자: 안녕하세야. 저는 빨간모자 소녀에여.%빨간모자: 지금부터 제 얘기를 듣는 거시에여.%빨간모자: §e밀 가디언§f이 있었던 거시에여.%빨간모자: 그거슨 너무 무서운 거시에여..%"
					+ "빨간모자: 밀 가디언을 부숴버리다 보면 §e늑대§f가 나타날 거시에여.%빨간모자: 그 늑대의 목을 가져와주는 거시야요.");
			QuestBoard qb = new QuestBoard();
			qb.mq33_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 33장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===");
		score.setScore(2);
		Score score2 = obj.getScore("밀밭 풍차에서 빨간모자와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq33_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "빨간모자: 그 늑대는 저희 할머니였답니다.%빨간모자: 후훗..");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 33장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===");
		score.setScore(2);
		Score score2 = obj.getScore("변장한 늑대 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq34(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "빨간모자: 안녕하세양. 저는 빨간모자 소녀에여.%빨간모자: 지금부터 제 얘기를 듣는 거시에여.%빨간모자: 오래전부터 기분이 좋아지고 몸이 뜨거워지는 약이 있었던 거기에여.%"
					+ "§7빨간모자: 그 약이 정말 최고였는데..%빨간모자: ..!%빨간모자: §e약쟁이§f놈들을 학살하다보면 그 약을 만든 §e마녀§f가 나타날 것만 가타여.%빨간모자: 부디 마녀를 없애주시는 거시야요.");
			QuestBoard qb = new QuestBoard();
			qb.mq34_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 34장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===");
		score.setScore(2);
		Score score2 = obj.getScore("밀밭 풍차에서 빨간모자와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq34_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "빨간모자: 고마워여.%빨간모자: 이제 저도 그 약을 만들 수 있을것 같아양!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 34장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===");
		score.setScore(2);
		Score score2 = obj.getScore("과자 마녀 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		new NPCManager(player);
	}
	
	public void mq35(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "카타리나: 죽음의 탑 위에는 §e빛의 성물§f이라는 것이 있다고 합니다.%카타리나: 그 성물을 얻게 된다면 포보르들을 멸하고 개벽이 도래한다고 합니다.%카타리나: 당신이라면 분명히 가능할 겁니다.%"
					+ "카타리나: 이제 본론으로 넘어가죠.%카타리나: 마법탑의 연구로 과거의 포보르 왕을 재림시킬 수 있는 방법을 알아냈습니다.%카타리나: 다만 저희는 포보르의 마나를 사용할 수 없었기 때문에%카타리나: 연성 과정에서 불완전한 마나를 사용해야했고%"
					+ "카타리나: 그 결과로 포보르 왕이 완전한 힘을 얻지는 못했습니다.%카타리나: 그래도 포보르 왕의 데이터를 충분히 축적할 수는 있을 겁니다.%카타리나: 그의 패턴이라던지, 습성이라던지, 부하들이라던지..%카타리나: 이번 퀘스트는 그를 재림시키기 위한 재료는 모으는 것.%"
					+ "카타리나: 거기까지만 하죠.%카타리나: §e마법에 타락한 자§f를 사냥하십시오.%카라리나: 그들을 사냥하다보면 §e포보르의 마나§f를 얻을 수 있을 겁니다.%카타리나: 재료로는 딱 1개의 마나만 필요하니, 우선 1개만 얻어주십쇼.");
			QuestBoard qb = new QuestBoard();
			qb.mq35_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 35장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마법탑을 향해===");
		score.setScore(3);
		Score score2 = obj.getScore("마법탑에서 카타리나와 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 221,80,725");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq35_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "카타리나: 얻으셨군요.%카타리나: 잘 보관해두시면 제가 연락을 드리겠습니다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 35장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===포보르의 마나===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르의 마나 획득");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq36(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 7000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			player.teleport(new Location(player.getWorld(),221,81,725,90,0));
			msg.msg(player, "카타리나: 괜찮으세요?%카타리나: 아무리 불완전한 힘을 가지고 있어도 왕은 왕이군요..%카타리나: 그래도 좋은 전투 데이터를 얻었어요.%카타리나: 감사합니다.%카라티나: 아! 참고로 미궁 끝에는 저희가 준비한 §e선물§f이 있어요.%카타리나: 기회가 된다면 끝까지 가봅시다!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 36장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르 왕에게 승리");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq37(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "꼬마: 다름이 아니라..%꼬마: 제 장난감을 §e떠도는 망령들§f이 부쉈어요.%꼬마: 그들은 절 공격하진 않지만 제가 복수하기엔 힘이 부족한걸요.%꼬마: 제 복수를 도와주세요. 모험가님.");
			QuestBoard qb = new QuestBoard();
			qb.mq37_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 37장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===누가 우는 소리를 내었는가===");
		score.setScore(2);
		Score score2 = obj.getScore("롱게 마을 숙소의 꼬마와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq37_1(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq37_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 37장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===떠도는 망령===");
		score.setScore(2);
		Score score2 = obj.getScore("떠도는 망령 몬스터 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq37_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "꼬마: 감사합니다. 모험가님.%꼬마: 덕분에 복수를 했네요.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 37장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===아이 달래기===");
		score.setScore(2);
		Score score2 = obj.getScore("꼬마에게 돌아가 보고하기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq38(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "꼬마: 밤마다 §e남쪽 부락§f에서 이상한 소리가 나요.%꼬마: 잘 자야 키가 클텐데..%꼬마: 모험가님이 해결할 수 있는 일이라면 부탁드려요!");
			QuestBoard qb = new QuestBoard();
			qb.mq38_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 38장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===누가 또 우는 소리를 내었는가===");
		score.setScore(2);
		Score score2 = obj.getScore("롱게 마을 숙소의 꼬마와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq38_1(Player player, int num) {
		if(num>=5) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq38_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 38장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===수상한 몬스터===");
		score.setScore(2);
		Score score2 = obj.getScore("에밀 5마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/5)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq38_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(13);
			player.getInventory().addItem(weapon1);
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "꼬마: 고마워요.%꼬마: 이거 길에서 주운건데 가지실래요?%§b에밀의 헤드§f를 획득했다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 38장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===아이에게 보답을===");
		score.setScore(2);
		Score score2 = obj.getScore("꼬마에게 돌아가 보고하기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq39(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 여기서 더 올라가 볼 수 있을 것 같은데?%네비: 한번 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq39_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 39장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===네비의 힘1===");
		score.setScore(2);
		Score score2 = obj.getScore("고성에서 방황하는 몬스터 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq39_1(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 이번에도 더 올라갈 수 있을 것 같아.");
			QuestBoard qb = new QuestBoard();
			qb.mq39_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 39장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===네비의 힘2===");
		score.setScore(2);
		Score score2 = obj.getScore("고성에서 분노하는 몬스터 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq39_2(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 6500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 아무래도 모르겠단 말이지.%네비: 나는 잠깐 여기서 조사해볼테니까%네비: 너는 다른 곳 가서 놀고 있어봐.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 39장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===네비의 힘3===");
		score.setScore(2);
		Score score2 = obj.getScore("고성에서 뒤틀린 몬스터 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq40(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 오홍!?%네비: 이것 좀 봐봐 §e검은 흐름§f이야.%네비: 쉽게 구할 수 있는 물건이 아니니까 일단 가져가자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 40장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===아라크네의 저주===");
		score.setScore(2);
		Score score2 = obj.getScore("아라크네의 저주 던전 클리어");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq41(Player player, int num) {
		if(num==1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7검은 흐름을 제어하기로 마음먹었다.%§7카타리나에게 가서 의견을 구하자.%tp822 71 511");
			QuestBoard qb = new QuestBoard();
			qb.mq41_1(player, 0);
			return;
		} else if(num==2) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7검은 흐름에 몸을 맡긴다.%tp3796 26 3798%§7정신이 아득해진다.%§7난 무엇을 위해 이 여행을 떠나온 것인가.%§7주마등이 스쳐간다.%§7이 힘에 이대로 잠식된다면 나도 포보르가 되는 것일까.%"
					+ "§7나는 무엇인가.%§7강해지고 싶다.%§7포보르가 되면 어떠리 강해지면 아무것도 두렵지 않을텐데.%§7여러 망상을 하던 중 검은 흐름의 끝에 도달했다.%§7그 끝에는 분명 악이었지만 순수한, 타락하지 않은 힘이 존재했다.%"
					+ "tp822 71 511%[System] 데빌 캐릭터를 생성할 수 있게 되었습니다.");
			return;
		} else if(num==3) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 10000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7어쩌다보니 검은 흐름에서 새로운 힘을 찾은 것 같다.%§7나는 참 운이 좋은 것 같다.%tp822 71 511%[System] 대행자 캐릭터를 생성할 수 있게 되었습니다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 41장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===");
		score.setScore(2);
		Score score2 = obj.getScore("운명을 정하기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq41_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "카타리나: 어머나 그 힘은..?%카타리나: 매우 위험한 냄새가 나는군요.%카타리나: 저희 측에서 이걸 봉인시켜 드리겠습니다.%카타리나: 흐으음.%카타리나: 후우우.%"
					+ "카타리나: 봉인하는 과정에서 흐름에서 순수한 힘이 정제되었어요.%카타리나: " + player.getDisplayName() + "님이 가져오신거니 가져가셔도 괜찮아요.%"
					+ "§7따듯한 힘이 몸을 감싸온다.%[System] 엔젤 캐릭터를 생성할 수 있게 되었습니다.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 41장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===흐름의 봉인을 위해===");
		score.setScore(2);
		Score score2 = obj.getScore("마법탑의 카타리나와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq42(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 5000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "에트: 이곳은 §e하마베 마을§f이에요.%에트: 아.. 혹시 모험가님이신가요?%에트: 모험가님 부디 §e클레어흐§f를 탈환해주세요.%에트: 제 앞에 보이는 대도시 보이시죠?%"
					+ "에트: 저곳은 지금 전쟁터에요.%에트: 과거에는 평화로운 마을이었는데..%에트: 어떤 광신도 집단이 나타나 자기들이 포보르를 낳았다느니%에트: 포보르를 따르지 않으면 지옥에서마저 포보르들에게 영원히 고통받게 된다느니.%"
					+ "에트: 처음에는 모두가 미친 사람들 취급했지요.%에트: 그런데 그들이 포보르를 마을에 대리고 온거 아니겠어요?%에트: 포보르가 도시를 점령하게 되고 생존자들은 대부분 하마베 마을로 피신하게 되었어요.%"
					+ "에트: 시간이 지나고 식량이 부족해지자 사람들은 불안에 떨었어요.%에트: 몇몇 용기있는 사람들은 배를 타고 식량을 구하러 나갔지만.. 아무도 돌아오지 못했어요.%에트: 그렇게 사람들은 미쳐갔고 많은 사람들이 광신도 집단에 무릎을 꿇었어요.%"
					+ "에트: 그 사람들이 떠나서 지금은 식량 문제가 덜하긴 하지만 이건 큰 문제에요.%에트: 부디 광신도 녀석들을 혼내주세요.");
			QuestBoard qb = new QuestBoard();
			qb.mq42_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 42장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===항구 마을, 하마베 마을===");
		score.setScore(3);
		Score score2 = obj.getScore("하마베 마을에서 주민과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 978,62,92");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq42_1(Player player, int num) {
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 8000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "에트: 으으음?%에트: 모험가님 그 사람들은 광신도 녀석들이 아니라 도망친 마을 사람들이에요.%에트: 물론 포보르들에게 개조되어 비정상적인 힘을 얻고 타락하게 되었지만요.%"
					+ "에트: ...%에트: 사실 저도 광신도 집단의 위치를 잘 아는게 아니라서요.%에트: 알아보고 다시 연락드릴게요.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 42장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===광신도 집단1===");
		score.setScore(2);
		Score score2 = obj.getScore("클레어흐의 주민 몬스터 100마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/100)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq43(Player player, int num) {
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 9000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "에트: 맞아요. 그 녀석들이 포보르들을 대려오는걸 제 눈으로 똑똑히 봤다고요.%에트: 그런데 저 녀석들은 간부급이 아닌 것 같아요.%"
					+ "에트: 광신도 간부들은 강한 포보르들과 함께 다닌다고 들었어요.%에트: 이것도 다시 알아보고 연락드릴게요.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 43장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===광신도 집단2===");
		score.setScore(3);
		Score score2 = obj.getScore("클레어흐의 광신도 100마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 1033,61,258");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq44(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 9500000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "에트: 이걸로 평화가 돌아올까요?%에트: 광신도 녀석들 포보르의 힘을 받아서 끝도 없이 재생되나봐요.%에트: 아무래도 포보르의 근원을 없애는게 답인 것 같아요.%에트: §e사막§f에 포보르의 근원이 있다는 소문이 있어요.%"
					+ "에트: 나중에 기회가 되면 한번 가보세요.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 44장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===광신도 집단3===");
		score.setScore(3);
		Score score2 = obj.getScore("클레어흐의 광신도 간부 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 914,68,173");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 15000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "에트: 이 광신도 녀석들 생각보다 대규모 집단인 것 같아요.%에트: 모험가님이 광신도 녀석들을 혼내주는 동안 사막쪽으로 도망가는 광신도 녀석들을 제가 똑똑히 봤는걸요.%에트: 이 땅에 처음으로 §e다섯 포보르의 왕§f이 나타났을 때, 셋은 거대한 바다에 나타났다고 해요.%"
					+ "에트: 바로 발로르, 코낭그, 모르크에요.%에트: 셋이서 영역 싸움을 한 것인지 어떤 일이 있었던 것인지는 모르지만 결국 바다는 §e사막§f이 되었어요.%에트: 그리고 신의 군대가 그들을 쓰러뜨리는 과정에서 일부 지역이 함께 소멸되어 공허만 남게 되었다고 해요.%"
					+ "에트: 아마도 광신도 녀석들은 사막에서 무언가 꾸미고 있는게 분명해요.%에트: 그 목적이 포보르의 왕을 재림시키는 것일지 그들의 힘을 찾아내려는 것인지는 알 수 없어요.%에트: 그러니 부디 모험가님이 사막에 한번 다녀와주세요.%"
					+ "에트: 사막은 매우 넓고 위험하니 말을 가져가시는게 도움이 될 거에요.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막1===");
		score.setScore(2);
		Score score2 = obj.getScore("하마베 마을에서 에트와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 15000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 이곳까지는 어쩐 일인가.%사막 정찰병: 이곳은 위험하네.%사막 정찰병: 흐음?%사막 정찰병: 자네 나름 쓸만한 실력을 가지고 있지 않은가.%"
					+ "사막 정찰병: 좋아. 무슨 용건인지는 몰라도 일단 우리를 도와주어야겠어.%사막 정찰병: 우선 사막에 들어가기 위해서는 §e축복의 포션§f이 필요해.%"
					+ "사막 정찰병: 그 재료를 구하는걸 퀘스트로 주지.%사막 정찰병: 사막 정찰병: 혹시라도 미리 사막에 들어가보고 싶으면 옆에 있는 친구가 포션을 팔아주긴 할거야.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막2===");
		score.setScore(3);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 211,84,947");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 15000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===축복의 포션1===");
		score.setScore(3);
		Score score2 = obj.getScore("네크로벨리 몬스터들을 잡아서 성수 획득");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -134,9,664");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_3(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 16000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 그래 이단치고는 §e성수§f를 사용하더군.%사막 정찰병: 이제 남은 재료는 §e하마베§f에서 파는 §e달콤한 열매§f다.%사막 정찰병: 그 두 개를 이용해 포션을 만들면 축복의 포션이 만들어질거다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===축복의 포션2===");
		score.setScore(2);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_4(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 16000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===축복의 포션3===");
		score.setScore(2);
		Score score2 = obj.getScore("축복의 포션 제작");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}

	public void mq45_5(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 16000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 그래. 축복의 포션을 사용하면 5분 동안은 사막의 더위에서 벗어날 수 있을거다.%사막 정찰병: 밤이 된 사막은 원래 덥지 않았는데 말이다.%"
					+ "사막 정찰병: 언제부터인가 사막에 §e붉은 모래§f가 날리게 되었고 해가 진 밤에도 죽을 것 같이 더워지게 되었다.%사막 정찰병: 좋아.%"
					+ "사막 정찰병: 설명은 이쯤으로 해두고 사막의 §eDeath Gun§f을 사냥해 너의 힘을 증명해라.%사막 정찰병: 모든 시련이 끝내면 큰 보상을 주도록 하겠다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막3===");
		score.setScore(2);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_6(Player player, int num) {
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 17000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===Death Gun===");
		score.setScore(3);
		Score score2 = obj.getScore("Death Gun 100마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 242,85,1113");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_7(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 17000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 이번에는 §e사막 곰§f을 사냥해 너의 용기를 증명해라.%사막 정찰병: 사막 곰이란 생명체는 원래 존재하지 않았으나 붉은 모래가 날리기 시작했을 때였지.%"
					+ "사막 정찰병: 사막 여우가 변이되어 곰처럼 커지게 되었다.%사막 정찰병: 그 뒤틀린 모습이 마치 이 세계의 곰과 같아 그를 사막 곰이라고 명명했다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막4===");
		score.setScore(2);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_8(Player player, int num) {
		if(num>=100) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 17000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_9(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막 곰===");
		score.setScore(3);
		Score score2 = obj.getScore("사막 곰 100마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 254,16,1428");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/100)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_9(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 18000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 이번에는 지혜를 증명할 차례다.%사막 정찰병: 이번 시련은 매우 어려울 것이나 이것이 마지막 시련이다.%"
					+ "사막 정찰병: 이면에 잠든 §e암석 거인§f을 조사하는 일이다.%사막 정찰병: 혼자가면 위험할 수도 있으니 부디 동료와 함께 가길 바란다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_10(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막5===");
		score.setScore(2);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_10(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 18000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 오케이. 거기까지만 해도 충분하네.%사막 정찰병: 지금 마법탑에서 들려온 소식에 따르면%"
					+ "사막 정찰병: 그곳에서 감지되는 포보르의 마나가 비정상적이라고 하는군.%사막 정찰병: 암석 거인이 깨어날 수도 있을걸세.%사막 정찰병: 부디 스크롤을 사용해서 안전히 마을로 돌아오게나.%");
			QuestBoard qb = new QuestBoard();
			qb.mq45_11(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===고대의 암석 협곡===");
		score.setScore(3);
		Score score2 = obj.getScore("고대의 암석 협곡 던전 클리어");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 168,21,1056");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_11(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 18000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "사막 정찰병: 암석 거인은 아깝지만 이 정도 실력이면 제대로 사막을 탐사해도 되겠군.%사막 정찰병: 사막에는 편히 쉴 수 있는 곳이 거의 없을거다.%"
					+ "사막 정찰병: §e철 채석장§f으로 가거라.%사막 정찰병: 거기가 사막의 §e유일한 마을§f이다.%사막 정찰병: 그 마을에 가면 §e성물§f에 대한 정보를 얻을 수 있을거다.%"
					+ "사막 정찰병: 이 정보가 내 보상이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_12(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막6===");
		score.setScore(2);
		Score score2 = obj.getScore("사막 정찰병과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_12(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 19000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 사막을 탐험하러 오신 모험가군요.%니오: 반갑습니다.%니오: 아마도 성물을 찾으러 오신거겠죠?%니오: 이번 일을 마쳐주시면 성물의 위치를 알려드릴게요.%"
					+ "니오: 우선 §e쌍창 전사 석상§f을 토벌해주십쇼.%니오: 녀석들의 위치는 아직 파악되지 않았어요.%니오: 임무 중 필요하시면 이곳의 §e철§f을 캐셔도 좋아요.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_13(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막7===");
		score.setScore(3);
		Score score2 = obj.getScore("채석장의 주민과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -100,28,1486");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
		
	public void mq45_13(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 19000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_14(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자1===");
		score.setScore(2);
		Score score2 = obj.getScore("쌍창 전사 석상 10마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/10)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_14(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 19000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 이번에는 §e빛의 궁수 석상§f을 토벌해주십쇼.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_15(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막8===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_15(Player player, int num) {
		if(num>=20) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 20000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_16(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자2===");
		score.setScore(2);
		Score score2 = obj.getScore("빛의 궁수 석상 20마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/20)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_16(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 20000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 이번에는 §e쌍검 전사 석상§f을 토벌해주십쇼.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_17(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막9===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_17(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 20000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_18(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자3===");
		score.setScore(2);
		Score score2 = obj.getScore("쌍검 전사 석상 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_18(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 21000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 이번에는 §e루 라바다의 석상§f을 토벌해주십쇼.%니오: 저희는 원래 루 라바다님을 따르던 민족의 후손입니다.%니오: 마을에 §e루 라바다§f님의 석상과 그의 스승이신 §e누아다§f님의 석상이 있었죠.%"
					+ "니오: 포보르들이 마을의 석상들을 탈환하기 전까지는요.%니오: 그렇게 빼앗긴 석상들이 포보르의 인형이 되어 마을을 침범했을 때 사람들은 공격하지도 못하고 당하기만 했어요.%"
					+ "니오: 석상을 공격할 수 없는 저희 대신 모험가님에게 부탁드립니다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_19(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막10===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_19(Player player, int num) {
		if(num>=40) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 21000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_20(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자4===");
		score.setScore(2);
		Score score2 = obj.getScore("루 라바다의 석상 40마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/40)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_20(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 21000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 이번에는 §e누아다의 석상§f을 토벌해주십쇼.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_21(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막11===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_21(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 22000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_22(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자5===");
		score.setScore(2);
		Score score2 = obj.getScore("누아다의 석상 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_22(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 22000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 석상들을 토벌하면서 §e투기장 스크롤§f을 주우신 적이 있나요?%니오: 전통적으로 석상들을 제작할 때는 그 안에 포보르를 봉인해둔 스크롤을 넣어두기도 해요.%"
					+ "니오: 그래야 석상에 힘이 생기고 마을을 지켜준다는 믿음이 있었거든요.%니오: 투기장 스크롤은 §e사막에 있는 투기장§f에서 사용할 수 있어요.%"
					+ "니오: 투기장 안쪽은 전장의 서늘함이 느껴져서 덥지 않다고 해요.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_23(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막12===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_23(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 22000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_24(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===투기장===");
		score.setScore(3);
		Score score2 = obj.getScore("C급 투기장 스크롤을 사용");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 128,63,1955");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_24(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 23000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니오: 마법탑에서 사막으로 올 때 §e거대한 거인상§f을 보셨나요?%니오: 거기 발굴 현장에서 성물 같은 걸 발견한 걸로 알아요.%니오: 그쪽으로 가면 성물에 대한 정보를 구할 수 있을 것 같아요.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_25(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막13===");
		score.setScore(2);
		Score score2 = obj.getScore("니오와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_25(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 24000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "연구원: 흐음 여긴 어떤 일이시죠?%연구원: 당연히 성물을 찾아 오셨겠죠.%연구원: 다른 사람들에게는 성물이라고 했지만..%연구원: 연구원들 사이에선 성물이 아니라고 보고 있긴 합니다.%"
					+ "연구원: 굉장히 불길하고 어두운 힘이 느껴지는데 저희가 알아낼 수 있는 부분이 없었습니다.%연구원: 모험가님이 가져가신다면 그냥 드리겠습니다.%연구원: 저희도 이걸 처리할 수 있다면 감사하죠.%"
					+ "§5무명의 성물§f을 획득했다.%네비: 흐으음..?%네비: 이건 나도 처음보는 힘인 것 같아.%네비: 아무래도 고위 마법사에게 물어봐야할 것 같은데?%§7마법탑의 카타리나는 어떻냐고 물어본다.%"
					+ "네비: 그쪽은 너무 고지식해서 재미없단 말이지.%연구원: 사막에 왕궁 출시 마법사분이 계시는데 그분은 어떨까요?%네비: 왕궁 출신이면 실력은 확실하겠다.%연구원: 그럼 좌표 찍어드리겠습니다.");
			ItemStack rein = new ItemStack(Material.CHARCOAL);
			ItemMeta reinIm = rein.getItemMeta();
			reinIm.setDisplayName(ChatColor.DARK_PURPLE + "무명의 성물");
			ArrayList<String> reinLore = new ArrayList();
			reinLore.add(ChatColor.GRAY + "사막 발굴 현장에서 발견된 성물");
			reinLore.add(ChatColor.GRAY + "아직 성물의 힘이 파악되지 않아 이름이 존재하지 않는다.");
			reinIm.setLore(reinLore);
			rein.setItemMeta(reinIm);
			player.getInventory().addItem(rein);
			QuestBoard qb = new QuestBoard();
			qb.mq45_26(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막14===");
		score.setScore(3);
		Score score2 = obj.getScore("발굴 현장에서 연구원과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 334,64,1088");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_26(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 25000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 알고 있다.%니세리나: 5km 밖에서부터 기척을 느꼈으니까.%니세리나: 그래서 용건이 뭐지?%니세리나: 그래 마법탑의 카타리나와 닮았다고?%니세리나: 그야 내가 그녀의 언니이기 때문이지.%"
					+ "니세리나: 용건이 끝났다면 이제 가봐라.%§7그런 문제가 아니라 성물을 봐달라고 한다.%니세리나: 훗, 알고 있지.%니세리나: 내가 바로 그 성물을 봉인한 사람이니까.%니세리나: 놀라지 말거라.%"
					+ "니세리나: 내가 이 땅 최고의 마법사니까.%니세리나: 하지만 내가 너무 강력한 봉인을 해버렸다.%니세리나: 그래서 나도 봉인을 풀 수 없어.%니세리나: 내 IQ300의 두뇌가 말하는군.%"
					+ "니세리나: 이 성물은 그냥 사용해도 된다.%니세리나: 믿어도 된다.%니세리나: 난 아인슈타인과 뉴턴의 스승이니까..!%니세리나: 아마도 봉인된 성물의 힘은 약화되어서..%"
					+ "니세리나: §d달의 힘이 깃든 검+§f, §d태양의 힘이 깃든 검+§f 이 두가지 무기를 초월할 수 있을 것 같군.%니세리나: 칫. 내가 너무 강력한 봉인을 해서 이정도가 한계같군.%"
					+ "니세리나: 내가 너무 강해서 미안하다.%니세리나: 이걸 알려준 김에 부탁을 하나 하지.%니세리나: 사막 남쪽 바다를 보면 §e외딴 섬들§f이 있다네.%니세리나: 거기를 갔다와주게.%"
					+ "니세리나: 그곳의 모든 생물은 네모다.%니세리나: 나의 아름다운 코끝을 따라올 수가 없지.%니세리나: 그 녀석들 중 최약체인 §e고먐미§f를 잡아와라.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_27(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막15===");
		score.setScore(3);
		Score score2 = obj.getScore("니세리나와 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -113,51,1866");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_27(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 25000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_28(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅1===");
		score.setScore(3);
		Score score2 = obj.getScore("고먐미 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -276,65,2410");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_28(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 26000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 훗, 역시.%니세리나: 내가 사람을 잘못본게 아니군.%니세리나: 말하지 않아도 알고 있다.%니세리나: 너가 고먐미를 처리했다는 사실은 이미 알고 있으니까.%"
					+ "니세리나: 5km 밖에서도 그 츄르 냄새는 숨길 수가 없지.%니세리나: 이번에는 §e펨뮌§f을 상대해봐라.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_29(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막16===");
		score.setScore(2);
		Score score2 = obj.getScore("니세리나과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_29(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 26000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_30(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅2===");
		score.setScore(3);
		Score score2 = obj.getScore("펨뮌 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -205,69,2480");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_30(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 27000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 말하지 않아도 알고있지.%니세리나: 너가 펨뮌을 사냥하고 있을 때%니세리나: 펨뮌 특유의 울음소리를 들었으니까.%"
					+ "니세리나: 이번에는 §e먐§f을 잡아와라.%니세리나: 너가 아는 평범한 양과는 수준이 다를 것이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_31(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막17===");
		score.setScore(2);
		Score score2 = obj.getScore("니세리나과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_31(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 27000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_32(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅3===");
		score.setScore(3);
		Score score2 = obj.getScore("먐 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -318,76,2518");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_32(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 28000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 어떠냐.%니세리나: 이번에는 좀 힘들었나?%니세리나: 아무리 어려워도 너는 해낼 것이란걸 알고 있지.%니세리나: 자 마지막이 보이는군.%"
					+ "니세리나: 이번에는 §e뭔숨미§f를 잡아와라.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_33(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막18===");
		score.setScore(2);
		Score score2 = obj.getScore("니세리나과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_33(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 28000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_34(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅4===");
		score.setScore(3);
		Score score2 = obj.getScore("뭔숨미 50마리 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -353,64,2450");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/50)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_34(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 29000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 좋아. 좋아.%니세리나: 이제 중앙섬 지하로 가서 동물들을 네모로 만들어버린 그 녀석을 처리하자.%니세리나: 방법은 간단해.%"
					+ "니세리나: 지하에 있는 몬스터들을 잡다보면 알아서 나오겠지뭐.%니세리나: 자기 부하들이 당하고 있는데 그냥 지켜만 보겠어?");
			QuestBoard qb = new QuestBoard();
			qb.mq45_35(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막19===");
		score.setScore(2);
		Score score2 = obj.getScore("니세리나과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_35(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 29000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq45_36(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅5===");
		score.setScore(3);
		Score score2 = obj.getScore("중앙 섬 지하에서 단서 찾기");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: -294,36,2466");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_36(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 그 녀석을 처리했군.%니세리나: 넌 정말 대단한 모험가야.%니세리나: 이 세계 최강의 마법사인 내가 인정하도록 하지.%"
					+ "§7아직 그런것이 아니라고 한다.%니세리나: 크흣..?%니세리나: 당연히 알고 있지.%니세리나: 내가 모를 것이라고 생각했나..?%"
					+ "니세리나: 난 그저 니놈이 포보르편에서 거짓말을 하는지 테스트한 것이다.%니세리나: 반응을 보니 포보르 세력은 아닌 듯하군.%"
					+ "니세리나: 그래서 날 왜 찾아온거지?%§7특이한 스크롤을 주웠다고 알려준다.%니세리나: 이 마나의 흐름은 분명..%"
					+ "니세리나: 어딘가로 이동시키는 주문서구만.%니세리나: 어디서 사용해야 효력이 발생되는지 알아보도록 하지.%"
					+ "니세리나: 흐흠.%니세리나: 흐아아.%니세리나: 쿠오오.%니세리나: 흐아앙.%니세리나: 자 결과가 나왔네.%"
					+ "니세리나: 어디서 사용해야하는지 나와있지 않더군.%니세리나: 내가 찾은 것은 유통기한 뿐이네.%니세리나: 그래서 말이야.%"
					+ "니세리나: 이 집에 마력을 부여했다.%니세리나: 여기서 사용하면 아마 스크롤이 작동할게야.");
			QuestBoard qb = new QuestBoard();
			qb.mq45_37(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막20===");
		score.setScore(2);
		Score score2 = obj.getScore("니세리나과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq45_37(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 아아. 마이크 테스트.%니세리나: 니세리나 이즈 온 더 마이크.%니세리나: 들리십니까.%니세리나: 제 명석한 두뇌로 판단해본 결과%"
					+ "니세리나: 저 사람은 피르볼그 시대의 제사장인 것 같군요.%니세리나: 저 얼굴과 뼈의 형태가 그를 증명하지요.%니세리나: 그가 어떤 이유로 동물들을 이렇게 만든 것인지는 모르겠군요.%"
					+ "니세리나: 아무튼 제 요청을 들어주셔서 감사합니다.%니세리나: 이 정도 쯤은 저도 쉽게 할 수 있지만..%니세리나: 제 힘이 각성해버리면 저 또한 감당할 수 없습니다.%"
					+ "니세리나: 다음 생에는 조금만 더 약하게 태어났으면 좋겠군요.%니세리나: 그럼 이만.%니세리나: 봉쥬르.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 45장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===대사막-최종장===");
		score.setScore(2);
		Score score2 = obj.getScore("동물들을 변이시킨 자에게 승리");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "줄리엣: 안녕하세요.%줄리엣: 저는 멀고 먼 §e라파누이§f라는 섬에서 온 사람이에요.%줄리엣: 여러 섬들을 탐험하실 예정이라고 들었어요.%"
					+ "줄리엣: 바쁘신 것은 알지만 우선 라파누이에 가주셨으면 좋겠어요.%줄리엣: 라파누이 섬은 §e미아즈마단§f이 점령한 이후 죽어가기 시작했어요.%"
					+ "줄리엣: 부디 저희 섬을 구원해주세요.%줄리엣: 아직 도망쳐 나오지 못한 주민들이 있을거에요.");
			QuestBoard qb = new QuestBoard();
			qb.mq46_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽어가는 섬===");
		score.setScore(3);
		Score score2 = obj.getScore("하마베의 줄리엣과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 954,68,42");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "로미오: 살려주세요..%로미오: 저희는 미아즈마단에 쫒겨 여기까지 오게 되었어요.%로미오: 여기서 탈출하고자 나간 사람들은 모두 돌아오지 못했어요.%"
					+ "로미오: 아마 미아즈마단에게 걸린거겠죠.%로미오: 부디 저희를 구원해주세요.");
			QuestBoard qb = new QuestBoard();
			qb.mq46_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===죽어가는 섬의 주민===");
		score.setScore(2);
		Score score2 = obj.getScore("라파누이 섬에서 주민 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_2(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단1===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 신입 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_3(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단2===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 단원 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_4(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단3===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 보초병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_5(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단4===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 강화병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_6(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단5===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 이급 군인 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_7(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq46_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단6===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 일급 군인 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_8(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "로미오: 미아즈마의 집 위에는 §e종§f이 있대요.%로미오: 종을 울리면 미아즈마가 나타나지 않을까요?%로미오: 이 일만 끝나면 하마베로 도망가야겠어요.");
			QuestBoard qb = new QuestBoard();
			qb.mq46_9(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단7===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마단 간부 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq46_9(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 후우~ 오늘도 한건 했네요.%데히트라: 여어. 오랜만이다. " + player.getDisplayName() + "%데히트라: 오늘도 고생하는구나.%"
					+ "데히트라: 곧 나와 만나게 될 것 같군.%데히트라: 그 때까지 잘 살아있어주거라.%네비: 흐으음.. 쟤는 누굴까?");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 46장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===미아즈마단8===");
		score.setScore(2);
		Score score2 = obj.getScore("미아즈마 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq47(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "데히트라: 잘 왔다 나의 오랜 친구여.%데히트라: 먼저 물어볼 것이 있다.%데히트라: 라파누이에서 무슨 생각으로 종을 울린 것이냐.%데히트라: 종의 의미를 모르는 것이냐.%데히트라: 세계에는 포보르를 봉인하는 §e3개의 종§f이 있다.%데히트라: 반대로 말하면 포보르를 깨우기 위한 종이기도 하지.%"
					+ "데히트라: 네놈이 모든 종을 울리게 되면 무슨 일이 일어나는지 알려주지.%데히트라: 어딘가에 존재하는 §e요정들의 문이며 이계로 향하는 문§f.%데히트라: 먼 옛날 투어허 데 다넌의 영웅들이 §e팔리아스§f나 다른 땅에서 왔다는 그 문.%데히트라: 그래, 인간들은 그것을 §e세계의 문§f이라고 부르지."
					+ "데히트라: 그 문이 열리게 되는 것이다.%데히트라: 그 문을 열게되면 너는 강해지겠지.%데히트라: 하지만 그게 끝이 아니라는건 알고 있을텐데.%데히트라: 각지의 포보르들은 힘을 되찾을꺼야.%데히트라: 왜?%데히트라: 문으로 봉인된 포보르의 왕들도 깨어나게 될꺼니까.%"
					+ "데히트라: 너는 포보르의 왕을 쓰러뜨릴 재목이 될 수 있어.%데히트라: 하지만 그걸로 끝일까?%데히트라: 그게 과연 해피엔딩을 위한 길일까?%데히트라: 선택은 너에게 맡기도록 하지.%데히트라: ... 서론이 길었군.%"
					+ "데히트라: 3개의 종 중 두번째 종은 내가 가지고 있다.%데히트라: 이쪽 종은 크기가 작아서 말이지.%데히트라: 네놈이 나의 퀘스트를 충실히 이행한다면 종을 주도록 하지.%데히트라: 자, 어떤가 충분한 보상이 아닌가?%tp887 55 -25");
			QuestBoard qb = new QuestBoard();
			qb.mq47_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 47장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===3개의 종===");
		score.setScore(3);
		Score score2 = obj.getScore("정해진 장소로 이동");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 887,54,-24");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq47_1(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq47_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 47장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===라히무호나 섬1===");
		score.setScore(2);
		Score score2 = obj.getScore("환영병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq47_2(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq47_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 47장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===라히무호나 섬2===");
		score.setScore(2);
		Score score2 = obj.getScore("붉은 좀비 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq47_3(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq47_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 47장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===라히무호나 섬3===");
		score.setScore(2);
		Score score2 = obj.getScore("유혹하는 나무 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq47_4(Player player, int num) {
		if(num>=30) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "데히트라: 크큭.. 수고했다.%데히트라: 종을 울리거라.%§7맑은 음색의 공명이 세계를 뒤덮는다.%데히트라: 이제 하나 남았구나.%데히트라: 크하하하하하.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 47장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===라히무호나 섬4===");
		score.setScore(2);
		Score score2 = obj.getScore("중급 파괴수 30마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/30)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "디아스: 오우! 당신이 나의 의뢰를 해결해줄 영웅님!%디아스: 어쩌다 이곳에 갇혀버렸어요우...%디아스: 그런데 이걸 어쩐다.%디아스: §e닻§f을 잃어버린거 아니겠어요우?%"
					+ "디아스: 나갈 수 있는 방법이 사라졌다요. 완전!%디아스: 닻은 어떤 §e도둑§f이 가져갔다.%디아스: 도둑은 아마 섬에 숨어있다요!%디아스: 닻을 찾아와주면 내가 항해를 도와주겠어요우.%"
					+ "디아스: 우리 일족만 아는 §e숨겨진 섬§f이다요우.");
			QuestBoard qb = new QuestBoard();
			qb.mq48_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시오카나 섬===");
		score.setScore(2);
		Score score2 = obj.getScore("시오카나 섬에서 의뢰인 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===사라진 닻===");
		score.setScore(2);
		Score score2 = obj.getScore("잃어버린 닻 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "디아스: 오우! 정말로 가져온 것입니까.%디아스: 나는 행복하다. 매우!%디아스: 약속대로 섬을 대려다 줄 수 있겠다요우.%"
					+ "디아스: 사실 섬은 앞의 상인에게 티켓을 사면 갈 수 있어요우.%디아스: 하하하. 고맙다 나의 친구.%디아스: 하지만 내가 좋은 것을 알려준다.%"
					+ "디아스: 그곳 섬 마을에 나의 친구가 있다.%디아스: 그에게 소개시켜준다.%§7혹시 섬에 종이 없냐고 물었다.%디아스: 오우! 종? 그것 우리 섬에 있다.%"
					+ "디아스: 나의 친구에게 물어보면 알려줄 것.%디아스: 나의 친구는 있다. §e마을 여관§f!");
			QuestBoard qb = new QuestBoard();
			qb.mq48_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===새로운 섬===");
		score.setScore(2);
		Score score2 = obj.getScore("디아스와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_3(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "리로이: 오우! 오랜만이다. 외지인.%리로이: 나 에일어 좋지않아.%리로이: 양해부탁!%§7디아스가 이곳에 종이 있다고 알려주었다고 한다.%"
					+ "리로이: 오우! 디아스 나의 친구, 아는 것?%리로이: 역시나 있다. 종, 이 섬에.%리로이: 하지만 그것은 똥같은 생각!%리로이: 종에 도달할 수 있는 인간 없는 수준.%"
					+ "리로이: 그러니 너는 나의 도전한다.%리로이: 퀘스트는 리스트에 적었다.%리로이: 모두들 안녕.");
			QuestBoard qb = new QuestBoard();
			qb.mq48_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===스켈리그 섬===");
		score.setScore(2);
		Score score2 = obj.getScore("스켈리그에서 주민과 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_4(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련1===");
		score.setScore(2);
		Score score2 = obj.getScore("야생 곰 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_5(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련2===");
		score.setScore(2);
		Score score2 = obj.getScore("도살자 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_6(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련3===");
		score.setScore(2);
		Score score2 = obj.getScore("팬더 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_7(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련4===");
		score.setScore(2);
		Score score2 = obj.getScore("가면을 쓴 좀비 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_8(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_9(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련5===");
		score.setScore(2);
		Score score2 = obj.getScore("엘보코로나 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_9(Player player, int num) {
		if(num>=20) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_10(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련6===");
		score.setScore(2);
		Score score2 = obj.getScore("초록 괴물 20마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/20)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_10(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_11(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련7===");
		score.setScore(2);
		Score score2 = obj.getScore("요새를 지키는 불꽃 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_11(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_12(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련8===");
		score.setScore(2);
		Score score2 = obj.getScore("모히칸 좀비 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_12(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_13(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===리로이의 시련9===");
		score.setScore(2);
		Score score2 = obj.getScore("요새의 궁수병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_13(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "리로이: 오우! 모든 시련을 마친다!%리로이: 살아온 김에 새로운 시련 받는다. 하하.%리로이: 스켈리그 앞바다 해적선있다.%리로이: 이곳 마치 지중해.%"
					+ "리로이: 해적 §e검은 수염§f 매우 강하다.%리로이: 한번 잡아봐라. 재미있다.%리로이: 모든 적, 나의 지팡이 앞에 무력. 하하.%리로이: 살아 돌아오면 §e나의 보물§f 증정.%"
					+ "리로이: 특히 §e고양이§f가 매우 날렵하니 조심!");
			QuestBoard qb = new QuestBoard();
			qb.mq48_14(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===시련을 마친 자===");
		score.setScore(2);
		Score score2 = obj.getScore("리로이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_14(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq48_15(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===검은 수염===");
		score.setScore(2);
		Score score2 = obj.getScore("폭주한 검은 수염 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_15(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "리로이: 오우! 나쁜 검은 수염 처리 완료!%리로이: 하지만 그는 나쁜 녀석.%리로이: 아마 §e그의 배에 보물§f이 있을 것!%"
					+ "리로이: 아마 열 수 있다.%리로이: 가라. 영웅이여!");
			QuestBoard qb = new QuestBoard();
			qb.mq48_16(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물1===");
		score.setScore(2);
		Score score2 = obj.getScore("리로이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_16(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(17);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.DARK_RED + "텅 빈 심장" + ChatColor.WHITE + "를 획득했다.");
			QuestBoard qb = new QuestBoard();
			qb.mq48_17(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물2===");
		score.setScore(2);
		Score score2 = obj.getScore("해적선에서 보물 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_17(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "리로이: 좋다.%리로이: 그 보물을 사용하면 더욱 강해질 것이다.%리로이: 이제 종의 위치를 알려줘도 될 것 같다.%"
					+ "리로이: 신전에 있다.%리로이: 신전에 가서 종을 울려라.%리로이: 그런데 신전에 들어가려면 필요하다.%리로이: 매우매우 강한 힘.%"
					+ "리로이: 그러니 아직 너에게는 무리!%리로이: 충분히 강해지면 내가 다시 부를 것!");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 48장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물3===");
		score.setScore(2);
		Score score2 = obj.getScore("리로이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq48_18(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 30000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "네비: 와아-%네비: 그런데 뭐가 달라졌나요?%네비: 아! 그러고보니 문이 어디에 있는지는 모르네?%네비: 그래도 3개의 종을 다 울렸으니까아-%"
					+ "네비: 데히트라가 우리한테 연락을 주지 않을까?%네비: 그 녀석 은근히 너를 기대하는 눈치던데?%네비: 다음 여행에도 무리 없게 좀만 레벨업하고 있자.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 49장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===마지막 종===");
		score.setScore(2);
		Score score2 = obj.getScore("신전에서 종 울리기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq49_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===신대륙 칼라아릿===");
		score.setScore(2);
		Score score2 = obj.getScore("티페라리로 향하는 배에 탑승");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: §e세계의 문§f?%마가이: 왜 그곳에 향하려 하는거지?%마가이: 애초에 꼬맹이 따위가 열 수 있는 문이 아니다.%§7이미 세 개의 종을 모두 울려 문을 열 자격이 있다고 하였다.%마가이: 뭐..뭐랏?%"
					 + "마가이: 생각보다 위험한 녀석이군..%마가이: 어쩔 수 없지.%마가이: 그럼 이 안건은 의회에서 처리하도록 하지.%마가이: 의장님께서 결정하실게다.%"
					 + "마가이: 네 녀석이 문을 열고 싶다면 마을 사람들에게 도움이 되는 일을 하거라.%마가이: 흠.. 이게 적당하겠군.%마가이: 어렵겠지만 이것만큼 확실한 것이 없다.%"
					 + "마가이: §e검은 흐름에 잠식된 주민§f들을 안식에 들게 하거라.");
			QuestBoard qb = new QuestBoard();
			qb.mq49_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅1===");
		score.setScore(3);
		Score score2 = obj.getScore("티페라리의 빛나는 나무로 이동");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 726,90,-966");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_2(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq49_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅2===");
		score.setScore(2);
		Score score2 = obj.getScore("검은 흐름에 잠식된 주민 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_3(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: §e주인을 잃은 라마§f들이 시끄럽다는 사람들이 많다네.%마가이: 국가의 안전도 중요하지만 국민을 위한 일이 더욱 중요하지.%"
					+ "마가이: 가서 라마들을 잠재우거라.");
			QuestBoard qb = new QuestBoard();
			qb.mq49_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅3===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_4(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq49_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅4===");
		score.setScore(2);
		Score score2 = obj.getScore("주인을 잃은 라마 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_5(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 이곳 §e교회§f에는 이단들이 자리잡고 있다.%마가이: 도시와 먼 곳에 교회가 있어서 관리하기 힘든 상황이라네.%"
					+ "마가이: 의회에서 인정받기 위해 이보다 더 좋은 일은 없을 것이다.%마가이: §e이단들의 교주§f를 처단하거라.");
			QuestBoard qb = new QuestBoard();
			qb.mq49_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅5===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_6(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq49_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅6===");
		score.setScore(3);
		Score score2 = obj.getScore("페라리교의 교주 사냥");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 846,69,-1077");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_7(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 자네도 많이 봐왔겠지만 이 대륙에는 §e고양이§f가 많다네.%마가이: 뭐.. 못봤다면 어쩔 수 없지만 말일세.%"
					+ "마가이: 그런 고양이 중에서도 무리를 짓고 사람들을 해치는 녀석들이 있다네.%마가이: 그들을 처치해주시게나.%"
					+ "마가이: 분명 어딘가에서 떠돌고 있을 것이네.");
			QuestBoard qb = new QuestBoard();
			qb.mq49_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅7===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_8(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq49_9(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅8===");
		score.setScore(2);
		Score score2 = obj.getScore("떠돌이 고양이 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq49_9(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 좋다.%마가이: 이 정도면 티페라리를 위한 일을 충분히 한 것 같구나.%마가이: 의회에 가서 너에 대한 안건을 보고하겠다."
					+ "%마가이: 기다리고 있거라.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 50장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅9===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7네비가 없어져서 퀘스트 진행을 알기 어렵다.%§7일단 마가이에게 가서 다시 세계의 문의 위치를 묻자.");
			QuestBoard qb = new QuestBoard();
			qb.mq50_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===찾아온 불청객===");
		score.setScore(2);
		Score score2 = obj.getScore("데히트라와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 마침 회의에서 너에 대한 안건이 다 이야기되었다.%마가이: 회의에서는 이 대륙의 §e참혹한 비밀§f을 네놈이 해결하는 것을 조건으로 세계의 문을 걸었다.%"
					+ "마가이: 어때 할 수 있겠는가.%§7그렇다고 답한다.%마가이: 좋아. 그럼 해야할 일을 알려주도록 하지.%마가이: 우선 참혹한 비밀이 무엇인지 알아내는 것이 시작일 듯 하구나.%"
					+ "마가이: 아마 티페라리 왕궁 안 어딘가에 아직 기록이 남아있을 것이다.%마가이: 왕가의 일지를 보관하던 책사놈이 살아있었으면 좋으련만..");
			QuestBoard qb = new QuestBoard();
			qb.mq50_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서1===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 그래 그것이 티페라리의 끔직한 과거란다.%마가이: 끔찍한 과거를 겪은 §e왕자 크리스§f는 포보르 왕의 힘을 이어받아 더이상 인간의 모습이 아니게 되었다고 하는구나.%"
					+ "마가이: 크리스는 티페라리를 떠나 칼라아릿의 저 먼 땅에 있는 사막으로 갔다지.%마가이: 그리고 그곳에서 그의 조상..%"
					+ "마가이: 그래. 발로르의 힘을 이용해 아주 §e매서운 바람이 부는 설원§f을 만들어 그곳에 잠들었지.%마가이: 하지만 포보르들이 이렇게 날뛰는 지금.%"
					+ "마가이: 아마도 그가 기나긴 잠에서 깨어난 듯하네.%마가이: 부디.. 그분을 막아주게나.%마가이: 하지만... 너의 힘으로는 아직 무리일 것이야.%"
					+ "마가이: 티페라리의 앞의 리디아 평원에는 여러 종의 몬스터들이 있다네.%마가이: 수련을 위해 조금만 노력해주게나.%마가이: §e화염의 조종자§f부터 시작하도록 하지.");
			QuestBoard qb = new QuestBoard();
			qb.mq50_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서2===");
		score.setScore(2);
		Score score2 = obj.getScore("참혹한 비밀의 단서 찾기");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_3(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq50_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서3===");
		score.setScore(2);
		Score score2 = obj.getScore("화염의 조종자 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_4(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq50_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서4===");
		score.setScore(2);
		Score score2 = obj.getScore("귀여움의 조종자 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_5(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq50_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서5===");
		score.setScore(2);
		Score score2 = obj.getScore("대지의 조종자 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_6(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq50_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서6===");
		score.setScore(2);
		Score score2 = obj.getScore("포션의 조종자 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_7(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq50_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서7===");
		score.setScore(2);
		Score score2 = obj.getScore("포보르화 모험가 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_8(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 최근에 들어온 이야기가 있어 잠시 불렀네.%마가이: §e원시의 땅§f에 살던 부족들의 상태가 이상하다는 소문이 들어왔네.%"
					+ "마가이: 부족장이 쿠데타를 일으켜 지금 영토를 점령 중이라는군.%마가이: 그렇다고 해서 기존의 §e족장 <바람을 가르는 늑대>§f도 정상인 것 같지는 않아.%"
					+ "마가이: 크리스가 물려받은 사안의 힘이 이런 식으로 발현이 된건지 어쩐지는 잘 모르겠지만.%마가이: 지금 위험한 상태임은 틀림이 없네.%"
					+ "마가이: §e바람을 가르는 늑대§f와 한번 만나보시게나.%마가이: 만약 그가 제정신이 아니라면..%마가이: 처분은 그대에게 맡기지.");
			QuestBoard qb = new QuestBoard();
			qb.mq50_9(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서8===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_9(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 이런.. 족장도 이미 당한것인가..!%마가이: 어서 돌아오게.%마가이: 자네가 상대할 존재가 아니야!");
			QuestBoard qb = new QuestBoard();
			qb.mq50_10(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서9===");
		score.setScore(3);
		Score score2 = obj.getScore("바람을 가르는 늑대와 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 1236,93,-1668");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq50_10(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 위험했구만..%마가이: 크리스 왕자의 힘이 이곳까지 퍼져 생존자에 닿는다면 큰일이 나겠어.%"
					+ "마가이: 내가 크리스 왕자의 위치를 특정할 때까지 조금만 시간을 주지 않겠나?%마가이: 자네가 강해질 시간을 잠시나마 가지게나.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 51장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서10===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 돌아왔구만.%마가이: 자네에게서 느껴지는 이 기운..%마가이: 원시의 땅에서의 수련을 마칠 때가 왔군.%"
					+ "마가이: 이제 크리스 왕자를 막기 위해 떠나도 될 것 같다.%마가이: 드넓은 설원에서 크리스 왕자의 위치를 확실히 알 수는 없었어.%"
					+ "마가이: 하지만 힌트 정도는 얻었지.%마가이: 크리스 왕자가 설원을 만들고 포보르의 세력들을 늘려갈 때..%"
					+ "마가이: 원시의 땅 일부가 검은 흐름의 힘으로 변이되었다네.%마가이: 그 검은 흐름은 필히 크리스 왕자의 것.%"
					+ "마가이: §e변이된 원시의 땅§f을 수색하다 보면 그의 흔적을 찾을 수 있을 것이네.");
			QuestBoard qb = new QuestBoard();
			qb.mq51_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅1===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_1(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq51_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅2===");
		score.setScore(2);
		Score score2 = obj.getScore("변이된 원시의 땅 보초병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_2(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq51_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅3===");
		score.setScore(2);
		Score score2 = obj.getScore("변이된 원시의 땅 상급병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_3(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq51_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅4===");
		score.setScore(2);
		Score score2 = obj.getScore("변이된 원시의 땅 정예병 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_4(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7계속 사냥을 하였지만 아무 정보도 얻을 수 없었다고 말한다.%마가이: 흐음.. 꽤나 강한 녀석까지 상대한 것 같은데 정보가 없었다라.%"
					+ "마가이: 최후의 수단을 택해야겠군.%마가이: 그 땅의 §e고지대§f로 가면 족장을 지키던 §e첨예발톱§f들이 있을게다.%마가이: 족장과 가장 가까운 위치에 있던 자이니%"
					+ "마가이: 정보를 얻을 수 있을게야.%마가이: 혹여 그들을 상대하던 중 족장이 나타난다면 도망가는 것을 권장하네.%"
					+ "마가이: 힘으로 족장 <바람을 가르는 늑대>를 밀어낸 자이니 분명 강할걸세.");
			QuestBoard qb = new QuestBoard();
			qb.mq51_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅5===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_5(Player player, int num) {
		if(num>=50) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			QuestBoard qb = new QuestBoard();
			qb.mq51_6(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅6===");
		score.setScore(2);
		Score score2 = obj.getScore("변이된 첨예발톱 50마리 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/50)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_6(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "§7역시나 아무 정보도 얻을 수 없었다고 말한다.%마가이: 최후의 수단으로도 어쩔 수 없었다니.%"
					+ "마가이: 이 방법만은 쓰지 않으려 했건만.%마가이: §e족장 <붉은 날개>§f에게 직접 가보도록 하지.%마가이: 붉은 날개는 첨예발톱들과 함께 있을걸세.%"
					+ "마가이: 상황이 이렇게 돼서 미안하구만.%마가이: 꼭 살아서 돌아오시게.");
			QuestBoard qb = new QuestBoard();
			qb.mq51_7(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅7===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_7(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(24);
			player.getInventory().addItem(weapon);
			msg.msg(player, "§7쓰러져가는 붉은 날개에게서 책을 한권 얻었다.%§7마가이에게 돌아가자.");
			QuestBoard qb = new QuestBoard();
			qb.mq51_8(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅8===");
		score.setScore(2);
		Score score2 = obj.getScore("붉은 날개 사냥");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq51_8(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 그렇군. 자네는 이 책을 읽어보았나?%마가이: 내용이 충격적이군.%"
					+ "마가이: 결국 크리스 왕자는 폭주를 멈추지 못했던 것인가.%마가이: 크리스 왕자를 막아준다면 그 대가로 세계의 문을 여는 것도 무리는 아닐 터%"
					+ "마가이: 조금만.. 조금만 기다려주시게.%마가이: 자네가 설원으로 떠나기 전 도움이 될 아이템을 준비해 주겠네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 52장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅9===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 변이된 원시의 땅 넘어에는 §e이베르모어§f라는 설원 지역이 있네.%마가이: 그곳에는 §e프렐리우드§f라는 작은 마을이 있어.%마가이: 프렐리우드의 주민들은 평생을 마을에 갇혀있을만큼 마을 주변이 위험하다네.%"
					+ "마가이: 도망치는 주민들은 모두 살해당하고, 마을로 들어가려는 모험가도 모두 죽는다네.%마가이: 자네라면 분명 마을까지 들어갈 수 있을게야.%마가이: 그곳에서 새로운 여행을 시작하게.%"
					+ "마가이: 좋은 소식을 주자면, 거기는 전투 요원이 굉장히 고위 직급이라 전투에 자신이 있다면 돈 걱정은 없을걸세.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_1(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===이베르모어1===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52_1(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "볼드: 모험가인가?%볼드: 이거이거 드문 일이군.%볼드: 여기까지 그냥 오진 않을 터, 노리는게 뭔가.%"
					+ "§7돈.. 아니 세계의 문을 여는 방법이라고 답했다.%볼드: 이전에 온 모험가도 같은 말을 했지.%볼드: 그 녀석은 미친놈이었어.%"
					+ "볼드: 내가 알려줄 수 없다하니 이미 알고 있다며 세계의 문을 열러 떠났지.%볼드: 향하는 방향을 봤을 때 그는 진짜로 진실을 알고 있던 것이야.%볼드: 어차피 알려진 진실.%"
					+ "볼드: 더 이상 숨길 것이 없지.%볼드: 세계의 문은 열 수 있는 문이 아니다.%볼드: 세계의 문은 그저 추상적인 존재.%"
					+ "볼드: 굳이 설명하자면 §e세계수의 내부§f라고 볼 수 있지.%볼드: 세계수는 무릇 포보르의 힘을 억제하기 위한 존재.%볼드: 세계수의 내부에는 봉인된 강력한 포보르들의 마나가 잠들어 있을거다.%"
					+ "볼드: 자 여기, 세계수의 내부로 이동할 수 있는 방법이다.%볼드: 부디 그 미친놈이 이상한 행동을 한다면 막아주길 바란다.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_2(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===이베르모어2===");
		score.setScore(3);
		Score score2 = obj.getScore("프렐리우드의 주민과 대화");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 606,55,-1558");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52_2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "볼드: 그 나무는 세계수의 가지로 만든 나무다.%볼드: 그것이 세계수의 안으로 들어갈 수 있는 열쇠임은 틀림이 없네.%"
					+ "볼드: 하지만 내가 아는건 여기서 끝이라네..%볼드: 주변에 아는 고위 마법사가 있다면 그쪽으로 가보게.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_3(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===이베르모어3===");
		score.setScore(3);
		Score score2 = obj.getScore("이상한 씨앗 획득");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 593,15,-1592");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52_3(Player player, int num) {
		if(num==1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "카타리나: 어머 그 마나는 무엇인가요?%카타리나: 매우 강력하고도 성스러운 힘이군요.%§7획득한 씨앗을 보여주며 세계수의 씨앗 같다고 전했다.%"
					+ "카타리나: 세계수.. 확실히 어렸을 때 배운 적은 있습니다.%§7이것으로 세계수의 내부로 들어갈 수 있을지 묻는다.%카타리나: 글쎄요. 제가 아는 힘에서는 불가능합니다.%"
					+ "카타리나: 씨앗이 나무로 들어가게 해주는 매개체가 된다는건 말이 안되는 것 같습니다.%카타리나: 제 생각에는 세계수를 관리하는 사람이 방법을 알고 있을 것 같아요.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_4(player, 0);
			return;
		} else if(num==2) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "니세리나: 네 녀석의 마나와는 다른 힘이 느껴지는구나.%니세리나: 이 몸이 처음보는 매우 요상한 힘이구나.%§7획득한 씨앗을 보여주며 세계수의 씨앗 같다고 전했다.%"
					+ "니세리나: 세계수.. 확실히 어렸을 때 마스터했었지.%§7이것으로 세계수의 내부로 들어갈 수 있을지 묻는다.%니세리나: ...불가능하다!%"
					+ "니세리나: 상식적으로 씨앗만 가지고 나무 안으로 들어갈 수가 있겠느냐?%니세리나: 차라리 세계수 주변에 있는 사람을 찾아가보는게 훨 낫겠구만.%니세리나: 볼 일이 끝났으면 빨리 나가거라.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_4(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===세계의 문1===");
		score.setScore(2);
		Score score2 = obj.getScore("카타리나 또는 니세리나와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52_4(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "마가이: 다시 돌아왔구나!%마가이: 무언가 성과는 있었는가?%§7세계수의 씨앗을 구한 것 같다고 전했다.%"
					+ "마가이: 세계수의 씨앗..%마가이: 그래. 그것으로 세계의 문을 열고자 하는구나.%§7가능한 것인지 물었다.%"
					+ "마가이: 가능하다.%마가이: 세계수를 관리하던 신관이 있었다.%마가이: 그에게 가면 세계수의 씨앗을 마법의 스크롤로 변환할 수 있을거다.");
			QuestBoard qb = new QuestBoard();
			qb.mq52_5(player, 0);
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===세계의 문2===");
		score.setScore(2);
		Score score2 = obj.getScore("마가이와 대화");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq52_5(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			es.giveExp(player, 50000000);
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,300,200,true,true));
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,300,200,true,true));
			msg.msg(player, "데히트라: 결국에 여기까지 왔구나.%데히트라: 이곳은 세계의 문.%데히트라: 세계수의 안쪽이지.%"
					+ "데히트라: 이곳은 시공간의 영향을 받지 않는 세계에 유일한 공간이다.%데히트라: 어느 곳은 과거로, 어느 곳은 미래로 연결되어 있지.%데히트라: 그 말은 과거의 포보르나 미래의 포보르나 여기서 조우할 수 있다는 말이다.%"
					+ "데히트라: 그들과 협력해 봉인된 포보르들의 힘을 해방할 수도 있다.%데히트라: 봉인된 그들을 다시 죽여 더욱 깊은 심연 속으로 보낼 수도 있다.%데히트라: 선택은 자유다.%"
					+ "데히트라: 네 녀석이 강해지면 다시 찾아오도록 하지.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 53장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===세계의 문3===");
		score.setScore(3);
		Score score2 = obj.getScore("세계수의 내부로 이동");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: 716,110,-991");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public void mq_last(Player player, int num) {
		if(num>=1) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard());
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			msg.msg(player, "데히트라: 크어억..%데히트라: 기다리다가 쓰러진다..%데히트라: 늦게 다니지 좀 마.%데히트라: 하나부터 열까지 다 널 위한 소리.%데히트라: 내 말 듣지 않는 너에게는 뻔한 잔소리.%데히트라: 크어억.%§7데히트라의 숨이 멎었다.%"
					+ "§7이제 이 세상에 평화가 돌아올까..%§7아.. 아직도 포보르가 나오는 걸 보니..%§7데히트라가 거짓말을 한 거구나..%§7마왕이라더니..%§7그냥 평범하게 다시 살아가야겠네.");
			return;
		}
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("HubScoreboard-1", "dummy", ChatColor.GOLD + "메인퀘스트 마지막장");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore(ChatColor.LIGHT_PURPLE + "===최후의 전투===");
		score.setScore(3);
		Score score2 = obj.getScore("데히트라를 해치우기");
		score2.setScore(2);
		Score score3 = obj.getScore("위치: ??,??,??");
		score3.setScore(1);
		Score score4 = obj.getScore("(" + num + "/1)");
		score4.setScore(0);
		player.setScoreboard(board);
	}
	
	public int getNum(Player player) {
		try {
			ArrayList<String> list = new ArrayList<String>(player.getScoreboard().getEntries());
			String strNum = null;				
			for(String line : list) {
				if(line.charAt(0) == '(') {
					strNum= line;
					break;
				}
			}			
			int num = Integer.parseInt(strNum.split("\\(")[1].split("\\/")[0]);	
			return num;
		} catch(Exception e) {
			return 0;
		}
	}
	
	public String getQuestName(Player player) {
		try {
			ArrayList<String> list = new ArrayList<String>(player.getScoreboard().getEntries());
			String name = null;
			for(String line : list) {
				if(line.charAt(2) == '=') {
					name = line;
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return null;
		}
	}
	
}
