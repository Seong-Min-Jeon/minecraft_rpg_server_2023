package testPack;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ChangeOffice {

	public ChangeOffice(Player player, String officeName) {
		player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
		player.getInventory().remove(Material.PAPER);
		
		ItemStack license = player.getInventory().getItem(7);
		ItemMeta licenseMeta = license.getItemMeta();
		licenseMeta.getLore().set(2, ChatColor.GRAY + officeName.substring(2, officeName.length()));
	}
	
}
