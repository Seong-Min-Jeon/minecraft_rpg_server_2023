package testPack;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class ScrollUseEvent {
	
	static ArrayList<Player> lock = new ArrayList<>();

	public ScrollUseEvent(Player player, ItemStack item, File folder) {
		
		if(lock.contains(player)) {
			return;
		}
		
		TPScroll tp = new TPScroll();
		AnotherScroll as = new AnotherScroll();
		
		try {
			//이동
			tp.teleport(player, item);
			//기타 스크롤
			as.effect(player, item, folder);
		} catch(Exception e) {
			
		}
		
		lock.add(player);
		
		new BukkitRunnable() {
			int time = 0;
			@Override
			public void run() {
				time++;
				if (time >= 20) {
					try {
						lock.remove(player);
					} catch(Exception e) {
						
					}
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
}
