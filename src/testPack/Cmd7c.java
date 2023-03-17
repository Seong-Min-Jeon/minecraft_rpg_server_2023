package testPack;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd7c implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		for (Player allPlayer : Bukkit.getOnlinePlayers()) {
			if(allPlayer.isOp() == true) {
				allPlayer.setGameMode(GameMode.CREATIVE);
			}
		}
		return true;
	}

}
