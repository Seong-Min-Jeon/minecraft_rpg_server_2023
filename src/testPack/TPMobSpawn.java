package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class TPMobSpawn {

	public TPMobSpawn(Player player, Location loc) {

//		System.out.println(loc.toString());

		fairy(player, loc);
		snow(player, loc);
		senmag(player, loc);
		tower(player, loc);
		maze(player, loc);
		aracune(player, loc);
		forest(player, loc);
		samak(player, loc);
		skelig(player, loc);
		hardSea(player, loc);
		hardForest(player, loc);
		
	}

	public void fairy(Player player, Location loc) {
		// 타락한 요정 왕국 엘리베이터
		if (loc.getX() == 3699.5 && loc.getY() == 28 && loc.getZ() == 3439.5) {
			player.teleport(new Location(player.getWorld(), 3699.45, 28.1, 3439.45));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(30, 30, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3687 36 3441  3715 19 3429
					if (loc2.getX() <= 3715 && loc2.getY() <= 36 && loc2.getZ() <= 3441 
							&& loc2.getX() >= 3687 && loc2.getY() >= 19 && loc2.getZ() >= 3429) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Skeleton) {
						nearEntity.remove();
					}
				}
			}
			Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3696, 29, 3433), EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(15);
			head.setHelmet(headItem);
			
			Skeleton mob2 = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3702, 29, 3433), EntityType.SKELETON);
			EntityEquipment head2 = mob2.getEquipment();
			ItemStack headItem2 = chest.getInventory().getItem(15);
			head2.setHelmet(headItem2);
			return;
		}
		
		
		// 타락한 요정 왕국 2층
		if (loc.getX() == 3699.5 && loc.getY() == 46 && loc.getZ() == 3449.5) {
			player.teleport(new Location(player.getWorld(), 3699.45, 46.1, 3449.45));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 30, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3688 53 3448  3708 44 3466
					if (loc2.getX() <= 3708 && loc2.getY() <= 53 && loc2.getZ() <= 3466 
							&& loc2.getX() >= 3688 && loc2.getY() >= 44 && loc2.getZ() >= 3448) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Llama) {
						nearEntity.remove();
					}
				}
			}

			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3702, 46, 3460), EntityType.LLAMA);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3702, 46, 3454), EntityType.LLAMA);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3696, 46, 3460), EntityType.LLAMA);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3696, 46, 3454), EntityType.LLAMA);
			return;
		}

		
		// 타락한 요정 왕국 입구
		if (loc.getX() == 3745.57 && loc.getY() == 77 && loc.getZ() == 3430.3) {
			player.teleport(new Location(player.getWorld(), 3745.56, 77, 3430.3));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3755 84 3430 3736 74 3461
					if (loc2.getX() <= 3755 && loc2.getY() <= 84 && loc2.getZ() <= 3461 && loc2.getX() >= 3736
							&& loc2.getY() >= 74 && loc2.getZ() >= 3430) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Wither) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Blaze) {
						nearEntity.remove();
					}
					if (nearEntity instanceof Phantom) {
						nearEntity.remove();
					}
				}
			}
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3745, 77, 3444), EntityType.WITHER);
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 80, 3438), EntityType.PHANTOM);
			}
			for (int i = 0; i < 5; i++) {
				loc.getWorld().spawnEntity(new Location(player.getWorld(), 3750, 77, 3453), EntityType.BLAZE);
			}
			return;
		}
		

		// 타락한 요정 왕국 보스
		if (loc.getX() == 3775.61 && loc.getY() == 90.2 && loc.getZ() == 3461.38) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "니 녀석도 내 보물을 훔치러 온 것이냐. 죽어라.");

			player.teleport(new Location(player.getWorld(), 3775.6, 90.2, 3461.38));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3754 90 3497 3797 75 3456
					if (loc2.getX() <= 3797 && loc2.getY() <= 91 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
							&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
						num++;
						if(new BossHealth().getBar9().getProgress() != 0) {
							new BossHealth().getBar9().addPlayer(player);
						}
						if(new BossHealth().getBar10().getProgress() != 0) {
							new BossHealth().getBar10().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3754 90 3497 3797 75 3456
						if (loc2.getX() <= 3797 && loc2.getY() <= 90 && loc2.getZ() <= 3497 && loc2.getX() >= 3754
								&& loc2.getY() >= 75 && loc2.getZ() >= 3456) {
							nearEntity.remove();
						}
					}
				}
			}

			Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();

			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3776, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(17);
			head.setHelmet(headItem);

			Skeleton mob2 = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3774, 77, 3477),
					EntityType.SKELETON);
			EntityEquipment head2 = mob2.getEquipment();
			ItemStack headItem2 = chest.getInventory().getItem(16);
			head2.setHelmet(headItem2);
			
			new BossHealth().getBar9().setProgress(1.0);
			new BossHealth().getBar9().addPlayer(player);
			new BossHealth().getBar10().setProgress(1.0);
			new BossHealth().getBar10().addPlayer(player);
			return;
		}
	}
	
	public void snow(Player player, Location loc) {
		// 카루 던전 입구
		if (loc.getX() == 3826.7 && loc.getY() == 16 && loc.getZ() == 3211.44) {
			player.teleport(new Location(player.getWorld(), 3826.71, 16, 3211.43));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3832 42 3179  3769 9 3242
					if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
							loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3832 42 3179  3769 9 3242
						if (loc2.getX() <= 3832 && loc2.getY() <= 42 && loc2.getZ() <= 3242 && 
								loc2.getX() >= 3769 && loc2.getY() >= 8 && loc2.getZ() >= 3179) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3815, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3221), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3218), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3795, 14, 3211), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3798, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3201), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3812, 14, 3204), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3805, 14, 3211), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3778, 14, 3222), EntityType.SKELETON);
			return;
		}
		
		// 카루 던전 중간보스
		if (loc.getX() == 3808.5 && loc.getY() == 69.5 && loc.getZ() == 3215.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "네 놈에게 나락을 보여주도록 하지.");

			player.teleport(new Location(player.getWorld(), 3808, 69, 3215));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3809 93 3201  3783 63 3227
					if (loc2.getX() <= 3809 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
							&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
						num++;
						if(new BossHealth().getBar7().getProgress() != 0) {
							new BossHealth().getBar7().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3809 93 3201  3783 63 3227
						if (loc2.getX() <= 3809 && loc2.getY() <= 93 && loc2.getZ() <= 3227 && loc2.getX() >= 3783
								&& loc2.getY() >= 63 && loc2.getZ() >= 3201) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3791, 69, 3215),EntityType.WITHER_SKELETON);
			
			new BossHealth().getBar7().setProgress(1.0);
			new BossHealth().getBar7().addPlayer(player);
			return;
		}
		

		// 카루 던전 보스
		if (loc.getX() == 3730 && loc.getY() == 179 && loc.getZ() == 3236) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "나의 제물이 되어라. 애송이.");

			player.teleport(new Location(player.getWorld(), 3730.1, 179, 3236));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 3711 163 3254  3769 133 3217
					if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
							&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
						num++;
						if(new BossHealth().getBar8().getProgress() != 0) {
							new BossHealth().getBar8().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 3711 163 3254  3769 133 3217
						if (loc2.getX() <= 3769 && loc2.getY() <= 163 && loc2.getZ() <= 3254 && loc2.getX() >= 3711
								&& loc2.getY() >= 133 && loc2.getZ() >= 3217) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 140, 3236), EntityType.ZOMBIE);
			
			new BossHealth().getBar8().setProgress(1.0);
			new BossHealth().getBar8().addPlayer(player);
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
						if(new BossHealth().getBar5().getProgress() != 0) {
							new BossHealth().getBar5().addPlayer(player);
						}
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
			
			new BossHealth().getBar5().setProgress(1.0);
			new BossHealth().getBar5().addPlayer(player);
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
						new BossHealth().getBar6().addPlayer(player);
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
			
			new BossHealth().getBar6().setProgress(1.0);
			new BossHealth().getBar6().addPlayer(player);
			return;
		}
	}
	
	public void tower(Player player, Location loc) {
		// 죽음의 탑 1층
		if (loc.getX() == 72.5 && loc.getY() == 75 && loc.getZ() == -3.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 75, -3.51));
			
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					// 54 75 -5  90 86 -41
					if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar2().getProgress() != 0) {
							new BossHealth().getBar2().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						// 54 75 -5  90 86 -41
						if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 75, -22), EntityType.SKELETON);
			
			new BossHealth().getBar2().setProgress(1.0);
			new BossHealth().getBar2().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 2층
		if (loc.getX() == 72.5 && loc.getY() == 88 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 88, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar3().getProgress() != 0) {
							new BossHealth().getBar3().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 88, -22), EntityType.SKELETON);
			
			new BossHealth().getBar3().setProgress(1.0);
			new BossHealth().getBar3().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 3층
		if (loc.getX() == 72.5 && loc.getY() == 101 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 101, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar4().getProgress() != 0) {
							new BossHealth().getBar4().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 101, -22), EntityType.SKELETON);
			
			new BossHealth().getBar4().setProgress(1.0);
			new BossHealth().getBar4().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 4층
		if (loc.getX() == 72.5 && loc.getY() == 116 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 116, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar18().getProgress() != 0) {
							new BossHealth().getBar18().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 116, -22), EntityType.SKELETON);
			
			new BossHealth().getBar18().setProgress(1.0);
			new BossHealth().getBar18().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 5층
		if (loc.getX() == 72.5 && loc.getY() == 129 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 129, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar19().getProgress() != 0) {
							new BossHealth().getBar19().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			player.getWorld().spawnEntity(new Location(player.getWorld(), 72, 129, -22), EntityType.SKELETON);
			
			new BossHealth().getBar19().setProgress(1.0);
			new BossHealth().getBar19().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 6층
		if (loc.getX() == 72.5 && loc.getY() == 142 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 142, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar26().getProgress() != 0) {
							new BossHealth().getBar26().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 142, -22), EntityType.SKELETON);
			new BossHealth().getBar26().setProgress(1.0);
			new BossHealth().getBar26().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 7층
		if (loc.getX() == 72.5 && loc.getY() == 157 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 157, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar27().getProgress() != 0) {
							new BossHealth().getBar27().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 157, -22), EntityType.SKELETON);
			new BossHealth().getBar27().setProgress(1.0);
			new BossHealth().getBar27().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 8층
		if (loc.getX() == 72.5 && loc.getY() == 170 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 170, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
						num++;
						if(new BossHealth().getBar28().getProgress() != 0) {
							new BossHealth().getBar28().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 170, -22), EntityType.SKELETON);
			new BossHealth().getBar28().setProgress(1.0);
			new BossHealth().getBar28().addPlayer(player);
			return;
		}
		
		// 죽음의 탑 9층
		if (loc.getX() == 72.5 && loc.getY() == 183 && loc.getZ() == -8.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 183, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 197 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 183 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 183, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 10층
		if (loc.getX() == 72.5 && loc.getY() == 198 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 198, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 210 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 198 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 198, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 11층
		if (loc.getX() == 72.5 && loc.getY() == 211 && loc.getZ() == -4.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 211, -4.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 223 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 211 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 211, -22), EntityType.SKELETON);
			return;
		}
		
		// 죽음의 탑 12층
		if (loc.getX() == 72.5 && loc.getY() == 224 && loc.getZ() == -7.5) {
			player.teleport(new Location(player.getWorld(), 72.5, 224, -8.51));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 10, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -3 &&  
							loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 90 && loc2.getY() <= 238 && loc2.getZ() <= -3 &&  
								loc2.getX() >= 54 && loc2.getY() >= 224 && loc2.getZ() >= -41) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 72, 224, -22), EntityType.SKELETON);
			return;
		}
		
		
	}
	
	public void maze(Player player, Location loc) {
		// 코낭그
		if (loc.getX() == 48.5 && loc.getY() == 53 && loc.getZ() == 676.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "먹잇감이 제발로 왔군.");

			player.teleport(new Location(player.getWorld(), 48.13, 53.14, 676.13));
			player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS,40,1,true,false,false));
			player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,40,1,true,false,false));
			player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
							loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
						num++;
						if(new BossHealth().getBar1().getProgress() != 0) {
							new BossHealth().getBar1().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 49 && loc2.getY() <= 61 && loc2.getZ() <= 696 && 
								loc2.getX() >= 16 && loc2.getY() >= 51 && loc2.getZ() >= 654) {
							nearEntity.remove();
						}
					}
				}
			}
			
			player.getWorld().spawnEntity(new Location(player.getWorld(), 25, 54, 675), EntityType.SKELETON);

			new BossHealth().getBar1().setProgress(1.0);
			new BossHealth().getBar1().addPlayer(player);
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
						if(new BossHealth().getBar11().getProgress() != 0) {
							new BossHealth().getBar11().addPlayer(player);
						}
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
			
			new BossHealth().getBar11().setProgress(1.0);
			new BossHealth().getBar11().addPlayer(player);
			return;
		}
	}
	
	public void forest(Player player, Location loc) {
		// 유적의 주인
		if (loc.getX() == 3562.5 && loc.getY() == 25 && loc.getZ() == 3736.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "이곳에 모험가가 오다니 오랜만이군.");

			player.teleport(new Location(player.getWorld(), 3562.6, 25, 3736.6));
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
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3562, 30, 3712), EntityType.GHAST);
			
			return;
		}
	}
	
	public void samak(Player player, Location loc) {
		// 고대의 암석 협곡 던전
		if (loc.getX() == 3759.01 && loc.getY() == 28 && loc.getZ() == 3078.26) {
			player.teleport(new Location(player.getWorld(), 3759, 28, 3078.25));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3832 && loc2.getY() <= 122 && loc2.getZ() <= 3086 
							&& loc2.getX() >= 3648 && loc2.getY() >= 11 && loc2.getZ() >= 2981) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3832 && loc2.getY() <= 122 && loc2.getZ() <= 3086 
								&& loc2.getX() >= 3648 && loc2.getY() >= 11 && loc2.getZ() >= 2981) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 23, 3058), EntityType.ZOMBIE);
			return;
		}
		
		// 고대의 암석 협곡 중간보스
		if (loc.getX() == 3824.39 && loc.getY() == 34 && loc.getZ() == 2857.79) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "이 앞은 지나갈 수 없다.");
			
			try {
				player.getInventory().remove(Material.TNT);
			} catch(Exception e) {
				
			}

			player.teleport(new Location(player.getWorld(), 3824.3, 34, 2857.8));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(120, 20, 30);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3824 && loc2.getY() <= 52 && loc2.getZ() <= 2896 
							&& loc2.getX() >= 3707 && loc2.getY() >= 16 && loc2.getZ() >= 2834) {
						num++;
						if(new BossHealth().getBar12().getProgress() != 0) {
							new BossHealth().getBar12().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3824 && loc2.getY() <= 52 && loc2.getZ() <= 2896 
								&& loc2.getX() >= 3707 && loc2.getY() >= 16 && loc2.getZ() >= 2834) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3800, 33, 2855), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3800, 33, 2861), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3772, 34, 2858), EntityType.SKELETON);
			
			new BossHealth().getBar12().setProgress(1.0);
			new BossHealth().getBar12().addPlayer(player);
			return;
		}
		
		// 고대의 암석 협곡 보스
		if (loc.getX() == 3697.5 && loc.getY() == 52 && loc.getZ() == 2858.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "여기가 너의 무덤이 될 것이다.");
			
			try {
				player.getInventory().remove(Material.TNT);
			} catch(Exception e) {
				
			}

			player.teleport(new Location(player.getWorld(), 3697.4, 52, 2858.8));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(80, 100, 80);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3697 && loc2.getY() <= 110 && loc2.getZ() <= 2898 
							&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2823) {
						num++;
						if (new BossHealth().getBar13().getProgress() != 0) {
							new BossHealth().getBar13().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3697 && loc2.getY() <= 110 && loc2.getZ() <= 2898 
								&& loc2.getX() >= 3658 && loc2.getY() >= 41 && loc2.getZ() >= 2823) {
							nearEntity.remove();
						}
					}
				}
			}

			new BossHealth().getBar13().setProgress(1.0);
			new BossHealth().getBar13().addPlayer(player);
			return;
		}
		
		// 슬라임 보스 끼워넣기
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
						if (new BossHealth().getBar22().getProgress() != 0) {
							new BossHealth().getBar22().addPlayer(player);
						}
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
			new BossHealth().getBar22().setProgress(1.0);
			new BossHealth().getBar22().addPlayer(player);
			return;
		}

	}
	
	public void skelig(Player player, Location loc) {
		// 복도방
		if (loc.getX() == 3696.5 && loc.getY() == 88 && loc.getZ() == 2382.5) {
			player.teleport(new Location(player.getWorld(), 3696.5, 88, 2382.45));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(20, 30, 70);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3711 && loc2.getY() <= 100 && loc2.getZ() <= 2392 
							&& loc2.getX() >= 3681 && loc2.getY() >= 80 && loc2.getZ() >= 2310) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3711 && loc2.getY() <= 100 && loc2.getZ() <= 2392 
								&& loc2.getX() >= 3681 && loc2.getY() >= 80 && loc2.getZ() >= 2310) {
							nearEntity.remove();
						}
					}
				}
			}
			
			player.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 89, 2376), EntityType.WITHER);
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3706, 88, 2355), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3706, 88, 2355), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3706, 88, 2355), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3688, 88, 2334), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3688, 88, 2334), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3688, 88, 2334), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2367), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2367), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2356), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2356), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2333), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2333), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2322), EntityType.WITHER_SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3697, 88, 2322), EntityType.WITHER_SKELETON);
			return;
		}
		
		// 보스 
		if (loc.getX() == 3730.5 && loc.getY() == 88 && loc.getZ() == 2420.5) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "꾸읽꾸익꾸이읽");

			player.teleport(new Location(player.getWorld(), 3730.5, 88.1, 2420.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(50, 40, 50);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3753 && loc2.getY() <= 108 && loc2.getZ() <= 2434 
							&& loc2.getX() >= 3713 && loc2.getY() >= 80 && loc2.getZ() >= 2376) {
						num++;
						if(new BossHealth().getBar23().getProgress() != 0) {
							new BossHealth().getBar23().addPlayer(player);
						}
						return;
					}
				}
			}

			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3753 && loc2.getY() <= 108 && loc2.getZ() <= 2434 
								&& loc2.getX() >= 3713 && loc2.getY() >= 80 && loc2.getZ() >= 2376) {
							nearEntity.remove();
						}
					}
				}
			}
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3737, 88, 2414), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3737, 88, 2397), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3722, 88, 2397), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3722, 88, 2414), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3730, 88, 2407), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3730, 88, 2407), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3730, 88, 2407), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3740, 98, 2416), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3720, 98, 2385), EntityType.ZOMBIE);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3730, 88, 2388), EntityType.ZOGLIN);
			
			new BossHealth().getBar23().setProgress(1.0);
			new BossHealth().getBar23().addPlayer(player);
			return;
		}
		
		// 튜토 
		if (loc.getX() == 3968.7 && loc.getY() == 165 && loc.getZ() == 3942.55) {
			ItemStack weapon = new ItemStack(Material.WOODEN_HOE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.GRAY + "낡은 낫");
			ArrayList<String> weaponLore = new ArrayList();
			weaponLore.add(ChatColor.GRAY + "돌로 만들어진 낡은 낫");
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weaponIm.setUnbreakable(true);
			weaponIm.setLore(weaponLore);
			weapon.setItemMeta(weaponIm);
			player.getInventory().addItem(weapon);
			
			ItemStack weapon1 = new ItemStack(Material.WOODEN_SHOVEL);
			ItemMeta weapon1Im = weapon1.getItemMeta();
			weapon1Im.setDisplayName(ChatColor.GRAY + "낡은 채집도구");
			ArrayList<String> weapon1Lore = new ArrayList();
			weapon1Lore.add(ChatColor.GRAY + "날이 무뎌진 채집도구");
			weapon1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weapon1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weapon1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon1Im.setUnbreakable(true);
			weapon1Im.setLore(weapon1Lore);
			weapon1.setItemMeta(weapon1Im);
			player.getInventory().addItem(weapon1);
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
						if(new BossHealth().getBar24().getProgress() != 0) {
							new BossHealth().getBar24().addPlayer(player);
						}
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
			
			new BossHealth().getBar24().setProgress(1.0);
			new BossHealth().getBar24().addPlayer(player);
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
						if(new BossHealth().getBar25().getProgress() != 0) {
							new BossHealth().getBar25().addPlayer(player);
						}
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
			
			new BossHealth().getBar25().setProgress(1.0);
			new BossHealth().getBar25().addPlayer(player);
			return;
		}
		
	}

	public void hardForest(Player player, Location loc) {
		// 1번 방 1번 룸
		if (loc.getX() == 3788.51 && loc.getY() == 77 && loc.getZ() == 4096.47) {
			player.teleport(new Location(player.getWorld(), 3788.5, 77, 4096.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(20, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3793 && loc2.getY() <= 90 && loc2.getZ() <= 4102 
							&& loc2.getX() >= 3777 && loc2.getY() >= 65 && loc2.getZ() >= 4082) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3793 && loc2.getY() <= 90 && loc2.getZ() <= 4102 
								&& loc2.getX() >= 3777 && loc2.getY() >= 65 && loc2.getZ() >= 4082) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3782, 78, 4090), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3782, 78, 4096), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3788, 78, 4090), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3785, 78, 4093), EntityType.SKELETON);
			return;
		}
		
		// 1번 방 2번 룸
		if (loc.getX() == 3754.55 && loc.getY() == 86 && loc.getZ() == 4111.19) {
			player.teleport(new Location(player.getWorld(), 3754.5, 86, 4111.2));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(20, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3763 && loc2.getY() <= 100 && loc2.getZ() <= 4128 
							&& loc2.getX() >= 3744 && loc2.getY() >= 80 && loc2.getZ() >= 4109) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3763 && loc2.getY() <= 100 && loc2.getZ() <= 4128 
								&& loc2.getX() >= 3744 && loc2.getY() >= 80 && loc2.getZ() >= 4109) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3750, 87, 4123), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3758, 87, 4123), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3758, 87, 4115), EntityType.SKELETON);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3750, 87, 4115), EntityType.SKELETON);
			return;
		}
		
		// 1번 방 3번 룸
		if (loc.getX() == 3723.44 && loc.getY() == 92 && loc.getZ() == 4105.67) {
			player.teleport(new Location(player.getWorld(), 3723.4, 92, 4105.7));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(20, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3726 && loc2.getY() <= 100 && loc2.getZ() <= 4110 
							&& loc2.getX() >= 3709 && loc2.getY() >= 85 && loc2.getZ() >= 4092) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3726 && loc2.getY() <= 100 && loc2.getZ() <= 4110 
								&& loc2.getX() >= 3709 && loc2.getY() >= 85 && loc2.getZ() >= 4092) {
							nearEntity.remove();
						}
					}
				}
			}

			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3711, 93, 4104), EntityType.SLIME);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3716, 93, 4100), EntityType.SLIME);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3717, 93, 4109), EntityType.SLIME);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3722, 93, 4101), EntityType.SLIME);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3710, 93, 4102), EntityType.SKELETON);
			return;
		}
		
		// 1번 방 4번 룸
		if (loc.getX() == 3692.79 && loc.getY() == 97 && loc.getZ() == 4117.89) {
			player.teleport(new Location(player.getWorld(), 3692.8, 97, 4117.9));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(20, 30, 20);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3697 && loc2.getY() <= 105 && loc2.getZ() <= 4131 
							&& loc2.getX() >= 3681 && loc2.getY() >= 90 && loc2.getZ() >= 4115) {
						num++;
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3697 && loc2.getY() <= 105 && loc2.getZ() <= 4131 
								&& loc2.getX() >= 3681 && loc2.getY() >= 90 && loc2.getZ() >= 4115) {
							nearEntity.remove();
						}
					}
				}
			}

			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3690, 98, 4120), EntityType.SILVERFISH);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3687, 98, 4118), EntityType.SILVERFISH);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3692, 98, 4123), EntityType.SILVERFISH);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3695, 98, 4121), EntityType.SILVERFISH);
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3689, 98, 4123), EntityType.SKELETON);
			return;
		}
		
		// 중간보스
		if (loc.getX() == 3748.26 && loc.getY() == 90.0 && loc.getZ() == 4170.51) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "나는 검게 꿈틀거리는 자.");
			
			player.teleport(new Location(player.getWorld(), 3748.5, 90, 4170.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 30, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3751 && loc2.getY() <= 105 && loc2.getZ() <= 4184 
							&& loc2.getX() >= 3727 && loc2.getY() >= 85 && loc2.getZ() >= 4156) {
						num++;
						if(new BossHealth().getBar33().getProgress() != 0) {
							new BossHealth().getBar33().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3751 && loc2.getY() <= 105 && loc2.getZ() <= 4184 
								&& loc2.getX() >= 3727 && loc2.getY() >= 85 && loc2.getZ() >= 4156) {
							nearEntity.remove();
						}
					}
				}
			}
			
			loc.getWorld().spawnEntity(new Location(player.getWorld(), 3737.5, 91, 4170.5), EntityType.SKELETON);
			
			new BossHealth().getBar33().setProgress(1.0);
			new BossHealth().getBar33().addPlayer(player);
			return;
		}
		
		// 보스
		if (loc.getX() == 3677.45 && loc.getY() == 188.0 && loc.getZ() == 4179.4) {
			player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "나의 시험을 이길 수 있을까?");
			
			player.teleport(new Location(player.getWorld(), 3677.5, 188, 4179.5));
			int num = 0;
			List<Entity> entitylist = player.getNearbyEntities(40, 50, 40);
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() == EntityType.PLAYER) {
					Player nearPlayer = (Player) nearEntity;
					Location loc2 = nearPlayer.getLocation();
					if (loc2.getX() <= 3699 && loc2.getY() <= 230 && loc2.getZ() <= 4217 
							&& loc2.getX() >= 3657 && loc2.getY() >= 180 && loc2.getZ() >= 4172) {
						num++;
						if(new BossHealth().getBar34().getProgress() != 0) {
							new BossHealth().getBar34().addPlayer(player);
						}
						return;
					}
				}
			}
			if (num == 0) {
				for (Entity nearEntity : entitylist) {
					if (nearEntity instanceof Mob) {
						Location loc2 = nearEntity.getLocation();
						if (loc2.getX() <= 3699 && loc2.getY() <= 230 && loc2.getZ() <= 4217 
								&& loc2.getX() >= 3657 && loc2.getY() >= 180 && loc2.getZ() >= 4172) {
							nearEntity.remove();
						}
					}
				}
			}
			
			Skeleton skel = (Skeleton) loc.getWorld().spawnEntity(new Location(player.getWorld(), 3677.5, 211.5, 4193.5), EntityType.SKELETON);
			
			HashMap<String, Integer> question = new HashMap<>();
			HashMap<String, String> choice = new HashMap<>();
			
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "당신이 태어난 마을의 이름은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "당신이 태어난 마을의 이름은?", ChatColor.RED + "1. 워그닐" + ChatColor.GRAY + " 2. 포르간" + ChatColor.YELLOW + " 3. 위그닐" + ChatColor.AQUA + " 4. 티르");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "포르간 촌장의 취미는 무엇인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "포르간 촌장의 취미는 무엇인가?", ChatColor.RED + "1. 골프" + ChatColor.GRAY + " 2. 수영" + ChatColor.YELLOW + " 3. 낚시" + ChatColor.AQUA + " 4. 전투");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "스켈레톤이 가장 좋아하는 음식은 무엇인가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "스켈레톤이 가장 좋아하는 음식은 무엇인가?", ChatColor.RED + "1. 김치" + ChatColor.GRAY + " 2. 민트초코" + ChatColor.YELLOW + " 3. 파인애플 피자" + ChatColor.AQUA + " 4. 고수");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어 섬을 지키는 여신은 누구인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어 섬을 지키는 여신은 누구인가?", ChatColor.RED + "1. 데히트라" + ChatColor.GRAY + " 2. 마가이" + ChatColor.YELLOW + " 3. 스카디" + ChatColor.AQUA + " 4. 네반");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "티르의 등대는 몇층짜리 건축물인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "티르의 등대는 몇층짜리 건축물인가?", ChatColor.RED + "1. 3층" + ChatColor.GRAY + " 2. 4층" + ChatColor.YELLOW + " 3. 5층" + ChatColor.AQUA + " 4. 6층");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "시드 광산에 존재하는 던전의 이름은 무엇인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "시드 광산에 존재하는 던전의 이름은 무엇인가?", ChatColor.RED + "1. 요정 왕국" + ChatColor.GRAY + " 2. 광란의 요정 왕국" + ChatColor.YELLOW + " 3. 타락한 요정 왕국" + ChatColor.AQUA + " 4. 광요의 요정 왕국");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "희귀한 무기는 무슨 색의 이름을 가졌는가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "희귀한 무기는 무슨 색의 이름을 가졌는가?", ChatColor.RED + "1. 흰색" + ChatColor.GRAY + " 2. 노란색" + ChatColor.YELLOW + " 3. 밝은 보라색" + ChatColor.AQUA + " 4. 짙은 보라색");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "미푀르유에서 판매하는 포션의 이름으로 틀린 것은?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "미푀르유에서 판매하는 포션의 이름으로 틀린 것은?", ChatColor.RED + "1. 검은 인간의 피" + ChatColor.GRAY + " 2. 거북이 우린 물" + ChatColor.YELLOW + " 3. 약재 우린 물" + ChatColor.AQUA + " 4. 회복 포션 IV");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "미푀르유에서 판매하는 헬멧의 이름으로 옳은 것은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "미푀르유에서 판매하는 헬멧의 이름으로 옳은 것은?", ChatColor.RED + "1. 가메시엘" + ChatColor.GRAY + " 2. 지즈키엘" + ChatColor.YELLOW + " 3. 쿠모구스" + ChatColor.AQUA + " 4. 라디안");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "광이 나는 낫의 이름 색은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "광이 나는 낫의 이름 색은?", ChatColor.RED + "1. 회색" + ChatColor.GRAY + " 2. 흰색" + ChatColor.YELLOW + " 3. 노란색" + ChatColor.AQUA + " 4. 밝은 보라색");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "카이만에서 비싸게 취급하는 것은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "카이만에서 비싸게 취급하는 것은?", ChatColor.RED + "1. 강화 주문서" + ChatColor.GRAY + " 2. 장비 감정서" + ChatColor.YELLOW + " 3. 포션" + ChatColor.AQUA + " 4. 워프 스크롤");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "오스에서 배를 타고 갈 수 있는 섬의 이름은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "오스에서 배를 타고 갈 수 있는 섬의 이름은?", ChatColor.RED + "1. 라히무호나" + ChatColor.GRAY + " 2. 아란모어" + ChatColor.YELLOW + " 3. 에일" + ChatColor.AQUA + " 4. 아렌델");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어에서 판매하는 누군가의 방한 갑옷의 방어력은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어에서 판매하는 누군가의 방한 갑옷의 방어력은?", ChatColor.RED + "1. 63" + ChatColor.GRAY + " 2. 153" + ChatColor.YELLOW + " 3. 225" + ChatColor.AQUA + " 4. 227");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어에서 판매하는 방한 헬멧의 방어력은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "아란모어에서 판매하는 방한 헬멧의 방어력은?", ChatColor.RED + "1. 0" + ChatColor.GRAY + " 2. 50" + ChatColor.YELLOW + " 3. 150" + ChatColor.AQUA + " 4. 200");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "네비와 처음 만나는 것은 메인 퀘스트 몇장인가?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "네비와 처음 만나는 것은 메인 퀘스트 몇장인가?", ChatColor.RED + "1. 24장" + ChatColor.GRAY + " 2. 25장" + ChatColor.YELLOW + " 3. 26장" + ChatColor.AQUA + " 4. 27장");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "칼스에서 판매하는 검의 이름은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "칼스에서 판매하는 검의 이름은?", ChatColor.RED + "1. 우두마두육도" + ChatColor.GRAY + " 2. 헤븐즈도어" + ChatColor.YELLOW + " 3. 공참각" + ChatColor.AQUA + " 4. 백로");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "죽음의 탑이 보이는 마을의 이름은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "죽음의 탑이 보이는 마을의 이름은?", ChatColor.RED + "1. 크레드라트" + ChatColor.GRAY + " 2. 칼스" + ChatColor.YELLOW + " 3. 하마베" + ChatColor.AQUA + " 4. 포르간");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "베아그에서 사육 중인 동물은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "베아그에서 사육 중인 동물은?", ChatColor.RED + "1. 닭" + ChatColor.GRAY + " 2. 돼지" + ChatColor.YELLOW + " 3. 소" + ChatColor.AQUA + " 4. 양");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "마법탑의 주인은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "마법탑의 주인은?", ChatColor.RED + "1. 니세리나" + ChatColor.GRAY + " 2. 카타리나" + ChatColor.YELLOW + " 3. 줄리엣" + ChatColor.AQUA + " 4. 로미오");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게에서 사육 중인 동물은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게에서 사육 중인 동물은?", ChatColor.RED + "1. 닭" + ChatColor.GRAY + " 2. 돼지" + ChatColor.YELLOW + " 3. 소" + ChatColor.AQUA + " 4. 양");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게의 꼬마가 가지고 놀던 장난감은 누가 부쉈는가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게의 꼬마가 가지고 놀던 장난감은 누가 부쉈는가?", ChatColor.RED + "1. 떠도는 망령" + ChatColor.GRAY + " 2. 에밀" + ChatColor.YELLOW + " 3. 파스칼" + ChatColor.AQUA + " 4. 마법소녀");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게의 꼬마는 누구 때문에 잠을 자지 못했는가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "롱게의 꼬마는 누구 때문에 잠을 자지 못했는가?", ChatColor.RED + "1. 떠도는 망령" + ChatColor.GRAY + " 2. 에밀" + ChatColor.YELLOW + " 3. 파스칼" + ChatColor.AQUA + " 4. 마법소녀");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베에 있는 줄리엣의 고향은 어디인가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베에 있는 줄리엣의 고향은 어디인가?", ChatColor.RED + "1. 라파누이" + ChatColor.GRAY + " 2. 라히무호나" + ChatColor.YELLOW + " 3. 시오카나" + ChatColor.AQUA + " 4. 티페라리");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베의 말 상인은 어떤 말을 팔고 있는가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베의 말 상인은 어떤 말을 팔고 있는가?", ChatColor.RED + "1. 검갈마" + ChatColor.GRAY + " 2. 황갈마" + ChatColor.YELLOW + " 3. 회갈마" + ChatColor.AQUA + " 4. 갈색마");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베에서 배를 타고 갈 수 없는 섬은?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "하마베에서 배를 타고 갈 수 없는 섬은?", ChatColor.RED + "1. 라파누이" + ChatColor.GRAY + " 2. 라히무호나" + ChatColor.YELLOW + " 3. 시오카나" + ChatColor.AQUA + " 4. 스켈리그");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "사막 정찰캠프에서 판매하는 아이템은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "사막 정찰캠프에서 판매하는 아이템은?", ChatColor.RED + "1. 카이만식 양고기" + ChatColor.GRAY + " 2. 근육의 포션 II" + ChatColor.YELLOW + " 3. 힐링 포션 XIII" + ChatColor.AQUA + " 4. 성수");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "C급 검투사의 이름은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "C급 검투사의 이름은?", ChatColor.RED + "1. 레티아리우스" + ChatColor.GRAY + " 2. 갈리" + ChatColor.YELLOW + " 3. 디마카에루스" + ChatColor.AQUA + " 4. 프라에그나리");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "B급 검투사의 이름은?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "B급 검투사의 이름은?", ChatColor.RED + "1. 갈리" + ChatColor.GRAY + " 2. 디마카에루스" + ChatColor.YELLOW + " 3. 레티아리우스" + ChatColor.AQUA + " 4. 프라에그나리");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "A급 검투사의 이름은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "A급 검투사의 이름은?", ChatColor.RED + "1. 갈리" + ChatColor.GRAY + " 2. 디마카에루스" + ChatColor.YELLOW + " 3. 레티아리우스" + ChatColor.AQUA + " 4. 프라에그나리");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "S급 검투사의 이름은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "S급 검투사의 이름은?", ChatColor.RED + "1. 갈리" + ChatColor.GRAY + " 2. 디마카에루스" + ChatColor.YELLOW + " 3. 프라에그나리" + ChatColor.AQUA + " 4. 레티아리우스");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "캑터스에서 판매하는 머스타드는 무슨 부위 아이템인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "캑터스에서 판매하는 머스타드는 무슨 부위 아이템인가?", ChatColor.RED + "1. 헬멧" + ChatColor.GRAY + " 2. 갑옷" + ChatColor.YELLOW + " 3. 각반" + ChatColor.AQUA + " 4. 신발");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "추가 데미지(인간형) 수치를 올려주는 보주는 무슨 색인가?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "추가 데미지(인간형) 수치를 올려주는 보주는 무슨 색인가?", ChatColor.RED + "1. 파란색" + ChatColor.GRAY + " 2. 보라색" + ChatColor.YELLOW + " 3. 초록색" + ChatColor.AQUA + " 4. 빨간색");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "티페라리 마지막 왕자의 이름은?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "티페라리 마지막 왕자의 이름은?", ChatColor.RED + "1. 에반" + ChatColor.GRAY + " 2. 루디" + ChatColor.YELLOW + " 3. 델론즈" + ChatColor.AQUA + " 4. 크리스");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "리디아 평원으로 쫒겨난 족장의 이름은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "리디아 평원으로 쫒겨난 족장의 이름은?", ChatColor.RED + "1. 리디아" + ChatColor.GRAY + " 2. 바람을 가르는 늑대" + ChatColor.YELLOW + " 3. 붉은 날개" + ChatColor.AQUA + " 4. 검은 날개");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 원시의 땅을 지키는 족장의 이름은?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 원시의 땅을 지키는 족장의 이름은?", ChatColor.RED + "1. 리디아" + ChatColor.GRAY + " 2. 바람을 가르는 늑대" + ChatColor.YELLOW + " 3. 붉은 날개" + ChatColor.AQUA + " 4. 검은 날개");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "붉은 날개를 지키는 정예병사의 이름은?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "붉은 날개를 지키는 정예병사의 이름은?", ChatColor.RED + "1. 포보르 정예병" + ChatColor.GRAY + " 2. 변이된 원시의 땅 정예벙" + ChatColor.YELLOW + " 3. 옛 것" + ChatColor.AQUA + " 4. 변이된 첨예발톱");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "바다 면과 대기면의 온도 차가 큰 곳에서 나타나는 현상으로 실제로는 없지만 있는 것처럼 보이는 현상은 무엇인가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "바다 면과 대기면의 온도 차가 큰 곳에서 나타나는 현상으로 실제로는 없지만 있는 것처럼 보이는 현상은 무엇인가?", ChatColor.RED + "1. 신기루" + ChatColor.GRAY + " 2. 아지랑이" + ChatColor.YELLOW + " 3. 호라이즌 현상" + ChatColor.AQUA + " 4. 에크모 현상");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "2018 자카르타 팔렘방 아시안 게임에서 첫 종목으로 채택된 무술은 무엇인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "2018 자카르타 팔렘방 아시안 게임에서 첫 종목으로 채택된 무술은 무엇인가?", ChatColor.RED + "1. 카포에라" + ChatColor.GRAY + " 2. 주짓수" + ChatColor.YELLOW + " 3. 무에타이" + ChatColor.AQUA + " 4. 가라데");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "고대 이집트에서는 왕을 뭐라고 불렀는가?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "고대 이집트에서는 왕을 뭐라고 불렀는가?", ChatColor.RED + "1. 아템" + ChatColor.GRAY + " 2. 유희" + ChatColor.YELLOW + " 3. 차르" + ChatColor.AQUA + " 4. 파라오");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "'윷'은 어떤 가축을 뜻하는가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "'윷'은 어떤 가축을 뜻하는가?", ChatColor.RED + "1. 소" + ChatColor.GRAY + " 2. 개" + ChatColor.YELLOW + " 3. 말" + ChatColor.AQUA + " 4. 양");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "한 쪽이 양보하지 않는 한, 둘 다 파국으로 치닫게 되는 상황을 가리키는 용어는 무엇인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "한 쪽이 양보하지 않는 한, 둘 다 파국으로 치닫게 되는 상황을 가리키는 용어는 무엇인가?", ChatColor.RED + "1. 윈윈게임" + ChatColor.GRAY + " 2. 제로섬게임" + ChatColor.YELLOW + " 3. 치킨게임" + ChatColor.AQUA + " 4. 파이게임");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "'애니메이션'이란, '이것'을 뜻하는 라틴어 '아니마'에서 유래되었다. '이것'은 무엇인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "'애니메이션'이란, '이것'을 뜻하는 라틴어 '아니마'에서 유래되었다. '이것'은 무엇인가?", ChatColor.RED + "1. 어린이" + ChatColor.GRAY + " 2. 웃음" + ChatColor.YELLOW + " 3. 영혼" + ChatColor.AQUA + " 4. 동작");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "운칠기삼은 '운'이 7할, '기'가 3할을 차지한다는 뜻이다. '기'는 무엇을 의미하는가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "운칠기삼은 '운'이 7할, '기'가 3할을 차지한다는 뜻이다. '기'는 무엇을 의미하는가?", ChatColor.RED + "1. 기운" + ChatColor.GRAY + " 2. 능력" + ChatColor.YELLOW + " 3. 응원" + ChatColor.AQUA + " 4. 노력");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "뉴스나 기사에서 특별히 알리는 소식을 '특보'라고 하는데, 그렇다면 기쁜 기별이나 소식은 뭐라고 하는가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "뉴스나 기사에서 특별히 알리는 소식을 '특보'라고 하는데, 그렇다면 기쁜 기별이나 소식은 뭐라고 하는가?", ChatColor.RED + "1. 낭보" + ChatColor.GRAY + " 2. 비보" + ChatColor.YELLOW + " 3. 오보" + ChatColor.AQUA + " 4. 바보");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "독일 뮌헨에서 열리는 민속축제인 '옥토버페스트'는 무슨 축제인가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "독일 뮌헨에서 열리는 민속축제인 '옥토버페스트'는 무슨 축제인가?", ChatColor.RED + "1. 맥주" + ChatColor.GRAY + " 2. 소세지" + ChatColor.YELLOW + " 3. 치즈" + ChatColor.AQUA + " 4. 토마토");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "이사, 결혼 등 큰 행사가 있는 날에 '손 없는 날'을 잡는다고 하는데, 여기서 손은 무엇을 뜻하는 말인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "이사, 결혼 등 큰 행사가 있는 날에 '손 없는 날'을 잡는다고 하는데, 여기서 손은 무엇을 뜻하는 말인가?", ChatColor.RED + "1. 바람" + ChatColor.GRAY + " 2. 귀신" + ChatColor.YELLOW + " 3. 나쁜 일" + ChatColor.AQUA + " 4. 바쁜 일");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "다음 중 시계의 시침과 분침이 이루는 내각의 크기가 가장 작은 시각은 언제인가?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "다음 중 시계의 시침과 분침이 이루는 내각의 크기가 가장 작은 시각은 언제인가?", ChatColor.RED + "1. 2시 30분" + ChatColor.GRAY + " 2. 4시" + ChatColor.YELLOW + " 3. 5시 50분" + ChatColor.AQUA + " 4. 1시 20분");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "낯선 곳에서 길을 잃거나 갑작스러운 사고로 119에 구조를 요청할 때 자신의 위치를 알릴 수 있는 기준이 되는 것은 무엇인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "낯선 곳에서 길을 잃거나 갑작스러운 사고로 119에 구조를 요청할 때 자신의 위치를 알릴 수 있는 기준이 되는 것은 무엇인가?", ChatColor.RED + "1. 신호등" + ChatColor.GRAY + " 2. 전봇대" + ChatColor.YELLOW + " 3. 맨홀" + ChatColor.AQUA + " 4. 구름");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "1992년, 세계 최초로 전송된 문자 메시지의 내용은 무엇인가?", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "1992년, 세계 최초로 전송된 문자 메시지의 내용은 무엇인가?", ChatColor.RED + "1. Hello" + ChatColor.GRAY + " 2. Hello World" + ChatColor.YELLOW + " 3. I love you" + ChatColor.AQUA + " 4. Merry Christmas");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "사물의 바탕이나 중심이 되는 중요한 것을 뜻하는 말 '근간'은 뿌리와 무엇을 의미하는가?", 0);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "사물의 바탕이나 중심이 되는 중요한 것을 뜻하는 말 '근간'은 뿌리와 무엇을 의미하는가?", ChatColor.RED + "1. 줄기" + ChatColor.GRAY + " 2. 잎사귀" + ChatColor.YELLOW + " 3. 열매" + ChatColor.AQUA + " 4. 꽃");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "고진감래, 감탄고토, 천신만고, 이 사자성어와 관계 깊은 감각은 무엇인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "고진감래, 감탄고토, 천신만고, 이 사자성어와 관계 깊은 감각은 무엇인가?", ChatColor.RED + "1. 시각" + ChatColor.GRAY + " 2. 미각" + ChatColor.YELLOW + " 3. 후각" + ChatColor.AQUA + " 4. 청각");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "표준국어대사전에 등록되어 있지 않은 감탄사는 무엇인가?", 2);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "표준국어대사전에 등록되어 있지 않은 감탄사는 무엇인가?", ChatColor.RED + "1. 얄라차" + ChatColor.GRAY + " 2. 에키" + ChatColor.YELLOW + " 3. 읏차" + ChatColor.AQUA + " 4. 어일싸");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "다음 중 바이러스로 감염되는 질병이 아닌 것은 무엇인가?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "다음 중 바이러스로 감염되는 질병이 아닌 것은 무엇인가?", ChatColor.RED + "1. 감기" + ChatColor.GRAY + " 2. 결핵" + ChatColor.YELLOW + " 3. A형 간염" + ChatColor.AQUA + " 4. 홍역");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "2020년 기준 경매 낙찰가가 가장 높은 작품은?", 1);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "2020년 기준 경매 낙찰가가 가장 높은 작품은?", ChatColor.RED + "1. 이중섭 <소>" + ChatColor.GRAY + " 2. 김환기 <Universe 5-IV-71 #200>" + ChatColor.YELLOW + " 3. 김환기 <고요 5-IV-73 #310>" + ChatColor.AQUA + " 4. 김환기 <3-II-72 #220>");
			question.put(ChatColor.WHITE + "" + ChatColor.BOLD + "연약하지만 묵묵히 반짝일 하나", 3);
			choice.put(ChatColor.WHITE + "" + ChatColor.BOLD + "연약하지만 묵묵히 반짝일 하나", ChatColor.RED + "1. 별" + ChatColor.GRAY + " 2. 꽃" + ChatColor.YELLOW + " 3. 생명" + ChatColor.AQUA + " 4. 마음");
			
			new BukkitRunnable() {
				int time = 0;
				int cntP = 0;
				int cnt = 0;
				String qu;
				
				Skeleton sk = skel;

				@Override
				public void run() {

					if (time % 400 == 60) {
						qu = randomKey(question);
						// 끝나는 조건
						try {
							for(Entity ent : sk.getNearbyEntities(30, 30, 30)) {
								if(ent instanceof Player) {
									cntP++;
								}
							}
							if(cntP == 0) {
								this.cancel();
							} else {
								cntP = 0;
							}
							
							if(sk.isDead()) {
								this.cancel();
							}
						} catch(Exception e) {
							
						}
						
						// 문제 보여주기
						try {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									if(!sk.isDead()) {
										all.sendMessage(qu);
										all.sendMessage(choice.get(qu));
									}
								}
							}
						} catch(Exception e) {
							
						}
					}
					
					if (time % 400 == 310) {
						// 답 맞추기
						int answer = question.get(qu);
						
						int currentCnt = cnt;
						
						if(answer == 0) {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									if(all.getLocation().add(0,-1,0).getBlock().getType() != Material.RED_WOOL && all.getLocation().add(0,-2,0).getBlock().getType() != Material.RED_WOOL) {
										cnt++;
									} else {
										player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.1f);
										sk.damage(5000000);
									}
								}
							}
						} else if(answer == 1) {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									if(all.getLocation().add(0,-1,0).getBlock().getType() != Material.LIGHT_GRAY_WOOL && all.getLocation().add(0,-2,0).getBlock().getType() != Material.LIGHT_GRAY_WOOL) {
										cnt++;
									} else {
										player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.1f);
										sk.damage(5000000);
									}
								}
							}
						} else if(answer == 2) {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									if(all.getLocation().add(0,-1,0).getBlock().getType() != Material.YELLOW_WOOL && all.getLocation().add(0,-2,0).getBlock().getType() != Material.YELLOW_WOOL) {
										cnt++;
									} else {
										player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.1f);
										sk.damage(5000000);
									}
								}
							}
						} else if(answer == 3) {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									if(all.getLocation().add(0,-1,0).getBlock().getType() != Material.BLUE_WOOL && all.getLocation().add(0,-2,0).getBlock().getType() != Material.BLUE_WOOL) {
										cnt++;
									} else {
										player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.1f);
										sk.damage(5000000);
									}
								}
							}
						} else {
							
						}
						
						if(cnt > currentCnt) {
							cnt = currentCnt + 1;
						}
						if(cnt != currentCnt) {
							for(Entity all : sk.getNearbyEntities(30, 30, 30)) {
								if(all instanceof Player) {
									Player p = (Player) all;
									if(p.getHealth() - (3*cnt+1) < 0) {
										p.setHealth(0);
										p.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "틀린 사람이 존재합니다.");
										p.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 0.1f);
									} else {
										p.setHealth(player.getHealth() - (cnt+1));
										p.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "틀린 사람이 존재합니다.");
										p.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1.0f, 0.1f);
									}
								}
							}
						}
						
					}

					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			
			new BossHealth().getBar34().setProgress(1.0);
			new BossHealth().getBar34().addPlayer(player);
			return;
		}

	}
	
	public String randomKey(HashMap<String, Integer> map) {
		List<String> keysAsArray = new ArrayList<String>(map.keySet());
		Random rnd = new Random();
		return keysAsArray.get(rnd.nextInt(keysAsArray.size()));
	}
	
}
