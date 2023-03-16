package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class ParticleEffect {

	private int taskID;
	private final Player player;
	private Entity ent;
	private int damNum = 0;
	
	public ParticleEffect(Player player) {
		this.player = player;
	}
	
	public ParticleEffect(Player player, int damNum) {
		this.player = player;
		this.damNum = damNum;
	}
	
	public ParticleEffect(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
	}
	
	public void verticalCircle() {

		Location normal = player.getEyeLocation();
		World world = player.getWorld();

		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 0), 1);

		new BukkitRunnable() {
			int time = 0;

			Location e1;

			@Override
			public void run() {

				if (time % 4 == 0) {

					double var = 0;
					
					double totalAngle1 = normal.getYaw();
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*2*dirX1, Math.sin(var)*2, Math.cos(var)*2*dirZ1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}

				}

				if (time >= 20) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void verticalEllipse() {

		Location normal = player.getEyeLocation();
		World world = player.getWorld();

		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 0), 1);

		new BukkitRunnable() {
			int time = 0;

			Location e1;

			@Override
			public void run() {

				if (time % 4 == 0) {

					double var = 0;

					for (int i = 0; i < 32; i++) {
						e1 = normal.clone().add(Math.cos(var) * 2, Math.sin(var) * 2, Math.cos(var) * 2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);

						var += Math.PI / 16;
					}

				}

				if (time >= 20) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void spaceEllipse() {

		Location normal = player.getEyeLocation();
		World world = player.getWorld();

		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 0), 1);

		new BukkitRunnable() {
			int time = 0;

			Location e1;

			@Override
			public void run() {

				if (time % 4 == 0) {

					double var = 0;

					for (int i = 0; i < 32; i++) {
						e1 = normal.clone().add(Math.cos(var) * 2, Math.sin(var) * 2, Math.sin(var) * 2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);

						var += Math.PI / 16;
					}
					
					for (int i = 0; i < 32; i++) {
						e1 = normal.clone().add(Math.cos(var) * 2, Math.cos(var) * 2, Math.sin(var) * 2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);

						var += Math.PI / 16;
					}

				}

				if (time >= 20) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 토템
	public void newEffect0() {
		
		Location normal = ent.getLocation();
		World world = ent.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 150) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void newEffect1() {
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
		
		double arrowAngle1 = 73;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = 90;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 107;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.YELLOW, 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 3.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				Location e1, e2, e3;
				
				if(time % 1 == 0 && time <= 13) {
					e1 = normal.clone().add(dirX1*4, 1.5-(time*0.15), dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions);
					
					e2 = normal.clone().add(dirX2*4, 1.5-(time*0.15), dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e2, 10, dustOptions);
					
					e3 = normal.clone().add(dirX3*4, 1.5-(time*0.15), dirZ3*4);
					world.spawnParticle(Particle.REDSTONE, e3, 10, dustOptions);
				}
				
				if(time == 13) {
					e1 = normal.clone().add(dirX1*4, 1-(time*0.15), dirZ1*4);
					e2 = normal.clone().add(dirX2*4, 1-(time*0.15), dirZ2*4);
					e3 = normal.clone().add(dirX3*4, 1-(time*0.15), dirZ3*4);
					world.playSound(normal, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e1, 0);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e2, 0);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e3, 0);
				}
				
				if(time >= 23) {
					e1 = normal.clone().add(dirX1*4, -1.5, dirZ1*4);
					e2 = normal.clone().add(dirX2*4, -1.5, dirZ2*4);
					e3 = normal.clone().add(dirX3*4, -1.5, dirZ3*4);
					Material mat = player.getLocation().add(0,-1,0).getBlock().getType();
					try {
						player.getWorld().playEffect(e1, Effect.STEP_SOUND, mat);
						player.getWorld().playEffect(e2, Effect.STEP_SOUND, mat);
						player.getWorld().playEffect(e3, Effect.STEP_SOUND, mat);
					} catch(Exception e) {
						player.getWorld().playEffect(e1, Effect.STEP_SOUND, Material.GRASS_BLOCK);
						player.getWorld().playEffect(e2, Effect.STEP_SOUND, Material.GRASS_BLOCK);
						player.getWorld().playEffect(e3, Effect.STEP_SOUND, Material.GRASS_BLOCK);
					}
					
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

		//1.12는 아래 코드가 옳다고 함
//		player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0,255,255,255,1);
//		player.getWorld().spawnParticle(Particle.REDSTONE, e2, 0,255,255,255,1);
		
	}
	
	public void newEffect2() {
		World world = player.getWorld(); 
		Location loc = player.getLocation();
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time < 3) {
					double r = time + 0.5;
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 15) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 30) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							loc.add(x, y, z);
							world.spawnParticle(Particle.CRIT, loc, 0);
							loc.subtract(x, y, z);
						}
					}
				}
				
				if(time >= 13) {
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, loc.add(0,1,0), 0);
					
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}

	// 원시의 질주
	public void newEffect3() {
		
		new BukkitRunnable() {
			int time = 0;
			
			World world = player.getWorld(); 
			Location e1, e3;
	        
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 0;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle3 = 180;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
				
				e1 = normal.clone().add(dirX1, 0, dirZ1);
				world.spawnParticle(Particle.END_ROD, e1, 0);

				e3 = normal.clone().add(dirX3, 0, dirZ3);
				world.spawnParticle(Particle.END_ROD, e3, 0);

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 본 체스트
	public void newEffect4() {
		
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(160, 160, 160), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(120, 120, 120), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
			Location e1, e3;
			
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				if(time == 0) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 40+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 115+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 120+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 125+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}
				
				if(time == 20) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 50+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 105+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 110+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 115+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}
				
				if(time == 40) {
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, 0.3-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, 0.1-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.2-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.4-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 60+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*2, -0.6-(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						e1 = normal.clone().add(dirX1*2, -0.8-(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 25 ; i++) {
						
						double arrowAngle1 = 95+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, 0.05+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.025+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 20 ; i++) {
						
						double arrowAngle1 = 100+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.45+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.525+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int i = 0 ; i < 15 ; i++) {
						
						double arrowAngle1 = 105+i;
						double totalAngle1 = normal.getYaw() + arrowAngle1;
						double dirX1 = Math.cos(Math.toRadians(totalAngle1));
						double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e3 = normal.clone().add(dirX1*2, -0.85+(0.01*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
						
						e3 = normal.clone().add(dirX1*2, -0.925+(0.005*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
				}

				if(time >= 60) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 뼈감옥
	public void newEffect5() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
		//디버프 컬러
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 20, 150), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 100, 200), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(50, 0, 50), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e2 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e2 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 4) {
						size = -1;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						if(i % 4 == 0) {
							e3 = e1.clone().add(0,5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,4.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,4,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,3.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,3,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,2.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,2,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,1.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,1,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
							e3 = e1.clone().add(0,0.5,0);
							player.getWorld().spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
						}
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 차지 어택
	public void newEffect6() {
		
		World world = player.getWorld(); 
		Inheritance inheritance = new Inheritance();
        
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time == 0) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
							
							if(inheritance.getInheritance(player) == 44) {
								if(ent instanceof Monster) {
									ent.setVelocity(new Vector(0,1,0));
								}
							}
						}
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
				}
				
				if(time == 10) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
							
							if(inheritance.getInheritance(player) == 44) {
								if(ent instanceof Monster) {
									ent.setVelocity(new Vector(0,1,0));
								}
							}
						}
					}		
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
				}

				if(time >= 20) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*8);
							
							if(inheritance.getInheritance(player) == 44) {
								if(ent instanceof Monster) {
									ent.setVelocity(new Vector(0,1,0));
								}
							}
						}
					}		
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 0.5f);
					player.getWorld().spawnParticle(Particle.EXPLOSION_NORMAL, normal, 1);
					player.getWorld().spawnParticle(Particle.FLAME, normal, 2);
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 전투의 의지
	public void newEffect7() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(250, 100, 100), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e4, 2, dustOptions3);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 50 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions2);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 15 ; j++) {
						e2 = normal.clone().add(dirX2*0.2, 8-(j*0.3), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.4, 7-(j*0.3), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.6, 7-(j*0.3), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e2 = normal.clone().add(dirX2*0.8, 7-(j*0.3), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 15 ; j++) {
						e3 = normal.clone().add(dirX3*0.2, 8-(j*0.3), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.4, 7-(j*0.3), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.6, 7-(j*0.3), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e3 = normal.clone().add(dirX3*0.8, 7-(j*0.3), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					}
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 텔레포트
	public void newEffect8() {
		
		new BukkitRunnable() {
			int time = 0;
			
			World world = player.getWorld(); 
			Location e1;
	        
			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 90;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
				
				e1 = normal.clone().add(dirX1*1.5, 0, dirZ1*1.5);
				world.spawnParticle(Particle.DRAGON_BREATH, e1, 0);

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 넬의 사랑
	public void newEffect9() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2, e3, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 20 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 20 ; j++) {
						e2 = normal.clone().add(dirX2*0.2, 8-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 20 ; j++) {
						e2 = normal.clone().add(dirX2*0.4, 8-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*0.6, 7.1-(j*0.23), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*0.8, 7.1-(j*0.23), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*1, 7.1-(j*0.23), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e2 = normal.clone().add(dirX2*1.2, 7.1-(j*0.23), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e2, 3, dustOptions2);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 20 ; j++) {
						e3 = normal.clone().add(dirX3*0.2, 8-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 20 ; j++) {
						e3 = normal.clone().add(dirX3*0.4, 8-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*0.6, 7.1-(j*0.23), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*0.8, 7.1-(j*0.23), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*1, 7.1-(j*0.23), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e3 = normal.clone().add(dirX3*1.2, 7.1-(j*0.23), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e3, 3, dustOptions2);
					}
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 딘의 화염
	public void newEffect10() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(255, 0, 0), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e4;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e4, 2, dustOptions3);
						
						var += Math.PI / 16;
					}
					
					if(size == 7) {
						size = -1;
					}
					size++;
				}
				
				if(time == 1) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
				}
				
				if(time == 2) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
				}
				
				if(time == 3) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
				}
				
				if(time == 4) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
				}
				
				if(time == 5) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 6) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 7) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 8) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 9) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 10) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 11) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 12) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 13) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 14) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 15) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12161 = 49;
					double totalAngle12161 = normal.getYaw() + arrowAngle12161;
					double dirX12161 = Math.cos(Math.toRadians(totalAngle12161));
					double dirZ12161 = Math.sin(Math.toRadians(totalAngle12161));
					
					e1 = normal.clone().add(dirX12161*(-3.2), 0, dirZ12161*(-3.2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12261 = 45;
					double totalAngle12261 = normal.getYaw() + arrowAngle12261;
					double dirX12261 = Math.cos(Math.toRadians(totalAngle12261));
					double dirZ12261 = Math.sin(Math.toRadians(totalAngle12261));
					
					e1 = normal.clone().add(dirX12261*(-3.4), 0, dirZ12261*(-3.4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time == 16) {
					double arrowAngle1 = 60;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*4, 0, dirZ1*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.6, 0, dirZ1*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*3.2, 0, dirZ1*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.8, 0, dirZ1*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					e1 = normal.clone().add(dirX1*2.4, 0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle2 = 130;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e1 = normal.clone().add(dirX2*4, 0, dirZ2*4);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle3 = 128;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*3.6, 0, dirZ3*3.6);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle4 = 126;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					e1 = normal.clone().add(dirX4*3.2, 0, dirZ4*3.2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle5 = 124;
					double totalAngle5 = normal.getYaw() + arrowAngle5;
					double dirX5 = Math.cos(Math.toRadians(totalAngle5));
					double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
					
					e1 = normal.clone().add(dirX5*2.8, 0, dirZ5*2.8);
					world.spawnParticle(Particle.REDSTONE, e1, 4, dustOptions2);
					
					double arrowAngle6 = 124;
					double totalAngle6 = normal.getYaw() + arrowAngle6;
					double dirX6 = Math.cos(Math.toRadians(totalAngle6));
					double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
					
					e1 = normal.clone().add(dirX6*2.4, 0, dirZ6*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
					
					double arrowAngle7 = 91;
					double totalAngle7 = normal.getYaw() + arrowAngle7;
					double dirX7 = Math.cos(Math.toRadians(totalAngle7));
					double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
					
					e1 = normal.clone().add(dirX7*4, 0, dirZ7*4);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3.5, 0, dirZ7*3.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*3, 0, dirZ7*3);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX7*2.5, 0, dirZ7*2.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle8 = 90;
					double totalAngle8 = normal.getYaw() + arrowAngle8;
					double dirX8 = Math.cos(Math.toRadians(totalAngle8));
					double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
					
					e1 = normal.clone().add(dirX8*2, 0, dirZ8*2);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					e1 = normal.clone().add(dirX8*1.5, 0, dirZ8*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle91 = 95;
					double totalAngle91 = normal.getYaw() + arrowAngle91;
					double dirX91 = Math.cos(Math.toRadians(totalAngle91));
					double dirZ91 = Math.sin(Math.toRadians(totalAngle91));
					
					e1 = normal.clone().add(dirX91*1, 0, dirZ91*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle9 = 102;
					double totalAngle9 = normal.getYaw() + arrowAngle9;
					double dirX9 = Math.cos(Math.toRadians(totalAngle9));
					double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
					
					e1 = normal.clone().add(dirX9*0.5, 0, dirZ9*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle10 = 109;
					double totalAngle10 = normal.getYaw() + arrowAngle10;
					double dirX10 = Math.cos(Math.toRadians(totalAngle10));
					double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
					
					e1 = normal.clone().add(dirX10*0, 0, dirZ10*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle101 = 117;
					double totalAngle101 = normal.getYaw() + arrowAngle101;
					double dirX101 = Math.cos(Math.toRadians(totalAngle101));
					double dirZ101 = Math.sin(Math.toRadians(totalAngle101));
					
					e1 = normal.clone().add(dirX101*(-0.5), 0, dirZ101*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle102 = 123;
					double totalAngle102 = normal.getYaw() + arrowAngle102;
					double dirX102 = Math.cos(Math.toRadians(totalAngle102));
					double dirZ102 = Math.sin(Math.toRadians(totalAngle102));
					
					e1 = normal.clone().add(dirX102*(-1), 0, dirZ102*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle11 = 130;
					double totalAngle11 = normal.getYaw() + arrowAngle11;
					double dirX11 = Math.cos(Math.toRadians(totalAngle11));
					double dirZ11 = Math.sin(Math.toRadians(totalAngle11));
					
					e1 = normal.clone().add(dirX11*(-1.5), 0, dirZ11*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle111 = 136;
					double totalAngle111 = normal.getYaw() + arrowAngle111;
					double dirX111 = Math.cos(Math.toRadians(totalAngle111));
					double dirZ111 = Math.sin(Math.toRadians(totalAngle111));
					
					e1 = normal.clone().add(dirX111*(-2), 0, dirZ111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle112 = 142;
					double totalAngle112 = normal.getYaw() + arrowAngle112;
					double dirX112 = Math.cos(Math.toRadians(totalAngle112));
					double dirZ112 = Math.sin(Math.toRadians(totalAngle112));
					
					e1 = normal.clone().add(dirX112*(-2.5), 0, dirZ112*(-2.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12 = 148;
					double totalAngle12 = normal.getYaw() + arrowAngle12;
					double dirX12 = Math.cos(Math.toRadians(totalAngle12));
					double dirZ12 = Math.sin(Math.toRadians(totalAngle12));
					
					e1 = normal.clone().add(dirX12*(-3), 0, dirZ12*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121 = 154;
					double totalAngle121 = normal.getYaw() + arrowAngle121;
					double dirX121 = Math.cos(Math.toRadians(totalAngle121));
					double dirZ121 = Math.sin(Math.toRadians(totalAngle121));
					
					e1 = normal.clone().add(dirX121*(-3.5), 0, dirZ121*(-3.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122 = 160;
					double totalAngle122 = normal.getYaw() + arrowAngle122;
					double dirX122 = Math.cos(Math.toRadians(totalAngle122));
					double dirZ122 = Math.sin(Math.toRadians(totalAngle122));
					
					e1 = normal.clone().add(dirX122*(-4), 0, dirZ122*(-4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle911 = 90;
					double totalAngle911 = normal.getYaw() + arrowAngle911;
					double dirX911 = Math.cos(Math.toRadians(totalAngle911));
					double dirZ911 = Math.sin(Math.toRadians(totalAngle911));
					
					e1 = normal.clone().add(dirX911*1, 0, dirZ911*1);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle912 = 87;
					double totalAngle912 = normal.getYaw() + arrowAngle912;
					double dirX912 = Math.cos(Math.toRadians(totalAngle912));
					double dirZ912 = Math.sin(Math.toRadians(totalAngle912));
					
					e1 = normal.clone().add(dirX912*0.5, 0, dirZ912*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle105 = 84;
					double totalAngle105 = normal.getYaw() + arrowAngle105;
					double dirX105 = Math.cos(Math.toRadians(totalAngle105));
					double dirZ105 = Math.sin(Math.toRadians(totalAngle105));
					
					e1 = normal.clone().add(dirX105*0, 0, dirZ105*0);
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1011 = 81;
					double totalAngle1011 = normal.getYaw() + arrowAngle1011;
					double dirX1011 = Math.cos(Math.toRadians(totalAngle1011));
					double dirZ1011 = Math.sin(Math.toRadians(totalAngle1011));
					
					e1 = normal.clone().add(dirX1011*(-0.5), 0, dirZ1011*(-0.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1021 = 78;
					double totalAngle1021 = normal.getYaw() + arrowAngle1021;
					double dirX1021 = Math.cos(Math.toRadians(totalAngle1021));
					double dirZ1021 = Math.sin(Math.toRadians(totalAngle1021));
					
					e1 = normal.clone().add(dirX1021*(-1), 0, dirZ1021*(-1));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle117 = 75;
					double totalAngle117 = normal.getYaw() + arrowAngle117;
					double dirX117 = Math.cos(Math.toRadians(totalAngle117));
					double dirZ117 = Math.sin(Math.toRadians(totalAngle117));
					
					e1 = normal.clone().add(dirX117*(-1.5), 0, dirZ117*(-1.5));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1111 = 72;
					double totalAngle1111 = normal.getYaw() + arrowAngle1111;
					double dirX1111 = Math.cos(Math.toRadians(totalAngle1111));
					double dirZ1111 = Math.sin(Math.toRadians(totalAngle1111));
					
					e1 = normal.clone().add(dirX1111*(-2), 0, dirZ1111*(-2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1121 = 69;
					double totalAngle1121 = normal.getYaw() + arrowAngle1121;
					double dirX1121 = Math.cos(Math.toRadians(totalAngle1121));
					double dirZ1121 = Math.sin(Math.toRadians(totalAngle1121));
					
					e1 = normal.clone().add(dirX1121*(-2.3), 0, dirZ1121*(-2.3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle126 = 64;
					double totalAngle126 = normal.getYaw() + arrowAngle126;
					double dirX126 = Math.cos(Math.toRadians(totalAngle126));
					double dirZ126 = Math.sin(Math.toRadians(totalAngle126));
					
					e1 = normal.clone().add(dirX126*(-2.6), 0, dirZ126*(-2.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1216 = 59;
					double totalAngle1216 = normal.getYaw() + arrowAngle1216;
					double dirX1216 = Math.cos(Math.toRadians(totalAngle1216));
					double dirZ1216 = Math.sin(Math.toRadians(totalAngle1216));
					
					e1 = normal.clone().add(dirX1216*(-2.8), 0, dirZ1216*(-2.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle1226 = 54;
					double totalAngle1226 = normal.getYaw() + arrowAngle1226;
					double dirX1226 = Math.cos(Math.toRadians(totalAngle1226));
					double dirZ1226 = Math.sin(Math.toRadians(totalAngle1226));
					
					e1 = normal.clone().add(dirX1226*(-3), 0, dirZ1226*(-3));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12161 = 49;
					double totalAngle12161 = normal.getYaw() + arrowAngle12161;
					double dirX12161 = Math.cos(Math.toRadians(totalAngle12161));
					double dirZ12161 = Math.sin(Math.toRadians(totalAngle12161));
					
					e1 = normal.clone().add(dirX12161*(-3.2), 0, dirZ12161*(-3.2));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle12261 = 45;
					double totalAngle12261 = normal.getYaw() + arrowAngle12261;
					double dirX12261 = Math.cos(Math.toRadians(totalAngle12261));
					double dirZ12261 = Math.sin(Math.toRadians(totalAngle12261));
					
					e1 = normal.clone().add(dirX12261*(-3.4), 0, dirZ12261*(-3.4));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle121611 = 41;
					double totalAngle121611 = normal.getYaw() + arrowAngle121611;
					double dirX121611 = Math.cos(Math.toRadians(totalAngle121611));
					double dirZ121611 = Math.sin(Math.toRadians(totalAngle121611));
					
					e1 = normal.clone().add(dirX121611*(-3.6), 0, dirZ121611*(-3.6));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
					
					double arrowAngle122611 = 37;
					double totalAngle122611 = normal.getYaw() + arrowAngle122611;
					double dirX122611 = Math.cos(Math.toRadians(totalAngle122611));
					double dirZ122611 = Math.sin(Math.toRadians(totalAngle122611));
					
					e1 = normal.clone().add(dirX122611*(-3.8), 0, dirZ122611*(-3.8));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*8, 0, Math.sin(var)*8);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 펠의 바람
	public void newEffect11() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var = 0;
			Location loc, first, second;

			@Override
			public void run() {
				
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				world.spawnParticle(Particle.REDSTONE, first, 3, dustOptions1);
				world.spawnParticle(Particle.REDSTONE, second, 3, dustOptions2);

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 열귀각
	public void newEffect12() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 3.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				Location normal = player.getEyeLocation();
				
				double arrowAngle1 = 73;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle2 = 90;
		        double totalAngle2 = normal.getYaw() + arrowAngle2;
		        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
		        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
		        
		        double arrowAngle3 = 107;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
				
				Location e1, e2, e3;

				e1 = normal.clone().add(dirX1 * 4, 1.5 - (time * 0.15), dirZ1 * 4);
				world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions);

				e2 = normal.clone().add(dirX2 * 4, 1.5 - (time * 0.15), dirZ2 * 4);
				world.spawnParticle(Particle.REDSTONE, e2, 10, dustOptions);

				e3 = normal.clone().add(dirX3 * 4, 1.5 - (time * 0.15), dirZ3 * 4);
				world.spawnParticle(Particle.REDSTONE, e3, 10, dustOptions);

				if (time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 마인권
	public void newEffect13() {
		
		World world = player.getWorld(); 
		
		Location normal = ent.getLocation();
		
		double arrowAngle1 = -70;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = -40;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 10;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle4 = 70;
        double totalAngle4 = normal.getYaw() + arrowAngle4;
        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
        
        double arrowAngle5 = 100;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle6 = 140;
        double totalAngle6 = normal.getYaw() + arrowAngle6;
        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
        
        double arrowAngle7 = 190;
        double totalAngle7 = normal.getYaw() + arrowAngle7;
        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
        
        double arrowAngle8 = 250;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 320;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 2.0f, 0.5f);
		
		new BukkitRunnable() {
			int time = 0;
			
			Location e1, e2, e3, e4, e5, e6, e7, e8, e9;

			@Override
			public void run() {
				
				if(time == 1 || time == 11 || time == 21) {
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1 * (1-(0.2*i)), 1.5, dirZ1 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions);

						e2 = normal.clone().add(dirX2 * (1-(0.2*i)), 1.4, dirZ2 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions);

						e3 = normal.clone().add(dirX3 * (1-(0.2*i)), 0.5, dirZ3 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions);
						
						e4 = normal.clone().add(dirX4 * (1-(0.2*i)), 0.3, dirZ4 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions);
						
						e5 = normal.clone().add(dirX5 * (1-(0.2*i)), 1.1, dirZ5 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e5, 2, dustOptions);
						
						e6 = normal.clone().add(dirX6 * (1-(0.2*i)), 1.4, dirZ6 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e6, 2, dustOptions);
						
						e7 = normal.clone().add(dirX7 * (1-(0.2*i)), 1.3, dirZ7 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e7, 2, dustOptions);
						
						e8 = normal.clone().add(dirX8 * (1-(0.2*i)), 0.9, dirZ8 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e8, 2, dustOptions);
						
						e9 = normal.clone().add(dirX9 * (1-(0.2*i)), 1, dirZ9 * (1-(0.2*i)));
						world.spawnParticle(Particle.REDSTONE, e9, 2, dustOptions);
					}
				}
				
				if(time >= 25) {
					world.playSound(normal, Sound.ENTITY_GENERIC_EXPLODE, 1f, 1.0f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, normal, 0);
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 염옥악
	public void newEffect14() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		
		world.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				double arrowAngle1 = -70;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		        
		        double arrowAngle21 = -55;
		        double totalAngle21 = normal.getYaw() + arrowAngle21;
		        double dirX21 = Math.cos(Math.toRadians(totalAngle21));
		        double dirZ21 = Math.sin(Math.toRadians(totalAngle21));
		        
		        double arrowAngle2 = -40;
		        double totalAngle2 = normal.getYaw() + arrowAngle2;
		        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
		        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
		        
		        double arrowAngle3 = 10;
		        double totalAngle3 = normal.getYaw() + arrowAngle3;
		        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
		        
		        double arrowAngle31 = 30;
		        double totalAngle31 = normal.getYaw() + arrowAngle31;
		        double dirX31 = Math.cos(Math.toRadians(totalAngle31));
		        double dirZ31 = Math.sin(Math.toRadians(totalAngle31));
		        
		        double arrowAngle4 = 70;
		        double totalAngle4 = normal.getYaw() + arrowAngle4;
		        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
		        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
		        
		        double arrowAngle5 = 100;
		        double totalAngle5 = normal.getYaw() + arrowAngle5;
		        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
		        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
		        
		        double arrowAngle6 = 140;
		        double totalAngle6 = normal.getYaw() + arrowAngle6;
		        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
		        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
		        
		        double arrowAngle7 = 190;
		        double totalAngle7 = normal.getYaw() + arrowAngle7;
		        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
		        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
		        
		        double arrowAngle8 = 250;
		        double totalAngle8 = normal.getYaw() + arrowAngle8;
		        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
		        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
		        
		        double arrowAngle9 = 320;
		        double totalAngle9 = normal.getYaw() + arrowAngle9;
		        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
		        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		        
		        double arrowAngle10 = 350;
		        double totalAngle10 = normal.getYaw() + arrowAngle10;
		        double dirX10 = Math.cos(Math.toRadians(totalAngle10));
		        double dirZ10 = Math.sin(Math.toRadians(totalAngle10));
				
				Location e1, e2, e21, e3, e31, e4, e5, e6, e7, e8, e9, e10;
				
				if(time % 8 == 0) {
					int i = time / 8;
					
					e1 = normal.clone().add(dirX1 * (3 - (0.6 * i)), 1.4, dirZ1 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions);

					e2 = normal.clone().add(dirX2 * (3 - (0.6 * i)), 0.2, dirZ2 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions);

					e21 = normal.clone().add(dirX21 * (3 - (0.6 * i)), 0.8, dirZ21 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e21, 2, dustOptions);

					e3 = normal.clone().add(dirX3 * (3 - (0.6 * i)), 0.3, dirZ3 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions);

					e31 = normal.clone().add(dirX31 * (3 - (0.6 * i)), 1, dirZ31 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e31, 2, dustOptions);

					e4 = normal.clone().add(dirX4 * (3 - (0.6 * i)), 0.5, dirZ4 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e4, 2, dustOptions);

					e5 = normal.clone().add(dirX5 * (3 - (0.6 * i)), 1.2, dirZ5 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e5, 2, dustOptions);

					e6 = normal.clone().add(dirX6 * (3 - (0.6 * i)), 0.2, dirZ6 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e6, 2, dustOptions);

					e7 = normal.clone().add(dirX7 * (3 - (0.6 * i)), 1, dirZ7 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e7, 2, dustOptions);

					e8 = normal.clone().add(dirX8 * (3 - (0.6 * i)), 0.6, dirZ8 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e8, 2, dustOptions);

					e9 = normal.clone().add(dirX9 * (3 - (0.6 * i)), 0.4, dirZ9 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e9, 2, dustOptions);

					e10 = normal.clone().add(dirX10 * (3 - (0.6 * i)), 0.8, dirZ10 * (3 - (0.6 * i)));
					world.spawnParticle(Particle.REDSTONE, e10, 2, dustOptions);
				}
				
				if(time >= 60) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	// 뇌신장
	public void newEffect15() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(120, 0, 120), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		
		world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 1.0f);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 4 == 0 && time < 20) {
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 10 ; j++) {
						e2 = normal.clone().add(dirX2*j*0.05, 3-(j*0.3), dirZ2*j*0.05);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e2 = normal.clone().add(dirX2*j*0.15, 3-(j*0.2), dirZ2*j*0.15);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
//					for(int j = 0 ; j < 15 ; j++) {
//						e2 = normal.clone().add(dirX2*j*0.15, 3-(j*0.2), dirZ2*j*0.15);
//						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
//					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					double var = 0;

					for (int i = 0; i < 32; i++) {
						Location flag = normal.clone().add(dirX3 * 2, 15.5, dirZ3 * 2);
						e1 = flag.clone().add(Math.cos(var) * 1.5, 0, Math.sin(var) * 1.5);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.4, 0, Math.sin(var) * 1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.3, 0, Math.sin(var) * 1.3);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.2, 0, Math.sin(var) * 1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1.1, 0, Math.sin(var) * 1.1);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 1, 0, Math.sin(var) * 1);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.9, 0, Math.sin(var) * 0.9);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.8, 0, Math.sin(var) * 0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.7, 0, Math.sin(var) * 0.7);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.6, 0, Math.sin(var) * 0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.5, 0, Math.sin(var) * 0.5);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.4, 0, Math.sin(var) * 0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.3, 0, Math.sin(var) * 0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);
						e1 = flag.clone().add(Math.cos(var) * 0.2, 0, Math.sin(var) * 0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 3, dustOptions2);

						var += Math.PI / 16;
					}

					for(int j = 0 ; j < 40 ; j++) {
						e3 = normal.clone().add(dirX3*(2-(j*0.05)), 15-(j*0.3), dirZ3*(2-(j*0.05)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 7 ; j++) {
						e3 = normal.clone().add(dirX3*(0.4+(j*0.1)), 4-(j*0.3), dirZ3*(0.4+(j*0.1)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e3 = normal.clone().add(dirX3*(0.8+(j*0.15)), 7-(j*0.3), dirZ3*(0.8+(j*0.15)));
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
				}
				
				if(time % 5 == 0 && time > 20) {
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.5f);
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, e1, 0);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 도박사의 판 1
	public void newEffect16() {
		
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 180, 250), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(70, 150, 220), 1);
		Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
		Particle.DustOptions dustOptions4 = new Particle.DustOptions(Color.fromRGB(205, 205, 205), 1);
		Particle.DustOptions dustOptions5 = new Particle.DustOptions(Color.fromRGB(30, 120, 190), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e2, e3;

			@Override
			public void run() {
				
				if(time % 6 == 0 && time < 20) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e2 = normal.clone().add(dirX1*0, 1, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX1*0, 2.2, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX1*0, 2.1, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.9, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.8, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.7, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.6, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.5, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.4, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.3, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.2, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX1*0, 1.1, dirZ1*0);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					e2 = normal.clone().add(dirX2*0.4, 1, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*0.8, 1, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.2, 1, dirZ2*1.2);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.6, 1.2, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.8, 1.4, dirZ2*1.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
					
					e2 = normal.clone().add(dirX2*1.8, 1.5, dirZ2*1.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*1.6, 1.6, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*1.2, 1.7, dirZ2*1.2);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*0.8, 1.84, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*0.4, 2, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					
					e2 = normal.clone().add(dirX2*1.6, 1.3, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.4, 1.3, dirZ2*1.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.4, 1.2, dirZ2*1.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.6, 1.4, dirZ2*1.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.4, 1.4, dirZ2*1.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.4, 1.3, dirZ2*1.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.3, 1.6, dirZ2*1.3);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.6, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.5, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.3, 1.4, dirZ2*1.3);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.4, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.3, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.3, 1.2, dirZ2*1.3);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.2, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1.1, 1.1, dirZ2*1.1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1, 1.7, dirZ2*1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.7, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.6, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1, 1.5, dirZ2*1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.5, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.4, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1, 1.3, dirZ2*1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.3, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.2, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*1, 1.2, dirZ2*1);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.8, 1.2, dirZ2*0.8);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.6, 1.9, dirZ2*0.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.9, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.8, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.6, 1.7, dirZ2*0.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.7, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.6, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.6, 1.6, dirZ2*0.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.6, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.5, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.6, 1.4, dirZ2*0.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.4, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.3, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.6, 1.2, dirZ2*0.6);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.2, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.4, 1.1, dirZ2*0.4);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 2, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.9, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.8, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.7, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.6, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.5, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.4, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.3, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.2, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					e2 = normal.clone().add(dirX2*0.2, 1.1, dirZ2*0.2);
					world.spawnParticle(Particle.REDSTONE, e2, 1, dustOptions5);
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e3 = normal.clone().add(dirX3*0.4, 1, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*0.4, 2.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*0.4, 2.6, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);

					e3 = normal.clone().add(dirX3*0.8, 1, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*0.8, 2.6, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*0.8, 2.2, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*0.8, 2.4, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);

					e3 = normal.clone().add(dirX3*1.2, 1, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*1.2, 1.9, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.2, 2.6, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.2, 2.6, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);

					e3 = normal.clone().add(dirX3*1.6, 1, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions2);
					
					e3 = normal.clone().add(dirX3*1.6, 1.5, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*1.6, 1.6, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					
					e3 = normal.clone().add(dirX3*1.6, 1.8, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.6, 2.8, dirZ3*1.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*1.8, 2.9, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2, 1.9, dirZ3*2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.1, 3.1, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.25, 3.2, dirZ3*2.25);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.4, 2.9, dirZ3*2.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.3, 2.6, dirZ3*2.3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.2, 2.2, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.9, 3.6, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.8, 3.5, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.7, 3.3, dirZ3*2.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.6, 3.1, dirZ3*2.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3.2, 3.2, dirZ3*3.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3, 3, dirZ3*3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.8, 2.9, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.6, 2.8, dirZ3*2.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);

					e3 = normal.clone().add(dirX3*3, 3, dirZ3*3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.9, 2.7, dirZ3*2.9);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.7, 2.5, dirZ3*2.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.4, 2.4, dirZ3*2.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.2, 2.3, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3.3, 2.6, dirZ3*3.3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3.2, 2.5, dirZ3*3.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3.1, 2.4, dirZ3*3.1);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*3, 2.3, dirZ3*3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.8, 2.2, dirZ3*2.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.6, 2.1, dirZ3*2.6);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.4, 2, dirZ3*2.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2.3, 1.95, dirZ3*2.3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions3);
					
					e3 = normal.clone().add(dirX3*2, 2.1, dirZ3*2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2, 2.3, dirZ3*2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2.2, 2.4, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2.2, 2.2, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.7, 2.1, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.7, 2.3, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.5, 2.4, dirZ3*1.5);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.5, 2.2, dirZ3*1.5);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.9, 2.6, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.8, 2.6, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.2, 2.1, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.4, 2.2, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.2, 2.3, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.1, 2.3, dirZ3*1.1);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.3, 2.3, dirZ3*1.3);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.7, 1.9, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.8, 2, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*1.9, 2, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2.1, 2.8, dirZ3*2.1);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2.2, 2.9, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*2.2, 2.9, dirZ3*2.2);
					world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions4);
					
					e3 = normal.clone().add(dirX3*0.2, 2, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);

					e3 = normal.clone().add(dirX3*0.2, 1.9, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.8, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.7, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.6, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.5, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.4, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.3, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.2, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.2, 1.1, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.4, 2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 2, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.9, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.4, 1.8, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.8, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.7, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.4, 1.6, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.6, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.5, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.4, 1.4, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.4, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.3, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.4, 1.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.2, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 1.1, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 2.1, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 2.2, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 2.3, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.6, 2.4, dirZ3*0.6);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.8, 2, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 2, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.9, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.8, 1.8, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.8, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.7, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.8, 1.6, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.6, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.5, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.8, 1.4, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.4, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.3, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*0.8, 1.2, dirZ3*0.8);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.2, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1, 1.1, dirZ3*1);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.2, 1.8, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.7, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.7, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.2, 1.6, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.5, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.5, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.2, 1.4, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.3, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.3, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.2, 1.2, dirZ3*1.2);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.1, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
					e3 = normal.clone().add(dirX3*1.4, 1.1, dirZ3*1.4);
					world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions5);
					
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 도박사의 판 2
	public void newEffect17() {
		
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 250, 120), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 4 == 0 && time < 20) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 15 ; i++) {
						e1 = normal.clone().add(dirX1*0, 3-(i*0.1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 9 ; i++) {
						e2 = normal.clone().add(dirX2*0.2, 2.7-(i*0.1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e2 = normal.clone().add(dirX2*0.4, 2.5-(i*0.1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 3 ; i++) {
						e2 = normal.clone().add(dirX2*0.6, 2.4-(i*0.1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e2 = normal.clone().add(dirX2*0.8, 2.3-(i*0.1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 9 ; i++) {
						e3 = normal.clone().add(dirX3*0.2, 2.7-(i*0.1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e3 = normal.clone().add(dirX3*0.4, 2.5-(i*0.1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions1);
					}
					
					for(int i = 0 ; i < 3 ; i++) {
						e3 = normal.clone().add(dirX3*0.6, 2.4-(i*0.1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions1);
					}

					for(int i = 0 ; i < 1 ; i++) {
						e3 = normal.clone().add(dirX3*0.8, 2.3-(i*0.1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 1, dustOptions1);
					}
					
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 도박사의 판 3
	public void newEffect18() {
		
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(120, 250, 250), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1, e2, e3;

			@Override
			public void run() {
				
				if(time % 4 == 0 && time < 20) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0, 4-(i*0.1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*0, 2.4-(i*0.1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 3 ; i++) {
						e1 = normal.clone().add(dirX1*0, 1.2, dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 10, dustOptions1);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.1, 4-(i*0.1), dirZ3*0.1);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.2, 3.95-(i*0.1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.4, 3.8-(i*0.1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.6, 3.6-(i*0.1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.8, 3.3-(i*0.1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.6, 2.9-(i*0.1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.4, 2.6-(i*0.1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e3 = normal.clone().add(dirX3*0.2, 2.4-(i*0.1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e3, 2, dustOptions1);
					}
					
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 도박사의 판 4
	public void newEffect19() {
		
		Location normal = player.getEyeLocation().add(0, 2, 0);
		World world = player.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 200, 255), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				if(time % 5 == 0 && time < 20) {
					double r = 1;
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 5) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 10) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							e1 = normal.clone().add(x, y, z);
							world.spawnParticle(Particle.REDSTONE, e1, 1, dustOptions1);
						}
					}
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 반역의 날개
	public void newEffect20() {
		
		World world = player.getWorld(); 
		
		world.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.8f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				if(time % 3 == 0) {
					
					double arrowAngle1 = -80;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.1, -0.3, dirZ1*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -60;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.2, -0.25, dirZ1*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.4, -0.2, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -32;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.65, -0.1, dirZ1*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.9, 0, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.1, 0.03, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.06, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.5, 0.09, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.7, 0.12, dirZ1*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.15, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.1, 0.18, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.0, 0.13, dirZ1*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.08, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.8, 0.03, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ1*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ1*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ1*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle3 = 260;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.1, -0.3, dirZ3*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 240;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.2, -0.25, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 220;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.4, -0.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.65, -0.1, dirZ3*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.9, 0, dirZ3*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.1, 0.03, dirZ3*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.3, 0.06, dirZ3*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.5, 0.09, dirZ3*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.7, 0.12, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.15, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.1, 0.18, dirZ3*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.0, 0.13, dirZ3*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.08, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.8, 0.03, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ3*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ3*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ3*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 발도
	public void newEffect21() {

		Location normal = player.getEyeLocation();
		World world = player.getWorld();
		Inheritance inheritance = new Inheritance();

		world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_SPLASH, 3.0f, 2.0f);

		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 180, 200), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(50, 50, 250), 1);
		Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);

		new BukkitRunnable() {
			int time = 0;

			Location e1, e2;
			
			double rot = normal.getYaw();
			double dirX = Math.cos(Math.toRadians(rot));
			double dirZ = Math.sin(Math.toRadians(rot));

			@Override
			public void run() {

				if (time == 0) {
					
					double var = 0;
					
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*1, 1, dirZ1*1);
					
					for(int i = 0 ; i < 16 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*1*dirX, Math.sin(var)*1, Math.cos(var)*1*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					arrowAngle1 = 40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*2.2, 1.2, dirZ1*2.2);
					
					for(int i = 0 ; i < 16 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.8*dirX, Math.sin(var)*0.8, Math.cos(var)*0.8*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					arrowAngle1 = 140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*2.2, 1.2, dirZ1*2.2);
					
					for(int i = 0 ; i < 16 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.8*dirX, Math.sin(var)*0.8, Math.cos(var)*0.8*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					arrowAngle1 = 50;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*1.8, 0.1, dirZ1*1.8);
					
					for(int i = 0 ; i < 16 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.7*dirX, Math.sin(var)*0.7, Math.cos(var)*0.7*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					arrowAngle1 = 130;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*1.8, 0.1, dirZ1*1.8);
					
					for(int i = 0 ; i < 16 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.7*dirX, Math.sin(var)*0.7, Math.cos(var)*0.7*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 8;
					}

					arrowAngle1 = 30;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*3, 0, dirZ1*3);
					
					for(int i = 0 ; i < 8 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.4*dirX, Math.sin(var)*0.4, Math.cos(var)*0.4*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 4;
					}
					
					arrowAngle1 = 150;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					e1 = normal.clone().add(dirX1*3, 0, dirZ1*3);
					
					for(int i = 0 ; i < 8 ; i++) {
						e2 = e1.clone().add(Math.cos(var)*0.4*dirX, Math.sin(var)*0.4, Math.cos(var)*0.4*dirZ);
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 4;
					}
				}
				
				if(time > 10) {
					world.spawnParticle(Particle.REDSTONE, player.getEyeLocation(), 2, dustOptions2);
					world.spawnParticle(Particle.REDSTONE, player.getEyeLocation(), 2, dustOptions3);
					world.spawnParticle(Particle.WATER_DROP, player.getEyeLocation(), 2);
					world.spawnParticle(Particle.WATER_SPLASH, player.getEyeLocation(), 2);
				}
				
				if(time == 10) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*6 + damNum*4);
						}
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_SPLASH, 4.0f, 1.0f);
				}

				if(time >= 20) {
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(normal, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					if(inheritance.getInheritance(player) == 58) {
						List<Entity> entitylist = tmpEnt.getNearbyEntities(6, 6, 6);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Mob) {
								LivingEntity ent = (LivingEntity) nearEntity;
								ent.damage(player.getLevel()*6 + damNum*4);
							}
						}	
					} else {
						List<Entity> entitylist = tmpEnt.getNearbyEntities(4, 4, 4);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Mob) {
								LivingEntity ent = (LivingEntity) nearEntity;
								ent.damage(player.getLevel()*6 + damNum*4);
							}
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 나이트메어
	public void newEffect22() {
		
		World world = player.getWorld(); 
		
		world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.5f, 0.6f);
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(150, 40, 150), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e2 = normal.clone().add(Math.cos(var)*(size*0.2), size*0.5, Math.sin(var)*(size*0.2));
						world.spawnParticle(Particle.REDSTONE, e2, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size > 6) {
						size = 0;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, 0, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 엘 카나프
	public void newEffect23() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 50, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 100, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var = 0;
			Location loc, first, second;

			@Override
			public void run() {
				
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				world.spawnParticle(Particle.REDSTONE, first, 3, dustOptions1);
				world.spawnParticle(Particle.REDSTONE, second, 3, dustOptions1);
				world.spawnParticle(Particle.REDSTONE, first, 3, dustOptions2);
				world.spawnParticle(Particle.REDSTONE, second, 3, dustOptions2);

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 엘 페게츠
	public void newEffect24() {
		
		Location normal = player.getLocation(); 
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(80, 160, 80), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 200, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;

			@Override
			public void run() {

				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, 0, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, (Math.cos(var)*0.5)+1, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
				}
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, (Math.sin(var)*0.6)+1, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
				}
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*-1, (Math.sin(var)*0.6)+1, Math.sin(var)*-1);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions2);
						
						var += Math.PI / 16;
					}
				}
				
				if(time >= 10) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 엘 초펠
	public void newEffect25() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(160, 160, 30), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;

			@Override
			public void run() {
				Location normal = player.getEyeLocation(); 
				
				if(time == 1) {
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.5f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, player.getLocation(), 0);
				}

				if(time == 2) {
					double arrowAngle1 = -90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, 0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
				}
				
				if(time == 6) {
					double arrowAngle1 = -90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, 0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.5, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
				}
				
				if(time == 10) {
					double arrowAngle1 = -90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, 0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.5, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.8, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.4, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.1, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.4, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.1, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
				}
				
				if(time == 14) {
					double arrowAngle1 = -90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, 0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1, -0.5, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.5, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.1, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, -0.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.8, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.4, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.1, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.4, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.6, 0.1, dirZ1*1.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 1.1, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -110;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.7, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -140;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.4, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -70;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.7, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.4, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 엘 예브론
	public void newEffect26() {
		
		Location normal = player.getLocation(); 
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			Location e1;

			@Override
			public void run() {
				
				if(time % 2 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					if(size == 4) {
						size = -1;
					}
					size++;
				}
				
				if(time == 2) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 6) {
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5.5, 1, Math.sin(var)*5.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*6, 1.5, Math.sin(var)*6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 10) {
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5.5, 1, Math.sin(var)*5.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*6, 1.5, Math.sin(var)*6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*6.5, 2, Math.sin(var)*6.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*7, 2.5, Math.sin(var)*7);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 14) {
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*4.5, 1, Math.sin(var)*4.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 1.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*4.5, 2, Math.sin(var)*4.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*4, 2.5, Math.sin(var)*4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 18) {
					
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*4, 1, Math.sin(var)*4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*3.5, 1.5, Math.sin(var)*3.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*2.5, 2, Math.sin(var)*2.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, 2.5, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*0.5, 2.5, Math.sin(var)*0.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 행군
	public void newEffect27() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(0, 0, 255), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(255, 0, 0), 1);
        Particle.DustOptions dustOptions4 = new Particle.DustOptions(Color.fromRGB(255, 150, 0), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;

			@Override
			public void run() {
				
				if(time % 8 == 0) {
					player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 0.01f);
				}

				if(time % 4 == 0) {
					Location normal = player.getEyeLocation().add(0,1,0); 
					
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = normal.clone().add(dirX1*0, 0.5+(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions4);
					}
					
					arrowAngle1 = 180;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 2.4-(0.2*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*0.4, 2.4-(0.2*i), dirZ1*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*0.6, 2.4-(0.2*i), dirZ1*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.8, 2.4-(0.2*i), dirZ1*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					e1 = normal.clone().add(dirX1*0.8, 2, dirZ1*0.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.8, 1.8, dirZ1*0.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.8, 1.6-(0.2*i), dirZ1*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*1, 2.4-(0.2*i), dirZ1*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					e1 = normal.clone().add(dirX1*1, 2, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1, 1.8, dirZ1*1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*1, 1.6-(0.2*i), dirZ1*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*1.2, 2.4-(0.2*i), dirZ1*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*1.4, 2.4-(0.2*i), dirZ1*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = normal.clone().add(dirX1*1.6, 2.4-(0.2*i), dirZ1*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 구급법
	public void newEffect28() {
		
		Location loc = player.getLocation(); 
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(255, 0, 0), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions4 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			Location e1;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e1 = loc.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e1 = loc.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions4);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var), 0.3, Math.sin(var));
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*1.5, 0.6, Math.sin(var)*1.5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 8;
					}
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
						
						var += Math.PI / 16;
					}
				}

				if(time % 4 == 0) {
					
					double arrowAngle1 = 90;
					double totalAngle1 = loc.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					Location normal = loc.clone().add(dirX1*2, 0, dirZ1*2);
					
					arrowAngle1 = 170;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 3 ; i++) {
						e1 = normal.clone().add(dirX1*2, 1.5-(0.3*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 3 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.5-(0.3*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.2-(0.3*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*2.3, 1.2-(0.3*i), dirZ1*2.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*1.9, 1.2-(0.3*i), dirZ1*1.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*1.8, 1.2-(0.3*i), dirZ1*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					arrowAngle1 = 10;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 3 ; i++) {
						e1 = normal.clone().add(dirX1*2, 1.1-(0.3*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 3 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.1-(0.3*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 0.8-(0.3*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*2.3, 0.8-(0.3*i), dirZ1*2.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*1.9, 0.8-(0.3*i), dirZ1*1.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						e1 = normal.clone().add(dirX1*1.8, 0.8-(0.3*i), dirZ1*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 각개전투
	public void newEffect29() {
		
		Location loc = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(30, 150, 30), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			Location e1;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e1 = loc.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e1 = loc.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 16;
					}
				}

				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = loc.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					Location normal = loc.clone().add(dirX1*2, 0, dirZ1*2);
					
					arrowAngle1 = 90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0, 1-(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 0;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1-(0.2*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.4, 1-(0.2*i), dirZ1*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.6, 1-(0.2*i), dirZ1*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.8, 1-(0.2*i), dirZ1*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 7 ; i++) {
						e1 = normal.clone().add(dirX1*1, 1.4-(0.2*i), dirZ1*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 7 ; i++) {
						e1 = normal.clone().add(dirX1*1.2, 1.4-(0.2*i), dirZ1*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 180;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1-(0.2*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.4, 1-(0.2*i), dirZ1*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.6, 1-(0.2*i), dirZ1*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 5 ; i++) {
						e1 = normal.clone().add(dirX1*0.8, 1-(0.2*i), dirZ1*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 7 ; i++) {
						e1 = normal.clone().add(dirX1*1, 1.4-(0.2*i), dirZ1*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 7 ; i++) {
						e1 = normal.clone().add(dirX1*1.2, 1.4-(0.2*i), dirZ1*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}
				
				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 비공
	public void newEffect30() {

		Location loc = player.getLocation();
		World world = player.getWorld(); 
		
		world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.8f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var), 0.3, Math.sin(var));
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*1.5, 0.6, Math.sin(var)*1.5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
				}
				
				if(time % 3 == 0) {
					
					double arrowAngle1 = -80;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.1, -0.3, dirZ1*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -60;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.2, -0.25, dirZ1*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.4, -0.2, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -32;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.65, -0.1, dirZ1*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.9, 0, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.1, 0.03, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.06, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.5, 0.09, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.7, 0.12, dirZ1*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.15, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.1, 0.18, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.0, 0.13, dirZ1*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.08, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.8, 0.03, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ1*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ1*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ1*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle3 = 260;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.1, -0.3, dirZ3*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 240;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.2, -0.25, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 220;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.4, -0.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.65, -0.1, dirZ3*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.9, 0, dirZ3*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.1, 0.03, dirZ3*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.3, 0.06, dirZ3*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.5, 0.09, dirZ3*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.7, 0.12, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.15, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.1, 0.18, dirZ3*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.0, 0.13, dirZ3*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.08, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.8, 0.03, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ3*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ3*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ3*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 데빌 블레스터
	public void newEffect31() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
		new BukkitRunnable() {
			int time = 0;
			double var = 0;
			Location first;

			@Override
			public void run() {
				
				if(time <= 16) {
					var += Math.PI / 8;

					first = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*9, 0.1, Math.sin(var)*9);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*8, 0.2, Math.sin(var)*8);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*7, 0.3, Math.sin(var)*7);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*6, 0.4, Math.sin(var)*6);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*4, 0.6, Math.sin(var)*4);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*3, 0.7, Math.sin(var)*3);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*2, 0.8, Math.sin(var)*2);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*1, 0.9, Math.sin(var)*1);
					world.spawnParticle(Particle.CRIT, first, 0);
					first = normal.clone().add(Math.cos(var)*0, 1, Math.sin(var)*0);
					world.spawnParticle(Particle.CRIT, first, 0);
					
					player.getWorld().playSound(player.getLocation(), Sound.ENTITY_ARROW_HIT, 1.0f, 1.0f);
				}
				
				if(time >= 20 && time <= 24) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						first = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, first, 0);
						
						var += Math.PI / 8;
					}
					
					player.getWorld().playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 2.0f);
				}

				if(time >= 25) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 사신 걸음
	public void newEffect32() {
	
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 0, 0), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(150, 150, 0), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var1 = 0;
			double var2 = 0;
			Location first;

			@Override
			public void run() {
				Location normal = player.getLocation();
				
				if(time <= 32) {
					var1 += Math.PI / 16;

					first = normal.clone().add(Math.cos(var1)*1, 0.6, Math.sin(var1)*1);
					world.spawnParticle(Particle.REDSTONE, first, 10, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, first, 10, dustOptions2);
				}
				
				if(time <= 32) {
					var2 -= Math.PI / 16;

					first = normal.clone().add(Math.cos(var2)*1, 0.6, Math.sin(var2)*1);
					world.spawnParticle(Particle.REDSTONE, first, 10, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, first, 10, dustOptions2);
				}

				if(time >= 40) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 영혼 걸음
	public void newEffect33() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 250, 250), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 100, 250), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;

			@Override
			public void run() {
				Location normal = player.getLocation();
				
				double rot = normal.getYaw();
				double dirX = Math.cos(Math.toRadians(rot));
				double dirZ = Math.sin(Math.toRadians(rot));
				
				if (time % 8 == 0) {
					
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1*dirX, Math.sin(var)*1, Math.cos(var)*1*dirZ);
						world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions1);
						world.spawnParticle(Particle.REDSTONE, e1, 5, dustOptions2);
						
						var += Math.PI / 8;
					}
					
				}

				if(time >= 24) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 카르마
	public void newEffect34() {
		
		World world = player.getWorld(); 
		
		Location normal = ent.getLocation();
		
		double arrowAngle1 = -70;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = -40;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 10;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle4 = 70;
        double totalAngle4 = normal.getYaw() + arrowAngle4;
        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
        
        double arrowAngle5 = 100;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle6 = 140;
        double totalAngle6 = normal.getYaw() + arrowAngle6;
        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
        
        double arrowAngle7 = 190;
        double totalAngle7 = normal.getYaw() + arrowAngle7;
        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
        
        double arrowAngle8 = 250;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 320;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 100, 250), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(30, 30, 30), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int i = 0;
			int j = 0;
			Location e1, e2, e3, e4, e5, e6, e7, e8, e9;

			@Override
			public void run() {
				
				if (time == 1 || time == 4 || time == 7) {
					i += 3;
					
					e1 = normal.clone().add(dirX1 * (2 - (0.2 * i)), 1.5, dirZ1 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e2 = normal.clone().add(dirX2 * (2 - (0.2 * i)), 1.4, dirZ2 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e2, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e2, 0, dustOptions2);

					e3 = normal.clone().add(dirX3 * (2 - (0.2 * i)), 0.5, dirZ3 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e3, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e3, 0, dustOptions2);

					e4 = normal.clone().add(dirX4 * (2 - (0.2 * i)), 0.3, dirZ4 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e4, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e4, 0, dustOptions2);
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 0.0f);
				}
				
				if (time == 10 || time == 13 || time == 16) {
					j += 3;

					e5 = normal.clone().add(dirX5 * (2 - (0.2 * j)), 1.1, dirZ5 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e5, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e5, 0, dustOptions2);

					e6 = normal.clone().add(dirX6 * (2 - (0.2 * j)), 1.4, dirZ6 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e6, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e6, 0, dustOptions2);

					e7 = normal.clone().add(dirX7 * (2 - (0.2 * j)), 1.3, dirZ7 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e7, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e7, 0, dustOptions2);

					e8 = normal.clone().add(dirX8 * (2 - (0.2 * j)), 0.9, dirZ8 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e8, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e8, 0, dustOptions2);

					e9 = normal.clone().add(dirX9 * (2 - (0.2 * j)), 1, dirZ9 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e9, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e9, 0, dustOptions2);
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time >= 20) {
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.5f, 3.0f);
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 칼라수트라
	public void newEffect35() {
		
		World world = player.getWorld(); 
		Location normal = player.getLocation();
		
		double arrowAngle1 = 0;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle3 = 72;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle5 = 144;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle8 = 216;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 288;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 0, 0), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(150, 150, 0), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int i = 0;
			int j = 0;
			Location e1, e2, e3, e4, e5;

			@Override
			public void run() {
				
				if (time <= 10) {
					i += 1;
					
					e1 = normal.clone().add(dirX1 * (2 - (0.1 * i)), 1.5, dirZ1 * (2 - (0.1 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e2 = normal.clone().add(dirX3 * (2 - (0.1 * i)), 1.4, dirZ3 * (2 - (0.1 * i)));
					world.spawnParticle(Particle.REDSTONE, e2, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e2, 0, dustOptions2);

					e3 = normal.clone().add(dirX5 * (2 - (0.1 * i)), 0.5, dirZ5 * (2 - (0.1 * i)));
					world.spawnParticle(Particle.REDSTONE, e3, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e3, 0, dustOptions2);

					e4 = normal.clone().add(dirX8 * (2 - (0.1 * i)), 1.1, dirZ8 * (2 - (0.1 * i)));
					world.spawnParticle(Particle.REDSTONE, e4, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e4, 0, dustOptions2);
					
					e5 = normal.clone().add(dirX9 * (2 - (0.1 * i)), 0.6, dirZ9 * (2 - (0.1 * i)));
					world.spawnParticle(Particle.REDSTONE, e5, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e5, 0, dustOptions2);
					
				}
				
				if(time >= 10) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 지옥불
	public void newEffect36() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 0, 0), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(150, 150, 0), 1);
		Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(200, 200, 30), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var = 0;
			Location first;

			@Override
			public void run() {
				
				if(time <= 16) {
					var += Math.PI / 8;

					first = normal.clone().add(Math.cos(var)*5, 0.5, Math.sin(var)*5);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					first = normal.clone().add(Math.cos(var)*4, 0.6, Math.sin(var)*4);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					first = normal.clone().add(Math.cos(var)*3, 0.7, Math.sin(var)*3);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					first = normal.clone().add(Math.cos(var)*2, 0.8, Math.sin(var)*2);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					first = normal.clone().add(Math.cos(var)*1, 0.9, Math.sin(var)*1);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					first = normal.clone().add(Math.cos(var)*0, 1, Math.sin(var)*0);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions3);
					
					player.getWorld().playSound(player.getLocation(), Sound.ENTITY_CREEPER_PRIMED, 0.8f, 2.0f);
				}
				
				if(time == 20) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						first = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions1);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions2);
						first = normal.clone().add(Math.cos(var)*5, 0.2, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions1);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions2);
						first = normal.clone().add(Math.cos(var)*5, 0.4, Math.sin(var)*5);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions1);
						world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions2);
						
						world.spawnParticle(Particle.LAVA, first, 0);
						
						var += Math.PI / 32;
					}
					
					player.getWorld().playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LARGE_BLAST, 2.0f, 0.3f);
				}

				if(time >= 25) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 영혼 흡착
	public void newEffect37() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
		
		double arrowAngle1 = 0;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle3 = 72;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle5 = 144;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle8 = 216;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 288;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 20, 150), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			int i = 0;
			
		    Location e1, e2, e3, e4, e5;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e4 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e4 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.SOUL, e4, 0);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					i++;
					
					e1 = normal.clone().add(dirX1 * (10 - (2 * i)), 5 - i, dirZ1 * (10 - (2 * i)));
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e1, 0);
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e1, 0);

					e2 = normal.clone().add(dirX3 * (10 - (2 * i)), 5 - i, dirZ3 * (10 - (2 * i)));
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e2, 0);
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e2, 0);

					e3 = normal.clone().add(dirX5 * (10 - (2 * i)), 5 - i, dirZ5 * (10 - (2 * i)));
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e3, 0);
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e3, 0);

					e4 = normal.clone().add(dirX8 * (10 - (2 * i)), 5 - i, dirZ8 * (10 - (2 * i)));
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e4, 0);
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e4, 0);
					
					e5 = normal.clone().add(dirX9 * (10 - (2 * i)), 5 - i, dirZ9 * (10 - (2 * i)));
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e5, 0);
					world.spawnParticle(Particle.SOUL_FIRE_FLAME, e5, 0);
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 천사의 날개
	public void newEffect38() {

		Location loc = player.getLocation();
		World world = player.getWorld(); 
		
		world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.8f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getEyeLocation();
				
				if(time % 4 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var), 0.3, Math.sin(var));
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*1.5, 0.6, Math.sin(var)*1.5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
				}
				
				if(time % 3 == 0) {
					
					double arrowAngle1 = -80;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.1, -0.3, dirZ1*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -60;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.2, -0.25, dirZ1*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -40;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.4, -0.2, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -32;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.65, -0.1, dirZ1*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*0.9, 0, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.1, 0.03, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.3, 0.06, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.5, 0.09, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.7, 0.12, dirZ1*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.15, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.1, 0.18, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*2.0, 0.13, dirZ1*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.9, 0.08, dirZ1*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle1 = -28;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					e1 = normal.clone().add(dirX1*1.8, 0.03, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ1*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ1*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle1 = -28;
						totalAngle1 = normal.getYaw() + arrowAngle1;
						dirX1 = Math.cos(Math.toRadians(totalAngle1));
						dirZ1 = Math.sin(Math.toRadians(totalAngle1));
						
						e1 = normal.clone().add(dirX1*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ1*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle3 = 260;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.1, -0.3, dirZ3*0.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 240;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.2, -0.25, dirZ3*0.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 220;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.4, -0.2, dirZ3*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.65, -0.1, dirZ3*0.65);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*0.9, 0, dirZ3*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.1, 0.03, dirZ3*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.3, 0.06, dirZ3*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.5, 0.09, dirZ3*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.7, 0.12, dirZ3*1.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.15, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.1, 0.18, dirZ3*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*2.0, 0.13, dirZ3*2.0);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.9, 0.08, dirZ3*1.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);

					arrowAngle3 = 212;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX3 = Math.cos(Math.toRadians(totalAngle3));
					dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = normal.clone().add(dirX3*1.8, 0.03, dirZ3*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					for(int i = 0 ; i < 16 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(2.0-(i*0.1)), (-0.13-(i*0.01)), dirZ3*(2.0-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 14 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1.6-(i*0.1)), (-0.4-(i*0.01)), dirZ3*(1.6-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 10 ; i++) {
						arrowAngle3 = 212;
						totalAngle3 = normal.getYaw() + arrowAngle3;
						dirX3 = Math.cos(Math.toRadians(totalAngle3));
						dirZ3 = Math.sin(Math.toRadians(totalAngle3));
						
						e1 = normal.clone().add(dirX3*(1-(i*0.1)), (-0.65+(i*0.02)), dirZ3*(1-(i*0.1)));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 천사의 기사단
	public void newEffect39() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 150), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*0.5, 2.2, Math.sin(var)*0.5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 천사의 축복
	public void newEffect40() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e1 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e1 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 5 == 0) {

					double arrowAngle1 = 0;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					//0번
					e1 = normal.clone().add(dirX1*1.3, 4.7, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.6, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.5, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 4.4, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 4.3, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 4.2, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 4.1, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 4.0, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.9, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.8, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//1번
					e1 = normal.clone().add(dirX1*3, 5, dirZ1*3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.7, 4.9, dirZ1*2.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.4, 4.8, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 4.7, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 4.6, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 4.5, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 4.4, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.3, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.2, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 4.1, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 4.0, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.9, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.8, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.7, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//2번
					e1 = normal.clone().add(dirX1*2.7, 4.6, dirZ1*2.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.4, 4.52, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 4.44, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 4.36, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 4.28, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 4.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.12, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.04, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.96, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 3.88, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.8, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.7, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);

					//3번
					e1 = normal.clone().add(dirX1*2.4, 4.0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 3.96, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 3.92, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 3.88, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 3.84, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 3.8, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.76, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.72, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 3.68, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.64, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.6, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//4번
					e1 = normal.clone().add(dirX1*1.8, 3.58, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 3.56, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.2, 3.54, dirZ1*1.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.52, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.5, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.48, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//5번
					e1 = normal.clone().add(dirX1*1.2, 3.32, dirZ1*1.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.36, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.4, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.44, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);

					arrowAngle1 = 180;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));

					//0번
					e1 = normal.clone().add(dirX1*1.3, 4.7, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.6, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.5, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 4.4, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 4.3, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 4.2, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 4.1, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 4.0, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.9, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.8, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//1번
					e1 = normal.clone().add(dirX1*3, 5, dirZ1*3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.7, 4.9, dirZ1*2.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.4, 4.8, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 4.7, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 4.6, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 4.5, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 4.4, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.3, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.2, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 4.1, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 4.0, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.9, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.8, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.3, 3.7, dirZ1*0.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//2번
					e1 = normal.clone().add(dirX1*2.7, 4.6, dirZ1*2.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.4, 4.52, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 4.44, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 4.36, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 4.28, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 4.2, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 4.12, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 4.04, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.96, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 3.88, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.8, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.7, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);

					//3번
					e1 = normal.clone().add(dirX1*2.4, 4.0, dirZ1*2.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*2.1, 3.96, dirZ1*2.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.8, 3.92, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 3.88, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.3, 3.84, dirZ1*1.3);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.1, 3.8, dirZ1*1.1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.76, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.72, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.6, 3.68, dirZ1*0.6);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.64, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.4, 3.6, dirZ1*0.4);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//4번
					e1 = normal.clone().add(dirX1*1.8, 3.58, dirZ1*1.8);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.5, 3.56, dirZ1*1.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*1.2, 3.54, dirZ1*1.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.52, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.5, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.48, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					//5번
					e1 = normal.clone().add(dirX1*1.2, 3.32, dirZ1*1.2);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.9, 3.36, dirZ1*0.9);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.7, 3.4, dirZ1*0.7);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
					e1 = normal.clone().add(dirX1*0.5, 3.44, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
					
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 신비의 대행
	public void newEffect41() {
		
		World world = player.getWorld(); 
		
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*1, 0, Math.sin(var)*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.9, 0.2, Math.sin(var)*0.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.8, 0.4, Math.sin(var)*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.7, 0.2, Math.sin(var)*0.7);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.6, 0, Math.sin(var)*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.5, 0.2, Math.sin(var)*0.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.4, 0.4, Math.sin(var)*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.3, 0.2, Math.sin(var)*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.2, 0, Math.sin(var)*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						e1 = normal.clone().add(Math.cos(var)*0.1, 0, Math.sin(var)*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
				}

				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 신의 경고
	public void newEffect42() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 50, 50), 1);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX1*0, 4-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX2*0.15, 8-(j*0.2), dirZ2*0.15);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*0.15, 4-(j*0.2), dirZ2*0.15);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX2*0.3, 8-(j*0.2), dirZ2*0.34);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*0.3, 4-(j*0.2), dirZ2*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX3*0.15, 8-(j*0.2), dirZ3*0.15);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*0.15, 4-(j*0.2), dirZ3*0.15);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX3*0.3, 8-(j*0.2), dirZ3*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*0.3, 4-(j*0.2), dirZ3*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 신의 통고
	public void newEffect43() {
		
		World world = player.getWorld(); 
		
		Location normal = ent.getLocation();
		
		double arrowAngle1 = -70;
        double totalAngle1 = normal.getYaw() + arrowAngle1;
        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
        
        double arrowAngle2 = -40;
        double totalAngle2 = normal.getYaw() + arrowAngle2;
        double dirX2 = Math.cos(Math.toRadians(totalAngle2));
        double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
        
        double arrowAngle3 = 10;
        double totalAngle3 = normal.getYaw() + arrowAngle3;
        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
        
        double arrowAngle4 = 70;
        double totalAngle4 = normal.getYaw() + arrowAngle4;
        double dirX4 = Math.cos(Math.toRadians(totalAngle4));
        double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
        
        double arrowAngle5 = 100;
        double totalAngle5 = normal.getYaw() + arrowAngle5;
        double dirX5 = Math.cos(Math.toRadians(totalAngle5));
        double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
        
        double arrowAngle6 = 140;
        double totalAngle6 = normal.getYaw() + arrowAngle6;
        double dirX6 = Math.cos(Math.toRadians(totalAngle6));
        double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
        
        double arrowAngle7 = 190;
        double totalAngle7 = normal.getYaw() + arrowAngle7;
        double dirX7 = Math.cos(Math.toRadians(totalAngle7));
        double dirZ7 = Math.sin(Math.toRadians(totalAngle7));
        
        double arrowAngle8 = 250;
        double totalAngle8 = normal.getYaw() + arrowAngle8;
        double dirX8 = Math.cos(Math.toRadians(totalAngle8));
        double dirZ8 = Math.sin(Math.toRadians(totalAngle8));
        
        double arrowAngle9 = 320;
        double totalAngle9 = normal.getYaw() + arrowAngle9;
        double dirX9 = Math.cos(Math.toRadians(totalAngle9));
        double dirZ9 = Math.sin(Math.toRadians(totalAngle9));
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 250, 50), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(250, 250, 250), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int i = 0;
			int j = 0;
			Location e1;

			@Override
			public void run() {
				
				if (time == 1 || time == 4 || time == 7) {
					i += 3;
					
					e1 = normal.clone().add(dirX1 * (2 - (0.2 * i)), 1.5-(i*0.1), dirZ1 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX2 * (2 - (0.2 * i)), 1.4-(i*0.1), dirZ2 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX3 * (2 - (0.2 * i)), 0.5+(i*0.1), dirZ3 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX4 * (2 - (0.2 * i)), 0.3+(i*0.1), dirZ4 * (2 - (0.2 * i)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.5f, 1.0f);
				}
				
				if (time == 10 || time == 13 || time == 16) {
					j += 3;

					e1 = normal.clone().add(dirX5 * (2 - (0.2 * j)), 1.1+(i*0.1), dirZ5 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX6 * (2 - (0.2 * j)), 1.4-(i*0.1), dirZ6 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX7 * (2 - (0.2 * j)), 1.3-(i*0.1), dirZ7 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX8 * (2 - (0.2 * j)), 0.9+(i*0.1), dirZ8 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = normal.clone().add(dirX9 * (2 - (0.2 * j)), 1-(i*0.1), dirZ9 * (2 - (0.2 * j)));
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.5f, 1.0f);
				}
				
				if(time >= 20) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 신의 심판
	public void newEffect44() {
		
		World world = player.getWorld(); 
		
		Location loc = player.getLocation();
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 250, 50), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;

			@Override
			public void run() {
				
				if(time % 5 == 0) {
					// 1번
					double arrowAngle1 = 90;
					double totalAngle1 = loc.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					Location normal = loc.clone().add(dirX1*2.5, 0, dirZ1*2.5);
					
					arrowAngle1 = 90;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0, 2-(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 0;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 180;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 60;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = -30;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 150;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 120;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 30;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle1 = 210;
					totalAngle1 = normal.getYaw() + arrowAngle1;
					dirX1 = Math.cos(Math.toRadians(totalAngle1));
					dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 2번
					double arrowAngle2 = 180;
					double totalAngle2 = loc.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					normal = loc.clone().add(dirX1*2.5, 0, dirZ1*2.5);
					
					arrowAngle2 = 90;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0, 2-(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 0;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 180;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 60;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = -30;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 150;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 120;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 30;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle2 = 210;
					totalAngle2 = normal.getYaw() + arrowAngle2;
					dirX1 = Math.cos(Math.toRadians(totalAngle2));
					dirZ1 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 3번
					double arrowAngle3 = 270;
					double totalAngle3 = loc.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					normal = loc.clone().add(dirX1*2.5, 0, dirZ1*2.5);
					
					arrowAngle3 = 90;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0, 2-(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 0;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 180;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 60;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = -30;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 150;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 120;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 30;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle3 = 210;
					totalAngle3 = normal.getYaw() + arrowAngle3;
					dirX1 = Math.cos(Math.toRadians(totalAngle3));
					dirZ1 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 4번
					double arrowAngle4 = 0;
					double totalAngle4 = loc.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					normal = loc.clone().add(dirX1*2.5, 0, dirZ1*2.5);
					
					arrowAngle4 = 90;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0, 2-(0.2*i), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 0;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 180;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*0.1, 2-(0.2*i), dirZ1*0.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.2, 1.6-(0.1*i), dirZ1*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*0.3, 1.6-(0.1*i), dirZ1*0.3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 60;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = -30;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 150;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 120;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1*2, 2-(0.2*i), dirZ1*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 30;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					arrowAngle4 = 210;
					totalAngle4 = normal.getYaw() + arrowAngle4;
					dirX1 = Math.cos(Math.toRadians(totalAngle4));
					dirZ1 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.1, 1.6-(0.1*i), dirZ1*2.1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int i = 0 ; i < 2 ; i++) {
						e1 = normal.clone().add(dirX1*2.2, 1.6-(0.1*i), dirZ1*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 2.0f);
				}
				
				if(time >= 30) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 신의 강림
	public void newEffect45() {
		
		Location normal = player.getEyeLocation();
		World world = player.getWorld(); 
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		double arrowAngle2 = 115;
		double totalAngle2 = normal.getYaw() + arrowAngle2;
		double dirX2 = Math.cos(Math.toRadians(totalAngle2));
		double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
		
		double arrowAngle3 = 145;
		double totalAngle3 = normal.getYaw() + arrowAngle3;
		double dirX3 = Math.cos(Math.toRadians(totalAngle3));
		double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
		
		double arrowAngle4 = 65;
		double totalAngle4 = normal.getYaw() + arrowAngle4;
		double dirX4 = Math.cos(Math.toRadians(totalAngle4));
		double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
		
		double arrowAngle5 = 30;
		double totalAngle5 = normal.getYaw() + arrowAngle5;
		double dirX5 = Math.cos(Math.toRadians(totalAngle5));
		double dirZ5 = Math.sin(Math.toRadians(totalAngle5));
		
		double arrowAngle6 = 180;
		double totalAngle6 = normal.getYaw() + arrowAngle6;
		double dirX6 = Math.cos(Math.toRadians(totalAngle6));
		double dirZ6 = Math.sin(Math.toRadians(totalAngle6));
        
		Location e1;
		FallingBlock fb;
		
		world.playSound(player.getLocation(), Sound.ITEM_TRIDENT_THUNDER, 1.0f, 0.5f);
		
		// 중지
		e1 = normal.clone().add(dirX1*0, 3, dirZ1*0);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*0.5, 2.8, dirZ1*0.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*1, 2.7, dirZ1*1);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*1.5, 2.6, dirZ1*1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*2, 2.5, dirZ1*2);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*2.5, 2.45, dirZ1*2.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*3, 2.4, dirZ1*3);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*3.5, 2.35, dirZ1*3.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*4, 2.3, dirZ1*4);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*4.5, 2.25, dirZ1*4.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX1*5, 2.2, dirZ1*5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*5.5, 2.15, dirZ1*5.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*6, 2.1, dirZ1*6);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*6.5, 2.05, dirZ1*6.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		// 무명지
		e1 = normal.clone().add(dirX2*0.5, 2.8, dirZ2*0.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*1, 2.7, dirZ2*1);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*1.5, 2.6, dirZ2*1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*2, 2.5, dirZ2*2);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*2.5, 2.45, dirZ2*2.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*3, 2.4, dirZ2*3);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*3.5, 2.35, dirZ2*3.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*4, 2.3, dirZ2*4);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*4.5, 2.25, dirZ2*4.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*5, 2.2, dirZ2*5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*5.5, 2.15, dirZ2*5.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		// 약지
		e1 = normal.clone().add(dirX3*0.5, 2.8, dirZ3*0.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*1, 2.7, dirZ3*1);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*1.5, 2.6, dirZ3*1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*2, 2.5, dirZ3*2);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*2.5, 2.45, dirZ3*2.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*3, 2.4, dirZ3*3);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*3.5, 2.35, dirZ3*3.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*4, 2.3, dirZ3*4);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		// 검지
		e1 = normal.clone().add(dirX4 * 0.5, 2.8, dirZ4 * 0.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 1, 2.7, dirZ4 * 1);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 1.5, 2.6, dirZ4 * 1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 2, 2.5, dirZ4 * 2);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 2.5, 2.45, dirZ4 * 2.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 3, 2.4, dirZ4 * 3);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 3.5, 2.35, dirZ4 * 3.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 4, 2.3, dirZ4 * 4);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 4.5, 2.25, dirZ4 * 4.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX4 * 5, 2.2, dirZ4 * 5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX4 * 5.5, 2.15, dirZ4 * 5.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		// 엄지
		e1 = normal.clone().add(dirX5 * 1.5, 2.5, dirZ5 * 1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX5 * 2, 2.4, dirZ5 * 2);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX5 * 2.5, 2.3, dirZ5 * 2.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);

		e1 = normal.clone().add(dirX5 * 3, 2.2, dirZ5 * 3);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		// 손바닥
		e1 = normal.clone().add(dirX1*(-0.5), 2.8, dirZ1*(-0.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*(-0.5), 2.8, dirZ2*(-0.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*(-0.5), 2.8, dirZ3*(-0.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX4*(-0.5), 2.8, dirZ4*(-0.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX5*(-0.5), 2.8, dirZ5*(-0.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*(-1), 2.7, dirZ1*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*(-1), 2.7, dirZ2*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*(-1), 2.7, dirZ3*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX4*(-1), 2.7, dirZ4*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX5*(-1), 2.7, dirZ5*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX1*(-1.5), 2.6, dirZ1*(-1.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX2*(-1.5), 2.6, dirZ2*(-1.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX3*(-1.5), 2.6, dirZ3*(-1.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX4*(-1.5), 2.6, dirZ4*(-1.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX5*(-1.5), 2.6, dirZ5*(-1.5));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX6*(-1), 2.6, dirZ6*(-1));
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
		
		e1 = normal.clone().add(dirX6*1.5, 2.6, dirZ6*1.5);
		fb = (FallingBlock) world.spawnFallingBlock(e1, Material.SANDSTONE, (byte) 0);
		fb.setDropItem(false);
	}
	
	// 신의 축복
	public void newEffect46() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e2 = normal.clone().add(Math.cos(var)*(size/2.0), size*0.1, Math.sin(var)*(size/2.0));
						world.spawnParticle(Particle.REDSTONE, e2, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = normal.clone().add(Math.cos(var), 0, Math.sin(var));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 신의 장난
	public void newEffect47() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions ly = new Particle.DustOptions(Color.fromRGB(250, 200, 150), 1);
        Particle.DustOptions y = new Particle.DustOptions(Color.fromRGB(180, 150, 50), 1);
        Particle.DustOptions b = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
        Particle.DustOptions w = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        Particle.DustOptions dy = new Particle.DustOptions(Color.fromRGB(120, 100, 20), 1);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 5 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX1*0, 8-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX1*0, 7.8-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX1*0, 6.6-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX1*0, 6.2-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX1*0, 5.8-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX1*0, 5.4-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX1*0, 5.2-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX1*0, 4.4-(j*0.2+1), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					// 1
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 8-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 7.8-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 5.8-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 5.4-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 5.2-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 4.4-(j*0.2+1), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 2
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 8-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 11 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 7.8-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 5.8-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 5.4-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 5.2-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 4.4-(j*0.2+1), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 3
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 8-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 11 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 7.8-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 5.8-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 5.4-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 5.2-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 4.4-(j*0.2+1), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 4
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 8.2-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 8-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 11 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 7.8-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 5.8-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 5.4-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 5.2-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 4.4-(j*0.2+1), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 5
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 8.4-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1, 8.2-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*1, 7.8-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1, 6.8-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 6.4-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 6.2-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1, 6-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 5.8-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 5.6-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1, 5.2-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1, 4.4-(j*0.2+1), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 6
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 8.2-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 8-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 7.8-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 6.8-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 6.4-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 6.2-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 5.6-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 5.4-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 5.2-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 4.4-(j*0.2+1), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 7
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 8-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 7.4-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 6.8-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 6.4-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 6.2-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 5.4-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 4.6-(j*0.2+1), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 8
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 7.4-(j*0.2+1), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 6.8-(j*0.2+1), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 6.2-(j*0.2+1), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 5.6-(j*0.2+1), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 4.8-(j*0.2+1), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 9
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 6.8-(j*0.2+1), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 6.2-(j*0.2+1), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 6-(j*0.2+1), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 5.2-(j*0.2+1), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 10
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*2, 6.2-(j*0.2+1), dirZ2*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					// 1
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 8-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 7.8-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 6.6-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 6.2-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 6-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 4.4-(j*0.2+1), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 2
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 8.2-(j*0.2+1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 8-(j*0.2+1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 9 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 7.8-(j*0.2+1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 6-(j*0.2+1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 4.4-(j*0.2+1), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 3
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 8.4-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 8.2-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 9 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 7.6-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 5.8-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 4.8-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 4.4-(j*0.2+1), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 4
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 8.4-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 8.2-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 7.4-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 5.4-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 5-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 4.4-(j*0.2+1), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 5
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1, 8.2-(j*0.2+1), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1, 7.8-(j*0.2+1), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, ly);
					}
					
					for(int j = 0 ; j < 9 ; j++) {
						e1 = normal.clone().add(dirX3*1, 7.2-(j*0.2+1), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*1, 5.4-(j*0.2+1), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*1, 4.4-(j*0.2+1), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 6
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 7.8-(j*0.2+1), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 7.2-(j*0.2+1), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 5.6-(j*0.2+1), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 4.6-(j*0.2+1), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 7
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 7.2-(j*0.2+1), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 6.8-(j*0.2+1), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 5.8-(j*0.2+1), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 1 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 4.8-(j*0.2+1), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 8
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 6.8-(j*0.2+1), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 6.4-(j*0.2+1), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, y);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 6-(j*0.2+1), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dy);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 5.2-(j*0.2+1), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 9
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*1.8, 6.4-(j*0.2+1), dirZ3*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 신의 풍악
	public void newEffect48() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions b = new Particle.DustOptions(Color.fromRGB(180, 180, 255), 1);
        Particle.DustOptions w = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 150, 50), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(250, 230, 100), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e1 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e1 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						world.spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time % 5 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX1*0, 6-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX1*0, 3-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 6.1-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 3.1-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 6.2-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 3.2-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 6.4-(j*0.2), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 3.4-(j*0.2), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 6.6-(j*0.2), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 3.6-(j*0.2), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 6.8-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 3.8-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 7-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 4-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 7.2-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 4.4-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 7.4-(j*0.2), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 5.4-(j*0.2), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 7.6-(j*0.2), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 7-(j*0.2), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*2.0, 7.8-(j*0.2), dirZ2*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 17 ; j++) {
						e1 = normal.clone().add(dirX2*2.0, 7.4-(j*0.2), dirZ2*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 옆
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX2*2.2, 7.4-(j*0.2), dirZ2*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX2*2.4, 7-(j*0.2), dirZ2*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 동그라미
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX2*2.2, 7.8-(j*0.2), dirZ2*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*2.4, 7.9-(j*0.2), dirZ2*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*2.6, 8-(j*0.2), dirZ2*2.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*2.8, 7.9-(j*0.2), dirZ2*2.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*3, 7.8-(j*0.2), dirZ2*3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 줄
					for(int j = 0 ; j < 13 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 5.8-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX2*1, 6.4-(j*0.2), dirZ2*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 6.1-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 3.1-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 6.2-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 3.2-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 6.4-(j*0.2), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 3.4-(j*0.2), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 6.6-(j*0.2), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 3.6-(j*0.2), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 6.8-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 3.8-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 7-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 4-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 7.2-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 4.4-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 7.4-(j*0.2), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 5.4-(j*0.2), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.8, 7.6-(j*0.2), dirZ3*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 15 ; j++) {
						e1 = normal.clone().add(dirX3*1.8, 7-(j*0.2), dirZ3*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*2.0, 7.8-(j*0.2), dirZ3*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 17 ; j++) {
						e1 = normal.clone().add(dirX3*2.0, 7.4-(j*0.2), dirZ3*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 옆
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX3*2.2, 7.4-(j*0.2), dirZ3*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX3*2.4, 7-(j*0.2), dirZ3*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 동그라미
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX3*2.2, 7.8-(j*0.2), dirZ3*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*2.4, 7.9-(j*0.2), dirZ3*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*2.6, 8-(j*0.2), dirZ3*2.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*2.8, 7.9-(j*0.2), dirZ3*2.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*3, 7.8-(j*0.2), dirZ3*3);
						world.spawnParticle(Particle.REDSTONE, e1, 0, b);
					}
					
					// 줄
					for(int j = 0 ; j < 13 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 5.8-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX3*1, 6.4-(j*0.2), dirZ3*1);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}

	// 블링크
	public void newEffect49() {
		
		World world = player.getWorld(); 
        
        Particle.DustOptions r = new Particle.DustOptions(Color.fromRGB(255, 50, 50), 1);
        Particle.DustOptions w = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*0.5, 0, Math.sin(var)*0.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, r);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
						
						var += Math.PI / 4;
					}
				}
				
				if(time % 2 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX1*0, 1-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, r);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*0, 0.8-(j*0.2), dirZ2*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, r);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0, 0.8-(j*0.2), dirZ3*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, r);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
					double arrowAngle4 = 60;
					double totalAngle4 = normal.getYaw() + arrowAngle4;
					double dirX4 = Math.cos(Math.toRadians(totalAngle4));
					double dirZ4 = Math.sin(Math.toRadians(totalAngle4));
					
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX4*0, 0.6-(j*0.2), dirZ4*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, r);
						world.spawnParticle(Particle.REDSTONE, e1, 0, w);
					}
					
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 루인 오브 노바
	public void newEffect50(int damNum) {

		Location loc = player.getLocation();
		World world = player.getWorld(); 
		
		world.playSound(loc, Sound.BLOCK_PORTAL_TRAVEL, 1.0f, 3.0f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(200, 200, 200), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 200, 50), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				world.playSound(loc, Sound.ENTITY_SILVERFISH_HURT, 0.6f, 1.0f);
				
				if(time == 0) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
				}
				
				if(time == 2) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 4) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 6) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 8) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
				}
				
				if(time == 10) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI + Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
				}
				
				if(time == 12) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
				}
				
				if(time == 14) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI + 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
				}
				
				if(time == 16 || time == 20 || time == 24) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}

					var = 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
					
					var = Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = Math.PI + Math.PI / 2;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	
					
					var = Math.PI + 3 * Math.PI / 4;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}	

					var = 2 * Math.PI;
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*(0.8*i), 0.2, Math.sin(var+rot)*(0.8*i));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 16;
					}
				}
				
				if(time == 20) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*8, 0.2, Math.sin(var)*8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}	
					
					world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 0.5f);
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}
				
				if(time == 21) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*8, 0.2, Math.sin(var)*8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}	
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*6.5, 1.4, Math.sin(var)*6.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*5.5, 2.6, Math.sin(var)*5.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}
				
				if(time == 22) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*8, 0.2, Math.sin(var)*8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}	
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*6.5, 1.4, Math.sin(var)*6.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*5.5, 2.6, Math.sin(var)*5.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*4.7, 4, Math.sin(var)*4.7);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*4, 5.2, Math.sin(var)*4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}
				
				if(time == 23) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*5.5, 2.6, Math.sin(var)*5.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*4.7, 4, Math.sin(var)*4.7);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*4, 5.2, Math.sin(var)*4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*3.4, 6.4, Math.sin(var)*3.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.9, 7.6, Math.sin(var)*2.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(8, 8, 8);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(Math.pow(player.getLevel(), 1.6) * 2 + damNum*10);
						}
					}
				}
				
				if(time == 24) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*4, 5.2, Math.sin(var)*4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*3.4, 6.4, Math.sin(var)*3.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.9, 7.6, Math.sin(var)*2.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.5, 8.8, Math.sin(var)*2.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.2, 10.0, Math.sin(var)*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}

					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}
				
				if(time == 25) {
					double var = 0;
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.9, 7.6, Math.sin(var)*2.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.5, 8.8, Math.sin(var)*2.5);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2.2, 10.0, Math.sin(var)*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*2, 11.2, Math.sin(var)*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					for(int i = 0 ; i < 64 ; i++) {
						e1 = loc.clone().add(Math.cos(var)*1.9, 12.4, Math.sin(var)*1.9);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 32;
					}
					
					world.playSound(loc, Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}


				if(time >= 25) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 어나더 디비니티
	public void newEffect51() {
		
		World world = player.getWorld(); 
		Location normal = ent.getLocation();
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
        
		new BukkitRunnable() {
			int time = 0;
			Location e1;
			double r = 0.3;

			@Override
			public void run() {
				
				if(time % 5 == 0 && time < 20) {
					world.playSound(normal, Sound.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
					
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 5) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 10) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							e1 = normal.clone().add(x, y, z);
							world.spawnParticle(Particle.REDSTONE, e1, 1, dustOptions1);
						}
					}
					
					r += 0.3;
				}
				
				if(time >= 20) {
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.5f, 1.0f);
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 스피릿 오브 오더
	public void newEffect52() {
		
		World world = player.getWorld(); 
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(70, 150, 230), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var1 = 0;
			double var2 = 0;
			Location first;

			@Override
			public void run() {
				Location normal = player.getLocation();
				
				if(time <= 32) {
					var1 += Math.PI / 16;

					first = normal.clone().add(Math.cos(var1)*1, 1.2-(time*0.03), Math.sin(var1)*1);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions2);
				}
				
				if(time <= 32) {
					var2 -= Math.PI / 16;

					first = normal.clone().add(Math.cos(var2)*1, 1.2-(time*0.03), Math.sin(var2)*1);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions1);
					world.spawnParticle(Particle.REDSTONE, first, 0, dustOptions2);
				}

				if(time >= 40) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 아이 오브 오더
	public void newEffect53() {

		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 255, 255), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(0, 150, 230), 1);
        Particle.DustOptions dustOptions3 = new Particle.DustOptions(Color.fromRGB(50, 230, 50), 1);
        Particle.DustOptions dustOptions4 = new Particle.DustOptions(Color.fromRGB(100, 255, 100), 1);
        
        world.playSound(normal, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						if(size % 2 == 0) {
							e1 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
						} else {
							e1 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
						}
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions4);
						
						var += Math.PI / 16;
					}
					
					if(size == 9) {
						size = -1;
					}
					size++;
				}
				
				if(time % 4 == 0) {
					double arrowAngle1 = 90;
					double totalAngle1 = normal.getYaw() + arrowAngle1;
					double dirX1 = Math.cos(Math.toRadians(totalAngle1));
					double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX1*0, 7-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX1*0, 5.4-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX1*0, 3.4-(j*0.2), dirZ1*0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle2 = 0;
					double totalAngle2 = normal.getYaw() + arrowAngle2;
					double dirX2 = Math.cos(Math.toRadians(totalAngle2));
					double dirZ2 = Math.sin(Math.toRadians(totalAngle2));
					
					// 1
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 7-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 12 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 5.6-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*0.2, 3.2-(j*0.2), dirZ2*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 2
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 7-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 5.8-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*0.4, 3-(j*0.2), dirZ2*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 3
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 7-(j*0.2), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 12 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 5.6-(j*0.2), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*0.6, 3.2-(j*0.2), dirZ2*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 4
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 7-(j*0.2), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 5.4-(j*0.2), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*0.8, 3.4-(j*0.2), dirZ2*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 5
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 7-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 5.8-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 5.2-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.0, 3.6-(j*0.2), dirZ2*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 6
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 7-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 5.6-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 5.0-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.2, 3.8-(j*0.2), dirZ2*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 7
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 7-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 5.4-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 4.8-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*1.4, 4.0-(j*0.2), dirZ2*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 8
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX2*1.6, 5.2-(j*0.2), dirZ2*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 9
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX2*1.8, 5.0-(j*0.2), dirZ2*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 10
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX2*2.0, 4.6-(j*0.2), dirZ2*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX2*2.2, 4.7-(j*0.2), dirZ2*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX2*2.4, 4.8-(j*0.2), dirZ2*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX2*2.6, 4.9-(j*0.2), dirZ2*2.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					double arrowAngle3 = 180;
					double totalAngle3 = normal.getYaw() + arrowAngle3;
					double dirX3 = Math.cos(Math.toRadians(totalAngle3));
					double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					// 1
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 7-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 12 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 5.6-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*0.2, 3.2-(j*0.2), dirZ3*0.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 2
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 7-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 14 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 5.8-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0.4, 3-(j*0.2), dirZ3*0.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 3
					for(int j = 0 ; j < 7 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 7-(j*0.2), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 12 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 5.6-(j*0.2), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0.6, 3.2-(j*0.2), dirZ3*0.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 4
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 7-(j*0.2), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 10 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 5.4-(j*0.2), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*0.8, 3.4-(j*0.2), dirZ3*0.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 5
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 7-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 5.8-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 5.2-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.0, 3.6-(j*0.2), dirZ3*1.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 6
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 7-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 5.6-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 5.0-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.2, 3.8-(j*0.2), dirZ3*1.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 7
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 7-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 5.4-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 4.8-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*1.4, 4.0-(j*0.2), dirZ3*1.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 8
					for(int j = 0 ; j < 8 ; j++) {
						e1 = normal.clone().add(dirX3*1.6, 5.2-(j*0.2), dirZ3*1.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 9
					for(int j = 0 ; j < 6 ; j++) {
						e1 = normal.clone().add(dirX3*1.8, 5.0-(j*0.2), dirZ3*1.8);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					// 10
					for(int j = 0 ; j < 2 ; j++) {
						e1 = normal.clone().add(dirX3*2.0, 4.6-(j*0.2), dirZ3*2.0);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 3 ; j++) {
						e1 = normal.clone().add(dirX3*2.2, 4.7-(j*0.2), dirZ3*2.2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 4 ; j++) {
						e1 = normal.clone().add(dirX3*2.4, 4.8-(j*0.2), dirZ3*2.4);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					for(int j = 0 ; j < 5 ; j++) {
						e1 = normal.clone().add(dirX3*2.6, 4.9-(j*0.2), dirZ3*2.6);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*10, 0, Math.sin(var)*10);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 0, dustOptions3);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 돌격
	public void newEffect54() {

		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(255, 0, 0), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
        
        world.playSound(normal, Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 5.0f);
        
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location loc = player.getLocation();
				
				double arrowAngle1 = 90;
				double totalAngle1 = loc.getYaw() + arrowAngle1;
				double dirX1 = Math.cos(Math.toRadians(totalAngle1));
				double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
				
				e1 = loc.clone().add(dirX1*(-2+time*0.1), 5-(time*0.2), dirZ1*(-2+time*0.1));
				world.spawnParticle(Particle.REDSTONE, e1, 100, dustOptions1);
				world.spawnParticle(Particle.REDSTONE, e1, 100, dustOptions2);

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 헬파이어
	public void newEffect55(int damNum) {

		Location normal = player.getEyeLocation();
		World world = player.getWorld();

		new BukkitRunnable() {
			int time = 0;
			double var = 0;

			Location e1, e2;
			
			double rot = normal.getYaw();
			double dirX = Math.cos(Math.toRadians(rot));
			double dirZ = Math.sin(Math.toRadians(rot));

			@Override
			public void run() {

				double arrowAngle1 = 90;
				double totalAngle1 = normal.getYaw() + arrowAngle1;
				double dirX1 = Math.cos(Math.toRadians(totalAngle1));
				double dirZ1 = Math.sin(Math.toRadians(totalAngle1));

				e1 = normal.clone().add(dirX1*(0.5+(0.3*time)), 0.4, dirZ1*(0.5+(0.3*time)));
				
				for(int i = 0 ; i < 8 ; i++) {
					e2 = e1.clone().add(Math.cos(var)*(0.5+0.07*time)*dirX, Math.sin(var)*(0.5+0.07*time), Math.cos(var)*(0.5+0.07*time)*dirZ);
					world.spawnParticle(Particle.FLAME, e2, 0);
					
					var += Math.PI / 8;
				}
				
				if(time % 10 == 0) {
					e1 = normal.clone().add(dirX1*(0.5+(0.3*time)), 0.4, dirZ1*(0.5+(0.3*time)));
					
					ArmorStand tmpEnt = (ArmorStand) world.spawnEntity(e1, EntityType.ARMOR_STAND);
					tmpEnt.setVisible(false);
					tmpEnt.setSmall(true);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							tmpEnt.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					List<Entity> entitylist = tmpEnt.getNearbyEntities(5, 5, 5);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(Math.pow(player.getLevel(), 1.8) * 2 + damNum*7);
						}
					}	
					
					world.playSound(e1, Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 1.0f, 0.2f);
					world.playSound(e1, Sound.ENTITY_GENERIC_EXPLODE, 0.7f, 0.8f);
					world.spawnParticle(Particle.EXPLOSION_LARGE, e1, 0);
				}

				if(time >= 30) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	
	
	
	
	
	
	
	
	// 라일락
	public void newSound1() {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time == 0) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
				}
				
				if(time == 4) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 8) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 12) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 20) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 24) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
				}
				
				if(time == 28) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.59f);
				}
				
				if(time == 36) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 48) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 50) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
				}
				
				if(time == 54) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 58) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 62) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 70) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 74) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
				}
				
				if(time == 78) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.59f);
				}
				
				if(time == 86) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 98) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time >= 100) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// unravel
	public void newSound2() {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if(time == 0) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.82f);
				}
				
				if(time == 4) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 3.17f);
				}
				
				if(time == 12) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.82f);
				}
				
				if(time == 20) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.67f);
				}
				
				if(time == 24) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.38f);
				}
				
				if(time == 32) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 3.17f);
				}
				
				if(time == 40) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.82f);
				}
				
				if(time == 48) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.67f);
				}
				
				if(time == 56) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.38f);
				}
				
				if(time == 68) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 80) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
				}
				
				if(time == 92) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 2.12f);
				}
				
				if(time == 96) {
					player.playSound(normal, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.78f);
				}
				
				if(time >= 100) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 좀비1
	public void newSound3() {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if (time == 0) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.3f);
				} else if (time == 5) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.2f);
				} else if (time == 10) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 15) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.2f);
				} else if (time == 25) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 35) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.2f);
				} else if (time == 45) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 50) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.2f);
				} else if (time == 60) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.3f);
				} else if (time == 65) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 0.9f);
				} else if (time == 70) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 0.8f);
				} else if (time == 75) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 0.9f);
				}
				
				if(time >= 100) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 좀비2
	public void newSound4() {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				Location normal = player.getLocation();
				
				if (time == 0) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.0f);
				} else if (time == 9) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.4f);
				} else if (time == 18) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 0.9f);
				} else if (time == 24) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.0f);
				} else if (time == 27) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.4f);
				} else if (time == 36) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 42) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.0f);
				} else if (time == 45) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 51) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.2f);
				} else if (time == 54) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.1f);
				} else if (time == 60) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 1.0f);
				} else if (time == 63) {
					player.playSound(normal, Sound.ENTITY_ZOMBIE_HURT, 1.5f, 0.8f);
				}
				
				if(time >= 100) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	
	
	
	// 보스 기믹1
	public void newEffect100() {
		
		Location normal = player.getLocation();
		World world = player.getWorld(); 
        
        Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(150, 20, 150), 1);
        Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(200, 80, 200), 1);
        
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
		    Location e1, e2;

			@Override
			public void run() {
				
				if(time % 1 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e2 = normal.clone().add(Math.cos(var)*size, size*0.1, Math.sin(var)*size);
						player.getWorld().spawnParticle(Particle.REDSTONE, e2, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
					size++;
				}
				
				if(time % 3 == 0) {
					double var = 0;
					
					for(int i = 0 ; i < 32 ; i++) {
						e1 = normal.clone().add(Math.cos(var)*5, 0, Math.sin(var)*5);
						player.getWorld().spawnParticle(Particle.REDSTONE, e1, 2, dustOptions1);
						
						var += Math.PI / 16;
					}
				}

				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 보스 기믹2 - 탑 6층
	public void newEffect101() {
		
		World world = ent.getWorld(); 
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(100, 200, 255), 1);
		
		new BukkitRunnable() {
			int time = 0; 
			
		    Location e1;

			@Override
			public void run() {
				
				Location normal = ent.getLocation();
				
				if(time % 1 == 0) {
					double r = 1;
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 5) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 10) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							e1 = normal.clone().add(x, y, z);
							world.spawnParticle(Particle.REDSTONE, e1, 1, dustOptions1);
						}
					}
					
					List<Entity> nearPlayer = ent.getNearbyEntities(3, 3, 3);
					for(Entity p : nearPlayer) {
						if(p instanceof Player) {
							((Player) p).damage(10000);
						}
					}
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
				}

				if(time >= 5) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 보스 기믹3 - 탑 6층
	public void newEffect102() {
		World world = ent.getWorld(); 
		Location loc = ent.getLocation().add(0,1,0);
		
		new BukkitRunnable() {
			int time = 0;
			int size = 0;
			
			Location e1;

			@Override
			public void run() {
				
				if(time % 5 == 0) {
					size++;
					double r = size;
					for (double pi = 0; pi <= Math.PI; pi += Math.PI / 5) {
						double y = r * Math.cos(pi) + 1.5;
						for (double theta = 0; theta <= 2 * Math.PI; theta += Math.PI / 10) {
							double x = r * Math.cos(theta) * Math.sin(pi);
							double z = r * Math.sin(theta) * Math.sin(pi);

							e1 = loc.clone().add(x, y, z);
							world.spawnParticle(Particle.FLAME, e1, 0);
						}
					}
					
					List<Entity> nearPlayer = ent.getNearbyEntities(size, size, size);
					for(Entity p : nearPlayer) {
						if(p instanceof Player) {
							((Player) p).damage(6000);
							((Player) p).setFireTicks(200);
						}
					}
					world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 0.6f);
				}
				
				if(time >= 20) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	// 보스 기믹4 - 탑 7층
	public void newEffect103() {
		World world = ent.getWorld();
		
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 0, 0), 1);
		
		new BukkitRunnable() {
			int time = 0;

			Location e1;

			@Override
			public void run() {
				
				Location normal = ent.getLocation().add(0, 1.25, 0);
				
				double arrowAngle1 = 90;
		        double totalAngle1 = normal.getYaw() + arrowAngle1;
		        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));

				if (time % 20 == 0) {
					
					for(int i = 0 ; i < 10 ; i++) {
						e1 = normal.clone().add(dirX1 * i, 0, dirZ1 * i);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					}
					
					ArmorStand ar1 = (ArmorStand) world.spawnEntity(normal.clone().add(dirX1*1, 0, dirZ1*1), EntityType.ARMOR_STAND);
					ar1.setVisible(false);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							ar1.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					for(Entity e : ar1.getNearbyEntities(3, 3, 3)) {
						if(e instanceof Player) {
							Player p = (Player) e;
							p.damage(8000);
							p.setFireTicks(200);
							world.spawnParticle(Particle.EXPLOSION_LARGE, p.getLocation(), 0);
							world.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
						}
					}
					
					ArmorStand ar2 = (ArmorStand) world.spawnEntity(normal.clone().add(dirX1*7, 0, dirZ1*7), EntityType.ARMOR_STAND);
					ar2.setVisible(false);
					
					new BukkitRunnable() {
						@Override
						public void run() {
							ar2.remove();
							this.cancel();
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 3);
					
					for(Entity e : ar2.getNearbyEntities(3, 3, 3)) {
						if(e instanceof Player) {
							Player p = (Player) e;
							p.damage(8000);
							p.setFireTicks(200);
							world.spawnParticle(Particle.EXPLOSION_LARGE, p.getLocation(), 0);
							world.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
						}
					}
					
				}

				if (time >= 100) {
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 일루시데이터1
	public void newEffect10000() {
		
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(80, 250, 200), 1);
        
		new BukkitRunnable() {
			int time = 0;
			double var1 = 0;
			double var2 = 0;
			Location first;

			@Override
			public void run() {
				Location normal = player.getLocation();
				
				if(time <= 32) {
					var1 += Math.PI / 16;

					first = normal.clone().add(Math.cos(var1)*1, 0.6, Math.sin(var1)*1);
					player.getWorld().spawnParticle(Particle.REDSTONE, first, 10, dustOptions1);
				}
				
				if(time <= 32) {
					var2 -= Math.PI / 16;

					first = normal.clone().add(Math.cos(var2)*1, 0.6, Math.sin(var2)*1);
					player.getWorld().spawnParticle(Particle.REDSTONE, first, 10, dustOptions2);
				}
				
				if(time == 0 || time == 20 || time == 40) {
					List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.setVelocity(new Vector(0,0.5,0));
							ent.damage(player.getLevel()*8);
						}
					}
				}

				if(time >= 40) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 일루시데이터2
	public void newEffect10001() {

		World world = player.getWorld(); 
		
		world.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 3.0f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(80, 250, 200), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location loc = player.getLocation();
				
				if(time == 2) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*10);
						}
					}
				}
				
				if(time == 3) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.4-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.2-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 4) {
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 12) {
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*10);
						}
					}
				}
				
				if(time == 13) {
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.4-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.2-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 14) {
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 20) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*10);
						}
					}
				}
				
				if(time == 21) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 25) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*10);
						}
					}
				}
				
				if(time == 26) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 30) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*10);
						}
					}
				}
				
				if(time == 31) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 35) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 2-(i*0.2), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 36) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 2-(i*0.2), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 40) {
					player.setVelocity(loc.getDirection().multiply(3.0f).setY(0.1));
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*20);
						}
					}
				}
				
				if(time >= 40) {
					
					double arrowAngle1 = 0;
			        double totalAngle1 = loc.getYaw() + arrowAngle1;
			        double dirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        
			        double arrowAngle3 = 180;
			        double totalAngle3 = loc.getYaw() + arrowAngle3;
			        double dirX3 = Math.cos(Math.toRadians(totalAngle3));
			        double dirZ3 = Math.sin(Math.toRadians(totalAngle3));
					
					e1 = loc.clone().add(dirX1*0.5, 0.7, dirZ1*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);

					e1 = loc.clone().add(dirX3*0.5, 0.7, dirZ3*0.5);
					world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
					
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.5f, 2.0f);
				}

				if(time >= 60) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	// 일루시데이터3
	public void newEffect10002() {

		World world = player.getWorld(); 
		
		world.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 3.0f);
        
		Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(250, 60, 60), 1);
		Particle.DustOptions dustOptions2 = new Particle.DustOptions(Color.fromRGB(80, 250, 200), 1);
		
		new BukkitRunnable() {
			int time = 0;
			
		    Location e1;

			@Override
			public void run() {
				
				Location loc = player.getLocation();
				
				if(time == 2) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 5) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 8) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.04), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 11) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.04), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 14) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.07), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 17) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.07), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 20) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 21) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.3-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 25) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 26) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1-(i*0.05), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 30) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 31) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 0.5+(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 35) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 2-(i*0.2), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 36) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 6 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 2-(i*0.2), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 39) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*30);
						}
					}
				}
				
				if(time == 42) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = 0;
					
					for(int i = 0 ; i < 8 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot), 1.5-(i*0.1), Math.sin(var+rot));
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var += Math.PI / 8;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
				}
				
				if(time == 50) {
					
					double rot = Math.toRadians(loc.getYaw());
					double var = Math.PI;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*2, 1.5-(i*0.05), Math.sin(var+rot)*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions1);
						
						var -= Math.PI / 16;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					var = Math.PI;
					
					for(int i = 0 ; i < 16 ; i++) {
						e1 = loc.clone().add(Math.cos(var+rot)*2, 1.7-(i*0.05), Math.sin(var+rot)*2);
						world.spawnParticle(Particle.REDSTONE, e1, 0, dustOptions2);
						
						var -= Math.PI / 16;
					}	
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.0f, 2.0f);
					
					world.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0f, 2.0f);
					
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							ent.damage(player.getLevel()*150);
						}
					}
				}
				
				if(time >= 60) {
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	
	
	
	
	
	
	
	
	
	// 본 체스트
	public void startE1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 30);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 30);
			}

		}, 0, 1);
	}

	// 뼈감옥
	public void startE2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.PORTAL, first, 10);
				player.getWorld().spawnParticle(Particle.PORTAL, second, 10);
			}

		}, 0, 1);
	}

	// 디바인 링크
	public void startE3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 증원
	public void startE4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(0, Math.sin(var) + 1, 0);
				second = loc.clone().add(0, Math.sin(var) + 1, 0);

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 0);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 0);
			}

		}, 0, 1);
	}

	// 성스러운 힘
	public void startE5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}

		}, 0, 1);
	}

	// 버티기
	public void startE6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SNEEZE, first, 10);
				player.getWorld().spawnParticle(Particle.SNEEZE, second, 10);

			}

		}, 0, 1);
	}

	// 도박사의 판
	public void startE7() {
		ArrayList<Particle> list = new ArrayList<>();

		list.add(Particle.VILLAGER_ANGRY);
		list.add(Particle.VILLAGER_HAPPY);

		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);

			}

		}, 0, 1);
	}

	// 무조건 이기는 판
	public void startE8() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}

		}, 0, 1);
	}

	// 카사르의 복수
	public void startE9() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), var / 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), var / 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.WATER_SPLASH, first, 10);
				player.getWorld().spawnParticle(Particle.WATER_SPLASH, second, 10);

			}

		}, 0, 1);
	}

	// 신의 권능
	public void startE10() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2, first3, second3, first4, second4;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) + i);
					second = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first2 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) + i);
					second2 = loc.clone().add(Math.cos(var - Math.PI) + i, 0, Math.sin(var + Math.PI) + i);
					first3 = loc.clone().add(Math.cos(var) - i, 0, Math.sin(var) - i);
					second3 = loc.clone().add(Math.cos(var + Math.PI) - i, 0, Math.sin(var + Math.PI) - i);
					first4 = loc.clone().add(Math.cos(var) + i, 0, Math.sin(var) - i);
					second4 = loc.clone().add(Math.cos(var + Math.PI) + i, 0, Math.sin(var + Math.PI) - i);

					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second2, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second3, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, first4, 10);
					player.getWorld().spawnParticle(Particle.DRIP_LAVA, second4, 10);
				}
			}

		}, 0, 1);
	}

	// 기사단 창립
	public void startE11() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 2, 0, Math.sin(var) * 2);
				second = loc.clone().add(Math.cos(var + Math.PI) * 2, 0, Math.sin(var + Math.PI) * 2);

				player.getWorld().spawnParticle(Particle.CLOUD, first, 10);
				player.getWorld().spawnParticle(Particle.CLOUD, second, 10);

			}
		}, 0, 1);
	}

	// 사기 진작
	public void startE12() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SPELL_WITCH, first, 10);
					player.getWorld().spawnParticle(Particle.SPELL_WITCH, second, 10);
				}
			}
		}, 0, 1);
	}

	// 신의 주사위
	public void startE13() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
		}, 0, 1);
	}

	// 발도
	public void startE14() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, first2, 10);
				player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, second2, 10);

			}
		}, 0, 1);
	}

	// 나이트메어
	public void startE15() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, first, 10);
				player.getWorld().spawnParticle(Particle.SMOKE_LARGE, second, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.FALLING_LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 포션의 부작용
	public void startE16() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, second, 10);

			}
		}, 0, 1);
	}

	// 포션 중독
	public void startE17() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.LAVA, first, 10);
				player.getWorld().spawnParticle(Particle.LAVA, second, 10);

			}
		}, 0, 1);
	}

	// 마편
	public void startE18() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.NOTE, first, 10);
					player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				}

			}
		}, 0, 1);
	}

	// 선임의 명령
	public void startE19() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_ANGRY, second, 10);

			}
		}, 0, 1);
	}

	// 죽음의 숫자
	public void startE20() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, i, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, i, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 10);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 10);
				}

			}
		}, 0, 1);
	}

	// 지옥불
	public void startE21() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 10; i++) {
					first = loc.clone().add(i, i, i);
					second = loc.clone().add(-i, i, i);
					first2 = loc.clone().add(-i, i, -i);
					second2 = loc.clone().add(i, i, -i);

					player.getWorld().spawnParticle(Particle.LAVA, first, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second, 0);
					player.getWorld().spawnParticle(Particle.LAVA, first2, 0);
					player.getWorld().spawnParticle(Particle.LAVA, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 에로우 실드
	public void startE22() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 300) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.TOTEM, first, 0);
				player.getWorld().spawnParticle(Particle.TOTEM, second, 0);

			}
		}, 0, 1);
	}

	// 루인 오브 노바
	public void startE23() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				while (true) {
					if (loc.getBlock().getType() != Material.AIR || loc.getY() <= 1) {
						loc.add(0, 1, 0);
						break;
					}
					loc = loc.add(0, -1, 0);
				}

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.SQUID_INK, first, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, first2, 0);
					player.getWorld().spawnParticle(Particle.SQUID_INK, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 니 위로 내 밑으로
	public void startE24() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = player.getLocation();

				for (int i = 1; i < 4; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, first2, 0);
					player.getWorld().spawnParticle(Particle.END_ROD, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 라떼는 말이야
	public void startE25() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			int time;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.NOTE, first, 30);
				player.getWorld().spawnParticle(Particle.NOTE, second, 30);
			}

		}, 0, 1);
	}

	// 헬파이어
	public void startE26() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;
				loc = player.getLocation();

				for (int i = 1; i < 8; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);
					first2 = loc.clone().add(Math.cos(var + Math.PI / 2) * i, 0, Math.sin(var + Math.PI / 2) * i);
					second2 = loc.clone().add(Math.cos(var + Math.PI * 3 / 2) * i, 0,
							Math.sin(var + Math.PI * 3 / 2) * i);

					player.getWorld().spawnParticle(Particle.FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second, 0);
					player.getWorld().spawnParticle(Particle.FLAME, first2, 0);
					player.getWorld().spawnParticle(Particle.FLAME, second2, 0);
				}

			}
		}, 0, 1);
	}

	// 본 체스트
	public void startE27() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (player.getNoDamageTicks() == 0) {
					pd.endTask();
					pd.removeID();
				}

				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.END_ROD, first, 0);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 0);
			}

		}, 0, 1);
	}

	// 그림 리퍼 폼1
	public void startE0_1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.DRIP_LAVA, first, 0);
				player.getWorld().spawnParticle(Particle.DRIP_LAVA, second, 0);

			}
		}, 0, 1);
	}

	// 그림 리퍼 폼2
	public void startE0_2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				var += Math.PI / 8;
				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var) + 0.3, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 0.3, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SOUL, first, 0);
				player.getWorld().spawnParticle(Particle.SOUL, second, 0);

			}
		}, 0, 1);
	}

	// 데빌 레이저
	public void startE0_3() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}
				
				if(time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY() * 2, dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY() * 4, dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY() * 6, dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY() * 8, dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY() * 10, dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);
				
				time++;

			}
		}, 0, 1);
	}
	
	// 마인 레이저
	public void startE0_4() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 40) {
					pd.endTask();
					pd.removeID();
				}

				loc = player.getEyeLocation();
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY() * 2, dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY() * 3, dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY() * 4, dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY() * 5, dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY() * 6, dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY() * 7, dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY() * 8, dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY() * 9, dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY() * 10, dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY() * 11, dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY() * 12, dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY() * 13, dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY() * 14, dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY() * 15, dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY() * 16, dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY() * 17, dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY() * 18, dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY() * 19, dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY() * 20, dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT_MAGIC, e20, 0);

				time++;

			}
		}, 0, 1);
	}

	// 아이 오브 오더
	public void startE0_5() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CRIT, first, 10);
					player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				}
			}
		}, 0, 1);
	}
	
	// 터렛 레이저
	public void startE0_6() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			Location loc, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20;
			Vector dir;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 200) {
					pd.endTask();
					pd.removeID();
				}

				loc = ent.getLocation().add(0,1.4,0);
				dir = loc.getDirection();
				e1 = loc.clone().add(dir.getX(), dir.getY(), dir.getZ());
				e2 = loc.clone().add(dir.getX() * 2, dir.getY(), dir.getZ() * 2);
				e3 = loc.clone().add(dir.getX() * 3, dir.getY(), dir.getZ() * 3);
				e4 = loc.clone().add(dir.getX() * 4, dir.getY(), dir.getZ() * 4);
				e5 = loc.clone().add(dir.getX() * 5, dir.getY(), dir.getZ() * 5);
				e6 = loc.clone().add(dir.getX() * 6, dir.getY(), dir.getZ() * 6);
				e7 = loc.clone().add(dir.getX() * 7, dir.getY(), dir.getZ() * 7);
				e8 = loc.clone().add(dir.getX() * 8, dir.getY(), dir.getZ() * 8);
				e9 = loc.clone().add(dir.getX() * 9, dir.getY(), dir.getZ() * 9);
				e10 = loc.clone().add(dir.getX() * 10, dir.getY(), dir.getZ() * 10);
				e11 = loc.clone().add(dir.getX() * 11, dir.getY(), dir.getZ() * 11);
				e12 = loc.clone().add(dir.getX() * 12, dir.getY(), dir.getZ() * 12);
				e13 = loc.clone().add(dir.getX() * 13, dir.getY(), dir.getZ() * 13);
				e14 = loc.clone().add(dir.getX() * 14, dir.getY(), dir.getZ() * 14);
				e15 = loc.clone().add(dir.getX() * 15, dir.getY(), dir.getZ() * 15);
				e16 = loc.clone().add(dir.getX() * 16, dir.getY(), dir.getZ() * 16);
				e17 = loc.clone().add(dir.getX() * 17, dir.getY(), dir.getZ() * 17);
				e18 = loc.clone().add(dir.getX() * 18, dir.getY(), dir.getZ() * 18);
				e19 = loc.clone().add(dir.getX() * 19, dir.getY(), dir.getZ() * 19);
				e20 = loc.clone().add(dir.getX() * 20, dir.getY(), dir.getZ() * 20);

				player.getWorld().spawnParticle(Particle.CRIT, e1, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e2, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e3, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e4, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e5, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e6, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e7, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e8, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e9, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e10, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e11, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e12, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e13, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e14, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e15, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e16, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e17, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e18, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e19, 0);
				player.getWorld().spawnParticle(Particle.CRIT, e20, 0);

				time++;

			}
		}, 0, 1);
	}
	

///스태프 기술///
	
	public void startES1() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			final int points = 30;
			final double radius = 1.2d;
			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.CLOUD, first, 10);
					player.getWorld().spawnParticle(Particle.CLOUD, second, 10);
				}
			}
		}, 0, 1);
	}
	
	public void startES2() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			
			int time = 0;
			int size = 0;
			double var = 0;
			Location e1;
			Location normal = player.getLocation();
			World world = player.getWorld();
			ParticleData pd = new ParticleData(player.getUniqueId());
			BlockData mat = Material.BLUE_ICE.createBlockData();

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}
				
				for(int i = 0 ; i < 16 ; i++) {
					if(size % 2 == 0) {
						e1 = normal.clone().add(Math.cos(var)*size, 0.5, Math.sin(var)*size);
					} else {
						e1 = normal.clone().add(Math.cos(var)*size, 0, Math.sin(var)*size);
					}
					world.spawnParticle(Particle.BLOCK_CRACK, e1, 0, mat);
					
					var += Math.PI / 8;
				}
				
				if(size == 4) {
					size = -1;
				}
				size++;

				time++;
			}

		}, 0, 1);
	}
	
////몬스터 기술////	
	
	
	// 시련의 형상
	public void startE28() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();

				for (int i = 1; i < 5; i++) {
					first = loc.clone().add(Math.cos(var) * i, 0, Math.sin(var) * i);
					second = loc.clone().add(Math.cos(var + Math.PI) * i, 0, Math.sin(var + Math.PI) * i);

					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 0);
					player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 0);
				}
			}

		}, 0, 1);
	}

	// 요정왕
	public void startE29() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 30) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 16;

				loc = player.getLocation();
				first = loc.clone().add(Math.cos(var), Math.sin(var), Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var), Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.SLIME, first, 10);
				player.getWorld().spawnParticle(Particle.SLIME, second, 10);
			}


		}, 0, 1);
	}

	// 발로르
	public void startE30() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 아덴
	public void startE31() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.END_ROD, first, 10);
				player.getWorld().spawnParticle(Particle.END_ROD, second, 10);

			}
		}, 0, 1);
	}
	
	// 죽음의 탑 공통
	public void startE32() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 20) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var), 2, Math.sin(var));
				second = loc.clone().add(Math.cos(var + Math.PI), 2, Math.sin(var + Math.PI));

				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, first, 10);
				player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, second, 10);

			}
			
		}, 0, 1);
	}
	
	// 죽음의 탑 심판
	public void startE33() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.CRIT, first, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second, 10);
				player.getWorld().spawnParticle(Particle.CRIT, first2, 10);
				player.getWorld().spawnParticle(Particle.CRIT, second2, 10);

			}

		}, 0, 1);
	}

	// 코낭그
	public void startE34() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, first2, 10);
				player.getWorld().spawnParticle(Particle.SOUL_FIRE_FLAME, second2, 10);

			}
		}, 0, 1);
	}
	
	// 프라에그나리
	public void startE35() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.NOTE, first, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second, 10);
				player.getWorld().spawnParticle(Particle.NOTE, first2, 10);
				player.getWorld().spawnParticle(Particle.NOTE, second2, 10);

			}
		}, 0, 1);
	}

	// 아빠 상어
	public void startE36() {
		taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			double var = 0;
			Location loc, first, second, first2, second2;
			ParticleData pd = new ParticleData(player.getUniqueId());

			@Override
			public void run() {
				if (!pd.hasID()) {
					pd.setID(taskID);
				}

				if (time >= 10) {
					pd.endTask();
					pd.removeID();
				}

				time++;
				var += Math.PI / 8;

				loc = ent.getLocation();

				first = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * 3);
				second = loc.clone().add(Math.cos(var) * 3, 1, Math.sin(var) * -3);
				first2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * 3);
				second2 = loc.clone().add(Math.cos(var) * -3, 1, Math.sin(var) * -3);

				player.getWorld().spawnParticle(Particle.BUBBLE_POP, first, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, second, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, first2, 10);
				player.getWorld().spawnParticle(Particle.BUBBLE_POP, second2, 10);

			}
		}, 0, 1);
	}
}
