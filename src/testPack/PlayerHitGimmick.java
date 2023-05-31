package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.GameMode;
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
import org.bukkit.inventory.meta.LeatherArmorMeta;
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
			thumb(mob);
			index(mob);
			laugh(mob);
			mariachi(mob);
			thumbB(mob);
			indexB(mob);
			laughB(mob);
			mariachiB(mob);
			kong(mob);
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
				((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0, true, false, true));
				
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
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 25, true, false, true));
									
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
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.6f));	
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
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, false, true));
									player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, false, true));
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
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.6f));	
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
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.6f));	
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
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, false, true));
									player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, false, true));
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
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.6f));	
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
	
	public void thumb(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "엄지 솔다토")) {
			int num = rnd.nextInt(7);
			
			//총검술
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS010();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2.5, 1.2, 1.2, 1.2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(35);
									
									int num = rnd.nextInt(3);
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
			
			//충격탄
			if (num == 1) {
				
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
							arrow.setDamage(0.02);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.9f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 1.5f);
							world.playSound(mob.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 1.0f, 1.0f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.END_ROD, arrow.getLocation(), 0);
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
	
	public void index(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검지 수행자")) {
			int num = rnd.nextInt(7);
			
			//지령이 향하는 곳
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
						}
						
						if (time >= 30) {
							mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//처형
			if (num == 1) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS011();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2.5, 2.5, 2, 2.5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(45);
									
									int num = rnd.nextInt(2);
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
	
	public void laugh(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "웃는 얼굴들")) {
			int num = rnd.nextInt(7);
			
			//포뜨기
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS012();
							// ================================================================
							
							if(mob instanceof Mob) {
								((Mob) mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
							}
						}
						
						if (time == 22) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 22) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 32) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 40) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 45) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 50) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 60) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(40);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time >= 61) {
							if(mob instanceof Mob) {
								((Mob) mob).removePotionEffect(PotionEffectType.SPEED);
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//깊은 숨결
			if (num == 1) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS013();
							// ================================================================
						}
						
						if (time >= 41) {
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void mariachi(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 조직원")) {
			int num = rnd.nextInt(7);
			
			//흥겨운 찌르기
			if (num <= 1) {
				
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
						
						if (time == 15) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(30);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.5f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FISHING_BOBBER_THROW, 2.0f, 1.0f);
						}
						
						if (time >= 15) {
							world.spawnParticle(Particle.NOTE, arrow.getLocation(), 0);
						}
						
						if (time >= 26) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//정열의 춤
			if (num == 2) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time % 10 == 0) {
							mob.getLocation().setDirection(new Vector(rnd.nextInt(360),rnd.nextInt(360),rnd.nextInt(360)));
						}
						
						if (time % 20 == 0) {
							mob.setVelocity(new Vector(0,0.2,0));
						}
						
						if (time >= 100) {
							List<Entity> nearPlayer = mob.getNearbyEntities(5, 5, 5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(50);
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 10, true, false, true));
								}
							}
							mob.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, mob.getLocation(), 0);
							mob.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 0.4f);
							
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void thumbB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "규율을 따르는 엄지 솔다토")) {
			int num = rnd.nextInt(5);
			
			//총검술
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS010();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2.5, 1.2, 1.2, 1.2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(35);
									
									int num = rnd.nextInt(3);
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
			
			//충격탄
			if (num == 1) {
				
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
							arrow.setDamage(0.02);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.9f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 1.5f);
							world.playSound(mob.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 1.0f, 1.0f);
						}
						
						if (time >= 20) {
							world.spawnParticle(Particle.END_ROD, arrow.getLocation(), 0);
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
	
	public void indexB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "신념이 강한 검지 수행자")) {
			int num = rnd.nextInt(5);
			
			//지령이 향하는 곳
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
						}
						
						if (time >= 30) {
							mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//처형
			if (num == 1) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time >= 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS011();
							// ================================================================
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2.5, 2.5, 2, 2.5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(45);
									
									int num = rnd.nextInt(2);
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
	
	public void laughB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "연기에 중독된 웃는 얼굴들")) {
			int num = rnd.nextInt(5);
			
			//포뜨기
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS012();
							// ================================================================
							
							if(mob instanceof Mob) {
								((Mob) mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
							}
						}
						
						if (time == 22) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 32) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 40) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 45) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 50) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(10);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time == 60) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(40);
									
									int num = rnd.nextInt(1);
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
						}
						
						if (time >= 61) {
							if(mob instanceof Mob) {
								((Mob) mob).removePotionEffect(PotionEffectType.SPEED);
							}
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//깊은 숨결
			if (num == 1) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							// ===============================================================
							ParticleData pd = new ParticleData(mob.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(mob);
							pe.mobS013();
							// ================================================================
						}
						
						if (time >= 41) {
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void mariachiB(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 간부")) {
			int num = rnd.nextInt(5);
			
			//흥겨운 찌르기
			if (num <= 1) {
				
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
						
						if (time == 15) {
							arrow = ((Mob) mob).launchProjectile(Arrow.class);
							arrow.setShooter(((Mob) mob));
							arrow.setDamage(30);
							arrow.setVelocity(mob.getLocation().getDirection().multiply(0.5f));	
							arrow.setGravity(false);
							
							world.playSound(mob.getLocation(), Sound.ENTITY_FISHING_BOBBER_THROW, 2.0f, 1.0f);
						}
						
						if (time >= 15) {
							world.spawnParticle(Particle.NOTE, arrow.getLocation(), 0);
						}
						
						if (time >= 26) {
							arrow.remove();
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
			//정열의 춤
			if (num == 2) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time % 10 == 0) {
							mob.getLocation().setDirection(new Vector(rnd.nextInt(360),rnd.nextInt(360),rnd.nextInt(360)));
						}
						
						if (time % 20 == 0) {
							mob.setVelocity(new Vector(0,0.2,0));
						}
						
						if (time >= 100) {
							List<Entity> nearPlayer = mob.getNearbyEntities(5, 5, 5);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(50);
									
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 10, true, false, true));
								}
							}
							mob.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, mob.getLocation(), 0);
							mob.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 0.4f);
							
							mob.setGlowing(false);
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void kong(Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "콩콩이파 조직원")) {
			int num = rnd.nextInt(5);
			
			//후비기
			if (num == 0) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 5) {
							mob.setVelocity(mob.getFacing().getDirection().multiply(1.5f));
						}
						
						if (time >= 15) {
							summonEffectTracking(mob, 0.2, 0, 1000, 1005, 2);
							
							List<Entity> nearPlayer = nearFrontEntities(mob, 2, 2, 1.5, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(60);
									
									int num = rnd.nextInt(1);
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
			
			//난도질
			if (num == 1) {
				
				new BukkitRunnable() {
					int time = 0;
					
				    @Override
					public void run() {
						
						if (time == 0) {
							mob.setGlowing(true);
						}
						
						if (time == 20) {
							summonEffectTracking(mob, 0, 0, 1010, 1033, 1);
							if(mob instanceof Mob) {
								((Mob) mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, false, false));
							}
						}
						
						if (time == 22) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(40);
									
									int num = rnd.nextInt(1);
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
											damageMaxHealth(player, 2);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 2);
											}
										}
									}
								}
							}
						}
						
						if (time == 32) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(40);
									
									int num = rnd.nextInt(1);
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
											damageMaxHealth(player, 2);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 2);
											}
										}
									}
								}
							}
						}
						
						if (time == 43) {
							List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
							for(Entity e : nearPlayer) {
								if(e instanceof Player) {
									Player player = (Player) e;
									player.damage(40);
									
									int num = rnd.nextInt(1);
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
											damageMaxHealth(player, 2);
										} else if(item == 1) {
											if(num2 >= 1) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 2) {
											if(num2 >= 3) {
												damageMaxHealth(player, 2);
											}
										} else if(item == 3) {
											if(num2 >= 5) {
												damageMaxHealth(player, 2);
											}
										}
									}
								}
							}
						}
						
						if (time >= 45) {
							if(mob instanceof Mob) {
								((Mob) mob).removePotionEffect(PotionEffectType.SPEED);
								((Mob) mob).addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
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
	
	public List<Entity> nearFrontEntities(Entity mob, double dist, double x, double y, double z) {
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
	
	public void summonEffect(Entity mob, double dist, int y, int sF, int eF, int speed) {
		Location normal = mob.getLocation();
		Location e1;
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, y, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) mob.getWorld().spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		new BukkitRunnable() {
			int time = 0;
			int cnt = eF - sF + 1;
			int cur = 0;
			
			@Override
			public void run() {
				if(time >= speed*cnt+speed) {
					as.remove();
					this.cancel();
				}
				
				if(time % speed == 0) {
					EntityEquipment effect = as.getEquipment();
					ItemStack effectItem = new ItemStack(Material.MUSIC_DISC_5);
					ItemMeta effectmeta = effectItem.getItemMeta();
					effectmeta.setCustomModelData(sF + cur);
					effectItem.setItemMeta(effectmeta);
					effect.setHelmet(effectItem);
					
					cur++;
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void summonEffectTracking(Entity mob, double dist, int y, int sF, int eF, int speed) {
		Location normal = mob.getLocation();
		Location e1;
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, y, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) mob.getWorld().spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		mob.addPassenger(as);
		new BukkitRunnable() {
			int time = 0;
			int cnt = eF - sF + 1;
			int cur = 0;
			
			@Override
			public void run() {
				if(time >= speed*cnt+speed) {
					as.remove();
					this.cancel();
				}
				
				if(time % speed == 0) {
					EntityEquipment effect = as.getEquipment();
					ItemStack effectItem = new ItemStack(Material.MUSIC_DISC_5);
					ItemMeta effectmeta = effectItem.getItemMeta();
					effectmeta.setCustomModelData(sF + cur);
					effectItem.setItemMeta(effectmeta);
					effect.setHelmet(effectItem);
					
					cur++;
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void damageMaxHealth(Player player, int num) {
		if(!player.hasPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE) && player.getGameMode() != GameMode.SPECTATOR && player.getGameMode() != GameMode.CREATIVE) {
			if(num == 1) {
				if(player.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
					if(player.getMaxHealth() <= 2) {
						player.setMaxHealth(1);
						player.setHealth(0);
					} else {
						player.setMaxHealth(player.getMaxHealth() - 2);
					}
					player.removePotionEffect(PotionEffectType.FAST_DIGGING);
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 0, true, false, true));
				}
			} else {
				if(player.getMaxHealth() <= num) {
					player.setMaxHealth(1);
					player.setHealth(0);
				} else {
					player.setMaxHealth(player.getMaxHealth() - num);
				}
			}
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