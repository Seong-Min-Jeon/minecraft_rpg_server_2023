package testPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class BGM {

	//ArrayList<Player> battle = new ArrayList<>();
	HashMap<Player, Integer> battle = new HashMap<>();
	
	ArrayList<String> bgm = new ArrayList<>(Arrays.asList("ENTITY_SKELETON_HORSE_AMBIENT", "ENTITY_PARROT_DEATH", "ENTITY_PARROT_EAT", "ENTITY_PARROT_FLY",
															"ENTITY_PARROT_HURT", "ENTITY_PARROT_AMBIENT", "ENTITY_PARROT_STEP", "ENTITY_CAMEL_AMBIENT",
															"ENTITY_CAMEL_DASH", "ENTITY_CAMEL_DASH_READY", "ENTITY_CAMEL_DEATH", "ENTITY_CAMEL_EAT",
															"ENTITY_CAMEL_HURT"));
	
	public BGM() {}
	
	public BGM(Player player, String b) {
		if(b.equals("로비")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_AMBIENT, 1.0f, 1.0f);
		} else if(b.equals("메인")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DASH, 1.0f, 1.0f);
		} else if(b.equals("전투")) {
			if(!battle.containsKey(player)) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(Sound.valueOf(bgm.get(i)));
				}
				player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DASH_READY, 1.0f, 1.0f);
				
				battle.put(player, 0);
				player.setTicksLived(1);
			}
		} else if(b.equals("폭주하는 황소")) {
			if(!battle.containsKey(player) || battle.get(player) < 10) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(Sound.valueOf(bgm.get(i)));
				}
				player.playSound(player.getLocation(), Sound.ENTITY_PARROT_EAT, 1.0f, 1.0f);
				
				battle.put(player, 10);
				player.setTicksLived(1);
			}
		} else if(b.equals("우는 영혼들의 산")) {
			if(!battle.containsKey(player) || battle.get(player) < 10) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(Sound.valueOf(bgm.get(i)));
				}
				player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_DEATH, 1.0f, 1.0f);
				
				battle.put(player, 10);
				player.setTicksLived(1);
			}
		} else if(b.equals("도망쳐")) {
			if(!battle.containsKey(player) || battle.get(player) < 11) {
				for(int i = 0 ; i < bgm.size() ; i++) {
					player.stopSound(Sound.valueOf(bgm.get(i)));
				}
				player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_EAT, 1.0f, 1.0f);
				
				battle.put(player, 11);
				player.setTicksLived(1);
			}
		} else if(b.equals("유적1")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_AMBIENT, 1.0f, 1.0f);
		} else if(b.equals("유적2")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PARROT_DEATH, 1.0f, 1.0f);
		} else if(b.equals("유적3")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_CAMEL_HURT, 1.0f, 1.0f);
		} else if(b.equals("유적4")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PARROT_FLY, 1.0f, 1.0f);
		} else if(b.equals("유적5")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PARROT_HURT, 1.0f, 1.0f);
		} else if(b.equals("유적6")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PARROT_AMBIENT, 1.0f, 1.0f);
		} else if(b.equals("유적7")) {
			battle.remove(player);
			
			for(int i = 0 ; i < bgm.size() ; i++) {
				player.stopSound(Sound.valueOf(bgm.get(i)));
			}
			player.playSound(player.getLocation(), Sound.ENTITY_PARROT_STEP, 1.0f, 1.0f);
		}
	}
	
	public boolean inBattle(Player player) {
		return battle.containsKey(player);
	}
}
