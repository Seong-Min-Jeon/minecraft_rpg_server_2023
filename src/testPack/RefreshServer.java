package testPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;

public class RefreshServer {

	int sleep;
	private int taskID;
	Random rnd = new Random();
	World world;
	int change = 0;
	
	private static ArrayList<Location> ary = new ArrayList<>();
	private static ArrayList<Entity> distorted = new ArrayList<>();
	
	public RefreshServer() {
		
		world = Bukkit.getWorld("world");
		
		Location loc = new Location(world, -1218, 176, 1473);
		ary.add(loc);
		loc = new Location(world, -1138, 145, 1390);
		ary.add(loc);
		loc = new Location(world, -1177, 146, 1356);
		ary.add(loc);
		loc = new Location(world, -1032, 137, 1381);
		ary.add(loc);
		loc = new Location(world, -1075, 119, 1328);
		ary.add(loc);
		loc = new Location(world, -1111, 102, 1358);
		ary.add(loc);
		loc = new Location(world, -1064, 92, 1327);
		ary.add(loc);
		loc = new Location(world, -1027, 81, 1342);
		ary.add(loc);
		loc = new Location(world, -954, 63, 1320);
		ary.add(loc);
		loc = new Location(world, -926, 63, 1435);
		ary.add(loc);
		loc = new Location(world, -976, 63, 1205);
		ary.add(loc);
		loc = new Location(world, -1113, 63, 1185);
		ary.add(loc);
		loc = new Location(world, -1155, 65, 1188);
		ary.add(loc);
		loc = new Location(world, -1215, 63, 1337);
		ary.add(loc);
		loc = new Location(world, -1266, 63, 1388);
		ary.add(loc);
		loc = new Location(world, -1291, 63, 1429);
		ary.add(loc);
		loc = new Location(world, -1286, 63, 1330);
		ary.add(loc);
		loc = new Location(world, -1177, 126, 1346);
		ary.add(loc);
		loc = new Location(world, -1025, 63, 1252);
		ary.add(loc);
		loc = new Location(world, -1081, 63, 1136);
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			int time = 0;
			
			@Override
			public void run() {
				
				// 20t = 1s, 600t = 30s
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
								if(ent.getType() == EntityType.WARDEN) {
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
				
				//뒤틀림
				if(time % 1200 == 0) {
					long dayTime = System.currentTimeMillis(); 
			 		SimpleDateFormat hms = new SimpleDateFormat("mmss");
			 		String strTime = hms.format(new Date(dayTime));
			 		Integer time = Integer.parseInt(strTime);
			 		
			 		//뒤틀림 소환
			 		if(time > 2960 && time < 3100) {
			 			for(Location loc : ary) {
			 				int tmp = rnd.nextInt(15);
			 				Entity ent = null;
			 				if(tmp == 0) {ent = world.spawnEntity(loc, EntityType.SPIDER);}
			 				else if(tmp == 1) {ent = world.spawnEntity(loc, EntityType.GUARDIAN);}
			 				else if(tmp == 2) {ent = world.spawnEntity(loc, EntityType.VINDICATOR);}
			 				else if(tmp == 3) {ent = world.spawnEntity(loc, EntityType.SLIME); ((Slime) ent).setSize(4);}
			 				else if(tmp == 4) {ent = world.spawnEntity(loc, EntityType.SILVERFISH);}
			 				else if(tmp == 5) {ent = world.spawnEntity(loc, EntityType.WITCH);}
			 				else if(tmp == 6) {ent = world.spawnEntity(loc, EntityType.CAVE_SPIDER);}
			 				else if(tmp == 7) {ent = world.spawnEntity(loc, EntityType.ENDERMAN);}
			 				else if(tmp == 8) {ent = world.spawnEntity(loc, EntityType.ELDER_GUARDIAN);}
			 				else if(tmp == 9) {ent = world.spawnEntity(loc, EntityType.MAGMA_CUBE);}
			 				else if(tmp == 10) {ent = world.spawnEntity(loc, EntityType.BLAZE);}
			 				else if(tmp == 11) {ent = world.spawnEntity(loc, EntityType.ENDERMITE);}
			 				else if(tmp == 12) {ent = world.spawnEntity(loc, EntityType.RAVAGER);}
			 				else if(tmp == 13) {ent = world.spawnEntity(loc, EntityType.GHAST);}
			 				else if(tmp == 14) {ent = world.spawnEntity(loc, EntityType.WARDEN);}
			 			}
			 			
			 			for(Player player : Bukkit.getOnlinePlayers()) {
			 				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "각지에서 뒤틀림이 출현했다.");
			 				player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER, 1.0f, 1.0f);
			 			}
			 		}
			 		
			 		//뒤틀림 제거
			 		if(time > 3460 && time < 3600) {
			 			for(Entity ent : distorted) {
			 				distorted.remove(ent);
			 				ent.remove();
			 			}
			 		}
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
