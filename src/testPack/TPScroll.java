package testPack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TPScroll {
	
	private int taskID;
	
	public void teleport(Player player, ItemStack itemArg) {
		World world = player.getWorld();
		ticket1(player, itemArg, world);
		ticket2(player, itemArg, world);
		ticket3(player, itemArg, world);
		ticket4(player, itemArg, world);
		ticket5(player, itemArg, world);
		ticket6(player, itemArg, world);
		ticket7(player, itemArg, world);
	}

	public void ticket1(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "나태의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 119.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 119.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket2(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "분노의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 140.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 140.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket3(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "색욕의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 161.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 161.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket4(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "탐식의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 182.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 182.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket5(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "우울의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 203.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 203.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket6(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "질투의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 224.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 224.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
	public void ticket7(Player player, ItemStack itemArg, World world) {
		Location loc = player.getLocation();
		ItemStack ticket = itemArg.clone();
		ticket.setAmount(1);
		
		if (loc.getX() <= -1145 && loc.getY() <= 90 && loc.getZ() <= 1389 && 
				loc.getX() >= -1165 && loc.getY() >= 75 && loc.getZ() >= 1364) {
			if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "오만의 유적행 열차 티켓")) {
				itemArg.setAmount(itemArg.getAmount()-1);
				Location loc2 = new Location(world, 3729.5, 245.1, 3780.5);
				Location loc3 = new Location(world, 3703.5, 245.1, 3780.5);
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadShip td = new ThreadShip(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							td.endTask();
							td.removeID();
						}
						
						if (time == 0) {
							player.teleport(loc2);
							player.playSound(player.getLocation(), Sound.ENTITY_SNIFFER_HURT, 1.0f, 1.0f);
						}
						
						if (time == 800) {
							for(int i = 0 ; i < 5 ; i++) {
								Zombie entity = (Zombie) player.getWorld().spawnEntity(loc3, EntityType.ZOMBIE);
								entity.setCustomName(ChatColor.WHITE + "" + ChatColor.BOLD + "고통스러운 승객");
								entity.setCustomNameVisible(true);
								entity.setRemoveWhenFarAway(true);
								entity.setMaxHealth(30);
								entity.setHealth(30);
								EntityEquipment weapon = entity.getEquipment();
								ItemStack weaponItem = new ItemStack(Material.AIR);
								weapon.setItemInMainHand(weaponItem);
								EntityEquipment head = entity.getEquipment();
								ItemStack headItem = new ItemStack(Material.AIR);
								head.setHelmet(headItem);
								EntityEquipment chestplate = entity.getEquipment();
								ItemStack chestplateItem = new ItemStack(Material.AIR);
								chestplate.setChestplate(chestplateItem);
								EntityEquipment leggings = entity.getEquipment();
								ItemStack leggingsItem = new ItemStack(Material.AIR);
								leggings.setLeggings(leggingsItem);
								EntityEquipment boots = entity.getEquipment();
								ItemStack bootsItem = new ItemStack(Material.AIR);
								boots.setBoots(bootsItem);
							}
						}

						if (time >= 12000) {
							player.teleport(new Location(world, -1144.5, 81, 1341.5));
							player.getInventory().addItem(ticket);
							td.endTask();
							td.removeID();
							return;
						}

						time++;
					}

				}, 0, 1);
			}
		}
	}
	
}
