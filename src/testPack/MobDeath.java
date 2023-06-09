package testPack;

import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MobDeath {
	
	Player player = null;
	Random rnd = new Random();

	public MobDeath() {
		
	}
	
	public MobDeath(Entity mobArg) {
		Entity mob = mobArg;
		death(mob, 9999999);
	}

	public MobDeath(Entity mobArg, double damageArg) {
		Entity mob = mobArg;
		double damage = damageArg;
		death(mob, damage);
	}

	public void death(Entity mob, double damage) {
		Player lootPlayer;
		if (player == null) {
			if(((Mob) mob).getTarget() instanceof Player) {
				lootPlayer = (Player) (((Mob) mob).getTarget());				
			} else {
				List<Entity> near = mob.getNearbyEntities(5, 5, 5);
				for(Entity ent : near) {
					if(ent instanceof Player) {
						player = (Player) ent;
						break;
					}
				}
				lootPlayer = player;
			}
		} else {
			lootPlayer = this.player;
		}
		
		MobLoot mobloot = new MobLoot();
		
		if (((LivingEntity) mob).getHealth() - damage <= 0) {
			
			try {
				String name = mob.getCustomName();

				if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐")) {
					mobloot.rat(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "쥐 두목")) {
					mobloot.ratBoss(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "청소부")) {
					mobloot.cleaner(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 9급 해결사")) {
					mobloot.fixer9(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 8급 해결사")) {
					mobloot.fixer8(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 7급 해결사")) {
					mobloot.fixer7(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "갈고리 사무소 해결사")) {
					mobloot.galgori(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원")) {
					mobloot.ironman(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원")) {
					mobloot.dog(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원")) {
					mobloot.ggul(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원")) {
					mobloot.axe(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원")) {
					mobloot.meat(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 간부")) {
					mobloot.chainB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 카시라")) {
					mobloot.kuroB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 전투원")) {
					mobloot.carniB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 간부")) {
					mobloot.ironballB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 간부")) {
					mobloot.habaB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 조직원")) {
					mobloot.chain(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 와카슈")) {
					mobloot.kuro(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 재단사")) {
					mobloot.carni(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 조직원")) {
					mobloot.ironball(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 조직원")) {
					mobloot.haba(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "엄지 솔다토")) {
					mobloot.thumb(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검지 수행자")) {
					mobloot.index(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "웃는 얼굴들")) {
					mobloot.laugh(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 조직원")) {
					mobloot.mariachi(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "규율을 따르는 엄지 솔다토")) {
					mobloot.thumbB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "신념이 강한 검지 수행자")) {
					mobloot.indexB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "연기에 중독된 웃는 얼굴들")) {
					mobloot.laughB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "마리아치 간부")) {
					mobloot.mariachiB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "엄지 카포")) {
					mobloot.thumbCP(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검지 대행자")) {
					mobloot.indexMS(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검지 전령")) {
					mobloot.indexSD(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "콩콩이파 조직원")) {
					mobloot.kong(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "검계 조직원")) {
					mobloot.sword(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "밤의 송곳 조직원")) {
					mobloot.awl(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "처형 집행자 엄지 카포")) {
					mobloot.thumbCPB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "해금된 검지 대행자")) {
					mobloot.indexMSB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "콩콩이파 간부")) {
					mobloot.kongB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "무명의 검계 삿갓")) {
					mobloot.swordB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "밤의 송곳 간부")) {
					mobloot.awlB(lootPlayer);
				} else if (name.equalsIgnoreCase(ChatColor.WHITE + "" + ChatColor.BOLD + "변이된 나뭇잎")) {
					mobloot.d1_1(lootPlayer);
				}
				
			} catch (Exception e) {

			}
			
			try {
				String name = lootPlayer.getInventory().getItem(7).getItemMeta().getLocalizedName();
				if(name.equals("리우 협회 3과 해결사의 인격")) {
					lootPlayer.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0, true, false, true));
					lootPlayer.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "전투로 몸이 달아오릅니다. [위력 +1]");
				}
			} catch(Exception e) {
				
			}
		}
	}
}
