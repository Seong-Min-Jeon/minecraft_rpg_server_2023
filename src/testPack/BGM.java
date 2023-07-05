package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import oshi.hardware.SoundCard;

public class BGM {

	static HashMap<Player, Integer> battle = new HashMap<>();
	
	static ArrayList<String> bgm = new ArrayList<>(Arrays.asList("bgm.lobby", "bgm.main", "bgm.battle", "bgm.warp",
																"bgm.dungeon1", "bgm.dungeon.boss1", "bgm.dungeon2", "bgm.dungeon.boss2",
																"bgm.dungeon3", "bgm.dungeon.boss3", "bgm.dungeon4", "bgm.dungeon.boss4",
																"bgm.dungeon5", "bgm.dungeon6" , "bgm.dungeon7", "bgm.ravager",
																"bgm.ghast", "bgm.warden"));
	
	static HashMap<Player, String> now = new HashMap<>();
	
	public BGM() {}
	
	public BGM(Player player, String b) {
		if(b.equals("로비")) {
			battle.remove(player);
			
			new BukkitRunnable() {
				int time = 0;

				@Override
				public void run() {

					if (time == 10) {
						for(int i = 0 ; i < bgm.size() ; i++) {
							player.stopSound(bgm.get(i), SoundCategory.RECORDS);
							player.stopSound(SoundCategory.RECORDS);
						}
					}

					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "로비");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 4850) {
			    		time = 0;
			    	}
			    	
			    	if(time == 10) {
			    		player.playSound(player.getLocation(), "bgm.lobby", SoundCategory.RECORDS, 0.6f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("로비")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			
		} else if(b.equals("메인")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "메인");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 8300) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.main", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("메인")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("전투")) {
			if(!battle.containsKey(player)) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(bgm.get(i), SoundCategory.RECORDS);
					player.stopSound(SoundCategory.RECORDS);
				}
				
				if(now.containsKey(player)) {now.remove(player);}
				now.put(player, "전투");
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 3560) {
				    		time = 0;
				    	}
				    	
				    	if(time == 0) {
				    		player.playSound(player.getLocation(), "bgm.battle", SoundCategory.RECORDS, 0.7f, 1.0f);
				    	}
				    	
				    	if(time % 200 == 0) {
				    		if(!now.get(player).equals("전투")) {
				    			this.cancel();
				    		}
				    	}
				    	
						time++;
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				
				battle.put(player, 0);
				player.setTicksLived(1);
			}
		} else if(b.equals("폭주하는 황소")) {
			if(!battle.containsKey(player) || battle.get(player) < 10) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(bgm.get(i), SoundCategory.RECORDS);
					player.stopSound(SoundCategory.RECORDS);
				}
				
				if(now.containsKey(player)) {now.remove(player);}
				now.put(player, "폭주하는 황소");
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 3700) {
				    		time = 0;
				    	}
				    	
				    	if(time == 0) {
				    		player.playSound(player.getLocation(), "bgm.ravager", SoundCategory.RECORDS, 1.0f, 1.0f);
				    	}
				    	
				    	if(time % 200 == 0) {
				    		if(!now.get(player).equals("폭주하는 황소")) {
				    			this.cancel();
				    		}
				    	}
				    	
						time++;
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				
				battle.put(player, 10);
				player.setTicksLived(1);
			}
		} else if(b.equals("우는 영혼들의 산")) {
			if(!battle.containsKey(player) || battle.get(player) < 10) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(bgm.get(i), SoundCategory.RECORDS);
					player.stopSound(SoundCategory.RECORDS);
				}
				
				if(now.containsKey(player)) {now.remove(player);}
				now.put(player, "우는 영혼들의 산");
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 5420) {
				    		time = 0;
				    	}
				    	
				    	if(time == 0) {
				    		player.playSound(player.getLocation(), "bgm.ghast", SoundCategory.RECORDS, 1.0f, 1.0f);
				    	}
				    	
				    	if(time % 200 == 0) {
				    		if(!now.get(player).equals("우는 영혼들의 산")) {
				    			this.cancel();
				    		}
				    	}
				    	
						time++;
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				
				battle.put(player, 10);
				player.setTicksLived(1);
			}
		} else if(b.equals("도망쳐")) {
			if(!battle.containsKey(player) || battle.get(player) < 11) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(bgm.get(i), SoundCategory.RECORDS);
					player.stopSound(SoundCategory.RECORDS);
				}
				
				if(now.containsKey(player)) {now.remove(player);}
				now.put(player, "도망쳐");
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 4520) {
				    		time = 0;
				    	}
				    	
				    	if(time == 0) {
				    		player.playSound(player.getLocation(), "bgm.warden", SoundCategory.RECORDS, 1.0f, 1.0f);
				    	}
				    	
				    	if(time % 200 == 0) {
				    		if(!now.get(player).equals("도망쳐")) {
				    			this.cancel();
				    		}
				    	}
				    	
						time++;
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				
				battle.put(player, 11);
				player.setTicksLived(1);
			}
		} else if(b.equals("유적1")) { //구 숲유적
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적1");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 6900) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon1", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적1")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적2")) { //구 아덴
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적2");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 2700) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon2", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적2")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적3")) { //구 아라크네
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적3");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 7140) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon3", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적3")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적4")) { //구 슬라임
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적4");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 4460) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon4", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적4")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적5")) { //구 하드바다
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적5");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 4120) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon5", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적5")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적6")) { //구 하드요정
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적6");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 3400) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon6", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적6")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적7")) { //구 하드아덴
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적7");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 5880) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon7", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적7")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("워프")) { //워프열차
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "워프");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.warp", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("워프")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적1B")) { //나태 보스
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적1B");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 2100) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon.boss1", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적1B")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적2B")) { //분노 보스
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적2B");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 5800) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon.boss2", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적2B")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적3B")) { //색욕 보스
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적3B");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 5020) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon.boss3", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적3B")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적4B")) { //탐식 보스
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(bgm.get(i), SoundCategory.RECORDS);
				player.stopSound(SoundCategory.RECORDS);
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "유적4B");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 5340) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), "bgm.dungeon.boss4", SoundCategory.RECORDS, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적4B")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		}
	}
	
	public boolean inBattle(Player player) {
		return battle.containsKey(player);
	}
}
