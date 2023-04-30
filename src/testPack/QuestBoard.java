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
import org.bukkit.Chunk;
import org.bukkit.Color;
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
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Criteria;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import de.Herbystar.TTA.TTA_Methods;
import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;

public class QuestBoard {
	
	Random rnd = new Random();
	static File folder = null; 
	
	public void setFolder(File f) {
		folder = f;
	}
	
	public void q0001(Player player, int num, boolean start) {
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
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
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
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0001", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
			Score score = obj.getScore("사라진 고양이를 찾기");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0002(Player player, int num, boolean start) {
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
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			return;
		}
		if(start) {
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
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0002", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
			Score score = obj.getScore("사라진 토끼를 찾기");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0003(Player player, int num, boolean start) {
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
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
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
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0003", Criteria.DUMMY, ChatColor.GOLD + "[윤 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
			Score score = obj.getScore("사라진 강아지를 찾기");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0004(Player player, int num, boolean start) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0005(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0006(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("윤 사무소")) {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0007(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 2000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		illusioner.setPersistent(true); 
		illusioner.setSilent(true); 
		illusioner.setRemoveWhenFarAway(false);
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0008(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());

			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		illusioner.setPersistent(true); 
		illusioner.setSilent(true); 
		illusioner.setRemoveWhenFarAway(false);
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0009(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 수고했다. 복귀하도록.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 13);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 16000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 16000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		illusioner.setPersistent(true); 
		illusioner.setSilent(true); 
		illusioner.setRemoveWhenFarAway(false);
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0010(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 6000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 6000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 2000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0011(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 2500);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2500안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0012(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 정보는 대표님께 전송해두지.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0013(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "태인: 대단한걸? 고생했어.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("갈고리 사무소")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 16);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0014(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0014", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("쥐 3마리 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/3)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0015(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.sendMessage(ChatColor.WHITE + "산: 다행히 윤 사무소의 피해는 없는 것 같아.");
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "산: 다행히 윤 사무소의 피해는 없는 것 같네요.");
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//-1190 62 1134  -1142 62 1301
		String[] loc = getLocation(player, -1164, 62, 1199, -1189, 62, 1155).split("/");
		
		//퀘스트 엔티티 소환
		Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
		illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
		illusioner.setCustomNameVisible(true);
		illusioner.setAI(false);
		illusioner.setInvulnerable(true);
		illusioner.setCollidable(false);
		illusioner.setPersistent(true); 
		illusioner.setSilent(true);
		illusioner.setRemoveWhenFarAway(false);
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			qo.returnEntity(player).remove();
			qo.remove(player);
		}
		qo.put(player, illusioner);
		
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0015", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
		Score score = obj.getScore("윤 사무소 지키기");
		score.setScore(2);
		Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0016(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 아이템 주기
			ItemStack item = new ItemStack(Material.CHEST);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 6과의 물건");
			ArrayList<String> itemLore = new ArrayList<>();
			itemLore.add(ChatColor.GRAY + "츠바이 협회 6과에서 가로등 사무소로");
			itemLore.add(ChatColor.GRAY + "보내는 중요한 물건.");
			itemIm.setLore(itemLore);
			item.setItemMeta(itemIm);
			player.getInventory().addItem(item);
			
			q0016_1(player, 0, true);

			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0016", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("츠바이 협회 6과로 가기");
		score.setScore(2);
		Score score2 = obj.getScore("-1098, 81, 1275"); //줄리아
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0016_1(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "산: 수고했어.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1500);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1500안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0016_1", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("산에게 물건 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1214, 67, 1304"); //산
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0017(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 아이템 주기
			ItemStack item = new ItemStack(Material.CHEST);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 5과의 물건");
			ArrayList<String> itemLore = new ArrayList<>();
			itemLore.add(ChatColor.GRAY + "츠바이 협회 5과에서 가로등 사무소로");
			itemLore.add(ChatColor.GRAY + "보내는 중요한 물건.");
			itemIm.setLore(itemLore);
			item.setItemMeta(itemIm);
			player.getInventory().addItem(item);
			
			q0017_1(player, 0, true);

			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);

			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0017", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("츠바이 협회 5과로 가기");
		score.setScore(2);
		Score score2 = obj.getScore("-1097, 90, 1295"); //디모르포돈
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0017_1(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "산: 수고했어.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1500);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1500안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0017_1", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("산에게 물건 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1214, 67, 1304"); //산
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0018(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 아이템 주기
			ItemStack item = new ItemStack(Material.CHEST);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 3과의 물건");
			ArrayList<String> itemLore = new ArrayList<>();
			itemLore.add(ChatColor.GRAY + "츠바이 협회 3과에서 가로등 사무소로");
			itemLore.add(ChatColor.GRAY + "보내는 중요한 물건.");
			itemIm.setLore(itemLore);
			item.setItemMeta(itemIm);
			player.getInventory().addItem(item);
			
			q0018_1(player, 0, true);

			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0018", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("츠바이 협회 3과로 가기");
		score.setScore(2);
		Score score2 = obj.getScore("-1082, 94, 1215"); //크테노카스마
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0018_1(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "산: 수고했어.");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1500);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 1500안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0018_1", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("산에게 물건 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1214, 67, 1304"); //산
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0019(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("가로등 사무소")) {
				player.sendMessage(ChatColor.WHITE + "산: 아직 피해를 입은 사무소는 없나봐. 다행이다.");
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "산: 아직 피해를 입은 사무소는 없었나봐요.");
				player.setLevel(player.getLevel() + 13000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 13000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0019", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
			Score score = obj.getScore("철의 형제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0019", Criteria.DUMMY, ChatColor.GOLD + "[가로등 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);		
			Score score = obj.getScore("철의 형제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0020(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.setLevel(player.getLevel() + 7000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 7000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 2000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 2000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0020", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("편지 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1177, 202, 1454"); //묘
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0021(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.sendMessage(ChatColor.WHITE + "올가: 고생했어.");
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0021", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("버림받은 개 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0021", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("버림받은 개 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0022(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.sendMessage(ChatColor.WHITE + "올가: 고생했어.");
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0022", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("꿀꿀이네 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0022", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("꿀꿀이네 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0023(Player player, int num, boolean start) {
		if(num>=4) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.sendMessage(ChatColor.WHITE + "올가: 고생했어.");
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 12000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 12000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0023", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도끼파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/4)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0023", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도끼파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/4)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0024(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.sendMessage(ChatColor.WHITE + "올가: 고생했어.");
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0024", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("정육점파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0024", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("정육점파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		}
		
	}
	
	public void q0025(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "올가: 저것이 뒤틀림이구나…");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 13);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0025", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 전설급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0026(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			player.sendMessage(ChatColor.WHITE + "올가: 캬㨒 이 맛이지!");
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("어금니 사무소")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 4);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 1);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0026", Criteria.DUMMY, ChatColor.GOLD + "[어금니 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("홍차칵테일 사오기");
		score.setScore(2);
		Score score2 = obj.getScore("-1033, 67, 1219");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0027(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0027", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("버림받은 개 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0027", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("버림받은 개 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0028(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0028", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("꿀꿀이네 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0028", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("꿀꿀이네 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0029(Player player, int num, boolean start) {
		if(num>=4) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0029", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도끼파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/4)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0029", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도끼파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/4)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0030(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//-1190 62 1134  -1142 62 1301
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0030", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("정육점파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0030", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("정육점파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0031(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.sendMessage(ChatColor.WHITE + "월터: 뒤틀림의 원인은 아직인가?");
				
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 12000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 12000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0031", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 전설급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0032(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 6);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 3000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 3000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0032", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("가로등 사무소 보안점검");
		score.setScore(2);
		Score score2 = obj.getScore("-1214, 67, 1304");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0033(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 6과")) {
				player.setLevel(player.getLevel() + 12000);
				giveExp(player, 6);
				player.sendMessage(ChatColor.GOLD + "[System] 12000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 4000);
				giveExp(player, 2);
				player.sendMessage(ChatColor.GOLD + "[System] 4000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0033", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 6과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("5과에 보고서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1097, 90, 1295");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0034(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0034", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0034", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0035(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0035", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0035", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0036(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0036", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0036", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0037(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0037", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0037", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0038(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0038", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0038", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0039(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.sendMessage(ChatColor.WHITE + "리웨이: 평소보다 많이 넣어줬다.");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "리웨이: 평소보다 많이 드렸습니다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0039", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0040(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.sendMessage(ChatColor.WHITE + "리웨이: 살아남아서… 다행이군.");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "리웨이: 무사하셨군요!");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0040", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("외곽의 유적 조사");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0041(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 아이템 주기
			ItemStack item = new ItemStack(Material.CHEST);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.WHITE + "시 협회 2과의 물건");
			ArrayList<String> itemLore = new ArrayList<>();
			itemLore.add(ChatColor.GRAY + "시 협회 2과에서 마침표 사무소로");
			itemLore.add(ChatColor.GRAY + "보내는 중요한 물건.");
			itemLore.add(ChatColor.GRAY + "봉인에 '죽을 사'자가 적혀있다.");
			itemLore.add(ChatColor.GRAY + "몰래 열면 죽을 지도 모른다.");
			itemIm.setLore(itemLore);
			item.setItemMeta(itemIm);
			player.getInventory().addItem(item);
			
			q0041_1(player, 0, true);

			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0041", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("시 협회 2과로 가기");
		score.setScore(2);
		Score score2 = obj.getScore("-1088, 88, 1257"); //발렌틴
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0041_1(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0041_1", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("리웨이에게 물건 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1106, 71, 1176"); //리웨이
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0042(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("마침표 사무소")) {
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0042", Criteria.DUMMY, ChatColor.GOLD + "[마침표 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("마법의 손키스 사오기");
		score.setScore(2);
		Score score2 = obj.getScore("-1106, 71, 1176");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0043(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0043", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0043", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0044(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0044", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0044", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0045(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0045", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0045", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0046(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0046", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0046", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0047(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0047", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0047", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0048(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 다행히 죽지는 않았군.");
				
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 60);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "살바도르: 다행히 죽지는 않았군.");
				
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0048", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0049(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0049", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0049", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0050(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0050", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0050", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0051(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0051", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0051", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0052(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0052", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0052", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0053(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 8000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 8000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0053", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0053", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0054(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.sendMessage(ChatColor.WHITE + "살바도르: 당연하지만 협력 의뢰라 보상은 적을게다.");
				
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0054", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0055(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 1000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 1000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0055", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("필립에게 달걀 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1063, 89, 1276");
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0056(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("새벽 사무소")) {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 5000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 5000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0056", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("쌍화차를 배달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1072, 62, 1145"); //오스카
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0057(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0057", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0057", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0058(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0058", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0058", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0059(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0059", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0059", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0060(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0060", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0060", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0061(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0061", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0061", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0062(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 사냥은 즐거웠는가?");
				
				player.setLevel(player.getLevel() + 90000);
				giveExp(player, 55);
				player.sendMessage(ChatColor.GOLD + "[System] 90000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "오스카: 사냥은 즐거웠는가?");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0062", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0063(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0063", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0063", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0064(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0064", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0064", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0065(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0065", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0065", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0066(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0066", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0066", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0067(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0067", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0067", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0068(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 보수의 일부는 새벽 사무소로 갔을게다.");
				
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0068", Criteria.DUMMY, ChatColor.GOLD + "[새벽 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0069(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.sendMessage(ChatColor.WHITE + "오스카: 소풍은 재미있었는가?");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "오스카: 소풍은 재미있었는가?");
				
				player.setLevel(player.getLevel() + 35000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 35000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0069", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("외곽의 유적 조사");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0070(Player player, int num, boolean start) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("쐐기 사무소")) {
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0070", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도시 악몽급 이상 뒤틀림 조사");
			score.setScore(1);
			Score score2 = obj.getScore("(" + num + "/5)");
			score2.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0070", Criteria.DUMMY, ChatColor.GOLD + "[쐐기 사무소의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도시 악몽급 이상 뒤틀림 조사");
			score.setScore(1);
			Score score2 = obj.getScore("(" + num + "/5)");
			score2.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0071(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 아이템 주기
			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack item = chest.getInventory().getItem(10);
			player.getInventory().addItem(item);
			
			q0071_1(player, 0, true);

			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0071", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("지팡이 사무소로 가기");
		score.setScore(2);
		Score score2 = obj.getScore("-1119, 181.5, 1455"); //네모
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0071_1(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 3);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0071_1", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("알록에게 물건 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1011, 67, 1174"); //알록
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0072(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.sendMessage(ChatColor.WHITE + "알록: 영상은 잘 나왔어.");
				
				player.setLevel(player.getLevel() + 150000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 150000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "알록: 영상은 잘 나왔어.");
				
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0072", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0073(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.sendMessage(ChatColor.WHITE + "알록: 쭉 지켜봤는데, 잘 싸우더라.");
				
				player.setLevel(player.getLevel() + 170000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 170000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "알록: 쭉 지켜봤는데, 잘 싸우더라.");
				
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 10);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0073", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("외곽의 유적 조사");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0074(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0074", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("리웨이에게 장치 부착하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1106, 71, 1176"); //리웨이
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0075(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0075", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("필립에게 장치 부착하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1044, 94, 1253"); //필립
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0076(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시선 사무소")) {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "알록: 신호 양호. 임무 완료다.");
				
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0076", Criteria.DUMMY, ChatColor.GOLD + "[시선 사무소의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("오스카에게 장치 부착하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1072, 62, 1145"); //오스카
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0077(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0077", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0077", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0078(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0078", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0078", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0079(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0079", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0079", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0080(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0080", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0080", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0081(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0081", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0081", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0082(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0082", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0083(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0083", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("6과에 지시서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1105, 85, 1277"); //월터
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0084(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 5과")) {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 10000);
				giveExp(player, 5);
				player.sendMessage(ChatColor.GOLD + "[System] 10000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0084", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("3과에 보고서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1081, 88, 1230"); //아즈다르코
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0085(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 12);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0085", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0085", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0086(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 12);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0086", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0086", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0087(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 12);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0087", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0087", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0088(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 12);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0088", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0088", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0089(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 70000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 70000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 12);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0089", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0038", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0090(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 5과")) {
				player.setLevel(player.getLevel() + 90000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 90000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0090", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0091(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0091", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0091", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0092(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0092", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0092", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0093(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0093", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0093", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0094(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0094", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0094", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0095(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 50000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 50000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 15000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 15000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0095", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0095", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0096(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 55);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 20000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 20000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0096", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0097(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("리우 협회 5과")) {
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 70);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 25000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 25000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0097", Criteria.DUMMY, ChatColor.GOLD + "[리우 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 악몽급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0098(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 7);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1206, 62, 1449, -1292, 62, 1307).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0098", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0098", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 녹슨 사슬파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0099(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 7);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0099", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0099", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 흑운회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0100(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 7);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0100", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0100", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 사육제 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0101(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 7);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0101", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0101", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 철공회 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0102(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 20);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 7);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0102", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0102", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 하바네로파 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0103(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0103", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 질병급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0104(Player player, int num, boolean start) {
		if(num>=5) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0104", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도시 악몽급 이상 뒤틀림 조사");
			score.setScore(1);
			Score score2 = obj.getScore("(" + num + "/5)");
			score2.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0104", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("도시 악몽급 이상 뒤틀림 조사");
			score.setScore(1);
			Score score2 = obj.getScore("(" + num + "/5)");
			score2.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0105(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 40);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 40000);
				giveExp(player, 13);
				player.sendMessage(ChatColor.GOLD + "[System] 40000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0105", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("외곽의 유적 조사");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0106(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("세븐 협회 5과")) {
				player.sendMessage(ChatColor.WHITE + "가논돌프: 이번에도 실패인건가…");
				
				player.setLevel(player.getLevel() + 150000);
				giveExp(player, 25);
				player.sendMessage(ChatColor.GOLD + "[System] 150000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "가논돌프: 이번에도 실패인건가…");
				
				player.setLevel(player.getLevel() + 60000);
				giveExp(player, 8);
				player.sendMessage(ChatColor.GOLD + "[System] 60000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0106", Criteria.DUMMY, ChatColor.GOLD + "[세븐 협회 5과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("워프열차의 비밀 밝히기");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0107(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 200000);
				giveExp(player, 100);
				player.sendMessage(ChatColor.GOLD + "[System] 200000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0107", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("엄지 솔다토 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0107", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("엄지 솔다토 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0108(Player player, int num, boolean start) {
		if(num>=2) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 200000);
				giveExp(player, 100);
				player.sendMessage(ChatColor.GOLD + "[System] 200000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0108", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("검지 수행자 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0108", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("검지 수행자 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/2)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0109(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 200000);
				giveExp(player, 100);
				player.sendMessage(ChatColor.GOLD + "[System] 200000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0109", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("웃는 얼굴들 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0109", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("웃는 얼굴들 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0110(Player player, int num, boolean start) {
		if(num>=3) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 200000);
				giveExp(player, 100);
				player.sendMessage(ChatColor.GOLD + "[System] 200000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 65000);
				giveExp(player, 35);
				player.sendMessage(ChatColor.GOLD + "[System] 65000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0110", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("마리아치 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0110", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("마리아치 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/3)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0111(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 300000);
				giveExp(player, 130);
				player.sendMessage(ChatColor.GOLD + "[System] 300000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0111", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 악몽급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0112(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0112", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("2과에 보고서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1040, 88, 1285"); //람포링쿠스
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0113(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0113", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("5과에 지시서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1106, 95, 1297"); //아누로그나투스
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0114(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("츠바이 협회 3과")) {
				player.setLevel(player.getLevel() + 100000);
				giveExp(player, 50);
				player.sendMessage(ChatColor.GOLD + "[System] 100000안을 획득했다.");
			} else {
				player.setLevel(player.getLevel() + 30000);
				giveExp(player, 15);
				player.sendMessage(ChatColor.GOLD + "[System] 30000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0114", Criteria.DUMMY, ChatColor.GOLD + "[츠바이 협회 3과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("6과에 지시서 전달하기");
		score.setScore(2);
		Score score2 = obj.getScore("-1105, 85, 1277"); //월터
		score2.setScore(1);
		Score score3 = obj.getScore("(" + num + "/1)");
		score3.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void q0115(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 3과")) {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 250000);
				giveExp(player, 80);
				player.sendMessage(ChatColor.GOLD + "[System] 250000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -1001, 62, 1182, -1119, 62, 1092).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0115", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 엄지 솔다토 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0115", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 엄지 솔다토 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
		
	}
	
	public void q0116(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 3과")) {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 250000);
				giveExp(player, 80);
				player.sendMessage(ChatColor.GOLD + "[System] 250000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -919, 62, 1455, -985, 62, 1349).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0116", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 검지 수행자 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0116", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 검지 수행자 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0117(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 3과")) {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 250000);
				giveExp(player, 80);
				player.sendMessage(ChatColor.GOLD + "[System] 250000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0117", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 웃는 얼굴들 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0117", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 웃는 얼굴들 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0118(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 3과")) {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 250000);
				giveExp(player, 80);
				player.sendMessage(ChatColor.GOLD + "[System] 250000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 80000);
				giveExp(player, 30);
				player.sendMessage(ChatColor.GOLD + "[System] 80000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		if(start) {
			String[] loc = getLocation(player, -964, 62, 1348, -1034, 62, 1200).split("/");
			
			//퀘스트 엔티티 소환
			Illusioner illusioner = (Illusioner) player.getWorld().spawnEntity(new Location(player.getWorld(), Integer.parseInt(loc[0])-0.5, Integer.parseInt(loc[1]), Integer.parseInt(loc[2])+0.5, rnd.nextInt(360), 0), EntityType.ILLUSIONER);
			illusioner.setCustomName(ChatColor.WHITE + "" + player.getDisplayName() + "의 목표물");
			illusioner.setCustomNameVisible(true);
			illusioner.setAI(false);
			illusioner.setInvulnerable(true);
			illusioner.setCollidable(false);
			illusioner.setPersistent(true); 
			illusioner.setSilent(true); 
			illusioner.setRemoveWhenFarAway(false);
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
			qo.put(player, illusioner);
			
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0118", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 마리아치 처리");
			score.setScore(2);
			Score score2 = obj.getScore(loc[0] + ", " + loc[1] + ", " + loc[2]);
			score2.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
		} else {
			//퀘스트 스코어보드에 적용
			ScoreboardManager manager = Bukkit.getScoreboardManager();
			Scoreboard board = manager.getNewScoreboard();
			Objective obj = board.registerNewObjective("q0118", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
			obj.setDisplaySlot(DisplaySlot.SIDEBAR);
			Score score = obj.getScore("[정예] 마리아치 처리");
			score.setScore(1);
			Score score3 = obj.getScore("(" + num + "/1)");
			score3.setScore(0);
			player.setScoreboard(board);
		}
	}
	
	public void q0119(Player player, int num, boolean start) {
		if(num>=1) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			String office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
			if(office.equals("시 협회 3과")) {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 400000);
				giveExp(player, 140);
				player.sendMessage(ChatColor.GOLD + "[System] 400000안을 획득했다.");
			} else {
				player.sendMessage(ChatColor.WHITE + "말라쉬: 아아… 모든 것은 지령의 뜻대로…");
				
				player.setLevel(player.getLevel() + 130000);
				giveExp(player, 45);
				player.sendMessage(ChatColor.GOLD + "[System] 130000안을 획득했다.");
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("q0119", Criteria.DUMMY, ChatColor.GOLD + "[시 협회 3과의 의뢰]");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("도시 악몽급 이상 뒤틀림 사냥");
		score.setScore(1);
		Score score2 = obj.getScore("(" + num + "/1)");
		score2.setScore(0);
		player.setScoreboard(board);
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	
	
	
	public void uq9(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq8(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq7(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq6(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq5(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq4(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq3(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq2(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void uq1(Player player, int num, boolean start) {
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
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_HURT, 1.0f, 1.0f);
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			}
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
		
		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
	public void giveExp(Player player, int num) {
		//인격에 따른 데미지 증폭 계산
		try {
			double personality = 0;
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
			
			num = (int) Math.round(num * ((personality+10) / 10));
		} catch(Exception e2) {
			
		}
		
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
		
		player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 "+ num +"만큼 증가했다.");
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
