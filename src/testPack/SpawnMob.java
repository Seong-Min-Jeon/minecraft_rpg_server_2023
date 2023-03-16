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
		if (mob1(entity, loc) && mob2(entity, loc) && mob3(entity, loc) && mob4(entity, loc) && mob5(entity, loc) && mob6(entity, loc) && mob7(entity, loc)
				&& mob8(entity, loc) && mob9(entity, loc) && mob10(entity, loc) && mob11(entity, loc) && mob12(entity, loc) && mob13(entity, loc)
				&& mob14(entity, loc) && mob15(entity, loc) && mob16(entity, loc) && mob17(entity, loc) && mob18(entity, loc) && mob19(entity, loc)
				&& mob20(entity, loc) && mob21(entity, loc) && mob22(entity, loc) && mob23(entity, loc) && mob24(entity, loc) && mob25(entity, loc)
				&& mob26(entity, loc) && mob27(entity, loc) && mob28(entity, loc) && mob29(entity, loc) && mob30(entity, loc) && mob31(entity, loc)
				&& mob32(entity, loc) && mob33(entity, loc) && mob34(entity, loc) && mob35(entity, loc) && mob36(entity, loc) && mob37(entity, loc)
				&& mob38(entity, loc) && mob39(entity, loc) && mob40(entity, loc) && mob41(entity, loc) && mob42(entity, loc) && mob43(entity, loc)
				&& mob44(entity, loc) && mob45(entity, loc) && mob46(entity, loc) && mob47(entity, loc) && mob48(entity, loc) && mob49(entity, loc) && mob49_5(entity, loc) && mob49_8(entity, loc)
				&& mob50(entity, loc) && mob51(entity, loc) && mob52(entity, loc) && mob53(entity, loc) && mob54(entity, loc) && mob55(entity, loc)
				&& mob56(entity, loc) && mob57(entity, loc) && mob58(entity, loc) && mob59(entity, loc) && mob60(entity, loc) && mob61(entity, loc)
				&& mob62(entity, loc) && mob63(entity, loc) && mob64(entity, loc) && mob65(entity, loc) && mob66(entity, loc) && mob67(entity, loc)
				&& mob68(entity, loc) && mob69(entity, loc) && mob70(entity, loc) && mob71(entity, loc) && mob72(entity, loc) && mob73(entity, loc)
				&& mob74(entity, loc) && mob75(entity, loc) && mob76(entity, loc) && mob77(entity, loc) && mob78(entity, loc) && mob79(entity, loc)
				&& mob80(entity, loc) && mob81(entity, loc) && mob82(entity, loc) && mob83(entity, loc) && mob84(entity, loc) && mob85(entity, loc)
				&& mob86(entity, loc) && mob87(entity, loc) && mob88(entity, loc) && mob89(entity, loc) && mob90(entity, loc) && mob91(entity, loc)
				&& mob92(entity, loc) && mob93(entity, loc) && mob94(entity, loc) && mob95(entity, loc) && mob96(entity, loc) && mob97(entity, loc)
				&& mob98(entity, loc) && mob99(entity, loc) && mob100(entity, loc) && mob101(entity, loc) && mob102(entity, loc) && mob103(entity, loc)
				&& mob104(entity, loc) && mob105(entity, loc) && mob106(entity, loc) && mob107(entity, loc) && mob108(entity, loc) && mob109(entity, loc)
				&& mob110(entity, loc) && mob111(entity, loc) && mob112(entity, loc) && mob113(entity, loc) && mob114(entity, loc) && mob115(entity, loc)
				&& mob116(entity, loc) && mob117(entity, loc) && mob118(entity, loc) && mob119(entity, loc) && mob120(entity, loc) && mob121(entity, loc)
				&& mob122(entity, loc) && mob123(entity, loc) && mob124(entity, loc) && mob125(entity, loc) && mob126(entity, loc) && mob127(entity, loc) 
				&& mob128(entity, loc) && mob129(entity, loc) && mob130(entity, loc) && mob131(entity, loc) && mob132(entity, loc) && mob133(entity, loc)
				&& mob134(entity, loc) && mob135(entity, loc) && mob136(entity, loc) && mob137(entity, loc) && mob138(entity, loc) && mob139(entity, loc)
				&& mob140(entity, loc) && mob141(entity, loc) && mob142(entity, loc) && mob143(entity, loc) && mob144(entity, loc) && mob145(entity, loc)
				&& mob146(entity, loc) && mob147(entity, loc) && mob148(entity, loc) && mob149(entity, loc) && mob150(entity, loc) && mob151(entity, loc)
				&& mob152(entity, loc) && mob153(entity, loc) && mob154(entity, loc) && mob155(entity, loc) && mob156(entity, loc) && mob157(entity, loc)
				&& mob158(entity, loc) && mob159(entity, loc) && mob160(entity, loc) && mob161(entity, loc) && mob162(entity, loc) && mob163(entity, loc)
				&& mob164(entity, loc) && mob165(entity, loc) && mob166(entity, loc) && mob167(entity, loc) && mob168(entity, loc) && mob169(entity, loc)
				&& mob170(entity, loc) && mob171(entity, loc) && mob172(entity, loc) && mob173(entity, loc) && mob174(entity, loc) && mob175(entity, loc)
				&& mob176(entity, loc) && mob177(entity, loc) && mob178(entity, loc) && mob179(entity, loc) && mob180(entity, loc) && mob181(entity, loc)
				&& mob182(entity, loc) && mob183(entity, loc) && mob184(entity, loc) && mob185(entity, loc) && mob186(entity, loc) && mob187(entity, loc)
				&& mob188(entity, loc) && mob189(entity, loc) && mob190(entity, loc) && mob191(entity, loc) && mob192(entity, loc) && mob193(entity, loc)
				&& mob194(entity, loc) && mob195(entity, loc) && mob196(entity, loc) && mob197(entity, loc) && mob198(entity, loc) && mob199(entity, loc)
				&& mob200(entity, loc) && mob201(entity, loc) && mob202(entity, loc) && mob203(entity, loc) && mob204(entity, loc) && mob205(entity, loc)
				&& mob206(entity, loc) && mob207(entity, loc) && mob208(entity, loc) && mob209(entity, loc) && mob210(entity, loc) && mob211(entity, loc)
				&& mob212(entity, loc) && mob213(entity, loc) && mob214(entity, loc) && mob215(entity, loc) && mob216(entity, loc) && mob217(entity, loc)
				&& mob218(entity, loc) && mob219(entity, loc) && mob220(entity, loc) && mob221(entity, loc) && mob222(entity, loc) && mob223(entity, loc)
				&& mob224(entity, loc) && mob225(entity, loc) && mob226(entity, loc) && mob227(entity, loc) && mob228(entity, loc) && mob229(entity, loc)
				&& mob230(entity, loc) && mob231(entity, loc) && mob232(entity, loc) && mob233(entity, loc) && mob234(entity, loc) && mob235(entity, loc)
				&& mob236(entity, loc) && mob237(entity, loc) && mob238(entity, loc) && mob239(entity, loc) && mob240(entity, loc) && mob241(entity, loc)
				&& mob242(entity, loc) && mob243(entity, loc) && mob244(entity, loc) && mob245(entity, loc) && mob246(entity, loc) && mob247(entity, loc)
				&& antimob1(entity, loc) && antimob2(entity, loc) && antimob3(entity, loc) && antimob4(entity, loc) && antimob5(entity, loc)
				&& antimob6(entity, loc) && antimob7(entity, loc) && antimob8(entity, loc) && antimob9(entity, loc) && antimob10(entity, loc)) {
			return true;
		}
		return false;
	}

	public boolean antimob1(LivingEntity entity, Location loc) {
		// 숲의 유적 근처 -2094 80 2471 -2033 30 2436
		if (loc.getX() <= -2033 && loc.getY() <= 180
				&& loc.getZ() <= 2471 && loc.getX() >= -2094
				&& loc.getY() >= 30 && loc.getZ() >= 2436) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean antimob2(LivingEntity entity, Location loc) {
		// 콘노 근처 -2428 95 584 -2515 45 494
		if (loc.getX() <= -2428 && loc.getY() <= 95
				&& loc.getZ() <= 584 && loc.getX() >= -2515
				&& loc.getY() >= 45 && loc.getZ() >= 494) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
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

	public boolean antimob3(LivingEntity entity, Location loc) {
		// 아란모어 정찰캠프 -2414 70 718 -2477 118 777
		if (loc.getX() <= -2414 && loc.getY() <= 118
				&& loc.getZ() <= 777 && loc.getX() >= -2477
				&& loc.getY() >= 70 && loc.getZ() >= 718) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
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
	
	public boolean antimob4(LivingEntity entity, Location loc) {
		// 크레드라트 -113 200 136  2 46 35
		if (loc.getX() <= 2 && loc.getY() <= 200
				&& loc.getZ() <= 136 && loc.getX() >= -113
				&& loc.getY() >= 46 && loc.getZ() >= 35) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
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
	
	public boolean antimob5(LivingEntity entity, Location loc) {
		// 베아그 18 153 -253  155 86 -349
		if (loc.getX() <= 155 && loc.getY() <= 153
				&& loc.getZ() <= -253 && loc.getX() >= 18
				&& loc.getY() >= 79 && loc.getZ() >= -349) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
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
	
	public boolean antimob6(LivingEntity entity, Location loc) {
		// 마법탑  230 105 698  192 78 756    
		if (loc.getX() <= 230 && loc.getY() <= 105 && loc.getZ() <= 756 
				&& loc.getX() >= 192 && loc.getY() >= 78 && loc.getZ() >= 698) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
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
	
	public boolean antimob7(LivingEntity entity, Location loc) {
		// 마법탑 근처 히든 285 70 750  345 47 782
		if (loc.getX() <= 345 && loc.getY() <= 70 && loc.getZ() <= 782 
				&& loc.getX() >= 285 && loc.getY() >= 47 && loc.getZ() >= 750) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
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
	
	public boolean antimob8(LivingEntity entity, Location loc) {
		// 사막 채석장 -23 255 1427  -162 0 1529
		if (loc.getX() <= -23 && loc.getY() <= 255 && loc.getZ() <= 1529 
				&& loc.getX() >= -162 && loc.getY() >= 0 && loc.getZ() >= 1427) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				return false;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
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

	public boolean mob1(LivingEntity entity, Location loc) {
		// 공격을 모르는 스켈이 3974 173 3847  3924 160 3870
		if (loc.getX() <= 3974 && loc.getY() <= 173
				&& loc.getZ() <= 3870 && loc.getX() >= 3924
				&& loc.getY() >= 160 && loc.getZ() >= 3847) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "공격을 모르는 스켈이" + ChatColor.YELLOW + " [Lv.0]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1);
				entity.setHealth(1);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.BOW);
				head.setHelmet(headItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 32700));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob2(LivingEntity entity, Location loc) {
		// 초록 슬라임 -1881 54 3069 -1834 53 3106
		if (loc.getX() <= -1833 && loc.getY() <= 60
				&& loc.getZ() <= 3107 && loc.getX() >= -1882
				&& loc.getY() >= 50 && loc.getZ() >= 3068) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "초록 슬라임" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8);
				entity.setHealth(8);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob3(LivingEntity entity, Location loc) {
		// 해안가 좀비1 -1887 56 2986 -1946 45 3068
		if (loc.getX() <= -1887 && loc.getY() <= 56
				&& loc.getZ() <= 3068 && loc.getX() >= -1946
				&& loc.getY() >= 45 && loc.getZ() >= 2986) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "해안가 좀비" + ChatColor.YELLOW + " [Lv.6]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18);
				entity.setHealth(18);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob4(LivingEntity entity, Location loc) {
		// 일단 안씀
		// 해안가 좀비2 -1929 55 3016 -1966 45 3060
		if (loc.getX() <= -1929 && loc.getY() <= 55
				&& loc.getZ() <= 3060 && loc.getX() >= -1966
				&& loc.getY() >= 45 && loc.getZ() >= 3016) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "해안가 좀비" + ChatColor.YELLOW + " [Lv.6]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18);
				entity.setHealth(18);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob5(LivingEntity entity, Location loc) {
		// 워그닐에 배신당한 자 -1820 50 3061 -1786 57 3094
		if (loc.getX() <= -1786 && loc.getY() <= 57
				&& loc.getZ() <= 3094 && loc.getX() >= -1820
				&& loc.getY() >= 50 && loc.getZ() >= 3061) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "워그닐에 배신당한 자" + ChatColor.YELLOW + " [Lv.13]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob6(LivingEntity entity, Location loc) {
		// 검은 수염 하수인 & 검은 수염 간부 -1960 60 2954 -1980 52 2947
		if (loc.getX() <= -1960 && loc.getY() <= 60
				&& loc.getZ() <= 2954 && loc.getX() >= -1980
				&& loc.getY() >= 52 && loc.getZ() >= 2947) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "검은 수염 하수인" + ChatColor.YELLOW + " [Lv.32]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150);
				entity.setHealth(150);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "검은 수염 간부" + ChatColor.YELLOW + " [Lv.40]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(230);
				entity.setHealth(230);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob7(LivingEntity entity, Location loc) {
		// 포레스트 고스트 -1870 45 2694 -1925 80 2635
		if (loc.getX() <= -1870 && loc.getY() <= 80
				&& loc.getZ() <= 2694 && loc.getX() >= -1925
				&& loc.getY() >= 45 && loc.getZ() >= 2635) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "포레스트 고스트" + ChatColor.YELLOW + " [Lv.15]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(35);
				entity.setHealth(35);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(150, 250, 250));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob8(LivingEntity entity, Location loc) {
		// 크리스탈 워리어 -1938 77 2617 -1882 56 2596
		if (loc.getX() <= -1882 && loc.getY() <= 77
				&& loc.getZ() <= 2617 && loc.getX() >= -1938
				&& loc.getY() >= 45 && loc.getZ() >= 2596) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "크리스탈 워리어" + ChatColor.YELLOW + " [Lv.18]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(50);
				entity.setHealth(50);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob9(LivingEntity entity, Location loc) {
		// 저주받은 나무 요정 -1822 58 2570 -1788 62 2535
		if (loc.getX() <= -1788 && loc.getY() <= 65
				&& loc.getZ() <= 2570 && loc.getX() >= -1822
				&& loc.getY() >= 50 && loc.getZ() >= 2535) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "저주받은 나무 요정" + ChatColor.YELLOW + " [Lv.20]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(60);
				entity.setHealth(60);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob10(LivingEntity entity, Location loc) {
		// 산호 정령 && 산호 스트레이 3768 19 3789 3737 9 3760
		if (loc.getX() <= 3768 && loc.getY() <= 19
				&& loc.getZ() <= 3789 && loc.getX() >= 3737
				&& loc.getY() >= 9 && loc.getZ() >= 3760) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "산호 정령" + ChatColor.YELLOW + " [Lv.12]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20);
				entity.setHealth(20);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.FIRE_CORAL);
				head.setHelmet(headItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "산호 스트레이" + ChatColor.YELLOW + " [Lv.16]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob11(LivingEntity entity, Location loc) {
		// 거북 병사 3703 20 3765 3713 15 3756
		if (loc.getX() <= 3713 && loc.getY() <= 23
				&& loc.getZ() <= 3765 && loc.getX() >= 3703
				&& loc.getY() >= 15 && loc.getZ() >= 3756) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "거북 병사" + ChatColor.YELLOW + " [Lv.15]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20);
				entity.setHealth(20);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob12(LivingEntity entity, Location loc) {
		// 엘더 가디언, 가디언 3646 16 3793 3618 6 3765
		if (loc.getX() <= 3646 && loc.getY() <= 16
				&& loc.getZ() <= 3793 && loc.getX() >= 3618
				&& loc.getY() >= 6 && loc.getZ() >= 3765) {
			if (entity.getType() == (EntityType) EntityType.GUARDIAN) {
				entity.setCustomName(ChatColor.GRAY + "가디언" + ChatColor.YELLOW + " [Lv.12]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ELDER_GUARDIAN) {
				entity.setCustomName(ChatColor.GRAY + "엘더 가디언" + ChatColor.YELLOW + " [Lv.19]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(50);
				entity.setHealth(50);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob13(LivingEntity entity, Location loc) {
		// 침략자 -1830 63 2472 -1964 54 2324
		if (loc.getX() <= -1830 && loc.getY() <= 100
				&& loc.getZ() <= 2472 && loc.getX() >= -1964
				&& loc.getY() >= 40 && loc.getZ() >= 2324) {
			if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GRAY + "침략자" + ChatColor.YELLOW + " [Lv.24]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80);
				entity.setHealth(80);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.COBBLESTONE_WALL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.EVOKER) {
				entity.setCustomName(ChatColor.GRAY + "침략자" + ChatColor.YELLOW + " [Lv.24]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(110);
				entity.setHealth(110);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob14(LivingEntity entity, Location loc) {
		// 센 마그 평원 -1753 83 2410 -1436 117 1983
		if (loc.getX() <= -1436 && loc.getY() <= 200
				&& loc.getZ() <= 2410 && loc.getX() >= -1753
				&& loc.getY() >= 40 && loc.getZ() >= 1983) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "고블린" + ChatColor.YELLOW + " [Lv.47]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(280);
				entity.setHealth(280);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "파르홀론의 망자" + ChatColor.YELLOW + " [Lv.50]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(350);
				entity.setHealth(350);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "파르홀론의 유령" + ChatColor.YELLOW + " [Lv.58]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(370);
				entity.setHealth(370);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("12");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "변이된 곰" + ChatColor.YELLOW + " [Lv.62]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(380);
				entity.setHealth(380);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 16));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob15(LivingEntity entity, Location loc) {
		// 포르간 서쪽 숲 -1936 85 2686 -2143 82 2444
		if (loc.getX() <= -1936 && loc.getY() <= 100
				&& loc.getZ() <= 2686 && loc.getX() >= -2143
				&& loc.getY() >= 30 && loc.getZ() >= 2444) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "숲의 황소" + ChatColor.YELLOW + " [Lv.34]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150);
				entity.setHealth(150);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "숲의 마녀" + ChatColor.YELLOW + " [Lv.31]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(130);
				entity.setHealth(130);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.ARMOR_STAND) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob16(LivingEntity entity, Location loc) {
		// 산적 -1913 58 2354 -2121 53 2271
		if (loc.getX() <= -1913 && loc.getY() <= 100
				&& loc.getZ() <= 2354 && loc.getX() >= -2121
				&& loc.getY() >= 30 && loc.getZ() >= 2271) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산적" + ChatColor.YELLOW + " [Lv.27]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100);
				entity.setHealth(100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(5, 60, 20));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(5, 60, 20));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(5, 60, 20));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob17(LivingEntity entity, Location loc) {
		// 숲의 유적 던전 3532 29 3773 3447 10 3690
		if (loc.getX() <= 3532 && loc.getY() <= 30
				&& loc.getZ() <= 3773 && loc.getX() >= 3447
				&& loc.getY() >= 10 && loc.getZ() >= 3690) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "변이된 나뭇잎" + ChatColor.YELLOW + " [Lv.35]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100);
				entity.setHealth(100);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(50, 200, 50));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(50, 200, 50));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(50, 200, 50));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 모험가" + ChatColor.YELLOW + " [Lv.38]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(120);
				entity.setHealth(120);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.WOODEN_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob18(LivingEntity entity, Location loc) {
		// 유적의 주인 3537 0 3685  3587 57 3737
		if (loc.getX() <= 3587 && loc.getY() <= 57 && loc.getZ() <= 3737 
				&& loc.getX() >= 3537 && loc.getY() >= 0 && loc.getZ() >= 3685) {
			if (entity.getType() == (EntityType) EntityType.GHAST) {
				entity.setCustomName(ChatColor.GRAY + "유적의 주인" + ChatColor.YELLOW + " [Lv.43]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600);
				entity.setHealth(600);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob19(LivingEntity entity, Location loc) {
		// 평원2 -1436 50 1812 -804 90 2464
		if (loc.getX() <= -804 && loc.getY() <= 90
				&& loc.getZ() <= 2464 && loc.getX() >= -1436
				&& loc.getY() >= 50 && loc.getZ() >= 1812) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "오크" + ChatColor.YELLOW + " [Lv.60]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(420);
				entity.setHealth(420);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(10, 150, 10));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(10, 150, 10));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(10, 150, 10));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 17));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미래를 예지하는 눈" + ChatColor.YELLOW + " [Lv.66]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500);
				entity.setHealth(500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("16");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chest = entity.getEquipment();
				ItemStack chestItem = new ItemStack(Material.AIR);
				chest.setChestplate(chestItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "검은 인간" + ChatColor.YELLOW + " [Lv.72]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(800);
				entity.setHealth(800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 21));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 정찰병" + ChatColor.YELLOW + " [Lv.80]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000);
				entity.setHealth(1000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 25));
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

	public boolean mob20(LivingEntity entity, Location loc) {
		// 파르홀론의 유적 -1096 42 2365 -1027 3 2246
		if (loc.getX() <= -1027 && loc.getY() <= 42
				&& loc.getZ() <= 2365 && loc.getX() >= -1096
				&& loc.getY() >= 3 && loc.getZ() >= 2246) {
			if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "유적을 지키는 거미" + ChatColor.YELLOW + " [Lv.100]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 32));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "파르홀론의 수호자" + ChatColor.YELLOW + " [Lv.113]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment shield = entity.getEquipment();
				ItemStack shieldItem = new ItemStack(Material.SHIELD);
				shield.setItemInOffHand(shieldItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob21(LivingEntity entity, Location loc) {
		// 티르 해안가 -642 52 1993 -568 52 1881
		if (loc.getX() <= -568 && loc.getY() <= 60
				&& loc.getZ() <= 1993 && loc.getX() >= -642
				&& loc.getY() >= 40 && loc.getZ() >= 1881) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "외눈의 포보르" + ChatColor.YELLOW + " [Lv.83]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1300);
				entity.setHealth(1300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 30));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob22(LivingEntity entity, Location loc) {
		// 광산던전 3481 31 3837 3603 5 3976
		if (loc.getX() <= 3603 && loc.getY() <= 31
				&& loc.getZ() <= 3976 && loc.getX() >= 3481
				&& loc.getY() >= 5 && loc.getZ() >= 3837) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "좀비" + ChatColor.YELLOW + " [Lv.120]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3100);
				entity.setHealth(3100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "스켈레톤" + ChatColor.YELLOW + " [Lv.124]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3300);
				entity.setHealth(3300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("40");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BOW);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "거미" + ChatColor.YELLOW + " [Lv.115]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2600);
				entity.setHealth(2600);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 35));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob23(LivingEntity entity, Location loc) {
		// 티르 북쪽 평원 -712 88 1562 -1051 40 1800
		if (loc.getX() <= -712 && loc.getY() <= 88
				&& loc.getZ() <= 1800 && loc.getX() >= -1051
				&& loc.getY() >= 40 && loc.getZ() >= 1562) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.96]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2000);
				entity.setHealth(2000);
				int p = rnd.nextInt(5);
				if (p < 2) {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("34");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
				} else {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BEDROCK);
					weapon.setItemInMainHand(weaponItem);
				}
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 36));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob24(LivingEntity entity, Location loc) {
		// 시드 광산 전에 동굴 -1049 39 1804 -930 3 1966
		if (loc.getX() <= -930 && loc.getY() <= 39
				&& loc.getZ() <= 1966 && loc.getX() >= -1049
				&& loc.getY() >= 3 && loc.getZ() >= 1804) {
			if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "동굴 거미" + ChatColor.YELLOW + " [Lv.134]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2000);
				entity.setHealth(2000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "동굴 벌레" + ChatColor.YELLOW + " [Lv.140]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2400);
				entity.setHealth(2400);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 30));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob25(LivingEntity entity, Location loc) {
		// 미푀르유 가는 길 -499 86 1542 -719 35 1387
		if (loc.getX() <= -499 && loc.getY() <= 89
				&& loc.getZ() <= 1542 && loc.getX() >= -719
				&& loc.getY() >= 35 && loc.getZ() >= 1387) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "아랑" + ChatColor.YELLOW + " [Lv.127]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 39));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "머라우더" + ChatColor.YELLOW + " [Lv.135]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob26(LivingEntity entity, Location loc) {
		// 미푀르유 가는 길 해안 동굴 -538 34 1487 -610 10 1541
		if (loc.getX() <= -538 && loc.getY() <= 34
				&& loc.getZ() <= 1541 && loc.getX() >= -610
				&& loc.getY() >= 10 && loc.getZ() >= 1487) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "파르홀론의 전투병" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 70));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob27(LivingEntity entity, Location loc) {
		// 미푀르유 가는 길 동굴 -970 55 1575 -1020 32 1653
		if (loc.getX() <= -970 && loc.getY() <= 55
				&& loc.getZ() <= 1653 && loc.getX() >= -1020
				&& loc.getY() >= 32 && loc.getZ() >= 1575) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.150]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3300);
				entity.setHealth(3300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob28(LivingEntity entity, Location loc) {
		// 미푀르유1 -919 59 1291 -997 109 1465
		if (loc.getX() <= -919 && loc.getY() <= 109
				&& loc.getZ() <= 1465 && loc.getX() >= -997
				&& loc.getY() >= 59 && loc.getZ() >= 1291) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "분노의 형상" + ChatColor.YELLOW + " [Lv.158]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3500);
				entity.setHealth(3500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 46));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "공허의 형상" + ChatColor.YELLOW + " [Lv.160]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3700);
				entity.setHealth(3700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 47));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "고통의 형상" + ChatColor.YELLOW + " [Lv.163]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob29(LivingEntity entity, Location loc) {
		// 미푀르유2 -962 59 1289 -1030 109 1203
		if (loc.getX() <= -962 && loc.getY() <= 109
				&& loc.getZ() <= 1289 && loc.getX() >= -1030
				&& loc.getY() >= 59 && loc.getZ() >= 1203) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "침묵의 형상" + ChatColor.YELLOW + " [Lv.165]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3850);
				entity.setHealth(3850);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 48));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "우울의 형상" + ChatColor.YELLOW + " [Lv.168]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3900);
				entity.setHealth(3900);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 49));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "허몽의 형상" + ChatColor.YELLOW + " [Lv.171]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob30(LivingEntity entity, Location loc) {
		// 미푀르유3 -1005 58 1204 -1116 105 1095
		if (loc.getX() <= -1005 && loc.getY() <= 109
				&& loc.getZ() <= 1204 && loc.getX() >= -1116
				&& loc.getY() >= 59 && loc.getZ() >= 1095) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "오만의 형상" + ChatColor.YELLOW + " [Lv.178]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4100);
				entity.setHealth(4100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "배신의 형상" + ChatColor.YELLOW + " [Lv.174]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4200);
				entity.setHealth(4200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 53));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob31(LivingEntity entity, Location loc) {
		// 미푀르유4 -1118 58 1140 -1182 105 1312
		if (loc.getX() <= -1118 && loc.getY() <= 109
				&& loc.getZ() <= 1312 && loc.getX() >= -1182
				&& loc.getY() >= 59 && loc.getZ() >= 1140) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "분노의 형상" + ChatColor.YELLOW + " [Lv.158]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3500);
				entity.setHealth(3500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 46));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "공허의 형상" + ChatColor.YELLOW + " [Lv.160]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3700);
				entity.setHealth(3700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 47));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "고통의 형상" + ChatColor.YELLOW + " [Lv.163]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob32(LivingEntity entity, Location loc) {
		// 미푀르유5 -1187 58 1273 -1233 105 1460
		if (loc.getX() <= -1187 && loc.getY() <= 109
				&& loc.getZ() <= 1460 && loc.getX() >= -1233
				&& loc.getY() >= 59 && loc.getZ() >= 1273) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "침묵의 형상" + ChatColor.YELLOW + " [Lv.165]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3850);
				entity.setHealth(3850);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 48));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "우울의 형상" + ChatColor.YELLOW + " [Lv.168]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3900);
				entity.setHealth(3900);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 49));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "허몽의 형상" + ChatColor.YELLOW + " [Lv.171]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob33(LivingEntity entity, Location loc) {
		// 미푀르유6 -1234 58 1460 -1290 102 1311
		if (loc.getX() <= -1234 && loc.getY() <= 109
				&& loc.getZ() <= 1460 && loc.getX() >= -1290
				&& loc.getY() >= 59 && loc.getZ() >= 1311) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "오만의 형상" + ChatColor.YELLOW + " [Lv.178]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4100);
				entity.setHealth(4100);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "배신의 형상" + ChatColor.YELLOW + " [Lv.174]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4200);
				entity.setHealth(4200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 53));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob34(LivingEntity entity, Location loc) {
		// 미푀르유 시련 -1079 196 1439 -1099 183 1468
		if (loc.getX() <= -1079 && loc.getY() <= 196
				&& loc.getZ() <= 1468 && loc.getX() >= -1099
				&& loc.getY() >= 180 && loc.getZ() >= 1439) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "시련의 형상" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob35(LivingEntity entity, Location loc) {
		// 미푀르유 묘지 -750 95 1380 -646 55 1277
		if (loc.getX() <= -646 && loc.getY() <= 95
				&& loc.getZ() <= 1380 && loc.getX() >= -750
				&& loc.getY() >= 55 && loc.getZ() >= 1277) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "귀웅" + ChatColor.YELLOW + " [Lv.148]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3400);
				entity.setHealth(3400);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 44));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "대사" + ChatColor.YELLOW + " [Lv.157]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800);
				entity.setHealth(3800);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob36(LivingEntity entity, Location loc) {
		// 계곡 -1314 48 2082 -1579 0 1745
		if (loc.getX() <= -1314 && loc.getY() <= 48
				&& loc.getZ() <= 2082 && loc.getX() >= -1579
				&& loc.getY() >= 0 && loc.getZ() >= 1745) {
			if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "영혼을 탐하는 요정" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 60));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "딥슬라임" + ChatColor.YELLOW + " [Lv.194]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob37(LivingEntity entity, Location loc) {
		// 미푀르유 동쪽 부근 -685 56 1274 -946 160 924
		if (loc.getX() <= -685 && loc.getY() <= 160
				&& loc.getZ() <= 1274 && loc.getX() >= -946
				&& loc.getY() >= 56 && loc.getZ() >= 924) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "워리어" + ChatColor.YELLOW + " [Lv.184]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4500);
				entity.setHealth(4500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 54));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "빈디케이터" + ChatColor.YELLOW + " [Lv.190]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4700);
				entity.setHealth(4700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "저거너트" + ChatColor.YELLOW + " [Lv.198]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4900);
				entity.setHealth(4900);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 56));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "유서퍼" + ChatColor.YELLOW + " [Lv.203]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5200);
				entity.setHealth(5200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob38(LivingEntity entity, Location loc) {
		// 미푀르유 북쪽 -960 75 990 -1277 45 871
		if (loc.getX() <= -960 && loc.getY() <= 75
				&& loc.getZ() <= 990 && loc.getX() >= -1277
				&& loc.getY() >= 45 && loc.getZ() >= 871) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "뒤틀린 역사의 흔적" + ChatColor.YELLOW + " [Lv.211]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5700);
				entity.setHealth(5700);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 60));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "아공간 파수꾼" + ChatColor.YELLOW + " [Lv.218]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob39(LivingEntity entity, Location loc) {
		// 미푀르유 서쪽1 -1323 83 1105 -1639 114 1513
		if (loc.getX() <= -1323 && loc.getY() <= 100
				&& loc.getZ() <= 1513 && loc.getX() >= -1639
				&& loc.getY() >= 35 && loc.getZ() >= 1105) {
			if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "조난당한 영혼" + ChatColor.YELLOW + " [Lv.201]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5300);
				entity.setHealth(5300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("57");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "익사당한 선원" + ChatColor.YELLOW + " [Lv.205]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 128, 128));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 128, 128));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 128, 128));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob40(LivingEntity entity, Location loc) {
		// 미푀르유 서쪽2 -1200 100 1142 -1420 40 1235
		if (loc.getX() <= -1200 && loc.getY() <= 100
				&& loc.getZ() <= 1235 && loc.getX() >= -1420
				&& loc.getY() >= 40 && loc.getZ() >= 1142) {
			if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "조난당한 영혼" + ChatColor.YELLOW + " [Lv.201]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5300);
				entity.setHealth(5300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("57");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "익사당한 선원" + ChatColor.YELLOW + " [Lv.205]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 128, 128));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 128, 128));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 128, 128));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob41(LivingEntity entity, Location loc) {
		// 카이만 북쪽1 -684 99 1007 -360 45 1225
		if (loc.getX() <= -360 && loc.getY() <= 100
				&& loc.getZ() <= 1225 && loc.getX() >= -684
				&& loc.getY() >= 45 && loc.getZ() >= 1007) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "수라" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "나찰" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "나호" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "나섬" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob42(LivingEntity entity, Location loc) {
		// 티르 북쪽 -726 79 1819 -539 79 1612
		if (loc.getX() <= -539 && loc.getY() <= 88
				&& loc.getZ() <= 1819 && loc.getX() >= -726
				&& loc.getY() >= 40 && loc.getZ() >= 1612) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.96]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				int p = rnd.nextInt(5);
				if (p < 2) {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("34");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
				} else {
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BEDROCK);
					weapon.setItemInMainHand(weaponItem);
				}
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 36));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob43(LivingEntity entity, Location loc) {
		// 카이만 가는 길 -560 63 1376 -429 76 1571
		if (loc.getX() <= -429 && loc.getY() <= 80
				&& loc.getZ() <= 1571 && loc.getX() >= -560
				&& loc.getY() >= 40 && loc.getZ() >= 1376) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "아랑" + ChatColor.YELLOW + " [Lv.127]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2800);
				entity.setHealth(2800);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 39));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "머라우더" + ChatColor.YELLOW + " [Lv.135]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob44(LivingEntity entity, Location loc) {
		// 카이만 북쪽2 -356 40 1238 48 98 1136
		if (loc.getX() <= 48 && loc.getY() <= 98
				&& loc.getZ() <= 1238 && loc.getX() >= -356
				&& loc.getY() >= 40 && loc.getZ() >= 1136) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "수라" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "나찰" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "나호" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "나섬" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob45(LivingEntity entity, Location loc) {
		// 카이만 북쪽3 67 98 1132 -72 40 1010
		if (loc.getX() <= 67 && loc.getY() <= 98
				&& loc.getZ() <= 1132 && loc.getX() >= -72
				&& loc.getY() >= 40 && loc.getZ() >= 1010) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "수라" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "나찰" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "나호" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "나섬" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob46(LivingEntity entity, Location loc) {
		// 카이만 북쪽4 -382 69 1001 -497 106 888
		if (loc.getX() <= -382 && loc.getY() <= 106
				&& loc.getZ() <= 1001 && loc.getX() >= -497
				&& loc.getY() >= 40 && loc.getZ() >= 888) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "수라" + ChatColor.YELLOW + " [Lv.212]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5800);
				entity.setHealth(5800);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("70");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 61));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "나찰" + ChatColor.YELLOW + " [Lv.216]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6000);
				entity.setHealth(6000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "나호" + ChatColor.YELLOW + " [Lv.222]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "나섬" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6600);
				entity.setHealth(6600);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob47(LivingEntity entity, Location loc) {
		// 데빌 포탈 -532 60 990 -658 90 852
		if (loc.getX() <= -532 && loc.getY() <= 90
				&& loc.getZ() <= 990 && loc.getX() >= -658
				&& loc.getY() >= 60 && loc.getZ() >= 852) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "데빌 보초병" + ChatColor.YELLOW + " [Lv.243]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 69));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "데빌 병사" + ChatColor.YELLOW + " [Lv.250]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 71));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "데빌 분대장" + ChatColor.YELLOW + " [Lv.260]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob48(LivingEntity entity, Location loc) {
		// 중반 계곡 -49 104 791 -336 10 1130
		if (loc.getX() <= -49 && loc.getY() <= 150
				&& loc.getZ() <= 1130 && loc.getX() >= -336
				&& loc.getY() >= 10 && loc.getZ() >= 791) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "묘지기의 신직" + ChatColor.YELLOW + " [Lv.226]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6300);
				entity.setHealth(6300);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 63));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "묘지기의 사령관" + ChatColor.YELLOW + " [Lv.231]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6700);
				entity.setHealth(6700);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 64));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "묘지기의 영술사" + ChatColor.YELLOW + " [Lv.236]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(7000);
				entity.setHealth(7000);
				Husk zombie = (Husk) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "묘지기의 이능자" + ChatColor.YELLOW + " [Lv.245]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 68));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob49(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 입구 3707 60 3482 3788 30 3296
		if (loc.getX() <= 3788 && loc.getY() <= 60
				&& loc.getZ() <= 3482 && loc.getX() >= 3707
				&& loc.getY() >= 30 && loc.getZ() >= 3296) {
			if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "보초를 서는 요정" + ChatColor.YELLOW + " [Lv.183]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "공격대 요정" + ChatColor.YELLOW + " [Lv.187]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BEDROCK);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 56));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob49_5(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 엘리베이터 3687 36 3441  3715 19 3429
		if (loc.getX() <= 3715 && loc.getY() <= 36
				&& loc.getZ() <= 3441 && loc.getX() >= 3687
				&& loc.getY() >= 19 && loc.getZ() >= 3429) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "지키는 요정" + ChatColor.YELLOW + " [Lv.190]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
	public boolean mob49_8(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 2층  3688 53 3448  3708 44 3466
		if (loc.getX() <= 3708 && loc.getY() <= 53
				&& loc.getZ() <= 3466 && loc.getX() >= 3688
				&& loc.getY() >= 44 && loc.getZ() >= 3448) {
			if (entity.getType() == (EntityType) EntityType.LLAMA) {
				entity.setCustomName(ChatColor.GRAY + "돌리" + ChatColor.YELLOW + " [Lv.190]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob50(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 3755 84 3430 3736 74 3461
		if (loc.getX() <= 3755 && loc.getY() <= 84
				&& loc.getZ() <= 3461 && loc.getX() >= 3736
				&& loc.getY() >= 74 && loc.getZ() >= 3430) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "불의 요정" + ChatColor.YELLOW + " [Lv.192]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5200);
				entity.setHealth(5200);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 57));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.PHANTOM) {
				entity.setCustomName(ChatColor.GRAY + "요정의 소환수" + ChatColor.YELLOW + " [Lv.194]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500);
				entity.setHealth(5500);
				Phantom zombie = (Phantom) entity;
				zombie.setSize(5);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 58));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER) {
				entity.setCustomName(ChatColor.GRAY + "거대 요정" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob51(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 보스방1 3770 76 3471 3775 78 3482
		if (loc.getX() <= 3775 && loc.getY() <= 78
				&& loc.getZ() <= 3482 && loc.getX() >= 3770
				&& loc.getY() >= 76 && loc.getZ() >= 3471) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "요정왕 오베론" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(35000);
				entity.setHealth(35000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NETHERITE_AXE);
				ItemMeta mobBowIm = mobBowItem.getItemMeta();
				mobBowIm.setCustomModelData(1);
				mobBowItem.setItemMeta(mobBowIm);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.WITHER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob52(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 보스방2 3775 76 3471 3780 78 3482
		if (loc.getX() <= 3780 && loc.getY() <= 78
				&& loc.getZ() <= 3482 && loc.getX() >= 3775
				&& loc.getY() >= 76 && loc.getZ() >= 3471) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "요정여왕 티타니아" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(35000);
				entity.setHealth(35000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.CYAN_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NETHERITE_AXE);
				ItemMeta mobBowIm = mobBowItem.getItemMeta();
				mobBowIm.setCustomModelData(1);
				mobBowItem.setItemMeta(mobBowIm);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.WITHER) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob53(LivingEntity entity, Location loc) {
		// 타락한 요정 왕국 보스방 3754 90 3497 3797 75 3456
		if (loc.getX() <= 3797 && loc.getY() <= 90
				&& loc.getZ() <= 3497 && loc.getX() >= 3754
				&& loc.getY() >= 75 && loc.getZ() >= 3456) {
			if (entity.getType() == (EntityType) EntityType.WITHER) {
				entity.setCustomName(ChatColor.GRAY + "거대 요정" + ChatColor.YELLOW + " [Lv.200]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 62));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM
					|| entity.getType() == (EntityType) EntityType.SALMON
					|| entity.getType() == (EntityType) EntityType.SKELETON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean mob54(LivingEntity entity, Location loc) {
		// 아란모어 -1789 200 931 -2964 30 443
		if (loc.getX() <= -1789 && loc.getY() <= 200
				&& loc.getZ() <= 931 && loc.getX() >= -2964
				&& loc.getY() >= 30 && loc.getZ() >= 443) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				entity.setCustomName(ChatColor.GRAY + "나비" + ChatColor.YELLOW + " [Lv.254]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				PolarBear zombie = (PolarBear) entity;
				int tmp = rnd.nextInt(2);
				if (tmp == 0) {
					zombie.setBaby();
				} else {
					zombie.setAdult();
				}
				zombie.setAware(true);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "설원 정찰자" + ChatColor.YELLOW + " [Lv.217]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.CYAN_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 68));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "설원 정찰자" + ChatColor.YELLOW + " [Lv.224]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000);
				entity.setHealth(10000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("70");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "설원 정찰자" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BLACK_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 71));
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

	public boolean mob55(LivingEntity entity, Location loc) {
		// 설원 동굴 입구
		if (loc.getX() <= 3832 && loc.getY() <= 42
				&& loc.getZ() <= 3242 && loc.getX() >= 3769
				&& loc.getY() >= 8 && loc.getZ() >= 3179) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 보병" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 72));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 궁병" + ChatColor.YELLOW + " [Lv.230]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(13000);
				entity.setHealth(13000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("72");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob56(LivingEntity entity, Location loc) {
		// 설원 동굴 아래 3753 62 3182  3639 12 3232
		if (loc.getX() <= 3753 && loc.getY() <= 62
				&& loc.getZ() <= 3232 && loc.getX() >= 3639
				&& loc.getY() >= 12 && loc.getZ() >= 3182) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 보병" + ChatColor.YELLOW + " [Lv.232]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(13000);
				entity.setHealth(13000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 72));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 궁병" + ChatColor.YELLOW + " [Lv.232]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(14000);
				entity.setHealth(14000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("72");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob57(LivingEntity entity, Location loc) {
		// 설원 동굴 위 3749 91 3225  3644 70 3184
		if (loc.getX() <= 3749 && loc.getY() <= 91
				&& loc.getZ() <= 3225 && loc.getX() >= 3644
				&& loc.getY() >= 70 && loc.getZ() >= 3184) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 보병" + ChatColor.YELLOW + " [Lv.238]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(14000);
				entity.setHealth(14000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 73));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "발로르의 궁병" + ChatColor.YELLOW + " [Lv.238]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("74");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob58(LivingEntity entity, Location loc) {
		// 설원 동굴 중간 보스
		if (loc.getX() <= 3792 && loc.getY() <= 70
				&& loc.getZ() <= 3216 && loc.getX() >= 3790
				&& loc.getY() >= 68 && loc.getZ() >= 3214) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "케흘렌" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(120000);
				entity.setHealth(120000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
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

	public boolean mob59(LivingEntity entity, Location loc) {
		// 설원 동굴 보스
		if (loc.getX() <= 3741 && loc.getY() <= 141
				&& loc.getZ() <= 3237 && loc.getX() >= 3739
				&& loc.getY() >= 139 && loc.getZ() >= 3235) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3041);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "발로르" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(200000);
				entity.setHealth(200000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BLACK_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 90));
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

	public boolean mob60(LivingEntity entity, Location loc) {
		// 늪지 슬라임 -616 94 699  -897 43 871
		if (loc.getX() <= -616 && loc.getY() <= 94
				&& loc.getZ() <= 871 && loc.getX() >= -897
				&& loc.getY() >= 43 && loc.getZ() >= 699) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "거대 슬라임" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				Slime slime = (Slime) entity;
				slime.setSize(5);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 74));
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

	public boolean mob61(LivingEntity entity, Location loc) {
		// 늪 거미지대 -795 103 311  -313 45 691
		if (loc.getX() <= -313 && loc.getY() <= 103
				&& loc.getZ() <= 691 && loc.getX() >= -795
				&& loc.getY() >= 45 && loc.getZ() >= 311) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "늑대 거미" + ChatColor.YELLOW + " [Lv.258]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "독거미" + ChatColor.YELLOW + " [Lv.264]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
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

	public boolean mob62(LivingEntity entity, Location loc) {
		// 늪지 슬라임 -810 94 693  -970 43 602
		if (loc.getX() <= -810 && loc.getY() <= 94
				&& loc.getZ() <= 693 && loc.getX() >= -970
				&& loc.getY() >= 43 && loc.getZ() >= 602) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "거대 슬라임" + ChatColor.YELLOW + " [Lv.253]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				Slime slime = (Slime) entity;
				slime.setSize(5);
				entity.setMaxHealth(12000);
				entity.setHealth(12000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 74));
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

	public boolean mob63(LivingEntity entity, Location loc) {
		// 늪지 물웅덩이 -888 109 572 -1238 43 167
		if (loc.getX() <= -888 && loc.getY() <= 109
				&& loc.getZ() <= 572 && loc.getX() >= -1238
				&& loc.getY() >= 43 && loc.getZ() >= 167) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "늪지의 마수" + ChatColor.YELLOW + " [Lv.265]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16500);
				entity.setHealth(16500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(27, 84, 56));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(27, 84, 56));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(27, 84, 56));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "늪지의 마신왕" + ChatColor.YELLOW + " [Lv.270]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(40000);
				entity.setHealth(40000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 77));
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

	public boolean mob64(LivingEntity entity, Location loc) {
		// 늪지 북동쪽1 -868 115 166  -1156 47 27  
		if (loc.getX() <= -868 && loc.getY() <= 115
				&& loc.getZ() <= 166 && loc.getX() >= -1156
				&& loc.getY() >= 47 && loc.getZ() >= 27) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산적" + ChatColor.YELLOW + " [Lv.268]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16000);
				entity.setHealth(16000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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

	public boolean mob65(LivingEntity entity, Location loc) {
		// 늪지 북동쪽2 -974 109 -41  -869 47 -222
		if (loc.getX() <= -869 && loc.getY() <= 109
				&& loc.getZ() <= -41 && loc.getX() >= -974
				&& loc.getY() >= 47 && loc.getZ() >= -222) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산적" + ChatColor.YELLOW + " [Lv.268]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(16000);
				entity.setHealth(16000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 75));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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

	public boolean mob66(LivingEntity entity, Location loc) {
		// 푸르 평원1 -311 113 498  -125 41 150
		if (loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
				&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "푸르 고블린" + ChatColor.YELLOW + " [Lv.271]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18000);
				entity.setHealth(18000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GOLDEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 78));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 전사" + ChatColor.YELLOW + " [Lv.274]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(19000);
				entity.setHealth(19000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
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

	public boolean mob67(LivingEntity entity, Location loc) {
		// 푸르 평원2 -124 115 149  -408 41 -263
		if (loc.getX() <= -124 && loc.getY() <= 115
				&& loc.getZ() <= 149 && loc.getX() >= -408
				&& loc.getY() >= 41 && loc.getZ() >= -263) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "하급 파괴수" + ChatColor.YELLOW + " [Lv.290]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(24000);
				entity.setHealth(24000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 87));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 해골" + ChatColor.YELLOW + " [Lv.286]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(22500);
				entity.setHealth(22500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("85");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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

	public boolean mob68(LivingEntity entity, Location loc) {
		// 푸르 평원3 -123 115 367  62 41 37
		if (loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 세력 플레이어" + ChatColor.YELLOW + " [Lv.279]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 82));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "캘시퍼" + ChatColor.YELLOW + " [Lv.283]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(21000);
				entity.setHealth(21000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 84));
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

	public boolean mob69(LivingEntity entity, Location loc) {
		// 푸르 평원4 29 115 27  -123 41 -208
		if (loc.getX() <= 29 && loc.getY() <= 115
				&& loc.getZ() <= 27 && loc.getX() >= -123
				&& loc.getY() >= 41 && loc.getZ() >= -208) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "하급 파괴수" + ChatColor.YELLOW + " [Lv.290]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(24000);
				entity.setHealth(24000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 87));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 해골" + ChatColor.YELLOW + " [Lv.286]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(22500);
				entity.setHealth(22500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("85");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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

	public boolean mob70(LivingEntity entity, Location loc) {
		// 푸르 평원5 61 115 366  211 41 461
		if (loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
				&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "푸르 고블린" + ChatColor.YELLOW + " [Lv.271]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(18000);
				entity.setHealth(18000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GOLDEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 78));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 전사" + ChatColor.YELLOW + " [Lv.274]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(19000);
				entity.setHealth(19000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 80));
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
	
	public boolean mob71(LivingEntity entity, Location loc) {
		// 푸르 평원6 65 115 364  693 41 19
		if (loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
				&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "밀 가디언" + ChatColor.YELLOW + " [Lv.294]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(26000);
				entity.setHealth(26000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_HOE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 89));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "변장한 늑대" + ChatColor.YELLOW + " [Lv.300]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(70000);
				entity.setHealth(70000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment weapon2 = entity.getEquipment();
				ItemStack weaponItem2 = new ItemStack(Material.APPLE);
				weapon2.setItemInOffHand(weaponItem2);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob72(LivingEntity entity, Location loc) {
		// 푸르 평원7 40 115 -51  319 41 -421
		if (loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
				&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "약쟁이" + ChatColor.YELLOW + " [Lv.299]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(28000);
				entity.setHealth(28000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.POTION);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment weapon2 = entity.getEquipment();
				ItemStack weaponItem2 = new ItemStack(Material.DRAGON_BREATH);
				weapon2.setItemInOffHand(weaponItem2);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(192, 0, 192));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(45, 180, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(207, 20, 20));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 91));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "과자 마녀" + ChatColor.YELLOW + " [Lv.306]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80000);
				entity.setHealth(80000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
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
	
	public boolean mob73(LivingEntity entity, Location loc) {
		// 센 마그 던전1 3390 40 3826  3424 11 3783
		if (loc.getX() <= 3424 && loc.getY() <= 40
				&& loc.getZ() <= 3826 && loc.getX() >= 3390
				&& loc.getY() >= 11 && loc.getZ() >= 3783) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "전투형 집사" + ChatColor.YELLOW + " [Lv.100]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2300);
				entity.setHealth(2300);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 37));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "전투형 메이드" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2400);
				entity.setHealth(2400);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("36");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob74(LivingEntity entity, Location loc) {
		// 센 마그 던전2 3415 25 3769  3395 9 3712
		if (loc.getX() <= 3415 && loc.getY() <= 25
				&& loc.getZ() <= 3769 && loc.getX() >= 3395
				&& loc.getY() >= 9 && loc.getZ() >= 3712) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "기사출신 집사" + ChatColor.YELLOW + " [Lv.110]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "장교출신 메이드" + ChatColor.YELLOW + " [Lv.110]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("38");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "보안팀장" + ChatColor.YELLOW + " [Lv.115]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(8000);
				entity.setHealth(8000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 40));
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

	public boolean mob75(LivingEntity entity, Location loc) {
		// 센 마그 던전3 3348 11 3759  3386 16 3721
		if (loc.getX() <= 3386 && loc.getY() <= 16
				&& loc.getZ() <= 3759 && loc.getX() >= 3348
				&& loc.getY() >= 11 && loc.getZ() >= 3721) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "전투형 집사" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "전투형 메이드" + ChatColor.YELLOW + " [Lv.108]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2700);
				entity.setHealth(2700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("37");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob76(LivingEntity entity, Location loc) {
		// 센 마그 던전4 3336 10 3725  3299 45 3762
		if (loc.getX() <= 3336 && loc.getY() <= 45
				&& loc.getZ() <= 3762 && loc.getX() >= 3299
				&& loc.getY() >= 10 && loc.getZ() >= 3725) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "아덴" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000);
				entity.setHealth(20000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 45));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "메이드 병사" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000);
				entity.setHealth(3000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
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

	public boolean mob77(LivingEntity entity, Location loc) {
		// 센 마그 던전5 3354 37 3827  3388 13 3804
		if (loc.getX() <= 3388 && loc.getY() <= 37
				&& loc.getZ() <= 3827 && loc.getX() >= 3354
				&& loc.getY() >= 13 && loc.getZ() >= 3804) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "전투형 집사" + ChatColor.YELLOW + " [Lv.105]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500);
				entity.setHealth(2500);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 38));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "전투형 메이드" + ChatColor.YELLOW + " [Lv.108]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2700);
				entity.setHealth(2700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("37");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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

	public boolean mob78(LivingEntity entity, Location loc) {
		// 센 마그 던전6 3355 32 3802  3383 11 3766
		if (loc.getX() <= 3383 && loc.getY() <= 32
				&& loc.getZ() <= 3802 && loc.getX() >= 3355
				&& loc.getY() >= 11 && loc.getZ() >= 3766) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "특급 요리사" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100000);
				entity.setHealth(100000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 65));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "바선생" + ChatColor.YELLOW + " [Lv.180]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000);
				entity.setHealth(5000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 55));
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

	public boolean mob79(LivingEntity entity, Location loc) {
		// 탑 1층
		if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "1층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(250000);
				entity.setHealth(250000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 110));
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

	public boolean mob80(LivingEntity entity, Location loc) {
		// 탑 2층
		if (loc.getX() <= 90 && loc.getY() <= 100 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 88 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(550000);
				entity.setHealth(550000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 140));
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

	public boolean mob81(LivingEntity entity, Location loc) {
		// 탑 3층
		if (loc.getX() <= 90 && loc.getY() <= 115 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 101 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(loc.getX() == 72 && loc.getY() == 101 && loc.getZ() == -22) {
					entity.setCustomName(ChatColor.GRAY + "3층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(1000000);
					entity.setHealth(1000000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(2);
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
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 250));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "3층의 지배자?" + ChatColor.YELLOW + " [Lv.1]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(300000);
					entity.setHealth(300000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(2);
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
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 150));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
					return true;
				}
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
	
	public boolean mob82(LivingEntity entity, Location loc) {
		// 탑 4층
		if (loc.getX() <= 90 && loc.getY() <= 128 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 116 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "4층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1600000);
				entity.setHealth(1600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 600));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
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
	
	public boolean mob83(LivingEntity entity, Location loc) {
		// 탑 5층
		if (loc.getX() <= 90 && loc.getY() <= 141 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 129 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "5층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("1200");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CHIRP);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				ItemMeta chestplateItemIm = chestplateItem.getItemMeta();
				chestplateItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				chestplateItem.setItemMeta(chestplateItemIm);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				ItemMeta leggingsItemIm = leggingsItem.getItemMeta();
				leggingsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				leggingsItem.setItemMeta(leggingsItemIm);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				ItemMeta bootsItemIm = bootsItem.getItemMeta();
				bootsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				bootsItem.setItemMeta(bootsItemIm);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setMaxHealth(300000000);
				entity.setHealth(300000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "탑의 아라크네" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500000);
				entity.setHealth(500000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 600));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "탑의 추종자" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500000);
				entity.setHealth(500000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("600");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CHIRP);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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
	
	public boolean mob84(LivingEntity entity, Location loc) {
		// 탑 6층
		if (loc.getX() <= 90 && loc.getY() <= 156 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 142 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "6층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3800000);
				entity.setHealth(3800000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob85(LivingEntity entity, Location loc) {
		// 탑 7층
		if (loc.getX() <= 90 && loc.getY() <= 169 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 157 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "7층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5500000);
				entity.setHealth(5500000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LAPIS_BLOCK);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob86(LivingEntity entity, Location loc) {
		// 탑 8층
		if (loc.getX() <= 90 && loc.getY() <= 182 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 170 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "8층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(7000000);
				entity.setHealth(7000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("6000");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_STAL);
				ItemMeta mobBowItemIm = mobBowItem.getItemMeta();
				mobBowItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				mobBowItem.setItemMeta(mobBowItemIm);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				ItemMeta headItemIm = headItem.getItemMeta();
				headItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				headItem.setItemMeta(headItemIm);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				ItemMeta chestplateItemIm = chestplateItem.getItemMeta();
				chestplateItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				chestplateItem.setItemMeta(chestplateItemIm);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				ItemMeta leggingsItemIm = leggingsItem.getItemMeta();
				leggingsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				leggingsItem.setItemMeta(leggingsItemIm);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				ItemMeta bootsItemIm = bootsItem.getItemMeta();
				bootsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				bootsItem.setItemMeta(bootsItemIm);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CREEPER) {
				entity.setCustomName(ChatColor.GRAY + "시간" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100000);
				entity.setHealth(100000);
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
	
	public boolean mob87(LivingEntity entity, Location loc) {
		// 탑 9층
		if (loc.getX() <= 90 && loc.getY() <= 197 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 183 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob88(LivingEntity entity, Location loc) {
		// 탑 10층
		if (loc.getX() <= 90 && loc.getY() <= 210 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 198 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob89(LivingEntity entity, Location loc) {
		// 탑 11층
		if (loc.getX() <= 90 && loc.getY() <= 223 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 211 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob90(LivingEntity entity, Location loc) {
		// 탑 12층
		if (loc.getX() <= 90 && loc.getY() <= 238 && loc.getZ() <= -5 && 
				loc.getX() >= 54 && loc.getY() >= 224 && loc.getZ() >= -41) {
			Location chestLoc = new Location(entity.getWorld(), -1844, 92, 3044);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "2층의 지배자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob91(LivingEntity entity, Location loc) {
		// 베아그 근처 해저동굴 33 41 -487  -40 4 -568
		if (loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
				loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "지하의 파수꾼" + ChatColor.YELLOW + " [Lv.320]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				Zombie zombie = (Zombie) entity;
				zombie.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "지하의 파수꾼" + ChatColor.YELLOW + " [Lv.324]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("96");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob92(LivingEntity entity, Location loc) {
		// 늪의 슬라임 지대 -1020 42 526  -931 1 401
		if (loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
				loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "갓 슬라임" + ChatColor.YELLOW + " [Lv.310]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
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
	
	public boolean mob93(LivingEntity entity, Location loc) {
		// 베아그 주변 마을 -36 65 -227  -175 49 -323
		if (loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
				loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "사라진 부락의 전사" + ChatColor.YELLOW + " [Lv.306]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(29000);
				entity.setHealth(29000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(19);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
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
	
	public boolean mob94(LivingEntity entity, Location loc) {
		// 네크로벨리 -179 62 776  -78 4 580
		if (loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
				&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "네크로벨리의 암살자" + ChatColor.YELLOW + " [Lv.308]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(28000);
				entity.setHealth(28000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(20);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 92));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "네크로벨리의 감시자" + ChatColor.YELLOW + " [Lv.314]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(30000);
				entity.setHealth(30000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("94");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(120, 120, 40));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 40, 20));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "네크로벨리의 복병" + ChatColor.YELLOW + " [Lv.318]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 94));
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
	
	public boolean mob95(LivingEntity entity, Location loc) {
		// 푸르평원 동굴 -59 77 555  146 58 466 
		if (loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
				&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466) {
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "푸르 날벌레" + ChatColor.YELLOW + " [Lv.312]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(31000);
				entity.setHealth(31000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "푸르 날벌레" + ChatColor.YELLOW + " [Lv.317]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 93));
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
	
	public boolean mob96(LivingEntity entity, Location loc) {
		// 지하감옥 313 41 -184  250 25 -154
		if (loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
				&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "지하감옥의 간부" + ChatColor.YELLOW + " [Lv.329]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(33500);
				entity.setHealth(33500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 97));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "지하감옥의 죄수" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(33000);
				entity.setHealth(33000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
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
	
	public boolean mob97(LivingEntity entity, Location loc) {
		// 마법탑 1  147 3 489  429 172 697
		if (loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
				&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "마력의 부산물" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "강화 개조 인간" + ChatColor.YELLOW + " [Lv.330]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(34000);
				entity.setHealth(34000);
				Husk husk = (Husk) entity;
				husk.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 98));
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
	
	public boolean mob98(LivingEntity entity, Location loc) {
		// 마법탑 2 429 172 700  47 3 935
		if (loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
				&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "마법에 타락한 자" + ChatColor.YELLOW + " [Lv.332]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(35000);
				entity.setHealth(35000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 99));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "전생한 슬라임" + ChatColor.YELLOW + " [Lv.336]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(36000);
				entity.setHealth(36000);
				Slime slime = (Slime) entity;
				slime.setSize(2);
				entity.setMaxHealth(36000);
				entity.setHealth(36000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
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
	
	public boolean mob99(LivingEntity entity, Location loc) {
		// 마법탑 3  146 78 502  8 164 697
		if (loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
				&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "마력의 부산물" + ChatColor.YELLOW + " [Lv.325]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(32000);
				entity.setHealth(32000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 96));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "강화 개조 인간" + ChatColor.YELLOW + " [Lv.330]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(34000);
				entity.setHealth(34000);
				Husk husk = (Husk) entity;
				husk.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 98));
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
	
	public boolean mob100(LivingEntity entity, Location loc) {
		// 미궁 50 62 615  96 53 695  
		if (loc.getX() <= 96 && loc.getY() <= 62 && loc.getZ() <= 695 
				&& loc.getX() >= 50 && loc.getY() >= 53 && loc.getZ() >= 615) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "재앙" + ChatColor.YELLOW + " [Lv.343]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(37000);
				entity.setHealth(37000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 101));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "타락한 모험가" + ChatColor.YELLOW + " [Lv.347]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(38500);
				entity.setHealth(38500);
				Husk husk = (Husk) entity;
				husk.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 102));
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
	
	public boolean mob101(LivingEntity entity, Location loc) {
		// 미궁보스방 48 61 654  16 51 696
		if (loc.getX() <= 48 && loc.getY() <= 61 && loc.getZ() <= 696 
				&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "재앙" + ChatColor.YELLOW + " [Lv.343]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(37000);
				entity.setHealth(37000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 101));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "코낭그" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(700000);
				entity.setHealth(700000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("120");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CAT);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(25);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 121));
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
	
	public boolean mob102(LivingEntity entity, Location loc) {
		// 고성 서쪽  625 200 887  493 40 389
		if (loc.getX() <= 625 && loc.getY() <= 200 && loc.getZ() <= 887 && 
				loc.getX() >= 493 && loc.getY() >= 40 && loc.getZ() >= 389) {
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "요정의 파편" + ChatColor.YELLOW + " [Lv.338]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(36500);
				entity.setHealth(36500);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 101));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "초마도용기사" + ChatColor.YELLOW + " [Lv.342]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(37000);
				entity.setHealth(37000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("102");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DRAGON_HEAD);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.DRAGON_HEAD);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob103(LivingEntity entity, Location loc) {
		// 고성 남쪽 627 150 661  810 45 891
		if (loc.getX() <= 810 && loc.getY() <= 150 && loc.getZ() <= 891 && 
				loc.getX() >= 627 && loc.getY() >= 45 && loc.getZ() >= 661) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "떠도는 망령 전사" + ChatColor.YELLOW + " [Lv.344]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(38000);
				entity.setHealth(38000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 104));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "떠도는 망령 마법사" + ChatColor.YELLOW + " [Lv.349]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(39000);
				entity.setHealth(39000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("105");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CAT);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
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
	
	public boolean mob104(LivingEntity entity, Location loc) {
		// 고성 동남쪽 758 150 656  967 45 620
		if (loc.getX() <= 967 && loc.getY() <= 150 && loc.getZ() <= 656 && 
				loc.getX() >= 758 && loc.getY() >= 55 && loc.getZ() >= 620) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "그리즐리 베어" + ChatColor.YELLOW + " [Lv.347]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(39000);
				entity.setHealth(39000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 106));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "TNTZ" + ChatColor.YELLOW + " [Lv.351]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(40000);
				entity.setHealth(40000);
				Zombie zom = (Zombie) entity;
				zom.setBaby(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.TNT);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 109));
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
	
	public boolean mob108(LivingEntity entity, Location loc) {
		// 아라크네의 저주1 699 56 551  782 34 633
		if (loc.getX() <= 782 && loc.getY() <= 56 && loc.getZ() <= 633 
				&& loc.getX() >= 699 && loc.getY() >= 34 && loc.getZ() >= 551) {
			if (entity.getType() == (EntityType) EntityType.PHANTOM) {
				entity.setCustomName(ChatColor.GRAY + "푸른 가오리" + ChatColor.YELLOW + " [Lv.380]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(15000);
				entity.setHealth(15000);
				Phantom magma = (Phantom) entity;
				magma.setSize(1);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
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
	
	public boolean mob109(LivingEntity entity, Location loc) {
		// 아라크네의 저주 보스방 727 31 555  776 0 605
		if (loc.getX() <= 776 && loc.getY() <= 31 && loc.getZ() <= 605 
				&& loc.getX() >= 727 && loc.getY() >= 0 && loc.getZ() >= 555) {
			if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "아라크네" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(1200000);
				entity.setHealth(1200000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 250));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "아라크네의 하수인" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(48000);
				entity.setHealth(48000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 126));
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

	public boolean mob110(LivingEntity entity, Location loc) {
		// 수목원 744 120 659  710 60 617
		if (loc.getX() <= 744 && loc.getY() <= 120 && loc.getZ() <= 659 && 
				loc.getX() >= 710 && loc.getY() >= 60 && loc.getZ() >= 617) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "네오아쿠아 마돌" + ChatColor.YELLOW + " [Lv.365]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(43700);
				entity.setHealth(43700);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("117");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_BLOCKS);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 133, 231));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 133, 231));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 133, 231));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "라이트레이 마돌" + ChatColor.YELLOW + " [Lv.369]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(44600);
				entity.setHealth(44600);
				Zombie zom = (Zombie) entity;
				zom.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.COBBLESTONE_WALL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 133, 231));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 133, 231));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 133, 231));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 119));
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
	
	public boolean mob111(LivingEntity entity, Location loc) {
		// 3층 672 116 572  713 100 605   
		if (loc.getX() <= 713 && loc.getY() <= 116 && loc.getZ() <= 605 && 
				loc.getX() >= 672 && loc.getY() >= 100 && loc.getZ() >= 572) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "뒤틀린 요정" + ChatColor.YELLOW + " [Lv.384]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(49000);
				entity.setHealth(49000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OAK_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(10);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(120, 120, 20));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(120, 120, 20));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(120, 120, 20));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 128));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "뒤틀린 요정" + ChatColor.YELLOW + " [Lv.386]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(50000);
				entity.setHealth(50000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(45, 93, 151));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(45, 93, 151));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(45, 93, 151));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 130));
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
	
	public boolean mob112(LivingEntity entity, Location loc) {
		// 2층 712 91 566  668 82 609
		if (loc.getX() <= 712 && loc.getY() <= 91 && loc.getZ() <= 609 && 
				loc.getX() >= 668 && loc.getY() >= 82 && loc.getZ() >= 566) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "분노하는 요정" + ChatColor.YELLOW + " [Lv.379]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(47500);
				entity.setHealth(47500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("124");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "분노하는 요정" + ChatColor.YELLOW + " [Lv.383]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(48000);
				entity.setHealth(48000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("126");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(9);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob113(LivingEntity entity, Location loc) {
		// 1층 675 75 617  718 65 566
		if (loc.getX() <= 718 && loc.getY() <= 75 && loc.getZ() <= 617 && 
				loc.getX() >= 675 && loc.getY() >= 65 && loc.getZ() >= 566) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "방황하는 요정" + ChatColor.YELLOW + " [Lv.372]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(45200);
				entity.setHealth(45200);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("120");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_13);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(20, 33, 155));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(20, 33, 155));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(20, 33, 155));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "방황하는 요정" + ChatColor.YELLOW + " [Lv.376]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(46500);
				entity.setHealth(46500);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(155, 20, 155));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(155, 20, 155));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(155, 20, 155));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 122));
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
	
	public boolean mob114(LivingEntity entity, Location loc) {
		// 밀밭 동쪽 695 40 6  860 100 165
		if (loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 165 && 
				loc.getX() >= 695 && loc.getY() >= 40 && loc.getZ() >= 6) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "켄" + ChatColor.YELLOW + " [Lv.390]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(51000);
				entity.setHealth(51000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("133");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(200, 10, 10));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(200, 10, 10));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(170, 120, 10));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "류" + ChatColor.YELLOW + " [Lv.394]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(52000);
				entity.setHealth(52000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("135");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(170, 120, 10));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "고우키" + ChatColor.YELLOW + " [Lv.397]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(53000);
				entity.setHealth(53000);
				Zombie zom = (Zombie) entity;
				zom.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(140, 70, 140));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(140, 70, 140));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(140, 60, 10));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 137));
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
	
	public boolean mob115(LivingEntity entity, Location loc) {
		// 클레어흐 서문 860 50 167  695 100 415
		if (loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 415 && 
				loc.getX() >= 695 && loc.getY() >= 50 && loc.getZ() >= 167) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "범인" + ChatColor.YELLOW + " [Lv.395]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(53000);
				entity.setHealth(53000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 136));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "포도" + ChatColor.YELLOW + " [Lv.399]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(54000);
				entity.setHealth(54000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 138));
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
	
	public boolean mob116(LivingEntity entity, Location loc) {
		// 클레어흐 남문 860 50 419  1068 100 504 
		if (loc.getX() <= 1068 && loc.getY() <= 100 && loc.getZ() <= 480 && 
				loc.getX() >= 860 && loc.getY() >= 50 && loc.getZ() >= 419) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "카스파르" + ChatColor.YELLOW + " [Lv.407]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(70000);
				entity.setHealth(70000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("178");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "와일드" + ChatColor.YELLOW + " [Lv.413]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80000);
				entity.setHealth(80000);
				Zombie zom = (Zombie) entity;
				zom.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 184));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "자미엘" + ChatColor.YELLOW + " [Lv.420]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(220000);
				entity.setHealth(220000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.WHITE_CONCRETE_POWDER);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 250));
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
	
	public boolean mob117(LivingEntity entity, Location loc) {
		// 클레어흐 동남쪽 1076 40 348  1164 100 679
		if (loc.getX() <= 1164 && loc.getY() <= 100 && loc.getZ() <= 679 && 
				loc.getX() >= 1076 && loc.getY() >= 40 && loc.getZ() >= 348) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3043);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "나무 벌레" + ChatColor.YELLOW + " [Lv.410]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(80000);
				entity.setHealth(80000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 190));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산적" + ChatColor.YELLOW + " [Lv.415]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(85000);
				entity.setHealth(85000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.IRON_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 213));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob118(LivingEntity entity, Location loc) {
		// 클레어흐1 901 165 248  1082 60 312
		if (loc.getX() <= 1082 && loc.getY() <= 165 && loc.getZ() <= 312 && 
				loc.getX() >= 901 && loc.getY() >= 60 && loc.getZ() >= 248) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "클레어흐의 망령" + ChatColor.YELLOW + " [Lv.400]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(60000);
				entity.setHealth(60000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 170));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "404 Not Found" + ChatColor.YELLOW + " [Lv.404]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(65000);
				entity.setHealth(65000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 183));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob119(LivingEntity entity, Location loc) {
		// 클레어흐2 904 165 247  1072 60 110 
		if (loc.getX() <= 1072 && loc.getY() <= 165 && loc.getZ() <= 247 && 
				loc.getX() >= 904 && loc.getY() >= 60 && loc.getZ() >= 110) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "타락한 주민" + ChatColor.YELLOW + " [Lv.406]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(70000);
				entity.setHealth(70000);
				Husk h = (Husk) entity;
				h.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 196));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GRAY + "잠식된 주민" + ChatColor.YELLOW + " [Lv.409]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(75000);
				entity.setHealth(75000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GOLDEN_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 208));
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
	
	public boolean mob120(LivingEntity entity, Location loc) {
		// 부락 동쪽 1106 96 675  1299 37 1035 
		if (loc.getX() <= 1299 && loc.getY() <= 96 && loc.getZ() <= 1035 && 
				loc.getX() >= 1106 && loc.getY() >= 37 && loc.getZ() >= 675) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "흑아" + ChatColor.YELLOW + " [Lv.417]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(90000);
				entity.setHealth(90000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 230));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.LLAMA) {
				entity.setCustomName(ChatColor.GRAY + "자독" + ChatColor.YELLOW + " [Lv.420]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(95000);
				entity.setHealth(95000);
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
	
	public boolean mob121(LivingEntity entity, Location loc) {
		// 보스 스켈이 3707 44 3712
		if (loc.getX() <= 3708 && loc.getY() <= 45 && loc.getZ() <= 3713 && 
				loc.getX() >= 3706 && loc.getY() >= 43 && loc.getZ() >= 3711) {
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "보스 스켈이" + ChatColor.YELLOW + " [Lv.0]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3);
				entity.setHealth(3);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.PAPER);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.SKELETON_SKULL);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob122(LivingEntity entity, Location loc) {
		// 클레어흐 지하1 1009 54 254  1060 36 298
		if (loc.getX() <= 1060 && loc.getY() <= 54 && loc.getZ() <= 298 && 
				loc.getX() >= 1009 && loc.getY() >= 36 && loc.getZ() >= 254) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "클레어흐의 광신도" + ChatColor.YELLOW + " [Lv.414]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(90000);
				entity.setHealth(90000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.WHITE_CONCRETE_POWDER);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(19);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 230));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "클레어흐의 광신도" + ChatColor.YELLOW + " [Lv.419]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(95000);
				entity.setHealth(95000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("245");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CAT);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(20);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob123(LivingEntity entity, Location loc) {
		// 클레어흐 지하2 912 55 142  1030 18 214 
		if (loc.getX() <= 1030 && loc.getY() <= 55 && loc.getZ() <= 214 
				&& loc.getX() >= 912 && loc.getY() >= 18 && loc.getZ() >= 142) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "클레어흐의 광신도 간부" + ChatColor.YELLOW + " [Lv.423]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100000);
				entity.setHealth(100000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.JUNGLE_PLANKS);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 260));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "클레어흐의 포보르" + ChatColor.YELLOW + " [Lv.427]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(105000);
				entity.setHealth(105000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 275));
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

	public boolean mob124(LivingEntity entity, Location loc) {
		// 파르홀론 유적 지하 -1090 5 2302  -1112 0 2281 
		if (loc.getX() <= -1090 && loc.getY() <= 5 && loc.getZ() <= 2302 
				&& loc.getX() >= -1112 && loc.getY() >= 0 && loc.getZ() >= 2281) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "파르홀론의 묘를 지키는 자" + ChatColor.YELLOW + " [Lv.142]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000);
				entity.setHealth(4000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.JUNGLE_PLANKS);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 255, 255));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 42));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "약화된 아라크네" + ChatColor.YELLOW + " [Lv.146]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4200);
				entity.setHealth(4200);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 44));
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
	
	public boolean mob125(LivingEntity entity, Location loc) {
		// 클레어흐 용암 지대1 768 33 36  911 0 -153 
		if (loc.getX() <= 911 && loc.getY() <= 33 && loc.getZ() <= 36 
				&& loc.getX() >= 768 && loc.getY() >= 0 && loc.getZ() >= -153) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "녹지 않는 뼈" + ChatColor.YELLOW + " [Lv.434]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(115000);
				entity.setHealth(115000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.MAGENTA_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MAGENTA_WOOL);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(25);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 320));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "레드 블럭" + ChatColor.YELLOW + " [Lv.438]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(120000);
				entity.setHealth(120000);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(2);
				entity.setMaxHealth(120000);
				entity.setHealth(120000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 335));
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
	
	public boolean mob126(LivingEntity entity, Location loc) {
		// 클레어흐 용암 지대2  811 38 -64  779 90 -96
		if (loc.getX() <= 811 && loc.getY() <= 90 && loc.getZ() <= -64 
				&& loc.getX() >= 779 && loc.getY() >= 38 && loc.getZ() >= -96) {
			Location chestLoc = new Location(entity.getWorld(), -1830, 92, 3045);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "에임" + ChatColor.YELLOW + " [Lv.426]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(105000);
				entity.setHealth(105000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("290");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "HeYhO" + ChatColor.YELLOW + " [Lv.431]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(110000);
				entity.setHealth(110000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 305));
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
	
	public boolean mob127(LivingEntity entity, Location loc) {
		// 사막1  532 255 1029  120 0 1267
		if (loc.getX() <= 532 && loc.getY() <= 255 && loc.getZ() <= 1267 
				&& loc.getX() >= 120 && loc.getY() >= 0 && loc.getZ() >= 1029) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "사막 망령 전사" + ChatColor.YELLOW + " [Lv.440]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(125000);
				entity.setHealth(125000);
				Husk z = (Husk) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 350));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "Death Gun" + ChatColor.YELLOW + " [Lv.444]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(130000);
				entity.setHealth(130000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("370");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "공허" + ChatColor.YELLOW + " [Lv.448]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(135000);
				entity.setHealth(135000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 390));
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
	
	public boolean mob128(LivingEntity entity, Location loc) {
		// 사막2  -161 255 1268  599 47 1657
		if (loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 1657 
				&& loc.getX() >= -161 && loc.getY() >= 47 && loc.getZ() >= 1268) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "개조된 버서커 플레이어" + ChatColor.YELLOW + " [Lv.450]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(140000);
				entity.setHealth(140000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 420));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "개조된 아처 플레이어" + ChatColor.YELLOW + " [Lv.453]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(145000);
				entity.setHealth(145000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("440");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
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

	public boolean mob129(LivingEntity entity, Location loc) {
		// 사막3  -161 46 1268  599 0 1657
		if (loc.getX() <= 599 && loc.getY() <= 46 && loc.getZ() <= 1657 
				&& loc.getX() >= -161 && loc.getY() >= 0 && loc.getZ() >= 1268) {
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "사막 노래기" + ChatColor.YELLOW + " [Lv.455]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(150000);
				entity.setHealth(150000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 460));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "사막 곰" + ChatColor.YELLOW + " [Lv.458]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(155000);
				entity.setHealth(155000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 480));
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
	
	public boolean mob130(LivingEntity entity, Location loc) {
		// 사막4  230 106 1795  599 0 2617
		if (loc.getX() <= 599 && loc.getY() <= 106 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 0 && loc.getZ() >= 1795) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "사막 전갈" + ChatColor.YELLOW + " [Lv.465]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(165000);
				entity.setHealth(165000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 550));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "쌍창 전사 석상" + ChatColor.YELLOW + " [Lv.468]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(170000);
				entity.setHealth(170000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BIRCH_SLAB);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 575));
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
	
	public boolean mob131(LivingEntity entity, Location loc) {
		// 사막5  230 180 1795  599 107 2617
		if (loc.getX() <= 599 && loc.getY() <= 180 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 107 && loc.getZ() >= 1795) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "빛의 궁수 석상" + ChatColor.YELLOW + " [Lv.471]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(175000);
				entity.setHealth(175000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("600");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "쌍검 전사 석상" + ChatColor.YELLOW + " [Lv.474]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(180000);
				entity.setHealth(180000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.STONE);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 625));
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

	public boolean mob132(LivingEntity entity, Location loc) {
		// 사막6  230 255 1795  599 181 2617
		if (loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 181 && loc.getZ() >= 1795) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "루 라바다의 석상" + ChatColor.YELLOW + " [Lv.475]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(185000);
					entity.setHealth(185000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.POLISHED_BLACKSTONE_SLAB);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(9);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 650));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				} else {
					entity.setCustomName(ChatColor.GRAY + "누아다의 석상" + ChatColor.YELLOW + " [Lv.479]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(190000);
					entity.setHealth(190000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(10);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 675));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				}
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
	
	public boolean mob133(LivingEntity entity, Location loc) {
		// 사막7  -190 85 1565  -342 45 1716
		if (loc.getX() <= -190 && loc.getY() <= 85 && loc.getZ() <= 1716 
				&& loc.getX() >= -342 && loc.getY() >= 45 && loc.getZ() >= 1565) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.459]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(160000);
				entity.setHealth(160000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("500");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "길을 잃은 검은 수염단" + ChatColor.YELLOW + " [Lv.463]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(165000);
				entity.setHealth(165000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("525");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob134(LivingEntity entity, Location loc) {
		// 고대의 암석 협곡1  3648 122 3086  3832 11 2981
		if (loc.getX() <= 3832 && loc.getY() <= 122 && loc.getZ() <= 3086 
				&& loc.getX() >= 3648 && loc.getY() >= 11 && loc.getZ() >= 2981) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "암석 전사" + ChatColor.YELLOW + " [Lv.440]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(165000);
				entity.setHealth(165000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.LIME_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 40, 40));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 40, 40));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 40, 40));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 550));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "암석 전사" + ChatColor.YELLOW + " [Lv.445]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(170000);
				entity.setHealth(170000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("575");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_13);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 40, 40));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 40, 40));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 40, 40));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "암석 전사" + ChatColor.YELLOW + " [Lv.450]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(175000);
				entity.setHealth(175000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("600");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 40, 40));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 40, 40));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 40, 40));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob135(LivingEntity entity, Location loc) {
		// 고대의 암석 협곡2  3824 36 2834  3707 52 2896
		if (loc.getX() <= 3824 && loc.getY() <= 52 && loc.getZ() <= 2896 
				&& loc.getX() >= 3707 && loc.getY() >= 16 && loc.getZ() >= 2834) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "스톤 가디언" + ChatColor.YELLOW + " [Lv.450]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500000);
				entity.setHealth(500000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 625));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "석상 파수꾼" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(2000000);
				entity.setHealth(2000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 900));
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
	
	public boolean mob136(LivingEntity entity, Location loc) {
		// 고대의 암석 협곡3 3697 58 2823  3658 41 2898
		if (loc.getX() <= 3697 && loc.getY() <= 58 && loc.getZ() <= 2898 
				&& loc.getX() >= 3658 && loc.getY() >= 41 && loc.getZ() >= 2823) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "암석 거인의 파편" + ChatColor.YELLOW + " [Lv.455]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(185000);
				entity.setHealth(185000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 650));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CREEPER) {
				entity.setCustomName(ChatColor.GRAY + "유황 골렘" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10);
				entity.setHealth(10);
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
	
	public boolean mob137(LivingEntity entity, Location loc) {
		// 투기장C 4030 120 2548  3853 75 2728
		if (loc.getX() <= 4030 && loc.getY() <= 120 && loc.getZ() <= 2728 
				&& loc.getX() >= 3853 && loc.getY() >= 75 && loc.getZ() >= 2548) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "레티아리우스" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(20);
				entity.setHealth(20);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.TRIDENT);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(150, 150, 150));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(150, 150, 150));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(150, 150, 150));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 999999));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, Integer.MAX_VALUE, 1));
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
	
	public boolean mob138(LivingEntity entity, Location loc) {
		// 투기장B 4037 120 2730  4207 75 2547
		if (loc.getX() <= 4207 && loc.getY() <= 120 && loc.getZ() <= 2730 
				&& loc.getX() >= 4037 && loc.getY() >= 75 && loc.getZ() >= 2547) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "갈리" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(30);
				entity.setHealth(30);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.WHITE_CONCRETE_POWDER);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 999999));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, Integer.MAX_VALUE, 1));
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
	
	public boolean mob139(LivingEntity entity, Location loc) {
		// 투기장A 3846 120 2546  4023 75 2369
		if (loc.getX() <= 4023 && loc.getY() <= 120 && loc.getZ() <= 2546 
				&& loc.getX() >= 3846 && loc.getY() >= 75 && loc.getZ() >= 2369) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "디마카에루스" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(40);
				entity.setHealth(40);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BROWN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BROWN_CARPET);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 999999));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, Integer.MAX_VALUE, 1));
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
	
	public boolean mob140(LivingEntity entity, Location loc) {
		// 투기장S 4031 120 2543  4210 75 2366
		if (loc.getX() <= 4210 && loc.getY() <= 120 && loc.getZ() <= 2543 
				&& loc.getX() >= 4031 && loc.getY() >= 75 && loc.getZ() >= 2366) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "프라에그나리" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(50);
				entity.setHealth(50);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NAUTILUS_SHELL);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 999999));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.SILVERFISH) { 
				entity.setCustomName(ChatColor.GRAY + "귀찮은 녀석" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(6);
				entity.setHealth(6);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 999999));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.IRON_GOLEM) {
				entity.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, Integer.MAX_VALUE, 1));
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
	
	public boolean mob141(LivingEntity entity, Location loc) {
		// 섬1 -296 120 2390  -210 48 2445 
		if (loc.getX() <= -210 && loc.getY() <= 120 && loc.getZ() <= 2445 
				&& loc.getX() >= -296 && loc.getY() >= 48 && loc.getZ() >= 2390) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "고먐미" + ChatColor.YELLOW + " [Lv.480]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(195000);
					entity.setHealth(195000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(19);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(125, 125, 125));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(125, 125, 125));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(125, 125, 125));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 700));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				} else {
					entity.setCustomName(ChatColor.GRAY + "멈멈미" + ChatColor.YELLOW + " [Lv.483]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(200000);
					entity.setHealth(200000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(20);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(225, 145, 50));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(225, 145, 50));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(225, 145, 50));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 725));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				}
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
	
	public boolean mob142(LivingEntity entity, Location loc) {
		// 섬2 -246 120 2448  -136 48 2577
		if (loc.getX() <= -136 && loc.getY() <= 120 && loc.getZ() <= 2577 
				&& loc.getX() >= -246 && loc.getY() >= 48 && loc.getZ() >= 2448) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "펨뮌" + ChatColor.YELLOW + " [Lv.484]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(205000);
					entity.setHealth(205000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(21);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(0, 0, 0));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(205, 205, 0));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 750));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				} else {
					entity.setCustomName(ChatColor.GRAY + "맴무새" + ChatColor.YELLOW + " [Lv.488]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(210000);
					entity.setHealth(210000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(22);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(50, 195, 250));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(50, 195, 250));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(205, 205, 0));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 775));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				}
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
	
	public boolean mob143(LivingEntity entity, Location loc) {
		// 섬3 -260 120 2490  -359 48 2585
		if (loc.getX() <= -260 && loc.getY() <= 120 && loc.getZ() <= 2585 
				&& loc.getX() >= -359 && loc.getY() >= 48 && loc.getZ() >= 2490) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "먐" + ChatColor.YELLOW + " [Lv.489]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(215000);
					entity.setHealth(215000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(23);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(255, 255, 255));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(255, 255, 255));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(255, 255, 255));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 800));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				} else {
					entity.setCustomName(ChatColor.GRAY + "모짐머" + ChatColor.YELLOW + " [Lv.493]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(220000);
					entity.setHealth(220000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(24);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(0, 10, 100));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(0, 10, 100));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(0, 10, 100));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 825));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				}
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
	
	public boolean mob144(LivingEntity entity, Location loc) {
		// 섬4 -328 120 2489  -384 48 2419 
		if (loc.getX() <= -328 && loc.getY() <= 120 && loc.getZ() <= 2489 
				&& loc.getX() >= -384 && loc.getY() >= 48 && loc.getZ() >= 2419) {
			Location chestLoc = new Location(entity.getWorld(), -1832, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "뭔숨미" + ChatColor.YELLOW + " [Lv.494]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(225000);
					entity.setHealth(225000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(25);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(235, 125, 10));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(235, 125, 10));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(235, 125, 125));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 850));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				} else {
					entity.setCustomName(ChatColor.GRAY + "부멈미" + ChatColor.YELLOW + " [Lv.497]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(230000);
					entity.setHealth(230000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.AIR);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(26);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(245, 205, 100));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(245, 205, 100));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(255, 200, 125));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 875));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				}
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
	
	public boolean mob145(LivingEntity entity, Location loc) {
		// 섬5 -275 47 2454  -309 30 2480 
		if (loc.getX() <= -275 && loc.getY() <= 47 && loc.getZ() <= 2480 
				&& loc.getX() >= -309 && loc.getY() >= 30 && loc.getZ() >= 2454) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르화 도마뱀" + ChatColor.YELLOW + " [Lv.499]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(235000);
				entity.setHealth(235000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 900));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르화 복어" + ChatColor.YELLOW + " [Lv.503]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(240000);
				entity.setHealth(240000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("925");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.AIR);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(160, 30, 160));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(160, 30, 160));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(160, 30, 160));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob146(LivingEntity entity, Location loc) {
		// 피르볼그 제사장 3679 118 2732  3703 99 2758
		if (loc.getX() <= 3703 && loc.getY() <= 120 && loc.getZ() <= 2758 
				&& loc.getX() >= 3679 && loc.getY() >= 99 && loc.getZ() >= 2732) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "되살아난 피르볼그의 제사장" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3500000);
				entity.setHealth(3500000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_PLANKS);
				ItemMeta weaponItemIm = weaponItem.getItemMeta();
				weaponItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				weaponItem.setItemMeta(weaponItemIm);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				ItemMeta chestplateItemIm = chestplateItem.getItemMeta();
				chestplateItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				chestplateItem.setItemMeta(chestplateItemIm);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				ItemMeta leggingsItemIm = leggingsItem.getItemMeta();
				leggingsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				leggingsItem.setItemMeta(leggingsItemIm);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				ItemMeta bootsItemIm = bootsItem.getItemMeta();
				bootsItemIm.addEnchant(Enchantment.DURABILITY, 0, true);
				bootsItem.setItemMeta(bootsItemIm);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1300));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "중장갑 포보르" + ChatColor.YELLOW + " [Lv.505]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NETHERITE_AXE);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 950));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르 사제" + ChatColor.YELLOW + " [Lv.510]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(800000);
				entity.setHealth(800000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("975");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CAT);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
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
	
	public boolean mob147(LivingEntity entity, Location loc) {
		// 라파누이1 1787 67 2095  1852 40 2167 
		if (loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2167 
				&& loc.getX() >= 1787 && loc.getY() >= 40 && loc.getZ() >= 2095) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 신입" + ChatColor.YELLOW + " [Lv.500]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(240000);
				entity.setHealth(240000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(80, 0, 80));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(80, 0, 80));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 900));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "섬을 좀먹는 벌레" + ChatColor.YELLOW + " [Lv.504]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(245000);
				entity.setHealth(245000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 925));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob148(LivingEntity entity, Location loc) {
		// 라파누이2 1852 67 2169  1752 40 2239 
		if (loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2239 
				&& loc.getX() >= 1752 && loc.getY() >= 40 && loc.getZ() >= 2169) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 단원" + ChatColor.YELLOW + " [Lv.505]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(250000);
				entity.setHealth(250000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(80, 0, 80));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(80, 0, 80));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 950));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "정신이 나간 포로" + ChatColor.YELLOW + " [Lv.509]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(255000);
				entity.setHealth(255000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 975));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob149(LivingEntity entity, Location loc) {
		// 라파누이3 1855 67 2133  1943 40 2175
		if (loc.getX() <= 1943 && loc.getY() <= 67 && loc.getZ() <= 2175 
				&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2133) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 보초병" + ChatColor.YELLOW + " [Lv.510]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(260000);
				entity.setHealth(260000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SANDSTONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(80, 0, 80));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(80, 0, 80));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 강화병" + ChatColor.YELLOW + " [Lv.514]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(265000);
				entity.setHealth(265000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.MAGENTA_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(80, 0, 80));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(80, 0, 80));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1025));
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
	
	public boolean mob150(LivingEntity entity, Location loc) {
		// 라파누이4 1855 67 2176  1918 40 2250 
		if (loc.getX() <= 1918 && loc.getY() <= 67 && loc.getZ() <= 2250 
				&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2176) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "불타는 석탄" + ChatColor.YELLOW + " [Lv.515]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(270000);
				entity.setHealth(270000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1050));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "녹아내리는 불꽃" + ChatColor.YELLOW + " [Lv.519]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(275000);
				entity.setHealth(275000);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(2);
				entity.setMaxHealth(275000);
				entity.setHealth(275000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1075));
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
	
	public boolean mob151(LivingEntity entity, Location loc) {
		// 라파누이5 1940 100 2154  1888 68 2067
		if (loc.getX() <= 1940 && loc.getY() <= 100 && loc.getZ() <= 2154 
				&& loc.getX() >= 1888 && loc.getY() >= 68 && loc.getZ() >= 2067) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "미아즈마단 이급 군인" + ChatColor.YELLOW + " [Lv.520]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(280000);
					entity.setHealth(280000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.ACACIA_PLANKS);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(9);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(80, 0, 80));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(80, 0, 80));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1100));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				} else {
					entity.setCustomName(ChatColor.GRAY + "미아즈마단 일급 군인" + ChatColor.YELLOW + " [Lv.524]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(285000);
					entity.setHealth(285000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("1125");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(10);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(80, 0, 80));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(80, 0, 80));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(80, 0, 80));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				}
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
	
	public boolean mob152(LivingEntity entity, Location loc) {
		// 라파누이6 1886 100 2067  1823 68 2140
		if (loc.getX() <= 1886 && loc.getY() <= 100 && loc.getZ() <= 2140 
				&& loc.getX() >= 1823 && loc.getY() >= 68 && loc.getZ() >= 2067) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 간부" + ChatColor.YELLOW + " [Lv.525]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(290000);
				entity.setHealth(290000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1150));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마단 애완곰" + ChatColor.YELLOW + " [Lv.530]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(295000);
				entity.setHealth(295000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1175));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "미아즈마" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.NETHERITE_SWORD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NETHERITE_SWORD);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1400));
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
	
	public boolean mob153(LivingEntity entity, Location loc) {
		// 라히무호나1 -2010 40 1289  -1817 66 1525
		if (loc.getX() <= -1817 && loc.getY() <= 66 && loc.getZ() <= 1525 
				&& loc.getX() >= -2010 && loc.getY() >= 40 && loc.getZ() >= 1289) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "환영병" + ChatColor.YELLOW + " [Lv.532]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(300000);
				entity.setHealth(300000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "타란튤라" + ChatColor.YELLOW + " [Lv.536]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(308000);
				entity.setHealth(308000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1225));
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
	
	public boolean mob154(LivingEntity entity, Location loc) {
		// 라히무호나2 -2006 150 1337  -1948 67 1393
		if (loc.getX() <= -1948 && loc.getY() <= 150 && loc.getZ() <= 1393 
				&& loc.getX() >= -2006 && loc.getY() >= 67 && loc.getZ() >= 1337) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "붉은 좀비" + ChatColor.YELLOW + " [Lv.538]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(316000);
				entity.setHealth(316000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(255, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1250));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "포자를 날리는 검은 버섯" + ChatColor.YELLOW + " [Lv.542]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(324000);
				entity.setHealth(324000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1275));
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
	
	public boolean mob155(LivingEntity entity, Location loc) {
		// 라히무호나3 -1947 150 1393  -1862 67 1324
		if (loc.getX() <= -1862 && loc.getY() <= 150 && loc.getZ() <= 1393 
				&& loc.getX() >= -1947 && loc.getY() >= 67 && loc.getZ() >= 1324) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "유혹하는 나무" + ChatColor.YELLOW + " [Lv.544]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(332000);
				entity.setHealth(332000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 80, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 80, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 80, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1300));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 100));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "라히무호나의 핵" + ChatColor.YELLOW + " [Lv.548]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(340000);
				entity.setHealth(340000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1325));
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
	
	public boolean mob156(LivingEntity entity, Location loc) {
		// 라히무호나4 -2000 150 1394  -1886 67 1484
		if (loc.getX() <= -1886 && loc.getY() <= 150 && loc.getZ() <= 1484 
				&& loc.getX() >= -2000 && loc.getY() >= 67 && loc.getZ() >= 1394) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "재앙을 날리는 검은 버섯" + ChatColor.YELLOW + " [Lv.550]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(348000);
				entity.setHealth(348000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1350));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "중급 파괴수" + ChatColor.YELLOW + " [Lv.554]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(356000);
				entity.setHealth(356000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1375));
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
	
	public boolean mob157(LivingEntity entity, Location loc) {
		// 슬라임 던전1 3822 63 2735  3737 20 2780
		if (loc.getX() <= 3822 && loc.getY() <= 63 && loc.getZ() <= 2780 
				&& loc.getX() >= 3737 && loc.getY() >= 20 && loc.getZ() >= 2735) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "녹색 슬라임" + ChatColor.YELLOW + " [Lv.560]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(364000);
				entity.setHealth(364000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(364000);
				entity.setHealth(364000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "천년의 요정" + ChatColor.YELLOW + " [Lv.563]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(372000);
				entity.setHealth(372000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1425));
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
	
	public boolean mob158(LivingEntity entity, Location loc) {
		// 슬라임 던전2 3732 38 2793  3673 18 2727
		if (loc.getX() <= 3732 && loc.getY() <= 38 && loc.getZ() <= 2793 
				&& loc.getX() >= 3673 && loc.getY() >= 18 && loc.getZ() >= 2727) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "독극 슬라임" + ChatColor.YELLOW + " [Lv.566]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(380000);
				entity.setHealth(380000);
				Slime slime = (Slime) entity;
				slime.setSize(5);
				entity.setMaxHealth(380000);
				entity.setHealth(380000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1450));
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
	
	public boolean mob159(LivingEntity entity, Location loc) {
		// 슬라임 던전3 3711 77 2800  3636 15 2656
		if (loc.getX() <= 3711 && loc.getY() <= 77 && loc.getZ() <= 2800 
				&& loc.getX() >= 3636 && loc.getY() >= 15 && loc.getZ() >= 2656) {
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "점액에 녹은 스켈레톤" + ChatColor.YELLOW + " [Lv.570]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(388000);
				entity.setHealth(388000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("1475");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.AIR);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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
	
	public boolean mob160(LivingEntity entity, Location loc) {
		// 슬라임 던전4 3716 76 2722  3762 20 2689
		if (loc.getX() <= 3762 && loc.getY() <= 76 && loc.getZ() <= 2722 
				&& loc.getX() >= 3716 && loc.getY() >= 20 && loc.getZ() >= 2689) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "슬라임에게 패배한 모험가" + ChatColor.YELLOW + " [Lv.573]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(396000);
				entity.setHealth(396000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
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
	
	public boolean mob161(LivingEntity entity, Location loc) {
		// 슬라임 던전5 3735 76 2468  3636 20 2580
		if (loc.getX() <= 3735 && loc.getY() <= 76 && loc.getZ() <= 2580 
				&& loc.getX() >= 3636 && loc.getY() >= 20 && loc.getZ() >= 2468) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "멜랑콜리" + ChatColor.YELLOW + " [Lv.575]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(404000);
				entity.setHealth(404000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(404000);
				entity.setHealth(404000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1525));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0));
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
	
	public boolean mob162(LivingEntity entity, Location loc) {
		// 슬라임 던전6 3740 76 2581  3819 30 2479
		if (loc.getX() <= 3819 && loc.getY() <= 76 && loc.getZ() <= 2581 
				&& loc.getX() >= 3740 && loc.getY() >= 30 && loc.getZ() >= 2479) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				if(loc.getX() == 3770.5 && loc.getY() == 40 && loc.getZ() == 2526.5) {
					entity.setCustomName(ChatColor.GRAY + "와우" + ChatColor.YELLOW + " [Lv.??]");
					entity.setCustomNameVisible(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(4000000);
					entity.setHealth(4000000);
					Slime slime = (Slime) entity;
					slime.setSize(7);
					entity.setMaxHealth(4000000);
					entity.setHealth(4000000);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1800));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "우와" + ChatColor.YELLOW + " [Lv.1]");
					entity.setCustomNameVisible(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(40000);
					entity.setHealth(40000);
					Slime slime = (Slime) entity;
					slime.setSize(2);
					entity.setMaxHealth(40000);
					entity.setHealth(40000);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1500));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				}
			} else if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "우와" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(400000);
				entity.setHealth(400000);
				MagmaCube slime = (MagmaCube) entity;
				slime.setSize(3);
				entity.setMaxHealth(400000);
				entity.setHealth(400000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1800));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob163(LivingEntity entity, Location loc) {
		// 시오카나1 539 67 -653  611 48 -485
		if (loc.getX() <= 611 && loc.getY() <= 67 && loc.getZ() <= -485 
				&& loc.getX() >= 539 && loc.getY() >= 45 && loc.getZ() >= -653) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "바다의 포보르" + ChatColor.YELLOW + " [Lv.556]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(360000);
				entity.setHealth(360000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "익사한 포보르" + ChatColor.YELLOW + " [Lv.560]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(368000);
				entity.setHealth(368000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("1425");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(250, 80, 80));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(250, 250, 250));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
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
	
	public boolean mob164(LivingEntity entity, Location loc) {
		// 시오카나2 600 70 -538  459 116 -609
		if (loc.getX() <= 600 && loc.getY() <= 116 && loc.getZ() <= -538 
				&& loc.getX() >= 459 && loc.getY() >= 70 && loc.getZ() >= -609) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "죄수의 유해" + ChatColor.YELLOW + " [Lv.562]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(376000);
				entity.setHealth(376000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(19);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 100, 100));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 100, 100));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 100, 100));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1450));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "불타는 영혼" + ChatColor.YELLOW + " [Lv.566]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(384000);
				entity.setHealth(384000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1475));
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
	
	public boolean mob165(LivingEntity entity, Location loc) {
		// 시오카나3 489 39 -565  458 0 -634
		if (loc.getX() <= 489 && loc.getY() <= 39 && loc.getZ() <= -565 
				&& loc.getX() >= 458 && loc.getY() >= 0 && loc.getZ() >= -634) {
			if (entity.getType() == (EntityType) EntityType.LLAMA) {
				entity.setCustomName(ChatColor.GRAY + "무역 상인의 라마" + ChatColor.YELLOW + " [Lv.568]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(392000);
				entity.setHealth(392000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "감금된 곰" + ChatColor.YELLOW + " [Lv.572]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(400000);
				entity.setHealth(400000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1525));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RABBIT) {
				entity.setCustomName(ChatColor.GRAY + "도둑 토끼" + ChatColor.YELLOW + " [Lv.575]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				Rabbit r = (Rabbit) entity;
				r.setAdult();
				r.setRabbitType(Type.THE_KILLER_BUNNY);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1600));
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
	
	public boolean mob166(LivingEntity entity, Location loc) {
		// 스켈리그1 -799 200 -712  -683 0 -859
		if (loc.getX() <= -683 && loc.getY() <= 200 && loc.getZ() <= -712 
				&& loc.getX() >= -799 && loc.getY() >= 0 && loc.getZ() >= -859) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "떠도는 포보르" + ChatColor.YELLOW + " [Lv.570]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(408000);
				entity.setHealth(408000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("1550");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CHIRP);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(20);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.EVOKER) {
				entity.setCustomName(ChatColor.GRAY + "정신나간 마법사" + ChatColor.YELLOW + " [Lv.574]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(416000);
				entity.setHealth(416000);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1575));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "마법사의 소환물" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(100000);
				entity.setHealth(100000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1500));
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
	
	public boolean mob167(LivingEntity entity, Location loc) {
		// 스켈리그2 -682 200 -874  -524 0 -755
		if (loc.getX() <= -524 && loc.getY() <= 200 && loc.getZ() <= -755 
				&& loc.getX() >= -682 && loc.getY() >= 0 && loc.getZ() >= -874) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "야생 곰" + ChatColor.YELLOW + " [Lv.575]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(424000);
				entity.setHealth(424000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1600));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RABBIT) {
				entity.setCustomName(ChatColor.GRAY + "야생 토끼" + ChatColor.YELLOW + " [Lv.579]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(432000);
				entity.setHealth(432000);
				Rabbit r = (Rabbit) entity;
				r.setAdult();
				r.setRabbitType(Type.THE_KILLER_BUNNY);
				entity.setMaxHealth(432000);
				entity.setHealth(432000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1625));
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
	
	public boolean mob168(LivingEntity entity, Location loc) {
		// 스켈리그3 -520 200 -754  -584 50 -598  
		if (loc.getX() <= -520 && loc.getY() <= 200 && loc.getZ() <= -598 
				&& loc.getX() >= -584 && loc.getY() >= 50 && loc.getZ() >= -754) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "도살자" + ChatColor.YELLOW + " [Lv.580]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(440000);
				entity.setHealth(440000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1650));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "사라진 동물의 영혼" + ChatColor.YELLOW + " [Lv.584]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(448000);
				entity.setHealth(448000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1675));
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
	
	public boolean mob169(LivingEntity entity, Location loc) {
		// 스켈리그4 -518 200 -754  -412 0 -588
		if (loc.getX() <= -412 && loc.getY() <= 200 && loc.getZ() <= -588 
				&& loc.getX() >= -518 && loc.getY() >= 0 && loc.getZ() >= -754) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "464" + ChatColor.YELLOW + " [Lv.585]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(456000);
				entity.setHealth(456000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1700));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.PANDA) {
				entity.setCustomName(ChatColor.GRAY + "팬더" + ChatColor.YELLOW + " [Lv.589]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(464000);
				entity.setHealth(464000);
				Panda p = (Panda) entity;
				p.setAdult();
				p.setMainGene(Panda.Gene.AGGRESSIVE);
				entity.setMaxHealth(464000);
				entity.setHealth(464000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1725));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
			 	entity.setCustomName(ChatColor.GRAY + "솟" + ChatColor.YELLOW + " [Lv.595]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1500000);
				entity.setHealth(1500000);
				Husk z = (Husk) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1900));
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
	
	public boolean mob170(LivingEntity entity, Location loc) {
		// 스켈리그5 -681 200 -988  -773 0 -1111
		if (loc.getX() <= -681 && loc.getY() <= 200 && loc.getZ() <= -988 
				&& loc.getX() >= -773 && loc.getY() >= 0 && loc.getZ() >= -1111) {
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "마을 앞 슬라임" + ChatColor.YELLOW + " [Lv.590]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(472000);
				entity.setHealth(472000);
				Slime slime = (Slime) entity;
				slime.setSize(2);
				entity.setMaxHealth(472000);
				entity.setHealth(472000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1750));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "가면을 쓴 좀비" + ChatColor.YELLOW + " [Lv.594]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(480000);
				entity.setHealth(480000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.MAGENTA_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MAGENTA_WOOL);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.BIRCH_FENCE_GATE);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1775));
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
	
	public boolean mob171(LivingEntity entity, Location loc) {
		// 스켈리그6 -680 200 -1013  -553 0 -1078
		if (loc.getX() <= -553 && loc.getY() <= 200 && loc.getZ() <= -1013 
				&& loc.getX() >= -680 && loc.getY() >= 0 && loc.getZ() >= -1078) {
			if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "마을을 보는 마녀" + ChatColor.YELLOW + " [Lv.595]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(488000);
				entity.setHealth(488000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1800));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ENDERMITE) {
				entity.setCustomName(ChatColor.GRAY + "엘보코로나" + ChatColor.YELLOW + " [Lv.599]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(496000);
				entity.setHealth(496000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1825));
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
	
	public boolean mob172(LivingEntity entity, Location loc) {
		// 스켈리그7 -621 200 -1097  -496 0 -1127
		if (loc.getX() <= -496 && loc.getY() <= 200 && loc.getZ() <= -1097 
				&& loc.getX() >= -621 && loc.getY() >= 0 && loc.getZ() >= -1127) {
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "땅벌레" + ChatColor.YELLOW + " [Lv.600]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(504000);
				entity.setHealth(504000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1850));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "땅거미" + ChatColor.YELLOW + " [Lv.604]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(512000);
				entity.setHealth(512000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1875));
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
	
	public boolean mob173(LivingEntity entity, Location loc) {
		// 스켈리그8 -560 200 -1085  -519 124 -1045 
		if (loc.getX() <= -519 && loc.getY() <= 200 && loc.getZ() <= -1045 
				&& loc.getX() >= -560 && loc.getY() >= 124 && loc.getZ() >= -1085) {
			if (entity.getType() == (EntityType) EntityType.CREEPER) {
				entity.setCustomName(ChatColor.GRAY + "초록 괴물" + ChatColor.YELLOW + " [Lv.605]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(520000);
				entity.setHealth(520000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1900));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "요새를 지키는 곰" + ChatColor.YELLOW + " [Lv.609]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(528000);
				entity.setHealth(528000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1925));
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
	
	public boolean mob174(LivingEntity entity, Location loc) {
		// 스켈리그9 -766 200 -1080  -963 0 -1191
		if (loc.getX() <= -766 && loc.getY() <= 200 && loc.getZ() <= -1080 
				&& loc.getX() >= -963 && loc.getY() >= 0 && loc.getZ() >= -1191) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "요새를 지키는 불꽃" + ChatColor.YELLOW + " [Lv.610]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(536000);
				entity.setHealth(536000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1950));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "모히칸 좀비" + ChatColor.YELLOW + " [Lv.614]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(544000);
				entity.setHealth(544000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.JUNGLE_LOG);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.ANVIL);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1975));
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
	
	public boolean mob175(LivingEntity entity, Location loc) {
		// 스켈리그10  -964 200 -1204  -1071 0 -1071
		if (loc.getX() <= -964 && loc.getY() <= 200 && loc.getZ() <= -1071 
				&& loc.getX() >= -1071 && loc.getY() >= 0 && loc.getZ() >= -1204) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "카케" + ChatColor.YELLOW + " [Lv.615]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(552000);
				entity.setHealth(552000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2000));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "요새의 궁수병" + ChatColor.YELLOW + " [Lv.619]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(560000);
				entity.setHealth(560000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2025");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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
	
	public boolean mob176(LivingEntity entity, Location loc) {
		// 스켈리그11 -838 200 -594  -700 0 -524
		if (loc.getX() <= -700 && loc.getY() <= 200 && loc.getZ() <= -524 
				&& loc.getX() >= -838 && loc.getY() >= 0 && loc.getZ() >= -594) {
			Location chestLoc = new Location(entity.getWorld(), -1834, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "검은 수염단 장교" + ChatColor.YELLOW + " [Lv.600]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(550000);
				entity.setHealth(550000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(25);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "검은 수염단 엘리트" + ChatColor.YELLOW + " [Lv.605]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(580000);
				entity.setHealth(580000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3000");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(26);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(0, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 0, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.OCELOT) {
				entity.setCustomName(ChatColor.GRAY + "검은 수염의 고양이" + ChatColor.YELLOW + " [Lv.610]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(610000);
				entity.setHealth(610000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "폭주한 검은 수염" + ChatColor.YELLOW + " [Lv.620]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2000000);
				entity.setHealth(2000000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.RESPAWN_ANCHOR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob177(LivingEntity entity, Location loc) {
		// 스켈리그12	-585 49 -680  -484 0 -765
		if (loc.getX() <= -484 && loc.getY() <= 49 && loc.getZ() <= -680 
				&& loc.getX() >= -585 && loc.getY() >= 0 && loc.getZ() >= -765) {
			if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "신전을 지키는 괴물" + ChatColor.YELLOW + " [Lv.620]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(568000);
				entity.setHealth(568000);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(2);
				entity.setMaxHealth(568000);
				entity.setHealth(568000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2050));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "고대의 시체" + ChatColor.YELLOW + " [Lv.624]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(576000);
				entity.setHealth(576000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2075");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
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
	
	public boolean mob178(LivingEntity entity, Location loc) {
		// 유산 신전1  3681 97 2310  3711 83 2392
		if (loc.getX() <= 3711 && loc.getY() <= 100 && loc.getZ() <= 2392 
				&& loc.getX() >= 3681 && loc.getY() >= 80 && loc.getZ() >= 2310) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "뭉쳐진 포보르의 장기" + ChatColor.YELLOW + " [Lv.620]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(800000);
				entity.setHealth(800000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER) {
				entity.setCustomName(ChatColor.GRAY + "타락한 영웅의 갑옷" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(3500000);
				entity.setHealth(3500000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2300));
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
	
	public boolean mob179(LivingEntity entity, Location loc) {
		// 유산 신전2 3713 108 2376  3753 80 2434  
		if (loc.getX() <= 3753 && loc.getY() <= 108 && loc.getZ() <= 2434 
				&& loc.getX() >= 3713 && loc.getY() >= 80 && loc.getZ() >= 2376) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "썩은 공양물" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOGLIN) {
				entity.setCustomName(ChatColor.GRAY + "공양을 받는 돼지" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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

	public boolean mob180(LivingEntity entity, Location loc) {
		// 하드 바다 복도 3773 90 3846  3684 60 3890
		if (loc.getX() <= 3773 && loc.getY() <= 90 && loc.getZ() <= 3890 
				&& loc.getX() >= 3684 && loc.getY() >= 60 && loc.getZ() >= 3846) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "오징어 마법사" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(880000);
				entity.setHealth(880000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3500");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_FAR);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "금붕어 아처" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(890000);
				entity.setHealth(890000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3550");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(2);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3550));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "고등어 전사" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(900000);
				entity.setHealth(900000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.COBBLESTONE_WALL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(3);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3600));
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
	
	public boolean mob181(LivingEntity entity, Location loc) {
		// 하드 바다 파쿠르 3839 134 3932  3683 58 3990
		if (loc.getX() <= 3839 && loc.getY() <= 134 && loc.getZ() <= 3990 
				&& loc.getX() >= 3683 && loc.getY() >= 58 && loc.getZ() >= 3932) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "인간형 가디언" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(910000);
				entity.setHealth(910000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3650");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(4);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3650));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "어린 복어 병사" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(920000);
				entity.setHealth(920000);
				Zombie z = (Zombie) entity;
				z.setBaby(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3700));
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
	
	public boolean mob182(LivingEntity entity, Location loc) {
		// 중간보스방 3837 91 4001  3746 65 4060
		if (loc.getX() <= 3837 && loc.getY() <= 91 && loc.getZ() <= 4060 
				&& loc.getX() >= 3746 && loc.getY() >= 65 && loc.getZ() >= 4001) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "아빠 상어" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(7000000);
				entity.setHealth(7000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "엄마 상어" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(2000000);
				entity.setHealth(2000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3750));
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
	
	public boolean mob183(LivingEntity entity, Location loc) {
		// 보스 3672 150 4005  3617 200 4058
		if (loc.getX() <= 3672 && loc.getY() <= 200 && loc.getZ() <= 4058 
				&& loc.getX() >= 3617 && loc.getY() >= 150 && loc.getZ() >= 4005) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "해왕신 포세이돈" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(15000000);
				entity.setHealth(15000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.ORANGE_CONCRETE_POWDER);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "아기 상어" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(false);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				Zombie z = (Zombie) entity;
				z.setBaby(true);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.CYAN_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(9);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4500));
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
	
	public boolean mob184(LivingEntity entity, Location loc) {
		// 티페라리1  831 110 -697    988 40 -784
		if (loc.getX() <= 988 && loc.getY() <= 110 && loc.getZ() <= -697 
				&& loc.getX() >= 831 && loc.getY() >= 40 && loc.getZ() >= -784) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ENDERMAN) {
				entity.setCustomName(ChatColor.GRAY + "검은 흐름에 잠식된 주민" + ChatColor.YELLOW + " [Lv.625]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(584000);
				entity.setHealth(584000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "검은 흐름에 잠식된 주민" + ChatColor.YELLOW + " [Lv.629]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(592000);
				entity.setHealth(592000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2250");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CAT);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(10);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
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
	
	public boolean mob185(LivingEntity entity, Location loc) {
		// 티페라리2  1045 110 -784  768 40 -995
		if (loc.getX() <= 1045 && loc.getY() <= 110 && loc.getZ() <= -784 
				&& loc.getX() >= 768 && loc.getY() >= 40 && loc.getZ() >= -995) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.LLAMA) {
				entity.setCustomName(ChatColor.GRAY + "주인을 잃은 라마" + ChatColor.YELLOW + " [Lv.630]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(600000);
				entity.setHealth(600000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2300));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "자아를 잃은 라마 주인" + ChatColor.YELLOW + " [Lv.634]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(608000);
				entity.setHealth(608000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SMOOTH_RED_SANDSTONE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2350));
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
	
	public boolean mob186(LivingEntity entity, Location loc) {
		// 교회 890 65 -1015  803 110 -1114
		if (loc.getX() <= 890 && loc.getY() <= 110 && loc.getZ() <= -1015 
				&& loc.getX() >= 803 && loc.getY() >= 65 && loc.getZ() >= -1114) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "페라리교의 신도" + ChatColor.YELLOW + " [Lv.635]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(616000);
				entity.setHealth(616000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2400");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_13);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "페라리교의 상위 신도" + ChatColor.YELLOW + " [Lv.639]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(624000);
				entity.setHealth(624000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(128, 0, 16));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(128, 0, 16));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(128, 0, 16));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2450));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "페라리교의 교주" + ChatColor.YELLOW + " [Lv.650]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2300000);
				entity.setHealth(2300000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BIRCH_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob187(LivingEntity entity, Location loc) {
		// 티페라리 앞 동굴1   890 64 -996  717 0 -1155
		if (loc.getX() <= 890 && loc.getY() <= 64 && loc.getZ() <= -996 
				&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -1155) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "인어" + ChatColor.YELLOW + " [Lv.640]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(632000);
				entity.setHealth(632000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 255, 255));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 100, 150));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(0, 100, 150));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CREEPER) {
				entity.setCustomName(ChatColor.GRAY + "물풍선" + ChatColor.YELLOW + " [Lv.644]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(640000);
				entity.setHealth(640000);
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
	
	public boolean mob188(LivingEntity entity, Location loc) {
		// 티페라리 앞 동굴2  890 39 -995  717 0 -919
		if (loc.getX() <= 890 && loc.getY() <= 39 && loc.getZ() <= -919 
				&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -995) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "어푸" + ChatColor.YELLOW + " [Lv.645]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(648000);
				entity.setHealth(648000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2550));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "아푸" + ChatColor.YELLOW + " [Lv.649]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(656000);
				entity.setHealth(656000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2600));
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
	
	public boolean mob189(LivingEntity entity, Location loc) {
		// 채석장 1148 110 -967  1046 30 -1056
		if (loc.getX() <= 1148 && loc.getY() <= 110 && loc.getZ() <= -967 
				&& loc.getX() >= 1046 && loc.getY() >= 30 && loc.getZ() >= -1056) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "철을 먹는 벌레" + ChatColor.YELLOW + " [Lv.650]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(664000);
				entity.setHealth(664000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2650));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "쑥을 먹는 곰" + ChatColor.YELLOW + " [Lv.654]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(672000);
				entity.setHealth(672000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2700));
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
	
	public boolean mob190(LivingEntity entity, Location loc) {
		// 유적 1083 110 -800  1303 30 -965
		if (loc.getX() <= 1303 && loc.getY() <= 110 && loc.getZ() <= -800 
				&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -965) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.OCELOT) {
				entity.setCustomName(ChatColor.GRAY + "떠돌이 고양이" + ChatColor.YELLOW + " [Lv.655]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(680000);
				entity.setHealth(680000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2750));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "위더 스켈레톤" + ChatColor.YELLOW + " [Lv.659]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(688000);
				entity.setHealth(688000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("2800");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
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
	
	public boolean mob191(LivingEntity entity, Location loc) {
		// 평원1  926 120 -1058  1082 30 -1226
		if (loc.getX() <= 1082 && loc.getY() <= 120 && loc.getZ() <= -1058 
				&& loc.getX() >= 926 && loc.getY() >= 30 && loc.getZ() >= -1226) {
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "화염의 조종자" + ChatColor.YELLOW + " [Lv.660]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(696000);
				entity.setHealth(696000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2850));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RABBIT) {
				entity.setCustomName(ChatColor.GRAY + "귀여움의 조종자" + ChatColor.YELLOW + " [Lv.664]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(704000);
				entity.setHealth(704000);
				Rabbit r = (Rabbit) entity;
				r.setAdult();
				r.setRabbitType(Type.THE_KILLER_BUNNY);
				entity.setMaxHealth(704000);
				entity.setHealth(704000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2900));
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
	
	public boolean mob192(LivingEntity entity, Location loc) {
		// 평원2  1083 120 -1058  1152 30 -1226
		if (loc.getX() <= 1152 && loc.getY() <= 120 && loc.getZ() <= -1058 
				&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -1226) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "대지의 조종자" + ChatColor.YELLOW + " [Lv.665]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(712000);
				entity.setHealth(712000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2950));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITCH) {
				entity.setCustomName(ChatColor.GRAY + "포션의 조종자" + ChatColor.YELLOW + " [Lv.669]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(720000);
				entity.setHealth(720000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob193(LivingEntity entity, Location loc) {
		// 평원3  1153 120 -986  1299 30 -1226
		if (loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -986 
				&& loc.getX() >= 1153 && loc.getY() >= 30 && loc.getZ() >= -1226) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "포보르의 체액" + ChatColor.YELLOW + " [Lv.670]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(728000);
				entity.setHealth(728000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(728000);
				entity.setHealth(728000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3050));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "포보르화 고블린" + ChatColor.YELLOW + " [Lv.674]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(736000);
				entity.setHealth(736000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3100));
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
	
	public boolean mob194(LivingEntity entity, Location loc) {
		// 평원4  960 120 -1307  1299 30 -1227
		if (loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1227 
				&& loc.getX() >= 960 && loc.getY() >= 30 && loc.getZ() >= -1307) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르화 모험가" + ChatColor.YELLOW + " [Lv.675]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(744000);
				entity.setHealth(744000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3150");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(18);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "포보르화 오크" + ChatColor.YELLOW + " [Lv.679]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(752000);
				entity.setHealth(752000);
				Zombie z = (Zombie) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.MAGENTA_WOOL);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MAGENTA_WOOL);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(19);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "포보르라고 불리는 포보르" + ChatColor.YELLOW + " [Lv.690]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(2500000);
				entity.setHealth(2500000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(20);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
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
	
	public boolean mob195(LivingEntity entity, Location loc) {
		// 원시의 땅1  1023 60 -1308  1299 30 -1444
		if (loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1308 
				&& loc.getX() >= 1023 && loc.getY() >= 30 && loc.getZ() >= -1444) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "무리에서 쫒겨난 궁수" + ChatColor.YELLOW + " [Lv.670]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(740000);
				entity.setHealth(740000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3100");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(21);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "무리에서 쫒겨난 전사" + ChatColor.YELLOW + " [Lv.673]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(748000);
				entity.setHealth(748000);
				Husk z = (Husk) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(22);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3150));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob196(LivingEntity entity, Location loc) {
		// 원시의 땅2 1073 60 -1446  1299 30 -1541
		if (loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1446 
				&& loc.getX() >= 1073 && loc.getY() >= 30 && loc.getZ() >= -1541) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "무리에서 쫒겨난 마법사" + ChatColor.YELLOW + " [Lv.674]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(756000);
				entity.setHealth(756000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3200");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_MALL);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(23);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "무리에서 쫒겨난 정예병사" + ChatColor.YELLOW + " [Lv.677]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(764000);
				entity.setHealth(764000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DARK_OAK_PLANKS);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(24);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3250));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob197(LivingEntity entity, Location loc) {
		// 원시의 땅3 1198 61 -1409  1299 120 -1518  
		if (loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1409 
				&& loc.getX() >= 1198 && loc.getY() >= 61 && loc.getZ() >= -1518) {
			Location chestLoc = new Location(entity.getWorld(), -1836, 92, 3050);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "반란을 두려워하는 귀족" + ChatColor.YELLOW + " [Lv.678]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(772000);
				entity.setHealth(772000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3300");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(25);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "귀족을 지키는 호위무사" + ChatColor.YELLOW + " [Lv.681]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(780000);
				entity.setHealth(780000);
				Husk z = (Husk) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.WHITE_CONCRETE_POWDER);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(26);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3350));
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
	
	public boolean mob198(LivingEntity entity, Location loc) {
		// 원시의 땅4 1165 120 -1519  1299 61 -1699
		if (loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1519 
				&& loc.getX() >= 1165 && loc.getY() >= 61 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "족장을 지키는 것" + ChatColor.YELLOW + " [Lv.682]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(788000);
				entity.setHealth(788000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3400");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BUBBLE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(0);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "족장의 벗" + ChatColor.YELLOW + " [Lv.685]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(796000);
				entity.setHealth(796000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3450));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.HUSK) {
				entity.setCustomName(ChatColor.GRAY + "족장 <바람을 가르는 늑대>" + ChatColor.YELLOW + " [Lv.690]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3200000);
				entity.setHealth(3200000);
				Husk z = (Husk) entity;
				z.setBaby(false);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.JUNGLE_PLANKS);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(1);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4500));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob199(LivingEntity entity, Location loc) {
		// 원시의 땅5 987 255 -1446  835 0 -1330
		if (loc.getX() <= 987 && loc.getY() <= 255 && loc.getZ() <= -1330 
				&& loc.getX() >= 835 && loc.getY() >= 0 && loc.getZ() >= -1446) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "야생 곰" + ChatColor.YELLOW + " [Lv.684]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(790000);
				entity.setHealth(790000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RABBIT) {
				entity.setCustomName(ChatColor.GRAY + "야생 토끼" + ChatColor.YELLOW + " [Lv.687]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(798000);
				entity.setHealth(798000);
				Rabbit r = (Rabbit) entity;
				r.setAdult();
				r.setRabbitType(Type.THE_KILLER_BUNNY);
				entity.setMaxHealth(798000);
				entity.setHealth(798000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3450));
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
	
	public boolean mob200(LivingEntity entity, Location loc) {
		// 원시의 땅6 1027 70 -1461  917 48 -1704
		if (loc.getX() <= 1027 && loc.getY() <= 70 && loc.getZ() <= -1461 
				&& loc.getX() >= 917 && loc.getY() >= 48 && loc.getZ() >= -1704) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				int num = rnd.nextInt(2);
				if(num == 0) {
					entity.setCustomName(ChatColor.GRAY + "변이된 원시의 땅 보초병" + ChatColor.YELLOW + " [Lv.688]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(806000);
					entity.setHealth(806000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("3500");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(2);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(100, 100, 30));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(100, 100, 30));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(100, 100, 30));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "변이된 원시의 땅 보초병" + ChatColor.YELLOW + " [Lv.690]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(814000);
					entity.setHealth(814000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.SPRUCE_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(2);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(100, 100, 30));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(100, 100, 30));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(100, 100, 30));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3550));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				}
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
	
	public boolean mob201(LivingEntity entity, Location loc) {
		// 원시의 땅7 739 90 -1699  1020 71 -1474
		if (loc.getX() <= 1020 && loc.getY() <= 90 && loc.getZ() <= -1474 
				&& loc.getX() >= 739 && loc.getY() >= 71 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				int num = rnd.nextInt(2);
				if(num == 0) {
					entity.setCustomName(ChatColor.GRAY + "변이된 원시의 땅 상급병" + ChatColor.YELLOW + " [Lv.691]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(822000);
					entity.setHealth(822000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.GREEN_CARPET);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(3);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3600));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "변이된 원시의 땅 정예병" + ChatColor.YELLOW + " [Lv.693]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(830000);
					entity.setHealth(830000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("3650");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_13);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(4);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				}
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
	
	public boolean mob202(LivingEntity entity, Location loc) {
		// 원시의 땅8 915 70 -1556  751 48 -1699
		if (loc.getX() <= 915 && loc.getY() <= 70 && loc.getZ() <= -1556 
				&& loc.getX() >= 751 && loc.getY() >= 48 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "변이된 원시의 땅 귀족" + ChatColor.YELLOW + " [Lv.685]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("3700");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_PIGSTEP);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(5);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3700));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "변이의 근원" + ChatColor.YELLOW + " [Lv.689]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1100000);
				entity.setHealth(1100000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3800));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.OCELOT) {
				entity.setCustomName(ChatColor.GRAY + "귀족의 벗" + ChatColor.YELLOW + " [Lv.695]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(1200000);
				entity.setHealth(1200000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob203(LivingEntity entity, Location loc) {
		// 원시의 땅9 834 255 -1330  743 0 -1538
		if (loc.getX() <= 834 && loc.getY() <= 255 && loc.getZ() <= -1330 
				&& loc.getX() >= 743 && loc.getY() >= 0 && loc.getZ() >= -1538) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GRAY + "미지의 땅을 지키는 것" + ChatColor.YELLOW + " [Lv.695]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(850000);
				entity.setHealth(850000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.DIAMOND_AXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DIAMOND_AXE);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3700));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.EVOKER) {
				entity.setCustomName(ChatColor.GRAY + "미지의 땅을 지키는 것" + ChatColor.YELLOW + " [Lv.699]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(900000);
				entity.setHealth(900000);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3800));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "가디언" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(300000);
				entity.setHealth(300000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
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
	
	public boolean mob204(LivingEntity entity, Location loc) {
		// 원시의 땅10 1149 255 -1509  936 91 -1699
		if (loc.getX() <= 1149 && loc.getY() <= 255 && loc.getZ() <= -1509 
				&& loc.getX() >= 936 && loc.getY() >= 91 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "변이된 첨예발톱" + ChatColor.YELLOW + " [Lv.694]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(840000);
				entity.setHealth(840000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.SPRUCE_LOG);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(6);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3700));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "최면을 거는 포보르" + ChatColor.YELLOW + " [Lv.697]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(850000);
				entity.setHealth(850000);
				Slime slime = (Slime) entity;
				slime.setSize(3);
				entity.setMaxHealth(850000);
				entity.setHealth(850000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3800));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "족장 <붉은 날개>" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.NETHERITE_AXE);
				ItemMeta mobBowIm = mobBowItem.getItemMeta();
				mobBowIm.setCustomModelData(7);
				mobBowItem.setItemMeta(mobBowIm);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(7);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5500));
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
	
	public boolean mob205(LivingEntity entity, Location loc) {
		// 원시의 땅 동굴1 941 47 -1608  1034 0 -1517
		if (loc.getX() <= 1034 && loc.getY() <= 47 && loc.getZ() <= -1517 
				&& loc.getX() >= 941 && loc.getY() >= 0 && loc.getZ() >= -1608) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "원시 벌레" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1200000);
				entity.setHealth(1200000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "원시 거미" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1220000);
				entity.setHealth(1220000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4300));
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
	
	public boolean mob206(LivingEntity entity, Location loc) {
		// 원시의 땅 동굴2 939 37 -1552  844 0 -1623
		if (loc.getX() <= 939 && loc.getY() <= 37 && loc.getZ() <= -1552 
				&& loc.getX() >= 844 && loc.getY() >= 0 && loc.getZ() >= -1623) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "원시 불꽃" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1240000);
				entity.setHealth(1240000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4400));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.MAGMA_CUBE) {
				entity.setCustomName(ChatColor.GRAY + "원시 생물" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1250000);
				entity.setHealth(1250000);
				MagmaCube magma = (MagmaCube) entity;
				magma.setSize(3);
				entity.setMaxHealth(1250000);
				entity.setHealth(1250000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4500));
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
	
	public boolean mob207(LivingEntity entity, Location loc) {
		// 하드숲 1번방 1번룸
		if (loc.getX() <= 3793 && loc.getY() <= 90 && loc.getZ() <= 4102 
				&& loc.getX() >= 3777 && loc.getY() >= 65 && loc.getZ() >= 4082) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(loc.getX() == 3782 && loc.getY() == 78 && loc.getZ() == 4090) {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(930000);
					entity.setHealth(930000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3750));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(930000);
					entity.setHealth(930000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("3750");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3750));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				}
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
	
	public boolean mob208(LivingEntity entity, Location loc) {
		// 하드숲 1번방 2번룸
		if (loc.getX() <= 3763 && loc.getY() <= 100 && loc.getZ() <= 4128 
				&& loc.getX() >= 3744 && loc.getY() >= 80 && loc.getZ() >= 4109) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(loc.getX() == 3750 && loc.getY() == 87 && loc.getZ() == 4123) {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(940000);
					entity.setHealth(940000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3800));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(940000);
					entity.setHealth(940000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("3800");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3800));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				}
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
	
	public boolean mob209(LivingEntity entity, Location loc) {
		// 하드숲 1번방 3번룸
		if (loc.getX() <= 3726 && loc.getY() <= 100 && loc.getZ() <= 4110 
				&& loc.getX() >= 3709 && loc.getY() >= 85 && loc.getZ() >= 4092) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(950000);
				entity.setHealth(950000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3850));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "숲의 젤리" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(960000);
				entity.setHealth(960000);
				Slime magma = (Slime) entity;
				magma.setSize(3);
				entity.setMaxHealth(960000);
				entity.setHealth(960000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3900));
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
	
	public boolean mob210(LivingEntity entity, Location loc) {
		// 하드숲 1번방 4번룸
		if (loc.getX() <= 3697 && loc.getY() <= 105 && loc.getZ() <= 4131 
				&& loc.getX() >= 3681 && loc.getY() >= 90 && loc.getZ() >= 4115) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(970000);
				entity.setHealth(970000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(8);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3950));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "숲의 고름" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(980000);
				entity.setHealth(980000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
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
	
	public boolean mob211(LivingEntity entity, Location loc) {
		// 하드숲 2번방 1층
		if (loc.getX() <= 3645 && loc.getY() <= 111 && loc.getZ() <= 4148 
				&& loc.getX() >= 3596 && loc.getY() >= 85 && loc.getZ() >= 4098) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SILVERFISH) {
				entity.setCustomName(ChatColor.GRAY + "숲의 고름" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(980000);
				entity.setHealth(980000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
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
	
	public boolean mob212(LivingEntity entity, Location loc) {
		// 하드숲 2번방 2층
		if (loc.getX() <= 3769 && loc.getY() <= 160 && loc.getZ() <= 4133 
				&& loc.getX() >= 3665 && loc.getY() >= 125 && loc.getZ() >= 4073) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(990000);
					entity.setHealth(990000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.JUNGLE_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4050));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "숲의 감시자" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(990000);
					entity.setHealth(990000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("4050");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(8);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4050));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
					return true;
				}
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
	
	public boolean mob213(LivingEntity entity, Location loc) {
		// 하드숲 2번방 3층
		if (loc.getX() <= 3645 && loc.getY() <= 155 && loc.getZ() <= 4148 
				&& loc.getX() >= 3596 && loc.getY() >= 135 && loc.getZ() >= 4098) {
			if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "숲의 거목" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4100));
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
	
	public boolean mob214(LivingEntity entity, Location loc) {
		// 하드숲 중간보스
		if (loc.getX() <= 3751 && loc.getY() <= 105 && loc.getZ() <= 4184 
				&& loc.getX() >= 3727 && loc.getY() >= 85 && loc.getZ() >= 4156) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "숲의 심판자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000000);
				entity.setHealth(4000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.NETHERITE_HELMET);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.VEX) {
				entity.setCustomName(ChatColor.GRAY + "숲의 정령" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(900000);
				entity.setHealth(900000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "숲의 심판자" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000000);
				entity.setHealth(4000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8000));
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
	
	public boolean mob215(LivingEntity entity, Location loc) {
		// 하드숲 보스
		if (loc.getX() <= 3699 && loc.getY() <= 230 && loc.getZ() <= 4217 
				&& loc.getX() >= 3657 && loc.getY() >= 180 && loc.getZ() >= 4172) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "유적의 주인?" + ChatColor.YELLOW + " [Lv.10000]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(100000000);
				entity.setHealth(100000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.NETHERITE_HELMET);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "주인의 알" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(500000);
				entity.setHealth(500000);
				Slime magma = (Slime) entity;
				magma.setSize(2);
				entity.setMaxHealth(500000);
				entity.setHealth(500000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3000));
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
	
	public boolean mob216(LivingEntity entity, Location loc) {
		// 이베르모어1  555 50 -1700  707 125 -1324
		if (loc.getX() <= 707 && loc.getY() <= 125 && loc.getZ() <= -1324 
				&& loc.getX() >= 555 && loc.getY() >= 50 && loc.getZ() >= -1700) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "얼어붙은 나무" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(870000);
				entity.setHealth(870000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(9);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(100, 80, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(100, 80, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(100, 80, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3900));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 100));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "상급 파괴수" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(880000);
				entity.setHealth(880000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 3950));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.STRAY) {
				entity.setCustomName(ChatColor.GRAY + "얼어붙은 시체" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(890000);
				entity.setHealth(890000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("4100");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4000));
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
	
	public boolean mob217(LivingEntity entity, Location loc) {
		// 이베르모어2  566 36 -1611  518 1 -1684
		if (loc.getX() <= 566 && loc.getY() <= 36 && loc.getZ() <= -1611 
				&& loc.getX() >= 518 && loc.getY() >= 1 && loc.getZ() >= -1684) {
			if (entity.getType() == (EntityType) EntityType.CAVE_SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "성스러운 거미" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(900000);
				entity.setHealth(900000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4050));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.BLAZE) {
				entity.setCustomName(ChatColor.GRAY + "성스러운 불꽃" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(910000);
				entity.setHealth(910000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4100));
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
	
	public boolean mob218(LivingEntity entity, Location loc) {
		// 이베르모어3  406 47 -1206  554 156 -1697
		if (loc.getX() <= 554 && loc.getY() <= 156 && loc.getZ() <= -1206 
				&& loc.getX() >= 406 && loc.getY() >= 47 && loc.getZ() >= -1697) {
			if (entity.getType() == (EntityType) EntityType.POLAR_BEAR) {
				entity.setCustomName(ChatColor.GRAY + "떠돌이 나비" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(920000);
				entity.setHealth(920000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4150));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOGLIN) {
				entity.setCustomName(ChatColor.GRAY + "동상에 걸린 돼지" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(930000);
				entity.setHealth(930000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "설원 거미" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(930000);
				entity.setHealth(930000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4200));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob219(LivingEntity entity, Location loc) {
		// 이베르모어4  346 46 -1177  410 5 -1699
		if (loc.getX() <= 410 && loc.getY() <= 46 && loc.getZ() <= -1177 
				&& loc.getX() >= 346 && loc.getY() >= 5 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				if(rnd.nextInt(2) == 0) {
					entity.setCustomName(ChatColor.GRAY + "인간 사냥꾼" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(940000);
					entity.setHealth(940000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BOW);
					ItemMeta im = weaponItem.getItemMeta();
					im.setLocalizedName("5000");
					weaponItem.setItemMeta(im);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.CROSSBOW);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(10);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5000));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				} else {
					entity.setCustomName(ChatColor.GRAY + "인간 사냥꾼" + ChatColor.YELLOW + " [Lv.700]");
					entity.setCustomNameVisible(true);
					entity.setMaxHealth(940000);
					entity.setHealth(940000);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment mobBow = entity.getEquipment();
					ItemStack mobBowItem = new ItemStack(Material.STONE_BRICK_SLAB);
					mobBow.setItemInOffHand(mobBowItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(10);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5000));
					entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
					return true;
				}
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
	
	public boolean mob220(LivingEntity entity, Location loc) {
		// 이베르모어5  411 40 -1574  454 5 -1682
		if (loc.getX() <= 454 && loc.getY() <= 40 && loc.getZ() <= -1574 
				&& loc.getX() >= 411 && loc.getY() >= 5 && loc.getZ() >= -1682) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.RABBIT) {
				entity.setCustomName(ChatColor.GRAY + "웨곤" + ChatColor.YELLOW + " [Lv.700]");
				entity.setCustomNameVisible(true);
				entity.setRemoveWhenFarAway(true);
				entity.setMaxHealth(950000);
				entity.setHealth(950000);
				Rabbit r = (Rabbit) entity;
				r.setAdult();
				r.setRabbitType(Type.THE_KILLER_BUNNY);
				entity.setMaxHealth(950000);
				entity.setHealth(950000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4300));
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
	
	public boolean mob221(LivingEntity entity, Location loc) {
		// 산타섬1  -2750 94 -1030  -2636 30 -901
		if (loc.getX() <= -2636 && loc.getY() <= 100 && loc.getZ() <= -901 
				&& loc.getX() >= -2750 && loc.getY() >= 30 && loc.getZ() >= -1030) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "섬을 탈출하고 싶은 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.WOODEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob222(LivingEntity entity, Location loc) {
		// 산타섬2  -2694 100 -1031  -2566 30 -1100
		if (loc.getX() <= -2566 && loc.getY() <= 100 && loc.getZ() <= -1031 
				&& loc.getX() >= -2694 && loc.getY() >= 30 && loc.getZ() >= -1100) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "섬을 탈출하고 싶은 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1000000);
				entity.setHealth(1000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.WOODEN_PICKAXE);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(11);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.CHAINMAIL_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "노예를 관리하는 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(1500000);
				entity.setHealth(1500000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.FISHING_ROD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(12);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.IRON_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.IRON_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.IRON_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob223(LivingEntity entity, Location loc) {
		// 산타섬3  -2565 120 -1086  -2475 80 -945
		if (loc.getX() <= -2475 && loc.getY() <= 120 && loc.getZ() <= -945 
				&& loc.getX() >= -2565 && loc.getY() >= 80 && loc.getZ() >= -1086) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.VINDICATOR) {
				entity.setCustomName(ChatColor.GRAY + "마을을 꾸미고 있는 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STRIPPED_DARK_OAK_WOOD);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob224(LivingEntity entity, Location loc) {
		//산타섬4  -2589 103 -926  -2543 90 -885
		if (loc.getX() <= -2543 && loc.getY() <= 103 && loc.getZ() <= -885 
				&& loc.getX() >= -2589 && loc.getY() >= 90 && loc.getZ() >= -926) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산타를 보좌하는 요정 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("10");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_STRAD);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(13);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 255, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.RAVAGER) {
				entity.setCustomName(ChatColor.GRAY + "살아남은 루돌프" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(7000000);
				entity.setHealth(7000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "산타" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10000000);
				entity.setHealth(10000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.STONE_STAIRS);
				ItemMeta im = weaponItem.getItemMeta();
				im.setCustomModelData(1);
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(14);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob225(LivingEntity entity, Location loc) {
		// 산타섬5  -2545 79 -903  -2608 50 -998
		if (loc.getX() <= -2545 && loc.getY() <= 79 && loc.getZ() <= -903 
				&& loc.getX() >= -2608 && loc.getY() >= 50 && loc.getZ() >= -998) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "반란을 계획중인 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.ACACIA_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "반란을 계획중인 노예" + ChatColor.YELLOW + " [Lv.??]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(5000000);
				entity.setHealth(5000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("10");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_HORN_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(15);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.GOLDEN_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.GOLDEN_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.GOLDEN_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 100));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
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
	
	public boolean mob226(LivingEntity entity, Location loc) {
		// 라스트 이베르모어1 357 137 -1302  98 173 -1699
		if (loc.getX() <= 357 && loc.getY() <= 200 && loc.getZ() <= -1302 
				&& loc.getX() >= 98 && loc.getY() >= 5 && loc.getZ() >= -1699) {
			Location chestLoc = new Location(entity.getWorld(), -1838, 92, 3051);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "존재하면 안되는 존재" + ChatColor.YELLOW + " [Lv.1000]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("24000");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_STRAD);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(16);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
				LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
				chestmeta.setColor(Color.fromRGB(255, 0, 0));
				chestplateItem.setItemMeta(chestmeta);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
				LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
				leggingsmeta.setColor(Color.fromRGB(0, 255, 0));
				leggingsItem.setItemMeta(leggingsmeta);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
				LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
				bootsmeta.setColor(Color.fromRGB(255, 0, 0));
				bootsItem.setItemMeta(bootsmeta);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 24000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 3));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SLIME) {
				entity.setCustomName(ChatColor.GRAY + "게임의 오류" + ChatColor.YELLOW + " [Lv.1000]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				Slime slime = (Slime) entity;
				slime.setSize(4);
				entity.setMaxHealth(3000000);
				entity.setHealth(3000000);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 26000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.WITHER_SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "^(!$@#!" + ChatColor.YELLOW + " [Lv.1000]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(4000000);
				entity.setHealth(4000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.OBSIDIAN);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = chest.getInventory().getItem(17);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.NETHERITE_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.NETHERITE_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.NETHERITE_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 27000));
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "어둠을 구원한 영웅" + ChatColor.YELLOW + " [Lv.1000]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(20000000);
				entity.setHealth(20000000);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
				ItemMeta mobBowIm = mobBowItem.getItemMeta();
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment head = entity.getEquipment();
				ItemStack headItem = new ItemStack(Material.DIAMOND_HELMET);
				head.setHelmet(headItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.DIAMOND_CHESTPLATE);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.DIAMOND_LEGGINGS);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.DIAMOND_BOOTS);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 30000));
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

	public boolean mob227(LivingEntity entity, Location loc) {
		// 지하광산 1200 600  700 0
		if (loc.getX() <= 1200 && loc.getY() <= -1 && loc.getZ() <= 600 
				&& loc.getX() >= 700 && loc.getY() >= -100 && loc.getZ() >= 0) {
			if (entity.getType() == (EntityType) EntityType.ZOMBIE) {
				entity.setCustomName(ChatColor.GRAY + "AFK" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10);
				entity.setHealth(10);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.AIR);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SKELETON) {
				entity.setCustomName(ChatColor.GRAY + "매크로 처리반" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10);
				entity.setHealth(10);
				EntityEquipment weapon = entity.getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("1");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = entity.getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.BOW);
				mobBow.setItemInOffHand(mobBowItem);
				EntityEquipment helmet = entity.getEquipment();
				ItemStack helmetItem = new ItemStack(Material.AIR);
				helmet.setHelmet(helmetItem);
				EntityEquipment chestplate = entity.getEquipment();
				ItemStack chestplateItem = new ItemStack(Material.AIR);
				chestplate.setChestplate(chestplateItem);
				EntityEquipment leggings = entity.getEquipment();
				ItemStack leggingsItem = new ItemStack(Material.AIR);
				leggings.setLeggings(leggingsItem);
				EntityEquipment boots = entity.getEquipment();
				ItemStack bootsItem = new ItemStack(Material.AIR);
				boots.setBoots(bootsItem);
				return true;
			} else if (entity.getType() == (EntityType) EntityType.SPIDER) {
				entity.setCustomName(ChatColor.GRAY + "잠수부 킬러" + ChatColor.YELLOW + " [Lv.1]");
				entity.setCustomNameVisible(true);
				entity.setMaxHealth(10);
				entity.setHealth(10);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1));
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
	
	public boolean mob228(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob229(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob230(LivingEntity entity, Location loc) {
		return true;
	}

	public boolean mob231(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob232(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob233(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob234(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob235(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob236(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob237(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob238(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob239(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob240(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob241(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob242(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob243(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob244(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob245(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob246(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob247(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob248(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob249(LivingEntity entity, Location loc) {
		return true;
	}
	
	public boolean mob250(LivingEntity entity, Location loc) {
		return true;
	}
	
}
