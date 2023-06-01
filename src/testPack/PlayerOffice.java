package testPack;

import org.bukkit.entity.Player;

public class PlayerOffice {

	public String returnOffice(Player player) {
		try {
			String name = player.getInventory().getItem(7).getItemMeta().getDisplayName().substring(2);
			return name;
		} catch(Exception e) {
			
		}
		
		return "";
	}
	
}
