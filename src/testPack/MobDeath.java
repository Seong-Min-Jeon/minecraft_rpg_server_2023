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
				String name = mob.getCustomName().substring(2);

				// 공격을 모르는 스켈이
				if (name.equalsIgnoreCase("공격을 모르는 스켈이" + ChatColor.YELLOW + " [Lv.0]")) {
					mobloot.mob2(lootPlayer);
				}
				
			} catch (Exception e) {

			}
		}
	}
}
