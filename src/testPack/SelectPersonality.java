package testPack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SelectPersonality {

	public SelectPersonality(Player player, int grade, File folder) {
		
		Inventory inv = Bukkit.createInventory(player, 54, "인격 선택");
		
		String[] ary = null;
		ArrayList<String> best = new ArrayList<>();
		ArrayList<String> grade0Ary = new ArrayList<>(Arrays.asList("평범한 해결사의 인격"));
		ArrayList<String> grade1Ary = new ArrayList<>(Arrays.asList());
		ArrayList<String> grade2Ary = new ArrayList<>(Arrays.asList());
		ArrayList<String> grade3Ary = new ArrayList<>(Arrays.asList());
		
		File dir = new File(folder + "/" + player.getUniqueId().toString());
    	if(!dir.exists()) {
    		try{
    		    dir.mkdir(); 
    		} catch(Exception e) {
    		    e.getStackTrace();
    		}
    	}
		try {
    		File file = new File(dir, "personality_grade.dat");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String grade0 = bufReader.readLine();
			String grade1 = bufReader.readLine();
			String grade2 = bufReader.readLine();
			String grade3 = bufReader.readLine();
			
			if(grade == 0) {
				ary = grade0.split("/");
			} else if(grade == 1) {
				ary = grade1.split("/");
			} else if(grade == 2) {
				ary = grade2.split("/");
			} else if(grade == 3) {
				ary = grade3.split("/");
			}
			bufReader.close();
    	} catch(Exception e) {
    		
    	}
		
		try {
    		File file = new File(dir, "personality_best.dat");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String grade0 = bufReader.readLine();
			String grade1 = bufReader.readLine();
			String grade2 = bufReader.readLine();
			String grade3 = bufReader.readLine();
			
			String[] tmp = null;
			
			if(grade == 0) {
				tmp = grade0.split("/");
			} else if(grade == 1) {
				tmp = grade1.split("/");
			} else if(grade == 2) {
				tmp = grade2.split("/");
			} else if(grade == 3) {
				tmp = grade3.split("/");
			}
			best = (ArrayList<String>) Arrays.asList(tmp);
			bufReader.close();
    	} catch(Exception e) {
    		
    	}
		
		try {
			int idx = 0;
			for(String lvl : ary) {
				
				ChatColor color = null;
				ArrayList<String> tmpAry = new ArrayList<>();
				if(grade == 0) {
					color = ChatColor.GREEN;
					tmpAry = grade0Ary;
				} else if(grade == 1) {
					color = ChatColor.AQUA;
					tmpAry = grade1Ary;
				} else if(grade == 2) {
					color = ChatColor.LIGHT_PURPLE;
					tmpAry = grade2Ary;
				} else if(grade == 3) {
					color = ChatColor.GOLD;
					tmpAry = grade3Ary;
				}
				
				if(Integer.parseInt(lvl) < 0) {
					idx++;
					continue;
				}
				
				String perLvl = "";
				if(Integer.parseInt(lvl) != 0) {
					perLvl = " +" + lvl;
				}
				
				ItemStack per = new ItemStack(Material.NETHER_STAR);
				ItemMeta perIm = per.getItemMeta();
				perIm.setDisplayName(color + tmpAry.get(idx) + perLvl);
				perIm.setLocalizedName(tmpAry.get(idx));
				ArrayList<String> perLore = new ArrayList<>();
				perLore.add(ChatColor.GRAY + "최대 기록: " + best.get(idx));
				perIm.setLore(perLore);
				perIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				perIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				per.setItemMeta(perIm);
				inv.setItem(idx, per);
				
				idx++;
			}
    	} catch(Exception e) {
    		
    	}
		
		player.openInventory(inv);
	}
}
