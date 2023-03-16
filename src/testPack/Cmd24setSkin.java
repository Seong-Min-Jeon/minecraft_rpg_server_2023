package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import xyz.haoshoku.nick.api.NickAPI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Cmd24setSkin implements CommandExecutor {
	
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
			
			if(cmd.getName().equalsIgnoreCase("setSkin")) {
				if(args.length == 0) {
					return true;
				}
				try { 
					String name = args[0];
					Player target = Bukkit.getPlayer(name);
					String skin = args[1];
					
					if(skin.equalsIgnoreCase("null")) {
						NickAPI.resetSkin(target);
						NickAPI.refreshPlayer(target);
					} else {
						String[] n = getSkin(skin);
						NickAPI.setSkin(target, n[0], n[1]);
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

	private String[] getSkin(String name) {
		try {
			URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();
			
			URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
			InputStreamReader reader2 = new InputStreamReader(url2.openStream());
			JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties")
					.getAsJsonArray().get(0).getAsJsonObject();
			String texture = property.get("value").getAsString();
			String signature = property.get("signature").getAsString();
			return new String[] {texture, signature};
		} catch(Exception e) {
//			EntityPlayer p = ((CraftPlayer) player).getHandle();
//			GameProfile profile = p.getProfile();
//			Property property = profile.getProperties().get("texture").iterator().next();
//			String texture = property.getValue();
//			String signature = property.getSignature();
//			return new String[] {texture, signature};
			return null;
		}
		
	}
	
}
