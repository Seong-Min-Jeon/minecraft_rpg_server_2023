package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;
import org.bukkit.map.MapView.Scale;

public class AnotherScroll {
	
	private int taskID;

	public void effect(Player player, ItemStack itemArg) {
		World world = player.getWorld();
		questRemoveScroll(player, itemArg, world);
		mapPaper(player, itemArg, world);
		levelUpScroll(player, itemArg, world);
		reflectRemove(player, itemArg, world);
		sweepingRemove(player, itemArg, world);
	}
	
	public void questRemoveScroll(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트 제거 스크롤")) {
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void mapPaper(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "지도용 종이")) {
			Location loc = player.getLocation();
			if(loc.getX() > 3500 || loc.getZ() > 3500 || loc.getX() < -3500 || loc.getZ() < -3500) {
				player.sendMessage(ChatColor.RED + "사용불가 지역입니다.");
				return;
			}
			
			ItemStack item = new ItemStack(Material.FILLED_MAP);
			MapMeta mm = (MapMeta) item.getItemMeta();
			mm.setLore(null);
			mm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			mm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			mm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MapView map = Bukkit.createMap(world);
			map.setCenterX(player.getLocation().getBlockX());
			map.setCenterZ(player.getLocation().getBlockZ());
			map.setScale(Scale.NORMAL);
			map.setTrackingPosition(true);
			map.setLocked(false);
			mm.setMapView(map);
			item.setItemMeta(mm);
			player.getInventory().addItem(item);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void levelUpScroll(Player player, ItemStack itemArg, World world) {	
		try {
			if (itemArg.getItemMeta().getDisplayName().substring(0,9).equalsIgnoreCase(ChatColor.DARK_RED + "레벨업 스크롤")) {
				try {
					String str = itemArg.getItemMeta().getDisplayName();
					int lvl = Integer.parseInt(str.split("\\.")[1].split("\\]")[0]);
					player.setLevel(lvl);
				} catch(Exception e) {
					
				}
				itemArg.setAmount(itemArg.getAmount()-1);
			}	
		} catch(Exception e) {
			
		}
	}
	
	public void reflectRemove(Player player, ItemStack itemArg, World world) {	
		try {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "말랑말랑 스크롤")) {
				ItemStack item = player.getInventory().getItemInOffHand();
				if(item.getType()!=Material.AIR) {
					if(item.getType()==Material.WOODEN_SWORD || item.getType()==Material.STONE_SWORD || item.getType()==Material.IRON_SWORD || item.getType()==Material.GOLDEN_SWORD ||
	            			item.getType()==Material.DIAMOND_SWORD || item.getType()==Material.LEATHER_HELMET || item.getType()==Material.LEATHER_CHESTPLATE ||
	            			item.getType()==Material.LEATHER_LEGGINGS || item.getType()==Material.LEATHER_BOOTS || item.getType()==Material.CHAINMAIL_HELMET ||
	            			item.getType()==Material.CHAINMAIL_CHESTPLATE || item.getType()==Material.CHAINMAIL_LEGGINGS || item.getType()==Material.CHAINMAIL_BOOTS ||
	            			item.getType()==Material.IRON_HELMET || item.getType()==Material.IRON_CHESTPLATE || item.getType()==Material.IRON_LEGGINGS ||
	            			item.getType()==Material.IRON_BOOTS || item.getType()==Material.GOLDEN_HELMET || item.getType()==Material.GOLDEN_CHESTPLATE ||
	            			item.getType()==Material.GOLDEN_LEGGINGS || item.getType()==Material.GOLDEN_BOOTS || item.getType()==Material.DIAMOND_HELMET ||
	            			item.getType()==Material.DIAMOND_CHESTPLATE || item.getType()==Material.DIAMOND_LEGGINGS || item.getType()==Material.DIAMOND_BOOTS ||
	            			item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES ||
	            			item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES ||
							item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET ||
							item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE ||
							item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS ||
							item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS ||
							item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG ||
							item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG ||
							item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE ||
							item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL ||
							item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL ||
							item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB ||
							item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB ||
							item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB ||
							item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB ||
							item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE ||
							item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE ||
							item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS ||
							item.getType()==Material.NETHERITE_HELMET || item.getType()==Material.NETHERITE_CHESTPLATE || item.getType()==Material.NETHERITE_LEGGINGS || 
							item.getType()==Material.NETHERITE_BOOTS || item.getType()==Material.CARVED_PUMPKIN) {
						
						ItemMeta im = item.getItemMeta();
						String[] ary = im.getLocalizedName().split(",");
						try {
							if(Integer.parseInt(ary[9]) <= 0) {
								player.sendMessage(ChatColor.RED + "반격 수치가 0이하인 경우에는 사용할 수 없을 것 같다.");
								return;
							}
							
							itemArg.setAmount(itemArg.getAmount()-1);
							
							String result = makeEnch(ary, "0", 9);
							im.setLocalizedName(result);
							item.setItemMeta(im);
							
							if(item.getItemMeta().getLore()!=null) {
								ItemMeta newItemMeta = item.getItemMeta();
								String[] newEnch = newItemMeta.getLocalizedName().split(",");
								List<String> preList;
								preList = newItemMeta.getLore();
								int cnt = 0;
								for(int i = 0 ; i < preList.size() ; i++) {			
									if(preList.get(i).equals("=====인챈트=====")) {
										break;
									}
									cnt++;
								}
								List<String> list = new ArrayList<String>();
								for(int i = 0 ; i < cnt ; i++) {
									list.add(preList.get(i));
								}
								if(!(list.get(list.size()-1).equals(" "))) {
									list.add(" ");
								}
								list.add("=====인챈트=====");
								if(Integer.parseInt(newEnch[0]) != 0) {
									int lvl = Integer.parseInt(newEnch[0]);
									list.add(ChatColor.BLUE + "공격력: " + lvl);
								}
								if(Integer.parseInt(newEnch[1]) != 0) {
									int lvl = Integer.parseInt(newEnch[1]);
									list.add(ChatColor.BLUE + "추가 데미지(인간형): " + lvl);
								}
								if(Integer.parseInt(newEnch[2]) != 0) {
									int lvl = Integer.parseInt(newEnch[2]);
									list.add(ChatColor.BLUE + "추가 데미지(동물형): " + lvl);
								}
								if(Integer.parseInt(newEnch[3]) != 0) {
									int lvl = Integer.parseInt(newEnch[3]);
									list.add(ChatColor.BLUE + "추가 데미지(기타): " + lvl);
								}					
								if(Integer.parseInt(newEnch[4]) != 0) {
									int lvl = Integer.parseInt(newEnch[4]);
									list.add(ChatColor.BLUE + "스플레시: " + lvl);
								}
								if(Integer.parseInt(newEnch[5]) != 0) {
									int lvl = Integer.parseInt(newEnch[5]);
									list.add(ChatColor.BLUE + "방어력: " + lvl);
								}
								if(Integer.parseInt(newEnch[6]) != 0) {
									int lvl = Integer.parseInt(newEnch[6]);
									list.add(ChatColor.BLUE + "보호(화염): " + lvl);
								}
								if(Integer.parseInt(newEnch[7]) != 0) {
									int lvl = Integer.parseInt(newEnch[7]);
									list.add(ChatColor.BLUE + "보호(폭발): " + lvl);
								}
								if(Integer.parseInt(newEnch[8]) != 0) {
									int lvl = Integer.parseInt(newEnch[8]);
									list.add(ChatColor.BLUE + "보호(발사체): " + lvl);
								}
								if(Integer.parseInt(newEnch[9]) != 0) {
									int lvl = Integer.parseInt(newEnch[9]);
									list.add(ChatColor.BLUE + "반격: " + lvl);
								}
								newItemMeta.setLore(list);
								item.setItemMeta(newItemMeta);		
								
								try {
									System.out.println(player.getDisplayName() + "이/가 말랑말랑 스크롤을 통해 " + newItemMeta.getDisplayName() + "(" + result + ")" + ChatColor.WHITE + "을/를 획득하였다.");
								} catch(Exception e) {
									
								}
								
							} 
							
							player.sendMessage(ChatColor.GREEN + "해당 아이템의 반격 수치가 0이 되었습니다.");
						} catch(Exception e) {
							
						}
					}
				}
			}	
		} catch(Exception e) {
			
		}
	}
	
	public void sweepingRemove(Player player, ItemStack itemArg, World world) {	
		try {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "광역화 제어 스크롤")) {
				ItemStack item = player.getInventory().getItemInOffHand();
				if(item.getType()!=Material.AIR) {
					if(item.getType()==Material.WOODEN_SWORD || item.getType()==Material.STONE_SWORD || item.getType()==Material.IRON_SWORD || item.getType()==Material.GOLDEN_SWORD ||
	            			item.getType()==Material.DIAMOND_SWORD || item.getType()==Material.LEATHER_HELMET || item.getType()==Material.LEATHER_CHESTPLATE ||
	            			item.getType()==Material.LEATHER_LEGGINGS || item.getType()==Material.LEATHER_BOOTS || item.getType()==Material.CHAINMAIL_HELMET ||
	            			item.getType()==Material.CHAINMAIL_CHESTPLATE || item.getType()==Material.CHAINMAIL_LEGGINGS || item.getType()==Material.CHAINMAIL_BOOTS ||
	            			item.getType()==Material.IRON_HELMET || item.getType()==Material.IRON_CHESTPLATE || item.getType()==Material.IRON_LEGGINGS ||
	            			item.getType()==Material.IRON_BOOTS || item.getType()==Material.GOLDEN_HELMET || item.getType()==Material.GOLDEN_CHESTPLATE ||
	            			item.getType()==Material.GOLDEN_LEGGINGS || item.getType()==Material.GOLDEN_BOOTS || item.getType()==Material.DIAMOND_HELMET ||
	            			item.getType()==Material.DIAMOND_CHESTPLATE || item.getType()==Material.DIAMOND_LEGGINGS || item.getType()==Material.DIAMOND_BOOTS ||
	            			item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES ||
	            			item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES ||
							item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.MOSSY_COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET ||
							item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE ||
							item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS ||
							item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS ||
							item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG ||
							item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG ||
							item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE ||
							item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL ||
							item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL ||
							item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB ||
							item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB ||
							item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB ||
							item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB ||
							item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE ||
							item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE ||
							item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS ||
							item.getType()==Material.NETHERITE_HELMET || item.getType()==Material.NETHERITE_CHESTPLATE || item.getType()==Material.NETHERITE_LEGGINGS || 
							item.getType()==Material.NETHERITE_BOOTS || item.getType()==Material.CARVED_PUMPKIN) {
						
						ItemMeta im = item.getItemMeta();
						String[] ary = im.getLocalizedName().split(",");
						try {
							if(Integer.parseInt(ary[4]) <= 0) {
								player.sendMessage(ChatColor.RED + "스플레시 수치가 0이하인 경우에는 사용할 수 없을 것 같다.");
								return;
							}
							
							itemArg.setAmount(itemArg.getAmount()-1);
							
							String result = makeEnch(ary, "0", 4);
							im.setLocalizedName(result);
							item.setItemMeta(im);
							
							if(item.getItemMeta().getLore()!=null) {
								ItemMeta newItemMeta = item.getItemMeta();
								String[] newEnch = newItemMeta.getLocalizedName().split(",");
								List<String> preList;
								preList = newItemMeta.getLore();
								int cnt = 0;
								for(int i = 0 ; i < preList.size() ; i++) {			
									if(preList.get(i).equals("=====인챈트=====")) {
										break;
									}
									cnt++;
								}
								List<String> list = new ArrayList<String>();
								for(int i = 0 ; i < cnt ; i++) {
									list.add(preList.get(i));
								}
								if(!(list.get(list.size()-1).equals(" "))) {
									list.add(" ");
								}
								list.add("=====인챈트=====");
								if(Integer.parseInt(newEnch[0]) != 0) {
									int lvl = Integer.parseInt(newEnch[0]);
									list.add(ChatColor.BLUE + "공격력: " + lvl);
								}
								if(Integer.parseInt(newEnch[1]) != 0) {
									int lvl = Integer.parseInt(newEnch[1]);
									list.add(ChatColor.BLUE + "추가 데미지(인간형): " + lvl);
								}
								if(Integer.parseInt(newEnch[2]) != 0) {
									int lvl = Integer.parseInt(newEnch[2]);
									list.add(ChatColor.BLUE + "추가 데미지(동물형): " + lvl);
								}
								if(Integer.parseInt(newEnch[3]) != 0) {
									int lvl = Integer.parseInt(newEnch[3]);
									list.add(ChatColor.BLUE + "추가 데미지(기타): " + lvl);
								}					
								if(Integer.parseInt(newEnch[4]) != 0) {
									int lvl = Integer.parseInt(newEnch[4]);
									list.add(ChatColor.BLUE + "스플레시: " + lvl);
								}
								if(Integer.parseInt(newEnch[5]) != 0) {
									int lvl = Integer.parseInt(newEnch[5]);
									list.add(ChatColor.BLUE + "방어력: " + lvl);
								}
								if(Integer.parseInt(newEnch[6]) != 0) {
									int lvl = Integer.parseInt(newEnch[6]);
									list.add(ChatColor.BLUE + "보호(화염): " + lvl);
								}
								if(Integer.parseInt(newEnch[7]) != 0) {
									int lvl = Integer.parseInt(newEnch[7]);
									list.add(ChatColor.BLUE + "보호(폭발): " + lvl);
								}
								if(Integer.parseInt(newEnch[8]) != 0) {
									int lvl = Integer.parseInt(newEnch[8]);
									list.add(ChatColor.BLUE + "보호(발사체): " + lvl);
								}
								if(Integer.parseInt(newEnch[9]) != 0) {
									int lvl = Integer.parseInt(newEnch[9]);
									list.add(ChatColor.BLUE + "반격: " + lvl);
								}
								newItemMeta.setLore(list);
								item.setItemMeta(newItemMeta);		
								
								try {
									System.out.println(player.getDisplayName() + "이/가 말랑말랑 스크롤을 통해 " + newItemMeta.getDisplayName() + "(" + result + ")" + ChatColor.WHITE + "을/를 획득하였다.");
								} catch(Exception e) {
									
								}
								
							} 
							
							player.sendMessage(ChatColor.GREEN + "해당 아이템의 반격 수치가 0이 되었습니다.");
						} catch(Exception e) {
							
						}
					}
				}
			}	
		} catch(Exception e) {
			
		}
	}
	
	public String makeEnch(String[] ary, String str, int num) {
		String result = "";
		for(int i = 0 ; i < 10 ; i++) {
			if(i == num) {
				result = result + "," + str;
				continue;
			}
			result = result + "," + ary[i];
		}
		String data = result.substring(1);
		try {
			data = data.concat("," + ary[10]);
		} catch(Exception e) {
			
		}
		return data;
	}
	
}
