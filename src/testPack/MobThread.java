package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.util.Vector;

public class MobThread implements Listener{

	private int taskID;
	private Player player = null;
	int sleep;
	Random rnd = new Random();

	public MobThread(Player player) {
		
		this.player = player;

		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;

			@Override
			public void run() {

				Location loc = player.getLocation();
				
				if(!player.isOnline()) {
					Bukkit.getScheduler().cancelTask(sleep);
				}
				
				if(loc.getBlock().getType() != Material.WATER) {
					
					// 1분
					if (time % 1200 == 1190) {
						
						// 주변에 몹이 많은가
						Boolean less = true;
						int cnt = 0;
						List<Entity> list = player.getNearbyEntities(10, 10, 10);
						for(Entity ent : list) {
							if(ent instanceof Monster) {
								cnt++;
							}
						}
						if(cnt > 10) {
							less = false;
						}
						
						/*
						// 몹 스폰이 안되는 지형인가
						Boolean edge = false;
						if((loc.clone().add(1, -2, 0).getBlock().getType() != Material.AIR) && (loc.clone().add(-1, -2, 0).getBlock().getType() != Material.AIR)
								&& (loc.clone().add(0, -2, 1).getBlock().getType() != Material.AIR) && (loc.clone().add(0, -2, -1).getBlock().getType() != Material.AIR)) {
							edge = true;
						} else if(loc.clone().add(0, -1, 0).getBlock().getType() == Material.AIR) {
							if(loc.clone().add(0, -2, 0).getBlock().getType() != Material.AIR) {
								edge = true;
							}
						}
						*/
						
						Boolean edge = true;
						
						if(edge && less && !player.isFlying()) {
							if (loc.getX() <= -884 && loc.getY() <= 79 && loc.getZ() <= 1599 && 
									loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074) {
								slum(player, loc);
								slum(player, loc);
								slum(player, loc);
							}
						}
					} 
					
					if(time >= 4800) {
						time = 0;
					}
					
					time++;
					
				}
				
			}

		}, 0, 1);
	}

	public void slum(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -884 && loc.getY() <= 79 && loc.getZ() <= 1599 && 
				loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074)) {
			return;
		}
		if (player.getWorld().getTime() >= 21000 && player.getWorld().getTime() <= 23000) {
			IronGolem golem = (IronGolem) loc.getWorld().spawnEntity(loc, EntityType.IRON_GOLEM);
			golem.setTarget(player);
			player.setNoDamageTicks(20);
			
			int t = (int) player.getWorld().getTime();
			final int removeTime = 23000 - t;
			
			taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

				int time = 0;
				ThreadSweeper td = new ThreadSweeper(player.getUniqueId());

				@Override
				public void run() {
					if (!td.hasID()) {
						td.setID(taskID);
					}

					if (time >= removeTime && golem.getTarget() == null) {
						golem.remove();
						
						td.endTask();
						td.removeID();
						return;
					}

					time++;
				}

			}, 0, 1);
			
		} else {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public Location location(Location loc) {
		int x = rnd.nextInt(10) - 5;
		int z = rnd.nextInt(10) - 5;
		loc.add(x, 0, z);
		loc.add(0, 1, 0);
		return loc;
	}

}