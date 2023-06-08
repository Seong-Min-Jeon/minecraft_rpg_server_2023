package testPack;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class Cmd34teleportCompleter implements TabCompleter {
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("teleport") || cmd.getName().equalsIgnoreCase("t")){
			List<String> list = new ArrayList<>();
			if(args.length == 1) {
				list.add("<number>");
	            list.add("add");
	            list.add("remove");
	            list.add("list");
	            list.add("help");
			} else if(args.length == 2 && args[0].equalsIgnoreCase("add")) {
				list.add("<number>");
			} else if(args.length == 2 && args[0].equalsIgnoreCase("remove")) {
				list.add("<number>");
			} else if(args.length == 3 && args[0].equalsIgnoreCase("add")) {
				list.add("<name>");
			}
			return list;
        }
		return null;
	}

	
}
