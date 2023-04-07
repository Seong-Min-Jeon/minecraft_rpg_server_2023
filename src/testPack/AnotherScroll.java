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
	
	public void effect(Player player, ItemStack itemArg, File folder) {
		personalityUpgrade1(player, itemArg, folder);
		personalityUpgrade2(player, itemArg, folder);
		personalityUpgrade3(player, itemArg, folder);
		personalityUpgrade4(player, itemArg, folder);
		personalityUpgrade5(player, itemArg, folder);
		personalityUpgrade6(player, itemArg, folder);
		personalityUpgrade7(player, itemArg, folder);
		personalityUpgrade8(player, itemArg, folder);
		personalityUpgrade9(player, itemArg, folder);
		personalityOpen(player, itemArg, folder);
	}
	
	public void personalityUpgrade1(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +1")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 0) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade2(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +2")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 1) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade3(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +3")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 2) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade4(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +4")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 3) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade5(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +5")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 4) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade6(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +6")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 5) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade7(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +7")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 6) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade8(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +8")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 7) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityUpgrade9(Player player, ItemStack itemArg, File folder) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "인격 강화서 +9")) {
			
			int grade = 0;
			ItemStack item = player.getInventory().getItem(0);
			String name = null;
			try {
				name = item.getItemMeta().getDisplayName();
				grade = Integer.parseInt(name.substring(name.length()-1, name.length()));
			} catch(Exception e) {
				grade = 0;
			}
			
			if(grade != 8) {
				player.sendMessage(ChatColor.GOLD + "[System] 해당 강화서를 사용할 수 없습니다.");
				return;
			}
			
			int rare = 0;
			try {
				if(name.substring(0,2).equals("§a")) {
					rare = 1;
				} else if(name.substring(0,2).equals("§b")) {
					rare = 2;
				} else if(name.substring(0,2).equals("§d")) {
					rare = 3;
				} else if(name.substring(0,2).equals("§6")) {
					rare = 4;
				}
			} catch(Exception e) {
				
			}
			
			int order = -1;
			try {
				if(rare == 1) {
					ArrayList<String> ary = new SelectPersonality().grade0Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 2) {
					ArrayList<String> ary = new SelectPersonality().grade1Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 3) {
					ArrayList<String> ary = new SelectPersonality().grade2Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				} else if(rare == 4) {
					ArrayList<String> ary = new SelectPersonality().grade3Ary;
					order = ary.indexOf(item.getItemMeta().getLocalizedName());
				}
			} catch(Exception e) {
				
			}
			
			personalityUpgrade(player, order, grade+1, rare, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
		}	
	}
	
	public void personalityOpen(Player player, ItemStack itemArg, File folder) {
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "W사 정리요원 인격 개방서")) {
			fixFile(player, 2, 19, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
			//개방 소리 따로 넣기
		} else if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "K사 진압요원 인격 개방서")) {
			fixFile(player, 2, 20, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
			//개방 소리 따로 넣기
		} else if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "R사 토끼팀 인격 개방서")) {
			fixFile(player, 3, 26, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
			//개방 소리 따로 넣기
		} else if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "N사 쥐는 자 인격 개방서")) {
			fixFile(player, 3, 27, folder);
			itemArg.setAmount(itemArg.getAmount()-1);
			//개방 소리 따로 넣기
		}
	}
	
	public void personalityUpgrade(Player player, int order, int grade, int rare, File folder) {
		try {
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(folder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "personality_grade.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String first = bufReader.readLine();
    				String second = bufReader.readLine();
    				String third = bufReader.readLine();
    				String fourth = bufReader.readLine();
    				
    				if(rare == 1) {
    					String[] num = first.split("/");
    					num[order] = Integer.toString(grade);
        				String str = "";
        				for(int i = 0 ; i < 53 ; i++) {
        					str += num[i] + "/";
        				}
        				str += num[53];
    					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
    	                fw.write(str);
    	                fw.write("\n");
    	                fw.write(second);
    	                fw.write("\n");
    	                fw.write(third);
    	                fw.write("\n");
    	                fw.write(fourth);
    	                fw.close();
    	                
    	                player.sendMessage(ChatColor.GOLD + "[System] 인격이 강화되었습니다.");
    				} else if(rare == 2) {
    					String[] num = second.split("/");
    					num[order] = Integer.toString(grade);
        				String str = "";
        				for(int i = 0 ; i < 53 ; i++) {
        					str += num[i] + "/";
        				}
        				str += num[53];
    					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
    	                fw.write(first);
    	                fw.write("\n");
    	                fw.write(str);
    	                fw.write("\n");
    	                fw.write(third);
    	                fw.write("\n");
    	                fw.write(fourth);
    	                fw.close();
    	                
    	                player.sendMessage(ChatColor.GOLD + "[System] 인격이 강화되었습니다.");
    				} else if(rare == 3) {
    					String[] num = third.split("/");
    					num[order] = Integer.toString(grade);
        				String str = "";
        				for(int i = 0 ; i < 53 ; i++) {
        					str += num[i] + "/";
        				}
        				str += num[53];
    					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
    	                fw.write(first);
    	                fw.write("\n");
    	                fw.write(second);
    	                fw.write("\n");
    	                fw.write(str);
    	                fw.write("\n");
    	                fw.write(fourth);
    	                fw.close();
    	                
    	                player.sendMessage(ChatColor.GOLD + "[System] 인격이 강화되었습니다.");
    				} else if(rare == 4) {
    					String[] num = fourth.split("/");
    					num[order] = Integer.toString(grade);
        				String str = "";
        				for(int i = 0 ; i < 53 ; i++) {
        					str += num[i] + "/";
        				}
        				str += num[53];
    					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
    	                fw.write(first);
    	                fw.write("\n");
    	                fw.write(second);
    	                fw.write("\n");
    	                fw.write(third);
    	                fw.write("\n");
    	                fw.write(str);
    	                fw.close();
    	                
    	                player.sendMessage(ChatColor.GOLD + "[System] 인격이 강화되었습니다.");
    				}
    				
    				player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 4.0f);
	                bufReader.close();
	                
	                try {
	        			ItemStack item = player.getInventory().getItem(0);
	        			String name = item.getItemMeta().getDisplayName();
	        			if(grade == 1) {
	        				ItemMeta im = item.getItemMeta();
	        				im.setDisplayName(name + " +1");
	        				item.setItemMeta(im);
	        			} else {
	        				ItemMeta im = item.getItemMeta();
	        				im.setDisplayName(name.substring(0, name.length()-1) + grade);
	        				item.setItemMeta(im);
	        			}
	        			player.getInventory().setItem(0, item);
	        		} catch(Exception e3) {
	        			
	        		}
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e) {
			
		}
		
	}
	
	public void fixFile(Player player, int rare, int order, File folder) {
		try {
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(folder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "personality_grade.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String first = bufReader.readLine();
    				String second = bufReader.readLine();
    				String third = bufReader.readLine();
    				String fourth = bufReader.readLine();
    				
    				if(rare == 1) {
    					String[] num = first.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 2) {
    					String[] num = second.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 3) {
    					String[] num = third.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.write("\n");
        	                fw.write(fourth);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				} else if(rare == 4) {
    					String[] num = fourth.split("/");
    					if(num[order].equals("-1")) {
    						num[order] = "0";
            				String str = "";
            				for(int i = 0 ; i < 53 ; i++) {
            					str += num[i] + "/";
            				}
            				str += num[53];
        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        	                fw.write(first);
        	                fw.write("\n");
        	                fw.write(second);
        	                fw.write("\n");
        	                fw.write(third);
        	                fw.write("\n");
        	                fw.write(str);
        	                fw.close();
        	                
        	                player.sendMessage(ChatColor.GOLD + "[System] 새로운 인격이 개방되었습니다.");
    					}
    				}
    				
	                bufReader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e2) {
			
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
