package testPack;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
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
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 3.0f);
					} else if(ary[cnt].substring(0, 5).equals("q0006")) {
						QuestBoard qb = new QuestBoard();
						qb.q0006(player, 0, true);
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
