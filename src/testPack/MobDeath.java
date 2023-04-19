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
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "갈고리 사무소 해결사")) {
					mobloot.galgori(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원")) {
					mobloot.ironman(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원")) {
					mobloot.dog(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원")) {
					mobloot.ggul(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원")) {
					mobloot.axe(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원")) {
					mobloot.meat(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎")) {
					mobloot.d1_1(lootPlayer);
				}
				
			} catch (Exception e) {

			}
		}
	}
}
