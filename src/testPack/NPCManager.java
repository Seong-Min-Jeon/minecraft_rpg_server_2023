package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import dev.sergiferry.playernpc.api.NPC;
import dev.sergiferry.playernpc.api.NPC.GazeTrackingType;
import dev.sergiferry.playernpc.api.NPC.Slot;
import dev.sergiferry.playernpc.api.NPCLib;

public class NPCManager {

	QuestBoard qb = new QuestBoard();
	
	public NPCManager() {
		yoon();
		pin();
		eri();
		naoki();
		mac();
		taein();
		ruru();
		san();
		marth();
		mika();
		rein();
		olga();
		isadora();
		julia();
		walter();
		stepan();
		tamaki();
		riwei();
		yuna();
		philip();
		salbadol();
		
		//yumehama();
	}
	
	public NPC yoon() {
		Location loc = new Location(Bukkit.getWorld("world"), -1176.5, 67, 1177.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yoon", loc);
		npc.setText("윤");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTIyNTgxMjc0MCwKICAicHJvZmlsZUlkIiA6ICI0YmMzNDZlMmQ3OWU0NDYzYjlhYzlhZGVmYTdlNWQ3OCIsCiAgInByb2ZpbGVOYW1lIiA6ICJieGNrZXQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWIwNDg2YmQwMmMyYjIyZWMzYWU5N2I2MjBjNTgyMzc1NGYyMjYyY2QxMDY4YWM3MWI4MzIyNDI0ZjdkMTJjOSIKICAgIH0KICB9Cn0="
				, "cG2JgN9nIoZOzvXZ0qt4yW421AkOq/GMIXEoCFROy77JYVEvOJz8dlWPPzghPZ3RZJvq69PB9lr+1+ftCj7eJ5ZpHwH05AJogCF5nPKX/euASeIrhOkmNgR3dIHotDUSHgfWnADCUGeRqAG1mrjxvpGKIzzRyOv87/3l02Z5kFD9XTlfabBMAwESIyFEtK0znaLz8fRSkZd7m/s49b+fbcdolMBrCta/IAKJ+g3xSC9jA7SX0qluSWgpsb9C59xhoLu8UUlwWYer+7Hq6dJVqvbHiDFSZdNqjqHyT7n/5t3QNiv/OW+d0mIMqLhzZ/Udaid3PfVlPWp6i08aYYN2ev54kgV/zdDT06GiJaWiizYp1N4TYF2Skcp3tOuKhTggrhWhh9MTAi7m/Sylo6VRpauNyV+7s9+UiaTEJIjLzoa5aY9D14Qi5mn/k/Acp+6Q5rJtAAb5s0TsEwyFlI+BRaR3suOu+Y0tCECDNFve8KxwPl4xuhBnMYCSxMeX0BWnolNWUnLab2YlV7YAs/dfzLHk3A1qlVF2xBsG5lHm7TCZZzBmNXZBo8TqZx2MFZZZITAyg88GgieFw0pA5K/jRSumb+JYb2cA2FC+unLrrwWmrr7R1IHDNV12G/El53fhi10anI5C2eHS9DsLy2fGKFVqBYGdVcrgm6ddhBAZMq8=");
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC pin() {
		Location loc = new Location(Bukkit.getWorld("world"), -1175.5, 62, 1181.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "pin", loc);
		npc.setText("핀");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ2NDEzMTg3OSwKICAicHJvZmlsZUlkIiA6ICI2YWVkNmYzNzI5OWY0ZmM3YTQxOWNiYTFmOWE1YTcxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJkZXBsb3JldCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lNGY1OTBmMjI1OWRmZDhmZDM0ZmQzZjUzNzNlMjEzNDQxN2IwZmY2YTk2Yjg1MjM2NWYyOTU1M2ExM2UzZjAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "x/izaO+UOFyxPHBsV1sHeQ/g4gv9RKSaMGU+FoCi5YBQ0CRV22YbC6PvApZnqPikvzLeKJ9uyrjtGEpn8aW3Da68b4j+oII+Fek4GDG088xt6fXEfq2BbgLGRcumVybVoyq7Ut1o78NS9eiGmzoKghKXp3Tp5USXSx2LlBn7VVFE5K9we8HVOLDBV+x+2Kh54zR2qEvly4sHD/jKTajKsIvJuNqCGGDT8AYnkrrEyUQW20G6CXOuKzbg+hvEsnxxtQfJERjmBvWp1Zt8ciswEA3oit+1WIy4DjXfZOzLeXQOxYxulWGlk1cFUDiehyL9sx0gcJqw0kiIS1kYo2wG3EOvfvmkPxFCMO34AdClDRZXE+Kpj/0uYRkE7Y8XrJeQfFx7CT9iQOIbiBuTEhSp3ZUvrLQGB4xf9ixAVsCdnV4EGkJzdSGPJFZcCZLiQHEoQO6gnMXqOXtGcnDcpLvwbLzsUhSUgzSZQL2qHja6u2uPPHHdu8yRVecorhQ/h4TPniUoBYxHXDYyLK5l0DTrqqkZ+7GCJAt0kw5YRLpwofUU85R69823s8ODHfd7mZ6LDG20ZBAfvpqsLGJWxz25B9R3VIwpiPfje70sCD8DrRHfJYyrAJvnbriBZ409CzQMH3VNYa/aN3cHrTX1uZ5i1MFbPHtU4almYiRHzaO+8WQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC eri() {
		Location loc = new Location(Bukkit.getWorld("world"), -1171.5, 62, 1180.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "eri", loc);
		npc.setText("에리");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ2NDI5ODAzNCwKICAicHJvZmlsZUlkIiA6ICI5OGQ3YzNlZjVmZTE0ZjU1OTFlNDA3ZTI4Y2RhOWEyZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMMWxXM2lyZDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjQwZDFjODhlOTY4M2Q5ZTA4M2VjMjRkNTAzYzMyNzcwMTE0NTg4MjY0MmUwMTkwNmZlNDkwZjA3ODIyMzkxYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "AEg1shfhGwRsrbIr6BakWK5Y2n0ym7Zf6J15Bv7VDnuc37JBKVxheIii1nBFRYjGefJjMPT+NmKadqsn3LBBV5ZHc7Kd+FyhTXannPR7PwnpIIWMsEFc0fcEDikspfo8EEw69l6GVbyfnRl7gDIBTFiYEar6t9mh8Apo8Ck91MS+YuAL+T2VYNhfqsz/8igU8Ue/hBB+5hRaMj3zVxCSD/GgO9PjKdtwV0e+6UX/I8xqkH1Bm02SryPvigSnmUe3wbV5NUfp5YwLJU6zZgfCuY0X5rOtVV+xWA7We1GonN1av9/x6Z2lat23fqkDZE92dfxWmxiPzPUtUPfTUs30mU99DHvxjky4FHNYO+t41ajxqEuJwQ754UW+ziIvb5pBY4bFLKSQ+1oC1s8vkT+00WU9s5L1SOx8rgyptlDspooVue/P0w0BHGEERF1cfg1MsUl7Tkh4mfvwUrgfTGEWC1UwbDMGJZVCxyyba1yg/G2Qe9i2ghclZNXJAgXoKIPd+VewujKI6okn7xbC8uiUCvVQQdnjdVPEy9NDiqMdNwTZqzU+lmmVqA1dhJTDshF0yLPpcticaSi0GHkSHBQUlFgszolt4pcJlFVo8v3c7PlmCmKAXLzPJVzIoRRl8pMrLVQiXc3quavbxL4VlkZnN/FpwSo+q4RtOQMfJ5mYbCM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC naoki() {
		Location loc = new Location(Bukkit.getWorld("world"), -1042.5, 62, 1126.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "naoki", loc);
		npc.setText("나오키");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MTc3NTExOSwKICAicHJvZmlsZUlkIiA6ICJlMjVjMzI4YjIxODc0OWExODJkNDk5OTBiZDRjMWNlNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJuY3J3ZWdpYW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTI0MmYwNDdmNzc0ZjM4NDdmMmU3MDJhMTgwNmVlYTRkMzY0NWFhZTM1NmNjMWY0ZGM1NDE1MmJkN2UyNzU5OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "wq2YPSCWGyA06nlm/2kO2ko6sCNWMFmk/IHkz5N6BkKzpSt/OCyRz3du0tiNdQYxdMH3PyV75F+jNoOgXz+oIBUQT38gWFSuE6+Ea/fBkyia7g4fdtwNV96y2FNvKAAZPhmAA01LqNFrspwx8M1DhQgafMXCjmqByL69d5z6fXrQJ4ADJ3ewblfKG2fDHpSh4LN5r7jQOMrwln9RO0ozrfts1MNySAlx9GWI3raQw4YR2lLC48FmZN4NsMk7G9bchF9vJJPKljlCKu2M/PyemVqf/Own5XLpnRfZj+lWa41f/FH35jJ01kGq64M+vObSvfmFCvMe+4YImPqNzvMS/qBvXXe5nR5JXPJw1l7nBBvN4OSTNoVe/BUw7/d42FwzL8JywJycd0fvWec/x27g8xAm0j2UO9BGeBZuqaYfE/Dx4s9fM7cRXpHGUoqIjQC9f3LHTl+vuQoe6fe0Ed4Ao4CrI5zLNTVXDUB+ch3zBLx2H6YKAUw+sbYfO+KLDIiQk9DUHeHOOcEehKXXb40VUzY+PMTfs5zETjJaWsRy9R5uRR8NkFhu5mSaV8JNAn2RbZT13MCoMqTWxWTk5pokqT8SLggmx/syYeJbj/nB/2jIpiflFaEBOskNjT7PRB7PjAoibAGAXb+9XmjNtGqT9pRaEBFP+dxbCep6L6GVuXM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC mac() {
		Location loc = new Location(Bukkit.getWorld("world"), -1045.5, 62, 1131.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "mac", loc);
		npc.setText("맥컬린");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MTk3NDI1OSwKICAicHJvZmlsZUlkIiA6ICJmMDc3NmQxYjc4Yjk0OGQ4YTkzNThjMWFlMzc5ZTU0MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaHVhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2FmMmM4ZjY0MGU3ZTIzMzhlZjM5NGNjNmRiMzY1MjMyMDRmNjgxMTVkOTQ3MmQ2OGIyNDEwNTAyN2U4MDA5MzYiCiAgICB9CiAgfQp9"
				, "GT5/geQ15qjHVaORXx3elByOy3KZI0ozasP5RfwhSuwZpOXBfYHjUmmwRN0fiIvtY6vnknRWWKq+39Q+jPmayi9UUm5GK2B0GHdPegjIz348TByM6zb1XrJ5HjrCusUvB0zcJ5Bt/+5c0htQ4wFADOTSMGpUtL/NZxAcqA/A4qoPPSl6qYVWISYedezb4OL/thlkvAN+bTyIcsFzO+8RcGgbqeGazKmclfL9vvhlxaQBzXw22eG86nFapNtBC4bsgZohvwW3Vj4/fQQuzmi53JuUIH3vJiUVLvM2favluEFSqvpmDJP8LQ+U+m2NpFbXGQi8cB4iZJLJBL1xzmEgpkYTpmtawvlhokO/NE0aePevYCiqbNP6FEhRMZUZ8+2ctl4mFagHbrDchW1KdQfKtnS8QMWKV5CsloLNH/kgHdzVH4l5KAiqxDpUUyz3v0h+Nl0EqCDFGJPKA8TFQoERHzuok14aceL4iIxqmT6kExwy4v/znFcUS1F5qAWPdxiO7j1hgrCX84wf/GOFuCcnHh8bguEkBQhnRyYm6qpTGlPf74v5OBtQHq89b+JCGQbnEQqdciBOr6XW9vaW48I5Nt8/86hbIYJwFzXEQ8/Ia9N+3WHSaz7rfJwksarQ70srrpqXmd+tb8Koq6oRZVFWZkUboo1FtX9HK3176cMkfjA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC taein() {
		Location loc = new Location(Bukkit.getWorld("world"), -1048.5, 62, 1130.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "taein", loc);
		npc.setText("태인");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MjM3NzQ3NywKICAicHJvZmlsZUlkIiA6ICIzMGJkNzg4NTJlMDE0NDBhYWI3MDFjYTk3YzU5Y2I0MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJVbmNsYXNwZWRyb2NrZXQyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JmMDdlZDA4YzIxNjhjMGYxZDM0MzI2YTRlNTNmMjg1MGI0Y2FhNmJlNjZmZjdlNGVmY2JlYjMzNTEzZWNmNGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "cnsCTnQpGHuGNwyi42rrj+L5fd7BzP4Mrn5jmM2wqBCBMmr29vy989GcvBc5CrrPWbRKiKwIB8N0hbswUIZF81GT2pIvHz4VbxoX1LuAQQF/HMJer2+OpyYgh2DFMW23fXNXO1Gl9cavGrswmsaXriliXA9hg0xp6PInyCBh26qU9UMn/z1wVd+yuFp/a5I0v/tYbWqmO0KrlmnsXmnY1ocTGe0zNl3VKUuQ3O/KjdDoGBbCNK3N8Yka/j7Mdwmq76Vnb47QRtGNllz/mzKqMilW6shrbQQBwiQaweSu2hwJIa3EHPcyAefHVky07TEjmfIcB1SCY85ln9xENNhWK30RU7jdnjyRsSFAcrMC7U/LLqB/JT2/9BXahTvovfTfv695z848YKpcK/QqLrmmv9khPJfR/6MU6yyXarjdAgqFlZqPTzc1vO0WQiM3QezZ5y0alPeLr3rpr+6kzRubR/7CFoOLhalSymFPsBCcHM78+i0YthtONnPEL5FoKHqEZMbXuy1U5nNLqH3wvpDbZ3ltwP/llVyUmH48KACZVfbEV8os8sFCiqps+dEVv+6oqYWoxzBmvh/Rq2IsYP5RVFCZZ+QFa/OmO7cHNkTkfQbPG9aC9NuQoHW/1xQzIIwPWgsnMmYFK5YGDLegykE8vQIpHHT0YlGEIawqdHEyGJ4="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC ruru() {
		Location loc = new Location(Bukkit.getWorld("world"), -1221.5, 62, 1302.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "ruru", loc);
		npc.setText("루루");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MjY3MTkyNSwKICAicHJvZmlsZUlkIiA6ICI5YWYzZjBiODQ5NGI0NjMyYWYyZWI4NjhlNjcwNjhjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICIxMDA0WXVhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IzZTZjODk5ZDk4ZmJiMDk2Zjk1NTg2NzgwOTFkZTY2NzZhYmZmYjQ2ZWVjOTMzMjA2MTIwZDQxMWIzYjljZjUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "oGq7v4JJdA9KtO3wD8RCc0uzu0s2dEsCQHb+fmT96ymC3waqPJNameHqPdEEXVmrYcuG2pkK694BiXyRVJJu/42ff3thE6HuxC8Gg17/Nv7GBCB8wd+mZ0MtvJpHIgwDs/T9f/UCvGpEVGJZro5RRM44jUq0sMyTMrOSqclghgveosh+xHBibgY4JDWNs/EDRLFgwxTIsANMylC6qYRfUPbUo3+tsOMteqdIT1H/ahaC5mnSUWGxYd3wjfrcUp9iV32i1rKeO/41L6FMt+3AVF4NaztlO230gcefQIIibObzO/VM3MizD1NHb3oCw7C7tTcpBJWvhkABj5owYLUgy0lwJV6KfUZFSjTiM4pMIkRAIv6x2c0Dp12QiohtvnAkZdjRPzcgy0UQQLjmknEa3dAVxOEk0qSQmqBZmRDI32Z2KbPVQzDBWhBU41UzgYlpMnKWMqy85DvCzN2sU0tw/L+F57ZaGf+6JkRyrVLJ64Wcmlz7Xu/6nBr1sJDsuy8yHWFV8hl9p9A6zpRojI1M1FLV+KO6lO5EC0Kc3YguyaIAw8mazzhoJwhlVfregL8GK1Ch/3QNK9SBvhS9IrgO4xZckb2+WtFI70qiozjK8lHDacuSJ1nWS+Glz4fngeXOa1KGxwhUAQMKdKgXej69fUni/T8AQ/oV32YXVtO71h8="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC san() {
		Location loc = new Location(Bukkit.getWorld("world"), -1213.5, 67, 1304.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "san", loc);
		npc.setText("산");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MzM3NTYzNiwKICAicHJvZmlsZUlkIiA6ICI4ZWZmNDIyZmU3NTc0MjY3OTg1Y2ZjNjRjNjdkMDA4NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJzcHJlYWRsaWtlYnV0dGVyIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzNlOWYzYmIxMTRmNGNlNDE1MmJkNzI2ZTA2YTdhN2MyYmU3NzA1ZTgwMjU1NTZiM2Y1N2Y3MTMzNzVjZTFhNzUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "ifhRk6cjkOYAcb9pj6qZF1fpH7jBzyqOkDfgRaEfBfIpLCS3ZacCxmU28ItrUCU3xCfbIW6i+DTH2Xlna3Ao+/UZYksafCGW31DZc1k1hgqg09yjA5l9tY+7BNrJkPw6df8E1iQIUrVnIUBDPxfe0s1VUmnjd3+gROX2ab9uRawELr9JqkcTYOOU/YwMOZiFIh6DXUd6OdryBYkfOxj2RWWI2rt/wrX98WBLc1qLSXiGYNaYtJ9tYLex/ygHOq0spOvyNOdiIhGOq+0VNiB4L9jQdW7Fpuu0OZLLahW8eUMAvYGC0cAsjdt6youZeJJkmC5MjW+CS4YsrJXF5VikEucrT/a6eD0ohYrdECRd0FVExahga+L+7JUeei3de92hH4vCy2Bd4AN2hmrXJmEjHwR581Eyg1cMBHJURMtxg75BVO7CB602PtOuvR7zqrz7laUqwpIG174MlfV/ACDUpYXP03POouiSUmRefDIbozsuYF8ibTutL3GgLQr27rstUCMgW2nzHV+Ui2GVPKJyArjnZvtR8L13PjHXlu72I2cVXcaJW4LEZMNhFIySoVO1lNNbNFVzgFejZcsZc9i7IpRgL3cD4C/k1TJ/TbV0jNRZ7ot8Mt3u0Rt2qNnT6SUvRSLsY4BOYjMrA9SFO63Q5QBeKoB5Qz9UCnEx+uqGQ5E="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC marth() {
		Location loc = new Location(Bukkit.getWorld("world"), -1222.5, 67, 1299.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "marth", loc);
		npc.setText("마스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4Mjk0NzAxOSwKICAicHJvZmlsZUlkIiA6ICJhYzU1ODFhZjVjZTM0YjM3OWM4NThhNzVhYmMzOGIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ2YXV1eCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMjRhYjBmZjJiYjAyOGY2MWFhNTg4MjZhYzdhNjI2Nzc5MjE0NWI3MjgyYjNlNTFlNGExOWI5Zjc0ZTQ1OTk4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "u45XJ3W9W7LcsHpRSZPfMWcepwlUOGnZqau+5LnXZZ1YLLXQmzZbGXdPzo4TcAkrVele6VU0c9RIdBvTHBY2R+PvioX5t4Sqox3lnEi8oDvaioUf2aOGlsrSVucmWF6Bszos6bXw/sRtBgd9ZPRDtZbQ++t63QTrHtoNEU13E3NWRarH5fSdPlhPtBDEtmdLyPRUigjNU5F2Fhvcaos1UrHrDGMZegIg+rFB8maMc3FV0rTH+DnVTmp+lt35nRP2bHs5XsO2rRL5iQWA5YTD/+t1LhsTdJdadVunfW+OYPXFmrBmIEAAmZNE+Kyk/CTYz73qvFy83yNxx5FkyGdyfR3sbB3v1/oB16f1GFn7E8XW1AGqwq6+Lu0q4vEZOtg9dT1ACm8OVpTJoHZCoPeZc7amBZVLDT3vN1I30HdpgVyQSdqRqkr0gyAiFb+6eeuahfVm1pj3MgFRlW1JxA7n5zAxhQ3OcLNdt86sOojgCS6t+gPuOf8q+sB34RxDcH8au6pXzr1COP2FydxlevFMYu4PGd2CA6N87IJgBbf8tIepzFgMCfB0IDUWH3Hgpl1X+HY2qhZjN7skdPO4V0a9iYorzxi1bPLzsa00gdRv2IHKVkQKA4pYGhVzGgdqpKhX3k8mUubnP8Li/9hYq40KpsfbN/oTi143yioDsatqCQw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC mika() {
		Location loc = new Location(Bukkit.getWorld("world"), -1029.5, 62, 1221.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "mika", loc);
		npc.setText("미카");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NTgxNzc5MywKICAicHJvZmlsZUlkIiA6ICI0YTIyNzU1OTI2YTg0ZTk2YjBjYmU1NzM4NjdmODdmNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJLYWlfNjY2OSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9jNjFhYjdhOWZmNGYzOTEyNmYwN2YwY2ZhMjYyZjU5N2NjMjE2YWFhYzdiNTNkMDVkNTQ2OWIwYzUwZjI0MzBhIgogICAgfQogIH0KfQ=="
				, "pinYoj8BL7Ho/H5Lum1OLejyz24mU2MT28/E9qJvTS853Ji+aOSY5gj4tXv9FB0dWbehV0zQJwiKwbl9WQv3jpC2XwNBrv65HKcCNnnPefYvjd/eieKfoDEGEx02ekrJbeq3Ezidww5Tj65MoA1ORFj8Y2bYvl83KSc9N/wCUTJc82zX9m3MKNTjB0tOb8d61k/7WWKGX/+9kx8eIYKlfD2l/CeSrOlnHx7CtRzenK/+lGoQHskpIXHyzCE06C7r7VcobztzRYJaJ37GmOOh+oxLXLBMnDSDaCkeyXcD/Sn8OA4c383FTynIljM/G/G6aKiovQ/s00go+9FiJsFinC7KVY3yHf9oguQ84k5CILX/wTz7TUqs7OB9jmLlNfltfNyryJ4OR+EIuUsuFzWEiDIN2NFBbk3r8QDRcZfEio3XV7OjUmF6vFv9BJOpcD3FvSF3qK9ksSCClKHeeZtZGo9+4ajjcWVKGmFJwBM/Ot/FOdIKQsmeXju6olll3PcDRQogaEf9VkQEfzt4/B3Mv4e4sAMg+6XVPSgANua9WacEP/CYmwWTpWkbt5afZNFOMe1GDebCbC3GJ2OEyftHcSLhKaIW4Z1igtPM0XECXzCYS3ydkTzER+T+JRJAFRH854Wh2tJqwPg4cnGYQtksdZ9a8YmCSvqKBA0J4CP/IZ0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC rein() {
		Location loc = new Location(Bukkit.getWorld("world"), -1031.5, 62, 1217.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "rein", loc);
		npc.setText("레인");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NTg4NzU3NCwKICAicHJvZmlsZUlkIiA6ICJkYjBlZjI4M2ZkM2Y0MGE3ODI1OGU0NjQ4ZTQ1YzRiNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RvY3ViZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS81NGZkMDMxNzE5ZjQ4ZjBhYzk4ZTI1OWQyYjI0N2E5MTBhMTYzNmRjZmMwNjEwMGM4NjY1ZDlhMDJhNjUyYzdjIgogICAgfQogIH0KfQ=="
				, "xcDkKoh7UAG3lguN+ls0Sxu1bUL6V3VCzjEpxgiFgMvUrZL7DjmOQmaAS5BzbO9u1eTfyrx6p8gnZlLBJo6afwxRgy76KAxISqAz2ED7WUFgTA2DFFKDyt5HVSb2RcXcEyY5DtBato1dV8a0kXlU3dLie+//Sy1oSlwdL/05bYBo4BrrnjnifZsOBzT/p0uXTArr4FOOiaDHYRsLc/nfkOHNQLkSz5DDyEYPso1AGriWFbZc/ykNDX8KSnAogij5fr7DrzW+CH3I3+/Rb3bKVu2sbvJ+9UpISmrpHsAKsfoywLkxm+KvIMe2oludaI/vR0l7QIld8TSTuvnmiFHShoc6FPEdmaLW4apgFzbzEehV+T1G8oQCRBtYGl/gzOcmlMsmjMjU7uVAbduxTTlD7lxRFeeqc4c6jJSovz0Gs4yD6zcxTYqyCHuj7iz7nS63+ccTHnEQWslDRNkzb1aSl/3KZc0MGVF9r2Z6V+sbQ9eVtewTL6Dpu6vo0F6r1XPNx8W4mv9jggkPZCE1Z8G/dQtYs/xR9mXAac6a86tXK8pvN5tQZhQAT36ZOjqveUFV9NoikGWhDDQq86TkTznhT50oE10gZH7aADtAOV1Bm6kFmJJznnQXdt65lrMloYvLs1Vn00XKHzmt4NgpZwsvAm/EtawKxH/wH23XRscPqF8="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC olga() {
		Location loc = new Location(Bukkit.getWorld("world"), -1032.5, 67, 1219.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "olga", loc);
		npc.setText("올가");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NjA0OTU1NSwKICAicHJvZmlsZUlkIiA6ICI1NTU5N2E4YTBmYTM0OWFhOTMwODc5MTEyZmFiYWI0NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJSeWVsbGUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDZmZTM1MWUwNmY5NThiMmY2MjIzNTRmNTcwZDgzNjMyYzY5ZWYyZDRiZjFkZWVlNjg4ZGUyYjc3MDMwZGY2NiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "Ae8Nf+mXrzFW18JaIJqTSfJv9TnXyV6c9emyKyEPHgSRmvPPNWE9yHRu0nj/YPVnUb4Lrp/KArqPEuiaQDa89yP3N2gPNLhOWVR2j4J4NeUQT7ScxWAvyzIQuAaMZRtNqcX/Zmtqf8hsNIG4MQIegl1/LiO1OZkZHNKoLPK+WrYxf79iu3WeKuqkRiXAQWvnkUR2E35q/R7057HdjSDQe3obmMqPJiqog5mLeXQKiQgO9Mh0cS1BTnTNx/fU5sCQHxmyMbu2t4w5D5qViJGQV/s73tFyoYqRoK+cVd2Z8012rrL5nKDmo8ZVSwGnQp3JpnCmY89E3rLuUF2ERvYUKBgzx9mamI/TTbo0r3XPq9WSGeE0D1FyxSrt0gnpryNscMb6aFYczCpWDfIp0fnkVvmC1NjQnmPr4Q2sI+EP+wgWhZF/UEerYYVS2GVxQNyVzM36ncSISeZewoIselwLV2K5CuyNGKhpitKnYpnBqh1omnldcAbsPyzPp9npP/5Z9uGVheG+XGZ858Gyjb7E3Z2Op6E07UNSuHX3YV865UyakaVTSBPQ63XKMoT1BKmP7fnJtaOrhWpwNzpb9HDNiU/QcQushkmqqDVvzXk5ySH43d+/tRvy7uQdNakCk6434jdWRkTKTuLntmIEXdJOWHq9Ts7VdamllwD4hHy8bPs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC isadora() {
		Location loc = new Location(Bukkit.getWorld("world"), -1097.5, 85, 1274.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "isadora", loc);
		npc.setText("이사도라");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NjM2MzEwNywKICAicHJvZmlsZUlkIiA6ICJmYzdlYTBjZGZiMjc0ZDcyYjViOWU0Yzc0YzM0YjBjZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJwZWVsb3ZlcnIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmRlNWJmYTA4MDAzN2MwYmM0Y2I5MDU0YjEwMThhMzNiNDFiN2MyNGFlZDQ1YmM2ZDRlNTM0ZTI3OTA4MTM4ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "B6LiLWCumtt7W5d8ZnvpsZhCSNR6PEX1Ocggh4Cki5qTdJifHIkh4rbqCvXtSzcQOV1iK36XTg1q/OYvmWJE47HTXtoKjr2WVTRQYRNMpJeGGEzplTeDgwBIhUIqI8vIMBDRgQSWZBtz0K+6sfKOhynWK3e3AN2cNpIGj9tzxXIqiE+As/QLRL2Z6PaVKh4GZIn9WDQaK1SEDk+O+9j1jzcm2C4lhyIl5XEqEaDnCkEvs0tGNKjv9Y7slVUdITu5xwa1xCZFssrnHx+CtLCEB3oXyh7SvDdyVLtXDJr26QB1sLu/en2F7nWBndhoOCxPnJUSamlDxoiMFa7aR5I/rLhOfeRZds9yKuUANffsnMzNOOc80TTqLoVzccRpfvsYnt73dY/JiQqfYPV2bc4S5XG1OAGJA92XEuOVheEQnxxYNb+oC6oXK6T/uAbp8KAX1aou7zp52J06j1FHp8A97A4Yb2gRfRxtr2BjkpQfQDxcCvjkh+mmz1xWL1wzLf7x+xNSqlQvANlkndjpFycpqftOpAPh7cGxcYfXxkm2ZVfts/utsCN4exF9eYSvBxx11n2zGRGRHNYpv1DWKN9u2Fvd2lXZMyn9BD67xCb0jw1vtHiKYCqM+jbqWmwK8qVYjRhMRmlZcyl8DORmpWGpg1Z2f0SKvKdig2n7+e7oFcc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC julia() {
		Location loc = new Location(Bukkit.getWorld("world"), -1097.5, 81, 1275.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "julia", loc);
		npc.setText("줄리아");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NjUzODU5MCwKICAicHJvZmlsZUlkIiA6ICIzNWY3ZGVhNWU3ODE0ZDZhODM2Zjc3YzQxNGFlNDkwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dW1laGFtYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zNjdhNjBiZmY4MGZiNDEwZmMwYWY5ZTdkY2FhZmI3NGRlZjI5YjBlNjI2YTcwOTk5ZTA2MDQ4N2IzMDNhMjhlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "diJoUVoIA7Sp+OJMT6NvOmoj2tuJzkEOpRjUPztZO/bVKJNaFpObbW582afR4TeRNIRGAhG2ahDV38qFjNhuuSQlJdKnnq2+yero7M2D1JaKyg7u2SUIpCIcCojiVB3YUMl+VIKDjXwGiUhace1J4MVCydNwit8WPVqlGHLwuIVKSmkPl3SyBcV9w+kRNITZ3bqmqGii7sCbgRMzmyO3+rxN8YJ/hkiy6ysd7FDWv/uE0rxIe1RfGW3XE7sPtj9BD6cJHD+9/KzOxoA1qSA4LF5Y0DR/TVr3XPptkLKz8QEXBGa2uPZpvJRK9CJYbw1aJOLHmjkcXoIhObGhLDx0M9QaBiK+B6p5m+haVWW0krYwmyLCYlZk4QbTvj+gXOcjXB/euIkfyA05vn6XQXVuN4fWmprj21raVoUkWffOa6vUVTsz2aM0GzpvV0rfaRXnkxBI+lh2GPm77DvPOuooe5eNR/1vOd7OhZ8CXVAORvovnK4RBTT30Nh8pmue2a4HTxpWV77WvL3IzMjyyWG+6bAPMnSLRDs72lJq4s6UaJhZCRsTpTz4PDTxGfz5oijwWvtzUJyIVQs3jpzuQi+xTaSBd986fccZWUqPZdhuQvuZCwgjnIpCbGQNcc/6dKgQuaVnqWgGQb7mgvZOYvFOm6TssylcNynpT4Cgv+qqSk8="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC walter() {
		Location loc = new Location(Bukkit.getWorld("world"), -1104.5, 85, 1277.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "walter", loc);
		npc.setText("월터");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NjE3NTc1NywKICAicHJvZmlsZUlkIiA6ICI0MmVmMmVjYmM3NDU0NDJkODA5MmJmOTdhNjBhOGNhZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJkcmFnb253YXluZSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9lYzRhNzNhZDgyMTFhOGI4ODM2NTM0OGI4MmZmOGQ3ZDhhMDcwZjBiNTcyYTBmODA3YWRhMWIwNGEwM2IyY2M4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "UVrEia2inUTcsggyC62y7d0HkMu43HOjA5d0qCHwHJC/CwvbjdkdE2ALDe04wjtPpIkMDLMt8vRx+850bVBobL1Y69G6wkc//uAwsRBjzh2WGtAFy0+tr/zXk/mU73EHH743F0HJx1O97ZvIXuXBvjto/rk9s0UIQ2jUNSC5Nae8iOoc3/8N/VFaZ5mDn6qhu6NemeEqwBs0SpHcyvqPSxKJmgnlf0KZMKAXAhgUyLUEOC3X+MZJSLj+YsThHhmoyD+be0yEF7aXIEFL2LivOYLn0FqOzibTXRVD6DN9eN/TGDkcCm3bbqjxbFhE+UIPYlibmfojaKjjXecho2I/dlmTVxdKGt5FF32TP23HaJFdLDdsSwwBMj1k3zwnSvqMeoYKs/tjl/KCMqvKWleXUtwgLKcgEnXPkt6ytcnABtTuTMJ8w1sE+DgugRwxZ/JO7Fs6gLYlBJ0q7XTAlfnqfNgZLdnf68e1GkL758G1b64v2v7jPRLFbyDT5SpSnJz0CeP65ERh9pPibUuY4Arf1FW51lL5cMS1JjZn5VkvJZCTtzJS2+hi5+ugk9Y9T+VVRTgTpdI1hAieG8e5hb6igvo4FwcvxNKjIusUGhz5ldU3cUvAKs1uHIhbeNqdr/4yDB40t3DS+N4HpJOb5fFIia4mUaMyGiZjA3hGt5Brk6M="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC stepan() {
		Location loc = new Location(Bukkit.getWorld("world"), -1098.5, 62, 1172.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "stepan", loc);
		npc.setText("스테판");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NzA1NDczMSwKICAicHJvZmlsZUlkIiA6ICI5NmQ0MGRlYTYyMTA0NjFkYjRmZjE3Y2RiMzU4ZGM1MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJBaWtvc2h1dSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83ZjYzY2NkNmQ3YzU2N2RiZTE5MzJmOWE2OGFmYWI4YTY4MDliMGYzODdlYWYwYjZjYjAzMDQ2M2RmZTA1YjAxIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "xXsKI6WB6bxugWE9zuHhgfUH8qAuPCo/cR+YDQwEgvLXt4UzPfEaLOYvBLnx7XFNIiYaw2zksPVAks37o8CkrI9krRUHI+KCYb5nihRhRj1OUHKgiBLdagKekNQoY0TDNYfa6bdE1UKwXPtAhOhZ1lf6rl2LCe9cB819YRZGHdiAG0R/lNbzoWg+p3zbomGXApJj9dd7mkFL4t88XP19eNjEensqqSfNIQ8Gws1ohm2UjvwrsqZWRwMvS5jnYTYLdiWP8xcMnYsH1fK6KuJo54oUaUm5YI3z3+lFPVle80sDeqsmFFNZNB4ufJ/n5i/3f/D8ouLDg3uQctr3b7IAmxsb1NvEdFivsDpARA5pbtfOTpGjl0QGfKjSCdLMqCZAM/fpLav1qkocYzmUFUZ84dSByJRt2mBXGxrS779Zpv42I0bnqTerK3qWuy3+QuznaEay5bTSrMbsK2apLTjGE5CVA4H/NWQs9DEGbTx+5XyOaZPphj18g8vXZ27XUw4W9UPJsZ326WvttH7ewI9c2vNnywZnGuHorXU3sJU90xwoVW/TAZ45oViuv54G6ti/5ws8mZDSWhwrujT0atgPVxzYhrD01pJajRp+oLV+rs5iiKeuY/tVAgmvSZi2se4MVD5vL24Y8pobV8RmBeGsTXAR6JqfAwH/xQxsxDSQr8s="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC tamaki() {
		Location loc = new Location(Bukkit.getWorld("world"), -1100.5, 67, 1178.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "tamaki", loc);
		npc.setText("타마키");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NzIyNTE3NCwKICAicHJvZmlsZUlkIiA6ICI1ZjRjZDkxNjEzMmQ0ZjUxOWQ3YzdlYWExZTUxMGMwOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJmeWNkb3IiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjQxYTJjNmRmNDM2NGU4NjIyZTk3NTg4YmUzYmY4NWEwNDA4YzVjNGQxNTJiMjNhOThlMjk2MzIyNTBiYzI2NyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "XKgbNT5tpPa6pePQdTVP1V62NCk8icpknb8y1oQeih8t0FvjfKp4Hs6GSD0ZeE6u40k+hKFA8ZEwEs3rhWyIoO1im1P8uYASo5rdzaGNStSAgB+ymRKl+5/VePC9WDxi5cUOO0FJBwiSFqCuK/nePKQVT3+4zKYmp4ozCf/OL/qvQjxsPBM1T114ahPh+CaglXiA5q2oemIoMppi2aBU2Uxvc3oLQ9Q40EPsAIaXlW2hEWR5GWisoega42tkzH2AYcywqES4qnWV6dN/E5rAQgjTNwpWjcNgu8fifjhuq7MQl5wirz4N30KAguZqi3eTtbfSqvTBnzS01k9tFplX5x28LHPqg++H7QE+LVM+GVejfoIqfRVzi5jimQiWVFLjwD19Bx2PNMY2yTUZZ8KcOqMNmiwoy/vjrOdocWoJSITFuuGc0xL2gyWE8PJi0ES3L3dpM59/C4aYGsKY9dCXqpGuy8rL5WbkS69QuZwF/P8FeIU7zTAXliOR46JzEUl7eqgw+xwgOlcp705JpsCNGIH4qsjKpBxZ0axI6W2Nbh+rTBtW8EZNzlrdJ/TSma8wds5HKUFx3WCotIS889uqQQeV5AwbSdIJyIMUW2bG/njjlqiALVk3nRmun6B6v8wFpYo8ZrEttI9EtOuVHyvRVaMj21jx9TfegL2sSgEyx2Y="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC riwei() {
		Location loc = new Location(Bukkit.getWorld("world"), -1105.5, 71, 1176.5, 210, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "riwei", loc);
		npc.setText("리웨이");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NzMwOTM1NCwKICAicHJvZmlsZUlkIiA6ICIyNWI4MWU4NWRiMmM0ZDc5OTZhMjFlZWFhZTdmOTFhYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDbGFzc2ljUmF2ZW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWE2NDQ0ODlkZDYyOGUxNTYzZjA4ZTQwY2M5NTJiZjM3OGQxZGNiY2Q1YjBiZWExN2JjNDI3Mjg0NDBiYzhiNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "k4pYbx1jdY/9c2CV8kUJQqsK4B+rPBic7GciJQ7039GGcCSMqxsMJUHERJMavZRzUyBt4BA0KNwgSCrIlqcXYYjMMRy4wAwFKcJi3b8xg2eHgDgYOFea+xrIWE84y5CWwZq0hHK9rx82XS/VbDpDZPgLP4eJXM4knwjjphu2Y0bBVSpSZJR08mLAdJ+j+vf5Wyc4mM+QW9Yh9ldVe9Ir1vArkdbOg+7dNr1cqv18NhduICY3yIpHBPkkjSXiXW4Mdc+xSUHMeb1FFeMtN4coPytU+w4/Db6fpr5zraKBFhujrDCQzkr6XB8ZM0VZAQlcok32YHU7n4eHP4CXtN1Vy9+5xfjMjA2FE275HYnEdm3SJJMiAkonSnPqWGRRFNa5uawHsWKgfgeRDlmtKk4CA9xi/Et7ZNpl34aOuAvnQxRvY7qnmTrX1go+zbpMm0F6bo72VeFvQC2wxqjLOM/JUf3OtCoDOlARr63bF8YlMuyzWf+o/KJWmxdjRtfO276buc9Yn5HNO/2gehL20yoZbsXY4qB1uYjI5HeO8k+rpYuxKSB7UvCjX4sNs/RuZWsc4HGFGBuQ4woGGpoxLKvU/PkcBBr8By0UEQjhtzcUs/kZOosrf2kZ0HMn194pJYoosjEEmZdWVDRIWnKjnWPRpI7xfkcWObVp7mMf3ItxWtY="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC yuna() {
		Location loc = new Location(Bukkit.getWorld("world"), -1039.5, 89, 1257.5, 30, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yuna", loc);
		npc.setText("유나");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NzUxNDg1NywKICAicHJvZmlsZUlkIiA6ICI1MDRkNzMyZjMyNTg0Mzc1OWFlNzA2ODViMGY5N2I4MCIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGVJY3lOb29iIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ExNmNlMDNjYzAzN2IyNzdhZGI0NTMxZWI5ZmYxZGRjMzAyMzhlOWFmNGMyN2Y2YjE5ZTIzZTk0NTY4NGM1MGEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "HNcGflQAu4GXxTHZM2dLahlDqWLXv39+J0YjKyYJCBeQCQegizv0yET03zXCk2BrbFOhYcwV44Z3zoVbKIu6gaTFuuc1278BVVLTpttYLPGTiy8IybS+y88b0SKsVVimO5OZptk5m9yNMUPFNRa8/6eZhsDMbrA/f3vc9dLQHjG7D73jZcUKNZanOm2TyPVdjWiIAwCZImFYuIRbcBZHdQlpCAQ+1zsajKCC+RS1l1R3Mp3B/CAhJTUWFz4EUKKEdzZj+fViDUBsLLsoaYtKCREO4UnLsIu+D6kiIxVtHNw2GqtzAfUanLDXTNopwGFEMX3ZhPPIzTTp1M1RFz5/vqd6Ql+MlIU6aSIeLJ+dBrGYfnyx+WfTKXQESLUhm4Yq2NOvkBG9t+CVcQ9zCAkNcH3ARiOTx2mcGbNijuWFx5onUUqd4LQeYZVT8kyuVlfF2hjgdx2HLoAMRaE3Nqv0OVLcTjrE1dtqYGH5fpdeZoanNDNPVvIB+q6h1eRUn9TI7rGGNKQ74Clb+doT69unZ4LWqLw2D2IVL97UNVwL2oyraU5OGekvPCpIlXfH5abrm4vBP66gartBL9jdycas4Xlk7ECHfLpZ4PlJ+JFrb608WWk/7KnkbXIRqm7NhAFdysa7WvizDTe0V/gKa67KLciK9+rIIh6krZjs8N3XqlY="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC philip() {
		Location loc = new Location(Bukkit.getWorld("world"), -1043.5, 94, 1253.5, 30, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "philip", loc);
		npc.setText("필립");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4Nzc3MDkwNSwKICAicHJvZmlsZUlkIiA6ICIzNWY3ZGVhNWU3ODE0ZDZhODM2Zjc3YzQxNGFlNDkwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dW1laGFtYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82YzA1NjM2MjE2MmJkMTk2OGVmM2RlYjNmNWFkMjM0ZTc2NDZjN2U1ODE3YTk4OWNmOTZiOWY2MTJjNTExOWNiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "wYT85nBjIZKxOdBRmik7VYQleeNL762NDPR8iCFsowHnI3lJKKIoFy9fVwtTd3ArOQVUS6ZHtUfR2RSIQzQSsw3FDTq2I5jPw5lfxlfEIekaJt86koiauUHlKLm6wvwoUtE/hQSMr1UmWvHMl6rr+aeXdFOL4+nXJTx6v36vesINpjVCjnQmsnYrmLdrxRuM2B8rAxtB582rj31/BW996J3x9+nsGF0MwOgrsCxixSkxSzNGuDZCHzr4Nk31m0mFpTL3tJuCZVFZRaBav7q+ewyoq0MgDnKN3bMRNM3hHAwj7BF6uV9Gx3+LIsNnl4LA6J5Xua3IFTpZwvuWGzlFtL821aSN8eGpRK69/jYTdU+vwYoqmUXfNzkuzL5A6zYZuVZ/eSVPjLzflC0mqhQu8oFpkna3tG3qYt3kYN+wBi8c/b/3GJvENBFzCtIEs1TkRNKsMbZODA4dpnZw5LEBODyvDB838gU1AMlXbekQU4b6JEsckj16RK6yZ1XsTLRFJGxA3s1j0sG0ka1vU95OrG6vNrXOWn/0fqlpgp0p2ykqvX4PWiILtpjUz0Hznm6OTlg+bGo7HNFW8ozL5qKTzJuWqFdl1+o6jzybdU/zmUG1eeYf50oSuyj3EabE9hZORbhk3B3+aUO1HP+Yta5SCfU+XHTvbcGGZJ+yTNeigrw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC salbadol() {
		Location loc = new Location(Bukkit.getWorld("world"), -1035.5, 94, 1254.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "salbadol", loc);
		npc.setText("살바도르");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4NzY5MzQ0NCwKICAicHJvZmlsZUlkIiA6ICIyMDg1YzYwMTYwNzc0YmM1OTNmODRhMDliNWU0NWNkNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJraW5lc2VybmEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWM1YjY5ODQ2YzI2MmNmNzcxYjMyMTgwNTliNjlmMTVlY2JjNWMzMmVmZDc2OThkOTc5NGM4ZDc2MGZlMzJmZSIKICAgIH0sCiAgICAiQ0FQRSIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjlhNzY1Mzc2NDc5ODlmOWEwYjZkMDAxZTMyMGRhYzU5MWMzNTllOWU2MWEzMWY0Y2UxMWM4OGYyMDdmMGFkNCIKICAgIH0KICB9Cn0="
				, "R2UddFSG+Nqp9jxNiRUty26rZY/4cNIQUOAxtSg7WG8Lr389LE9qUJ0P/tijNZKtBdcJpU+vDfjoRGSUhWzmcK4zVoHNkMvObC2b2h+toWR6heiAOBshDOgUIX0mSWsUYkiN5U9UnI8Z4YzLb6lTqGDpLPTg2uT8tol30CbLt6Xhq4rxsZ9It5AYoSzilUbaXlpmFFu84vunRf5qR+yjSqAaO85vBAxevZgnPLqrZjCt39trGEIfuLPiddE4ZH5NuIdwggESocPtnBQLTCa+QPmM3AXpHyO64psYC5Qh2hmk9Nwcoj4Ol/6PtpGwCq7j+STTh8ON7zPwkrptYyTgtJy9/kw4871LDtKj4anD8cgJxMSDF7cc8QsTzHdrIRujL560uQBhNlViCuRjiFwqdHvsFZwUCWOIc3v6Hwf9XVjUAhwT5oAqdUWwZaPWTQJODCBr3ZjPBr12WJEre/ix5lkVAKuIjvq/aZ8XNsNO2kdP2Jwrf6GgoJH2BLh4PytgEd5TZe1R4hSfq1lrJoYEQYA+HO7TpqLZMD4SWOu1EVda29U0W5OLlLd7hydVddiq2k6ECcmoThBrz4XG8CAdzJdd4NJ2mjE/jXosvmk0xUBEGZZNPDikUZcxdO1QvOXe5/YQyI1Kl/7+PQfm0M8yACPbrOzMn9Y4htdApcJV7Ok="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC yumehama() {
		Location loc = new Location(Bukkit.getWorld("world"), -1143, 181, 1461, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yumehama", loc);
		npc.setText("유메하마");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTQ4MzU4NzE1OCwKICAicHJvZmlsZUlkIiA6ICIzNWY3ZGVhNWU3ODE0ZDZhODM2Zjc3YzQxNGFlNDkwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dW1laGFtYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zOTQ4YWI0NjFjNWJmMTEyOTU0N2RkMGVkYjcwZWE5MDk4MzFkYTY0NzBiODNiNTliMWMzMTRkNzk5Y2M4MzAwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "Huv+mAhhGDeIaCJOr+Xlk5UOmHnpoxF36ZmwwGW7SnUqe6apcSHuraGL8gTYyXcjMG76t7NyP0pUklONDrye6ch1cFz7vRgZVm0qswj6F8ab18TVzvZC0Le9FXBJswsz2/06XgFqsXJ5nMevSHNd8fI6QbG3AlDSOTcSIt6l7LD2Fgrg7m9FyNsZBXgcScnqypHjr1FOKtEkP+5GgCbYKEnjpwbo3/J2M6NNtGHGNBh+UMV1JaiK0bQkHWtvSvLWzcm/4PejwigFBY1+xS/0yOrGuvlAtxVQIskfhTHhgus78eES64mETYRNEkBcwHXrQXZnAQr8FMgKVtYoudUJ8rDztgh22lFDrKeUi9EXnFWSG/gL2c9UEVv6pZEiVgutue3Kwq1scS6EUttZhCMkvVgq7SAra1KRkhDxf7lbyBpehd1mRyPGp07R165o1NobLtog7+f9QT6k6VFJz3J6A3SiKZ8l23Dwk8224GoR1ik3JS9yfkmDo7NSN6lAlFyPqlNmvvgPXZLnnjGqmfDHBI0zZePtvjWSYT6g8alMV2ZyOUziTlBVwnXxfeVtD+jNj/45W2nnvWPW3xE3RTzPgkjdDp9xvzlnErJGydqDoZJ4l2ehBtVT/5dbqBdXcBd9NtFzhA0SNzy0e4FqDwZRAkcCZNM0wVa/kWwTOvkLPoU="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC npc9(Player player) {
		Location loc = new Location(Bukkit.getWorld("world"), 973.5, 64, 42.5, 0, 0);
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "why", loc);
		String[] name = getSkin("why9196");
		npc.setText("에일을 구한 영웅");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.HELMET, new ItemStack(Material.NETHERITE_HELMET));
		npc.setItem(Slot.CHESTPLATE, new ItemStack(Material.NETHERITE_CHESTPLATE));
		npc.setItem(Slot.LEGGINGS, new ItemStack(Material.NETHERITE_LEGGINGS));
		npc.setItem(Slot.BOOTS, new ItemStack(Material.NETHERITE_BOOTS));
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.JUNGLE_LOG));
		npc.show();
		npc.update();
		
		return npc;
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
	
}
