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
	
	public void q0001(Player player, int num) {
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,20);
			player.getInventory().addItem(item);
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

	public void q1(Player player, int num) {
		//상점
		if(num>=10) {
			player.setScoreboard (Bukkit.getScoreboardManager().getNewScoreboard ());
			ItemStack item = new ItemStack(Material.EMERALD,20);
			player.getInventory().addItem(item);
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
