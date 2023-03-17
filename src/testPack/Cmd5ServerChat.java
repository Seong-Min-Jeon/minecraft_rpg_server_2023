package testPack;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd5ServerChat implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		String sentance = "";
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(!player.getDisplayName().equalsIgnoreCase("yumehama")) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("ServerChat")) {
				for(String str : args) {
					sentance += str + " ";
				}
				for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					allPlayer.sendMessage(sentance);
				}
			}
		}	
		return true;
	}

}
