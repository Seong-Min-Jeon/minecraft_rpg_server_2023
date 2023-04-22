package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnAnimal {

	public void spawn(Entity animal) {
		try {
			LivingEntity entity = (LivingEntity) animal;				
			animal0(entity);
		} catch(Exception e) {
			
		}
	}
	
	public void animal0(LivingEntity entity) {
		Location loc = entity.getLocation();
				
		if(loc.getX() <= -884 && loc.getY() <= 255 && loc.getZ() <= 1599 && 
				loc.getX() >= -1309 && loc.getY() >= 0 && loc.getZ() >= 1074) {
			if (entity.getType() == (EntityType) EntityType.CHICKEN) {
				Chicken chick = (Chicken) entity;
				chick.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "닭도리");
				chick.setCustomNameVisible(true);
				chick.setMaxHealth(99999);
				chick.setHealth(99999);
				chick.setNoDamageTicks(Integer.MAX_VALUE);
				chick.setCollidable(false);
				chick.setAI(false);
				chick.setBreed(false);
				chick.setAgeLock(true);
				chick.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				chick.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
			}
		}
	}
	
}
