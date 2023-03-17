package testPack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
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
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.SpectralArrow;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zoglin;
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
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;
import com.connorlinfoot.titleapi.TitleAPI;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.events.NPCInteractEvent;

import java.util.Random;

public class Main extends JavaPlugin implements Listener{
	
	// gamerule doMobLoot false
	// gamerule doMobSpawning false
	// gamerule keepInventory true
	// gamerule doImmediateRespawn true
	// gamerule doLimitedCrafting true
	// gamerule mobGriefing false
	// gamerule doWeatherCycle false
	
	//유물 효과: 회피, 위더/독/불 피해 %감소, 공격으로 받는 피해 %감소, 공격으로 주는 피해 %증가 등등
	//유물은 인벤 맨 아래 9칸 사용 / 숲유적, 요정왕국, 아덴, 카루, 아라크네, 사막, 슬라임, 하드바다, 하드요정
	
	Random rnd = new Random();
	World world;

	Scoreboard board;
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		//custom command
		getCommand("killMe").setExecutor(new Cmd1killme());
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
		getCommand("setSkin").setExecutor(new Cmd24setSkin());
		getCommand("velocity").setExecutor(new Cmd27velocity());
		getCommand("target").setExecutor(new Cmd28target());
		getCommand("setNick").setExecutor(new Cmd30setNick());
		getCommand("t").setExecutor(new Cmd31tp());
		
		new RefreshServer();
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
		player.setResourcePack("https://cdn.discordapp.com/attachments/557875773617340416/923835992559976458/aile_texture_pack_46.zip");
		
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
						fw.write("-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1/-1"); //보급
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
		if(player.getInventory().getItem(8).getType() != Material.ACACIA_DOOR) { //플레이 중에만 가지고 있는 무언가를 판별, ACACIA_DOOR이 해결사 면허증
			player.teleport(new Location(world,-1844,70,3012)); //로비로 이동
		}

		// npc 생성
		new NPCManager(player, 0);

	}
	
	@EventHandler
	public void reSpawn(PlayerRespawnEvent event) {
		try {
			Player player = event.getPlayer();
			//해결사 레벨+경치량에 비례해서 광기 지급 (+사념파 메세지)
			
			player.getInventory().clear();
			player.setLevel(0); //그냥 초기화
			//퀘스트 초기화
			
			event.setRespawnLocation(new Location(world,-1844,70,3012));
		} catch(Exception e11) {

		}
	}
	
	@EventHandler
	public void die(PlayerDeathEvent event) {
		event.setDeathMessage(null);
		// 서버에 사망 메세지 출력
		try {
			Player player = (Player) event.getEntity();
			System.out.println(ChatColor.RED + "" + player.getDisplayName() + " 사망");
		} catch (Exception e) {

		}
		
		try {
			Player player = (Player)event.getEntity();
			TitleAPI.sendTitle(player, 20, 60, 20, ChatColor.RED + "Game Over");
		} catch(Exception e) {
			
		}
	}
	
	@EventHandler
	public void consumeItem(PlayerItemConsumeEvent event) {
		Player player = event.getPlayer();
		try {
			//K사 혈청 - 매우 비싸다고 묘사가 되어있음
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "힐링 포션 I")) {
				
			}
			
			//특이 포션
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "엘릭서")) {
				for(PotionEffect effect : player.getActivePotionEffects ()){
			        player.removePotionEffect(effect.getType());
			    }
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "냉기의 포션")) {
				player.setFireTicks(0);
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바람의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,2400,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "바위의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE,1800,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "근육의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE,1800,10,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.WHITE + "도약의 포션 I")) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,1200,0,true,true));
			}
			if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.YELLOW + "코코넛 음료")) {
				player.removePotionEffect(PotionEffectType.ABSORPTION);
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 6, 0,true,true));
				player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 0,true,true));
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
			try {
				if(entity.getType() == EntityType.ZOMBIE || entity.getType() == EntityType.SKELETON || entity.getType() == EntityType.WITHER_SKELETON
						|| entity.getType() == EntityType.WITCH || entity.getType() == EntityType.VEX || entity.getType() == EntityType.HUSK) {
					if(entity.getCustomName() == null) {
						entity.remove();
					}
				}
			} catch(Exception e) {
				
			}
		} catch(Exception e3) {
			
		}
	}
	
	@EventHandler
	public void dropItem(PlayerDropItemEvent event) {
		Player player = (Player) event.getPlayer();
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
							
							|| item.getType() == Material.LEATHER_HELMET || item.getType() == Material.LEATHER_CHESTPLATE || item.getType() == Material.LEATHER_LEGGINGS 
							|| item.getType() == Material.LEATHER_BOOTS || item.getType() == Material.CHAINMAIL_HELMET || item.getType() == Material.CHAINMAIL_CHESTPLATE 
							|| item.getType() == Material.CHAINMAIL_LEGGINGS || item.getType() == Material.CHAINMAIL_BOOTS || item.getType() == Material.IRON_HELMET 
							|| item.getType() == Material.IRON_CHESTPLATE || item.getType() == Material.IRON_LEGGINGS || item.getType() == Material.IRON_BOOTS 
							|| item.getType() == Material.GOLDEN_HELMET || item.getType() == Material.GOLDEN_CHESTPLATE || item.getType() == Material.GOLDEN_LEGGINGS 
							|| item.getType() == Material.GOLDEN_BOOTS || item.getType() == Material.DIAMOND_HELMET || item.getType() == Material.DIAMOND_CHESTPLATE 
							|| item.getType() == Material.DIAMOND_LEGGINGS || item.getType() == Material.DIAMOND_BOOTS || item.getType() == Material.NETHERITE_HELMET
							|| item.getType() == Material.NETHERITE_CHESTPLATE || item.getType() == Material.NETHERITE_LEGGINGS || item.getType() == Material.NETHERITE_BOOTS
							|| item.getType() == Material.CARVED_PUMPKIN)) {
				event.setCancelled(true);
				return;
			}
		} catch(Exception e) {
			
		}
		
		//기타 아이템 드랍 불가
		if (event.getItemDrop().getItemStack().getType() == Material.NETHER_STAR) {
			event.setCancelled(true);
			return;
		}
	}
	
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event){
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
				|| event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.ARMOR_STAND) {
			event.setCancelled(true);
			return;
		}

		//발광화살 히트 불가
		try {
			if (event.getDamager() instanceof SpectralArrow) {
				event.setCancelled(true);
				return;
			}
		} catch (Exception e) {

		}

		//파이어볼 히트 불가
		try {
			if(event.getEntity() instanceof Fireball) {
				event.setCancelled(true);
			}
		} catch (Exception e) {

		}
		
		//인격에 따른 버프
		try {
			if (event.getDamager() instanceof Player) {
				Player player = (Player) event.getDamager();
				PlayerJobBuff buff = new PlayerJobBuff();
				buff.playerBuff(player);
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
				
				PlayerHitDebuff debuff = new PlayerHitDebuff();
				debuff.playerHitDebuff(player, entity);
			}
		} catch (Exception e) {

		}
	}
	
	@EventHandler
	public void skillDamage(EntityDamageEvent event) {
		
		//데미지 0이하면 패스
		if(event.getDamage() <= 0) {
			event.setCancelled(true);
			return;
		}
		
		//무적인 엔티티
		if(event.getEntity().getType() == EntityType.PIG || event.getEntity().getType() == EntityType.COW 
				|| event.getEntity().getType() == EntityType.CHICKEN || event.getEntity().getType() == EntityType.SHEEP || event.getEntity().getType() == EntityType.VILLAGER
				|| event.getEntity().getType() == EntityType.HORSE || event.getEntity().getType() == EntityType.SKELETON_HORSE || event.getEntity().getType() == EntityType.ZOMBIE_HORSE
				|| event.getEntity().getType() == EntityType.WOLF || event.getEntity().getType() == EntityType.CAT || event.getEntity().getType() == EntityType.DONKEY
				|| event.getEntity().getType() == EntityType.ITEM_FRAME || event.getEntity().getType() == EntityType.DROPPED_ITEM) {
			event.setCancelled(true);
			return;
		}
		
		//플레이어 피격 데미지 계산식
		try {
			if(!(event.getEntity() instanceof Player)) {
				double damage = event.getDamage();
				
				int personality = 0;
				int enforce = 0; //10이면 10% 경감
				
				damage = (damage - personality) * (100 - enforce) * 0.01;
				
				event.setDamage(damage);
			}
		} catch(Exception e) {
			
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
		
		// 데미지 처리
		try {
			if (event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.FIRE || event.getCause() == DamageCause.HOT_FLOOR) {
				
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
					
				}
			} else if (event.getCause() == DamageCause.WITHER) {
				if (event.getEntity() instanceof Player) {
					
				}
			} else if (event.getCause() == DamageCause.BLOCK_EXPLOSION) {
				
			} else if (event.getCause() == DamageCause.ENTITY_EXPLOSION) {
				
			} else if(event.getCause() == DamageCause.STARVATION) {
				Player player = (Player) event.getEntity();
				event.setDamage(player.getMaxHealth());
			}
		} catch(Exception e){
			
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
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#808080") + Integer.toString(damage));
					} else if(damage < 200) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#B4B4B4") + Integer.toString(damage));
					} else if(damage < 300) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#E5E5E5") + Integer.toString(damage));
					} else if(damage < 400) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#EFEFEF") + Integer.toString(damage));
					} else if(damage < 500) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#FFFFFF") + Integer.toString(damage));
					} else if(damage < 600) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#f2ffeb") + Integer.toString(damage));
					} else if(damage < 700) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#e0ffcf") + Integer.toString(damage));
					} else if(damage < 800) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ccffb0") + Integer.toString(damage));
					} else if(damage < 900) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#b3ff8a") + Integer.toString(damage));
					} else if(damage < 1000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#9dff69") + Integer.toString(damage));
					} else if(damage < 2000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#7fff3b") + Integer.toString(damage));
					} else if(damage < 3000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#1aff00") + Integer.toString(damage));
					} else if(damage < 4000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ff77") + Integer.toString(damage));
					} else if(damage < 5000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00ffc3") + Integer.toString(damage));
					} else if(damage < 6000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00fff7") + Integer.toString(damage));
					} else if(damage < 7000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00d0ff") + Integer.toString(damage));
					} else if(damage < 8000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#00aeff") + Integer.toString(damage));
					} else if(damage < 9000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#008cff") + Integer.toString(damage));
					} else if(damage < 10000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#0062ff") + Integer.toString(damage));
					} else if(damage < 20000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#002aff") + Integer.toString(damage));
					} else if(damage < 30000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#3c00ff") + Integer.toString(damage));
					} else if(damage < 40000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8c00ff") + Integer.toString(damage));
					} else if(damage < 50000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#c300ff") + Integer.toString(damage));
					} else if(damage < 60000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00f7") + Integer.toString(damage));
					} else if(damage < 70000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff00b3") + Integer.toString(damage));
					} else if(damage < 80000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0080") + Integer.toString(damage));
					} else if(damage < 90000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0048") + Integer.toString(damage));
					} else if(damage < 100000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ff0000") + Integer.toString(damage));
					} else if(damage < 200000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ab0000") + Integer.toString(damage));
					} else if(damage < 300000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#630000") + Integer.toString(damage));
					} else if(damage < 400000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#8f0062") + Integer.toString(damage));
					} else if(damage < 500000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#70008f") + Integer.toString(damage));
					} else if(damage < 600000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#420054") + Integer.toString(damage));
					} else if(damage < 10000000) {
						damageSign.setCustomName(ChatColor.BOLD + "" + ChatColor.MAGIC + Integer.toString(damage));
					} else {
						damageSign.setCustomName(ChatColor.BOLD + "" + net.md_5.bungee.api.ChatColor.of("#ffffff") + Integer.toString(damage));
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
		// 스크롤 사용
		try {
			EquipmentSlot e = event.getHand();
			if (e.equals(EquipmentSlot.HAND)) {
				Player player = event.getPlayer();
				if ((event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR)) {
					ItemStack item = player.getInventory().getItemInMainHand();
					Material type = item.getType();
					if((type == Material.CREEPER_BANNER_PATTERN) || (type == Material.FLOWER_BANNER_PATTERN) || (type == Material.GLOBE_BANNER_PATTERN)
							|| (type == Material.MOJANG_BANNER_PATTERN) || (type == Material.PIGLIN_BANNER_PATTERN) || (type == Material.SKULL_BANNER_PATTERN)
							|| (type == Material.PAINTING) || (type == Material.ACACIA_DOOR) || (type == Material.PAPER)  || (type == Material.IRON_HELMET)) {
						new ScrollUseEvent(player, item);
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
		
		//커맨드형 스킬
		try {
			EquipmentSlot e = event.getHand(); 
	        if (e.equals (EquipmentSlot.HAND)) {
	        	Player player = event.getPlayer();
	        	try {	    
	    			if(player.getVehicle() == null) {
	    				if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        				Inventory inv = player.getInventory();
	        				ItemStack item = player.getInventory().getItemInMainHand();
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
	    			int i = 0;
					Inventory inv = player.getInventory();
					for (int j = 0 ; j < 36 ; j++) {
						if(inv.getItem(j) == null) {
							i++;
						}
					}
	    			if(block.getType()==Material.CHEST && block.getX()==-1977 && block.getY()==83 && block.getZ()==2950) {
	    				if(qb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===해적선의 보물===")) {
	    					if (i != 0) {
	    						int qNum = qb.getNum(player);
		    					qb.q2(player, qNum+1);	
							} else {
								player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
							}
	    				}	    		
	    				event.setCancelled(true);
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
							qb.q1(player, qNum + 1);
						} else {
							player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
						}

					}
				}
			}
		} catch(Exception e) {
			
		}	
		
		//커맨드형 스킬
		try {
			Player player = event.getPlayer();
			Inventory inv = player.getInventory();
			ItemStack item = player.getInventory().getItemInMainHand();
			if(event.getAnimationType() == PlayerAnimationType.ARM_SWING && player.getVehicle() == null) {	    
				
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
		if (loc.getX() <= 3785 && loc.getY() <= 28 && loc.getZ() <= 3746 && 
				loc.getX() >= 3725 && loc.getY() >= 0 && loc.getZ() >= 3700) {
			event.setCancelled(true);
		} else if (loc.getX() <= -1819 && loc.getY() <= 101 && loc.getZ() <= 3061 && 
				loc.getX() >= -1854 && loc.getY() >= 84 && loc.getZ() >= 3031) {
			event.setCancelled(true);
		} else if (loc.getX() >= 10000) {
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
			// 말 타기
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
		}
	}
	
	@EventHandler
	public void feedEvent(PlayerInteractAtEntityEvent event) {
		event.setCancelled(true);
	}
	
	@EventHandler
	public void clickInv(InventoryClickEvent event) {
		
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

			// 못건드리는 템
			try {
				ItemStack clicked = event.getCurrentItem();
		        if(clicked != null && clicked.getType() == Material.ACACIA_DOOR) {
		            event.setCancelled(true);
		            return;
		        }
		        if(clicked != null && clicked.getType() == Material.NETHER_STAR) {
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
		            event.setCancelled(true);
		            return;
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
			player.damage(999);
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
	public void onNPCInteract(NPCInteractEvent event){
	    Player player = event.getPlayer();
	    try {
	    	int i = 0;
			Inventory inv = player.getInventory();
			for (int j = 0 ; j < 36 ; j++) {
				if(inv.getItem(j) == null) {
					i++;
				}
			}
			if(i == 0) {
				player.sendMessage(ChatColor.RED + "인벤토리에 빈칸이 없습니다.");
				return;
			}
	    } catch(Exception e) {
	    	
	    }
	    
	    try {
	    	QuestBoard cb = new QuestBoard();
	    	NPC npc = event.getNpc();
	    	NPCInteractEvent.ClickType clickType = event.getClickType();
	 	    if(npc.isShown() && clickType == NPCInteractEvent.ClickType.RIGHT_CLICK) {
	 	    	if(npc.getText().get(0).equals("의문의 소녀")) {
	 	    		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희3===")) {
	 	    			player.sendMessage("의문의 소녀: ...");
	 	    		}
	 	    		if(cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===설원의 가희2===")) {
	 	    			if(player.getWorld().getTime() >= 13000 && player.getWorld().getTime() <= 23000) {
							int qNum = cb.getNum(player);
							cb.q1(player, qNum+1);
						} else {
							player.sendMessage("의문의 소녀: ...");
						}
	 	    		}
	 	    	}
	 	    } else if(npc.isShown() && clickType == NPCInteractEvent.ClickType.LEFT_CLICK) {
	 	    	if(npc.getText().get(0).equals("의장")) {
	 	    		
	 	    	}
	 	    }
	    } catch(Exception e) {
	    	
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