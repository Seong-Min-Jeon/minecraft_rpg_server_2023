package testPack;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayerStat {

	public void viewStat(Player player) {
		int lvl = player.getLevel();
		if(player.getInventory().getItemInMainHand().getType() == Material.RED_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)"  + " 직업: 본 파이터");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.GREEN_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*5) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*5)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 기사");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.LAPIS_LAZULI) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 프리스트");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.CYAN_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*2) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*2)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 광전사");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.LIGHT_GRAY_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 도박사");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.GRAY_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*20) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 데빌");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.PINK_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*30) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*30)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 엔젤");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.LIME_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*20) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*20)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 대행자");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.YELLOW_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*8) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*8)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 그림자 무사");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.LIGHT_BLUE_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*3) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*3)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 버서커");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.MAGENTA_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*15) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*15)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 군인");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.ORANGE_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 그림 리퍼");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.BLUE_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*50) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*50)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 마인");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.BROWN_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*99) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*99)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 팔라딘");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.BLACK_DYE) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*80) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*80)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 용기사");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.INK_SAC) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*40) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*40)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 특성: 조커");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.CLAY_BALL) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*10) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*10)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 아처");
			viewInheritance(player);
		}
		if(player.getInventory().getItemInMainHand().getType() == Material.GLOWSTONE_DUST) {
			player.getWorld().playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 0.6f, 1.0f);
			player.sendMessage(ChatColor.GREEN + "최대 체력: " + (20 + lvl*60) + " 현재 체력: " + (int)(player.getHealth()*((20 + lvl*60)/20.0)) + 
					" 레벨: " + player.getLevel() + "(" + (int)(player.getExp()*1000)/10.0 + "%)" + " 직업: 파워레인저");
			viewInheritance(player);
		}
	}
	
	public void viewInheritance(Player player) {
		Inheritance inheritance = new Inheritance();
		if(inheritance.getInheritance(player) == 0) {
			
		} else if(inheritance.getInheritance(player) == 1) {
			player.sendMessage(ChatColor.GREEN + "약쟁이의 계승자" + ": 포션 회복량 1.2배");
		} else if(inheritance.getInheritance(player) == 2) {
			player.sendMessage(ChatColor.GREEN + "마녀의 계승자" + ": 포션 회복량 1.5배");
		} else if(inheritance.getInheritance(player) == 3) {
			player.sendMessage(ChatColor.GREEN + "술꾼의 계승자" + ": 포션 회복량 2배");
		} else if(inheritance.getInheritance(player) == 4) {
			player.sendMessage(ChatColor.GREEN + "미꾸라지의 계승자" + ": 회피 확률 5% 증가 (위 효과는 회피의 상한(70%)을 넘어서 적용됩니다.)");
		} else if(inheritance.getInheritance(player) == 5) {
			player.sendMessage(ChatColor.GREEN + "연기의 계승자" + ": 회피 확률 10% 증가 (위 효과는 회피의 상한(70%)을 넘어서 적용됩니다.)");
		} else if(inheritance.getInheritance(player) == 6) {
			player.sendMessage(ChatColor.GREEN + "기쁨의 계승자" + ": 의문의 상자 발견 확률 10% 증가");
		} else if(inheritance.getInheritance(player) == 7) {
			player.sendMessage(ChatColor.GREEN + "행운의 계승자" + ": 의문의 상자 발견 확률 20% 증가");
		} else if(inheritance.getInheritance(player) == 8) {
			player.sendMessage(ChatColor.GREEN + "일꾼의 계승자" + ": 의문의 상자 발견 확률 30% 증가");
		} else if(inheritance.getInheritance(player) == 9) {
			player.sendMessage(ChatColor.GREEN + "럭키의 계승자" + ": 의문의 상자 발견 확률 40% 증가");
		} else if(inheritance.getInheritance(player) == 10) {
			player.sendMessage(ChatColor.GREEN + "기적의 계승자" + ": 의문의 상자 발견 확률 50% 증가");
		} else if(inheritance.getInheritance(player) == 11) {
			player.sendMessage(ChatColor.GREEN + "씨앗의 계승자" + ": 전투 경험치 5% 증가");
		} else if(inheritance.getInheritance(player) == 12) {
			player.sendMessage(ChatColor.GREEN + "떡잎의 계승자" + ": 전투 경험치 10% 증가");
		} else if(inheritance.getInheritance(player) == 13) {
			player.sendMessage(ChatColor.GREEN + "풀잎의 계승자" + ": 전투 경험치 15% 증가");
		} else if(inheritance.getInheritance(player) == 14) {
			player.sendMessage(ChatColor.GREEN + "거목의 계승자" + ": 전투 경험치 20% 증가");
		} else if(inheritance.getInheritance(player) == 15) {
			player.sendMessage(ChatColor.GREEN + "모기의 계승자" + ": 흡혈 0.5%");
		} else if(inheritance.getInheritance(player) == 16) {
			player.sendMessage(ChatColor.GREEN + "흡혈귀의 계승자" + ": 흡혈 1%");
		} else if(inheritance.getInheritance(player) == 17) {
			player.sendMessage(ChatColor.GREEN + "불의 계승자" + ": 화염 피해 10% 감소");
		} else if(inheritance.getInheritance(player) == 18) {
			player.sendMessage(ChatColor.GREEN + "화염의 계승자" + ": 화염 피해 20% 감소");
		} else if(inheritance.getInheritance(player) == 19) {
			player.sendMessage(ChatColor.GREEN + "용암의 계승자" + ": 화염 피해 30% 감소");
		} else if(inheritance.getInheritance(player) == 20) {
			player.sendMessage(ChatColor.GREEN + "파동의 계승자" + ": 폭발 피해 10% 감소");
		} else if(inheritance.getInheritance(player) == 21) {
			player.sendMessage(ChatColor.GREEN + "TNTZ의 계승자" + ": 폭발 피해 20% 감소");
		} else if(inheritance.getInheritance(player) == 22) {
			player.sendMessage(ChatColor.GREEN + "크리퍼의 계승자" + ": 폭발 피해 30% 감소");
		} else if(inheritance.getInheritance(player) == 23) {
			player.sendMessage(ChatColor.GREEN + "검의 계승자" + ": 근접 공격 데미지 5% 증가");
		} else if(inheritance.getInheritance(player) == 24) {
			player.sendMessage(ChatColor.GREEN + "초보 전사의 계승자" + ": 근접 공격 데미지 10% 증가");
		} else if(inheritance.getInheritance(player) == 25) {
			player.sendMessage(ChatColor.GREEN + "용병 전사의 계승자" + ": 근접 공격 데미지 15% 증가");
		} else if(inheritance.getInheritance(player) == 26) {
			player.sendMessage(ChatColor.GREEN + "상급 전사의 계승자" + ": 근접 공격 데미지 20% 증가");
		} else if(inheritance.getInheritance(player) == 27) {
			player.sendMessage(ChatColor.GREEN + "일류 전사의 계승자" + ": 근접 공격 데미지 25% 증가");
		} else if(inheritance.getInheritance(player) == 28) {
			player.sendMessage(ChatColor.GREEN + "대 전사의 계승자" + ": 근접 공격 데미지 30% 증가");
		} else if(inheritance.getInheritance(player) == 29) {
			player.sendMessage(ChatColor.GREEN + "마스터 전사의 계승자" + ": 근접 공격 데미지 35% 증가");
		} else if(inheritance.getInheritance(player) == 30) {
			player.sendMessage(ChatColor.GREEN + "챌린저 전사의 계승자" + ": 근접 공격 데미지 40% 증가");
		} else if(inheritance.getInheritance(player) == 31) {
			player.sendMessage(ChatColor.GREEN + "투왕의 계승자" + ": 근접 공격 데미지 45% 증가");
		} else if(inheritance.getInheritance(player) == 32) {
			player.sendMessage(ChatColor.GREEN + "아레스의 계승자" + ": 근접 공격 데미지 50% 증가");
		} else if(inheritance.getInheritance(player) == 33) {
			player.sendMessage(ChatColor.GREEN + "초보 헌터의 계승자" + ": 원거리 공격 데미지 10% 증가");
		} else if(inheritance.getInheritance(player) == 34) {
			player.sendMessage(ChatColor.GREEN + "용병 헌터의 계승자" + ": 원거리 공격 데미지 15% 증가");
		} else if(inheritance.getInheritance(player) == 35) {
			player.sendMessage(ChatColor.GREEN + "상급 헌터의 계승자" + ": 원거리 공격 데미지 20% 증가");
		} else if(inheritance.getInheritance(player) == 36) {
			player.sendMessage(ChatColor.GREEN + "일류 헌터의 계승자" + ": 원거리 공격 데미지 25% 증가");
		} else if(inheritance.getInheritance(player) == 37) {
			player.sendMessage(ChatColor.GREEN + "대 헌터의 계승자" + ": 원거리 공격 데미지 30% 증가");
		} else if(inheritance.getInheritance(player) == 38) {
			player.sendMessage(ChatColor.GREEN + "마스터 헌터의 계승자" + ": 원거리 공격 데미지 35% 증가");
		} else if(inheritance.getInheritance(player) == 39) {
			player.sendMessage(ChatColor.GREEN + "챌린저 헌터의 계승자" + ": 원거리 공격 데미지 40% 증가");
		} else if(inheritance.getInheritance(player) == 40) {
			player.sendMessage(ChatColor.GREEN + "패왕의 계승자" + ": 원거리 공격 데미지 45% 증가");
		} else if(inheritance.getInheritance(player) == 41) {
			player.sendMessage(ChatColor.GREEN + "아르테미스의 계승자" + ": 원거리 공격 데미지 50% 증가");
		} else if(inheritance.getInheritance(player) == 42) {
			player.sendMessage(ChatColor.GREEN + "무덤의 계승자" + ": 본 체스트 효과 강화");
		} else if(inheritance.getInheritance(player) == 43) {
			player.sendMessage(ChatColor.GREEN + "원시의 계승자" + ": 뼈 던지기 공격력 강화");
		} else if(inheritance.getInheritance(player) == 44) {
			player.sendMessage(ChatColor.GREEN + "멧돼지의 계승자" + ": 차지 어택 넉백 추가");
		} else if(inheritance.getInheritance(player) == 45) {
			player.sendMessage(ChatColor.GREEN + "철의 계승자" + ": 증원 강화 (팬텀 나이트의 공격력이 증가합니다.)");
		} else if(inheritance.getInheritance(player) == 46) {
			player.sendMessage(ChatColor.GREEN + "원자력의 계승자" + ": 자폭 공격력 강화");
		} else if(inheritance.getInheritance(player) == 47) {
			player.sendMessage(ChatColor.GREEN + "넬의 계승자" + ": 넬의 사랑 회복량 증가");
		} else if(inheritance.getInheritance(player) == 48) {
			player.sendMessage(ChatColor.GREEN + "딘의 계승자" + ": 딘의 화염 효과 강화");
		} else if(inheritance.getInheritance(player) == 49) {
			player.sendMessage(ChatColor.GREEN + "야수의 계승자" + ": 열귀각 자가 피해 감소");
		} else if(inheritance.getInheritance(player) == 50) {
			player.sendMessage(ChatColor.GREEN + "마수의 계승자" + ": 마인권 공격력 강화");
		} else if(inheritance.getInheritance(player) == 51) {
			player.sendMessage(ChatColor.GREEN + "도박사의 계승자" + ": 도박사의 판 효과 강화");
		} else if(inheritance.getInheritance(player) == 52) {
			player.sendMessage(ChatColor.GREEN + "어부의 계승자" + ": 악마의 장난의 효과 강화");
		} else if(inheritance.getInheritance(player) == 53) {
			player.sendMessage(ChatColor.GREEN + "화신의 계승자" + ": 인페르노의 공격력 강화");
		} else if(inheritance.getInheritance(player) == 54) {
			player.sendMessage(ChatColor.GREEN + "대천사장의 계승자" + ": 천사의 기사단 강화 (기사단장의 공격력이 증가합니다.)");
		} else if(inheritance.getInheritance(player) == 55) {
			player.sendMessage(ChatColor.GREEN + "날개의 계승자" + ": 천사의 축복 회복량 증가");
		} else if(inheritance.getInheritance(player) == 56) {
			player.sendMessage(ChatColor.GREEN + "주사위의 계승자" + ": 창조의 대행 회복량 증가");
		} else if(inheritance.getInheritance(player) == 57) {
			player.sendMessage(ChatColor.GREEN + "흥의 계승자" + ": 신들의 풍악 효과 강화");
		} else if(inheritance.getInheritance(player) == 58) {
			player.sendMessage(ChatColor.GREEN + "까마귀의 계승자" + ": 발도 범위 증가");
		} else if(inheritance.getInheritance(player) == 59) {
			player.sendMessage(ChatColor.GREEN + "그림자의 계승자" + ": 나이트메어 자가 피해 감소");
		} else if(inheritance.getInheritance(player) == 60) {
			player.sendMessage(ChatColor.GREEN + "호흡의 계승자" + ": 화둔 공격력 강화");
		} else if(inheritance.getInheritance(player) == 61) {
			player.sendMessage(ChatColor.GREEN + "투창의 계승자" + ": 엘·초펠 범위 증가");
		} else if(inheritance.getInheritance(player) == 62) {
			player.sendMessage(ChatColor.GREEN + "포식의 계승자" + ": 엘·예브른 공격력 강화");
		} else if(inheritance.getInheritance(player) == 63) {
			player.sendMessage(ChatColor.GREEN + "파편의 계승자" + ": 수류탄 투척 범위 증가");
		} else if(inheritance.getInheritance(player) == 64) {
			player.sendMessage(ChatColor.GREEN + "붕대의 계승자" + ": 구급법 회복량 증가");
		} else if(inheritance.getInheritance(player) == 65) {
			player.sendMessage(ChatColor.GREEN + "푸른 영혼의 계승자" + ": 영혼 흡착 효과 강화");
		} else if(inheritance.getInheritance(player) == 66) {
			player.sendMessage(ChatColor.GREEN + "붉은 영혼의 계승자" + ": 칼라수트라 효과 강화");
		} else if(inheritance.getInheritance(player) == 67) {
			player.sendMessage(ChatColor.GREEN + "영혼의 계승자" + ": 카르마 공격력 강화");
		} else if(inheritance.getInheritance(player) == 68) {
			player.sendMessage(ChatColor.GREEN + "속사의 계승자" + ": 에로우 스톰 공격력 강화");
		} else if(inheritance.getInheritance(player) == 69) {
			player.sendMessage(ChatColor.GREEN + "집중의 계승자" + ": 밤 에로우 범위 증가");
		} else if(inheritance.getInheritance(player) == 70) {
			player.sendMessage(ChatColor.GREEN + "거미 눈의 계승자" + ": 독 데미지 10% 경감");
		} else if(inheritance.getInheritance(player) == 71) {
			player.sendMessage(ChatColor.GREEN + "거미 이빨의 계승자" + ": 독 데미지 20% 경감");
		} else if(inheritance.getInheritance(player) == 72) {
			player.sendMessage(ChatColor.GREEN + "거미 갑주의 계승자" + ": 독 데미지 30% 경감");
		} else if(inheritance.getInheritance(player) == 73) {
			player.sendMessage(ChatColor.GREEN + "산성의 계승자" + ": 독 데미지 40% 경감");
		} else if(inheritance.getInheritance(player) == 74) {
			player.sendMessage(ChatColor.GREEN + "독의 계승자" + ": 독 데미지 50% 경감");
		} else if(inheritance.getInheritance(player) == 75) {
			player.sendMessage(ChatColor.GREEN + "포보르 피의 계승자" + ": 위더 데미지 10% 경감");
		} else if(inheritance.getInheritance(player) == 76) {
			player.sendMessage(ChatColor.GREEN + "포보르 쓸개의 계승자" + ": 위더 데미지 20% 경감");
		} else if(inheritance.getInheritance(player) == 77) {
			player.sendMessage(ChatColor.GREEN + "포보르 살점의 계승자" + ": 위더 데미지 30% 경감");
		} else if(inheritance.getInheritance(player) == 78) {
			player.sendMessage(ChatColor.GREEN + "포보르 간의 계승자" + ": 위더 데미지 40% 경감");
		} else if(inheritance.getInheritance(player) == 79) {
			player.sendMessage(ChatColor.GREEN + "위더의 계승자" + ": 위더 데미지 50% 경감");
		} else if(inheritance.getInheritance(player) == 80) {
			player.sendMessage(ChatColor.GREEN + "광부의 계승자" + ": 광물 채광 무조건 성공");
		} else if(inheritance.getInheritance(player) == 81) {
			player.sendMessage(ChatColor.GREEN + "농부의 계승자" + ": 밀 수확 무조건 성공");
		} else if(inheritance.getInheritance(player) == 82) {
			player.sendMessage(ChatColor.GREEN + "도살자의 계승자" + ": 고기 채집 무조건 성공");
		} else if(inheritance.getInheritance(player) == 83) {
			player.sendMessage(ChatColor.GREEN + "상급 대장장이의 계승자" + ": 장비 제작 강화 I");
		} else if(inheritance.getInheritance(player) == 84) {
			player.sendMessage(ChatColor.GREEN + "일류 대장장이의 계승자" + ": 장비 제작 강화 II");
		} else if(inheritance.getInheritance(player) == 85) {
			player.sendMessage(ChatColor.GREEN + "신의 대장장이의 계승자" + ": 장비 제작 강화 III");
		} else if(inheritance.getInheritance(player) == 86) {
			player.sendMessage(ChatColor.GREEN + "상급 약사의 계승자" + ": 포션 제조 강화 I");
		} else if(inheritance.getInheritance(player) == 87) {
			player.sendMessage(ChatColor.GREEN + "일류 약사의 계승자" + ": 포션 제조 강화 II");
		} else if(inheritance.getInheritance(player) == 88) {
			player.sendMessage(ChatColor.GREEN + "신의 약사의 계승자" + ": 포션 제조 강화 III");
		} else if(inheritance.getInheritance(player) == 89) {
			player.sendMessage(ChatColor.GREEN + "상급 요리사의 계승자" + ": 음식 제작 강화 I");
		} else if(inheritance.getInheritance(player) == 90) {
			player.sendMessage(ChatColor.GREEN + "일류 요리사의 계승자" + ": 음식 제작 강화 II");
		} else if(inheritance.getInheritance(player) == 91) {
			player.sendMessage(ChatColor.GREEN + "신의 요리사의 계승자" + ": 음식 제작 강화 III");
		} else if(inheritance.getInheritance(player) == 92) {
			player.sendMessage(ChatColor.GREEN + "고블린의 계승자" + ": 10% 확률로 몬스터 드랍 에메랄드 2배");
		} else if(inheritance.getInheritance(player) == 93) {
			player.sendMessage(ChatColor.GREEN + "상인 고블린의 계승자" + ": 20% 확률로 몬스터 드랍 에메랄드 2배");
		} else if(inheritance.getInheritance(player) == 94) {
			player.sendMessage(ChatColor.GREEN + "거상 고블린의 계승자" + ": 30% 확률로 몬스터 드랍 에메랄드 2배");
		} else if(inheritance.getInheritance(player) == 95) {
			player.sendMessage(ChatColor.GREEN + "갑부 고블린의 계승자" + ": 40% 확률로 몬스터 드랍 에메랄드 2배");
		} else if(inheritance.getInheritance(player) == 96) {
			player.sendMessage(ChatColor.GREEN + "탐욕의 계승자" + ": 50% 확률로 몬스터 드랍 에메랄드 2배");
		} else if(inheritance.getInheritance(player) == 97) {
			player.sendMessage(ChatColor.GREEN + "유혹의 계승자" + ": 채광 시 보석 획득 확률 증가 I");
		} else if(inheritance.getInheritance(player) == 98) {
			player.sendMessage(ChatColor.GREEN + "매혹의 계승자" + ": 채광 시 보석 획득 확률 증가 II");
		} else if(inheritance.getInheritance(player) == 99) {
			player.sendMessage(ChatColor.GREEN + "고혹의 계승자" + ": 채광 시 보석 획득 확률 증가 III");
		} else if(inheritance.getInheritance(player) == 100) {
			player.sendMessage(ChatColor.GREEN + "태양의 계승자" + ": 일정 시간대에 각종 버프 획득");
		} else if(inheritance.getInheritance(player) == 101) {
			player.sendMessage(ChatColor.GREEN + "달의 계승자" + ": 일정 시간대에 각종 버프 획득");
		}
	}
	
}
