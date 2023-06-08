package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd34teleport implements CommandExecutor {
	
	File folder;
	
	public Cmd34teleport(File folder) {
		this.folder = folder;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(cmd.getName().equalsIgnoreCase("teleport") || cmd.getName().equalsIgnoreCase("t")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.GOLD + "=======================");
					player.sendMessage(ChatColor.GREEN + "  teleport <number>");
					player.sendMessage(ChatColor.GREEN + "  teleport list");
					player.sendMessage(ChatColor.GREEN + "  teleport add <number> <name>");
					player.sendMessage(ChatColor.GREEN + "  teleport remove <number>");
					player.sendMessage(ChatColor.GOLD + "=======================");
					return true;
				}
				try { 
					boolean num = false;
					int arg0 = 0;
					try { 
						arg0 = Integer.parseInt(args[0]);
						num = true;
					} catch(Exception e) {
						
					}
					
					if(num == true) {
						ArrayList<String> ary = readFile(player);
						if(ary == null) {
							player.sendMessage(ChatColor.RED + "에러1-1 발생, 관리자에게 문의하세요.");
							player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
							return true;
						}
						
						if(arg0 == 1) {
							if(ary.size() >= 1) {
								String result = ary.get(0);
								if(result.equalsIgnoreCase("미사용 슬롯")) {
									player.sendMessage(ChatColor.RED + "좌표가 등록되지 않은 슬롯입니다.");
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
									return true;
								} else {
									try {
										String[] locAry = result.split("\\|")[1].split("/");
										player.teleport(new Location(player.getWorld(), Double.parseDouble(locAry[0]), Double.parseDouble(locAry[1]), Double.parseDouble(locAry[2])));
										player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0, true, false, true));

										Bukkit.getLogger().info(player.getDisplayName() + " teleport to " + 
												(int) Double.parseDouble(locAry[0]) + ", " + (int) Double.parseDouble(locAry[1]) + ", " + (int) Double.parseDouble(locAry[2]) +
												" (" + result.split("\\|")[0] + ")");
									} catch(Exception e) {
										player.sendMessage(ChatColor.RED + "에러2-1 발생, 관리자에게 문의하세요.");
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
										return true;
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
						} else if(arg0 == 2) {
							if(ary.size() >= 2) {
								String result = ary.get(1);
								if(result.equalsIgnoreCase("미사용 슬롯")) {
									player.sendMessage(ChatColor.RED + "좌표가 등록되지 않은 슬롯입니다.");
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
									return true;
								} else {
									try {
										String[] locAry = result.split("\\|")[1].split("/");
										player.teleport(new Location(player.getWorld(), Double.parseDouble(locAry[0]), Double.parseDouble(locAry[1]), Double.parseDouble(locAry[2])));
										player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0, true, false, true));

										Bukkit.getLogger().info(player.getDisplayName() + " teleport to " + 
												(int) Double.parseDouble(locAry[0]) + ", " + (int) Double.parseDouble(locAry[1]) + ", " + (int) Double.parseDouble(locAry[2]) +
												" (" + result.split("\\|")[0] + ")");
									} catch(Exception e) {
										player.sendMessage(ChatColor.RED + "에러2-2 발생, 관리자에게 문의하세요.");
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
										return true;
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
						} else if(arg0 == 3) {
							if(ary.size() >= 3) {
								String result = ary.get(2);
								if(result.equalsIgnoreCase("미사용 슬롯")) {
									player.sendMessage(ChatColor.RED + "좌표가 등록되지 않은 슬롯입니다.");
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
									return true;
								} else {
									try {
										String[] locAry = result.split("\\|")[1].split("/");
										player.teleport(new Location(player.getWorld(), Double.parseDouble(locAry[0]), Double.parseDouble(locAry[1]), Double.parseDouble(locAry[2])));
										player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0, true, false, true));

										Bukkit.getLogger().info(player.getDisplayName() + " teleport to " + 
												(int) Double.parseDouble(locAry[0]) + ", " + (int) Double.parseDouble(locAry[1]) + ", " + (int) Double.parseDouble(locAry[2]) +
												" (" + result.split("\\|")[0] + ")");
									} catch(Exception e) {
										player.sendMessage(ChatColor.RED + "에러2-3 발생, 관리자에게 문의하세요.");
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
										return true;
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
						} else if(arg0 == 4) {
							if(ary.size() >= 4) {
								String result = ary.get(3);
								if(result.equalsIgnoreCase("미사용 슬롯")) {
									player.sendMessage(ChatColor.RED + "좌표가 등록되지 않은 슬롯입니다.");
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
									return true;
								} else {
									try {
										String[] locAry = result.split("\\|")[1].split("/");
										player.teleport(new Location(player.getWorld(), Double.parseDouble(locAry[0]), Double.parseDouble(locAry[1]), Double.parseDouble(locAry[2])));
										player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0, true, false, true));

										Bukkit.getLogger().info(player.getDisplayName() + " teleport to " + 
												(int) Double.parseDouble(locAry[0]) + ", " + (int) Double.parseDouble(locAry[1]) + ", " + (int) Double.parseDouble(locAry[2]) +
												" (" + result.split("\\|")[0] + ")");
									} catch(Exception e) {
										player.sendMessage(ChatColor.RED + "에러2-4 발생, 관리자에게 문의하세요.");
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
										return true;
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
						} else if(arg0 == 5) {
							if(ary.size() >= 5) {
								String result = ary.get(4);
								if(result.equalsIgnoreCase("미사용 슬롯")) {
									player.sendMessage(ChatColor.RED + "좌표가 등록되지 않은 슬롯입니다.");
									player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
									return true;
								} else {
									try {
										String[] locAry = result.split("\\|")[1].split("/");
										player.teleport(new Location(player.getWorld(), Double.parseDouble(locAry[0]), Double.parseDouble(locAry[1]), Double.parseDouble(locAry[2])));
										player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 0, true, false, true));

										Bukkit.getLogger().info(player.getDisplayName() + " teleport to " + 
												(int) Double.parseDouble(locAry[0]) + ", " + (int) Double.parseDouble(locAry[1]) + ", " + (int) Double.parseDouble(locAry[2]) +
												" (" + result.split("\\|")[0] + ")");
									} catch(Exception e) {
										player.sendMessage(ChatColor.RED + "에러2-5 발생, 관리자에게 문의하세요.");
										player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
										return true;
									}
								}
							} else {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
						} else {
							player.sendMessage(ChatColor.RED + "잘못된 입력입니다.");
							player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
							return true;
						}
						return true;
					} else {
						if(args[0].equalsIgnoreCase("list")) {
							ArrayList<String> ary = readFile(player);
							if(ary == null) {
								player.sendMessage(ChatColor.RED + "에러1-2 발생, 관리자에게 문의하세요.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							player.sendMessage(ChatColor.GOLD + "=======================");
							try {
								int cnt = 1;
								for(String line : ary) {
									player.sendMessage(ChatColor.GREEN + "  " + cnt + ": " + line.split("\\|")[0]);
									cnt++;
								}
							} catch(Exception e) {
								player.sendMessage(ChatColor.RED + "에러3 발생, 관리자에게 문의하세요.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							player.sendMessage(ChatColor.GOLD + "=======================");
							return true;
						} else if(args[0].equalsIgnoreCase("add")) {
							Location loc = player.getLocation();
							if (!(loc.getX() <= -884 && loc.getY() <= 255 && loc.getZ() <= 1599 && 
									loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074)) {
								player.sendMessage(ChatColor.RED + "워프마커 등록이 불가능한 지역입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							if(!player.isOnGround()) {
								player.sendMessage(ChatColor.RED + "워프마커 등록이 불가능한 지역입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							if (loc.getX() <= -1050 && loc.getY() <= 110 && loc.getZ() <= 1503 && 
									loc.getX() >= -1105 && loc.getY() >= 75 && loc.getZ() >= 1374) {
								player.sendMessage(ChatColor.RED + "워프마커 등록이 불가능한 지역입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							int arg1 = 0;
							try { 
								arg1 = Integer.parseInt(args[1]);
							} catch(Exception e) {
								player.sendMessage(ChatColor.RED + "잘못된 입력입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							ArrayList<String> ary = readFile(player);
							if(ary == null) {
								player.sendMessage(ChatColor.RED + "에러1-3 발생, 관리자에게 문의하세요.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							if(arg1 > ary.size()) {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							if(args[2].contains("|") || args[2].contains("/") || args[2].contains("앤젤라") || args[2].contains("발톱")) {
								player.sendMessage(ChatColor.RED + "사용할 수 없는 단어가 존재합니다.");
								return true;
							}
							
							if(args[2].length() > 10) {
								player.sendMessage(ChatColor.RED + "워프마커 이름이 너무 깁니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							ary.set(arg1-1, args[2] + "|" + player.getLocation().getX() + "/" + player.getLocation().getY() + "/" + player.getLocation().getZ());
							
							writeFile(player, ary);
							
							player.sendMessage(ChatColor.GREEN + "새로운 워프마커가 추가되었습니다." + " (" + args[2] + ")");
							player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
							return true;
						} else if(args[0].equalsIgnoreCase("remove")) {
							int arg1 = 0;
							try { 
								arg1 = Integer.parseInt(args[1]);
							} catch(Exception e) {
								player.sendMessage(ChatColor.RED + "잘못된 입력입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							ArrayList<String> ary = readFile(player);
							if(ary == null) {
								player.sendMessage(ChatColor.RED + "에러1-4 발생, 관리자에게 문의하세요.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							if(arg1 > ary.size()) {
								player.sendMessage(ChatColor.RED + "해금되지 않은 슬롯입니다.");
								player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
								return true;
							}
							
							ary.set(arg1-1, "미사용 슬롯");
							
							writeFile(player, ary);
							
							player.sendMessage(ChatColor.GREEN + args[1] + "번 슬롯이 초기화 되었습니다.");
							player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 0.3f, 2.0f);
							return true;
						} else if(args[0].equalsIgnoreCase("help")) {
							player.sendMessage(ChatColor.GOLD + "=======================");
							player.sendMessage(ChatColor.GREEN + "  teleport <number>");
							player.sendMessage(ChatColor.GREEN + "  teleport list");
							player.sendMessage(ChatColor.GREEN + "  teleport add <number> <name>");
							player.sendMessage(ChatColor.GREEN + "  teleport remove <number>");
							player.sendMessage(ChatColor.GOLD + "=======================");
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "존재하지 않는 명령어입니다.");
							player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
							return true;
						}
					}
					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "잘못된 입력입니다.");
					player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
					return true;
				}
			}
		}	
		return true;
	}

	public ArrayList<String> readFile(Player player) {
		try {
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "warp.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);

    				ArrayList<String> ary = new ArrayList<>();
    				String line;
    				while ((line = bufReader.readLine()) != null) {
    		            ary.add(line);
    		        }
	                bufReader.close();
	                
	                return ary;
				} catch (IOException e2) {
					e2.printStackTrace();
					return null;
				}
			}
		} catch (Exception e2) {
			return null;
		}
		return null;
	}
	
	public void writeFile(Player player, ArrayList<String> ary) {
		try {
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "warp.dat");
				try {
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
					for(String line : ary) {
						fw.write(line);
						fw.write("\n");
					}
	                fw.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e2) {
			
		}
	}
	
}
