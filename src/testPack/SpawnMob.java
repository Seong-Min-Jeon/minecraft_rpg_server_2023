package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Husk;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.LlamaSpit;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Rabbit.Type;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnMob {

	Random rnd = new Random();

	public boolean spawn(Entity mob) {
		LivingEntity entity = (LivingEntity) mob;
		Location loc = entity.getLocation();
		if (rat(entity, loc) && distorted(entity, loc)) {
			return true;
		}
		return false;
	}
	
	public boolean rat(LivingEntity entity, Location loc) {
		// 뒷골목 -1309 79 1599  -884 0 1074
		if (loc.getX() <= -884 && loc.getY() <= 79 && loc.getZ() <= 1599 && 
				loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074) {
			Location chestLoc = new Location(entity.getWorld(), -1144, 166, 1467);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				int tmp = rnd.nextInt(10);
				
				if(tmp > 0) {
					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(20);
					entity.setHealth(20);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(rnd.nextInt(19));
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
				} else {
					entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "쥐 두목");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(50);
					entity.setHealth(50);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(rnd.nextInt(19));
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
				}
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "청소부");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(300);
				entity.setHealth(300);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5, false, false));
				
				for(Entity ent : entity.getNearbyEntities(10, 3, 10)) {
					if(ent instanceof Player) {
						((IronGolem) entity).setTarget((Player) ent);
					}
				}
				
			}
		}
		return true;
	}
	
	public boolean distorted(LivingEntity entity, Location loc) {
		// 도시 -1309 255 1599  -884 0 1074
		if (loc.getX() <= -884 && loc.getY() <= 255 && loc.getZ() <= 1599 && 
				loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074) {

			if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "다리가 많아! 몇개야?");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(45);
				entity.setHealth(45);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.GUARDIAN) {
				entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "외눈 물고기");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(40);
				entity.setHealth(40);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "회색 인간");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(60);
				entity.setHealth(60);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "작아지는 죽음");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(40);
				entity.setHealth(40);
				Slime slime = (Slime) entity;
				slime.setSize(4);
				entity.setMaxHealth(40);
				entity.setHealth(40);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "작은 조각");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(100);
				entity.setHealth(100);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "약쟁이 소녀");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(120);
				entity.setHealth(120);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "날아오르는 다리");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(90);
				entity.setHealth(90);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "검은 인격");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(200);
				entity.setHealth(200);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ELDER_GUARDIAN) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "외눈 물고기 성체");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(300);
				entity.setHealth(300);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "녹아내리는 마음");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(250);
				entity.setHealth(250);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(3);
				entity.setMaxHealth(250);
				entity.setHealth(250);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7, false, false));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "쏘아올리는 불꽃");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(400);
				entity.setHealth(400);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "부패의 조각");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(250);
				entity.setHealth(250);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6, false, false));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(800);
				entity.setHealth(800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.GHAST) {
				entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(500);
				entity.setHealth(500);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 4, false, false));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WARDEN) {
				entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐");
				entity.setCustomNameVisible(true);
				entity.setPersistent(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(999);
				entity.setHealth(999);
				return true;
			}
		}
		return true;
	}
	
	
	
	
	
	
	public boolean antimob9(LivingEntity entity, Location loc) {
		// 원시의 땅 넘어가는 오두막 마을  1029 255 -1333  1053 0 -1362
		if (loc.getX() <= 1053 && loc.getY() <= 255 && loc.getZ() <= -1333 
				&& loc.getX() >= 1029 && loc.getY() >= 0 && loc.getZ() >= -1362) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean antimob10(LivingEntity entity, Location loc) {
		// 프렐리우드  563 94 -1611  657 94 -1495
		if (loc.getX() <= 657 && loc.getY() <= 255 && loc.getZ() <= -1495 
				&& loc.getX() >= 563 && loc.getY() >= 50 && loc.getZ() >= -1611) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE
					|| entity.getType() == (EntityType) EntityType.PIG
					|| entity.getType() == (EntityType) EntityType.MUSHROOM_COW) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob105(LivingEntity entity, Location loc) {
		// 고성 근처 부락 908 104 747  1105 40 895
		if (loc.getX() <= 1105 && loc.getY() <= 104 && loc.getZ() <= 895 && 
				loc.getX() >= 908 && loc.getY() >= 40 && loc.getZ() >= 747) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "파스칼" + ChatColor.YELLOW + " [Lv.359]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(42500);
				entity.setHealth(42500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(63, 33, 31));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(63, 33, 31));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(63, 33, 31));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 116));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CREEPER) {
				entity.setCustomName(ChatColor.GRAY + "에밀" + ChatColor.YELLOW + " [Lv.363]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(43000);
				entity.setHealth(43000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob106(LivingEntity entity, Location loc) {
		// 부락 앞 평지 819 80 774  901 50 911
		if (loc.getX() <= 901 && loc.getY() <= 80 && loc.getZ() <= 911 && 
				loc.getX() >= 819 && loc.getY() >= 50 && loc.getZ() >= 774) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.354]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(41000);
				entity.setHealth(41000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 113));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "마법소녀" + ChatColor.YELLOW + " [Lv.357]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(42000);
				entity.setHealth(42000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob107(LivingEntity entity, Location loc) {
		// 부락 근처 동굴 847 57 739  777 29 683
		if (loc.getX() <= 847 && loc.getY() <= 57 && loc.getZ() <= 739 && 
				loc.getX() >= 777 && loc.getY() >= 29 && loc.getZ() >= 683) {
			if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "진흙 요정" + ChatColor.YELLOW + " [Lv.366]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(44000);
				entity.setHealth(44000);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(2);
				entity.setMaxHealth(44000);
				entity.setHealth(44000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 118));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ITEM_FRAME
					|| entity.getType() == (EntityType) EntityType.DROPPED_ITEM
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND
					|| entity.getType() == (EntityType) EntityType.VILLAGER
					|| entity.getType() == (EntityType) EntityType.SKELETON_HORSE) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
}
