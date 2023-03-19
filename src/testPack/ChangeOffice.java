package testPack;

import java.util.ArrayList;

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
		
		ItemStack license = player.getInventory().getItem(8);
		ItemMeta licenseMeta = license.getItemMeta();
		ArrayList<String> lore = (ArrayList<String>) licenseMeta.getLore();
		lore.set(2, ChatColor.GRAY + "소속: " + officeName.substring(2, officeName.length()));
		licenseMeta.setLore(lore);
		license.setItemMeta(licenseMeta);
	}
	
}
