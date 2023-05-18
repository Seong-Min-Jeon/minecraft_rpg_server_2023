package testPack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class Skill {
	
	private int sleep = 0;
	Player player = null;
	World world = null;
	Random rnd = new Random();
	int personality = 0;
	private static Map<Player, Integer> timer = new HashMap<>();
	private static Map<Player, Integer> timer2 = new HashMap<>();

	public void effect(Player player, String rot) {
		
		boolean bool = false;
		
		try {
			if(!player.isSwimming()) {
				String name = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
				world = player.getWorld();
				
				if(name.equals("평범한 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 500);
						if (bool) {
							sendPacket(player, "가벼운 공격");
							skill1(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "가벼운 방어");
							skill2(player);
						}
					}
				} else if(name.equals("윤 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "회피 공격");
							skill3(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1500);
						if (bool) {
							sendPacket(player, "재빠름");
							skill4(player);
						}
					}
				} else if(name.equals("갈고리 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "압도");
							skill5(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "받아내보시지");
							skill6(player);
						}
					}
				} else if(name.equals("가로등 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쳐내기");
							skill7(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 6000);
						if (bool) {
							sendPacket(player, "연속 방어");
							skill8(player);
						}
					}
				} else if(name.equals("어금니 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 600);
						if (bool) {
							sendPacket(player, "도박수");
							skill9(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 20000);
						if (bool) {
							sendPacket(player, "신속보법");
							skill10(player);
						}
					}
				} else if(name.equals("마침표 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "발사");
							skill11(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "무차별 사격");
							skill12(player);
						}
					}
				} else if(name.equals("새벽 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "노을빛 검");
							skill13(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 20000);
						if (bool) {
							sendPacket(player, "쌍화차 보충");
							skill14(player);
						}
					}
				}
				
			}
		} catch(Exception e) {
			
		}
	}
	
	public void skill1(Player player) {
		new ParticleEffect(player).pS001();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
			}
		}
	}
	
	public void skill2(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.setNoDamageTicks(15 + (personality*1));
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 15 + (personality*1), 0, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
	}
	
	public void skill3(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.1,0,1.1).add(new Vector(0,0.1,0))));
				}

				if(time >= 10) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2.5);
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill4(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6+(0.02*personality),0,1.6+(0.02*personality)).add(new Vector(0,0.2,0))));
	}
	
	public void skill5(Player player) {
		new ParticleEffect(player).pS002();
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.5, 1, 0.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3);
			}
		}
	}
	
	public void skill6(Player player) {
		player.setVelocity(player.getFacing().getDirection().multiply(-0.3f));
		player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0, true, false, true));
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
				if(time == 40) {
					player.setVelocity(player.getFacing().getDirection().add(new Vector(0,-0.5,0)).multiply(2.0f));
					
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}
				
				if(time >= 40 && player.isOnGround()) {
					new ParticleEffect(player).pS003();
					
					List<Entity> entitylist = player.getNearbyEntities(1.5, 1, 1.5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 3.5);
						}
					}
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill7(Player player) {
		new ParticleEffect(player).pS004();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.6, 1, 0.6);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
				nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.3,0,1.3).add(new Vector(0,0.2,0))));
			}
		}
	}
	
	public void skill8(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
				if(time == 0) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				} 
				
				if(time == 20) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}
				
				if(time == 40) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}
				
				if(time >= 60) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill9(Player player) {
		new ParticleEffect(player).pS005();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, rnd.nextInt(10)*0.1*rnd.nextInt(6)+0.1); 
			}
		}
	}
	
	public void skill10(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200 + (personality*10), 1, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 3.0f, 1.0f);
	}
	
	public void skill11(Player player) {
		if(player.getLevel() < 1000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 1000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setDamage(2 + (2*0.1*personality));
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 6) {
					arrow.remove();
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill12(Player player) {
		if(player.getLevel() < 5000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 5000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			int repeat = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					Location normal = player.getEyeLocation();
					
					double arrowAngle1 = rnd.nextInt(91) + 45;
			        double totalAngle1 = normal.getYaw() + arrowAngle1;
			        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(1.2f);
					arrow = player.launchProjectile(Arrow.class, arrowDir1);
					arrow.setShooter(player);
					arrow.setDamage(2 + (2*0.1*personality));
					arrow.setVelocity(arrowDir1.multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 6) {
					arrow.remove();
				}
				
				if(repeat == 5 && time >= 6) {
					this.cancel();
				}
				
				time++;
				
				if(time >= 7) {
					time = 0;
					repeat++;
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill13(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new ParticleEffect(player).pS006();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.6, 1, 0.6);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1); 
				
				if(nearMob instanceof Mob || nearMob instanceof Player) {
					new BukkitRunnable() {
						int time = 0;

					    @Override
						public void run() {
					    	
					    	if(time == 1) {
					    		nearMob.setFireTicks(100);
					    		this.cancel();
					    	}
					    	
							time++;
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					
					new FireDamageList().putMap(nearMob, 0.5+(personality*0.05));
				}
			}
		}
	}
	
	public void skill14(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200 + (personality*10), 0, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1.0f, 1.0f);
	}
	
	
	public void damage(Player player, LivingEntity mob, double dam) {
		if(mob instanceof ArmorStand) {
			return;
		}
		
		int personality = 0;
		//인격에 따른 데미지 증폭 계산
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		dam = dam + (dam*0.1*personality);
		
		int damUP = 0; //10이면 10%증가
		//유물에 따른 데미지 증폭 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 기량 반지")) {
					damUP = 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 기량 반지")) {
					damUP = 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 기량 반지")) {
					damUP = 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 기량 반지")) {
					damUP = 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 기량 반지")) {
					damUP = 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 기량 반지")) {
					damUP = 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 기량 반지")) {
					damUP = 70;
				}
			}
		} catch(Exception e2) {
			
		}
		
		dam = dam * (100+damUP) * 0.01;
		
		//크리티컬 계산
		int crit = 10;
		//유물에 따른 크리티컬 확률 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 신비 반지")) {
					crit += 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 신비 반지")) {
					crit += 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 신비 반지")) {
					crit += 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 신비 반지")) {
					crit += 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 신비 반지")) {
					crit += 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 신비 반지")) {
					crit += 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 신비 반지")) {
					crit += 70;
				}
			}
		} catch (Exception e2) {

		}
		
		int num = rnd.nextInt(100);
		if(num < crit) {
			mob.damage(dam * 2);
			
			if(mob instanceof Mob) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ede900") + Integer.toString((int) Math.round(dam*2*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
		} else {
			mob.damage(dam);
			
			if(mob instanceof Mob) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ebebeb") + Integer.toString((int) Math.round(dam*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
		}
	}
	
	public List<Entity> nearFrontEntities(Player player, double dist, double x, double y, double z) {
		Location normal = player.getLocation();
		Location e1;
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, 1, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) world.spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setSmall(true);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				time++;
				
				if(time >= 3) {
					as.remove();
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		return as.getNearbyEntities(x, y, z);
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
	
	public void skill1OLD(Player player, int up) {
		ThreadSkill t = new ThreadSkill(player.getUniqueId());
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			int time = 0;
			int personality = 0;
			
			@Override
			public void run() {
				if (!t.hasID()) {
					t.setID(sleep);
				}
				
				if(time==0) {
					try {
						ItemStack item = player.getInventory().getItem(7);
						String name = item.getItemMeta().getDisplayName();
						personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
					} catch(Exception e2) {
						
					}
				}
			
				if(time>=3) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 2, 1, 1, 1);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2);
							nearMob.damage(2 + personality*0.2);
						}
					}
					t.endTask(); 
					t.removeID();
				} 
				
				time++;
			}						
			
		}, 0, 1);
	}
	
}
