package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class BGM {

	static HashMap<Player, Integer> battle = new HashMap<>();
	
	static ArrayList<String> bgm = new ArrayList<>(Arrays.asList("ENTITY_SKELETON_HORSE_AMBIENT", "ENTITY_PARROT_DEATH", "ENTITY_PARROT_EAT", "ENTITY_PARROT_FLY",
															"ENTITY_PARROT_HURT", "ENTITY_PARROT_AMBIENT", "ENTITY_PARROT_STEP", "ENTITY_CAMEL_AMBIENT",
															"ENTITY_CAMEL_DASH", "ENTITY_CAMEL_DASH_READY", "ENTITY_CAMEL_DEATH", "ENTITY_CAMEL_EAT",
															"ENTITY_CAMEL_HURT"));
	
	static HashMap<Player, String> now = new HashMap<>();
	
	public BGM() {}
	
	public BGM(Player player, String b) {
		if(b.equals("로비")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			
			if(now.containsKey(player)) {now.remove(player);}
			now.put(player, "로비");
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	if(time == 4980) {
			    		time = 0;
			    	}
			    	
			    	if(time == 0) {
			    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_AMBIENT, 1.0f, 1.0f);
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
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DASH, 1.0f, 1.0f);
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
					player.stopSound(Sound.valueOf(bgm.get(i)));
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
				    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DASH_READY, 1.0f, 1.0f);
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
					player.stopSound(Sound.valueOf(bgm.get(i)));
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
				    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_EAT, 1.0f, 1.0f);
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
					player.stopSound(Sound.valueOf(bgm.get(i)));
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
				    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DEATH, 1.0f, 1.0f);
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
					player.stopSound(Sound.valueOf(bgm.get(i)));
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
				    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_EAT, 1.0f, 1.0f);
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
		} else if(b.equals("유적1")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_AMBIENT, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적1")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적2")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_DEATH, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적2")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적3")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_HURT, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적3")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적4")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_FLY, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적4")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적5")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_HURT, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적5")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적6")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_AMBIENT, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적6")) {
			    			this.cancel();
			    		}
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		} else if(b.equals("유적7")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
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
			    		player.playSound(player.getLocation(), Sound.ENTITY_PARROT_STEP, 1.0f, 1.0f);
			    	}
			    	
			    	if(time % 200 == 0) {
			    		if(!now.get(player).equals("유적7")) {
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
