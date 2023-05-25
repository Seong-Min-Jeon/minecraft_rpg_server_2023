package testPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.bukkit.inventory.meta.ItemMeta;
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
				} else if(name.equals("쐐기 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쾌속 찌르기");
							skill15(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "섬광의 창");
							skill16(player);
						}
					}
				} else if(name.equals("시선 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "전기 충격");
							skill17(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1600);
						if (bool) {
							sendPacket(player, "피할 수 없는 시선");
							skill18(player);
						}
					}
				} else if(name.equals("쥐의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쥐의 생존법");
							skill19(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1000);
						if (bool) {
							sendPacket(player, "내장담기");
							skill20(player);
						}
					}
				} else if(name.equals("철의 형제의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 900);
						if (bool) {
							sendPacket(player, "저절단");
							skill21(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "이인생 한방");
							skill22(player);
						}
					}
				} else if(name.equals("버림받은 개의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1500);
						if (bool) {
							sendPacket(player, "충격 강타");
							skill23(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2700);
						if (bool) {
							sendPacket(player, "됐고!");
							skill24(player);
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
					arrow.setDamage(damage(player, 2, true, true));
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
					arrow.setDamage(damage(player, 2, true, true));
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
	
	public void skill15(Player player) {
		new ParticleEffect(player).pS007();
		
		double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
        }
        
        List<Entity> entitylist;
        
        if (0 <= rotation && rotation < 45) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else if (45 <= rotation && rotation < 135) {
        	entitylist = near4RotsEntities(player, 3.5, 1.2, 1, 0.3);
        } else if (135 <= rotation && rotation < 225) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else if (225 <= rotation && rotation < 315) {
        	entitylist = near4RotsEntities(player, 3.5, 1.2, 1, 0.3);
        } else if (315 <= rotation && rotation < 360) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else {
        	entitylist = near4RotsEntities(player, 0.1, 0.1, 0.1, 0.1);
        }
		
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3); 
			}
		}
	}
	
	public void skill16(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6,0,1.6).add(new Vector(0,0.2,0))));
		
		new ParticleEffect(player).pS008();
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
		    	if(time == 5) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.5, 1, 0.5);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 10) {
		    		new ParticleEffect(player).pS008_1();
		    		
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.5, 1, 0.5);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 15) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.5, 1, 0.5);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time >= 20) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.5, 1, 0.5);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    		this.cancel();
		    	}
		    	
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		player.setNoDamageTicks(20);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
	}
	
	public void skill17(Player player) {
		new ParticleEffect(player).pS009();
		
		List<Entity> entitylist = player.getNearbyEntities(1.5, 1.5, 1.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
			}
		}
	}
	
	public void skill18(Player player) {
		new ParticleEffect(player).pS010();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1);
				
				if(nearMob instanceof Player) {
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ이름: " + ((Player) nearMob).getDisplayName());
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ체력: " + nearMob.getHealth());
				} else if(nearMob instanceof Mob && !(nearMob instanceof ArmorStand)) {
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ이름: " + nearMob.getCustomName());
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ체력: " + nearMob.getHealth()*10);
					if(nearMob.getCustomName().substring(0, 2).equals("§a")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 전설이나 그 이하");						
					} else if(nearMob.getCustomName().substring(0, 2).equals("§e")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 질병");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§c")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 악몽");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§5")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시의 별이나 그 이상");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§f")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 측정된 자료 없음");
					}
				}
				
			}
		}
	}
	
	public void skill19(Player player) {
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					player.setNoDamageTicks(12);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 12, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}

				if(time >= 10) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill20(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new ParticleEffect(player).pS011();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				double hel = nearMob.getHealth();
				double dam = damage(player, nearMob, 2, true);
				
				if(hel <= dam) {
					ItemStack food = new ItemStack(Material.BEEF);
					ItemMeta foodIm = food.getItemMeta();
					foodIm.setDisplayName(ChatColor.RED + "누군가의 살점");
					ArrayList<String> foodLore = new ArrayList<>();
					foodLore.add(ChatColor.GRAY + "뒷골목에서 채취한 신선한 고기");
					foodLore.add(ChatColor.GRAY + "");
					foodLore.add(ChatColor.GRAY + "호사유피 인사유명이라 하였소.");
					foodLore.add(ChatColor.GRAY + "혈에는 말갛게 꽃이 피었소.");
					foodLore.add(ChatColor.GRAY + "이런 척박한 도시에서도 결국");
					foodLore.add(ChatColor.GRAY + "봉오리는 피우는구려.");
					foodIm.setLore(foodLore);
					food.setItemMeta(foodIm);
					player.getInventory().addItem(food);
				}
			}
		}
	}
	
	public void skill21(Player player) {
		new ParticleEffect(player).pS012();
		
		List<Entity> entitylist = nearFrontEntities(player, 2, 1, 1, 1);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
			}
		}
	}
	
	public void skill22(Player player) {
		new ParticleEffect(player).pS013();
		
		List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, player.getHealth()-0.9);
			}
		}
		
		player.setHealth(1);
	}
	
	public void skill23(Player player) {
		new ParticleEffect(player).pS014();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3);
				nearMob.setVelocity(new Vector(0,0.9,0));
			}
		}
	}
	
	public void skill24(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
				}
				
				if(time == 20) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
				}

				if(time >= 40) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	
	
	
	
	
	public void damage(Player player, LivingEntity mob, double dam) {
		if(mob instanceof ArmorStand) {
			return;
		}
		
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if(player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch(Exception e2) {
					
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
		
		finalDamage += dam*0.1*personality;
		
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
		
		finalDamage += dam * damUP * 0.01;
		
		
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
			mob.damage(finalDamage * 2);
			
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
			mob.damage(finalDamage);
			
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
	
	public double damage(Player player, LivingEntity mob, double dam, boolean ret) {
		if(mob instanceof ArmorStand) {
			return 0;
		}
		
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if (player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch (Exception e2) {

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
		
		finalDamage += dam*0.1*personality;
		
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
		
		finalDamage += dam * damUP * 0.01;
		
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
			mob.damage(finalDamage * 2);
			
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
			return dam*2;
		} else {
			mob.damage(finalDamage);
			
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
			return dam;
		}
	}
	
	public double damage(Player player, double dam, boolean ret, boolean proj) {
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if (player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch (Exception e2) {
			
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
		
		finalDamage += dam*0.1*personality;
		
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
		
		finalDamage += dam * damUP * 0.01;
		
		return finalDamage;
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
	
	public List<Entity> near4RotsEntities(Player player, double dist, double x, double y, double z) {
		Location normal = player.getLocation();
		Location e1;
		
		double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
        }
        
        Float yaw;
        
        if (0 <= rotation && rotation < 45) {
        	yaw = (float) 0;
        } else if (45 <= rotation && rotation < 135) {
        	yaw = (float) 90;
        } else if (135 <= rotation && rotation < 225) {
        	yaw = (float) 180;
        } else if (225 <= rotation && rotation < 315) {
        	yaw = (float) 270;
        } else if (315 <= rotation && rotation < 360) {
        	yaw = (float) 0;
        } else {
        	yaw = (float) 0;
        }
		
		double arrowAngle1 = 180;
		double totalAngle1 = yaw + arrowAngle1;
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
