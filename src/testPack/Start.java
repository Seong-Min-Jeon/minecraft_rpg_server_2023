package testPack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import de.Herbystar.TTA.TTA_Methods;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class Start {
	
	private int sleep = 0;
	
	public Start(Player player, File folder) {
		
		try {
			File dataFolder = folder;
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
				//광기
				File file = new File(dir, "lunacy.dat");
				try {
					file.createNewFile();
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
					fw.write(Integer.toString(player.getLevel()));
	                fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			
		}
		
		ItemStack item = player.getInventory().getItem(0);
		player.getInventory().clear();
		player.setLevel(0);
		player.getInventory().setItem(7, item); //인격 7번칸에 두기
		
		//최대체력 설정
		String name = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
		if(name.equals("평범한 해결사의 인격")) {
			player.setMaxHealth(10); //인격 강화에 따라서 증가시켜줘야됨
		}
		
		player.setHealth(player.getMaxHealth());
		player.setFoodLevel(20);
		
		ItemStack lic = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta licIm = lic.getItemMeta();
		licIm.setDisplayName(ChatColor.BOLD + player.getDisplayName() + "의 해결사 면허증");
		ArrayList<String> licLore = new ArrayList<>();
		licLore.add(ChatColor.GRAY + "이름: " + player.getDisplayName());
		licLore.add(ChatColor.GRAY + "등급: 9급 해결사 [0/10]");
		licLore.add(ChatColor.GRAY + "소속: 무소속");
		licIm.setLore(licLore);
		licIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		licIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		lic.setItemMeta(licIm);
		player.getInventory().setItem(8, lic);
		
		//로비에서 이동하기 위한 사전 준비
		//======================================
		//이동
		
		new BGM(player, "메인");
		
		player.teleport(new Location(player.getWorld(),-1143,181,1461)); //임시로 둥지 내부에 이동
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "정신을 차려보니 어딘가의 뒷골목이다..", 20, 40, 20);
		
		ThreadActionBar t = new ThreadActionBar(player.getUniqueId());
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			int time = 0;
			@Override
			public void run() {
				if (!t.hasID()) {t.setID(sleep);}
			
				if(time>=60) {
					TTA_Methods.sendTitle(player, null, 20, 40, 20, "가방안에 무언가가 들어있는 것 같다.", 20, 40, 20);
					t.endTask(); 
					t.removeID();
				} 
				time++;
			}						
		}, 0, 1);
		
		
		
		equip(player, name);
		startReception(player);
		
		
	}
	
	public void equip(Player player, String name) {
		ItemStack weapon = null; 
		
		if(name.equals("평범한 해결사의 인격")) {
			weapon = new ItemStack(Material.OAK_LEAVES);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "평범한 칼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "초보 해결사도 지니고 다닐 수 있는 저가형 무기");
			weaponLore.add(ChatColor.GRAY + "내구성은 보기보다 좋다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		}
		
		if(weapon != null) {player.getInventory().setItem(0, weapon);}
	}
	
	public void startReception(Player player) {
		ArrayList<ItemStack> ary = new ArrayList<>();
		
		ItemStack recep1 = new ItemStack(Material.PAPER);
		ItemMeta recep1Im = recep1.getItemMeta();
		recep1Im.setDisplayName(ChatColor.BOLD + "윤 사무소 초대장");
		ArrayList<String> recep1Lore = new ArrayList<>();
		recep1Lore.add(ChatColor.GRAY + "윤 사무소 소속 해결사가");
		recep1Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
		recep1Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
		recep1Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
		recep1Im.setLore(recep1Lore);
		recep1.setItemMeta(recep1Im);
		
		ary.add(recep1);
		
		ItemStack recep2 = new ItemStack(Material.PAPER);
		ItemMeta recep2Im = recep2.getItemMeta();
		recep2Im.setDisplayName(ChatColor.BOLD + "갈고리 사무소 초대장");
		ArrayList<String> recep2Lore = new ArrayList<>();
		recep2Lore.add(ChatColor.GRAY + "갈고리 사무소 소속 해결사가");
		recep2Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
		recep2Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
		recep2Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
		recep2Im.setLore(recep2Lore);
		recep2.setItemMeta(recep2Im);
		
		ary.add(recep2);
		
		ItemStack recep3 = new ItemStack(Material.PAPER);
		ItemMeta recep3Im = recep3.getItemMeta();
		recep3Im.setDisplayName(ChatColor.BOLD + "가로등 사무소 초대장");
		ArrayList<String> recep3Lore = new ArrayList<>();
		recep3Lore.add(ChatColor.GRAY + "가로등 사무소 소속 해결사가");
		recep3Lore.add(ChatColor.GRAY + "될 수 있는 초대장");
		recep3Lore.add(ChatColor.GRAY + "의뢰를 수주하면 초대장을 사용할 의지가");
		recep3Lore.add(ChatColor.GRAY + "없다고 판단되어 사라진다.");
		recep3Im.setLore(recep3Lore);
		recep3.setItemMeta(recep3Im);
		
		ary.add(recep3);
		
		Random rnd = new Random();
        int idx = rnd.nextInt(ary.size());
        player.getInventory().addItem(ary.get(idx));
        ary.remove(idx);
        idx = rnd.nextInt(ary.size());
        player.getInventory().addItem(ary.get(idx));
       
	}
	
}
