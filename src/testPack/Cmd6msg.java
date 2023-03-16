package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd6msg implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		String sentance = "";
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("msg")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.GREEN + "/msg 받는사람 문장");
					return true;
				}
				if(args[0].equalsIgnoreCase("help")) {
					player.sendMessage(ChatColor.GREEN + "/msg 받는사람 문장");
					return true;
				}
				for(int i = 1 ; i < args.length ; i++) {
					sentance += args[i] + " ";
				}
				int cnt = 0;
				for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					if(allPlayer.getDisplayName().equalsIgnoreCase(args[0])) {
						player.sendMessage(ChatColor.GREEN + player.getDisplayName() + ChatColor.LIGHT_PURPLE + ">>" + ChatColor.GREEN + allPlayer.getDisplayName() + " " + ChatColor.AQUA + sentance);
						allPlayer.sendMessage(ChatColor.GREEN + player.getDisplayName() + ChatColor.LIGHT_PURPLE + ">>" + ChatColor.GREEN + allPlayer.getDisplayName() + " " + ChatColor.AQUA + sentance);
						cnt++;
					}
				}
				if(cnt==0) {
					player.sendMessage(ChatColor.RED + "받는 사람의 이름을 확인해주세요.");
				}
			}
		}	
		return true;
	}

}
