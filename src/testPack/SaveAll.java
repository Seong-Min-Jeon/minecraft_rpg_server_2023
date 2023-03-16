package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SaveAll {

	public SaveAll(Player player, File folder) {
		World world = player.getWorld();
		
		try {
			ItemStack mo = player.getInventory().getItem(7);
			if(mo == null) {
				return;
			}
			if(!mo.hasItemMeta()) {
				return;
			}
		} catch(Exception e) {
			
		}
		
		// 캐릭터 가방 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
				if (dataName != null) {
					File file = new File(folder, "playerInv.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					String line = bufReader.readLine();
					while (line != null) {
						if (line.equals(player.getUniqueId().toString())) {
							break;
						}
						line = bufReader.readLine();
					}
					if (line != null) {
						String loc = bufReader.readLine();
						String[] ary = loc.split("/");
						if (dataName.equals("boneFighter")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 0);
						} else if (dataName.equals("knight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 1);
						} else if (dataName.equals("priest")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 2);
						} else if (dataName.equals("berserker1")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 3);
						} else if (dataName.equals("gambler")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 4);
						} else if (dataName.equals("devil")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 5);
						} else if (dataName.equals("angel")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 6);
						} else if (dataName.equals("agent")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 7);
						} else if (dataName.equals("shadowKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 8);
						} else if (dataName.equals("berserker2")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 9);
						} else if (dataName.equals("soldier")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 10);
						} else if (dataName.equals("grimReaper")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 11);
						} else if (dataName.equals("akuma")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 12);
						} else if (dataName.equals("paladin")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 13);
						} else if (dataName.equals("dragonKnight")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 14);
						} else if (dataName.equals("commander")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 15);
						} else if (dataName.equals("archer")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 16);
						} else if (dataName.equals("powerRanger")) {
							ary[2] = Integer.toString(Integer.parseInt(ary[2]) + 17);
						}
						int x = Integer.parseInt(ary[0]);
						int y = Integer.parseInt(ary[1]);
						int z = Integer.parseInt(ary[2]);
						Block block1 = new Location(world, x, y, z).getBlock();
						Chest chest1 = (Chest) block1.getState();
						Inventory c1Inv = chest1.getInventory();
						Inventory pInv = player.getInventory();
						c1Inv.clear();
						for (int i = 0; i < 27; i++) {
							if (pInv.getItem(i) == null) {
								continue;
							}
							c1Inv.setItem(i, pInv.getItem(i));
						}
						Block block2 = new Location(world, x, y + 1, z).getBlock();
						Chest chest2 = (Chest) block2.getState();
						Inventory c2Inv = chest2.getInventory();
						c2Inv.clear();
						for (int i = 0; i < 14; i++) {
							if (pInv.getItem(i+27) == null) {
								continue;
							}
							c2Inv.setItem(i, pInv.getItem(i+27));
						}
						bufReader.close();
					}
				}
			}
		} catch (Exception e) {

		}
		// 캐릭터 데이터 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
				File dir = new File(folder + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				if (dataName != null) {
					File file = new File(dir, dataName + "_data.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
					fw.write((int) (player.getLocation().getX()) + "/" + (int) (player.getLocation().getY()) + "/"
							+ (int) (player.getLocation().getZ()));
					fw.write("\n");
					fw.write((int) player.getHealth() + "/" + (int) player.getFoodLevel());
					fw.write("\n");
					fw.write((int) player.getLevel() + "/" + player.getExp());
					fw.close();
					bufReader.close();
				}
			}
		} catch (Exception e) {

		}
		// 생활 레벨 데이터 저장
		try {
			ItemStack item = player.getInventory().getItem(7);
			if(item.hasItemMeta()) {
				if((item.getType() == Material.RED_DYE) || (item.getType() == Material.GREEN_DYE) || (item.getType() == Material.LAPIS_LAZULI)
						|| (item.getType() == Material.CYAN_DYE) || (item.getType() == Material.LIGHT_GRAY_DYE) || (item.getType() == Material.GRAY_DYE)
						|| (item.getType() == Material.PINK_DYE) || (item.getType() == Material.LIME_DYE) || (item.getType() == Material.YELLOW_DYE)
						|| (item.getType() == Material.LIGHT_BLUE_DYE) || (item.getType() == Material.MAGENTA_DYE) || (item.getType() == Material.ORANGE_DYE)
						|| (item.getType() == Material.BLUE_DYE) || (item.getType() == Material.BROWN_DYE) || (item.getType() == Material.BLACK_DYE)
						|| (item.getType() == Material.INK_SAC) || (item.getType() == Material.CLAY_BALL) || (item.getType() == Material.GLOWSTONE_DUST)) {
					File dataFolder = folder;
					if (!dataFolder.exists()) {
						dataFolder.mkdir();
					} else {
						File dir = new File(folder + "/" + player.getUniqueId().toString());
						if (!dir.exists()) {
							try {
								dir.mkdir();
							} catch (Exception e) {
								e.getStackTrace();
							}
						}
						File file = new File(dir,"fantasy_life_level.dat");
						if (!file.exists()) {
							try {
								file.createNewFile();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						FileReader filereader = new FileReader(file);
						BufferedReader bufReader = new BufferedReader(filereader);
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						ItemMeta im = item.getItemMeta();
						String lvl1 = im.getLore().get(0);
						String lvl2 = im.getLore().get(1);
						String lvl3 = im.getLore().get(2);
						String lvl4 = "1";
						String lvl5 = "1";
						String lvl6 = "1";
						String lvl7 = "1";
						try {
							if(!im.getLore().get(4).substring(0,2).equalsIgnoreCase("§a")) {
								lvl4 = "0";
							}
							if(!im.getLore().get(5).substring(0,2).equalsIgnoreCase("§a")) {
								lvl5 = "0";
							}
							if(!im.getLore().get(6).substring(0,2).equalsIgnoreCase("§a")) {
								lvl6 = "0";
							}
							if(!im.getLore().get(6).substring(0,2).equalsIgnoreCase("§a")) {
								lvl7 = "0";
							}
						} catch(Exception e) {
							
						}
						
						fw.write(lvl1.split(": ")[1] + " " + lvl2.split(": ")[1] + " " + lvl3.split(": ")[1] + " " + lvl4 + " " + lvl5 + " " + lvl6 + " " + lvl7);
						fw.close();
						bufReader.close();
					}
				}
			}
		} catch (Exception e) {

		}
		// 퀘스트 저장
		try {
			File dataFolder = folder;
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			} else {
				String dataName = null;
				if (player.getInventory().contains(Material.RED_DYE)) {
					dataName = "boneFighter";
				} else if (player.getInventory().contains(Material.GREEN_DYE)) {
					dataName = "knight";
				} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
					dataName = "priest";
				} else if (player.getInventory().contains(Material.CYAN_DYE)) {
					dataName = "berserker1";
				} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
					dataName = "gambler";
				} else if (player.getInventory().contains(Material.GRAY_DYE)) {
					dataName = "devil";
				} else if (player.getInventory().contains(Material.PINK_DYE)) {
					dataName = "angel";
				} else if (player.getInventory().contains(Material.LIME_DYE)) {
					dataName = "agent";
				} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
					dataName = "shadowKnight";
				} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
					dataName = "berserker2";
				} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
					dataName = "soldier";
				} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
					dataName = "grimReaper";
				} else if (player.getInventory().contains(Material.BLUE_DYE)) {
					dataName = "akuma";
				} else if (player.getInventory().contains(Material.BROWN_DYE)) {
					dataName = "paladin";
				} else if (player.getInventory().contains(Material.BLACK_DYE)) {
					dataName = "dragonKnight";
				} else if (player.getInventory().contains(Material.INK_SAC)) {
					dataName = "commander";
				} else if (player.getInventory().contains(Material.CLAY_BALL)) {
					dataName = "archer";
				} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
					dataName = "powerRanger";
				}
				File dir = new File(folder + "/" + player.getUniqueId().toString());
				if (!dir.exists()) {
					try {
						dir.mkdir();
					} catch (Exception e) {
						e.getStackTrace();
					}
				}
				if (dataName != null) {
					File file = new File(dir, dataName + "_Qdata.dat");
					if (!file.exists()) {
						try {
							file.createNewFile();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					FileReader filereader = new FileReader(file);
					BufferedReader bufReader = new BufferedReader(filereader);
					FileWriter fw = new FileWriter(file, false);
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해안의 위협===")) {
						int number = qb.getNum(player);
						fw.write("q1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해적선의 보물===")) {
						int number = qb.getNum(player);
						fw.write("q2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 말단===")) {
						int number = qb.getNum(player);
						fw.write("q3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===밀 사냥꾼===")) {
						int number = qb.getNum(player);
						fw.write("q4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===침략자===")) {
						int number = qb.getNum(player);
						fw.write("q5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===숲 깊은 곳===")) {
						int number = qb.getNum(player);
						fw.write("q6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===유적을 정화하는 자===")) {
						int number = qb.getNum(player);
						fw.write("q7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===")) {
						int number = qb.getNum(player);
						fw.write("q8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 위협===")) {
						int number = qb.getNum(player);
						fw.write("q9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
						int number = qb.getNum(player);
						fw.write("q10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
						int number = qb.getNum(player);
						fw.write("q11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
						int number = qb.getNum(player);
						fw.write("q12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 고블린===")) {
						int number = qb.getNum(player);
						fw.write("q13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===불의 악마===")) {
						int number = qb.getNum(player);
						fw.write("q14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===")) {
						int number = qb.getNum(player);
						fw.write("q15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
						int number = qb.getNum(player);
						fw.write("q16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===폭탄병===")) {
						int number = qb.getNum(player);
						fw.write("q17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에밀의 결의===")) {
						int number = qb.getNum(player);
						fw.write("q18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===악마 자미엘===")) {
						int number = qb.getNum(player);
						fw.write("q19\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===붉은 악마===")) {
						int number = qb.getNum(player);
						fw.write("q20\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===과거의 영광===")) {
						int number = qb.getNum(player);
						fw.write("q21\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===군도의 강자===")) {
						int number = qb.getNum(player);
						fw.write("q22\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라파누이의 불청객===")) {
						int number = qb.getNum(player);
						fw.write("q23\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마의 오른팔===")) {
						int number = qb.getNum(player);
						fw.write("q24\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===환영하는 병사===")) {
						int number = qb.getNum(player);
						fw.write("q25\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===움직이지 않는 자===")) {
						int number = qb.getNum(player);
						fw.write("q26\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===백일몽 토끼===")) {
						int number = qb.getNum(player);
						fw.write("q27\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===위 러브 팬더===")) {
						int number = qb.getNum(player);
						fw.write("q28\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===초록의 그 녀석===")) {
						int number = qb.getNum(player);
						fw.write("q29\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===귀여운 고양이===")) {
						int number = qb.getNum(player);
						fw.write("q30\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===성 밖의 이단===")) {
						int number = qb.getNum(player);
						fw.write("q31\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워터파크===")) {
						int number = qb.getNum(player);
						fw.write("q32\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===철분 덩어리===")) {
						int number = qb.getNum(player);
						fw.write("q33\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===주문은 토끼입니까?===")) {
						int number = qb.getNum(player);
						fw.write("q34\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===흐콰===")) {
						int number = qb.getNum(player);
						fw.write("q35\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===의적===")) {
						int number = qb.getNum(player);
						fw.write("q36\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===족장을 지키는 자===")) {
						int number = qb.getNum(player);
						fw.write("q37\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===원인 해결===")) {
						int number = qb.getNum(player);
						fw.write("q38\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===길을 지키는 자===")) {
						int number = qb.getNum(player);
						fw.write("q39\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===싸우는 자1===")) {
						int number = qb.getNum(player);
						fw.write("q40\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===싸우는 자2===")) {
						int number = qb.getNum(player);
						fw.write("q40_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===고대 생물, 파괴수===")) {
						int number = qb.getNum(player);
						fw.write("q41\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===레드 플레이어===")) {
						int number = qb.getNum(player);
						fw.write("q42\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희1===")) {
						int number = qb.getNum(player);
						fw.write("eq1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
						int number = qb.getNum(player);
						fw.write("eq1_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
						int number = qb.getNum(player);
						fw.write("eq1_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희4===")) {
						int number = qb.getNum(player);
						fw.write("eq1_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희5===")) {
						int number = qb.getNum(player);
						fw.write("eq1_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희6===")) {
						int number = qb.getNum(player);
						fw.write("eq1_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
						int number = qb.getNum(player);
						fw.write("eq1_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
						int number = qb.getNum(player);
						fw.write("eq2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약2===")) {
						int number = qb.getNum(player);
						fw.write("eq2_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약3===")) {
						int number = qb.getNum(player);
						fw.write("eq2_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억1===")) {
						int number = qb.getNum(player);
						fw.write("eq3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억2===")) {
						int number = qb.getNum(player);
						fw.write("eq3_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억3===")) {
						int number = qb.getNum(player);
						fw.write("eq3_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===")) {
						int number = qb.getNum(player);
						fw.write("mq1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수련의 시작===")) {
						int number = qb.getNum(player);
						fw.write("mq2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에일 땅으로===")) {
						int number = qb.getNum(player);
						fw.write("mq3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===")) {
						int number = qb.getNum(player);
						fw.write("mq4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁2===")) {
						int number = qb.getNum(player);
						fw.write("mq5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===")) {
						int number = qb.getNum(player);
						fw.write("mq6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
						int number = qb.getNum(player);
						fw.write("mq7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===파르홀론의 역사===")) {
						int number = qb.getNum(player);
						fw.write("mq8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===")) {
						int number = qb.getNum(player);
						fw.write("mq9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대지기 시험===")) {
						int number = qb.getNum(player);
						fw.write("mq10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대에 숨겨진 비밀===")) {
						int number = qb.getNum(player);
						fw.write("mq11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대를 밝히는 힘===")) {
						int number = qb.getNum(player);
						fw.write("mq12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===")) {
						int number = qb.getNum(player);
						fw.write("mq13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산===")) {
						int number = qb.getNum(player);
						fw.write("mq14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기1===")) {
						int number = qb.getNum(player);
						fw.write("mq15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===")) {
						int number = qb.getNum(player);
						fw.write("mq15_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미푀르유 성===")) {
						int number = qb.getNum(player);
						fw.write("mq16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
						int number = qb.getNum(player);
						fw.write("mq17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자1===")) {
						int number = qb.getNum(player);
						fw.write("mq18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자2===")) {
						int number = qb.getNum(player);
						fw.write("mq19\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===")) {
						int number = qb.getNum(player);
						fw.write("mq20\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자4===")) {
						int number = qb.getNum(player);
						fw.write("mq20_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===")) {
						int number = qb.getNum(player);
						fw.write("mq20_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자6===")) {
						int number = qb.getNum(player);
						fw.write("mq21\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아란모어===")) {
						int number = qb.getNum(player);
						fw.write("mq22\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
						int number = qb.getNum(player);
						fw.write("mq23\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
						int number = qb.getNum(player);
						fw.write("mq24\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물1===")) {
						int number = qb.getNum(player);
						fw.write("mq25\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물2===")) {
						int number = qb.getNum(player);
						fw.write("mq26\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물3===")) {
						int number = qb.getNum(player);
						fw.write("mq26_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
						int number = qb.getNum(player);
						fw.write("mq27\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===")) {
						int number = qb.getNum(player);
						fw.write("mq28\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑1===")) {
						int number = qb.getNum(player);
						fw.write("mq29\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑2===")) {
						int number = qb.getNum(player);
						fw.write("mq29_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===되살아난 해골===")) {
						int number = qb.getNum(player);
						fw.write("mq30\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===")) {
						int number = qb.getNum(player);
						fw.write("mq31\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===너의 근육을 먹고 싶어===")) {
						int number = qb.getNum(player);
						fw.write("mq32\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===그대는 빨간모자===")) {
						int number = qb.getNum(player);
						fw.write("mq33\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
						int number = qb.getNum(player);
						fw.write("mq33_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===또다시 빨간모자===")) {
						int number = qb.getNum(player);
						fw.write("mq34\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
						int number = qb.getNum(player);
						fw.write("mq34_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마법탑을 향해===")) {
						int number = qb.getNum(player);
						fw.write("mq35\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 마나===")) {
						int number = qb.getNum(player);
						fw.write("mq35_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===")) {
						int number = qb.getNum(player);
						fw.write("mq36\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 우는 소리를 내었는가===")) {
						int number = qb.getNum(player);
						fw.write("mq37\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
						int number = qb.getNum(player);
						fw.write("mq37_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이 달래기===")) {
						int number = qb.getNum(player);
						fw.write("mq37_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 또 우는 소리를 내었는가===")) {
						int number = qb.getNum(player);
						fw.write("mq38\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수상한 몬스터===")) {
						int number = qb.getNum(player);
						fw.write("mq38_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이에게 보답을===")) {
						int number = qb.getNum(player);
						fw.write("mq38_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘1===")) {
						int number = qb.getNum(player);
						fw.write("mq39\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘2===")) {
						int number = qb.getNum(player);
						fw.write("mq39_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘3===")) {
						int number = qb.getNum(player);
						fw.write("mq39_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아라크네의 저주===")) {
						int number = qb.getNum(player);
						fw.write("mq40\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 흐름의 힘===")) {
						int number = qb.getNum(player);
						fw.write("mq41\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===흐름의 봉인을 위해===")) {
						int number = qb.getNum(player);
						fw.write("mq41_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===항구 마을, 하마베 마을===")) {
						int number = qb.getNum(player);
						fw.write("mq42\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단1===")) {
						int number = qb.getNum(player);
						fw.write("mq42_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단2===")) {
						int number = qb.getNum(player);
						fw.write("mq43\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단3===")) {
						int number = qb.getNum(player);
						fw.write("mq44\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막1===")) {
						int number = qb.getNum(player);
						fw.write("mq45\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막2===")) {
						int number = qb.getNum(player);
						fw.write("mq45_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션1===")) {
						int number = qb.getNum(player);
						fw.write("mq45_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션2===")) {
						int number = qb.getNum(player);
						fw.write("mq45_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션3===")) {
						int number = qb.getNum(player);
						fw.write("mq45_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막3===")) {
						int number = qb.getNum(player);
						fw.write("mq45_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Death Gun===")) {
						int number = qb.getNum(player);
						fw.write("mq45_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막4===")) {
						int number = qb.getNum(player);
						fw.write("mq45_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막 곰===")) {
						int number = qb.getNum(player);
						fw.write("mq45_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막5===")) {
						int number = qb.getNum(player);
						fw.write("mq45_9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===고대의 암석 협곡===")) {
						int number = qb.getNum(player);
						fw.write("mq45_10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막6===")) {
						int number = qb.getNum(player);
						fw.write("mq45_11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막7===")) {
						int number = qb.getNum(player);
						fw.write("mq45_12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자1===")) {
						int number = qb.getNum(player);
						fw.write("mq45_13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막8===")) {
						int number = qb.getNum(player);
						fw.write("mq45_14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자2===")) {
						int number = qb.getNum(player);
						fw.write("mq45_15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막9===")) {
						int number = qb.getNum(player);
						fw.write("mq45_16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자3===")) {
						int number = qb.getNum(player);
						fw.write("mq45_17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막10===")) {
						int number = qb.getNum(player);
						fw.write("mq45_18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자4===")) {
						int number = qb.getNum(player);
						fw.write("mq45_19\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막11===")) {
						int number = qb.getNum(player);
						fw.write("mq45_20\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자5===")) {
						int number = qb.getNum(player);
						fw.write("mq45_21\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막12===")) {
						int number = qb.getNum(player);
						fw.write("mq45_22\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===투기장===")) {
						int number = qb.getNum(player);
						fw.write("mq45_23\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막13===")) {
						int number = qb.getNum(player);
						fw.write("mq45_24\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막14===")) {
						int number = qb.getNum(player);
						fw.write("mq45_25\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막15===")) {
						int number = qb.getNum(player);
						fw.write("mq45_26\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅1===")) {
						int number = qb.getNum(player);
						fw.write("mq45_27\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막16===")) {
						int number = qb.getNum(player);
						fw.write("mq45_28\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅2===")) {
						int number = qb.getNum(player);
						fw.write("mq45_29\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막17===")) {
						int number = qb.getNum(player);
						fw.write("mq45_30\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅3===")) {
						int number = qb.getNum(player);
						fw.write("mq45_31\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막18===")) {
						int number = qb.getNum(player);
						fw.write("mq45_32\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅4===")) {
						int number = qb.getNum(player);
						fw.write("mq45_33\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막19===")) {
						int number = qb.getNum(player);
						fw.write("mq45_34\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅5===")) {
						int number = qb.getNum(player);
						fw.write("mq45_35\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막20===")) {
						int number = qb.getNum(player);
						fw.write("mq45_36\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막-최종장===")) {
						int number = qb.getNum(player);
						fw.write("mq45_37\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽어가는 섬===")) {
						int number = qb.getNum(player);
						fw.write("mq46\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽어가는 섬의 주민===")) {
						int number = qb.getNum(player);
						fw.write("mq46_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단1===")) {
						int number = qb.getNum(player);
						fw.write("mq46_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단2===")) {
						int number = qb.getNum(player);
						fw.write("mq46_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단3===")) {
						int number = qb.getNum(player);
						fw.write("mq46_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단4===")) {
						int number = qb.getNum(player);
						fw.write("mq46_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단5===")) {
						int number = qb.getNum(player);
						fw.write("mq46_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단6===")) {
						int number = qb.getNum(player);
						fw.write("mq46_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단7===")) {
						int number = qb.getNum(player);
						fw.write("mq46_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단8===")) {
						int number = qb.getNum(player);
						fw.write("mq46_9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===3개의 종===")) {
						int number = qb.getNum(player);
						fw.write("mq47\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬1===")) {
						int number = qb.getNum(player);
						fw.write("mq47_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬2===")) {
						int number = qb.getNum(player);
						fw.write("mq47_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬3===")) {
						int number = qb.getNum(player);
						fw.write("mq47_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬4===")) {
						int number = qb.getNum(player);
						fw.write("mq47_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시오카나 섬===")) {
						int number = qb.getNum(player);
						fw.write("mq48\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사라진 닻===")) {
						int number = qb.getNum(player);
						fw.write("mq48_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 섬===")) {
						int number = qb.getNum(player);
						fw.write("mq48_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===스켈리그 섬===")) {
						int number = qb.getNum(player);
						fw.write("mq48_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련1===")) {
						int number = qb.getNum(player);
						fw.write("mq48_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련2===")) {
						int number = qb.getNum(player);
						fw.write("mq48_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련3===")) {
						int number = qb.getNum(player);
						fw.write("mq48_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련4===")) {
						int number = qb.getNum(player);
						fw.write("mq48_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련5===")) {
						int number = qb.getNum(player);
						fw.write("mq48_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련6===")) {
						int number = qb.getNum(player);
						fw.write("mq48_9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련7===")) {
						int number = qb.getNum(player);
						fw.write("mq48_10\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련8===")) {
						int number = qb.getNum(player);
						fw.write("mq48_11\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련9===")) {
						int number = qb.getNum(player);
						fw.write("mq48_12\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시련을 마친 자===")) {
						int number = qb.getNum(player);
						fw.write("mq48_13\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염===")) {
						int number = qb.getNum(player);
						fw.write("mq48_14\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물1===")) {
						int number = qb.getNum(player);
						fw.write("mq48_15\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물2===")) {
						int number = qb.getNum(player);
						fw.write("mq48_16\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물3===")) {
						int number = qb.getNum(player);
						fw.write("mq48_17\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마지막 종===")) {
						int number = qb.getNum(player);
						fw.write("mq48_18\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===신대륙 칼라아릿===")) {
						int number = qb.getNum(player);
						fw.write("mq49\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅1===")) {
						int number = qb.getNum(player);
						fw.write("mq49_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅2===")) {
						int number = qb.getNum(player);
						fw.write("mq49_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅3===")) {
						int number = qb.getNum(player);
						fw.write("mq49_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅4===")) {
						int number = qb.getNum(player);
						fw.write("mq49_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅5===")) {
						int number = qb.getNum(player);
						fw.write("mq49_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅6===")) {
						int number = qb.getNum(player);
						fw.write("mq49_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅7===")) {
						int number = qb.getNum(player);
						fw.write("mq49_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅8===")) {
						int number = qb.getNum(player);
						fw.write("mq49_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅9===")) {
						int number = qb.getNum(player);
						fw.write("mq49_9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===찾아온 불청객===")) {
						int number = qb.getNum(player);
						fw.write("mq50\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서1===")) {
						int number = qb.getNum(player);
						fw.write("mq50_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서2===")) {
						int number = qb.getNum(player);
						fw.write("mq50_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서3===")) {
						int number = qb.getNum(player);
						fw.write("mq50_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서4===")) {
						int number = qb.getNum(player);
						fw.write("mq50_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서5===")) {
						int number = qb.getNum(player);
						fw.write("mq50_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서66===")) {
						int number = qb.getNum(player);
						fw.write("mq50_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서7===")) {
						int number = qb.getNum(player);
						fw.write("mq50_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서8===")) {
						int number = qb.getNum(player);
						fw.write("mq50_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서9===")) {
						int number = qb.getNum(player);
						fw.write("mq50_9\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅1===")) {
						int number = qb.getNum(player);
						fw.write("mq51\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅2===")) {
						int number = qb.getNum(player);
						fw.write("mq51_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅3===")) {
						int number = qb.getNum(player);
						fw.write("mq51_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅4===")) {
						int number = qb.getNum(player);
						fw.write("mq51_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅5===")) {
						int number = qb.getNum(player);
						fw.write("mq51_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅6===")) {
						int number = qb.getNum(player);
						fw.write("mq51_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅7===")) {
						int number = qb.getNum(player);
						fw.write("mq51_6\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅8===")) {
						int number = qb.getNum(player);
						fw.write("mq51_7\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅9===")) {
						int number = qb.getNum(player);
						fw.write("mq51_8\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어1===")) {
						int number = qb.getNum(player);
						fw.write("mq52\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어2===")) {
						int number = qb.getNum(player);
						fw.write("mq52_1\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어3===")) {
						int number = qb.getNum(player);
						fw.write("mq52_2\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문1===")) {
						int number = qb.getNum(player);
						fw.write("mq52_3\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문2===")) {
						int number = qb.getNum(player);
						fw.write("mq52_4\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문3===")) {
						int number = qb.getNum(player);
						fw.write("mq52_5\n");
						fw.write(Integer.toString(number));
					} else if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===최후의 전투===")) {
						int number = qb.getNum(player);
						fw.write("mq_last\n");
						fw.write(Integer.toString(number));
					}
					fw.close();
					bufReader.close();
				}
			}
		} catch (Exception e) {

		}
	}
	
}
