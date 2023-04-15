package testPack;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class QuestOwner {

	private static Map<Player, Entity> questOwner = new HashMap<>();
	
	public void put(Player player, Entity ent) {
		questOwner.put(player, ent);
	}
	
	public void remove(Player player) {
		if(questOwner.containsKey(player)) {questOwner.remove(player);}
	}
	
	public Entity returnEntity(Player player) {
		if(questOwner.containsKey(player)) {return questOwner.get(player);}
		else {return null;}
	}
	
}
