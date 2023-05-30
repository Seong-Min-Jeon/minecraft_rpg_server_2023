package testPack;

import org.bukkit.entity.Player;

public class PlayerGrade {

	public int returnGrade(Player player) {
		try {
			String gradeTmp = player.getInventory().getItem(8).getItemMeta().getLore().get(1);
			return Integer.parseInt(gradeTmp.substring(6, 7));
		} catch(Exception e) {
			
		}
		try {
			String gradeTmp = player.getInventory().getItem(8).getItemMeta().getLore().get(1);
			if(gradeTmp.substring(6, 7).equals("특")) {
				return 0;
			}
		} catch(Exception e) {
			
		}
		return 9;
	}
	
}
