package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class QuestOwner {

	private static Map<Location, Player> questOwner = new HashMap<>();
	
	public void put(Location loc, Player player) {
		questOwner.put(loc, player);
	}
	
	public void remove(Location loc) {
		questOwner.remove(loc);
	}
	
	public Player returnPlayer(Location loc) {
		return questOwner.get(loc);
	}
	
}
