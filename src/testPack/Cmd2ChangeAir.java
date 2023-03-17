package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd2ChangeAir implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
			
		int r;
		int num;
		Random rnd = new Random();
		Material mat = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("ChangeAir")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "범위 /밀도/블럭명 을 입력해야죠;; 사용법도 모르십니까??");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("help")) {
						player.sendMessage(ChatColor.GREEN + "범위 /밀도/블럭명을 입력하세요(밀도는 5가 최대입니다.)");
						return true;
					}
					r = Integer.parseInt(args[0]);
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "아뉘 두번째는 정수를 넣어야지 이 사람아");
					return true;
				}
				try { 				
					num = Integer.parseInt(args[1]);
					if(num>5) {
						player.sendMessage(ChatColor.RED + "5이상은 욕심이 큽니다");
						return true;
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "밀도가 정수여야죠 아죠씨;;");
					return true;
				}
				try { 
					String name = args[2].toUpperCase();
					if(name.equalsIgnoreCase("yumehama")) {
						player.sendMessage(ChatColor.DARK_BLUE + "안녕 나를 소환하려는 거니?");
						player.sendMessage(ChatColor.DARK_BLUE + "내가 선물을 하나 줄께");
						player.sendMessage(ChatColor.DARK_BLUE + "사실 거짓말이야");
						return true;
					} else {						
						mat = Material.valueOf(name);
					}					
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "게임에 있는 이름을 써주시죠(예: orange_stained_glass_pane)");
					return true;
				}
				try {
					Location loc = player.getLocation();
				    for(int x = (r * -1); x <= r; x++) {
				        for(int y = (r * -1); y <= r; y++) {
				            for(int z = (r * -1); z <= r; z++) {
				                Block b = loc.getWorld().getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);		
				                int random = rnd.nextInt(100);
				                if(num>=random) {
				                	if(b.getType() == Material.AIR)
					                    b.setType(mat);
				                }
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
