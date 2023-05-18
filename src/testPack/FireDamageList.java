package testPack;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public class FireDamageList {

	private static HashMap<Entity, Double> map = new HashMap<>();
	
	public void putMap(Entity key, double value) {
		if(key instanceof Mob || key instanceof Player) {
			map.put(key, value);
		}
	}
	
	public void removeMap(Entity key) {
		map.remove(key);
	}
	
	public Double getMap(Entity key) {
		if(map.containsKey(key)) {
			return map.get(key);
		} else {
			return 0.1;
		}
	}
	
}
