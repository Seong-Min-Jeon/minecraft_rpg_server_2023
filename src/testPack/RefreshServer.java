package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RefreshServer {

	int sleep;
	Random rnd = new Random();
	World world;
	int change = 0;
	
	public RefreshServer() {
		
		world = Bukkit.getWorld("world");
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			int time = 0;
			
			@Override
			public void run() {
				
				// 몹 삭제
				if(time % 600 == 0) {
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						
						int cnt = 0;
						List<Entity> list2 = ent.getNearbyEntities(20, 20, 20);
						for(Entity ent2 : list2) {
							if(ent2 instanceof Player) {
								cnt++;
							}
						}
						if(cnt == 0) {
							try {
								if(ent.getType() == EntityType.ZOMBIE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.DROWNED) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIE_VILLAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SILVERFISH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.STRAY) {
									ent.remove();
								}
								if(ent.getType() == EntityType.RAVAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER_SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITCH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CAVE_SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.MAGMA_CUBE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SLIME) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.EVOKER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMITE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ELDER_GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GHAST) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PHANTOM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.VINDICATOR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.IRON_GOLEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.BLAZE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.POLAR_BEAR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIFIED_PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CREEPER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ARMOR_STAND) {
									ArmorStand as = (ArmorStand) ent;
									if(as.getHelmet().getType() == Material.ANDESITE_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.RED_NETHER_BRICK_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.DIORITE_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.POLISHED_GRANITE_SLAB) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.POLISHED_ANDESITE_STAIRS) {
										ent.remove();
									} else if(as.getItemInHand().getType() == Material.POLISHED_BLACKSTONE_SLAB) {
										ent.remove();
									} else if(as.getItemInHand().getType() == Material.GREEN_CARPET) {
										ent.remove();
									}
								}
								if(ent.getType() == EntityType.DROPPED_ITEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.FIREBALL) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SMALL_FIREBALL) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ARROW) {
									ent.remove();
								}
							} catch(Exception e) {
								
							}
						}
					}
				}
				
				if(time >= 6000) {
					time = 0;
				}
			
				time++;
				
			}						
			
		}, 0, 1);
	}
	
	private Class<?> getNMSClass(String name) {
		try {
	        return Class.forName("net.minecraft.server."
	                + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
}
