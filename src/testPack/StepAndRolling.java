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
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if(player.isOnGround() && !player.isSwimming()) {
			if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
					|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
					|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
					|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
					|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
					|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
					|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
					|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
					|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
					|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
					|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
					|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
					|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
					|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
					|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
					|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
					|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
					|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
					|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
					|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
					
					|| item.getType() == Material.MUSIC_DISC_11 || item.getType() == Material.MUSIC_DISC_13 || item.getType() == Material.MUSIC_DISC_BLOCKS 
					|| item.getType() == Material.MUSIC_DISC_CAT || item.getType() == Material.MUSIC_DISC_CHIRP || item.getType() == Material.MUSIC_DISC_FAR 
					|| item.getType() == Material.MUSIC_DISC_MALL || item.getType() == Material.MUSIC_DISC_MELLOHI || item.getType() == Material.MUSIC_DISC_PIGSTEP 
					|| item.getType() == Material.MUSIC_DISC_STAL || item.getType() == Material.MUSIC_DISC_STRAD || item.getType() == Material.MUSIC_DISC_WAIT 
					|| item.getType() == Material.MUSIC_DISC_WARD) {
			
				bool = reload(player, 3000);
				if (bool) {
					move(player);
				}

			} else if(item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS || item.getType() == Material.MOSSY_STONE_BRICK_STAIRS 
					|| item.getType() == Material.POLISHED_DIORITE_STAIRS || item.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item.getType() == Material.END_STONE_BRICK_STAIRS 
					|| item.getType() == Material.SMOOTH_SANDSTONE_STAIRS || item.getType() == Material.SMOOTH_QUARTZ_STAIRS || item.getType() == Material.GRANITE_STAIRS) {
						
				bool = reload(player, 2000);
				if (bool) {
					move(player);
				}
				
			} else {
				
				bool = reload(player, 1000);
				if(bool) {
					move(player);
				}
				
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
		
		if (player.getFoodLevel() > 6) {
			player.setFoodLevel(player.getFoodLevel() - 1);
			player.setNoDamageTicks(10);

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
	
	
}
