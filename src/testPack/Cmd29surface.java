package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.ShulkerBullet;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Team;
import org.bukkit.util.Vector;

public class Cmd29surface implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		try {
			if(sender instanceof Player) {
				if(!sender.isOp()) {
					return true;
				}
				
				Material first = null;
				
				try {
					first = Material.valueOf(args[0].toUpperCase());
					new Surface().setMat((Player) sender, first);
					((Player) sender).sendMessage(ChatColor.WHITE + "" + first + " 설정 완료");
				} catch(Exception e) {
					
				}
				
			}
		} catch(Exception e) {
			
		}
		
		return true;
	}

}
