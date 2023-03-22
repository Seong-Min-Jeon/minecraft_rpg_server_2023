package testPack;

import org.bukkit.entity.Player;

public class PlayerGrade {

	public int returnGrade(Player player) {
		try {
			String gradeTmp = player.getInventory().getItem(8).getItemMeta().getLore().get(1);
			return Integer.parseInt(gradeTmp.substring(6, 7));
		} catch(Exception e) {
			
		}
		return 0;
	}
	
}
