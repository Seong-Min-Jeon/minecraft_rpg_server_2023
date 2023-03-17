package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class StepAndRolling {
	
	private int taskID;
	Player player = null;
	private static Map<Player, Integer> timer = new HashMap<>();

	public void effect(Player player) {
		
		boolean bool = false;
		
		if(player.isOnGround() && !player.isSwimming()) {
			bool = reload(player, 1500);
			if (bool) {
				move(player);
			}
		}
		
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
	
	public void move(Player player) {
		
		player.setNoDamageTicks(100);

		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			ThreadRolling td = new ThreadRolling(player.getUniqueId());

			Location loc1 = null;
			Location loc2 = null;

			@Override
			public void run() {
				if (!td.hasID()) {
					td.setID(taskID);
				}

				if (time == 0) {
					loc1 = player.getLocation();
				}

				if (time >= 1) {
					loc2 = player.getLocation();

					double x = loc2.getX() - loc1.getX();
					double z = loc2.getZ() - loc1.getZ();
					x *= 4;
					z *= 4;
					if (x == 0 & z == 0) {
						player.setVelocity(player.getLocation().getDirection().multiply(new Vector(-1, 0, -1)).add(new Vector(0, 0.1, 0)));
					} else {
						player.setVelocity(new Vector(x, 0.1, z));
					}

					td.endTask();
					td.removeID();
					return;
				}

				time++;
			}

		}, 0, 1);

		player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ZOMBIE_VILLAGER_STEP, 1.5f, 1.0f);

	}
	
	
}
