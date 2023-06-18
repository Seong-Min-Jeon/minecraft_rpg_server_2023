package testPack;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CharacterStack {

	private static Map<Player, Integer> stack = new HashMap<>();
	
	public void put(Player player, int num) {
		stack.put(player, num);
	}
	
	public void remove(Player player) {
		if(stack.containsKey(player)) {stack.remove(player);}
	}
	
	public Integer returnStack(Player player) {
		if(stack.containsKey(player)) {return stack.get(player);}
		else {return 0;}
	}
	
	public boolean containsKey(Player player) {
		if(stack.containsKey(player)) {return true;}
		else {return false;}
	}
	
}
