package testPack;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class PairingMob {

	private static HashMap<Player, Entity> map = new HashMap<>();
	
	public void putMap(Player key, Entity value) {
		map.put(key, value);
	}
	
	public void removeMap(Player key) {
		map.remove(key);
	}
	
	public void removeMapFromValue(Entity val) {
		for(Player key : map.keySet()) {
			if(map.get(key) == val) {
				map.remove(key);
			}
		}
	}
	
	public Entity getMap(Player key) {
		if(map.containsKey(key)) {
			return map.get(key);
		} else {
			return null;
		}
	}
	
}
