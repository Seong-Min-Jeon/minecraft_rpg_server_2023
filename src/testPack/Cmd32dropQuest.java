package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Cmd32dropQuest implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			//퀘스트 제거
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			try {
				ItemStack item = player.getInventory().getItem(8);
				ItemMeta itemIM = item.getItemMeta();
				ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
				String grade = ary.get(1).split("\\[")[0];
				String exp = ary.get(1).split("\\[")[1].split("/")[0];
				String maxExp = ary.get(1).split("\\]")[0].split("/")[1];
				int newExp = Integer.parseInt(exp) - (Integer.parseInt(maxExp) / 10);
				//if (newExp < 0) {newExp = 0;}
				ary.set(1, ChatColor.GRAY + grade + "[" + String.valueOf(newExp) + "/" + maxExp + "]");
				itemIM.setLore(ary);
				item.setItemMeta(itemIM);
				player.getInventory().setItem(8, item);
				
				player.sendMessage(ChatColor.RED + "해결사 평판이 감소했다.");
				player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
			} catch(Exception e) {
				
			}
			
			//퀘스트 엔티티 제거
			try {
				QuestOwner qo = new QuestOwner();
				if(qo.returnEntity(player) != null) {
					qo.returnEntity(player).remove();
					qo.remove(player);
				}
			} catch(Exception e) {
				
			}
		}	
		return true;
	}

}
