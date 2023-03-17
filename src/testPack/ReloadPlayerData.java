package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class ReloadPlayerData {

	public ReloadPlayerData(Player player, String job, File folder) {
		try {
			File dataFolder = folder;
			String fLevel = null;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(folder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e) {
            		    e.getStackTrace();
            		}
            	}
            	// 데이터 리로드
            	try {
            		File file = new File(dir, job + "_data.dat");
    				if (!file.exists()) {
    					try {
    						file.createNewFile();
    					} catch (IOException e) {
    						e.printStackTrace();
    					}
    				}
    				FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String loc = bufReader.readLine();
    				String health = bufReader.readLine();
    				String level = bufReader.readLine();
    				String[] ary1 = loc.split("/");
    				player.teleport(new Location(player.getWorld(), Integer.parseInt(ary1[0]) + 0.5, Integer.parseInt(ary1[1]) + 0.2, Integer.parseInt(ary1[2]) + 0.5));
    				String[] ary3 = level.split("/");
    				player.setLevel(Integer.parseInt(ary3[0]));
    				player.setExp(Float.parseFloat(ary3[1]));
    				if(player.getLevel() == 0) {
    					player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 0.5f);
    				}
    				String[] ary2 = health.split("/");
    				player.setHealth(Double.parseDouble(ary2[0]));
    				player.setFoodLevel(Integer.parseInt(ary2[1]));
    				bufReader.close();
            	} catch(Exception e) {
            		
            	}
            	// 생활 레벨 리로드
            	try {
            		File file = new File(dir, "fantasy_life_level.dat");
    				if (!file.exists()) {
    					try {
    						file.createNewFile();
    					} catch (IOException e) {
    						e.printStackTrace();
    					}
    				}
    				FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				fLevel = bufReader.readLine();
    				bufReader.close();
            	} catch(Exception e) {
            		
            	}
			}
		} catch(Exception e) {
			
		}
	}
	
	
}
