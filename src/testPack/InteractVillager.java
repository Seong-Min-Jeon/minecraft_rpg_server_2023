package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InteractVillager {

	Player player;
	Location loc;
	Entity ent;
	Random rnd = new Random();
	
	public boolean interactVillager(Player player, Entity ent) {
		this.player = player;
		this.ent = ent;
		loc = ent.getLocation();
		
		int i = 0;
		Inventory inv = player.getInventory();
		for (int j = 0 ; j < 36 ; j++) {
			if(inv.getItem(j) == null) {
				i++;
			}
		}
		if(i == 0) {
			if(((Villager)ent).getCanPickupItems() == false) {
				return false;
			} 
			player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
			return true;
		}
		
		return vil0() || vil1() || vil2() || vil3() || vil4() || vil5() || vil6() || vil7() || vil8() || vil9() || vil10() || vil11() || vil12() || vil13() || vil14()
				|| vil15() || vil16() || vil17() || vil18() || vil19() || vil20() || vil21() || vil22() || vil23() || vil24() || vil25() || vil26() || vil27();
	}
	
	public boolean vil0() {
		//전설의 시작 -1494 2037  -1491 2033
		if(loc.getX() <= -1489 && loc.getZ() <= 2037 
				&& loc.getX() >= -1495 && loc.getZ() >= 2032) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
					int qNum = cb.getNum(player);
					cb.mq7(player, qNum+1);		
				} else {
					player.sendMessage(ChatColor.GRAY + "빛나는 검이 있다.");
				}
			} catch(Exception e) {
				player.sendMessage(ChatColor.GRAY + "빛나는 검이 있다.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil1() {
		//티르 경비병 -680 51 1956  -672 46 1943
		if(loc.getX() <= -672 && loc.getZ() <= 1956 
				&& loc.getX() >= -680 && loc.getZ() >= 1943) {
			player.sendMessage("티르 경비병: 이곳은 티르요. 내가 지켜야할 곳이지.");
			return true;
		}
		return false;
	}

	public boolean vil2() {
		//에일땅으로 퀘스트 -1875 2690 -1863 2702
		if(loc.getX() <= -1863 && loc.getZ() <= 2702 
				&& loc.getX() >= -1875 && loc.getZ() >= 2690) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===에일 땅으로===")) {
					int qNum = cb.getNum(player);
					cb.mq3(player, qNum+1);		
				} else {
					player.sendMessage("포르간 촌장: 허허.. 어서오시게.");
				}
			} catch(Exception e) {
				player.sendMessage("포르간 촌장: 허허.. 어서오시게.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil3() {
		//시드 광산 광부 -1152 43 1727  -1169 44 1742
		if(loc.getX() <= -1152 && loc.getZ() <= 1742 
				&& loc.getX() >= -1169 && loc.getZ() >= 1727) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시드 광산===")) {
    				int qNum = cb.getNum(player);
    				cb.mq14(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===포보르의 무기2===")) {
					Location chestLoc = new Location(player.getWorld(), -1833, 92, 3036);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					ItemStack weapon1 = chest.getInventory().getItem(6);
					if(player.getInventory().contains(weapon1)) {
						int qNum = cb.getNum(player);
        				cb.mq15_1(player, qNum + 1);
					} else {
						player.sendMessage("광부: 물건은 어디에 있는가?");
					}
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자3===")) {
    				int qNum = cb.getNum(player);
    				cb.mq20(player, qNum + 1);
    			} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자5===")) {
    				int qNum = cb.getNum(player);
    				cb.mq20_2(player, qNum + 1);
    			} else {
    				player.sendMessage("광부: 이곳에는 이제 남은게 없다만 필요하다면 둘러보시게.");
    			}
			} catch(Exception e) {
				player.sendMessage("광부: 이곳에는 이제 남은게 없다만 필요하다면 둘러보시게.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil4() {
		//미푀르유 식량창고 -862 58 1370  -879 69 1389
		if(loc.getX() <= -862 && loc.getZ() <= 1389 
				&& loc.getX() >= -879 && loc.getZ() >= 1370) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===미푀르유 성===")) {
					int qNum = cb.getNum(player);
					cb.mq16(player, qNum+1);		
				} else {
					player.sendMessage("불안한 주민: 날 좀 살려줘");
				}
			} catch(Exception e) {
				player.sendMessage("불안한 주민: 날 좀 살려줘");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil5() {
		//콘노로 가는 썰매 -1963 50 463  -1978 57 452
		if(loc.getX() <= -1963 && loc.getZ() <= 463  
				&& loc.getX() >= -1978 && loc.getZ() >= 452) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아란모어===")) {
					int qNum = cb.getNum(player);
					cb.mq22(player, qNum+1);		
				} else {
					
				}
			} catch(Exception e) {
				
			}
			player.sendMessage("썰매 아저씨: 흐읏.. 간다앗!");
			player.teleport(new Location(player.getWorld(),-2417,52,489));
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		}
		return false;
	}
	
	public boolean vil6() {
		//콘노에서 가는 썰매 -2410 52 488  -2426 56 496
		if(loc.getX() <= -2410 && loc.getZ() <= 496  
				&& loc.getX() >= -2426 && loc.getZ() >= 488) {
			player.sendMessage("썰매 아저씨: 흐읏.. 간다앗!");
			player.teleport(new Location(player.getWorld(),-1970,52,455));
			ItemStack item = new ItemStack(Material.MAGMA_CREAM);
			ItemMeta itemIm = item.getItemMeta();
			itemIm.setDisplayName(ChatColor.RED + "마나없음");
			item.setItemMeta(itemIm);
			player.getInventory().setItem(8, item);
			return true;
		}
		return false;
	}
	
	public boolean vil7() {
		//콘노 얼음 장인 -2481 74 524  -2470 66 536
		if(loc.getX() <= -2470 && loc.getY() <= 74 && loc.getZ() <= 536 
				&& loc.getX() >= -2481 && loc.getY() >= 66 && loc.getZ() >= 524) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희1===")) {
					int qNum = cb.getNum(player);
					cb.eq1(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===") && (player.getWorld().getTime() <= 13000 || player.getWorld().getTime() >= 23000)) {
					int qNum = cb.getNum(player);
					cb.eq1_2(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 보물1===")) {
					int qNum = cb.getNum(player);
					cb.mq25(player, qNum+1);		
				} else {
					if(rnd.nextInt(100) == 0) {
						player.sendMessage("얼음 장인: 아란모어에서 발견되는 크리스탈라이즈 주괴로 전설의 쌍검을 더욱 단단하게 만들 수 있다는 말이 있더군..");
					} else {
						player.sendMessage("얼음 장인: 후우.. 일이 너무 힘들구만.");
					}
				}
			} catch(Exception e) {
				if(rnd.nextInt(100) == 0) {
					player.sendMessage("얼음 장인: 아란모어에서 발견되는 크리스탈라이즈 주괴로 전설의 쌍검을 더욱 단단하게 만들 수 있다는 말이 있더군..");
				} else {
					player.sendMessage("얼음 장인: 후우.. 일이 너무 힘들구만.");
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean vil8() {
		//늪 북동쪽 산장 주인 994 -8
		if(loc.getX() <= -993 && loc.getZ() <= -7 
				&& loc.getX() >= -995 && loc.getZ() >= -9) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마신왕의 계약2===")) {
					int qNum = cb.getNum(player);
					cb.eq2_1(player, qNum+1);	
					((LivingEntity) ent).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 0,true,false,false));
				} else {
					player.sendMessage("산장 주인: 나는 과거에 용병이었소.");
				}
			} catch(Exception e) {
				player.sendMessage("산장 주인: 나는 과거에 용병이었소.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil9() {
		//원형유적 마법사 -927 857  -924 860
		if(loc.getX() <= -924 && loc.getZ() <= 860
				&& loc.getX() >= -927 && loc.getZ() >= 857) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑1===")) {
					int qNum = cb.getNum(player);
					cb.mq29(player, qNum+1);	
					((LivingEntity) ent).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 0,true,false,false));
				} else {
					player.sendMessage("마법사: 나는 모든걸 알고 있지.");
				}
			} catch(Exception e) {
				player.sendMessage("마법사: 나는 모든걸 알고 있지.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil10() {
		//늪 북동쪽 산장 주인 77 -23  74 -21
		if(loc.getX() <= 77 && loc.getZ() <= -21
				&& loc.getX() >= 74 && loc.getZ() >= -23) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽음의 탑2===")) {
					int qNum = cb.getNum(player);
					cb.mq29_1(player, qNum+1);	
				} else {
					player.sendMessage("탑의 관리인: 이곳은 죽음의 탑이오.");
				}
			} catch(Exception e) {
				player.sendMessage("탑의 관리인: 이곳은 죽음의 탑이오.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil11() {
		//관장 56 -292  58 -290
		if(loc.getX() <= 58 && loc.getZ() <= -290
				&& loc.getX() >= 56 && loc.getZ() >= -292) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===너의 근육을 먹고 싶어===")) {
					int qNum = cb.getNum(player);
					cb.mq32(player, qNum+1);	
				} else {
					player.sendMessage("관장: 헛헛. 하앗.");
				}
			} catch(Exception e) {
				player.sendMessage("관장: 헛헛. 하앗.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil12() {
		//마법탑 225 724  226 726
		if(loc.getX() <= 226 && loc.getZ() <= 726
				&& loc.getX() >= 224 && loc.getZ() >= 724) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===마법탑을 향해===")) {
					int qNum = cb.getNum(player);
					cb.mq35(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===흐름의 봉인을 위해===")) {
					int qNum = cb.getNum(player);
					cb.mq41_1(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문1===")) {
					int qNum = cb.getNum(player);
					cb.mq52_3(player, qNum+1);	
				} else {
					player.sendMessage("카타리나: 여기는 마법탑입니다. 마나의 가호가 있기를.");
				}
			} catch(Exception e) {
				player.sendMessage("카타리나: 여기는 마법탑입니다. 마나의 가호가 있기를.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil13() {
		//롱게 929 528  932 530
		if(loc.getX() <= 932 && loc.getZ() <= 530
				&& loc.getX() >= 929 && loc.getZ() >= 528) {
			player.sendMessage("주민: 이곳은 자유로운 채굴장이오.");
			return true;
		}
		return false;
	}
	
	public boolean vil14() {
		//롱게 꼬마 836 523  837 525
		if(loc.getX() <= 838 && loc.getZ() <= 525 
				&& loc.getX() >= 836 && loc.getZ() >= 523) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 우는 소리를 내었는가===")) {
					int qNum = cb.getNum(player);
					cb.mq37(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이 달래기===")) {
					int qNum = cb.getNum(player);
					cb.mq37_2(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===누가 또 우는 소리를 내었는가===")) {
					int qNum = cb.getNum(player);
					cb.mq38(player, qNum+1);		
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아이에게 보답을===")) {
					int qNum = cb.getNum(player);
					cb.mq38_2(player, qNum+1);		
				} else {
					player.sendMessage("꼬마: 후에엥.");
				}
			} catch(Exception e) {
				player.sendMessage("꼬마: 후에엥.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil15() {
		//하마베 주민 976 91  979 94
		if(loc.getX() <= 979 && loc.getZ() <= 94
				&& loc.getX() >= 976 && loc.getZ() >= 91) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===항구 마을, 하마베 마을===")) {
					int qNum = cb.getNum(player);
					cb.mq42(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막1===")) {
					int qNum = cb.getNum(player);
					cb.mq45(player, qNum+1);	
				} else {
					player.sendMessage("에트: 이곳은 하마베 마을이에요.");
				}
			} catch(Exception e) {
				player.sendMessage("에트: 이곳은 하마베 마을이에요.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil16() {
		//사막 정찰병 210 946  212 948  
		if(loc.getX() <= 212 && loc.getZ() <= 948
				&& loc.getX() >= 210 && loc.getZ() >= 946) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막2===")) {
					int qNum = cb.getNum(player);
					cb.mq45_1(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===축복의 포션2===")) {
					int qNum = cb.getNum(player);
					cb.mq45_3(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막3===")) {
					int qNum = cb.getNum(player);
					cb.mq45_5(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막4===")) {
					int qNum = cb.getNum(player);
					cb.mq45_7(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막5===")) {
					int qNum = cb.getNum(player);
					cb.mq45_9(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막6===")) {
					int qNum = cb.getNum(player);
					cb.mq45_11(player, qNum+1);	
				} else {
					player.sendMessage("사막 정찰병: 이 앞부터 사막이다. 조심하도록.");
				}
			} catch(Exception e) {
				player.sendMessage("사막 정찰병: 이 앞부터 사막이다. 조심하도록.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil17() {
		//채석장  -99 1487  -101 1485
		if(loc.getX() <= -99 && loc.getZ() <= 1487
				&& loc.getX() >= -101 && loc.getZ() >= 1485) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막7===")) {
					int qNum = cb.getNum(player);
					cb.mq45_12(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막8===")) {
					int qNum = cb.getNum(player);
					cb.mq45_14(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막9===")) {
					int qNum = cb.getNum(player);
					cb.mq45_16(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막10===")) {
					int qNum = cb.getNum(player);
					cb.mq45_18(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막11===")) {
					int qNum = cb.getNum(player);
					cb.mq45_20(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막12===")) {
					int qNum = cb.getNum(player);
					cb.mq45_22(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막13===")) {
					int qNum = cb.getNum(player);
					cb.mq45_24(player, qNum+1);	
				} else {
					player.sendMessage("니오: 여기는 무료 철광산이에요.");
				}
			} catch(Exception e) {
				player.sendMessage("니오: 여기는 무료 철광산이에요.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil18() {
		//사막 연구원 333 1087  335 1089
		if(loc.getX() <= 335 && loc.getZ() <= 1089
				&& loc.getX() >= 333 && loc.getZ() >= 1087) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막14===")) {
					int qNum = cb.getNum(player);
					cb.mq45_25(player, qNum+1);	
				} else {
					player.sendMessage("연구원: 용건이 없으면 비켜주십시오.");
				}
			} catch(Exception e) {
				player.sendMessage("연구원: 용건이 없으면 비켜주십시오.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil19() {
		//니세리나 -112 1867  -114 1865
		if(loc.getX() <= -112 && loc.getZ() <= 1867
				&& loc.getX() >= -114 && loc.getZ() >= 1865) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막15===")) {
					int qNum = cb.getNum(player);
					cb.mq45_26(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막16===")) {
					int qNum = cb.getNum(player);
					cb.mq45_28(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막17===")) {
					int qNum = cb.getNum(player);
					cb.mq45_30(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막18===")) {
					int qNum = cb.getNum(player);
					cb.mq45_32(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막19===")) {
					int qNum = cb.getNum(player);
					cb.mq45_34(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===대사막20===")) {
					int qNum = cb.getNum(player);
					cb.mq45_36(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문1===")) {
					int qNum = cb.getNum(player);
					cb.mq52_3(player, qNum+2);	
				} else {
					player.sendMessage("니세리나: 뭐가 궁금한게냐.");
				}
			} catch(Exception e) {
				player.sendMessage("니세리나: 뭐가 궁금한게냐.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil20() {
		//하마베 주민2 953 41  955 43
		if(loc.getX() <= 955 && loc.getZ() <= 43
				&& loc.getX() >= 953 && loc.getZ() >= 41) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽어가는 섬===")) {
					int qNum = cb.getNum(player);
					cb.mq46(player, qNum+1);	
				} else {
					player.sendMessage("줄리엣: 라파누이에 두고 온 가족이 그리워요.");
				}
			} catch(Exception e) {
				player.sendMessage("줄리엣: 라파누이에 두고 온 가족이 그리워요.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil21() {
		//라파누이 주민 1846 2151  1848 2153
		if(loc.getX() <= 1848 && loc.getZ() <= 2153
				&& loc.getX() >= 1846 && loc.getZ() >= 2151) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===죽어가는 섬의 주민===")) {
					int qNum = cb.getNum(player);
					cb.mq46_1(player, qNum+1);	
				} else {
					player.sendMessage("로미오: 라파누이에.. 구원을!");
				}
			} catch(Exception e) {
				player.sendMessage("로미오: 라파누이에.. 구원을!");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil22() {
		//시오카나 주민 534 53 -532  530 53 -535
		if(loc.getX() <= 534 && loc.getZ() <= -532
				&& loc.getX() >= 530 && loc.getZ() >= -535) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시오카나 섬===")) {
					int qNum = cb.getNum(player);
					cb.mq48(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===새로운 섬===")) {
					int qNum = cb.getNum(player);
					cb.mq48_2(player, qNum+1);	
				} else {
					player.sendMessage("디아스: 오우! 무슨 일이신가요우?");
				}
			} catch(Exception e) {
				player.sendMessage("디아스: 오우! 무슨 일이신가요우?");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil23() {
		//스켈리그 주민 -756 100 -898  -754 100 -900
		if(loc.getX() <= -754 && loc.getZ() <= -898
				&& loc.getX() >= -756 && loc.getZ() >= -900) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===스켈리그 섬===")) {
					int qNum = cb.getNum(player);
					cb.mq48_3(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===시련을 마친 자===")) {
					int qNum = cb.getNum(player);
					cb.mq48_13(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물1===")) {
					int qNum = cb.getNum(player);
					cb.mq48_15(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===검은 수염의 보물3===")) {
					int qNum = cb.getNum(player);
					cb.mq48_17(player, qNum+1);	
				} else {
					player.sendMessage("리로이: 나의 강아지 슈가는 어디에 있는 것일까..");
				}
			} catch(Exception e) {
				player.sendMessage("리로이: 나의 강아지 슈가는 어디에 있는 것일까..");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil24() {
		//하드 바다 신전 3797 3868 
		if(loc.getX() <= 3798 && loc.getZ() <= 3869
				&& loc.getX() >= 3796 && loc.getZ() >= 3867) {
			Inventory inv = player.getInventory();
			boolean bool = false;
			for(ItemStack item : inv.getContents()) {
				if (item == null) {
					continue;
				}
				if(bool == false) {
					if(item.getType() == Material.FLOWER_BANNER_PATTERN) {
						if (item.getItemMeta().getDisplayName().substring(2).equals("잊혀진 바다 신전 통행증")) {
							item.setAmount(item.getAmount()-1);
							player.sendMessage("던전 키퍼: 살아서 돌아오시게나.");
							player.teleport(new Location(player.getWorld(), 3771, 72, 3867, 90, 0));
							player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 0,true,false,false));
							bool = true;
						}
					}
				}
			}
			if(bool == false) {
				player.sendMessage("던전 키퍼: 통행증이 없으면 결계 안으로 들어갈 수 없다네.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil25() {
		// 마가이 726 -966
		if(loc.getX() <= 727 && loc.getZ() <= -965
				&& loc.getX() >= 725 && loc.getZ() >= -967) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅1===")) {
					int qNum = cb.getNum(player);
					cb.mq49_1(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅3===")) {
					int qNum = cb.getNum(player);
					cb.mq49_3(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅5===")) {
					int qNum = cb.getNum(player);
					cb.mq49_5(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅7===")) {
					int qNum = cb.getNum(player);
					cb.mq49_7(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===티페라리의 영웅9===")) {
					int qNum = cb.getNum(player);
					cb.mq49_9(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서1===")) {
					int qNum = cb.getNum(player);
					cb.mq50_1(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서8===")) {
					int qNum = cb.getNum(player);
					cb.mq50_8(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===비밀을 찾아서10===")) {
					int qNum = cb.getNum(player);
					cb.mq50_10(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅1===")) {
					int qNum = cb.getNum(player);
					cb.mq51(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅5===")) {
					int qNum = cb.getNum(player);
					cb.mq51_4(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅7===")) {
					int qNum = cb.getNum(player);
					cb.mq51_6(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===변이된 원시의 땅9===")) {
					int qNum = cb.getNum(player);
					cb.mq51_8(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어1===")) {
					int qNum = cb.getNum(player);
					cb.mq52(player, qNum+1);	
				} else if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===세계의 문2===")) {
					int qNum = cb.getNum(player);
					cb.mq52_4(player, qNum+1);	
				} else {
					player.sendMessage("마가이: 마가도 형님은 잘 계실까나.");
				}
			} catch(Exception e) {
				player.sendMessage("마가이: 마가도 형님은 잘 계실까나.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil26() {
		//하드 숲 3816 81 4079
		if(loc.getX() <= 3817 && loc.getZ() <= 4080
				&& loc.getX() >= 3815 && loc.getZ() >= 4078) {
			Inventory inv = player.getInventory();
			boolean bool = false;
			for(ItemStack item : inv.getContents()) {
				if (item == null) {
					continue;
				}
				if(bool == false) {
					if(item.getType() == Material.FLOWER_BANNER_PATTERN) {
						if (item.getItemMeta().getDisplayName().substring(2).equals("숲의 유적 통행증")) {
							item.setAmount(item.getAmount()-1);
							player.sendMessage("던전 키퍼: 살아서 돌아오시게나.");
							player.teleport(new Location(player.getWorld(), 3804.5, 77, 4107, 90, 0));
							player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 0,true,false,false));
							bool = true;
						}
					}
				}
			}
			if(bool == false) {
				player.sendMessage("던전 키퍼: 통행증이 없으면 결계 안으로 들어갈 수 없다네.");
			}
			return true;
		}
		return false;
	}
	
	public boolean vil27() {
		// 볼드 606 -1558
		if(loc.getX() <= 607 && loc.getZ() <= -1557
				&& loc.getX() >= 605 && loc.getZ() >= -1559) {
			QuestBoard cb = new QuestBoard();
			try {
				if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===이베르모어2===")) {
					int qNum = cb.getNum(player);
					cb.mq52_1(player, qNum+1);	
				} else {
					player.sendMessage("볼드: 이런 날씨에는 군고구마를 먹어야하는뎅..");
				}
			} catch(Exception e) {
				player.sendMessage("볼드: 이런 날씨에는 군고구마를 먹어야하는뎅..");
			}
			return true;
		}
		return false;
	}
}
