package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Husk;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Monster;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Salmon;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Mushroom;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.potion.PotionType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

public class Skill {

	Random rnd = new Random();
	private int sleep = 0;
	private int sleep2 = 0;
	
	private static HashMap<String, Integer> map = new HashMap<>();
	
	GolemOwner go = new GolemOwner();
	Inheritance inheritance = new Inheritance();

	public void effect(Player player, String key) {
		
		try {
			ItemStack item = player.getInventory().getItemInMainHand();
			if(!(item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS
					|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
					|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
					|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
					|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
					|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
					|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET 
					|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS)) {
				LimitLevel la = new LimitLevel();
				if(la.limit(player, item) == false) {
					player.sendMessage(ChatColor.RED + "아직 이 무기를 다루기에는 내 힘이 부족하다.");
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		ItemStack mainHand = player.getInventory().getItemInMainHand();
		if (player.getInventory().contains(Material.RED_DYE)
				&& player.getInventory().getItemInMainHand().getType() == Material.BONE) {
			skill1(player, key);
		}
		if (player.getInventory().contains(Material.GREEN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill2(player, key);
		}
		if (player.getInventory().contains(Material.LAPIS_LAZULI)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill3(player, key);
		}
		if (player.getInventory().contains(Material.CYAN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill4(player, key);
		}
		if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill5(player, key);
		}
		if (player.getInventory().contains(Material.GRAY_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill6(player, key);
		}
		if (player.getInventory().contains(Material.PINK_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill7(player, key);
		}
		if (player.getInventory().contains(Material.LIME_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill8(player, key);
		}
		if (player.getInventory().contains(Material.YELLOW_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill9(player, key);
		}
		if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill10(player, key);
		}
		if (player.getInventory().contains(Material.MAGENTA_DYE)
				&& (mainHand.getType() == Material.WOODEN_PICKAXE
						|| mainHand.getType() == Material.STONE_PICKAXE
						|| mainHand.getType() == Material.IRON_PICKAXE
						|| mainHand.getType() == Material.GOLDEN_PICKAXE
						|| mainHand.getType() == Material.DIAMOND_PICKAXE
						|| mainHand.getType() == Material.NETHERITE_PICKAXE)) {
			skill11(player, key);
		}
		if (player.getInventory().contains(Material.ORANGE_DYE)
				&& (mainHand.getType() == Material.WOODEN_HOE
						|| mainHand.getType() == Material.STONE_HOE
						|| mainHand.getType() == Material.IRON_HOE
						|| mainHand.getType() == Material.GOLDEN_HOE
						|| mainHand.getType() == Material.DIAMOND_HOE
						|| mainHand.getType() == Material.NETHERITE_HOE)) {
			skill12(player, key);
		}		
		if (player.getInventory().contains(Material.BROWN_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill14(player, key);
		}	
		if (player.getInventory().contains(Material.INK_SAC)
				&& (mainHand.getType() == Material.BRAIN_CORAL_BLOCK 
				|| mainHand.getType() == Material.HORN_CORAL_BLOCK 
				|| mainHand.getType() == Material.TUBE_CORAL_BLOCK 
				|| mainHand.getType() == Material.BUBBLE_CORAL_BLOCK 
				|| mainHand.getType() == Material.FIRE_CORAL_BLOCK)) {
			skill16(player, key);
		}
		if (player.getInventory().contains(Material.CLAY_BALL)) {
			if (mainHand.getType() == Material.DEAD_BRAIN_CORAL_BLOCK 
					|| mainHand.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_FIRE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_HORN_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
				skill17(player, key);
			}
		}
		if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
			if (mainHand.getType() == Material.DEAD_BRAIN_CORAL_BLOCK 
					|| mainHand.getType() == Material.DEAD_BUBBLE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_FIRE_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_HORN_CORAL_BLOCK
					|| mainHand.getType() == Material.DEAD_TUBE_CORAL_BLOCK) {
				skill18(player, key);
			}
		}
		if (player.getInventory().contains(Material.BLUE_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill13(player, key);
		}
		if (player.getInventory().contains(Material.BLACK_DYE)
				&& (mainHand.getType() == Material.WOODEN_SWORD
						|| mainHand.getType() == Material.STONE_SWORD
						|| mainHand.getType() == Material.IRON_SWORD
						|| mainHand.getType() == Material.GOLDEN_SWORD
						|| mainHand.getType() == Material.DIAMOND_SWORD
						|| mainHand.getType() == Material.NETHERITE_SWORD
						|| mainHand.getType() == Material.OAK_LEAVES
						|| mainHand.getType() == Material.SPRUCE_LEAVES
						|| mainHand.getType() == Material.BIRCH_LEAVES
						|| mainHand.getType() == Material.JUNGLE_LEAVES
						|| mainHand.getType() == Material.ACACIA_LEAVES
						|| mainHand.getType() == Material.DARK_OAK_LEAVES
						|| mainHand.getType() == Material.COBBLESTONE_WALL
						|| mainHand.getType() == Material.MOSSY_COBBLESTONE_WALL
						|| mainHand.getType() == Material.BROWN_CARPET
						|| mainHand.getType() == Material.GREEN_CARPET
						|| mainHand.getType() == Material.BLACK_CARPET
						|| mainHand.getType() == Material.STONE
						|| mainHand.getType() == Material.OAK_PLANKS
						|| mainHand.getType() == Material.SPRUCE_PLANKS
						|| mainHand.getType() == Material.BIRCH_PLANKS
						|| mainHand.getType() == Material.JUNGLE_PLANKS
						|| mainHand.getType() == Material.ACACIA_PLANKS
						|| mainHand.getType() == Material.DARK_OAK_PLANKS
						|| mainHand.getType() == Material.BEDROCK
						|| mainHand.getType() == Material.SPRUCE_LOG
						|| mainHand.getType() == Material.BIRCH_LOG
						|| mainHand.getType() == Material.JUNGLE_LOG
						|| mainHand.getType() == Material.ACACIA_LOG
						|| mainHand.getType() == Material.DARK_OAK_LOG
						|| mainHand.getType() == Material.SANDSTONE
						|| mainHand.getType() == Material.CHISELED_SANDSTONE
						|| mainHand.getType() == Material.CUT_SANDSTONE
						|| mainHand.getType() == Material.LAPIS_BLOCK
						|| mainHand.getType() == Material.MAGENTA_WOOL
						|| mainHand.getType() == Material.LIME_WOOL
						|| mainHand.getType() == Material.GRAY_WOOL
						|| mainHand.getType() == Material.LIGHT_GRAY_WOOL
						|| mainHand.getType() == Material.CYAN_WOOL
						|| mainHand.getType() == Material.PURPLE_WOOL
						|| mainHand.getType() == Material.OAK_SLAB
						|| mainHand.getType() == Material.SPRUCE_SLAB
						|| mainHand.getType() == Material.BIRCH_SLAB
						|| mainHand.getType() == Material.JUNGLE_SLAB
						|| mainHand.getType() == Material.ACACIA_SLAB
						|| mainHand.getType() == Material.DARK_OAK_SLAB
						|| mainHand.getType() == Material.STONE_SLAB
						|| mainHand.getType() == Material.COBBLESTONE_SLAB
						|| mainHand.getType() == Material.STONE_BRICK_SLAB
						|| mainHand.getType() == Material.NETHER_BRICK_SLAB
						|| mainHand.getType() == Material.QUARTZ_SLAB
						|| mainHand.getType() == Material.RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_SLAB
						|| mainHand.getType() == Material.SMOOTH_RED_SANDSTONE
						|| mainHand.getType() == Material.OBSIDIAN
						|| mainHand.getType() == Material.SMOOTH_SANDSTONE
						|| mainHand.getType() == Material.CHISELED_RED_SANDSTONE
						|| mainHand.getType() == Material.CUT_RED_SANDSTONE
						|| mainHand.getType() == Material.RED_SANDSTONE_STAIRS
						|| mainHand.getType() == Material.STONE_STAIRS)) {
			skill15(player, key);
		}
		
		if (!player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
		}
	}
	
	public void skill1(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "본 파이터의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						new ParticleEffect(player).newEffect3();
						player.sendMessage(ChatColor.GREEN + "[스킬]원시의 질주가 발동됩니다.");
						Vector vec = player.getEyeLocation().getDirection().multiply(1.4f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					int num = player.getLevel();
					Location loc = player.getLocation();
					new ParticleEffect(player).newEffect4();
					player.sendMessage(ChatColor.GREEN + "[스킬]본 체스트가 발동됩니다.");
					player.removePotionEffect(PotionEffectType.ABSORPTION);
					if (num < 15) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,true));
					} else if (num < 30) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 0,true,true));
					} else if (num < 45) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 0,true,true));
					} else if (num < 60) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 1,true,true));
					} else if (num < 75) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 1,true,true));
					} else if (num < 90) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,true));
					} else {
						if(inheritance.getInheritance(player) == 42) {
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 4,true,true));
						} else {
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2,true,true));
						}
					}
					world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 32700));
								nearMob.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 140));
								nearMob.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 32700));
							}
						}
					}
					new ParticleEffect(player).newEffect5();
					player.sendMessage(ChatColor.GREEN + "[스킬]뼈감옥이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "5초간 적의 움직임을 멈춥니다.");
					world.playSound(loc, Sound.ENTITY_WOLF_SHAKE, 1.0f, 1.0f);				
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=10) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]뼈 던지기가 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=20) {								
								t.endTask();
								t.removeID();
							} else if(time%5 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								if(inheritance.getInheritance(player) == 42) {
									arrow.setDamage(0.12);
								} else {
									arrow.setDamage(0.02);
								}
								arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
								world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 0.2f);
								
								Item item = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.BONE));
								item.setPickupDelay(10000000);
								arrow.addPassenger(item);
							}
							
							time++;
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill2(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "기사의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=5) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						new ParticleEffect(player).newEffect6();
						player.sendMessage(ChatColor.GREEN + "[스킬]차지 어택이 발동됩니다.");
						world.playSound(player.getLocation(), Sound.BLOCK_CHEST_CLOSE, 2.0f, 0.5f);
						
						Vector vec = player.getEyeLocation().add(0,2,0).getDirection().multiply(1.5f);
						player.setVelocity(vec);						
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					
					List<Entity> entityl = player.getNearbyEntities(12, 8, 12);
					for(Entity ent : entityl) {
						if(ent instanceof IronGolem) {
							ent.remove();
						}
					}
					
					IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
					golem.setCustomName(ChatColor.GRAY + "팬텀 나이트" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
					golem.setCustomNameVisible(true);
					((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 5));
					((LivingEntity) golem).setHealth((20 + player.getLevel() * 5));
					if (player.getLevel() >= 10) {
						int num = (player.getLevel() / 10);
						if(inheritance.getInheritance(player) == 45) {
							num = (player.getLevel() / 5);
						}
						golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 1));
					}
					golem.setPlayerCreated(true);
					golem.setRemoveWhenFarAway(true);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE4();
					// ================================================================
					world.playEffect(loc, Effect.SMOKE, 0);
					world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]증원이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "펜텀 나이트가 소환됩니다. 레벨: " + player.getLevel() + " " + "최대체력: "
							+ (20 + player.getLevel() * 5));
					List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
							if (nearEntity instanceof Zombie) {
								Zombie zombie = (Zombie) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Skeleton) {
								Skeleton zombie = (Skeleton) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof WitherSkeleton) {
								WitherSkeleton zombie = (WitherSkeleton) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Drowned) {
								Drowned zombie = (Drowned) nearEntity;
								zombie.setTarget(golem);
							}
							if (nearEntity instanceof Husk) {
								Husk zombie = (Husk) nearEntity;
								zombie.setTarget(golem);
							}
						}
					}
					go.put(golem.getUniqueId(), player);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0, true,true));
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 저항과 힘이 부여됩니다.");
						}
					}
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0, true,true));
					new ParticleEffect(player).newEffect7();
					player.sendMessage(ChatColor.GREEN + "[스킬]전투의 의지가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 저항과 힘이 부여됩니다.");
					world.playSound(loc, Sound.BLOCK_CHAIN_BREAK, 2.0f, 0.5f);				
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					int num = 0;					
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if ((nearEntity.getType() == EntityType.IRON_GOLEM)) {
							if (nearEntity.isCustomNameVisible()) {								
								((LivingEntity) nearEntity).setHealth(0);
								num++;
							}
						}
					}
					if (num == 0) {
						world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
						player.sendMessage(ChatColor.GREEN + "[스킬]자폭이 발동됩니다.");
						player.sendMessage(ChatColor.RED + "주위에 골렘이 없습니다.");
					} else {
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() != EntityType.PLAYER) {
								if (nearEntity instanceof LivingEntity) {
									LivingEntity nearMob = (LivingEntity) nearEntity;
									if(inheritance.getInheritance(player) == 46) {
										nearMob.damage(player.getLevel() * 5);
									} else {
										nearMob.damage(player.getLevel() * num);
									}
								}
							}
						}
						player.sendMessage(ChatColor.GREEN + "[스킬]자폭이 발동됩니다.");
						world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.5f);
						world.spawnParticle(Particle.EXPLOSION_LARGE, player.getLocation(), 0);
						world.spawnParticle(Particle.FLAME, player.getLocation(), 5);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill3(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "프리스트의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=10) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						new ParticleEffect(player).newEffect8();
						player.sendMessage(ChatColor.GREEN + "[스킬]텔레포트가 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(2.5f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							PotionRatioForSkill pr = new PotionRatioForSkill();
							if(inheritance.getInheritance(player) == 47) {
								pr.calculation(nearPlayer, player.getLevel() * 4);
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 4 + ChatColor.RED + "]");
							} else {
								pr.calculation(nearPlayer, player.getLevel() * 3);
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 3 + ChatColor.RED + "]");
							}
						}
					}
					PotionRatioForSkill pr = new PotionRatioForSkill();
					if(inheritance.getInheritance(player) == 47) {
						pr.calculation(player, player.getLevel() * 4);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 4 + ChatColor.RED + "]");
					} else {
						pr.calculation(player, player.getLevel() * 3);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 3 + ChatColor.RED + "]");
					}
					
					Location loc = player.getLocation();

					world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					new ParticleEffect(player).newEffect9();
					player.sendMessage(ChatColor.GREEN + "[스킬]넬의 사랑이 발동됩니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=6) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 6);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(8, 8, 8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							if(inheritance.getInheritance(player) == 48) {
								nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 3, true,true));
							} else {
								nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1, true,true));
							}
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 추가 체력이 부여됩니다.");
						}
					}
					if(inheritance.getInheritance(player) == 48) {
						player.removePotionEffect(PotionEffectType.ABSORPTION);
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 3, true,true));
					} else {
						player.removePotionEffect(PotionEffectType.ABSORPTION);
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1, true,true));
					}
					new ParticleEffect(player).newEffect10();
					player.sendMessage(ChatColor.GREEN + "[스킬]딘의 화염이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 추가 체력이 부여됩니다.");												
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						new ParticleEffect(player).newEffect11();
						player.sendMessage(ChatColor.GREEN + "[스킬]펠의 바람이 발동됩니다.");	
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = new Vector(0, 1, 0);
						player.setVelocity(vec.multiply(2.0f));
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill4(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "광전사의 증표"))) {
			int damNum = 0;
			try {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
				}
			} catch(Exception e) {
				
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect12();
						player.sendMessage(ChatColor.GREEN + "[스킬]열귀각이 발동됩니다.");
						if(inheritance.getInheritance(player) == 49) {
							player.setHealth(player.getHealth() / 1.2);
						} else {
							player.setHealth(player.getHealth() / 2);
						}

						Vector vec = player.getEyeLocation().getDirection().multiply(1.5f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() != EntityType.PLAYER) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								if(inheritance.getInheritance(player) == 50) {
									nearMob.damage(player.getLevel() + damNum*4.5);
								} else {
									nearMob.damage(player.getLevel() + damNum*3);
								}
								new ParticleEffect(player,nearMob).newEffect13();
							}
						}
					}
					player.sendMessage(ChatColor.GREEN + "[스킬]마인권이 발동됩니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					player.setNoDamageTicks(20);
					new ParticleEffect(player).newEffect14();
					player.sendMessage(ChatColor.GREEN + "[스킬]염옥악이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "1초간 무적이 됩니다.");												
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=5) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);			
						new ParticleEffect(player).newEffect15();
						player.sendMessage(ChatColor.GREEN + "[스킬]뇌신장이 발동됩니다.");
						
						Vector vec = new Vector(0, 1, 0);
						player.setVelocity(vec.multiply(1.2f));						
						List<Entity> entitylist = player.getNearbyEntities(4, 3, 4);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Mob) {
								LivingEntity ent = (LivingEntity) nearEntity;
								if(ent instanceof Monster) {
									ent.setVelocity(vec);
								}
								ent.damage(player.getLevel()*10);
							}
						}	
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill5(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "도박사의 증표"))) {		
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if (i >= 3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);

					int num = rnd.nextInt(10);
					Location loc = player.getLocation();
					new ParticleEffect(player).newEffect16();
					player.sendMessage(ChatColor.GREEN + "[스킬]도박사의 판이 발동됩니다.");
					// ===============================================================
					ParticleData pd2 = new ParticleData(player.getUniqueId());
					if (pd2.hasID()) {
						pd2.endTask();
						pd2.removeID();
					}
					ParticleEffect pe2 = new ParticleEffect(player);
					pe2.startE7();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;

						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}

							if (time >= 20) {
								if (num == 0) {
									player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 1));
								} else if (num == 1) {
									player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2));
								} else if (num == 2) {
									player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 3));
								} else if (num == 3) {
									player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 4));
								} else if (num == 4) {
									player.sendMessage(ChatColor.RED + "슬로우가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 5));
								} else if (num == 5) {
									player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 0));
								} else if (num == 6) {
									player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 1));
								} else if (num == 7) {
									player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
								} else if (num == 8) {
									player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 3));
								} else if (num == 9) {
									player.sendMessage(ChatColor.GREEN + "신속이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 4));
								} else {
									player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
									world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
								}
								world.playEffect(loc, Effect.POTION_BREAK, 0);
								t.endTask();
								t.removeID();
							}
							time++;
						}

					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					int num = rnd.nextInt(38);
					Location loc = player.getLocation();
					new ParticleEffect(player).newEffect17();
					player.sendMessage(ChatColor.GREEN + "[스킬]도박사의 판이 발동됩니다.");
					// ===============================================================
					ParticleData pd2 = new ParticleData(player.getUniqueId());
					if (pd2.hasID()) {
						pd2.endTask();
						pd2.removeID();
					}
					ParticleEffect pe2 = new ParticleEffect(player);
					pe2.startE7();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;

						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}

							if (time >= 20) {
								if (num == 0) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 0));
								} else if (num == 1) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1));
								} else if (num == 2) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 2));
								} else if (num == 3) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 3));
								} else if (num == 4) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 4));
								} else if (num == 5) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 5));
								} else if (num == 6) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 6));
								} else if (num == 7) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 7));
								} else if (num == 8) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 8));
								} else if (num == 9) {
									player.sendMessage(ChatColor.GREEN + "추가 체력이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 9));
								} else if (num == 10) {
									player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 0));
								} else if (num == 11) {
									player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 1));
								} else if (num == 12) {
									player.sendMessage(ChatColor.RED + "실명이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 600, 2));
								} else if (num == 13) {
									player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 0));
								} else if (num == 14) {
									player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 1));
								} else if (num == 15) {
									player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 2));
								} else if (num == 16) {
									player.sendMessage(ChatColor.GREEN + "저항이 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 600, 3));
								} else if (num == 17) {
									player.sendMessage(ChatColor.GREEN + "야간투시가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 9));
								} else if (num == 18) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 0));
								} else if (num == 19) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 1));
								} else if (num == 20) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
								} else if (num == 21) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 3));
								} else if (num == 22) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 4));
								} else if (num == 23) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 5));
								} else if (num == 24) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 6));
								} else if (num == 25) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 7));
								} else if (num == 26) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 8));
								} else if (num == 27) {
									player.sendMessage(ChatColor.GREEN + "데미지 증가가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 9));
								} else if (num == 28) {
									player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 0));
								} else if (num == 29) {
									player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 1));
								} else if (num == 30) {
									player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 2));
								} else if (num == 31) {
									player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 3));
								} else if (num == 32) {
									player.sendMessage(ChatColor.RED + "약화가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 4));
								} else if (num == 33) {
									player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 0));
								} else if (num == 34) {
									player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 1));
								} else if (num == 35) {
									player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 2));
								} else if (num == 36) {
									player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 3));
								} else if (num == 37) {
									player.sendMessage(ChatColor.RED + "위더가 발동됩니다.");
									player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 600, 4));
								} else {
									player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
									world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
								}
								world.playEffect(loc, Effect.POTION_BREAK, 0);
								t.endTask();
								t.removeID();
							}
							time++;
						}

					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					int num = rnd.nextInt(4);
					Location loc = player.getLocation();
					new ParticleEffect(player).newEffect18();
					player.sendMessage(ChatColor.GREEN + "[스킬]도박사의 판이 발동됩니다.");
					// ===============================================================
					ParticleData pd2 = new ParticleData(player.getUniqueId());
					if (pd2.hasID()) {
						pd2.endTask();
						pd2.removeID();
					}
					ParticleEffect pe2 = new ParticleEffect(player);
					pe2.startE7();
					// ================================================================
					world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;

						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}

							if (time >= 20) {
								if (num == 0) {
									List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel()*3);
												new ParticleEffect(player, nearMob).newEffect13();
											}
										}
									}
									player.sendMessage(ChatColor.GREEN + "[스킬]마인권이 발동됩니다.");
								} else if (num == 1) {
									List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() == EntityType.PLAYER) {
											Player nearPlayer = (Player) nearEntity;
											PotionRatioForSkill pr = new PotionRatioForSkill();
											pr.calculation(nearPlayer, player.getLevel() * 2);
											nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 2 + ChatColor.RED + "]");
										}
									}
									PotionRatioForSkill pr = new PotionRatioForSkill();
									pr.calculation(player, player.getLevel() * 2);
									Location loc = player.getLocation();
									world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
									new ParticleEffect(player).newEffect9();
									player.sendMessage(ChatColor.GREEN + "[스킬]넬의 사랑이 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 2 + ChatColor.RED + "]");
								} else if (num == 2) {
									Location loc = player.getLocation();
									
									List<Entity> entityl = player.getNearbyEntities(12, 8, 12);
									for(Entity ent : entityl) {
										if(ent instanceof IronGolem) {
											ent.remove();
										}
									}
									
									IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
									golem.setCustomName(ChatColor.GRAY + "팬텀 나이트" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
									golem.setCustomNameVisible(true);
									((LivingEntity) golem).setMaxHealth((20 + player.getLevel() * 5));
									((LivingEntity) golem).setHealth((20 + player.getLevel() * 5));
									if (player.getLevel() >= 10) {
										int num = (player.getLevel() / 10);
										golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, num - 1));
									}
									golem.setPlayerCreated(true);
									golem.setRemoveWhenFarAway(true);
									// ===============================================================
									ParticleData pd = new ParticleData(player.getUniqueId());
									if (pd.hasID()) {
										pd.endTask();
										pd.removeID();
									}
									ParticleEffect pe = new ParticleEffect(player);
									pe.startE4();
									// ================================================================
									world.playEffect(loc, Effect.SMOKE, 0);
									world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
									player.sendMessage(ChatColor.GREEN + "[스킬]증원이 발동됩니다.");
									player.sendMessage(ChatColor.GREEN + "펜텀 나이트가 소환됩니다. 레벨: " + player.getLevel() + " " + "최대체력: "
											+ (20 + player.getLevel() * 5));
									List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
									for (Entity nearEntity : entitylist) {
										if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
											if (nearEntity instanceof Zombie) {
												Zombie zombie = (Zombie) nearEntity;
												zombie.setTarget(golem);
											}
											if (nearEntity instanceof Skeleton) {
												Skeleton zombie = (Skeleton) nearEntity;
												zombie.setTarget(golem);
											}
											if (nearEntity instanceof WitherSkeleton) {
												WitherSkeleton zombie = (WitherSkeleton) nearEntity;
												zombie.setTarget(golem);
											}
											if (nearEntity instanceof Drowned) {
												Drowned zombie = (Drowned) nearEntity;
												zombie.setTarget(golem);
											}
											if (nearEntity instanceof Husk) {
												Husk zombie = (Husk) nearEntity;
												zombie.setTarget(golem);
											}
										}
									}
									go.put(golem.getUniqueId(), player);
								} else if (num == 3) {
									int num = player.getLevel();
									Location loc = player.getLocation();
									new ParticleEffect(player).newEffect4();
									player.sendMessage(ChatColor.GREEN + "[스킬]본 체스트가 발동됩니다.");
									player.removePotionEffect(PotionEffectType.ABSORPTION);
									if (num < 15) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,true));
									} else if (num < 30) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 0,true,true));
									} else if (num < 45) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 0,true,true));
									} else if (num < 60) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 1,true,true));
									} else if (num < 75) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 150, 1,true,true));
									} else if (num < 90) {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1,true,true));
									} else {
										player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2,true,true));
									}
									world.playSound(loc, Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
								} else {
									player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
									world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
								}
								world.playEffect(loc, Effect.POTION_BREAK, 0);
								t.endTask();
								t.removeID();
							}
							time++;
						}

					}, 0, 1);										
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=10) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);								
						int num = rnd.nextInt(2);
						Location loc = player.getLocation();
						new ParticleEffect(player).newEffect19();
						player.sendMessage(ChatColor.GREEN + "[스킬]도박사의 판이 발동됩니다.");
						// ===============================================================
						ParticleData pd2 = new ParticleData(player.getUniqueId());
						if (pd2.hasID()) {
							pd2.endTask();
							pd2.removeID();
						}
						ParticleEffect pe2 = new ParticleEffect(player);
						pe2.startE7();
						// ================================================================
						world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						Thread t = new Thread(player.getUniqueId());
						sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;

							@Override
							public void run() {
								if (!t.hasID()) {
									t.setID(sleep);
								}

								if (time >= 20) {
									if (num == 0) {
										player.sendMessage(ChatColor.GREEN + "마나가 최대치로 증가합니다.");
										ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA, 20);
										ItemMeta manaIm = mana.getItemMeta();
										manaIm.setDisplayName(ChatColor.BLUE + "마나");
										mana.setItemMeta(manaIm);
										player.getInventory().setItem(8, mana);
									} else if (num == 1) {
										player.sendMessage(ChatColor.RED + "마나가 모두 사라집니다.");
										ItemStack item = new ItemStack(Material.MAGMA_CREAM);
										ItemMeta itemIm = item.getItemMeta();
										itemIm.setDisplayName(ChatColor.RED + "마나없음");
										item.setItemMeta(itemIm);
										player.getInventory().setItem(8, item);
									} else {
										player.sendMessage(ChatColor.RED + "스킬 사용에 실패하였습니다.");
										world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
									}
									world.playEffect(loc, Effect.POTION_BREAK, 0);
									t.endTask();
									t.removeID();
								}
								time++;
							}

						}, 0, 1);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		} else {
			player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
			world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
		}
	}

	public void skill6(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "데빌의 증표"))) {
			int damNum = 0;
			try {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
				}
			} catch(Exception e) {
				
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect30();
						player.sendMessage(ChatColor.GREEN + "[스킬]비공이 발동됩니다.");	
						Vector vec = new Vector(0, 1, 0);
						player.setVelocity(vec.multiply(2.0f));
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					Salmon salmon = (Salmon) world.spawnEntity(loc, EntityType.SALMON);
					if(inheritance.getInheritance(player) == 52) {
						salmon.setCustomName(ChatColor.GRAY + "연어 인형+" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
					} else {
						salmon.setCustomName(ChatColor.GRAY + "연어 인형" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
					}
					salmon.setCustomNameVisible(true);
					((LivingEntity) salmon).setMaxHealth(5);
					((LivingEntity) salmon).setHealth(5);
					salmon.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 1));
					world.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1.0f, 1.0f);
					player.sendMessage(ChatColor.GREEN + "[스킬]악마의 장난이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "연어 인형이 소환됩니다.");
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE9();
					// ================================================================
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if(!(nearEntity instanceof Player)) {
							if (nearEntity instanceof LivingEntity) {
								LivingEntity nearMob = (LivingEntity) nearEntity;
								nearMob.damage(player.getLevel()*20 + damNum*13);
							}
						}
					}
					
					new ParticleEffect(player).newEffect31();
					player.sendMessage(ChatColor.GREEN + "[스킬]데빌 블레스터가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 0.5f, 1.0f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE0_3();
					// ================================================================
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=40) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								if(inheritance.getInheritance(player) == 53) {
									arrow.setDamage(0.13);
								} else {
									arrow.setDamage(0.03);
								}
								arrow.setVelocity(player.getLocation().getDirection().multiply(10.0f));		
							}
							
							time++;
						}						
						
					}, 0, 1);
					player.sendMessage(ChatColor.GREEN + "[스킬]인페르노가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.1f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill7(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "엔젤의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect38();
						player.sendMessage(ChatColor.GREEN + "[스킬]천사의 날개가 발동됩니다.");
						Vector vec = new Vector(0, 1, 0);
						player.setVelocity(vec.multiply(2.0f));
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=7) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 7);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();	
					
					List<Entity> entitylist = player.getNearbyEntities(12, 8, 12);
					for(Entity ent : entitylist) {
						if(ent instanceof IronGolem) {
							ent.remove();
						}
					}
					
					new BukkitRunnable() {

						@Override
						public void run() {

							for (int _ = 0; _ < 2; _++) {
								IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
								golem.setCustomName(
										ChatColor.GRAY + "기사단원" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
								golem.setCustomNameVisible(true);
								((LivingEntity) golem).setMaxHealth((int)(Math.pow(player.getLevel(), 3) / 3000) + (20 + player.getLevel() * 30) / 2);
								((LivingEntity) golem).setHealth((int)(Math.pow(player.getLevel(), 3) / 3000) + (20 + player.getLevel() * 30) / 2);
								int golemLv = (player.getLevel() / 2);
								golem.setRemoveWhenFarAway(true);
								golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, (int)(Math.pow(golemLv, 2) / 65)));						
								go.put(golem.getUniqueId(), player);
							}
							IronGolem golem = (IronGolem) world.spawnEntity(loc, EntityType.IRON_GOLEM);
							golem.setCustomName(ChatColor.GRAY + "기사단장" + ChatColor.YELLOW + " [Lv." + player.getLevel() + "]");
							golem.setCustomNameVisible(true);
							((LivingEntity) golem).setMaxHealth((int)(Math.pow(player.getLevel(), 3) / 2000) + (20 + player.getLevel() * 30) / 2);
							((LivingEntity) golem).setHealth((int)(Math.pow(player.getLevel(), 3) / 2000) + (20 + player.getLevel() * 30) / 2);
							int golemLv = player.getLevel();
							golem.setRemoveWhenFarAway(true);
							if(inheritance.getInheritance(player) == 54) {
								golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, (int)(Math.pow(golemLv, 2) / 20)));
							} else {
								golem.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, (int)(Math.pow(golemLv, 2) / 50)));
							}
							go.put(golem.getUniqueId(), player);
							
							new ParticleEffect(player).newEffect39();
							player.sendMessage(ChatColor.GREEN + "[스킬]천사의 기사단이 발동됩니다.");
							player.sendMessage(ChatColor.GREEN + "기사단이 소환됩니다. 레벨: " + player.getLevel());
							List<Entity> entlist = player.getNearbyEntities(10, 10, 10);
							for (Entity nearEntity : entlist) {
								if (nearEntity instanceof Mob && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
									if (nearEntity instanceof Zombie) {
										Zombie zombie = (Zombie) nearEntity;
										zombie.setTarget(golem);
									}
									if (nearEntity instanceof Skeleton) {
										Skeleton zombie = (Skeleton) nearEntity;
										zombie.setTarget(golem);
									}
									if (nearEntity instanceof WitherSkeleton) {
										WitherSkeleton zombie = (WitherSkeleton) nearEntity;
										zombie.setTarget(golem);
									}
									if (nearEntity instanceof Drowned) {
										Drowned zombie = (Drowned) nearEntity;
										zombie.setTarget(golem);
									}
									if (nearEntity instanceof Husk) {
										Husk zombie = (Husk) nearEntity;
										zombie.setTarget(golem);
									}
								}
							}
							this.cancel();

						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 2);
					
					world.playEffect(loc, Effect.SMOKE, 0);
					world.playSound(loc, Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=15) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 15);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]천사의 심판이 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setHelmet(new ItemStack(Material.ANDESITE_STAIRS));
					proTotem.setVelocity(player.getLocation().getDirection().multiply(1.0f));
					proTotem.setRemoveWhenFarAway(true);
					
					ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						ArmorStand totem;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
							if(proTotem.isOnGround() && time == 0) {	
								totem = (ArmorStand) player.getWorld().spawnEntity(proTotem.getLocation(), EntityType.ARMOR_STAND);
								totem.setVisible(false);
								totem.setHelmet(new ItemStack(Material.ANDESITE_STAIRS));
								totem.setRemoveWhenFarAway(true);
								proTotem.remove();
								time++;
							}
							
							if(time >= 1) {
								time++;
							}
							
							if(time == 5 || time == 25) {
								List<Entity> entitylist = totem.getNearbyEntities(8, 3, 8);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof LivingEntity) {
										if((nearEntity.getType() != EntityType.PLAYER) && (nearEntity.getType() != EntityType.PIG) && (nearEntity.getType() != EntityType.COW)
												&& (nearEntity.getType() != EntityType.CHICKEN) && (nearEntity.getType() != EntityType.SHEEP) && (nearEntity.getType() != EntityType.VILLAGER)
												&& (nearEntity.getType() != EntityType.HORSE) && (nearEntity.getType() != EntityType.SKELETON_HORSE) && (nearEntity.getType() != EntityType.ZOMBIE_HORSE)
												&& (nearEntity.getType() != EntityType.WOLF) && (nearEntity.getType() != EntityType.CAT) && (nearEntity.getType() != EntityType.DONKEY)
												&& (nearEntity.getType() != EntityType.ARMOR_STAND) && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
											((LivingEntity) nearEntity).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20, 100, true,true));
											ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(nearEntity.getLocation().add(0,8,0), EntityType.ARMOR_STAND);
											as.setVisible(false);
											as.setArms(true);
											as.setItemInHand(new ItemStack(Material.POLISHED_BLACKSTONE_SLAB));
											as.setRightArmPose(new EulerAngle(Math.toRadians(90), 0, 0));
											as.setRemoveWhenFarAway(true);
										}
									}
								}
							}
							
							if(time == 20 || time == 40) {
								List<Entity> entitylist = totem.getNearbyEntities(15, 15, 15);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof ArmorStand) {
										ArmorStand as = (ArmorStand) nearEntity;
										if((as.getItemInHand().getType() == Material.POLISHED_BLACKSTONE_SLAB) && (as.getRightArmPose().getX() == Math.toRadians(90))) {
											as.remove();
											continue;
										}
									}
									if(nearEntity instanceof LivingEntity) {
										if((nearEntity.getType() != EntityType.PLAYER) && (nearEntity.getType() != EntityType.PIG) && (nearEntity.getType() != EntityType.COW)
												&& (nearEntity.getType() != EntityType.CHICKEN) && (nearEntity.getType() != EntityType.SHEEP) && (nearEntity.getType() != EntityType.VILLAGER)
												&& (nearEntity.getType() != EntityType.HORSE) && (nearEntity.getType() != EntityType.SKELETON_HORSE) && (nearEntity.getType() != EntityType.ZOMBIE_HORSE)
												&& (nearEntity.getType() != EntityType.WOLF) && (nearEntity.getType() != EntityType.CAT) && (nearEntity.getType() != EntityType.DONKEY)
												&& (nearEntity.getType() != EntityType.ARMOR_STAND) && (nearEntity.getType() != EntityType.IRON_GOLEM)) {
											((LivingEntity) nearEntity).damage(player.getLevel()*80);
										}
									}
								}
							}
							
							if(time >= 50) {
								totem.remove();
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							PotionRatioForSkill pr = new PotionRatioForSkill();
							if(inheritance.getInheritance(player) == 55) {
								pr.calculation(nearPlayer, player.getLevel() * 10);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, true,true));
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 10 + ChatColor.RED + "]");
							} else {
								pr.calculation(nearPlayer, player.getLevel() * 7);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, true,true));
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 7 + ChatColor.RED + "]");
							}
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초 동안 방어력이 상승합니다.");
						}
					}
					PotionRatioForSkill pr = new PotionRatioForSkill();
					
					if(inheritance.getInheritance(player) == 55) {
						pr.calculation(player, player.getLevel() * 10);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 10 + ChatColor.RED + "]");
					} else {
						pr.calculation(player, player.getLevel() * 7);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 7 + ChatColor.RED + "]");
					}
					
					new ParticleEffect(player).newEffect40();
					player.sendMessage(ChatColor.GREEN + "[스킬]천사의 축복이 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PHANTOM_FLAP, 1.0f, 1.0f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill8(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "대행자의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect41();
						player.sendMessage(ChatColor.GREEN + "[스킬]신비의 대행이 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(2.0f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 0.6f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					player.sendMessage(ChatColor.GREEN + "[스킬]창조의 대행이 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setHelmet(new ItemStack(Material.RED_NETHER_BRICK_STAIRS));
					proTotem.setVelocity(player.getLocation().getDirection().multiply(1.0f));
					proTotem.setRemoveWhenFarAway(true);
					
					ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						ArmorStand totem;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(proTotem.isOnGround() && time == 0) {	
								totem = (ArmorStand) player.getWorld().spawnEntity(proTotem.getLocation(), EntityType.ARMOR_STAND);
								totem.setVisible(false);
								totem.setHelmet(new ItemStack(Material.RED_NETHER_BRICK_STAIRS));
								totem.setRemoveWhenFarAway(true);
								proTotem.remove();

								new ParticleEffect(player, totem).newEffect0();
								
								List<Entity> entitylist = totem.getNearbyEntities(8, 5, 8);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof Player) {
										Player nearPlayer = (Player) nearEntity;
										PotionRatioForSkill pr = new PotionRatioForSkill();
										pr.calculation(nearPlayer, player.getLevel() * 3);
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님의 토템으로 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 3 + ChatColor.RED + "]");
									}
								}
								
								time++;
							}
							
							if(time >= 1) {
								time++;
							}
							
							if(time == 30 || time == 60 || time == 90 || time == 120) {
								List<Entity> entitylist = totem.getNearbyEntities(8, 5, 8);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof Player) {
										Player nearPlayer = (Player) nearEntity;
										PotionRatioForSkill pr = new PotionRatioForSkill();
										if(inheritance.getInheritance(player) == 56) {
											pr.calculation(nearPlayer, player.getLevel() * 3);
											nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님의 토템으로 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 3 + ChatColor.RED + "]");
										} else {
											pr.calculation(nearPlayer, player.getLevel() * 2);
											nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님의 토템으로 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 2 + ChatColor.RED + "]");
										}
									}
								}
							}
							
							if(time >= 150) {
								totem.remove();
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=10) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					int num = rnd.nextInt(6);
					player.sendMessage(ChatColor.GREEN + "[스킬]신의 주사위가 발동됩니다.");
					world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE13();
					// ================================================================				
					Thread t = new Thread(player.getUniqueId());
					Thread t2 = new Thread(player.getUniqueId());
					
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if(!t.hasID()) {
								t.setID(sleep);
							}
							
							if(time>30) {
								if (num == 0) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 1!");
								} else if (num == 1) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 2!");
								} else if (num == 2) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 3!");
								} else if (num == 3) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 4!");
								} else if (num == 4) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 5!");
								} else if (num == 5) {
									player.sendMessage(ChatColor.GREEN + "주사위의 눈은 6!");
									player.sendMessage(ChatColor.GREEN + "[스킬]신의 장난이 발동됩니다.");
									world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
								}
								t.endTask();
								t.removeID();
							}
							
							time++;
							
						}
						
					}, 0, 1);
					
					sleep2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;

						@Override
						public void run() {
							if (!t2.hasID()) {
								t2.setID(sleep2);
							}
							
							if(time > 40) {
								if (num == 0) {
									if (time > 40) {
										if(player.getHealth() >= 15) {
											player.setHealth(20);
										} else {
											player.setHealth(player.getHealth() + 5);
										}
										new ParticleEffect(player).newEffect42();
										player.sendMessage(ChatColor.GREEN + "신의 경고가 발동됩니다.");
										player.sendMessage(ChatColor.GREEN + "정신이 번쩍 듭니다.");
										world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);									
									}
								} else if (num == 1) {
									if (time > 40) {
										List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
										for (Entity nearEntity : entitylist) {
											if (nearEntity.getType() != EntityType.PLAYER) {
												if (nearEntity instanceof LivingEntity) {
													LivingEntity nearMob = (LivingEntity) nearEntity;
													nearMob.damage(player.getLevel() * 40);
													new ParticleEffect(player, nearMob).newEffect43();
												}
											}
										}
										player.sendMessage(ChatColor.GREEN + "신의 통고가 발동됩니다.");
									}
								} else if (num == 2) {
									if (time > 40) {
										List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
										for (Entity nearEntity : entitylist) {
											if (nearEntity.getType() != EntityType.PLAYER) {
												if (nearEntity instanceof LivingEntity) {
													LivingEntity nearMob = (LivingEntity) nearEntity;
													nearMob.damage(player.getLevel() * 100);
												}
											}
										}		
										new ParticleEffect(player).newEffect44();
										player.sendMessage(ChatColor.GREEN + "신의 심판이 발동됩니다.");
									}
								} else if (num == 3) {
									if (time > 40) {
										List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
										for (Entity nearEntity : entitylist) {
											if (nearEntity.getType() != EntityType.PLAYER) {
												if (nearEntity instanceof LivingEntity) {
													LivingEntity nearMob = (LivingEntity) nearEntity;
													nearMob.damage(player.getLevel() * 160);
												}
											}
										}		
										new ParticleEffect(player).newEffect45();
										player.sendMessage(ChatColor.GREEN + "신의 강림이 발동됩니다.");
									}
								} else if (num == 4) {
									if (time > 40) {
										new ParticleEffect(player).newEffect46();
										player.sendMessage(ChatColor.GREEN + "신의 축복이 발동됩니다.");
										player.sendMessage(ChatColor.GREEN + "7초간 무적이 됩니다.");
										player.setNoDamageTicks(140);
										world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);									
									}
								} else if (num == 5) {
									if (time > 40) {
										new ParticleEffect(player).newEffect47();
										int num2 = rnd.nextInt(216);
										world.playSound(player.getLocation(), Sound.ENTITY_WITCH_CELEBRATE, 1.0f, 1.0f);
										if (num2 < 215) {
											try {
												player.getInventory().remove(Material.HEART_OF_THE_SEA);
												ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, 20);
												ItemMeta itemIm = item.getItemMeta();
												itemIm.setDisplayName(ChatColor.BLUE + "마나");
												item.setItemMeta(itemIm);
												player.getInventory().setItem(8, item);
												player.sendMessage(ChatColor.GREEN + "신의 탐욕이 발동됩니다.");
												player.sendMessage(ChatColor.GREEN + "마나의 수가 20이 됩니다.");
											} catch (Exception e20) {
												player.sendMessage(ChatColor.RED + "스킬 발동에 실패하였습니다.");
												world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
											}
										} else {
											int num4 = rnd.nextInt(20);
											if (num4 < 20) {
												ItemStack weapon1 = new ItemStack(Material.DIAMOND);
												ItemMeta weapon1Im = weapon1.getItemMeta();
												weapon1Im.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
												weapon1Im.setDisplayName(
														ChatColor.DARK_RED + "" + ChatColor.MAGIC + "The Item from God");
												ArrayList<String> weapon1Lore = new ArrayList();
												weapon1Lore.add(ChatColor.GRAY + "신의 힘이 담긴 아이템");
												weapon1Lore.add(ChatColor.GRAY + "5개를 모아 강화 재료로 사용할 수 있을 것 같다.");
												weapon1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
												weapon1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
												weapon1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
												weapon1Im.setUnbreakable(true);
												weapon1Im.setLore(weapon1Lore);
												weapon1.setItemMeta(weapon1Im);
												player.getInventory().addItem(weapon1);
												player.sendMessage(ChatColor.GREEN + "신에게 아이템을 받았습니다.");
												world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.0f);
												System.out.println(player.getDisplayName() + "님이 신에게 아이템을 받았습니다.");
											}
										}									
									}
								}
								t2.endTask();
								t2.removeID();
							}

							time++;
						}
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);

					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							if(inheritance.getInheritance(player) == 57) {
								nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 4, true,true));
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2, true,true));
							} else {
								nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2, true,true));
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2, true,true));
							}
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 저항이 부여됩니다.");
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 추가 체력이 부여됩니다.");
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 신속이 부여됩니다.");
						}
					}
					if(inheritance.getInheritance(player) == 57) {
						player.removePotionEffect(PotionEffectType.ABSORPTION);
						player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 4, true,true));
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2, true,true));
					} else {
						player.removePotionEffect(PotionEffectType.ABSORPTION);
						player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 2, true,true));
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 2, true,true));
					}
					
					new ParticleEffect(player).newEffect48();
					int music = rnd.nextInt(4);
					if(music == 0) {
						new ParticleEffect(player).newSound1();
					} else if(music == 1) {
						new ParticleEffect(player).newSound2();
					} else if(music == 2) {
						new ParticleEffect(player).newSound3();
					} else if(music == 3) {
						new ParticleEffect(player).newSound4();
					}
					player.sendMessage(ChatColor.GREEN + "[스킬]신들의 풍악이 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 저항이 부여됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 추가 체력이 부여됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 신속이 부여됩니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill9(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림자 무사의 증표"))) {
			int damNum = 0;
			try {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
				}
			} catch(Exception e) {
				
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect20();
						player.sendMessage(ChatColor.GREEN + "[스킬]반역의 날개가 발동됩니다.");
						player.sendMessage(ChatColor.GREEN + "1분간 아군에게 신속이 부여됩니다.");
						
						List<Entity> entitylist = player.getNearbyEntities(10, 10, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() == EntityType.PLAYER) {
								Player nearPlayer = (Player) nearEntity;
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1, true,true));
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 1분간 신속이 부여됩니다.");
							}
						}

						Vector vec = player.getEyeLocation().getDirection().multiply(2.5f);
						player.setVelocity(vec);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=8) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {		
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						new BukkitRunnable() {
							
							int time = 0;
							@Override
							public void run() {
								time++;
								
								if(time > 10) {
									Vector vec = player.getEyeLocation().getDirection().multiply(2.0f);
									player.setVelocity(vec);
									this.cancel();
								}
							}
						}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
						
						new ParticleEffect(player, damNum).newEffect21();
						player.sendMessage(ChatColor.GREEN + "[스킬]발도가 발동됩니다.");
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					if(inheritance.getInheritance(player) == 59) {
						player.setHealth((int) (player.getHealth() / 1.2));
					} else {
						player.setHealth((int) (player.getHealth() / 2));
					}
					int num = player.getLevel();
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, num * 3));
					new ParticleEffect(player, damNum).newEffect22();
					player.sendMessage(ChatColor.GREEN + "[스킬]나이트메어가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "능력치가 대폭 상승합니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=15) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 15);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]화둔이 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getLocation().getDirection().multiply(1.8f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
					
					Item dItem = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.FIREWORK_STAR));
					dItem.setPickupDelay(10000000);
					arrow.addPassenger(dItem);
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(!arrow.isDead()) {	
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
							} else {	
								List<Entity> entitylist = arrow.getNearbyEntities(5, 5, 5);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											if(inheritance.getInheritance(player) == 60) {
												nearMob.damage(player.getLevel() * (25 + (player.getLevel() / 100.0)));
											} else {
												nearMob.damage(player.getLevel() * 25);
											}
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
								world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}
	
	public void skill10(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "버서커의 증표"))) {
			int damNum = 0;
			try {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
				}
			} catch(Exception e) {
				
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect23();
						player.sendMessage(ChatColor.GREEN + "[스킬]엘·카나프가 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(2.0f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.8f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=2) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					if(player.getHealth() > 10) {
						player.setHealth(20);
					} else {
						player.setHealth(player.getHealth() + 10);
					}
					
					new ParticleEffect(player).newEffect24();
					world.playSound(loc, Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 2.0f); 	
					player.sendMessage(ChatColor.GREEN + "[스킬]엘·페게츠가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "자신의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + "50%" + ChatColor.RED + "]");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=10) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {	
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						new ParticleEffect(player).newEffect25();
						player.sendMessage(ChatColor.GREEN + "[스킬]엘·초펠이 발동됩니다.");
						
						Vector vec = player.getEyeLocation().getDirection().multiply(3.0f);
						vec.setY(0);
						player.setVelocity(vec);						
						if(inheritance.getInheritance(player) == 61) {
							List<Entity> entitylist = player.getNearbyEntities(8, 8, 8);				
							for (Entity nearEntity : entitylist) {
								if (nearEntity instanceof Mob) {
									LivingEntity ent = (LivingEntity) nearEntity;
									if(ent instanceof Monster) {
										ent.setVelocity(new Vector(0, 1, 0));
									}
									ent.damage(player.getLevel()*5 + damNum * 10);
								}
							}	
						} else {
							List<Entity> entitylist = player.getNearbyEntities(6, 6, 6);				
							for (Entity nearEntity : entitylist) {
								if (nearEntity instanceof Mob) {
									LivingEntity ent = (LivingEntity) nearEntity;
									if(ent instanceof Monster) {
										ent.setVelocity(new Vector(0, 1, 0));
									}
									ent.damage(player.getLevel()*5 + damNum * 10);
								}
							}	
						}
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=6) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 6);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					new ParticleEffect(player).newEffect26();
					player.sendMessage(ChatColor.GREEN + "[스킬]엘·예브른이 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ITEM_TRIDENT_THUNDER, 2.0f, 0.3f);
					
					new BukkitRunnable() {
						
						int time = 0;
						@Override
						public void run() {
							time++;
							
							if(time > 20) {
								List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);				
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Mob) {
										LivingEntity ent = (LivingEntity) nearEntity;
										if(inheritance.getInheritance(player) == 62) {
											ent.damage(player.getLevel()*30);
										} else {
											ent.damage(player.getLevel()*20);
										}
									}
								}	
								this.cancel();
							}
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}
	
	public void skill11(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "군인의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if (i >= 2) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);

					new ParticleEffect(player).newEffect27();
					player.sendMessage(ChatColor.GREEN + "[스킬]행군이 발동됩니다.");

					player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]수류탄 투척이 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.7f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 2);
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					Item dItem = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.FIRE_CHARGE));
					dItem.setPickupDelay(10000000);
					arrow.addPassenger(dItem);
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								if(inheritance.getInheritance(player) == 63) {
									List<Entity> entitylist = arrow.getNearbyEntities(7, 7, 7);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel() * 15);
											}
										}
									}
								} else {
									List<Entity> entitylist = arrow.getNearbyEntities(5, 5, 5);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel() * 15);
											}
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 2.0f);
								world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							PotionRatioForSkill pr = new PotionRatioForSkill();
							if(inheritance.getInheritance(player) == 64) {
								pr.calculation(nearPlayer, player.getLevel() * 5.5);
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 5.5 + ChatColor.RED + "]");
							} else {
								pr.calculation(nearPlayer, player.getLevel() * 4);
								nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 4 + ChatColor.RED + "]");
							}
						}
					}
					PotionRatioForSkill pr = new PotionRatioForSkill();
					if(inheritance.getInheritance(player) == 64) {
						pr.calculation(player, player.getLevel() * 5.5);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 5.5 + ChatColor.RED + "]");
					} else {
						pr.calculation(player, player.getLevel() * 4);
						player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 4 + ChatColor.RED + "]");
					}
					
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 0.5f);
					new ParticleEffect(player).newEffect28();
					player.sendMessage(ChatColor.GREEN + "[스킬]구급법이 발동됩니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=10) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					Location loc = player.getLocation();
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1, true,true));
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 저항이 부여됩니다.");
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 추가 체력이 부여됩니다.");
						}
					}
					
					Vector vec = player.getEyeLocation().add(0,1,0).getDirection().multiply(1.5f);
					List<Entity> moblist = player.getNearbyEntities(3, 3, 3);				
					for (Entity nearEntity : moblist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							if(ent instanceof Monster) {
								ent.setVelocity(vec);
							}
						}
					}
					
					player.removePotionEffect(PotionEffectType.ABSORPTION);
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 1, true,true));
					new ParticleEffect(player).newEffect29();
					player.sendMessage(ChatColor.GREEN + "[스킬]각개전투가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 저항이 부여됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 추가 체력이 부여됩니다.");
					world.playSound(loc, Sound.BLOCK_CHAIN_BREAK, 2.0f, 0.5f);		
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill12(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "그림 리퍼의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						if(map.get(player.getDisplayName()) == 1) {
							new ParticleEffect(player).newEffect33();
							player.sendMessage(ChatColor.GREEN + "[스킬]영혼 걸음이 발동됩니다.");
							Vector vec = player.getEyeLocation().getDirection().multiply(1.2f);
							player.setVelocity(vec);
							world.playSound(player.getLocation(), Sound.ITEM_CHORUS_FRUIT_TELEPORT, 1.0f, 1.0f);
						} else {
							new ParticleEffect(player).newEffect32();
							player.sendMessage(ChatColor.GREEN + "[스킬]사신 걸음이 발동됩니다.");
							Vector vec = player.getEyeLocation().getDirection().multiply(1.7f);
							player.setVelocity(vec);
							world.playSound(player.getLocation(), Sound.ENTITY_SHULKER_TELEPORT, 1.0f, 1.8f);
						}
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					if(map.get(player.getDisplayName()) == 1) {
						List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() != EntityType.PLAYER) {
								if (nearEntity instanceof LivingEntity) {
									LivingEntity nearMob = (LivingEntity) nearEntity;
									if(inheritance.getInheritance(player) == 65) {
										nearMob.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, player.getLevel()/5,true,true));
									} else {
										nearMob.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, player.getLevel()/10,true,true));
									}
								}
							}
						}
						world.playSound(player.getLocation(), Sound.ENTITY_WITHER_SHOOT, 1.0f, 1.5f);
						new ParticleEffect(player).newEffect37();
						player.sendMessage(ChatColor.GREEN + "[스킬]영혼 흡착이 발동됩니다.");
						player.sendMessage(ChatColor.GREEN + "10초간 주변 적들이 약화됩니다.");
					} else {
						int num = 0;					
						List<Entity> entitylist = player.getNearbyEntities(5, 5, 5);
						for (Entity nearEntity : entitylist) {
							if ((nearEntity.getType() != EntityType.PLAYER) && (nearEntity.getType() != EntityType.PIG) && (nearEntity.getType() != EntityType.COW)
									&& (nearEntity.getType() != EntityType.CHICKEN) && (nearEntity.getType() != EntityType.SHEEP) && (nearEntity.getType() != EntityType.VILLAGER)
									&& (nearEntity.getType() != EntityType.HORSE) && (nearEntity.getType() != EntityType.SKELETON_HORSE) && (nearEntity.getType() != EntityType.ZOMBIE_HORSE)
									&& (nearEntity.getType() != EntityType.WOLF) && (nearEntity.getType() != EntityType.CAT) && (nearEntity.getType() != EntityType.DONKEY)
									&& (nearEntity.getType() != EntityType.ARMOR_STAND)) {
								if (nearEntity instanceof LivingEntity) {
									LivingEntity nearMob = (LivingEntity) nearEntity;
									nearMob.setFireTicks(200);
									nearMob.damage(player.getLevel());
									num++;
								}
							}
						}
						if (num == 0) {
							world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
							player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
							player.sendMessage(ChatColor.RED + "대상이 없습니다.");
						} else {
							new ParticleEffect(player).newEffect36();
							world.playSound(player.getLocation(), Sound.ENTITY_CAT_HISS, 1.0f, 1.0f);
							player.sendMessage(ChatColor.GREEN + "[스킬]지옥불이 발동됩니다.");
							player.sendMessage(ChatColor.GREEN + "주변의 몬스터들이 불타게 됩니다.");
						}
					}

				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					if(map.get(player.getDisplayName()) == 1) {
						List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() != EntityType.PLAYER) {
								if (nearEntity instanceof LivingEntity) {
									LivingEntity nearMob = (LivingEntity) nearEntity;
									if(inheritance.getInheritance(player) == 67) {
										nearMob.damage(player.getLevel() * 30);
									} else {
										nearMob.damage(player.getLevel() * 20);
									}
									new ParticleEffect(player, nearMob).newEffect34();
								}
							}
						}
						player.sendMessage(ChatColor.GREEN + "[스킬]카르마가 발동됩니다.");
					} else {
						if(inheritance.getInheritance(player) == 66) {
							player.removePotionEffect(PotionEffectType.ABSORPTION);
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 400, 4, true,true));
						} else {
							player.removePotionEffect(PotionEffectType.ABSORPTION);
							player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 400, 2, true,true));
						}
						new ParticleEffect(player).newEffect35();
						player.sendMessage(ChatColor.GREEN + "[스킬]칼라수트라가 발동됩니다.");
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					if(map.get(player.getDisplayName()) == 1) {
						//파티클 제거
						try {
							ParticleData pd = new ParticleData(player.getUniqueId());
							if(pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
						} catch(Exception e) {
							
						}
						map.remove(player.getDisplayName());
						map.put(player.getDisplayName(), 0);
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE0_1();
						// ================================================================
						player.sendMessage(ChatColor.GREEN + "[스킬]폼 체인지가 발동됩니다.");
					} else {
						//파티클 제거
						try {
							ParticleData pd = new ParticleData(player.getUniqueId());
							if(pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
						} catch(Exception e) {
							
						}
						map.remove(player.getDisplayName());
						map.put(player.getDisplayName(), 1);
						// ===============================================================
						ParticleData pd = new ParticleData(player.getUniqueId());
						if (pd.hasID()) {
							pd.endTask();
							pd.removeID();
						}
						ParticleEffect pe = new ParticleEffect(player);
						pe.startE0_2();
						// ================================================================
						player.sendMessage(ChatColor.GREEN + "[스킬]폼 체인지가 발동됩니다.");
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill13(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "마인의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=1) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect49();
						player.sendMessage(ChatColor.GREEN + "[스킬]블링크가 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(3.0f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					new ParticleEffect(player).newEffect50(damNum);
					player.sendMessage(ChatColor.GREEN + "[스킬]루인 오브 노바가 발동됩니다.");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=2) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]디바인 임팩트가 발동됩니다.");
					
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player);
					pe.startE0_4();
					// ================================================================
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=40) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								arrow.setDamage(0.04);
								arrow.setVelocity(player.getLocation().getDirection().multiply(10.0f));		
							}
							
							time++;
						}						
						
					}, 0, 1);				
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=15) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 15);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);			
					
					player.sendMessage(ChatColor.GREEN + "[스킬]어나더 디비니티가 발동됩니다.");
					
					List<Entity> entity = player.getNearbyEntities(20, 5, 20);
					for(Entity e : entity) {
						if(e instanceof Mob) {
							LivingEntity mob = (LivingEntity) e; 
							mob.damage(Math.pow(player.getLevel(), 1.5) + damNum*20);
							if(mob instanceof Monster) {
								mob.setVelocity(new Vector(0,0.4,0));
							}
							new ParticleEffect(player, mob).newEffect51();
						}
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill14(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "팔라딘의 증표"))) {
			int damNum = 0;
			try {
				if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
					ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
					damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
				}
			} catch(Exception e) {
				
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect52();
						player.sendMessage(ChatColor.GREEN + "[스킬]스피릿 오브 오더가 발동됩니다.");

						Vector vec = player.getEyeLocation().getDirection().multiply(2.4f);
						player.setVelocity(vec);
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 0.8f);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							PotionRatioForSkill pr = new PotionRatioForSkill();
							pr.calculation(nearPlayer, player.getLevel() * 15);
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 2, true,true));
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 15 + ChatColor.RED + "]");
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 15초 동안 방어력이 상승합니다.");
						}
					}
					PotionRatioForSkill pr = new PotionRatioForSkill();
					pr.calculation(player, player.getLevel() * 15);

					new ParticleEffect(player).newEffect53();
					player.sendMessage(ChatColor.GREEN + "[스킬]아이 오브 오더가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 15 + ChatColor.RED + "]");
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=10) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]파워 오브 오더가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ITEM_TRIDENT_THUNDER, 1.0f, 0.5f);
					
					List<Entity> entitylist = player.getNearbyEntities(6, 4, 6);				
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Mob) {
							LivingEntity ent = (LivingEntity) nearEntity;
							if(ent instanceof Monster) {
								ent.setVelocity(new Vector(0, 1, 0));
							}
							ent.damage(Math.pow(player.getLevel(), 1.65) + damNum * 15);
						}
					}	
					
					if(!player.isInWater()) {
						Location loc = player.getLocation();
						Location loc2;
						FallingBlock fb;
						loc2 = loc.clone().add(new Vector(3, 0, 0));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(2, 0, 1));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(1, 0, 2));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						fb.setPersistent(false);
						
						loc2 = loc.clone().add(new Vector(0, 0, 3));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(-3, 0, 0));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(-2, 0, 1));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(-1, 0, 2));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(-2, 0, -1));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(-1, 0, -2));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(0, 0, -3));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(1, 0, -2));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
						
						loc2 = loc.clone().add(new Vector(2, 0, -1));
						fb = (FallingBlock) player.getWorld().spawnFallingBlock(loc2, loc2.clone().add(0,-1,0).getBlock().getType(), (byte) 0);
						fb.setVelocity(new Vector(0, 0.5, 0));
						fb.setDropItem(false);
					}
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					player.sendMessage(ChatColor.GREEN + "[스킬]소드 오브 오더가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ITEM_TRIDENT_THUNDER, 1.0f, 0.3f);
					
					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setArms(true);
					proTotem.setItemInHand(new ItemStack(Material.POLISHED_BLACKSTONE_SLAB));
					proTotem.setRightArmPose(new EulerAngle(Math.toRadians(5), 0, 0));
					proTotem.setVelocity(player.getLocation().getDirection().multiply(4.0f));
					proTotem.setVelocity(proTotem.getVelocity().multiply(new Vector(1, 0.1 ,1)));
					proTotem.setRemoveWhenFarAway(true);
					
					ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						ArmorStand totem = proTotem;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
							
							if(time % 5 == 0) {
								List<Entity> entitylist = totem.getNearbyEntities(5, 5, 5);
								for(Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(Math.pow(player.getLevel(), 1.8));
										}
									}
								}
							}
							
							if(time >= 50) {
								totem.remove();
								t.endTask();
								t.removeID();
							}
							
							time++;
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill15(Player player, String key) {
		World world = player.getWorld();
		Location loc = player.getLocation();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "용기사의 증표"))) {
			int damNum = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta() != null) {
				ItemMeta im = player.getInventory().getItemInMainHand().getItemMeta();
				damNum = Integer.parseInt(im.getLocalizedName().split(",")[0]);
			}
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("RRR")) {
				if(i>=2) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {						
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 2);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);

						new ParticleEffect(player).newEffect54();
						player.sendMessage(ChatColor.GREEN + "[스킬]돌격이 발동됩니다.");
						
						Vector vec = player.getEyeLocation().add(0,2,0).getDirection().multiply(2.3f);
						player.setVelocity(vec);						
						List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Mob) {
								LivingEntity ent = (LivingEntity) nearEntity;
								if(ent instanceof Monster) {
									ent.setVelocity(vec);
								}
								ent.damage(Math.pow(player.getLevel(), 1.9) + damNum*10);
							}
						}						
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RRL")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);

					new ParticleEffect(player).newEffect55(damNum);
					player.sendMessage(ChatColor.GREEN + "[스킬]헬파이어가 발동됩니다.");	
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLL")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					player.sendMessage(ChatColor.GREEN + "[스킬]드래곤의 가호가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setHelmet(new ItemStack(Material.DIORITE_STAIRS));
					proTotem.setVelocity(player.getLocation().getDirection().multiply(1.0f));
					proTotem.setRemoveWhenFarAway(true);
					
					ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						ArmorStand totem;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(proTotem.isOnGround() && time == 0) {	
								totem = (ArmorStand) player.getWorld().spawnEntity(proTotem.getLocation(), EntityType.ARMOR_STAND);
								totem.setVisible(false);
								totem.setHelmet(new ItemStack(Material.DIORITE_STAIRS));
								totem.setRemoveWhenFarAway(true);
								proTotem.remove();
								
								new ParticleEffect(player, totem).newEffect0();
								
								List<Entity> entitylist = totem.getNearbyEntities(8, 5, 8);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof Player) {
										Player nearPlayer = (Player) nearEntity;
										PotionRatioForSkill pr = new PotionRatioForSkill();
										pr.calculation(nearPlayer, player.getLevel() * 4);
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님의 토템으로 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 4 + ChatColor.RED + "]");
									}
								}
								
								time++;
							}
							
							if(time >= 1) {
								time++;
							}
							
							if(time == 30 || time == 60 || time == 90 || time == 120) {
								List<Entity> entitylist = totem.getNearbyEntities(8, 5, 8);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof Player) {
										Player nearPlayer = (Player) nearEntity;
										PotionRatioForSkill pr = new PotionRatioForSkill();
										pr.calculation(nearPlayer, player.getLevel() * 3);
										nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님의 토템으로 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 3 + ChatColor.RED + "]");
									} else if(nearEntity instanceof Mob) {
										Mob nearMob = (Mob) nearEntity;
										nearMob.damage(Math.pow(player.getLevel(), 1.7));
										if(nearMob instanceof Monster) {
											nearMob.teleport(totem);
										}
									}
								}
							}
							
							if(time >= 150) {
								totem.remove();
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("RLR")) {
				if (i >= 10) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 10);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					player.sendMessage(ChatColor.GREEN + "[스킬]드래곤의 강림이 발동됩니다.");
					world.playEffect(player.getLocation(), Effect.DRAGON_BREATH, 1);
					world.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_AMBIENT, 3.0f, 1.0f);
					world.playSound(player.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1.0f, 1.0f);

					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(),EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setHelmet(new ItemStack(Material.POLISHED_GRANITE_SLAB));
					proTotem.setVelocity(player.getLocation().getDirection().multiply(4.0f));
					proTotem.setRemoveWhenFarAway(true);

					ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArmorStand totem = proTotem;

						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}

							if (time % 5 == 0) {
								List<Entity> entitylist = totem.getNearbyEntities(8, 8, 8);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(Math.pow(player.getLevel(), 1.8) * 2.5);
										}
									}
								}
								world.playSound(totem.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
							}

							if (time >= 50) {
								totem.remove();
								t.endTask();
								t.removeID();
							}

							time++;
						}

					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}
	
	public void skill16(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "조커의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("LRL")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]'이거나 먹어라'가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					ArmorStand proTotem = (ArmorStand) player.getWorld().spawnEntity(player.getLocation(), EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setHelmet(new ItemStack(Material.POLISHED_ANDESITE_STAIRS));
					proTotem.setRemoveWhenFarAway(true);
					
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						int time = 0;
						ArmorStand totem;
						ThreadForSkill t = new ThreadForSkill(player.getUniqueId());
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(proTotem.isOnGround() && time == 0) {	
								totem = (ArmorStand) player.getWorld().spawnEntity(proTotem.getLocation(), EntityType.ARMOR_STAND);
								totem.setVisible(false);
								totem.setHelmet(new ItemStack(Material.POLISHED_ANDESITE_STAIRS));
								totem.setRemoveWhenFarAway(true);
								proTotem.remove();

								// ===============================================================
								ParticleData pd = new ParticleData(totem.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, totem);
								pe.startE0_6();
								// ================================================================
								
								time++;
							}
							
							if(time >= 1) {
								time++;
							}
							
							if(time>=200) {			
								totem.remove();
								t.endTask();
								t.removeID();
							} else if(time%4 == 0 && time >= 1) {
								try {
									Arrow arrow = totem.launchProjectile(Arrow.class);
									arrow.setShooter(player);
									arrow.setDamage(0.05);
									arrow.setVelocity(totem.getLocation().getDirection().multiply(new Vector(10, 0, 10)));		
									world.playSound(totem.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 1.5f, 1.0f);
								} catch(Exception e) {
									
								}
							}
							
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LRR")) {
				if(i>=5) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 5);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]'자 선물이야'가 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getLocation().getDirection().multiply(1.4f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 2);
					world.playSound(player.getLocation(), Sound.ENTITY_PLAYER_ATTACK_SWEEP, 1.5f, 1.0f);
					
					Item dItem = arrow.getWorld().dropItem(arrow.getLocation(), new ItemStack(Material.FIRE_CHARGE));
					dItem.setPickupDelay(10000000);
					arrow.addPassenger(dItem);
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								List<Entity> entitylist = arrow.getNearbyEntities(8, 8, 8);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(Math.pow(player.getLevel(), 1.95));
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 2.0f);
								world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLL")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						player.sendMessage(ChatColor.GREEN + "[스킬]'씨 유 넥스트 타임'이 발동됩니다.");
						world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
						Vector vec = player.getEyeLocation().getDirection().multiply(-4.0f);
						player.setVelocity(vec);
						player.setNoDamageTicks(20);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLR")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);		
					Location loc = player.getLocation();
					List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
					for (Entity nearEntity : entitylist) {
						if (nearEntity.getType() == EntityType.PLAYER) {
							Player nearPlayer = (Player) nearEntity;
							PotionRatioForSkill pr = new PotionRatioForSkill();
							pr.calculation(nearPlayer, player.getLevel() * 10);
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 회복되었습니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 10 + ChatColor.RED + "]");
							nearPlayer.removePotionEffect(PotionEffectType.ABSORPTION);
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 3, true,true));
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 저항이 부여됩니다.");
							nearPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + "님에 의해 10초간 추가 체력이 부여됩니다.");
						}
					}
					PotionRatioForSkill pr = new PotionRatioForSkill();
					pr.calculation(player, player.getLevel() * 10);
					player.removePotionEffect(PotionEffectType.ABSORPTION);
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200, 3, true,true));
					player.sendMessage(ChatColor.GREEN + "[스킬]'웃어라'가 발동됩니다.");
					player.sendMessage(ChatColor.GREEN + "자신과 주변 아군의 체력이 회복됩니다." + ChatColor.RED + " [+" + ChatColor.RED + player.getLevel() * 10 + ChatColor.RED + "]");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 저항이 부여됩니다.");
					player.sendMessage(ChatColor.GREEN + "10초간 아군에게 추가 체력이 부여됩니다.");
					world.playSound(loc, Sound.BLOCK_CHAIN_BREAK, 2.0f, 0.5f);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}
	}

	public void skill17(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "아처의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("LRL")) {
				if(i>=6) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 6);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 스톰이 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=20) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Arrow arrow = player.launchProjectile(Arrow.class);
								arrow.setShooter(player);
								if(inheritance.getInheritance(player) == 68) {
									arrow.setDamage(0.11);
								} else {
									arrow.setDamage(0.01);
								}
								arrow.setVelocity(player.getEyeLocation().getDirection().multiply(3.0f));		
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
								world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
								
								SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
								sarrow.setVelocity(arrow.getVelocity());
							}
							
							time++;
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LRR")) {
				if(i>=8) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 8);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]밤 에로우가 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getEyeLocation().getDirection().multiply(3.0f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								if(inheritance.getInheritance(player) == 69) {
									List<Entity> entitylist = arrow.getNearbyEntities(6, 6, 6);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel()*20);
											}
										}
									}
								} else {
									List<Entity> entitylist = arrow.getNearbyEntities(4, 4, 4);
									for (Entity nearEntity : entitylist) {
										if (nearEntity.getType() != EntityType.PLAYER) {
											if (nearEntity instanceof LivingEntity) {
												LivingEntity nearMob = (LivingEntity) nearEntity;
												nearMob.damage(player.getLevel()*20);
											}
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 2.0f, 1.0f);
								world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 1.0f);
								world.spawnParticle(Particle.EXPLOSION_LARGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLL")) {
				if(i>=3) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						player.sendMessage(ChatColor.GREEN + "[스킬]이스케이프가 발동됩니다.");
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = player.getEyeLocation().getDirection().multiply(-2.2f);
						player.setVelocity(vec);
						player.setNoDamageTicks(20);
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLR")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);		
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 실드가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						double var = 0;
						Location loc, first, second;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=300) {								
								t.endTask();
								t.removeID();
							} 

							List<Entity> entity = player.getNearbyEntities(2, 2, 2);
							for(Entity e : entity) {
								if(e instanceof Mob) {
									LivingEntity mob = (LivingEntity) e; 
									mob.damage(1);
									if(mob instanceof Monster) {
										mob.setVelocity(new Vector(0.3,1,0.3));
									}
									time += 49;
								}
							}
						
							time++;
							
							var += Math.PI / 16;
							loc = player.getLocation();
							first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
							second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
							
							
							world.spawnParticle(Particle.TOTEM, first, 0);
							world.spawnParticle(Particle.TOTEM, second, 0);
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}		
	}
	
	public void skill18(Player player, String key) {
		World world = player.getWorld();
		if (!(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "파워레인저의 증표"))) {
			int i = 0;
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getType() == Material.HEART_OF_THE_SEA) {
					i = i + is.getAmount();
				}
			}
			if(key.equals("LRL")) {
				if(i>=3) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 스톰이 발동됩니다.");
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=40) {								
								t.endTask();
								t.removeID();
							} else if(time%2 == 0) {
								Location normal = player.getEyeLocation();
								
								double arrowAngle1 = 75;
						        double totalAngle1 = normal.getYaw() + arrowAngle1;
						        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
						        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
						        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(3.0f);
								Arrow arrow1 = player.launchProjectile(Arrow.class, arrowDir1);
								arrow1.setShooter(player);
								arrow1.setDamage(0.06);
								SpectralArrow sarrow1 = (SpectralArrow) arrow1.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
								sarrow1.setVelocity(arrowDir1);
								
								Arrow arrow2 = player.launchProjectile(Arrow.class);
								arrow2.setShooter(player);
								arrow2.setDamage(0.06);
								arrow2.setVelocity(normal.getDirection().multiply(3.0f));
								SpectralArrow sarrow2 = (SpectralArrow) arrow2.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
								sarrow2.setVelocity(arrow2.getVelocity());
								
								double arrowAngle3 = 105;
						        double totalAngle3 = normal.getYaw() + arrowAngle3;
						        double arrowDirX3 = Math.cos(Math.toRadians(totalAngle3));
						        double arrowDirZ3 = Math.sin(Math.toRadians(totalAngle3));
						        Vector arrowDir3 = new Vector(arrowDirX3, normal.getDirection().getY(), arrowDirZ3).multiply(3.0f);
								Arrow arrow3 = player.launchProjectile(Arrow.class, arrowDir3);
								arrow3.setShooter(player);
								arrow3.setDamage(0.06);
								SpectralArrow sarrow3 = (SpectralArrow) arrow3.getWorld().spawnEntity(normal, EntityType.SPECTRAL_ARROW);
								sarrow3.setVelocity(arrowDir3);
								
								world.spawnParticle(Particle.FLAME, arrow2.getLocation(), 5);
								world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
							}
							
							time++;
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LRR")) {
				if(i>=4) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 4);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);
					
					player.sendMessage(ChatColor.GREEN + "[스킬]밤 에로우가 발동됩니다.");
					
					Arrow arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setVelocity(player.getEyeLocation().getDirection().multiply(3.0f));		
					world.spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
					world.playSound(player.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
					
					SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
					sarrow.setVelocity(arrow.getVelocity());
					
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(arrow.isDead()) {	
								List<Entity> entitylist = arrow.getNearbyEntities(7, 7, 7);
								for (Entity nearEntity : entitylist) {
									if (nearEntity.getType() != EntityType.PLAYER) {
										if (nearEntity instanceof LivingEntity) {
											LivingEntity nearMob = (LivingEntity) nearEntity;
											nearMob.damage(Math.pow(player.getLevel(), 1.9));
										}
									}
								}
								world.playSound(arrow.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 2.0f, 1.0f);
								world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.5f, 1.0f);
								world.spawnParticle(Particle.EXPLOSION_HUGE, arrow.getLocation(), 0);
								world.spawnParticle(Particle.FLAME, arrow.getLocation(), 10);
								t.endTask();
								t.removeID();
							}
							
						}						
						
					}, 0, 1);
					
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLL")) {
				if(i>=1) {
					if ((player.getLocation().add(0,-1,0).getBlock().getType() != Material.AIR) || (player.getLocation().getBlock().getType() != Material.AIR)
							|| (player.getLocation().add(0,-2,0).getBlock().getType() != Material.AIR)) {
						player.getInventory().remove(Material.HEART_OF_THE_SEA);
						ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 1);
						ItemMeta itemIm = item.getItemMeta();
						itemIm.setDisplayName(ChatColor.BLUE + "마나");
						item.setItemMeta(itemIm);
						player.getInventory().setItem(8, item);
						
						player.sendMessage(ChatColor.GREEN + "[스킬]이스케이프가 발동됩니다.");						
						world.playSound(player.getLocation(), Sound.ENTITY_BLAZE_AMBIENT, 1.0f, 1.0f);
						Vector vec = player.getEyeLocation().getDirection().multiply(-2.5f);
						player.setVelocity(vec);					
						player.setNoDamageTicks(20);
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 2));
					}
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			} else if(key.equals("LLR")) {
				if(i>=1) {
					player.getInventory().remove(Material.HEART_OF_THE_SEA);
					ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA, i - 3);
					ItemMeta itemIm = item.getItemMeta();
					itemIm.setDisplayName(ChatColor.BLUE + "마나");
					item.setItemMeta(itemIm);
					player.getInventory().setItem(8, item);		
					
					player.sendMessage(ChatColor.GREEN + "[스킬]에로우 실드가 발동됩니다.");
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					Thread t = new Thread(player.getUniqueId());
					sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						double var = 0;
						Location loc, first, second;
						
						@Override
						public void run() {
							if (!t.hasID()) {
								t.setID(sleep);
							}
						
							if(time>=600) {								
								t.endTask();
								t.removeID();
							} 

							List<Entity> entity = player.getNearbyEntities(2, 2, 2);
							for(Entity e : entity) {
								if(e instanceof Mob) {
									LivingEntity mob = (LivingEntity) e; 
									mob.damage(Math.pow(player.getLevel(), 2));
									if(mob instanceof Monster) {
										mob.setVelocity(new Vector(0.3,1,0.3));
									}
									time += 49;
								}
							}
						
							time++;
							
							var += Math.PI / 16;
							loc = player.getLocation();
							first = loc.clone().add(Math.cos(var), Math.sin(var) + 1, Math.sin(var));
							second = loc.clone().add(Math.cos(var + Math.PI), Math.sin(var) + 1, Math.sin(var + Math.PI));
							
							
							world.spawnParticle(Particle.TOTEM, first, 0);
							world.spawnParticle(Particle.TOTEM, second, 0);
						}						
						
					}, 0, 1);
				} else {
					player.sendMessage(ChatColor.RED + "마나가 부족합니다.");
					world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.3f, 1.0f);
				}
			}
		}	
	}
	
	public void getMap(Player player) {
		try {
			if(map.containsKey(player.getDisplayName())) {
				map.remove(player.getDisplayName());
				map.put(player.getDisplayName(), 0);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE0_1();
				// ================================================================
			} else {
				map.put(player.getDisplayName(), 0);
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE0_1();
				// ================================================================
			}
		} catch(Exception e) {
			
		}
	}
	
}
