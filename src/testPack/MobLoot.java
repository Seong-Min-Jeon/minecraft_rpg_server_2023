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

	private int multyEme = 1;
	ExpSystemByMob es = new ExpSystemByMob();
	Cmd18ItemToggle it = new Cmd18ItemToggle();

	// 1:10 10:100 20:1000 30:4000 40:10000 50:21000 100:200000 200:1840000
	// 400:16660000 700:97600000 1000:300000000
	
	public MobLoot(Player player) {
		int num = 0;
		Inheritance inheritance = new Inheritance();
		if(inheritance.getInheritance(player) == 92) {
			num = 10;
		} else if(inheritance.getInheritance(player) == 93) {
			num = 20;
		} else if(inheritance.getInheritance(player) == 94) {
			num = 30;
		} else if(inheritance.getInheritance(player) == 95) {
			num = 40;
		} else if(inheritance.getInheritance(player) == 96) {
			num = 50;
		}
		
		if(rnd.nextInt(100) < num) {
			multyEme = 2;
		} else {
			multyEme = 1;
		}
	}

	// 메세지
	public void sendMessage(Player player, String msg) {
		if(it.isOn(player)) {
			player.sendMessage(msg);
		}
	}
	
	// 공격을 모르는 스켈이
	public void mob1(Player player) {
		ItemStack ticket = new ItemStack(Material.IRON_NUGGET);
		ItemMeta ticketIm = ticket.getItemMeta();
		ticketIm.setDisplayName(ChatColor.GRAY + "스켈이 파편");
		ticket.setItemMeta(ticketIm);
		player.getInventory().addItem(ticket);
		sendMessage(player, ChatColor.GRAY + "스켈이 파편" + ChatColor.WHITE + "을 획득했다.");
		es.giveExp(player, 1);
	}

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
		es.giveExp(player, 1);
	}

	// 초록 슬라임
	public void mob3(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 10);
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===최후의 전투===")) {
			int qNum = cb.getNum(player);
			cb.mq_last(player, qNum+1);	
		}
	}

	// 해안가 좀비
	public void mob4(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 80);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해안의 위협===")) {
			int qNum = cb.getNum(player);
			cb.q1(player, qNum + 1);
		}
	}

	// 워그닐에 배신당한 자
	public void mob5(Player player) {
		int num = rnd.nextInt(5) + 2;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 260);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워그닐 섬의 비밀===")) {
			int qNum = cb.getNum(player);
			cb.mq1(player, qNum + 1);
		}
	}

	// 검은 수염 하수인
	public void mob6(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3334);
	}

	// 검은 수염 간부
	public void mob7(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(100);
		if (num2 <= 0) {
			ItemStack rein = new ItemStack(Material.CHARCOAL);
			ItemMeta reinIm = rein.getItemMeta();
			reinIm.setDisplayName(ChatColor.AQUA + "검은 수염의 증표");
			ArrayList<String> reinLore = new ArrayList();
			reinLore.add(ChatColor.GRAY + "검은 수염단의 검을 초월시킬 수 있는 소재");
			reinIm.setLore(reinLore);
			rein.setItemMeta(reinIm);
			player.getInventory().addItem(rein);
			sendMessage(player, ChatColor.AQUA + "검은 수염의 증표" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 3768);
	}

	// 포레스트 고스트
	public void mob8(Player player) {
		int num = rnd.nextInt(10) + 3;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 524);
	}

	// 크리스탈 워리어
	public void mob9(Player player) {
		int num = rnd.nextInt(2) + 5;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 571);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 말단===")) {
			int qNum = cb.getNum(player);
			cb.q3(player, qNum + 1);
		}
	}

	// 저주받은 나무 요정
	public void mob10(Player player) {
		int num = rnd.nextInt(6) + 4;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 652);
	}

	// 산호 정령
	public void mob11(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 233);
	}

	// 산호 스트레이
	public void mob12(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 355);
	}

	// 거북 병사
	public void mob13(Player player) {
		int num = rnd.nextInt(6);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 202);
	}

	// 엘더 가디언
	public void mob14(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 732);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(10, 3, 10);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.getInventory().addItem(rewardKey);
				sendMessage(nearPlayer, ChatColor.YELLOW + "잊혀진 바다 신전 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
			}
		}
	}

	// 고블린
	public void mob15(Player player) {
		int num = rnd.nextInt(10) + 16;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 8226);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁3===")) {
			int qNum = cb.getNum(player);
			cb.mq6(player, qNum + 1);
		}
	}

	// 파르홀론의 망자
	public void mob16(Player player) {
		int num = rnd.nextInt(10) + 18;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 9527);
	}

	// 파르홀론의 유령
	public void mob17(Player player) {
		int num = rnd.nextInt(4) + 20;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 10374);
	}

	// 변이된 곰
	public void mob18(Player player) {
		int num = rnd.nextInt(10) + 30;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		int num2 = rnd.nextInt(30);
		if (num2 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(0);
			player.getInventory().addItem(weapon);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "변이의 힘이 담긴 물체" + ChatColor.WHITE + "을 획득했다.");
		}
		es.giveExp(player, 15554);
	}

	// 침략자
	public void mob19(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2217);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===침략자===")) {
			int qNum = cb.getNum(player);
			cb.q5(player, qNum + 1);
		}
	}

	// 숲의 황소
	public void mob20(Player player) {
		int num = rnd.nextInt(30);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3572);
	}

	// 숲의 마녀
	public void mob21(Player player) {
		int num = rnd.nextInt(18);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3152);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁1===")) {
			int qNum = cb.getNum(player);
			cb.mq4(player, qNum + 1);
		}
	}

	// 산적
	public void mob22(Player player) {
		int num = rnd.nextInt(10) + 6;
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 2811);
	}

	// 변이된 나뭇잎
	public void mob23(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 3852);
		World world = player.getWorld();
		int num2 = rnd.nextInt(15);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3515.5, 48, 3706));
			sendMessage(player, "유적 어딘가로 이동했다.");
		}
	}

	// 되살아난 모험가
	public void mob24(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 4220);
		World world = player.getWorld();
		int num2 = rnd.nextInt(10);
		if (num2 == 0) {
			player.teleport(new Location(world, 3464.5, 18, 3740));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 1) {
			player.teleport(new Location(world, 3464.5, 18, 3697));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 2) {
			player.teleport(new Location(world, 3503.5, 18, 3698));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 3) {
			player.teleport(new Location(world, 3514.5, 18, 3745));
			sendMessage(player, "유적 어딘가로 이동했다.");
		} else if (num2 == 4) {
			player.teleport(new Location(world, 3515.5, 48, 3706));
			sendMessage(player, "유적 어딘가로 이동했다.");
		}
	}

	// 유적의 주인
	public void mob25(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD, num * multyEme);
		player.getInventory().addItem(item);
		es.giveExp(player, 20000);

//		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
//		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
//		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숲의 유적 보상 열쇠");
//		rewardKey.setItemMeta(rewardKeyIm);
//		player.getInventory().addItem(rewardKey);
//		sendMessage(player, ChatColor.YELLOW + "숲의 유적 보상 열쇠" + ChatColor.WHITE + "을 획득했다.");

	}

	// 오크
	public void mob26(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 17312);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===같아보이지만 다른===")) {
			int qNum = cb.getNum(player);
			cb.q8(player, qNum + 1);
		}
	}

	// 미래를 예지하는 눈
	public void mob27(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 19843);
		
		int num2 = rnd.nextInt(20);
		if(num2 == 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon1 = chest.getInventory().getItem(10);
			player.getInventory().addItem(weapon1);
			sendMessage(player, ChatColor.YELLOW + "미래를 예지하는 눈" + ChatColor.WHITE + "을 획득했다.");
		}
		
	}

	// 검은 인간
	public void mob28(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 22532);
	}

	// 포보르 정찰병
	public void mob29(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 28653);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 위협===")) {
			int qNum = cb.getNum(player);
			cb.q9(player, qNum + 1);
		}

		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===앞으로 나아가기 위한 여정===")) {
			int qNum = cb.getNum(player);
			cb.mq9(player, qNum + 1);
		}
	}

	// 유적을 지키는 거미
	public void mob30(Player player) {
		es.giveExp(player, 50000);
	}

	// 파르홀론의 수호자
	public void mob31(Player player) {
		es.giveExp(player, 60000);
	}

	// 외눈의 포보르
	public void mob32(Player player) {
		int num = rnd.nextInt(3);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 30800);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===등대지기 시험===")) {
			int qNum = cb.getNum(player);
			cb.mq10(player, qNum + 1);
		}
	}

	// 포보르 세력 플레이어
	public void mob33(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 47412);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산으로 가는 길===")) {
			int qNum = cb.getNum(player);
			cb.mq13(player, qNum + 1);
		}
	}

	// 동굴 거미
	public void mob34(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90621);
	}

	// 동굴 벌레
	public void mob35(Player player) {
		int num = rnd.nextInt(4);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 95134);
	}

	// 아랑
	public void mob36(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 84134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 머라우더
	public void mob37(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 90134);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 파르홀론의 전투병
	public void mob38(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 399999);
	}

	// 포보르 세력 플레이어
	public void mob39(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 108134);
	}

	// 분노의 형상
	public void mob40(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 130134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}	
	}

	// 공허의 형상
	public void mob41(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 144160);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 고통의 형상
	public void mob42(Player player) {
		int num = rnd.nextInt(7);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 151532);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 침묵의 형상
	public void mob43(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 166256);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 우울의 형상
	public void mob44(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 178490);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 허몽의 형상
	public void mob45(Player player) {
		int num = rnd.nextInt(8);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 183613);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 오만의 형상
	public void mob46(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 198236);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 배신의 형상
	public void mob47(Player player) {
		int num = rnd.nextInt(8) + 2;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 193572);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===은빛의 영역===")) {
			int qNum = cb.getNum(player);
			cb.mq17(player, qNum + 1);
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===탈환===")) {
			int qNum = cb.getNum(player);
			cb.q10(player, qNum + 1);
		}
	}

	// 시련의 형상
	public void mob48(Player player) {
		player.sendMessage("클리어!");
		player.sendMessage("하지만 무언가 잘못된 것 같다..");
		player.teleport(new Location(player.getWorld(), -1106, 186, 1453.5, -90.0f, 0.0f));
		
//		Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
//		Block block = chestLoc.getBlock();
//		Chest chest = (Chest) block.getState();
//		ItemStack item = chest.getInventory().getItem(7);
//		player.getInventory().addItem(item);
//		sendMessage(player, ChatColor.DARK_RED + "숨겨진 달걀 1" + ChatColor.WHITE + "을 획득했다.");
	}

	// 귀웅
	public void mob49(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 121257);
	}

	// 대사
	public void mob50(Player player) {
		int num = rnd.nextInt(8) + 3;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 131257);
	}

	// 영혼을 탐하는 요정
	public void mob51(Player player) {
		es.giveExp(player, 251256);
	}

	// 딥슬라임
	public void mob52(Player player) {
		es.giveExp(player, 258193);
	}

	// 워리어
	public void mob53(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 220000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 빈디케이터
	public void mob54(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 232516);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 저거너트
	public void mob55(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 247236);
	}

	// 유서퍼
	public void mob56(Player player) {
		int num = rnd.nextInt(12);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 뒤틀린 역사의 흔적
	public void mob57(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 271134);
	}
	
	// 아공간 파수꾼
	public void mob58(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 294284);
	}

	// 조난당한 영혼
	public void mob59(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 251652);
	}

	// 익사당한 선원
	public void mob60(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 261684);
	}
	
	// 수라
	public void mob61(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 281256);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나찰
	public void mob62(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 303261);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나호
	public void mob63(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331534);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 나섬
	public void mob64(Player player) {
		int num = rnd.nextInt(15);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 361654);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.GRAY + "하급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.GRAY + "하급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}

	// 데빌 보초병
	public void mob65(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 405631);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// 데빌 병사
	public void mob66(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 427134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}

	// 데빌 분대장
	public void mob67(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 461124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===데빌 인자===")) {
			int qNum = cb.getNum(player);
			cb.q12(player, qNum + 1);
		}
	}
	
	// 묘지기의 신직
	public void mob68(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 331134);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 사령관
	public void mob69(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 358417);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 영술사
	public void mob70(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 378571);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 묘지기의 이능자
	public void mob71(Player player) {
		int num = rnd.nextInt(10) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 418760);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네크로벨리===")) {
			int qNum = cb.getNum(player);
			cb.q11(player, qNum + 1);
		}
	}
	
	// 보초를 서는 요정
	public void mob72(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 204251);
	}
	
	// 공격대 요정
	public void mob73(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 222167);
	}
	
	// 지키는 요정
	public void mob73_5(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 282167);
	}
	
	// 돌리
	public void mob73_8(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 302167);
	}
	
	// 불의 요정
	public void mob74(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 273712);
	}

	// 요정의 소환수
	public void mob75(Player player) {
		int num = rnd.nextInt(10);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 283712);
	}
	
	// 거대 요정
	public void mob76(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 400000);
	}
	
	// 요정왕 오베론
	public void mob77(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 500000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 요정여왕 티타니아
	public void mob78(Player player) {
		int num = rnd.nextInt(30) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 500000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				//3754 90 3497  3797 75 3456
				if (loc.getX() <= 3797 && loc.getY() <= 90 && loc.getZ() <= 3497 
						&& loc.getX() >= 3754 && loc.getY() >= 75 && loc.getZ() >= 3456) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "타락한 요정 왕국 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 나비
	public void mob79(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 465760);
	}

	// 설원 정찰자
	public void mob80(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 315156);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 설원 정찰자
	public void mob81(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 338573);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 설원 정찰자
	public void mob82(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 380265);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===던전 탐색===")) {
			int qNum = cb.getNum(player);
			cb.mq23(player, qNum + 1);
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob83(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 401245);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob84(Player player) {
		int num = rnd.nextInt(20);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 413415);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 발로르의 보병, 발로르의 궁병
	public void mob85(Player player) {
		es.giveExp(player, 444623);
	}
	
	// 케흘렌
	public void mob86(Player player) {
		int num = rnd.nextInt(10)+40;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 750000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3810 93 3201  3783 63 3227
				if (loc.getX() <= 3810 && loc.getY() <= 93 && loc.getZ() <= 3227 && loc.getX() >= 3783
						&& loc.getY() >= 63 && loc.getZ() >= 3201) {
					
					try {
						QuestBoard cb = new QuestBoard();
						if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
							int qNum = cb.getNum(nearPlayer);
							cb.eq1_6(nearPlayer, qNum + 1);
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3734, 140, 3146, 90, 0));
						} else if (cb.getQuestName(nearPlayer).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
							int qNum = cb.getNum(nearPlayer);
							cb.mq24(nearPlayer, qNum + 1);
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3734, 140, 3146, 90, 0));
						} else {
							nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3730, 179, 3236, 270, 0));
						}
					} catch(Exception e) {
						nearPlayer.teleport(new Location(nearPlayer.getWorld(), 3730, 179, 3236, 270, 0));
					}
					
				}
			}
		}
		
		try {
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희7===")) {
				int qNum = cb.getNum(player);
				cb.eq1_6(player, qNum + 1);
				player.teleport(new Location(player.getWorld(), 3734, 140, 3146, 90, 0));
			} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===카루 던전===")) {
				int qNum = cb.getNum(player);
				cb.mq24(player, qNum + 1);
				player.teleport(new Location(player.getWorld(), 3734, 140, 3146, 90, 0));
			} else {
				player.teleport(new Location(player.getWorld(), 3730, 179, 3236, 270, 0));
			}
		} catch(Exception e) {
			player.teleport(new Location(player.getWorld(), 3730, 179, 3236, 270, 0));
		}

	}
	
	// 발로르
	public void mob87(Player player) {
		int num = rnd.nextInt(4) + 44;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 800000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.WHITE + "중급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "카루 던전 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "카루 던전 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3711 163 3254  3769 133 3217
				if (loc.getX() <= 3769 && loc.getY() <= 163 && loc.getZ() <= 3254 && loc.getX() >= 3711
						&& loc.getY() >= 133 && loc.getZ() >= 3217) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "카루 던전 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 거대 슬라임
	public void mob88(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 471760);
	}
	
	// 늑대 거미
	public void mob89(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 486124);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// 독거미
	public void mob90(Player player) {
		int num = rnd.nextInt(20) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 494250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 만남===")) {
			int qNum = cb.getNum(player);
			cb.mq27(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약1===")) {
			int qNum = cb.getNum(player);
			cb.eq2(player, qNum + 1);
		}
	}
	
	// 늪지의 마수
	public void mob91(Player player) {
		int num = rnd.nextInt(20) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 498760);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// 늪지의 마신왕
	public void mob92(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 555555);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "엑스트라 퀘스트: 마신왕의 계약");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'마신왕의 계약' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
		sendMessage(player, ChatColor.GOLD + "엑스트라 퀘스트: 마신왕의 계약" + ChatColor.WHITE + "을 획득했다.");
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===늪지의 마신왕===")) {
			int qNum = cb.getNum(player);
			cb.mq28(player, qNum + 1);
		}
	}

	// 산적
	public void mob93(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 512523);
	}
	
	// 전투형 집사
	public void mob94(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 44742);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
	}
	
	// 전투형 메이드
	public void mob95(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49825);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
	}
	
	// 기사출신 집사, 장교출신 메이드, 보안팀장
	public void mob96(Player player) {
		int num = rnd.nextInt(5) + 5;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 64235);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 전투형 집사
	public void mob97(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 49125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 전투형 메이드
	public void mob98(Player player) {
		int num = rnd.nextInt(5);
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 52763);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.GRAY + "하급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.GRAY + "하급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 아덴
	public void mob99(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 160000);
		
		ItemStack var1 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.GRAY + "하급 포보르의 심장");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.WHITE + "하급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "아덴의 저택 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "아덴의 저택 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3336 10 3725  3299 45 3762
				if (loc.getX() <= 3336 && loc.getY() <= 45 && loc.getZ() <= 3762 && loc.getX() >= 3299
						&& loc.getY() >= 10 && loc.getZ() >= 3725) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "아덴의 저택 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}

	// 특급 요리사
	public void mob100(Player player) {
		int num = rnd.nextInt(10) + 10;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);

		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 3355 32 3803  3383 11 3766
				if (loc.getX() <= 3383 && loc.getY() <= 32 && loc.getZ() <= 3803 && loc.getX() >= 3355
						&& loc.getY() >= 11 && loc.getZ() >= 3766) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "숨겨진 아덴의 저택 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 바선생
	public void mob101(Player player) {
		es.giveExp(player, 180000);
	}
	
	// 푸르 고블린
	public void mob102(Player player) {
		int num = rnd.nextInt(8) + 15;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 521250);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 고블린===")) {
			int qNum = cb.getNum(player);
			cb.q13(player, qNum + 1);
		}
	}

	// 되살아난 전사
	public void mob103(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 539125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 포보르 세력 플레이어
	public void mob104(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 553419);
	}
	
	// 캘시퍼
	public void mob105(Player player) {
		int num = rnd.nextInt(15) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 570012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===불의 악마===")) {
			int qNum = cb.getNum(player);
			cb.q14(player, qNum + 1);
		}
	}
	
	// 하급 파괴수
	public void mob106(Player player) {
		int num = rnd.nextInt(10) + 30;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 612405);
		
		QuestBoard cb = new QuestBoard();
		if(num > 34) {
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===영혼 요정 가루===")) {
				int qNum = cb.getNum(player);
				cb.mq31(player, qNum + 1);
			}
		}
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===방해받은 파괴수의 잠I===")) {
			int qNum = cb.getNum(player);
			cb.q15(player, qNum + 1);
		}
	}
	
	// 되살아난 해골
	public void mob107(Player player) {
		int num = rnd.nextInt(10) + 20;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 587125);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.WHITE + "중급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.WHITE + "중급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.WHITE + "중급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.WHITE + "중급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.WHITE + "중급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.WHITE + "중급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===되살아난 해골===")) {
			int qNum = cb.getNum(player);
			cb.mq30(player, qNum + 1);
		}
	}
	
	// 밀 가디언
	public void mob108(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 635241);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// 변장한 늑대
	public void mob109(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752156);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기1===")) {
			int qNum = cb.getNum(player);
			cb.mq33_1(player, qNum + 1);
		}
	}
	
	// 약쟁이
	public void mob110(Player player) {
		int num = rnd.nextInt(20) + 25;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 671552);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(20);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITCH);
		}
	}
	
	// 과자 마녀
	public void mob111(Player player) {
		int num = rnd.nextInt(40) + 24;
		ItemStack item = new ItemStack(Material.EMERALD_BLOCK, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 811249);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===빨간모자 이야기2===")) {
			int qNum = cb.getNum(player);
			cb.mq34_1(player, qNum + 1);
		}
	}
	
	// 1층의 지배자
	public void mob112(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 1층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 2층의 지배자
	public void mob113(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 100 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 88 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 2층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 3층의 지배자
	public void mob114(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 115 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 101 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 3층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 4층의 지배자
	public void mob115(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 128 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 116 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 4층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 5층의 지배자
	public void mob116(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 141 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 129 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 5층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 6층의 지배자
	public void mob117(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 156 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 142 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 6층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 7층의 지배자
	public void mob118(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 169 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 157 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 7층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 8층의 지배자
	public void mob119(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "부서진 8층 열쇠 조각");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "부서진 8층 열쇠 조각" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 182 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 170 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "부서진 8층 열쇠 조각" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 9층의 지배자
	public void mob120(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 197 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 183 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 9층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 10층의 지배자
	public void mob121(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 210 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 198 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 10층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 11층의 지배자
	public void mob122(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 223 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 211 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 11층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 탑의 주인
	public void mob123(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
		
		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 90 && loc.getY() <= 87 && loc.getZ() <= -5 && 
						loc.getX() >= 54 && loc.getY() >= 75 && loc.getZ() >= -41) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "죽음의 탑 12층 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 지하의 파수꾼
	public void mob124(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 783712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 지하의 파수꾼
	public void mob125(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 802712);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 갓 슬라임
	public void mob126(Player player) {
		int num = rnd.nextInt(1);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 731012);
	}
	
	// 사라진 부락의 전사
	public void mob127(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 710412);
	}
	
	// 네크로벨리 암살자
	public void mob128(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 690412);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			ItemStack var1 = new ItemStack(Material.POTION);
			ItemMeta var1im = var1.getItemMeta();
			var1im.setDisplayName(ChatColor.YELLOW + "성수");
			ArrayList<String> var1Lore = new ArrayList();
			var1Lore.add(ChatColor.GRAY + "축복의 포션을 제작하기 위한 재료");
			var1im.setLore(var1Lore);
			var1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			var1im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			var1im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			var1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			PotionMeta pm = (PotionMeta) var1im;
			pm.setColor(Color.fromRGB(0, 50, 200));
			var1.setItemMeta(pm);
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "성수" + ChatColor.WHITE + "를 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션1===")) {
				int qNum = cb.getNum(player);
				cb.mq45_2(player, qNum + 1);
			}
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 네크로벨리 감시자
	public void mob129(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 723432);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			ItemStack var1 = new ItemStack(Material.POTION);
			ItemMeta var1im = var1.getItemMeta();
			var1im.setDisplayName(ChatColor.YELLOW + "성수");
			ArrayList<String> var1Lore = new ArrayList();
			var1Lore.add(ChatColor.GRAY + "축복의 포션을 제작하기 위한 재료");
			var1im.setLore(var1Lore);
			var1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			var1im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			var1im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			var1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			PotionMeta pm = (PotionMeta) var1im;
			pm.setColor(Color.fromRGB(0, 50, 200));
			var1.setItemMeta(pm);
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "성수" + ChatColor.WHITE + "를 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션1===")) {
				int qNum = cb.getNum(player);
				cb.mq45_2(player, qNum + 1);
			}
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 네크로벨리 복병
	public void mob130(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 752145);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			ItemStack var1 = new ItemStack(Material.POTION);
			ItemMeta var1im = var1.getItemMeta();
			var1im.setDisplayName(ChatColor.YELLOW + "성수");
			ArrayList<String> var1Lore = new ArrayList();
			var1Lore.add(ChatColor.GRAY + "축복의 포션을 제작하기 위한 재료");
			var1im.setLore(var1Lore);
			var1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			var1im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			var1im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			var1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			PotionMeta pm = (PotionMeta) var1im;
			pm.setColor(Color.fromRGB(0, 50, 200));
			var1.setItemMeta(pm);
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "성수" + ChatColor.WHITE + "를 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션1===")) {
				int qNum = cb.getNum(player);
				cb.mq45_2(player, qNum + 1);
			}
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===묘지를 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q16(player, qNum + 1);
		}
	}
	
	// 푸르 날벌레
	public void mob131(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 736213);
	}
	
	// 푸르 날벌레
	public void mob132(Player player) {
		int num = rnd.nextInt(2);
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 760145);
	}

	// 지하감옥의 간부
	public void mob133(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 812512);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 지하감옥의 죄수
	public void mob134(Player player) {
		int num = rnd.nextInt(3) + 1;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 797012);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 마력의 부산물
	public void mob135(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 799151);
	}
	
	// 강화 개조 인간
	public void mob136(Player player) {
		int num = rnd.nextInt(2) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 828282);
	}

	// 마법에 타락한 자
	public void mob137(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 832501);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int num2 = rnd.nextInt(20);
		if (num2 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(12);
			player.getInventory().addItem(weapon);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "포보르의 마나" + ChatColor.WHITE + "를 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 마나===")) {
				int qNum = cb.getNum(player);
				cb.mq35_1(player, qNum + 1);
			}
		}
	}
	
	// 전생한 슬라임
	public void mob138(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 849012);
	}
	
	// 재앙
	public void mob139(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 900000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 타락한 모험가
	public void mob140(Player player) {
		int num = rnd.nextInt(4) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// 코낭그
	public void mob141(Player player) {
		int num = 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3000000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "미궁 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "미궁 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				// 49 61 654  16 51 696 
				if (loc.getX() <= 49 && loc.getY() <= 61 && loc.getZ() <= 696 
						&& loc.getX() >= 16 && loc.getY() >= 51 && loc.getZ() >= 654) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "미궁 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
					nearPlayer.teleport(new Location(nearPlayer.getWorld(), 28.5, 63, 681));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 28.5, 63, 681));
		
	}
	
	// 요정의 파편
	public void mob142(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 861234);
	}
	
	// 초마도용기사
	public void mob143(Player player) {
		int num = rnd.nextInt(4) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 888888);
	}
	
	// 떠도는 망령 전사
	public void mob144(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 895000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// 떠도는 망령 마법사
	public void mob145(Player player) {
		int num = rnd.nextInt(3) + 3;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 916000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(10);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===떠도는 망령===")) {
			int qNum = cb.getNum(player);
			cb.mq37_1(player, qNum + 1);
		}
	}
	
	// 그리즐리 베어
	public void mob146(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 925200);
	}
	
	// TNTZ
	public void mob147(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 935500);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===폭탄병===")) {
			int qNum = cb.getNum(player);
			cb.q17(player, qNum + 1);
		}
	}
	
	// 파스칼
	public void mob148(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 980000);
	}
	
	// 에밀
	public void mob149(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1200000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에밀의 결의===")) {
			int qNum = cb.getNum(player);
			cb.q18(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수상한 몬스터===")) {
			int qNum = cb.getNum(player);
			cb.mq38_1(player, qNum + 1);
		}
	}
	
	// 포보르 세력 플레이어
	public void mob150(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 950000);
	}
	
	// 마법소녀
	public void mob151(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 965000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 진흙 요정
	public void mob152(Player player) {
		es.giveExp(player, 1100000);
	}
	
	// 푸른 가오리
	public void mob153(Player player) {
//		int num = rnd.nextInt(3) + 4;
//		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
//		ItemMeta im = item.getItemMeta();
//		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
//		item.setItemMeta(im);
//		player.getInventory().addItem(item);
//		es.giveExp(player, 1100000);
	}
	
	// 아라크네의 하수인
	public void mob154(Player player) {
		int num = rnd.nextInt(3) + 2;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1160000);
	}
	
	// 아라크네
	public void mob155(Player player) {
		int num = 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3800000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "아라크네의 저주 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "아라크네의 저주 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 20, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 776 && loc.getY() <= 31 && loc.getZ() <= 605 
						&& loc.getX() >= 727 && loc.getY() >= 0 && loc.getZ() >= 555) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "아라크네의 저주 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 네오아쿠아 마돌
	public void mob156(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 라이트레이 마돌
	public void mob157(Player player) {
		int num = rnd.nextInt(3) + 4;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1030000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 방황하는 요정
	public void mob158(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1060000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘1===")) {
			int qNum = cb.getNum(player);
			cb.mq39(player, qNum + 1);
		}
	}
	
	// 방황하는 요정
	public void mob159(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1100000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘1===")) {
			int qNum = cb.getNum(player);
			cb.mq39(player, qNum + 1);
		}
	}
	
	// 분노하는 요정
	public void mob160(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1120000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘2===")) {
			int qNum = cb.getNum(player);
			cb.mq39_1(player, qNum + 1);
		}
	}
	
	// 분노하는 요정
	public void mob161(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1150000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘2===")) {
			int qNum = cb.getNum(player);
			cb.mq39_1(player, qNum + 1);
		}
	}
	
	// 뒤틀린 요정
	public void mob162(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1160000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘3===")) {
			int qNum = cb.getNum(player);
			cb.mq39_2(player, qNum + 1);
		}
	}
	
	// 뒤틀린 요정
	public void mob163(Player player) {
		int num = rnd.nextInt(3) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1172000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===네비의 힘3===")) {
			int qNum = cb.getNum(player);
			cb.mq39_2(player, qNum + 1);
		}
	}
	
	// 켄
	public void mob164(Player player) {
		int num = rnd.nextInt(4) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1170000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 류
	public void mob165(Player player) {
		int num = rnd.nextInt(4) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1180000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 고우키
	public void mob166(Player player) {
		int num = rnd.nextInt(4) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1190000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 범인
	public void mob167(Player player) {
		int num = rnd.nextInt(4) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1187000);
	}
	
	// 포도
	public void mob168(Player player) {
		int num = rnd.nextInt(4) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1200000);
	}
	
	// 클레어흐의 망령
	public void mob169(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1220000);
	}
	
	// 404 Not Found
	public void mob170(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1250000);
	}
	
	// 타락한 주민
	public void mob171(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1270000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단1===")) {
			int qNum = cb.getNum(player);
			cb.mq42_1(player, qNum + 1);
		}
	}
	
	// 잠식된 주민
	public void mob172(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1290000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단1===")) {
			int qNum = cb.getNum(player);
			cb.mq42_1(player, qNum + 1);
		}
	}
	
	// 카스파르
	public void mob173(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1280000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	// 와일드
	public void mob174(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1320000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.YELLOW + "상급 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}

	// 자미엘
	public void mob175(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.YELLOW + "상급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.YELLOW + "상급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===악마 자미엘===")) {
			int qNum = cb.getNum(player);
			cb.q19(player, qNum + 1);
		}
	}
	
	// 나무 벌레
	public void mob176(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1300000);
	}
	
	// 산적
	public void mob177(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1340000);
	}
	
	// 흑아
	public void mob178(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1355000);
	}
	
	// 자독
	public void mob179(Player player) {
		int num = rnd.nextInt(6) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1370000);
	}
	
	// 클레어흐의 광신도
	public void mob180(Player player) {
		int num = rnd.nextInt(7) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1340000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단2===")) {
			int qNum = cb.getNum(player);
			cb.mq43(player, qNum + 1);
		}
	}
	
	// 클레어흐의 광신도
	public void mob181(Player player) {
		int num = rnd.nextInt(7) + 5;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1360000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단2===")) {
			int qNum = cb.getNum(player);
			cb.mq43(player, qNum + 1);
		}
	}
	
	// 클레어흐의 광신도 간부
	public void mob182(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1400000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===광신도 집단3===")) {
			int qNum = cb.getNum(player);
			cb.mq44(player, qNum + 1);
		}
	}
	
	// 클레어흐의 포보르
	public void mob183(Player player) {
		es.giveExp(player, 1480000);
		
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
		
		int tmp = rnd.nextInt(40);
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
	}
	
	// 파르홀론의 묘를 지키는 자
	public void mob184(Player player) {
		es.giveExp(player, 130000);
	}
	
	// 약화된 아라크네
	public void mob185(Player player) {
		es.giveExp(player, 140000);
	}
	
	// 에임
	public void mob186(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1400000);
		
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
		
		int tmp = rnd.nextInt(40);
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
	}
	
	// HeYhO
	public void mob187(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1430000);
		
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
		
		int tmp = rnd.nextInt(40);
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
	}
	
	// 녹지 않는 뼈
	public void mob188(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1450000);
	}
	
	// 레드 블럭
	public void mob189(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1480000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===붉은 악마===")) {
			int qNum = cb.getNum(player);
			cb.q20(player, qNum + 1);
		}
	}
	
	// 사막 망령 전사
	public void mob190(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1500000);
		
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
		
		int tmp = rnd.nextInt(40);
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
		
	}
	
	// Death Gun
	public void mob191(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1530000);
		
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
		
		int tmp = rnd.nextInt(40);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===Death Gun===")) {
			int qNum = cb.getNum(player);
			cb.mq45_6(player, qNum + 1);
		}
	}
	
	// 공허
	public void mob192(Player player) {
		int num = rnd.nextInt(7) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1560000);
		
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
		
		int tmp = rnd.nextInt(40);
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
	}
	
	// 개조된 버서커 플레이어
	public void mob193(Player player) {
		int num = rnd.nextInt(8) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1600000);
	}
	
	// 개조된 아처 플레이어
	public void mob194(Player player) {
		int num = rnd.nextInt(8) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1630000);
	}
	
	// 사막 노래기
	public void mob195(Player player) {
		int num = rnd.nextInt(8) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1650000);
	}
	
	// 사막 곰
	public void mob196(Player player) {
		int num = rnd.nextInt(8) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1680000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막 곰===")) {
			int qNum = cb.getNum(player);
			cb.mq45_8(player, qNum + 1);
		}
	}
	
	// 사막 전갈
	public void mob197(Player player) {
		int num = rnd.nextInt(8) + 6;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1750000);
	}
	
	// 쌍창 전사 석상
	public void mob198(Player player) {
		int num = rnd.nextInt(7) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1770000);
		
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
		
		int tmp = rnd.nextInt(30);
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
		
		ItemStack col1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col1im = col1.getItemMeta();
		col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
		col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col1.setItemMeta(col1im);
		
		ItemStack col2 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col2im = col2.getItemMeta();
		col2im.setDisplayName(ChatColor.WHITE + "B급 투기장 스크롤");
		col2im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col2.setItemMeta(col2im);
		
		ItemStack col3 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col3im = col3.getItemMeta();
		col3im.setDisplayName(ChatColor.YELLOW + "A급 투기장 스크롤");
		col3im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col3.setItemMeta(col3im);
		
		ItemStack col4 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col4im = col4.getItemMeta();
		col4im.setDisplayName(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤");
		col4im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col4.setItemMeta(col4im);
		
		int colP = rnd.nextInt(100);
		if(colP < 4) {
			player.getInventory().addItem(col1);
			sendMessage(player, ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 7) {
			player.getInventory().addItem(col2);
			sendMessage(player, ChatColor.WHITE + "B급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 9) {
			player.getInventory().addItem(col3);
			sendMessage(player, ChatColor.YELLOW + "A급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP == 9) {
			player.getInventory().addItem(col4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자1===")) {
			int qNum = cb.getNum(player);
			cb.mq45_13(player, qNum + 1);
		}
	}
	
	// 빛의 궁수 석상
	public void mob199(Player player) {
		int num = rnd.nextInt(7) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1790000);
		
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
		
		int tmp = rnd.nextInt(30);
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
		
		ItemStack col1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col1im = col1.getItemMeta();
		col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
		col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col1.setItemMeta(col1im);
		
		ItemStack col2 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col2im = col2.getItemMeta();
		col2im.setDisplayName(ChatColor.WHITE + "B급 투기장 스크롤");
		col2im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col2.setItemMeta(col2im);
		
		ItemStack col3 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col3im = col3.getItemMeta();
		col3im.setDisplayName(ChatColor.YELLOW + "A급 투기장 스크롤");
		col3im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col3.setItemMeta(col3im);
		
		ItemStack col4 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col4im = col4.getItemMeta();
		col4im.setDisplayName(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤");
		col4im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col4.setItemMeta(col4im);
		
		int colP = rnd.nextInt(100);
		if(colP < 4) {
			player.getInventory().addItem(col1);
			sendMessage(player, ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 7) {
			player.getInventory().addItem(col2);
			sendMessage(player, ChatColor.WHITE + "B급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 9) {
			player.getInventory().addItem(col3);
			sendMessage(player, ChatColor.YELLOW + "A급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP == 9) {
			player.getInventory().addItem(col4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자2===")) {
			int qNum = cb.getNum(player);
			cb.mq45_15(player, qNum + 1);
		}
	}
	
	// 쌍검 전사 석상
	public void mob200(Player player) {
		int num = rnd.nextInt(7) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1820000);
		
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
		
		int tmp = rnd.nextInt(30);
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
		
		ItemStack col1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col1im = col1.getItemMeta();
		col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
		col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col1.setItemMeta(col1im);
		
		ItemStack col2 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col2im = col2.getItemMeta();
		col2im.setDisplayName(ChatColor.WHITE + "B급 투기장 스크롤");
		col2im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col2.setItemMeta(col2im);
		
		ItemStack col3 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col3im = col3.getItemMeta();
		col3im.setDisplayName(ChatColor.YELLOW + "A급 투기장 스크롤");
		col3im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col3.setItemMeta(col3im);
		
		ItemStack col4 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col4im = col4.getItemMeta();
		col4im.setDisplayName(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤");
		col4im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col4.setItemMeta(col4im);
		
		int colP = rnd.nextInt(100);
		if(colP < 4) {
			player.getInventory().addItem(col1);
			sendMessage(player, ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 7) {
			player.getInventory().addItem(col2);
			sendMessage(player, ChatColor.WHITE + "B급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 9) {
			player.getInventory().addItem(col3);
			sendMessage(player, ChatColor.YELLOW + "A급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP == 9) {
			player.getInventory().addItem(col4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자3===")) {
			int qNum = cb.getNum(player);
			cb.mq45_17(player, qNum + 1);
		}
	}
	
	// 루 라바다의 석상
	public void mob201(Player player) {
		int num = rnd.nextInt(7) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1830000);
		
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
		
		int tmp = rnd.nextInt(25);
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
		
		ItemStack col1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col1im = col1.getItemMeta();
		col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
		col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col1.setItemMeta(col1im);
		
		ItemStack col2 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col2im = col2.getItemMeta();
		col2im.setDisplayName(ChatColor.WHITE + "B급 투기장 스크롤");
		col2im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col2.setItemMeta(col2im);
		
		ItemStack col3 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col3im = col3.getItemMeta();
		col3im.setDisplayName(ChatColor.YELLOW + "A급 투기장 스크롤");
		col3im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col3.setItemMeta(col3im);
		
		ItemStack col4 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col4im = col4.getItemMeta();
		col4im.setDisplayName(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤");
		col4im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col4.setItemMeta(col4im);
		
		int colP = rnd.nextInt(100);
		if(colP < 4) {
			player.getInventory().addItem(col1);
			sendMessage(player, ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 7) {
			player.getInventory().addItem(col2);
			sendMessage(player, ChatColor.WHITE + "B급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 9) {
			player.getInventory().addItem(col3);
			sendMessage(player, ChatColor.YELLOW + "A급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP == 9) {
			player.getInventory().addItem(col4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자4===")) {
			int qNum = cb.getNum(player);
			cb.mq45_19(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===과거의 영광===")) {
			int qNum = cb.getNum(player);
			cb.q21(player, qNum + 1);
		}
	}
	
	// 누아다의 석상
	public void mob202(Player player) {
		int num = rnd.nextInt(7) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1860000);
		
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
		
		int tmp = rnd.nextInt(25);
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
		
		ItemStack col1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col1im = col1.getItemMeta();
		col1im.setDisplayName(ChatColor.GRAY + "C급 투기장 스크롤");
		col1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col1.setItemMeta(col1im);
		
		ItemStack col2 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col2im = col2.getItemMeta();
		col2im.setDisplayName(ChatColor.WHITE + "B급 투기장 스크롤");
		col2im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col2.setItemMeta(col2im);
		
		ItemStack col3 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col3im = col3.getItemMeta();
		col3im.setDisplayName(ChatColor.YELLOW + "A급 투기장 스크롤");
		col3im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col3.setItemMeta(col3im);
		
		ItemStack col4 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta col4im = col4.getItemMeta();
		col4im.setDisplayName(ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤");
		col4im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		col4.setItemMeta(col4im);
		
		int colP = rnd.nextInt(100);
		if(colP < 4) {
			player.getInventory().addItem(col1);
			sendMessage(player, ChatColor.GRAY + "C급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 7) {
			player.getInventory().addItem(col2);
			sendMessage(player, ChatColor.WHITE + "B급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP < 9) {
			player.getInventory().addItem(col3);
			sendMessage(player, ChatColor.YELLOW + "A급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		} else if(colP == 9) {
			player.getInventory().addItem(col4);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "S급 투기장 스크롤" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽은 듯 살아있는 자5===")) {
			int qNum = cb.getNum(player);
			cb.mq45_21(player, qNum + 1);
		}
	}
	
	// 길을 잃은 검은 수염단
	public void mob203(Player player) {
		es.giveExp(player, 1730000);
	}
	
	// 길을 잃은 검은 수염단
	public void mob204(Player player) {
		es.giveExp(player, 1760000);
	}
	
	// 암석 전사
	public void mob205(Player player) {
		es.giveExp(player, 1600000);
	}
	
	// 암석 전사
	public void mob206(Player player) {
		es.giveExp(player, 1620000);
	}
	
	// 암석 전사
	public void mob207(Player player) {
		es.giveExp(player, 1640000);
	}
	
	// 스톤 가디언
	public void mob208(Player player) {
		es.giveExp(player, 1800000);
	}
	
	// 석상 파수꾼
	public void mob209(Player player) {
		es.giveExp(player, 5000000);
		
		List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 3824 && loc.getY() <= 52 && loc.getZ() <= 2896 
						&& loc.getX() >= 3707 && loc.getY() >= 16 && loc.getZ() >= 2834) {
					
					try {
						QuestBoard cb = new QuestBoard();
						if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===고대의 암석 협곡===")) {
							int qNum = cb.getNum(player);
							cb.mq45_10(player, qNum + 1);
						}
					} catch(Exception e) {
						
					}
					
				}
			}
		}
		
	}
	
	// 암석 거인의 파편
	public void mob210(Entity mob, Player player) {
		es.giveExp(player, 1650000);
		
		int tmp2 = rnd.nextInt(4);
		if(tmp2 == 0) {
			Location loc = mob.getLocation().add(0, 3, 0);
			loc.getWorld().spawnEntity(loc, EntityType.CREEPER);
		}
	}
	
	// 유황 골렘
	public void mob211(Entity mob, Player player) {
		ItemStack var1 = new ItemStack(Material.TNT);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.WHITE + "유황 폭탄");
		var1.setItemMeta(var1Im);
		player.getWorld().dropItem(mob.getLocation(), var1);
	}
	
	// 레티아리우스
	public void mob212(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "C급 투기장 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "C급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 4030 && loc.getY() <= 120 && loc.getZ() <= 2728 
						&& loc.getX() >= 3853 && loc.getY() >= 75 && loc.getZ() >= 2548) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "C급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
					nearPlayer.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
	}
	
	// 갈리
	public void mob213(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "B급 투기장 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "B급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 4207 && loc.getY() <= 120 && loc.getZ() <= 2730 
						&& loc.getX() >= 4037 && loc.getY() >= 75 && loc.getZ() >= 2547) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "B급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
					nearPlayer.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
	}
	
	// 디마카에루스
	public void mob214(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "A급 투기장 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "A급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 4023 && loc.getY() <= 120 && loc.getZ() <= 2546 
						&& loc.getX() >= 3846 && loc.getY() >= 75 && loc.getZ() >= 2369) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "A급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
					nearPlayer.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
	}
	
	// 프라에그나리
	public void mob215(Player player) {
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "S급 투기장 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "S급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(120, 20, 120);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 4210 && loc.getY() <= 120 && loc.getZ() <= 2543 
						&& loc.getX() >= 4031 && loc.getY() >= 75 && loc.getZ() >= 2366) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "S급 투기장 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
					nearPlayer.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
				}
			}
		}
		player.teleport(new Location(player.getWorld(), 128, 64, 1955, 90, 0));
	}
	
	// 고먐미
	public void mob216(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1870000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅1===")) {
			int qNum = cb.getNum(player);
			cb.mq45_27(player, qNum + 1);
		}
	}
	
	// 멈멈미
	public void mob217(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1880000);
	}
	
	// 펨뮌
	public void mob218(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1887000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅2===")) {
			int qNum = cb.getNum(player);
			cb.mq45_29(player, qNum + 1);
		}
	}
	
	// 맴무새
	public void mob219(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1900000);
	}
	
	// 먐
	public void mob220(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1905000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅3===")) {
			int qNum = cb.getNum(player);
			cb.mq45_31(player, qNum + 1);
		}
	}
	
	// 모짐머
	public void mob221(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1935000);
	}

	// 뭔숨미
	public void mob222(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1940000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅4===")) {
			int qNum = cb.getNum(player);
			cb.mq45_33(player, qNum + 1);
		}
	}
	
	// 부멈미
	public void mob223(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1970000);
	}
	
	// 포보르화 도마뱀
	public void mob224(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 1990000);
		
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
		
		int tmp = rnd.nextInt(20);
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
		
		ItemStack scr1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta scr1im = scr1.getItemMeta();
		scr1im.setDisplayName(ChatColor.LIGHT_PURPLE + "긴급 탈출 스크롤");
		scr1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scr1.setItemMeta(scr1im);
		ArrayList<String> scr1Lore = new ArrayList();
		scr1Lore.add(ChatColor.GRAY + "레벨 제한: 490");
		scr1Lore.add(ChatColor.GRAY + " ");
		scr1Lore.add(ChatColor.GRAY + "포보르화 된 동물들이 가지고 있던 스크롤");
		scr1Lore.add(ChatColor.GRAY + "그들의 주인에게 이동할 수 있는 주문이 걸려있는 것 같다.");
		scr1Lore.add(ChatColor.GRAY + "사용 방법은 딱히 적혀있지 않다.");
		scr1im.setLore(scr1Lore);
		scr1.setItemMeta(scr1im);
		int scrP = rnd.nextInt(20);
		if(scrP == 0) {
			player.getInventory().addItem(scr1);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "긴급 탈출 스크롤" + ChatColor.WHITE + "을 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅5===")) {
				int qNum = cb.getNum(player);
				cb.mq45_35(player, qNum + 1);
			}
		} 
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===군도의 강자===")) {
			int qNum = cb.getNum(player);
			cb.q22(player, qNum + 1);
		}
		
	}
	
	// 포보르화 복어
	public void mob225(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2020000);
		
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
		
		int tmp = rnd.nextInt(20);
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
		
		ItemStack scr1 = new ItemStack(Material.ACACIA_DOOR);
		ItemMeta scr1im = scr1.getItemMeta();
		scr1im.setDisplayName(ChatColor.LIGHT_PURPLE + "긴급 탈출 스크롤");
		scr1im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scr1.setItemMeta(scr1im);
		ArrayList<String> scr1Lore = new ArrayList();
		scr1Lore.add(ChatColor.GRAY + "레벨 제한: 490");
		scr1Lore.add(ChatColor.GRAY + " ");
		scr1Lore.add(ChatColor.GRAY + "포보르화 된 동물들이 가지고 있던 스크롤");
		scr1Lore.add(ChatColor.GRAY + "그들의 주인에게 이동할 수 있는 주문이 걸려있는 것 같다.");
		scr1Lore.add(ChatColor.GRAY + "사용 방법은 딱히 적혀있지 않다.");
		scr1im.setLore(scr1Lore);
		scr1.setItemMeta(scr1im);
		int scrP = rnd.nextInt(20);
		if(scrP == 0) {
			player.getInventory().addItem(scr1);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "긴급 탈출 스크롤" + ChatColor.WHITE + "을 획득했다.");
			
			QuestBoard cb = new QuestBoard();
			if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사막의 푸른 땅5===")) {
				int qNum = cb.getNum(player);
				cb.mq45_35(player, qNum + 1);
			}
		} 
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억3===")) {
			int qNum = cb.getNum(player);
			cb.eq3_2(player, qNum + 1);
		}
	}
	
	// 되살아난 피르볼그의 제사장
	public void mob226(Player player) {
		es.giveExp(player, 5500000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.GOLD + "엑스트라 퀘스트: 피르볼그의 제사장");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'피르볼그의 제사장' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		player.getInventory().addItem(scroll);
		sendMessage(player, ChatColor.GOLD + "엑스트라 퀘스트: 피르볼그의 제사장" + ChatColor.WHITE + "을 획득했다.");
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막-최종장===")) {
			int qNum = cb.getNum(player);
			cb.mq45_37(player, qNum + 1);
		}
	}
	
	// 중장갑 포보르
	public void mob227(Player player) {
		es.giveExp(player, 3000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");
	}
	
	// 포보르 사제
	public void mob228(Player player) {
		es.giveExp(player, 3000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");
	}
	
	// 미아즈마단 신입
	public void mob229(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2000000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단1===")) {
			int qNum = cb.getNum(player);
			cb.mq46_2(player, qNum + 1);
		}
	}
	
	// 섬을 좀먹는 벌레
	public void mob230(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2020000);
		
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
		
		int tmp = rnd.nextInt(15);
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
	}
	
	// 미아즈마단 단원
	public void mob231(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2025000);

		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단2===")) {
			int qNum = cb.getNum(player);
			cb.mq46_3(player, qNum + 1);
		}
	}
	
	// 정신이 나간 포로
	public void mob232(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2045000);
	}
	
	// 미아즈마단 보초병
	public void mob233(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2050000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단3===")) {
			int qNum = cb.getNum(player);
			cb.mq46_4(player, qNum + 1);
		}
	}
	
	// 미아즈마단 강화병
	public void mob234(Player player) {
		int num = rnd.nextInt(8) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2070000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단4===")) {
			int qNum = cb.getNum(player);
			cb.mq46_5(player, qNum + 1);
		}
	}
	
	// 불타는 석탄
	public void mob235(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2080000);
		
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
		
		int tmp = rnd.nextInt(15);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라파누이의 불청객===")) {
			int qNum = cb.getNum(player);
			cb.q23(player, qNum + 1);
		}
	}
	
	// 녹아내리는 불꽃
	public void mob236(Player player) {
		int num = rnd.nextInt(8) + 7;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2100000);
		
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
		
		int tmp = rnd.nextInt(15);
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
	}
	
	// 미아즈마단 이급 군인
	public void mob237(Player player) {
		int num = rnd.nextInt(9) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2115000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단5===")) {
			int qNum = cb.getNum(player);
			cb.mq46_6(player, qNum + 1);
		}
	}
	
	// 미아즈마단 일급 군인
	public void mob238(Player player) {
		int num = rnd.nextInt(9) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2150000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단6===")) {
			int qNum = cb.getNum(player);
			cb.mq46_7(player, qNum + 1);
		}
	}
	
	// 미아즈마단 간부
	public void mob239(Player player) {
		int num = rnd.nextInt(9) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2170000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단7===")) {
			int qNum = cb.getNum(player);
			cb.mq46_8(player, qNum + 1);
		}
	}
	
	// 미아즈마단 애완곰
	public void mob240(Player player) {
		int num = rnd.nextInt(9) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2222222);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마의 오른팔===")) {
			int qNum = cb.getNum(player);
			cb.q24(player, qNum + 1);
		}
	}

	// 미아즈마
	public void mob241(Player player) {
		int num = rnd.nextInt(9) + 8;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 7000000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미아즈마단8===")) {
			int qNum = cb.getNum(player);
			cb.mq46_9(player, qNum + 1);
		}
	}
	
	// 환영병
	public void mob242(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2270000);
		
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬1===")) {
			int qNum = cb.getNum(player);
			cb.mq47_1(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===환영하는 병사===")) {
			int qNum = cb.getNum(player);
			cb.q25(player, qNum + 1);
		}
	}
	
	// 타란튤라
	public void mob243(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2300000);
	}
	
	// 붉은 좀비
	public void mob244(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2320000);
		
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬2===")) {
			int qNum = cb.getNum(player);
			cb.mq47_2(player, qNum + 1);
		}
	}
	
	// 포자를 날리는 검은 버섯
	public void mob245(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2350000);
		
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
	}
	
	// 유혹하는 나무
	public void mob246(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2370000);
		
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
			cb.mq47_3(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===움직이지 않는 자===")) {
			int qNum = cb.getNum(player);
			cb.q26(player, qNum + 1);
		}
	}
	
	// 라히무호나의 핵
	public void mob247(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2400000);
		
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
	}
	
	// 재앙을 날리는 검은 버섯
	public void mob248(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2430000);
		
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
	}
	
	// 중급 파괴수
	public void mob249(Player player) {
		int num = rnd.nextInt(9) + 9;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2470000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===라히무호나 섬4===")) {
			int qNum = cb.getNum(player);
			cb.mq47_4(player, qNum + 1);
		}
	}
	
	// 녹색 슬라임
	public void mob250(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2550000);
	}
	
	// 천년의 요정
	public void mob251(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2580000);
	}
	
	// 독극 슬라임
	public void mob252(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2620000);
	}
	
	// 점액에 녹은 스켈레톤
	public void mob253(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2650000);
		
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
	}
	
	// 슬라임에게 패배한 모험가
	public void mob254(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2680000);
	}
	
	// 멜랑콜리
	public void mob255(Player player) {
		int num = rnd.nextInt(9) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2710000);
	}
	
	// 와우
	public void mob256(Player player) {
		int num = 30;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 8000000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "깊숙한 점액 동굴 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "깊숙한 점액 동굴 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 3819 && loc.getY() <= 76 && loc.getZ() <= 2581 
						&& loc.getX() >= 3740 && loc.getY() >= 30 && loc.getZ() >= 2479) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "깊숙한 점액 동굴 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 바다의 포보르
	public void mob257(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2510000);
		
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
		
		int tmp = rnd.nextInt(10);
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
	}
	
	// 익사한 포보르
	public void mob258(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2550000);
		
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
		
		int tmp = rnd.nextInt(10);
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
	}
	
	// 죄수의 유해
	public void mob259(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2580000);
	}
	
	// 불타는 영혼
	public void mob260(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2620000);
	}
	
	// 무역 상인의 라마
	public void mob261(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2640000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
		}
	}
	
	// 감금된 곰
	public void mob262(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2690000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.RABBIT);
		}
	}
	
	// 도둑 토끼
	public void mob263(Player player) {
		int num = rnd.nextInt(10) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4500000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===사라진 닻===")) {
			int qNum = cb.getNum(player);
			cb.mq48_1(player, qNum + 1);
		}
	}
	
	// 떠도는 포보르
	public void mob264(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2680000);
		
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
		
		int tmp = rnd.nextInt(10);
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
	}
	
	// 정신나간 마법사
	public void mob265(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2710000);
	}
	
	// 야생 곰
	public void mob266(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2720000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련1===")) {
			int qNum = cb.getNum(player);
			cb.mq48_4(player, qNum + 1);
		}
	}
	
	// 야생 토끼
	public void mob267(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2755000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===백일몽 토끼===")) {
			int qNum = cb.getNum(player);
			cb.q27(player, qNum + 1);
		}
	}
	
	// 도살자
	public void mob268(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2770000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련2===")) {
			int qNum = cb.getNum(player);
			cb.mq48_5(player, qNum + 1);
		}
	}
	
	// 사라진 동물의 영혼
	public void mob269(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2810000);
	}
	
	// 464
	public void mob270(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2820000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
	}
	
	// 팬더
	public void mob271(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2860000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련3===")) {
			int qNum = cb.getNum(player);
			cb.mq48_6(player, qNum + 1);
		}
	}

	// 솟
	public void mob272(Player player) {
		int num = rnd.nextInt(10) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4200000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===위 러브 팬더===")) {
			int qNum = cb.getNum(player);
			cb.q28(player, qNum + 1);
		}
	}
	
	// 마을 앞 슬라임
	public void mob273(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2870000);
	}
	
	// 가면을 쓴 좀비
	public void mob274(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2910000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련4===")) {
			int qNum = cb.getNum(player);
			cb.mq48_7(player, qNum + 1);
		}
	}
	
	// 마을을 보는 마녀
	public void mob275(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2920000);
	}
	
	// 엘보코로나
	public void mob276(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2965000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련5===")) {
			int qNum = cb.getNum(player);
			cb.mq48_8(player, qNum + 1);
		}
	}
	
	// 땅벌레
	public void mob277(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 2980000);
	}
	
	// 땅거미
	public void mob278(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3020000);
	}
	
	// 초록 괴물
	public void mob279(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3030000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련6===")) {
			int qNum = cb.getNum(player);
			cb.mq48_9(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===초록의 그 녀석===")) {
			int qNum = cb.getNum(player);
			cb.q29(player, qNum + 1);
		}
		
	}
	
	// 요새를 지키는 곰
	public void mob280(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3070000);
	}
	
	// 요새를 지키는 불꽃
	public void mob281(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3080000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련7===")) {
			int qNum = cb.getNum(player);
			cb.mq48_10(player, qNum + 1);
		}
	}
	
	// 모히칸 좀비
	public void mob282(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3130000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련8===")) {
			int qNum = cb.getNum(player);
			cb.mq48_11(player, qNum + 1);
		}
	}
	
	// 카케
	public void mob283(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3140000);
		
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
		
		int tmp = rnd.nextInt(10);
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
	}
	
	// 요새의 궁수병
	public void mob284(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3180000);
		
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
		
		int tmp = rnd.nextInt(10);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===리로이의 시련9===")) {
			int qNum = cb.getNum(player);
			cb.mq48_12(player, qNum + 1);
		}
	}
	
	// 검은 수염단 장교
	public void mob285(Player player) {
		es.giveExp(player, 3100000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	// 검은 수염단 엘리트
	public void mob286(Player player) {
		es.giveExp(player, 3200000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	// 검은 수염의 고양이
	public void mob287(Player player) {
		es.giveExp(player, 3250000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===귀여운 고양이===")) {
			int qNum = cb.getNum(player);
			cb.q30(player, qNum + 1);
		}
	}
	
	// 폭주한 검은 수염
	public void mob288(Player player) {
		es.giveExp(player, 3500000);
		
		int num1 = rnd.nextInt(7);
		if (num1 <= 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(16);
			player.getInventory().addItem(weapon);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "폭주의 근원" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염===")) {
			int qNum = cb.getNum(player);
			cb.mq48_14(player, qNum + 1);
		}
	}
	
	// 신전을 지키는 괴물
	public void mob289(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3200000);
	}
	
	// 고대의 시체
	public void mob290(Player player) {
		int num = rnd.nextInt(10) + 11;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3250000);
	}
	
	// 뭉쳐진 포보르의 장기
	public void mob291(Player player) {
		es.giveExp(player, 3200000);
		
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
		
		int tmp = rnd.nextInt(10);
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
	}
	
	// 타락한 영웅의 갑옷
	public void mob292(Player player) {
		es.giveExp(player, 5000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_STAIRS, 2);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔");
		var1.setItemMeta(var1im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.LIGHT_PURPLE + "최상급 포보르의 뿔" + ChatColor.WHITE + "을 획득했다.");
	}
	
	// 썩은 공양물
	public void mob293(Player player) {
		es.giveExp(player, 3000000);
	}
	
	// 공양을 받는 돼지
	public void mob294(Player player) {
		int num = 40;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 6200000);
		
		ItemStack rewardKey = new ItemStack(Material.IRON_NUGGET);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "의문의 사리");
		ArrayList<String> keyLore = new ArrayList();
		keyLore.add(ChatColor.GRAY + "돼지의 몸 안에서 나온 사리");
		keyLore.add(ChatColor.GRAY + "어째서 돼지의 몸 안에서 나온 것인지는 모르겠다.");
		rewardKeyIm.setLore(keyLore);
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "의문의 사리" + ChatColor.WHITE + "을 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 30, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 3753 && loc.getY() <= 108 && loc.getZ() <= 2434 
						&& loc.getX() >= 3713 && loc.getY() >= 80 && loc.getZ() >= 2376) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "의문의 사리" + ChatColor.WHITE + "을 획득했다.");
				}
			}
		}
	}

	// 오징어 마법사
	public void mob295(Player player) {
		es.giveExp(player, 4500000);
	}
	
	// 금붕어 아처
	public void mob296(Player player) {
		es.giveExp(player, 4510000);
	}
	
	// 고등어 전사
	public void mob297(Player player) {
		es.giveExp(player, 4520000);
	}
	
	// 인간형 가디언
	public void mob298(Player player) {
		es.giveExp(player, 4530000);
	}
	
	// 어린 복어 병사
	public void mob299(Player player) {
		es.giveExp(player, 4540000);
	}
	
	// 아빠 상어
	public void mob300(Player player) {
		es.giveExp(player, 6000000);
	}
	
	// 엄마 상어
	public void mob301(Player player) {
		es.giveExp(player, 4550000);
	}
	
	// 해왕신 포세이돈
	public void mob302(Player player) {
		es.giveExp(player, 10000000);
		
		ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta rewardKeyIm = rewardKey.getItemMeta();
		rewardKeyIm.setDisplayName(ChatColor.YELLOW + "잊혀진 바다 신전 하드 보상 열쇠");
		rewardKey.setItemMeta(rewardKeyIm);
		player.getInventory().addItem(rewardKey);
		sendMessage(player, ChatColor.YELLOW + "잊혀진 바다 신전 하드 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");

		List<Entity> entitylist = player.getNearbyEntities(50, 50, 50);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				Location loc = nearPlayer.getLocation();
				if (loc.getX() <= 3672 && loc.getY() <= 200 && loc.getZ() <= 4058 
						&& loc.getX() >= 3617 && loc.getY() >= 150 && loc.getZ() >= 4005) {
					nearPlayer.getInventory().addItem(rewardKey);
					sendMessage(nearPlayer, ChatColor.YELLOW + "잊혀진 바다 신전 하드 보상 열쇠" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		}
	}
	
	// 아기 상어
	public void mob303(Player player) {
		es.giveExp(player, 4500000);
	}
	
	// 검은 흐름에 잠식된 주민
	public void mob304(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3240000);
		
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
		
		int tmp = rnd.nextInt(8);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅2===")) {
			int qNum = cb.getNum(player);
			cb.mq49_2(player, qNum + 1);
		}
	}
	
	// 검은 흐름에 잠식된 주민
	public void mob305(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3300000);
		
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
		
		int tmp = rnd.nextInt(8);
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
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅2===")) {
			int qNum = cb.getNum(player);
			cb.mq49_2(player, qNum + 1);
		}
	}
	
	// 주인을 잃은 라마
	public void mob306(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3310000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅4===")) {
			int qNum = cb.getNum(player);
			cb.mq49_4(player, qNum + 1);
		}
	}

	// 자아를 잃은 라마 주인
	public void mob307(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3355000);
	}
	
	// 페라리교의 신도
	public void mob308(Player player) {
		int num = rnd.nextInt(15) + 12;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3370000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===성 밖의 이단===")) {
			int qNum = cb.getNum(player);
			cb.q31(player, qNum + 1);
		}
	}
	
	// 페라리교의 상위 신도
	public void mob309(Player player) {
		int num = rnd.nextInt(15) + 12;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3420000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===성 밖의 이단===")) {
			int qNum = cb.getNum(player);
			cb.q31(player, qNum + 1);
		}
	}
	
	// 페라리교의 교주
	public void mob310(Player player) {
		int num = 44;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 5000000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅6===")) {
			int qNum = cb.getNum(player);
			cb.mq49_6(player, qNum + 1);
		} else if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===성 밖의 이단===")) {
			int qNum = cb.getNum(player);
			cb.q31(player, qNum + 1);
		}
	}
	
	// 인어
	public void mob311(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3430000);
	}
	
	// 물풍선
	public void mob312(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3480000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===워터파크===")) {
			int qNum = cb.getNum(player);
			cb.q32(player, qNum + 1);
		}
	}
	
	// 어푸
	public void mob313(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3490000);
	}
	
	// 아푸
	public void mob314(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3540000);
	}
	
	// 철을 먹는 벌레
	public void mob315(Player player) {
		es.giveExp(player, 3550000);
		
		int num1 = rnd.nextInt(10);
		if (num1 <= 2) {
			ItemStack var1 = new ItemStack(Material.IRON_INGOT);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "빛이나는 철");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.LIGHT_PURPLE + "빛이나는 철" + ChatColor.WHITE + "을 획득했다.");
		} else if (num1 == 3) {
			ItemStack var1 = new ItemStack(Material.IRON_INGOT);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.AQUA + "순백의 철");
			var1.setItemMeta(var1Im);
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "순백의 철" + ChatColor.WHITE + "을 획득했다.");
		} 
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===철분 덩어리===")) {
			int qNum = cb.getNum(player);
			cb.q33(player, qNum + 1);
		}
	}
	
	// 쑥을 먹는 곰
	public void mob316(Player player) {
		es.giveExp(player, 3600000);	
		
		int tmp2 = rnd.nextInt(30);
		if(tmp2 == 0) {
			Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
			Block block = chestLoc.getBlock();
			Chest chest = (Chest) block.getState();
			ItemStack weapon = chest.getInventory().getItem(20);
			player.getInventory().addItem(weapon);
			player.sendMessage(ChatColor.LIGHT_PURPLE + "쑥" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 떠돌이 고양이
	public void mob317(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3610000);
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅8===")) {
			int qNum = cb.getNum(player);
			cb.mq49_8(player, qNum + 1);
		}
	}
	
	// 위더 스켈레톤
	public void mob318(Player player) {
		int num = rnd.nextInt(15) + 10;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3660000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 화염의 조종자
	public void mob319(Player player) {
		int num = rnd.nextInt(15) + 13;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3670000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서3===")) {
			int qNum = cb.getNum(player);
			cb.mq50_3(player, qNum+1);	
		}
	}
	
	// 귀여움의 조종자
	public void mob320(Player player) {
		int num = rnd.nextInt(15) + 13;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3720000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===주문은 토끼입니까?===")) {
			int qNum = cb.getNum(player);
			cb.q34(player, qNum + 1);
		} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서4===")) {
			int qNum = cb.getNum(player);
			cb.mq50_4(player, qNum+1);	
		}
	}
	
	// 대지의 조종자
	public void mob321(Player player) {
		int num = rnd.nextInt(15) + 13;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3730000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서5===")) {
			int qNum = cb.getNum(player);
			cb.mq50_5(player, qNum+1);	
		}
	}
	
	// 포션의 조종자
	public void mob322(Player player) {
		int num = rnd.nextInt(15) + 13;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3780000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서6===")) {
			int qNum = cb.getNum(player);
			cb.mq50_6(player, qNum+1);	
		}
	}
	
	// 포보르의 체액
	public void mob323(Player player) {
		int num = rnd.nextInt(15) + 14;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3790000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		int tmp = rnd.nextInt(7);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 포보르화 고블린
	public void mob324(Player player) {
		int num = rnd.nextInt(15) + 14;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3840000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
	}
	
	// 포보르화 모험가
	public void mob325(Player player) {
		int num = rnd.nextInt(10) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3860000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
		
		QuestBoard cb = new QuestBoard();
		if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===흐콰===")) {
			int qNum = cb.getNum(player);
			cb.q35(player, qNum + 1);
		} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서7===")) {
			int qNum = cb.getNum(player);
			cb.mq50_7(player, qNum+1);	
		}
	}

	// 포보르화 오크
	public void mob326(Player player) {
		int num = rnd.nextInt(15) + 14;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3910000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		int tmp = rnd.nextInt(12);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	// 포보르라고 불리는 포보르
	public void mob327(Player player) {
		int num = rnd.nextInt(15) + 30;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 5700000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 무리에서 쫒겨난 궁수
	public void mob328(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3800000);
	}
	
	// 무리에서 쫒겨난 전사
	public void mob329(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3830000);
	}
	
	// 무리에서 쫒겨난 마법사
	public void mob330(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3840000);
	}
	
	// 무리에서 쫒겨난 정예병사
	public void mob331(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3880000);
	}
	
	// 반란을 두려워하는 귀족
	public void mob332(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3890000);
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===의적===")) {
			int qNum = cb.getNum(player);
			cb.q36(player, qNum+1);	
		}
	}
	
	// 귀족을 지키는 호위무사
	public void mob333(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3930000);
	}
	
	// 족장을 지키는 것
	public void mob334(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3945000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서9===")) {
			int qNum = cb.getNum(player);
			cb.mq50_9(player, qNum+1);	
		}
	}
	
	// 족장의 벗
	public void mob335(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3980000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.HUSK);
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서9===")) {
			int qNum = cb.getNum(player);
			cb.mq50_9(player, qNum+1);	
		}
	}
	
	// 족장 <바람을 가르는 늑대>
	public void mob336(Player player) {
		es.giveExp(player, 5500000);
		
		ItemStack var1 = new ItemStack(Material.GOLD_INGOT, 10);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.AQUA + "쉽게 녹지 않는 금");
		var1.setItemMeta(var1Im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.AQUA + "쉽게 녹지 않는 금" + ChatColor.WHITE + " 10개를 획득했다.");
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===싸우는 자1===")) {
			int qNum = cb.getNum(player);
			cb.q40(player, qNum+1);	
		}
	}
	
	// 야생 곰
	public void mob337(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3970000);
	}
	
	// 야생 토끼
	public void mob338(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4000000);
	}
	
	// 변이된 원시의 땅 보초병
	public void mob339(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4020000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(30);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===족장을 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q37(player, qNum+1);	
		} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅2===")) {
			int qNum = cb.getNum(player);
			cb.mq51_1(player, qNum+1);	
		}
	}

	// 변이된 원시의 땅 보초병
	public void mob340(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4050000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(30);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===족장을 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q37(player, qNum+1);	
		} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅2===")) {
			int qNum = cb.getNum(player);
			cb.mq51_1(player, qNum+1);	
		}
	}
	
	// 변이된 원시의 땅 상급병
	public void mob341(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4060000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(25);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅3===")) {
			int qNum = cb.getNum(player);
			cb.mq51_2(player, qNum+1);	
		}
	}
	
	// 변이된 원시의 땅 정예병
	public void mob342(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4080000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(25);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅4===")) {
			int qNum = cb.getNum(player);
			cb.mq51_3(player, qNum+1);	
		}
	}
	
	// 변이된 원시의 땅 귀족
	public void mob343(Player player) {
		int num = rnd.nextInt(10) + 25;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 3980000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(50);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 변이의 근원
	public void mob344(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4030000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(20);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===원인 해결===")) {
			int qNum = cb.getNum(player);
			cb.q38(player, qNum+1);	
		}
	}
	
	// 귀족의 벗
	public void mob345(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4120000);
	}
	
	// 미지의 땅을 지키는 것
	public void mob346(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4120000);
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===길을 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q39(player, qNum+1);	
		}
	}
	
	// 미지의 땅을 지키는 것
	public void mob347(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4160000);
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===길을 지키는 자===")) {
			int qNum = cb.getNum(player);
			cb.q39(player, qNum+1);	
		}
	}
	
	// 변이된 첨예발톱
	public void mob348(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4100000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		int tmp = rnd.nextInt(18);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅6===")) {
			int qNum = cb.getNum(player);
			cb.mq51_5(player, qNum+1);	
		}
	}
	
	// 최면을 거는 포보르
	public void mob349(Player player) {
		int num = rnd.nextInt(15) + 15;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4130000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.SKELETON);
		}
	}
	
	// 족장 <붉은 날개>
	public void mob350(Player player) {
		es.giveExp(player, 7000000);
		
		ItemStack var1 = new ItemStack(Material.DIAMOND, 10);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.AQUA + "다이아몬드");
		var1.setItemMeta(var1Im);
		player.getInventory().addItem(var1);
		sendMessage(player, ChatColor.AQUA + "다이아몬드" + ChatColor.WHITE + " 10개를 획득했다.");
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===싸우는 자2===")) {
			int qNum = cb.getNum(player);
			cb.q40_1(player, qNum+1);	
		} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅8===")) {
			int i = 0;
			Inventory inv = player.getInventory();
			for (int j = 0 ; j < 36 ; j++) {
				if(inv.getItem(j) == null) {
					i++;
				}
			}
			if(i != 0) {
				int qNum = cb.getNum(player);
				cb.mq51_7(player, qNum+1);	
			}
		}
	}
	
	// 원시 벌레
	public void mob351(Player player) {
		es.giveExp(player, 4600000);
	}
	
	// 원시 거미
	public void mob352(Player player) {
		es.giveExp(player, 4650000);
	}
	
	// 원시 불꽃
	public void mob353(Player player) {
		es.giveExp(player, 4700000);
	}
	
	// 원시 생물
	public void mob354(Player player) {
		es.giveExp(player, 4750000);
	}
	
	// 숲의 감시자
	public void mob355(Player player) {
		es.giveExp(player, 4580000);
	}
	
	// 숲의 젤리
	public void mob356(Player player) {
		es.giveExp(player, 4590000);
	}
	
	// 숲의 고름
	public void mob357(Player player) {
		es.giveExp(player, 4600000);
	}
	
	// 숲의 거목
	public void mob358(Player player) {
		es.giveExp(player, 4610000);
	}
	
	// 숲의 정령
	public void mob359(Player player) {
		es.giveExp(player, 4500000);
	}
	
	// 숲의 심판자
	public void mob360(Player player) {
		es.giveExp(player, 8000000);
	}
	
	// 얼어붙은 나무
	public void mob361(Player player) {
		int num = rnd.nextInt(16) + 16;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4200000);
	}
	
	// 상급 파괴수
	public void mob362(Player player) {
		int num = rnd.nextInt(16) + 16;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4230000);
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===고대 생물, 파괴수===")) {
			int qNum = cb.getNum(player);
			cb.q41(player, qNum+1);	
		}
	}
	
	// 얼어붙은 시체
	public void mob363(Player player) {
		int num = rnd.nextInt(16) + 16;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4260000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var4.setItemMeta(var4im);
		
		int tmp = rnd.nextInt(13);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 성스러운 거미
	public void mob364(Player player) {
		int num = rnd.nextInt(16) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4290000);
	}
	
	// 성스러운 불꽃
	public void mob365(Player player) {
		int num = rnd.nextInt(16) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4320000);
	}
	
	// 떠돌이 나비
	public void mob366(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4350000);
	}
	
	// 동상에 걸린 돼지
	public void mob367(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4380000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(15);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 설원 거미
	public void mob368(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4410000);
	}
	
	// 어둠을 구원한 영웅
	public void mob369(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 8000000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var4.setItemMeta(var4im);
		
		ItemStack var5 = new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE);
		ItemMeta var5im = var5.getItemMeta();
		var5im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 심장");
		var5.setItemMeta(var5im);
		
		int tmp = rnd.nextInt(5);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 4) {
			player.getInventory().addItem(var5);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 심장" + ChatColor.WHITE + "을 획득했다.");
		}
	}
	
	// 인간 사냥꾼
	public void mob370(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4400000);
		
		ItemStack var1 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var1im = var1.getItemMeta();
		var1im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var1.setItemMeta(var1im);
		
		ItemStack var2 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
		ItemMeta var2im = var2.getItemMeta();
		var2im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var2.setItemMeta(var2im);
		
		ItemStack var3 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		ItemMeta var3im = var3.getItemMeta();
		var3im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var3.setItemMeta(var3im);
		
		ItemStack var4 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
		ItemMeta var4im = var4.getItemMeta();
		var4im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var4.setItemMeta(var4im);
		
		int tmp = rnd.nextInt(13);
		if(tmp == 0) {
			player.getInventory().addItem(var1);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 피" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 1) {
			player.getInventory().addItem(var2);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 쓸개" + ChatColor.WHITE + "를 획득했다.");
		} else if(tmp == 2) {
			player.getInventory().addItem(var3);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 살점" + ChatColor.WHITE + "을 획득했다.");
		} else if(tmp == 3) {
			player.getInventory().addItem(var4);
			sendMessage(player, ChatColor.AQUA + "심연의 포보르의 간" + ChatColor.WHITE + "을 획득했다.");
		}
		
		QuestBoard cb = new QuestBoard();
		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===레드 플레이어===")) {
			int qNum = cb.getNum(player);
			cb.q42(player, qNum+1);	
		}
	}
	
	// 웨곤
	public void mob371(Player player) {
		int num = rnd.nextInt(17) + 17;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 4500000);
	}
	
	// 시간
	public void mob372(Entity mob, Player player) {
		if(rnd.nextInt(10) == 0) {
			ItemStack var1 = new ItemStack(Material.BREWING_STAND);
			ItemMeta var1Im = var1.getItemMeta();
			var1Im.setDisplayName(ChatColor.YELLOW + "시간을 넘는 힘");
			var1.setItemMeta(var1Im);
			player.getWorld().dropItem(mob.getLocation(), var1);
		}
	}
	
	// 섬을 탈출하고 싶은 노예
	public void mob373(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 6) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 7) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 8) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 9) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 10) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 12) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 15) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 5) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	// 노예를 관리하는 노예
	public void mob374(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 8) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 9) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 10) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 12) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 14) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 17) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 20) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 7) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	// 마을을 꾸미고 있는 노예
	public void mob375(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 11) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 12) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 13) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 15) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 17) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 20) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 23) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 10) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	// 산타를 보좌하는 요정 노예
	public void mob376(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 22) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 24) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 26) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 28) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 31) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 33) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 35) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 20) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	// 살아남은 루돌프
	public void mob377(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 54) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 58) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 62) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 68) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 74) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 80) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 90) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 50) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
		}
	}
	
	// 산타
	public void mob378(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 20) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 25) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 30) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 35) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 40) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 45) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 50) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 15) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(3);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.AQUA + "화려한 선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	// 반란을 계획중인 노예
	public void mob379(Player player) {
		try {
			if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "버려진 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 22) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 24) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "빛나는 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 26) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "황금의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 28) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "영광의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 31) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "산타의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 33) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "신의 크리스마스 검")) {
				int tmp = rnd.nextInt(100);
				if(tmp < 35) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			} else {
				int tmp = rnd.nextInt(100);
				if(tmp < 20) {
					Location chestLoc = new Location(player.getWorld(), -1831, 92, 3036);
					Block wheat = chestLoc.getBlock();
					Chest chest = (Chest) wheat.getState();
					ItemStack weapon = chest.getInventory().getItem(2);
					player.getInventory().addItem(weapon);
					sendMessage(player, ChatColor.LIGHT_PURPLE + "선물 상자" + ChatColor.WHITE + "를 획득했다.");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	// 존재하면 안되는 존재
	public void mob380(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 9100000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	// 게임의 오류
	public void mob381(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 9200000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	// ^(!$@#!
	public void mob382(Player player) {
		int num = 64;
		ItemStack item = new ItemStack(Material.SCUTE, num * multyEme);
		ItemMeta im = item.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		item.setItemMeta(im);
		player.getInventory().addItem(item);
		es.giveExp(player, 9300000);
		
		int tmp2 = rnd.nextInt(40);
		if(tmp2 == 0) {
			Location loc = player.getLocation().add(0, 1, 0);
			loc.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
		}
	}
	
	public void mob383(Player player) {

	}
	
	public void mob384(Player player) {

	}
	
	public void mob385(Player player) {

	}
	
	public void mob386(Player player) {

	}
	
	public void mob387(Player player) {

	}
	
	public void mob388(Player player) {

	}
	
	public void mob389(Player player) {

	}
	
	public void mob390(Player player) {

	}
	
	
}
