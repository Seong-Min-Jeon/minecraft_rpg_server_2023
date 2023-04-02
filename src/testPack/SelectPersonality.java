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
	
	ArrayList<String> grade0Ary = new ArrayList<>(Arrays.asList("평범한 해결사의 인격", "윤 사무소 해결사의 인격", "갈고리 사무소 해결사의 인격", "가로등 사무소 해결사의 인격", "어금니 사무소 해결사의 인격", "마침표 사무소 해결사의 인격", "새벽 사무소 해결사의 인격" //6
			, "쐐기 사무소 해결사의 인격", "시선 사무소 해결사의 인격", "쥐의 인격", "철의 형제의 인격", "버림받은 개의 인격", "꿀꿀이네 조직원의 인격", "도끼파 조직원의 인격", "정육점파 조직원의 인격"));

	ArrayList<String> grade1Ary = new ArrayList<>(Arrays.asList("윤의 인격", "맥컬린의 인격", "마스의 인격", "태인의 인격", "레인의 인격", "올가의 인격", "츠바이 협회 6과 해결사의 인격", "츠바이 협회 5과 해결사의 인격", "시 협회 5과 해결사의 인격" //8
			, "리우 협회 5과 해결사의 인격", "세븐 협회 5과 해결사의 인격", "스테판의 인격", "유나의 인격", "파멜리의 인격", "달록의 인격", "츠바이 협회 3과 해결사의 인격" //15
			, "시 협회 3과 해결사의 인격", "리우 협회 3과 해결사의 인격", "세븐 협회 3과 해결사의 인격", "W사 정리요원의 인격", "K사 진압요원의 인격", "녹슨 사슬파 조직원의 인격"
			, "흑운회 와카슈의 인격", "사육제의 인격", "철공회 조직원의 인격", "하바네로파 조직원의 인격", "엄지 솔다토의 인격", "검지 수행자의 인격"));

	ArrayList<String> grade2Ary = new ArrayList<>(Arrays.asList("이사도라의 인격", "월터의 인격", "리웨이의 인격", "살바도르의 인격", "오스카의 인격", "알록의 인격", "아누로그나투스의 인격", "아르타니스의 인격", "제미다라크의 인격", "가논돌프의 인격" //9
			, "닉토사우루스의 인격", "말라쉬의 인격", "유메하마의 인격", "단테의 인격", "츠바이 협회 2과 해결사의 인격", "시 협회 2과 해결사의 인격", "리우 협회 2과 해결사의 인격" //16
			, "세븐 협회 2과 해결사의 인격", "베이야드 소속 해결사의 인격", "지팡이 사무소 해결사의 인격", "우제트 소속 해결사의 인격", "하나 협회 3과 해결사의 인격" , "츠바이 협회 1과 해결사의 인격" //22
			, "시 협회 1과 해결사의 인격", "리우 협회 1과 해결사의 인격", "세븐 협회 1과 해결사의 인격", "R사 토끼팀의 인격", "N사 쥐는 자의 인격", "웃는 얼굴들의 인격", "마리아치 수장의 인격"
			, "콩콩이파 두목의 인격", "검계 살수의 인격", "밤의 송곳 조직원의 인격", "엄지 카포의 인격", "검지 전령의 인격", "검지 대행자의 인격", "청소부의 인격"));

	ArrayList<String> grade3Ary = new ArrayList<>(Arrays.asList("타페야라의 인격", "유진의 인격", "로웰의 인격", "임파의 인격", "카르멘의 인격", "바야르의 인격", "네모의 인격", "디아스의 인격", "올리비에의 인격", "에드가의 인격", "아킬레의 인격" //10
			, "샤오의 인격", "울링의 인격", "아인의 인격", "핀의 인격", "피트의 인격", "필립의 인격"));

	public SelectPersonality() {
		
	}
	
	public SelectPersonality(Player player, int grade, File folder) {
		
		Inventory inv = Bukkit.createInventory(player, 54, "인격 선택");
		
		String[] ary = null;
		ArrayList<String> best = new ArrayList<>();
		
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
			
			for(String b : tmp) {
				best.add(b);
			}
			
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
				if(best.get(idx).equals("0")) {
					perLore.add(ChatColor.GRAY + "최대 기록: 특색 해결사");
				} else {
					perLore.add(ChatColor.GRAY + "최대 기록: " + best.get(idx) + "급 해결사");
				}
				perIm.setLore(perLore);
				per.setItemMeta(perIm);
				inv.setItem(idx, per);
				
				idx++;
			}
    	} catch(Exception e) {
    		
    	}
		
		player.openInventory(inv);
	}
}
