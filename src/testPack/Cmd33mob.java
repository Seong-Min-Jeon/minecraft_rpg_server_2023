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
						ItemStack weaponItem = new ItemStack(Material.BOW);
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
					
				} else if(num.equals("16")) {
					
				} else if(num.equals("17")) {
					
				} else if(num.equals("18")) {
					
				} else if(num.equals("19")) {
					
				} else if(num.equals("20")) {
					
				}
			}
			
		} catch(Exception e) {
			
		}
		
		return true;
	}
	

}
