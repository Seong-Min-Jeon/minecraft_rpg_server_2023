package testPack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class MobThread implements Listener{

	private Player player = null;
	int sleep;
	Random rnd = new Random();
	GoldenPlayer gp = new GoldenPlayer();

	public MobThread(Player player) {
		
		this.player = player;

		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;

			@Override
			public void run() {

				Location loc = player.getLocation();
				
				if(!player.isOnline()) {
					Bukkit.getScheduler().cancelTask(sleep);
				}
				
				if(loc.getBlock().getType() != Material.WATER) {
					
					if ((time % 80 == 10) || (time % 40 == 10 && gp.returnTime(player) != 0)) {
						
						// 키어컬의 발걸음 사용 중일 때
						if(gp.returnTime(player) > 150) {
							gp.remove(player);
							player.sendMessage(ChatColor.GREEN + "더이상 키어컬의 발걸음이 느껴지지 않습니다.");
						} else {
							gp.addTime(player);
						}
						
						// 주변에 몹이 많은가
						Boolean less = true;
						int cnt = 0;
						List<Entity> list = player.getNearbyEntities(30, 20, 30);
						for(Entity ent : list) {
							if(ent instanceof Monster) {
								cnt++;
							}
						}
						if(cnt > 35) {
							less = false;
						}
						
						// 몹 스폰이 안되는 지형인가
						Boolean edge = false;
						if((loc.clone().add(1, -2, 0).getBlock().getType() != Material.AIR) && (loc.clone().add(-1, -2, 0).getBlock().getType() != Material.AIR)
								&& (loc.clone().add(0, -2, 1).getBlock().getType() != Material.AIR) && (loc.clone().add(0, -2, -1).getBlock().getType() != Material.AIR)) {
							edge = true;
						} else if(loc.clone().add(0, -1, 0).getBlock().getType() == Material.AIR) {
							if(loc.clone().add(0, -2, 0).getBlock().getType() != Material.AIR) {
								edge = true;
							}
						}
						if(edge && less) {
							if (loc.getX() <= 3974 && loc.getY() <= 173 && loc.getZ() <= 3870 
									&& loc.getX() >= 3924 && loc.getY() >= 160 && loc.getZ() >= 3847) {
								tutozone(player, loc);
							} else if (loc.getX() <= -1833 && loc.getY() <= 60 && loc.getZ() <= 3107 && loc.getX() >= -1882
									&& loc.getY() >= 50 && loc.getZ() >= 3068) {
								greenSlime(player, loc);
							} else if(loc.getX() <= -1887 && loc.getY() <= 56 && loc.getZ() <= 3068 && loc.getX() >= -1946
									&& loc.getY() >= 45 && loc.getZ() >= 2986) {
								coastZombie(player, loc);
							} else if(loc.getX() <= -1786 && loc.getY() <= 57 && loc.getZ() <= 3094 && loc.getX() >= -1820
									&& loc.getY() >= 50 && loc.getZ() >= 3061) {
								wargunilSkel(player, loc);
							} else if(loc.getX() <= -1960 && loc.getY() <= 60 && loc.getZ() <= 2954 && loc.getX() >= -1980
									&& loc.getY() >= 52 && loc.getZ() >= 2947) {
								wargunilSea(player, loc);
							} else if(loc.getX() <= -1870 && loc.getY() <= 80 && loc.getZ() <= 2694 && loc.getX() >= -1925
									&& loc.getY() >= 45 && loc.getZ() >= 2635) {
								forestGhost(player, loc);
							} else if(loc.getX() <= -1882 && loc.getY() <= 77 && loc.getZ() <= 2617 && loc.getX() >= -1938
									&& loc.getY() >= 45 && loc.getZ() >= 2596) {
								crystalWarrior(player, loc);
							} else if(loc.getX() <= -1788 && loc.getY() <= 65 && loc.getZ() <= 2570 && loc.getX() >= -1822
									&& loc.getY() >= 50 && loc.getZ() >= 2535) {
								woodFairy(player, loc);
							} else if(loc.getX() <= 3713 && loc.getY() <= 23 && loc.getZ() <= 3765 && loc.getX() >= 3703
									&& loc.getY() >= 15 && loc.getZ() >= 3756) {
								turtleWarrior(player, loc);
							} else if(loc.getX() <= -1830 && loc.getY() <= 100 && loc.getZ() <= 2472 && loc.getX() >= -1964
									&& loc.getY() >= 40 && loc.getZ() >= 2324) {
								vindicator(player, loc);
							} else if(loc.getX() <= -1936 && loc.getY() <= 100 && loc.getZ() <= 2686 && loc.getX() >= -2143
									&& loc.getY() >= 30 && loc.getZ() >= 2444) {
								forganWestForest(player, loc);
							} else if(loc.getX() <= -1913 && loc.getY() <= 100 && loc.getZ() <= 2354 && loc.getX() >= -2121
									&& loc.getY() >= 30 && loc.getZ() >= 2271) {
								mountainThief(player, loc);
							} else if(loc.getX() <= 3532 && loc.getY() <= 30 && loc.getZ() <= 3773 && loc.getX() >= 3447
									&& loc.getY() >= 10 && loc.getZ() >= 3690) {
								forestRuins(player, loc);
							} else if(loc.getX() <= -1436 && loc.getY() <= 200 && loc.getZ() <= 2410 && loc.getX() >= -1753
									&& loc.getY() >= 40 && loc.getZ() >= 1983) {
								senMag1(player, loc);
							} else if(loc.getX() <= -804 && loc.getY() <= 90 && loc.getZ() <= 2464 && loc.getX() >= -1436
									&& loc.getY() >= 50 && loc.getZ() >= 1812) {
								senMag2(player, loc);
							} else if(loc.getX() <= -1027 && loc.getY() <= 42 && loc.getZ() <= 2365 && loc.getX() >= -1096
									&& loc.getY() >= 3 && loc.getZ() >= 2246) {
								partholon(player, loc);
							} else if(loc.getX() <= -568 && loc.getY() <= 60 && loc.getZ() <= 1993 && loc.getX() >= -642
									&& loc.getY() >= 40 && loc.getZ() >= 1881) {
								tiruCoast(player, loc);
							} else if(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 && loc.getX() >= 3481
									&& loc.getY() >= 5 && loc.getZ() >= 3837) {
								mineDun1(player, loc);
							} else if(loc.getX() <= -712 && loc.getY() <= 88 && loc.getZ() <= 1800 && loc.getX() >= -1051
									&& loc.getY() >= 40 && loc.getZ() >= 1562) {
								tiruField(player, loc);
							} else if(loc.getX() <= -539 && loc.getY() <= 88 && loc.getZ() <= 1819 
									&& loc.getX() >= -726 && loc.getY() >= 40 && loc.getZ() >= 1612) {
								tiruField2(player, loc);
							} else if(loc.getX() <= -930 && loc.getY() <= 39 && loc.getZ() <= 1966 && loc.getX() >= -1049
									&& loc.getY() >= 3 && loc.getZ() >= 1804) {
								seedFrontCave(player, loc);
							} else if(loc.getX() <= -499 && loc.getY() <= 89 && loc.getZ() <= 1542 && loc.getX() >= -719
									&& loc.getY() >= 35 && loc.getZ() >= 1387) {
								toMiyu(player, loc);
							} else if(loc.getX() <= -538 && loc.getY() <= 34 && loc.getZ() <= 1541 && loc.getX() >= -610
									&& loc.getY() >= 10 && loc.getZ() >= 1487) {
								toMiyuCoastCave(player, loc);
							} else if(loc.getX() <= -970 && loc.getY() <= 55 && loc.getZ() <= 1653 && loc.getX() >= -1020
									&& loc.getY() >= 32 && loc.getZ() >= 1575) {
								toMiyuCave(player, loc);
							} else if(loc.getX() <= -919 && loc.getY() <= 109 && loc.getZ() <= 1465 && loc.getX() >= -997
									&& loc.getY() >= 59 && loc.getZ() >= 1291) {
								miyu1(player, loc);
							} else if(loc.getX() <= -962 && loc.getY() <= 109 && loc.getZ() <= 1289 && loc.getX() >= -1030
									&& loc.getY() >= 59 && loc.getZ() >= 1203) {
								miyu2(player, loc);
							} else if(loc.getX() <= -1005 && loc.getY() <= 109 && loc.getZ() <= 1204 && loc.getX() >= -1116
									&& loc.getY() >= 59 && loc.getZ() >= 1095) {
								miyu3(player, loc);
							} else if(loc.getX() <= -1118 && loc.getY() <= 109 && loc.getZ() <= 1312 && loc.getX() >= -1182
									&& loc.getY() >= 59 && loc.getZ() >= 1140) {
								miyu4(player, loc);
							} else if(loc.getX() <= -1187 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1233
									&& loc.getY() >= 59 && loc.getZ() >= 1273) {
								miyu5(player, loc);
							} else if(loc.getX() <= -1234 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1290
									&& loc.getY() >= 59 && loc.getZ() >= 1311) {
								miyu6(player, loc);
							} else if(loc.getX() <= -646 && loc.getY() <= 95 && loc.getZ() <= 1380 && loc.getX() >= -750
									&& loc.getY() >= 55 && loc.getZ() >= 1277) {
								miyuGY(player, loc);
							} else if(loc.getX() <= -1314 && loc.getY() <= 48 && loc.getZ() <= 2082 
									&& loc.getX() >= -1579 && loc.getY() >= 0 && loc.getZ() >= 1745) {
								valley(player, loc);
							} else if(loc.getX() <= -685 && loc.getY() <= 160 && loc.getZ() <= 1274 
									&& loc.getX() >= -946 && loc.getY() >= 56 && loc.getZ() >= 924) {
								miyuEast(player, loc);
							} else if(loc.getX() <= -960 && loc.getY() <= 75 && loc.getZ() <= 990 
									&& loc.getX() >= -1277 && loc.getY() >= 45 && loc.getZ() >= 871) {
								miyuNorth(player, loc);
							} else if(loc.getX() <= -1323 && loc.getY() <= 100 && loc.getZ() <= 1513 
									&& loc.getX() >= -1639 && loc.getY() >= 35 && loc.getZ() >= 1105) {
								miyuWest1(player, loc);
							} else if(loc.getX() <= -1200 && loc.getY() <= 100 && loc.getZ() <= 1235 
									&& loc.getX() >= -1420 && loc.getY() >= 40 && loc.getZ() >= 1142) {
								miyuWest2(player, loc);
							} else if(loc.getX() <= -360 && loc.getY() <= 100 && loc.getZ() <= 1225 
									&& loc.getX() >= -684 && loc.getY() >= 45 && loc.getZ() >= 1007) {
								kaimanNorth1(player, loc);
							} else if(loc.getX() <= -429 && loc.getY() <= 80 && loc.getZ() <= 1571 
									&& loc.getX() >= -560 && loc.getY() >= 40 && loc.getZ() >= 1376) {
								toKaiman(player, loc);
							} else if(loc.getX() <= 48 && loc.getY() <= 98 && loc.getZ() <= 1238 
									&& loc.getX() >= -356 && loc.getY() >= 40 && loc.getZ() >= 1136) {
								kaimanNorth2(player, loc);
							} else if(loc.getX() <= 67 && loc.getY() <= 98 && loc.getZ() <= 1132 
									&& loc.getX() >= -72 && loc.getY() >= 40 && loc.getZ() >= 1010) {
								kaimanNorth3(player, loc);
							} else if(loc.getX() <= -382 && loc.getY() <= 106 && loc.getZ() <= 1001 
									&& loc.getX() >= -497 && loc.getY() >= 40 && loc.getZ() >= 888) {
								kaimanNorth4(player, loc);
							} else if(loc.getX() <= -532 && loc.getY() <= 90 && loc.getZ() <= 990 
									&& loc.getX() >= -658 && loc.getY() >= 60 && loc.getZ() >= 852) {
								devilPortal(player, loc);
							} else if(loc.getX() <= -49 && loc.getY() <= 150 && loc.getZ() <= 1130 
									&& loc.getX() >= -336 && loc.getY() >= 10 && loc.getZ() >= 791) {
								middleValley(player, loc);
							} else if(loc.getX() <= 3788 && loc.getY() <= 60 && loc.getZ() <= 3482 
									&& loc.getX() >= 3707 && loc.getY() >= 30 && loc.getZ() >= 3296) {
								fairyDungeon(player, loc);
							} else if(loc.getX() <= -1789 && loc.getY() <= 200 && loc.getZ() <= 931 
									&& loc.getX() >= -2964 && loc.getY() >= 30 && loc.getZ() >= 443) {
								aranmore(player, loc);
							} else if(loc.getX() <= 3753 && loc.getY() <= 62 && loc.getZ() <= 3232 
									&& loc.getX() >= 3639 && loc.getY() >= 12 && loc.getZ() >= 3182) {
								aranmoreDun1(player, loc);
							} else if(loc.getX() <= 3749 && loc.getY() <= 91 && loc.getZ() <= 3225 
									&& loc.getX() >= 3644 && loc.getY() >= 70 && loc.getZ() >= 3184) {
								aranmoreDun2(player, loc);
							} else if(loc.getX() <= -616 && loc.getY() <= 94 && loc.getZ() <= 871 
									&& loc.getX() >= -897 && loc.getY() >= 43 && loc.getZ() >= 699) {
								swampSlime1(player, loc);
							} else if(loc.getX() <= -810 && loc.getY() <= 94 && loc.getZ() <= 693 
									&& loc.getX() >= -970 && loc.getY() >= 43 && loc.getZ() >= 602) {
								swampSlime2(player, loc);
							} else if(loc.getX() <= -313 && loc.getY() <= 103 && loc.getZ() <= 691 
									&& loc.getX() >= -795 && loc.getY() >= 45 && loc.getZ() >= 311) {
								swampSpider(player, loc);
							} else if(loc.getX() <= -888 && loc.getY() <= 109 && loc.getZ() <= 572 
									&& loc.getX() >= -1238 && loc.getY() >= 43 && loc.getZ() >= 167) {
								swampWater(player, loc);
							} else if(loc.getX() <= -868 && loc.getY() <= 115 && loc.getZ() <= 166 
									&& loc.getX() >= -1156 && loc.getY() >= 47 && loc.getZ() >= 27) {
								swampNorthEast1(player, loc);
							} else if(loc.getX() <= -869 && loc.getY() <= 109 && loc.getZ() <= -41 
									&& loc.getX() >= -974 && loc.getY() >= 47 && loc.getZ() >= -222) {
								swampNorthEast2(player, loc);
							} else if(loc.getX() <= 3424 && loc.getY() <= 40 && loc.getZ() <= 3826 
									&& loc.getX() >= 3390 && loc.getY() >= 11 && loc.getZ() >= 3783) {
								senMansion1(player, loc);
							} else if(loc.getX() <= 3386 && loc.getY() <= 16 && loc.getZ() <= 3759 
								&& loc.getX() >= 3348 && loc.getY() >= 11 && loc.getZ() >= 3721) {
								senMansion2(player, loc);
							} else if(loc.getX() <= 3388 && loc.getY() <= 37 && loc.getZ() <= 3827 
									&& loc.getX() >= 3354 && loc.getY() >= 13 && loc.getZ() >= 3803) {
								senMansion3(player, loc);
							} else if(loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 
									&& loc.getX() >= 3355 && loc.getY() >= 11 && loc.getZ() >= 3766) {
								senMansion4(player, loc);
							} else if(loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
									&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150) {
								puru1(player, loc);
							} else if(loc.getX() <= -124 && loc.getY() <= 115 && loc.getZ() <= 149 
									&& loc.getX() >= -408 && loc.getY() >= 41 && loc.getZ() >= -263) {
								puru2(player, loc);
							} else if(loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
									&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37) {
								puru3(player, loc);
							} else if(loc.getX() <= 29 && loc.getY() <= 115 && loc.getZ() <= 27 
									&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= -208) {
								puru4(player, loc);
							} else if(loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
									&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366) {
								puru5(player, loc);
							} else if(loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
									&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19) {
								puru6(player, loc);
							} else if(loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
									&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421) {
								puru7(player, loc);
							} else if(loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
									loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568) {
								beiagSeaCave(player, loc);
							} else if(loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
									loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401) {
								swampCave(player, loc);
							} else if(loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
									loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323) {
								beiagBreakVil(player, loc);
							} else if(loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
									&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580) {
								necroValley(player, loc);
							} else if(loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
									&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466) {
								puruCave(player, loc);
							} else if(loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
									&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184) {
								dungeon(player, loc);
							} else if(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
									&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489) {
								magicTower1(player, loc);
							} else if(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
									&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700) {
								magicTower2(player, loc);
							} else if(loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
									&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502) {
								magicTower3(player, loc);
							} else if(loc.getX() <= 96 && loc.getY() <= 62 && loc.getZ() <= 695 
									&& loc.getX() >= 50 && loc.getY() >= 53 && loc.getZ() >= 615) {
								darkMaze(player, loc);
							} else if(loc.getX() <= 625 && loc.getY() <= 200 && loc.getZ() <= 887 && 
									loc.getX() >= 493 && loc.getY() >= 40 && loc.getZ() >= 389) {
								castleWest(player, loc);
							} else if(loc.getX() <= 810 && loc.getY() <= 150 && loc.getZ() <= 891 && 
									loc.getX() >= 627 && loc.getY() >= 45 && loc.getZ() >= 661) {
								castleSouth(player, loc);
							} else if(loc.getX() <= 967 && loc.getY() <= 150 && loc.getZ() <= 656 && 
									loc.getX() >= 758 && loc.getY() >= 45 && loc.getZ() >= 620) {
								castleSouthEast(player, loc);
							} else if(loc.getX() <= 1105 && loc.getY() <= 104 && loc.getZ() <= 895 && 
									loc.getX() >= 908 && loc.getY() >= 40 && loc.getZ() >= 747) {
								castleNearVil(player, loc);
							} else if(loc.getX() <= 901 && loc.getY() <= 80 && loc.getZ() <= 911 && 
									loc.getX() >= 819 && loc.getY() >= 50 && loc.getZ() >= 774) {
								castleNearVilNearGround(player, loc);
							} else if(loc.getX() <= 847 && loc.getY() <= 57 && loc.getZ() <= 739 && 
									loc.getX() >= 777 && loc.getY() >= 29 && loc.getZ() >= 683) {
								castleNearVilNearCave(player, loc);
							} else if(loc.getX() <= 782 && loc.getY() <= 56 && loc.getZ() <= 633 
									&& loc.getX() >= 699 && loc.getY() >= 34 && loc.getZ() >= 551) {
								aracunePhan(player, loc);
							} else if(loc.getX() <= 759 && loc.getY() <= 30 && loc.getZ() <= 588 
									&& loc.getX() >= 741 && loc.getY() >= 5 && loc.getZ() >= 570) {
								aracuneSpi(player, loc);
							} else if(loc.getX() <= 744 && loc.getY() <= 120 && loc.getZ() <= 659 && 
									loc.getX() >= 710 && loc.getY() >= 60 && loc.getZ() >= 617) {
								sumukwon(player, loc);
							} else if(loc.getX() <= 718 && loc.getY() <= 75 && loc.getZ() <= 617 && 
									loc.getX() >= 675 && loc.getY() >= 65 && loc.getZ() >= 566) {
								castle1F(player, loc);
							} else if(loc.getX() <= 712 && loc.getY() <= 91 && loc.getZ() <= 609 && 
									loc.getX() >= 668 && loc.getY() >= 82 && loc.getZ() >= 566) {
								castle2F(player, loc);
							} else if(loc.getX() <= 713 && loc.getY() <= 116 && loc.getZ() <= 605 && 
									loc.getX() >= 672 && loc.getY() >= 100 && loc.getZ() >= 572) {
								castle3F(player, loc);
							} else if(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 165 && 
									loc.getX() >= 695 && loc.getY() >= 40 && loc.getZ() >= 6) {
								wheatEast(player, loc);
							} else if(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 415 && 
									loc.getX() >= 695 && loc.getY() >= 50 && loc.getZ() >= 167) {
								kleahWest(player, loc);
							} else if(loc.getX() <= 1082 && loc.getY() <= 165 && loc.getZ() <= 312 && 
									loc.getX() >= 901 && loc.getY() >= 60 && loc.getZ() >= 248) {
								kleah1(player, loc);
							} else if(loc.getX() <= 1072 && loc.getY() <= 165 && loc.getZ() <= 247 && 
									loc.getX() >= 904 && loc.getY() >= 60 && loc.getZ() >= 110) {
								kleah2(player, loc);
							} else if(loc.getX() <= 1068 && loc.getY() <= 100 && loc.getZ() <= 480 && 
									loc.getX() >= 860 && loc.getY() >= 50 && loc.getZ() >= 419) {
								kleahSouth(player, loc);
							} else if(loc.getX() <= 1164 && loc.getY() <= 100 && loc.getZ() <= 679 && 
									loc.getX() >= 1076 && loc.getY() >= 40 && loc.getZ() >= 348) {
								kleahSouthEast(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 96 && loc.getZ() <= 1035 && 
									loc.getX() >= 1106 && loc.getY() >= 37 && loc.getZ() >= 675) {
								castleNearVilEast(player, loc);
							} else if(loc.getX() <= 1060 && loc.getY() <= 54 && loc.getZ() <= 298 && 
									loc.getX() >= 1009 && loc.getY() >= 36 && loc.getZ() >= 254) {
								kleahBase1(player, loc);
							} else if(loc.getX() <= 1030 && loc.getY() <= 55 && loc.getZ() <= 214 
									&& loc.getX() >= 912 && loc.getY() >= 18 && loc.getZ() >= 142) {
								kleahBase2(player, loc);
							} else if(loc.getX() <= -1090 && loc.getY() <= 5 && loc.getZ() <= 2302 
									&& loc.getX() >= -1112 && loc.getY() >= 0 && loc.getZ() >= 2281) {
								partholonBase(player, loc);
							} else if(loc.getX() <= 911 && loc.getY() <= 33 && loc.getZ() <= 36 
									&& loc.getX() >= 768 && loc.getY() >= 0 && loc.getZ() >= -153) {
								kleahLavaCave1(player, loc);
							} else if(loc.getX() <= 811 && loc.getY() <= 90 && loc.getZ() <= -64 
									&& loc.getX() >= 779 && loc.getY() >= 38 && loc.getZ() >= -96) {
								kleahLavaCave2(player, loc);
							} else if(loc.getX() <= 532 && loc.getY() <= 255 && loc.getZ() <= 1267 
									&& loc.getX() >= 120 && loc.getY() >= 0 && loc.getZ() >= 1029) {
								desert1(player, loc);
							} else if(loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 1657 
									&& loc.getX() >= -161 && loc.getY() >= 47 && loc.getZ() >= 1268) {
								desert2(player, loc);
							} else if(loc.getX() <= 599 && loc.getY() <= 46 && loc.getZ() <= 1657 
									&& loc.getX() >= -161 && loc.getY() >= 0 && loc.getZ() >= 1268) {
								desert3(player, loc);
							} else if(loc.getX() <= 599 && loc.getY() <= 106 && loc.getZ() <= 2617 
									&& loc.getX() >= 230 && loc.getY() >= 0 && loc.getZ() >= 1795) {
								desert4(player, loc);
							} else if(loc.getX() <= 599 && loc.getY() <= 180 && loc.getZ() <= 2617 
									&& loc.getX() >= 230 && loc.getY() >= 107 && loc.getZ() >= 1795) {
								desert5(player, loc);
							} else if(loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 2617 
									&& loc.getX() >= 230 && loc.getY() >= 181 && loc.getZ() >= 1795) {
								desert6(player, loc);
							} else if(loc.getX() <= -190 && loc.getY() <= 85 && loc.getZ() <= 1716 
									&& loc.getX() >= -342 && loc.getY() >= 45 && loc.getZ() >= 1565) {
								desert7(player, loc);
							} else if(loc.getX() <= 3832 && loc.getY() <= 122 && loc.getZ() <= 3086 
									&& loc.getX() >= 3648 && loc.getY() >= 11 && loc.getZ() >= 2981) {
								desertDungeon(player, loc);
							} else if(loc.getX() <= 3697 && loc.getY() <= 58 && loc.getZ() <= 2898 
									&& loc.getX() >= 3658 && loc.getY() >= 41 && loc.getZ() >= 2823) {
								desertDungeonBoss(player, loc);
							} else if(loc.getX() <= -210 && loc.getY() <= 120 && loc.getZ() <= 2445 
									&& loc.getX() >= -296 && loc.getY() >= 48 && loc.getZ() >= 2390) {
								desertIsland1(player, loc);
							} else if(loc.getX() <= -136 && loc.getY() <= 120 && loc.getZ() <= 2577 
									&& loc.getX() >= -246 && loc.getY() >= 48 && loc.getZ() >= 2448) {
								desertIsland2(player, loc);
							} else if(loc.getX() <= -260 && loc.getY() <= 120 && loc.getZ() <= 2585 
									&& loc.getX() >= -359 && loc.getY() >= 48 && loc.getZ() >= 2490) {
								desertIsland3(player, loc);
							} else if(loc.getX() <= -328 && loc.getY() <= 120 && loc.getZ() <= 2489 
									&& loc.getX() >= -384 && loc.getY() >= 48 && loc.getZ() >= 2419) {
								desertIsland4(player, loc);
							} else if(loc.getX() <= -275 && loc.getY() <= 47 && loc.getZ() <= 2480 
									&& loc.getX() >= -309 && loc.getY() >= 30 && loc.getZ() >= 2454) {
								desertIsland5(player, loc);
							} else if(loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2167 
									&& loc.getX() >= 1787 && loc.getY() >= 40 && loc.getZ() >= 2095) {
								laphanui1(player, loc);
							} else if(loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2239 
									&& loc.getX() >= 1752 && loc.getY() >= 40 && loc.getZ() >= 2169) {
								laphanui2(player, loc);
							} else if(loc.getX() <= 1943 && loc.getY() <= 67 && loc.getZ() <= 2175 
									&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2133) {
								laphanui3(player, loc);
							} else if(loc.getX() <= 1918 && loc.getY() <= 67 && loc.getZ() <= 2250 
									&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2176) {
								laphanui4(player, loc);
							} else if(loc.getX() <= 1940 && loc.getY() <= 100 && loc.getZ() <= 2154 
									&& loc.getX() >= 1888 && loc.getY() >= 68 && loc.getZ() >= 2067) {
								laphanui5(player, loc);
							} else if(loc.getX() <= 1886 && loc.getY() <= 100 && loc.getZ() <= 2140 
									&& loc.getX() >= 1823 && loc.getY() >= 68 && loc.getZ() >= 2067) {
								laphanui6(player, loc);
							} else if(loc.getX() <= -1817 && loc.getY() <= 66 && loc.getZ() <= 1525 
									&& loc.getX() >= -2010 && loc.getY() >= 40 && loc.getZ() >= 1289) {
								lahimuhona1(player, loc);
							} else if(loc.getX() <= -1948 && loc.getY() <= 150 && loc.getZ() <= 1393 
									&& loc.getX() >= -2006 && loc.getY() >= 67 && loc.getZ() >= 1337) {
								lahimuhona2(player, loc);
							} else if(loc.getX() <= -1862 && loc.getY() <= 150 && loc.getZ() <= 1393 
									&& loc.getX() >= -1947 && loc.getY() >= 67 && loc.getZ() >= 1324) {
								lahimuhona3(player, loc);
							} else if(loc.getX() <= -1886 && loc.getY() <= 150 && loc.getZ() <= 1484 
									&& loc.getX() >= -2000 && loc.getY() >= 67 && loc.getZ() >= 1394) {
								lahimuhona4(player, loc);
							} else if(loc.getX() <= 3822 && loc.getY() <= 63 && loc.getZ() <= 2780 
									&& loc.getX() >= 3737 && loc.getY() >= 20 && loc.getZ() >= 2735) {
								slimeDungeon1(player, loc);
							} else if(loc.getX() <= 3711 && loc.getY() <= 77 && loc.getZ() <= 2800 
									&& loc.getX() >= 3636 && loc.getY() >= 15 && loc.getZ() >= 2656) {
								slimeDungeon3(player, loc);
							} else if(loc.getX() <= 3735 && loc.getY() <= 76 && loc.getZ() <= 2580 
									&& loc.getX() >= 3636 && loc.getY() >= 20 && loc.getZ() >= 2468) {
								slimeDungeon5(player, loc);
							} else if(loc.getX() <= 611 && loc.getY() <= 67 && loc.getZ() <= -485 
									&& loc.getX() >= 539 && loc.getY() >= 45 && loc.getZ() >= -653) {
								siokana1(player, loc);
							} else if(loc.getX() <= 600 && loc.getY() <= 116 && loc.getZ() <= -538 
									&& loc.getX() >= 459 && loc.getY() >= 70 && loc.getZ() >= -609) {
								siokana2(player, loc);
							} else if(loc.getX() <= 489 && loc.getY() <= 39 && loc.getZ() <= -565 
									&& loc.getX() >= 458 && loc.getY() >= 0 && loc.getZ() >= -634) {
								siokana3(player, loc);
							} else if(loc.getX() <= -683 && loc.getY() <= 200 && loc.getZ() <= -712 
									&& loc.getX() >= -799 && loc.getY() >= 0 && loc.getZ() >= -859) {
								skelig1(player, loc);
							} else if(loc.getX() <= -524 && loc.getY() <= 200 && loc.getZ() <= -755 
									&& loc.getX() >= -682 && loc.getY() >= 0 && loc.getZ() >= -874) {
								skelig2(player, loc);
							} else if(loc.getX() <= -520 && loc.getY() <= 200 && loc.getZ() <= -598 
									&& loc.getX() >= -584 && loc.getY() >= 50 && loc.getZ() >= -754) {
								skelig3(player, loc);
							} else if(loc.getX() <= -412 && loc.getY() <= 200 && loc.getZ() <= -588 
									&& loc.getX() >= -518 && loc.getY() >= 0 && loc.getZ() >= -754) {
								skelig4(player, loc);
							} else if(loc.getX() <= -681 && loc.getY() <= 200 && loc.getZ() <= -988 
									&& loc.getX() >= -773 && loc.getY() >= 0 && loc.getZ() >= -1111) {
								skelig5(player, loc);
							} else if(loc.getX() <= -553 && loc.getY() <= 200 && loc.getZ() <= -1013 
									&& loc.getX() >= -680 && loc.getY() >= 0 && loc.getZ() >= -1078) {
								skelig6(player, loc);
							} else if(loc.getX() <= -496 && loc.getY() <= 200 && loc.getZ() <= -1097 
									&& loc.getX() >= -621 && loc.getY() >= 0 && loc.getZ() >= -1127) {
								skelig7(player, loc);
							} else if(loc.getX() <= -519 && loc.getY() <= 200 && loc.getZ() <= -1045 
									&& loc.getX() >= -560 && loc.getY() >= 124 && loc.getZ() >= -1085) {
								skelig8(player, loc);
							} else if(loc.getX() <= -766 && loc.getY() <= 200 && loc.getZ() <= -1080 
									&& loc.getX() >= -963 && loc.getY() >= 0 && loc.getZ() >= -1191) {
								skelig9(player, loc);
							} else if(loc.getX() <= -964 && loc.getY() <= 200 && loc.getZ() <= -1071 
									&& loc.getX() >= -1071 && loc.getY() >= 0 && loc.getZ() >= -1204) {
								skelig10(player, loc);
							} else if(loc.getX() <= -700 && loc.getY() <= 200 && loc.getZ() <= -524 
									&& loc.getX() >= -838 && loc.getY() >= 0 && loc.getZ() >= -594) {
								skelig11(player, loc);
							} else if(loc.getX() <= -484 && loc.getY() <= 49 && loc.getZ() <= -680 
									&& loc.getX() >= -585 && loc.getY() >= 0 && loc.getZ() >= -765) {
								skelig12(player, loc);
							} else if(loc.getX() <= 3839 && loc.getY() <= 134 && loc.getZ() <= 3990 
									&& loc.getX() >= 3683 && loc.getY() >= 58 && loc.getZ() >= 3932) {
								hardSeaDungeon(player, loc);
							} else if(loc.getX() <= 988 && loc.getY() <= 110 && loc.getZ() <= -697 
									&& loc.getX() >= 831 && loc.getY() >= 40 && loc.getZ() >= -784) {
								tiperari1(player, loc);
							} else if(loc.getX() <= 1045 && loc.getY() <= 110 && loc.getZ() <= -784 
									&& loc.getX() >= 768 && loc.getY() >= 40 && loc.getZ() >= -995) {
								tiperari2(player, loc);
							} else if(loc.getX() <= 890 && loc.getY() <= 110 && loc.getZ() <= -1015 
									&& loc.getX() >= 803 && loc.getY() >= 65 && loc.getZ() >= -1114) {
								tiperariChurch(player, loc);
							} else if(loc.getX() <= 890 && loc.getY() <= 64 && loc.getZ() <= -996 
									&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -1155) {
								tiperariCave1(player, loc);
							} else if(loc.getX() <= 890 && loc.getY() <= 39 && loc.getZ() <= -919 
									&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -995) {
								tiperariCave2(player, loc);
							} else if(loc.getX() <= 1148 && loc.getY() <= 110 && loc.getZ() <= -967 
									&& loc.getX() >= 1046 && loc.getY() >= 30 && loc.getZ() >= -1056) {
								tiperariOre(player, loc);
							} else if(loc.getX() <= 1303 && loc.getY() <= 110 && loc.getZ() <= -800 
									&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -965) {
								tiperariRuin(player, loc);
							} else if(loc.getX() <= 1082 && loc.getY() <= 120 && loc.getZ() <= -1058 
									&& loc.getX() >= 926 && loc.getY() >= 30 && loc.getZ() >= -1226) {
								tiperariField1(player, loc);
							} else if(loc.getX() <= 1152 && loc.getY() <= 120 && loc.getZ() <= -1058 
									&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -1226) {
								tiperariField2(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -986 
									&& loc.getX() >= 1153 && loc.getY() >= 30 && loc.getZ() >= -1226) {
								tiperariField3(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1227 
									&& loc.getX() >= 960 && loc.getY() >= 30 && loc.getZ() >= -1307) {
								tiperariField4(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1308 
									&& loc.getX() >= 1023 && loc.getY() >= 30 && loc.getZ() >= -1444) {
								badlands1(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1446 
									&& loc.getX() >= 1073 && loc.getY() >= 30 && loc.getZ() >= -1541) {
								badlands2(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1409 
									&& loc.getX() >= 1198 && loc.getY() >= 61 && loc.getZ() >= -1518) {
								badlands3(player, loc);
							} else if(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1519 
									&& loc.getX() >= 1165 && loc.getY() >= 61 && loc.getZ() >= -1699) {
								badlands4(player, loc);
							} else if(loc.getX() <= 987 && loc.getY() <= 255 && loc.getZ() <= -1330 
									&& loc.getX() >= 835 && loc.getY() >= 0 && loc.getZ() >= -1446) {
								badlands5(player, loc);
							} else if(loc.getX() <= 1027 && loc.getY() <= 70 && loc.getZ() <= -1461 
									&& loc.getX() >= 917 && loc.getY() >= 48 && loc.getZ() >= -1704) {
								badlands6(player, loc);
							} else if(loc.getX() <= 1020 && loc.getY() <= 90 && loc.getZ() <= -1474 
									&& loc.getX() >= 739 && loc.getY() >= 71 && loc.getZ() >= -1699) {
								badlands7(player, loc);
							} else if(loc.getX() <= 915 && loc.getY() <= 70 && loc.getZ() <= -1556 
									&& loc.getX() >= 751 && loc.getY() >= 48 && loc.getZ() >= -1699) {
								badlands8(player, loc);
							} else if(loc.getX() <= 834 && loc.getY() <= 255 && loc.getZ() <= -1330 
									&& loc.getX() >= 743 && loc.getY() >= 0 && loc.getZ() >= -1538) {
								badlands9(player, loc);
							} else if(loc.getX() <= 1149 && loc.getY() <= 255 && loc.getZ() <= -1509 
									&& loc.getX() >= 936 && loc.getY() >= 91 && loc.getZ() >= -1699) {
								badlands10(player, loc);
							} else if(loc.getX() <= 1034 && loc.getY() <= 47 && loc.getZ() <= -1517 
									&& loc.getX() >= 941 && loc.getY() >= 0 && loc.getZ() >= -1608) {
								badlandsCave1(player, loc);
							} else if(loc.getX() <= 939 && loc.getY() <= 37 && loc.getZ() <= -1552 
									&& loc.getX() >= 844 && loc.getY() >= 0 && loc.getZ() >= -1623) {
								badlandsCave2(player, loc);
							} else if(loc.getX() <= 3645 && loc.getY() <= 111 && loc.getZ() <= 4148 
									&& loc.getX() >= 3596 && loc.getY() >= 85 && loc.getZ() >= 4098) {
								hardForestRoom21(player, loc);
							} else if(loc.getX() <= 3769 && loc.getY() <= 160 && loc.getZ() <= 4133 
									&& loc.getX() >= 3665 && loc.getY() >= 125 && loc.getZ() >= 4073) {
								hardForestRoom22(player, loc);
							} else if(loc.getX() <= 3645 && loc.getY() <= 155 && loc.getZ() <= 4148 
									&& loc.getX() >= 3596 && loc.getY() >= 135 && loc.getZ() >= 4098) {
								hardForestRoom23(player, loc);
							} else if(loc.getX() <= 3751 && loc.getY() <= 105 && loc.getZ() <= 4184 
									&& loc.getX() >= 3727 && loc.getY() >= 85 && loc.getZ() >= 4156) {
								hardForestMidBoss(player, loc);
							} else if(loc.getX() <= 3699 && loc.getY() <= 230 && loc.getZ() <= 4217 
									&& loc.getX() >= 3657 && loc.getY() >= 180 && loc.getZ() >= 4172) {
								hardForestBoss(player, loc);
							} else if(loc.getX() <= 707 && loc.getY() <= 125 && loc.getZ() <= -1324 
									&& loc.getX() >= 555 && loc.getY() >= 50 && loc.getZ() >= -1700) {
								iberumoa1(player, loc);
							} else if(loc.getX() <= 566 && loc.getY() <= 36 && loc.getZ() <= -1611 
									&& loc.getX() >= 518 && loc.getY() >= 1 && loc.getZ() >= -1684) {
								iberumoa2(player, loc);
							} else if(loc.getX() <= 554 && loc.getY() <= 156 && loc.getZ() <= -1206 
									&& loc.getX() >= 406 && loc.getY() >= 47 && loc.getZ() >= -1697) {
								iberumoa3(player, loc);
							} else if(loc.getX() <= 410 && loc.getY() <= 46 && loc.getZ() <= -1177 
									&& loc.getX() >= 346 && loc.getY() >= 5 && loc.getZ() >= -1699) {
								iberumoa4(player, loc);
							} else if(loc.getX() <= 454 && loc.getY() <= 40 && loc.getZ() <= -1574 
									&& loc.getX() >= 411 && loc.getY() >= 5 && loc.getZ() >= -1682) {
								iberumoa5(player, loc);
							} else if(loc.getX() <= -2636 && loc.getY() <= 100 && loc.getZ() <= -901 
									&& loc.getX() >= -2750 && loc.getY() >= 30 && loc.getZ() >= -1030) {
								santa1(player, loc);
							} else if(loc.getX() <= -2566 && loc.getY() <= 100 && loc.getZ() <= -1031 
									&& loc.getX() >= -2694 && loc.getY() >= 30 && loc.getZ() >= -1100) {
								santa2(player, loc);
							} else if(loc.getX() <= -2475 && loc.getY() <= 120 && loc.getZ() <= -945 
									&& loc.getX() >= -2565 && loc.getY() >= 80 && loc.getZ() >= -1086) {
								santa3(player, loc);
							} else if(loc.getX() <= -2543 && loc.getY() <= 103 && loc.getZ() <= -885 
									&& loc.getX() >= -2589 && loc.getY() >= 90 && loc.getZ() >= -926) {
								santa4(player, loc);
							} else if(loc.getX() <= -2545 && loc.getY() <= 79 && loc.getZ() <= -903 
									&& loc.getX() >= -2608 && loc.getY() >= 50 && loc.getZ() >= -998) {
								santa5(player, loc);
							} else if(loc.getX() <= 357 && loc.getY() <= 200 && loc.getZ() <= -1302 
									&& loc.getX() >= 98 && loc.getY() >= 5 && loc.getZ() >= -1699) {
								lastIberumoa1(player, loc);
							} else if(loc.getX() <= 1200 && loc.getY() <= -1 && loc.getZ() <= 600 
									&& loc.getX() >= 700 && loc.getY() >= -100 && loc.getZ() >= 0) {
								underground1(player, loc);
							}

						}
					} 
					
					if(time >= 320) {
						time = 0;
					}
					
					time++;
					
				}
				
			}

		}, 0, 1);
	}

	@EventHandler
	public void comsumeGoldenApple(PlayerItemConsumeEvent event) {
		try {
			if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "키어컬의 발걸음")) {
				Player goldenPlayer = event.getPlayer();
				if(gp.returnTime(goldenPlayer) == 0) {
					gp.put(goldenPlayer, 1);
					goldenPlayer.sendMessage(ChatColor.GREEN + "주변에서 키어컬의 발걸음이 느껴집니다.");
				} else {
					gp.remove(goldenPlayer);
					gp.put(goldenPlayer, 1);
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	public void tutozone(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 3974 && loc.getY() <= 173
				&& loc.getZ() <= 3870 && loc.getX() >= 3924
				&& loc.getY() >= 160 && loc.getZ() >= 3847)) {
			return;
		}
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}

	public void greenSlime(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1833 && loc.getY() <= 60 && loc.getZ() <= 3107 && loc.getX() >= -1882 && loc.getY() >= 50
				&& loc.getZ() >= 3068)) {
			return;
		}
		loc.getWorld().spawnEntity(loc, EntityType.SLIME);
	}

	public void coastZombie(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1887 && loc.getY() <= 56 && loc.getZ() <= 3068 && loc.getX() >= -1946 && loc.getY() >= 45
				&& loc.getZ() >= 2986)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(0);
		head.setHelmet(headItem);
	}

	public void wargunilSkel(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1786 && loc.getY() <= 57 && loc.getZ() <= 3094 && loc.getX() >= -1820 && loc.getY() >= 50
				&& loc.getZ() >= 3061)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(1);
		head.setHelmet(headItem);
	}

	public void wargunilSea(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1960 && loc.getY() <= 60 && loc.getZ() <= 2954 && loc.getX() >= -1980 && loc.getY() >= 52
				&& loc.getZ() >= 2947)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		} else if (num >= 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		}
	}

	public void forestGhost(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1870 && loc.getY() <= 80 && loc.getZ() <= 2694 && loc.getX() >= -1925 && loc.getY() >= 45
				&& loc.getZ() >= 2635)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(4);
		head.setHelmet(headItem);
	}

	public void crystalWarrior(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1882 && loc.getY() <= 77 && loc.getZ() <= 2617 && loc.getX() >= -1938 && loc.getY() >= 45
				&& loc.getZ() >= 2596)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(5);
		head.setHelmet(headItem);
	}

	public void woodFairy(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1788 && loc.getY() <= 65 && loc.getZ() <= 2570 && loc.getX() >= -1822 && loc.getY() >= 50
				&& loc.getZ() >= 2535)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(6);
		head.setHelmet(headItem);
	}

	public void turtleWarrior(Player player, Location loc) {
		loc = location(loc);
		while (loc.add(0, -2, 0).getBlock().getType() == Material.WATER) {
			loc = location(loc);
		}
		loc.add(0, 3, 0);
		if (!(loc.getX() <= 3713 && loc.getY() <= 23 && loc.getZ() <= 3765 && loc.getX() >= 3703 && loc.getY() >= 15
				&& loc.getZ() >= 3756)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}

	public void vindicator(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1830 && loc.getY() <= 100 && loc.getZ() <= 2472 && loc.getX() >= -1964 && loc.getY() >= 40
				&& loc.getZ() >= 2324)) {
			return;
		}
		if (num == 0) {
			Vindicator mob = (Vindicator) loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} else if (num == 1) {
			Evoker mob = (Evoker) loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
		}
	}

	public void forganWestForest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1936 && loc.getY() <= 100 && loc.getZ() <= 2686 && loc.getX() >= -2143 && loc.getY() >= 30
				&& loc.getZ() >= 2444)) {
			return;
		}
		if (num == 0) {
			Witch mob = (Witch) loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		} else if (num == 1) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}

	public void mountainThief(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -1913 && loc.getY() <= 100 && loc.getZ() <= 2354 && loc.getX() >= -2121 && loc.getY() >= 30
				&& loc.getZ() >= 2271)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(8);
		head.setHelmet(headItem);
	}

	public void forestRuins(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3532 && loc.getY() <= 30 && loc.getZ() <= 3773 && loc.getX() >= 3447 && loc.getY() >= 10
				&& loc.getZ() >= 3690)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1828, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(10);
			head.setHelmet(headItem);
		}
	}

	public void senMag1(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -1436 && loc.getY() <= 200 && loc.getZ() <= 2410 && loc.getX() >= -1753 && loc.getY() >= 40
				&& loc.getZ() >= 1983)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 3) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}

	}

	public void senMag2(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -804 && loc.getY() <= 90 && loc.getZ() <= 2464 && loc.getX() >= -1436 && loc.getY() >= 50
				&& loc.getZ() >= 1812)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}

	public void partholon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1027 && loc.getY() <= 42 && loc.getZ() <= 2365 && loc.getX() >= -1096 && loc.getY() >= 3
				&& loc.getZ() >= 2246)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Spider mob = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}

	public void tiruCoast(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -568 && loc.getY() <= 60 && loc.getZ() <= 1993 && loc.getX() >= -642 && loc.getY() >= 40
				&& loc.getZ() >= 1881)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(6);
		head.setHelmet(headItem);
	}

	public void mineDun1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 3603 && loc.getY() <= 31 && loc.getZ() <= 3976 && loc.getX() >= 3481 && loc.getY() >= 5
				&& loc.getZ() >= 3837)) {
			return;
		}
		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			Spider mob = (Spider) loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}

	public void tiruField(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -712 && loc.getY() <= 88 && loc.getZ() <= 1800 && loc.getX() >= -1051 && loc.getY() >= 40
				&& loc.getZ() >= 1562)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}

	public void tiruField2(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -539 && loc.getY() <= 88 && loc.getZ() <= 1819 
				&& loc.getX() >= -726 && loc.getY() >= 40 && loc.getZ() >= 1612)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(7);
		head.setHelmet(headItem);
	}
	
	public void seedFrontCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -930 && loc.getY() <= 39 && loc.getZ() <= 1966 && loc.getX() >= -1049 && loc.getY() >= 3
				&& loc.getZ() >= 1804)) {
			return;
		}
		if (num == 0) {
			CaveSpider mob = (CaveSpider) loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} else if (num == 1) {
			Silverfish mob = (Silverfish) loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		}
	}

	public void toMiyu(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -499 && loc.getY() <= 89 && loc.getZ() <= 1542 && loc.getX() >= -719 && loc.getY() >= 35
				&& loc.getZ() >= 1387)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		}
	}

	public void toMiyuCoastCave(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -538 && loc.getY() <= 34 && loc.getZ() <= 1541 && loc.getX() >= -610 && loc.getY() >= 10
				&& loc.getZ() >= 1487)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(10);
		head.setHelmet(headItem);
	}

	public void toMiyuCave(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -970 && loc.getY() <= 55 && loc.getZ() <= 1653 && loc.getX() >= -1020 && loc.getY() >= 32
				&& loc.getZ() >= 1575)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		EntityEquipment head = mob.getEquipment();
		ItemStack headItem = chest.getInventory().getItem(11);
		head.setHelmet(headItem);
	}

	public void miyu1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -919 && loc.getY() <= 109 && loc.getZ() <= 1465 && loc.getX() >= -997 && loc.getY() >= 59
				&& loc.getZ() >= 1291)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}

	public void miyu2(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -962 && loc.getY() <= 109 && loc.getZ() <= 1289 && loc.getX() >= -1030 && loc.getY() >= 59
				&& loc.getZ() >= 1203)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		}
	}

	public void miyu3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1005 && loc.getY() <= 109 && loc.getZ() <= 1204 && loc.getX() >= -1116 && loc.getY() >= 59
				&& loc.getZ() >= 1095)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 1) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		}
	}

	public void miyu4(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1118 && loc.getY() <= 109 && loc.getZ() <= 1312 && loc.getX() >= -1182 && loc.getY() >= 59
				&& loc.getZ() >= 1140)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}

	public void miyu5(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -1187 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1233 && loc.getY() >= 59
				&& loc.getZ() >= 1273)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		}
	}

	public void miyu6(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1234 && loc.getY() <= 109 && loc.getZ() <= 1460 && loc.getX() >= -1290 && loc.getY() >= 59
				&& loc.getZ() >= 1311)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1829, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 1) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		}
	}

	public void miyuGY(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -646 && loc.getY() <= 95 && loc.getZ() <= 1380 && loc.getX() >= -750 && loc.getY() >= 55
				&& loc.getZ() >= 1277)) {
			return;
		}
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		} else if (num == 1) {
			Ravager mob = (Ravager) loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}

	public void valley(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1314 && loc.getY() <= 48 && loc.getZ() <= 2082 
				&& loc.getX() >= -1579 && loc.getY() >= 0 && loc.getZ() >= 1745)) {
			return;
		}
		if (num == 0) {
			Vex mob = (Vex) loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} else if (num == 1) {
			Slime mob = (Slime) loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}

	public void miyuEast(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -685 && loc.getY() <= 160 && loc.getZ() <= 1274 
				&& loc.getX() >= -946 && loc.getY() >= 56 && loc.getZ() >= 924)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(0);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(1);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Blaze mob = (Blaze) loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(2);
			head.setHelmet(headItem);
		}
	}
	
	public void miyuNorth(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -960 && loc.getY() <= 75 && loc.getZ() <= 990 
				&& loc.getX() >= -1277 && loc.getY() >= 45 && loc.getZ() >= 871)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(3);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		}
	}
	
	public void miyuWest1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1323 && loc.getY() <= 100 && loc.getZ() <= 1513 
				&& loc.getX() >= -1639 && loc.getY() >= 35 && loc.getZ() >= 1105)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}
	
	public void miyuWest2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1200 && loc.getY() <= 100 && loc.getZ() <= 1235 
				&& loc.getX() >= -1420 && loc.getY() >= 40 && loc.getZ() >= 1142)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		
		if (num == 0) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				Stray mob = (Stray) loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(4);
			head.setHelmet(headItem);
		}
	}
	
	public void toKaiman(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -429 && loc.getY() <= 80 && loc.getZ() <= 1571 
				&& loc.getX() >= -560 && loc.getY() >= 40 && loc.getZ() >= 1376)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1827, 92, 3039);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth1(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -360 && loc.getY() <= 100 && loc.getZ() <= 1225 
				&& loc.getX() >= -684 && loc.getY() >= 45 && loc.getZ() >= 1007)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth2(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= 48 && loc.getY() <= 98 && loc.getZ() <= 1238 
				&& loc.getX() >= -356 && loc.getY() >= 40 && loc.getZ() >= 1136)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth3(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= 67 && loc.getY() <= 98 && loc.getZ() <= 1132 
				&& loc.getX() >= -72 && loc.getY() >= 40 && loc.getZ() >= 1010)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void kaimanNorth4(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -382 && loc.getY() <= 106 && loc.getZ() <= 1001 
				&& loc.getX() >= -497 && loc.getY() >= 40 && loc.getZ() >= 888)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(5);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(6);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(7);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(8);
			head.setHelmet(headItem);
		}
	}
	
	public void devilPortal(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -532 && loc.getY() <= 90 && loc.getZ() <= 990 
				&& loc.getX() >= -658 && loc.getY() >= 60 && loc.getZ() >= 852)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(9);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(10);
			head.setHelmet(headItem);
		} else if (num == 2) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(11);
			head.setHelmet(headItem);
		}
	}
	
	public void middleValley(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -49 && loc.getY() <= 150 && loc.getZ() <= 1130 
				&& loc.getX() >= -336 && loc.getY() >= 10 && loc.getZ() >= 791)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(12);
			head.setHelmet(headItem);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(13);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Husk mob = (Husk) loc.getWorld().spawnEntity(loc, EntityType.HUSK);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(14);
			head.setHelmet(headItem);
		} else if (num == 3) {
			Enderman mob = (Enderman) loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		}
	}
	
	public void fairyDungeon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3788 && loc.getY() <= 60 && loc.getZ() <= 3482 
				&& loc.getX() >= 3707 && loc.getY() >= 30 && loc.getZ() >= 3296)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			Vex mob = (Vex) loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} else if (num == 1) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(15);
			head.setHelmet(headItem);
		}
	}
	
	public void aranmore(Player player, Location loc) {
		int num = rnd.nextInt(4);
		loc = location(loc);
		if (!(loc.getX() <= -1789 && loc.getY() <= 200 && loc.getZ() <= 931 
				&& loc.getX() >= -2964 && loc.getY() >= 30 && loc.getZ() >= 443)) {
			return;
		}
		Location chestLoc = new Location(loc.getWorld(), -1830, 92, 3041);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();

		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.POLAR_BEAR);
		} else if (num == 1) {
			Zombie mob = (Zombie) loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(18);
			head.setHelmet(headItem);
		} else if (num == 2) {
			Skeleton mob = (Skeleton) loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(19);
			head.setHelmet(headItem);
		} else if (num == 3) {
			WitherSkeleton mob = (WitherSkeleton) loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
			EntityEquipment head = mob.getEquipment();
			ItemStack headItem = chest.getInventory().getItem(20);
			head.setHelmet(headItem);
		}
	}
	
	public void aranmoreDun1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3753 && loc.getY() <= 62 && loc.getZ() <= 3232 
				&& loc.getX() >= 3639 && loc.getY() >= 12 && loc.getZ() >= 3182)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void aranmoreDun2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3749 && loc.getY() <= 91 && loc.getZ() <= 3225 
				&& loc.getX() >= 3644 && loc.getY() >= 70 && loc.getZ() >= 3184)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void swampSlime1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -616 && loc.getY() <= 94 && loc.getZ() <= 871 
				&& loc.getX() >= -897 && loc.getY() >= 43 && loc.getZ() >= 699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void swampSlime2(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -810 && loc.getY() <= 94 && loc.getZ() <= 693 
				&& loc.getX() >= -970 && loc.getY() >= 43 && loc.getZ() >= 602)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void swampSpider(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -313 && loc.getY() <= 103 && loc.getZ() <= 691 
				&& loc.getX() >= -795 && loc.getY() >= 45 && loc.getZ() >= 311)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		}
	}
	
	public void swampWater(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -888 && loc.getY() <= 109 && loc.getZ() <= 572 
				&& loc.getX() >= -1238 && loc.getY() >= 43 && loc.getZ() >= 167)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void swampNorthEast1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -868 && loc.getY() <= 115 && loc.getZ() <= 166 
				&& loc.getX() >= -1156 && loc.getY() >= 47 && loc.getZ() >= 27)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void swampNorthEast2(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -869 && loc.getY() <= 109 && loc.getZ() <= -41 
				&& loc.getX() >= -974 && loc.getY() >= 47 && loc.getZ() >= -222)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion1(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 3424 && loc.getY() <= 40 && loc.getZ() <= 3826 
				&& loc.getX() >= 3390 && loc.getY() >= 11 && loc.getZ() >= 3783)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void senMansion2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3386 && loc.getY() <= 16 && loc.getZ() <= 3759 
				&& loc.getX() >= 3348 && loc.getY() >= 11 && loc.getZ() >= 3721)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3388 && loc.getY() <= 37 && loc.getZ() <= 3827 
				&& loc.getX() >= 3354 && loc.getY() >= 13 && loc.getZ() >= 3804)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void senMansion4(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3802 
				&& loc.getX() >= 3355 && loc.getY() >= 11 && loc.getZ() >= 3766)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} 
	}
	
	public void puru1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -125 && loc.getY() <= 113 && loc.getZ() <= 498 
				&& loc.getX() >= -311 && loc.getY() >= 41 && loc.getZ() >= 150)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void puru2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -124 && loc.getY() <= 115 && loc.getZ() <= 149 
				&& loc.getX() >= -408 && loc.getY() >= 41 && loc.getZ() >= -263)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		}
	}
	
	public void puru3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 62 && loc.getY() <= 115 && loc.getZ() <= 367 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= 37)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		}
	}
	
	public void puru4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 29 && loc.getY() <= 115 && loc.getZ() <= 27 
				&& loc.getX() >= -123 && loc.getY() >= 41 && loc.getZ() >= -208)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
			}
		}
	}
	
	public void puru5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 211 && loc.getY() <= 115 && loc.getZ() <= 461
				&& loc.getX() >= 61 && loc.getY() >= 41 && loc.getZ() >= 366)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void puru6(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 693 && loc.getY() <= 115 && loc.getZ() <= 364 
				&& loc.getX() >= 65 && loc.getY() >= 41 && loc.getZ() >= 19)) {
			return;
		}
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void puru7(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 319 && loc.getY() <= 115 && loc.getZ() <= -51 
				&& loc.getX() >= 40 && loc.getY() >= 41 && loc.getZ() >= -421)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void beiagSeaCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 33 && loc.getY() <= 41 && loc.getZ() <= -487 && 
				loc.getX() >= -40 && loc.getY() >= 4 && loc.getZ() >= -568)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void swampCave(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -931 && loc.getY() <= 42 && loc.getZ() <= 526 && 
				loc.getX() >= -1020 && loc.getY() >= 1 && loc.getZ() >= 401)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} 
	}
	
	public void beiagBreakVil(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= -36 && loc.getY() <= 65 && loc.getZ() <= -227 && 
				loc.getX() >= -175 && loc.getY() >= 49 && loc.getZ() >= -323)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void necroValley(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -78 && loc.getY() <= 62 && loc.getZ() <= 776 
				&& loc.getX() >= -179 && loc.getY() >= 4 && loc.getZ() >= 580)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} 
	}
	
	public void puruCave(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 146 && loc.getY() <= 77 && loc.getZ() <= 555 
				&& loc.getX() >= -59 && loc.getY() >= 58 && loc.getZ() >= 466)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		}
	}
	
	public void dungeon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 313 && loc.getY() <= 41 && loc.getZ() <= -154 
				&& loc.getX() >= 250 && loc.getY() >= 25 && loc.getZ() >= -184)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void magicTower1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 697 
				&& loc.getX() >= 147 && loc.getY() >= 3 && loc.getZ() >= 489)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void magicTower2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 429 && loc.getY() <= 172 && loc.getZ() <= 935 
				&& loc.getX() >= 47 && loc.getY() >= 3 && loc.getZ() >= 700)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		}
	}
	
	public void magicTower3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 146 && loc.getY() <= 164 && loc.getZ() <= 697 
				&& loc.getX() >= 8 && loc.getY() >= 78 && loc.getZ() >= 502)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void darkMaze(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 96 && loc.getY() <= 62 && loc.getZ() <= 695 
				&& loc.getX() >= 50 && loc.getY() >= 53 && loc.getZ() >= 615)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	public void castleWest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 625 && loc.getY() <= 200 && loc.getZ() <= 887 && 
				loc.getX() >= 493 && loc.getY() >= 40 && loc.getZ() >= 389)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void castleSouth(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 810 && loc.getY() <= 150 && loc.getZ() <= 891 && 
				loc.getX() >= 627 && loc.getY() >= 45 && loc.getZ() >= 661)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void castleSouthEast(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 967 && loc.getY() <= 150 && loc.getZ() <= 656 && 
				loc.getX() >= 758 && loc.getY() >= 55 && loc.getZ() >= 620)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void castleNearVil(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1105 && loc.getY() <= 104 && loc.getZ() <= 895 && 
				loc.getX() >= 908 && loc.getY() >= 40 && loc.getZ() >= 747)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
		}
	}
	
	public void castleNearVilNearGround(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 901 && loc.getY() <= 80 && loc.getZ() <= 911 && 
				loc.getX() >= 819 && loc.getY() >= 50 && loc.getZ() >= 774)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		}
	}
	
	public void castleNearVilNearCave(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 847 && loc.getY() <= 57 && loc.getZ() <= 739 && 
				loc.getX() >= 777 && loc.getY() >= 29 && loc.getZ() >= 683)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		}
	}
	
	public void aracunePhan(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 782 && loc.getY() <= 56 && loc.getZ() <= 633 
				&& loc.getX() >= 699 && loc.getY() >= 34 && loc.getZ() >= 551)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.PHANTOM);
		}
	}
	
	public void aracuneSpi(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 759 && loc.getY() <= 30 && loc.getZ() <= 588 
				&& loc.getX() >= 741 && loc.getY() >= 5 && loc.getZ() >= 570)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		}
	}
	
	public void sumukwon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 744 && loc.getY() <= 120 && loc.getZ() <= 659 && 
				loc.getX() >= 710 && loc.getY() >= 60 && loc.getZ() >= 617)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void castle1F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 718 && loc.getY() <= 75 && loc.getZ() <= 617 && 
				loc.getX() >= 675 && loc.getY() >= 65 && loc.getZ() >= 566)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void castle2F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 712 && loc.getY() <= 91 && loc.getZ() <= 609 && 
				loc.getX() >= 668 && loc.getY() >= 82 && loc.getZ() >= 566)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void castle3F(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 713 && loc.getY() <= 116 && loc.getZ() <= 605 && 
				loc.getX() >= 672 && loc.getY() >= 100 && loc.getZ() >= 572)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	public void wheatEast(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 165 && 
				loc.getX() >= 695 && loc.getY() >= 40 && loc.getZ() >= 6)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void kleahWest(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 860 && loc.getY() <= 100 && loc.getZ() <= 415 && 
				loc.getX() >= 695 && loc.getY() >= 50 && loc.getZ() >= 167)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		}
	}
	
	public void kleah1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1082 && loc.getY() <= 165 && loc.getZ() <= 312 && 
				loc.getX() >= 901 && loc.getY() >= 60 && loc.getZ() >= 248)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
			}
		}
	}
	
	public void kleah2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1072 && loc.getY() <= 165 && loc.getZ() <= 247 && 
				loc.getX() >= 904 && loc.getY() >= 60 && loc.getZ() >= 110)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		}
	}
	
	public void kleahSouth(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1068 && loc.getY() <= 100 && loc.getZ() <= 480 && 
				loc.getX() >= 860 && loc.getY() >= 50 && loc.getZ() >= 419)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void kleahSouthEast(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1164 && loc.getY() <= 100 && loc.getZ() <= 679 && 
				loc.getX() >= 1076 && loc.getY() >= 40 && loc.getZ() >= 348)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void castleNearVilEast(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 96 && loc.getZ() <= 1035 && 
				loc.getX() >= 1106 && loc.getY() >= 37 && loc.getZ() >= 675)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.LLAMA);
		}
	}
	
	public void kleahBase1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1060 && loc.getY() <= 54 && loc.getZ() <= 298 && 
				loc.getX() >= 1009 && loc.getY() >= 36 && loc.getZ() >= 254)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void kleahBase2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1030 && loc.getY() <= 55 && loc.getZ() <= 214 
				&& loc.getX() >= 912 && loc.getY() >= 18 && loc.getZ() >= 142)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		}
	}
	
	public void partholonBase(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1090 && loc.getY() <= 5 && loc.getZ() <= 2302 
				&& loc.getX() >= -1112 && loc.getY() >= 0 && loc.getZ() >= 2281)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		}
	}
	
	public void kleahLavaCave1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 911 && loc.getY() <= 33 && loc.getZ() <= 36 
				&& loc.getX() >= 768 && loc.getY() >= 0 && loc.getZ() >= -153)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void kleahLavaCave2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 811 && loc.getY() <= 90 && loc.getZ() <= -64 
				&& loc.getX() >= 779 && loc.getY() >= 38 && loc.getZ() >= -96)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void desert1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 532 && loc.getY() <= 255 && loc.getZ() <= 1267 
				&& loc.getX() >= 120 && loc.getY() >= 0 && loc.getZ() >= 1029)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		}
	}
	
	public void desert2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 1657 
				&& loc.getX() >= -161 && loc.getY() >= 47 && loc.getZ() >= 1268)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void desert3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 599 && loc.getY() <= 46 && loc.getZ() <= 1657 
				&& loc.getX() >= -161 && loc.getY() >= 0 && loc.getZ() >= 1268)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		}
	}
	
	public void desert4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 599 && loc.getY() <= 106 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 0 && loc.getZ() >= 1795)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void desert5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 599 && loc.getY() <= 180 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 107 && loc.getZ() >= 1795)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void desert6(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 599 && loc.getY() <= 255 && loc.getZ() <= 2617 
				&& loc.getX() >= 230 && loc.getY() >= 181 && loc.getZ() >= 1795)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void desert7(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -190 && loc.getY() <= 85 && loc.getZ() <= 1716 
				&& loc.getX() >= -342 && loc.getY() >= 45 && loc.getZ() >= 1565)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void desertDungeon(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 3832 && loc.getY() <= 122 && loc.getZ() <= 3086 
				&& loc.getX() >= 3648 && loc.getY() >= 11 && loc.getZ() >= 2981)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}  
	}
	
	public void desertDungeonBoss(Player player, Location loc) {
		int num = rnd.nextInt(1);
		loc = location(loc);
		if (!(loc.getX() <= 3697 && loc.getY() <= 58 && loc.getZ() <= 2898 
				&& loc.getX() >= 3658 && loc.getY() >= 41 && loc.getZ() >= 2823)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	public void desertIsland1(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -210 && loc.getY() <= 120 && loc.getZ() <= 2445 
				&& loc.getX() >= -296 && loc.getY() >= 48 && loc.getZ() >= 2390)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void desertIsland2(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -136 && loc.getY() <= 120 && loc.getZ() <= 2577 
				&& loc.getX() >= -246 && loc.getY() >= 48 && loc.getZ() >= 2448)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void desertIsland3(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -260 && loc.getY() <= 120 && loc.getZ() <= 2585 
				&& loc.getX() >= -359 && loc.getY() >= 48 && loc.getZ() >= 2490)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void desertIsland4(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= -328 && loc.getY() <= 120 && loc.getZ() <= 2489 
				&& loc.getX() >= -384 && loc.getY() >= 48 && loc.getZ() >= 2419)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void desertIsland5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -275 && loc.getY() <= 47 && loc.getZ() <= 2480 
				&& loc.getX() >= -309 && loc.getY() >= 30 && loc.getZ() >= 2454)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void laphanui1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2167 
				&& loc.getX() >= 1787 && loc.getY() >= 40 && loc.getZ() >= 2095)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void laphanui2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1852 && loc.getY() <= 67 && loc.getZ() <= 2239 
				&& loc.getX() >= 1752 && loc.getY() >= 40 && loc.getZ() >= 2169)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void laphanui3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1943 && loc.getY() <= 67 && loc.getZ() <= 2175 
				&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2133)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void laphanui4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1918 && loc.getY() <= 67 && loc.getZ() <= 2250 
				&& loc.getX() >= 1855 && loc.getY() >= 40 && loc.getZ() >= 2176)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		} 
	}
	
	public void laphanui5(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 1940 && loc.getY() <= 100 && loc.getZ() <= 2154 
				&& loc.getX() >= 1888 && loc.getY() >= 68 && loc.getZ() >= 2067)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
	}
	
	public void laphanui6(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1886 && loc.getY() <= 100 && loc.getZ() <= 2140 
				&& loc.getX() >= 1823 && loc.getY() >= 68 && loc.getZ() >= 2067)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void lahimuhona1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1817 && loc.getY() <= 66 && loc.getZ() <= 1525 
				&& loc.getX() >= -2010 && loc.getY() >= 40 && loc.getZ() >= 1289)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} 
	}
	
	public void lahimuhona2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1948 && loc.getY() <= 150 && loc.getZ() <= 1393 
				&& loc.getX() >= -2006 && loc.getY() >= 67 && loc.getZ() >= 1337)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} 
	}
	
	public void lahimuhona3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1862 && loc.getY() <= 150 && loc.getZ() <= 1393 
				&& loc.getX() >= -1947 && loc.getY() >= 67 && loc.getZ() >= 1324)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} 
	}
	
	public void lahimuhona4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -1886 && loc.getY() <= 150 && loc.getZ() <= 1484 
				&& loc.getX() >= -2000 && loc.getY() >= 67 && loc.getZ() >= 1394)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		} 
	}
	
	public void slimeDungeon1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3822 && loc.getY() <= 63 && loc.getZ() <= 2780 
				&& loc.getX() >= 3737 && loc.getY() >= 20 && loc.getZ() >= 2735)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} 
	}
	
	public void slimeDungeon3(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 3711 && loc.getY() <= 77 && loc.getZ() <= 2800 
				&& loc.getX() >= 3636 && loc.getY() >= 15 && loc.getZ() >= 2656)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
	}
	
	public void slimeDungeon5(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 3735 && loc.getY() <= 76 && loc.getZ() <= 2580 
				&& loc.getX() >= 3636 && loc.getY() >= 20 && loc.getZ() >= 2468)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SLIME);
	}
	
	public void siokana1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 611 && loc.getY() <= 67 && loc.getZ() <= -485 
				&& loc.getX() >= 539 && loc.getY() >= 45 && loc.getZ() >= -653)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void siokana2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 600 && loc.getY() <= 116 && loc.getZ() <= -538 
				&& loc.getX() >= 459 && loc.getY() >= 70 && loc.getZ() >= -609)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} 
	}
	
	public void siokana3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 489 && loc.getY() <= 39 && loc.getZ() <= -565 
				&& loc.getX() >= 458 && loc.getY() >= 0 && loc.getZ() >= -634)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.LLAMA);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void skelig1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -683 && loc.getY() <= 200 && loc.getZ() <= -712 
				&& loc.getX() >= -799 && loc.getY() >= 0 && loc.getZ() >= -859)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
		} 
	}

	public void skelig2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -524 && loc.getY() <= 200 && loc.getZ() <= -755 
				&& loc.getX() >= -682 && loc.getY() >= 0 && loc.getZ() >= -874)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
		} 
	}
	
	public void skelig3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -520 && loc.getY() <= 200 && loc.getZ() <= -598 
				&& loc.getX() >= -584 && loc.getY() >= 50 && loc.getZ() >= -754)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} 
	}
	
	public void skelig4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -412 && loc.getY() <= 200 && loc.getZ() <= -588 
				&& loc.getX() >= -518 && loc.getY() >= 0 && loc.getZ() >= -754)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.PANDA);
		} 
	}
	
	public void skelig5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -681 && loc.getY() <= 200 && loc.getZ() <= -988 
				&& loc.getX() >= -773 && loc.getY() >= 0 && loc.getZ() >= -1111)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void skelig6(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -553 && loc.getY() <= 200 && loc.getZ() <= -1013 
				&& loc.getX() >= -680 && loc.getY() >= 0 && loc.getZ() >= -1078)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMITE);
		} 
	}
	
	public void skelig7(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -496 && loc.getY() <= 200 && loc.getZ() <= -1097 
				&& loc.getX() >= -621 && loc.getY() >= 0 && loc.getZ() >= -1127)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} 
	}
	
	public void skelig8(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -519 && loc.getY() <= 200 && loc.getZ() <= -1045 
				&& loc.getX() >= -560 && loc.getY() >= 124 && loc.getZ() >= -1085)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void skelig9(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -766 && loc.getY() <= 200 && loc.getZ() <= -1080 
				&& loc.getX() >= -963 && loc.getY() >= 0 && loc.getZ() >= -1191)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void skelig10(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -964 && loc.getY() <= 200 && loc.getZ() <= -1071 
				&& loc.getX() >= -1071 && loc.getY() >= 0 && loc.getZ() >= -1204)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void skelig11(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= -700 && loc.getY() <= 200 && loc.getZ() <= -524 
				&& loc.getX() >= -838 && loc.getY() >= 0 && loc.getZ() >= -594)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.OCELOT);
		} 
	}
	
	public void skelig12(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -484 && loc.getY() <= 49 && loc.getZ() <= -680 
				&& loc.getX() >= -585 && loc.getY() >= 0 && loc.getZ() >= -765)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.STRAY);
		} 
	}
	
	public void hardSeaDungeon(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3839 && loc.getY() <= 134 && loc.getZ() <= 3990 
				&& loc.getX() >= 3683 && loc.getY() >= 58 && loc.getZ() >= 3932)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void tiperari1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 988 && loc.getY() <= 110 && loc.getZ() <= -697 
				&& loc.getX() >= 831 && loc.getY() >= 40 && loc.getZ() >= -784)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ENDERMAN);
		} 
	}
	
	public void tiperari2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1045 && loc.getY() <= 110 && loc.getZ() <= -784 
				&& loc.getX() >= 768 && loc.getY() >= 40 && loc.getZ() >= -995)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.LLAMA);
		} 
	}
	
	public void tiperariChurch(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 890 && loc.getY() <= 110 && loc.getZ() <= -1015 
				&& loc.getX() >= 803 && loc.getY() >= 65 && loc.getZ() >= -1114)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void tiperariCave1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 890 && loc.getY() <= 64 && loc.getZ() <= -996 
				&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -1155)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void tiperariCave2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 890 && loc.getY() <= 39 && loc.getZ() <= -919 
				&& loc.getX() >= 717 && loc.getY() >= 0 && loc.getZ() >= -995)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} 
	}
	
	public void tiperariOre(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1148 && loc.getY() <= 110 && loc.getZ() <= -967 
				&& loc.getX() >= 1046 && loc.getY() >= 30 && loc.getZ() >= -1056)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void tiperariRuin(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1303 && loc.getY() <= 110 && loc.getZ() <= -800 
				&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -965)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.OCELOT);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void tiperariField1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1082 && loc.getY() <= 120 && loc.getZ() <= -1058 
				&& loc.getX() >= 926 && loc.getY() >= 30 && loc.getZ() >= -1226)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
		} 
	}
	
	public void tiperariField2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1152 && loc.getY() <= 120 && loc.getZ() <= -1058 
				&& loc.getX() >= 1083 && loc.getY() >= 30 && loc.getZ() >= -1226)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		} 
	}
	
	public void tiperariField3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -986 
				&& loc.getX() >= 1153 && loc.getY() >= 30 && loc.getZ() >= -1226)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void tiperariField4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1227 
				&& loc.getX() >= 960 && loc.getY() >= 30 && loc.getZ() >= -1307)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void badlands1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1308 
				&& loc.getX() >= 1023 && loc.getY() >= 30 && loc.getZ() >= -1444)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		} 
	}
	
	public void badlands2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 60 && loc.getZ() <= -1446 
				&& loc.getX() >= 1073 && loc.getY() >= 30 && loc.getZ() >= -1541)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void badlands3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1409 
				&& loc.getX() >= 1198 && loc.getY() >= 61 && loc.getZ() >= -1518)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		} 
	}
	
	public void badlands4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1299 && loc.getY() <= 120 && loc.getZ() <= -1519 
				&& loc.getX() >= 1165 && loc.getY() >= 61 && loc.getZ() >= -1699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void badlands5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 987 && loc.getY() <= 255 && loc.getZ() <= -1330 
				&& loc.getX() >= 835 && loc.getY() >= 0 && loc.getZ() >= -1446)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void badlands6(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 1027 && loc.getY() <= 70 && loc.getZ() <= -1461 
				&& loc.getX() >= 917 && loc.getY() >= 48 && loc.getZ() >= -1704)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
	}
	
	public void badlands7(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 1020 && loc.getY() <= 90 && loc.getZ() <= -1474 
				&& loc.getX() >= 739 && loc.getY() >= 71 && loc.getZ() >= -1699)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
	}
	
	public void badlands8(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 915 && loc.getY() <= 70 && loc.getZ() <= -1556 
				&& loc.getX() >= 751 && loc.getY() >= 48 && loc.getZ() >= -1699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		}  else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.OCELOT);
		}
	}
	
	public void badlands9(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 834 && loc.getY() <= 255 && loc.getZ() <= -1330 
				&& loc.getX() >= 743 && loc.getY() >= 0 && loc.getZ() >= -1538)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.EVOKER);
		} 
	}
	
	public void badlands10(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1149 && loc.getY() <= 255 && loc.getZ() <= -1509 
				&& loc.getX() >= 936 && loc.getY() >= 91 && loc.getZ() >= -1699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} 
	}
	
	public void badlandsCave1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 1034 && loc.getY() <= 47 && loc.getZ() <= -1517 
				&& loc.getX() >= 941 && loc.getY() >= 0 && loc.getZ() >= -1608)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} 
	}
	
	public void badlandsCave2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 939 && loc.getY() <= 37 && loc.getZ() <= -1552 
				&& loc.getX() >= 844 && loc.getY() >= 0 && loc.getZ() >= -1623)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.MAGMA_CUBE);
		} 
	}
	
	public void hardForestRoom21(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3645 && loc.getY() <= 111 && loc.getZ() <= 4148 
				&& loc.getX() >= 3596 && loc.getY() >= 85 && loc.getZ() >= 4098)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SILVERFISH);
		} 
	}
	
	public void hardForestRoom22(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3769 && loc.getY() <= 160 && loc.getZ() <= 4133 
				&& loc.getX() >= 3665 && loc.getY() >= 125 && loc.getZ() >= 4073)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void hardForestRoom23(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3645 && loc.getY() <= 155 && loc.getZ() <= 4148 
				&& loc.getX() >= 3596 && loc.getY() >= 135 && loc.getZ() >= 4098)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} 
	}
	
	public void hardForestMidBoss(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3751 && loc.getY() <= 105 && loc.getZ() <= 4184 
				&& loc.getX() >= 3727 && loc.getY() >= 85 && loc.getZ() >= 4156)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.VEX);
		} 
	}
	
	public void hardForestBoss(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 3699 && loc.getY() <= 230 && loc.getZ() <= 4217 
				&& loc.getX() >= 3657 && loc.getY() >= 180 && loc.getZ() >= 4172)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} 
	}
	
	public void iberumoa1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 707 && loc.getY() <= 125 && loc.getZ() <= -1324 
				&& loc.getX() >= 555 && loc.getY() >= 50 && loc.getZ() >= -1700)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 2) {
			if (player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
				loc.getWorld().spawnEntity(loc, EntityType.STRAY);
			}
		} 
	}
	
	public void iberumoa2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= 566 && loc.getY() <= 36 && loc.getZ() <= -1611 
				&& loc.getX() >= 518 && loc.getY() >= 1 && loc.getZ() >= -1684)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.CAVE_SPIDER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.BLAZE);
		} 
	}
	
	public void iberumoa3(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 554 && loc.getY() <= 156 && loc.getZ() <= -1206 
				&& loc.getX() >= 406 && loc.getY() >= 47 && loc.getZ() >= -1697)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.POLAR_BEAR);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOGLIN);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} 
	}
	
	public void iberumoa4(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 410 && loc.getY() <= 46 && loc.getZ() <= -1177 
				&& loc.getX() >= 346 && loc.getY() >= 5 && loc.getZ() >= -1699)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
	}
	
	public void iberumoa5(Player player, Location loc) {
		loc = location(loc);
		if (!(loc.getX() <= 454 && loc.getY() <= 40 && loc.getZ() <= -1574 
				&& loc.getX() >= 411 && loc.getY() >= 5 && loc.getZ() >= -1682)) {
			return;
		}
		
		loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
	}
	
	public void santa1(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -2636 && loc.getY() <= 100 && loc.getZ() <= -901 
				&& loc.getX() >= -2750 && loc.getY() >= 30 && loc.getZ() >= -1030)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} 
	}
	
	public void santa2(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -2566 && loc.getY() <= 100 && loc.getZ() <= -1031 
				&& loc.getX() >= -2694 && loc.getY() >= 30 && loc.getZ() >= -1100)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void santa3(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -2475 && loc.getY() <= 120 && loc.getZ() <= -945 
				&& loc.getX() >= -2565 && loc.getY() >= 80 && loc.getZ() >= -1086)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.VINDICATOR);
		} 
	}
	
	public void santa4(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -2543 && loc.getY() <= 103 && loc.getZ() <= -885 
				&& loc.getX() >= -2589 && loc.getY() >= 90 && loc.getZ() >= -926)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.RAVAGER);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void santa5(Player player, Location loc) {
		int num = rnd.nextInt(2);
		loc = location(loc);
		if (!(loc.getX() <= -2545 && loc.getY() <= 79 && loc.getZ() <= -903 
				&& loc.getX() >= -2608 && loc.getY() >= 50 && loc.getZ() >= -998)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} 
	}
	
	public void lastIberumoa1(Player player, Location loc) {
		int num = rnd.nextInt(3);
		loc = location(loc);
		if (!(loc.getX() <= 357 && loc.getY() <= 200 && loc.getZ() <= -1302 
				&& loc.getX() >= 98 && loc.getY() >= 5 && loc.getZ() >= -1699)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SLIME);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		} 
	}
	
	public void underground1(Player player, Location loc) {
		int num = rnd.nextInt(6);
		loc = location(loc);
		if (!(loc.getX() <= 1200 && loc.getY() <= -1 && loc.getZ() <= 600 
				&& loc.getX() >= 700 && loc.getY() >= -100 && loc.getZ() >= 0)) {
			return;
		}
		
		if (num == 0) {
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		} else if (num == 1) {
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		} else if (num == 2) {
			loc.getWorld().spawnEntity(loc, EntityType.SPIDER);
		} 
	}
	
	public Location location(Location loc) {
		int x = rnd.nextInt(10) - 5;
		int z = rnd.nextInt(10) - 5;
		loc.add(x, 0, z);
		loc.add(0, 1, 0);
		return loc;
	}

}