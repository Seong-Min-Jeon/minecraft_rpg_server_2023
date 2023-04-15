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
		caveSpider(mob);
		galgori(mob);
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
			if (num == 0) {
				mob.setVelocity(mob.getFacing().getDirection().multiply(-0.3f));
				((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0,true,true));
				
				new BukkitRunnable() {
					int time = 0;

				    @Override
					public void run() {
						
						if (time == 40) {
							mob.setVelocity(mob.getFacing().getDirection().add(new Vector(0,-0.5,0)).multiply(2.0f));
						}
						
						if (time >= 40 && mob.isOnGround()) {
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
									player.damage(2);
									
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
							this.cancel();
						}
						
						time++;

					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
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