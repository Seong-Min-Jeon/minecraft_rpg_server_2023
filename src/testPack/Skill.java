package testPack;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FluidCollisionMode;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Pose;
import org.bukkit.entity.Snowball;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class Skill {
	
	private int sleep = 0;
	Player player = null;
	World world = null;
	Random rnd = new Random();
	int personality = 0;
	private static Map<Player, Integer> timer = new HashMap<>();
	private static Map<Player, Integer> timer2 = new HashMap<>();

	public void effect(Player player, String rot) {
		
		boolean bool = false;
		
		try {
			if(!player.isSwimming()) {
				try {
					ItemStack item = player.getInventory().getItem(7);
					String name = item.getItemMeta().getDisplayName();
					personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
					
					if(personality == 9) {
						personality = 10;
					}
				} catch(Exception e2) {
					
				}
				
				String name = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
				world = player.getWorld();
				
				if(name.equals("평범한 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 500);
						if (bool) {
							sendPacket(player, "가벼운 공격");
							skill1(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "가벼운 방어");
							skill2(player);
						}
					}
				} else if(name.equals("윤 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "회피 공격");
							skill3(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1500);
						if (bool) {
							sendPacket(player, "재빠름");
							skill4(player);
						}
					}
				} else if(name.equals("갈고리 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "압도");
							skill5(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "받아내보시지");
							skill6(player);
						}
					}
				} else if(name.equals("가로등 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쳐내기");
							skill7(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 6000);
						if (bool) {
							sendPacket(player, "연속 방어");
							skill8(player);
						}
					}
				} else if(name.equals("어금니 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 600);
						if (bool) {
							sendPacket(player, "도박수");
							skill9(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 20000);
						if (bool) {
							sendPacket(player, "신속보법");
							skill10(player);
						}
					}
				} else if(name.equals("마침표 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "발사");
							skill11(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "무차별 사격");
							skill12(player);
						}
					}
				} else if(name.equals("새벽 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "노을빛 검");
							skill13(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 20000);
						if (bool) {
							sendPacket(player, "쌍화차 보충");
							skill14(player);
						}
					}
				} else if(name.equals("쐐기 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쾌속 찌르기");
							skill15(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "섬광의 창");
							skill16(player);
						}
					}
				} else if(name.equals("시선 사무소 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "전기 충격");
							skill17(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1600);
						if (bool) {
							sendPacket(player, "피할 수 없는 시선");
							skill18(player);
						}
					}
				} else if(name.equals("쥐의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "쥐의 생존법");
							skill19(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1000);
						if (bool) {
							sendPacket(player, "내장담기");
							skill20(player);
						}
					}
				} else if(name.equals("철의 형제의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 900);
						if (bool) {
							sendPacket(player, "저절단");
							skill21(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2000);
						if (bool) {
							sendPacket(player, "이인생 한방");
							skill22(player);
						}
					}
				} else if(name.equals("버림받은 개의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1500);
						if (bool) {
							sendPacket(player, "충격 강타");
							skill23(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 2700);
						if (bool) {
							sendPacket(player, "됐고!");
							skill24(player);
						}
					}
				} else if(name.equals("꿀꿀이네 조직원의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "재료 사냥");
							skill25(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000 - personality*400);
						if (bool) {
							sendPacket(player, "요리 준비");
							skill26(player);
						}
					}
				} else if(name.equals("도끼파 조직원의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "으깨기");
							skill27(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "땅 흔들기");
							skill28(player);
						}
					}
				} else if(name.equals("정육점파 조직원의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1100);
						if (bool) {
							sendPacket(player, "잔혹함");
							skill29(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 3000);
						if (bool) {
							sendPacket(player, "무엇이든 도축할 수 있지");
							skill30(player);
						}
					}
				} else if(name.equals("윤의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "느려");
							skill31(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000 - personality*400);
						if (bool) {
							sendPacket(player, "진두지휘");
							skill32(player);
						}
					}
				} else if(name.equals("맥컬린의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "광란");
							skill33(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 300000 - personality*20000);
						if (bool) {
							sendPacket(player, "추적");
							skill34(player);
						}
					}
				} else if(name.equals("산의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 400);
						if (bool) {
							sendPacket(player, "속공");
							skill35(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1000000 - personality*50000);
						if (bool) {
							sendPacket(player, "업무처리");
							skill36(player);
						}
					}
				} else if(name.equals("태인의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 5500);
						if (bool) {
							sendPacket(player, "받아내보시지");
							skill37(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 3000 - personality*150);
						if (bool) {
							sendPacket(player, "먼저간다");
							skill38(player);
						}
					}
				} else if(name.equals("레인의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "도박수");
							skill39(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000 - personality*200);
						if (bool) {
							sendPacket(player, "침착하게");
							skill40(player);
						}
					}
				} else if(name.equals("올가의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1500);
						if (bool) {
							sendPacket(player, "맹습");
							skill41(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000);
						if (bool) {
							sendPacket(player, "과감한 판단");
							skill42(player);
						}
					}
				} else if(name.equals("츠바이 협회 6과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "견제");
							skill43(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 500000 - personality*20000);
						if (bool) {
							sendPacket(player, "치안수호");
							skill44(player);
						}
					}
				} else if(name.equals("츠바이 협회 5과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1200);
						if (bool) {
							sendPacket(player, "맞서기");
							skill45(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 500000 - personality*20000);
						if (bool) {
							sendPacket(player, "치안수호");
							skill46(player);
						}
					}
				} else if(name.equals("시 협회 5과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1300);
						if (bool) {
							sendPacket(player, "비검");
							skill47(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 400000 - personality*20000);
						if (bool) {
							sendPacket(player, "그런데 그때 시협회가 나타났다");
							skill48(player);
						}
					}
				} else if(name.equals("리우 협회 5과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1500);
						if (bool) {
							sendPacket(player, "몰아치기");
							skill49(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 8000);
						if (bool) {
							sendPacket(player, "정면돌파");
							skill50(player);
						}
					}
				} else if(name.equals("세븐 협회 5과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 800);
						if (bool) {
							sendPacket(player, "예측 분석");
							skill51(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 800);
						if (bool) {
							sendPacket(player, "빈틈 간파");
							skill52(player);
						}
					}
				} else if(name.equals("스테판의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "근접전은 싫어");
							skill53(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 4000);
						if (bool) {
							sendPacket(player, "한 점만 노리겠어");
							skill54(player);
						}
					}
				} else if(name.equals("유나의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 700);
						if (bool) {
							sendPacket(player, "나비 베기");
							skill55(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 1500);
						if (bool) {
							sendPacket(player, "사출");
							skill56(player);
						}
					}
				} else if(name.equals("파멜리의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 2000);
						if (bool) {
							sendPacket(player, "창 휩쓸기");
							skill57(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "섬광의 창");
							skill58(player);
						}
					}
				} else if(name.equals("달록의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1500);
						if (bool) {
							sendPacket(player, "파지지직");
							skill59(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 30000 - personality*2000);
						if (bool) {
							sendPacket(player, "관측");
							skill60(player);
						}
					}
				} else if(name.equals("츠바이 협회 3과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1000);
						if (bool) {
							sendPacket(player, "제압");
							skill61(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 30000 - personality*1000);
						if (bool) {
							sendPacket(player, "수호자");
							skill62(player);
						}
					}
				} else if(name.equals("시 협회 3과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1200);
						if (bool) {
							sendPacket(player, "극검");
							skill63(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 20000 - personality*1000);
						if (bool) {
							sendPacket(player, "과호흡/탈진");
							skill64(player);
						}
					}
				} else if(name.equals("리우 협회 3과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 1200);
						if (bool) {
							sendPacket(player, "올려차기");
							skill65(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000 - personality*500);
						if (bool) {
							sendPacket(player, "전면전");
							skill66(player);
						}
					}
				} else if(name.equals("세븐 협회 3과 해결사의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 650);
						if (bool) {
							sendPacket(player, "세븐 협회 스킬 1번");
							skill67(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 10000);
						if (bool) {
							sendPacket(player, "리포스트");
							skill68(player);
						}
					}
				} else if(name.equals("W사 정리요원의 인격")) {
					if(rot.equals("L")) {
						bool = reload(player, 900);
						if (bool) {
							sendPacket(player, "에너지 순환");
							skill69(player);
						}
					} else if(rot.equals("R")) {
						bool = reload2(player, 5000);
						if (bool) {
							sendPacket(player, "W사 스킬 2번");
							skill70(player);
						}
					}
				}
				
			}
		} catch(Exception e) {
			
		}
	}

	public void effectThorn(Player player, int damage) {
		world = player.getWorld();
		
		List<Entity> entitylist = player.getNearbyEntities(1.5, 1.5, 1.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, damage-10);
				nearMob.setVelocity(nearMob.getLocation().getDirection().multiply(-1.4f));
			}
		}
		
		player.setNoDamageTicks(2);
		world.playSound(player.getLocation(), Sound.ITEM_SHIELD_BREAK, 3.0f, 1.0f);
		
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			
			if(name.equals("W사 정리요원의 인격")) {
				CharacterStack cs = new CharacterStack();
				int stack = cs.returnStack(player);
				if(stack < 10) {
					stack++;
					cs.put(player, stack);
				}
				sendPacket(player, "되돌리기 (§b" + stack + "§f)");
			}
		} catch(Exception e2) {
			
		}
	}
	
	public void skill1(Player player) {
		new ParticleEffect(player).pS001();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
			}
		}
	}
	
	public void skill2(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.setNoDamageTicks(15 + (personality*1));
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 15 + (personality*1), 0, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
	}
	
	public void skill3(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.1,0,1.1).add(new Vector(0,0.1,0))));
				}

				if(time >= 10) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2.5);
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill4(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6+(0.02*personality),0,1.6+(0.02*personality)).add(new Vector(0,0.2,0))));
	}
	
	public void skill5(Player player) {
		new ParticleEffect(player).pS002();
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.5, 1, 0.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3);
			}
		}
	}
	
	public void skill6(Player player) {
		player.setVelocity(player.getFacing().getDirection().multiply(-0.3f));
		player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0, true, false, true));
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
				if(time == 40) {
					player.setVelocity(player.getFacing().getDirection().add(new Vector(0,-0.5,0)).multiply(2.0f));
					
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
				}
				
				if(time >= 40 && player.isOnGround()) {
					new ParticleEffect(player).pS003();
					
					List<Entity> entitylist = player.getNearbyEntities(1.5, 1, 1.5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 3.5);
						}
					}
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill7(Player player) {
		new ParticleEffect(player).pS004();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.6, 1, 0.6);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
				nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.3,0,1.3).add(new Vector(0,0.2,0))));
			}
		}
	}
	
	public void skill8(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
				if(time == 0) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				} 
				
				if(time == 20) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}
				
				if(time == 40) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}
				
				if(time >= 60) {
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill9(Player player) {
		new ParticleEffect(player).pS005();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, rnd.nextInt(10)*0.1*rnd.nextInt(6)+0.1); 
			}
		}
	}
	
	public void skill10(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200 + (personality*10), 1, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_HORSE_GALLOP, 3.0f, 1.0f);
	}
	
	public void skill11(Player player) {
		if(player.getLevel() < 1000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 1000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setDamage(damageProj(player, 2));
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 6) {
					arrow.remove();
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill12(Player player) {
		if(player.getLevel() < 5000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 5000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			int repeat = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					Location normal = player.getEyeLocation();
					
					double arrowAngle1 = rnd.nextInt(91) + 45;
			        double totalAngle1 = normal.getYaw() + arrowAngle1;
			        double arrowDirX1 = Math.cos(Math.toRadians(totalAngle1));
			        double arrowDirZ1 = Math.sin(Math.toRadians(totalAngle1));
			        Vector arrowDir1 = new Vector(arrowDirX1, normal.getDirection().getY(), arrowDirZ1).multiply(1.2f);
					arrow = player.launchProjectile(Arrow.class, arrowDir1);
					arrow.setShooter(player);
					arrow.setDamage(damageProj(player, 2));
					arrow.setVelocity(arrowDir1.multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 6) {
					arrow.remove();
				}
				
				if(repeat == 5 && time >= 6) {
					this.cancel();
				}
				
				time++;
				
				if(time >= 7) {
					time = 0;
					repeat++;
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill13(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new ParticleEffect(player).pS006();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.6, 1, 0.6);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1); 
				
				if(nearMob instanceof Mob || nearMob instanceof Player) {
					new BukkitRunnable() {
						int time = 0;

					    @Override
						public void run() {
					    	
					    	if(time == 1) {
					    		nearMob.setFireTicks(100);
					    		this.cancel();
					    	}
					    	
							time++;
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					
					new FireDamageList().putMap(nearMob, 0.5+(personality*0.05));
				}
			}
		}
	}
	
	public void skill14(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 200 + (personality*10), 0, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_DRINK, 1.0f, 1.0f);
	}
	
	public void skill15(Player player) {
		new ParticleEffect(player).pS007();
		
		double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
        }
        
        List<Entity> entitylist;
        
        if (0 <= rotation && rotation < 45) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else if (45 <= rotation && rotation < 135) {
        	entitylist = near4RotsEntities(player, 3.5, 1.2, 1, 0.3);
        } else if (135 <= rotation && rotation < 225) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else if (225 <= rotation && rotation < 315) {
        	entitylist = near4RotsEntities(player, 3.5, 1.2, 1, 0.3);
        } else if (315 <= rotation && rotation < 360) {
        	entitylist = near4RotsEntities(player, 3.5, 0.3, 1, 1.2);
        } else {
        	entitylist = near4RotsEntities(player, 0.1, 0.1, 0.1, 0.1);
        }
		
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3); 
			}
		}
	}
	
	public void skill16(Player player) {
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6,0,1.6).add(new Vector(0,0.2,0))));
		
		new ParticleEffect(player).pS008();
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
		    	if(time == 2) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.6, 0.6, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 5) {
		    		new ParticleEffect(player).pS008_1();
		    		
		    		List<Entity> entitylist = player.getNearbyEntities(0.6, 0.6, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 8) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.6, 0.6, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time >= 11) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.6, 0.6, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 0.5); 
		    			}
		    		}
		    		this.cancel();
		    	}
		    	
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		player.setNoDamageTicks(20);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
	}
	
	public void skill17(Player player) {
		new ParticleEffect(player).pS009();
		
		List<Entity> entitylist = player.getNearbyEntities(1.5, 1.5, 1.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
			}
		}
	}
	
	public void skill18(Player player) {
		new ParticleEffect(player).pS010();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1);
				
				if(nearMob instanceof Player) {
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ이름: " + ((Player) nearMob).getDisplayName());
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ체력: " + nearMob.getHealth());
				} else if(nearMob instanceof Mob && !(nearMob instanceof ArmorStand)) {
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ이름: " + nearMob.getCustomName());
					player.sendMessage(ChatColor.DARK_AQUA + "ㆍ체력: " + nearMob.getHealth()*10);
					if(nearMob.getCustomName().substring(0, 2).equals("§a")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 전설이나 그 이하");						
					} else if(nearMob.getCustomName().substring(0, 2).equals("§e")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 질병");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§c")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시 악몽");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§5")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 도시의 별이나 그 이상");
					} else if(nearMob.getCustomName().substring(0, 2).equals("§f")) {
						player.sendMessage(ChatColor.DARK_AQUA + "ㆍ재해등급: 측정된 자료 없음");
					}
				}
				
			}
		}
	}
	
	public void skill19(Player player) {
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					player.setNoDamageTicks(12);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 12, 0, true, false, true));
					world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
				}

				if(time >= 10) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill20(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new ParticleEffect(player).pS011();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				double hel = nearMob.getHealth();
				double dam = damageRet(player, nearMob, 2);
				
				if(hel <= dam) {
					ItemStack food = new ItemStack(Material.BEEF);
					ItemMeta foodIm = food.getItemMeta();
					foodIm.setDisplayName(ChatColor.RED + "누군가의 살점");
					ArrayList<String> foodLore = new ArrayList<>();
					foodLore.add(ChatColor.GRAY + "뒷골목에서 채취한 신선한 고기");
					foodLore.add(ChatColor.GRAY + "");
					foodLore.add(ChatColor.GRAY + "호사유피 인사유명이라 하였소.");
					foodLore.add(ChatColor.GRAY + "혈에는 말갛게 꽃이 피었소.");
					foodLore.add(ChatColor.GRAY + "이런 척박한 도시에서도 결국");
					foodLore.add(ChatColor.GRAY + "봉오리는 피우는구려.");
					foodIm.setLore(foodLore);
					food.setItemMeta(foodIm);
					player.getInventory().addItem(food);
				}
			}
		}
	}
	
	public void skill21(Player player) {
		new ParticleEffect(player).pS012();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
			}
		}
	}
	
	public void skill22(Player player) {
		new ParticleEffect(player).pS013();
		
		List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, player.getHealth()-0.9);
			}
		}
		
		player.setHealth(1);
	}
	
	public void skill23(Player player) {
		new ParticleEffect(player).pS014();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3);
				nearMob.setVelocity(new Vector(0,0.9,0));
			}
		}
	}
	
	public void skill24(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
				}
				
				if(time == 20) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
				}

				if(time >= 40) {
					new ParticleEffect(player).pS015();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.9, 1, 0.9);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.5);
							nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill25(Player player) {
		new ParticleEffect(player).pS016();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.5, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damageMax(player, nearMob, 2);
			}
		}
	}
	
	public void skill26(Player player) {
		new ParticleEffect(player).pS017();
		
		List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Player && nearEntity != player) {
				Player p = (Player) nearEntity;
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, true));
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "맛있는 재료를 발견했습니다. [위력 +1]");
			}
		}
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, true));
		player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "맛있는 재료를 발견했습니다. [위력 +1]");
	}
	
	public void skill27(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
				
		    	if (time == 0) {
		    		player.setVelocity(new Vector(0,0.6,0));
				}
				
				if (time >= 10 && player.isOnGround()) {
					new ParticleEffect(player).pS018();
					
					List<Entity> entitylist = player.getNearbyEntities(2, 1, 2);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 3);
						}
					}
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill28(Player player) {
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 255, true, false, true));
		player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 40, 255, true, false, true));
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					new ParticleEffect(player).pS019();
					
					List<Entity> entitylist = player.getNearbyEntities(3, 1, 3);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 0.5);
							nearMob.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 40, 255, true, false, true));
						}
					}
				}
				
				if(time >= 40) {
					new ParticleEffect(player).pS019_1();
					
					List<Entity> entitylist = player.getNearbyEntities(3, 1, 3);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2.5);
							nearMob.setVelocity(new Vector(0, 0.8, 0));
						}
					}
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill29(Player player) {
		new ParticleEffect(player).pS020();
		
		List<Entity> entitylist = player.getNearbyEntities(2, 2, 2);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
			}
		}
	}
	
	public void skill30(Player player) {
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
		    	if(time == 0) {
		    		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.4,0,1.4).add(new Vector(0,0.2,0))));
		    		new ParticleEffect(player).pS021();
		    	}
		    	
		    	if(time == 5) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 10) {
		    		new ParticleEffect(player).pS021();
		    		
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 15) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 20) {
		    		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.4,0,1.4).add(new Vector(0,0.2,0))));
		    		new ParticleEffect(player).pS021();
		    	}
		    	
		    	if(time == 25) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 30) {
		    		new ParticleEffect(player).pS021();
		    		
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 35) {
		    		List<Entity> entitylist = nearFrontEntities(player, 0, 0.6, 1, 0.6);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damageMax(player, nearMob, 0.5); 
		    			}
		    		}
		    		this.cancel();
		    	}
		    	
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		player.setNoDamageTicks(35);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 35, 0, true, false, true));
	}
	
	public void skill31(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2.5);
						}
					}
				}

				if(time >= 10) {
					player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.1,0,1.1).add(new Vector(0,0.1,0))));
					
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill32(Player player) {
		new ParticleEffect(player).pS022();
		
		List<Entity> entitylist = player.getNearbyEntities(3.5, 3.5, 3.5);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Player && nearEntity != player) {
				Player p = (Player) nearEntity;
				p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, true));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 0, true, false, true));
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "윤의 지휘로 사기가 증가합니다. [위력 +1] [보호 +1]");
			}
		}
		player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, true));
		player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 0, true, false, true));
		player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "사기가 증가합니다. [위력 +1] [보호 +1]");
	}
	
	public void skill33(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		int rot = rnd.nextInt(150 - personality*14) + 15 + personality*7;
		
		new ParticleEffect(player).pS023(rot);
		
		List<Entity> entitylist = nearFrontEntitiesDirection(player, 1.8, 0.8, 1, 0.8, rot);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3.5);
			}
		}
	}
	
	public void skill34(Player player) {
		
		new BukkitRunnable() {
			int time = 0;
			Location target = null;

			@Override
			public void run() {
				
				if(time == 0) {
					List<Entity> entitylist = player.getNearbyEntities(20, 15, 20);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof Player) {
							if(((Player) nearEntity).getGameMode() != GameMode.SPECTATOR) {
								target = nearEntity.getLocation();
								break;
							}
						}
					}
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 0, true, false, true));
				}

				if(time >= 20) {
					if(target != null) {
						player.teleport(target);
					} else {
						player.sendMessage(ChatColor.RED + "대상이 존재하지 않습니다.");
						timer2.remove(player);
					}
					this.cancel();
				}

				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill35(Player player) {
		new ParticleEffect(player).pS001();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1.8);
			}
		}
	}
	
	public void skill36(Player player) {
		if(!new QuestBoard().getQuestName(player).equals("N")) {
			
			//퀘스트 제거
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//퀘스트 엔티티 제거
			try {
				QuestOwner qo = new QuestOwner();
				if(qo.returnEntity(player) != null) {
					qo.returnEntity(player).remove();
					qo.remove(player);
				}
			} catch(Exception e) {
				
			}
			
			for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
				n.update();
				n.forceUpdate();
			} 
			
			player.sendMessage(ChatColor.BOLD + "퀘스트가 처리되었습니다.");
		} else {
			player.sendMessage(ChatColor.RED + "퀘스트가 없습니다.");
			timer2.remove(player);
		}
	}
	
	public void skill37(Player player) {
		player.setVelocity(player.getFacing().getDirection().multiply(-0.3f));
		player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 40, 0, true, false, true));
		
		new BukkitRunnable() {
			int time = 0;
			boolean lock1 = false;
			boolean lock2 = false;

		    @Override
			public void run() {
		    	
				if(time == 40 && lock1 == false) {
					player.setVelocity(player.getFacing().getDirection().add(new Vector(0,-0.5,0)).multiply(2.0f));
					
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
				}
				
				if(time >= 40 && player.isOnGround() && lock1 == false) {
					new ParticleEffect(player).pS024();
					
					List<Entity> entitylist = player.getNearbyEntities(1.5, 1, 1.5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 4);
						}
					}
					
					lock1 = true;
					time = 0;
				}
				
				
				if(time == 10 && lock1 == true && lock2 == false) {
					player.setVelocity(player.getFacing().getDirection().add(new Vector(0,0.2,0)).multiply(1.5f));
					
					player.setNoDamageTicks(10);
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 10, 0, true, false, true));
				}
				
				if(time >= 15 && lock1 == true && lock2 == false) {
					new ParticleEffect(player).pS024();
					
					List<Entity> entitylist = player.getNearbyEntities(1.5, 1, 1.5);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 4);
						}
					}
					this.cancel();
				}
				
				time++;

			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill38(Player player) {
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.7,0,1.7).add(new Vector(0,0.2,0))));
	}
	
	public void skill39(Player player) {
		new ParticleEffect(player).pS025();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, (rnd.nextInt(5)+3)*(rnd.nextInt(6)+2)*0.1); 
			}
		}
	}
	
	public void skill40(Player player) {
		player.setNoDamageTicks(20);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.0f);
	}
	
	public void skill41(Player player) {
		
		new BukkitRunnable() {
			int time = 0;

			@Override
			public void run() {
				
				if(time == 0) {
					new ParticleEffect(player).pS026();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.2);
						}
					}
				}

				if(time == 10) {
					new ParticleEffect(player).pS026();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.2);
						}
					}
				}
				
				if(time >= 20) {
					new ParticleEffect(player).pS026();
					
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 1.2);
						}
					}
					
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill42(Player player) {
		new ParticleEffect(player).pS027();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.7, 0.6, 1, 0.6);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 5);
			}
		}
	}
	
	public void skill43(Player player) {
		new ParticleEffect(player).pS001();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.9, 1, 0.9);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
				nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.2,0,1.2).add(new Vector(0,0.2,0))));
			}
		}
	}
	
	public void skill44(Player player) {
		int num = 0;
		
		List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Mob) {
				String name = nearEntity.getCustomName();
				if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐")) {
					nearEntity.remove();
					num++;
				}
			}
		}
		
		if(num == 0) {
			player.sendMessage(ChatColor.RED + "대상이 존재하지 않습니다.");
			timer2.remove(player);
		} else {
			player.sendMessage(ChatColor.GREEN + "" + num + "마리의 쥐가 체포되었습니다.");
		}
		
	}
	
	public void skill45(Player player) {
		new ParticleEffect(player).pS001();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
			}
		}
		
		player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 20, 0, true, false, true));
	}
	
	public void skill46(Player player) {
		int num = 0;
		
		List<Entity> entitylist = player.getNearbyEntities(10, 5, 10);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Mob) {
				String name = nearEntity.getCustomName();
				if (name.equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐") || name.equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "쥐 두목")) {
					nearEntity.remove();
					num++;
				}
			}
		}
		
		if(num == 0) {
			player.sendMessage(ChatColor.RED + "대상이 존재하지 않습니다.");
			timer2.remove(player);
		} else {
			player.sendMessage(ChatColor.GREEN + "" + num + "마리의 쥐가 체포되었습니다.");
		}
	}
	
	public void skill47(Player player) {
		new ParticleEffect(player).pS028();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.9, 0.7, 1, 0.7);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3.5);
			}
		}
	}
	
	public void skill48(Player player) {
		QuestOwner qo = new QuestOwner();
		if(qo.returnEntity(player) != null) {
			Entity ent = qo.returnEntity(player);
			if(ent.getLocation().distance(player.getLocation()) < 150) {
				player.teleport(ent);
			} else {
				player.sendMessage(ChatColor.RED + "대상이 멀리 있습니다.");
				timer2.remove(player);
			}
		} else {
			player.sendMessage(ChatColor.RED + "대상이 존재하지 않습니다.");
			timer2.remove(player);
		}
		player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 30, 0, true, false, true));
	}
	
	public void skill49(Player player) {
		new BukkitRunnable() {
			int time = 0;
			LivingEntity entity = null;

			@Override
			public void run() {
				
				if(time == 0) {
					List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.7, 1, 0.7);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							entity = nearMob;
							break;
						}
					}
					if(entity != null) {
						new ParticleEffect(entity).pS029();
						damage(player, entity, 2);
					}
				}

				if(time == 10) {
					if(entity != null) {
						new ParticleEffect(entity).pS029();
						damage(player, entity, 2);
					}
				}
				
				if(time >= 20) {
					if(entity != null) {
						new ParticleEffect(entity).pS029();
						damage(player, entity, 2);
					}
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill50(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		if(player.isOnGround()) {
			player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6+(0.02*personality),1.4+(0.02*personality),1.6+(0.02*personality))));
		} else {
			timer2.remove(player);
		}
	}
	
	public void skill51(Player player) {
		new ParticleEffect(player).pS030();
		
		int num = 0;
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2.5);
				num++;
			}
		}
		
		CharacterStack cs = new CharacterStack();
		int stack;
		if(num > 0) {
			stack = cs.returnStack(player) + 1;
			if(stack > 10) {
				stack = 10;
			}
			cs.put(player, stack);
		} else {
			stack = cs.returnStack(player);
		}
		if(stack != 0) {
			sendPacket(player, "예측 분석 (§a" + stack + "§f)");
		}
	}
	
	public void skill52(Player player) {
		new ParticleEffect(player).pS031();
		
		CharacterStack cs = new CharacterStack();
		int stack = cs.returnStack(player);
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 1 * stack);
				nearMob.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.3,0,1.3).add(new Vector(0,0.2,0))));
			}
		}
		
		cs.put(player, 0);
	}
	
	public void skill53(Player player) {
		if(player.getLevel() < 2000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 2000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setDamage(damageProj(player, 3));
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 8) {
					arrow.remove();
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill54(Player player) {
		if(player.getLevel() < 5000) {
			player.sendMessage(ChatColor.RED + "탄환값이 부족합니다.");
			return;
		} 
		player.setLevel(player.getLevel() - 5000);
		
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			Arrow arrow;
			World world = player.getWorld();

		    @Override
			public void run() {
				
				if (time == 0) {
					arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setDamage(damageProj(player, 8));
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.9f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.6f, 1.5f);
					world.playSound(player.getLocation(), Sound.ENTITY_ARMOR_STAND_HIT, 3.0f, 1.0f);
					world.playSound(player.getLocation(), Sound.BLOCK_VINE_BREAK, 3.0f, 0.5f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.CRIT, arrow.getLocation(), 0);
				}
				
				if (time >= 8) {
					arrow.remove();
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill55(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new ParticleEffect(player).pS032();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.6, 1, 1, 1);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 2);
				
				if(nearMob instanceof Mob || nearMob instanceof Player) {
					new BukkitRunnable() {
						int time = 0;

					    @Override
						public void run() {
					    	
					    	if(time == 1) {
					    		nearMob.setFireTicks(100);
					    		this.cancel();
					    	}
					    	
							time++;
						}
					}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					
					new FireDamageList().putMap(nearMob, 1+(personality*0.1));
				}
			}
		}
	}
	
	public void skill56(Player player) {
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		new BukkitRunnable() {
			
			int time = 0;
			Arrow arrow;
			World world = player.getWorld();
			Particle.DustOptions dustOptions1 = new Particle.DustOptions(Color.fromRGB(0, 0, 0), 1);

		    @Override
			public void run() {
				
				if (time == 0) {
					arrow = player.launchProjectile(Arrow.class);
					arrow.setShooter(player);
					arrow.setDamage(damageProj(player, 5));
					arrow.setVelocity(player.getLocation().getDirection().multiply(0.6f));	
					arrow.setGravity(false);
					
					world.playSound(player.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 1.0f, 2.0f);
				}
				
				if (time >= 1) {
					world.spawnParticle(Particle.REDSTONE, arrow.getLocation(), 2, dustOptions1);
				}
				
				if (time >= 7) {
					arrow.remove();
					this.cancel();
				}
				
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
	}
	
	public void skill57(Player player) {
		new ParticleEffect(player).pS033();
		
		List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3.5);
			}
		}
	}
	
	public void skill58(Player player) {
		player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.8,0,1.8).add(new Vector(0,0.2,0))));
		
		new ParticleEffect(player).pS008();
		
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
		    	if(time == 2) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 5) {
		    		new ParticleEffect(player).pS008_1();
		    		
		    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1); 
		    			}
		    		}
		    	}
		    	
		    	if(time == 8) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1); 
		    			}
		    		}
		    	}
		    	
		    	if(time >= 11) {
		    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1); 
		    			}
		    		}
		    		this.cancel();
		    	}
		    	
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		player.setNoDamageTicks(25);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 25, 0, true, false, true));
	}
	
	public void skill59(Player player) {
		new BukkitRunnable() {
			int time = 0;

		    @Override
			public void run() {
		    	
		    	if(time == 0) {
		    		new ParticleEffect(player).pS034();
		    		//new ParticleEffect(player).pS034_1();
		    		//new ParticleEffect(player).pS034_2();
		    	
		    		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1.2);
		    			}
		    		}
		    	}
		    	
		    	if(time == 5) {
		    		new ParticleEffect(player).pS035();
		    		//new ParticleEffect(player).pS035_1();
		    		//new ParticleEffect(player).pS035_2();
		    	
		    		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1.2);
		    			}
		    		}
		    	}
		    	
		    	if(time == 10) {
		    		new ParticleEffect(player).pS034();
		    		//new ParticleEffect(player).pS034_1();
		    		//new ParticleEffect(player).pS034_2();
			    	
		    		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1.2);
		    			}
		    		}
		    	}
		    	
		    	if(time == 15) {
		    		new ParticleEffect(player).pS035();
		    		//new ParticleEffect(player).pS035_1();
		    		//new ParticleEffect(player).pS035_2();
			    	
		    		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1.2);
		    			}
		    		}
		    	}
		    	
		    	if(time >= 20) {
		    		new ParticleEffect(player).pS034();
		    		//new ParticleEffect(player).pS034_1();
		    		//new ParticleEffect(player).pS034_2();
			    	
		    		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		    		for (Entity nearEntity : entitylist) {
		    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
		    				LivingEntity nearMob = (LivingEntity) nearEntity;
		    				damage(player, nearMob, 1.2);
		    			}
		    		}
		    		this.cancel();
		    	}
		    	
				time++;
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
	}
	
	public void skill60(Player player) {
		Player target = null;
		
		List<Entity> entitylist = player.getNearbyEntities(20, 10, 20);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Player && nearEntity != player) {
				target = (Player) nearEntity;
				if(target.getGameMode() == GameMode.SPECTATOR || target.getGameMode() == GameMode.CREATIVE) {
					target = null;
				} else {
					break;
				}
			}
		}
		
		if(target == null) {
			player.sendMessage(ChatColor.RED + "대상이 존재하지 않습니다.");
			timer2.remove(player);
		} else {
			String office = new PlayerOffice().returnOffice(target);
			if(office.equals("")) {
				office = "관측 오류";
			}
			
			String grade = Integer.toString(new PlayerGrade().returnGrade(target));
			if(grade.equals("0")) {
				grade = "특색";
			} else {
				grade += "급";
			}
			
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "=======================");
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "이름: " + target.getDisplayName());
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "소속: " + office);
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "등급: " + grade);
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "재산: " + target.getLevel() + "안");
			player.sendMessage(net.md_5.bungee.api.ChatColor.of("#ffb4ff") + "=======================");
		}
		
		player.playSound(player.getLocation(), Sound.BLOCK_BEACON_ACTIVATE, 1.0f, 1.5f);
	}
	
	public void skill61(Player player) {
		new ParticleEffect(player).pS036();

		int num = 0;
		
		List<Entity> entitylist = nearFrontEntities(player, 2.0, 0.7, 1, 0.7);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3.5);
				num++;
			}
		}
		
		if(num > 0) {
			double tmp = 0;
			tmp = player.getHealth() + 0.1;
			if(tmp > player.getMaxHealth()) {
				player.setHealth(player.getMaxHealth());
			} else {
				player.setHealth(tmp);
			}
		}
	}
	
	public void skill62(Player player) {
		new ParticleEffect(player).pS037();
		
		List<Entity> entitylist = player.getNearbyEntities(4, 4, 4);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Player && nearEntity != player) {
				Player p = (Player) nearEntity;
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true, false, true));
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "츠바이의 방패가 당신을 지킵니다. [보호 +1]");
			}
		}
		player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true, false, true));
		player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "든든한 방패가 당신을 지킵니다. [보호 +1]");
	}
	
	public void skill63(Player player) {
		new ParticleEffect(player).pS038();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.9, 0.7, 1, 0.7);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 4);
			}
		}
	}
	
	public void skill64(Player player) {
		if(player.getHealth() > 4) {
			player.sendMessage(ChatColor.RED + "탈진 상태가 아닙니다.");
			timer2.remove(player);
		} else {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 1, true, false, true));
			player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "극한의 상황에서 힘을 얻습니다. [위력 +2]");
			
			world.playSound(player.getLocation(), Sound.BLOCK_CHAIN_BREAK, 7.0f, 1.0f);
		}
	}
	
	public void skill65(Player player) {
		new ParticleEffect(player).pS039();
		
		List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				new ParticleEffect(nearMob).pS029();
				damage(player, nearMob, 7);
				nearMob.setVelocity(new Vector(0,1,0));
				break;
			}
		}
	}
	
	public void skill66(Player player) {
		new ParticleEffect(player).pS040();
		
		List<Entity> entitylist = player.getNearbyEntities(3, 3, 3);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof Player && nearEntity != player) {
				Player p = (Player) nearEntity;
				p.setNoDamageTicks(20);
				p.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
				p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "전면전이 시작됩니다. [무적 1초]");
			}
		}
		player.setNoDamageTicks(20);
		player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
		player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "전면전이 시작됩니다. [무적 1초]");
	}
	
	public void skill67(Player player) {
		CharacterStack cs = new CharacterStack();
		int stack = cs.returnStack(player);
		if(stack == 0) {
			new ParticleEffect(player).pS041();
			
			List<Entity> entitylist = nearFrontEntities(player, 1.8, 0.8, 1, 0.8);
			for (Entity nearEntity : entitylist) {
				if (nearEntity instanceof LivingEntity && nearEntity != player) {
					LivingEntity nearMob = (LivingEntity) nearEntity;
					try {
						if(nearMob.getCustomName().substring(0,2).equals("§a")) {
							damage(player, nearMob, 3 * 1.3);
						} else if(nearMob.getCustomName().substring(0,2).equals("§e")) {
							damage(player, nearMob, 3 * 1.1);
						} else if(nearMob.getCustomName().substring(0,2).equals("§c")) {
							damage(player, nearMob, 3);
						} else if(nearMob.getCustomName().substring(0,2).equals("§5")) {
							damage(player, nearMob, 3 * 0.7);
						} else {
							damage(player, nearMob, 3);
						}
					} catch(Exception e) {
						damage(player, nearMob, 3);
					}
				}
			}
			
			sendPacket(player, "앙가즈망");
			cs.put(player, 1);
		} else {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 30, 0, true, false, true));
			world.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
			sendPacket(player, "앙가드");
			cs.put(player, 0);
		}
	}
	
	public void skill68(Player player) {
		player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 60, 12, true, false, true));
		world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.5f);
	}
	
	public void skill69(Player player) {
		new ParticleEffect(player).pS042();
		
		int num = 0;
		
		List<Entity> entitylist = nearFrontEntities(player, 2.0, 0.7, 1, 0.7);
		for (Entity nearEntity : entitylist) {
			if (nearEntity instanceof LivingEntity && nearEntity != player) {
				LivingEntity nearMob = (LivingEntity) nearEntity;
				damage(player, nearMob, 3);
				num++;
			}
		}
		
		CharacterStack cs = new CharacterStack();
		int stack;
		if(num > 0) {
			stack = cs.returnStack(player) + 1;
			if(stack > 10) {
				stack = 10;
			}
			cs.put(player, stack);
		} else {
			stack = cs.returnStack(player);
		}
		if(stack != 0) {
			sendPacket(player, "에너지 순환 (§b" + stack + "§f)");
		}
	}
	
	public void skill70(Player player) {
		CharacterStack cs = new CharacterStack();
		int stack = cs.returnStack(player);
		if(stack < 3) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 40, 12, true, false, true));
			world.playSound(player.getLocation(), Sound.ENTITY_WITHER_BREAK_BLOCK, 1.0f, 1.5f);
			sendPacket(player, "되돌리기");
		} else if(stack < 10) {
			player.setVelocity(player.getLocation().getDirection().multiply(new Vector(1.6,0,1.6).add(new Vector(0,0.2,0))));
			
			new BukkitRunnable() {
				int time = 0;

			    @Override
				public void run() {
			    	
			    	new ParticleEffect(player).pS043();
			    	
			    	if(time == 2) {
			    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
			    		for (Entity nearEntity : entitylist) {
			    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
			    				LivingEntity nearMob = (LivingEntity) nearEntity;
			    				damage(player, nearMob, 1.2); 
			    			}
			    		}
			    	}
			    	
			    	if(time == 5) {
			    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
			    		for (Entity nearEntity : entitylist) {
			    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
			    				LivingEntity nearMob = (LivingEntity) nearEntity;
			    				damage(player, nearMob, 1.2); 
			    			}
			    		}
			    	}
			    	
			    	if(time == 8) {
			    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
			    		for (Entity nearEntity : entitylist) {
			    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
			    				LivingEntity nearMob = (LivingEntity) nearEntity;
			    				damage(player, nearMob, 1.2); 
			    			}
			    		}
			    	}
			    	
			    	if(time >= 11) {
			    		List<Entity> entitylist = player.getNearbyEntities(0.7, 0.7, 0.7);
			    		for (Entity nearEntity : entitylist) {
			    			if (nearEntity instanceof LivingEntity && nearEntity != player) {
			    				LivingEntity nearMob = (LivingEntity) nearEntity;
			    				damage(player, nearMob, 1.2); 
			    			}
			    		}
			    		this.cancel();
			    	}
			    	
					time++;
				}
			}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			
			world.playSound(player.getLocation(), Sound.ENTITY_WARDEN_SONIC_BOOM, 1.5f, 2.0f);
			
			player.setNoDamageTicks(20);
			player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 20, 0, true, false, true));
			
			if(stack < 3) {
				stack = 0;
			} else {
				stack -= 3;
			}
			cs.put(player, stack);
			sendPacket(player, "도약 (§b" + stack + "§f)");
		} else if(stack >= 10) {
			new ParticleEffect(player).pS044();
			
			List<Entity> entitylist = nearFrontEntities(player, 1.9, 0.9, 1, 0.9);
			for (Entity nearEntity : entitylist) {
				if (nearEntity instanceof LivingEntity && nearEntity != player) {
					LivingEntity nearMob = (LivingEntity) nearEntity;
					damage(player, nearMob, 10);
				}
			}
			
			cs.put(player, 0);
			sendPacket(player, "공간 절단");
		} else {
			cs.put(player, 0);
			sendPacket(player, "충전 스택 오류");
		}
	}
	
	
	
	
	
	
	public void damage(Player player, LivingEntity mob, double dam) {
		if(mob instanceof ArmorStand) {
			return;
		}
		
		//몹 벽에 끼우고 때리는거 금지
		if(mob.getTargetBlockExact(2, FluidCollisionMode.SOURCE_ONLY) != null) {
			return;
		}
		
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if(player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch(Exception e2) {
					
		}
		
		int personality = 0;
		//인격에 따른 데미지 증폭 계산
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam*0.1*personality;
		
		int damUP = 0; //10이면 10%증가
		//유물에 따른 데미지 증폭 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 기량 반지")) {
					damUP = 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 기량 반지")) {
					damUP = 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 기량 반지")) {
					damUP = 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 기량 반지")) {
					damUP = 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 기량 반지")) {
					damUP = 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 기량 반지")) {
					damUP = 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 기량 반지")) {
					damUP = 70;
				}
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam * damUP * 0.01;
		
		
		//크리티컬 계산
		int crit = 10;
		//유물에 따른 크리티컬 확률 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 신비 반지")) {
					crit += 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 신비 반지")) {
					crit += 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 신비 반지")) {
					crit += 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 신비 반지")) {
					crit += 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 신비 반지")) {
					crit += 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 신비 반지")) {
					crit += 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 신비 반지")) {
					crit += 70;
				}
			}
		} catch (Exception e2) {

		}
		
		int num = rnd.nextInt(100);
		if(num < crit) {
			mob.damage(finalDamage * 2);
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ede900") + Integer.toString((int) Math.round(finalDamage*2*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		} else {
			mob.damage(finalDamage);
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ebebeb") + Integer.toString((int) Math.round(finalDamage*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void damageMax(Player player, LivingEntity mob, double dam) {
		if(mob instanceof ArmorStand) {
			return;
		}
		
		//몹 벽에 끼우고 때리는거 금지
		if(mob.getTargetBlockExact(2, FluidCollisionMode.SOURCE_ONLY) != null) {
			return;
		}
		
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if(player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch(Exception e2) {
					
		}
		
		int personality = 0;
		//인격에 따른 데미지 증폭 계산
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam*0.1*personality;
		
		int damUP = 0; //10이면 10%증가
		//유물에 따른 데미지 증폭 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 기량 반지")) {
					damUP = 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 기량 반지")) {
					damUP = 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 기량 반지")) {
					damUP = 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 기량 반지")) {
					damUP = 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 기량 반지")) {
					damUP = 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 기량 반지")) {
					damUP = 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 기량 반지")) {
					damUP = 70;
				}
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam * damUP * 0.01;
		
		
		//크리티컬 계산
		int crit = 10;
		//유물에 따른 크리티컬 확률 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 신비 반지")) {
					crit += 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 신비 반지")) {
					crit += 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 신비 반지")) {
					crit += 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 신비 반지")) {
					crit += 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 신비 반지")) {
					crit += 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 신비 반지")) {
					crit += 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 신비 반지")) {
					crit += 70;
				}
			}
		} catch (Exception e2) {

		}
		
		int num = rnd.nextInt(100);
		if(num < crit) {
			mob.damage(finalDamage * 2);
			if(mob.getMaxHealth() > finalDamage*2) {
				if(mob instanceof Player) {
					damageMaxHealth(player, 1);
				} else {
					mob.setMaxHealth(mob.getMaxHealth() - finalDamage*2);
				}
			}
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ede900") + Integer.toString((int) Math.round(finalDamage*2*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		} else {
			mob.damage(finalDamage);
			if(mob.getMaxHealth() > finalDamage) {
				if(mob instanceof Player) {
					damageMaxHealth(player, 1);
				} else {
					mob.setMaxHealth(mob.getMaxHealth() - finalDamage);
				}
			}
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ebebeb") + Integer.toString((int) Math.round(finalDamage*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public double damageRet(Player player, LivingEntity mob, double dam) {
		if(mob instanceof ArmorStand) {
			return 0;
		}
		
		//몹 벽에 끼우고 때리는거 금지
		if(mob.getTargetBlockExact(2, FluidCollisionMode.SOURCE_ONLY) != null) {
			return 0;
		}
		
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if (player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch (Exception e2) {

		}
		
		int personality = 0;
		//인격에 따른 데미지 증폭 계산
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam*0.1*personality;
		
		int damUP = 0; //10이면 10%증가
		//유물에 따른 데미지 증폭 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 기량 반지")) {
					damUP = 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 기량 반지")) {
					damUP = 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 기량 반지")) {
					damUP = 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 기량 반지")) {
					damUP = 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 기량 반지")) {
					damUP = 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 기량 반지")) {
					damUP = 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 기량 반지")) {
					damUP = 70;
				}
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam * damUP * 0.01;
		
		//크리티컬 계산
		int crit = 10;
		//유물에 따른 크리티컬 확률 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 신비 반지")) {
					crit += 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 신비 반지")) {
					crit += 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 신비 반지")) {
					crit += 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 신비 반지")) {
					crit += 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 신비 반지")) {
					crit += 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 신비 반지")) {
					crit += 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 신비 반지")) {
					crit += 70;
				}
			}
		} catch (Exception e2) {

		}
		
		int num = rnd.nextInt(100);
		if(num < crit) {
			mob.damage(finalDamage * 2);
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ede900") + Integer.toString((int) Math.round(finalDamage*2*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			return dam*2;
		} else {
			mob.damage(finalDamage);
			
			if(mob instanceof Mob || mob instanceof Player) {
				ArmorStand damageSign = (ArmorStand) world.spawnEntity(mob.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
				damageSign.setVisible(false);
				damageSign.setSmall(true);
				damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ebebeb") + Integer.toString((int) Math.round(finalDamage*10)));
				damageSign.setCustomNameVisible(true);
				damageSign.setGravity(false);
				damageSign.setRemoveWhenFarAway(true);
				
				new BukkitRunnable() {
					int time = 0;
					
					@Override
					public void run() {
						time++;
						damageSign.teleport(damageSign.getLocation().add(0,0.02,0));
						
						if(time >= 30) {
							damageSign.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			return dam;
		}
	}
	
	public double damageProj(Player player, double dam) {
		double finalDamage = 0;
		finalDamage += dam;
		
		//힘 버프 증폭 계산
		try {
			if (player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE)) {
				finalDamage += player.getPotionEffect(PotionEffectType.INCREASE_DAMAGE).getAmplifier() + 1;
			}
		} catch (Exception e2) {
			
		}
		
		int personality = 0;
		//인격에 따른 데미지 증폭 계산
		try {
			ItemStack item = player.getInventory().getItem(7);
			String name = item.getItemMeta().getDisplayName();
			personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
			
			if(personality == 9) {
				personality = 10;
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam*0.1*personality;
		
		int damUP = 0; //10이면 10%증가
		//유물에 따른 데미지 증폭 계산
		try {
			if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
				if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 기량 반지")) {
					damUP = 10;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 기량 반지")) {
					damUP = 20;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 기량 반지")) {
					damUP = 30;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 기량 반지")) {
					damUP = 40;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 기량 반지")) {
					damUP = 50;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 기량 반지")) {
					damUP = 60;
				} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 기량 반지")) {
					damUP = 70;
				}
			}
		} catch(Exception e2) {
			
		}
		
		finalDamage += dam * damUP * 0.01;
		
		return finalDamage;
	}
	
	public List<Entity> nearFrontEntities(Player player, double dist, double x, double y, double z) {
		
		Location normal = player.getLocation();
		Location e1;
		
		double arrowAngle1 = 90;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, 1, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) world.spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setSmall(true);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				time++;
				
				if(time >= 3) {
					as.remove();
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		return as.getNearbyEntities(x, y, z);
	}
	
	public List<Entity> near4RotsEntities(Player player, double dist, double x, double y, double z) {
		Location normal = player.getLocation();
		Location e1;
		
		double rotation = (player.getLocation().getYaw() - 90) % 360;
        if (rotation < 0) {
            rotation += 360.0;
        }
        
        Float yaw;
        
        if (0 <= rotation && rotation < 45) {
        	yaw = (float) 0;
        } else if (45 <= rotation && rotation < 135) {
        	yaw = (float) 90;
        } else if (135 <= rotation && rotation < 225) {
        	yaw = (float) 180;
        } else if (225 <= rotation && rotation < 315) {
        	yaw = (float) 270;
        } else if (315 <= rotation && rotation < 360) {
        	yaw = (float) 0;
        } else {
        	yaw = (float) 0;
        }
		
		double arrowAngle1 = 180;
		double totalAngle1 = yaw + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, 1, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) world.spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setSmall(true);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				time++;
				
				if(time >= 3) {
					as.remove();
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		return as.getNearbyEntities(x, y, z);
	}
	
	public List<Entity> nearFrontEntitiesDirection(Player player, double dist, double x, double y, double z, int rot) {
		
		Location normal = player.getLocation();
		Location e1;
		
		double arrowAngle1 = rot;
		double totalAngle1 = normal.getYaw() + arrowAngle1;
		double dirX1 = Math.cos(Math.toRadians(totalAngle1));
		double dirZ1 = Math.sin(Math.toRadians(totalAngle1));
		
		e1 = normal.clone().add(dirX1*dist, 1, dirZ1*dist);
		
		ArmorStand as = (ArmorStand) world.spawnEntity(e1, EntityType.ARMOR_STAND);
		as.setVisible(false);
		as.setSmall(true);
		as.setGravity(false);
		as.setRemoveWhenFarAway(true);
		new BukkitRunnable() {
			int time = 0;
			
			@Override
			public void run() {
				time++;
				
				if(time >= 3) {
					as.remove();
					this.cancel();
				}
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		return as.getNearbyEntities(x, y, z);
	}
	
	public boolean reload(Player playerArg, int reload) {
		player = playerArg;
		if(timer.containsKey(player)) {
			Integer lastTime = timer.get(player);
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		if(Math.abs(time-lastTime) > reload) {
	 			timer.remove(player);
		 		timer.put(player, time);
		 		return true;
	 		} else {
	 			try {
	 				String remain = Integer.toString(reload - Math.abs(time-lastTime));
	 				
	 				int num = lastTime;
	 				num /= 1000;
	 				int s2 = num%10;
	 				num /= 10;
	 				int s1 = num%10;
	 				int ss = s1*10 + s2;
	 				
		 			int remainmm = 0;
		 			int remainss = 0;
		 			int remainS = 0;
		 			
		 			if(remain.length() > 5) {
		 				remainmm = Integer.parseInt(remain.substring(0, remain.length()-5));
		 				remainss = Integer.parseInt(remain.substring(0, remain.length()-3)) - remainmm*100;
		 				
		 				if(remainss > ss) {
		 					remainss -= 40;
		 				}
		 			} else if(remain.length() > 3) {
		 				remainss = Integer.parseInt(remain.substring(0, remain.length()-3));
		 				remainS = Integer.parseInt(remain.substring(0, remain.length()-2)) - remainss*10;
		 				
		 				if(remainss > ss && reload > 100000) {
		 					remainss -= 40;
		 				}
		 			} else {
		 				remainS = Integer.parseInt(remain.substring(0, remain.length()-2));
		 			}
		 			
		 			if(remainmm != 0) {
		 				sendPacket(player, ".." + remainmm + "분 " + remainss + "초");
		 			} else if(remainss != 0) {
		 				sendPacket(player, ".." + remainss + "." + remainS + "초");
		 			} else {
		 				sendPacket(player, ".." + remainss + "." + remainS + "초");
		 			}
	 			} catch(Exception e) {
	 				
	 			}
	 		}
		} else {
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		timer.put(player, time);
	 		return true;
		}
		return false;
	}
	
	public boolean reload2(Player playerArg, int reload) {
		player = playerArg;
		if(timer2.containsKey(player)) {
			Integer lastTime = timer2.get(player);
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		if(Math.abs(time-lastTime) > reload) {
	 			timer2.remove(player);
		 		timer2.put(player, time);
		 		return true;
	 		} else {
	 			try {
	 				String remain = Integer.toString(reload - Math.abs(time-lastTime));
	 				
	 				int num = lastTime;
	 				num /= 1000;
	 				int s2 = num%10;
	 				num /= 10;
	 				int s1 = num%10;
	 				int ss = s1*10 + s2;
	 				
		 			int remainmm = 0;
		 			int remainss = 0;
		 			int remainS = 0;
		 			
		 			if(remain.length() > 5) {
		 				remainmm = Integer.parseInt(remain.substring(0, remain.length()-5));
		 				remainss = Integer.parseInt(remain.substring(0, remain.length()-3)) - remainmm*100;
		 				
		 				if(remainss > ss) {
		 					remainss -= 40;
		 				}
		 			} else if(remain.length() > 3) {
		 				remainss = Integer.parseInt(remain.substring(0, remain.length()-3));
		 				remainS = Integer.parseInt(remain.substring(0, remain.length()-2)) - remainss*10;
		 				
		 				if(remainss > ss && reload > 100000) {
		 					remainss -= 40;
		 				}
		 			} else {
		 				remainS = Integer.parseInt(remain.substring(0, remain.length()-2));
		 			}
		 			
		 			if(remainmm != 0) {
		 				sendPacket(player, ".." + remainmm + "분 " + remainss + "초");
		 			} else if(remainss != 0) {
		 				sendPacket(player, ".." + remainss + "." + remainS + "초");
		 			} else {
		 				sendPacket(player, ".." + remainss + "." + remainS + "초");
		 			}
	 			} catch(Exception e) {
	 				
	 			}
	 		}
		} else {
			long dayTime = System.currentTimeMillis(); 
	 		SimpleDateFormat hms = new SimpleDateFormat("hhmmssSSS");
	 		String strTime = hms.format(new Date(dayTime));
	 		Integer time = Integer.parseInt(strTime);
	 		timer2.put(player, time);
	 		return true;
		}
		return false;
	}
	
	public void resetCoolTime(Player player) {
		if(timer.containsKey(player)) {
			timer.remove(player);
		}
		if(timer2.containsKey(player)) {
			timer2.remove(player);
		}
	}
	
	public void damageMaxHealth(Player player, int num) {
		if(!player.hasPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE)) {
			if(num == 1) {
				if(player.hasPotionEffect(PotionEffectType.FAST_DIGGING)) {
					if(player.getMaxHealth() <= 2) {
						player.setMaxHealth(1);
						player.setHealth(0);
					} else {
						player.setMaxHealth(player.getMaxHealth() - 2);
					}
					player.removePotionEffect(PotionEffectType.FAST_DIGGING);
				} else {
					player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, Integer.MAX_VALUE, 0, true, false, true));
				}
			} else {
				if(player.getMaxHealth() <= num) {
					player.setMaxHealth(1);
					player.setHealth(0);
				} else {
					player.setMaxHealth(player.getMaxHealth() - num);
				}
			}
		}
	}
	
	public void sendPacket(Player player, String message) {
		try {
			TextComponent tc = new TextComponent(message);
			player.spigot().sendMessage(ChatMessageType.ACTION_BAR, tc);
		} catch (Exception e) {

		}
	}
	
	public void skill1OLD(Player player, int up) {
		ThreadSkill t = new ThreadSkill(player.getUniqueId());
		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
			int time = 0;
			int personality = 0;
			
			@Override
			public void run() {
				if (!t.hasID()) {
					t.setID(sleep);
				}
				
				if(time==0) {
					try {
						ItemStack item = player.getInventory().getItem(7);
						String name = item.getItemMeta().getDisplayName();
						personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
					} catch(Exception e2) {
						
					}
				}
			
				if(time>=3) {
					new ParticleEffect(player).pS001();
					
					List<Entity> entitylist = nearFrontEntities(player, 2, 1, 1, 1);
					for (Entity nearEntity : entitylist) {
						if (nearEntity instanceof LivingEntity && nearEntity != player) {
							LivingEntity nearMob = (LivingEntity) nearEntity;
							damage(player, nearMob, 2);
							nearMob.damage(2 + personality*0.2);
						}
					}
					t.endTask(); 
					t.removeID();
				} 
				
				time++;
			}						
			
		}, 0, 1);
	}
	
	
	
}
