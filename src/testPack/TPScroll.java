package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TPScroll {
	
	private int taskID;
	private Message msg = new Message();
	
	public void teleport(Player player, ItemStack itemArg) {
		World world = player.getWorld();
		ticket0(player, itemArg, world);
		ticket1(player, itemArg, world);
		ticket2(player, itemArg, world);
		ticket3(player, itemArg, world);
		ticket4(player, itemArg, world);
		ticket6(player, itemArg, world);
		ticket7(player, itemArg, world);
		ticket8(player, itemArg, world);
		ticket9(player, itemArg, world);
		ticket10(player, itemArg, world);
		ticket11(player, itemArg, world);
		ticket12(player, itemArg, world);
		ticket13(player, itemArg, world);
		ticket14(player, itemArg, world);
		ticket16(player, itemArg, world);
		ticket17(player, itemArg, world);
		ticket18(player, itemArg, world);
	}
	
	public void ticket0(Player player, ItemStack itemArg, World world) {
		// 튜토 4041 255 3851  3966 0 3818
		Location loc = player.getLocation();
		if (loc.getX() <= 4041 && loc.getY() <= 255 && loc.getZ() <= 3851 && 
				loc.getX() >= 3966 && loc.getY() >= 0 && loc.getZ() >= 3818) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "마을 스크롤")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc2 = new Location(world, 4006, 167, 3853);
				player.teleport(loc2);
				player.getWorld().playSound(loc2, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
			}
		}
	}
	
	public void ticket1(Player player, ItemStack itemArg, World world) {
		// 워그닐->대륙  -1936 51 3013  -1941 57 3002
		Location loc = player.getLocation();
		if (loc.getX() <= -1936 && loc.getY() <= 57 && loc.getZ() <= 3013 && 
				loc.getX() >= -1941 && loc.getY() >= 51 && loc.getZ() >= 3002) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "대륙행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, -1880, 52, 2714);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1936 && loc2.getY() <= 57 && loc2.getZ() <= 3013 && 
								loc2.getX() >= -1941 && loc2.getY() >= 51 && loc2.getZ() >= 3002) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				
			}
		}
	}
	
	public void ticket2(Player player, ItemStack itemArg, World world) {
		// 대륙->워그닐  -1882 49 2707  -1879 57 2719
		Location loc = player.getLocation();
		if (loc.getX() <= -1879 && loc.getY() <= 57 && loc.getZ() <= 2719 && 
				loc.getX() >= -1882 && loc.getY() >= 49 && loc.getZ() >= 2707) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "워그닐행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, -1938, 53, 3007);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1879 && loc2.getY() <= 57 && loc2.getZ() <= 2719 && 
								loc2.getX() >= -1882 && loc2.getY() >= 49 && loc2.getZ() >= 2707) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
			}
		}
	}
	
	public void ticket3(Player player, ItemStack itemArg, World world) {
		// 오스->아란모어 -1379 91 903  -1388 48 871
		Location loc = player.getLocation();
		if (loc.getX() <= -1379 && loc.getY() <= 91 && loc.getZ() <= 903 && 
				loc.getX() >= -1388 && loc.getY() >= 48 && loc.getZ() >= 871) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "아란모어행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, -1927, 53, 451);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1379 && loc2.getY() <= 91 && loc2.getZ() <= 903 && 
								loc2.getX() >= -1388 && loc2.getY() >= 48 && loc2.getZ() >= 871) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
				
			}
		}
	}
	
	public void ticket4(Player player, ItemStack itemArg, World world) {
		// 아란모어->오스  -1939 91 449  -1908 48 438
		Location loc = player.getLocation();
		if (loc.getX() <= -1908 && loc.getY() <= 91 && loc.getZ() <= 449 && 
				loc.getX() >= -1939 && loc.getY() >= 48 && loc.getZ() >= 438) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "오스행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, -1377, 53, 889);
				List<Entity> list = player.getNearbyEntities(10, 10, 10);
				for(Entity e : list) {
					if(e instanceof Player) {					
						Location loc2 = e.getLocation();
						if(loc2.getX() <= -1908 && loc2.getY() <= 91 && loc2.getZ() <= 449 && 
								loc2.getX() >= -1939 && loc2.getY() >= 48 && loc2.getZ() >= 438) {
							e.teleport(loc3);
						}
					}
				}
				player.teleport(loc3);
				player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
			}
		}
	}
	
	public void ticket6(Player player, ItemStack itemArg, World world) {
		// 미궁
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "미궁 워프 스크롤")) {
			if(player.getLevel() >= 340) {
				itemArg.setAmount(itemArg.getAmount()-1);	
				Location loc = new Location(world, 96.5, 54, 695.5, 180, 0);
				player.teleport(loc);
				player.getWorld().playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				// 보스바 관련
				try {
					new BossHealth().removePlayer(player);
				} catch (Exception e) {

				}
			} else {
				player.sendMessage(ChatColor.RED + "이 아이템을 사용하기에는 레벨이 낮다.");
			}
			
		}
	}
	
	public void ticket7(Player player, ItemStack itemArg, World world) {
		// 하마베->라파누이  952 95 -40  938 45 -82
		Location loc = player.getLocation();
		if (loc.getX() <= 952 && loc.getY() <= 95 && loc.getZ() <= -40 && 
				loc.getX() >= 938 && loc.getY() >= 45 && loc.getZ() >= -82) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "라파누이행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 라파누이에는 어쩐 일로 가는 것이오.%선장: 너무 외딴 섬이라 찾는 이도 없소.%"
									+ "선장: 나도 이 섬에 가는 것은 몇년만인지..%선장: 지형상 이 배로는 부두에 도착할 순 없고%"
									+ "선장: 작은 배로 갈아타야 갈 수 있다오.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 1756, 53, 2111, 270, 0));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket8(Player player, ItemStack itemArg, World world) {
		// 라파누이->하마베  1756 40 2122  1750 70 2100
		Location loc = player.getLocation();
		if (loc.getX() <= 1756 && loc.getY() <= 70 && loc.getZ() <= 2122 && 
				loc.getX() >= 1750 && loc.getY() >= 40 && loc.getZ() >= 2100) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베행 티켓 (라파누이)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 라파누이에서 볼 일은 다 보셨소?%선장: 그저 안전히 돌아오는 배에 탄 것으로 다행인 것이오.%"
									+ "선장: 또 가고 싶다면야 배를 운행해 줄 수 있지만..%선장: 개인적으로 가기는 싫은 섬이구려.%"
									+ "선장: 거의 다 와가는구만.%선장: 이제 곧 도착이오.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 954, 55, -57));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket9(Player player, ItemStack itemArg, World world) {
		// 하마베->라히무호나  952 95 -40  938 45 -82
		Location loc = player.getLocation();
		if (loc.getX() <= 952 && loc.getY() <= 95 && loc.getZ() <= -40 && 
				loc.getX() >= 938 && loc.getY() >= 45 && loc.getZ() >= -82) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "라히무호나행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 라히무호나를 가다니 관광용인가?%선장: 가을만 되면 이곳을 찾는 관광객이 많았다네.%"
									+ "선장: 지금은 포보르들이 득실거리지만 말일세.%선장: 포보르들을 쓸어버리면서 주변 경관이나 구경하시게.%"
									+ "선장: 이번에도 작은 배로 갈아타야하네.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, -2017, 53, 1442, 270, 0));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket10(Player player, ItemStack itemArg, World world) {
		// 라히무호나->하마베 -2027 40 1425  -2013 80 1460
		Location loc = player.getLocation();
		if (loc.getX() <= -2013 && loc.getY() <= 80 && loc.getZ() <= 1460 && 
				loc.getX() >= -2027 && loc.getY() >= 40 && loc.getZ() >= 1425) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베행 티켓 (라히무호나)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 라히무호나에서 볼 일은 다 보셨소?%선장: 항상 느끼는거지만 섬은 참 아름답구려.%"
									+ "선장: 포보르들이 있다는 점이 좀 거슬리지만%선장: 자네같은 모험가들이 가끔씩 청소해주면 언젠간 소멸하겠지.%"
									+ "선장: 거의 다 와가는구만.%선장: 이제 곧 도착이오.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 954, 55, -57));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket11(Player player, ItemStack itemArg, World world) {
		// 시오카나->스켈리그 525 66 -541  534 45 -520
		Location loc = player.getLocation();
		if (loc.getX() <= 534 && loc.getY() <= 66 && loc.getZ() <= -520 && 
				loc.getX() >= 525 && loc.getY() >= 45 && loc.getZ() >= -541) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "스켈리그행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 긴 여행에 힘들겠구만.%선장: 그래도 스켈리그섬에는 마을이 있다오.%"
									+ "선장: 아마 숙소나 포션 상점도 있을걸세.%선장: 얼굴을 보아하니..%"
									+ "선장: 스켈리그섬에 오래 체류할 것 같구먼.%선장: 이제 곧 도착이오.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, -854, 56, -731));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket12(Player player, ItemStack itemArg, World world) {
		// 시오카나->하마베 525 66 -541  534 45 -520
		Location loc = player.getLocation();
		if (loc.getX() <= 534 && loc.getY() <= 66 && loc.getZ() <= -520 && 
				loc.getX() >= 525 && loc.getY() >= 45 && loc.getZ() >= -541) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베행 티켓 (시오카나)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 하마베로 돌아가는구만.%선장: 시오카나가 좁아서 오래있을 곳은 아니지.%"
									+ "선장: 하마베로 돌아가면 편히 쉬시게나.%선장: 어차피 다시 시오카나로 올 것 같구만.%"
									+ "선장: 다시 만나도록 하지.%선장: 이제 곧 도착이오.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 954, 55, -57));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket13(Player player, ItemStack itemArg, World world) {
		// 하마베->시오카나  952 95 -40  938 45 -82
		Location loc = player.getLocation();
		if (loc.getX() <= 952 && loc.getY() <= 95 && loc.getZ() <= -40 && 
				loc.getX() >= 938 && loc.getY() >= 45 && loc.getZ() >= -82) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "시오카나행 티켓 (하마베)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 시오카나는 무역용 섬이었다네.%선장: 지금은 포보르가 점령해버렸지..%"
									+ "선장: 계층의 약속이 깨져가는걸까..%선장: 본래 마을은 포보르로부터 안전해야만 했지.%"
									+ "선장: 그 약속이 깨지고 있는것 같구만.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 533, 53, -531, 270, 0));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket14(Player player, ItemStack itemArg, World world) {
		// 스켈리그->시오카나  -828 95 -742  -884 45 -699
		Location loc = player.getLocation();
		if (loc.getX() <= -828 && loc.getY() <= 95 && loc.getZ() <= -699 && 
				loc.getX() >= -884 && loc.getY() >= 45 && loc.getZ() >= -742) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "시오카나행 티켓 (스켈리그)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 이제 하마베로 돌아가는건가.%선장: 시오카나섬을 거쳐서 가야하는게 불편하지..%"
									+ "선장: 하지만 어쩔 수 없네.%선장: 당신, 돈 많지 않은가.%"
									+ "선장: 나는 그 덕에 돈도 벌고. 하하하.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 533, 53, -531, 270, 0));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket16(Player player, ItemStack itemArg, World world) {
		// 티페라리->하마베  741 114 -780  827 45 -731
		Location loc = player.getLocation();
		if (loc.getX() <= 827 && loc.getY() <= 114 && loc.getZ() <= -731 && 
				loc.getX() >= 741 && loc.getY() >= 45 && loc.getZ() >= -780) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베행 티켓 (티페라리)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 후우..%선장: 드디어 집으로 돌아갈 수 있겠구만.%"
									+ "선장: 그래도 자네가 배를 이렇게 타주니 이 시국에도 돈을 버는구만.%선장: 매우 고맙게 생각하고 있다네.%"
									+ "선장: 앞으로도 잘 부탁드리겠네.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 954, 55, -57));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket17(Player player, ItemStack itemArg, World world) {
		// 하마베->크리스마스  952 95 -40  938 45 -82
		Location loc = player.getLocation();
		if (loc.getX() <= 952 && loc.getY() <= 95 && loc.getZ() <= -40 && 
				loc.getX() >= 938 && loc.getY() >= 45 && loc.getZ() >= -82) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "크리스마스행 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 호오.. 크리스마스 섬을 가는건가?%선장: 나는 배 위에만 살아서 오늘 날짜도 모른다네.%"
									+ "선장: 오늘이 크리스마스인 줄은 몰랐군.%선장: 이번에도 작은 배로 갈아타야하네.%"
									+ "선장: 곧 도착하겠구만.%선장: 메리크리스마스라네.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, -2748, 53, -1049, 270, 0));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket18(Player player, ItemStack itemArg, World world) {
		// 티페라리->하마베  -2744 60 -1035  -2754 40 -1059
		Location loc = player.getLocation();
		if (loc.getX() <= -2744 && loc.getY() <= 60 && loc.getZ() <= -1035 && 
				loc.getX() >= -2754 && loc.getY() >= 40 && loc.getZ() >= -1059) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "하마베행 티켓 (크리스마스)")) {
				itemArg.setAmount(itemArg.getAmount()-1);				
				Location loc3 = new Location(world, 1779, 54, 2970, 270, 0);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}

						if (time == 0) {
							player.teleport(loc3);
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							msg.msg(player, "선장: 후우..%선장: 드디어 집으로 돌아갈 수 있겠구만.%"
									+ "선장: 그래도 자네가 배를 이렇게 타주니 이 시국에도 돈을 버는구만.%선장: 매우 고맙게 생각하고 있다네.%"
									+ "선장: 앞으로도 잘 부탁드리겠네.%선장: 곧 도착하겠구만.");
						}

						if (time >= 400) {
							player.teleport(new Location(world, 954, 55, -57));
							player.getWorld().playSound(loc3, Sound.ENTITY_PLAYER_SPLASH, 1.0f, 1.0f);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
}
