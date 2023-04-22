package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.Particle.DustOptions;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

public class PlayerHitGimmick {

	Random rnd = new Random();

	public void playerHitGimmick(Entity mob) {
		if(!mob.isGlowing()) {
			caveSpider(mob);
			galgori(mob);
			ironman(mob);
			dog(mob);
			ggul(mob);
			axe(mob);
			meat(mob);
			chainB(mob);
			kuroB(mob);
			carniB(mob);
			ironballB(mob);
			habaB(mob);
			chain(mob);
			kuro(mob);
			carni(mob);
			ironball(mob);
			haba(mob);
		}
	}

	//날아오르는 다리
	public void caveSpider(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "날아오르는 다리")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
			}
		}
	}
	
	//갈고리 사무소 해결사
	public void galgori(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "갈고리 사무소 해결사")) {
			int num = rnd.nextInt(6);
			
			//받아내보시지
			if (num == 0) {
				mob.setVelocity(mob.getFacing().getDirection().multiply(-0.3f));
				((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0,true,true));
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    	}
						
						if(time == 40) {
							mob.setVelocity(mob.getFacing().getDirection().add(new Vector(0,-0.5,0)).multiply(2.0f));
						}
						
						if(time >= 40 && mob.isOnGround()) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS001();
							// ================================================================
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 1, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(8);
									
									int num = rnd.nextInt(8);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	//철의 형제 
	public void ironman(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원")) {
			int num = rnd.nextInt(6);
			
			//저절단
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 40) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS002();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2, 1, 1, 1);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(6);
									
									int num = rnd.nextInt(5);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	//버림받은 개
	public void dog(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원")) {
			int num = rnd.nextInt(5);
			
			//충격 강타
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 40) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS003();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 1.5, 1, 1, 1);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									player.setVelocity(new Vector(0,0.9,0));
									
									int num = rnd.nextInt(7);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	//꿀꿀이네
	public void ggul(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원")) {
			int num = rnd.nextInt(5);
			
			//재료 사냥
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 40) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS004();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2, 1, 1, 1);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(9);
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 25, true, true));
									
									int num = rnd.nextInt(8);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	//도끼파
	public void axe(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원")) {
			int num = rnd.nextInt(7);
			
			//으깨기
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    	}
						
						if (time == 40) {
							mob.setVelocity(new Vector(0,1,0));
						}
						
						if (time >= 45 && mob.isOnGround()) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS005();
							// ================================================================
							
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 1, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(15);
									
									int num = rnd.nextInt(5);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	//정육점파
	public void meat(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원")) {
			int num = rnd.nextInt(6);
			
			//잔혹함
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    	}
						
						if (time >= 40) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS006();
							// ================================================================
							
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(12);
									
									int num = rnd.nextInt(7);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void chainB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 간부")) {
			int num = rnd.nextInt(4);
			
			//사슬 맛 좀 볼래?
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					Arrow arrow;
					World world;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    		world = mob.getWorld();
				    	}
						
						if (time == 20) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(16);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.3f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FISHING_BOBBER_THROW, 2.0f, 1.0f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.CRIT_MAGIC, arrow.getLocation(), 0);
						}
						
						if (time >= 30) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void kuroB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 카시라")) {
			int num = rnd.nextInt(3);
			
			//먹칠
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 30) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS007();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2, 2, 1, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(24);
									
									int num = rnd.nextInt(5);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void carniB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 전투원")) {
			int num = rnd.nextInt(4);
			
			//식사
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 25) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS008();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 3, 3, 3, 3);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(1);
									
									player.setVelocity(mob.getFacing().getDirection().add(new Vector(0,0.5,0)).multiply(-2.0f));
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void ironballB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 간부")) {
			int num = rnd.nextInt(5);
			
			//마!
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    	}
						
						if (time >= 30) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS009();
							// ================================================================
							
							List<Entity> nearPlayer = mob.getNearbyEntities(5, 3, 5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(1);
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, true));
									player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, true));
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void habaB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 간부")) {
			int num = rnd.nextInt(4);
			
			//매워!
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					Arrow arrow;
					World world;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    		world = mob.getWorld();
				    	}
						
						if (time == 20) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(0.01);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.3f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 1.0f, 0.2f);
							world.playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 0.8f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.FLAME, arrow.getLocation(), 0);
						}
						
						if (time >= 30) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void chain(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 조직원")) {
			int num = rnd.nextInt(6);
			
			//사슬 맛 좀 볼래?
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					Arrow arrow;
					World world;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    		world = mob.getWorld();
				    	}
						
						if (time == 20) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(16);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.3f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FISHING_BOBBER_THROW, 2.0f, 1.0f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.CRIT_MAGIC, arrow.getLocation(), 0);
						}
						
						if (time >= 30) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void kuro(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 와카슈")) {
			int num = rnd.nextInt(5);
			
			//먹칠
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 30) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS007();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2, 2, 1, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(24);
									
									int num = rnd.nextInt(5);
									if(num == 0) {
										int item = 0;
										if (player.getInventory().getHelmet() != null) {
											if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
												item = 1;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
												item = 2;
											} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
												item = 3;
											}
										}
										
										int num2 = rnd.nextInt(10);
										if(item == 0) {
											damageMaxHealth(player, 1);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 1);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 1);
											}
										}
									}
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void carni(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 재단사")) {
			int num = rnd.nextInt(6);
			
			//식사
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 25) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS008();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 3, 3, 3, 3);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(1);
									
									player.setVelocity(mob.getFacing().getDirection().add(new Vector(0,0.5,0)).multiply(-2.0f));
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void ironball(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 조직원")) {
			int num = rnd.nextInt(6);
			
			//마!
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    	}
						
						if (time >= 30) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS009();
							// ================================================================
							
							List<Entity> nearPlayer = mob.getNearbyEntities(5, 3, 5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(1);
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, true));
									player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, true));
								}
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void haba(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 조직원")) {
			int num = rnd.nextInt(6);
			
			//매워!
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					Arrow arrow;
					World world;

				    @Override
					public void run() {
				    	
				    	if(time == 0) {
				    		mob.setGlowing(true);
				    		world = mob.getWorld();
				    	}
						
						if (time == 20) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(0.01);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.3f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 1.0f, 0.2f);
							world.playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 0.8f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.FLAME, arrow.getLocation(), 0);
						}
						
						if (time >= 30) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public List<Entity> nearFrontEntities(Entity mob, double dist, int x, int y, int z) {
		Location normal = mob.getLocation();
		Location e1;
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, 1, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) mob.getWorld().spawnEntity(e1, EntityType.ARMOR_STAND);
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
	
	public void damageMaxHealth(Player player, int num) {
		if(player.getMaxHealth() <= num) {
			player.setMaxHealth(1);
			player.setHealth(0);
		} else {
			player.setMaxHealth(player.getMaxHealth() - num);
		}
	}

	public void sendMessage(Player player, String msg) {
		List<Entity> entitylist = player.getNearbyEntities(30, 10, 30);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.sendMessage(msg);
			}
		}
	}

}