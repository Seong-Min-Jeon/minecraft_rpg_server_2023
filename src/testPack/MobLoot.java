package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class MobLoot {

	Random rnd = new Random();

	public MobLoot(Player player) {}

	// 메세지
	public void sendMessage(Player player, String msg) {player.sendMessage(msg);}

	// 보스 스켈이
	public void mob2(Player player) {
		ItemStack ticket = new ItemStack(Material.PAPER);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.YELLOW + "낫 교환권");
		ArrayList<String> ticketLore = new ArrayList();
		ticketLore.add(ChatColor.GRAY + "낫과 교환할 수 있을 것 같다.");
		ticketLore.add(ChatColor.GRAY + "주민과 대화해 사용해보자");
		ticketIm.setLore(ticketLore);
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		sendMessage(player, ChatColor.YELLOW + "낫 교환권" + ChatColor.WHITE + "을 획득했다.");
	}

	// 유혹하는 나무
	public void mob246(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬3===")) {
			int qNum = cb.getNum(player);
			cb.q1(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===움직이지 않는 자===")) {
			int qNum = cb.getNum(player);
			cb.q1(player, qNum + 1);
		}
	}
}
