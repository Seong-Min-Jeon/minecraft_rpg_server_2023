package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.SkeletonHorse;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.datafixers.util.Pair;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;
import dev.sergiferry.playernpc.api.NPC.GazeTrackingType;
import dev.sergiferry.playernpc.api.NPC.Slot;

public class NPCManager {

	QuestBoard qb = new QuestBoard();
	
	public NPCManager(Player player) {
		questNPC(player);
	}
	
	public NPCManager(Player player, int num) {
		//allTime(player);
	}
	
	public NPC npc1(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), -2503, 53, 531, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "ice1", loc);
		String[] name = getSkin("_Shirayuki");
		npc.setText("의문의 소녀");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC npc9(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 973.5, 64, 42.5, 0, 0);
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "why", loc);
		String[] name = getSkin("why9196");
		npc.setText("에일을 구한 영웅");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.HELMET, new ItemStack(Material.NETHERITE_HELMET));
		npc.setItem(Slot.CHESTPLATE, new ItemStack(Material.NETHERITE_CHESTPLATE));
		npc.setItem(Slot.LEGGINGS, new ItemStack(Material.NETHERITE_LEGGINGS));
		npc.setItem(Slot.BOOTS, new ItemStack(Material.NETHERITE_BOOTS));
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.JUNGLE_LOG));
		npc.show();
		npc.update();
		
		return npc;
	}
	
	public void questNPC(Player player) {
		try {
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
				npc1(player);
	 		}
			if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
				npc1(player);
	 		}
		} catch(Exception e) {
			
		}
	}
	
	public void defineQuest(Player player, String str) {
		if(str.equals("설원의 가희 의문의 소녀")) {
			npc1(player);
		}
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
