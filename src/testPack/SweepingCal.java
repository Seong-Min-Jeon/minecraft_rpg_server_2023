package testPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SweepingCal {
	
	public void sweeping(Player player, double damage, Entity hitMob) {
		
		int sweep = 0;
		
		ItemStack mainHand = player.getInventory().getItemInMainHand();
		
		if (player.getInventory().getHelmet() != null) {
			String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
			sweep += Integer.parseInt(ench[4]);
		}
		if (player.getInventory().getChestplate() != null) {
			String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
			sweep += Integer.parseInt(ench[4]);
		}
		if (player.getInventory().getLeggings() != null) {
			String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
			sweep += Integer.parseInt(ench[4]);
		}
		if (player.getInventory().getBoots() != null) {
			String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
			sweep += Integer.parseInt(ench[4]);
		}
		
		if(mainHand.getType() == Material.WOODEN_SWORD || mainHand.getType() == Material.STONE_SWORD 
				|| mainHand.getType() == Material.IRON_SWORD || mainHand.getType() == Material.GOLDEN_SWORD || mainHand.getType() == Material.DIAMOND_SWORD 
				|| mainHand.getType() == Material.OAK_LEAVES || mainHand.getType() == Material.SPRUCE_LEAVES || mainHand.getType() == Material.BIRCH_LEAVES
				|| mainHand.getType() == Material.JUNGLE_LEAVES || mainHand.getType() == Material.ACACIA_LEAVES || mainHand.getType() == Material.DARK_OAK_LEAVES
				|| mainHand.getType() == Material.COBBLESTONE_WALL || mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL || mainHand.getType() == Material.BROWN_CARPET
				|| mainHand.getType() == Material.GREEN_CARPET || mainHand.getType() == Material.BLACK_CARPET || mainHand.getType() == Material.STONE
				|| mainHand.getType() == Material.OAK_PLANKS || mainHand.getType() == Material.SPRUCE_PLANKS || mainHand.getType() == Material.BIRCH_PLANKS
				|| mainHand.getType() == Material.JUNGLE_PLANKS || mainHand.getType() == Material.ACACIA_PLANKS || mainHand.getType() == Material.DARK_OAK_PLANKS
				|| mainHand.getType() == Material.BEDROCK || mainHand.getType() == Material.SPRUCE_LOG || mainHand.getType() == Material.BIRCH_LOG
				|| mainHand.getType() == Material.JUNGLE_LOG || mainHand.getType() == Material.ACACIA_LOG || mainHand.getType() == Material.DARK_OAK_LOG
				|| mainHand.getType() == Material.SANDSTONE || mainHand.getType() == Material.CHISELED_SANDSTONE || mainHand.getType() == Material.CUT_SANDSTONE
				|| mainHand.getType() == Material.LAPIS_BLOCK || mainHand.getType() == Material.MAGENTA_WOOL || mainHand.getType() == Material.LIME_WOOL
				|| mainHand.getType() == Material.GRAY_WOOL || mainHand.getType() == Material.LIGHT_GRAY_WOOL || mainHand.getType() == Material.CYAN_WOOL
				|| mainHand.getType() == Material.PURPLE_WOOL || mainHand.getType() == Material.OAK_SLAB || mainHand.getType() == Material.SPRUCE_SLAB
				|| mainHand.getType() == Material.BIRCH_SLAB || mainHand.getType() == Material.JUNGLE_SLAB || mainHand.getType() == Material.ACACIA_SLAB
				|| mainHand.getType() == Material.DARK_OAK_SLAB || mainHand.getType() == Material.STONE_SLAB || mainHand.getType() == Material.COBBLESTONE_SLAB
				|| mainHand.getType() == Material.STONE_BRICK_SLAB || mainHand.getType() == Material.NETHER_BRICK_SLAB || mainHand.getType() == Material.QUARTZ_SLAB
				|| mainHand.getType() == Material.RED_SANDSTONE || mainHand.getType() == Material.RED_SANDSTONE_SLAB || mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
				|| mainHand.getType() == Material.OBSIDIAN || mainHand.getType() == Material.SMOOTH_SANDSTONE || mainHand.getType() == Material.CHISELED_RED_SANDSTONE
				|| mainHand.getType() == Material.CUT_RED_SANDSTONE || mainHand.getType() == Material.RED_SANDSTONE_STAIRS || mainHand.getType() == Material.STONE_STAIRS) {
			
			sweep += Integer.parseInt(player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",")[4]);
			
			if(sweep <= 0) {
				sweep = 0;
			}
			
			Location loc = player.getLocation();
			double num1 = player.getLocation().getDirection().getX();
			double num2 = player.getLocation().getDirection().getY() + 1;
			double num3 = player.getLocation().getDirection().getZ();
			Location mobLoc = loc.add(num1, num2, num3);
			player.getWorld().spawnParticle(Particle.SWEEP_ATTACK, mobLoc, 0);
			List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);				
			for (Entity nearEntity : entitylist) {
				if (nearEntity.getType() != EntityType.PLAYER) {
					if (nearEntity instanceof LivingEntity) {
						if(nearEntity == hitMob) {
							continue;
						}
						LivingEntity nearMob = (LivingEntity) nearEntity;
						Location nearMobLoc = nearMob.getLocation();								
						if(Math.abs(nearMobLoc.getX() - mobLoc.getX()) <= 2+sweep/300 && Math.abs(nearMobLoc.getY() - mobLoc.getY()) <= 1.25+sweep/600
								&& Math.abs(nearMobLoc.getZ() - mobLoc.getZ()) <= 2+sweep/300) {
							if(nearMob.getType() != EntityType.PLAYER || nearMob.getType() != EntityType.IRON_GOLEM) {
								
								double sweepDam = (2 + (player.getLevel()/400.0)) * sweep;
								if(sweepDam > damage) {
									sweepDam = damage;
								}
								
								if(new SantaGimmick().santaGimmick(nearMob)) {
									if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
										nearMob.damage(0.0031);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
										nearMob.damage(0.0032);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
										nearMob.damage(0.0033);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
										nearMob.damage(0.0034);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
										nearMob.damage(0.0035);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
										nearMob.damage(0.0036);
									} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
										nearMob.damage(0.0037);
									} else {
										nearMob.damage(sweepDam);
									}
								} else {
									nearMob.damage(sweepDam);
								}
								
								try {
									//===========================================================================
									// 독뎀
									int poison = 0;
									ArrayList<Integer> ary = new ArrayList<>(); 
									ary.add(new SpecialEffect().a10070(player));
									ary.add(new SpecialEffect().a10(player));
									ary.add(new SpecialEffect().s2(player));
									ary.add(new SpecialEffect().a16(player));
									Collections.sort(ary);
									Collections.reverse(ary);
									poison = ary.get(0);
									
									if(poison != 0) {
										if(nearMob.getType() == EntityType.ZOMBIE || nearMob.getType() == EntityType.ZOMBIE_VILLAGER || nearMob.getType() == EntityType.HUSK
												|| nearMob.getType() == EntityType.DROWNED || nearMob.getType() == EntityType.SKELETON || nearMob.getType() == EntityType.WITHER_SKELETON
												|| nearMob.getType() == EntityType.WITHER) {
											nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 100, poison));
										} else {
											nearMob.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 100, poison));
										}
									}
									//===========================================================================
								} catch(Exception e) {
									
								}
								
							}
						}							
					}
				}
			}
		}
	}

}
