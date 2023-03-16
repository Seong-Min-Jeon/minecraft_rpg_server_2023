package testPack;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class DamageCal {
	
	private int damAll = 0;
	private int damAr = 0;
	private int damUn = 0;
	private int damIm = 0;
	private int protect = 0;
	
	private static HashMap<Player, Integer> beiagTester = new HashMap<>();
	

	public int Edamage(Player player, Entity entity) {

		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemStack item = player.getInventory().getItemInMainHand();
				if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
						|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
						|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
						|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
						|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
						|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
						|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
						|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
						|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
						|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
						|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
						|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
						|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
						|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
						|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
						|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
						|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
						|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
						|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
						|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
					try {
						String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
						damAll += Integer.parseInt(ench[0]);
						damUn += Integer.parseInt(ench[1]);
						damAr += Integer.parseInt(ench[2]);
						damIm += Integer.parseInt(ench[3]);
					} catch (Exception e) {

					}
				}
			}
		} catch (Exception e) {

		}
		try {
			ItemStack item = player.getInventory().getItemInOffHand();
			if (item.getItemMeta() != null) {
				if(item.getType() == Material.POLISHED_GRANITE_STAIRS || item.getType() == Material.SMOOTH_RED_SANDSTONE_STAIRS || item.getType() == Material.MOSSY_STONE_BRICK_STAIRS 
						|| item.getType() == Material.POLISHED_DIORITE_STAIRS || item.getType() == Material.MOSSY_COBBLESTONE_STAIRS || item.getType() == Material.END_STONE_BRICK_STAIRS 
						|| item.getType() == Material.SMOOTH_SANDSTONE_STAIRS || item.getType() == Material.SMOOTH_QUARTZ_STAIRS || item.getType() == Material.GRANITE_STAIRS
						|| item.getType() == Material.DIAMOND_AXE) {
					try {
						String[] ench = item.getItemMeta().getLocalizedName().split(",");
						damAll += Integer.parseInt(ench[0]);
						damUn += Integer.parseInt(ench[1]);
						damAr += Integer.parseInt(ench[2]);
						damIm += Integer.parseInt(ench[3]);
					} catch (Exception e) {

					}
				}
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				damAll += Integer.parseInt(ench[0]);
				damUn += Integer.parseInt(ench[1]);
				damAr += Integer.parseInt(ench[2]);
				damIm += Integer.parseInt(ench[3]);
			}
		} catch (Exception e) {

		}

		if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
				|| entity.getType() == EntityType.DROWNED || entity.getType() == EntityType.VEX || entity.getType() == EntityType.STRAY
				|| entity.getType() == EntityType.HUSK || entity.getType() == EntityType.ZOMBIE_VILLAGER || entity.getType() == EntityType.ENDERMAN
				|| entity.getType() == EntityType.EVOKER || entity.getType() == EntityType.VINDICATOR || entity.getType() == EntityType.WITCH) {
			int dam = (int)(damAll*2 + damUn*4);
			if(dam <= 0) {
				return 0;
			}
			return dam;
		} else if(entity.getType() == EntityType.SPIDER || entity.getType() == EntityType.CAVE_SPIDER || entity.getType() == EntityType.SILVERFISH 
				|| entity.getType() == EntityType.ENDERMITE || entity.getType() == EntityType.LLAMA || entity.getType() == EntityType.POLAR_BEAR
				 || entity.getType() == EntityType.GUARDIAN || entity.getType() == EntityType.ELDER_GUARDIAN || entity.getType() == EntityType.RAVAGER
				 || entity.getType() == EntityType.PHANTOM || entity.getType() == EntityType.OCELOT || entity.getType() == EntityType.RABBIT
				 || entity.getType() == EntityType.PANDA || entity.getType() == EntityType.ZOGLIN) {
			int dam = (int)(damAll*2 + damAr*5);
			if(dam <= 0) {
				return 0;
			}
			return dam;
		} else if(entity.getType() == EntityType.SLIME || entity.getType() == EntityType.MAGMA_CUBE || entity.getType() == EntityType.GHAST
				|| entity.getType() == EntityType.WITHER || entity.getType() == EntityType.CREEPER || entity.getType() == EntityType.IRON_GOLEM
				 || entity.getType() == EntityType.BLAZE) {
			int dam = (int)(damAll*2 + damIm*6);
			if(dam <= 0) {
				return 0;
			}
			return dam;
		} else if(entity.getType() == EntityType.MUSHROOM_COW) {
			if(beiagTester.containsKey(player)) {
				int type = beiagTester.get(player);
				if(type == 1) {
					int dam = (int)(damAll*2 + damUn*4);
					if(dam <= 0) {
						return 0;
					}
					return dam;
				} else if(type == 2) {
					int dam = (int)(damAll*2 + damAr*5);
					if(dam <= 0) {
						return 0;
					}
					return dam;
				} else if(type == 3) {
					int dam = (int)(damAll*2 + damIm*6);
					if(dam <= 0) {
						return 0;
					}
					return dam;
				}
			} else {
				player.sendMessage(ChatColor.RED + "대련 상대가 선택되지 않았습니다.");
				int dam = (int)(damAll*2);
				if(dam <= 0) {
					return 0;
				}
				return dam;
			}
			int dam = (int)(damAll*2);
			if(dam <= 0) {
				return 0;
			}
			return dam;
		} else {
			int dam = (int)(damAll*2);
			if(dam <= 0) {
				return 0;
			}
			return dam;
		}
	}

	public double Pdamage(Player player, double damage, Entity entity) {

		try {
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemStack item = player.getInventory().getItemInMainHand();
				if(item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
						|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
						|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
						|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
						|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
						|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
						|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
						|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
						|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
						|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
						|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
						|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
						|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
						|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
						|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
						|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
						|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
						|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
						|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
						|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS) {
					LimitLevel la = new LimitLevel();
					if(la.limit(player, item) == true) {
						try {
							String[] ench = player.getInventory().getItemInMainHand().getItemMeta().getLocalizedName().split(",");
							protect += Integer.parseInt(ench[5]);
						} catch (Exception e) {

						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getHelmet() != null) {
				String[] ench = player.getInventory().getHelmet().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getChestplate() != null) {
				String[] ench = player.getInventory().getChestplate().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getLeggings() != null) {
				String[] ench = player.getInventory().getLeggings().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}
		try {
			if (player.getInventory().getBoots() != null) {
				String[] ench = player.getInventory().getBoots().getItemMeta().getLocalizedName().split(",");
				protect += Integer.parseInt(ench[5]);
			}
		} catch(Exception e) {
			
		}

		if(protect < 0) {
			return 9999999;
		}
		
		damage = damage - (damage * ((42.6/Math.sqrt(2)) * Math.log10((protect*0.18+14.15) / (10*Math.sqrt(2)))) / 100.0);
		return damage;
		
	}
	
	public void HashPut(Player player, int type) {
		if(beiagTester.containsKey(player)) {
			beiagTester.remove(player);
			beiagTester.put(player, type);
		} else {
			beiagTester.put(player, type);
		}
	}
	
}
