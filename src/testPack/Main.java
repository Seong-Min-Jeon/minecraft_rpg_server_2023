package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Egg;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Illusioner;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockIgniteEvent.IgniteCause;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.EntityBlockFormEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.MoistureChangeEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent.RegainReason;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingBreakEvent.RemoveCause;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerAnimationType;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import de.Herbystar.TTA.TTA_Methods;
import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPCLib;

import java.util.Random;

public class Main extends JavaPlugin implements Listener{
	
	// gamerule doMobLoot false
	// gamerule doMobSpawning false
	// gamerule keepInventory true
	// gamerule doImmediateRespawn true
	// gamerule doLimitedCrafting true	
	// gamerule mobGriefing false
	// gamerule doWeatherCycle false
	
	private int sleep = 0;
	Random rnd = new Random();
	World world;
	
	Scoreboard board;
	
	@Override
	public void onEnable() {
		NPCLib.getInstance().registerPlugin(this);
		this.getServer().getPluginManager().registerEvents(this, this);
		//custom command
		getCommand("ChangeAir").setExecutor(new Cmd2ChangeAir());
		getCommand("WallPaint").setExecutor(new Cmd3WallPaint());
		getCommand("Where").setExecutor(new Cmd4Where());
		getCommand("ServerChat").setExecutor(new Cmd5ServerChat());
		getCommand("msg").setExecutor(new Cmd6msg());
		getCommand("c").setExecutor(new Cmd7c());
		getCommand("setBiome").setExecutor(new Cmd9SetBiome());
		getCommand("VilTP").setExecutor(new Cmd10VilTp());
		getCommand("SpawnVil").setExecutor(new Cmd11SpawnVil());
		getCommand("k").setExecutor(new Cmd19Kick());
		getCommand("LoveWood").setExecutor(new Cmd20LoveWood());
		getCommand("velocity").setExecutor(new Cmd27velocity());
		getCommand("target").setExecutor(new Cmd28target());
		getCommand("t").setExecutor(new Cmd31tp());
		getCommand("dropQuest").setExecutor(new Cmd32dropQuest());
		
		new RefreshServer();
		new NPCManager();
		new QuestBoard().setFolder(getDataFolder());
	}
	
	@Override
	public void onDisable() {
		getLogger().info("==Disable==");
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		// 접속가능한 플레이어
		try {
			if (!(player.getDisplayName().equalsIgnoreCase("yumehama"))) {
				player.kickPlayer("서버 점검 중 입니다.");
				return;
			}
		} catch (Exception e) {
			System.err.println(player.getDisplayName() + "이 접속을 시도하였습니다.");
		}
		
		//리소스팩 적용
		//player.setResourcePack("https://cdn.discordapp.com/attachments/929453279925121084/1089149515791073320/LOR.zip");
		
		//입장 메세지
		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setJoinMessage(ChatColor.DARK_RED + "관리자가 돌아왔습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setJoinMessage(ChatColor.RED + "WoolRing가 돌아왔습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("NN_Tapejara")) {
			event.setJoinMessage(ChatColor.RED + "NN_Tapejara가 돌아왔습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setJoinMessage(ChatColor.RED + "why9196가 돌아왔습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setJoinMessage(ChatColor.RED + "Akilae3102가 돌아왔습니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setJoinMessage(ChatColor.RED + "Espina_ID가 돌아왔습니다.");
		} else {
			event.setJoinMessage("도시에 손님이 찾아왔습니다.");
		}
		
		//경고
//		if(player.getDisplayName().equalsIgnoreCase("ㅁㅁㅁ")) {
//			player.sendMessage("매크로 사용으로 현재 1회 경고를 받은 상황입니다.");
//			player.sendMessage("경고 2회 때에는 무통보 영구정지 및 캐릭터 삭제가 있을 수 있습니다.");
//		}
		
		//op빼기
		player.setGameMode(GameMode.ADVENTURE);
		player.setOp(false);
		if(player.getDisplayName().equalsIgnoreCase("yumehama")) {
			player.setOp(true);
			
			ItemStack weapon = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta weaponIm = weapon.getItemMeta();
			weaponIm.setDisplayName(ChatColor.DARK_RED + "신의 검");
			ArrayList<String> weaponLore = new ArrayList<>();
			weaponLore.add(ChatColor.GRAY + "초보 해결사도 지니고 다닐 수 있는 저가형 무기");
			weaponLore.add(ChatColor.GRAY + "내구성은 보기보다 좋다고 한다.");
			weaponIm.setLore(weaponLore);
			weaponIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			weaponIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			weapon.setItemMeta(weaponIm);
			player.getInventory().addItem(weapon);
		}		
		
		//각종 파일 생성
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e) {
            		    e.getStackTrace();
            		}
				}
            	//인격 등급
				File file1 = new File(dir, "personality_grade.dat");
				if (!file1.exists()) {
					try {
						file1.createNewFile();
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1), "UTF-8"));
						fw.write("0/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1"); //보급
		                fw.write("\n");
		                fw.write("-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1"); //고급
		                fw.write("\n");
		                fw.write("-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1"); //한정
		                fw.write("\n");
		                fw.write("-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1"); //예술
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//인격 최고 기록
				File file2 = new File(dir, "personality_best.dat");
				if (!file2.exists()) {
					try {
						file2.createNewFile();
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "UTF-8"));
						fw.write("9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9"); //보급
		                fw.write("\n");
		                fw.write("9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9"); //고급
		                fw.write("\n");
		                fw.write("9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9"); //한정
		                fw.write("\n");
		                fw.write("9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9/9"); //예술
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//퀘스트
				File file3 = new File(dir, "quest.dat");
				if (!file3.exists()) {
					try {
						file3.createNewFile();
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file3), "UTF-8"));
						fw.write("null");
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				//광기
				File file4 = new File(dir, "lunacy.dat");
				if (!file4.exists()) {
					try {
						file4.createNewFile();
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4), "UTF-8"));
						fw.write("0");
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			
		}
		
		//플레이어 접속 시 플레이 중이 아니라면 로비로 이동
		world = player.getWorld();
		if(player.getInventory().getItem(8) == null || player.getInventory().getItem(8).getType() != Material.ACACIA_DOOR) { //플레이 중에만 가지고 있는 무언가를 판별, ACACIA_DOOR이 해결사 면허증
			player.teleport(new Location(world,-1844,70,3012)); //로비로 이동
			new BGM(player, "로비"); //로비 브금 재생
			//player.getInventory().clear();
			
			ItemStack scroll = new ItemStack(Material.FLOWER_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.GREEN + "보급 등급의 인격");
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);		
			
			player.getInventory().setItem(9, scroll); //보급		
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.AQUA + "고급 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(10, scroll); //고급
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "한정 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(11, scroll); //한정
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.GOLD + "예술 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(12, scroll); //예술
			
			ItemStack start = new ItemStack(Material.SLIME_BALL);
			ItemMeta startIm = start.getItemMeta();
			startIm.setDisplayName(ChatColor.GREEN + "GAME START");
			ArrayList<String> startLore = new ArrayList<>();
			startLore.add(ChatColor.GRAY + "선택한 인격으로 시작합니다.");
			startIm.setLore(startLore);
			startIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			startIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			startIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			startIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			startIm.setUnbreakable(true);
			start.setItemMeta(startIm);	
			player.getInventory().setItem(8, start); //시작버튼
		} else {
			//퀘스트 복구
			File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
	    	if(!dir.exists()) {
	    		try{
	    		    dir.mkdir(); 
	    		} catch(Exception e) {
	    		    e.getStackTrace();
	    		}
	    	}
			try {
	    		File file = new File(dir, "quest.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				FileReader filereader = new FileReader(file);
				BufferedReader bufReader = new BufferedReader(filereader);
				String name = bufReader.readLine();
				if(!name.equals("null")) {
					String num = bufReader.readLine();
					QuestBoard qb = new QuestBoard();
					if (name.equals("q0001")) {
						qb.q0001(player, Integer.parseInt(num));
					} else if (name.equals("q0002")) {
						qb.q0002(player, Integer.parseInt(num));
					} else if (name.equals("q0003")) {
						qb.q0003(player, Integer.parseInt(num));
					} else if (name.equals("q0004")) {
						qb.q0004(player, Integer.parseInt(num));
					} else if (name.equals("q0005")) {
						qb.q0005(player, Integer.parseInt(num));
					} else if (name.equals("q0006")) {
						qb.q0006(player, Integer.parseInt(num));
					} else if (name.equals("q0007")) {
						qb.q0007(player, Integer.parseInt(num));
					} else if (name.equals("q0008")) {
						qb.q0008(player, Integer.parseInt(num));
					} else if (name.equals("q0009")) {
						qb.q0009(player, Integer.parseInt(num));
					} else if (name.equals("q0010")) {
						qb.q0010(player, Integer.parseInt(num));
					} else if (name.equals("q0011")) {
						qb.q0011(player, Integer.parseInt(num));
					} else if (name.equals("q0012")) {
						qb.q0012(player, Integer.parseInt(num));
					} else if (name.equals("q0013")) {
						qb.q0013(player, Integer.parseInt(num));
					} else if (name.equals("q0014")) {
						qb.q0014(player, Integer.parseInt(num));
					} else if (name.equals("q0015")) {
						qb.q0015(player, Integer.parseInt(num));
					} else if (name.equals("q0016")) {
						qb.q0016(player, Integer.parseInt(num));
					} else if (name.equals("q0016_1")) {
						qb.q0016_1(player, Integer.parseInt(num));
					} else if (name.equals("q0017")) {
						qb.q0017(player, Integer.parseInt(num));
					} else if (name.equals("q0017_1")) {
						qb.q0017_1(player, Integer.parseInt(num));
					} else if (name.equals("q0018")) {
						qb.q0018(player, Integer.parseInt(num));
					} else if (name.equals("q0018_1")) {
						qb.q0018_1(player, Integer.parseInt(num));
					} else if (name.equals("q0019")) {
						qb.q0019(player, Integer.parseInt(num));
					} else if (name.equals("uq9")) {
						qb.uq9(player, Integer.parseInt(num));
					} else if (name.equals("uq8")) {
						qb.uq8(player, Integer.parseInt(num));
					} else if (name.equals("uq7")) {
						qb.uq7(player, Integer.parseInt(num));
					} else if (name.equals("uq6")) {
						qb.uq6(player, Integer.parseInt(num));
					} else if (name.equals("uq5")) {
						qb.uq5(player, Integer.parseInt(num));
					} else if (name.equals("uq4")) {
						qb.uq4(player, Integer.parseInt(num));
					} else if (name.equals("uq3")) {
						qb.uq3(player, Integer.parseInt(num));
					} else if (name.equals("uq2")) {
						qb.uq2(player, Integer.parseInt(num));
					} else if (name.equals("uq1")) {
						qb.uq1(player, Integer.parseInt(num));
					}
				}
				bufReader.close();
	    	} catch(Exception e) {
	    		
	    	}
			new BGM(player, "메인"); //메인 브금 재생
		}
		
		//몹 스폰 생성
		this.getServer().getPluginManager().registerEvents(new MobThread(player), this);
	}
	
	@EventHandler
	public void reSpawn(PlayerRespawnEvent event) {
		try {
			Player player = event.getPlayer();
			
			player.setLevel(0); //그냥 초기화
			player.setMaxHealth(20); //최대체력 디폴트로
			
			new BGM(player, "로비"); //로비 브금 재생
			
			//퀘스트 초기화
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//해결사 레벨+경치량에 비례해서 광기 지급 (+사념파 메세지)
			int lunacy = 0;
			try {
				ItemStack item = player.getInventory().getItem(8);
				ItemMeta itemIM = item.getItemMeta();
				ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
				int exp = Integer.parseInt(ary.get(1).split("\\[")[1].split("/")[0]);
				
				if(new PlayerGrade().returnGrade(player) == 9) {
					lunacy += exp;
				} else if(new PlayerGrade().returnGrade(player) == 8) {
					lunacy += 10 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 7) {
					lunacy += 35 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 6) {
					lunacy += 90 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 5) {
					lunacy += 300 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 4) {
					lunacy += 720 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 3) {
					lunacy += 1730 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 2) {
					lunacy += 4030 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 1) {
					lunacy += 9220 + exp;
				} else if(new PlayerGrade().returnGrade(player) == 0) {
					lunacy += 20700 + exp;
				}
			} catch(Exception e) {
				
			}
			
			if(lunacy < 0) {
				lunacy = 0;
			}
			
			//광기 복구 하기
			File dir = new File(getDataFolder() + "/" + player.getUniqueId().toString());
	    	if(!dir.exists()) {
	    		try{
	    		    dir.mkdir(); 
	    		} catch(Exception e) {
	    		    e.getStackTrace();
	    		}
	    	}
			try {
	    		File file = new File(dir, "lunacy.dat");
				if (!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				FileReader filereader = new FileReader(file);
				BufferedReader bufReader = new BufferedReader(filereader);
				lunacy += Integer.parseInt(bufReader.readLine());
				bufReader.close();
	    	} catch(Exception e) {
	    		
	    	}
			
			player.setLevel(lunacy); 
			
			event.setRespawnLocation(new Location(world,-1844,70,3012));
			
			player.getInventory().clear(); //인벤 초기화
			
			ItemStack scroll = new ItemStack(Material.FLOWER_BANNER_PATTERN);
			ItemMeta scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.GREEN + "보급 등급의 인격");
			scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			scrollIm.setUnbreakable(true);
			scroll.setItemMeta(scrollIm);		
			
			player.getInventory().setItem(9, scroll); //보급		
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.AQUA + "고급 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(10, scroll); //고급
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "한정 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(11, scroll); //한정
			
			scrollIm = scroll.getItemMeta();
			scrollIm.setDisplayName(ChatColor.GOLD + "예술 등급의 인격");
			scroll.setItemMeta(scrollIm);
			
			player.getInventory().setItem(12, scroll); //예술
			
			ItemStack start = new ItemStack(Material.SLIME_BALL);
			ItemMeta startIm = start.getItemMeta();
			startIm.setDisplayName(ChatColor.GREEN + "GAME START");
			ArrayList<String> startLore = new ArrayList<>();
			startLore.add(ChatColor.GRAY + "선택한 인격으로 시작합니다.");
			startIm.setLore(startLore);
			startIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			startIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			startIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			startIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			startIm.setUnbreakable(true);
			start.setItemMeta(startIm);	
			player.getInventory().setItem(8, start); //시작버튼
		} catch(Exception e11) {

		}
	}
	
	@EventHandler
	public void die(PlayerDeathEvent event) {
		event.setDeathMessage(null);
		//서버에 사망 메세지 출력
		try {
			Player player = (Player) event.getEntity();
			System.out.println(ChatColor.RED + "" + player.getDisplayName() + " 사망");
		} catch (Exception e) {

		}
		
		//사망 메세지 출력
		try {
			Player player = (Player)event.getEntity();
			TTA_Methods.sendTitle(player, ChatColor.RED + "Game Over", 20, 60, 20, "", 20, 60, 20);
		} catch(Exception e) {
			
		}
		
		//최고기록갱신
		try {
			Player player = (Player)event.getEntity();
			String personality = player.getInventory().getItem(7).getItemMeta().getLocalizedName();
			
			SelectPersonality sp = new SelectPersonality();
			int idx = -1;
			int rare = 0;
			if(sp.grade0Ary.contains(personality)) {
				idx = sp.grade0Ary.indexOf(personality);
				rare = 1;
			} else if(sp.grade1Ary.contains(personality)) {
				idx = sp.grade1Ary.indexOf(personality);
				rare = 2;
			} else if(sp.grade2Ary.contains(personality)) {
				idx = sp.grade2Ary.indexOf(personality);
				rare = 3;
			} else if(sp.grade3Ary.contains(personality)) {
				idx = sp.grade3Ary.indexOf(personality);
				rare = 4;
			}
			
			if(idx != -1) {
				try {
					File dataFolder = getDataFolder();
		            if(!dataFolder.exists()) {
		                dataFolder.mkdir();
		            } else {
		            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
		            	if(!dir.exists()) {
		            		try{
		            		    dir.mkdir(); 
		            		} catch(Exception e2) {
		            		    e2.getStackTrace();
		            		}
						}
						File file = new File(dir, "personality_best.dat");
						try {
							FileReader filereader = new FileReader(file);
		    				BufferedReader bufReader = new BufferedReader(filereader);
		    				String first = bufReader.readLine();
		    				String second = bufReader.readLine();
		    				String third = bufReader.readLine();
		    				String fourth = bufReader.readLine();
		    				int grade = new PlayerGrade().returnGrade(player);
		    				
		    				if(rare == 1) {
		    					String[] num = first.split("/");
		    					if(Integer.parseInt(num[idx]) > grade) {
		    						num[idx] = Integer.toString(grade);
		            				String str = "";
		            				for(int i = 0 ; i < 53 ; i++) {
		            					str += num[i] + "/";
		            				}
		            				str += num[53];
		        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		        	                fw.write(str);
		        	                fw.write("\n");
		        	                fw.write(second);
		        	                fw.write("\n");
		        	                fw.write(third);
		        	                fw.write("\n");
		        	                fw.write(fourth);
		        	                fw.close();
		    					}
		    				} else if(rare == 2) {
		    					String[] num = second.split("/");
		    					if(Integer.parseInt(num[idx]) > grade) {
		    						num[idx] = Integer.toString(grade);
		            				String str = "";
		            				for(int i = 0 ; i < 53 ; i++) {
		            					str += num[i] + "/";
		            				}
		            				str += num[53];
		        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		        	                fw.write(first);
		        	                fw.write("\n");
		        	                fw.write(str);
		        	                fw.write("\n");
		        	                fw.write(third);
		        	                fw.write("\n");
		        	                fw.write(fourth);
		        	                fw.close();
		    					}
		    				} else if(rare == 3) {
		    					String[] num = third.split("/");
		    					if(Integer.parseInt(num[idx]) > grade) {
		    						num[idx] = Integer.toString(grade);
		            				String str = "";
		            				for(int i = 0 ; i < 53 ; i++) {
		            					str += num[i] + "/";
		            				}
		            				str += num[53];
		        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		        	                fw.write(first);
		        	                fw.write("\n");
		        	                fw.write(second);
		        	                fw.write("\n");
		        	                fw.write(str);
		        	                fw.write("\n");
		        	                fw.write(fourth);
		        	                fw.close();
		    					}
		    				} else if(rare == 4) {
		    					String[] num = fourth.split("/");
		    					if(Integer.parseInt(num[idx]) > grade) {
		    						num[idx] = Integer.toString(grade);
		            				String str = "";
		            				for(int i = 0 ; i < 53 ; i++) {
		            					str += num[i] + "/";
		            				}
		            				str += num[53];
		        					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
		        	                fw.write(first);
		        	                fw.write("\n");
		        	                fw.write(second);
		        	                fw.write("\n");
		        	                fw.write(third);
		        	                fw.write("\n");
		        	                fw.write(str);
		        	                fw.close();
		    					}
		    				}
		    				
			                bufReader.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
					}
				} catch (Exception e2) {
					
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void distortedDeath(EntityDeathEvent event) {
		Entity ent = event.getEntity();
		//슬라임 분열 기믹
		try {
			if(ent.getCustomName().equals(ChatColor.YELLOW + "" + ChatColor.BOLD + "작아지는 죽음") && ((Slime) ent).getSize() > 2) {
				Entity newEnt = world.spawnEntity(ent.getLocation(), EntityType.SLIME);
				((Slime) newEnt).setSize(((Slime) ent).getSize() - 1);
				return;
			}
		} catch(Exception e) {
			
		}
		
		//보상 수여하기
		try {
			List<Entity> nearPlayer = ent.getNearbyEntities(8, 8, 8);
			for(Entity p : nearPlayer) {
				if(p instanceof Player) {
					Player player = (Player) p;
					if(ent.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "다리가 많아! 몇개야?")) {
						TTA_Methods.sendTitle(player, "DISTORTED FELLED", 40, 40, 20, "다리가 많아! 몇개야?", 20, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 10만큼 증가했다.");
						giveExp(player, 10);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "외눈 물고기")) {
						TTA_Methods.sendTitle(player, "DISTORTED FELLED", 40, 40, 20, "외눈 물고기", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 10만큼 증가했다.");
						giveExp(player, 10);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "회색 인간")) {
						TTA_Methods.sendTitle(player, "DISTORTED FELLED", 40, 40, 20, "회색 인간", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 10만큼 증가했다.");
						giveExp(player, 10);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작아지는 죽음")) {
						if(((Slime) ent).getSize() <= 2) {
							TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "작아지는 죽음", 40, 40, 20);
							player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
							
							player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
							player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
							giveExp(player, 40);
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("uq6")) {
								int qNum = qb.getNum(player);
								qb.uq8(player, qNum + 1);
							} else if (getQuestName(player).equals("uq5")) {
								int qNum = qb.getNum(player);
								qb.uq7(player, qNum + 1);
							}
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작은 조각")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "작은 조각", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "약쟁이 소녀")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "약쟁이 소녀", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "날아오르는 다리")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "날아오르는 다리", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검은 인격")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "검은 인격", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "외눈 물고기 성체")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "외눈 물고기 성체", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "녹아내리는 마음")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "녹아내리는 마음", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "쏘아올리는 불꽃")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "쏘아올리는 불꽃", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "부패의 조각")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "부패의 조각", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "폭주하는 황소", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "우는 영혼들의 산", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "도망쳐", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1);
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void consumeItem(PlayerItemConsumeEvent event) {
		Player player = event.getPlayer();
		try {
			//포션류
			if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "알록달록 " + ChatColor.GREEN + "칵" + ChatColor.YELLOW + "테" + ChatColor.RED + "일")) {
				double tmp = 0;
				tmp = player.getHealth() + 2.5;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, true));
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#CC9933") + "올가의 홍차칵테일")) {
				double tmp = 0;
				tmp = player.getHealth() + 2;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, true));
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#993333") + "단테주")) {
				double tmp = 0;
				tmp = player.getHealth() + 2.2;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 0, true, true));
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#FFCCCC") + "눈물의 병")) {
				double tmp = 0;
				tmp = player.getHealth() + 20;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true, true));
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#0033CC") + "진실의 삼키는 거짓말")) {
				double tmp = 0;
				tmp = player.getHealth() + 18;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#FFCC99") + "베스파의 계피차")) {
				double tmp = 0;
				tmp = player.getHealth() + 10;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#6699FF") + "눈의 여왕의 입맞춤")) {
				double tmp = 0;
				tmp = player.getHealth() + 22;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.setFreezeTicks(100);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#99FFFF") + "마법의 손키스")) {
				double tmp = 0;
				tmp = player.getHealth() + 19;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#999999") + "호크앤쿠")) {
				double tmp = 0;
				tmp = player.getHealth() + 100;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#333333") + "추출팀의 우물에서 떠온 ■■")) {
				double tmp = 0;
				tmp = player.getHealth() + 120;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#33CC33") + "예술")) {
				double tmp = 0;
				tmp = player.getHealth() + 999;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
				player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 600, 0, true, true));
			} else if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "혈청K")) {
				player.setMaxHealth(player.getMaxHealth() + 4);
				
				double tmp = 0;
				tmp = player.getHealth() + 999;
				if(tmp > player.getMaxHealth()) {
					player.setHealth(player.getMaxHealth());
				} else {
					player.setHealth(tmp);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.GREEN + "혈청-K")) {
				damageMaxHealth(player, 3);
			}
			
			//음식
			if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "윤이 만든 음식")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 5);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "보노 삼색" + ChatColor.GREEN + "비" + ChatColor.YELLOW + "빔" + ChatColor.RED + "밥")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1800, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 8);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#663333") + "사랑마을의 토머리조또")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 10);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#996633") + "피에르 찰떡손파이")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 4);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#993333") + "단테 에그타르트")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 600, 1,true,true));
				player.setFoodLevel(player.getFoodLevel() + 4);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#FF9933") + "네모네모 짜장쫄면")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 3,true,true));
				player.setFoodLevel(player.getFoodLevel() + 8);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#FF66CC") + "인어스테이크")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 1,true,true));
				player.setFoodLevel(player.getFoodLevel() + 6);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#99FF66") + "꽃밭 위의 티타니아")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 6,true,true));
				player.setFoodLevel(player.getFoodLevel() + 1);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#33CC00") + "분노의 푸딩")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 1,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 4,true,true));
				player.setFoodLevel(player.getFoodLevel() + 4);
				
				if(rnd.nextInt(10) == 0) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 100, 0,true,true));
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#CC0000") + "소녀의 잿더미 케이크")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 9,true,true));
				player.setFoodLevel(player.getFoodLevel() + 8);
				
				if(rnd.nextInt(10) == 0) {
					player.setFireTicks(100);
				}
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#FFFFFF") + "침묵 교향곡 op.19")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 9,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 1200, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 10);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#333399") + "마탄의 쿠키")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 14,true,true));
				player.setFoodLevel(player.getFoodLevel() + 8);
			} else if(event.getItem().getItemMeta().getDisplayName().equals(net.md_5.bungee.api.ChatColor.of("#990000") + "파고드는 포테이토")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 9,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 12000, 0,true,true));
				player.setFoodLevel(player.getFoodLevel() + 8);
			}
			
			//특이 포션
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "엘릭서")) {
				for(PotionEffect effect : player.getActivePotionEffects ()){
			        player.removePotionEffect(effect.getType());
			    }
			}
		} catch(Exception e) {
			
		}
		
		try {
			if(player.getInventory().getItemInMainHand().getType() == Material.POTION) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.MUSHROOM_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.RABBIT_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.BEETROOT_SOUP) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.SUSPICIOUS_STEW) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.HONEY_BOTTLE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.ROTTEN_FLESH) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.GOLDEN_APPLE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void spawnEntity(CreatureSpawnEvent event) {
		try {
			Entity entity = event.getEntity();
			if(entity instanceof Drowned) {
				entity.remove();
			}
			if(!(entity.getType() == EntityType.HORSE || entity.getType() == EntityType.PIG || entity.getType() == EntityType.SHEEP
					|| entity.getType() == EntityType.COW || entity.getType() == EntityType.CHICKEN)) {
				((LivingEntity)entity).addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 2, true, false, false));
			}
			if((entity.getType() != EntityType.HORSE) && (entity.getType() != EntityType.ARMOR_STAND)) {
				SpawnMob sm = new SpawnMob();
				SpawnAnimal sa = new SpawnAnimal();
				if(!sm.spawn(entity)) {			
					event.setCancelled(true);
				}
				if(!sa.spawn(entity)) {			
					event.setCancelled(true);
				}			
			}
			if(entity.getType() == EntityType.ZOMBIE) {
				//entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원");
			}
		} catch(Exception e3) {
			
		}
	}
	
	@EventHandler
	public void dropItem(PlayerDropItemEvent event) {
		Item itemArg = event.getItemDrop();
		
		try {
			ItemStack item = itemArg.getItemStack();
			//무기+방어구 드랍 불가
			if((item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
							|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
							|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
							|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
							|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
							|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
							|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
							|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
							|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
							|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
							|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
							|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
							|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
							|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
							|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
							|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
							|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
							|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
							|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
							|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
							
							|| item.getType() == Material.MUSIC_DISC_11 || item.getType() == Material.MUSIC_DISC_13 || item.getType() == Material.MUSIC_DISC_BLOCKS 
							|| item.getType() == Material.MUSIC_DISC_CAT || item.getType() == Material.MUSIC_DISC_CHIRP || item.getType() == Material.MUSIC_DISC_FAR 
							|| item.getType() == Material.MUSIC_DISC_MALL || item.getType() == Material.MUSIC_DISC_MELLOHI || item.getType() == Material.MUSIC_DISC_PIGSTEP 
							|| item.getType() == Material.MUSIC_DISC_STAL || item.getType() == Material.MUSIC_DISC_STRAD || item.getType() == Material.MUSIC_DISC_WAIT 
							|| item.getType() == Material.MUSIC_DISC_WARD
					
							|| item.getType() == Material.CREEPER_BANNER_PATTERN || item.getType() == Material.FLOWER_BANNER_PATTERN || item.getType() == Material.GLOBE_BANNER_PATTERN 
							|| item.getType() == Material.MOJANG_BANNER_PATTERN || item.getType() == Material.PIGLIN_BANNER_PATTERN || item.getType() == Material.SKULL_BANNER_PATTERN 
							
							|| item.getType() == Material.SLIME_BALL || item.getType() == Material.MAGMA_CREAM || item.getType() == Material.SHULKER_SHELL)) {
				event.setCancelled(true);
				return;
			}
		} catch(Exception e) {
			
		}
		
		//기타 아이템 드랍 불가
		if(event.getItemDrop().getItemStack().getType() == Material.NETHER_STAR) {
			event.setCancelled(true);
			return;
		} else if(event.getItemDrop().getItemStack().getType() == Material.PAPER) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
		//절대검
		try {
			if(event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if(!(event.getEntity() instanceof Player)) {
					if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 검")) {
						event.getEntity().remove();				
					} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 검+")) {
						if(event.getEntity() instanceof LivingEntity) {
							event.setCancelled(true);
							((LivingEntity) (event.getEntity())).damage(10000);
						}
					} else {
						event.setCancelled(true);
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		//화살 제거
		try {
			if(event.getEntity() instanceof LivingEntity) {
				((LivingEntity) event.getEntity()).setArrowsInBody(0);
			}
		} catch(Exception e) {
			
		}
		
		//피격 불가능한 엔티티
		if(event.getEntity().getType() == EntityType.VILLAGER || event.getEntity().getType() == EntityType.PIG 
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.COW
				|| event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.WOLF
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE
				|| event.getEntity().getType() == EntityType.DONKEY || event.getEntity().getType() == EntityType.RABBIT
				|| event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.ARMOR_STAND) {
			event.setCancelled(true);
			return;
		}
		
		//플레이어가 발사한 화살은 히트 불가
		try {
			if (event.getDamager() instanceof Arrow) {
				if(((Arrow) event.getDamager()).getShooter() instanceof Player) {
					event.setCancelled(true);
					return;
				}
			}
		} catch (Exception e) {

		}

		//발광화살 히트 불가
		try {
			if (event.getDamager() instanceof SpectralArrow) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}
		
		//눈 히트 불가
		try {
			if (event.getDamager() instanceof Snowball) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}

		//장비버프
		try {
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				if (player.getInventory().getBoots() != null) {
					if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나미르 공방제 부츠")) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 0, true, true));
					} else if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나미르 공방제 고급 부츠")) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 1, true, true));
					} else if (player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나미르 공방제 프리미엄 부츠")) {
						player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 2, true, true));
					}
				}
			}
		} catch (Exception e) {

		}		
		
		//몹이 공격한 경우 디버프 부여
		try {
			if (event.getDamager() instanceof Entity) {
				Entity entity = (Entity) event.getDamager();
				Player player = (Player) event.getEntity();
				
				if(entity instanceof Arrow) {
					entity = (Entity) ((Arrow) entity).getShooter();
				}
				
				PlayerHittenDebuff debuff = new PlayerHittenDebuff();
				debuff.playerHittenDebuff(player, entity);
			}
		} catch (Exception e) {

		}
		
		//브금 재생
		try {
			if(event.getDamager() instanceof Player) {
				if(event.getEntity() instanceof Mob) {
					Player player = (Player) event.getDamager();
					Entity mob = event.getEntity();
					
					if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
						new BGM(player, "폭주하는 황소");
					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
						new BGM(player, "우는 영혼들의 산");
					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
						new BGM(player, "도망쳐");
					} else {
						new BGM(player, "전투");
					}
				}
			} else {
				if(event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					Entity mob = event.getDamager();
					
					if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
						new BGM(player, "폭주하는 황소");
					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
						new BGM(player, "우는 영혼들의 산");
					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
						new BGM(player, "도망쳐");
					} else {
						new BGM(player, "전투");
					}
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		
		//로비는 무적
		if(event.getEntity() instanceof Player) {
			//-1820 100 2996  -1885 30 3069
			Location loc = event.getEntity().getLocation();
			if (loc.getX() <= -1820 && loc.getY() <= 100 && loc.getZ() <= 3069 
					&& loc.getX() >= -1885 && loc.getY() >= 0 && loc.getZ() >= 2996) {
				event.setCancelled(true);
				return;
			}
			
		}
		
		//데미지 0이하면 패스
		if(event.getDamage() <= 0) {
			event.setCancelled(true);
			return;
		}
		
		//무적인 엔티티
		if(event.getEntity().getType() == EntityType.PIG || event.getEntity().getType() == EntityType.COW || event.getEntity().getType() == EntityType.RABBIT
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.VILLAGER
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE || event.getEntity().getType() == EntityType.ZOMBIE_HORSE
				|| event.getEntity().getType() == EntityType.WOLF || event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.ITEM_FRAME || event.getEntity().getType() == EntityType.DROPPED_ITEM) {
			event.setCancelled(true);
			return;
		}
		
		//플레이어 피격 데미지 계산식
		try {
			if(event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				double damage = event.getDamage();
				
				int personality = 0; //10이면 10% 경감
				int chestplate = 0; 
				
				try {
					ItemStack item = player.getInventory().getItem(7);
					String name = item.getItemMeta().getDisplayName();
					personality = Integer.parseInt(name.substring(name.length()-1, name.length()));
				} catch(Exception e2) {
					
				}
				
				if (player.getInventory().getChestplate() != null) {
					if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "유니온 공방제 슈트")) {
						chestplate = 2;
					} else if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "유니온 공방제 고급 슈트")) {
						chestplate = 5;
					} else if (player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "유니온 공방제 프리미엄 슈트")) {
						chestplate = 10;
					}
				}
				
				damage = (damage - chestplate) * (100 - (personality*5)) * 0.01;
				
				event.setDamage(damage);
			}
		} catch(Exception e) {
			
		}
		
		//다시 데미지 0이하면 패스
		if (event.getDamage() <= 0) {
			event.setCancelled(true);
			return;
		}
		
		// 인식변경
		try {
			if (event.getEntity() instanceof Mob) {
				Mob mob = (Mob) event.getEntity();
				Player player = null;
				if(mob.getTarget() == null) {
					List<Entity> nearEntity = mob.getNearbyEntities(5, 5, 5);
					for(Entity ent : nearEntity) {
					    if(ent instanceof Player) {
					        player = (Player) ent;
					        break;
					    }
					}
					mob.setTarget(player);
				}
				
				mob.setTicksLived(1);
			}
		} catch (Exception e) {

		}
		
		//회피
		try {
			if (event.getEntity() instanceof Player) {
				Player player = (Player) event.getEntity();
				int num = 0;
				
				if(num > 70) {
					num = 70;
				}
				
				if(rnd.nextInt(100) < num) {
					event.setCancelled(true);
					return;
				}
			}
		} catch(Exception e) {
			
		}
		
		// 특수 데미지 처리(뎀지 경감 이후 처리)
		try {
			if (event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE || event.getCause() == DamageCause.HOT_FLOOR) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
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
					event.setDamage(1);
				}
			} else if (event.getCause() == DamageCause.VOID) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					event.setDamage(player.getMaxHealth());
				}
			} else if (event.getCause() == DamageCause.FREEZE) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					event.setDamage(player.getMaxHealth());
				}
			} else if (event.getCause() == DamageCause.DROWNING) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					event.setDamage(player.getMaxHealth());
				}
			} else if (event.getCause() == DamageCause.POISON) {
				if (event.getEntity() instanceof Player) {
					event.setDamage(1);
				}
			} else if (event.getCause() == DamageCause.WITHER) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					int num = rnd.nextInt(7);
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
					event.setDamage(1);
				}
			} else if (event.getCause() == DamageCause.BLOCK_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					event.setDamage(player.getMaxHealth()/4);
					player.setFireTicks(100);
				}
			} else if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					event.setDamage(player.getMaxHealth()/4);
					player.setFireTicks(100);
				}
			} else if(event.getCause() == DamageCause.STARVATION) {
				Player player = (Player) event.getEntity();
				event.setDamage(player.getMaxHealth());
			}
		} catch(Exception e){
			
		}
		
		//몹을 공격한 경우 기믹 발생
		try {
			if (event.getEntity() instanceof Entity && event.getDamage() > 0 && !event.isCancelled()) {
				Entity entity = (Entity) event.getEntity();

				PlayerHitGimmick debuff = new PlayerHitGimmick();
				debuff.playerHitGimmick(entity);
			}
		} catch (Exception e) {

		}
		
		//몹 루트
		try {
			if (event.getEntity() instanceof Mob) {				
				Entity mob = event.getEntity();
				double damage = event.getFinalDamage();
				MobDeath md = new MobDeath(mob, damage);
			}
		} catch (Exception e) {

		}
		
		//몹 정리
		try {
			if (event.getCause() == DamageCause.DROWNING) {
				if (event.getEntity() instanceof Mob) {
					Mob mob = (Mob) event.getEntity();
					mob.remove();
				}
			} else if (event.getCause() == DamageCause.SUFFOCATION) {
				if (event.getEntity() instanceof Mob) {
					Mob mob = (Mob) event.getEntity();
					mob.remove();
				}
			} else if (event.getCause() == DamageCause.VOID) {
				if (event.getEntity() instanceof Mob) {
					Mob mob = (Mob) event.getEntity();
					mob.remove();
				}
			}
		} catch (Exception e) {

		}
		
		//브금
		if(event.getEntity() instanceof Mob) {
			Mob mob = (Mob) event.getEntity();
			if(mob.getTarget() instanceof Player) {
				Player player = (Player) mob.getTarget();
				
				if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
					new BGM(player, "폭주하는 황소");
				} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
					new BGM(player, "우는 영혼들의 산");
				} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
					new BGM(player, "도망쳐");
				} else {
					new BGM(player, "전투");
				}
				player.setTicksLived(1);
			}
		}
		
		// 보스바
		try {
			if(!(event.getEntity() instanceof Player)) {
				Entity mob = event.getEntity();
				// 코낭그
				if (mob.getCustomName().substring(2).equalsIgnoreCase("코낭그" + ChatColor.YELLOW + " [Lv.??]")) {

					LivingEntity boss = (LivingEntity) mob;
					
					if(boss.getHealth() - event.getFinalDamage() <= 0) {
						for(Player p : new BossHealth().getBar1().getPlayers()) {
							new BossHealth().getBar1().setProgress(0);
							new BossHealth().getBar1().removePlayer(p);
						}
					} else {
						new BossHealth().getBar1().setProgress((boss.getHealth()-event.getFinalDamage()) / 700000.0);
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		// 데미지 표기
		try {
			if(event.getEntity() instanceof Mob) {
				Entity entity = event.getEntity();
				
				int damage = (int)event.getFinalDamage();
				
				if(damage > 0 && !(event.getCause() == DamageCause.ENTITY_ATTACK) && !(event.getCause() == DamageCause.ENTITY_SWEEP_ATTACK)) {
					ArmorStand damageSign = (ArmorStand) entity.getWorld().spawnEntity(entity.getLocation().add(0,0.8,0), EntityType.ARMOR_STAND);
					damageSign.setVisible(false);
					damageSign.setSmall(true);
					
					if(damage < 100) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#808080") + Integer.toString(damage*10));
					} else if(damage < 200) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#B4B4B4") + Integer.toString(damage*10));
					} else if(damage < 300) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#E5E5E5") + Integer.toString(damage*10));
					} else if(damage < 400) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#EFEFEF") + Integer.toString(damage*10));
					} else if(damage < 500) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#FFFFFF") + Integer.toString(damage*10));
					} else if(damage < 600) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#f2ffeb") + Integer.toString(damage*10));
					} else if(damage < 700) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#e0ffcf") + Integer.toString(damage*10));
					} else if(damage < 800) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ccffb0") + Integer.toString(damage*10));
					} else if(damage < 900) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#b3ff8a") + Integer.toString(damage*10));
					} else if(damage < 1000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#9dff69") + Integer.toString(damage*10));
					} else if(damage < 2000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#7fff3b") + Integer.toString(damage*10));
					} else if(damage < 3000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#1aff00") + Integer.toString(damage*10));
					} else if(damage < 4000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ff77") + Integer.toString(damage*10));
					} else if(damage < 5000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ffc3") + Integer.toString(damage*10));
					} else if(damage < 6000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00fff7") + Integer.toString(damage*10));
					} else if(damage < 7000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00d0ff") + Integer.toString(damage*10));
					} else if(damage < 8000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00aeff") + Integer.toString(damage*10));
					} else if(damage < 9000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#008cff") + Integer.toString(damage*10));
					} else if(damage < 10000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#0062ff") + Integer.toString(damage*10));
					} else if(damage < 20000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#002aff") + Integer.toString(damage*10));
					} else if(damage < 30000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#3c00ff") + Integer.toString(damage*10));
					} else if(damage < 40000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8c00ff") + Integer.toString(damage*10));
					} else if(damage < 50000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#c300ff") + Integer.toString(damage*10));
					} else if(damage < 60000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00f7") + Integer.toString(damage*10));
					} else if(damage < 70000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00b3") + Integer.toString(damage*10));
					} else if(damage < 80000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0080") + Integer.toString(damage*10));
					} else if(damage < 90000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0048") + Integer.toString(damage*10));
					} else if(damage < 100000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0000") + Integer.toString(damage*10));
					} else if(damage < 200000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ab0000") + Integer.toString(damage*10));
					} else if(damage < 300000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#630000") + Integer.toString(damage*10));
					} else if(damage < 400000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8f0062") + Integer.toString(damage*10));
					} else if(damage < 500000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#70008f") + Integer.toString(damage*10));
					} else if(damage < 600000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#420054") + Integer.toString(damage*10));
					} else if(damage < 10000000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + ChatColor.MAGIC + Integer.toString(damage*10));
					} else {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ffffff") + Integer.toString(damage*10));
					}
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
		} catch(Exception e) {
			
		}
		
	}
	
	@EventHandler
	public void mouseEvent(PlayerInteractEvent event) {
		// 아이템 사용
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if ((event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR)) {
					ItemStack item = player.getInventory().getItemInMainHand();
					Material type = item.getType();
					if((type == Material.CREEPER_BANNER_PATTERN) || (type == Material.FLOWER_BANNER_PATTERN) || (type == Material.GLOBE_BANNER_PATTERN)
							|| (type == Material.MOJANG_BANNER_PATTERN) || (type == Material.PIGLIN_BANNER_PATTERN) || (type == Material.SKULL_BANNER_PATTERN)) {
						new ScrollUseEvent(player, item, getDataFolder());
					} else if(type == Material.SLIME_BALL) {
						if(item.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "GAME START")) {
							if(player.getInventory().getItem(0) != null) {
			        			if(player.getInventory().getItem(0).getItemMeta() != null) {
			        				new Start(player, getDataFolder());
				        		}
			        		}
						}
					} else if(type == Material.PAPER) {
						String name = item.getItemMeta().getDisplayName();
						if(name.substring(name.length()-3, name.length()).equals("초대장")) {
							new ChangeOffice(player, item.getItemMeta().getDisplayName().substring(0, name.length()-4));
						} else if(name.equals(ChatColor.BOLD + "사직서")) {
							new ChangeOffice(player, "12무소속");
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		//다락문 등 막기
		try {
			EquipmentSlot e = event.getHand (); 
	        if (e.equals (EquipmentSlot.HAND)) {
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			if(block.getType() == Material.OAK_TRAPDOOR || block.getType() == Material.SPRUCE_TRAPDOOR || block.getType() == Material.BIRCH_TRAPDOOR 
	    					|| block.getType() == Material.JUNGLE_TRAPDOOR || block.getType() == Material.ACACIA_TRAPDOOR || block.getType() == Material.DARK_OAK_TRAPDOOR
	    					|| block.getType() == Material.WARPED_TRAPDOOR || block.getType() == Material.TRAPPED_CHEST || block.getType() == Material.ITEM_FRAME
	    					|| block.getType() == Material.ACACIA_FENCE_GATE || block.getType() == Material.BIRCH_FENCE_GATE || block.getType() == Material.CRIMSON_FENCE_GATE
	    					|| block.getType() == Material.DARK_OAK_FENCE_GATE || block.getType() == Material.JUNGLE_FENCE_GATE || block.getType() == Material.OAK_FENCE_GATE
	    					|| block.getType() == Material.SPRUCE_FENCE_GATE || block.getType() == Material.WARPED_FENCE_GATE) {
	    				if(!(player.getGameMode() == GameMode.CREATIVE && player.isOp())) {
	    					event.setCancelled(true);
	    				}
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		
		//R스킬
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	Player player = event.getPlayer();
	        	try {	    
	    			if(player.getVehicle() == null) {
	    				if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        				ItemStack item = player.getInventory().getItemInMainHand();
	        				if((item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
	    							|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
	    							|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
	    							|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
	    							|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
	    							|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
	    							|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
	    							|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
	    							|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
	    							|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
	    							|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
	    							|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
	    							|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
	    							|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
	    							|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
	    							|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
	    							|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
	    							|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
	    							|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
	    							|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
	    							
	    							|| item.getType() == Material.MUSIC_DISC_11 || item.getType() == Material.MUSIC_DISC_13 || item.getType() == Material.MUSIC_DISC_BLOCKS 
	    							|| item.getType() == Material.MUSIC_DISC_CAT || item.getType() == Material.MUSIC_DISC_CHIRP || item.getType() == Material.MUSIC_DISC_FAR 
	    							|| item.getType() == Material.MUSIC_DISC_MALL || item.getType() == Material.MUSIC_DISC_MELLOHI || item.getType() == Material.MUSIC_DISC_PIGSTEP 
	    							|| item.getType() == Material.MUSIC_DISC_STAL || item.getType() == Material.MUSIC_DISC_STRAD || item.getType() == Material.MUSIC_DISC_WAIT 
	    							|| item.getType() == Material.MUSIC_DISC_WARD)) {
	        					new Skill().effect(player, "R");
	        				}
	        			}
	    				
	    			}
	    		} catch(Exception e1) {
	    			
	    		}
	        }
		} catch(Exception e) {
			
		}
		
		//퀘스트 블럭 클릭
		try {			
			QuestBoard qb = new QuestBoard();
			EquipmentSlot e = event.getHand (); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	//퀘스트 클리어 이벤트
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			try {
	    				//퀘스트 엔티티 접촉
	    				if (getQuestName(player) != null) {
	    					if (getQuestName(player).equals("q0010") && block.getType() == Material.CHEST && block.getX() == -1175 && block.getY() == 67 && block.getZ() == 1182) {
	    						int persent = 50;
	    						if(world.getTime() >= 21000 && world.getTime() <= 23000) {
	    							persent += 10;
	    						}
	    						persent += (9 - new PlayerGrade().returnGrade(player)) * 2;
	    						
	    						try {
	    							ItemStack item = player.getInventory().getItem(7);
	    							String name = item.getItemMeta().getDisplayName();
	    							persent += Integer.parseInt(name.substring(name.length()-1, name.length())) * 5;
	    						} catch(Exception e2) {
	    							
	    						}
	    						
	    						if(rnd.nextInt(100) < persent) {
	    							int qNum = qb.getNum(player);
		    						qb.q0010(player, qNum + 1);
		    						player.sendMessage(ChatColor.GOLD + "[System] 윤 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							QuestOwner qo = new QuestOwner();
	    							qo.returnEntity(player).remove();
	    							qo.remove(player);
	    							
	    							player.sendMessage(ChatColor.GOLD + "[System] 윤 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 핀의 공격으로 최대체력이 1만큼 감소합니다.");
	    							damageMaxHealth(player, 1);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    						}
	    					} else if (getQuestName(player).equals("q0011") && block.getType() == Material.CHEST && block.getX() == -1216 && block.getY() == 67 && block.getZ() == 1298) {
	    						int persent = 30;
	    						if(world.getTime() >= 21000 && world.getTime() <= 23000) {
	    							persent += 10;
	    						}
	    						persent += (9 - new PlayerGrade().returnGrade(player)) * 5;
	    						
	    						try {
	    							ItemStack item = player.getInventory().getItem(7);
	    							String name = item.getItemMeta().getDisplayName();
	    							persent += Integer.parseInt(name.substring(name.length()-1, name.length())) * 5;
	    						} catch(Exception e2) {
	    							
	    						}
	    						
	    						if(rnd.nextInt(100) < persent) {
	    							int qNum = qb.getNum(player);
		    						qb.q0011(player, qNum + 1);
		    						player.sendMessage(ChatColor.GOLD + "[System] 가로등 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							QuestOwner qo = new QuestOwner();
	    							qo.returnEntity(player).remove();
	    							qo.remove(player);
	    							
	    							player.sendMessage(ChatColor.GOLD + "[System] 가로등 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 산의 공격으로 최대체력이 1만큼 감소합니다.");
	    							damageMaxHealth(player, 1);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    						}
	    					} else if (getQuestName(player).equals("q0012") && block.getType() == Material.CHEST && block.getX() == -1032 && block.getY() == 67 && block.getZ() == 1223) {
	    						int persent = 10;
	    						if(world.getTime() >= 21000 && world.getTime() <= 23000) {
	    							persent += 10;
	    						}
	    						persent += (9 - new PlayerGrade().returnGrade(player)) * 8;
	    						
	    						try {
	    							ItemStack item = player.getInventory().getItem(7);
	    							String name = item.getItemMeta().getDisplayName();
	    							persent += Integer.parseInt(name.substring(name.length()-1, name.length())) * 5;
	    						} catch(Exception e2) {
	    							
	    						}
	    						
	    						if(rnd.nextInt(100) < persent) {
	    							int qNum = qb.getNum(player);
		    						qb.q0012(player, qNum + 1);
		    						player.sendMessage(ChatColor.GOLD + "[System] 어금니 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							QuestOwner qo = new QuestOwner();
	    							qo.returnEntity(player).remove();
	    							qo.remove(player);
	    							
	    							player.sendMessage(ChatColor.GOLD + "[System] 어금니 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 올가의 술병이 머리에 떨어져 최대체력이 1만큼 감소합니다.");
	    							damageMaxHealth(player, 1);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    						}
	    					} else if (getQuestName(player).equals("q0013") && block.getType() == Material.CHEST && block.getX() == -1105 && block.getY() == 186 && block.getZ() == 1467) {
	    						int persent = -50;
	    						if(world.getTime() >= 21000 && world.getTime() <= 23000) {
	    							persent += 30;
	    						}
	    						persent += (9 - new PlayerGrade().returnGrade(player)) * 10;
	    						
	    						try {
	    							ItemStack item = player.getInventory().getItem(7);
	    							String name = item.getItemMeta().getDisplayName();
	    							persent += Integer.parseInt(name.substring(name.length()-1, name.length())) * 5;
	    						} catch(Exception e2) {
	    							
	    						}
	    						
	    						if(rnd.nextInt(100) < persent) {
	    							int qNum = qb.getNum(player);
		    						qb.q0013(player, qNum + 1);
		    						player.sendMessage(ChatColor.GOLD + "[System] 하나 협회 3과의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							QuestOwner qo = new QuestOwner();
	    							qo.returnEntity(player).remove();
	    							qo.remove(player);
	    							
	    							player.sendMessage(ChatColor.GOLD + "[System] 하나 협회 3과의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 올리비에의 괘각으로 최대체력이 3만큼 감소합니다.");
	    							damageMaxHealth(player, 3);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    						}
	    					}
	    				}
	    			} catch(Exception ex) {
	    				
	    			}
	    		}
	        }
		} catch(Exception e) {
			
		}
		
		//기타
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {	 
	        	//상자 이벤트&루트 체스트
	    		Player player = event.getPlayer();
	    		if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	    			Block block = event.getClickedBlock();
	    			
	    			if(block.getType() == Material.CHEST && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.TRAPPED_CHEST && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CRAFTING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FURNACE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MINECART && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.JUKEBOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CHIPPED_ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DAMAGED_ANVIL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLACK_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLUE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BROWN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CYAN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRAY_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GREEN_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_BLUE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_GRAY_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIME_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MAGENTA_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ORANGE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PINK_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PURPLE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.RED_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.WHITE_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.YELLOW_SHULKER_BOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LOOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.COMPOSTER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BARREL && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SMOKER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLAST_FURNACE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CARTOGRAPHY_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FLETCHING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRINDSTONE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.SMITHING_TABLE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.STONECUTTER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.HOPPER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.HOPPER_MINECART && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DROPPER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.OBSERVER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLACK_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BLUE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BROWN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CYAN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GRAY_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.GREEN_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_BLUE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIGHT_GRAY_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.LIME_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.MAGENTA_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ORANGE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PINK_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.PURPLE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.RED_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.WHITE_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.YELLOW_BED && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.BREWING_STAND && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.DISPENSER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.JUKEBOX && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.FLOWER_POT && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ACACIA_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ALLIUM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_AZURE_BLUET && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BAMBOO && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BIRCH_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BLUE_ORCHID && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_BROWN_MUSHROOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CACTUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CORNFLOWER && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CRIMSON_FUNGUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_CRIMSON_ROOTS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DANDELION && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DARK_OAK_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_DEAD_BUSH && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_FERN && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_JUNGLE_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_LILY_OF_THE_VALLEY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_OAK_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_ORANGE_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_OXEYE_DAISY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_PINK_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_POPPY && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_RED_MUSHROOM && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_RED_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_SPRUCE_SAPLING && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WARPED_FUNGUS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WARPED_ROOTS && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WHITE_TULIP && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.POTTED_WITHER_ROSE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.CAKE && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ARMOR_STAND && event.getPlayer().isOp() == false) {
	    				event.setCancelled(true);
	    			}
	    			if(block.getType() == Material.ENCHANTING_TABLE) {
	    				event.setCancelled(true);
	    			}
	    		}
	    		
	    		//취소 이벤드
	    		try {
	    			if(event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
	        			if(player.getInventory().getItemInMainHand().getType() == Material.SNOWBALL) {
	        				event.setCancelled(true);
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.LINGERING_POTION) {
	        				event.setCancelled(true);
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.ENDER_EYE) {
	        				event.setCancelled(true);
	        			}
	        		}
	    		} catch(Exception e1) {
	    			
	    		}
	        } 	 
		} catch(Exception e) {
			
		}
		//밭 보호 이벤트
		try { 
			if(event.getAction()==Action.PHYSICAL && event.getClickedBlock().getType() == Material.FARMLAND) {
				event.setCancelled(true);
			}
		} catch(Exception e) {
					
		}
		//발판 이벤트
		try {
			if (event.getAction() == Action.PHYSICAL) {
				new PlateEvent().effect(event.getPlayer(), event.getClickedBlock());
			}
		} catch (Exception e) {

		}
	}
	
	@EventHandler
	public void animationEvent(PlayerAnimationEvent event) {
		//퀘스트
		try {					        
			Player player = event.getPlayer();
			Block block = player.getTargetBlockExact(5);
			if(player.getGameMode() == GameMode.ADVENTURE && player.isOp() == false) {
				Location loc = block.getLocation();
				int i = 0;
				Inventory inv = player.getInventory();
				for (int j = 0 ; j < 36 ; j++) {
					if(inv.getItem(j) == null) {
						i++;
					}
				}
				if (loc.getX() == -1492 && loc.getY() == 65 && loc.getZ() == 2035) {
					QuestBoard qb = new QuestBoard();
					if (qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===전설의 시작===")) {
						if (i != 0) {
							int qNum = qb.getNum(player);
							//qb.q1(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
						}

					}
				}
			}
		} catch(Exception e) {
			
		}	
		
		//L스킬
		try {
			Player player = event.getPlayer();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(event.getAnimationType() == PlayerAnimationType.ARM_SWING && player.getVehicle() == null) {	    
				if((item.getType() == Material.WOODEN_SWORD || item.getType() == Material.STONE_SWORD || item.getType() == Material.IRON_SWORD
						|| item.getType() == Material.GOLDEN_SWORD || item.getType() == Material.DIAMOND_SWORD || item.getType() == Material.NETHERITE_SWORD
						|| item.getType() == Material.OAK_LEAVES || item.getType() == Material.SPRUCE_LEAVES || item.getType() == Material.BIRCH_LEAVES
						|| item.getType() == Material.JUNGLE_LEAVES || item.getType() == Material.ACACIA_LEAVES || item.getType() == Material.DARK_OAK_LEAVES
						|| item.getType() == Material.COBBLESTONE_WALL || item.getType() == Material.BROWN_CARPET
						|| item.getType() == Material.GREEN_CARPET || item.getType() == Material.BLACK_CARPET || item.getType() == Material.STONE
						|| item.getType() == Material.OAK_PLANKS || item.getType() == Material.SPRUCE_PLANKS || item.getType() == Material.BIRCH_PLANKS
						|| item.getType() == Material.JUNGLE_PLANKS || item.getType() == Material.ACACIA_PLANKS || item.getType() == Material.DARK_OAK_PLANKS
						|| item.getType() == Material.BEDROCK || item.getType() == Material.SPRUCE_LOG || item.getType() == Material.BIRCH_LOG
						|| item.getType() == Material.JUNGLE_LOG || item.getType() == Material.ACACIA_LOG || item.getType() == Material.DARK_OAK_LOG
						|| item.getType() == Material.SANDSTONE || item.getType() == Material.CHISELED_SANDSTONE || item.getType() == Material.CUT_SANDSTONE
						|| item.getType() == Material.LAPIS_BLOCK || item.getType() == Material.MAGENTA_WOOL || item.getType() == Material.LIME_WOOL
						|| item.getType() == Material.GRAY_WOOL || item.getType() == Material.LIGHT_GRAY_WOOL || item.getType() == Material.CYAN_WOOL
						|| item.getType() == Material.PURPLE_WOOL || item.getType() == Material.OAK_SLAB || item.getType() == Material.SPRUCE_SLAB
						|| item.getType() == Material.BIRCH_SLAB || item.getType() == Material.JUNGLE_SLAB || item.getType() == Material.ACACIA_SLAB
						|| item.getType() == Material.DARK_OAK_SLAB || item.getType() == Material.STONE_SLAB || item.getType() == Material.COBBLESTONE_SLAB 
						|| item.getType() == Material.STONE_BRICK_SLAB || item.getType() == Material.NETHER_BRICK_SLAB || item.getType() == Material.QUARTZ_SLAB
						|| item.getType() == Material.RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_SLAB || item.getType() == Material.SMOOTH_RED_SANDSTONE
						|| item.getType() == Material.OBSIDIAN || item.getType() == Material.SMOOTH_SANDSTONE || item.getType() == Material.CHISELED_RED_SANDSTONE
						|| item.getType() == Material.CUT_RED_SANDSTONE || item.getType() == Material.RED_SANDSTONE_STAIRS || item.getType() == Material.STONE_STAIRS
						
						|| item.getType() == Material.MUSIC_DISC_11 || item.getType() == Material.MUSIC_DISC_13 || item.getType() == Material.MUSIC_DISC_BLOCKS 
						|| item.getType() == Material.MUSIC_DISC_CAT || item.getType() == Material.MUSIC_DISC_CHIRP || item.getType() == Material.MUSIC_DISC_FAR 
						|| item.getType() == Material.MUSIC_DISC_MALL || item.getType() == Material.MUSIC_DISC_MELLOHI || item.getType() == Material.MUSIC_DISC_PIGSTEP 
						|| item.getType() == Material.MUSIC_DISC_STAL || item.getType() == Material.MUSIC_DISC_STRAD || item.getType() == Material.MUSIC_DISC_WAIT 
						|| item.getType() == Material.MUSIC_DISC_WARD)) {
					new Skill().effect(player, "L");
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void blockBreakEvent(BlockBreakEvent event) {
		Player player = event.getPlayer();
		if(event.getBlock().getType() == Material.CHAIN_COMMAND_BLOCK) {
			event.setCancelled(true);
		}
		if(event.getBlock().getType() == Material.COMMAND_BLOCK) {
			event.setCancelled(true);
		}
		if(event.getBlock().getType() == Material.REPEATING_COMMAND_BLOCK) {
			event.setCancelled(true);
		}	
		if(event.getBlock().getType() == Material.ARMOR_STAND) {
			event.setCancelled(true);
		}
		if(player.isOp() == false) {
			event.setCancelled(true);
		}
		
		Location loc = player.getLocation();
		if (loc.getX() <= -1131 && loc.getY() <= 175 && loc.getZ() <= 1479 && 
				loc.getX() >= -1154 && loc.getY() >= 160 && loc.getZ() >= 1460) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void interactEvent(PlayerInteractEntityEvent event) {
		EquipmentSlot e = event.getHand();
		if(e.equals(EquipmentSlot.HAND)) {
			Player player = (Player) event.getPlayer();
			// 못건들여
			if(event.getRightClicked().getType() == EntityType.ITEM_FRAME && player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
				return;
			}
			// 말 못타
			if(event.getRightClicked().getType() == EntityType.HORSE) {
				event.setCancelled(true);
			}
			// 라마 못타
			if(event.getRightClicked().getType() == EntityType.LLAMA) {
				event.setCancelled(true);
			}
			// 빌리저 대화
			if(event.getRightClicked().getType() == EntityType.VILLAGER || event.getRightClicked().getType() == EntityType.ARMOR_STAND) {
				InteractVillager iv = new InteractVillager();
				if(iv.interactVillager(player, event.getRightClicked()) == true) {
					event.setCancelled(true);
				}
			}
			
			try {
				//퀘스트 엔티티 접촉
				QuestOwner qo = new QuestOwner();
				if (event.getRightClicked() == qo.returnEntity(player)) {
					QuestBoard qb = new QuestBoard();
					
					if (getQuestName(player).equals("q0001")) {
						int qNum = qb.getNum(player);
						qb.q0001(player, qNum + 1);
					} else if (getQuestName(player).equals("q0002")) {
						int qNum = qb.getNum(player);
						qb.q0002(player, qNum + 1);
					} else if (getQuestName(player).equals("q0003")) {
						int qNum = qb.getNum(player);
						qb.q0003(player, qNum + 1);
					} else if (getQuestName(player).equals("q0007")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 9급 해결사");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(30);
						entity.setHealth(30);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.DARK_OAK_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(0);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(0,0,0));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(0,0,0));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(0,0,0));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
					} else if (getQuestName(player).equals("q0008")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 8급 해결사");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(50);
						entity.setHealth(50);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.JUNGLE_PLANKS);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(1);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
					} else if (getQuestName(player).equals("q0009")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "이름없는 7급 해결사");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(70);
						entity.setHealth(70);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.BIRCH_LOG);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(2);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
					} else if (getQuestName(player).equals("q0015")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "갈고리 사무소 해결사");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(20);
						entity.setHealth(20);
						EntityEquipment weapon = entity.getEquipment();
						ItemStack weaponItem = new ItemStack(Material.OAK_LEAVES);
						weapon.setItemInMainHand(weaponItem);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(3);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
					} else if (getQuestName(player).equals("q0019")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
						entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원");
						entity.setCustomNameVisible(true);
						entity.setPersistent(true);
						entity.setRemoveWhenFarAway(false);
						entity.setMaxHealth(80);
						entity.setHealth(80);
						EntityEquipment head = entity.getEquipment();
						ItemStack headItem = chest.getInventory().getItem(4);
						head.setHelmet(headItem);
						EntityEquipment chestplate = entity.getEquipment();
						ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
						LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
						chestmeta.setColor(Color.fromRGB(84,75,75));
						chestplateItem.setItemMeta(chestmeta);
						chestplate.setChestplate(chestplateItem);
						EntityEquipment leggings = entity.getEquipment();
						ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
						LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
						leggingsmeta.setColor(Color.fromRGB(84,75,75));
						leggingsItem.setItemMeta(leggingsmeta);
						leggings.setLeggings(leggingsItem);
						EntityEquipment boots = entity.getEquipment();
						ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
						LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
						bootsmeta.setColor(Color.fromRGB(84,75,75));
						bootsItem.setItemMeta(bootsmeta);
						boots.setBoots(bootsItem);
						entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1, false, false));
					}
				}
			} catch(Exception ex) {
				
			}
		}
	}
	
	@EventHandler
	public void feedEvent(PlayerInteractAtEntityEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void clickInv(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		
		if(event.getClick() == ClickType.SWAP_OFFHAND) {
			event.setCancelled(true);
			return;
		}

		if(event.getClick() != ClickType.MIDDLE) {
			// 핫키 제한
			try {
				if(event.getHotbarButton() != -1) {
					event.setCancelled(true);
					return;
				}
			} catch(Exception e) {
				
			}
			
			//상점
			try {
				if(event.getClickedInventory().getSize() == 36 && event.getClickedInventory().getType() == InventoryType.CHEST) {
					Location loc = player.getLocation();
					
					//로비-광기 상인
					if (loc.getX() <= -1820 && loc.getY() <= 100 && loc.getZ() <= 3069 
							&& loc.getX() >= -1885 && loc.getY() >= 0 && loc.getZ() >= 2996) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop1().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop1().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop1().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop1().item4());
		        			} else if(event.getSlot() == 4) {
		        				player.getInventory().addItem(new Shop1().item5());
		        			} else if(event.getSlot() == 5) {
		        				player.getInventory().addItem(new Shop1().item6());
		        			} else if(event.getSlot() == 6) {
		        				player.getInventory().addItem(new Shop1().item7());
		        			} else if(event.getSlot() == 7) {
		        				player.getInventory().addItem(new Shop1().item8());
		        			} else if(event.getSlot() == 8) {
		        				player.getInventory().addItem(new Shop1().item9());
		        			} else if(event.getSlot() == 9) {
		        				player.getInventory().addItem(new Shop1().item10());
		        			} else if(event.getSlot() == 10) {
		        				player.getInventory().addItem(new Shop1().item11());
		        			} else if(event.getSlot() == 11) {
		        				player.getInventory().addItem(new Shop1().item12());
		        			} else if(event.getSlot() == 12) {
		        				player.getInventory().addItem(new Shop1().item13());
		        			}
		        			new Message().msg(player, "나오: 당신에게 도움이 되기를..");
		        		} else {
		        			new Message().msg(player, "나오: 광기가.. 부족하시네요..");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					} 
					// 단테
					else if (loc.getX() <= -1087 && loc.getY() <= 80 && loc.getZ() <= 1193 
							&& loc.getX() >= -1095 && loc.getY() >= 60 && loc.getZ() >= 1185) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop2().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop2().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop2().item3());
		        			}
		        			new Message().msg(player, "단테: 째깍째깍!");
		        		} else {
		        			new Message().msg(player, "단테: 째깍..");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 돈키호테
					else if (loc.getX() <= -1049 && loc.getY() <= 80 && loc.getZ() <= 1194 
							&& loc.getX() >= -1057 && loc.getY() >= 60 && loc.getZ() >= 1186) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop3().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop3().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop3().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop3().item4());
		        			}
		        			new Message().msg(player, "돈키호테: 정말 고맙소!");
		        		} else {
		        			new Message().msg(player, "돈키호테: 도둑질은 정의롭지 못하오!%돈키호테: 돈이 없다면 벌어서 오시게!");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 료슈
					else if (loc.getX() <= -1051 && loc.getY() <= 80 && loc.getZ() <= 1217 
							&& loc.getX() >= -1059 && loc.getY() >= 60 && loc.getZ() >= 1209) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop4().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop4().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop4().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop4().item4());
		        			}
		        			new Message().msg(player, "료슈: 분.도.죽.말."); //분명히 도움이 될거야 죽지 말라고.
		        		} else {
		        			new Message().msg(player, "료슈: 모.분.거.새.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 비나
					else if (loc.getX() <= -1059 && loc.getY() <= 100 && loc.getZ() <= 1334 
							&& loc.getX() >= -1067 && loc.getY() >= 80 && loc.getZ() >= 1326) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop5().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop5().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop5().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop5().item4());
		        			} else if(event.getSlot() == 4) {
		        				player.getInventory().addItem(new Shop5().item5());
		        			}
		        			new Message().msg(player, "비나: 피할 수 없는 힘듦이 와도 무너짐은 없어야지.");
		        		} else {
		        			new Message().msg(player, "비나: 네가 돈이 없다면 그런 것이겠지.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 티페리트
					else if (loc.getX() <= -1067 && loc.getY() <= 100 && loc.getZ() <= 1300 
							&& loc.getX() >= -1075 && loc.getY() >= 80 && loc.getZ() >= 1292) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop6().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop6().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop6().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop6().item4());
		        			} else if(event.getSlot() == 4) {
		        				player.getInventory().addItem(new Shop6().item5());
		        			}
		        			new Message().msg(player, "티페리트: 본격적으로 시작해야 하니까 마음 굳게 먹도록 해.");
		        		} else {
		        			new Message().msg(player, "티페리트: 미안. 큰 도움을 주지는 못했네.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 호드
					else if (loc.getX() <= -1087 && loc.getY() <= 110 && loc.getZ() <= 1336
							&& loc.getX() >= -1095 && loc.getY() >= 90 && loc.getZ() >= 1328) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop7().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop7().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop7().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop7().item4());
		        			}
		        			new Message().msg(player, "호드: 우리 가게를 이용해줘서 고마워요!");
		        		} else {
		        			new Message().msg(player, "호드: 끝까지 민폐였네. 당신은, 그저…");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 벤자민
					else if (loc.getX() <= -1147 && loc.getY() <= 190 && loc.getZ() <= 1488
							&& loc.getX() >= -1155 && loc.getY() >= 170 && loc.getZ() >= 1480) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop8().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop8().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop8().item3());
		        			}
		        			new Message().msg(player, "벤자민: 삶에 묶여있는 이상… 살아야죠.");
		        		} else {
		        			new Message().msg(player, "벤자민: 이 행위에 명확한 이익이 있다고 믿습니까.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 카르멘
					else if (loc.getX() <= -1129 && loc.getY() <= 190 && loc.getZ() <= 1487
							&& loc.getX() >= -1137 && loc.getY() >= 170 && loc.getZ() >= 1479) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop9().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop9().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop9().item3());
		        			}
		        			new Message().msg(player, "카르멘: 마음의 병에서 구원받을 수 있기를.");
		        		} else {
		        			new Message().msg(player, "카르멘: 돈이 없다면 연구 실험체라도 해보지 그래?");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					// 아인
					else if (loc.getX() <= -1148 && loc.getY() <= 190 && loc.getZ() <= 1471
							&& loc.getX() >= -1156 && loc.getY() >= 170 && loc.getZ() >= 1463) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop10().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop10().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop10().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop10().item4());
		        			}
		        			new Message().msg(player, "아인: 이 순간까지 도달한 너라면 이겨낼 수 있을 거야.");
		        		} else {
		        			new Message().msg(player, "아인: 충분한 가치는 있으니 도둑질은 잠시 참아줘.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					event.setCancelled(true);
			        return;
	        	}
			} catch(Exception e) {
				
			}

			// 못건드리는 템
			try {
				ItemStack clicked = event.getCurrentItem();
		        if(clicked != null && clicked.getType() == Material.ACACIA_DOOR) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.MAGMA_CREAM) {
		            event.setCancelled(true);
		            return;
		        }  
		        if(clicked != null && clicked.getType() == Material.SHULKER_SHELL) {
		            event.setCancelled(true);
		            return;
		        }  
		        if(clicked != null && clicked.getType() == Material.SLIME_BALL) {
		        	if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "GAME START")) {
		        		if(player.getInventory().getItem(0) != null) {
		        			if(player.getInventory().getItem(0).getItemMeta() != null) {
		        				new Start(player, getDataFolder());
			        		}
		        		}
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.FLOWER_BANNER_PATTERN) {
		        	ThreadInv t = new ThreadInv(player.getUniqueId());
		    		sleep = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
		    			int time = 0;
		    			
		    			@Override
		    			public void run() {
		    				if (!t.hasID()) {
		    					t.setID(sleep);
		    				}
		    			
		    				if(time>=5) {
		    					if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GREEN + "보급 등급의 인격")) {
		    		        		new SelectPersonality(player, 0, getDataFolder());
		    		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.AQUA + "고급 등급의 인격")) {
		    		        		new SelectPersonality(player, 1, getDataFolder());
		    		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "한정 등급의 인격")) {
		    		        		new SelectPersonality(player, 2, getDataFolder());
		    		        	} else if(clicked.getItemMeta().getDisplayName().equals(ChatColor.GOLD + "예술 등급의 인격")) {
		    		        		new SelectPersonality(player, 3, getDataFolder());
		    		        	}  
		    					t.endTask(); 
		    					t.removeID();
		    				} 
		    				
		    				time++;
		    			}						
		    			
		    		}, 0, 1);
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.NETHER_STAR) {
		        	if(event.getClickedInventory().getSize() == 54 && event.getClickedInventory().getType() == InventoryType.CHEST) {
		        		if(player.getInventory().getItem(0) != null && player.getInventory().getItem(0).getType() != Material.NETHER_STAR) {
		        			ItemStack item = player.getInventory().getItem(0);
		        			player.getInventory().setItem(0, clicked);
		        			player.getInventory().addItem(item);
		        		} else {
		        			player.getInventory().setItem(0, clicked);
		        		}
		        		player.playSound(player, Sound.BLOCK_NOTE_BLOCK_PLING, 4.0f, 1.89f);
		        		player.closeInventory();
		        	}
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null) {
		        	if((clicked.getType() == Material.WOODEN_SWORD || clicked.getType() == Material.STONE_SWORD || clicked.getType() == Material.IRON_SWORD
							|| clicked.getType() == Material.GOLDEN_SWORD || clicked.getType() == Material.DIAMOND_SWORD || clicked.getType() == Material.NETHERITE_SWORD
							|| clicked.getType() == Material.OAK_LEAVES || clicked.getType() == Material.SPRUCE_LEAVES || clicked.getType() == Material.BIRCH_LEAVES
							|| clicked.getType() == Material.JUNGLE_LEAVES || clicked.getType() == Material.ACACIA_LEAVES || clicked.getType() == Material.DARK_OAK_LEAVES
							|| clicked.getType() == Material.COBBLESTONE_WALL || clicked.getType() == Material.BROWN_CARPET
							|| clicked.getType() == Material.GREEN_CARPET || clicked.getType() == Material.BLACK_CARPET || clicked.getType() == Material.STONE
							|| clicked.getType() == Material.OAK_PLANKS || clicked.getType() == Material.SPRUCE_PLANKS || clicked.getType() == Material.BIRCH_PLANKS
							|| clicked.getType() == Material.JUNGLE_PLANKS || clicked.getType() == Material.ACACIA_PLANKS || clicked.getType() == Material.DARK_OAK_PLANKS
							|| clicked.getType() == Material.BEDROCK || clicked.getType() == Material.SPRUCE_LOG || clicked.getType() == Material.BIRCH_LOG
							|| clicked.getType() == Material.JUNGLE_LOG || clicked.getType() == Material.ACACIA_LOG || clicked.getType() == Material.DARK_OAK_LOG
							|| clicked.getType() == Material.SANDSTONE || clicked.getType() == Material.CHISELED_SANDSTONE || clicked.getType() == Material.CUT_SANDSTONE
							|| clicked.getType() == Material.LAPIS_BLOCK || clicked.getType() == Material.MAGENTA_WOOL || clicked.getType() == Material.LIME_WOOL
							|| clicked.getType() == Material.GRAY_WOOL || clicked.getType() == Material.LIGHT_GRAY_WOOL || clicked.getType() == Material.CYAN_WOOL
							|| clicked.getType() == Material.PURPLE_WOOL || clicked.getType() == Material.OAK_SLAB || clicked.getType() == Material.SPRUCE_SLAB
							|| clicked.getType() == Material.BIRCH_SLAB || clicked.getType() == Material.JUNGLE_SLAB || clicked.getType() == Material.ACACIA_SLAB
							|| clicked.getType() == Material.DARK_OAK_SLAB || clicked.getType() == Material.STONE_SLAB || clicked.getType() == Material.COBBLESTONE_SLAB 
							|| clicked.getType() == Material.STONE_BRICK_SLAB || clicked.getType() == Material.NETHER_BRICK_SLAB || clicked.getType() == Material.QUARTZ_SLAB
							|| clicked.getType() == Material.RED_SANDSTONE || clicked.getType() == Material.RED_SANDSTONE_SLAB || clicked.getType() == Material.SMOOTH_RED_SANDSTONE
							|| clicked.getType() == Material.OBSIDIAN || clicked.getType() == Material.SMOOTH_SANDSTONE || clicked.getType() == Material.CHISELED_RED_SANDSTONE
							|| clicked.getType() == Material.CUT_RED_SANDSTONE || clicked.getType() == Material.RED_SANDSTONE_STAIRS || clicked.getType() == Material.STONE_STAIRS
							
							|| clicked.getType() == Material.MUSIC_DISC_11 || clicked.getType() == Material.MUSIC_DISC_13 || clicked.getType() == Material.MUSIC_DISC_BLOCKS 
							|| clicked.getType() == Material.MUSIC_DISC_CAT || clicked.getType() == Material.MUSIC_DISC_CHIRP || clicked.getType() == Material.MUSIC_DISC_FAR 
							|| clicked.getType() == Material.MUSIC_DISC_MALL || clicked.getType() == Material.MUSIC_DISC_MELLOHI || clicked.getType() == Material.MUSIC_DISC_PIGSTEP 
							|| clicked.getType() == Material.MUSIC_DISC_STAL || clicked.getType() == Material.MUSIC_DISC_STRAD || clicked.getType() == Material.MUSIC_DISC_WAIT 
							|| clicked.getType() == Material.MUSIC_DISC_WARD)) {
		        		event.setCancelled(true);
			            return;
    				}
		        }
			} catch(Exception e) {
				
			}
		}
    }
	
	@EventHandler
	public void placeBlockEvent(BlockPlaceEvent event) {
		Player player = (Player) event.getPlayer();
		if(player.getGameMode()==GameMode.SURVIVAL || player.isOp() == false) {
			event.setCancelled(true);
		}
		if(player.getGameMode()==GameMode.CREATIVE && player.isOp()) {
			if(!event.canBuild()) {
				event.setBuild(true);
			}
		}
	}
	
	@EventHandler
	public void offPlayer(PlayerQuitEvent event) {
		Player player = event.getPlayer();
		
		//퀘스트 저장
		try {
			File dataFolder = getDataFolder();
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e) {
            		    e.getStackTrace();
            		}
				}
				//퀘스트
				File file = new File(dir, "quest.dat");
				if (file.exists()) {
					try {
						BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
						if(getQuestName(player) != null) {
							QuestBoard qb = new QuestBoard();
							int number = qb.getNum(player);
							fw.write(getQuestName(player));
							fw.write("\n");
							fw.write(Integer.toString(number));
						} else {
							fw.write("null");
						}
		                fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			
		}
		
		//퀘스트 엔티티 제거
		try {
			QuestOwner qo = new QuestOwner();
			if(qo.returnEntity(player) != null) {
				qo.returnEntity(player).remove();
				qo.remove(player);
			}
		} catch(Exception e) {
			
		}
		
		//adventure
		player.setGameMode(GameMode.ADVENTURE);
		
		// Ban
		if ((player.getUniqueId().toString().equalsIgnoreCase(" "))) {
			event.setQuitMessage(null);
			return;
		}
		
		// Message
		if (player.getDisplayName().equalsIgnoreCase("yumehama")) {
			event.setQuitMessage(ChatColor.DARK_RED + "관리자가 떠납니다.");
		} else if (player.getDisplayName().equalsIgnoreCase("WoolRing")) {
			event.setQuitMessage(ChatColor.RED + "WoolRing가 떠납니다.");
		} else if (player.getDisplayName().equalsIgnoreCase("NN_Tapejara")) {
			event.setQuitMessage(ChatColor.RED + "NN_Tapejara가 떠납니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("why9196")) {
			event.setQuitMessage(ChatColor.RED + "why9196가 떠납니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Akilae3102")) {
			event.setQuitMessage(ChatColor.RED + "Akilae3102가 떠납니다.");
		} else if(player.getDisplayName().equalsIgnoreCase("Espina_ID")) {
			event.setQuitMessage(ChatColor.RED + "Espina_ID가 떠납니다.");
		} else {
			event.setQuitMessage("야생의 누군가가 도망쳐버렸다.");
		}
		
		// Refresh Server
		int num = 0;
		for (Player allPlayer : Bukkit.getOnlinePlayers()) {
			num++;
		}
		if(num==1) {
			for(Entity ent : player.getWorld().getEntities()){
				try {
					if(ent.getType() == EntityType.ZOMBIE) {
						ent.remove();
					}
					if(ent.getType() == EntityType.SKELETON) {
						ent.remove();
					}
					if(ent.getType() == EntityType.DROWNED) {
						ent.remove();
					}
					if(ent.getType() == EntityType.HUSK) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ZOMBIE_VILLAGER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ENDERMAN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.SILVERFISH) {
						ent.remove();
					}
					if(ent.getType() == EntityType.STRAY) {
						ent.remove();
					}
					if(ent.getType() == EntityType.RAVAGER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.WITHER_SKELETON) {
						ent.remove();
					}
					if(ent.getType() == EntityType.WITCH) {
						ent.remove();
					}
					if(ent.getType() == EntityType.CAVE_SPIDER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.SPIDER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.MAGMA_CUBE) {
						ent.remove();
					}
					if(ent.getType() == EntityType.SLIME) {
						ent.remove();
					}
					if(ent.getType() == EntityType.HUSK) {
						ent.remove();
					}
					if(ent.getType() == EntityType.EVOKER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ENDERMITE) {
						ent.remove();
					}
					if(ent.getType() == EntityType.GUARDIAN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ELDER_GUARDIAN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.GHAST) {
						ent.remove();
					}
					if(ent.getType() == EntityType.PHANTOM) {
						ent.remove();
					}
					if(ent.getType() == EntityType.VINDICATOR) {
						ent.remove();
					}
					if(ent.getType() == EntityType.IRON_GOLEM) {
						ent.remove();
					}
					if(ent.getType() == EntityType.BLAZE) {
						ent.remove();
					}
					if(ent.getType() == EntityType.WITHER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.POLAR_BEAR) {
						ent.remove();
					}
					if(ent.getType() == EntityType.PIGLIN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ZOGLIN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ZOMBIFIED_PIGLIN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.LLAMA) {
						ent.remove();
					}
					if(ent.getType() == EntityType.CREEPER) {
						ent.remove();
					}
					if(ent.getType() == EntityType.RABBIT) {
						ent.remove();
					}
					if(ent.getType() == EntityType.PANDA) {
						ent.remove();
					}
					if(ent.getType() == EntityType.OCELOT) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ZOGLIN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.HORSE) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ARMOR_STAND) {
						ArmorStand as = (ArmorStand) ent;
						if(as.getHelmet().getType() == Material.ANDESITE_STAIRS) {
							ent.remove();
						} else if(as.getHelmet().getType() == Material.RED_NETHER_BRICK_STAIRS) {
							ent.remove();
						} else if(as.getHelmet().getType() == Material.POLISHED_ANDESITE_STAIRS) {
							ent.remove();
						} else if(as.getItemInHand().getType() == Material.POLISHED_BLACKSTONE_SLAB) {
							ent.remove();
						} else if(as.getItemInHand().getType() == Material.GREEN_CARPET) {
							ent.remove();
						}
					}
					if(ent.getType() == EntityType.DROPPED_ITEM) {
						ent.remove();
					}
					if(ent.getType() == EntityType.FIREBALL) {
						ent.remove();
					}
					if(ent.getType() == EntityType.SMALL_FIREBALL) {
						ent.remove();
					}
				} catch(Exception e) {
					
				}
			}
		}	
		
		//파티클 제거
		try {
			ParticleData pd = new ParticleData(player.getUniqueId());
			if(pd.hasID()) {
				pd.endTask();
				pd.removeID();
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void entityChangeBlockEvent(EntityChangeBlockEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void blockPhysicsEvent(BlockPhysicsEvent event) {
		Material mat = event.getBlock().getType();
		if(mat == Material.ACACIA_BUTTON || mat == Material.BIRCH_BUTTON || mat == Material.CRIMSON_BUTTON || mat == Material.DARK_OAK_BUTTON
				|| mat == Material.JUNGLE_BUTTON || mat == Material.OAK_BUTTON || mat == Material.POLISHED_BLACKSTONE_BUTTON || mat == Material.SPRUCE_BUTTON
				|| mat == Material.STONE_BUTTON || mat == Material.WARPED_BUTTON || mat == Material.ACACIA_PRESSURE_PLATE || mat == Material.BIRCH_PRESSURE_PLATE
				|| mat == Material.CRIMSON_PRESSURE_PLATE || mat == Material.DARK_OAK_PRESSURE_PLATE || mat == Material.HEAVY_WEIGHTED_PRESSURE_PLATE || mat == Material.JUNGLE_PRESSURE_PLATE
				|| mat == Material.LIGHT_WEIGHTED_PRESSURE_PLATE || mat == Material.OAK_PRESSURE_PLATE || mat == Material.POLISHED_BLACKSTONE_PRESSURE_PLATE || mat == Material.SPRUCE_PRESSURE_PLATE
				|| mat == Material.STONE_PRESSURE_PLATE || mat == Material.WARPED_PRESSURE_PLATE || mat == Material.ACACIA_DOOR || mat == Material.BIRCH_DOOR
				|| mat == Material.CRIMSON_DOOR || mat == Material.DARK_OAK_DOOR || mat == Material.IRON_DOOR || mat == Material.JUNGLE_DOOR
				|| mat == Material.OAK_DOOR || mat == Material.SPRUCE_DOOR || mat == Material.WARPED_DOOR || mat == Material.REPEATER
				|| mat == Material.TRIPWIRE_HOOK || mat == Material.TRIPWIRE || mat == Material.STRING || mat == Material.REDSTONE
				|| mat == Material.REDSTONE_WIRE || mat == Material.COMMAND_BLOCK || mat == Material.CHAIN_COMMAND_BLOCK || mat == Material.REPEATING_COMMAND_BLOCK
				|| mat == Material.ACACIA_STAIRS || mat == Material.ANDESITE_STAIRS || mat == Material.BIRCH_STAIRS || mat == Material.BLACKSTONE_STAIRS
				|| mat == Material.BRICK_STAIRS || mat == Material.COBBLESTONE_STAIRS || mat == Material.CRIMSON_STAIRS || mat == Material.DARK_OAK_STAIRS
				|| mat == Material.DARK_PRISMARINE_STAIRS || mat == Material.DIORITE_STAIRS || mat == Material.END_STONE_BRICK_STAIRS || mat == Material.GRANITE_STAIRS
				|| mat == Material.JUNGLE_STAIRS || mat == Material.MOSSY_COBBLESTONE_STAIRS || mat == Material.MOSSY_STONE_BRICK_STAIRS || mat == Material.NETHER_BRICK_STAIRS
				|| mat == Material.OAK_STAIRS || mat == Material.POLISHED_ANDESITE_STAIRS || mat == Material.POLISHED_BLACKSTONE_BRICK_STAIRS || mat == Material.POLISHED_BLACKSTONE_STAIRS
				|| mat == Material.POLISHED_DIORITE_STAIRS || mat == Material.POLISHED_GRANITE_STAIRS || mat == Material.PRISMARINE_BRICK_STAIRS || mat == Material.PRISMARINE_STAIRS
				|| mat == Material.PURPUR_STAIRS || mat == Material.QUARTZ_STAIRS || mat == Material.RED_NETHER_BRICK_STAIRS || mat == Material.RED_SANDSTONE_STAIRS
				|| mat == Material.SANDSTONE_STAIRS || mat == Material.SMOOTH_QUARTZ_STAIRS || mat == Material.SMOOTH_RED_SANDSTONE_STAIRS || mat == Material.SMOOTH_SANDSTONE_STAIRS
				|| mat == Material.SPRUCE_STAIRS || mat == Material.STONE_BRICK_STAIRS || mat == Material.STONE_STAIRS || mat == Material.WARPED_STAIRS
				|| mat == Material.ACACIA_FENCE || mat == Material.BIRCH_FENCE || mat == Material.CRIMSON_FENCE || mat == Material.DARK_OAK_FENCE
				|| mat == Material.JUNGLE_FENCE || mat == Material.NETHER_BRICK_FENCE || mat == Material.OAK_FENCE || mat == Material.SPRUCE_FENCE
				|| mat == Material.WARPED_FENCE || mat == Material.BLACK_STAINED_GLASS_PANE || mat == Material.BLUE_STAINED_GLASS_PANE || mat == Material.BROWN_STAINED_GLASS_PANE
				|| mat == Material.CYAN_STAINED_GLASS_PANE || mat == Material.GLASS_PANE || mat == Material.GRAY_STAINED_GLASS_PANE || mat == Material.GREEN_STAINED_GLASS_PANE
				|| mat == Material.LIGHT_BLUE_STAINED_GLASS_PANE || mat == Material.LIGHT_GRAY_STAINED_GLASS_PANE || mat == Material.LIME_STAINED_GLASS_PANE || mat == Material.MAGENTA_STAINED_GLASS_PANE
				|| mat == Material.ORANGE_STAINED_GLASS_PANE || mat == Material.PINK_STAINED_GLASS_PANE || mat == Material.PURPLE_STAINED_GLASS_PANE || mat == Material.RED_STAINED_GLASS_PANE
				|| mat == Material.WHITE_STAINED_GLASS_PANE || mat == Material.YELLOW_STAINED_GLASS_PANE || mat == Material.ANDESITE_WALL || mat == Material.BLACKSTONE_WALL
				|| mat == Material.BRICK_WALL || mat == Material.COBBLESTONE_WALL || mat == Material.DIORITE_WALL || mat == Material.END_STONE_BRICK_WALL
				|| mat == Material.GRANITE_WALL || mat == Material.MOSSY_COBBLESTONE_WALL || mat == Material.MOSSY_STONE_BRICK_WALL || mat == Material.NETHER_BRICK_WALL
				|| mat == Material.POLISHED_BLACKSTONE_BRICK_WALL || mat == Material.POLISHED_BLACKSTONE_WALL || mat == Material.PRISMARINE_WALL || mat == Material.RED_NETHER_BRICK_WALL
				|| mat == Material.RED_SANDSTONE_WALL || mat == Material.SANDSTONE_WALL || mat == Material.STONE_BRICK_WALL || mat == Material.IRON_BARS
				|| mat == Material.OBSERVER || mat == Material.BIG_DRIPLEAF || mat == Material.BIG_DRIPLEAF_STEM || mat == Material.SMALL_DRIPLEAF) {
			event.setCancelled(false);
		} else {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void waterPassEvent(BlockFromToEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void coralEvent(BlockFadeEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void arrowRemove(ProjectileHitEvent event) {
		try {
			if(event.getEntity().getShooter() instanceof Player) {
				event.setCancelled(true);
				event.getEntity().remove();
				return;
			}
		} catch(Exception e) {
			
		}
		try {
			event.getEntity().getPassenger().remove(); 
			Entity ent = event.getEntity().getPassenger();
			Item item = (Item) ent;
			if(item.getItemStack().getType() == Material.BLUE_ICE) {
				ent.getWorld().playSound(ent.getLocation(), Sound.BLOCK_GLASS_BREAK, 1.0f, 1.0f);
			} else if(item.getItemStack().getType() == Material.END_CRYSTAL) {
				ent.getWorld().playSound(ent.getLocation(), Sound.ENTITY_BLAZE_DEATH, 1.0f, 1.0f);
			}
		} catch(Exception e) {
			
		}
		event.getEntity().remove();
	}
	
	@EventHandler
	public void ExplosionCancel(EntityExplodeEvent event) {
		Entity entity = event.getEntity();
		
		if(entity instanceof Creeper) {
			for(PotionEffect effect : ((LivingEntity) entity).getActivePotionEffects ()){
				((LivingEntity) entity).removePotionEffect(effect.getType());
		    }
			event.setCancelled(true);
		}
		if(entity instanceof Fireball) {
			event.setCancelled(true);
		}
		if(event.getEntityType() == EntityType.PRIMED_TNT || event.getEntityType() == EntityType.ENDER_CRYSTAL || event.getEntityType() == EntityType.MINECART_TNT) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void fireballFireCancel(ExplosionPrimeEvent event) {
		event.setFire(false); 
		
		Entity ent = event.getEntity();
		if(ent instanceof Creeper) {
			for(PotionEffect effect : ((LivingEntity) ent).getActivePotionEffects ()){
				((LivingEntity) ent).removePotionEffect(effect.getType());
		    }
		}
		if (ent instanceof Fireball) {
			event.setRadius(2);
		}
		 
	}
	
	@EventHandler
	public void conversionEvent(EntityTransformEvent event) {
		if(event.getEntity().getType() == EntityType.ZOMBIE) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.HUSK) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.PIGLIN) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.SKELETON) {
			event.getEntity().remove();
		} else if(event.getEntity().getType() == EntityType.STRAY) {
			event.getEntity().remove();
		}
	}
	
	@EventHandler
	public void sheepColor(SheepDyeWoolEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void signColor(SignChangeEvent event) {
		if(!event.getPlayer().isOp()) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void craftEvent(CraftItemEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void throwEvent(ProjectileLaunchEvent event) {
		Entity entity = event.getEntity();
		if(entity instanceof Egg || entity instanceof EnderPearl) {
			event.setCancelled(true);
		}
		
		try {
			if(entity.getType() == EntityType.FIREBALL || entity.getType() == EntityType.SMALL_FIREBALL) {
				new BukkitRunnable() {
					int time = 0;
					@Override
					public void run() {
						time++;
						if (time >= 40) {
							entity.remove();
							this.cancel();
						}
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void onBlockChange(EntityChangeBlockEvent event) {
//		if(event.getBlock().getType() != Material.REDSTONE_ORE && event.getBlock().getType() != Material.REDSTONE && event.getBlock().getType() != Material.REDSTONE_WIRE
//				 && event.getBlock().getType() != Material.REDSTONE_BLOCK && event.getBlock().getType() != Material.REDSTONE_LAMP && event.getBlock().getType() != Material.REDSTONE_TORCH
//				 && event.getBlock().getType() != Material.REDSTONE_WALL_TORCH && event.getBlock().getType() != Material.REPEATER && event.getBlock().getType() != Material.COMPARATOR) {
//			event.setCancelled(true);
//			event.getBlock().setType(Material.AIR);
//		}
	}
	
	@EventHandler
	public void worldChange(PlayerChangedWorldEvent event) {
		Player player = event.getPlayer();
		if(!player.getWorld().getName().equalsIgnoreCase("world")) {
			player.damage(99999);
		}
	}
	
	@EventHandler
	public void slimeEvent(SlimeSplitEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void armorstandEvent(PlayerArmorStandManipulateEvent event) {
		if(event.getPlayer().getGameMode() != GameMode.CREATIVE) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void breedEvent(EntityBreedEvent event) {
		event.setCancelled(true);
		return;
	}
	
	@EventHandler
	public void consoleEvent(ServerCommandEvent event) {
		if(event.getCommand().equals("where")) {
			for (Player allPlayer : Bukkit.getOnlinePlayers()) {
				getLogger().info(allPlayer.getDisplayName() + " " + (int)(allPlayer.getLocation().getX()) + " " + (int)(allPlayer.getLocation().getY()) + " " + (int)(allPlayer.getLocation().getZ()));
			}
		} else if(event.getCommand().split(" ")[0].equals("k")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 3) {
					Player p = Bukkit.getPlayer(ary[2]);
					try {
						if(ary[1].equals("0")) {
							p.kickPlayer("서버가 재시작되면서 게임에서 나가졌습니다.");
						} else if(ary[1].equals("1")) {
							p.kickPlayer("점검 중입니다.");
						} else if(ary[1].equals("2")) {
							p.kickPlayer("매크로 사용이 감지되었습니다. 현재 1회 경고를 받은 상태이며, 자세한 사항은 디스코드 공지를 확인하시길 바랍니다.");
						}
					} catch(Exception e) {
						
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("chat")) {
			try {
				String[] args = event.getCommand().substring(5).split(" ");
				String sentance = "";
				for(String str : args) {
					if(str.length() != 0) {
						while(true) {
							if(str.contains("&")) {
								int idx = str.indexOf("&");
								str = str.substring(0, idx) + "§" + str.substring(idx+1);
							} else {
								break;
							}
						}
						sentance += str + " ";
					}
				}
				for (Player allPlayer : Bukkit.getOnlinePlayers()) {
					allPlayer.sendMessage(sentance);
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("killyou")) {
			try {
				String[] ary = event.getCommand().split(" ");
				if(ary.length == 2) {
					Player player = Bukkit.getPlayer(ary[1]);
					player.damage(9999999);
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equals("giveyou")) {
			try {
				Player owner = Bukkit.getPlayer("yumehama");
				if(owner.isOnline()) {
					ItemStack item = owner.getInventory().getItemInMainHand();
					
					String[] ary = event.getCommand().split(" ");
					if(ary.length == 2) {
						Player player = Bukkit.getPlayer(ary[1]);
						player.getInventory().addItem(item);
					}
				}
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		} else if(event.getCommand().split(" ")[0].equalsIgnoreCase("consoleExp")) {
			try {
				String[] ary = event.getCommand().split(" ");
				Player player = Bukkit.getPlayer(ary[1]);
				giveExp(player, Integer.parseInt(ary[2]));
				player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 " + ary[2] + "만큼 증가했다.");
			} catch(Exception e) {
				System.out.println(ChatColor.DARK_PURPLE + "콘솔 이벤트 오류");
			}
		}
	}
	
	@EventHandler
	public void onBlockIgnite(BlockIgniteEvent event) {
		if(!(event.getCause() == IgniteCause.FLINT_AND_STEEL)) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void blockBurnEvent(BlockBurnEvent event) {
		event.setCancelled(true);
		return;
	}
	
	@EventHandler
	public void onHangingBreak (HangingBreakEvent event) {
	    if (event.getCause() == RemoveCause.EXPLOSION) {
	        event.setCancelled(true);
	    } 
	    if (event.getCause() == RemoveCause.PHYSICS) {
	    	event.setCancelled(true);
	    }
	    if (event.getCause() == RemoveCause.OBSTRUCTION) {
	    	event.setCancelled(true);
	    }
	}
	
	@EventHandler
	public void onHangingBreakByEntity (HangingBreakByEntityEvent event) {
	    if (event.getCause() == RemoveCause.EXPLOSION) {
	        event.setCancelled(true);
	    } 
	    if (event.getCause() == RemoveCause.ENTITY) {
	    	if(!event.getRemover().isOp()) {
	    		event.setCancelled(true);
	    	}
	    }
	    if (event.getCause() == RemoveCause.PHYSICS) {
	    	event.setCancelled(true);
	    }
	    if (event.getCause() == RemoveCause.OBSTRUCTION) {
	    	event.setCancelled(true);
	    }
	}
	
	@EventHandler
	public void dismountEvent(VehicleExitEvent event) {
		if(event.getExited() instanceof Player) {
			if(event.getVehicle() instanceof Horse) {
				event.getVehicle().remove();
			}
		}
	}
	
	@EventHandler
	public void swapHand(PlayerSwapHandItemsEvent event) {
		try {
			Player player = event.getPlayer();
			new StepAndRolling().effect(player);
			event.setCancelled(true);
			return;
		} catch(Exception e) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void entityUnbreak(HangingBreakByEntityEvent event) {
		if(event.getRemover() instanceof Player) {
			Player player = (Player) event.getRemover();
			if(player.getGameMode() == GameMode.ADVENTURE) {
				event.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void buildEvent(BlockCanBuildEvent event) {
		if(!event.isBuildable()) {
			event.setBuildable(true);
		}
	}
	
	@EventHandler
	public void moistureChangeEvent(MoistureChangeEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void leavesDecayEvent(LeavesDecayEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void entityBlockFormEvent(EntityBlockFormEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void invenClose(InventoryCloseEvent event) {
	}
	
	@EventHandler
	public void regenHealth(EntityRegainHealthEvent event) {
		if(event.getRegainReason() == RegainReason.SATIATED) {
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void tpEvent(PlayerTeleportEvent event) {
		Player player = event.getPlayer();
		Location loc = event.getTo();
		new TPMobSpawn(player, loc);
	}
	
	@EventHandler
	public void targetChangeEvent(EntityTargetLivingEntityEvent event) {
		try {
			if(event.getEntity() instanceof Zoglin) {
				if(!(event.getTarget() instanceof Player) && !(event.getTarget() instanceof IronGolem)) {
					event.setCancelled(true);
				}
			} else if(event.getEntity() instanceof Slime) {
				if(!(event.getTarget() instanceof Player) && !(event.getTarget() instanceof IronGolem)) {
					event.setCancelled(true);
				}
			} else if(event.getEntity() instanceof Skeleton) {
				if(!(event.getTarget() instanceof Player) && !(event.getTarget() instanceof IronGolem)) {
					event.setCancelled(true);
				}
			} else if(event.getEntity() instanceof WitherSkeleton) {
				if(!(event.getTarget() instanceof Player) && !(event.getTarget() instanceof IronGolem)) {
					event.setCancelled(true);
				}
			}
		} catch(Exception e) {
			
		}
		
//		try {
//			if(event.getEntity() instanceof Mob) {
//				Mob mob = (Mob) event.getEntity();
//				if(mob.getTarget() instanceof Player) {
//					Player player = (Player) mob.getTarget();
//					
//					if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
//						new BGM(player, "폭주하는 황소");
//					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
//						new BGM(player, "우는 영혼들의 산");
//					} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
//						new BGM(player, "도망쳐");
//					} else {
//						new BGM(player, "전투");
//					}
//				}
//			}
//		} catch(Exception e) {
//			
//		}
	}
	
	@EventHandler
	public void chatEvent(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.sendMessage("§l" + "[" + player.getDisplayName() + "] " + ChatColor.WHITE +  ": " + event.getMessage());
		}
		
		System.out.println("§l" + "[" + player.getDisplayName() + "] " + ChatColor.WHITE +  ": " + event.getMessage());
		event.setCancelled(true);
		
	}
	
	@EventHandler
	public void onNPCInteract(NPC.Events.Interact event){
	    Player player = event.getPlayer();
	    
	    try {
	    	NPC npc = event.getNPC();
	    	NPC.Interact.ClickType clickType = event.getClickType();
	    	
	    	String office = null;
	    	try {
	    		office = player.getInventory().getItem(8).getItemMeta().getLore().get(2).substring(6);
	    	} catch(Exception e2) {
	    		
	    	}
	    	
	 	    if(clickType == NPC.Interact.ClickType.RIGHT_CLICK) {
	 	    	
	 	    	if(npc.getText().get(0).equals("핀")) {
	 	    		new Message().msg(player, "핀: 안녕하세요! 핀이에요.%핀: 대표님은 위층에 있어요!");
	 	    	} else if(npc.getText().get(0).equals("에리")) {
	 	    		new Message().msg(player, "에리: 그래, 한 번 팔자 펴보자고!%에리: 안 그래도 이번에 공방에서 괜찮은 놈을 거금 들여서 데려왔으니까!");
	 	    	} else if(npc.getText().get(0).equals("윤")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER); //윤 사무소로 의뢰 수주하고 소속 바꾸는거 방지, 앞으로도 퀘 주는 npc한테는 써야됨
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("윤 사무소")) {
	 	    				int num = rnd.nextInt(6);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "윤: 오늘도 여러가지 의뢰가 들어왔다.%윤: 고양이가 가출했다고 한다.%q0001%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "윤: 오늘도 여러가지 의뢰가 들어왔다.%윤: 토끼를 잃어버렸다고 한다.%윤: 뒷골목에서 토끼를 키우는 사람은 거의 없으니 찾기 쉬울거다.%q0002%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "윤: 오늘도 여러가지 의뢰가 들어왔다.%윤: 강아지를 찾아달라는군.%q0003%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "윤: 오늘도 여러가지 의뢰가 들어왔다.%윤: 목숨이 위험할 수도 있지만 보수는 클거야.%q0004%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "윤: 음식 배달이다.%윤: 식기 전에 빨리 가져다 드리도록.%q0005%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "윤: 음식 배달이다.%윤: 둥지에서 들어온 의뢰니 신경쓰도록.%q0006%윤: 중간에 포기를 하고 싶다면 /dropQuest 커맨드를 이용해라.%윤: 물론 평판은 깎이겠지만 말이야.");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 8)) {
		 	    			int num = rnd.nextInt(4);
		 	    			if(num == 0) {
		 	    				new Message().msg(player, "윤: 의뢰를 구하러 오신겁니까.%q0001%윤: 보수는 알아서 잘 분배해드리겠습니다.");
		 	    			} else if(num == 1) {
		 	    				new Message().msg(player, "윤: 의뢰를 구하러 오신겁니까.%q0002%윤: 보수는 알아서 잘 분배해드리겠습니다.");
		 	    			} else if(num == 2) {
		 	    				new Message().msg(player, "윤: 의뢰를 구하러 오신겁니까.%q0003%윤: 보수는 알아서 잘 분배해드리겠습니다.");
		 	    			} else if(num == 3) {
		 	    				new Message().msg(player, "윤: 의뢰를 구하러 오신겁니까.%q0004%윤: 보수는 알아서 잘 분배해드리겠습니다.%윤: 살아서 봤으면 좋겠군요.");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "윤: 볼 일이 없다면 나가주시죠.");
		 	    		}
	 	    		} else {
	 	    			if(office.equals("윤 사무소")) {
	 	    				if (getQuestName(player).equals("q0001")) {
		 	    				new Message().msg(player, "윤: 고양이가 사라지기 전에 찾아와라.");
		 	    			} else if (getQuestName(player).equals("q0002")) {
		 	    				new Message().msg(player, "윤: 토끼가 사라지기 전에 찾아와라.");
		 	    			} else if (getQuestName(player).equals("q0003")) {
		 	    				new Message().msg(player, "윤: 강아지가 사라지기 전에 찾아와라.");
		 	    			} else {
		 	    				new Message().msg(player, "윤: 빨리 나가서 의뢰나 해결하고 와.");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "윤: 볼 일이 없다면 나가주시죠.");
		 	    		}

	 	    		}
	 	    	} else if(npc.getText().get(0).equals("나오키")) {
	 	    		new Message().msg(player, "나오키: 해결사로 일하는 한, 필요 이상으로 일을 벌이는 건 좋지 않아.%나오키: 의뢰라면 태인에게 가봐.");
	 	    	} else if(npc.getText().get(0).equals("맥컬린")) {
	 	    		new Message().msg(player, "맥컬린: 가능한 대상을 잔인하게 찢어놓고 잘 보이는 곳에 걸어두면 된다니까…%맥컬린: 뭐야, 용건 없으면 꺼져.");
	 	    	} else if(npc.getText().get(0).equals("태인")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("갈고리 사무소")) {
	 	    				int num = rnd.nextInt(7);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "태인: 사냥 명령이 떨어졌어.%태인: 이번 목표는 겨우 9급 해결사군.%태인: 겨우 이정도로 죽진 않겠지.%q0007%태인: 죽을 바엔 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 평판은 쥐만도 못해지겠지만.");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "태인: 사냥 명령이 떨어졌어.%태인: 이번 목표는 8급 해결사군.%태인: 혼자 처리할 수 있겠지?%q0008%태인: 죽을 바엔 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 평판은 쥐만도 못해지겠지만.");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "태인: 사냥 명령이 떨어졌어.%태인: 이번 목표는 무려 7급 해결사군.%태인: 위험한건 알지만 대표님의 명령이다.%q0009%태인: 죽을 바엔 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 대표님도 용서해주실거야.");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "태인: 길바닥 출신의 힘을 보여줄때다.%태인: 윤 사무소의 정보를 빼내는거다.%태인: 분명 금고같은 곳에 녀석들의 정보가 있을거야.%태인: 어떻게든 훔쳐오라고.%"
	 	    							+ "q0010%태인: 못할 것 같으면 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 평판은 쥐만도 못해지겠지만.");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "태인: 길바닥 출신의 힘을 보여줄때다.%태인: 가로등 사무소의 정보를 빼내는거다.%태인: 분명 금고같은 곳에 녀석들의 정보가 있을거야.%태인: 어떻게든 훔쳐오라고.%"
	 	    							+ "q0011%태인: 못할 것 같으면 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 평판은 쥐만도 못해지겠지만.");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "태인: 길바닥 출신의 힘을 보여줄때다.%태인: 어금니 사무소의 정보를 빼내는거다.%태인: 분명 금고같은 곳에 녀석들의 정보가 있을거야.%태인: 어떻게든 훔쳐오라고.%"
	 	    							+ "q0012%태인: 못할 것 같으면 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 평판은 쥐만도 못해지겠지만.");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "태인: 대표님도 참, 이런걸 시키다니.%태인: 하나 협회 남부지부 3과의 정보를 가져오라는군.%태인: 경비는 상상을 초월하겠지만, 어쨌든 금고는 움직이지 않아.%태인: 금고를 찾아서 정보를 빼낼 뿐이야.%태인: 어떻게든 훔쳐보라고.%"
	 	    							+ "q0013%태인: 못할 것 같으면 /dropQuest 커맨드로 퀘스트를 포기해라.%태인: 대표님도 용서해주실거야.");
	 	    				}
		 	    		} else if(office.equals("무소속")) {
		 	    			new Message().msg(player, "태인: 우리 소속이 아니면 의뢰를 받을 수 없다는 대표님의 명령이다.%태인: 다른 사무소에서 일을 알아보도록.");
		 	    		} else {
		 	    			new Message().msg(player, "태인: 뭐야, 죽고 싶은거야?");
		 	    		}
	 	    		} else {
	 	    			if(office.equals("갈고리 사무소")) {
		 	    			new Message().msg(player, "태인: 빨리가서 일이나 하라고.");
		 	    		} else {
		 	    			new Message().msg(player, "태인: 뭐야, 죽고 싶은거야?");
		 	    		}

	 	    		}
	 	    	} else if(npc.getText().get(0).equals("루루")) {
	 	    		int num = rnd.nextInt(2);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "루루: 아~ 우리 사무소는 왜 파리만 날릴까.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "루루: 이래 봬도 우리는 츠바이 협회 지정 사무소야.%루루: 츠바이 협회는 치안을 담당하지!%루루: 우리도 마찬가지고.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("산")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("가로등 사무소")) {
	 	    				int num = rnd.nextInt(6);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "산: 일 받아 왔어.%산: 또 주변 골목에서 쥐가 난동을 피우나봐.%산: 적당히 혼내주면 한동안은 조용할거야.%q0014%산: 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "산: 일 받아 왔어.%산: 윤 사무소에서 온 의뢰야.%산: 지금 사무소 근처에 정체불명의 인물이 서성이나봐.%산: 갈고리 사무소 녀석들일려나…%산: 혹시 모르니 출동해달라는 의뢰야.%"
	 	    							+ "q0015%산: 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "산: 츠바이 협회로 부터 온 일이야.%산: 츠바이 협회 6과에서 물건을 받아와야돼.%q0016%산: 누구나 할 수 있는 일이지만…%"
	 	    							+ "산: 만약에 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "산: 츠바이 협회로 부터 온 일이야.%산: 츠바이 협회 5과에서 물건을 받아와야돼.%q0017%산: 누구나 할 수 있는 일이지만…%"
	 	    							+ "산: 만약에 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "산: 츠바이 협회로 부터 온 일이야.%산: 츠바이 협회 3과에서 물건을 받아와야돼.%q0018%산: 누구나 할 수 있는 일이지만…%"
	 	    							+ "산: 만약에 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "산: 일 받아 왔어.%산: 철의 형제에서 또 사무소깨기를 시작했나봐.%산: 기계라면 좋은 줄 알고 온몸을 기계로 바꿔버린 놈들이지.%산: 허접한 사무소를 터는걸로 먹고 산다고 해.%산: 조금은 어려울 수도 있는 의뢰네.%"
	 	    							+ "q0019%산: 일이 너무 부담되면 /dropQuest 커맨드로 포기하는걸 추천해.%산: 대신 평판은 조금 떨어질거야.");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 8)) {
		 	    			int num = rnd.nextInt(3);
		 	    			if(num == 0) {
	 	    					new Message().msg(player, "산: 새로운 의뢰입니다.%산: 또 주변 골목에서 쥐가 난동을 피운다고 합니다.%산: 적당히 혼내주면 한동안은 조용할겁니다.%q0014%산: 그럼 잘 부탁드립니다.");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "산: 새로운 의뢰입니다.%산: 지금 윤 사무소 근처에 정체불명의 인물이 있다고 하는군요.%산: 갈고리 사무소 녀석들일려나…%산: 혹시 모르니 출동해달라고 합니다.%q0015%산: 그럼 잘 부탁드립니다.");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "산: 새로운 의뢰입니다.%산: 철의 형제가 날뛰고 있다고 합니다.%산: 어떤 사무소든 털리기 전에 처리해달라고 하네요.%q0019%산: 그럼 잘 부탁드립니다.");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "산: 무슨 일이죠?%산: 어려운 의뢰라면 츠바이 협회에 문의해주세요.");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0016_1")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack item = chest.getInventory().getItem(1);
						if(player.getInventory().contains(item)) {
							player.getInventory().remove(item);
							int qNum = qb.getNum(player);
	        				qb.q0016_1(player, qNum + 1);
						} else {
							new Message().msg(player, "산: 물건은 어디에 두고 온거야?");
						}
	 	    		} else if (getQuestName(player).equals("q0017_1")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack item = chest.getInventory().getItem(2);
						if(player.getInventory().contains(item)) {
							player.getInventory().remove(item);
							int qNum = qb.getNum(player);
	        				qb.q0017_1(player, qNum + 1);
						} else {
							new Message().msg(player, "산: 물건은 어디에 두고 온거야?");
						}
	 	    		} else if (getQuestName(player).equals("q0018_1")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack item = chest.getInventory().getItem(3);
						if(player.getInventory().contains(item)) {
							player.getInventory().remove(item);
							int qNum = qb.getNum(player);
	        				qb.q0018_1(player, qNum + 1);
						} else {
							new Message().msg(player, "산: 물건은 어디에 두고 온거야?");
						}
	 	    		} else {
	 	    			if(office.equals("가로등 사무소")) {
	 	    				if (getQuestName(player).equals("q0014")) {
		 	    				new Message().msg(player, "산: 쥐는 주변을 둘러보면 나오지 않을까?");
		 	    			} else if (getQuestName(player).equals("q0015")) {
		 	    				new Message().msg(player, "산: 윤 사무소가 위험할수도 있어.");
		 	    			} else if (getQuestName(player).equals("q0019")) {
		 	    				new Message().msg(player, "산: 우리 사무소가 털릴 수도 있잖아.%산: 철의 형제를 처리해줘.");
		 	    			} else {
		 	    				new Message().msg(player, "산: 놀고 있을 시간은 없어.%산: 빨리 의뢰를 처리해줘.");
		 	    			}
		 	    		} else if(office.equals("무소속")) {
		 	    			if (getQuestName(player).equals("q0014")) {
		 	    				new Message().msg(player, "산: 쥐라면 주변을 둘러보면 있을겁니다.");
		 	    			} else if (getQuestName(player).equals("q0015")) {
		 	    				new Message().msg(player, "산: 윤 사무소가 위험할지도 모릅니다.%산: 빨리 출동해주세요.");
		 	    			} else if (getQuestName(player).equals("q0019")) {
		 	    				new Message().msg(player, "산: 애먼 사무소가 피해를 입기 전에 가주세요.");
		 	    			} else {
		 	    				new Message().msg(player, "산: 무슨 일이죠?%산: 어려운 의뢰라면 츠바이 협회에 문의해주세요.");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "산: 무슨 일이죠?%산: 어려운 의뢰라면 츠바이 협회에 문의해주세요.");
		 	    		}

	 	    		}
	 	    	} else if(npc.getText().get(0).equals("마스")) {
	 	    		int num = rnd.nextInt(3);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "마스: 해결사 등급?%마스: 적당히 살면서 일하다 보면 오르겠지~");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "마스: 지금은 7급 해결사지만, 어떻게든 더 높이 올라갈거야.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "마스: 철의 형제라고 불리는 조직은 온 몸이 의체인 녀석들이야.%마스: 물론 뇌는 순수한 인간의 것이지만…%마스: 그래도 전신의체라 그런지 만만한 사무소 정도는 털어버릴 수 있다고 해.%마스: 혹시라도 만나면 위험할 수도 있으니까 조심하라고.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("올가")) {
	 	    		if(getQuestName(player) == null) {
	 	    			
	 	    		} else if (getQuestName(player).equals("q0005")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(0);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							new Message().msg(player, "올가: 윤 사무소에서 왔구나?%올가: 고마워. 잘 먹을게.");
							int qNum = qb.getNum(player);
	        				qb.q0005(player, qNum + 1);
						} else {
							new Message().msg(player, "올가: 해장해야되니까 빨리 가져다줘.");
						}
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("줄리아")) {
	 	    		if (getQuestName(player).equals("q0016")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "줄리아: 가로등 사무소에서 왔지?%줄리아: 이걸 전달해주면 돼.");
						int qNum = qb.getNum(player);
        				qb.q0016(player, qNum + 1);
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("월터")) {
	 	    		if(getQuestName(player) == null) {
	 	    			
	 	    		} else if (getQuestName(player).equals("q0006")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(0);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							new Message().msg(player, "월터: 자네는 윤 사무소 배달원인가?%월터: 잘 먹도록 하지.");
							int qNum = qb.getNum(player);
	        				qb.q0006(player, qNum + 1);
						} else {
							new Message().msg(player, "월터: 자네 지금 장난하자는건가?%월터: 빨리 음식을 내오게나.");
						}
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("디모르포돈")) {
	 	    		if (getQuestName(player).equals("q0017")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "디모르포돈: 가로등 사무소로 전하는 물건이오.");
						int qNum = qb.getNum(player);
        				qb.q0017(player, qNum + 1);
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("크테노카스마")) {
	 	    		if (getQuestName(player).equals("q0018")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "크테노카스마: 이걸 산에게 전해주면 될거야.");
						int qNum = qb.getNum(player);
        				qb.q0018(player, qNum + 1);
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("승급 관리원")) {
	 	    		ItemStack item = player.getInventory().getItem(8);
	 				ItemMeta itemIM = item.getItemMeta();
	 				ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
	 				String exp = ary.get(1).split("\\[")[1].split("/")[0];
	 				String maxExp = ary.get(1).split("\\]")[0].split("/")[1];
	 				if(exp.equals(maxExp)) {
	 					if(new PlayerGrade().returnGrade(player) == 9) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq900");
	 					} else if(new PlayerGrade().returnGrade(player) == 8) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq800");
	 					} else if(new PlayerGrade().returnGrade(player) == 7) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq700");
	 					} else if(new PlayerGrade().returnGrade(player) == 6) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq600");
	 					} else if(new PlayerGrade().returnGrade(player) == 5) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq500");
	 					} else if(new PlayerGrade().returnGrade(player) == 4) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq400");
	 					} else if(new PlayerGrade().returnGrade(player) == 3) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq300");
	 					} else if(new PlayerGrade().returnGrade(player) == 2) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq200");
	 					} else if(new PlayerGrade().returnGrade(player) == 1) {
	 						new Message().msg(player, "승급 관리원: 승급하기에 충분한 평판이시군요!%승급 관리원: 승급 의뢰를 드릴게요!%uq100");
	 					} else if(new PlayerGrade().returnGrade(player) == 0) {
	 						new Message().msg(player, "승급 관리원: 특색 해결사이시군요!%승급 관리원: 실물로 영접하다니, 감동이에요.");
	 					}
	 				} else {
	 					new Message().msg(player, "승급 관리원: 아직 승급하실 수 없어보이시네요.%승급 관리원: 충분히 평판을 쌓고 와주세요.");
	 				}
	 	    	} else if(npc.getText().get(0).equals("나오")) {
	 	    		//광기 상인
	 	    		new Shop1(player);
	 	    		new Message().msg(player, "나오: 어서오세요.%나오: 나오의 광기 상점이랍니다.");
	 	    	} else if(npc.getText().get(0).equals("단테")) {
	 	    		//포션1 상인
	 	    		new Shop2(player);
	 	    		new Message().msg(player, "단테: 째깍째깍.");
	 	    	} else if(npc.getText().get(0).equals("돈키호테")) {
	 	    		//음식1 상인
	 	    		new Shop3(player);
	 	    		new Message().msg(player, "돈키호테: 어서오시게! 지나가는 모험가여!%돈키호테: 해결사 일은 적성에 맞으시오?%돈키호테: 나도 소싯적에는 잘나가는 해결사가 꿈이었다오.%돈키호테: 지금까지도 이 가슴에 유명 해결사의 한정판 배지를 달고 있지.%"
	 	    									+ "돈키호테: 그대도 명성을 떨칠 날이 얼마 남지 않았구려!%돈키호테: 유명해진다면 다시 날 찾아와주시게!");
	 	    	} else if(npc.getText().get(0).equals("료슈")) {
	 	    		//장비1 상인
	 	    		new Shop4(player);
	 	    		new Message().msg(player, "료슈: 강.놈.템.빨."); //강한 놈은 템빨
	 	    	} else if(npc.getText().get(0).equals("비나")) {
	 	    		//포션2 상인
	 	    		new Shop5(player);
	 	    		new Message().msg(player, "비나: 오늘도 헤아릴 수 없을 정도로 많은 별이 떠 있구나.");
	 	    	} else if(npc.getText().get(0).equals("티페리트")) {
	 	    		//음식2 상인
	 	    		new Shop6(player);
	 	    		new Message().msg(player, "티페리트: 맛있는걸 많이 먹어놔야 힘이 난다고!");
	 	    	} else if(npc.getText().get(0).equals("호드")) {
	 	    		//장비2 상인
	 	    		new Shop7(player);
	 	    		new Message().msg(player, "호드: 좋은 장비를 입어야 더 나은 존재가 될 수 있어요…"); 
	 	    	} else if(npc.getText().get(0).equals("벤자민")) {
	 	    		//포션3 상인
	 	    		new Shop8(player);
	 	    		new Message().msg(player, "벤자민: 흔들리지 말고, 끝까지 마셔봅시다.");
	 	    	} else if(npc.getText().get(0).equals("카르멘")) {
	 	    		//음식3 상인
	 	    		new Shop9(player);
	 	    		new Message().msg(player, "카르멘: 세상의 모든 아픔을 음식으로 해방하리라.");
	 	    	} else if(npc.getText().get(0).equals("아인")) {
	 	    		//장비3 상인
	 	    		new Shop10(player);
	 	    		new Message().msg(player, "아인: 차원 상자를 사용해봐.%아인: 너와 내가 빛으로 흩어지더라도 잊혀지진 않을 거야."); 
	 	    	} else if(npc.getText().get(0).equals("암거래상")) {
	 	    		//혈청 상인
	 	    		new Shop11(player);
	 	    		new Message().msg(player, "암거래상: 미행을 대려오진 않았겠지?"); 
	 	    	} else if(npc.getText().get(0).equals("W사 영업사원")) {
	 	    		//워프 열차 티켓 상인
	 	    		new Shop12(player);
	 	    		new Message().msg(player, "W사 영업사원: 신속하고 정확하게 목적지로 이동하는 워프 열차입니다.%W사 영업사원: 1등석 티켓의 판매는 종료되었습니다."); 
	 	    	}
	 	    	
	 	    } else if(clickType == NPC.Interact.ClickType.LEFT_CLICK) {
	 	    	if(npc.getText().get(0).equals("의장")) {
	 	    		
	 	    	}
	 	    }
	    } catch(Exception e) {
	    	
	    }
	}
	
	public String getQuestName(Player player) {
		try {
			ArrayList<Objective> list = new ArrayList<Objective>(player.getScoreboard().getObjectives());
			String name = null;
			for(Objective obj : list) {
				if(obj.getDisplayName().charAt(2) == '[') {
					name = obj.getName();
					break;
				}
			}			
			return name;
		} catch(Exception e) {
			return null;
		}
	}
	
	public void giveExp(Player player, int num) {
		try {
			ItemStack item = player.getInventory().getItem(8);
			ItemMeta itemIM = item.getItemMeta();
			ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
			String grade = ary.get(1).split("\\[")[0];
			String exp = ary.get(1).split("\\[")[1].split("/")[0];
			String maxExp = ary.get(1).split("\\]")[0].split("/")[1];
			int newExp = Integer.parseInt(exp) + num;
			if (newExp > Integer.parseInt(maxExp)) {newExp = Integer.parseInt(maxExp);}
			ary.set(1, ChatColor.GRAY + grade + "[" + String.valueOf(newExp) + "/" + maxExp + "]");
			itemIM.setLore(ary);
			item.setItemMeta(itemIM);
			player.getInventory().setItem(8, item);
		} catch(Exception e) {
			
		}
	}
	
	public void levelup(Player player, String grade, String maxexp) {
		try {
			ItemStack item = player.getInventory().getItem(8);
			ItemMeta itemIM = item.getItemMeta();
			ArrayList<String> ary = (ArrayList<String>) itemIM.getLore();
			ary.set(1, ChatColor.GRAY + "등급: " + grade + " 해결사 [0/" + maxexp +"]");
			itemIM.setLore(ary);
			item.setItemMeta(itemIM);
			player.getInventory().setItem(8, item);
		} catch(Exception e) {
			
		}
	}
	
	public void damageMaxHealth(Player player, int num) {
		if(player.getMaxHealth() <= num) {
			player.setMaxHealth(1);
			player.setHealth(0);
		} else {
			player.setMaxHealth(player.getMaxHealth() - num);
		}
	}
	
	private String[] getSkin(String name) {
		try {
			URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + name);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			String uuid = new JsonParser().parse(reader).getAsJsonObject().get("id").getAsString();
			
			URL url2 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid + "?unsigned=false");
			InputStreamReader reader2 = new InputStreamReader(url2.openStream());
			JsonObject property = new JsonParser().parse(reader2).getAsJsonObject().get("properties")
					.getAsJsonArray().get(0).getAsJsonObject();
			String texture = property.get("value").getAsString();
			String signature = property.get("signature").getAsString();
			return new String[] {texture, signature};
		} catch(Exception e) {
//			EntityPlayer p = ((CraftPlayer) player).getHandle();
//			GameProfile profile = p.getProfile();
//			Property property = profile.getProperties().get("texture").iterator().next();
//			String texture = property.getValue();
//			String signature = property.getSignature();
//			return new String[] {texture, signature};
			return null;
		}
		
	}
	
	private Class<?> getNMSClass(String name) {
		try {
	        return Class.forName("net.minecraft.server."
	                + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
}