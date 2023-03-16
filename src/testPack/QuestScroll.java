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
				q5(player, itemArg, world);
				q6(player, itemArg, world);
				q7(player, itemArg, world);
				q8(player, itemArg, world);
				q9(player, itemArg, world);
				q10(player, itemArg, world);
				q11(player, itemArg, world);
				q12(player, itemArg, world);
				q13(player, itemArg, world);
				q14(player, itemArg, world);
				q15(player, itemArg, world);
				q16(player, itemArg, world);
				q17(player, itemArg, world);
				q18(player, itemArg, world);
				q19(player, itemArg, world);
				q20(player, itemArg, world);
				q21(player, itemArg, world);
				q22(player, itemArg, world);
				q23(player, itemArg, world);
				q24(player, itemArg, world);
				q25(player, itemArg, world);
				q26(player, itemArg, world);
				q27(player, itemArg, world);
				q28(player, itemArg, world);
				q29(player, itemArg, world);
				q30(player, itemArg, world);
				q31(player, itemArg, world);
				q32(player, itemArg, world);
				q33(player, itemArg, world);
				q34(player, itemArg, world);
				q35(player, itemArg, world);
				q36(player, itemArg, world);
				q37(player, itemArg, world);
				q38(player, itemArg, world);
				q39(player, itemArg, world);
				q40(player, itemArg, world);
				q41(player, itemArg, world);
				q42(player, itemArg, world);
				eq1(player, itemArg, world);
				eq2(player, itemArg, world);
				eq3(player, itemArg, world);
				mq1(player, itemArg, world);
				mq2(player, itemArg, world);
				mq3(player, itemArg, world);
				mq4(player, itemArg, world);
				mq5(player, itemArg, world);
				mq6(player, itemArg, world);
				mq7(player, itemArg, world);
				mq8(player, itemArg, world);
				mq9(player, itemArg, world);
				mq10(player, itemArg, world);
				mq11(player, itemArg, world);
				mq12(player, itemArg, world);
				mq13(player, itemArg, world);
				mq14(player, itemArg, world);
				mq15(player, itemArg, world);
				mq16(player, itemArg, world);
				mq17(player, itemArg, world);
				mq18(player, itemArg, world);
				mq19(player, itemArg, world);
				mq20(player, itemArg, world);
				mq21(player, itemArg, world);
				mq22(player, itemArg, world);
				mq23(player, itemArg, world);
				mq24(player, itemArg, world);
				mq25(player, itemArg, world);
				mq26(player, itemArg, world);
				mq27(player, itemArg, world);
				mq28(player, itemArg, world);
				mq29(player, itemArg, world);
				mq30(player, itemArg, world);
				mq31(player, itemArg, world);
				mq32(player, itemArg, world);
				mq33(player, itemArg, world);
				mq34(player, itemArg, world);
				mq35(player, itemArg, world);
				mq36(player, itemArg, world);
				mq37(player, itemArg, world);
				mq38(player, itemArg, world);
				mq39(player, itemArg, world);
				mq40(player, itemArg, world);
				mq41(player, itemArg, world);
				mq42(player, itemArg, world);
				mq43(player, itemArg, world);
				mq44(player, itemArg, world);
				mq45(player, itemArg, world);
				mq46(player, itemArg, world);
				mq47(player, itemArg, world);
				mq48(player, itemArg, world);
				mq48_18(player, itemArg, world);
				mq49(player, itemArg, world);
				mq50(player, itemArg, world);
				mq51(player, itemArg, world);
				mq52(player, itemArg, world);
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
	
	public void q5(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 침략자")) {
			msg.msg(player, "§7숲 속 쉼터가 습격 받았다고 한다.%§7그들을 처리해 주민들의 불안함을 없애주자.");
			QuestBoard qb = new QuestBoard();
			qb.q5(player, 0);
		}	
	}
	
	public void q6(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 숲 깊은 곳")) {
			msg.msg(player, "§7§e숲의 유적§7에서 보물을 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.q6(player, 0);
		}	
	}

	public void q7(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 유적을 정화하는 자")) {
			msg.msg(player, "§7§e숲의 유적§7의 몬스터들이 난폭해졌다는 소문이 있다.%§7유적을 클리어해서 정화하도록 하자.");
			QuestBoard qb = new QuestBoard();
			qb.q7(player, 0);
		}	
	}
	
	public void q8(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 같아보이지만 다른")) {
			msg.msg(player, "§7§e고블린§7과 §e오크§7는 닮아보이지만%§7뿌리부터 다른 몬스터이다.%§7보통 오크가 더 강하다.");
			QuestBoard qb = new QuestBoard();
			qb.q8(player, 0);
		}	
	}
	
	public void q9(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 포보르의 위협")) {
			msg.msg(player, "§7포보르의 정찰대를 무찌르자.");
			QuestBoard qb = new QuestBoard();
			qb.q9(player, 0);
		}	
	}
	
	public void q10(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 탈환")) {
			msg.msg(player, "§7§e미푀르유 성§7을 탈환하기 위해 전투하자.");
			QuestBoard qb = new QuestBoard();
			qb.q10(player, 0);
		}	
	}
	
	public void q11(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 네크로벨리")) {
			msg.msg(player, "§7최근 §e묘지기§7들이 §e사라진 포보르의 왕§7을 부활시키려고 한다는 소문이 있다.%§7아직 그들은 포보르 왕의 시체를 찾지 못한 것으로 추정된다.%§7빠르게 그들을 처단하자.");
			QuestBoard qb = new QuestBoard();
			qb.q11(player, 0);
		}	
	}
	
	public void q12(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 데빌 인자")) {
			msg.msg(player, "§7노력없이 성장하기 위해 악을 택하는 사람들은%§7예로부터 많이 존재했다.%§7그러한 분파들은 탐욕의 결과로 대부분 소멸하였지만,%§7아직까지 남아있는 집단이 있다.%§7사람들은 그들을 §e데빌§7이라고 부르며,%§7그들을 강해지게 만드는 힘의 근원을 §e데빌 인자§7라고 부른다.%"
					+ "§7그들은 더욱 강한 힘을 얻기 위해 계속된 인간 사냥을 하고 있다.%§7그들에게 인간의 강함을 보여주도록 하자.");
			QuestBoard qb = new QuestBoard();
			qb.q12(player, 0);
		}	
	}
	
	public void q13(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 새로운 고블린")) {
			msg.msg(player, "§7푸르 평원에 도달하니 새로운 종류의 고블린들을 볼 수 있었다.%§7흐음...%§7오크보다 강한 고블린은 처음 보는군!");
			QuestBoard qb = new QuestBoard();
			qb.q13(player, 0);
		}	
	}
	
	public void q14(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 불의 악마")) {
			msg.msg(player, "§7과거 움직이는 성에 불의 악마가 살고 있었다고 한다.%§7마법사와 계약을 해 그의 심장을 먹고 강력해진 이 악마는%§7후에 분열하여 지금의 모습을 하게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q14(player, 0);
		}	
	}
	
	public void q15(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 방해받은 파괴수의 잠I")) {
			msg.msg(player, "§7파괴수는 예로부터 주민 마을을 파괴하는 생명체였다.%§7그들에게 플레이어의 힘을 보여주자.");
			QuestBoard qb = new QuestBoard();
			qb.q15(player, 0);
		}	
	}
	
	public void q16(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 묘지를 지키는 자")) {
			msg.msg(player, "§7묘지기 몬스터들은 묘지를 지키는 습성이 있다.%§7하지만 그들은 자신들의 무덤을 이용해 모험가들을 혼란에 빠뜨리고 있다.");
			QuestBoard qb = new QuestBoard();
			qb.q16(player, 0);
		}	
	}
	
	public void q17(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 폭탄병")) {
			msg.msg(player, "TNTZ 터진다.%퍼퍼펖퍼ㅓㅍ퍼퍼퍼퍼퍼펑%§7...이라고 써있다.");
			QuestBoard qb = new QuestBoard();
			qb.q17(player, 0);
		}	
	}
	
	public void q18(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 에밀의 결의")) {
			msg.msg(player, "§7에밀은 원래 순수한 소년이었다.%§7하지만 포보르들이 나타난 이후, 에밀은 소중한 것을 지키기 위해%§7포보르와 싸워오게 되었다.%§7혼자서는 역부족이라 자기를 분할하여 다양한 형태로 자신을 수없이 늘렸다.%"
					+ "§7그러나 그 여파로 기억이 누락되거나 희미해져 누가 오리지널인지 잊게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q18(player, 0);
		}	
	}
	
	public void q19(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 악마 자미엘")) {
			msg.msg(player, "§7포보르들 중에서도 악질인 녀석들이 있었다.%§7그들의 특기는 총알과 같은 빠른 암살이었기 때문에 마탄환이라고도 불렸다.%§7카스파르, 와일드 그리고 자미엘%"
					+ "§7이 녀석들은 클레어흐 주변에 나타나는 마탄환이다.%§7카스파르와 와일드는 자미엘의 부하들로, 이들을 처리하다보면 자미엘이 등장한다고 한다.");
			QuestBoard qb = new QuestBoard();
			qb.q19(player, 0);
		}	
	}
	
	public void q20(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 붉은 악마")) {
			msg.msg(player, "§7동굴 속에서 숨어사는 붉은 악마인 레드 블럭은 사람들을 밀어 용암에 빠뜨린다.%§7글씨가 흐려서 잘보이지 않는다.%"
					+ "§7대충 클레어흐의 관광 명소인 용암 동굴을 망치는 녀석들을 사냥해 달라는 내용인 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.q20(player, 0);
		}	
	}
	
	public void q21(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 과거의 영광")) {
			msg.msg(player, "§7투어허 데 다넌 시대의 영웅 루 라바다.%§7그의 석상을 포보르가 탈취한 이유는 무엇일까.%§7이유는 알 수 없어도 확실한 것은 하나있다.%"
					+ "§7우리는 그저 적을 섬멸할 뿐.");
			QuestBoard qb = new QuestBoard();
			qb.q21(player, 0);
		}	
	}
	
	public void q22(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 군도의 강자")) {
			msg.msg(player, "§7피르볼그의 제사장이 만들어낸 최강의 도마뱀.%§7그는 마치 과거의 공룡을 연상시키게 한다.%§7그들이 더욱 개조되어 강해지기 전에 빠르게 처리하자.");
			QuestBoard qb = new QuestBoard();
			qb.q22(player, 0);
		}	
	}
	
	public void q23(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "퀘스트: 라파누이의 불청객")) {
			msg.msg(player, "§7미아즈마단이 라파누이를 점령하고 나서 한달 뒤%§7섬에는 큰 변화가 일어났다.%§7섬은 불타게 되었고, 포보르들이 자리잡게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q23(player, 0);
		}	
	}
	
	public void q24(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 미아즈마의 오른팔")) {
			msg.msg(player, "§7미아즈마에게 직접 권법을 배운 곰은 그의 오른팔이 되었다.%§7곰들이 더욱 강해지기 전에 빠르게 처리하자.");
			QuestBoard qb = new QuestBoard();
			qb.q24(player, 0);
		}	
	}
	
	public void q25(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 환영하는 병사")) {
			msg.msg(player, "§7라히무호나는 관광으로 유명한 섬이었다.%§7하지만 포보르들이 점령한 뒤로는 발걸음이 끊기게 되었다고 한다.%§7포보르들은 지나가는 배를 끌어들이기 위해 환영을 사용했다.%§7그들은 먹잇감을 환영하였고, 이러한 행위를 위한 부대를 만들었다.");
			QuestBoard qb = new QuestBoard();
			qb.q25(player, 0);
		}	
	}
	
	public void q26(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 움직이지 않는 자")) {
			msg.msg(player, "§7유혹하는 나무는 거대한 고목의 가지였다.%§7고목은 포보르에 의해 사람 모양으로 나누어졌다.%§7나누어진 나무들은 포보르를 위한 전사가 되었다.%§7그들은 검은 흐름과 심장 속 보석의 힘으로 강력한 힘을 가지게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.q26(player, 0);
		}	
	}
	
	public void q27(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 백일몽 토끼")) {
			msg.msg(player, "§7스켈리그 섬에는 아주 특이한 생물이 있다.%§7그것은 토끼이다.%§7하지만 그냥 토끼가 아니다.%§7그들은 곰과 함께 이 섬 일부를 차지하고 있는 무법자이다.%"
					+ "§7일반적인 토끼와 다른 그들은 매우 강력한 이빨을 가지고 있다.%§7토끼들을 혼내주어 주민들을 안전하게 해주자.");
			QuestBoard qb = new QuestBoard();
			qb.q27(player, 0);
		}	
	}
	
	public void q28(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 위 러브 팬더")) {
			msg.msg(player, "§7모두들 팬더를 좋아한다.%§7팬더를 키우는 사육사들도 팬더를 좋아한다.%§7하지만 팬더를 싫어하는 한 남자가 있었으니.%§7그의 이름은 솟이다.%"
					+ "§7문제는 팬더를 싫어하지만, 팬더를 사냥하는 우리를 공격한다는 것이다.%§7팬더를 괴롭히는 것은 자신뿐이라나..");
			QuestBoard qb = new QuestBoard();
			qb.q28(player, 0);
		}	
	}
	
	public void q29(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 초록의 그 녀석")) {
			msg.msg(player, "§7초록색의 폭발하는 그 몬스터는 예로부터 사람들을 공포에 떨게 하였다.%§7불행하게도 그 존재는 스켈리그 섬에도 존재했다.%§7어쩔 수 없다.%"
					+ "§7그것이 운명이라면 받아드려야지.%§7이 퀘스트를 완료하는 자에게는 마을 사람들이 큰 보상을 준다고 한다.");
			QuestBoard qb = new QuestBoard();
			qb.q29(player, 0);
		}	
	}
	
	public void q30(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 귀여운 고양이")) {
			msg.msg(player, "§7고양이는 에일의 사람들이 모두 좋아하는 동물이다.%§7주로 카이만과 미푀르유 근처에서 발견되며, 가끔은 이상한 곳에 있기도 한다.%"
					+ "§7그런 자유분방한 고양이를 길들인 남자가 있었으니.%§7그의 이름은 검은 수염이었다.%§7검은 수염이 폭주하여 이성을 잃은 뒤로도 그의 고양이는 그와 함께했다.%"
					+ "§7고양이를 혼내주어 도망가게 만들자.");
			QuestBoard qb = new QuestBoard();
			qb.q30(player, 0);
		}	
	}
	
	public void q31(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 성 밖의 이단")) {
			msg.msg(player, "§7수많은 모험가들이 교주를 혼내주었지만%§7아직도 이단들이 활동하고 있는 듯하다.%§7한번 더 그들에게 진짜 지옥이란 무엇인지 보여주자.%"
					+ "§7좋은 보상은 덤이겠지..?");
			QuestBoard qb = new QuestBoard();
			qb.q31(player, 0);
		}	
	}
	
	public void q32(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 워터파크")) {
			msg.msg(player, "§7동굴에는 물이 있어요.%§7그런데 왜 물풍선은 터지면 불이 붙는거죠?%§7물론 옆에 있는 물에 들어가면 살 수 있지만..%§7매우 귀찮군요..!");
			QuestBoard qb = new QuestBoard();
			qb.q32(player, 0);
		}	
	}
	
	public void q33(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 철분 덩어리")) {
			msg.msg(player, "§7철을 먹고 자란 벌레는 무슨 맛일까?%§7아니 아니.%§7마을 사람들이 방치해둔 광산에 벌레가 등장했다고 한다.%§7다행히 광산에 있던 금과 다이아몬드는 이미 주민들이 모두 가져간 것 같지만%"
					+ "§7아직 철과 석탄은 남아있다고 한다.%§7아무튼 철을 먹은 벌레는 공격력이 매우 높다고 한다.%§7벌레들이 더 이상 강해질 수 없도록 녀석들을 처리하자.");
			QuestBoard qb = new QuestBoard();
			qb.q33(player, 0);
		}	
	}
	
	public void q34(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 주문은 토끼입니까?")) {
			msg.msg(player, "§7토끼는 누군가에겐 매우 사랑받는 존재이지만 어쩐지 모험가들은 매우 싫어한다고 한다.%§7평원을 점령하고 있는 그들을 처리하여 퐁실퐁실한 털뭉치를 얻자.");
			QuestBoard qb = new QuestBoard();
			qb.q34(player, 0);
		}	
	}
	
	public void q35(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 흐콰")) {
			msg.msg(player, "§7모험가중에서도 최강의 다크워리어가 울부짓었다.%§7다크워리어는 졸라짱쎄서 모험가중에서 최강이엇다.%§7신이나 마족도 이겼따 다덤벼도 이겼따.%"
					+ "§7하지만 걔는 부족했다.%§7어쨌든 더 강한 힘을 찾았다.%§7하지만 늙어서 약해졌따.");
			QuestBoard qb = new QuestBoard();
			qb.q35(player, 0);
		}	
	}
	
	public void q36(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 의적")) {
			msg.msg(player, "§7원시의 땅에 살던 귀족들은 매우 악독했다고 한다.%§7원시의 땅에 검은 흐름이 퍼져 변이의 힘으로 가득찼을 때%§7일부 귀족들은 부족원들을 버리고 도망쳤다고 한다.%"
					+ "§7귀족이 밖으로 나온 것은 기회이다.%§7그들이 새로운 지역에 적응하기 전에 그들의 지갑을 털어버리자.");
			QuestBoard qb = new QuestBoard();
			qb.q36(player, 0);
		}	
	}
	
	public void q37(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "퀘스트: 족장을 지키는 자")) {
			msg.msg(player, "§7원시의 땅에 남아 새로운 족장을 추앙하는 자들을 처리하자.%§7비록 보초병의 신분일지라도 변이의 힘을 받아 강해졌을 것이다.%§7최대한의 준비를 하고 접근하자.");
			QuestBoard qb = new QuestBoard();
			qb.q37(player, 0);
		}	
	}
	
	public void q38(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 원인 해결")) {
			msg.msg(player, "§7원시의 땅에 검은 흐름을 뿜어내는 근원을 발견하였다.%§7그들은 귀족들과 함께 부유한 삶을 영위하고 있다고 한다.%§7변이의 근원과 그의 힘을 받은 귀족들은 불 공격을 한다고 하니 대비하고 찾아가자.");
			QuestBoard qb = new QuestBoard();
			qb.q38(player, 0);
		}	
	}
	
	public void q39(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 길을 지키는 자")) {
			msg.msg(player, "§7알 수 없는 이유로 칼라아릿 지역의 일부가 설원으로 변했다고 한다.%§7그리고 그 미지의 땅은 원시의 땅과 연결되어 있다고 하는데..%§7그 통로를 가로막은 존재가 있으니 미지의 땅을 탐사하기 어려워졌다.%"
					+ "§7미지의 땅을 지키는 것을 처리해 이후 탐사를 원할하게 만들자.");
			QuestBoard qb = new QuestBoard();
			qb.q39(player, 0);
		}	
	}
	
	public void q40(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "퀘스트: 싸우는 자")) {
			msg.msg(player, "§7족장 <바람을 가르는 늑대>는 변이의 힘에 잠식된 족장 <붉은 날개>의 쿠데타로 원시의 땅 변방으로 쫒겨나게 되었다.%§7사정은 불쌍하지만 족장 <바람을 가르는 늑대>도 현재 제정신은 아닌 것 같다.%"
					+ "§7지금이야말로 족장 <바람을 가르는 늑대>를 처리하기에 가장 알맞은 타이밍이다.");
			QuestBoard qb = new QuestBoard();
			qb.q40(player, 0);
		}	
	}
	
	public void q41(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "퀘스트: 고대 생물, 파괴수")) {
			msg.msg(player, "§7에일 땅을 비롯한 전 세계에서 가장 오랫동안 대를 이어온 종족은 파괴수이다.%§7파괴수는 소수의 작은 섬이 아닌 이상 어느 대륙에나 존재하며 인간을 위협해왔다.%"
					+ "§7먹이사슬 최상위에 위치한 상급 파괴수에게 누가 더 위인지 보여주자.");
			QuestBoard qb = new QuestBoard();
			qb.q41(player, 0);
		}	
	}
	
	public void q42(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "퀘스트: 레드 플레이어")) {
			msg.msg(player, "§7포보르 입장에서 우리는 악마 그 이상의 존재이다.%§7인간들 중에서도 악마 사냥꾼이라고 불리는 자들이 있었으니,%"
					+ "§7포보르들 중에서도 인간 사냥꾼이라고 불리는 자들이 있었다.");
			QuestBoard qb = new QuestBoard();
			qb.q42(player, 0);
		}	
	}
	
	public void eq1(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엑스트라 퀘스트: 설원의 가희")) {
			QuestBoard qb = new QuestBoard();
			qb.eq1(player, 0);
		}	
	}
	
	public void eq2(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엑스트라 퀘스트: 마신왕의 계약")) {
			QuestBoard qb = new QuestBoard();
			qb.eq2(player, 0);
		}	
	}
	
	public void eq3(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "엑스트라 퀘스트: 피르볼그의 제사장")) {
			msg.msg(player, "§7피르볼그 제사장의 발자취가 적혀있다.%§7첫 기록은 숲의 유적에서 시작하는 듯하다.");
			QuestBoard qb = new QuestBoard();
			qb.eq3(player, 0);
		}	
	}
	
	public void mq1(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 1장")) {
			msg.msg(player, "§7§e워그닐§7은 §e에일 땅§7과 떨어져있는 약소 국가였기 때문에 §e포보르§7들에게 대응할 힘이 없었다.%§7마냥 당하고 있기에는 피해가 컸기 때문에 매년 포보르들을 위해 그들에게 인간 제물을 바쳐왔다.%§7제물로 바쳐진 자들은 포보르에 의해 §e타락§7하게 되었다.");
			QuestBoard qb = new QuestBoard();
			qb.mq1(player, 0);
		}	
	}
	
	public void mq2(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 2장")) {
			msg.msg(player, "§7포보르를 상대하는 법을 기르고자 고대인들은 §e신전§7을 만들었다.%§7신전 내의 몬스터들은 포보르와는 달리 영역을 넓히며 싸우진 않지만, 침입자에게는 공격적이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq2(player, 0);
		}	
	}
	
	public void mq3(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 3장")) {
			msg.msg(player, "§7§e포보르들의 왕§7을 처단하는 것을 목적으로 당신의 모험은 시작될 것이다.");
			QuestBoard qb = new QuestBoard();
			qb.mq3(player, 0);
		}	
	}
	
	public void mq4(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 4장")) {
			msg.msg(player, "포르간 촌장: 숲의 황소를 잡으러 떠난 마을 청년들이 아직 돌아오지 않고 있다네.%포르간 촌장: 그 중에는 우리 아들도 있소.%포르간 촌장: 부디 그들을 찾아주게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq4(player, 0);
		}	
	}
	
	public void mq5(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 5장")) {
			msg.msg(player, "포르간 촌장: 방금 아들에게서 연락이 왔네만%포르간 촌장: §e숲의 유적§f에 고립된 상황이라고 하는군.%포르간 촌장: 이번에도 힘을 빌려주길 바라네.%포르간 촌장: 내 이번 일을 해결해주면 §e아주 좋은 정보§f를 주도록 하지%포르간 촌장: 약속하겠네.");
			QuestBoard qb = new QuestBoard();
			qb.mq5(player, 0);
		}	
	}

	public void mq6(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 6장")) {
			msg.msg(player, "포르간 촌장: 그래. 내가 좋은 정보를 알려주도록 하지.%포르간 촌장: 우리 마을 동쪽에 아주 넓은 들판이 있을게야.%포르간 촌장: 거길 §e센 마그 평원§f이라고들 부르지.%포르간 촌장: 이름의 유래로 말할 것 같으면%포르간 촌장: 아니 그게 중요한게 아니지.%"
					+ "포르간 촌장: 그래도 약간만 들어주길 바라네.%포르간 촌장: 이 땅에 태초의 인간이 당도하고 나고 한 300년 쯤인가.%포르간 촌장: 새로운 민족이 나타났다네.%"
					+ "포르간 촌장: 그것이 바로 §e파르홀론§f이지.%포르간 촌장: 그들의 수장은 용감한 모험가로 두려움에 끊임없이 맞서는 운명을 가졌다고 스스로 생각했다고 하네.%포르간 촌장: 본론부터 말해달라고?%"
					+ "포르간 촌장: 허허.. 알겠네.%포르간 촌장: 그들의 수장은 §e여섯 개의 섬§f을 모험하면서 §e여섯 신§f과의 계약을 맺었어.%포르간 촌장: 그는 신의 힘을 빌려 국가를 성장시켰지.%"
					+ "포르간 촌장: 뭐 그 중에는 농경의 신도 있었으니 당연한 결과는 맞네.%포르간 촌장: 하지만 결국 파르홀론도 포보르에 의해 파멸당하고 말지.%포르간 촌장: 갑자기 그게 말이 되냐고?%"
					+ "포르간 촌장: 어쩔 수 없네. 당시 포보르의 수장은 §e키어컬 기리켄허스§f라고 불리는 인물이였는데 말이야.%포르간 촌장: 그는 신과 맞먹는 힘을 가졌다고 하는군.%"
					+ "포르간 촌장: 역대 포보르 왕 중에서 가장 지도력이 뛰어나고 강한 왕으로 알려져있네.%포르간 촌장: 어쨌든 파르홀론의 수장이 여섯 신을 만나며 얻은 §e검§f이 있네.%"
					+ "포르간 촌장: 뭐 신의 힘을 담은 검은 아니지만.. 아주 뛰어난 검일세.%포르간 촌장: 그리고 그 검이 파르홀론의 무덤인 바로 §e센 마그 평원§f 어딘가에 남아 있다더군.%"
					+ "포르간 촌장: 지금까지 왜 아무도 그 검을 찾지 않았냐고?%포르간 촌장: 허허.. 이 늙은이도 그 검을 뽑아보려 했다만..%포르간 촌장: 실패했다네.%"
					+ "포르간 촌장: 우리 마을 청년들도 모두 성년식에 그 검을 뽑으려하나 아직 성공한 자가 없어.%포르간 촌장: 마을 무속인은 우리들은 §e플레이어§f가 아니라면서%포르간 촌장: 충분히 강한 플레이어라는 존재가 오면 검을 뽑을 수 있다고 했다네.%"
					+ "포르간 촌장: 흠, 그게 무슨 말인질 도통 이해할 수가 없었네.%포르간 촌장: 자네에게 검을 맡겨보지.%포르간 촌장: 단, 조건이 있네만.%"
					+ "포르간 촌장: 플레이어가 무엇인지는 모르지만 충분이 강해야 뽑을 수 있다지.%포르간 촌장: 센 마그 평원에서 §e고블린§f을 잡아 자네의 강함을 증명하게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq6(player, 0);
		}	
	}
	
	public void mq7(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 7장")) {
			msg.msg(player, "포르간 촌장: 좋아. §e전설의 검§f이 어디에 있는지 알려주지.%포르간 촌장: 바로..%포르간 촌장: 평원 어딘가에 §e빛의 길§f이 있다네.%포르간 촌장: 알아서 잘 찾아보게. 허허.");
			QuestBoard qb = new QuestBoard();
			qb.mq7(player, 0);
		}	
	}
	
	public void mq8(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 8장")) {
			msg.msg(player, "포르간 촌장: 허허허.. 검을 얻었지만 아직 그 힘이 제대로 발현된건 아닌 것 같구만그래.%포르간 촌장: 센 마그 평원에는 §e파르홀론에 대한 기록§f이 아직 남아있다네.%포르간 촌장: 시간이 난다면.. 한번 찾아보게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq8(player, 0);
		}	
	}
	
	public void mq9(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 9장")) {
			msg.msg(player, "§7검을 각성시키는 법은 아직 알 수 없을 것 같다.%§7일단 좀 더 강해져보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq9(player, 0);
		}	
	}
	
	public void mq10(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 10장")) {
			msg.msg(player, "티르의 생존자: 등대에 가면 §e이 세계에 숨겨져 있는 진실§f을 알게 될 수도 있어.%티르의 생존자: 당장 등대에 가보고 싶겠지만%티르의 생존자: 아직 너를 믿을 순 없겠군.%티르의 생존자: 밖에 있는 §e외눈을 가진 포보르§f들을 처리하고 와!");
			QuestBoard qb = new QuestBoard();
			qb.mq10(player, 0);
		}	
	}
	
	public void mq11(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 11장")) {
			msg.msg(player, "티르의 생존자: 등대에 가면 §e숨겨진 공간§f이 있을거야.%티르의 생존자: 거기로 가봐.");
			QuestBoard qb = new QuestBoard();
			qb.mq11(player, 0);
		}	
	}
	
	public void mq12(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 12장")) {
			msg.msg(player, "티르의 생존자: 등대에 갔다왔어?%티르의 생존자: §e투어허 데 다넌 시대§f에 지어진 §e모두에게 희망을 빛춰주는 등대§f보단 못하지만..%"
					+ "티르의 생존자: 이 등대는 우리에게만은 희망을 빛춰주는 등대다.%티르의 생존자: §e태양의 힘§f을 낮에 충전하고, §e달의 힘§f을 밤에 충전해 이 등대는 세상을 밝게 비추어주지.%"
					+ "티르의 생존자: 당신이 등대에서 무슨 비밀을 찾았는지는 모르겠는데 달의 힘이나 태양의 힘을 찾은건 아닌 것 같군%티르의 생존자: 가서 힘을 얻어라!");
			QuestBoard qb = new QuestBoard();
			qb.mq12(player, 0);
		}	
	}
	
	public void mq13(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 13장")) {
			msg.msg(player, "티르의 생존자: 강화..알고 있지?%티르의 생존자: §e시드 광산§f에서 채광을 할 수 있을꺼야.%티르의 생존자: 포보르들에 의해 지금은 광부들이 거의 없는걸로 알긴하는데%"
					+ "티르의 생존자: 광석들은 남아있겠지 뭐.%티르의 생존자: 대신 위험할 수도 있으니 광산으로 가는 길에 있는 악독한 것들을 처리하고 가라.");
			QuestBoard qb = new QuestBoard();
			qb.mq13(player, 0);
		}	
	}
	
	public void mq14(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 14장")) {
			msg.msg(player, "§7시드 광산으로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq14(player, 0);
		}	
	}
	
	public void mq15(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 15장")) {
			msg.msg(player, "광부: 그나저나 당신도 모험가지?%광부: 지금 필요한 광물이 있는데 구해줄 수 있겠나?%광부: §e포르간§f이라는 마을 주변에 §e숲§f이 있네.%광부: 그곳에 §e포보르의 흔적§f이 남아있는 장소가 있네.%광부: 다녀와주길 바라네.");
			QuestBoard qb = new QuestBoard();
			qb.mq15(player, 0);
		}	
	}
	
	public void mq16(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 16장")) {
			msg.msg(player, "광부: 뭘 하고 싶은지는 모르겠지만 이곳에 오는 모험가들은 보통 §e미푀르유 성§f으로 떠나는 듯 하더군%광부: 자네도 가보는 것이 어떻겠나?");
			QuestBoard qb = new QuestBoard();
			qb.mq16(player, 0);
		}	
	}
	
	public void mq17(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 17장")) {
			msg.msg(player, "불안한 주민: 난 성에 살던 사람인데 무서워서 도망쳐 나왔어.%불안한 주민: 날 좀 살려줘.");
			QuestBoard qb = new QuestBoard();
			qb.mq17(player, 0);
		}	
	}
	
	public void mq18(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 18장")) {
			msg.msg(player, "§7주민이 말한 §e진실§7을 알아내기 위해 §e역사가§7를 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq18(player, 0);
		}	
	}
	
	public void mq19(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 19장")) {
			msg.msg(player, "§7역사가를 찾았지만 의미가 없으니%§7역사가를 찾아다녔다던 §e모험가§7에 대해 조사해보자.%§7뼈를 남긴 것을 보아 §e묘지§7에 힌트가 있을 것 같다.");
			QuestBoard qb = new QuestBoard();
			qb.mq19(player, 0);
		}	
	}
	
	public void mq20(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 20장")) {
			msg.msg(player, "§7모험가의 흔적을 쫓아 §e시드 광산§7으로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq20(player, 0);
		}	
	}
	
	public void mq21(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 21장")) {
			msg.msg(player, "§7§e티르 등대§7 근처에 수상한 자가 나타났다고 한다.%§7티르 등대를 향해 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq21(player, 0);
		}	
	}
	
	public void mq22(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 22장")) {
			msg.msg(player, "§7모험가가 나를 죽이지 않고 살려두었다는 것은%§7무언가 뜻이 있었던 것 같다.%§7모험가를 따라 설원 지대인 §e아란모어§7로 가보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq22(player, 0);
		}	
	}
	
	public void mq23(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 23장")) {
			msg.msg(player, "§7막상 아란모어까지 왔지만%§7§e신의 보물§7이 어디에 있는지는 알 수 없었다.%§7주변의 몬스터를 잡아가면서 보물이 있을만한 던전을 찾아보자.");
			QuestBoard qb = new QuestBoard();
			qb.mq23(player, 0);
		}	
	}
	
	public void mq24(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 24장")) {
			msg.msg(player, "§a모험가§d>>§a" + player.getDisplayName() + " §b여어. 보고 있나.%§a모험가§d>>§a" + player.getDisplayName() + " §bmsg 커맨드를 한번 써봤다.%모험가: 뭐 이것도 내 한계를 넘은 힘이면 굳이 사용할 필요도 없는데 말이지.%"
					+ "모험가: 나는 카루 던전에 있다.%모험가: 여기서 기다리도록 하지.");
			QuestBoard qb = new QuestBoard();
			qb.mq24(player, 0);
		}	
	}
	
	public void mq25(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 25장")) {
			msg.msg(player, "얼음 장인: 거기 자네.%얼음 장인: 이곳에 온 이유는 잊지 않았겠지?%얼음 장인: 도움을 줄 테니 나에게 오시게.");
			QuestBoard qb = new QuestBoard();
			qb.mq25(player, 0);
		}	
	}
	
	public void mq26(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 26장")) {
			ItemStack rewardKey = new ItemStack(Material.PAPER);
			ItemMeta rewardKeyIm = rewardKey.getItemMeta();
			rewardKeyIm.setDisplayName(ChatColor.YELLOW + "성스러운 통행증");
			ArrayList<String> rewardLore = new ArrayList();
			rewardLore.add(ChatColor.GRAY + "어디론가 이동할 수 있는 통행증");
			rewardLore.add(ChatColor.GRAY + "아란모어 가장 높은 곳. 마법 수정 앞에서 사용해보자.");
			rewardKeyIm.setLore(rewardLore);
			rewardKey.setItemMeta(rewardKeyIm);
			player.getInventory().addItem(rewardKey);
			msg.msg(player, "얼음 장인: 통행증이 완성되었다네.%얼음 장인: 여기까지 오는건 귀찮을 것 같아서..%얼음 장인: 퀘스트 스크롤에 넣어놨다네.%얼음 장인: 이미 인벤토리에 통행증이 있을 것이야.%얼음 장인: 통행증은 §e아란모어에서 가장 높은 곳§f.%얼음 장인: 그곳에 있는 §e마법 수정 앞§f에서 사용하면 된다네.");
			QuestBoard qb = new QuestBoard();
			qb.mq26(player, 0);
		}	
	}
	
	public void mq27(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 27장")) {
			new NPCManager(player);
			msg.msg(player, "bl120%§7머리가 희미해진다.%§7누군가의 기억을 엿보는 듯한 기분이 든다.%tp-2223 64 -2435%데히트라: " + player.getDisplayName() + " 녀석이 더욱 성장하고 있습니다.%데히트라: 모든 것은 계획대로입니다.%의문의 남성: 그래.%"
					+ "의문의 남성: 그 녀석이 제 발로 찾아온다면, 굳이 --를 반복하지 않아도 되겠군.%데히트라: 드디어 그 분의 뜻을 이루게 되는 것입니까.%의문의 남성: 끌끌끌.. 죽어도 죽지 않는 육체를 가진 §e플레이어§f라..%의문의 남성: 아주 좋은 연구가 될 것 같구나.%"
					+ "의문의 남성: 이제 슬슬 이동해 보자고.%의문의 남성: 지금부터 --으로 간다.%데히트라: " + player.getDisplayName() + " 녀석이 오는 것을 기다리지 않는 것입니까?%의문의 남성: 지금까지 그랬던 것처럼 그 녀석은 --를 보고 우리쪽으로 오게 될거다.%"
					+ "의문의 남성: 아무것도 모르고 말이지.%tp-491 55 1312%???: 아..아아.%???: 들리십니까?%???: 저는 퀘스트의 요정 §e네비§f입니다.%네비: 아까부터 무슨 생각을 그렇게 하십니까?%네비: 크흠. 큼. 퀘스트 다시 설명드립니다!%"
					+ "네비: 이번 퀘스트는 카이만에 사시는 어느 분께서 의뢰하신 사항입니다.%네비: §e카이만 북쪽에 늪§f이 하나 있다고 하는데요. 거기에 거미들이 대량 발생했다고 합니다!%네비: 뭐.. 우리가 처리를 해도 다시 나타날 놈들이지만..%"
					+ "네비: 의뢰자분이 많은 경험치를 제시하셨으니 한번 가봐야죠?%네비: 그럼 오늘도 수고하십쇼~!");
			QuestBoard qb = new QuestBoard();
			qb.mq27(player, 0);
		}	
	}

	public void mq28(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 28장")) {
			msg.msg(player, "네비: 일단 우리의 1차적인 목표는 만렙 달성 쯤으로 해둘까요?%네비: 역시 게임은 만렙부터가 시작이죠.%네비: 그럼 앞으로는 힘든 퀘스트, 어려운 퀘스트 상관없이%네비: 경험치 빠방하게 주는 걸로 몽땅 수주해드릴게요!%"
					+ "네비: 그으럼 지금 레벨에 적당한 퀘스트가.. 이거네요!%네비: 거미들이 나오던 늪 기억하시죠?%네비: 거기서 서쪽으로 조금 가면 §e물웅덩이가 많은 또다른 늪§f이 나온다고 해요.%네비: 거기에 §e늪지의 마신왕§f이라는 §e필드보스 몬스터§f가 나오는데..%"
					+ "네비: 그러고 보니 지금까지 필드보스같은 몬스터를 본 적이 있었나요?%네비: 저는 처음보는 것 같아요.%네비: 상대가 얼마나 강한지 모르면 그만큼 대비를 하는게 좋겠죠.%네비: 어쨌든 그 녀석 1마리를 잡는 것이 퀘스트 목표네요.");
			QuestBoard qb = new QuestBoard();
			qb.mq28(player, 0);
		}	
	}
	
	public void mq29(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 29장")) {
			msg.msg(player, "네비: 이번에는 누군진 모르겠지만..%네비: 본인한테 와달라고 하시네요?%네비: 일단 가봅시다!");
			QuestBoard qb = new QuestBoard();
			qb.mq29(player, 0);
		}	
	}
	
	public void mq30(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 30장")) {
			msg.msg(player, "탑의 관리인: 이곳에서 죽은 자들의 몸은 포보르의 영혼이 차지해%탑의 관리인: §e되살아난 해골§f이 된다네..%탑의 관리인: 이 탑에 오르고 싶다면..%탑의 관리인: 그 녀석들부터 처리하고 오게.");
			QuestBoard qb = new QuestBoard();
			qb.mq30(player, 0);
		}	
	}
	
	public void mq31(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 31장")) {
			msg.msg(player, "탑의 관리인: 의뢰가 하나 있네.%탑의 관리인: 내가 있는 탑 근처에 §e하급 파괴수§f란 녀석들이 있는데 말이야.%탑의 관리인: 그 녀석들을 잡다보면 §e어떤 가루§f를 얻을 수 있네.%탑의 관리인: 구해서 가져다 주게나.");
			QuestBoard qb = new QuestBoard();
			qb.mq31(player, 0);
		}	
	}
	
	public void mq32(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 32장")) {
			msg.msg(player, "네비: 저번에 탑의 관리인이 말한 마을에 한번 가보는건 어떨까요?%네비: 제가 조사해보니 그 마을 이름은 §e베아그§f라고 하네요!");
			QuestBoard qb = new QuestBoard();
			qb.mq32(player, 0);
		}	
	}
	
	public void mq33(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 33장")) {
			msg.msg(player, "네비: 크레드라트 주변 밀밭에서 퀘스트 의뢰가 들어왔어요!%네비: 이번에는 어떤 퀘스트일까 두근두근하네요~!");
			QuestBoard qb = new QuestBoard();
			qb.mq33(player, 0);
		}	
	}

	public void mq34(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 34장")) {
			msg.msg(player, "빨간모자: 하위!%빨간모자: 나를 잊지 않았겠지영?%빨간모자: 또 의뢰할께 있으니 나한테 와줘여.");
			QuestBoard qb = new QuestBoard();
			qb.mq34(player, 0);
		}	
	}
	
	public void mq35(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 35장")) {
			msg.msg(player, "???: 에일을 구원할 영웅이시여.%???: 죽음의 탑을 조사한다는 소문을 들었어요.%???: 저는 §e마법탑§f의 카타리나라고 합니다.%카타리나: 우선.. 마법탑으로 와주시겠어요?");
			QuestBoard qb = new QuestBoard();
			qb.mq35(player, 0);
		}	
	}
	
	public void mq36(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 36장")) {
			msg.msg(player, "카타리나: 좋아요.%카타리나: 이제 §e포보르 왕을 가둔 미궁§f으로 들어갈 준비가 된 것 같군요.%카타리나: 마법탑에서 어느정도의 에메랄드와 포보르의 마나로 워프 스크롤을 살 수 있을 껍니다.");
			QuestBoard qb = new QuestBoard();
			qb.mq36(player, 0);
		}	
	}
	
	public void mq37(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 37장")) {
			msg.msg(player, "네비: 오랜만!%네비: 이번에도 좋은 퀘스트를 찾았지 뭐야.%네비: 마법탑에서 §e동쪽§f으로 쭉 가면 §e롱게§f라는 마을이 있는건 아니?%네비: 찾기가 좀 어려운 마을이라 잘 찾을지 모르겠넹..%"
					+ "네비: 정 모르겠으면 마법탑에서 동쪽으로 쭉 가다가 한번 죽어봐!%네비: 혹시라도 롱게에서 부활할지 누가 알아?");
			QuestBoard qb = new QuestBoard();
			qb.mq37(player, 0);
		}	
	}
	
	public void mq38(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 38장")) {
			msg.msg(player, "꼬마: 후에엥.%꼬마: 후에엥.%꼬마: 모험가님 저를 한번 더 도와주세요.");
			QuestBoard qb = new QuestBoard();
			qb.mq38(player, 0);
		}	
	}
	
	public void mq39(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 39장")) {
			msg.msg(player, "네비: 이 근처에서 나와 비슷한 힘이 느껴지는데..?%네비: 이건 무조건 가야돼.%네비: 힘의 좌표는 §e'694 67 618'§f인 것 같아.");
			QuestBoard qb = new QuestBoard();
			qb.mq39(player, 0);
		}	
	}
	
	public void mq40(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 40장")) {
			msg.msg(player, "네비: §e고성 지하§f에서 §e던전§f을 찾았어.%네비: 던전 입구에서 기다릴테니까 같이 가자.");
			QuestBoard qb = new QuestBoard();
			qb.mq40(player, 0);
		}	
	}
	
	public void mq41(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 41장")) {
			msg.msg(player, "§7고성에서 발견한 검은 흐름이 반응하기 시작했다.%네비: 아니. 이게 갑자기 왜 반응하지?%§7검은 흐름이 담은 힘은 너무 매혹적이라 빠져들 것 같은 기분이다.%tp3810 17 3797%"
					+ "§7이제 어떻게 할까?");
			QuestBoard qb = new QuestBoard();
			qb.mq41(player, 0);
		}	
	}
	
	public void mq42(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 42장")) {
			msg.msg(player, "네비: 으으음...%네비: 오랜만이랄까.%네비: 뭔가 되게 오래있다가 만난 것 같아.%네비: 약간 모습이 달라진 것도 같구.%네비: 오늘도 힘차게 가보자구!%"
					+ "네비: §e하마베 마을§f에서 누가 도움을 요청했나봐.%네비: 좌표는 내가 찍어줄테니까 너는 이동만 하라구~");
			QuestBoard qb = new QuestBoard();
			qb.mq42(player, 0);
		}	
	}
	
	public void mq43(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 43장")) {
			msg.msg(player, "에트: 제가 왜 그 생각을 못했을까요.%에트: 광신도 녀석들은 성당 지하에 있다는 소문이 있어요.");
			QuestBoard qb = new QuestBoard();
			qb.mq43(player, 0);
		}	
	}
	
	public void mq44(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 44장")) {
			msg.msg(player, "에트: 이 녀석들 따로 본거지가 있던게 확실합니다.%에트: 제 친구랑 밤중에 포보르를 미행한 결과 그 위치를 알아냈죠.");
			QuestBoard qb = new QuestBoard();
			qb.mq44(player, 0);
		}	
	}
	
	public void mq45(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 45장")) {
			msg.msg(player, "에트: 광신도 녀석들에 대해 새로 알아낸게 있는 것 같아요!%에트: 한번 와주세요.");
			QuestBoard qb = new QuestBoard();
			qb.mq45(player, 0);
		}	
	}
	
	public void mq46(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 46장")) {
			msg.msg(player, "네비: 사막은 너무 더웠당~%네비: 이제 좀 쉬고 싶은걸.%네비: 잠깐 쉬어가는 겸해서 에일 주변 섬들이나 구경가볼까?%"
					+ "네비: 운 좋게 거기서 뭘 얻을 수 있으면 좋은거구!%네비: 일단 도움이 필요한 섬들에 대해 찾아보자!");
			QuestBoard qb = new QuestBoard();
			qb.mq46(player, 0);
		}	
	}
	
	public void mq47(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 47장")) {
			msg.msg(player, "네비: 익명의 어떤 분이 퀘스트를 보냈지 뭐야.%네비: 정해진 좌표로 오기만 하면 된다는데..%네비: 가기만 하면 경험치라도 주겠지.");
			QuestBoard qb = new QuestBoard();
			qb.mq47(player, 0);
		}	
	}
	
	public void mq48(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 48장")) {
			msg.msg(player, "네비: 이번에는 섬에 사시는 분이 도움을 요청했어.%네비: 지금까지는 하마베에서 요청받은 일을 섬에서 해결해드렸는데..%네비: 신선하네!%"
					+ "네비: 이번 섬 이름은..%네비: 시..§e시오카나§f?%네비: 정확히 어디 계신지는 안적어주셔서 우리가 찾아야 되겠다.");
			QuestBoard qb = new QuestBoard();
			qb.mq48(player, 0);
		}	
	}
	
	public void mq48_18(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 49장")) {
			msg.msg(player, "리로이: 지금이 가장 중요한 시간!%리로이: 당신은 신전에 갈 수 이제 있다.%리로이: 가버려라 용사!");
			QuestBoard qb = new QuestBoard();
			qb.mq48_18(player, 0);
		}	
	}
	
	public void mq49(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 50장")) {
			msg.msg(player, "네비: 아.. 저번에 만났던 디아스라는 사람 기억나?%네비: 그 사람이 계속 연락을 하는데 어쩔 수가 없네.%네비: 통화 연결 해줘도 괜찮지?%"
					+ "디아스: 여어 오랜만이에요우!%디아스: 리로이에게 들었다 소식.%디아스: 그에 대한 일은 미안하다 고맙다.%디아스: 리로이와는 다르도록 프레젠트준다.%"
					+ "디아스: 내가 이 바다는 다 안다.%디아스: 가고 싶은 곳 말해라.%디아스: 경치 좋은 섬, 무서운 섬, 악마들이 사는 섬 모두 안다.%"
					+ "§7세계의 문에 대해 묻는다.%디아스: 오우! 세계의 문!%디아스: 그것, 익히 들어 알고 있는.%디아스: 문은 칼라아릿이라는 대륙에 위치!%"
					+ "디아스: 특히 티페라리라는 대도시와 근접!%디아스: 하지만 그곳은 매우 위험한..!%디아스: 일단 티페라리로 가면 알게 될 것.");
			QuestBoard qb = new QuestBoard();
			qb.mq49(player, 0);
		}	
	}
	
	public void mq50(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 51장")) {
			//데히트라 소환 -> 삭제
			msg.msg(player, "데히트라: 여어.%데히트라: 시간이.. 별로 남지 않았군.%데히트라: §e세계의 비밀§f..%데히트라: 그것을 네놈이 깨닫기에는 무리가 있는 듯하구나.%"
					+ "데히트라: 너는 너무 많은 살육을 저질렀어.%데히트라: 너는 실패한 존재다.%데히트라: 더이상 볼 필요가 없겠군.%데히트라: 네비. 이제 돌아오거라.%"
					+ "네비: 바이바이. " + player.getDisplayName() + ".%네비: 마침 귀찮던 참이었어.%네비: 전 세대의 녀석들보다 너무 멍청한거 있지?%"
					+ "데히트라: 하하. 멍청하다니.%데히트라: 이 녀석이 아무리 모자라다고 해도 나와 같은 존재가 아니냐.%데히트라: 내가 멍청하다는거냐?%"
					+ "네비: 하하핫. 농담도 참.%데히트라: 아무튼 수고했다.%데히트라: 남은 시간이 길지는 않지만 조언을 하나 해주지.%"
					+ "데히트라: §e세계의 문§f 안쪽에는 §e시공을 넘는 길§f이 있다.%데히트라: 그곳에서 널 기다리마.%데히트라: 네 녀석이 날 죽인다면 이 굴레는 끝이 날게야.%"
					+ "데히트라: 그럼 넌 §e자유§f의 몸이 되는거지.");
			
			Location loc = player.getLocation();
			loc.setYaw(270);
			loc.setPitch(0);
			player.teleport(loc);
			
			new BukkitRunnable() {
				@Override
				public void run() {
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===찾아온 불청객===")) {
						int qNum = cb.getNum(player);
						cb.mq50(player, qNum + 1);
						this.cancel();
					}
				}
			}.runTaskLater(Main.getPlugin(Main.class), 1250);
			
			QuestBoard qb = new QuestBoard();
			qb.mq50(player, 0);
			
			new NPCManager(player);
		}	
	}
	
	public void mq51(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 52장")) {
			QuestBoard qb = new QuestBoard();
			qb.mq51(player, 0);
		}	
	}
	
	public void mq52(Player player, ItemStack itemArg, World world) {	
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "메인퀘스트 53장")) {
			msg.msg(player, "§7어딘가에서 편지가 날라왔다.%마가이: 자네는 충분히 강해졌구만.%마가이: 그 정도 힘이면 세계의 문을 열 수 있겠어.%"
					+ "마가이: 일단 나를 찾아오게.%마가이: 자세한 얘기는 만나서 하지.");
			QuestBoard qb = new QuestBoard();
			qb.mq52(player, 0);
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
