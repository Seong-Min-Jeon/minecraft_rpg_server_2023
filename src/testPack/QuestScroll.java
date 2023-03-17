package testPack;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class QuestScroll {
	
	private Message msg = new Message();

	public void quest(Player player, ItemStack itemArg) {
		World world = player.getWorld();
		QuestBoard qb = new QuestBoard();
		if(itemArg.getType() == Material.GLOBE_BANNER_PATTERN) {
			if(qb.getQuestName(player)==null) {
				q1(player, itemArg, world);
				q2(player, itemArg, world);
				q3(player, itemArg, world);
				q4(player, itemArg, world);
				mq_last(player, itemArg, world);
				itemArg.setAmount(itemArg.getAmount()-1);
			} else {
				player.sendMessage(ChatColor.RED + "이미 퀘스트가 진행되고 있습니다.");
				player.sendMessage(ChatColor.RED + "기존 퀘스트를 완료하고 사용해주세요.");				
			}
		}
		
	}
	
	public void q1(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "퀘스트: 해안의 위협")) {
			msg.msg(player, "§7§e해안가 좀비§7를 소탕해 배를 지키자.");
			QuestBoard qb = new QuestBoard();
			qb.q1(player, 0);
		}	
	}
	
	public void q2(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 해적선의 보물")) {
			msg.msg(player, "§7워그닐 앞바다에 §e해적선§7이 출몰한다는 정보다 들어왔다.%§7해적들을 피해 §e보물상자§7를 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.q2(player, 0);
		}	
	}
	
	public void q3(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GRAY + "퀘스트: 포보르의 말단")) {
			msg.msg(player, "§7포보르와의 전투를 유리하게 이끌 수 있도록 실전 경험을 쌓아보자.%§7마침 이 근방에 포보르 중 가장 약한 §e크리스탈 워리어§7가 존재한다고 한다.");
			QuestBoard qb = new QuestBoard();
			qb.q3(player, 0);
		}	
	}
	
	public void q4(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 밀 사냥꾼")) {
			msg.msg(player, "§7포르간의 밀 밭을 망치는 주범을 발견했다.%§7그들을 신속히 처리하자.");
			QuestBoard qb = new QuestBoard();
			qb.q4(player, 0);
		}	
	}
	
	public void mq_last(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 마지막장")) {
			msg.msg(player, "데히트라: 여어.%데히트라: 어른의 사정으로 내가 너랑 만나는건 이게 마지막이다.%데히트라: 내가 사실 마왕이다.%데히트라: 나는 너의 과거이자, 미래의 너.%"
					+ "데히트라: 이 시간의 균열을 바로잡기 위해서는 네놈이 나를 죽여야하지.%데히트라: 지금까지의 세계에서는 날 죽인 네놈 따윈 없었다.%"
					+ "데히트라: 나를 부를 수 있는 피리를 주지.%데히트라: 그것을 정해진 장소에 와서 사용하거라.%"
					+ "네비: 오랜만이야 친구.%네비: 이제 진짜 끝이구나아.%네비: 화이팅!"
					+ "카타리나: 어머어머, 이제 마왕을 쓰러뜨리러 가는건가요?.%카타리나: 화이팅이에요!%니세리나: 마왕?%"
					+ "니세리나: 걔 내 부하야.%니세리나: 엄청 약하니까 너가 이길 거라구?%꼬마: 후엥.%"
					+ "꼬마: 후에에에엥.%로미오: 우리의 땅을 지켜준 당신이라면 마왕을 이길 겁니다.%빨간모자: 내가 만든 약을 마시면 모든게 편해질거야!%"
					+ "얼음 장인: 다음에 아란모어에 오면 나에게 꼭 오시게.%양털반지: 도트찍기 싫어어~%타페야라: 평지를 만들자.%아킬레: 그래서 대화 언제 끝나.%"
					+ "준: 신화템 없이 가도 되나여.%히나: 그림리퍼로 깰 수 있나여.%와이: 마왕 너무 약한거 같은데?%유메하마: 패턴 보고 피하시면 잡음.");
			QuestBoard qb = new QuestBoard();
			qb.mq_last(player, 0);
		}	
	}
	
}