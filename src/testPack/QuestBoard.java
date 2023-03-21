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
		Score score = obj.getScore("사라진 고양이를 찾아줘");
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
		Score score = obj.getScore("사라진 토끼를 찾아줘");
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
		Score score = obj.getScore("사라진 강아지를 찾아줘");
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
	
	public void giveExp(Player player, int num) {
		try {
			ItemStack item = player.getInventory().getItem(8);
			ItemMeta itemIM = item.getItemMeta();
			ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
			String exp = ary.get(1).split("\\[")[1].split("/")[0];
			String maxExp = ary.get(1).split("\\]")[0].split("/")[1];
			int newExp = Integer.parseInt(exp) + num;
			if (newExp > Integer.parseInt(maxExp)) {newExp = Integer.parseInt(maxExp);}
			ary.set(1, ChatColor.GRAY + "등급: [" + String.valueOf(newExp) + "/" + maxExp + "]");
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
