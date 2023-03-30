package testPack;

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
	
	private Message msg = new Message();
	Random rnd = new Random();
	
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
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
			}
			
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "새로운 초대장을 얻었다.", 20, 40, 20);
			
			//승급 완료 사운드 따로 넣기
			return;
		}
		//퀘스트 스코어보드에 적용
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard board = manager.getNewScoreboard();
		Objective obj = board.registerNewObjective("uq9", Criteria.DUMMY, ChatColor.GOLD + "9급 해결사의 승급");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		Score score = obj.getScore("쥐 5마리 사냥");
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
