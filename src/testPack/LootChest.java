package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;

import de.Herbystar.TTA.TTA_Methods;

public class LootChest {
	
	Random rnd = new Random();

	public void open(Player player, Block block) {
		if(block.getType() == Material.WHITE_GLAZED_TERRACOTTA) {
			if(block.getX()==3470 && block.getY()==54 && block.getZ()==3751){
				if(removeKey(player, "나태의 열쇠")) {
					dungeon1(player);
				}				
			}
			if(block.getX()==3329 && block.getY()==14 && block.getZ()==3782) {
				if(removeKey(player, "분노의 열쇠")) {
					dungeon2(player);
				}
			}
			if(block.getX()==709 && block.getY()==59 && block.getZ()==589) {
				if(removeKey(player, "색욕의 열쇠")) {
					dungeon3(player);
				}				
			}
			if(block.getX()==3770 && block.getY()==135 && block.getZ()==2550) {
				if(removeKey(player, "탐식의 열쇠")) {
					dungeon4(player);
				}				
			}
			if(block.getX()==3825 && block.getY()==135 && block.getZ()==4018) {
				if(removeKey(player, "우울의 열쇠")) {
					dungeon5(player);
				}				
			}
			
		}
	}
	
	public void dungeon1(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "나태의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 10%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "나태의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 10%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "나태의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 10%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "나태의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 10%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "나태의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 5%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "나태의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "나태를 벌하는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 10%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon2(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "분노의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 20%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "분노의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 15%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "분노의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 20%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "분노의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 20%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "분노의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 10%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "분노의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "분노를 꿈꾸는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 20%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon3(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "색욕의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 30%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "색욕의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 20%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "색욕의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 30%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "색욕의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 30%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "색욕의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 15%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "색욕의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "색욕을 감추는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 30%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon4(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "탐식의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 40%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "탐식의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 25%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "탐식의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 40%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "탐식의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 40%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "탐식의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 20%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "탐식의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "탐식을 꾀하는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 40%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon5(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "우울의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 50%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "우울의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 30%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "우울의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 50%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "우울의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 50%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "우울의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 25%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "우울의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "우울을 비추는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 50%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon6(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "질투의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 60%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "질투의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 35%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "질투의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 60%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "질투의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 60%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "질투의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 30%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "질투의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "질투를 부르는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 60%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public void dungeon7(Player player) {
		
		ItemStack var1 = new ItemStack(Material.SMOOTH_RED_SANDSTONE_STAIRS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.GOLD + "오만의 내공 반지");
		var1Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var1Lore.add(ChatColor.GRAY + "황금빛이 띄고 있다.");
		var1Lore.add(ChatColor.GRAY + "");
		var1Lore.add(ChatColor.GRAY + "-특수데미지 경감 70%");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_GRANITE_STAIRS);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setDisplayName(ChatColor.GOLD + "오만의 신속 반지");
		var2Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var2Lore.add(ChatColor.GRAY + "하늘색 보석이 돋보인다.");
		var2Lore.add(ChatColor.GRAY + "");
		var2Lore.add(ChatColor.GRAY + "-회피 확률 40%");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.POLISHED_DIORITE_STAIRS);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setDisplayName(ChatColor.GOLD + "오만의 생명 반지");
		var3Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var3Lore.add(ChatColor.GRAY + "무지개빛으로 빛나고 있다.");
		var3Lore.add(ChatColor.GRAY + "");
		var3Lore.add(ChatColor.GRAY + "-부활 확률 70%");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.MOSSY_COBBLESTONE_STAIRS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setDisplayName(ChatColor.GOLD + "오만의 기량 반지");
		var4Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var4Lore.add(ChatColor.GRAY + "알 수 없는 힘이 느껴진다.");
		var4Lore.add(ChatColor.GRAY + "");
		var4Lore.add(ChatColor.GRAY + "-피해량 증가 70%");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.END_STONE_BRICK_STAIRS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setDisplayName(ChatColor.GOLD + "오만의 보호 반지");
		var5Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var5Lore.add(ChatColor.GRAY + "푸른 빛의 파도가 느껴진다.");
		var5Lore.add(ChatColor.GRAY + "");
		var5Lore.add(ChatColor.GRAY + "-데미지 경감 35%");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.GOLD + "오만의 신비 반지");
		var6Im.setLocalizedName(String.valueOf(rnd.nextInt(2000000000)));
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "오만을 행하는 유적에서 찾은 유물");
		var6Lore.add(ChatColor.GRAY + "어두운 힘이 느껴진다.");
		var6Lore.add(ChatColor.GRAY + "");
		var6Lore.add(ChatColor.GRAY + "-크리티컬 확률 증가 70%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		int num = rnd.nextInt(6);
		if(num == 0) {
			player.getInventory().addItem(var1);
		} else if(num == 1) {
			player.getInventory().addItem(var2);
		} else if(num == 2) {
			player.getInventory().addItem(var3);
		} else if(num == 3) {
			player.getInventory().addItem(var4);
		} else if(num == 4) {
			player.getInventory().addItem(var5);
		} else if(num == 5) {
			player.getInventory().addItem(var6);
		} else {
			player.getInventory().addItem(var1);
		}
		
		TTA_Methods.sendTitle(player, null, 20, 40, 20, "열쇠를 사용하여 유물을 얻었다.", 20, 40, 20);
		
	}
	
	public boolean removeKey(Player player, String str) {
		try {
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getItemMeta().getDisplayName().equals(ChatColor.GOLD + str)) {
					is.setAmount(is.getAmount()-1);
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.0f, 1.0f);
					return true;
				}
			}
		} catch(Exception e) {
			
		}
		return false;		
	}

	public ItemStack setStat(int num, ItemStack item, int lvl) {
		ItemMeta im = item.getItemMeta();
		if(num == 0) {
			im.setDisplayName(ChatColor.YELLOW + "의문의 상자");
		} else if(num == 1) {
			im.setDisplayName(ChatColor.LIGHT_PURPLE + "의문의 상자");
		} else if(num == 2) {
			im.setDisplayName(ChatColor.AQUA + "의문의 상자");
		} else if(num == 3) {
			im.setDisplayName(ChatColor.DARK_RED + "의문의 상자");
		} else if(num == 4) {
			im.setDisplayName(ChatColor.DARK_PURPLE + "의문의 상자");
		} else if(num == 5) {
			im.setDisplayName(ChatColor.DARK_GREEN + "의문의 상자");
		}
		
		int minLvl = ((int)(lvl/10)) * 10;
		int maxLvl = minLvl + 10;
		
		ArrayList<String> lore = new ArrayList();
		if(num == 5) {
			lore.add(ChatColor.GRAY + "신비한 힘으로 굳게 닫힌 상자");
			lore.add(ChatColor.GRAY + "요정의 테이블에서 열 수 있을 것 같다.");
		} else {
			lore.add(ChatColor.GRAY + "레벨 범위: " + ChatColor.WHITE + minLvl + "-" + maxLvl);
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.GRAY + "신비한 힘으로 굳게 닫힌 상자");
			lore.add(ChatColor.GRAY + "요정의 테이블에서 열 수 있을 것 같다.");
		}
		im.setLore(lore);
		
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		
		item.setItemMeta(im);
		return item;
	}
	
}
