package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;

public class MobDeath {
	
	Player player = null;
	Random rnd = new Random();

	public MobDeath() {
		
	}
	
	public MobDeath(Player playerArg, Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		this.player = playerArg;
		death(mob, damage);
	}

	public MobDeath(Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		death(mob, damage);
	}

	public void death(Entity mob, double damage) {
		Player lootPlayer;
		if (this.player == null) {
			if(((Mob) mob).getTarget() instanceof Player) {
				lootPlayer = (Player) (((Mob) mob).getTarget());				
			} else {
				lootPlayer = (Player) (((Mob) mob).getTarget());	
			}
		} else {
			lootPlayer = this.player;
		}
		
		MobLoot mobloot = new MobLoot(lootPlayer);
		
		if (((LivingEntity) mob).getHealth() - damage <= 0) {
			
			try {
				String name = mob.getCustomName();

				if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐")) {
					mobloot.rat(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "쥐 두목")) {
					mobloot.ratBoss(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 9급 해결사")) {
					mobloot.fixer9(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 8급 해결사")) {
					mobloot.fixer8(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 7급 해결사")) {
					mobloot.fixer7(lootPlayer);
				}
				
			} catch (Exception e) {

			}
		}
	}
}
