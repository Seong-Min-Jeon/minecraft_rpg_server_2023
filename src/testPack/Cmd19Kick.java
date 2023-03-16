package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd19Kick implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String num = "0";
			String name = "";
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("K")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "잘못된 입력");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("0")) {
						num = "0";
					}
				} catch(Exception e) {
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("1")) {
						num = "1";
					}
				} catch(Exception e) {
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("2")) {
						num = "2";
					}
				} catch(Exception e) {
					return true;
				}
				try { 				
					name = args[1];
					Player p = Bukkit.getPlayer(name);
					if(num.equals("0")) {
						p.kickPlayer("서버가 재시작되면서 게임에서 나가졌습니다.");
					} else if(num.equals("1")) {
						p.kickPlayer("점검 중입니다.");
					} else if(num.equals("2")) {
						p.kickPlayer("매크로 사용이 감지되었습니다. 현재 1회 경고를 받은 상태이며, 자세한 사항은 디스코드 공지를 확인하시길 바랍니다.");
					}
				} catch(Exception e) {
					return true;
				}
			}
		}	
		return true;
	}
	

}
