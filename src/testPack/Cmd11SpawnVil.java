package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wolf;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.google.common.graph.ElementOrder.Type;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPC.FollowLookType;
import dev.sergiferry.playernpc.api.NPCLib;

public class Cmd11SpawnVil implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			Location loc = player.getLocation();
			
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("SpawnVil")) {
				if(args[0].equalsIgnoreCase("Villager")) {
					try { 
						Villager villager = (Villager) loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
						villager.setAgeLock(true);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setInvulnerable(true);
						villager.setCollidable(false);
						villager.setAI(false);
						villager.setVillagerType(Villager.Type.valueOf(args[1]));
						villager.setProfession(Villager.Profession.valueOf(args[2]));
						try {
							if(args[3].equalsIgnoreCase("1")) {
								villager.setBaby();
							}
						} catch(Exception e) {
							
						}
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("Player")) {
					try { 
						NPC npc = NPCLib.getInstance().generateNPC(player, "test", player.getLocation());
						npc.setSkin(player); 
						npc.setCollidable(false);
						npc.setFollowLookType(FollowLookType.PLAYER);
						npc.setCustomTabListName(" ");
						npc.setShowOnTabList(false);
						npc.create();
						npc.show();
						npc.update();
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("Wolf")) {
					try { 
						Wolf villager = (Wolf) loc.getWorld().spawnEntity(loc, EntityType.WOLF);
						villager.setAgeLock(true);
						((LivingEntity) villager).setMaxHealth(99999);
						((LivingEntity) villager).setHealth(99999);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setAI(false);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("pig")) {
					try { 
						Pig villager = (Pig) loc.getWorld().spawnEntity(loc, EntityType.PIG);
						villager.setAgeLock(true);
						((LivingEntity) villager).setMaxHealth(99999);
						((LivingEntity) villager).setHealth(99999);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setAI(false);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("chicken")) {
					try { 
						Chicken villager = (Chicken) loc.getWorld().spawnEntity(loc, EntityType.CHICKEN);
						villager.setAgeLock(true);
						((LivingEntity) villager).setMaxHealth(99999);
						((LivingEntity) villager).setHealth(99999);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setAI(false);
						villager.setBreed(false);
						villager.setSilent(true);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("cow")) {
					try { 
						Cow villager = (Cow) loc.getWorld().spawnEntity(loc, EntityType.COW);
						villager.setAgeLock(true);
						((LivingEntity) villager).setMaxHealth(99999);
						((LivingEntity) villager).setHealth(99999);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setAI(false);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("sheep")) {
					try { 
						Sheep villager = (Sheep) loc.getWorld().spawnEntity(loc, EntityType.SHEEP);
						villager.setAgeLock(true);
						((LivingEntity) villager).setMaxHealth(99999);
						((LivingEntity) villager).setHealth(99999);
						villager.setNoDamageTicks(Integer.MAX_VALUE);
						villager.setAI(false);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else if(args[0].equalsIgnoreCase("mush")) {
					try { 
						MushroomCow villager = (MushroomCow) loc.getWorld().spawnEntity(loc, EntityType.MUSHROOM_COW);
						((LivingEntity) villager).setMaxHealth(999999999);
						((LivingEntity) villager).setHealth(999999999);
						villager.setAI(false);
						villager.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 255));
						villager.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, Integer.MAX_VALUE));
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
						return true;
					}
				} else {
					player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
				}
				
				
			}
		}	
		return true;
	}
	
}
