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
	Random rnd = new Random();
	
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
		
		//인벤 관리
		ItemStack item = player.getInventory().getItem(0);
		ItemStack hel = player.getInventory().getHelmet();
		ItemStack che = player.getInventory().getChestplate();
		ItemStack leg = player.getInventory().getLeggings();
		ItemStack bo = player.getInventory().getBoots();
		player.getInventory().clear();
		player.getInventory().setHelmet(hel);
		player.getInventory().setChestplate(che);
		player.getInventory().setLeggings(leg);
		player.getInventory().setBoots(bo);
		player.getInventory().setItem(7, item); //인격 7번칸에 두기
		player.setLevel(0);
		
		//최대체력 설정
		String name = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
		if(name.equals("평범한 해결사의 인격")) {
			player.setMaxHealth(10); //인격 강화에 따라서 증가시켜줘야됨
		} else if(name.equals("윤 사무소 해결사의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("갈고리 사무소 해결사의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("가로등 사무소 해결사의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("어금니 사무소 해결사의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("마침표 사무소 해결사의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("새벽 사무소 해결사의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("쐐기 사무소 해결사의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("시선 사무소 해결사의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("쥐의 인격")) {
			player.setMaxHealth(2);
		} else if(name.equals("철의 형제의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("버림받은 개의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("꿀꿀이네 조직원의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("도끼파 조직원의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("정육점파 조직원의 인격")) {
			player.setMaxHealth(12);
		} else if(name.equals("윤의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("맥컬린의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("산의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("태인의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("레인의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("올가의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("츠바이 협회 6과 해결사의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("츠바이 협회 5과 해결사의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("시 협회 5과 해결사의 인격")) {
			player.setMaxHealth(14);
		} else if(name.equals("리우 협회 5과 해결사의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("세븐 협회 5과 해결사의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("스테판의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("유나의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("파멜리의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("달록의 인격")) {
			player.setMaxHealth(20);
		} else if(name.equals("츠바이 협회 3과 해결사의 인격")) {
			player.setMaxHealth(20);
		} else if(name.equals("시 협회 3과 해결사의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("리우 협회 3과 해결사의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("세븐 협회 3과 해결사의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("W사 정리요원의 인격")) {
			player.setMaxHealth(20);
		} else if(name.equals("K사 진압요원의 인격")) {
			player.setMaxHealth(24);
		} else if(name.equals("녹슨 사슬파 조직원의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("흑운회 와카슈의 인격")) {
			player.setMaxHealth(16);
		} else if(name.equals("사육제의 인격")) {
			player.setMaxHealth(22);
		} else if(name.equals("철공회 조직원의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("하바네로파 조직원의 인격")) {
			player.setMaxHealth(18);
		} else if(name.equals("엄지 솔다토의 인격")) {
			player.setMaxHealth(20);
		} else if(name.equals("검지 수행자의 인격")) {
			player.setMaxHealth(18);
		}
		
		player.setHealth(player.getMaxHealth());
		player.setFoodLevel(20);
		player.setSaturation((float) 8.0);
		
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
		
		int num = rnd.nextInt(5);
		if(num == 0) {
			player.teleport(new Location(player.getWorld(),-1143,62,1138));
		} else if(num == 1) {
			player.teleport(new Location(player.getWorld(),-1218,62,1280));
		} else if(num == 2) {
			player.teleport(new Location(player.getWorld(),-1256,62,1386));
		} else if(num == 3) {
			player.teleport(new Location(player.getWorld(),-1052,62,1114));
		} else if(num == 4) {
			player.teleport(new Location(player.getWorld(),-995,62,1275));
		}
		
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
		} else if(name.equals("윤 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.COBBLESTONE_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "저급 공방의 칼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "9급 사무소 해결사도 적당하게 쓸 수 있는 무기");
			weaponLore.add(ChatColor.GRAY + "어느 공방에서 만들었는지 적혀있지도 않다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("갈고리 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.COBBLESTONE_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "저급 공방의 칼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "9급 사무소 해결사도 적당하게 쓸 수 있는 무기");
			weaponLore.add(ChatColor.GRAY + "어느 공방에서 만들었는지 적혀있지도 않다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("가로등 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.COBBLESTONE_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "저급 공방의 칼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "9급 사무소 해결사도 적당하게 쓸 수 있는 무기");
			weaponLore.add(ChatColor.GRAY + "어느 공방에서 만들었는지 적혀있지도 않다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("어금니 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.CUT_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "어금니 사무소의 톱");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "어금니 사무소에서 주문 제작해 만든 톱");
			weaponLore.add(ChatColor.GRAY + "처음 사무소에 입사하면 모두에게 나눠준다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("마침표 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.TUBE_CORAL_BLOCK);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "그나마 싼 권총");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "로직 아틀리에에서 저가용으로 만든 총");
			weaponLore.add(ChatColor.GRAY + "마침표 사무소의 말단 해결사들이 주로 사용한다고 한다.");
			weaponLore.add(ChatColor.GRAY + "목적에 맞도록 호환되는 탄환도 저가이다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("새벽 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.ACACIA_PLANKS);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "불꽃을 일으키는 검");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "스티그마 공방에서 제작된 검");
			weaponLore.add(ChatColor.GRAY + "잘만 사용하면 리우의 불꽃만큼 강한");
			weaponLore.add(ChatColor.GRAY + "불꽃을 운용할 수도 있다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("쐐기 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.DARK_OAK_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "파이크");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "특히 자루가 긴 장창");
			weaponLore.add(ChatColor.GRAY + "멀리서 찌르는 데에 특화가 되었으며");
			weaponLore.add(ChatColor.GRAY + "근접 무기 중에서는 공격 범위가 꽤나 길다.");
			weaponLore.add(ChatColor.GRAY + "말에 탄 적에게도 유용하지만");
			weaponLore.add(ChatColor.GRAY + "좁은 곳에서는 매우 다루기 힘들다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("시선 사무소 해결사의 인격")) {
			weapon = new ItemStack(Material.MUSIC_DISC_CAT);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "암흑 군주의 눈");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "도시를 지켜보는 눈이라는 이명을 가진 막대기");
			weaponLore.add(ChatColor.GRAY + "달록이 시선 사무소에 어울리는 무기를 고민하다가");
			weaponLore.add(ChatColor.GRAY + "탄생하게 되었다.");
			weaponLore.add(ChatColor.GRAY + "전문가가 아닌 사람이 만들었기에 딱히 특이점이");
			weaponLore.add(ChatColor.GRAY + "사용되었거나 하지 않은 그냥 예쁜 막대기이다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weaponIm.addItemFlags(ItemFlag.HIDE_DYE);
			weaponIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("쥐의 인격")) {
			weapon = new ItemStack(Material.SMOOTH_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "쇠파이프");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "하! 뒷골목의 쓰레기가 이 나랑 결투라고?");
			weaponLore.add(ChatColor.GRAY + "무기도 없는 주제에 웃기지 마라.");
			weaponLore.add(ChatColor.GRAY + "");
			weaponLore.add(ChatColor.GRAY + "-무기는 주웠다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("철의 형제의 인격")) {
			weapon = new ItemStack(Material.CUT_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "황금골든소우");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "근거리 전투");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("버림받은 개의 인격")) {
			weapon = new ItemStack(Material.STONE_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "프로미스");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "약속의 소중함을 깨닫게 해주는 무기");
			weaponLore.add(ChatColor.GRAY + "무기의 이름에 맞게 여성용이다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("꿀꿀이네 조직원의 인격")) {
			weapon = new ItemStack(Material.SPRUCE_LOG);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "파이 손질용 칼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "고기파이의 재료를 손질하는 칼");
			weaponLore.add(ChatColor.GRAY + "파이는 신선도가 생명인 음식이기 때문에");
			weaponLore.add(ChatColor.GRAY + "살육에 최적화 되어 있는 디자인이 아니다.");
			weaponLore.add(ChatColor.GRAY + "오래 사용되어 피로 부식되었다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("도끼파 조직원의 인격")) {
			weapon = new ItemStack(Material.GREEN_CARPET);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "배틀 액스");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "자루 끝에 두껍고 무거운 날을 단 전투 도끼");
			weaponLore.add(ChatColor.GRAY + "범용성이 높은 표준 속성 무기이다.");
			weaponLore.add(ChatColor.GRAY + "무거운 칼날을 내려치는 공격은 위력이 높고");
			weaponLore.add(ChatColor.GRAY + "도끼의 차지 공격은 특히 강력하다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("정육점파 조직원의 인격")) {
			weapon = new ItemStack(Material.BIRCH_LOG);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "집 잃은 조직원의 대검");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "옛 장식이 새겨진 질 좋은 대검");
			weaponLore.add(ChatColor.GRAY + "어떠한 이유, 혹은 죄로");
			weaponLore.add(ChatColor.GRAY + "고향을 잃은 이들에게 주어졌다.");
			weaponLore.add(ChatColor.GRAY + "그들 중 대부분은 변방으로 보내져");
			weaponLore.add(ChatColor.GRAY + "실의와 함께 그 땅에 자리 잡았다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("윤의 인격")) {
			weapon = new ItemStack(Material.SMOOTH_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "급하게 주운 파이프");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "윤 사무소 앞 하수구에서 주운 파이프");
			weaponLore.add(ChatColor.GRAY + "맨 주먹도 강한 윤이기에 이런 고철로도");
			weaponLore.add(ChatColor.GRAY + "꽤나 싸울 수 있는 것 같다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("맥컬린의 인격")) {
			weapon = new ItemStack(Material.GREEN_CARPET);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "어리석은 도끼");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "조직에 몸을 담갔던 놈이 해결사 일을 한다거나,");
			weaponLore.add(ChatColor.GRAY + "해결사 일을 하던 놈이 조직에 몸을 담그는 것이");
			weaponLore.add(ChatColor.GRAY + "아예 불가능한 건 아니야.");
			weaponLore.add(ChatColor.GRAY + "실제로 꽤 있는 일이라고 할 수 있지.");
			weaponLore.add(ChatColor.GRAY + "실력만 확실하다면 여러 곳에서 꽤 쏠쏠한 제안을 받기도 해.");
			weaponLore.add(ChatColor.GRAY + "중요한 건 원한 관계지.");
			weaponLore.add(ChatColor.GRAY + "지금까지 해 온 일들, 그러니까 이 사람이");
			weaponLore.add(ChatColor.GRAY + "쌓아 온 업보에 따라 결정하는 거야.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("산의 인격")) {
			weapon = new ItemStack(Material.COBBLESTONE_SLAB);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "산의 침착한 검");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "협회 직속 해결사는 안정적인 봉급이 나오기 때문에");
			weaponLore.add(ChatColor.GRAY + "다른 사무소에 비해 굶어 죽지 않을 가능성이 높다.");
			weaponLore.add(ChatColor.GRAY + "우리 같은 치안 의뢰 사무소는 해당 구역만 잘 지키는");
			weaponLore.add(ChatColor.GRAY + "일을 맡고 있어 일거리가 떨어질 일은 없다.");
			weaponLore.add(ChatColor.GRAY + "그렇다면 지루함을 견뎌야 하는 것이 단점이냐고?");
			weaponLore.add(ChatColor.GRAY + "우리는 협회의 명령에 따라 움직이는 만큼, 받고");
			weaponLore.add(ChatColor.GRAY + "싶지 않은 일도 강제로 처리해야만 한다.");
			weaponLore.add(ChatColor.GRAY + "설령 사무소가 다 전멸할 수 있다 해도…");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("태인의 인격")) {
			weapon = new ItemStack(Material.OAK_LEAVES);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "태인의 의수도");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "태인의 의체에 장치된 생체 무기");
			weaponLore.add(ChatColor.GRAY + "구별된 칼날은 하수구에서도 썩지 않는다.");
			weaponLore.add(ChatColor.GRAY + "성능이 좋은 건 기본, 알레르기 반응 같은");
			weaponLore.add(ChatColor.GRAY + "문제도 전혀 없다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("레인의 인격")) {
			weapon = new ItemStack(Material.CUT_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "R사에서 버려진 톱");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "R사 입구에서 올가가 주워온 톱");
			weaponLore.add(ChatColor.GRAY + "혈연 학연 지연이 좋은 것처럼 올가가");
			weaponLore.add(ChatColor.GRAY + "묘를 친구로 둔 덕분에 구한 무기이다.");
			weaponLore.add(ChatColor.GRAY + "날개에서 사용하기엔 부족한 성능이지만");
			weaponLore.add(ChatColor.GRAY + "뒷골목의 해결사에게는 과분하다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("올가의 인격")) {
			weapon = new ItemStack(Material.CUT_RED_SANDSTONE);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "묘가 구해준 톱");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "묘가 사비를 들여 제작한 톱");
			weaponLore.add(ChatColor.GRAY + "날개의 전투 요원이 사용하는 수준의");
			weaponLore.add(ChatColor.GRAY + "성능을 지녔다고 한다.");
			weaponLore.add(ChatColor.GRAY + "다만 올가가 술을 흘리는 바람에");
			weaponLore.add(ChatColor.GRAY + "녹슬어버려 본래의 성능은 나오지 않는다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("츠바이 협회 6과 해결사의 인격")) {
			weapon = new ItemStack(Material.OAK_LEAVES);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "츠바이핸더");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "츠바이 협회 입사 기념으로 주어지는");
			weaponLore.add(ChatColor.GRAY + "철로 만든 츠바이핸더");
			weaponLore.add(ChatColor.GRAY + "지키기 위한 검이기 때문에 강직도를");
			weaponLore.add(ChatColor.GRAY + "높이는데 집중되었다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("츠바이 협회 5과 해결사의 인격")) {
			weapon = new ItemStack(Material.OAK_LEAVES);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "츠바이핸더");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "츠바이 협회 입사 기념으로 주어지는");
			weaponLore.add(ChatColor.GRAY + "철로 만든 츠바이핸더");
			weaponLore.add(ChatColor.GRAY + "지키기 위한 검이기 때문에 강직도를");
			weaponLore.add(ChatColor.GRAY + "높이는데 집중되었다.");
			weaponIm.setLore(weaponLore);
			weaponIm.setUnbreakable(true);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weaponIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			weapon.setItemMeta(weaponIm);
		} else if(name.equals("시 협회 5과 해결사의 인격")) {
			weapon = new ItemStack(Material.OAK_LEAVES);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.BOLD + "붉게 빛나는 카타나");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "시 협회의 해결사들이 일반적으로");
			weaponLore.add(ChatColor.GRAY + "사용하는 붉은 빛의 카타나");
			weaponLore.add(ChatColor.GRAY + "암살과 미행에 적합하게 가벼운");
			weaponLore.add(ChatColor.GRAY + "소재로 만들어졌다.");
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
