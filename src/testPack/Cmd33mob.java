package testPack;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd33mob implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		try {
			if(cmd.getName().equalsIgnoreCase("mob")) {
				if(sender instanceof Player) {
					if(!sender.isOp()) {
						return true;
					}
				}
				
				String num = args[0];
				World world = Bukkit.getWorld("world");
				Player player = (Player) sender;
				Random rnd = new Random();
				
				if(num.equals("1")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 9급 해결사");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(30);
					entity.setHealth(30);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LOG);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(0);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(0,0,0));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(0,0,0));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(0,0,0));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
				} else if(num.equals("2")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 8급 해결사");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(50);
					entity.setHealth(50);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(1);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
				} else if(num.equals("3")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 7급 해결사");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(70);
					entity.setHealth(70);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.BIRCH_LOG);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(2);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
				} else if(num.equals("4")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
					entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "갈고리 사무소 해결사");
					entity.setCustomNameVisible(true);
					entity.setPersistent(true);
					entity.setRemoveWhenFarAway(false);
					entity.setMaxHealth(20);
					entity.setHealth(20);
					EntityEquipment weapon = entity.getEquipment();
					ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
					weapon.setItemInMainHand(weaponItem);
					EntityEquipment head = entity.getEquipment();
					ItemStack headItem = chest.getInventory().getItem(3);
					head.setHelmet(headItem);
					EntityEquipment chestplate = entity.getEquipment();
					ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
					LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
					chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					chestplateItem.setItemMeta(chestmeta);
					chestplate.setChestplate(chestplateItem);
					EntityEquipment leggings = entity.getEquipment();
					ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
					LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
					leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					leggingsItem.setItemMeta(leggingsmeta);
					leggings.setLeggings(leggingsItem);
					EntityEquipment boots = entity.getEquipment();
					ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
					LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
					bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
					bootsItem.setItemMeta(bootsmeta);
					boots.setBoots(bootsItem);
					entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
				} else if(num.equals("5")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(80);
						entity.setHealth(80);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(4);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(84,75,75));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(84,75,75));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(84,75,75));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("6")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(60);
						entity.setHealth(60);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(5);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(30,30,30));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(30,30,30));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(30,30,30));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("7")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(50);
						entity.setHealth(50);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(6);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(160,80,80));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(160,80,80));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(160,80,80));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
					}
				} else if(num.equals("8")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 4 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(30);
						entity.setHealth(30);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(7);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(100,100,20));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(100,100,20));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(100,100,20));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("9")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(60);
						entity.setHealth(60);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.BIRCH_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(8);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(200,200,200));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(200,200,200));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(200,200,200));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("10")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 간부");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(150);
						entity.setHealth(150);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(9);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(30,30,30));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(30,30,30));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(30,30,30));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
					}
				} else if(num.equals("11")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 카시라");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(120);
						entity.setHealth(120);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(10);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(0,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(0,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("12")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 전투원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(190);
						entity.setHealth(190);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment sub = entity.getEquipment();
						ItemStack subItem = new ItemStack(Material.STONE_BRICK_SLAB);
						sub.setItemInOffHand(subItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(11);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(0,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(0,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("13")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 간부");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(180);
						entity.setHealth(180);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(12);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,232,188));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(160,220,160));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(90,150,90));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("14")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 간부");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(130);
						entity.setHealth(130);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(13);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,150,150));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,150,150));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,150,150));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("15")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(90);
						entity.setHealth(90);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(14);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(30,30,30));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(30,30,30));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(30,30,30));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
					}
				} else if(num.equals("16")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 와카슈");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(75);
						entity.setHealth(75);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(15);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(0,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(0,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("17")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 재단사");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(110);
						entity.setHealth(110);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment sub = entity.getEquipment();
						ItemStack subItem = new ItemStack(Material.STONE_BRICK_SLAB);
						sub.setItemInOffHand(subItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(16);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(0,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(0,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("18")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(100);
						entity.setHealth(100);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.AIR);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(17);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,232,188));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(160,220,160));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(90,150,90));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("19")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(90);
						entity.setHealth(90);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(18);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,150,150));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,150,150));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,150,150));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("20")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "엄지 솔다토");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(160);
						entity.setHealth(160);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.BRAIN_CORAL_BLOCK);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(19);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(150,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 4, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("21")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "검지 수행자");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(140);
						entity.setHealth(140);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(20);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,255,255));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,255,255));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,255,255));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("22")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "웃는 얼굴들");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(180);
						entity.setHealth(180);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(21);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(50,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(50,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(20,20,20));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6, false, false));
					}
				} else if(num.equals("23")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(150);
						entity.setHealth(150);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OBSIDIAN);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment sub = entity.getEquipment();
						ItemStack subItem = new ItemStack(Material.OBSIDIAN);
						sub.setItemInOffHand(subItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(22);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(150,75,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 5, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("24")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "규율을 따르는 엄지 솔다토");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(300);
						entity.setHealth(300);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.BRAIN_CORAL_BLOCK);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(23);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(150,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 6, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("25")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "신념이 강한 검지 수행자");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(250);
						entity.setHealth(250);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(24);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,255,255));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,255,255));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,255,255));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("26")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "연기에 중독된 웃는 얼굴들");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(320);
						entity.setHealth(320);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(25);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(50,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(50,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(20,20,20));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8, false, false));
					}
				} else if(num.equals("27")) {
					Location chestLoc = new Location(world, -1147, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 간부");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(280);
						entity.setHealth(280);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OBSIDIAN);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment sub = entity.getEquipment();
						ItemStack subItem = new ItemStack(Material.OBSIDIAN);
						sub.setItemInOffHand(subItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(26);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(150,75,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 7, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
					}
				} else if(num.equals("28")) {
					Location chestLoc = new Location(world, -1149, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "엄지 카포");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(400);
						entity.setHealth(400);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.FIRE_CORAL_BLOCK);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(0);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(150,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("29")) {
					Location chestLoc = new Location(world, -1149, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검지 대행자");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(380);
						entity.setHealth(380);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.SPRUCE_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(1);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,255,255));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,255,255));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,255,255));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 12, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, false, false));
					}
					
					for(int i = 0 ; i < 1 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검지 전령");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(250);
						entity.setHealth(250);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.BIRCH_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(2);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(255,255,255));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(255,255,255));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(255,255,255));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 8, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("30")) {
					Location chestLoc = new Location(world, -1149, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "콩콩이파 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(350);
						entity.setHealth(350);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(3);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(80,80,250));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(10,10,10));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 12, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("31")) {
					Location chestLoc = new Location(world, -1149, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 2 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검계 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(420);
						entity.setHealth(420);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(4);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(50,50,50));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(50,50,50));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(50,50,50));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 10, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2, false, false));
					}
				} else if(num.equals("32")) {
					Location chestLoc = new Location(world, -1149, 166, 1467);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					
					for(int i = 0 ; i < 3 ; i++) {
						Zombie entity = (Zombie) player.getWorld().spawnEntity(player.getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "밤의 송곳 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(400);
						entity.setHealth(400);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.SPRUCE_SLAB);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(5);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(250,250,250));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(20,20,20));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(10,10,10));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 9, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1, false, false));
					}
				} else if(num.equals("33")) {
					
				} else if(num.equals("34")) {
					
				} else if(num.equals("35")) {
					
				} else if(num.equals("36")) {
					
				} else if(num.equals("37")) {
					
				} else if(num.equals("38")) {
					
				}
			}
			
		} catch(Exception e) {
			
		}
		
		return true;
	}
	

}
