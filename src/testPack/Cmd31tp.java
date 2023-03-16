package testPack;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd31tp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if(sender instanceof Player) {
			Player player = (Player) sender;

			if(!player.isOp()) {
				player.sendMessage("오피만 사용할 수 있는 명령어입니다.");
				return true;
			}
			
			if(cmd.getName().equalsIgnoreCase("t")) {
				if(args.length == 0) {
					return true;
				}
				try { 
					String name = args[0];
					String name2 = null;
					
					try {
						name2 = args[1];
					} catch(Exception e) {
						name2 = "";
					}
					
					if(name2 == "") {
						for(Player p : Bukkit.getOnlinePlayers()) {
							if(p.getDisplayName().equals(name)) {
								player.teleport(p);
							}
						}
					} else {
						Player p1 = null;
						Player p2 = null;
						for(Player p : Bukkit.getOnlinePlayers()) {
							if(p.getDisplayName().equals(name)) {
								p1 = p;
							}
							if(p.getDisplayName().equals(name2)) {
								p2 = p;
							}
						}
						
						if(p1 != null && p2 !=null) {
							p1.teleport(p2);
						}
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
