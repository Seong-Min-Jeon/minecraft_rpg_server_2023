package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;
import net.md_5.bungee.api.ChatColor;

public class ChangeOffice {

	public ChangeOffice(Player player, String officeName) {
		player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);
		player.getInventory().remove(Material.PAPER);
		player.getEnderChest().remove(Material.PAPER);
		
		String office = officeName.substring(2, officeName.length());
		
		ItemStack license = player.getInventory().getItem(8);
		ItemMeta licenseMeta = license.getItemMeta();
		ArrayList<String> lore = (ArrayList<String>) licenseMeta.getLore();
		lore.set(2, ChatColor.GRAY + "소속: " + office);
		licenseMeta.setLore(lore);
		license.setItemMeta(licenseMeta);
		
		player.sendMessage(ChatColor.GOLD + "[System] " + office + "에 가입되었습니다.");
		
		if(office.equals("윤 사무소")) {
			player.sendMessage(ChatColor.GOLD + "[System] -1177, 67, 1177 좌표로 향해봅시다.");
		} else if(office.equals("갈고리 사무소")) {
			player.sendMessage(ChatColor.GOLD + "[System] -1049, 62, 1130 좌표로 향해봅시다.");
		} else if(office.equals("가로등 사무소")) {
			player.sendMessage(ChatColor.GOLD + "[System] -1214, 67, 1304 좌표로 향해봅시다.");
		}
		
		//퀘스트 초기화
		player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());

		for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
			n.update();
			n.forceUpdate();
		}
	}
	
}
