package testPack;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.Vector;

public class RefreshServer {

	int sleep;
	Random rnd = new Random();
	World world;
	int change = 0;
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();

	public RefreshServer() {
		
		world = Bukkit.getWorld("world");
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		
			int time = 0;
			
			@Override
			public void run() {
				
				// 보스 자연치유
				if(time % 20 == 0) {
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						try {
							String str = ent.getCustomName().split("\\.")[1];
							String num = str.split("]")[0];
							if(num.equals("??")) {
								LivingEntity mob = (LivingEntity) ent; 
								if(mob.getHealth() < 0) {
									mob.remove();
								} 
								if(mob.getHealth() + (mob.getMaxHealth() / 200.0) <= mob.getMaxHealth()) {
									if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE) == null) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 200.0));
									} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 0) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 250.0));
									} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 1) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 300.0));
									} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 2) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 350.0));
									} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 3) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 400.0));
									} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() >= 4) {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 450.0));
									} else {
										mob.setHealth(mob.getHealth() + (mob.getMaxHealth() / 200.0));
									}
								}
								continue;
							}
						} catch(Exception e) {
							
						}
					}
				}
				
				// 몹 삭제
				if(time % 600 == 0) {
					List<Entity> list1 = world.getEntities();
					for(Entity ent : list1) {
						
						try {
							String str = ent.getCustomName().split("\\.")[1];
							String num = str.split("]")[0];
							if(num.equals("??")) {
								continue;
							}
						} catch(Exception e) {
							
						}
						
						int cnt = 0;
						List<Entity> list2 = ent.getNearbyEntities(30, 100, 30);
						for(Entity ent2 : list2) {
							if(ent2 instanceof Player) {
								cnt++;
							}
						}
						if(cnt == 0) {
							try {
								if(ent.getType() == EntityType.ZOMBIE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.DROWNED) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIE_VILLAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SILVERFISH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.STRAY) {
									ent.remove();
								}
								if(ent.getType() == EntityType.RAVAGER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER_SKELETON) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITCH) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CAVE_SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SPIDER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.MAGMA_CUBE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SLIME) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HUSK) {
									ent.remove();
								}
								if(ent.getType() == EntityType.EVOKER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ENDERMITE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ELDER_GUARDIAN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.GHAST) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PHANTOM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.VINDICATOR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.IRON_GOLEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.BLAZE) {
									ent.remove();
								}
								if(ent.getType() == EntityType.WITHER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.POLAR_BEAR) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOMBIFIED_PIGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.LLAMA) {
									ent.remove();
								}
								if(ent.getType() == EntityType.CREEPER) {
									ent.remove();
								}
								if(ent.getType() == EntityType.OCELOT) {
									ent.remove();
								}
								if(ent.getType() == EntityType.PANDA) {
									ent.remove();
								}
								if(ent.getType() == EntityType.RABBIT) {
									ent.remove();
								}
								if(ent.getType() == EntityType.ZOGLIN) {
									ent.remove();
								}
								if(ent.getType() == EntityType.HORSE) {
									if(((Horse) ent).isCustomNameVisible()) {
										ent.remove();
									}
								}
								if(ent.getType() == EntityType.ARMOR_STAND) {
									ArmorStand as = (ArmorStand) ent;
									if(as.getHelmet().getType() == Material.ANDESITE_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.RED_NETHER_BRICK_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.DIORITE_STAIRS) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.POLISHED_GRANITE_SLAB) {
										ent.remove();
									} else if(as.getHelmet().getType() == Material.POLISHED_ANDESITE_STAIRS) {
										ent.remove();
									} else if(as.getItemInHand().getType() == Material.POLISHED_BLACKSTONE_SLAB) {
										ent.remove();
									} else if(as.getItemInHand().getType() == Material.GREEN_CARPET) {
										ent.remove();
									}
								}
								if(ent.getType() == EntityType.DROPPED_ITEM) {
									ent.remove();
								}
								if(ent.getType() == EntityType.FIREBALL) {
									ent.remove();
								}
								if(ent.getType() == EntityType.SMALL_FIREBALL) {
									ent.remove();
								}
							} catch(Exception e) {
								
							}
						}
					}
					
					// 날씨 데미지
					for(Player allPlayer : Bukkit.getOnlinePlayers()) {
						Location loc = allPlayer.getLocation();
						if(loc.getBlock().getBiome() == Biome.BASALT_DELTAS || loc.getBlock().getBiome() == Biome.SNOWY_PLAINS) {
							
							if(allPlayer.getInventory().contains(Material.ORANGE_DYE)) {
								continue;
							}
							
							boolean wear = false;
							
							if (allPlayer.getInventory().getHelmet() != null) {
								if (allPlayer.getInventory().getChestplate() != null) {
									if (allPlayer.getInventory().getLeggings() != null) {
										if (allPlayer.getInventory().getBoots() != null) {
											
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "방한 신발")) {
															wear = true;
														}
													}
												}
											}
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "누군가의 방한 신발")) {
															wear = true;
														}
													}
												}
											}
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "냉혹한 미명의 신발")) {
															wear = true;
														}
													}
												}
											}
											if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "크리스탈 아이스 헬멧")) {
												if (allPlayer.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "크리스탈 아이스 갑옷")) {
													if (allPlayer.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "크리스탈 아이스 각반")) {
														if (allPlayer.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "크리스탈 아이스 신발")) {
															wear = true;
														}
													}
												}
											}
											
										}
									}
								}
							}
							
							if (allPlayer.getInventory().getHelmet() != null) {
								if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "루돌프의 눈물")) {
									wear = true;
								}
								if (allPlayer.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "그녀석의 모자")) {
									wear = true;
								}
							}
							
							if (allPlayer.getInventory().getItemInOffHand().getItemMeta() != null) {
								try {
									if(allPlayer.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "가시고기의 눈물")) {
										wear = true;
									}
									String[] spac = allPlayer.getInventory().getItemInOffHand().getItemMeta().getLocalizedName().split(",");
									if(spac[5].equals("170")) {
										wear = true;
									}
									if(spac[6].equals("170")) {
										wear = true;
									}
									if(spac[7].equals("170")) {
										wear = true;
									}
									if(spac[8].equals("170")) {
										wear = true;
									}
									if(spac[9].equals("170")) {
										wear = true;
									}
								} catch(Exception e) {
									
								}
							}
							
							if(wear == false) {
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 2,true,true));
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 600, 2,true,true));
								allPlayer.setFreezeTicks(90);
								allPlayer.sendMessage(ChatColor.RED + "추워서 몸이 얼어붙는 것 같다.");
							}
							
							if(allPlayer.isInWater()) {
								allPlayer.removePotionEffect(PotionEffectType.SLOW);
								allPlayer.removePotionEffect(PotionEffectType.HARM);
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 600, 4,true,true));
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 600, 8,true,true));
								allPlayer.setFreezeTicks(90);
								allPlayer.sendMessage(ChatColor.RED + "극심한 추위로 몸이 얼고 있다.");
							}
							
						} else if(loc.getBlock().getBiome() == Biome.DESERT || loc.getBlock().getBiome() == Biome.CRIMSON_FOREST) {
							
							boolean wear = false;
							
							for(PotionEffect effect : allPlayer.getActivePotionEffects()){
								if(effect.getType().getName().equals("HERO_OF_THE_VILLAGE")) {
									if(effect.getDuration() <= 600) {
										allPlayer.sendMessage(ChatColor.RED + "축복의 포션의 효과가 곧 사라집니다.");
									}
									wear = true;
									break;
								}
						    }
							
							if(wear == false) {
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 600, 100000,true,true));
								allPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 0,true,true));
								allPlayer.sendMessage(ChatColor.RED + "열사병으로 쓰러질 것 같다.");
							}
						}
					}
				}
				
				// 마나 리젠
				if(time % 40 == 0) {
					for(Player player : Bukkit.getOnlinePlayers()) {
						ItemStack mana = new ItemStack(Material.HEART_OF_THE_SEA);
						ItemMeta manaIm = mana.getItemMeta();
						manaIm.setDisplayName(ChatColor.BLUE + "마나");
						mana.setItemMeta(manaIm);
						if (player.getInventory().contains(Material.HEART_OF_THE_SEA)) {
							int i = 0;
							for (ItemStack is : player.getInventory().getContents()) {
								if (is == null)
									continue;
								if (is.getType() == Material.HEART_OF_THE_SEA) {
									i = i + is.getAmount();
								}
							}
							if (i < 20)
								player.getInventory().addItem(mana);
						} else {
							player.getInventory().setItem(8, mana);
						}
					}
				}
				
//				if(time % 6000 == 0) {
//					
//					if(change == 0) {
//						IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.LIGHT_PURPLE + "" + ChatColor.UNDERLINE + "https://aile-server.netlify.app/"
//			                    + "\",\"clickEvent\": {\"action\":\"open_url\",\"value\":\"" + "https://aile-server.netlify.app/"
//			                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
//			                    + "\"}}}]}"); 
//						for(Player player : Bukkit.getOnlinePlayers()) {
//							player.sendMessage(ChatColor.BLUE + "=============================");
//							player.sendMessage(ChatColor.GOLD + "아래 공식 홈페이지에서 많은 정보를 얻을 수 있습니다!");
//							try {
//								PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player.getUniqueId());
//								Object handle = player.getClass().getMethod("getHandle").invoke(player);
//						        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
//						        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
//							} catch(Exception e) {
//								
//							}
//							player.sendMessage("");
//							player.sendMessage(ChatColor.GOLD + "링크를 클릭해 바로 이동!");
//							player.sendMessage(ChatColor.BLUE + "=============================");
//						}
//						change = 1;
//					} else if(change == 1) {
//						IChatBaseComponent comp = ChatSerializer.a("{\"text\":\"" + "\",\"extra\":[{\"text\":\"" + ChatColor.LIGHT_PURPLE + "" + ChatColor.UNDERLINE + "https://cafe.naver.com/yumehamaserver"
//			                    + "\",\"clickEvent\": {\"action\":\"open_url\",\"value\":\"" + "https://cafe.naver.com/yumehamaserver"
//			                    +  "\",\"hoverEvent\": {\"action\":\"show_text\",\"value\":\"" + ""
//			                    + "\"}}}]}"); 
//						for(Player player : Bukkit.getOnlinePlayers()) {
//							player.sendMessage(ChatColor.BLUE + "=============================");
//							player.sendMessage(ChatColor.GOLD + "아래 공식 카페에서 많은 정보를 얻을 수 있습니다!");
//							try {
//								PacketPlayOutChat chat = new PacketPlayOutChat(comp, ChatMessageType.CHAT, player.getUniqueId());
//								Object handle = player.getClass().getMethod("getHandle").invoke(player);
//						        Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
//						        playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, chat);
//							} catch(Exception e) {
//								
//							}
//							player.sendMessage("");
//							player.sendMessage(ChatColor.GOLD + "링크를 클릭해 바로 이동!");
//							player.sendMessage(ChatColor.BLUE + "=============================");
//						}
//						change = 0;
//					}
//					
//					
//					
//					if(map.size() == 0) {
//						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
//							map.put(allPlayer.getDisplayName(), (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*5));
//						}
//					} else {
//						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
//							if(!(allPlayer.getDisplayName().equals("yumehama") || allPlayer.getDisplayName().equals("WoolRing"))) {
//								if(map.containsKey(allPlayer.getDisplayName())) {
//									int num = map.get(allPlayer.getDisplayName());
//									if(num == (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*5)) {
//										allPlayer.kickPlayer("잠수 플레이어로 추정되어 서버에서 나가졌습니다.");
//									}
//								}
//							}
//						}						
//						map.clear();
//						for(Player allPlayer : Bukkit.getOnlinePlayers()) {
//							map.put(allPlayer.getDisplayName(), (int)(allPlayer.getLocation().getX()*2 + allPlayer.getLocation().getY()*3 + allPlayer.getLocation().getZ()*5));
//						}
//					}
//				}
				
				if(time >= 6000) {
					time = 0;
				}
			
				time++;
				
			}						
			
		}, 0, 1);
	}
	
	private Class<?> getNMSClass(String name) {
		try {
	        return Class.forName("net.minecraft.server."
	                + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
}
