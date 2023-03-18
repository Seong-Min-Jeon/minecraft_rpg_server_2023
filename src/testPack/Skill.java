package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class Skill {
	
	private int sleep = 0;
	Player player = null;
	World world = null;
	private static Map<Player, Integer> timer = new HashMap<>();
	private static Map<Player, Integer> timer2 = new HashMap<>();
	
	public void effect(Player player, String rot) {
		
		boolean bool = false;
		
		try {
			if(!player.isSwimming()) {
				String name = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
				world = player.getWorld();
				
				if(name.equals("평범한 해결사")) {
					if(rot.equals("L")) {
						bool = reload(player, 500);
						if (bool) {
							sendPacket(player, "가벼운 공격");
							skill1(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1000);
						if (bool) {
							sendPacket(player, "가벼운 방어");
							skill2(player);
						}
					}
				}
				
			}
		} catch(Exception e) {
			
		}
	}
	
	public void skill1(Player player) {
		Arrow arrow = player.launchProjectile(Arrow.class);
		arrow.setShooter(player);
		arrow.setVelocity(player.getLocation().getDirection().multiply(0.3f));		
		world.spawnParticle(Particle.SWEEP_ATTACK, arrow.getLocation(), 1);
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 1.0f);
		
		ThreadSkill t = new ThreadSkill(player.getUniqueId());
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			int time = 0;
			
			@Override
			public void run() {
				if (!t.hasID()) {
					t.setID(sleep);
				}
			
				if(time>=5) {
					List<Entity> entitylist = arrow.getNearbyEntities(1,1,1);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							nearMob.damage(2);
						}
					}
					t.endTask(); 
					t.removeID();
				} 
			}						
			
		}, 0, 1);
	}
	
	public void skill2(Player player) {
		player.setNoDamageTicks(500);
		world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
	}
	
	public boolean reload(Player playerArg, int reload) {
		player = playerArg;
		if(timer.containsKey(player)) {
			Integer lastTime = timer.get(player);
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		if(Math.abs(time-lastTime) > reload) {
	 			timer.remove(player);
		 		timer.put(player, time);
		 		return true;
	 		}			
		} else {
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		timer.put(player, time);
	 		return true;
		}
		return false;
	}
	
	public boolean reload2(Player playerArg, int reload) {
		player = playerArg;
		if(timer2.containsKey(player)) {
			Integer lastTime = timer2.get(player);
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		if(Math.abs(time-lastTime) > reload) {
	 			timer2.remove(player);
		 		timer2.put(player, time);
		 		return true;
	 		}			
		} else {
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		timer2.put(player, time);
	 		return true;
		}
		return false;
	}
	
	public void sendPacket(Player player, String message) {
		try {
			TextComponent tc = new TextComponent(message);
			player.spigot().sendMessage(ChatMessageType.ACTION_BAR, tc);
		} catch (Exception e) {

		}
	}
	
}
