package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd9SetBiome implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		int r;
		int num;
		Random rnd = new Random();
		Biome bio = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("setBiome")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "범위 /밀도/from블럭명/to블럭명 을 입력해야죠;; 사용법도 모르십니까??");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.GREEN + "범위 /밀도/from블럭명/to블럭명을 입력하세요(밀도 100을 선택하시면 범위에 해당하는 전역에 효과가 적용됩니다.)");
						return true;
					}
					r = Integer.parseInt(args[0]);
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "아뉘 두번째는 정수를 넣어야지 이 사람아");
					return true;
				}
				try { 
					String name = args[1].toUpperCase();
					if(name.equalsIgnoreCase("yumehama")) {
						player.sendMessage(ChatColor.AQUA + "안녕 나를 소환하려는 거니?");
						player.sendMessage(ChatColor.AQUA + "내가 선물을 하나 줄께");
						player.sendMessage(ChatColor.AQUA + "사실 거짓말이야");
						return true;
					} else {						
						bio = Biome.valueOf(name);
					}					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "from블럭명 오류: 게임에 있는 이름을 써주시죠(예: orange_stained_glass_pane)");
					return true;
				}
				try {
					Location loc = player.getLocation();
				    for(int x = (r * -1); x <= r; x++) {
				        for(int y = (r * -1); y <= r; y++) {
				            for(int z = (r * -1); z <= r; z++) {				                
				                loc.getWorld().setBiome(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z, bio);	
				            }
				        }
				    }
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "알 수 없는 오류");
					return true;
				}
			}
		}	
		return true;
	}

}
