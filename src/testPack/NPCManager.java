package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPC.GazeTrackingType;
import dev.sergiferry.playernpc.api.NPC.Slot;
import dev.sergiferry.playernpc.api.NPCLib;

public class NPCManager {

	QuestBoard qb = new QuestBoard();
	
	public NPCManager() {
		yoon();
		pin();
	}
	
	public NPC yoon() {
		Location loc = new Location(Bukkit.getWorld("world"), -1176.5, 67, 1177.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yoon", loc);
		npc.setText("윤");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTIyNTgxMjc0MCwKICAicHJvZmlsZUlkIiA6ICI0YmMzNDZlMmQ3OWU0NDYzYjlhYzlhZGVmYTdlNWQ3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJieGNrZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWIwNDg2YmQwMmMyYjIyZWMzYWU5N2I2MjBjNTgyMzc1NGYyMjYyY2QxMDY4YWM3MWI4MzIyNDI0ZjdkMTJjOSIKICAgIH0KICB9Cn0="
				, "cG2JgN9nIoZOzvXZ0qt4yW421AkOq/GMIXEoCFROy77JYVEvOJz8dlWPPzghPZ3RZJvq69PB9lr+1+ftCj7eJ5ZpHwH05AJogCF5nPKX/euASeIrhOkmNgR3dIHotDUSHgfWnADCUGeRqAG1mrjxvpGKIzzRyOv87/3l02Z5kFD9XTlfabBMAwESIyFEtK0znaLz8fRSkZd7m/s49b+fbcdolMBrCta/IAKJ+g3xSC9jA7SX0qluSWgpsb9C59xhoLu8UUlwWYer+7Hq6dJVqvbHiDFSZdNqjqHyT7n/5t3QNiv/OW+d0mIMqLhzZ/Udaid3PfVlPWp6i08aYYN2ev54kgV/zdDT06GiJaWiizYp1N4TYF2Skcp3tOuKhTggrhWhh9MTAi7m/Sylo6VRpauNyV+7s9+UiaTEJIjLzoa5aY9D14Qi5mn/k/Acp+6Q5rJtAAb5s0TsEwyFlI+BRaR3suOu+Y0tCECDNFve8KxwPl4xuhBnMYCSxMeX0BWnolNWUnLab2YlV7YAs/dfzLHk3A1qlVF2xBsG5lHm7TCZZzBmNXZBo8TqZx2MFZZZITAyg88GgieFw0pA5K/jRSumb+JYb2cA2FC+unLrrwWmrr7R1IHDNV12G/El53fhi10anI5C2eHS9DsLy2fGKFVqBYGdVcrgm6ddhBAZMq8=");
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC pin() {
		Location loc = new Location(Bukkit.getWorld("world"), -1175.5, 62, 1181.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "pin", loc);
		npc.setText("핀");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTIyNjI1NDkzOCwKICAicHJvZmlsZUlkIiA6ICIxZDZmNDU4NDFmM2Q0ZjAwYTM0MTBiMDdmNDMxY2Y4MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJzMGRhYV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGJkYzUxMTRkY2NmMDFlNDViN2VmYThhMjg4MWIxNjkxNmI4ZTJjNDc3OGE1NWFmODVhYzFhOTI0MmViNDIwNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "MrptjTefCQOOO25FcogZI9jeysUBOwFMK93V/M7Kqyi5RWgNPVAM6bUD/9yes0Slm9gFiZ2X2WSxWlerOIy0fyrxRK9vzn4Xq8b5e3Ble6FgGTq7PObEfhjTPnNF9D4VSnTUIO3XKOoJKqyjG3yiUgfHz36gTXJzCr4KGjheZIErQoImHFFZD7Fa/3nwS2sauhW00Vvo9rOhtq1xWJWk8dVtwxFfeDCdvOxQ5pZytDqC9k+sGWCrG347RjftzVW12rnXNaPxfYVAoeGEp77NqrQXcEigxgHaY3zr2egtxZ0R25QRt5DdzBeV0fXzYwNeYgBURoBKXo/hbGW+TIWe6KNzYek50f2zBx4z350f/FEeEtJ3Qk8XqXUgIuD2rZcGWxMn9j3vxNquoKPyJmviCd/PzNuEAYAC2P91tp9qTcuHTvAek8Z7I74l4459SikmZN6I7hWvJNYRIMG61A8qP1OOkqOna2Tyz9uHjdDZZx125NQ/xgTEgS/aGdW4+1gp9D8SOt8mTZSob3zs4ibl8jOqzQl3OwEqFHNDk6pDGq+zrwOmwT0XXfIeSx7Z00MVUTfq2VEwjN1bquVfxrxupGwdJMWEIdJG/9TtPQYoIOvyfWh8nhpJxMWlj9c8W2MLf80R5MNPoXfhr1Ym9fbVblQQn3k0OhJBjLiSjdK5Li0=");
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC npc1() {
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
