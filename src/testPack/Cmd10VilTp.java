package testPack;

import java.util.List;
import java.util.Random;

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
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd10VilTp implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		World world = null;
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			world = player.getWorld();
			
			Location tuto = new Location(world,3700,100,3700);
			Location tuto2 = new Location(world,3888,200,3826);
			Location wargunil = new Location(world,-1844,70,3012);
			Location forgan = new Location(world,-1573,53,2458);
			Location tiru = new Location(world, -672, 46, 1942);
			Location seedMine = new Location(world,-1159,42,1729);
			Location miyu = new Location(world,-1143,181,1461);
			Location kaiman = new Location(world,-478,55,1302);
			Location hiosu = new Location(world,-1370,51,976);
			Location konno = new Location(world,-2465,52,543);
			Location fuhidmeh = new Location(world,-429,98,721); //프랑스어 해산물
			Location sitasaidi = new Location(world,-1132,55,656); //영어 앵무과
			Location karce = new Location(world,-199,67,541); //독일어 circle
			Location kuredratt = new Location(world,-61,56,80); //독일어 네모
			Location beiag = new Location(world,141,87,-329); //독일어 산
			Location magicTower = new Location(world,221,81,725,90,0); 
			Location longue = new Location(world,822,71,511,270,0); //프랑스어 long
			Location hamabe = new Location(world,973,62,40,180,0);
			Location samak = new Location(world,228,85,945);
			Location samakVil = new Location(world,-100,29,1462);
			Location kekktas = new Location(world,-741,56,-894); 
			Location hardDun = new Location(world,3686,190,3863); 
			Location tiperari = new Location(world,738,107,-982,270,0);
			Location lidia = new Location(world,1031,52,-1351,270,0);
			Location furelioud = new Location(world,614,56,-1559,0,0);
			
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("VilTp")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.WHITE + "1: 워그닐/2: 포르간/3: 티르/4: 시드광산/5: 미푀르유/6: 카이만/7: 오스/"
							+ "8: 콘노/9: 프휘 드 메흐/10: 시타사이디/11: 칼스/12: 크레드라트/13: 베아그/14: 마법탑/15: 롱게/16: 하마베/17: 사막정찰캠프/"
							+ "18: 사막마을/19: 캑터스/20: 하드던전/21: 티페라리/22: 리디아 평원 오두막/23: 프렐리우드");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("00")) {
						player.teleport(tuto2);
					}
					if(args[0].equalsIgnoreCase("0")) {
						player.teleport(tuto);
					}
					if(args[0].equalsIgnoreCase("1")) {
						player.teleport(wargunil);
					}
					if(args[0].equalsIgnoreCase("2")) {
						player.teleport(forgan);
					}
					if(args[0].equalsIgnoreCase("3")) {
						player.teleport(tiru);
					}
					if(args[0].equalsIgnoreCase("4")) {
						player.teleport(seedMine);
					}
					if(args[0].equalsIgnoreCase("5")) {
						player.teleport(miyu);
					}
					if(args[0].equalsIgnoreCase("6")) {
						player.teleport(kaiman);
					}
					if(args[0].equalsIgnoreCase("7")) {
						player.teleport(hiosu);
					}
					if(args[0].equalsIgnoreCase("8")) {
						player.teleport(konno);
					}
					if(args[0].equalsIgnoreCase("9")) {
						player.teleport(fuhidmeh);
					}
					if(args[0].equalsIgnoreCase("10")) {
						player.teleport(sitasaidi);
					}
					if(args[0].equalsIgnoreCase("11")) {
						player.teleport(karce);
					}
					if(args[0].equalsIgnoreCase("12")) {
						player.teleport(kuredratt);
					}
					if(args[0].equalsIgnoreCase("13")) {
						player.teleport(beiag);
					}
					if(args[0].equalsIgnoreCase("14")) {
						player.teleport(magicTower);
					}
					if(args[0].equalsIgnoreCase("15")) {
						player.teleport(longue);
					}
					if(args[0].equalsIgnoreCase("16")) {
						player.teleport(hamabe);
					}
					if(args[0].equalsIgnoreCase("17")) {
						player.teleport(samak);
					}
					if(args[0].equalsIgnoreCase("18")) {
						player.teleport(samakVil);
					}
					if(args[0].equalsIgnoreCase("19")) {
						player.teleport(kekktas);
					}
					if(args[0].equalsIgnoreCase("20")) {
						player.teleport(hardDun);
					}
					if(args[0].equalsIgnoreCase("21")) {
						player.teleport(tiperari);
					}
					if(args[0].equalsIgnoreCase("22")) {
						player.teleport(lidia);
					}
					if(args[0].equalsIgnoreCase("23")) {
						player.teleport(furelioud);
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "잘못된 입력입니다만?");
					return true;
				}
			}
		}	
		return true;
	}

}
