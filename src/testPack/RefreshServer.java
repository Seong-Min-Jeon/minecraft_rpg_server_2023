package testPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RefreshServer {

	int sleep;
	private int taskID;
	Random rnd = new Random();
	World world;
	int change = 0;
	
	private static ArrayList<Location> ary = new ArrayList<>();
	private static ArrayList<Location> ary2 = new ArrayList<>();
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
		ary2.add(loc);
		loc = new Location(world, -926, 63, 1435);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -976, 63, 1205);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1113, 63, 1185);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1155, 65, 1188);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1215, 63, 1337);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1266, 63, 1388);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1291, 63, 1429);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1286, 63, 1330);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1177, 126, 1346);
		ary.add(loc);
		loc = new Location(world, -1025, 63, 1252);
		ary.add(loc);
		ary2.add(loc);
		loc = new Location(world, -1081, 63, 1136);
		ary.add(loc);
		ary2.add(loc);
		
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
						List<Entity> list2 = ent.getNearbyEntities(15, 15, 15);
						for(Entity ent2 : list2) {
							if(ent2 instanceof Player) {
								cnt++;
							}
						}
						if(cnt == 0) {
							try {
								if(ent.getType() == EntityType.DROWNED) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIE_VILLAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.STRAY) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER_SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.EVOKER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PHANTOM) {
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
									
									if(as.isSmall()) {
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
						
						if(ent.getType() == EntityType.SKELETON || ent.getType() == EntityType.ZOMBIE
								 || ent.getType() == EntityType.SPIDER || ent.getType() == EntityType.GUARDIAN || ent.getType() == EntityType.VINDICATOR || ent.getType() == EntityType.SLIME
								 || ent.getType() == EntityType.SILVERFISH || ent.getType() == EntityType.WITCH || ent.getType() == EntityType.CAVE_SPIDER || ent.getType() == EntityType.ENDERMAN
								 || ent.getType() == EntityType.ELDER_GUARDIAN || ent.getType() == EntityType.MAGMA_CUBE || ent.getType() == EntityType.BLAZE || ent.getType() == EntityType.ENDERMITE
								 || ent.getType() == EntityType.RAVAGER || ent.getType() == EntityType.GHAST || ent.getType() == EntityType.WARDEN) {
							if(ent.getTicksLived() > 6000) {
								ent.remove();
							}
						}
					}
					
					for(Player player : Bukkit.getOnlinePlayers()) {
						if(player.getTicksLived() > 600 && new BGM().inBattle(player)) {
							new BGM(player, "메인");
						}
					}
					
					if(world.getTime() >= 20400 && world.getTime() < 21000) {
						for(Player player : Bukkit.getOnlinePlayers()) {
							player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "뒷골목의 밤이 다가옵니다.");
						}
					}
					
					if(world.getTime() > 23000 && world.getTime() <= 23600) {
						for(Player player : Bukkit.getOnlinePlayers()) {
							player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "뒷골목의 밤이 지나갑니다.");
						}
					}
					
				}
				
				//뒤틀림&조직원
				if(time % 1200 == 0) {
					long dayTime = System.currentTimeMillis(); 
			 		SimpleDateFormat hms = new SimpleDateFormat("mmss");
			 		String strTime = hms.format(new Date(dayTime));
			 		Integer t = Integer.parseInt(strTime);
			 		
			 		//뒤틀림 소환
			 		if((t > 2960 && t < 3100) || (t > 5960 && t < 100)) {
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
			 				
			 				distorted.add(ent);
			 			}
			 			
			 			for(Player player : Bukkit.getOnlinePlayers()) {
			 				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "각지에서 뒤틀림이 출현했다.");
			 				player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER, 1.0f, 1.0f);
			 			}
			 		}
			 		
			 		//조직원 소환
			 		if((t > 1460 && t < 1600) || (t > 4460 && t < 4600)) {
			 			for(Location loc : ary2) {
			 				
			 				Zombie entity = (Zombie) world.spawnEntity(loc, EntityType.ZOMBIE);
			 				
			 				int tmp = rnd.nextInt(15);
			 				if(tmp == 0) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();
								
			 					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(80);
								entity.setHealth(80);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(4);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(84,75,75));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(84,75,75));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(84,75,75));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1, false, false));
			 				} else if(tmp == 1) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

			 					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(60);
								entity.setHealth(60);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(5);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(30,30,30));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(30,30,30));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(30,30,30));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 2) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(50);
								entity.setHealth(50);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(6);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(160,80,80));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(160,80,80));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(160,80,80));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
			 				} else if(tmp == 3) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(7);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(100,100,20));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(100,100,20));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(100,100,20));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 4) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(60);
								entity.setHealth(60);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.BIRCH_LOG);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(8);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(200,200,200));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(200,200,200));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(200,200,200));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 5) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(90);
								entity.setHealth(90);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(14);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(30,30,30));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(30,30,30));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(30,30,30));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
			 				} else if(tmp == 6) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 와카슈");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(75);
								entity.setHealth(75);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(15);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(0,0,0));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(0,0,0));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(0,0,0));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 7) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 재단사");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(110);
								entity.setHealth(110);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment sub = entity.getEquipment();
								ItemStack subItem = new ItemStack(Material.STONE_BRICK_SLAB);
								sub.setItemInOffHand(subItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(16);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(0,0,0));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(0,0,0));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(0,0,0));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 8) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(100);
								entity.setHealth(100);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(17);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(255,232,188));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(160,220,160));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(90,150,90));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 9) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(90);
								entity.setHealth(90);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(18);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(255,150,150));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(255,150,150));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(255,150,150));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
			 				} else if(tmp == 10) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "엄지 솔다토");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(160);
								entity.setHealth(160);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.BRAIN_CORAL_BLOCK);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(19);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(150,0,0));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(10,10,10));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(0,0,0));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
			 				} else if(tmp == 11) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "검지 수행자");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(140);
								entity.setHealth(140);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(20);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(255,255,255));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(255,255,255));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(255,255,255));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
			 				} else if(tmp == 12) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "웃는 얼굴들");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(180);
								entity.setHealth(180);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(21);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(50,0,0));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(50,0,0));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(20,20,20));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6, false, false));
			 				} else if(tmp == 13) {
			 					Location chestLoc = new Location(world, -1147, 166, 1467);
								Block block = chestLoc.getBlock();
								Chest chest = (Chest) block.getState();

								entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 조직원");
								entity.setCustomNameVisible(true);
								entity.setPersistent(true);
								entity.setRemoveWhenFarAway(false);
								entity.setMaxHealth(150);
								entity.setHealth(150);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.OBSIDIAN);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment sub = entity.getEquipment();
								ItemStack subItem = new ItemStack(Material.OBSIDIAN);
								sub.setItemInOffHand(subItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = chest.getInventory().getItem(22);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
								LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
								chestmeta.setColor(Color.fromRGB(150,75,0));
								chestplateItem.setItemMeta(chestmeta);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
								LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
								leggingsmeta.setColor(Color.fromRGB(10,10,10));
								leggingsItem.setItemMeta(leggingsmeta);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
								LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
								bootsmeta.setColor(Color.fromRGB(0,0,0));
								bootsItem.setItemMeta(bootsmeta);
								boots.setBoots(bootsItem);
								entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5, false, false));
								entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
			 				}
			 			}
			 			
//			 			for(Player player : Bukkit.getOnlinePlayers()) {
//			 				player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "각지에서 뒤틀림이 출현했다.");
//			 				player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_GALLOP_WATER, 1.0f, 1.0f);
//			 			}
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
