package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Llama;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Wither;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Objective;

import de.Herbystar.TTA.TTA_Methods;

public class TPMobSpawn {

	public TPMobSpawn(Player player, Location loc) {

//		System.out.println(loc.toString());
		
		//유적에서 끄거나 유적 클리어
		if(loc.getX() == -1145 && loc.getY() == 81 && loc.getZ() == 1341) {
			player.teleport(new Location(player.getWorld(), -1145, 81.1, 1341));
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "신비한 힘으로 도시에 돌아오게 되었다.", 20, 40, 20);
			new BGM(player, "메인"); //메인 브금 재생
		}
		
		//워프열차 생존
		if(loc.getX() == -1144.5 && loc.getY() == 81 && loc.getZ() == 1341.5) {
			player.teleport(new Location(player.getWorld(), -1144.5, 81.1, 1341.5));
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "분명 열차에 탑승했던 것 같은데…", 20, 40, 20);
			new BGM(player, "메인"); //메인 브금 재생
			
			QuestBoard qb = new QuestBoard();
			if (getQuestName(player).equals("q0106")) {
				int qNum = qb.getNum(player);
				qb.q0106(player, qNum + 1, false);
			}
		}
		
		//부활계 유물 효과
		if(loc.getX() == -1081.5 && loc.getY() == 186 && loc.getZ() == 1451.5) {
			player.teleport(new Location(player.getWorld(), -1081.5, 186.1, 1451.5));
			TTA_Methods.sendTitle(player, null, 20, 40, 20, "죽음의 경계에서 살아남았다.", 20, 40, 20);
			new BGM(player, "메인"); //메인 브금 재생
		}
		
		//유적1 보상방
		if(loc.getX() == 3470.5 && loc.getY() == 52 && loc.getZ() == 3740) {
			player.teleport(new Location(player.getWorld(), 3470.5, 52.1, 3740));
			new BGM(player, "유적1"); //메인 브금 재생
		}
		
		d1_1(player, loc);
		d1_2(player, loc);
		d1_3(player, loc);
		d1_4(player, loc);
		d1_5(player, loc);
		
	}
	
	public void d1_1(Player player, Location loc) {
		// 나태를 벌하는 유적1
		if (loc.getX() == 3464.5 && loc.getY() == 18 && loc.getZ() == 3740) {
			player.teleport(new Location(player.getWorld(), 3464.5, 18.1, 3740));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 30, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3448 15 3734  3480 33 3767
					if (loc2.getX() <= 3480 && loc2.getY() <= 33 && loc2.getZ() <= 3767 
							&& loc2.getX() >= 3448 && loc2.getY() >= 15 && loc2.getZ() >= 3734) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Zombie) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3480 && loc2.getY() <= 33 && loc2.getZ() <= 3767 
								&& loc2.getX() >= 3448 && loc2.getY() >= 15 && loc2.getZ() >= 3734) {
							nearEntity.remove();
						}
					}
				}
			}
			Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			
			Zombie mob1 = (Zombie) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3465, 22, 3751), EntityType.ZOMBIE);
			mob1.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎");
			mob1.setCustomNameVisible(true);
			mob1.setRemoveWhenFarAway(false);
			mob1.setMaxHealth(40);
			mob1.setHealth(40);
			Zombie zombie = (Zombie) mob1;
			zombie.setBaby(false);
			EntityEquipment weapon = mob1.getEquipment();
			ItemStack weaponItem = new ItemStack(Material.AIR);
			weapon.setItemInMainHand(weaponItem);
			EntityEquipment head = mob1.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
			EntityEquipment chestplate = mob1.getEquipment();
			ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
			chestmeta.setColor(Color.fromRGB(50, 200, 50));
			chestplateItem.setItemMeta(chestmeta);
			chestplate.setChestplate(chestplateItem);
			EntityEquipment leggings = mob1.getEquipment();
			ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
			leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
			leggingsItem.setItemMeta(leggingsmeta);
			leggings.setLeggings(leggingsItem);
			EntityEquipment boots = mob1.getEquipment();
			ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
			LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
			bootsmeta.setColor(Color.fromRGB(50, 200, 50));
			bootsItem.setItemMeta(bootsmeta);
			boots.setBoots(bootsItem);
			mob1.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			return;
		}
	}
	
	public void d1_2(Player player, Location loc) {
		// 나태를 벌하는 유적2
		if (loc.getX() == 3464.5 && loc.getY() == 18 && loc.getZ() == 3697) {
			player.teleport(new Location(player.getWorld(), 3464.5, 18.1, 3697));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 30, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3449 15 3692  3480 33 3724
					if (loc2.getX() <= 3480 && loc2.getY() <= 33 && loc2.getZ() <= 3724 
							&& loc2.getX() >= 3449 && loc2.getY() >= 15 && loc2.getZ() >= 3692) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Zombie) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3480 && loc2.getY() <= 33 && loc2.getZ() <= 3724 
								&& loc2.getX() >= 3449 && loc2.getY() >= 15 && loc2.getZ() >= 3692) {
							nearEntity.remove();
						}
					}
				}
			}
			Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			
			Zombie mob1 = (Zombie) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3465, 22, 3707), EntityType.ZOMBIE);
			mob1.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎");
			mob1.setCustomNameVisible(true);
			mob1.setRemoveWhenFarAway(false);
			mob1.setMaxHealth(40);
			mob1.setHealth(40);
			Zombie zombie = (Zombie) mob1;
			zombie.setBaby(false);
			EntityEquipment weapon = mob1.getEquipment();
			ItemStack weaponItem = new ItemStack(Material.AIR);
			weapon.setItemInMainHand(weaponItem);
			EntityEquipment head = mob1.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
			EntityEquipment chestplate = mob1.getEquipment();
			ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
			chestmeta.setColor(Color.fromRGB(50, 200, 50));
			chestplateItem.setItemMeta(chestmeta);
			chestplate.setChestplate(chestplateItem);
			EntityEquipment leggings = mob1.getEquipment();
			ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
			leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
			leggingsItem.setItemMeta(leggingsmeta);
			leggings.setLeggings(leggingsItem);
			EntityEquipment boots = mob1.getEquipment();
			ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
			LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
			bootsmeta.setColor(Color.fromRGB(50, 200, 50));
			bootsItem.setItemMeta(bootsmeta);
			boots.setBoots(bootsItem);
			mob1.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			return;
		}
	}
	
	public void d1_3(Player player, Location loc) {
		// 나태를 벌하는 유적3
		if (loc.getX() == 3503.5 && loc.getY() == 18 && loc.getZ() == 3698) {
			player.teleport(new Location(player.getWorld(), 3503.5, 18.1, 3698));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 30, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3488 15 3692  3519 33 3725
					if (loc2.getX() <= 3519 && loc2.getY() <= 33 && loc2.getZ() <= 3725 
							&& loc2.getX() >= 3488 && loc2.getY() >= 15 && loc2.getZ() >= 3692) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Zombie) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3519 && loc2.getY() <= 33 && loc2.getZ() <= 3725 
								&& loc2.getX() >= 3488 && loc2.getY() >= 15 && loc2.getZ() >= 3692) {
							nearEntity.remove();
						}
					}
				}
			}
			Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			
			Zombie mob1 = (Zombie) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3504, 22, 3709), EntityType.ZOMBIE);
			mob1.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎");
			mob1.setCustomNameVisible(true);
			mob1.setRemoveWhenFarAway(false);
			mob1.setMaxHealth(40);
			mob1.setHealth(40);
			Zombie zombie = (Zombie) mob1;
			zombie.setBaby(false);
			EntityEquipment weapon = mob1.getEquipment();
			ItemStack weaponItem = new ItemStack(Material.AIR);
			weapon.setItemInMainHand(weaponItem);
			EntityEquipment head = mob1.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
			EntityEquipment chestplate = mob1.getEquipment();
			ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
			chestmeta.setColor(Color.fromRGB(50, 200, 50));
			chestplateItem.setItemMeta(chestmeta);
			chestplate.setChestplate(chestplateItem);
			EntityEquipment leggings = mob1.getEquipment();
			ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
			leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
			leggingsItem.setItemMeta(leggingsmeta);
			leggings.setLeggings(leggingsItem);
			EntityEquipment boots = mob1.getEquipment();
			ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
			LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
			bootsmeta.setColor(Color.fromRGB(50, 200, 50));
			bootsItem.setItemMeta(bootsmeta);
			boots.setBoots(bootsItem);
			mob1.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			return;
		}
	}
	
	public void d1_4(Player player, Location loc) {
		// 나태를 벌하는 유적4	
		if (loc.getX() == 3514.5 && loc.getY() == 18 && loc.getZ() == 3745) {
			player.teleport(new Location(player.getWorld(), 3514.5, 18.1, 3745));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 30, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3499 15 3740  3531 33 3773
					if (loc2.getX() <= 3531 && loc2.getY() <= 33 && loc2.getZ() <= 3773 
							&& loc2.getX() >= 3499 && loc2.getY() >= 15 && loc2.getZ() >= 3740) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Zombie) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3531 && loc2.getY() <= 33 && loc2.getZ() <= 3773 
								&& loc2.getX() >= 3499 && loc2.getY() >= 15 && loc2.getZ() >= 3740) {
							nearEntity.remove();
						}
					}
				}
			}
			Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			
			Zombie mob1 = (Zombie) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3515, 22, 3756), EntityType.ZOMBIE);
			mob1.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎");
			mob1.setCustomNameVisible(true);
			mob1.setRemoveWhenFarAway(false);
			mob1.setMaxHealth(40);
			mob1.setHealth(40);
			Zombie zombie = (Zombie) mob1;
			zombie.setBaby(false);
			EntityEquipment weapon = mob1.getEquipment();
			ItemStack weaponItem = new ItemStack(Material.AIR);
			weapon.setItemInMainHand(weaponItem);
			EntityEquipment head = mob1.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
			EntityEquipment chestplate = mob1.getEquipment();
			ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
			chestmeta.setColor(Color.fromRGB(50, 200, 50));
			chestplateItem.setItemMeta(chestmeta);
			chestplate.setChestplate(chestplateItem);
			EntityEquipment leggings = mob1.getEquipment();
			ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
			leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
			leggingsItem.setItemMeta(leggingsmeta);
			leggings.setLeggings(leggingsItem);
			EntityEquipment boots = mob1.getEquipment();
			ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
			LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
			bootsmeta.setColor(Color.fromRGB(50, 200, 50));
			bootsItem.setItemMeta(bootsmeta);
			boots.setBoots(bootsItem);
			mob1.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
			return;
		}
	}
	
	public void d1_5(Player player, Location loc) {
		// 나태를 벌하는 유적5	
		if (loc.getX() == 3562.5 && loc.getY() == 25 && loc.getZ() == 3736.5) {
			player.teleport(new Location(player.getWorld(), 3562.6, 25, 3736.6));
			
			new BGM(player, "유적1B"); //유적1 보스 브금 재생
			
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3587 && loc2.getY() <= 57 && loc2.getZ() <= 3737 
							&& loc2.getX() >= 3537 && loc2.getY() >= 0 && loc2.getZ() >= 3685) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3587 && loc2.getY() <= 57 && loc2.getZ() <= 3737 
								&& loc2.getX() >= 3537 && loc2.getY() >= 0 && loc2.getZ() >= 3685) {
							nearEntity.remove();
						}
					}
				}
			}
			Ghast mob1 = (Ghast) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3562, 30, 3712), EntityType.GHAST);
			mob1.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "나태한 수호령");
			mob1.setCustomNameVisible(true);
			mob1.setRemoveWhenFarAway(false);
			mob1.setMaxHealth(70);
			mob1.setHealth(70);
			return;
		}
	}
	
	public void senmag(Player player, Location loc) {
		// 센 마그 던전 입구
		if (loc.getX() == 3407.63 && loc.getY() == 16 && loc.getZ() == 3823.35) {
			player.teleport(new Location(player.getWorld(), 3407.62, 16, 3823.34));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3390 40 3826  3424 11 3783
					if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
							loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3390 40 3826  3424 11 3783
						if (loc2.getX() <= 3424 && loc2.getY() <= 40 && loc2.getZ() <= 3826 && 
								loc2.getX() >= 3390 && loc2.getY() >= 11 && loc2.getZ() >= 3783) {
							nearEntity.remove();
						}
					}
				}
			}
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3394, 16, 3823), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3394, 16, 3819), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3394, 16, 3815), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3420, 16, 3823), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3420, 16, 3819), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3420, 16, 3815), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3407, 13, 3807), EntityType.ZOMBIE);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3407, 13, 3807), EntityType.ZOMBIE);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3407, 13, 3807), EntityType.ZOMBIE);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3407, 13, 3807), EntityType.ZOMBIE);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3407, 13, 3807), EntityType.ZOMBIE);
			return;
		}
		
		// 복도방
		if (loc.getX() == 3405.5 && loc.getY() == 13 && loc.getZ() == 3766.5) {
			player.teleport(new Location(player.getWorld(), 3405.6, 13, 3766.4));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3415 25 3769  3395 9 3712
					if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
							&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3415 25 3769  3395 9 3712
						if (loc2.getX() <= 3415 && loc2.getY() <= 25 && loc2.getZ() <= 3769 && loc2.getX() >= 3395
								&& loc2.getY() >= 9 && loc2.getZ() >= 3712) {
							nearEntity.remove();
						}
					}
				}
			}
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3405, 13, 3753), EntityType.WITHER_SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3400, 13, 3741), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3410, 13, 3741), EntityType.ZOMBIE);
			return;
		}

		
		// 보스
		if (loc.getX() == 3317.46 && loc.getY() == 13 && loc.getZ() == 3725.51) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "내 손 끝 하나도 못 건드릴걸.");

			player.teleport(new Location(player.getWorld(), 3317.45, 13, 3725.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3336 10 3725  3299 45 3762
					if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
							&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3336 10 3725  3299 45 3762
						if (loc2.getX() <= 3336 && loc2.getY() <= 45 && loc2.getZ() <= 3762 && loc2.getX() >= 3299
								&& loc2.getY() >= 10 && loc2.getZ() >= 3725) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3317, 15, 3744),EntityType.WITHER_SKELETON);
			return;
		}
		

		// 히든 보스
		if (loc.getX() == 3369.59 && loc.getY() == 14 && loc.getZ() == 3803.7) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "좋은 식재료가 제 발로 찾아왔군.");

			player.teleport(new Location(player.getWorld(), 3369.6, 14, 3803.71));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3355 32 3803  3383 11 3766
					if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
							&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3355 32 3803  3383 11 3766
						if (loc2.getX() <= 3383 && loc2.getY() <= 32 && loc2.getZ() <= 3803 && loc2.getX() >= 3355
								&& loc2.getY() >= 11 && loc2.getZ() >= 3766) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3369, 14, 3783), EntityType.ZOMBIE);
			
			return;
		}
	}
	
	public void aracune(Player player, Location loc) {
		// 아라크네
		if (loc.getX() == 750.44 && loc.getY() == 28.44 && loc.getZ() == 591.93) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "씌잇씌익씌이");

			player.teleport(new Location(player.getWorld(), 750.43, 28.44, 591.93));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 776 && loc2.getY() <= 31 && loc2.getZ() <= 605 
							&& loc2.getX() >= 727 && loc2.getY() >= 0 && loc2.getZ() >= 555) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 776 && loc2.getY() <= 31 && loc2.getZ() <= 605 
								&& loc2.getX() >= 727 && loc2.getY() >= 0 && loc2.getZ() >= 555) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 750, 17, 579), EntityType.CAVE_SPIDER);
			
			return;
		}
	}
	
	public void slime(Player player, Location loc) {
		// 슬라임 보스 
		if (loc.getX() == 3740.5 && loc.getY() == 40 && loc.getZ() == 2528.5) {

			player.teleport(new Location(player.getWorld(), 3740.4, 40, 2528.6));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(80, 100, 80);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3819 && loc2.getY() <= 76 && loc2.getZ() <= 2581 
							&& loc2.getX() >= 3740 && loc2.getY() >= 30 && loc2.getZ() >= 2479) {
						num++;
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3819 && loc2.getY() <= 76 && loc2.getZ() <= 2581 
								&& loc2.getX() >= 3740 && loc2.getY() >= 30 && loc2.getZ() >= 2479) {
							nearEntity.remove();
						}
					}
				}
			}

			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3770.5, 40, 2526.5), EntityType.SLIME);
			return;
		}

	}
	
	public void hardSea(Player player, Location loc) {
		// 복도방1
		if (loc.getX() == 3771 && loc.getY() == 72 && loc.getZ() == 3867) {
			player.teleport(new Location(player.getWorld(), 3771, 72.1, 3867));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3772 && loc2.getY() <= 85 && loc2.getZ() <= 3878 
							&& loc2.getX() >= 3737 && loc2.getY() >= 65 && loc2.getZ() >= 3857) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3772 && loc2.getY() <= 85 && loc2.getZ() <= 3878 
								&& loc2.getX() >= 3737 && loc2.getY() >= 65 && loc2.getZ() >= 3857) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3761, 70, 3868), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3761, 70, 3866), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3755, 70, 3868), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3755, 70, 3866), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3749, 70, 3868), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3749, 70, 3866), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3757, 71, 3871), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3753, 71, 3871), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3757, 71, 3863), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3753, 71, 3863), EntityType.WITHER_SKELETON);
			return;
		}
		
		// 복도방2
		if (loc.getX() == 3736.5 && loc.getY() == 70 && loc.getZ() == 3867.5) {
			player.teleport(new Location(player.getWorld(), 3736.5, 70.1, 3867.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(70, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3736 && loc2.getY() <= 85 && loc2.getZ() <= 3873 
							&& loc2.getX() >= 3690 && loc2.getY() >= 65 && loc2.getZ() >= 3862) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3736 && loc2.getY() <= 85 && loc2.getZ() <= 3873 
								&& loc2.getX() >= 3690 && loc2.getY() >= 65 && loc2.getZ() >= 3862) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3713, 70, 3869), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3713, 70, 3865), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3710, 70, 3866), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3710, 70, 3868), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3726, 70, 3868), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3723, 70, 3868), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3720, 70, 3868), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3726, 70, 3866), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3723, 70, 3866), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3720, 70, 3866), EntityType.WITHER_SKELETON);
			
			
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3702, 70, 3869), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3702, 70, 3865), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3700, 70, 3866), EntityType.SKELETON);
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3700, 70, 3868), EntityType.SKELETON);
			return;
		}
		
		// 중간보스 
		if (loc.getX() == 3838.5 && loc.getY() == 74 && loc.getZ() == 4030.5) {
			player.teleport(new Location(player.getWorld(), 3838.5, 74.1, 4030.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(100, 40, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3837 && loc2.getY() <= 91 && loc2.getZ() <= 4060 
							&& loc2.getX() >= 3746 && loc2.getY() >= 65 && loc2.getZ() >= 4001) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3837 && loc2.getY() <= 91 && loc2.getZ() <= 4060 
								&& loc2.getX() >= 3746 && loc2.getY() >= 65 && loc2.getZ() >= 4001) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3783, 74, 4030), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3781, 74, 4026), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3777, 74, 4024), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 74, 4026), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3771, 74, 4030), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3773, 74, 4034), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3777, 74, 4036), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3781, 74, 4034), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3777, 74, 4030), EntityType.WITHER_SKELETON);
			
			return;
		}
		
		// 보스 
		if (loc.getX() == 3663.42 && loc.getY() == 168.5 && loc.getZ() == 4030.45) {
			player.teleport(new Location(player.getWorld(), 3663.5, 168.6, 4030.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(80, 40, 80);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3672 && loc2.getY() <= 200 && loc2.getZ() <= 4058 
							&& loc2.getX() >= 3617 && loc2.getY() >= 150 && loc2.getZ() >= 4005) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3672 && loc2.getY() <= 200 && loc2.getZ() <= 4058 
								&& loc2.getX() >= 3617 && loc2.getY() >= 150 && loc2.getZ() >= 4005) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3645, 169, 4030), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3648, 169, 4026), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3648, 169, 4034), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3641, 169, 4026), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3641, 169, 4034), EntityType.ZOMBIE);
			
			return;
		}
		
	}

	public String getQuestName(Player player) {
		try {
			ArrayList<Objective> list = new ArrayList<Objective>(player.getScoreboard().getObjectives());
			String name = "N";
			for(Objective obj : list) {
				if(obj.getDisplayName().charAt(2) == '[') {
					name = obj.getName();
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return "N";
		}
	}
	
	public String randomKey(HashMap<String, Integer> map) {
		List<String> keysAsArray = new ArrayList<String>(map.keySet());
		Random rnd = new Random();
		return keysAsArray.get(rnd.nextInt(keysAsArray.size()));
	}
	
}
