package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Message {
	
	int sleep = 0;
    private int len;
    private int cnt = 0;
	
	public void msg(Player player, String str) {
		
		String[] ary = str.split("%");
		len = ary.length;
		
		ThreadMessage t = new ThreadMessage(player.getUniqueId());
		
		if(t.hasID()) {
			return;
		}
		
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

			int time = 0;
			
			@Override
			public void run() {
				
				if (!t.hasID()) {
					t.setID(sleep);
				} else {
					if(cnt == 0) {
						t.endTask();
						t.removeID();
					}
				}
			
				if(time % 30 == 0) {
					if(ary[cnt].substring(0, 2).equals("tp")) {
						String str = ary[cnt].substring(2);
						String[] array = str.split(" ");
						int x = Integer.parseInt(array[0]);
						int y = Integer.parseInt(array[1]);
						int z = Integer.parseInt(array[2]);
						player.teleport(new Location(player.getWorld(), x, y, z));
					} else if(ary[cnt].substring(0, 5).equals("bl120")) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 0,true,false,false));
					} else if(ary[cnt].substring(0, 5).equals("q0001")) {
						QuestBoard qb = new QuestBoard();
						qb.q0001(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0002")) {
						QuestBoard qb = new QuestBoard();
						qb.q0002(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0003")) {
						QuestBoard qb = new QuestBoard();
						qb.q0003(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0004")) {
						QuestBoard qb = new QuestBoard();
						qb.q0004(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0005")) {
						QuestBoard qb = new QuestBoard();
						qb.q0005(player, 0, true);
						
						//음식 아이템 주기
						ItemStack food = new ItemStack(Material.MUSHROOM_STEW);
						ItemMeta foodIm = food.getItemMeta();
						foodIm.setDisplayName(ChatColor.WHITE + "윤이 만든 음식");
						ArrayList<String> foodLore = new ArrayList<>();
						foodLore.add(ChatColor.GRAY + "윤이 에리와 함께 만든 음식");
						foodLore.add(ChatColor.GRAY + "하급 사무소는 제대로 된 의뢰를 받는 일이");
						foodLore.add(ChatColor.GRAY + "드물기 때문에 별의별 일을 다 맡는다고 한다.");
						foodIm.setLore(foodLore);
						food.setItemMeta(foodIm);
						player.getInventory().addItem(food);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0006")) {
						QuestBoard qb = new QuestBoard();
						qb.q0006(player, 0, true);
						
						//음식 아이템 주기
						ItemStack food = new ItemStack(Material.MUSHROOM_STEW);
						ItemMeta foodIm = food.getItemMeta();
						foodIm.setDisplayName(ChatColor.WHITE + "윤이 만든 음식");
						ArrayList<String> foodLore = new ArrayList<>();
						foodLore.add(ChatColor.GRAY + "윤이 에리와 함께 만든 음식");
						foodLore.add(ChatColor.GRAY + "하급 사무소는 제대로 된 의뢰를 받는 일이");
						foodLore.add(ChatColor.GRAY + "드물기 때문에 별의별 일을 다 맡는다고 한다.");
						foodIm.setLore(foodLore);
						food.setItemMeta(foodIm);
						player.getInventory().addItem(food);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0007")) {
						QuestBoard qb = new QuestBoard();
						qb.q0007(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0008")) {
						QuestBoard qb = new QuestBoard();
						qb.q0008(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0009")) {
						QuestBoard qb = new QuestBoard();
						qb.q0009(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0010")) {
						QuestBoard qb = new QuestBoard();
						qb.q0010(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0011")) {
						QuestBoard qb = new QuestBoard();
						qb.q0011(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0012")) {
						QuestBoard qb = new QuestBoard();
						qb.q0012(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0013")) {
						QuestBoard qb = new QuestBoard();
						qb.q0013(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0014")) {
						QuestBoard qb = new QuestBoard();
						qb.q0014(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0015")) {
						QuestBoard qb = new QuestBoard();
						qb.q0015(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0016")) {
						QuestBoard qb = new QuestBoard();
						qb.q0016(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0017")) {
						QuestBoard qb = new QuestBoard();
						qb.q0017(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0018")) {
						QuestBoard qb = new QuestBoard();
						qb.q0018(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0019")) {
						QuestBoard qb = new QuestBoard();
						qb.q0019(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0020")) {
						QuestBoard qb = new QuestBoard();
						qb.q0020(player, 0, true);
						
						//편지 주기
						ItemStack letter = new ItemStack(Material.MAP);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "묘에게 전하는 편지");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "올가가 그녀의 친구인 묘에게 쓴 편지이다.");
						letterLore.add(ChatColor.GRAY + "안에 무슨 내용이 적혀있을지 궁금하지만");
						letterLore.add(ChatColor.GRAY + "열어본 순간 사무소에서 짤릴 것 같다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0021")) {
						QuestBoard qb = new QuestBoard();
						qb.q0021(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0022")) {
						QuestBoard qb = new QuestBoard();
						qb.q0022(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0023")) {
						QuestBoard qb = new QuestBoard();
						qb.q0023(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0024")) {
						QuestBoard qb = new QuestBoard();
						qb.q0024(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0025")) {
						QuestBoard qb = new QuestBoard();
						qb.q0025(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0026")) {
						QuestBoard qb = new QuestBoard();
						qb.q0026(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0027")) {
						QuestBoard qb = new QuestBoard();
						qb.q0027(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0028")) {
						QuestBoard qb = new QuestBoard();
						qb.q0028(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0029")) {
						QuestBoard qb = new QuestBoard();
						qb.q0029(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0030")) {
						QuestBoard qb = new QuestBoard();
						qb.q0030(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0031")) {
						QuestBoard qb = new QuestBoard();
						qb.q0031(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0032")) {
						QuestBoard qb = new QuestBoard();
						qb.q0032(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0033")) {
						QuestBoard qb = new QuestBoard();
						qb.q0033(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 6과의 보고서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "월터가 작성한 이번달 6과의 보고서");
						letterLore.add(ChatColor.GRAY + "5과에 전달해주기로 하였다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0034")) {
						QuestBoard qb = new QuestBoard();
						qb.q0034(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0035")) {
						QuestBoard qb = new QuestBoard();
						qb.q0035(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0036")) {
						QuestBoard qb = new QuestBoard();
						qb.q0036(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0037")) {
						QuestBoard qb = new QuestBoard();
						qb.q0037(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0038")) {
						QuestBoard qb = new QuestBoard();
						qb.q0038(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0039")) {
						QuestBoard qb = new QuestBoard();
						qb.q0039(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0040")) {
						QuestBoard qb = new QuestBoard();
						qb.q0040(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0041")) {
						QuestBoard qb = new QuestBoard();
						qb.q0041(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0042")) {
						QuestBoard qb = new QuestBoard();
						qb.q0042(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0043")) {
						QuestBoard qb = new QuestBoard();
						qb.q0043(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0044")) {
						QuestBoard qb = new QuestBoard();
						qb.q0044(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0045")) {
						QuestBoard qb = new QuestBoard();
						qb.q0045(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0046")) {
						QuestBoard qb = new QuestBoard();
						qb.q0046(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0047")) {
						QuestBoard qb = new QuestBoard();
						qb.q0047(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0048")) {
						QuestBoard qb = new QuestBoard();
						qb.q0048(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0049")) {
						QuestBoard qb = new QuestBoard();
						qb.q0049(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0050")) {
						QuestBoard qb = new QuestBoard();
						qb.q0050(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0051")) {
						QuestBoard qb = new QuestBoard();
						qb.q0051(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0052")) {
						QuestBoard qb = new QuestBoard();
						qb.q0052(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0053")) {
						QuestBoard qb = new QuestBoard();
						qb.q0053(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0054")) {
						QuestBoard qb = new QuestBoard();
						qb.q0054(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0055")) {
						QuestBoard qb = new QuestBoard();
						qb.q0055(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0056")) {
						QuestBoard qb = new QuestBoard();
						qb.q0056(player, 0, true);
						
						//음식 아이템 주기
						ItemStack food = new ItemStack(Material.POTION);
						ItemMeta foodIm = food.getItemMeta();
						foodIm.setDisplayName(ChatColor.WHITE + "필립의 쌍화차");
						ArrayList<String> foodLore = new ArrayList<>();
						foodLore.add(ChatColor.GRAY + "장차 전설적인 인물이 될 필립이 직접 탄 쌍화차");
						foodLore.add(ChatColor.GRAY + "약재를 정성스럽게 뭉근히 달여 달달하고도");
						foodLore.add(ChatColor.GRAY + "기분 좋은 쌉쌀한 맛이 난다.");
						foodLore.add(ChatColor.GRAY + "건더기로 호두, 잣, 달걀이 들어갔으며");
						foodLore.add(ChatColor.GRAY + "달걀은 신선한 닭이 낳은 최고급 유정란만을");
						foodLore.add(ChatColor.GRAY + "사용한다고 알려져있다.");
						foodLore.add(ChatColor.GRAY + "이 쌍화차를 마시면 영양분 보충은 물론이고");
						foodLore.add(ChatColor.GRAY + "감기 예방과 기력 회복 등 무수한 효과가 나타난다.");
						foodIm.setLore(foodLore);
						foodIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
						foodIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
						foodIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
						PotionMeta pm = (PotionMeta) foodIm;
						pm.setColor(Color.fromRGB(60, 10, 10));
						foodIm = pm;
						food.setItemMeta(foodIm);
						player.getInventory().addItem(food);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0057")) {
						QuestBoard qb = new QuestBoard();
						qb.q0057(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0058")) {
						QuestBoard qb = new QuestBoard();
						qb.q0058(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0059")) {
						QuestBoard qb = new QuestBoard();
						qb.q0059(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0060")) {
						QuestBoard qb = new QuestBoard();
						qb.q0060(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0061")) {
						QuestBoard qb = new QuestBoard();
						qb.q0061(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0062")) {
						QuestBoard qb = new QuestBoard();
						qb.q0062(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0063")) {
						QuestBoard qb = new QuestBoard();
						qb.q0063(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0064")) {
						QuestBoard qb = new QuestBoard();
						qb.q0064(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0065")) {
						QuestBoard qb = new QuestBoard();
						qb.q0065(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0066")) {
						QuestBoard qb = new QuestBoard();
						qb.q0066(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0067")) {
						QuestBoard qb = new QuestBoard();
						qb.q0067(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0068")) {
						QuestBoard qb = new QuestBoard();
						qb.q0068(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0069")) {
						QuestBoard qb = new QuestBoard();
						qb.q0069(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0070")) {
						QuestBoard qb = new QuestBoard();
						qb.q0070(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0071")) {
						QuestBoard qb = new QuestBoard();
						qb.q0071(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0072")) {
						QuestBoard qb = new QuestBoard();
						qb.q0072(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0073")) {
						QuestBoard qb = new QuestBoard();
						qb.q0073(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0074")) {
						QuestBoard qb = new QuestBoard();
						qb.q0074(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0075")) {
						QuestBoard qb = new QuestBoard();
						qb.q0075(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0076")) {
						QuestBoard qb = new QuestBoard();
						qb.q0076(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0077")) {
						QuestBoard qb = new QuestBoard();
						qb.q0077(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0078")) {
						QuestBoard qb = new QuestBoard();
						qb.q0078(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0079")) {
						QuestBoard qb = new QuestBoard();
						qb.q0079(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0080")) {
						QuestBoard qb = new QuestBoard();
						qb.q0080(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0081")) {
						QuestBoard qb = new QuestBoard();
						qb.q0081(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0082")) {
						QuestBoard qb = new QuestBoard();
						qb.q0082(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0083")) {
						QuestBoard qb = new QuestBoard();
						qb.q0083(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 5과의 지시서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "아누로그나투스가 보내는 5과의 지시서");
						letterLore.add(ChatColor.GRAY + "6과가 해야할 의뢰가 적혀있다고 한다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0084")) {
						QuestBoard qb = new QuestBoard();
						qb.q0084(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 5과의 보고서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "아누로그나투스가 작성한 이번달 5과의 보고서");
						letterLore.add(ChatColor.GRAY + "3과에 전달해주기로 하였다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0085")) {
						QuestBoard qb = new QuestBoard();
						qb.q0085(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0086")) {
						QuestBoard qb = new QuestBoard();
						qb.q0086(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0087")) {
						QuestBoard qb = new QuestBoard();
						qb.q0087(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0088")) {
						QuestBoard qb = new QuestBoard();
						qb.q0088(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0089")) {
						QuestBoard qb = new QuestBoard();
						qb.q0089(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0090")) {
						QuestBoard qb = new QuestBoard();
						qb.q0090(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0091")) {
						QuestBoard qb = new QuestBoard();
						qb.q0091(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0092")) {
						QuestBoard qb = new QuestBoard();
						qb.q0092(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0093")) {
						QuestBoard qb = new QuestBoard();
						qb.q0093(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0094")) {
						QuestBoard qb = new QuestBoard();
						qb.q0094(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0095")) {
						QuestBoard qb = new QuestBoard();
						qb.q0095(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0096")) {
						QuestBoard qb = new QuestBoard();
						qb.q0096(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0097")) {
						QuestBoard qb = new QuestBoard();
						qb.q0097(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0098")) {
						QuestBoard qb = new QuestBoard();
						qb.q0098(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0099")) {
						QuestBoard qb = new QuestBoard();
						qb.q0099(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0100")) {
						QuestBoard qb = new QuestBoard();
						qb.q0100(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0101")) {
						QuestBoard qb = new QuestBoard();
						qb.q0101(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0102")) {
						QuestBoard qb = new QuestBoard();
						qb.q0102(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0103")) {
						QuestBoard qb = new QuestBoard();
						qb.q0103(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0104")) {
						QuestBoard qb = new QuestBoard();
						qb.q0104(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0105")) {
						QuestBoard qb = new QuestBoard();
						qb.q0105(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0106")) {
						QuestBoard qb = new QuestBoard();
						qb.q0106(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0107")) {
						QuestBoard qb = new QuestBoard();
						qb.q0107(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0108")) {
						QuestBoard qb = new QuestBoard();
						qb.q0108(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0109")) {
						QuestBoard qb = new QuestBoard();
						qb.q0109(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0110")) {
						QuestBoard qb = new QuestBoard();
						qb.q0110(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0111")) {
						QuestBoard qb = new QuestBoard();
						qb.q0111(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0112")) {
						QuestBoard qb = new QuestBoard();
						qb.q0112(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 3과의 보고서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "닉토사우루스가 작성한 이번달 3과의 보고서");
						letterLore.add(ChatColor.GRAY + "2과에 전달해주기로 하였다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0113")) {
						QuestBoard qb = new QuestBoard();
						qb.q0113(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 3과의 지시서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "닉토사우루스가 보내는 3과의 지시서");
						letterLore.add(ChatColor.GRAY + "5과가 해야할 의뢰가 적혀있다고 한다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0114")) {
						QuestBoard qb = new QuestBoard();
						qb.q0114(player, 0, true);
						
						//음식 아이템 주기
						ItemStack letter = new ItemStack(Material.BOOK);
						ItemMeta letterIm = letter.getItemMeta();
						letterIm.setDisplayName(ChatColor.WHITE + "츠바이 협회 3과의 지시서");
						ArrayList<String> letterLore = new ArrayList<>();
						letterLore.add(ChatColor.GRAY + "닉토사우루스가 보내는 3과의 지시서");
						letterLore.add(ChatColor.GRAY + "6과가 해야할 의뢰가 적혀있다고 한다.");
						letterIm.setLore(letterLore);
						letter.setItemMeta(letterIm);
						player.getInventory().addItem(letter);
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0115")) {
						QuestBoard qb = new QuestBoard();
						qb.q0115(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0116")) {
						QuestBoard qb = new QuestBoard();
						qb.q0116(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0117")) {
						QuestBoard qb = new QuestBoard();
						qb.q0117(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0118")) {
						QuestBoard qb = new QuestBoard();
						qb.q0118(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0119")) {
						QuestBoard qb = new QuestBoard();
						qb.q0119(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq9")) {
						QuestBoard qb = new QuestBoard();
						qb.uq9(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq8")) {
						QuestBoard qb = new QuestBoard();
						qb.uq8(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq7")) {
						QuestBoard qb = new QuestBoard();
						qb.uq7(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq6")) {
						QuestBoard qb = new QuestBoard();
						qb.uq6(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq5")) {
						QuestBoard qb = new QuestBoard();
						qb.uq5(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq4")) {
						QuestBoard qb = new QuestBoard();
						qb.uq4(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq3")) {
						QuestBoard qb = new QuestBoard();
						qb.uq3(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq2")) {
						QuestBoard qb = new QuestBoard();
						qb.uq2(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 3).equals("uq1")) {
						QuestBoard qb = new QuestBoard();
						qb.uq1(player, 0, true);
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else {
						player.sendMessage(ary[cnt]);
					}
					cnt++;
				} 
				
				if(len == cnt) {
					t.endTask();
					t.removeID();
				}

				time++;
				
			}						
			
		}, 0, 1);
	}
	
}
