package testPack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.World;
import org.bukkit.Particle.DustOptions;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.EulerAngle;
import org.bukkit.util.Vector;

public class PlayerHittenDebuff {
	
	Random rnd = new Random();
	private int taskID;
	
	static boolean pat1 = false;
	static boolean pat2 = false;
	static boolean pat3 = false;
	static boolean pat4 = false;

	public void playerHittenDebuff(Player player, Entity mob) {
		ratNormal(player, mob);
		ratBoss(player, mob);
		spider(player, mob);
		guardian(player, mob);
		vindicator(player, mob);
		slime(player, mob);
		silverfish(player, mob);
		witch(player, mob);
		caveSpider(player, mob);
		enderman(player, mob);
		elderGuardian(player, mob);
		magmacube(player, mob);
		blaze(player, mob);
		endermite(player, mob);
		ravager(player, mob);
		ghast(player, mob);
		warden(player, mob);
	}

	//쥐
	public void ratNormal(Player player, Entity mob) {
		if(mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "쥐")) {
			int num = rnd.nextInt(10);
			if(num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			}
		}
	}
	
	//쥐 두목
	public void ratBoss(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "쥐 두목")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} else if(num < 3) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, true));
			}
		}
	}
	
	//다리가 많아! 몇개야?
	public void spider(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "다리가 많아! 몇개야?")) {
			int num = rnd.nextInt(10);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} else if(num == 1) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0, true, true));
			}
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, true));
		}
	}
	
	//외눈 물고기
	public void guardian(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "외눈 물고기")) {
			int num = rnd.nextInt(10);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//회색 인간
	public void vindicator(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "회색 인간")) {
			int num = rnd.nextInt(10);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//작아지는 죽음
	public void slime(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작아지는 죽음")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//작은 조각
	public void silverfish(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작은 조각")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//약쟁이 소녀
	public void witch(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "약쟁이 소녀")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//날아오르는 다리
	public void caveSpider(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "날아오르는 다리")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//검은 인격
	public void enderman(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검은 인격")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true, true));
		}
	}
	
	//외눈 물고기 성체
	public void elderGuardian(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "외눈 물고기 성체")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//녹아내리는 마음
	public void magmacube(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "녹아내리는 마음")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
			player.setFireTicks(100);
		}
	}
	
	//쏘아올리는 불꽃
	public void blaze(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "쏘아올리는 불꽃")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
			player.setFireTicks(100);
		}
	}
	
	//부패의 조각
	public void endermite(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "부패의 조각")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true, true));
		}
	}
	
	//폭주하는 황소
	public void ravager(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
			int num = rnd.nextInt(3);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 

			int num2 = rnd.nextInt(10);
			if (num2 == 0) {
				player.setVelocity(new Vector(0, 1, 0));
			} else if (num2 < 3) {
				player.setVelocity(player.getEyeLocation().getDirection().multiply(-2.0f));
			}
		}
	}
	
	//우는 영혼들의 산
	public void ghast(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
			int num = rnd.nextInt(3);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
		}
	}
	
	//도망쳐
	public void warden(Player player, Entity mob) {
		if (mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
			int num = rnd.nextInt(3);
			if (num == 0) {
				int item = 0;
				if (player.getInventory().getHelmet() != null) {
					if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V1")) {
						item = 1;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V2")) {
						item = 2;
					} else if (player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "두뇌 자극 회로 V3")) {
						item = 3;
					}
				}
				
				int num2 = rnd.nextInt(10);
				if(item == 0) {
					damageMaxHealth(player, 1);
				} else if(item == 1) {
					if(num2 >= 1) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 2) {
					if(num2 >= 3) {
						damageMaxHealth(player, 1);
					}
				} else if(item == 3) {
					if(num2 >= 5) {
						damageMaxHealth(player, 1);
					}
				}
			} 
			
			if(player.getHealth() - player.getMaxHealth()/8 > 0) {
				player.setHealth(player.getHealth() - player.getMaxHealth()/8);
			} else {
				player.setHealth(0);
			}
			
		}
	}
	
	// 요정왕
	public void mob2(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("요정왕 오베론" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(20);
			if(num <= 3) {
				// ===============================================================
				ParticleData pd = new ParticleData(player.getUniqueId());
				if (pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
				ParticleEffect pe = new ParticleEffect(player);
				pe.startE29();
				// ================================================================
				player.damage(200);
				player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "요정왕의 마법이 발동됩니다.");
			}
			if(num == 4) {
				LivingEntity ent = (LivingEntity) mob;
				ent.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 60, 1,true,true));
				ent.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 140,true,true));
				ent.getWorld().spawnEntity(ent.getLocation().clone().add(0,1,0), EntityType.WITHER);
				player.getWorld().playEffect(mob.getLocation(), Effect.END_GATEWAY_SPAWN, 0);
				player.sendMessage(ChatColor.RED + "요정왕이 소환 마법을 사용했습니다.");
				sendMessage(player, ChatColor.RED + "요정왕이 소환 마법을 사용했습니다.");
			}
		}
	}

	// 요정여왕
	public void mob3(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("요정여왕 티타니아" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(10);
			if(num == 0) {
				for(int i = 0 ; i < 10 ; i++) {
					player.getWorld().spawnParticle(Particle.CLOUD, mob.getLocation(), 0);
				}
				LivingEntity ent = (LivingEntity) mob;
				healSkill(ent, 5000);
				List<Entity> nearMob = ent.getNearbyEntities(10, 3, 10);
				for(Entity mob2 : nearMob) {
					if(mob2 instanceof Skeleton) {
						LivingEntity ent2 = (LivingEntity) mob2;
						if(ent2.getHealth() > 1000) {
							healSkill(ent2, 5000);
						}
					}
				}
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "요정여왕의 스킬로 주변 몬스터가 회복됩니다.");
				sendMessage(player, ChatColor.RED + "요정여왕의 스킬로 주변 몬스터가 회복됩니다.");
			}
		}
	}

	// 케흘렌
	public void mob4(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("케흘렌" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(8);
			if(num < 1) {
				for(int i = 0 ; i < 10 ; i++) {
					player.getWorld().spawnParticle(Particle.ASH, mob.getLocation(), 10);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,200,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,40,50,true,true));
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "케흘렌의 저주로 몸이 얼어붙습니다.");
				((WitherSkeleton) mob).setTarget(player);
			} 
			if(num == 2) {
				int num2 = rnd.nextInt(10);
				if(num2==0) {
					mob.teleport(new Location(player.getWorld(), 3788, 69, 3207));
				} else if(num2==1) {
					mob.teleport(new Location(player.getWorld(), 3787, 69, 3212));
				} else if(num2==2) {
					mob.teleport(new Location(player.getWorld(), 3802, 69, 3213));
				} else if(num2==3) {
					mob.teleport(new Location(player.getWorld(), 3801, 69, 3220));
				} else if(num2==4) {
					mob.teleport(new Location(player.getWorld(), 3794, 69, 3207));
				} else if(num2==5) {
					mob.teleport(new Location(player.getWorld(), 3789, 69, 3222));
				} else if(num2==6) {
					mob.teleport(new Location(player.getWorld(), 3794, 69, 3213));
				} else if(num2==7) {
					mob.teleport(new Location(player.getWorld(), 3794, 86, 3215));
				} else if(num2==8) {
					mob.teleport(new Location(player.getWorld(), 3801, 82, 3222));
				} else if(num2==9) {
					mob.teleport(new Location(player.getWorld(), 3787, 82, 3217));
				} else {
					mob.teleport(new Location(player.getWorld(), 3787, 82, 3217));
				}
				player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0f, 1.0f);
				player.sendMessage(ChatColor.RED + "케흘렌이 어딘가로 이동하였습니다.");
				sendMessage(player, ChatColor.RED + "케흘렌이 어딘가로 이동하였습니다.");
			}
		}
	}

	// 발로르
	public void mob5(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("발로르" + ChatColor.YELLOW + " [Lv.??]")) {
			if(((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if(num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,true));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHAIN_HIT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "발로르가 당신을 끌어당겼습니다.");
					((Zombie) mob).setTarget(player);
				} 
				if(num == 1) {
					
					mob.teleport(player);
					
					player.sendMessage(ChatColor.RED + "발로르가 헬파이어를 시전합니다.");
					sendMessage(player, ChatColor.RED + "발로르가 헬파이어를 시전합니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -8 ; x < 9 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -8 ; z < 9 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "발로르가 헬파이어를 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "발로르가 헬파이어를 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE30();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(8, 30, 8);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										((Player) p).damage(500);
										p.setFireTicks(200);
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(13);
				if(num == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,50,200,true,true));
					player.sendMessage(ChatColor.RED + "발로르의 힘으로 석화되었습니다.");
					((Zombie) mob).setTarget(player);
				}
			}
		}
	}

	// 아덴
	public void mob6(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("아덴" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if (num == 0) {
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 100, 0, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true,true));
					healSkill(((LivingEntity) mob), 5000);
					player.getWorld().playSound(mob.getLocation(), Sound.AMBIENT_CAVE, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴이 회복을 하기 위해 도망갑니다.");
					sendMessage(player, ChatColor.RED + "아덴이 회복을 하기 위해 도망갑니다.");
					((WitherSkeleton) mob).setTarget(player);
				}
				if (num == 1) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE31();
					// ================================================================
					Zombie s1 = (Zombie) player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					Zombie s2 = (Zombie) player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					Location chestLoc = new Location(player.getWorld(), -1830, 92, 3043);
					Block block = chestLoc.getBlock();
					Chest chest = (Chest) block.getState();
					EntityEquipment head1 = s1.getEquipment();
					ItemStack head1Item = chest.getInventory().getItem(9);
					head1.setHelmet(head1Item);
					EntityEquipment head2 = s2.getEquipment();
					ItemStack head2Item = chest.getInventory().getItem(10);
					head2.setHelmet(head2Item);
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_BASALT_BREAK, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴이 메이드들을 호출하였습니다.");
					sendMessage(player, ChatColor.RED + "아덴이 메이드들을 호출하였습니다.");
				}
			} else {
				int num = rnd.nextInt(32);
				if (num == 0) {
					player.teleport(new Location(player.getWorld(), 3325, 13, 3736));
					mob.teleport(new Location(player.getWorld(), 3327, 13, 3734));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴의 마법으로 이동됩니다.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 1) {
					player.teleport(new Location(player.getWorld(), 3325, 13, 3752));
					mob.teleport(new Location(player.getWorld(), 3327, 13, 3754));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴의 마법으로 이동됩니다.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 2) {
					player.teleport(new Location(player.getWorld(), 3309, 13, 3752));
					mob.teleport(new Location(player.getWorld(), 3307, 13, 3754));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴의 마법으로 이동됩니다.");
					((WitherSkeleton) mob).setTarget(player);
				} else if (num == 3) {
					player.teleport(new Location(player.getWorld(), 3309, 13, 3736));
					mob.teleport(new Location(player.getWorld(), 3307, 13, 3734));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "아덴의 마법으로 이동됩니다.");
					((WitherSkeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 특급 요리사
	public void mob7(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("특급 요리사" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if (num == 0) {
					healSkill(((LivingEntity) mob), 8000);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EAT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "특급 요리사가 음식을 먹고 회복합니다.");
					sendMessage(player, ChatColor.RED + "특급 요리사가 음식을 먹고 회복합니다.");
					((Zombie) mob).setTarget(player);
				} else if (num == 1) {
					player.setFireTicks(200);
					player.sendMessage(ChatColor.RED + "맛있게 구워지거라.");
					((Zombie) mob).setTarget(player);
				}
			} else {
				int num = rnd.nextInt(8);
				if (num == 0) {
					player.setFireTicks(200);
					player.sendMessage(ChatColor.RED + "맛있게 구워지거라.");
					((Zombie) mob).setTarget(player);
				}
			}
		}
	}

	// 1층의 지배자
	public void mob8(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("1층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {

			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(12);
				if (num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 100, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 200, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 200, true,true));
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-10.0f));
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_NETHERRACK_STEP, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "지배자가 당신을 밀어냅니다.");
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 15) {
								((Skeleton) mob).setTarget(player);
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();

					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판I을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판I을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 87 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 75 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(300);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 2000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 2층의 지배자
	public void mob9(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("2층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(12);
				if (num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 200, true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true,true));
					player.sendMessage(ChatColor.RED + "환각에 걸렸습니다.");
					((Skeleton) mob).setTarget(player);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판II을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판II을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 100 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 88 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(500);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 10000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 3층의 지배자
	public void mob10(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("3층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(15);
				if (num == 0) {
					player.sendMessage(ChatColor.RED + "지배자가 분신을 소환합니다.");
					sendMessage(player, ChatColor.RED + "지배자가 분신을 소환합니다.");
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SKELETON);
					((Skeleton) mob).setTarget(player);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판III을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판III을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 115 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 101 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(4000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 50000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					mob.teleport(player.getLocation().add(0,1,0));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 4층의 지배자
	public void mob11(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("4층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(18);
				if (num == 0) {
					LivingEntity ent = (LivingEntity) mob;
					EntityEquipment weapon = ent.getEquipment();
					Material mat = weapon.getItemInMainHand().getType();
					if(mat == Material.RED_DYE) {
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 32700));
									nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100, 140));
									nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 32700));
									// ===============================================================
									ParticleData pd = new ParticleData(nearPlayer.getUniqueId());
									if (pd.hasID()) {
										pd.endTask();
										pd.removeID();
									}
									ParticleEffect pe = new ParticleEffect(nearPlayer);
									pe.startE2();
									// ================================================================
									player.sendMessage(ChatColor.RED + "지배자의 뼈감옥이 발동됩니다.");
									player.sendMessage(ChatColor.RED + "5초간 움직임이 멈춥니다.");
								}
							}
						}
					} else if(mat == Material.GREEN_DYE) {
						List<Entity> entitylist = ent.getNearbyEntities(10, 4, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() != EntityType.PLAYER) {
								Player nearPlayer = (Player) nearEntity;
								nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
							}
						}
						player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 0, true,true));
						player.sendMessage(ChatColor.RED + "지배자의 전투의 의지가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 전투의 의지가 발동됩니다.");
						player.sendMessage(ChatColor.RED + "10초간 지배자에게 저항이 부여됩니다.");
						sendMessage(player, ChatColor.RED + "10초간 지배자에게 저항이 부여됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.BLOCK_CHAIN_BREAK, 2.0f, 0.5f);			
					} else if(mat == Material.LAPIS_LAZULI) {
						for(int i = 0 ; i < 10 ; i++) {
							player.getWorld().spawnParticle(Particle.CLOUD, mob.getLocation(), 0);
						}
						healSkill(ent, 5000);
						player.sendMessage(ChatColor.RED + "지배자의 넬의 사랑이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 넬의 사랑이 발동됩니다.");
						player.sendMessage(ChatColor.RED + "지배자가 회복합니다.");
						sendMessage(player, ChatColor.RED + "지배자가 회복합니다.");
						player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					} else if(mat == Material.CYAN_DYE) {
						List<Entity> entitylist = player.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity.getType() == EntityType.PLAYER) {
								if (nearEntity instanceof Player) {
									Player nearPlayer = (Player) nearEntity;
									Location loc2 = nearPlayer.getLocation();
									if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
											&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
										nearPlayer.damage(player.getLevel() * 15);
									}
								}
							}
						}
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.5f);
						ent.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, ent.getLocation(), 0);
						player.sendMessage(ChatColor.RED + "지배자의 마인권이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 마인권이 발동됩니다.");
					} else if(mat == Material.LIGHT_GRAY_DYE) {
						int job = rnd.nextInt(5);
						if(job == 0) {
							ItemStack weaponItem = new ItemStack(Material.BLUE_DYE);
							weapon.setItemInMainHand(weaponItem);
						} else if(job == 1) {
							ItemStack weaponItem = new ItemStack(Material.BROWN_DYE);
							weapon.setItemInMainHand(weaponItem);
						} else if(job == 2) {
							ItemStack weaponItem = new ItemStack(Material.BLACK_DYE);
							weapon.setItemInMainHand(weaponItem);
						} else if(job == 3) {
							ItemStack weaponItem = new ItemStack(Material.INK_SAC);
							weapon.setItemInMainHand(weaponItem);
						} else if(job == 4) {
							ItemStack weaponItem = new ItemStack(Material.GLOWSTONE_DUST);
							weapon.setItemInMainHand(weaponItem);
						}
						player.sendMessage(ChatColor.RED + "지배자의 도박사의 판으로 변화가 일어났습니다.");
						sendMessage(player, ChatColor.RED + "지배자의 도박사의 판으로 변화가 일어났습니다.");
					} else if(mat == Material.GRAY_DYE) {
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								// ===============================================================
								ParticleData pd = new ParticleData(nearPlayer.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(nearPlayer);
								pe.startE10();
								// ================================================================
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.setHealth(2);
								}
							}
						}
						ent.getWorld().playSound(ent.getLocation(), Sound.BLOCK_PORTAL_TRIGGER, 1.0f, 1.0f);
						player.sendMessage(ChatColor.RED + "지배자의 데빌 블레스터가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 데빌 블레스터가 발동됩니다.");
					} else if(mat == Material.PINK_DYE) {
						for(int i = 0 ; i < 10 ; i++) {
							player.getWorld().spawnParticle(Particle.CLOUD, mob.getLocation(), 0);
						}
						healSkill(ent, 500000);
						ent.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 1, true,true));
						player.sendMessage(ChatColor.RED + "지배자의 천사의 축복이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 천사의 축복이 발동됩니다.");
						player.sendMessage(ChatColor.RED + "지배자가 회복하며 저항이 부여됩니다.");
						sendMessage(player, ChatColor.RED + "지배자가 회복하며 저항이 부여됩니다.");
						player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					} else if(mat == Material.LIME_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 신의 주사위가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 신의 주사위가 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);
						taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;
							ThreadData td = new ThreadData(player.getUniqueId());
							int dice = rnd.nextInt(5);
							
							@Override
							public void run() {
								if(!td.hasID()) {
									td.setID(taskID);
								}
								
								if(time==30) {
									if (dice == 0) {
										player.sendMessage(ChatColor.RED + "주사위의 눈은 1!");
										sendMessage(player, ChatColor.RED + "주사위의 눈은 1!");
									} else if (dice == 1) {
										player.sendMessage(ChatColor.RED + "주사위의 눈은 2!");
										sendMessage(player, ChatColor.RED + "주사위의 눈은 2!");
									} else if (dice == 2) {
										player.sendMessage(ChatColor.RED + "주사위의 눈은 3!");
										sendMessage(player, ChatColor.RED + "주사위의 눈은 3!");
									} else if (dice == 3) {
										player.sendMessage(ChatColor.RED + "주사위의 눈은 4!");
										sendMessage(player, ChatColor.RED + "주사위의 눈은 4!");
									} else if (dice == 4) {
										player.sendMessage(ChatColor.RED + "주사위의 눈은 5!");
										sendMessage(player, ChatColor.RED + "주사위의 눈은 5!");
									}
								}
								
								if(time==60) {
									if (dice == 0) {
										ent.setHealth(ent.getMaxHealth());
										player.sendMessage(ChatColor.RED + "신의 경고에 의해 지배자가 정신을 차립니다.");
										sendMessage(player, ChatColor.RED + "신의 경고에 의해 지배자가 정신을 차립니다.");
									} else if (dice == 1) {
										player.sendMessage(ChatColor.RED + "지배자가 신의 통고를 사용합니다.");
										sendMessage(player, ChatColor.RED + "지배자가 신의 통고를 사용합니다.");
										List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
										for (Entity nearEntity : entitylist) {
											if (nearEntity instanceof Player) {
												Player nearPlayer = (Player) nearEntity;
												Location loc2 = nearPlayer.getLocation();
												if (loc2.getX() <= 90 && loc2.getY() <= 126 && loc2.getZ() <= -5 
														&& loc2.getX() >= 54 && loc2.getY() >= 114 && loc2.getZ() >= -41) {
													nearPlayer.damage(5000);
												}
											}
										}
									} else if (dice == 2) {
										player.sendMessage(ChatColor.RED + "지배자가 신의 심판를 사용합니다.");
										sendMessage(player, ChatColor.RED + "지배자가 신의 심판를 사용합니다.");
										List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
										for (Entity nearEntity : entitylist) {
											if (nearEntity instanceof Player) {
												Player nearPlayer = (Player) nearEntity;
												Location loc2 = nearPlayer.getLocation();
												if (loc2.getX() <= 90 && loc2.getY() <= 126 && loc2.getZ() <= -5 
														&& loc2.getX() >= 54 && loc2.getY() >= 114 && loc2.getZ() >= -41) {
													nearPlayer.damage(10000);
												}
											}
										}
									} else if (dice == 3) {
										player.sendMessage(ChatColor.RED + "지배자가 신의 강림를 사용합니다.");
										sendMessage(player, ChatColor.RED + "지배자가 신의 강림를 사용합니다.");
										List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
										for (Entity nearEntity : entitylist) {
											if (nearEntity instanceof Player) {
												Player nearPlayer = (Player) nearEntity;
												Location loc2 = nearPlayer.getLocation();
												if (loc2.getX() <= 90 && loc2.getY() <= 126 && loc2.getZ() <= -5 
														&& loc2.getX() >= 54 && loc2.getY() >= 114 && loc2.getZ() >= -41) {
													nearPlayer.damage(20000);
												}
											}
										}
									} else if (dice == 4) {
										ent.setNoDamageTicks(200);
										player.sendMessage(ChatColor.RED + "지배자가 신의 축복을 사용합니다.");
										sendMessage(player, ChatColor.RED + "지배자가 신의 축복을 사용합니다.");
										player.sendMessage(ChatColor.RED + "10초간 무적이 됩니다.");
										sendMessage(player, ChatColor.RED + "10초간 무적이 됩니다.");
									}
									td.endTask();
									td.removeID();
								}
								
								time++;
								
							}
							
						}, 0, 1);
					} else if(mat == Material.YELLOW_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 화둔이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 화둔이 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.damage(5000);
									nearPlayer.setFireTicks(100);
								}
							}
						}
					} else if(mat == Material.LIGHT_BLUE_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 엘·초펠이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 엘·초펠이 발동됩니다.");
						Vector vec = ent.getEyeLocation().getDirection().multiply(3.0f);
						vec.add(new Vector(0, 1, 0));
						List<Entity> entitylist = player.getNearbyEntities(10, 15, 10);		
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								nearPlayer.damage(8000);
								nearPlayer.setVelocity(vec);
							}
						}	
					} else if(mat == Material.MAGENTA_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 수류탄 투척이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 수류탄 투척이 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.damage(5000);
									nearPlayer.setFireTicks(100);
								}
							}
						}
					} else if(mat == Material.ORANGE_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 지옥불이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 지옥불이 발동됩니다.");
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.setFireTicks(1200);
								}
							}
						}
					} else if(mat == Material.BLUE_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 루인 오브 노바가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 루인 오브 노바가 발동됩니다.");
						List<Entity> entitylist = player.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								// ===============================================================
								ParticleData pd = new ParticleData(nearPlayer.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(nearPlayer);
								pe.startE23();
								// ================================================================
								nearPlayer.damage(player.getLevel() * 50);
								ent.getWorld().spawnParticle(Particle.LAVA, nearPlayer.getLocation(), 10);
								ent.getWorld().playSound(nearPlayer.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.0f);
							}
						}
					} else if(mat == Material.BROWN_DYE) {
						for(int i = 0 ; i < 10 ; i++) {
							player.getWorld().spawnParticle(Particle.CLOUD, mob.getLocation(), 0);
						}
						healSkill(ent, 1000000);
						ent.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 2, true,true));
						player.sendMessage(ChatColor.RED + "지배자의 아이 오브 오더가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 아이 오브 오더가 발동됩니다.");
						player.sendMessage(ChatColor.RED + "지배자가 회복하며 저항이 부여됩니다.");
						sendMessage(player, ChatColor.RED + "지배자가 회복하며 저항이 부여됩니다.");
						player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					} else if(mat == Material.BLACK_DYE) {
						player.sendMessage(ChatColor.RED + "지배자의 돌격이 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 돌격이 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.BLOCK_ENDER_CHEST_CLOSE, 1.0f, 1.0f);
						
						Vector vec = ent.getEyeLocation().add(0,2,0).getDirection().multiply(2.3f);
						ent.setVelocity(vec);						
						List<Entity> entitylist = ent.getNearbyEntities(5, 5, 5);				
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								nearPlayer.setVelocity(vec);
								nearPlayer.damage(player.getLevel() * 30);
							}
						}	
					} else if(mat == Material.INK_SAC) {
						player.sendMessage(ChatColor.RED + "지배자의 '자 선물이야'가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 '자 선물이야'가 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.damage(player.getLevel() * 40);
									nearPlayer.setFireTicks(200);
								}
							}
						}
					} else if(mat == Material.CLAY_BALL) {
						player.sendMessage(ChatColor.RED + "지배자의 밤 에로우가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 밤 에로우가 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.damage(player.getLevel() * 5);
								}
							}
						}
					} else if(mat == Material.GLOWSTONE_DUST) {
						player.sendMessage(ChatColor.RED + "지배자의 밤 에로우가 발동됩니다.");
						sendMessage(player, ChatColor.RED + "지배자의 밤 에로우가 발동됩니다.");
						ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 0.8f, 6.0f);
						List<Entity> entitylist = ent.getNearbyEntities(10, 15, 10);
						for (Entity nearEntity : entitylist) {
							if (nearEntity instanceof Player) {
								Player nearPlayer = (Player) nearEntity;
								Location loc2 = nearPlayer.getLocation();
								if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -5 
										&& loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
									nearPlayer.damage(player.getLevel() * 40);
								}
							}
						}
					} else {
						ItemStack weaponItem = player.getInventory().getItem(7);
						weapon.setItemInMainHand(weaponItem);
						player.sendMessage(ChatColor.RED + "지배자가 약탈을 시전합니다.");
						sendMessage(player, ChatColor.RED + "지배자가 약탈을 시전합니다.");
					}
				} else if (num == 1) {
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판IV을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판IV을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 128 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 116 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(5000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				} else if(num == 2) {
					LivingEntity ent = (LivingEntity) mob;
					EntityEquipment weapon = ent.getEquipment();
					ItemStack weaponItem = player.getInventory().getItem(7);
					weapon.setItemInMainHand(weaponItem);
					player.sendMessage(ChatColor.RED + "지배자가 약탈을 시전합니다.");
					sendMessage(player, ChatColor.RED + "지배자가 약탈을 시전합니다.");
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 80000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					mob.teleport(player.getLocation().add(0,1,0));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				} else if(num == 1) {
					LivingEntity ent = (LivingEntity) mob;
					EntityEquipment weapon = ent.getEquipment();
					ItemStack weaponItem = player.getInventory().getItem(7);
					weapon.setItemInMainHand(weaponItem);
					player.sendMessage(ChatColor.RED + "지배자가 약탈을 시전합니다.");
					sendMessage(player, ChatColor.RED + "지배자가 약탈을 시전합니다.");
				}
			}
		}
	}

	// 5층의 지배자
	public void mob12(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("5층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(25);
				if (num == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true,true));
					player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "지배자가 마법사를 소환합니다.");
					sendMessage(player, ChatColor.RED + "지배자가 마법사를 소환합니다.");
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.WITHER_SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.WITHER_SKELETON);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.WITHER_SKELETON);
					((Skeleton) mob).setTarget(player);
				} else if (num == 1) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true,true));
					player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "거미가 증식합니다.");
					sendMessage(player, ChatColor.RED + "거미가 증식합니다.");
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.CAVE_SPIDER);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.CAVE_SPIDER);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.CAVE_SPIDER);
					((Skeleton) mob).setTarget(player);
				} else if (num == 2) {
					player.teleport(mob);
					
					player.sendMessage(ChatColor.RED + "지배자가 대규모 마법을 시전합니다.");
					sendMessage(player, ChatColor.RED + "지배자가 대규모 마법을 시전합니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -8 ; x < 9 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -8 ; z < 9 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 소닉붐을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 소닉붐을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE30();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(8, 15, 8);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										Location loc2 = p.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
											p.getWorld().playSound(p.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.5f, 1.0f);
											p.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, p.getLocation(), 2);
											((Player) p).damage(99999999);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				} else if (num == 3) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판V을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판V을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 141 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 129 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(7000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(15);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 150000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 6층의 지배자
	public void mob13(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("6층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(20);
				if (num == 0) {
					new ParticleEffect(player, mob).newEffect102();
					((Skeleton) mob).setTarget(player);
				} else if (num == 1) {
					Arrow arrow = ((Skeleton) mob).launchProjectile(Arrow.class);
					arrow.setShooter((LivingEntity) mob);
					arrow.setVelocity(((Skeleton) mob).getEyeLocation().getDirection().multiply(3.0f));
					
					new ParticleEffect(player, arrow).newEffect101();
					((Skeleton) mob).setTarget(player);
				} else if (num == 2) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판VI을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판VI을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(12000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					// ===============================================================
					ParticleData pd = new ParticleData(player.getUniqueId());
					if (pd.hasID()) {
						pd.endTask();
						pd.removeID();
					}
					ParticleEffect pe = new ParticleEffect(player, mob);
					pe.startE32();
					// ================================================================
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 200000, true,true));
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 100, 0, true,true));
					player.sendMessage(ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					sendMessage(player, ChatColor.RED + "탑의 저주로 지배자가 강화됩니다.");
					((Skeleton) mob).setTarget(player);
				} else if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -15 ; x < 16 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -15 ; z < 16 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "지배자가 심판VI을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 심판VI을 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE33();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(15, 20, 15);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 156 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 142 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(12000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			}
		}
	}

	// 7층의 지배자
	public void mob14(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("7층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(18);
				if (num == 0) {
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 140, 200, true,true));
					
					new ParticleEffect(player, mob).newEffect103();
					((Skeleton) mob).setTarget(player);
				} else if (num == 1) {
					player.sendMessage(ChatColor.RED + "지배자가 자폭을 준비 중입니다.");
					sendMessage(player, ChatColor.RED + "지배자가 자폭을 준비 중입니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					List<Entity> nearEntity = mob.getNearbyEntities(30, 15, 30);
					for (Entity nearPlayer : nearEntity) {
						if (nearPlayer instanceof Player) {
							Location loc2 = nearPlayer.getLocation();
							if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 && 
									loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
								nearPlayer.teleport(mob);
							}
						}
					}
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -5 ; x < 5 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -5 ; z < 5 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 60) {
								player.sendMessage(ChatColor.RED + "지배자가 폭파합니다.");
								sendMessage(player, ChatColor.RED + "지배자가 폭파합니다.");
								
								World world = mob.getWorld();
								Location loc = mob.getLocation();
								world.spawnParticle(Particle.FLAME, loc, 5);
								world.playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 1.5f);
								
								List<Entity> nearEntity = mob.getNearbyEntities(5, 5, 5);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 156 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(99999999);
										}
									}
								}
								
								((LivingEntity) mob).damage(500000);
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);

				} else if (num == 2) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -10 ; x < 10 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -10 ; z < 10 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 60) {
								player.sendMessage(ChatColor.RED + "지배자가 절망I을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 절망I을 사용하였습니다.");
								
								World world = mob.getWorld();
								Location loc = mob.getLocation();
								world.spawnParticle(Particle.SOUL, loc, 100);
								world.spawnParticle(Particle.SOUL_FIRE_FLAME, loc, 50);
								world.playSound(mob.getLocation(), Sound.ENTITY_GHAST_HURT, 1.0f, 2.0f);
								
								List<Entity> nearEntity = mob.getNearbyEntities(10, 15, 10);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(20000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(72);
				if (num <= 4 && !pat3) {
					pat3 = true;
					
					ArrayList<Player> ary = new ArrayList<>();
					List<Entity> nearEntity = mob.getNearbyEntities(30, 15, 30);
					for (Entity nearPlayer : nearEntity) {
						if (nearPlayer instanceof Player) {
							Location loc2 = nearPlayer.getLocation();
							if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 && 
									loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
								ary.add((Player) nearPlayer);
							}
						}
					}
					
					if(num == 0) {
						new BukkitRunnable() {
							int time = 0;

							@Override
							public void run() {

								for(Player p : ary) {
									p.setVelocity(new Vector(10,0,0));
								}

								if (time >= 100) {
									pat3 = false;
									player.sendMessage(ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									sendMessage(player, ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									this.cancel();
								}

								time++;
							}
						}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					} else if(num == 1) {
						new BukkitRunnable() {
							int time = 0;

							@Override
							public void run() {

								for(Player p : ary) {
									p.setVelocity(new Vector(-10,0,0));
								}

								if (time >= 100) {
									pat3 = false;
									player.sendMessage(ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									sendMessage(player, ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									this.cancel();
								}

								time++;
							}
						}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					} else if(num == 2) {
						new BukkitRunnable() {
							int time = 0;

							@Override
							public void run() {

								for(Player p : ary) {
									p.setVelocity(new Vector(0,0,10));
								}

								if (time >= 100) {
									pat3 = false;
									player.sendMessage(ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									sendMessage(player, ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									this.cancel();
								}

								time++;
							}
						}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					} else {
						new BukkitRunnable() {
							int time = 0;

							@Override
							public void run() {

								for(Player p : ary) {
									p.setVelocity(new Vector(0,0,-10));
								}

								if (time >= 100) {
									pat3 = false;
									player.sendMessage(ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									sendMessage(player, ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
									this.cancel();
								}

								time++;
							}
						}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
					}
					
					player.sendMessage(ChatColor.RED + "지배자가 탑의 법칙을 변경합니다. (중력)");
					sendMessage(player, ChatColor.RED + "지배자가 탑의 법칙을 변경합니다. (중력)");
					((Skeleton) mob).setTarget(player);
				} else if (num <= 7) {
					
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -10 ; x < 10 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -10 ; z < 10 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 60) {
								player.sendMessage(ChatColor.RED + "지배자가 절망I을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 절망I을 사용하였습니다.");
								
								World world = mob.getWorld();
								Location loc = mob.getLocation();
								world.spawnParticle(Particle.SOUL, loc, 100);
								world.spawnParticle(Particle.SOUL_FIRE_FLAME, loc, 50);
								world.playSound(mob.getLocation(), Sound.ENTITY_GHAST_HURT, 1.0f, 2.0f);
								
								List<Entity> nearEntity = mob.getNearbyEntities(10, 15, 10);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 169 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 157 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(20000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			}
		}
	}

	// 8층의 지배자
	public void mob15(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("8층의 지배자" + ChatColor.YELLOW + " [Lv.??]")) {
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(18);
				if (num <= 1) {
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.CREEPER);
					((Skeleton) mob).setTarget(player);
				} else if (num == 2 && !pat4) {
					pat4 = true;
					
					player.sendMessage(ChatColor.RED + "지배자가 탑의 법칙을 변경합니다. (최대체력)");
					sendMessage(player, ChatColor.RED + "지배자가 탑의 법칙을 변경합니다. (최대체력)");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHEST_LOCKED, 5.0f, 1.0f);
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							List<Entity> nearEntity = mob.getNearbyEntities(20, 15, 20);
							for (Entity nearPlayer : nearEntity) {
								if (nearPlayer instanceof Player) {
									Location loc2 = nearPlayer.getLocation();
									if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -3 && 
											loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
										Player p = (Player) nearPlayer;
										if(p.getHealth() >= 4) {
											p.setHealth(4);
										}
									}
								}
							}
							
							if (time >= 100) {
								pat4 = false;
								player.sendMessage(ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
								sendMessage(player, ChatColor.RED + "탑의 법칙이 원래대로 돌아옵니다.");
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				} else if (num == 2) {
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -10 ; x < 10 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -10 ; z < 10 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 60) {
								player.sendMessage(ChatColor.RED + "지배자가 절망II을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 절망II을 사용하였습니다.");
								
								World world = mob.getWorld();
								Location loc = mob.getLocation();
								world.spawnParticle(Particle.SOUL, loc, 100);
								world.spawnParticle(Particle.SOUL_FIRE_FLAME, loc, 50);
								world.playSound(mob.getLocation(), Sound.ENTITY_GHAST_HURT, 1.0f, 2.0f);
								
								List<Entity> nearEntity = mob.getNearbyEntities(10, 15, 10);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(25000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(72);
				if (num <= 4) {
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.CREEPER);
					((Skeleton) mob).setTarget(player);
				} else if (num <= 7) {
					player.sendMessage(ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					sendMessage(player, ChatColor.RED + "지배자가 주문을 외우기 시작했습니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 60, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -10 ; x < 10 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -10 ; z < 10 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 60) {
								player.sendMessage(ChatColor.RED + "지배자가 절망II을 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "지배자가 절망II을 사용하였습니다.");
								
								World world = mob.getWorld();
								Location loc = mob.getLocation();
								world.spawnParticle(Particle.SOUL, loc, 100);
								world.spawnParticle(Particle.SOUL_FIRE_FLAME, loc, 50);
								world.playSound(mob.getLocation(), Sound.ENTITY_GHAST_HURT, 1.0f, 2.0f);
								
								List<Entity> nearEntity = mob.getNearbyEntities(10, 15, 10);
								for (Entity nearPlayer : nearEntity) {
									if (nearPlayer instanceof Player) {
										Location loc2 = nearPlayer.getLocation();
										if (loc2.getX() <= 90 && loc2.getY() <= 182 && loc2.getZ() <= -3 && 
												loc2.getX() >= 54 && loc2.getY() >= 170 && loc2.getZ() >= -41) {
											((Player) nearPlayer).damage(25000);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;
						}
					}, 0, 1);
					
				}
			}
		}
	}

	// 9층의 지배자
	public void mob16(Player player, Entity mob) {

	}

	// 10층의 지배자
	public void mob17(Player player, Entity mob) {

	}

	// 11층의 지배자
	public void mob18(Player player, Entity mob) {

	}

	// 12층의 지배자
	public void mob19(Player player, Entity mob) {

	}

	// 약쟁이
	public void mob20(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("약쟁이" + ChatColor.YELLOW + " [Lv.299]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 0, true,true));
		}
	}

	// 코낭그
	public void mob21(Player player, Entity mob) {
		
		if (mob.getCustomName().substring(2).equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(15);
				if (num == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true,true));
					player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "어둠의 기운이 덮칩니다.");
					sendMessage(player, ChatColor.RED + "어둠의 기운이 덮칩니다.");
					((Skeleton) mob).setTarget(player);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ENDERMITE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ENDERMITE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ENDERMITE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ENDERMITE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ENDERMITE);
				}
				if (num == 1) {
					
					player.sendMessage(ChatColor.RED + "멸망의 주문이 들려옵니다.");
					sendMessage(player, ChatColor.RED + "멸망의 주문이 들려옵니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 210, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -12 ; x < 13 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -12 ; z < 13 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 80) {
								player.sendMessage(ChatColor.RED + "멸망의 주문이 발동되었습니다.");
								sendMessage(player, ChatColor.RED + "멸망의 주문이 발동되었습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE34();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(12, 5, 12);
								for (Entity p : nearPlayer) {
									if (p instanceof Player) {
										p.getWorld().playEffect(p.getLocation(), Effect.END_GATEWAY_SPAWN, 2);
										try {
											QuestBoard cb = new QuestBoard();
											if (cb.getQuestName((Player) p).equals(ChatColor.LIGHT_PURPLE + "===이것이 포보르 왕?===")) {
												((Player) p).damage(999999);
											}
											((Player) p).damage(5000);
										} catch(Exception e) {
											
										}
										
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(10);
				if (num == 0) {
					Vector vec = ((LivingEntity) mob).getEyeLocation().getDirection().multiply(5.0f);
					mob.setVelocity(vec);
					((Skeleton) mob).setTarget(player);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 3.0f, 1.0f);
				}
			}
		}

	}

	// 아라크네
	public void mob22(Player player, Entity mob) {
		
		if (mob.getCustomName().substring(2).equalsIgnoreCase("아라크네" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(15);
				if (num == 0) {
					player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 2.0f, 3.0f);
					player.sendMessage(ChatColor.RED + "아라크네가 알까기를 시전했습니다.");
					sendMessage(player, ChatColor.RED + "아라크네가 알까기를 시전했습니다.");
					((CaveSpider) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 80) {
								player.sendMessage(ChatColor.RED + "아라크네가 알을 깝니다.");
								sendMessage(player, ChatColor.RED + "아라크네가 알을 깝니다.");
								player.getWorld().spawnEntity(mob.getLocation(), EntityType.SPIDER);
								player.getWorld().spawnEntity(mob.getLocation(), EntityType.SPIDER);
								player.getWorld().spawnEntity(mob.getLocation(), EntityType.SPIDER);
								player.getWorld().spawnEntity(mob.getLocation(), EntityType.SPIDER);
								player.getWorld().spawnEntity(mob.getLocation(), EntityType.SPIDER);
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
				if (num == 1) {
					Location loc = mob.getLocation();
					int r = 20;
					for (int x = (r * -1); x <= r; x++) {
						for (int z = (r * -1); z <= r; z++) {
							Block b1 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 16, loc.getBlockZ() + z);
							if(b1.getX() <= 766 && b1.getZ() <= 595 && b1.getX() >= 734 && b1.getZ() >= 563) {
								int random = rnd.nextInt(100);
								if (10 >= random) {
									Block b2 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 15, loc.getBlockZ() + z);
									if (b2.getType() != Material.AIR) {
										if(b1.getType() == Material.AIR) {
											b1.setType(Material.LIGHT_WEIGHTED_PRESSURE_PLATE);
										}
									}
								}
							}
						}
					}
					player.sendMessage(ChatColor.RED + "아라크네가 함정을 파놓습니다.");
					sendMessage(player, ChatColor.RED + "아라크네가 함정을 파놓습니다.");
					((CaveSpider) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 100) {
								
								Location loc = mob.getLocation();
								int r = 40;
								for (int x = (r * -1); x <= r; x++) {
									for (int z = (r * -1); z <= r; z++) {
										Block b1 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 16, loc.getBlockZ() + z);
										if (b1.getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
											b1.setType(Material.AIR);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
			} else {
				int num = rnd.nextInt(15);
				if (num == 0) {
					Location loc = mob.getLocation();
					int r = 20;
					for (int x = (r * -1); x <= r; x++) {
						for (int z = (r * -1); z <= r; z++) {
							Block b1 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 16, loc.getBlockZ() + z);
							if(b1.getX() <= 766 && b1.getZ() <= 595 && b1.getX() >= 734 && b1.getZ() >= 563) {
								int random = rnd.nextInt(100);
								if (10 >= random) {
									Block b2 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 15, loc.getBlockZ() + z);
									if (b2.getType() != Material.AIR) {
										if(b1.getType() == Material.AIR) {
											b1.setType(Material.LIGHT_WEIGHTED_PRESSURE_PLATE);
										}
									}
								}
							}
						}
					}
					player.sendMessage(ChatColor.RED + "아라크네가 함정을 파놓습니다.");
					sendMessage(player, ChatColor.RED + "아라크네가 함정을 파놓습니다.");
					((CaveSpider) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 100) {
								
								Location loc = mob.getLocation();
								int r = 40;
								for (int x = (r * -1); x <= r; x++) {
									for (int z = (r * -1); z <= r; z++) {
										Block b1 = loc.getWorld().getBlockAt(loc.getBlockX() + x, 16, loc.getBlockZ() + z);
										if (b1.getType() == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
											b1.setType(Material.AIR);
										}
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				} else if (num == 1) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 200, true,true));
					player.sendMessage(ChatColor.RED + "아라크네가 당신을 속박합니다.");
					((CaveSpider) mob).setTarget(player);
				}
			}
		}

	}

	// 사막 전갈
	public void mob23(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("사막 전갈" + ChatColor.YELLOW + " [Lv.465]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 0, true,true));
		}
	}

	// 석상 파수꾼
	public void mob24(Player player, Entity mob) {

		if (mob.getCustomName().substring(2).equalsIgnoreCase("석상 파수꾼" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 5)) {
				
				EntityEquipment weapon = ((LivingEntity) mob).getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("400");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = ((LivingEntity) mob).getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.DEAD_TUBE_CORAL_BLOCK);
				mobBow.setItemInOffHand(mobBowItem);
				
				int num = rnd.nextInt(5);
				if (num == 0) {
					mob.setVelocity(((Skeleton) mob).getEyeLocation().getDirection().add(new Vector(0, 2, 0)));
					((Skeleton) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if(time % 10 == 0) {
								mob.getWorld().spawnParticle(Particle.FLAME, mob.getLocation(), 10);
							}
							
							if(time >= 40) {
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				} else if (num == 1) {
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}
						
							if(time>=20) {								
								td.endTask();
								td.removeID();
							} else if(time%2 == 0) {
								Skeleton skl = (Skeleton) mob;
								Arrow arrow = skl.launchProjectile(Arrow.class);
								arrow.setShooter((LivingEntity) mob);
								arrow.setDamage(1000);
								arrow.setVelocity(mob.getLocation().getDirection().multiply(1.8f));		
								mob.getWorld().spawnParticle(Particle.FLAME, arrow.getLocation(), 5);
								mob.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ARROW_SHOOT, 1.0f, 1.0f);
								
								SpectralArrow sarrow = (SpectralArrow) arrow.getWorld().spawnEntity(arrow.getLocation(), EntityType.SPECTRAL_ARROW);
								sarrow.setVelocity(arrow.getVelocity());
							}
							
							time++;
						}	

					}, 0, 1);
				}
			} else if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				
				EntityEquipment weapon = ((LivingEntity) mob).getEquipment();
				ItemStack weaponItem = new ItemStack(Material.BOW);
				ItemMeta im = weaponItem.getItemMeta();
				im.setLocalizedName("400");
				weaponItem.setItemMeta(im);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = ((LivingEntity) mob).getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.MUSIC_DISC_CHIRP);
				mobBow.setItemInOffHand(mobBowItem);
				
				int num = rnd.nextInt(10);
				if (num == 0) {
					mob.setVelocity(((Skeleton) mob).getEyeLocation().getDirection().add(new Vector(0, 2, 0)));
					((Skeleton) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if(time % 10 == 0) {
								mob.getWorld().spawnParticle(Particle.FLAME, mob.getLocation(), 10);
							}
							
							if(time >= 40) {
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				} else if (num == 1) {
					((Skeleton) mob).setTarget(player);
					for(int i = 0 ; i < 10 ; i++) {
						player.getWorld().spawnParticle(Particle.NOTE, mob.getLocation().add(0, 0.5, 0), 1);
					}
					LivingEntity ent = (LivingEntity) mob;
					healSkill(ent, 100000);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDER_DRAGON_FLAP, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "석상 파수꾼이 치유의 노래를 부릅니다.");
					sendMessage(player, ChatColor.RED + "석상 파수꾼이 치유의 노래를 부릅니다.");
				}
			} else {
				
				EntityEquipment weapon = ((LivingEntity) mob).getEquipment();
				ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
				weapon.setItemInMainHand(weaponItem);
				EntityEquipment mobBow = ((LivingEntity) mob).getEquipment();
				ItemStack mobBowItem = new ItemStack(Material.AIR);
				mobBow.setItemInOffHand(mobBowItem);
				
				int num = rnd.nextInt(18);
				if (num == 0) {
					mob.setVelocity(((Skeleton) mob).getEyeLocation().getDirection().add(new Vector(0, 2, 0)));
					((Skeleton) mob).setTarget(player);
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if(time % 10 == 0) {
								mob.getWorld().spawnParticle(Particle.FLAME, mob.getLocation(), 10);
							}
							
							if(time >= 40) {
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				} else if (num == 1) {
					player.teleport(mob);
					((Skeleton) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "석상 파수꾼 잠영참를 시전합니다.");
					sendMessage(player, ChatColor.RED + "석상 파수꾼이 잠영참를 시전합니다.");
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if(time == 5 || time == 25) {
								List<Entity> entitylist = mob.getNearbyEntities(30, 30, 30);
								for(Entity nearEntity : entitylist) {
									if (nearEntity instanceof Player) {
										nearEntity.sendMessage(ChatColor.RED + "잠영참이 발동됩니다.");
										((Player) nearEntity).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20, 200, true,true));
										((Player) nearEntity).addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 20, 200, true,true));
										ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(nearEntity.getLocation().add(0, 5, 0), EntityType.ARMOR_STAND);
										as.setVisible(false);
										as.setArms(true);
										as.setItemInHand(new ItemStack(Material.GREEN_CARPET));
										as.setRightArmPose(new EulerAngle(Math.toRadians(90), 0, 0));
									}
								}
							}
							
							if(time == 20 || time == 40) {
								List<Entity> entitylist = mob.getNearbyEntities(30, 30, 30);
								for(Entity nearEntity : entitylist) {
									if(nearEntity instanceof ArmorStand) {
										ArmorStand as = (ArmorStand) nearEntity;
										if((as.getItemInHand().getType() == Material.GREEN_CARPET) && (as.getRightArmPose().getX() == Math.toRadians(90))) {
											as.remove();
											continue;
										}
									}
									if(nearEntity instanceof Player) {
										if(nearEntity.getType() == EntityType.PLAYER) {
											((Player) nearEntity).setHealth(((Player) nearEntity).getHealth() / 2);
										}
									}
								}
							}
							
							if(time >= 50) {
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
			}
		}
		
	}

	// 암석 거인의 파편
	public void mob25(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("암석 거인의 파편" + ChatColor.YELLOW + " [Lv.455]")) {

			int num = rnd.nextInt(23);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 120, 0, true,true));
				player.sendMessage(ChatColor.RED + "암석 거인이 당신을 잡아듭니다.");
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(time == 40 || time == 60 || time == 80 || time == 100 || time == 120) {
							player.damage(1000);
						}
						
						if(time >= 120) {
							td.endTask();
							td.removeID();
						}
						
						time++;

					}

				}, 0, 1);
			} else if (num == 1) {
				List<Entity> nearPlayer = player.getNearbyEntities(8, 10, 8);
				for(Entity p : nearPlayer) {
					if(p instanceof Player) {
						p.setFireTicks(140);
						p.sendMessage(ChatColor.RED + "암석 거인의 불이 강해집니다.");
					}
				}
				player.setFireTicks(140);
				player.sendMessage(ChatColor.RED + "암석 거인의 불이 강해집니다.");
			} else if (num == 2) {
				player.teleport(new Location(player.getWorld(), 3672.5, 86.1, 2857.5));
				player.sendMessage(ChatColor.RED + "암석 거인이 돌 가두기를 사용합니다.");
				
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if(!player.isValid()) {
							player.teleport(new Location(player.getWorld(), 228, 85, 945));
							td.endTask();
							td.removeID();
						}
						
						if(time >= 60) {
							if(player.getLocation().getY() < 90) {
								player.teleport(new Location(player.getWorld(), 3685, 51, 2858.5));
							}
							td.endTask();
							td.removeID();
						}
						
						player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
						player.setHealth(player.getHealth() * 98.0 / 100.0);
						
						time++;

					}

				}, 0, 1);
				
			}
		}
	}

	// 레티아리우스
	public void mob26(Player player, Entity mob) {
		
		if (mob.getCustomName().substring(2).equalsIgnoreCase("레티아리우스" + ChatColor.YELLOW + " [Lv.??]")) {
			((LivingEntity) mob).removePotionEffect(PotionEffectType.HEAL);
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if (num == 0) {
					mob.getWorld().playSound(mob.getLocation(), Sound.ITEM_TRIDENT_THROW, 8.0f, 1.0f);

					ArmorStand proTotem = (ArmorStand) mob.getWorld().spawnEntity(mob.getLocation(),EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setArms(true);
					proTotem.setItemInHand(new ItemStack(Material.TRIDENT));
					proTotem.setRightArmPose(new EulerAngle(Math.toRadians(3), 0, 0));
					proTotem.setVelocity(mob.getLocation().getDirection().multiply(4.0f));
					proTotem.setVelocity(proTotem.getVelocity().multiply(new Vector(1, 0.1 ,1)));

					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArmorStand totem = proTotem;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time % 5 == 0) {
								List<Entity> entitylist = totem.getNearbyEntities(4, 3, 4);
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Player) {
										Player player = (Player) nearEntity;
										player.setHealth(player.getHealth()/3);
									}
								}
							}

							if (time >= 30) {
								totem.remove();
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
					((Skeleton) mob).setTarget(player);
				} else if (num == 1) {
					List<Entity> nearEntity = mob.getNearbyEntities(30, 10, 30);
					for(Entity ent : nearEntity) {
						if(ent instanceof Player) {
							Player nearPlayer = (Player) ent;
							nearPlayer.teleport(mob.getLocation());
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,100,10000,true,true));
							nearPlayer.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHAIN_HIT, 1.0f, 1.0f);
							nearPlayer.sendMessage(ChatColor.RED + "그물에 걸렸습니다.");
						}
					}
					((Skeleton) mob).setTarget(player);
				}
			} else {
				int num = rnd.nextInt(10);
				if (num == 0) {
					Vector vec = ((LivingEntity) mob).getEyeLocation().getDirection().multiply(5.0f);
					mob.setVelocity(vec);
					((Skeleton) mob).setTarget(player);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 3.0f, 1.0f);
				} else if(num == 1) {
					List<Entity> nearEntity = mob.getNearbyEntities(30, 10, 30);
					for(Entity ent : nearEntity) {
						if(ent instanceof Player) {
							Player nearPlayer = (Player) ent;
							nearPlayer.teleport(mob.getLocation());
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,100,10000,true,true));
							nearPlayer.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHAIN_HIT, 1.0f, 1.0f);
							nearPlayer.sendMessage(ChatColor.RED + "그물에 걸렸습니다.");
						}
					}
					((Skeleton) mob).setTarget(player);
				}
			}
		}
		
	}

	// 갈리
	public void mob27(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("갈리" + ChatColor.YELLOW + " [Lv.??]")) {
			((LivingEntity) mob).removePotionEffect(PotionEffectType.HEAL);
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(24);
				if (num <= 2) {
					player.getWorld().playSound(mob.getLocation(), Sound.ITEM_SHIELD_BLOCK, 2.0f, 1.0f);
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-10.0f));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 150, 0, true,true));
					if(player.getHealth() - 10 > 0) {
						player.setHealth(player.getHealth() - 10);
					} else {
						player.setHealth(0);
					}
				} else if (num == 3) {
					healSkill(((LivingEntity) mob), 5);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EAT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "갈리가 피의 함성에 희열을 느낍니다.");
					sendMessage(player, ChatColor.RED + "갈리가 피의 함성에 희열을 느낍니다.");
					((Skeleton) mob).setTarget(player);
				}
			} else {
				int num = rnd.nextInt(24);
				if (num <= 3) {
					Vector vec = ((LivingEntity) mob).getEyeLocation().getDirection().multiply(5.0f);
					mob.setVelocity(vec);
					((Skeleton) mob).setTarget(player);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 3.0f, 1.0f);
				} else if(num == 4) {
					healSkill(((LivingEntity) mob), 3);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EAT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "갈리가 피의 함성에 희열을 느낍니다.");
					sendMessage(player, ChatColor.RED + "갈리가 피의 함성에 희열을 느낍니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 디마카에루스
	public void mob28(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("디마카에루스" + ChatColor.YELLOW + " [Lv.??]")) {
			((LivingEntity) mob).removePotionEffect(PotionEffectType.HEAL);
			
			int num = rnd.nextInt(8);
			if (num == 0) {

				player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 100, 0, true,true));
				
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						if (!td.hasID()) {
							td.setID(taskID);
						}

						if (time >= 30 && time % 4 == 0) {
							player.getWorld().playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
							if(player.getHealth() - 1 > 0) {
								player.setHealth(player.getHealth() - 1);
							} else {
								player.setHealth(0);
							}
						}

						if (time >= 80) {
							td.endTask();
							td.removeID();
						}

						time++;
					}

				}, 0, 1);
				
			}
		}
	}

	// 프라에그나리
	public void mob29(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("프라에그나리" + ChatColor.YELLOW + " [Lv.??]")) {
			((LivingEntity) mob).removePotionEffect(PotionEffectType.HEAL);
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(24);
				if (num <= 3) {
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time == 0) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 9) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.4f);
							} else if (time == 18) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.9f);
							} else if (time == 24) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 27) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.4f);
							} else if (time == 36) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 42) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 45) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 51) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 54) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 60) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 63) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.8f);
							}

							if (time >= 80) {
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
					player.sendMessage(ChatColor.RED + "소환의 협주가 들려옵니다.");
					sendMessage(player, ChatColor.RED + "소환의 협주가 들려옵니다.");
					((Skeleton) mob).setTarget(player);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
				} else if (num == 4) {
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time == 0) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.3f);
							} else if (time == 5) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 10) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 15) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 25) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 35) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 45) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 50) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 60) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.3f);
							} else if (time == 65) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.9f);
							} else if (time == 70) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.8f);
							} else if (time == 75) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.9f);
							}

							if (time >= 90) {
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
					healSkill(((LivingEntity) mob), 10);
					player.sendMessage(ChatColor.RED + "드래곤의 광주가 울려퍼집니다.");
					sendMessage(player, ChatColor.RED + "드래곤의 광주가 울려퍼집니다.");
					((Skeleton) mob).setTarget(player);
				} else if (num <= 6 && !pat2) {
					pat2 = true;
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time == 0) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 40.0f, 0.4f);
							} else if (time == 10) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 40.0f, 0.4f);
							} else if (time == 20) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 40.0f, 0.4f);
							} else if (time == 30) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 40.0f, 0.4f);
							} else if (time == 40) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 40.0f, 0.8f);
							} else if (time == 50) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 10.0f, 0.8f);
								for(Entity ent : mob.getNearbyEntities(20, 10, 20)) {
									if(ent instanceof Player) {
										Player p = (Player) ent;
										if(!p.isOnGround()) {
											p.setHealth(0);
										}
									}
								}
							}

							if (time >= 60) {
								pat2 = false;
								
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
					player.sendMessage(ChatColor.RED + "프라에그나리의 리듬 세상이 펼쳐집니다.");
					sendMessage(player, ChatColor.RED + "프라에그나리의 리듬 세상이 펼쳐집니다.");
					player.sendMessage(ChatColor.RED + "5번 신호가 울린 후 점프를 해야합니다.");
					sendMessage(player, ChatColor.RED + "5번 신호가 울린 후 점프를 해야합니다.");
					((Skeleton) mob).setTarget(player);
				}
			} else {
				int num = rnd.nextInt(12);
				if (num == 0) {
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time == 0) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 9) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.4f);
							} else if (time == 18) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.9f);
							} else if (time == 24) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 27) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.4f);
							} else if (time == 36) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 42) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 45) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 51) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.2f);
							} else if (time == 54) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.1f);
							} else if (time == 60) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 1.0f);
							} else if (time == 63) {
								player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_ZOMBIE_HURT, 14.0f, 0.8f);
							}

							if (time >= 80) {
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
					player.sendMessage(ChatColor.RED + "소환의 협주가 들려옵니다.");
					sendMessage(player, ChatColor.RED + "소환의 협주가 들려옵니다.");
					((Skeleton) mob).setTarget(player);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SILVERFISH);
				} else if(num == 1 && !pat1) {
					pat1 = true;
					
					Location loc = mob.getLocation();
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -12 ; x < 13 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -12 ; z < 13 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time == 60 || time == 100) {
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE35();
								// ================================================================
								List<Entity> nearEntity = mob.getNearbyEntities(12, 10, 12);
								for (Entity ent : nearEntity) {
									if (ent instanceof Player) {
										Player player = (Player) ent;
										player.getWorld().playEffect(mob.getLocation(), Effect.END_GATEWAY_SPAWN, 2);
										if(player.getHealth() - 10 < 0) {
											player.setHealth(0);
										} else {
											player.setHealth(player.getHealth()-10);
										}
										
									}
								}
								List<Entity> nearPlayer = mob.getNearbyEntities(120, 10, 120);
								for (Entity ent : nearPlayer) {
									if (ent instanceof Player) {
										Player player = (Player) ent;
										player.teleport(mob);
									}
								}
							}
							
							if (time >= 140) {
								pat1 = false;
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					player.sendMessage(ChatColor.RED + "전장의 서곡이 울려퍼집니다.");
					sendMessage(player, ChatColor.RED + "전장의 서곡이 울려퍼집니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 150, 200, true,true));
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}

	// 쌍창 전사 석상
	public void mob30(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("쌍창 전사 석상" + ChatColor.YELLOW + " [Lv.468]")) {
			if(rnd.nextInt(20) == 0) {
				Location loc = mob.getLocation();
				if(loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) {
					player.teleport(loc);
				}
			}
		}
	}

	// 빛의 궁수 석상
	public void mob31(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("빛의 궁수 석상" + ChatColor.YELLOW + " [Lv.471]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1, true,true));
		}
	}

	// 쌍검 전사 석상
	public void mob32(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("쌍검 전사 석상" + ChatColor.YELLOW + " [Lv.474]")) {
			if(rnd.nextInt(20) == 0) {
				Location loc = mob.getLocation();
				if(loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) {
					player.teleport(loc);
				}
			}
		}
	}

	// 루 라바다의 석상
	public void mob33(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("루 라바다의 석상" + ChatColor.YELLOW + " [Lv.475]")) {
			if(rnd.nextInt(20) == 0) {
				Location loc = mob.getLocation();
				if(loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) {
					player.teleport(loc);
				}
			}
		}
	}

	// 누아다의 석상
	public void mob34(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("누아다의 석상" + ChatColor.YELLOW + " [Lv.479]")) {
			if(rnd.nextInt(20) == 0) {
				Location loc = mob.getLocation();
				if(loc.clone().add(0,1,0).getBlock().getType() == Material.AIR) {
					player.teleport(loc);
				}
			}
		}
	}

	// 고먐미
	public void mob35(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("고먐미" + ChatColor.YELLOW + " [Lv.480]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 멈멈미
	public void mob36(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("멈멈미" + ChatColor.YELLOW + " [Lv.483]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 펨뮌
	public void mob37(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("펨뮌" + ChatColor.YELLOW + " [Lv.484]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 맴무새
	public void mob38(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("맴무새" + ChatColor.YELLOW + " [Lv.488]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 먐
	public void mob39(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("먐" + ChatColor.YELLOW + " [Lv.489]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 모짐머
	public void mob40(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("모짐머" + ChatColor.YELLOW + " [Lv.493]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 뭔숨미
	public void mob41(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("뭔숨미" + ChatColor.YELLOW + " [Lv.494]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 부멈미
	public void mob42(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("부멈미" + ChatColor.YELLOW + " [Lv.497]")) {
			if(rnd.nextInt(20) == 0) {
				mob.teleport(player.getLocation().add(0,1,0));
			}
		}
	}
	
	// 미아즈마
	public void mob43(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("미아즈마" + ChatColor.YELLOW + " [Lv.??]")) {
			int num = rnd.nextInt(18);
			if(num == 0) {
				player.sendMessage(ChatColor.RED + "미아즈마가 곰을 부릅니다.");
				sendMessage(player, ChatColor.RED + "미아즈마가 곰을 부릅니다.");
				((Skeleton) mob).setTarget(player);
				player.teleport(new Location(player.getWorld(), 1860, 81, 2110));
				mob.teleport(player);
				player.getWorld().spawnEntity(mob.getLocation(), EntityType.RAVAGER);
				player.getWorld().spawnEntity(mob.getLocation(), EntityType.RAVAGER);
				player.getWorld().spawnEntity(mob.getLocation(), EntityType.RAVAGER);
			} else if(num == 1) {
				mob.teleport(player);
				
				player.sendMessage(ChatColor.RED + "미아즈마가 땅울림을 시전합니다.");
				sendMessage(player, ChatColor.RED + "미아즈마가 땅울림을 시전합니다.");
				
				((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
				
				Location loc = mob.getLocation();
				
				taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

					int time = 0;
					ThreadData td = new ThreadData(player.getUniqueId());

					@Override
					public void run() {
						
						if (!td.hasID()) {
							td.setID(taskID);
						}
						
						if (time % 20 == 0) {
							for(int x = -8 ; x < 9 ; x++) {
								for(int y = -1 ; y < 0 ; y++) {
									for(int z = -8 ; z < 9 ; z++) {
										Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
										BlockData mat = Material.BARRIER.createBlockData();
										player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
									}
								}
							}
						}
						
						if (time >= 40) {
							player.sendMessage(ChatColor.RED + "미아즈마가 땅울림을 사용하였습니다.");
							sendMessage(player, ChatColor.RED + "미아즈마가 땅울림을 사용하였습니다.");
							// ===============================================================
							ParticleData pd = new ParticleData(player.getUniqueId());
							if (pd.hasID()) {
								pd.endTask();
								pd.removeID();
							}
							ParticleEffect pe = new ParticleEffect(player, mob);
							pe.startE30();
							// ================================================================
							List<Entity> nearPlayer = mob.getNearbyEntities(8, 30, 8);
							for(Entity p : nearPlayer) {
								if(p instanceof Player) {
									((Player) p).damage(10000);
								}
							}
							
							td.endTask();
							td.removeID();
						}
						
						time++;

					}

				}, 0, 1);
			}
		}
	}
	
	// 환영병
	public void mob44(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("환영병" + ChatColor.YELLOW + " [Lv.532]")) {
			player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GHAST_SCREAM, 0.5f, 1.0f);
		}
	}
	
	// 붉은 좀비
	public void mob45(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("붉은 좀비" + ChatColor.YELLOW + " [Lv.538]")) {
			player.setFireTicks(100);
		}
	}
	
	// 포자를 날리는 검은 버섯
	public void mob46(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포자를 날리는 검은 버섯" + ChatColor.YELLOW + " [Lv.542]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true,true));
		}
	}
	
	// 유혹하는 나무
	public void mob47(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("유혹하는 나무" + ChatColor.YELLOW + " [Lv.544]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0, true,true));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 50, true,true));
			player.damage(500);
		}
	}
	
	// 재앙을 날리는 검은 버섯
	public void mob48(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("재앙을 날리는 검은 버섯" + ChatColor.YELLOW + " [Lv.550]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 0, true,true));
		}
	}
	
	// 중급 파괴수
	public void mob49(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("중급 파괴수" + ChatColor.YELLOW + " [Lv.554]")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				if(!player.isSneaking()) {
					player.setVelocity(new Vector(0, 1, 0));
				}
				player.damage(2000);
			}
		}
	}
	
	// 독극 슬라임
	public void mob50(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("독극 슬라임" + ChatColor.YELLOW + " [Lv.566]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
		}
	}
	
	// 와우
	public void mob51(Player player, Entity mob) {
		
		if (mob.getCustomName().substring(2).equalsIgnoreCase("와우" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(20);
				if (num < 2) {
					((Slime) mob).setTarget(player);
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-1.6f));
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_SLIME_HURT, 3.0f, 1.0f);
				} else if(num < 4) {
					((Slime) mob).setTarget(player);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SLIME);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SLIME);
				} else if(num == 4) {
					((Slime) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "와우가 불꽃비를 내립니다.");
					sendMessage(player, ChatColor.RED + "와우가 불꽃비를 내립니다.");
					List<Entity> nearEntity = mob.getNearbyEntities(50, 30, 50);
					for(Entity ent : nearEntity) {
						if(ent instanceof Player) {
							Player p = (Player) ent;
							p.setFireTicks(200);
						}
					}
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time == 100) {
								int num = 0;
								List<Entity> nearSlime = mob.getNearbyEntities(30, 10, 30);
								for(Entity ent : nearSlime) {
									if(ent instanceof Slime) {
										if(((Slime) ent).getSize() == 2) {
											num++;
											ent.getWorld().spawnEntity(ent.getLocation(), EntityType.MAGMA_CUBE);
											((Slime) ent).setHealth(0);
										}
									}
								}
								if(num > 0) {
									for(Entity ent : nearSlime) {
										if(ent instanceof Player) {
											Player p = (Player) ent;
											p.sendMessage(ChatColor.RED + "주위의 슬라임이 불타오르며 강력한 데미지를 줍니다.");
											if(p.getHealth() - num * 3 < 0) {
												p.setHealth(0);
											} else {
												p.setHealth(p.getHealth() - num * 3);
											}
										}
									}
								}
								td.endTask();
								td.removeID();
							}
							
							if(time > 100) {
								td.endTask();
								td.removeID();
							}

							time++;

						}

					}, 0, 1);
				}
			} else {
				int num = rnd.nextInt(20);
				if (num < 2) {
					((Slime) mob).setTarget(player);
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-1.6f));
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_SLIME_HURT, 3.0f, 1.0f);
				} else if(num < 4) {
					((Slime) mob).setTarget(player);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.SLIME);
				} else if(num == 4) {
					((Slime) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "몸 속에 슬라임의 점액이 흘러옵니다.");
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time >= 100) {
								player.setHealth(player.getHealth()/2);
								player.sendMessage(ChatColor.RED + "몸 속의 점액에 의해 데미지를 받습니다.");
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
			}
		}

	}
	
	// 도둑 토끼
	public void mob52(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("도둑 토끼" + ChatColor.YELLOW + " [Lv.575]")) {
			int num = rnd.nextInt(2);
			if (num == 0) {
				player.damage(2000);
			}
		}
	}
	
	// 야생 토끼
	public void mob53(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("야생 토끼" + ChatColor.YELLOW + " [Lv.579]")) {
			int num = rnd.nextInt(2);
			if (num == 0) {
				player.damage(2500);
			}
		}
	}
	
	// 공양을 받는 돼지
	public void mob54(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("공양을 받는 돼지" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(15);
				if (num == 0) {
					((Zoglin) mob).setTarget(player);
					player.setVelocity(new Vector(0, 2, 0));
					player.damage(10000);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_PIG_HURT, 3.0f, 1.0f);
				} else if(num == 1) {
					((Zoglin) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "돼지가 먹은 것을 토해냅니다.");
					sendMessage(player, ChatColor.RED + "돼지가 먹은 것을 토해냅니다.");
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
				}
			} else {
				int num = rnd.nextInt(10);
				if (num == 0) {
					((Zoglin) mob).setTarget(player);
					if(!player.isSneaking()) {
						player.setVelocity(new Vector(0, 1, 0));
					}
					player.damage(10000);
					player.getWorld().playSound(mob.getLocation(), Sound.ENTITY_PIG_HURT, 3.0f, 1.0f);
				}
			}
		}
	}
	
	// 어린 복어 병사
	public void mob55(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("어린 복어 병사" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0, true,true));
		}
	}
	
	// 아빠 상어
	public void mob56(Player player, Entity mob) {

		if (mob.getCustomName().substring(2).equalsIgnoreCase("아빠 상어" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(20);
				if(num < 2) {
					((WitherSkeleton) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "아빠 상어의 썩은 토사물에 맞았습니다.");
					player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 4,true,true));
					player.setFireTicks(200);
				} else if(num == 2) {
					((WitherSkeleton) mob).setTarget(player);
					mob.teleport(player);
					
					player.sendMessage(ChatColor.RED + "아빠 상어가 불꽃 스크류를 시전합니다.");
					sendMessage(player, ChatColor.RED + "아빠 상어가 불꽃 스크류를 시전합니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -8 ; x < 9 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -8 ; z < 9 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 32) {
								player.sendMessage(ChatColor.RED + "아빠 상어가 불꽃 스크류를 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "아빠 상어가 불꽃 스크류를 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE30();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(8, 50, 8);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										((Player) p).damage(20000);
										p.setFireTicks(200);
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
			} else {
				int num = rnd.nextInt(20);
				if(num < 2) {
					((WitherSkeleton) mob).setTarget(player);
					player.sendMessage(ChatColor.RED + "아빠 상어의 토사물에 맞았습니다.");
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4,true,true));
				} else if(num == 2) {
					((WitherSkeleton) mob).setTarget(player);
					mob.teleport(player);
					
					player.sendMessage(ChatColor.RED + "아빠 상어가 스크류를 시전합니다.");
					sendMessage(player, ChatColor.RED + "아빠 상어가 스크류를 시전합니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -8 ; x < 9 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -8 ; z < 9 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 32) {
								player.sendMessage(ChatColor.RED + "아빠 상어가 스크류를 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "아빠 상어가 스크류를 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE36();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(8, 50, 8);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										((Player) p).damage(15000);
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
				}
			}
		}
		
	}
	
	// 해왕신 포세이돈
	public void mob57(Player player, Entity mob) {

		if (mob.getCustomName().substring(2).equalsIgnoreCase("해왕신 포세이돈" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(18);
				if (num == 0) {
					((Skeleton) mob).setTarget(player);
					mob.getWorld().playSound(mob.getLocation(), Sound.ITEM_TRIDENT_THROW, 8.0f, 1.0f);
					
					ArmorStand proTotem = (ArmorStand) mob.getWorld().spawnEntity(mob.getLocation(),EntityType.ARMOR_STAND);
					proTotem.setVisible(false);
					proTotem.setArms(true);
					proTotem.setItemInHand(new ItemStack(Material.ACACIA_SLAB));
					proTotem.setRightArmPose(new EulerAngle(Math.toRadians(3), 0, 0));
					proTotem.setVelocity(mob.getLocation().getDirection().multiply(4.0f));
					proTotem.setVelocity(proTotem.getVelocity().multiply(new Vector(1, 0.1 ,1)));

					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ArmorStand totem = proTotem;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							if (!td.hasID()) {
								td.setID(taskID);
							}

							if (time % 5 == 0) {
								List<Entity> entitylist = totem.getNearbyEntities(3, 2, 3);
								for (Entity nearEntity : entitylist) {
									if (nearEntity instanceof Player) {
										Player player = (Player) nearEntity;
										player.setHealth(player.getHealth()/3);
										player.getWorld().spawnEntity(player.getLocation(), EntityType.LIGHTNING);
									}
								}
							}

							if (time >= 30) {
								totem.remove();
								td.endTask();
								td.removeID();
							}

							time++;
						}

					}, 0, 1);
				} else if (num == 1) {
					((Skeleton) mob).setTarget(player);
					List<Entity> nearEntity = mob.getNearbyEntities(30, 10, 30);
					for(Entity ent : nearEntity) {
						if(ent instanceof Player) {
							Player nearPlayer = (Player) ent;
							nearPlayer.teleport(mob.getLocation());
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,true));
							nearPlayer.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,100,10000,true,true));
							nearPlayer.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
							nearPlayer.sendMessage(ChatColor.RED + "포세이돈이 자신의 영역에 침범한 자들을 고통에 몰아넣습니다.");
						}
					}
				}
			} else {
				int num = rnd.nextInt(18);
				if (num == 0) {
					((Skeleton) mob).setTarget(player);
					player.getWorld().playSound(mob.getLocation(), Sound.ITEM_SHIELD_BLOCK, 2.0f, 1.0f);
					player.setVelocity(player.getEyeLocation().getDirection().multiply(-10.0f));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 150, 0, true,true));
					if(player.getHealth() - 10 > 0) {
						player.setHealth(player.getHealth() - 10);
					} else {
						player.setHealth(0);
					}
				} else if(num == 1) {
					((Skeleton) mob).setTarget(player);
					player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200, true,true));
					player.getWorld().playSound(player.getLocation(), Sound.AMBIENT_CAVE, 3.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "우리 부모님의 원수를 갚겠어.");
					sendMessage(player, ChatColor.RED + "우리 부모님의 원수를 갚겠어.");
					
					player.getWorld().spawnEntity(mob.getLocation(), EntityType.ZOMBIE);
				}
			}
			
		}
		
	}
	
	// 아기 상어
	public void mob58(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("아기 상어" + ChatColor.YELLOW + " [Lv.1]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 2, true,true));
		}
	}
	
	// 검은 흐름에 잠식된 주민
	public void mob59(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("검은 흐름에 잠식된 주민" + ChatColor.YELLOW + " [Lv.625]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 2, true,true));
		}
	}
	
	// 검은 흐름에 잠식된 주민
	public void mob60(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("검은 흐름에 잠식된 주민" + ChatColor.YELLOW + " [Lv.629]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 2, true,true));
		}
	}
	
	// 페라리교의 신도
	public void mob61(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("페라리교의 신도" + ChatColor.YELLOW + " [Lv.635]")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
			}
		}
	}
	
	// 페라리교의 상위 신도
	public void mob62(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("페라리교의 상위 신도" + ChatColor.YELLOW + " [Lv.639]")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 2, true,true));
			}
		}
	}
	
	// 페라리교의 교주
	public void mob63(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("페라리교의 교주" + ChatColor.YELLOW + " [Lv.650]")) {
			int num = rnd.nextInt(5);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 2, true,true));
			}
		}
	}
	
	// 어푸
	public void mob64(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("어푸" + ChatColor.YELLOW + " [Lv.645]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
		}
	}
	
	// 아푸
	public void mob65(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("아푸" + ChatColor.YELLOW + " [Lv.649]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
		}
	}
	
	// 쑥을 먹는 곰
	public void mob66(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("쑥을 먹는 곰" + ChatColor.YELLOW + " [Lv.654]")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				if(!player.isSneaking()) {
					player.setVelocity(new Vector(0, 1, 0));
				}
				player.damage(3300);
			}
		}
	}
	
	// 위더 스켈레톤
	public void mob67(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("위더 스켈레톤" + ChatColor.YELLOW + " [Lv.659]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 2, true,true));
		}
	}
	
	// 화염의 조종자
	public void mob68(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("화염의 조종자" + ChatColor.YELLOW + " [Lv.660]")) {
			player.setFireTicks(200);
		}
	}
	
	// 귀여움의 조종자
	public void mob69(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("귀여움의 조종자" + ChatColor.YELLOW + " [Lv.664]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 100, true,true));
			player.damage(3000);
		}
	}
	
	// 대지의 조종자
	public void mob70(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("대지의 조종자" + ChatColor.YELLOW + " [Lv.665]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 2, true,true));
		}
	}
	
	// 포보르의 체액
	public void mob71(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포보르의 체액" + ChatColor.YELLOW + " [Lv.670]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 포보르화 고블린
	public void mob72(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포보르화 고블린" + ChatColor.YELLOW + " [Lv.674]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 포보르화 모험가
	public void mob73(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포보르화 모험가" + ChatColor.YELLOW + " [Lv.675]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 포보르화 오크
	public void mob74(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포보르화 오크" + ChatColor.YELLOW + " [Lv.679]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 포보르라고 불리는 포보르
	public void mob75(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("포보르라고 불리는 포보르" + ChatColor.YELLOW + " [Lv.690]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 인어
	public void mob76(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("인어" + ChatColor.YELLOW + " [Lv.640]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1, true,true));
		}
	}
	
	// 반란을 두려워하는 귀족
	public void mob77(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("반란을 두려워하는 귀족" + ChatColor.YELLOW + " [Lv.678]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 200, 1, true,true));
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 2, true,true));
		}
	}
	
	// 족장의 벗
	public void mob78(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("족장의 벗" + ChatColor.YELLOW + " [Lv.685]")) {
			int num = rnd.nextInt(12);
			if (num == 0) {
				if(!player.isSneaking()) {
					player.setVelocity(new Vector(0, 1, 0));
				}
				player.damage(4000);
			}
		}
	}
	
	// 야생 곰
	public void mob79(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("야생 곰" + ChatColor.YELLOW + " [Lv.684]")) {
			int num = rnd.nextInt(12);
			if (num == 0) {
				if(!player.isSneaking()) {
					player.setVelocity(player.getVelocity().multiply(-1.5).add(new Vector(0,1,0)));
				}
				player.damage(4500);
			}
		}
	}
	
	// 야생 토끼
	public void mob80(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("야생 토끼" + ChatColor.YELLOW + " [Lv.687]")) {
			player.removePotionEffect(PotionEffectType.ABSORPTION);
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			player.damage(2500);
		}
	}
	
	// 변이된 원시의 땅 보초병
	public void mob81(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이된 원시의 땅 보초병" + ChatColor.YELLOW + " [Lv.688]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 변이된 원시의 땅 보초병
	public void mob82(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이된 원시의 땅 보초병" + ChatColor.YELLOW + " [Lv.690]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 변이된 원시의 땅 상급병
	public void mob83(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이된 원시의 땅 상급병" + ChatColor.YELLOW + " [Lv.691]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 변이된 원시의 땅 정예병
	public void mob84(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이된 원시의 땅 정예병" + ChatColor.YELLOW + " [Lv.693]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
		}
	}
	
	// 변이의 근원
	public void mob85(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이의 근원" + ChatColor.YELLOW + " [Lv.689]")) {
			player.setFireTicks(200);
		}
	}
	
	// 미지의 땅을 지키는 것
	public void mob86(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("미지의 땅을 지키는 것" + ChatColor.YELLOW + " [Lv.695]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
		}
	}
	
	// 변이된 첨예발톱
	public void mob87(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("변이된 첨예발톱" + ChatColor.YELLOW + " [Lv.694]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 4, true,true));
		}
	}
	
	// 최면을 거는 포보르
	public void mob88(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("최면을 거는 포보르" + ChatColor.YELLOW + " [Lv.697]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 3, true,true));
		}
	}
	
	// 원시 벌레
	public void mob89(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("원시 벌레" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 4, true,true));
		}
	}
	
	// 원시 거미
	public void mob90(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("원시 거미" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 200, 4, true,true));
		}
	}
	
	// 원시 생물
	public void mob91(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("원시 생물" + ChatColor.YELLOW + " [Lv.700]")) {
			int num = rnd.nextInt(8);
			if (num == 0) {
				mob.getWorld().createExplosion(mob.getLocation(), 10, false, false);
				player.damage(1000);
			}
		}
	}
	
	// 숲의 감시자
	public void mob92(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("숲의 감시자" + ChatColor.YELLOW + " [Lv.700]")) {
			int num = rnd.nextInt(10);
			if (num == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 200, 3, true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 200, 0, true,true));
				player.damage(1500);
			}
		}
	}
	
	// 숲의 심판자
	public void mob93(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("숲의 심판자" + ChatColor.YELLOW + " [Lv.??]")) {
			
			if(mob.getType() == EntityType.SKELETON) {
				if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
					mob.getWorld().playSound(mob.getLocation(), Sound.ENTITY_WITCH_AMBIENT, 2.0f, 2.0f);
					player.sendMessage(ChatColor.RED + "심판자가 시커먼 무언가에게 삼켜졌다.");
					sendMessage(player, ChatColor.RED + "심판자가 시커먼 무언가에게 삼켜졌다.");
					List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
					for (Entity p : nearPlayer) {
						if (p instanceof Player) {
							((Player) p).addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 60, 0, true, true));
						}
					}
					mob.getWorld().spawnEntity(new Location(player.getWorld(), 3737.5, 91, 4170.5), EntityType.RAVAGER);
					mob.remove();
				} else {
					int num = rnd.nextInt(15);
					if (num < 1) {
						((Skeleton) mob).setTarget(player);
						player.sendMessage(ChatColor.RED + "숲의 독극물이 흘러들어옵니다.");
						player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4, true, true));
					} else if (num == 1) {
						((Skeleton) mob).setTarget(player);

						player.sendMessage(ChatColor.RED + "심판자가 목을 풉니다.");
						sendMessage(player, ChatColor.RED + "심판자가 목을 풉니다.");
						player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);

						((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true, true));

						Location loc = mob.getLocation();

						taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;
							ThreadData td = new ThreadData(player.getUniqueId());

							@Override
							public void run() {

								if (!td.hasID()) {
									td.setID(taskID);
								}

								if (time % 20 == 0) {
									for (int x = -2; x < 3; x++) {
										for (int y = -1; y < 0; y++) {
											for (int z = -2; z < 3; z++) {
												Location loc2 = loc.clone().add(new Vector(x, y + 1.2, z));
												BlockData mat = Material.BARRIER.createBlockData();
												player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
											}
										}
									}
								}

								if (time >= 20) {
									mob.getWorld().playSound(mob.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 1.0f, 0.1f);
									mob.getWorld().spawnParticle(Particle.EXPLOSION_LARGE, mob.getLocation(), 0);
									player.sendMessage(ChatColor.RED + "강렬한 외침이 들려옵니다.");
									sendMessage(player, ChatColor.RED + "강렬한 외침이 들려옵니다.");
									List<Entity> nearPlayer = mob.getNearbyEntities(3, 10, 3);
									for (Entity p : nearPlayer) {
										if (p instanceof Player) {
											((Player) p).damage(1000000);
										}
									}

									td.endTask();
									td.removeID();
								}

								time++;
							}

						}, 0, 1);
					}
				}
			} else {
				if (((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
					int num = rnd.nextInt(30);
					if (num < 2) {
						if(!player.isSneaking()) {
							player.setVelocity(player.getVelocity().multiply(-1.5).add(new Vector(0,1,0)));
						}
						player.damage(5000);
					} else if (num == 2) {
						player.sendMessage(ChatColor.RED + "심판자가 큰 숨을 들이마십니다.");
						sendMessage(player, ChatColor.RED + "심판자가 큰 숨을 들이마십니다.");

						taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

							int time = 0;
							ThreadData td = new ThreadData(player.getUniqueId());

							@Override
							public void run() {

								if(!td.hasID()) {
									td.setID(taskID);
								}

								mob.setVelocity(mob.getLocation().getDirection().multiply(2.0f));
								
								if(time % 5 == 0 && time > 20) {
									List<Entity> nearPlayer = mob.getNearbyEntities(2, 2, 2);
									for (Entity p : nearPlayer) {
										if (p instanceof Player) {
											((Player) p).damage(8000);
										}
									}
								}
								
								if(time == 50) {
									td.endTask();
									td.removeID();
								}

								time++;

							}

						}, 0, 1);
					}
				} else {
					int num = rnd.nextInt(15);
					if (num == 0) {
						if(!player.isSneaking()) {
							player.setVelocity(player.getVelocity().multiply(-1.5).add(new Vector(0,1,0)));
						}
						player.damage(5000);
					}
				}
			}

			
		}
	}
	
	// 얼어붙은 나무
	public void mob94(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("얼어붙은 나무" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 3, true,true));
			player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1999, true,true));
			player.damage(1000);
		}
	}
	
	// 상급 파괴수
	public void mob95(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("상급 파괴수" + ChatColor.YELLOW + " [Lv.700]")) {
			int num = rnd.nextInt(12);
			if (num == 0) {
				if(!player.isSneaking()) {
					player.setVelocity(player.getLocation().getDirection().multiply(-1.8));
				}
				player.damage(5000);
			}
		}
	}
	
	// 성스러운 거미
	public void mob96(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("성스러운 거미" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 4, true,true));
			player.damage(1000);
		}
	}
	
	// 성스러운 불꽃
	public void mob97(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("성스러운 불꽃" + ChatColor.YELLOW + " [Lv.700]")) {
			player.setFireTicks(200);
			player.damage(1000);
		}
	}
	
	// 떠돌이 나비
	public void mob98(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("떠돌이 나비" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 2, true,true));
			player.damage(1200);
		}
	}
	
	// 동상에 걸린 돼지
	public void mob99(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("동상에 걸린 돼지" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 3, true,true));
			player.damage(1200);
		}
	}
	
	// 설원 거미
	public void mob100(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("설원 거미" + ChatColor.YELLOW + " [Lv.700]")) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 3, true,true));
			player.damage(1200);
		}
	}
	
	// 어둠을 구원한 영웅
	public void mob101(Player player, Entity mob) {
		if(mob.getCustomName().substring(2).equalsIgnoreCase("어둠을 구원한 영웅" + ChatColor.YELLOW + " [Lv.1000]")) {
			if(((LivingEntity) mob).getHealth() < (((LivingEntity) mob).getMaxHealth() / 2)) {
				int num = rnd.nextInt(10);
				if(num == 0) {
					player.teleport(mob.getLocation());
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,100,200,true,true));
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_CHAIN_HIT, 1.0f, 1.0f);
					player.sendMessage(ChatColor.RED + "스켈레톤이 당신을 끌어당겼습니다.");
					((Skeleton) mob).setTarget(player);
				} 
				if(num == 1) {
					
					mob.teleport(player);
					
					player.sendMessage(ChatColor.RED + "스켈레톤이 데스파이어를 시전합니다.");
					sendMessage(player, ChatColor.RED + "스켈레톤이 데스파이어를 시전합니다.");
					player.getWorld().playSound(mob.getLocation(), Sound.BLOCK_GRASS_BREAK, 5.0f, 2.0f);
					
					((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 50, 200, true,true));
					
					Location loc = mob.getLocation();
					
					taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {

						int time = 0;
						ThreadData td = new ThreadData(player.getUniqueId());

						@Override
						public void run() {
							
							if (!td.hasID()) {
								td.setID(taskID);
							}
							
							if (time % 20 == 0) {
								for(int x = -4 ; x < 5 ; x++) {
									for(int y = -1 ; y < 0 ; y++) {
										for(int z = -4 ; z < 5 ; z++) {
											Location loc2 = loc.clone().add(new Vector(x,y+1.2,z));
											BlockData mat = Material.BARRIER.createBlockData();
											player.getWorld().spawnParticle(Particle.BLOCK_MARKER, loc2, 0, mat);
										}
									}
								}
							}
							
							if (time >= 40) {
								player.sendMessage(ChatColor.RED + "스켈레톤이 데스파이어를 사용하였습니다.");
								sendMessage(player, ChatColor.RED + "스켈레톤이 데스파이어를 사용하였습니다.");
								// ===============================================================
								ParticleData pd = new ParticleData(player.getUniqueId());
								if (pd.hasID()) {
									pd.endTask();
									pd.removeID();
								}
								ParticleEffect pe = new ParticleEffect(player, mob);
								pe.startE30();
								// ================================================================
								List<Entity> nearPlayer = mob.getNearbyEntities(4, 30, 4);
								for(Entity p : nearPlayer) {
									if(p instanceof Player) {
										((Player) p).damage(20000);
										p.setFireTicks(200);
									}
								}
								
								td.endTask();
								td.removeID();
							}
							
							time++;

						}

					}, 0, 1);
					
				}
			} else {
				int num = rnd.nextInt(13);
				if(num == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW,100,100,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,100,200,true,true));
					player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS,50,200,true,true));
					player.sendMessage(ChatColor.RED + "스켈레톤의 힘으로 석화되었습니다.");
					((Skeleton) mob).setTarget(player);
				}
			}
		}
	}
	
	// 웨곤
	public void mob102(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("웨곤" + ChatColor.YELLOW + " [Lv.700]")) {
			player.removePotionEffect(PotionEffectType.ABSORPTION);
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			player.damage(3000);
		}
	}
	
	// AFK
	public void mob103(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("AFK" + ChatColor.YELLOW + " [Lv.1]")) {
			player.removePotionEffect(PotionEffectType.ABSORPTION);
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			player.removePotionEffect(PotionEffectType.SPEED);
			if(player.getHealth() <= 1.1) {
				player.setHealth(0);
			}
			player.setHealth(player.getHealth() - 1);
		}
	}
	
	// 매크로 처리반
	public void mob104(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("매크로 처리반" + ChatColor.YELLOW + " [Lv.1]")) {
			player.removePotionEffect(PotionEffectType.ABSORPTION);
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			player.removePotionEffect(PotionEffectType.SPEED);
			if(player.getHealth() <= 1.1) {
				player.setHealth(0);
			}
			player.setHealth(player.getHealth() - 1);
		}
	}
	
	// 잠수부 킬러
	public void mob105(Player player, Entity mob) {
		if (mob.getCustomName().substring(2).equalsIgnoreCase("잠수부 킬러" + ChatColor.YELLOW + " [Lv.1]")) {
			player.removePotionEffect(PotionEffectType.ABSORPTION);
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			player.removePotionEffect(PotionEffectType.SPEED);
			if(player.getHealth() <= 1.1) {
				player.setHealth(0);
			}
			player.setHealth(player.getHealth() - 1);
		}
	}
	
	public void mob106(Player player, Entity mob) {

	}
	
	public void mob107(Player player, Entity mob) {

	}

	public void mob108(Player player, Entity mob) {

	}
	
	public void mob109(Player player, Entity mob) {

	}
	
	public void mob110(Player player, Entity mob) {

	}

	public void healSkill(LivingEntity mob, double num) {
		if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE) == null) {
			mob.setHealth(mob.getHealth() + num);
			return;
		}
		
		if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 0) {
			num = num * 5 / 6.0;
		} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 1) {
			num = num * 4 / 6.0;
		} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 2) {
			num = num * 3 / 6.0;
		} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() == 3) {
			num = num * 2 / 6.0;
		} else if(mob.getPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE).getAmplifier() >= 4) {
			num = num * 1 / 6.0;
		}
		
		mob.setHealth(mob.getHealth() + num);
	}
	
	public void damageMaxHealth(Player player, int num) {
		if(player.getMaxHealth() <= num) {
			player.setMaxHealth(1);
			player.setHealth(0);
		} else {
			player.setMaxHealth(player.getMaxHealth() - num);
		}
	}
	
	public void sendMessage(Player player, String msg) {
		List<Entity> entitylist = player.getNearbyEntities(30, 10, 30);
		for (Entity nearEntity : entitylist) {
			if (nearEntity.getType() == EntityType.PLAYER) {
				Player nearPlayer = (Player) nearEntity;
				nearPlayer.sendMessage(msg);
			}
		}
	}
	
}