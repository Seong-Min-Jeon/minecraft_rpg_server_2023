package testPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cmd20LoveWood implements CommandExecutor {
	
	private static HashMap<Player, HashMap<Location, ArrayList<Block>>> copy = new HashMap<>();
	private static HashMap<Player, ArrayList<HashMap<Location, Material>>> undoHash = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			int size = 0;
			
			if(player.isOp() == false) {
				return false;
			}
			if(cmd.getName().equalsIgnoreCase("LoveWood")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.RED + "LoveWood [Size] [Copy/Paste]");
					return true;
				}
				try { 
					try {
						size = Integer.parseInt(args[0]);
						if(size > 30) {
							player.sendMessage(ChatColor.RED + "ookii sugi");
						} else if(size < 1) {
							player.sendMessage(ChatColor.RED + "chiisai sugi");
						}
					} catch(Exception e) {
						player.sendMessage(ChatColor.RED + "Size ha suuji de kudasai");
					}
				} catch(Exception e) {
					return true;
				}
				try { 				
					if(args[1].equalsIgnoreCase("copy") || args[1].equalsIgnoreCase("c")) {
						if(size != 0) {
							Location loc = player.getLocation();
							HashMap<Location, ArrayList<Block>> map;
							ArrayList<Block> ary = new ArrayList<>();
							
							if(copy.containsKey(player)) {
			                	map = copy.get(player);
			                	map.clear();
			                } else {
			                	copy.put(player, new HashMap<Location, ArrayList<Block>>());
			                	map = copy.get(player);
			                	map.clear();
			                }
							
						    for(int x = (size * -1); x <= size; x++) {
						        for(int y = (size * -1); y <= 255; y++) {
						            for(int z = (size * -1); z <= size; z++) {
						                Block b = loc.getWorld().getBlockAt(loc.getBlockX() + x, loc.getBlockY() + y, loc.getBlockZ() + z);
						                if(b.getType() == Material.OAK_LOG || b.getType() == Material.SPRUCE_LOG || b.getType() == Material.BIRCH_LOG
						                		 || b.getType() == Material.JUNGLE_LOG || b.getType() == Material.ACACIA_LOG || b.getType() == Material.DARK_OAK_LOG
						                		 || b.getType() == Material.CRIMSON_STEM || b.getType() == Material.WARPED_STEM || b.getType() == Material.STRIPPED_OAK_LOG
						                		 || b.getType() == Material.STRIPPED_SPRUCE_LOG || b.getType() == Material.STRIPPED_BIRCH_LOG || b.getType() == Material.STRIPPED_JUNGLE_LOG
						                		 || b.getType() == Material.STRIPPED_ACACIA_LOG || b.getType() == Material.STRIPPED_DARK_OAK_LOG || b.getType() == Material.STRIPPED_CRIMSON_STEM
						                		 || b.getType() == Material.STRIPPED_WARPED_STEM || b.getType() == Material.OAK_WOOD || b.getType() == Material.SPRUCE_WOOD
						                		 || b.getType() == Material.BIRCH_WOOD || b.getType() == Material.JUNGLE_WOOD || b.getType() == Material.ACACIA_WOOD
						                		 || b.getType() == Material.DARK_OAK_LOG || b.getType() == Material.CRIMSON_HYPHAE || b.getType() == Material.WARPED_HYPHAE
						                		 || b.getType() == Material.STRIPPED_OAK_WOOD || b.getType() == Material.STRIPPED_SPRUCE_WOOD || b.getType() == Material.STRIPPED_BIRCH_WOOD
						                		 || b.getType() == Material.STRIPPED_JUNGLE_WOOD || b.getType() == Material.STRIPPED_ACACIA_WOOD || b.getType() == Material.STRIPPED_DARK_OAK_LOG
						                		 || b.getType() == Material.STRIPPED_CRIMSON_HYPHAE || b.getType() == Material.STRIPPED_WARPED_HYPHAE || b.getType() == Material.OAK_LEAVES
						                		 || b.getType() == Material.SPRUCE_LEAVES || b.getType() == Material.BIRCH_LEAVES || b.getType() == Material.JUNGLE_LEAVES
						                		 || b.getType() == Material.ACACIA_LEAVES || b.getType() == Material.DARK_OAK_LEAVES || b.getType() == Material.WARPED_WART_BLOCK
						                		 || b.getType() == Material.LIME_STAINED_GLASS || b.getType() == Material.GREEN_STAINED_GLASS
						                		 || b.getType() == Material.LIME_STAINED_GLASS_PANE || b.getType() == Material.GREEN_STAINED_GLASS_PANE) {
						                	 ary.add(b);
						                }
						            }
						        }
						    }
						    map.put(loc, ary);
						    
						    player.sendMessage(ChatColor.GREEN + "copy kann riyou");
						}
					} else if(args[1].equalsIgnoreCase("paste") || args[1].equalsIgnoreCase("p")) {
						if(copy.containsKey(player)) {
							HashMap<Location, ArrayList<Block>> map;							
							map = copy.get(player);
							Location beforeLoc = null;
							ArrayList<Block> ary = new ArrayList<>();
							
							Set set = map.keySet();
							Iterator iterator = set.iterator();
							while(iterator.hasNext()){
								beforeLoc = (Location) iterator.next();
								ary = map.get(beforeLoc);
							}
							
							if(beforeLoc == null) {
								player.sendMessage(ChatColor.RED + "ERROR");
								return false;
							}
							Location afterLoc = player.getLocation();
							int x=0, y=0, z=0;
							x = (int)(afterLoc.getX() - beforeLoc.getX());
							y = (int)(afterLoc.getY() - beforeLoc.getY());
							z = (int)(afterLoc.getZ() - beforeLoc.getZ());
							
							if(ary == null) {
								player.sendMessage(ChatColor.RED + "ERROR");
								return false;
							}
							
							HashMap<Location, Material> undo = new HashMap<>();
							
							for(Block block : ary) {
								Location blockLoc = block.getLocation().add(x, y, z);
								undo.put(blockLoc, player.getWorld().getBlockAt(blockLoc).getType());
								player.getWorld().getBlockAt(blockLoc).setType(block.getType());
							}
							
							ArrayList<HashMap<Location, Material>> undoList = new ArrayList<>();
							if(undoHash.containsKey(player)) {
								undoList = undoHash.get(player);
								undoList.add(undo);
								undoHash.remove(player);
								undoHash.put(player, undoList);
							} else {
								undoList.add(undo);
								undoHash.put(player, undoList);
							}
								
							player.sendMessage(ChatColor.GREEN + "paste kann riyou");
						} else {
							player.sendMessage(ChatColor.RED + "copy wo sakini tsukatte kudasai");
						}
					} else if(args[1].equalsIgnoreCase("undo") || args[1].equalsIgnoreCase("u")) {
						if(undoHash.containsKey(player)) {
							ArrayList<HashMap<Location, Material>> undoList = undoHash.get(player);
							if(undoList == null) {
								player.sendMessage(ChatColor.RED + "ERROR");
								return false;
							}
							if(undoList.size() == 0) {
								player.sendMessage(ChatColor.RED + "undo suru kotoga naiyo");
								return false;
							}
							HashMap<Location, Material> undo = undoList.get(undoList.size()-1);
							undoList.remove(undoList.size()-1);
							undoHash.remove(player);
							undoHash.put(player, undoList);
							
							if(undo == null) {
								player.sendMessage(ChatColor.RED + "ERROR");
								return false;
							}
							
							Material mat = null;
							Location loc = null;
							Set set = undo.keySet();
							Iterator iterator = set.iterator();
							while(iterator.hasNext()){
								loc = (Location) iterator.next();
								mat = undo.get(loc);
								if(mat != null & loc != null) {
									player.getWorld().getBlockAt(loc).setType(mat);
								}
							}
							
							player.sendMessage(ChatColor.GREEN + "undo kann riyou");
						} else {
							player.sendMessage(ChatColor.RED + "undo suru kotoga naiyo");
						}
					} else {
						player.sendMessage(ChatColor.RED + "copy or paste wo tsukatte kudasai");
					}
				} catch(Exception e) {
					return true;
				}
			}
		}	
		return true;
	}
	

}
