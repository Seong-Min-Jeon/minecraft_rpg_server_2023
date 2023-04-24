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
import org.bukkit.inventory.meta.PotionMeta;
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
		getCommand("Where").setExecutor(new Cmd4Where());
		getCommand("ServerChat").setExecutor(new Cmd5ServerChat());
		getCommand("msg").setExecutor(new Cmd6msg());
		getCommand("c").setExecutor(new Cmd7c());
		getCommand("setBiome").setExecutor(new Cmd9SetBiome());
		getCommand("VilTP").setExecutor(new Cmd10VilTp());
		getCommand("SpawnVil").setExecutor(new Cmd11SpawnVil());
		getCommand("k").setExecutor(new Cmd19Kick());
		getCommand("velocity").setExecutor(new Cmd27velocity());
		getCommand("target").setExecutor(new Cmd28target());
		getCommand("t").setExecutor(new Cmd31tp());
		getCommand("dropQuest").setExecutor(new Cmd32dropQuest());
		getCommand("mob").setExecutor(new Cmd33mob());
		
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
//			if (!(player.getDisplayName().equalsIgnoreCase("yumehama"))) {
//				player.kickPlayer("서버 점검 중 입니다.");
//				return;
//			}
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
						qb.q0001(player, Integer.parseInt(num), true);
					} else if (name.equals("q0002")) {
						qb.q0002(player, Integer.parseInt(num), true);
					} else if (name.equals("q0003")) {
						qb.q0003(player, Integer.parseInt(num), true);
					} else if (name.equals("q0004")) {
						qb.q0004(player, Integer.parseInt(num), true);
					} else if (name.equals("q0005")) {
						qb.q0005(player, Integer.parseInt(num), true);
					} else if (name.equals("q0006")) {
						qb.q0006(player, Integer.parseInt(num), true);
					} else if (name.equals("q0007")) {
						qb.q0007(player, Integer.parseInt(num), true);
					} else if (name.equals("q0008")) {
						qb.q0008(player, Integer.parseInt(num), true);
					} else if (name.equals("q0009")) {
						qb.q0009(player, Integer.parseInt(num), true);
					} else if (name.equals("q0010")) {
						qb.q0010(player, Integer.parseInt(num), true);
					} else if (name.equals("q0011")) {
						qb.q0011(player, Integer.parseInt(num), true);
					} else if (name.equals("q0012")) {
						qb.q0012(player, Integer.parseInt(num), true);
					} else if (name.equals("q0013")) {
						qb.q0013(player, Integer.parseInt(num), true);
					} else if (name.equals("q0014")) {
						qb.q0014(player, Integer.parseInt(num), true);
					} else if (name.equals("q0015")) {
						qb.q0015(player, Integer.parseInt(num), true);
					} else if (name.equals("q0016")) {
						qb.q0016(player, Integer.parseInt(num), true);
					} else if (name.equals("q0016_1")) {
						qb.q0016_1(player, Integer.parseInt(num), true);
					} else if (name.equals("q0017")) {
						qb.q0017(player, Integer.parseInt(num), true);
					} else if (name.equals("q0017_1")) {
						qb.q0017_1(player, Integer.parseInt(num), true);
					} else if (name.equals("q0018")) {
						qb.q0018(player, Integer.parseInt(num), true);
					} else if (name.equals("q0018_1")) {
						qb.q0018_1(player, Integer.parseInt(num), true);
					} else if (name.equals("q0019")) {
						qb.q0019(player, Integer.parseInt(num), true);
					} else if (name.equals("q0020")) {
						qb.q0020(player, Integer.parseInt(num), true);
					} else if (name.equals("q0021")) {
						qb.q0021(player, Integer.parseInt(num), true);
					} else if (name.equals("q0022")) {
						qb.q0022(player, Integer.parseInt(num), true);
					} else if (name.equals("q0023")) {
						qb.q0023(player, Integer.parseInt(num), true);
					} else if (name.equals("q0024")) {
						qb.q0024(player, Integer.parseInt(num), true);
					} else if (name.equals("q0025")) {
						qb.q0025(player, Integer.parseInt(num), true);
					} else if (name.equals("q0026")) {
						qb.q0026(player, Integer.parseInt(num), true);
					} else if (name.equals("q0027")) {
						qb.q0027(player, Integer.parseInt(num), true);
					} else if (name.equals("q0028")) {
						qb.q0028(player, Integer.parseInt(num), true);
					} else if (name.equals("q0029")) {
						qb.q0029(player, Integer.parseInt(num), true);
					} else if (name.equals("q0030")) {
						qb.q0030(player, Integer.parseInt(num), true);
					} else if (name.equals("q0031")) {
						qb.q0031(player, Integer.parseInt(num), true);
					} else if (name.equals("q0032")) {
						qb.q0032(player, Integer.parseInt(num), true);
					} else if (name.equals("q0033")) {
						qb.q0033(player, Integer.parseInt(num), true);
					} else if (name.equals("q0034")) {
						qb.q0034(player, Integer.parseInt(num), true);
					} else if (name.equals("q0035")) {
						qb.q0035(player, Integer.parseInt(num), true);
					} else if (name.equals("q0036")) {
						qb.q0036(player, Integer.parseInt(num), true);
					} else if (name.equals("q0037")) {
						qb.q0037(player, Integer.parseInt(num), true);
					} else if (name.equals("q0038")) {
						qb.q0038(player, Integer.parseInt(num), true);
					} else if (name.equals("q0039")) {
						qb.q0039(player, Integer.parseInt(num), true);
					} else if (name.equals("q0040")) {
						qb.q0040(player, Integer.parseInt(num), true);
					} else if (name.equals("q0041")) {
						qb.q0041(player, Integer.parseInt(num), true);
					} else if (name.equals("q0041_1")) {
						qb.q0041_1(player, Integer.parseInt(num), true);
					} else if (name.equals("q0042")) {
						qb.q0042(player, Integer.parseInt(num), true);
					} else if (name.equals("q0043")) {
						qb.q0043(player, Integer.parseInt(num), true);
					} else if (name.equals("q0044")) {
						qb.q0044(player, Integer.parseInt(num), true);
					} else if (name.equals("q0045")) {
						qb.q0045(player, Integer.parseInt(num), true);
					} else if (name.equals("q0046")) {
						qb.q0046(player, Integer.parseInt(num), true);
					} else if (name.equals("q0047")) {
						qb.q0047(player, Integer.parseInt(num), true);
					} else if (name.equals("q0048")) {
						qb.q0048(player, Integer.parseInt(num), true);
					} else if (name.equals("q0049")) {
						qb.q0049(player, Integer.parseInt(num), true);
					} else if (name.equals("q0050")) {
						qb.q0050(player, Integer.parseInt(num), true);
					} else if (name.equals("q0051")) {
						qb.q0051(player, Integer.parseInt(num), true);
					} else if (name.equals("q0052")) {
						qb.q0052(player, Integer.parseInt(num), true);
					} else if (name.equals("q0053")) {
						qb.q0053(player, Integer.parseInt(num), true);
					} else if (name.equals("q0054")) {
						qb.q0054(player, Integer.parseInt(num), true);
					} else if (name.equals("q0055")) {
						qb.q0055(player, Integer.parseInt(num), true);
					} else if (name.equals("q0056")) {
						qb.q0056(player, Integer.parseInt(num), true);
					} else if (name.equals("q0057")) {
						qb.q0057(player, Integer.parseInt(num), true);
					} else if (name.equals("q0058")) {
						qb.q0058(player, Integer.parseInt(num), true);
					} else if (name.equals("q0059")) {
						qb.q0059(player, Integer.parseInt(num), true);
					} else if (name.equals("q0060")) {
						qb.q0060(player, Integer.parseInt(num), true);
					} else if (name.equals("q0061")) {
						qb.q0061(player, Integer.parseInt(num), true);
					} else if (name.equals("q0062")) {
						qb.q0062(player, Integer.parseInt(num), true);
					} else if (name.equals("q0063")) {
						qb.q0063(player, Integer.parseInt(num), true);
					} else if (name.equals("q0064")) {
						qb.q0064(player, Integer.parseInt(num), true);
					} else if (name.equals("q0065")) {
						qb.q0065(player, Integer.parseInt(num), true);
					} else if (name.equals("q0066")) {
						qb.q0066(player, Integer.parseInt(num), true);
					} else if (name.equals("q0067")) {
						qb.q0067(player, Integer.parseInt(num), true);
					} else if (name.equals("q0068")) {
						qb.q0068(player, Integer.parseInt(num), true);
					} else if (name.equals("q0069")) {
						qb.q0069(player, Integer.parseInt(num), true);
					} else if (name.equals("q0070")) {
						qb.q0070(player, Integer.parseInt(num), true);
					} else if (name.equals("uq9")) {
						qb.uq9(player, Integer.parseInt(num), true);
					} else if (name.equals("uq8")) {
						qb.uq8(player, Integer.parseInt(num), true);
					} else if (name.equals("uq7")) {
						qb.uq7(player, Integer.parseInt(num), true);
					} else if (name.equals("uq6")) {
						qb.uq6(player, Integer.parseInt(num), true);
					} else if (name.equals("uq5")) {
						qb.uq5(player, Integer.parseInt(num), true);
					} else if (name.equals("uq4")) {
						qb.uq4(player, Integer.parseInt(num), true);
					} else if (name.equals("uq3")) {
						qb.uq3(player, Integer.parseInt(num), true);
					} else if (name.equals("uq2")) {
						qb.uq2(player, Integer.parseInt(num), true);
					} else if (name.equals("uq1")) {
						qb.uq1(player, Integer.parseInt(num), true);
					}
				}
				bufReader.close();
	    	} catch(Exception e) {
	    		
	    	}
			
			if(player.getLocation().getX() > 500) {
				player.teleport(new Location(world, -1145, 81, 1341));
			} else {
				new BGM(player, "메인"); //메인 브금 재생
			}
			
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
			
			player.getEnderChest().remove(Material.PAPER); //초대장 삭제
			
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
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
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
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
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
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작아지는 죽음")) {
						if(((Slime) ent).getSize() <= 2) {
							TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "작아지는 죽음", 40, 40, 20);
							player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
							
							player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
							player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
							giveExp(player, 40);
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("uq8")) {
								int qNum = qb.getNum(player);
								qb.uq8(player, qNum + 1, false);
							} else if (getQuestName(player).equals("uq7")) {
								int qNum = qb.getNum(player);
								qb.uq7(player, qNum + 1, false);
							} else if (getQuestName(player).equals("uq6")) {
								int qNum = qb.getNum(player);
								qb.uq8(player, qNum + 1, false);
							} else if (getQuestName(player).equals("uq5")) {
								int qNum = qb.getNum(player);
								qb.uq7(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0025")) {
								int qNum = qb.getNum(player);
								qb.q0025(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0031")) {
								int qNum = qb.getNum(player);
								qb.q0031(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0039")) {
								int qNum = qb.getNum(player);
								qb.q0039(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0048")) {
								int qNum = qb.getNum(player);
								qb.q0048(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0054")) {
								int qNum = qb.getNum(player);
								qb.q0054(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0062")) {
								int qNum = qb.getNum(player);
								qb.q0062(player, qNum + 1, false);
							} else if (getQuestName(player).equals("q0068")) {
								int qNum = qb.getNum(player);
								qb.q0068(player, qNum + 1, false);
							}
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "작은 조각")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "작은 조각", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "약쟁이 소녀")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "약쟁이 소녀", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.YELLOW + "" + ChatColor.BOLD + "날아오르는 다리")) {
						TTA_Methods.sendTitle(player, "GREAT DISTORTED FELLED", 40, 40, 20, "날아오르는 다리", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 거대한 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 40만큼 증가했다.");
						giveExp(player, 40);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검은 인격")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "검은 인격", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "외눈 물고기 성체")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "외눈 물고기 성체", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "녹아내리는 마음")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "녹아내리는 마음", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "쏘아올리는 불꽃")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "쏘아올리는 불꽃", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "부패의 조각")) {
						TTA_Methods.sendTitle(player, "LEGEND FELLED", 40, 40, 20, "부패의 조각", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 전설의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 100만큼 증가했다.");
						giveExp(player, 100);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "폭주하는 황소", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "우는 영혼들의 산", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					} else if(ent.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
						TTA_Methods.sendTitle(player, "DEMIGOD FELLED", 40, 40, 20, "도망쳐", 40, 40, 20);
						player.playSound(player.getLocation(), Sound.ENTITY_SKELETON_HORSE_JUMP_WATER, 1.0f, 1.0f);
						
						player.sendMessage(ChatColor.GOLD + "[System] 신화의 뒤틀림이 소멸했다.");
						player.sendMessage(ChatColor.GOLD + "[System] 해결사 평판이 400만큼 증가했다.");
						giveExp(player, 400);
						
						QuestBoard qb = new QuestBoard();
						if (getQuestName(player).equals("uq8")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq7")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq6")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq5")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq4")) {
							int qNum = qb.getNum(player);
							qb.uq8(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq3")) {
							int qNum = qb.getNum(player);
							qb.uq7(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq2")) {
							int qNum = qb.getNum(player);
							qb.uq2(player, qNum + 1, false);
						} else if (getQuestName(player).equals("uq1")) {
							int qNum = qb.getNum(player);
							qb.uq1(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0025")) {
							int qNum = qb.getNum(player);
							qb.q0025(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0031")) {
							int qNum = qb.getNum(player);
							qb.q0031(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0039")) {
							int qNum = qb.getNum(player);
							qb.q0039(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0048")) {
							int qNum = qb.getNum(player);
							qb.q0048(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0054")) {
							int qNum = qb.getNum(player);
							qb.q0054(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0062")) {
							int qNum = qb.getNum(player);
							qb.q0062(player, qNum + 1, false);
						} else if (getQuestName(player).equals("q0068")) {
							int qNum = qb.getNum(player);
							qb.q0068(player, qNum + 1, false);
						}
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		try {
			if(event.getEntity().getCustomName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "나태한 수호령")) {
				ItemStack rewardKey = new ItemStack(Material.TRIPWIRE_HOOK);
				ItemMeta rewardKeyIm = rewardKey.getItemMeta();
				rewardKeyIm.setDisplayName(ChatColor.GOLD + "나태의 열쇠");
				rewardKey.setItemMeta(rewardKeyIm);
				
				List<Entity> entitylist = event.getEntity().getNearbyEntities(40, 20, 40);
				for (Entity nearEntity : entitylist) {
					if (nearEntity.getType() == EntityType.PLAYER) {
						Player nearplayer = (Player) nearEntity;
						Location loc = nearplayer.getLocation();
						if (loc.getX() <= 3587 && loc.getY() <= 57 && loc.getZ() <= 3737 
								&& loc.getX() >= 3537 && loc.getY() >= 0 && loc.getZ() >= 3685) {
							nearplayer.getInventory().addItem(rewardKey);
							nearplayer.teleport(new Location(world, 3470.5, 52, 3740));
							nearplayer.sendMessage("유적 어딘가로 이동했다.");
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
				damageMaxHealth(player, 4);
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
			} else if(player.getInventory().getItemInMainHand().getType() == Material.PUMPKIN_PIE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.COOKIE) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.POISONOUS_POTATO) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.DRIED_KELP) {
				event.setCancelled(true);
				player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount()-1);
			} else if(player.getInventory().getItemInMainHand().getType() == Material.GLOW_BERRIES) {
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
			
			if(entity.getType() == EntityType.CHICKEN) {
				new SpawnAnimal().spawn(entity);
			}
			if(!(entity.getType() == EntityType.HORSE || entity.getType() == EntityType.PIG || entity.getType() == EntityType.SHEEP
					|| entity.getType() == EntityType.COW || entity.getType() == EntityType.CHICKEN)) {
				((LivingEntity)entity).addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, Integer.MAX_VALUE, 2, true, false, false));
			}
			if((entity.getType() != EntityType.HORSE) && (entity.getType() != EntityType.ARMOR_STAND)) {
				SpawnMob sm = new SpawnMob();
				if(!sm.spawn(entity)) {			
					event.setCancelled(true);
				}
			}
			if(entity.getType() == EntityType.ZOMBIE) {
				Zombie zom = (Zombie) entity;
				zom.setAdult();
			}
			if(entity.getType() == EntityType.ILLUSIONER) {
				Illusioner mob = (Illusioner) entity;
				EntityEquipment head = mob.getEquipment();
				ItemStack headItem = new ItemStack(Material.AIR);
				head.setHelmet(headItem);
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
							
							|| item.getType() == Material.BRAIN_CORAL_BLOCK || item.getType() == Material.HORN_CORAL_BLOCK || item.getType() == Material.TUBE_CORAL_BLOCK 
							|| item.getType() == Material.BUBBLE_CORAL_BLOCK || item.getType() == Material.FIRE_CORAL_BLOCK
					
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
						event.setCancelled(true);
					} else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "신의 검+")) {
						for(Entity entity : player.getNearbyEntities(2, 2, 2)) {
							if(entity instanceof LivingEntity) {
								event.setDamage(9999);
								((LivingEntity) entity).damage(9999);
							}
						}
						event.setCancelled(true);
					} else {
						event.setCancelled(true);
					}
				}
			}
		} catch(Exception e) {
			
		}
		
		//아머스탠드 피격 불가
		try {
			if(event.getEntity() instanceof ArmorStand) {
				event.setCancelled(true);
				return;
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
		
		//arrow에 데미지 넣은 만큼 데미지 주도록
		try {
			if(event.getDamager() instanceof Arrow) {
				Arrow arrow = ((Arrow) event.getDamager());
				if(arrow.getShooter() instanceof Player) {
					if(event.getEntity() instanceof Player) {
						event.setCancelled(true);
						((Player) (event.getEntity())).damage(arrow.getDamage());
					} else if(event.getEntity() instanceof Mob) {
						event.setCancelled(true);
						((Mob) (event.getEntity())).damage(arrow.getDamage());
					}
				} else if(arrow.getShooter() instanceof Mob) {
					if(event.getEntity() instanceof Player) {
						Player player = (Player) (event.getEntity());
						event.setCancelled(true);
						player.damage(arrow.getDamage());
						
						if(arrow.getDamage() == 0.01) {
							player.setFireTicks(60);
						}
					} else if(event.getEntity() instanceof Mob) {
						event.setCancelled(true);
					}
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
					
					if(player.getLocation().getX() < 500) {
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
			} else {
				if(event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					Entity mob = event.getDamager();
					
					if(player.getLocation().getX() < 500) {
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
			}
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		//오류 제거
		if(!(event.getEntity() instanceof Player)) {
			if(event.getDamage() - 1.0 < 0.001) {
				event.setCancelled(true);
				return;
			}
		}
		
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
		
		//워프열차는 무적
		if(event.getEntity() instanceof Player) {
			//3746 255 3805  3689 100 3760
			Location loc = event.getEntity().getLocation();
			if (loc.getX() <= 3746 && loc.getY() <= 255 && loc.getZ() <= 3805 
					&& loc.getX() >= 3689 && loc.getY() >= 100 && loc.getZ() >= 3760) {
				event.setCancelled(true);
				return;
			}
			
		}
		
		//도시 이외에서는 낙뎀 없음
		if(event.getEntity() instanceof Player) {
			Location loc = event.getEntity().getLocation();
			if(event.getCause() == DamageCause.FALL) {
				if (loc.getX() > 500) {
					event.setCancelled(true);
					return;
				}
			}
		}
		
		//몹은 낙뎀 최소로 받음
		if(event.getEntity() instanceof Mob) {
			if(event.getCause() == DamageCause.FALL) {
				event.setDamage(1);
			}
		}
		
		//회피
		if(event.getEntity() instanceof Player) {
			try {
				Player player = (Player) event.getEntity();
				int num = 0;
				if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
					if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 신속 반지")) {
						num = 10;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 신속 반지")) {
						num = 15;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 신속 반지")) {
						num = 20;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 신속 반지")) {
						num = 25;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 신속 반지")) {
						num = 30;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 신속 반지")) {
						num = 35;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 신속 반지")) {
						num = 40;
					}
				}
				
				if(rnd.nextInt(100) < num) {
					event.setDamage(0);
					event.setCancelled(true);
					return;
				}
			} catch (Exception e2) {
				
			}
		}
		
		//데미지 0이하면 패스
		if(event.getDamage() <= 0) {
			if(event.getEntity() instanceof Player) {
				event.setDamage(0.1);
			} else {
				event.setCancelled(true);
				return;
			}
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
				
				int personality = 0; //1이면 5% 경감
				int chestplate = 0; 
				int arti = 0; //10이면 10% 경감
				
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
				
				if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
					if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 보호 반지")) {
						arti = 5;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 보호 반지")) {
						arti = 10;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 보호 반지")) {
						arti = 15;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 보호 반지")) {
						arti = 20;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 보호 반지")) {
						arti = 25;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 보호 반지")) {
						arti = 30;
					} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 보호 반지")) {
						arti = 35;
					}
				}
				
				damage = (damage - chestplate) * (100 - (personality*5 + arti)) * 0.01;
				
				event.setDamage(damage);
			}
		} catch(Exception e) {
			
		}
		
		//다시 데미지 0이하면 패스
		if (event.getDamage() <= 0) {
			if(event.getEntity() instanceof Player) {
				event.setDamage(0.1);
			} else {
				event.setCancelled(true);
				return;
			}
		}
		
		// 인식변경
		try {
			if (event.getEntity() instanceof Mob) {
				Mob mob = (Mob) event.getEntity();
				mob.setTicksLived(1);
				
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
			}
		} catch (Exception e) {

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
					try {
						if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
							if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 내공 반지")) {
								event.setDamage(0.9);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 내공 반지")) {
								event.setDamage(0.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 내공 반지")) {
								event.setDamage(0.7);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 내공 반지")) {
								event.setDamage(0.6);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 내공 반지")) {
								event.setDamage(0.5);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 내공 반지")) {
								event.setDamage(0.4);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 내공 반지")) {
								event.setDamage(0.3);
							}
						}
					} catch (Exception e2) {
						event.setDamage(1);
					}
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
					Player player = (Player) event.getEntity();
					try {
						if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
							if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 내공 반지")) {
								event.setDamage(0.9);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 내공 반지")) {
								event.setDamage(0.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 내공 반지")) {
								event.setDamage(0.7);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 내공 반지")) {
								event.setDamage(0.6);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 내공 반지")) {
								event.setDamage(0.5);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 내공 반지")) {
								event.setDamage(0.4);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 내공 반지")) {
								event.setDamage(0.3);
							}
						}
					} catch (Exception e2) {
						event.setDamage(1);
					}
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
					try {
						if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
							if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 내공 반지")) {
								event.setDamage(0.9);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 내공 반지")) {
								event.setDamage(0.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 내공 반지")) {
								event.setDamage(0.7);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 내공 반지")) {
								event.setDamage(0.6);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 내공 반지")) {
								event.setDamage(0.5);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 내공 반지")) {
								event.setDamage(0.4);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 내공 반지")) {
								event.setDamage(0.3);
							}
						}
					} catch (Exception e2) {
						event.setDamage(1);
					}
				}
			} else if (event.getCause() == DamageCause.BLOCK_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					try {
						if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
							if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 내공 반지")) {
								event.setDamage(1.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 내공 반지")) {
								event.setDamage(1.6);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 내공 반지")) {
								event.setDamage(1.4);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 내공 반지")) {
								event.setDamage(1.2);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 내공 반지")) {
								event.setDamage(1);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 내공 반지")) {
								event.setDamage(0.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 내공 반지")) {
								event.setDamage(0.6);
							}
						}
					} catch (Exception e2) {
						event.setDamage(2);
					}
					player.setFireTicks(100);
				}
			} else if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
				if (event.getEntity() instanceof Player) {
					Player player = (Player) event.getEntity();
					try {
						if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
							if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 내공 반지")) {
								event.setDamage(1.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 내공 반지")) {
								event.setDamage(1.6);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 내공 반지")) {
								event.setDamage(1.4);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 내공 반지")) {
								event.setDamage(1.2);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 내공 반지")) {
								event.setDamage(1);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 내공 반지")) {
								event.setDamage(0.8);
							} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 내공 반지")) {
								event.setDamage(0.6);
							}
						}
					} catch (Exception e2) {
						event.setDamage(2);
					}
					player.setFireTicks(100);
				}
			} else if(event.getCause() == DamageCause.STARVATION) {
				event.setDamage(1);
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
		try {
			if(event.getEntity() instanceof Mob && event.getDamage() > 1.9) {
				Mob mob = (Mob) event.getEntity();
				if(mob.getTarget() instanceof Player) {
					Player player = (Player) mob.getTarget();
					
					if(player.getLocation().getX() < 500) {
						if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "폭주하는 황소")) {
							new BGM(player, "폭주하는 황소");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "우는 영혼들의 산")) {
							new BGM(player, "우는 영혼들의 산");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "도망쳐")) {
							new BGM(player, "도망쳐");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "검은 인격")) {
							new BGM(player, "전투");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "외눈 물고기 성체")) {
							new BGM(player, "전투");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "녹아내리는 마음")) {
							new BGM(player, "전투");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "쏘아올리는 불꽃")) {
							new BGM(player, "전투");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else if(mob.getCustomName().equalsIgnoreCase(ChatColor.RED + "" + ChatColor.BOLD + "부패의 조각")) {
							new BGM(player, "전투");
							
							QuestBoard qb = new QuestBoard();
							if (getQuestName(player).equals("q0070")) {
								int qNum = qb.getNum(player);
								qb.q0070(player, qNum + 1, false);
							}
						} else {
							new BGM(player, "전투");
						}
						player.setTicksLived(1);
					}
					
				}
			}
		} catch(Exception e) {
			
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
		
		//부활
		if(event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if(event.getDamage() >= player.getHealth()) {
				try {
					int num = 0;
					if (player.getInventory().getItemInOffHand().getItemMeta() != null) {
						if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "나태의 생명 반지")) {
							num = 10;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "분노의 생명 반지")) {
							num = 20;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "색욕의 생명 반지")) {
							num = 30;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "탐식의 생명 반지")) {
							num = 40;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "우울의 생명 반지")) {
							num = 50;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "질투의 생명 반지")) {
							num = 60;
						} else if (player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.GOLD + "오만의 생명 반지")) {
							num = 70;
						}
					}
					
					if(rnd.nextInt(100) < num) {
						if(player.getMaxHealth() < 1) {
							player.setMaxHealth(1);
						}
	 					player.setHealth(player.getMaxHealth());
	 					player.teleport(new Location(world, -1081.5, 186, 1451.5));
						
						event.setDamage(0);
						event.setCancelled(true);
						return;
					}
				} catch (Exception e2) {
					
				}
			}
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
							|| (type == Material.MOJANG_BANNER_PATTERN) || (type == Material.PIGLIN_BANNER_PATTERN) || (type == Material.SKULL_BANNER_PATTERN)
							|| (type == Material.MAP)) {
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
		    						qb.q0010(player, qNum + 1, false);
		    						player.sendMessage(ChatColor.GOLD + "[System] 윤 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	    							player.sendMessage(ChatColor.GOLD + "[System] 윤 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 핀의 공격으로 최대체력이 2만큼 감소합니다.");
	    							damageMaxHealth(player, 2);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    							
	    							for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
	    								n.update();
	    								n.forceUpdate();
	    							}
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
		    						qb.q0011(player, qNum + 1, false);
		    						player.sendMessage(ChatColor.GOLD + "[System] 가로등 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	    							player.sendMessage(ChatColor.GOLD + "[System] 가로등 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 산의 공격으로 최대체력이 2만큼 감소합니다.");
	    							damageMaxHealth(player, 2);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    							
	    							for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
	    								n.update();
	    								n.forceUpdate();
	    							}
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
		    						qb.q0012(player, qNum + 1, false);
		    						player.sendMessage(ChatColor.GOLD + "[System] 어금니 사무소의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	    							player.sendMessage(ChatColor.GOLD + "[System] 어금니 사무소의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 올가의 술병이 머리에 떨어져 최대체력이 2만큼 감소합니다.");
	    							damageMaxHealth(player, 2);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    							
	    							for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
	    								n.update();
	    								n.forceUpdate();
	    							}
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
		    						qb.q0013(player, qNum + 1, false);
		    						player.sendMessage(ChatColor.GOLD + "[System] 하나 협회 3과의 정보를 획득했습니다. (성공확률: " + persent + "%)");
	    						} else {
	    							player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	    							player.sendMessage(ChatColor.GOLD + "[System] 하나 협회 3과의 정보를 얻지 못했습니다. (성공확률: " + persent + "%)");
	    							player.sendMessage(ChatColor.GOLD + "[System] 올리비에의 괘각으로 최대체력이 4만큼 감소합니다.");
	    							damageMaxHealth(player, 4);
	    							player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_HURT, 1.0f, 1.0f);
	    							
	    							for(NPC.Personal n : NPCLib.getInstance().getAllPersonalNPCs(player)) {
	    								n.update();
	    								n.forceUpdate();
	    							}
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
	    			
	    			if(block.getType() == Material.WHITE_GLAZED_TERRACOTTA) {
	    				LootChest lc = new LootChest();
		    			lc.open(player, block);
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
	        			} else if(player.getInventory().getItemInMainHand().getType() == Material.MAP) {
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
			
			try {
				if(event.getRightClicked().getType() == EntityType.CHICKEN) {
					event.setCancelled(true);
					
					if(event.getRightClicked().getCustomName().equals(ChatColor.WHITE + "" + ChatColor.BOLD + "닭도리")) {
						ItemStack food = new ItemStack(Material.EGG);
						ItemMeta foodIm = food.getItemMeta();
						foodIm.setDisplayName(ChatColor.GOLD + "달걀");
						ArrayList<String> foodLore = new ArrayList<>();
						foodLore.add(ChatColor.GRAY + "닭도리가 낳은 귀중한 달걀");
						foodIm.setLore(foodLore);
						foodIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
						foodIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
						foodIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
						food.setItemMeta(foodIm);
						world.dropItem(event.getRightClicked().getLocation(), food);
						
						int num = rnd.nextInt(12);
						if(num == 0) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 꼬고고곡…");
							player.damage(1);
						} else if(num == 1) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄극…");
							player.damage(2);
						} else if(num == 2) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄꾸우곡…");
							player.damage(3);
						} else if(num == 3) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄끄옥!");
							player.damage(4);
						} else if(num == 4) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄끄꼭!");
							player.damage(5);
						} else if(num == 5) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄극!");
							player.damage(6);
						} else if(num == 6) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 꼬고꼭…");
							player.damage(7);
						} else if(num == 7) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄극…");
							player.damage(8);
						} else if(num == 8) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 꼬오곡…");
							player.damage(9);
						} else if(num == 9) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 꼬고곡…");
							player.damage(10);
						} else if(num == 10) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끄그극…");
							player.damage(11);
						} else if(num == 11) {
							player.sendMessage(ChatColor.WHITE + "닭도리: 끅!");
							player.damage(12);
						}
						
					}
				}
			} catch(Exception e1) {
				
			}
			
			try {
				//퀘스트 엔티티 접촉
				QuestOwner qo = new QuestOwner();
				if (event.getRightClicked() == qo.returnEntity(player)) {
					QuestBoard qb = new QuestBoard();
					
					if (getQuestName(player).equals("q0001")) {
						int qNum = qb.getNum(player);
						qb.q0001(player, qNum + 1, false);
					} else if (getQuestName(player).equals("q0002")) {
						int qNum = qb.getNum(player);
						qb.q0002(player, qNum + 1, false);
					} else if (getQuestName(player).equals("q0003")) {
						int qNum = qb.getNum(player);
						qb.q0003(player, qNum + 1, false);
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
						
						for(int i = 0 ; i < 3 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "철의 형제 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(80);
							entity.setHealth(80);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
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
					} else if (getQuestName(player).equals("q0021") || getQuestName(player).equals("q0027")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 2 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "버림받은 개 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(60);
							entity.setHealth(60);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(5);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(30,30,30));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(30,30,30));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(30,30,30));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0022") || getQuestName(player).equals("q0028")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 3 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "꿀꿀이네 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(50);
							entity.setHealth(50);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.SPRUCE_LOG);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(6);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(160,80,80));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(160,80,80));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(160,80,80));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
						}
					} else if (getQuestName(player).equals("q0023") || getQuestName(player).equals("q0029")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 4 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "도끼파 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(30);
							entity.setHealth(30);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.GREEN_CARPET);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(7);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(100,100,20));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(100,100,20));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(100,100,20));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0024") || getQuestName(player).equals("q0030")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 2 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.GREEN + "" + ChatColor.BOLD + "정육점파 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(60);
							entity.setHealth(60);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.BIRCH_LOG);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(8);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(200,200,200));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(200,200,200));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(200,200,200));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0034")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 1 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 간부");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(150);
							entity.setHealth(150);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(9);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(30,30,30));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(30,30,30));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(30,30,30));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
						}
					} else if (getQuestName(player).equals("q0035")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 1 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 카시라");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(120);
							entity.setHealth(120);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(10);
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
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0036")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 1 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 전투원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(190);
							entity.setHealth(190);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment sub = entity.getEquipment();
							ItemStack subItem = new ItemStack(Material.STONE_BRICK_SLAB);
							sub.setItemInOffHand(subItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(11);
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
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 2, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0037")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 1 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 간부");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(180);
							entity.setHealth(180);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(12);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(255,232,188));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(160,220,160));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(90,150,90));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0038")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 1 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 간부");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(130);
							entity.setHealth(130);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(13);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(255,150,150));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(255,150,150));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(255,150,150));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						}
					} else if (getQuestName(player).equals("q0043") || getQuestName(player).equals("q0049") || getQuestName(player).equals("q0057") || getQuestName(player).equals("q0063")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 3 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "녹슨 사슬파 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(90);
							entity.setHealth(90);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(14);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(30,30,30));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(30,30,30));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(30,30,30));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
						}
					} else if (getQuestName(player).equals("q0044") || getQuestName(player).equals("q0050") || getQuestName(player).equals("q0058") || getQuestName(player).equals("q0064")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 3 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "흑운회 와카슈");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(75);
							entity.setHealth(75);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.OAK_PLANKS);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(15);
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
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0045") || getQuestName(player).equals("q0051") || getQuestName(player).equals("q0059") || getQuestName(player).equals("q0065")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 2 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "사육제 재단사");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(110);
							entity.setHealth(110);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.STONE_BRICK_SLAB);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment sub = entity.getEquipment();
							ItemStack subItem = new ItemStack(Material.STONE_BRICK_SLAB);
							sub.setItemInOffHand(subItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(16);
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
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0046") || getQuestName(player).equals("q0052") || getQuestName(player).equals("q0060") || getQuestName(player).equals("q0066")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 2 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "철공회 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(100);
							entity.setHealth(100);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.AIR);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(17);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(255,232,188));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(160,220,160));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(90,150,90));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
							entity.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 0, false, false));
						}
					} else if (getQuestName(player).equals("q0047") || getQuestName(player).equals("q0053") || getQuestName(player).equals("q0061") || getQuestName(player).equals("q0067")) {
						qo.returnEntity(player).remove();
						qo.remove(player);
						
						Location chestLoc = new Location(world, -1147, 166, 1467);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						
						for(int i = 0 ; i < 3 ; i++) {
							Zombie entity = (Zombie) player.getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.ZOMBIE);
							entity.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "하바네로파 조직원");
							entity.setCustomNameVisible(true);
							entity.setPersistent(true);
							entity.setRemoveWhenFarAway(false);
							entity.setMaxHealth(90);
							entity.setHealth(90);
							EntityEquipment weapon = entity.getEquipment();
							ItemStack weaponItem = new ItemStack(Material.JUNGLE_LOG);
							weapon.setItemInMainHand(weaponItem);
							EntityEquipment head = entity.getEquipment();
							ItemStack headItem = chest.getInventory().getItem(18);
							head.setHelmet(headItem);
							EntityEquipment chestplate = entity.getEquipment();
							ItemStack chestplateItem = new ItemStack(Material.LEATHER_CHESTPLATE);
							LeatherArmorMeta chestmeta = (LeatherArmorMeta) chestplateItem.getItemMeta();
							chestmeta.setColor(Color.fromRGB(255,150,150));
							chestplateItem.setItemMeta(chestmeta);
							chestplate.setChestplate(chestplateItem);
							EntityEquipment leggings = entity.getEquipment();
							ItemStack leggingsItem = new ItemStack(Material.LEATHER_LEGGINGS);
							LeatherArmorMeta leggingsmeta = (LeatherArmorMeta) leggingsItem.getItemMeta();
							leggingsmeta.setColor(Color.fromRGB(255,150,150));
							leggingsItem.setItemMeta(leggingsmeta);
							leggings.setLeggings(leggingsItem);
							EntityEquipment boots = entity.getEquipment();
							ItemStack bootsItem = new ItemStack(Material.LEATHER_BOOTS);
							LeatherArmorMeta bootsmeta = (LeatherArmorMeta) bootsItem.getItemMeta();
							bootsmeta.setColor(Color.fromRGB(255,150,150));
							bootsItem.setItemMeta(bootsmeta);
							boots.setBoots(bootsItem);
							entity.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 1, false, false));
						}
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
		        			new Message().msg(player, "나오: 당신에게 도움이 되기를…");
		        		} else {
		        			new Message().msg(player, "나오: 광기가… 부족하시네요…");
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
		        			new Message().msg(player, "단테: 째깍…");
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
					//암거래상
					else if (loc.getX() <= -1134 && loc.getY() <= 80 && loc.getZ() <= 1305
							&& loc.getX() >= -1142 && loc.getY() >= 70 && loc.getZ() >= 1297) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop11().item1());
		        			}
		        			new Message().msg(player, "암거래상: 용건이 없으면 이제 빨리 꺼져라.");
		        		} else {
		        			new Message().msg(player, "암거래상: 죽고 싶냐?");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					//w사 영업사원
					else if (loc.getX() <= -1144 && loc.getY() <= 85 && loc.getZ() <= 1347
							&& loc.getX() >= -1152 && loc.getY() >= 75 && loc.getZ() >= 1339) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop12().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop12().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop12().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop12().item4());
		        			} else if(event.getSlot() == 4) {
		        				player.getInventory().addItem(new Shop12().item5());
		        			} else if(event.getSlot() == 5) {
		        				player.getInventory().addItem(new Shop12().item6());
		        			} else if(event.getSlot() == 6) {
		        				player.getInventory().addItem(new Shop12().item7());
		        			}
		        			new Message().msg(player, "w사 영업사원: 탑승 시에 안전벨트를 잘 착용해주세요.");
		        		} else {
		        			new Message().msg(player, "w사 영업사원: 돈이 없으면 열차 탑승이 불가능해요.");
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.2f, 2.0f);
		        		}
					}
					//바다
					else if (loc.getX() <= -1115 && loc.getY() <= 190 && loc.getZ() <= 1454
							&& loc.getX() >= -1123 && loc.getY() >= 180 && loc.getZ() >= 1446) {
						ItemStack clicked = event.getCurrentItem();
		        		if(player.getLevel() >= Integer.parseInt(clicked.getItemMeta().getLocalizedName())) {
		        			player.setLevel(player.getLevel() - Integer.parseInt(clicked.getItemMeta().getLocalizedName()));
		        			player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_USE, 1.0f, 2.0f);
		        			
		        			if(event.getSlot() == 0) {
		        				player.getInventory().addItem(new Shop13().item1());
		        			} else if(event.getSlot() == 1) {
		        				player.getInventory().addItem(new Shop13().item2());
		        			} else if(event.getSlot() == 2) {
		        				player.getInventory().addItem(new Shop13().item3());
		        			} else if(event.getSlot() == 3) {
		        				player.getInventory().addItem(new Shop13().item4());
		        			}
		        			new Message().msg(player, "바다: 수표 발급이군요.%바다: 알겠습니다.");
		        		} else {
		        			new Message().msg(player, "바다: 돈이… 부족하시군요.");
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
							|| clicked.getType() == Material.MUSIC_DISC_WARD
							
							|| clicked.getType() == Material.BRAIN_CORAL_BLOCK || clicked.getType() == Material.HORN_CORAL_BLOCK || clicked.getType() == Material.TUBE_CORAL_BLOCK 
							|| clicked.getType() == Material.BUBBLE_CORAL_BLOCK || clicked.getType() == Material.FIRE_CORAL_BLOCK)) {
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
					if(ent.getType() == EntityType.WARDEN) {
						ent.remove();
					}
					if(ent.getType() == EntityType.ILLUSIONER) {
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
	 	    			new Message().msg(player, "루루: 아㨒 우리 사무소는 왜 파리만 날릴까.");
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
	        				qb.q0016_1(player, qNum + 1, false);
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
	        				qb.q0017_1(player, qNum + 1, false);
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
	        				qb.q0018_1(player, qNum + 1, false);
						} else {
							new Message().msg(player, "산: 물건은 어디에 두고 온거야?");
						}
	 	    		} else if (getQuestName(player).equals("q0032")) {
	 	    			new Message().msg(player, "산: 보안점검 오셨나보네요.%산: 저희는 문제 없습니다.%산: 줄리아랑 이사도라한테도 안부인사 전해주세요.");
	 	    			QuestBoard qb = new QuestBoard();
	 	    			int qNum = qb.getNum(player);
        				qb.q0032(player, qNum + 1, false);
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
	 	    			new Message().msg(player, "마스: 해결사 등급?%마스: 적당히 살면서 일하다 보면 오르겠지㨒");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "마스: 지금은 7급 해결사지만, 어떻게든 더 높이 올라갈거야.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "마스: 철의 형제라고 불리는 조직은 온 몸이 의체인 녀석들이야.%마스: 물론 뇌는 순수한 인간의 것이지만…%마스: 그래도 전신의체라 그런지 만만한 사무소 정도는 털어버릴 수 있다고 해.%마스: 혹시라도 만나면 위험할 수도 있으니까 조심하라고.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("레인")) {
	 	    		int num = rnd.nextInt(3);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "레인: 누님은 또 얼마나 마신걸까.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "레인: 이건 비밀인데%레인: 누님은 R사 토끼팀 대장하고 아는 사이래.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "레인: 이번 달도 적자야.%레인: 누님은 사무소 돈이 술값으로 보이나봐.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("미카")) {
	 	    		int num = rnd.nextInt(3);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "미카: 대표님이 왜저러냐고?%미카: 어제 같은 골목 출신들끼리 만나서 술판 벌였대.%미카: 가게 하나 전세 내고… 진탕 마셨다고 하더라.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "미카: 레인이 하는 말 중에 틀린 말은 없어.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "미카: 내가 쓰고 있는 무기는 우리집에서 하는 공방에서 만들었어.%미카: 지금은… 없지만…");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("올가")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("어금니 사무소")) {
	 	    				int num = rnd.nextInt(7);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "올가: 시간 되면 둥지 좀 갔다와라.%올가: 내 소중한 친구 묘한테 전하는 편지야.%올가: 몰래 열어보진 말라고.%q0020");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "올가: 친구가 꿀 좀 빨 수 있는 일을 주겠다 하더라고.%올가: 자기한테 마진 좀 띄어주면 된다더라.%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 간단하지?%"
	 	    							+ "올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0021");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "올가: 친구가 꿀 좀 빨 수 있는 일을 주겠다 하더라고.%올가: 자기한테 마진 좀 띄어주면 된다더라.%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 간단하지?%"
	 	    							+ "올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0022");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "올가: 친구가 꿀 좀 빨 수 있는 일을 주겠다 하더라고.%올가: 자기한테 마진 좀 띄어주면 된다더라.%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 간단하지?%"
	 	    							+ "올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0023");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "올가: 친구가 꿀 좀 빨 수 있는 일을 주겠다 하더라고.%올가: 자기한테 마진 좀 띄어주면 된다더라.%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 간단하지?%"
	 	    							+ "올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0024");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "올가: 요즘 뒤틀림이라는게 나온다면서?%올가: 뒷골목이든 둥지든 가리지 않고 나타나서…%올가: 사람들을 몰살시키는…%올가: 가뜩이나 살기 힘든 세상인데, 이제 죽을 일도 늘었네.%"
	 	    							+ "올가: 뭐 그건 그렇고, 오히려 뒤틀림 때문에 의뢰가 늘긴 했어.%올가: 해결사들 입장에서는 고마울 수도 있지.%올가: 우리는 수준이 높진 않으니까…%올가: 아무튼 하나 협회에서 지정한 뒤틀림에 관한 의뢰를 가져왔어.%"
	 	    							+ "올가: 한번 해보라고.%q0025");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "올가: 아, 토할 것 같아…%올가: 해장을 좀 해야할 것 같은데…%올가: 이럴 때는 봉골레 술찜만 먹으면, 싹㨒 풀리는데 말이야.%올가: 하필 이런 때에 재료를 못구한다고 메뉴를 없앨게 뭐람…%"
	 	    							+ "올가: 어쩔 수 없지.%올가: 나가서 홍차칵테일이나 한잔 사와!%올가: 요즘은 그게 해장에 좋다더라.%q0026%올가: 뭐? 술 아니냐고?%올가: 어디서 말대꾸야㨒%올가: 대표는 나라고!");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 6)) {
		 	    			int num = rnd.nextInt(5);
		 	    			if(num == 0) {
	 	    					new Message().msg(player, "올가: 의뢰 받으러 온거지?%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0021");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "올가: 의뢰 받으러 온거지?%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0022");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "올가: 의뢰 받으러 온거지?%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0023");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "올가: 의뢰 받으러 온거지?%올가: 도시 전설급 조직원을 사냥하는 일이야.%올가: 사람이라고 너무 연민을 가질 필요는 없어.%올가: 도시는 원래 그런 곳이니까.%q0024");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "올가: 의뢰 받으러 온거지?%올가: 요즘 뒤틀림이라는게 나온다면서?%올가: 뒷골목이든 둥지든 가리지 않고 나타나서…%올가: 사람들을 몰살시키는…%올가: 가뜩이나 살기 힘든 세상인데, 이제 죽을 일도 늘었네.%"
	 	    							+ "올가: 뭐 그건 그렇고, 오히려 뒤틀림 때문에 의뢰가 늘긴 했어.%올가: 해결사들 입장에서는 고마울 수도 있지.%올가: 그런 관계로! 하나 협회에서 지정한 뒤틀림에 관한 의뢰를 가져왔어.%"
	 	    							+ "올가: 한번 해보라고.%q0025");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "올가: 아, 너무 많이 마신 것 같아…");
		 	    		}
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
	        				qb.q0005(player, qNum + 1, false);
						} else {
							new Message().msg(player, "올가: 해장해야되니까 빨리 가져다줘.");
						}
	 	    		} else if (getQuestName(player).equals("q0026")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(5);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							int qNum = qb.getNum(player);
	        				qb.q0026(player, qNum + 1, false);
						} else {
							new Message().msg(player, "올가: 빨리 안사와?");
						}
	 	    		} else {
	 	    			if(office.equals("어금니 사무소")) {
	 	    				if (getQuestName(player).equals("q0025")) {
		 	    				new Message().msg(player, "올가: 뒤틀림은 아무때나 나오는 것 같지는 않더라고.%올가: 쉽게 볼 수 있었으면 도시 사람들은 다 죽었겠지…%올가: 한번 뒤틀림이 발생하면 협회측에서 조심하라고 방송을 해주나봐.");
		 	    			} else if (getQuestName(player).equals("q0026")) {
		 	    				new Message().msg(player, "올가: 토 할 것 같으니까…%올가: 빨리 가서 사와…%올가: 여러 병도 아니야…%올가: 딱… 한 병만…");
		 	    			} else {
		 	    				new Message().msg(player, "올가: 일 안할거면 같이 술이나 한잔하러 갈래?");
		 	    			}
		 	    		} else if(office.equals("무소속")) {
		 	    			if (getQuestName(player).equals("q0025")) {
		 	    				new Message().msg(player, "올가: 뒤틀림은 아무때나 나오는 것 같지는 않더라고.%올가: 쉽게 볼 수 있었으면 도시 사람들은 다 죽었겠지…%올가: 한번 뒤틀림이 발생하면 협회측에서 조심하라고 방송을 해주나봐.");
		 	    			} else {
		 	    				new Message().msg(player, "올가: 일 안할거면 같이 술이나 한잔하러 갈래?");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "올가: 아, 너무 많이 마신 것 같아…");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("줄리아")) {
	 	    		if(getQuestName(player) == null) {
	 	    			int num = rnd.nextInt(3);
		 	    		if(num == 0) {
		 	    			new Message().msg(player, "줄리아: 이사도라는 너무 냉정한 것 같아.");
		 	    		} else if(num == 1) {
		 	    			new Message().msg(player, "줄리아: 가로등 사무소의 산이라고 알아?%줄리아: 나랑 같은 사무소 동기였어!");
		 	    		} else if(num == 2) {
		 	    			new Message().msg(player, "줄리아: 6과라도 우리는 협회 소속이야.%줄리아: 어디가서 꿀리지 않는다는 말이지.");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0016")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "줄리아: 가로등 사무소에서 왔지?%줄리아: 이걸 전달해주면 돼.");
						int qNum = qb.getNum(player);
        				qb.q0016(player, qNum + 1, false);
	 	    		} else {
	 	    			int num = rnd.nextInt(3);
		 	    		if(num == 0) {
		 	    			new Message().msg(player, "줄리아: 이사도라는 너무 냉정한 것 같아.");
		 	    		} else if(num == 1) {
		 	    			new Message().msg(player, "줄리아: 가로등 사무소의 산이라고 알아?%줄리아: 나랑 같은 사무소 동기였어!");
		 	    		} else if(num == 2) {
		 	    			new Message().msg(player, "줄리아: 6과라도 우리는 협회 소속이야.%줄리아: 어디가서 꿀리지 않는다는 말이지.");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("이사도라")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "이사도라: 우리는 정으로만 움직이면 안 되는 거야.%이사도라: 그랬다간 모든 게 무너지는 거라고.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "이사도라: 뒤틀림 현상…%이사도라: 본 적은 없어도 들어본 적은 있지?%이사도라: 백야, 흑주 이후 전 도시적으로 발생하고 있는 이상 현상 말이야.%"
	 	    					+ "이사도라: 확실히 빈도는 낮아도… 각각의 개체마다 처리조차 쉽게 감당이 안 되는 사건.%이사도라: 아직까지 뒤틀림이 발생하는 원인에 대한 단서도 없어.%"
	 	    					+ "이사도라: 이런 것들과 언제까지 싸워야하는걸까.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "이사도라: 동료에게 듣기로는 자기가 맡던 치안 구역에 위험요소는 없었는데…%이사도라: 갑자기 거주민의 몸이 뒤틀리면서 네발짐승처럼 바뀌었다고 했어.%"
	 	    					+ "이사도라: 다행히 한 자릿수 정도의 사상자 선에서 처리할 수 있었지만…%이사도라: 그리고 식당 종업원이 돌연 식인 샌드위치…?%이사도라: 그런 괴물로 바뀌었다고도 들은 적 있어.");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "이사도라: 츠바이의 경구는 '당신의 방패'야.%이사도라: 기억해.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("월터")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("츠바이 협회 6과")) {
	 	    				int num = rnd.nextInt(7);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하는군.%월터: 자네가 나서서 처리할 수 있도록.%q0027%월터: 적당히 손봐주기만 하라고… 크흠…");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하는군.%월터: 자네가 나서서 처리할 수 있도록.%q0028");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하는군.%월터: 자네가 나서서 처리할 수 있도록.%q0029");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하는군.%월터: 자네가 나서서 처리할 수 있도록.%q0030");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "월터: 협회에서 뒤틀림을 사냥하라는 명이 떨어졌네.%월터: 우리 6과는 도시 전설급으로 지정된 뒤틀림만 처리해도 공적이 인정된다네.%월터: 자네가 나서서 처리할 수 있도록.%"
	 	    							+ "월터: 뒤틀림이 발생하는 원인을 알아온다면 더욱 좋을거야.%q0031");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "월터: 가로등 사무소의 보안점검을 하는 날이군.%월터: 협회의 말단은 이런 시덥잖은 일도 한다네.%q0032");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "월터: 5과에 보고서를 전달하고 오게.%q0033");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 6)) {
		 	    			int num = rnd.nextInt(5);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하네.%월터: 자네가 처리해주면 고맙겠구만.%q0027%월터: 적당히 손봐주기만 하라고… 크흠…");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하네.%월터: 자네가 처리해주면 고맙겠구만.%q0028");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하네.%월터: 자네가 처리해주면 고맙겠구만.%q0029");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "월터: 협회에서 관리하는 구역에 개미새끼들이 나타났다고 하네.%월터: 자네가 처리해주면 고맙겠구만.%q0030");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "월터: 협회에서 뒤틀림을 사냥하라는 명이 떨어졌네.%월터: 우리 6과는 도시 전설급으로 지정된 뒤틀림만 처리해도 공적이 인정된다네.%월터: 자네가 처리해주면 고맙겠구만.%q0031");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "월터: 우리는 의뢰자의 방패입니다.%월터: 용건은 무엇입니까.");
		 	    		}
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
	        				qb.q0006(player, qNum + 1, false);
						} else {
							new Message().msg(player, "월터: 자네 지금 장난하자는건가?%월터: 빨리 음식을 내오게나.");
						}
	 	    		} else {
	 	    			if(office.equals("츠바이 협회 6과")) {
	 	    				if (getQuestName(player).equals("q0027")) {
		 	    				new Message().msg(player, "월터: 왜 적당히 해야하냐고?%월터: …명령이니 그대로 수행하도록.");
		 	    			} else if (getQuestName(player).equals("q0031")) {
		 	    				new Message().msg(player, "월터: 뒤틀림 현상에 관한 의뢰가 제일 공적 쌓기에 좋다네.");
		 	    			} else {
		 	    				new Message().msg(player, "월터: 의뢰나 끝마치고 찾아오도록.");
		 	    			}
		 	    		} else if(office.equals("무소속")) {
		 	    			new Message().msg(player, "월터: 잘 부탁하네.");
		 	    		} else {
		 	    			new Message().msg(player, "월터: 우리는 의뢰자의 방패입니다.%월터: 용건은 무엇입니까.");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("스테판")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "스테판: 자, 어디 보자. 시 협회 유진 부장이 부탁했던…%스테판: 음? 무슨 일이야?");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "스테판: 요즘 탄환값이 미친 듯이 오르고 있어…%스테판: 그 뒤틀림이라는 것 때문에 수요가 폭등했나봐.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "스테판: 톱니교단에 대해 공부 중이야.%스테판: 암살을 하려면 적에 대해 최대한 많이 알아야돼.");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "스테판: 총을 쏠 때는 알사탕 하나 입에 물고,%스테판: 집중해서 표적에 쏘면 되는거야.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("타마키")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "타마키: 해결사 일을 하다보면 뭘 해도 죽을 수 밖에 없는 상황이 생겨.%타마키: 그럼 당연히 좀 더 나중에 죽는 걸 선택해.%타마키: 조금이라도 더 살아있는 사이에 기적이라도 일어날지 누가 알아?");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "타마키: 스테판처럼 불평만 늘어놓을거면 말해.%타마키: 내가 머리에 구멍을 내줄테니.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "타마키: 의외로 스테판이 나보다 등급이 높아.%타마키: 보기에는 모자라보여도 실력은 확실하다는거지.");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "타마키: 임무에 나서기 전에는 에스프레소 한 잔 하는걸 추천해.%타마키: 집중력이 올라가면 명중률도 올라가니깐.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("리웨이")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("마침표 사무소")) {
	 	    				int num = rnd.nextInt(9);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰가 내려왔다.%리웨이: 목표는 도시 질병급 조직의 간부.%리웨이: 언제나 그렇듯 죽여버리면 되는 임무다.%q0034");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰가 내려왔다.%리웨이: 목표는 도시 질병급 조직의 간부.%리웨이: 언제나 그렇듯 죽여버리면 되는 임무다.%q0035");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰가 내려왔다.%리웨이: 목표는 도시 질병급 조직의 간부.%리웨이: 언제나 그렇듯 죽여버리면 되는 임무다.%q0036");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰가 내려왔다.%리웨이: 목표는 도시 질병급 조직의 간부.%리웨이: 언제나 그렇듯 죽여버리면 되는 임무다.%q0037");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰가 내려왔다.%리웨이: 목표는 도시 질병급 조직의 간부.%리웨이: 언제나 그렇듯 죽여버리면 되는 임무다.%q0038");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "리웨이: 뒤틀림을 사냥하라는 의뢰다.%리웨이: 이번 건은 보수가 꽤 큰 모양이군.%리웨이: 잘 해결해준다면 사무소의 탄환값에 큰 보탬이 되거다.%q0039");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "리웨이: 외곽에 다녀오도록.%리웨이: 외곽의 유적은 적어도 1, 2급 해결사도 벅찬 수준으로 위험하다고 알고 있다만…%리웨이: 최근에 새로운 유적들이 발견되었다고 하는군.%"
	 	    							+ "리웨이: 그것도 위험하지 않은 유적을 포함해서 말이야.%리웨이: 물론 외곽의 유적인만큼 방심하면 죽을지도 모른다.%리웨이: 보수는 최대한 너에게 많이 남겨주지.%q0040");
	 	    				} else if(num == 7) {
	 	    					new Message().msg(player, "리웨이: 시 협회 2과에서 물건을 좀 받아왔으면 한다.%리웨이: 잠시 시간을 내서 다녀오도록.%q0041");
	 	    				} else if(num == 8) {
	 	    					new Message().msg(player, "리웨이: 총기 손질의 꽃은 기름칠이다.%리웨이: 하지만 그거 아나?%리웨이: 둥지에서 파는 음료인 마법의 손키스가 최고의 손질도구라는 것을.%"
	 	    							+ "리웨이: 음료에 강중유를 배합하면 세계 무엇에도 견줄 수 없는 기름이 되지.%리웨이: 사실 이건 특이점일지도 몰라.%리웨이: 나중에 우리 사무소가 날개가 된다면 우리의 특이점이 될거야.%"
	 	    							+ "리웨이: 그런 의미에서 마법의 손키스 한 병만 사와.%리웨이: 보수는 물건값에 심부름값까지 주도록 하지.%q0042");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 4)) {
		 	    			int num = rnd.nextInt(7);
		 	    			if(num == 0) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰입니다.%리웨이: 목표는 도시 질병급 조직의 간부입니다.%리웨이: 처리해주시면 됩니다.%q0034");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰입니다.%리웨이: 목표는 도시 질병급 조직의 간부입니다.%리웨이: 처리해주시면 됩니다.%q0035");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰입니다.%리웨이: 목표는 도시 질병급 조직의 간부입니다.%리웨이: 처리해주시면 됩니다.%q0036");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰입니다.%리웨이: 목표는 도시 질병급 조직의 간부입니다.%리웨이: 처리해주시면 됩니다.%q0037");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "리웨이: 암살 의뢰입니다.%리웨이: 목표는 도시 질병급 조직의 간부입니다.%리웨이: 처리해주시면 됩니다.%q0038");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "리웨이: 뒤틀림 관련 의뢰입니다.%리웨이: 잘 해결해주신다면 사무소의 탄환값에 큰 보탬이 될 겁니다.%q0039");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "리웨이: 외곽의 유적을 조사해주십쇼.%리웨이: 굉장히 위험한 일인건 압니다.%리웨이: 하지만 당신이라면 가능할 것 같군요.%"
	 	    							+ "리웨이: 보수는 섭섭치 않게 드리겠습니다.%q0040");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "리웨이: 우리는 암살 전문 사무소다.%리웨이: 용건은 뭐지?");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0041_1")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(7);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							new Message().msg(player, "리웨이: 고맙군.%리웨이: 중요한 물건이라서 말이야.");
							int qNum = qb.getNum(player);
	        				qb.q0041_1(player, qNum + 1, false);
						} else {
							new Message().msg(player, "리웨이: 물건은 아직 안받은건가?");
						}
	 	    		} else if (getQuestName(player).equals("q0042")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(8);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							new Message().msg(player, "리웨이: 고맙군.%리웨이: 너도 총이 있다면 이 마음을 이해할거야.");
							int qNum = qb.getNum(player);
	        				qb.q0042(player, qNum + 1, false);
						} else {
							new Message().msg(player, "리웨이: 지금 총기분해까지 다 해놨잖아.%리웨이: 빨리 사오라고.");
						}
	 	    		} else {
	 	    			if(office.equals("마침표 사무소")) {
	 	    				if (getQuestName(player).equals("q0034")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0035")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0036")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0037")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0038")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else {
		 	    				new Message().msg(player, "리웨이: 일을 마치고 오도록.");
		 	    			}
		 	    		} else if(office.equals("무소속")) {
		 	    			if (getQuestName(player).equals("q0034")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0035")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0036")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0037")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else if (getQuestName(player).equals("q0038")) {
		 	    				new Message().msg(player, "리웨이: 암살의 핵심은 시간이다.%리웨이: 표적이 사라지기 전에 암살은 마쳐져야한다.");
		 	    			} else {
		 	    				new Message().msg(player, "리웨이: 일을 마치고 오도록.");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "리웨이: 우리는 암살 전문 사무소다.%리웨이: 용건은 뭐지?");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("필립")) {
	 	    		if(getQuestName(player) == null) {
	 	    			int num = rnd.nextInt(5);
		 	    		if(num == 0) {
		 	    			new Message().msg(player, "필립: 차는 늘 드시던 대로 준비해야돼요.%필립: 스승님은 향을 극대화한 쌍화차를 좋아하시죠.%필립: 유나 선배는 밀크티랑 커피를 좋아하세요.");
		 	    		} else if(num == 1) {
		 	    			new Message().msg(player, "필립: 스승님은 츠바이 협회 출신이에요.%필립: 한 때 연기전쟁에서 이름을 날린 실력자시죠.");
		 	    		} else if(num == 2) {
		 	    			new Message().msg(player, "필립: 우리 사무소는 쐐기 사무소와 형제 사무소에요.%필립: 스승님의 성품 덕분에 저희 사무소는 협력자들이 많죠.%필립: 덕분에 사무소도 둥지에 있고요.");
		 	    		} else if(num == 3) {
		 	    			new Message().msg(player, "필립: 제 주특기는 쌍화차 타는 것이에요.%필립: 스승님은 쌍화차 타는 실력으로 해결사 등급을 매기면 제가 특색이 될거라고 하세요.%필립: 쌍화차의 노른자처럼 노란색의 특색이요.%"
		 	    					+ "필립: 특색이 된다면 이명은 천사라고 짓고 싶어요.%필립: 특색… 노란 천사…");
		 	    		} else if(num == 4) {
		 	    			new Message().msg(player, "필립: 가끔 불안할 때면 아름다운 목소리가 귓가에서 조언을 해줘요.%필립: 하지만 그 조언을 들을 필요는 없어요.%필립: 저에게는 스승님과 유나 선배가 있으니까요.");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0055")) {
	 	    			QuestBoard qb = new QuestBoard();
						if(player.getInventory().contains(Material.EGG)) {
							new Message().msg(player, "필립: 고마워요.%필립: 덕분에 질 좋은 쌍화차를 만들 수 있겠군요.");
							
							player.getInventory().remove(Material.EGG);
							int qNum = qb.getNum(player);
	        				qb.q0055(player, qNum + 1, false);
						} else {
							new Message().msg(player, "필립: 계란은 쌍화차를 만드는 필수 재료죠.");
						}
	 	    		} else {
	 	    			int num = rnd.nextInt(5);
		 	    		if(num == 0) {
		 	    			new Message().msg(player, "필립: 차는 늘 드시던 대로 준비해야돼요.%필립: 스승님은 향을 극대화한 쌍화차를 좋아하시죠.%필립: 유나 선배는 밀크티랑 커피를 좋아하세요.");
		 	    		} else if(num == 1) {
		 	    			new Message().msg(player, "필립: 스승님은 츠바이 협회 출신이에요.%필립: 한 때 연기전쟁에서 이름을 날린 실력자시죠.");
		 	    		} else if(num == 2) {
		 	    			new Message().msg(player, "필립: 우리 사무소는 쐐기 사무소와 형제 사무소에요.%필립: 스승님의 성품 덕분에 저희 사무소는 협력자들이 많죠.%필립: 덕분에 사무소도 둥지에 있고요.");
		 	    		} else if(num == 3) {
		 	    			new Message().msg(player, "필립: 제 주특기는 쌍화차 타는 것이에요.%필립: 스승님은 쌍화차 타는 실력으로 해결사 등급을 매기면 제가 특색이 될거라고 하세요.%필립: 쌍화차의 노른자처럼 노란색의 특색이요.%"
		 	    					+ "필립: 특색이 된다면 이명은 천사라고 짓고 싶어요.%필립: 특색… 노란 천사…");
		 	    		} else if(num == 4) {
		 	    			new Message().msg(player, "필립: 가끔 불안할 때면 아름다운 목소리가 귓가에서 조언을 해줘요.%필립: 하지만 그 조언을 들을 필요는 없어요.%필립: 저에게는 스승님과 유나 선배가 있으니까요.");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("유나")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "유나: 어우, 이놈의 지긋지긋한 쌍화차 냄새… 오늘따라 더 진한데?");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "유나: 필립은 날마다 쌍화차 타는 실력이 늘어가나 봐.%유나: 필립이 해고당하지 않는 이유가 쌍화차일 수도 있어.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "유나: 최근에 혼자서 도시 전설급 뒤틀림을 해결했어.%유나: 녀석의 움직임이 특이해서 상대하기 까다로웠지.%유나: 마지막에는 특히나 위험했어.%"
	 	    					+ "유나: 어디서 구했는지 몰라도 뇌간집속 공명기를 이용해서 주변 시체들하고 합체를 했다니까.%유나: 그 속에서 건물은 녹아내리지, 미친 듯이 터져 나오는 바늘에 맞은 사람들이 폭발해서 아수라장이 됐지…%"
	 	    					+ "유나: 정말 죽는 줄 알았다고.");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "유나: 솔직히 믿을 수 없지만, 마법이라는 것이 정말 존재하는 모양이야.%유나: 마법과 특이점…%유나: 어쩌면 시초는 같을 수도 있지 않을까?");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("살바도르")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("새벽 사무소")) {
	 	    				int num = rnd.nextInt(16);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "살바도르: 앞으로 3주 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 도시 질병급 조직을 처리하는 일이라네.%살바도르: 우리 사무소 단독으로 처리할 수 있는 일일게야.%"
	 	    							+ "살바도르: 둥지에 사무소를 유지하려면 어려운 의뢰도 마다하지 않아야 하는 법.%q0043");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "살바도르: 앞으로 3주 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 도시 질병급 조직을 처리하는 일이라네.%살바도르: 우리 사무소 단독으로 처리할 수 있는 일일게야.%"
	 	    							+ "살바도르: 둥지에 사무소를 유지하려면 어려운 의뢰도 마다하지 않아야 하는 법.%q0044");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "살바도르: 앞으로 3주 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 도시 질병급 조직을 처리하는 일이라네.%살바도르: 우리 사무소 단독으로 처리할 수 있는 일일게야.%"
	 	    							+ "살바도르: 둥지에 사무소를 유지하려면 어려운 의뢰도 마다하지 않아야 하는 법.%q0045");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "살바도르: 앞으로 3주 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 도시 질병급 조직을 처리하는 일이라네.%살바도르: 우리 사무소 단독으로 처리할 수 있는 일일게야.%"
	 	    							+ "살바도르: 둥지에 사무소를 유지하려면 어려운 의뢰도 마다하지 않아야 하는 법.%q0046");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "살바도르: 앞으로 3주 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 도시 질병급 조직을 처리하는 일이라네.%살바도르: 우리 사무소 단독으로 처리할 수 있는 일일게야.%"
	 	    							+ "살바도르: 둥지에 사무소를 유지하려면 어려운 의뢰도 마다하지 않아야 하는 법.%q0047");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "살바도르: 앞으로 2개월 정도는 월세 걱정 없을 만한 일을 받았다네.%살바도르: 뒤틀림을 사냥하는 일이라네.%살바도르: 그래도 뒤틀림의 대한 정보가 많이 모여서 당하지만은 않을걸세.%"
	 	    							+ "살바도르: 하나 협회의 도서관에도 정보가 많다고 하니, 참고해도 좋겠군.%q0048");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0049");
	 	    				} else if(num == 7) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0050");
	 	    				} else if(num == 8) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0051");
	 	    				} else if(num == 9) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0052");
	 	    				} else if(num == 10) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0053");
	 	    				} else if(num == 11) {
	 	    					new Message().msg(player, "살바도르: 쐐기 사무소에서 협력 의뢰가 들어왔다네.%살바도르: 협력이라고 해도 일이 많아서 분배해주는 것이지만…%살바도르: 사실상 우리 사무소 단독으로 처리하는 것이라 보수는 우리가 대부분 먹을거야.%"
	 	    							+ "살바도르: 도움을 받으려면 먼저 도움을 줘야 하는 법.%q0054");
	 	    				} else if(num <= 13) {
	 	    					new Message().msg(player, "살바도르: 필립이 쌍화차에 쓸 계란이 거의 떨어졌다는군.%살바도르: 자네가 가서 달걀을 가져오도록.%살바도르: 필립이 자연산 계란이 아니면 안된다고 고집을 피워서 말이야.%"
	 	    							+ "살바도르: 귀찮겠지만 직접 가서 주워오게나.%q0055");
	 	    				} else if(num <= 15) {
	 	    					new Message().msg(player, "살바도르: 필립이 만든 쌍화차를 쐐기 사무소에 전해주게나.%살바도르: 명색이 형제 사무소인데, 좋은 건 나눠야하지 않겠는가?%q0056");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 4)) {
		 	    			int num = rnd.nextInt(7);
		 	    			if(num == 0) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0043");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0044");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0045");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0046");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0047");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 우리 사무소가 둥지에 있어서 월세가 장난 아니라네.%살바도르: 그래서 보수는 많이 주진 못할게야."
	 	    							+ "%살바도르: 대신 이 늙은이의 인맥으로 평판은 섭섭하지 않게 올려주도록 하지.%q0048");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "살바도르: 의뢰를 받으러 왔는가.%살바도르: 지금 사무소에 계란이 다 떨어져서 그런데%살바도르: 계란을 좀 주워와 줄 수 있겠는가."
	 	    							+ "%살바도르: 가끔은 심심한 일도 하고 그래야지.%q0055");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "살바도르: 늙은이의 새벽빛 검을 보고 싶어서 온겐가?");
		 	    		}
	 	    		} else {
	 	    			if(office.equals("새벽 사무소")) {
	 	    				if (getQuestName(player).equals("q0055")) {
		 	    				new Message().msg(player, "살바도르: 계란이 없어서 쌍화차를 못마시면 자네가 책임질겐가?%살바도르: 화내기 전에 빨리 다녀오게나.");
		 	    			} else if (getQuestName(player).equals("q0056")) {
		 	    				new Message().msg(player, "살바도르: 식기 전에 가져다 주게나.");
		 	    			} else {
		 	    				new Message().msg(player, "살바도르: 내가 아무리 좋더라도 일은 갔다오게나.");
		 	    			}
		 	    		} else if(office.equals("무소속")) {
		 	    			if (getQuestName(player).equals("q0055")) {
		 	    				new Message().msg(player, "살바도르: 계란이 없어서 쌍화차를 못마시면 자네가 책임질겐가?%살바도르: 화내기 전에 빨리 다녀오게나.");
		 	    			} else {
		 	    				new Message().msg(player, "살바도르: 내가 아무리 좋더라도 일은 갔다오시게.");
		 	    			}
		 	    		} else {
		 	    			new Message().msg(player, "살바도르: 늙은이의 새벽빛 검을 보고 싶어서 온겐가?");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("파멜리")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "파멜리: 파멜라랑 쌍둥이냐고?%파멜리: 죽고 싶어?");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "파멜리: 네가 어리숙하고 약해 빠졌으면 네 동료들은 다 죽은 거나 다름없어.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "파멜리: 네가 편한 대로 생각하면 돼.%파멜리: 일이 벌어지면 결과에 생각하기 편한 이유를 갖다 붙이면 되잖아?");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "파멜리: 맞짱 뜨자는거?");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("파멜라")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "파멜라: 아무것도 안먹으면 죽을 수도 있어.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "파멜라: 사무소가 통째로 전멸하는걸 본 적 있어?%파멜라: 그 속에서 혼자 살아남아도 평생 후회하더라.");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "파멜라: 파멜리가 기분 나쁘게 해도 참아.%파멜라: 원래 이상한 새끼니까.");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "파멜라: 우리 사무소는 이름답게 창을 주무기로 사용하고 있어.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("오스카")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("쐐기 사무소")) {
	 	    				int num = rnd.nextInt(15);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0057");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0058");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0059");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0060");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0061");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "오스카: 완전한 야수 사냥의 밤이 시작되었다…%오스카: 뒤틀림…%오스카: 자네가 두려움에 떠는 순간 난 자네를 꿰뚫을 거야.%오스카: 우린 사냥꾼이지, 사냥감이 아니니…%q0062");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0063");
	 	    				} else if(num == 7) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0064");
	 	    				} else if(num == 8) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0065");
	 	    				} else if(num == 9) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0066");
	 	    				} else if(num == 10) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0067");
	 	    				} else if(num == 11) {
	 	    					new Message().msg(player, "오스카: 새벽 사무소에서 협력 의뢰가 들어왔군.%오스카: 협력이라해도 사실상 우리 사무소 단독으로 처리해야 한다.%오스카: 사무소 명예에 먹칠하지 않도록 하게.%q0068");
	 	    				} else if(num == 12) {
	 	    					new Message().msg(player, "오스카: 어두운 비밀을 파해칠 시간이군…%오스카: 꼬맹이, 너는 외곽을 조사하러 간다.%오스카: 좋은 유물을 얻게 될지 누가 알겠는가.%q0069");
	 	    				} else if(num <= 14) {
	 	    					new Message().msg(player, "오스카: 지지 않는 싸움을 하는 법을 알고있나?%오스카: 나를 알고 상대를 아는 것이라네.%오스카: 사무소의 등급을 높히는 방법은 알고 있나?%"
	 	    							+ "오스카: 지금보다 더 어려운 의뢰들을 해결하면 된다네.%오스카: 우리는 앞으로 뒤틀림을 사냥하는 사냥꾼이 될거다.%오스카: 지금은 도시 질병급 뒤틀림을 사냥하지만…%"
	 	    							+ "오스카: 장차 앞으로는 도시 악몽이나 도시의 별급 뒤틀림도 사냥하게 되겠지.%오스카: 그러기 위해서는 그들에 대한 정보가 필요하다네.%"
	 	    							+ "오스카: 난 자네가 그 정보를 모아줬으면 좋겠어.%q0070%오스카: 도시 악몽급 이상의 뒤틀림을 조사하는 일이라네.%오스카: 사냥에 성공하라는 말이 아니야…%"
	 	    							+ "오스카: 녀석들과 전투를 하면서 파악을 하라는 것이다.");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 4)) {
		 	    			int num = rnd.nextInt(8);
		 	    			if(num == 0) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0057");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0058");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0059");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0060");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "오스카: 뒷골목에 핏기 없는 자들이 행보하고 있다는군…%오스카: 그들에게 악몽을 경험시켜주고 오게.%오스카: 인간 사냥의 밤이 시작될테니…%q0061");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "오스카: 완전한 야수 사냥의 밤이 시작되었다…%오스카: 뒤틀림…%오스카: 우린 사냥꾼이지, 사냥감이 아니라는 것을 명심하게.%q0062");
	 	    				} else if(num == 6) {
	 	    					new Message().msg(player, "오스카: 어두운 비밀을 파해칠 시간이군…%오스카: 외곽을 조사하러 가시게.%오스카: 좋은 유물을 얻게 될지 누가 알겠는가.%q0069");
	 	    				} else if(num == 7) {
	 	    					new Message().msg(player, "오스카: 지지 않는 싸움을 하는 법을 알고있나?%오스카: 나를 알고 상대를 아는 것이라네.%오스카: 사무소의 등급을 높히는 방법은 알고 있나?%"
	 	    							+ "오스카: 지금보다 더 어려운 의뢰들을 해결하면 된다네.%오스카: 우리는 앞으로 뒤틀림을 사냥하는 사냥꾼이 될거다.%오스카: 지금은 도시 질병급 뒤틀림을 사냥하지만…%"
	 	    							+ "오스카: 장차 앞으로는 도시 악몽이나 도시의 별급 뒤틀림도 사냥하게 되겠지.%오스카: 그러기 위해서는 그들에 대한 정보가 필요하다네.%"
	 	    							+ "오스카: 난 자네가 그 정보를 모아줬으면 좋겠어.%q0070%오스카: 도시 악몽급 이상의 뒤틀림을 조사하는 일이라네.%오스카: 사냥에 성공하라는 말이 아니야…%"
	 	    							+ "오스카: 녀석들과 대치를 하면서 파악을 하라는 것이다.");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "오스카: 우리는 사냥꾼이라네.%오스카: 뒤틀림에 대한 의뢰라면 받아주지.");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0056")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(9);
						if(player.getInventory().contains(food)) {
							new Message().msg(player, "오스카: 이게 그 필립군의 쌍화차인가…");
							
							player.getInventory().remove(food);
							int qNum = qb.getNum(player);
	        				qb.q0056(player, qNum + 1, false);
						} else {
							new Message().msg(player, "오스카: 살바도르가 그 쌍화차를 굉장히 칭찬하더군.%오스카: 그래서 차는 어디에 있는가?");
						}
	 	    		} else {
	 	    			if(office.equals("쐐기 사무소")) {
	 	    				new Message().msg(player, "오스카: 이타적인 행동이라는 건 인간에게 있을 수 없다네.%오스카: 누군가를 위해서 목숨을 바치겠다는 것도 자신을 위한 것이야.%오스카: 내가 자네의 편의를 봐주는 것도 한계가 있다는 말이지.");
		 	    		} else if(office.equals("무소속")) {
		 	    			new Message().msg(player, "오스카: 이타적인 행동이라는 건 인간에게 있을 수 없다네.%오스카: 누군가를 위해서 목숨을 바치겠다는 것도 자신을 위한 것이야.%오스카: 내가 자네의 편의를 봐주는 것도 한계가 있다는 말이지.");
		 	    		} else {
		 	    			new Message().msg(player, "오스카: 우리는 사냥꾼이라네.%오스카: 뒤틀림에 대한 의뢰라면 받아주지.");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("보노")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "보노: 날개의 특이점을 어설프게 캐내려 하다간 인생 종치는거야.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "보노: 2억안짜리 의뢰든 지팡이 사무소의 의뢰든 목숨을 걸진 않을거야.%보노: 다들 돈이면 환장한다니까?");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "보노: 전신의체로 바꿔서 그런진 모르겠지만…%보노: 점점 생각도 기계처럼 변하는 것 같아.%보노: 명확한 답이나 근거 있는 일이 아니라면 불안해.%보노: 뇌만은 순수한 인간의 것인데…");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "보노: N사에는 이단심문관이라는 의체 혐오집단이 있대.%보노: 의체를 사용 중인 사람들을 못과 망치로 처참히 죽여버린다는데…%보노: 그러고는 시체가 땅에 닿지 않게 꼬치에 매달기까지 한다더라.%"
	 	    					+ "보노: 같은 의체 동지인 발톱이 나타나서 싹 몰살시켰으면 좋겠어.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("달록")) {
	 	    		int num = rnd.nextInt(4);
	 	    		if(num == 0) {
	 	    			new Message().msg(player, "달록: 내가 달록이고, 대표가 알록이야.%달록: 틀리지 말라고.");
	 	    		} else if(num == 1) {
	 	    			new Message().msg(player, "달록: 우리 사무소는 지팡이 사무소에서 직접 의뢰를 받기도 하지.%달록: 위험한 일도 있긴하지만 보수는 확실하다고?");
	 	    		} else if(num == 2) {
	 	    			new Message().msg(player, "달록: 언젠가는 특이점에 대한 정보도 알아내고야 말겠어…");
	 	    		} else if(num == 3) {
	 	    			new Message().msg(player, "달록: 얼굴에 화면 잘 나오고 있어?%달록: 가끔 방전되기도 한단 말이야.");
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("알록")) {
	 	    		if(getQuestName(player) == null) {
	 	    			player.getInventory().remove(Material.PAPER);
	 	    			player.getEnderChest().remove(Material.PAPER);
	 	    			if(office.equals("시선 사무소")) {
	 	    				int num = rnd.nextInt(6);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 누군가를 감시하는 일이야.%알록: 이번에는 좀 높으신 분들을 대상으로 하는 일이라,%"
	 	    							+ "알록: 우리가 평소에 쓰던 관측 장치로는 힘들어.%알록: 그래서 네가 지팡이 사무소로 가서 관측 장치를 가져와줬으면 해.%q0071");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "알록: 요즘 뒤틀림이라는 것이 도시를 망치고 있다면서?%알록: 직접적인 피해만 주지 않는다면 오히려 좋지.%알록: 뒤틀림에 대한 정보는 아주 비싸게 판매된다고.%"
	 	    							+ "알록: 의체 유지비며 기름값이며 사무소 월세며…%알록: 돈 나갈 구멍이 산더미였는데 아주 잘된거지.%알록: 그러니 네가 뒤틀림과 싸우는 장면을 우리가 녹화해서 팔면 아주 좋겠지?%"
	 	    							+ "알록: 뭐 팔다리 하나 잘려도 우리가 의체로 바꿔줄테니까…%알록: 명예와 돈을 위해 힘써주길 바랄게.%q0072");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "알록: 최근에 W사에서 외곽으로 가는 열차를 만들었다고 하더라?%알록: 외곽의 유적은 아직 협회에서도 제대로 파악하지 못한 미지의 세계야.%"
	 	    							+ "알록: 그런 곳을 공략해버리는 영상이 있으면 돈이 되지 않겠어?%알록: 내가 초소형 관측 장치를 몸에 부착시켜줄게.%알록: 가서 유적을 공략하고 와줘.%알록: 가는 김에 W사의 특이점에 대한 비밀도 밝혀주면 더 고맙고.%q0073");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 마침표 사무소의 리웨이에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0074%알록: 이걸로 시 협회가 어디를 노리고 있는지 미리 알 수 있겠지.");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 새벽 사무소의 필립에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0075%알록: 이걸로 전설의 쌍화차의 비법을 지팡이 사무소에서 밝혀낼지도 모르겠어.");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 쐐기 사무소의 오스카에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0076%알록: 이걸로 오스카가 늑대인간이라는 소문이 진짜인지 확인할 수도 있겠지.");
	 	    				}
		 	    		} else if(office.equals("무소속") && (new PlayerGrade().returnGrade(player) >= 4)) {
		 	    			int num = rnd.nextInt(6);
	 	    				if(num == 0) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 우리가 평소에 쓰던 관측 장치로는 불가능한 일이라…%알록: 지팡이 사무소로 가서 관측 장치를 가져와줬으면 해.%q0071");
	 	    				} else if(num == 1) {
	 	    					new Message().msg(player, "알록: 요즘 뒤틀림이라는 것이 도시를 망치고 있다면서?%알록: 직접적인 피해만 주지 않는다면 오히려 좋지.%알록: 뒤틀림에 대한 정보는 아주 비싸게 판매된다고.%"
	 	    							+ "알록: 의체 유지비며 기름값이며 사무소 월세며…%알록: 돈 나갈 구멍이 산더미였는데 아주 잘된거지.%알록: 그러니 네가 뒤틀림과 싸우는 장면을 우리가 녹화해서 팔면 아주 좋겠지?%"
	 	    							+ "알록: 뭐 팔다리 하나 잘려도 우리가 의체로 바꿔줄테니까…%알록: 무소속 해결사면 전투에 자신 있는거 아니야?%q0072");
	 	    				} else if(num == 2) {
	 	    					new Message().msg(player, "알록: 최근에 W사에서 외곽으로 가는 열차를 만들었다고 하더라?%알록: 외곽의 유적은 아직 협회에서도 제대로 파악하지 못한 미지의 세계야.%"
	 	    							+ "알록: 그런 곳을 공략해버리는 영상이 있으면 돈이 되지 않겠어?%알록: 내가 초소형 관측 장치를 몸에 부착시켜줄게.%알록: 가서 유적을 공략하고 와줘.%"
	 	    							+ "알록: 우리는 여기서 지켜보고 있을게.%알록: 절대 무서워서 그러는건 아니야.%q0073");
	 	    				} else if(num == 3) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 마침표 사무소의 리웨이에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0074%알록: 그쪽에 의뢰를 구하러 온 것처럼 가서 몰래 작업하면 될거야.");
	 	    				} else if(num == 4) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 새벽 사무소의 필립에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0075%알록: 그쪽에 의뢰를 구하러 온 것처럼 가서 몰래 작업하면 될거야.");
	 	    				} else if(num == 5) {
	 	    					new Message().msg(player, "알록: 지팡이 사무소에서 의뢰가 들어왔어.%알록: 쐐기 사무소의 오스카에게 관측 장치를 부착하는 일이야.%알록: 걱정마. 들킬 위험은 없어.%알록: 사용할 장치는 눈에 보이지 않는 무소음 초소형 드론이니까.%"
	 	    							+ "알록: 너는 말을 거는 척 잠시 몸에 손을 대기만 하면 된다고.%q0076%알록: 그쪽에 의뢰를 구하러 온 것처럼 가서 몰래 작업하면 될거야.");
	 	    				}
		 	    		} else {
		 	    			new Message().msg(player, "알록: 우리는 정보 조사 전문 사무소야.%알록: 전투 관련 의뢰는 다른 곳을 알아보라고.");
		 	    		}
	 	    		} else if (getQuestName(player).equals("q0071_1")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(10);
						if(player.getInventory().contains(food)) {
							new Message().msg(player, "알록: 이게 그 신형 장치구나?%알록: 고마워.");
							
							player.getInventory().remove(food);
							int qNum = qb.getNum(player);
	        				qb.q0056(player, qNum + 1, false);
						} else {
							new Message().msg(player, "알록: 지팡이 사무소는 둥지 제일 안쪽에 있어.%알록: 거리가 머니까 빨리 출발하는게 좋을거야.");
						}
	 	    		} else {
	 	    			if(office.equals("시선 사무소")) {
	 	    				new Message().msg(player, "알록: 이미 우리 사무소에 소속된 순간, 너의 위치 정보는 실시간으로 알 수 있어.%알록: 일 안하고 농땡이 피우면 해고시킬거야.");
		 	    		} else if(office.equals("무소속")) {
		 	    			new Message().msg(player, "알록: 돈을 벌려면 쉬지 않고 움직여야 한단다.");
		 	    		} else {
		 	    			new Message().msg(player, "알록: 우리는 정보 조사 전문 사무소야.%알록: 전투 관련 의뢰는 다른 곳을 알아보라고.");
		 	    		}
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("디모르포돈")) {
	 	    		if(getQuestName(player) == null) {
	 	    			
	 	    		} else if (getQuestName(player).equals("q0017")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "디모르포돈: 가로등 사무소로 전하는 물건이오.");
						int qNum = qb.getNum(player);
        				qb.q0017(player, qNum + 1, false);
	 	    		} else if (getQuestName(player).equals("q0033")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(6);
						if(player.getInventory().contains(food)) {
							new Message().msg(player, "디모르포돈: 잘 받았소.%디모르포돈: 상부에는 내가 전하지.");
							
							player.getInventory().remove(food);
							int qNum = qb.getNum(player);
	        				qb.q0033(player, qNum + 1, false);
						} else {
							new Message().msg(player, "디모르포돈: 보고서를 가지고 온게 아니오?");
						}
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("크테노카스마")) {
	 	    		if(getQuestName(player) == null) {
	 	    			
	 	    		} else if (getQuestName(player).equals("q0018")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "크테노카스마: 이걸 산에게 전해주면 될거야.");
						int qNum = qb.getNum(player);
        				qb.q0018(player, qNum + 1, false);
	 	    		} else {
	 	    			
	 	    		}
	 	    	} else if(npc.getText().get(0).equals("발렌틴")) {
	 	    		if(getQuestName(player) == null) {
	 	    			
	 	    		} else if (getQuestName(player).equals("q0041")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			new Message().msg(player, "발렌틴: 부장님께서 맡겨놓은 물건이다…");
						int qNum = qb.getNum(player);
        				qb.q0041(player, qNum + 1, false);
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
	 	    	} else if(npc.getText().get(0).equals("바다")) {
	 	    		//수표 상인
	 	    		new Shop13(player);
	 	    		new Message().msg(player, "바다: 수표는 B사에서 직접 발행한 것입니다.%바다: 진품임은 저희가 보장합니다."); 
	 	    	} else if(npc.getText().get(0).equals("묘")) {
	 	    		if(getQuestName(player) == null) {
	 	    			new Message().msg(player, "묘: 뒤틀림의 정보를 보고 있는 중이야.%묘: 너도 죽기 싫으면 봐두는게 좋을걸?");
	 	    		} else if (getQuestName(player).equals("q0020")) {
	 	    			QuestBoard qb = new QuestBoard();
	 	    			Location chestLoc = new Location(player.getWorld(), -1140, 166, 1468);
						Block block = chestLoc.getBlock();
						Chest chest = (Chest) block.getState();
						ItemStack food = chest.getInventory().getItem(4);
						if(player.getInventory().contains(food)) {
							player.getInventory().remove(food);
							new Message().msg(player, "묘: 올가가 또 편지를 보냈구나?%묘: 풀이나 보낼 것이지…%묘: 종이는 먹지도 못한다고.");
							int qNum = qb.getNum(player);
	        				qb.q0020(player, qNum + 1, false);
						} else {
							new Message().msg(player, "묘: 뭘봐?");
						}
	 	    		} else {
	 	    			new Message().msg(player, "묘: 뒤틀림의 정보를 보고 있는 중이야.%묘: 너도 죽기 싫으면 봐두는게 좋을걸?");
	 	    		}
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