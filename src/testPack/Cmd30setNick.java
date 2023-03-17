package testPack;

import java.util.HashMap;

import xyz.haoshoku.nick.api.NickAPI;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd30setNick implements CommandExecutor {
	
	static HashMap<Player, Boolean> limitTime = new HashMap<>();
	static HashMap<Player, Player> tradeRel = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;

			if(!player.isOp()) {
				player.sendMessage("오피만 사용할 수 있는 명령어입니다.");
				return true;
			}
			
			if(cmd.getName().equalsIgnoreCase("setNick")) {
				if(args.length == 0) {
					return true;
				}
				try { 
					String name = args[0];
					Player target = Bukkit.getPlayer(name);
					String nick = args[1];
					
					if(nick.equalsIgnoreCase("null")) {
						NickAPI.resetNick(target);
						NickAPI.refreshPlayer(target);
					} else {
						NickAPI.nick(target, nick);
						NickAPI.refreshPlayer(target);
					}
					return true;
				} catch(Exception e) {
					return true;
				}
			}
		}	
		return true;
	}
	
}
