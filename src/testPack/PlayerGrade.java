package testPack;

import org.bukkit.entity.Player;

public class PlayerGrade {

	public String returnGrade(Player player) {
		try {
			String gradeTmp = player.getInventory().getItem(8).getItemMeta().getLore().get(1);
			return gradeTmp.substring(9, 10);
		} catch(Exception e) {
			
		}
		return null;
	}
	
}
