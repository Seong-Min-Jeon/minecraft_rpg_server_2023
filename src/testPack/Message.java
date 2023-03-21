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
						qb.q0001(player, 0);
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
