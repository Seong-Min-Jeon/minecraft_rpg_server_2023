package testPack;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SpawnAnimal {

	public boolean spawn(Entity animal) {
		LivingEntity entity = (LivingEntity) animal;				
		if(animal0(entity)) {
			return true;
		} 
		return false;
	}
	
	public boolean animal0(LivingEntity entity) {
		//튜토 돼지 3939 171 3949  3921 163 3921
		if(entity.getLocation().getX()<=3939 && entity.getLocation().getY()<=171 && entity.getLocation().getZ()<=3949
				&& entity.getLocation().getX()>=3921 && entity.getLocation().getY()>=163 && entity.getLocation().getZ()>=3921) {
			if (entity.getType() == (EntityType) EntityType.PIG) {
				entity.setCustomName(ChatColor.GREEN + "돼지");
				entity.setCustomNameVisible(true);
				((LivingEntity) entity).setMaxHealth(99999);
				((LivingEntity) entity).setHealth(99999);
				entity.setNoDamageTicks(Integer.MAX_VALUE);
				entity.setCollidable(false);
				entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 32700));
				return true;
			} else if(entity.getType() == (EntityType) EntityType.IRON_GOLEM || entity.getType() == (EntityType) EntityType.SALMON) {
				return true;
			} else {
				return false;
			}
		}
		return true;
	}
	
}
