package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Cat;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.Player;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Wolf;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import de.Herbystar.TTA.TTA_Methods;

public class QuestBoard {
	
	Random rnd = new Random();
	static File folder = null; 
	
	public void setFolder(File f) {
		folder = f;
	}
	
	public void q0001(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "길 잃은 고양이: 냐옹~");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1142, 62, 1301, -1190, 62, 1134).split("/");
		
		//퀘스트 엔티티 소환
		Cat cat = (Cat) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.CAT);
		cat.setCustomName(ChatColor.WHITE + "길 잃은 고양이");
		cat.setCustomNameVisible(true);
		cat.setAI(false);
		cat.setInvulnerable(true);
		cat.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, cat);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0001", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("사라진 고양이를 찾기");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0002(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "길 잃은 토끼: 무무~");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1142, 62, 1301, -1190, 62, 1134).split("/");
		
		//퀘스트 엔티티 소환
		Rabbit rabbit = (Rabbit) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.RABBIT);
		rabbit.setCustomName(ChatColor.WHITE + "길 잃은 토끼");
		rabbit.setCustomNameVisible(true);
		rabbit.setAI(false);
		rabbit.setInvulnerable(true);
		rabbit.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, rabbit);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0002", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("사라진 토끼를 찾기");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0003(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "길 잃은 강아지: 으르릉~");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1142, 62, 1301, -1190, 62, 1134).split("/");
		
		//퀘스트 엔티티 소환
		Wolf wolf = (Wolf) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.WOLF);
		wolf.setCustomName(ChatColor.WHITE + "길 잃은 강아지");
		wolf.setCustomNameVisible(true);
		wolf.setAI(false);
		wolf.setInvulnerable(true);
		wolf.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, wolf);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0003", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("사라진 강아지를 찾기");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0004(Player player, int num) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 3만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0004", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("쥐 5마리 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/5)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0005(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 1000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//음식 아이템 주기
		ItemStack food = new ItemStack(Material.MUSHROOM_STEW);
		ItemMeta foodIm = food.getItemMeta();
		foodIm.setDisplayName(ChatColor.WHITE + "윤이 만든 음식");
		ArrayList<String> foodLore = new ArrayList<>();
		foodLore.add(ChatColor.GRAY + "윤이 에리와 함께 만든 음식");
		foodLore.add(ChatColor.GRAY + "하급 사무소는 제대로 된 의뢰를 받는 일이");
		foodLore.add(ChatColor.GRAY + "드물기 때문에 별의별 일을 다 맡는다고 한다.");
		foodIm.setLore(foodLore);
		food.setItemMeta(foodIm);
		player.getInventory().addItem(food);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0005", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("음식을 배달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1033, 67, 1219"); //올가
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0006(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 1000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//음식 아이템 주기
		ItemStack food = new ItemStack(Material.MUSHROOM_STEW);
		ItemMeta foodIm = food.getItemMeta();
		foodIm.setDisplayName(ChatColor.WHITE + "윤이 만든 음식");
		ArrayList<String> foodLore = new ArrayList<>();
		foodLore.add(ChatColor.GRAY + "윤이 에리와 함께 만든 음식");
		foodLore.add(ChatColor.GRAY + "하급 사무소는 제대로 된 의뢰를 받는 일이");
		foodLore.add(ChatColor.GRAY + "드물기 때문에 별의별 일을 다 맡는다고 한다.");
		foodIm.setLore(foodLore);
		food.setItemMeta(foodIm);
		player.getInventory().addItem(food);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0006", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("음식을 배달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1105, 85, 1277"); //월터
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0007(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 4만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 2000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
		
		//퀘스트 엔티티 소환
		Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
		illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
		illusioner.setCustomNameVisible(true);
		illusioner.setAI(false);
		illusioner.setInvulnerable(true);
		illusioner.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, illusioner);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0007", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("9급 해결사 처리");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0008(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 8만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
		
		//퀘스트 엔티티 소환
		Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
		illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
		illusioner.setCustomNameVisible(true);
		illusioner.setAI(false);
		illusioner.setInvulnerable(true);
		illusioner.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, illusioner);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0008", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("8급 해결사 처리");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0009(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 13);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 13만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 16000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 16000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 4만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
		
		//퀘스트 엔티티 소환
		Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
		illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
		illusioner.setCustomNameVisible(true);
		illusioner.setAI(false);
		illusioner.setInvulnerable(true);
		illusioner.setCollidable(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, illusioner);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0009", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("7급 해결사 처리");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0010(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 6000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 6000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 2만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 2000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0010", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("윤 사무소 털기");
		score.setScore(2);
		Score score2 = obj.getScore("-1175, 67, 1182");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0011(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 5만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 2500);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2500안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 1만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0011", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("가로등 사무소 털기");
		score.setScore(2);
		Score score2 = obj.getScore("-1216, 67, 1298");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0012(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 10만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 3만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0012", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("어금니 사무소 털기");
		score.setScore(2);
		Score score2 = obj.getScore("-1032, 67, 1223");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void q0013(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			QuestOwner qo = new QuestOwner();
			qo.returnEntity(player).remove();
			qo.remove(player);
			
			player.sendMessage(ChatColor.WHITE + "태인: 대단한걸? 고생했어.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 16);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 16만큼 증가했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 5만큼 증가했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0013", Criteria.DUMMY, ChatColor.GOLD + "[갈고리 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("하나 협회 3과 털기");
		score.setScore(2);
		Score score2 = obj.getScore("-1105, 186, 1467");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq9(Player player, int num) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 8급 해결사가 되었습니다.");
			
			levelup(player, "8급", "35");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "어금니 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "어금니 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep1.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			} else if(office.equals("갈고리 사무소")) {
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			} else if(office.equals("가로등 사무소")) {
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 6과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 6과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep1.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			} else if(office.equals("무소속")) {
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "어금니 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "어금니 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 6과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 6과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			} else {
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "어금니 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "어금니 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep1.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 8);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq9", Criteria.DUMMY, ChatColor.GOLD + "[9급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("쥐 5마리 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/5)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq8(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 7급 해결사가 되었습니다.");
			
			levelup(player, "7급", "90");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("무소속")) {
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "어금니 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "어금니 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 6과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 6과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				player.getInventory().addItem(recep2);
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "어금니 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "어금니 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 6과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 6과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 7);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq8", Criteria.DUMMY, ChatColor.GOLD + "[8급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 전설급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq7(Player player, int num) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 6급 해결사가 되었습니다.");
			
			levelup(player, "6급", "300");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("갈고리 사무소")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep8Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				player.getInventory().addItem(recep8);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("츠바이 협회 6과")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep5Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
		        
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep8Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep8Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 6);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq7", Criteria.DUMMY, ChatColor.GOLD + "[7급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 전설급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/2)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq6(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 5급 해결사가 되었습니다.");
			
			levelup(player, "5급", "720");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep8Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "마침표 사무소 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "마침표 사무소 소속 해결사가");
				recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "새벽 사무소 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "새벽 사무소 소속 해결사가");
				recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "쐐기 사무소 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "쐐기 사무소 소속 해결사가");
				recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 5과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 5과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 5과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 5과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 5과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 5과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 5과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 5과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "시선 사무소 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "시선 사무소 소속 해결사가");
				recep8Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 5);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq6", Criteria.DUMMY, ChatColor.GOLD + "[6급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq5(Player player, int num) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 4급 해결사가 되었습니다.");
			
			levelup(player, "4급", "1730");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("시 협회 5과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "시 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "시 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("리우 협회 5과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("세븐 협회 5과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "세븐 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 3과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 3과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 3과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 3과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 3과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 3과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 3과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 3과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 3과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 3과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 3과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 3과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 4);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq5", Criteria.DUMMY, ChatColor.GOLD + "[5급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/2)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq4(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 3급 해결사가 되었습니다.");
			
			levelup(player, "3급", "4030");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("시 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("리우 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("세븐 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 3과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 3과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 3과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 3과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 3과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 3과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep3Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep8Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 3과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 3과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 3과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 3과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 3과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 3과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 3과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 3과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep3Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep8Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 3);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq4", Criteria.DUMMY, ChatColor.GOLD + "[4급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 악몽급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq3(Player player, int num) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 2급 해결사가 되었습니다.");
			
			levelup(player, "2급", "9220");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("시 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("리우 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("세븐 협회 3과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("츠바이 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("시 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("리우 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("세븐 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep3Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep8Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        ary.remove(idx);
		        idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep3Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep8Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			if(rnd.nextInt(6) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "하나 협회 3과 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "하나 협회 남부지부 3과 소속");
				recep0Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "베이야드 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "베이야드 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "지팡이 사무소 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "지팡이 사무소 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "우제트 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "우제트 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 2);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq3", Criteria.DUMMY, ChatColor.GOLD + "[3급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 악몽급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/3)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq2(Player player, int num) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 1급 해결사가 되었습니다.");
			
			levelup(player, "1급", "20700");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("시 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("리우 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("세븐 협회 2과")) {
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				player.getInventory().addItem(recep6);
				
				ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			} else if(office.equals("무소속")) {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
			} else {
				ArrayList<ItemStack> ary = new ArrayList<>();
				
				ItemStack recep4 = new ItemStack(Material.PAPER);
				ItemMeta recep4Im = recep4.getItemMeta();
				recep4Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 1과 초대장");
				ArrayList<String> recep4Lore = new ArrayList<>();
				recep4Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 1과 소속");
				recep4Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep4Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep4Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep4Im.setLore(recep4Lore);
				recep4.setItemMeta(recep4Im);
				player.getInventory().addItem(recep4);
				
				ary.add(recep4);
				
				ItemStack recep5 = new ItemStack(Material.PAPER);
				ItemMeta recep5Im = recep5.getItemMeta();
				recep5Im.setDisplayName(ChatColor.BOLD + "시 협회 1과 초대장");
				ArrayList<String> recep5Lore = new ArrayList<>();
				recep5Lore.add(ChatColor.GRAY + "시 협회 남부지부 1과 소속");
				recep5Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep5Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep5Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep5Im.setLore(recep5Lore);
				recep5.setItemMeta(recep5Im);
				
				ary.add(recep5);
				
				ItemStack recep6 = new ItemStack(Material.PAPER);
				ItemMeta recep6Im = recep6.getItemMeta();
				recep6Im.setDisplayName(ChatColor.BOLD + "리우 협회 1과 초대장");
				ArrayList<String> recep6Lore = new ArrayList<>();
				recep6Lore.add(ChatColor.GRAY + "리우 협회 남부지부 1과 소속");
				recep6Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep6Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep6Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep6Im.setLore(recep6Lore);
				recep6.setItemMeta(recep6Im);
				
				ary.add(recep6);
				
				ItemStack recep7 = new ItemStack(Material.PAPER);
				ItemMeta recep7Im = recep7.getItemMeta();
				recep7Im.setDisplayName(ChatColor.BOLD + "세븐 협회 1과 초대장");
				ArrayList<String> recep7Lore = new ArrayList<>();
				recep7Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 1과 소속");
				recep7Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep7Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep7Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep7Im.setLore(recep7Lore);
				recep7.setItemMeta(recep7Im);
				
				ary.add(recep7);
				
				ItemStack recep1 = new ItemStack(Material.PAPER);
				ItemMeta recep1Im = recep1.getItemMeta();
				recep1Im.setDisplayName(ChatColor.BOLD + "츠바이 협회 2과 초대장");
				ArrayList<String> recep1Lore = new ArrayList<>();
				recep1Lore.add(ChatColor.GRAY + "츠바이 협회 남부지부 2과 소속");
				recep1Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep1Im.setLore(recep1Lore);
				recep1.setItemMeta(recep1Im);
				player.getInventory().addItem(recep1);
				
				ary.add(recep1);
				
				ItemStack recep2 = new ItemStack(Material.PAPER);
				ItemMeta recep2Im = recep2.getItemMeta();
				recep2Im.setDisplayName(ChatColor.BOLD + "시 협회 2과 초대장");
				ArrayList<String> recep2Lore = new ArrayList<>();
				recep2Lore.add(ChatColor.GRAY + "시 협회 남부지부 2과 소속");
				recep2Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep2Im.setLore(recep2Lore);
				recep2.setItemMeta(recep2Im);
				
				ary.add(recep2);
				
				ItemStack recep3 = new ItemStack(Material.PAPER);
				ItemMeta recep3Im = recep3.getItemMeta();
				recep3Im.setDisplayName(ChatColor.BOLD + "리우 협회 2과 초대장");
				ArrayList<String> recep3Lore = new ArrayList<>();
				recep3Lore.add(ChatColor.GRAY + "리우 협회 남부지부 2과 소속");
				recep3Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep3Im.setLore(recep3Lore);
				recep3.setItemMeta(recep3Im);
				
				ary.add(recep3);
				
				ItemStack recep8 = new ItemStack(Material.PAPER);
				ItemMeta recep8Im = recep8.getItemMeta();
				recep8Im.setDisplayName(ChatColor.BOLD + "세븐 협회 2과 초대장");
				ArrayList<String> recep8Lore = new ArrayList<>();
				recep8Lore.add(ChatColor.GRAY + "세븐 협회 남부지부 2과 소속");
				recep8Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep8Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep8Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep8Im.setLore(recep8Lore);
				recep8.setItemMeta(recep8Im);
				
				ary.add(recep8);
				
				Random rnd = new Random();
		        int idx = rnd.nextInt(ary.size());
		        player.getInventory().addItem(ary.get(idx));
		        
		        ItemStack recep9 = new ItemStack(Material.PAPER);
				ItemMeta recep9Im = recep9.getItemMeta();
				recep9Im.setDisplayName(ChatColor.BOLD + "사직서");
				ArrayList<String> recep9Lore = new ArrayList<>();
				recep9Lore.add(ChatColor.GRAY + "무소속 해결사가 될 수 있는 서류");
				recep9Lore.add(ChatColor.GRAY + "의뢰를 수주하면 사직서를 사용할 의지가");
				recep9Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep9Im.setLore(recep9Lore);
				recep9.setItemMeta(recep9Im);
				player.getInventory().addItem(recep9);
			}
			
			if(rnd.nextInt(6) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "하나 협회 3과 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "하나 협회 남부지부 3과 소속");
				recep0Lore.add(ChatColor.GRAY + "해결사가 될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "베이야드 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "베이야드 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "지팡이 사무소 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "지팡이 사무소 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			if(rnd.nextInt(3) == 0) {
				ItemStack recep0 = new ItemStack(Material.PAPER);
				ItemMeta recep0Im = recep0.getItemMeta();
				recep0Im.setDisplayName(ChatColor.BOLD + "우제트 초대장");
				ArrayList<String> recep0Lore = new ArrayList<>();
				recep0Lore.add(ChatColor.GRAY + "우제트 소속 해결사가");
				recep0Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
				recep0Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
				recep0Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
				recep0Im.setLore(recep0Lore);
				recep0.setItemMeta(recep0Im);
				player.getInventory().addItem(recep0);
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			newPersonality(player, 1);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq2", Criteria.DUMMY, ChatColor.GOLD + "[2급 해결사의 승급]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시의 별급 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void uq1(Player player, int num) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			player.sendMessage(ChatColor.GOLD + "[System] 특색 해결사가 되었습니다.");
			
			levelup(player, "특색", "0");
			
			for(Player p : Bukkit.getOnlinePlayers()) {
				if(p != player) {
					p.sendMessage(ChatColor.GOLD + "[System] " + player.getDisplayName() + "님이 특색 해결사가 되었습니다.");
				}
			}
			
			newPersonality(player, 0);
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq1", Criteria.DUMMY, ChatColor.GOLD + "[색을 부여받는 것]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시의 별급 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/5)");
		score2.setScore(0);
		player.setScoreboard(board);
	}
	
	public void giveExp(Player player, int num) {
		try {
			ItemStack item = player.getInventory().getItem(8);
			ItemMeta itemIM = item.getItemMeta();
			ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
			String grade = ary.get(1).split("\\[")[0];
			String exp = ary.get(1).split("\\[")[1].split("/")[0];
			String maxExp = ary.get(1).split("\\]")[0].split("/")[1];
			int newExp = Integer.parseInt(exp) + num;
			if (newExp > Integer.parseInt(maxExp)) {newExp = Integer.parseInt(maxExp);}
			ary.set(1, ChatColor.GRAY + grade + "[" + String.valueOf(newExp) + "/" + maxExp + "]");
			itemIM.setLore(ary);
			item.setItemMeta(itemIM);
			player.getInventory().setItem(8, item);
		} catch(Exception e) {
			
		}
	}
	
	public void levelup(Player player, String grade, String maxexp) {
		try {
			ItemStack item = player.getInventory().getItem(8);
			ItemMeta itemIM = item.getItemMeta();
			ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
			ary.set(1, ChatColor.GRAY + "등급: " + grade + " 해결사 [0/" + maxexp +"]");
			itemIM.setLore(ary);
			item.setItemMeta(itemIM);
			player.getInventory().setItem(8, item);
		} catch(Exception e) {
			
		}
	}
	
	public void newPersonality(Player player, int grade) {
		String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
		
		if(office.equals("윤 사무소")) {
			if(grade == 8) {
				fixFile(player, 1, 1);
			} else if(grade == 7) {
				fixFile(player, 2, 0);
			}
		} else if(office.equals("갈고리 사무소")) {
			if(grade == 8) {
				fixFile(player, 1, 2);
			} else if(grade == 7) {
				fixFile(player, 2, 1);
			} else if(grade == 6) {
				fixFile(player, 2, 3);
			}
		} else if(office.equals("가로등 사무소")) {
			if(grade == 8) {
				fixFile(player, 1, 3);
			} else if(grade == 7) {
				fixFile(player, 2, 2);
			}
		} else if(office.equals("어금니 사무소")) {
			if(grade == 7) {
				fixFile(player, 1, 4);
			} else if(grade == 6) {
				fixFile(player, 2, 4);
			} else if(grade == 5) {
				fixFile(player, 2, 5);
			}
		} else if(office.equals("마침표 사무소")) {
			if(grade == 5) {
				fixFile(player, 1, 5);
			} else if(grade == 4) {
				fixFile(player, 2, 11);
			} else if(grade == 3) {
				fixFile(player, 3, 2);
			}
		} else if(office.equals("새벽 사무소")) {
			if(grade == 5) {
				fixFile(player, 1, 6);
			} else if(grade == 4) {
				fixFile(player, 2, 12);
			} else if(grade == 3) {
				fixFile(player, 3, 3);
			}
		} else if(office.equals("쐐기 사무소")) {
			if(grade == 5) {
				fixFile(player, 1, 7);
			} else if(grade == 4) {
				fixFile(player, 2, 13);
			} else if(grade == 3) {
				fixFile(player, 3, 4);
			}
		} else if(office.equals("시선 사무소")) {
			if(grade == 5) {
				fixFile(player, 1, 8);
			} else if(grade == 4) {
				fixFile(player, 2, 14);
			} else if(grade == 3) {
				fixFile(player, 3, 5);
			}
		} else if(office.equals("츠바이 협회 6과")) {
			if(grade == 7) {
				fixFile(player, 2, 6);
			} else if(grade == 6) {
				fixFile(player, 3, 0);
			} else if(grade == 5) {
				fixFile(player, 3, 1);
			}
		} else if(office.equals("츠바이 협회 5과")) {
			if(grade == 5) {
				fixFile(player, 2, 7);
			} else if(grade == 4) {
				fixFile(player, 3, 6);
			}
		} else if(office.equals("시 협회 5과")) {
			if(grade == 5) {
				fixFile(player, 2, 8);
			} else if(grade == 4) {
				fixFile(player, 3, 7);
			}
		} else if(office.equals("리우 협회 5과")) {
			if(grade == 5) {
				fixFile(player, 2, 9);
			} else if(grade == 4) {
				fixFile(player, 3, 8);
			}
		} else if(office.equals("세븐 협회 5과")) {
			if(grade == 5) {
				fixFile(player, 2, 10);
			} else if(grade == 4) {
				fixFile(player, 3, 9);
			}
		} else if(office.equals("츠바이 협회 3과")) {
			if(grade == 3) {
				fixFile(player, 2, 15);
			} else if(grade == 2) {
				fixFile(player, 3, 10);
			}
		} else if(office.equals("시 협회 3과")) {
			if(grade == 3) {
				fixFile(player, 2, 16);
			} else if(grade == 2) {
				fixFile(player, 3, 11);
			}
		} else if(office.equals("리우 협회 3과")) {
			if(grade == 3) {
				fixFile(player, 2, 17);
			} else if(grade == 2) {
				fixFile(player, 3, 12);
			}
		} else if(office.equals("세븐 협회 3과")) {
			if(grade == 3) {
				fixFile(player, 2, 18);
			} else if(grade == 2) {
				fixFile(player, 3, 13);
			}
		} else if(office.equals("츠바이 협회 2과")) {
			if(grade == 2) {
				fixFile(player, 3, 14);
			} else if(grade == 1) {
				fixFile(player, 4, 0);
			}
		} else if(office.equals("시 협회 2과")) {
			if(grade == 2) {
				fixFile(player, 3, 15);
			} else if(grade == 1) {
				fixFile(player, 4, 1);
			}
		} else if(office.equals("리우 협회 2과")) {
			if(grade == 2) {
				fixFile(player, 3, 16);
			} else if(grade == 1) {
				fixFile(player, 4, 2);
			}
		} else if(office.equals("세븐 협회 2과")) {
			if(grade == 2) {
				fixFile(player, 3, 17);
			} else if(grade == 1) {
				fixFile(player, 4, 3);
			}
		} else if(office.equals("베이야드")) {
			if(grade == 1) {
				fixFile(player, 3, 18);
			} else if(grade == 0) {
				fixFile(player, 4, 5);
			}
		} else if(office.equals("지팡이 사무소")) {
			if(grade == 1) {
				fixFile(player, 3, 19);
			} else if(grade == 0) {
				fixFile(player, 4, 6);
			}
		} else if(office.equals("우제트")) {
			if(grade == 1) {
				fixFile(player, 3, 20);
			} else if(grade == 0) {
				fixFile(player, 4, 7);
			}
		} else if(office.equals("하나 협회 3과")) {
			if(grade == 1) {
				fixFile(player, 3, 21);
			} else if(grade == 0) {
				fixFile(player, 4, 8);
			}
		} else if(office.equals("츠바이 협회 1과")) {
			if(grade == 1) {
				fixFile(player, 3, 22);
			} else if(grade == 0) {
				fixFile(player, 4, 9);
			}
		} else if(office.equals("시 협회 1과")) {
			if(grade == 1) {
				fixFile(player, 3, 23);
			} else if(grade == 0) {
				fixFile(player, 4, 10);
			}
		} else if(office.equals("리우 협회 1과")) {
			if(grade == 1) {
				fixFile(player, 3, 24);
			} else if(grade == 0) {
				fixFile(player, 4, 11);
			}
		} else if(office.equals("세븐 협회 1과")) {
			if(grade == 1) {
				fixFile(player, 3, 25);
			} else if(grade == 0) {
				fixFile(player, 4, 12);
			}
		} else if(office.equals("무소속")) {
			if(grade == 1) {
				fixFile(player, 4, 4);
			} else if(grade == 0) {
				fixFile(player, 4, 13);
			}
		}
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
	
	public String getLocation(Player player, int Mx, int My, int Mz, int mx, int my, int mz) {
		int distX = Mx - mx;
		int distY = My - my;
		int distZ = Mz - mz;
		
		int x = 0;
		int y = My;
		int z = 0;
		
		while(true) {
			x = rnd.nextInt(distX) + mx;
			if(distY > 0) {
				y = rnd.nextInt(distY) + my;
			}
			z = rnd.nextInt(distZ) + mz;
			
			World world = player.getWorld();
			Location loc = new Location(world, x, y, z);
			
			if((loc.getBlock().getType() == Material.AIR) && (loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) && (loc.clone().add(0,2,0).getBlock().getType() == Material.AIR)
					&& (loc.clone().add(1,0,0).getBlock().getType() == Material.AIR) && (loc.clone().add(-1,0,0).getBlock().getType() == Material.AIR)
					&& (loc.clone().add(0,0,1).getBlock().getType() == Material.AIR) && (loc.clone().add(0,0,-1).getBlock().getType() == Material.AIR)
					&& (loc.clone().add(0,-1,0).getBlock().getType() != Material.AIR)) {
				break;
			}
		}
		
		return x + "/" + y + "/" + z;
		
	}
}
