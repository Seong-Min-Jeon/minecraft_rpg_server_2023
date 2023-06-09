package testPack;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
		fameli();
		famela();
		osuka();
		bono();
		dalrock();
		alrock();
		dimor();
		alranka();
		anurogu();
		azudaruko();
		kuteno();
		nickto();
		ramporing();
		putero();
		tape();
		rang();
		edga();
		tesa();
		phoenix();
		aruta();
		rohana();
		talran();
		malrash();
		balentin();
		tenma();
		yujin();
		zera();
		alraraku();
		akil();
		raimiraku();
		hymiraku();
		zemidaraku();
		dehi();
		atun();
		yume();
		sesil();
		mei();
		rowell();
		mirisu();
		chun();
		xiao();
		furua();
		roberi();
		ganon();
		oing();
		zelda();
		dante();
		pi();
		girahim();
		impa();
		midna();
		link();
		wool();
		herold();
		olivie();
		mirine();
		runo();
		bayaru();
		uzet();
		bada();
		marutina();
		nemo();
		upgradeNPC();
		shop1();
		shop2();
		shop3();
		shop4();
		shop5();
		shop6();
		shop7();
		shop8();
		shop9();
		shop10();
		shop11();
		shop12();
		shop14();
		shop15();
		myo();
		guard1();
		guard2();
		guard3();
		
		why9196();
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
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjg3MDA3OCwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2ZkZTAwZjFhZmRiNjEyZWUzMTU2MjQ0ZmQxYzA4NjJkYTBhMGY0NjZlZWMzYjUxOTg1ODE3MzI4ZWFiNmRkMDkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "X9izgmn/38vtPO57NaLQVjgA/GoB+RZ9FWbpoATVAISJn/rNts4YWWxHEJmha5kYE/PWL8llGAV8R42HtYdHTPIyRhKHQzahGXC2QkMzgz7tFXMyNhaMktd28lDiGNmpNIL6VN548ChwNdSNaeP1qey1ZKIjuT+peYvv7mrd5lclXYwzc84YwpL6jFyRBD3sXmyMQb2MvKIcXZahwAi5tl9mD3TW9w2KhTD/8MA5Tfrz5JCdEy+hc4NdJKQVoAetO5vEvyso7JqP9Gx8hr6VTZLWpazZnj2sguvaWP0tEF2ctABMWllXKqIntKQh/IJk35PdilNu6teOgfQsBALoUEVHS/hGIiPqs0jJzt0m+6dPL1cRkNo54fwAUVXMySc9jnBVRP8y7THRu2GG/UZxRz6yx7JOpaquSv314AI5ZHClQcSueLlMlTy9+ngBLgxiBDFs+g9sR2BgBS/UDMgmM1RYv7hIhjSd12ERCYP8E2EgdcOd3ZwQ/Wpb9LtCfZhwTXKeLgIq7s7LyHd91V5OJh0utMfY2L/aF9tgoS1FXssphfG1WanLdcBPNvmBMsgG0fkXT87QLxluUeYD9jF/KodIxOe7eA25mBjlMQYgK6MTDhcgnwKG+VdxnIn93mYqfgwIgpTXFVz4jLdGxwtmJxxo5PCtNEX0QjcBSleflYg="
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
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjgyOTQ0MywKICAicHJvZmlsZUlkIiA6ICI2NTk0YzdiMTExOWE0Njc3ODc0Y2ZmOWNlMzM3NzYxOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJndHhzb3UiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY3OWMyZjE0Njc1OGZhNDNhNzI5YjI4NDg4MDAxY2UwYjZjZGVkNzlmODk2NmU2MTNmYmFmNTBhYTY2MzYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "vTeDCAv3kdqJpQfjKwqz3x+EArcOjrFozElO5AHs8mlrwSawxR/dBXpRGkFWcKZhcFi0q5jl76fCKBfQykspfu7XHfVStZqsCzWxm1Kxv8dK68TpGrLNuSmX+TTxw7/zr2l5jaNvlpLzrKhUyuWyaL1gRiFPM6lAZMD943s/oPNtJmIDbOFdR3v4ByxG7oA6DJrUrJ6xOjzw+2MeX1tgw4uhdazTltgYgtRagQw9us2JxWv9M+cCeTLsjYCHMq1f1KFqqjzHAMDHEm7oXQ5Q91GvliXPAMBHUN6gr4rkThtKgZwRjlVJlCi/arJkpyYPU3jmTnDi+ZKvH3gMGDOex5D5Q44rigvwtu2w7PMCRyB3T9ulvPPUZlRy5XUO6yuBmO/55GX2VptpeapRPIXM8GtZp1B5L+4IE7oTgIgmOZcsS1dQ5bW25I6QTbeEx4KmD4Zzr90x3c99CRzj+kVJzajBKg7mTjJoBPouP8YaqVNS8PCCLovfsLCv0k94FzUDynUCqdf9OesXihIEKAKSsnMl4rYEAmRXs248XDV/oG69/ak6qABNvtobUSW6YXYB6VF6If62Bt+1QUIQ2myoIK0zgwORfH3B5Awwrv5mevXZhZJZvWpB+PaueC2oeG2GwpXYZ2bG8GZlk2jQpvglL8indh/Igpbba2mX3BU/utY="
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
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTU4MjI4MjgwOCwKICAicHJvZmlsZUlkIiA6ICJiYzRlZGZiNWYzNmM0OGE3YWM5ZjFhMzlkYzIzZjRmOCIsCiAgInByb2ZpbGVOYW1lIiA6ICI4YWNhNjgwYjIyNDYxMzQwIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzE3YjhiOTE3Y2M3NjA4YzBkMmRmMDY5OGQ1MzE2YzhmYTBhNTBiNTgwM2JhM2FjNTQ3N2QzYWRhY2Q4YWE2M2EiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "wgCMDn0mUHFXF5P9Xuy+gEC4rDGfGTBwEFPdf8f/SFy/r+PEF3x5ZXDGwbjxoEJpB0ODkM2/SxGSjCvDWBHTLAwDmI+fKT2FpvIsNhxaH0+x0clE07XsVZlCiCU3gjI7VPDrrZiHraIh3rJ0RkIieJI7Vb/r5V6ZVMXEyDst7EGPia+6ncAunYnq+HyfMrUG8+xfNN1/Bc6tp3V9C9OBwbKqxqjAdeOsdJzqSF7pGHtK7Pq2h6XDBrIKIa5VG/ZDf9FdHiNcj3hXDWVJmAZgwuDvfgUM20cheH9AmN1yjUwiOPIJFQfTA000bLZn/iZK7btEA/HcDpZ4ijHnEEYHCG8vU1PhtrXB+ljgx+Yoc/4/GyZyys1xlQI3slJquTsv2+9lE3zdPBj5fCXBUyILzwUr+KLBpHUPyD4kp8XHi9f1Id5VX/fwbeREASeZG/XgjyDnnOgPw6mkG7cL80XrIYohf8xxEhstC4yFHFTF+6OtXRGzmRGy9rrT0SHmqTpFsc4ply5SInHCLASgWz5Qhkk7oiLaMRTR5HtxYfSMQe47R/hTOtbE3J1zIcaNGNIFv6tXwfx5UQN3F8hzAOL1P5EzqjGopr+eW4Gr3Y/gI2/4QvN7/6CQ2kEU3sQ1vbzkmx81LGv65wVFpc/2haNilavcFAbYY3y9KSjggSRCRJE="
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
	
	public NPC fameli() {
		Location loc = new Location(Bukkit.getWorld("world"), -1073.5, 68, 1141.5, 300, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "fameli", loc);
		npc.setText("파멜리");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MjE1MDQwMTIzNSwKICAicHJvZmlsZUlkIiA6ICI5NTdiZmY2OThiZDY0YmFiOTRlOGUyZWMxNDY0ZTNhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHdWFuR3Jvb3ZlIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyNjI5YzAyYjMyZTRkNmI1MjVjOGZhNjA2NmJiZWMxYmE1MTkxYmEzZDJjMTJiZWI5MzZlOWRiM2Y4MjA5NDkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "J2C/n2/Reo62Pa3WMPR196IHDZPuBSbGmoXftO9D5gEob434MZu5YpAQFCvTodfATUaVs7XFT4ivns6imOrcii4JZTBsT/AjFbryljDaWGGxdZWhaZJ+2tpx/nM+RwUh91iHwPRRk1I9lfPJUh52IGHDOtIZ38Sw7tzTfTfcKWDmi1GlrnotNZD4xxQ8BhfBNuqVZkInT2wxtd1VggvsjH0kftC7a7bDbotnJxXhBG7z+3vc6OcZqzayVIYoo+uyHfAP+ckmsCn0pqS/v5Da5KJU3jayTazbRbyPpWApigWfxJ3QjMpMXoGTDtUAjjWyFjON8WmsJw2Pmog57AEfnaMXRMgnHQvHYlesQ5Tn+3dKNKQVRYSJUJmSlregIUdjqJfwv9dkayOuUBy9jCaR+1KF5l3phkeONKjKFpzxfoXxsB/yl3Dk33pfFpzwSmrvSBoLsu1OvyOAP1VKiobqBpFqRXFKF+JQ+zoRwB2eM3yuUe2psIP1PFcSQrYvupU978MbEq5JSvBROsVdhICUTdMEsMa+VLAWKVduekL49C1UHZXtjttcMtpqzqG2JyFDR2Nfsbw+bDoXb/8YfIeeXgCyqcHdB993VR0d5NY9K5Tz5uhXdvqy5yCgfbVOQ2llS0Oj3OW+ZZKeLv9fMrzLwXriPawrIG++KcgUUAx2X4U="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC famela() {
		Location loc = new Location(Bukkit.getWorld("world"), -1073.5, 68, 1151.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "famela", loc);
		npc.setText("파멜라");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MjE1MDQzMDUwOCwKICAicHJvZmlsZUlkIiA6ICI0NmY3N2NjNmQ2MjU0NjEzYjc2NmYyZDRmMDM2MzZhNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaXNzV29sZiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85M2NjZDc3NjgzNTljNjlmMWY0Yjk5YTY0OWRiZTJjYTVmMDA2ZjkxOGQxNjY2N2UxYzM1NTM1N2E3NmE0M2IzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "U21msNZNf3aS6EARMc3eiAEdh73BlI2Gt6QoQXGaBT+rqCPlj3klVRGmFWueK+HVWnYT6MQMpmYJeJZ+9/Qj0Yyq7JLQWOMIHF/B+s1f4Dleif7vLeCqJVG4dtYs5aRRqhh+Gx03tj/lT68oo01Fz598Lmjg5F0pITrfFLlMGC2l55RRQRCmT1ApSnj4aS6N3NYK+VFSE5Q8w35ZzFicZAWOS9Do0ylXDZsXnziLP26dz4YwHJKpgjVvantvhON2ga2a6FFepo+fYoKOdUpr2t4QqKoLgx7LywTxPceqyo5i9vcwJsKlWBbsvoUj/pqwo7Z0TwAEKeNjLamZE1rjAnB6RBO17ly3iUIJRxCa1zb7HgJ4NeEzEwGeNyYXDu1qaJGAzlCPTiJ/O8z5aKzBradkPiHBzuhtdFH4nYNJTJsjgIf50X9/MMnT19e7iZxvhP83kLJrmlu+176Tfp5/2TyHQq+zXTqBpheMjixSRnMnDVPUA0vvN5s56Jx+zIIZmGPWMXkLcIHtzGl85MArAw+vdSqX8WRg6Vw64iY0Ug03GmS27SAViCgoyw3h0HGOwTcA8zaZqtak/heDIojNMaFQP+Jz7Jt9SjW6IlnK7QK4yOJ1XZH7fx+p+Oqq2zEt7e1CZhPPVzDXqngnfU+qv4+qmsNPARvthd5AQ/cGabo="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC osuka() {
		Location loc = new Location(Bukkit.getWorld("world"), -1071.5, 62, 1145.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "osuka", loc);
		npc.setText("오스카");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MjE1MDU3MjI5MiwKICAicHJvZmlsZUlkIiA6ICJkMTE4NTk0MWE5OTY0OGQ1OGVhNzNhNTZkZTZkYjllYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZWthU2hhbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iNTVmNTIyYmVkNmViZjBhZjhjYjRiNjFjZTBiNTdjNTY4ZGFkZWQ5YmVjZmE5NjJmOTE5YWJkMDYxMzc4YjciCiAgICB9CiAgfQp9"
				, "wlHo34vKqXlG8AWsHAlUt3EuB+B4Ow1MuLgTD5is4ZlB2s0LyVIGbzrpxq1GhdUF3wEmNzym042azv+2DC4tHnu2VgaDyHzBH3jwM+AhuOQzcN/DBAmDW5RGBCN9ZkNwzLZ9CdqRGE5OsBDnHIyJJzV0lbjEEBNwnL7v40v8ERYtXGt6PsIXOqLYbErmM3MyWQ0WVn7UFS9207WojDlSxzpOzuklCb8pxakmcWqPveutuxw9WjiQzZ6pD8ET13ARF1GRKtmdtKI01s54iCazbjSJehd2jcj9JrginqC4pTgG1z2uPUiB40uCHJj/DsAu4/bGUDHy2udhnS9vkkiS3TTbO7GRAogXqhpZ50KFBM+4L1N215x46GIPcN6aP0TXQpNXkwohueciLsC5/EXNTG3+bA1sOxJt/1F2qdLExRJf0KryoAVtn9AO30W1s6EmptrnFVKLw1YMnIp5VrwpjqHhJLExM9tjGSy5pEcwbEsDeGYc6qBWV8Qr3uS43ZRydvxkgiODmk9s3SLMw0iEcI5C8+9A8zgzca7E01ihn8/YD6sbLMOkqJn+T5DRoeOQHcOMjX7DOKAl21lgafGb79pIm0fox+WNMEjhqeNOktZPRL4B72AIeYiMkuwINt4PIJx1IWb5XaY3N0snaH4pl6EG+rsTUyfx18QngkaM+pM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC bono() {
		Location loc = new Location(Bukkit.getWorld("world"), -1015.5, 71, 1169.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "bono", loc);
		npc.setText("보노");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgxMDU1OTI1OSwKICAicHJvZmlsZUlkIiA6ICIyY2M5YjNlZGZiNDA0OWMyOTZiMzYyMzk3YTIzMWE5MiIsCiAgInByb2ZpbGVOYW1lIiA6ICJib2dsZWJvZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8yMDc1N2YxNTY2N2U0YTgwM2M5MTFhMjRlZjU4OThlZWI0OGM0NmFkY2RhZjFlZDE5YWI1ZjQxZWM4ZmNlMTQzIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "fTopJ8T6c6AUETr4fWK+OFY9IVtld5i6fqVDlYp7hxEwIPxgNNHHJUysf+ssE7dcX71GmCa0qWbsuVRKYWjLXNDPtv3HqlERyxZpoIgd5jUOFIG++gHL9GXdCY2vur4PXSSTsQs5TFnwnj5OsMSvk1zGy92X7M58t2cgjGw5POH4W2zvAfxXeb1u1vlSIyRNkPakRpQTWw97/jdPjRU7mNcUVo044DePQ9kbaISSFrO1ARBzgavwi87kuWMnpkGG2fNZocQPPEoZsgeybO6dWq5SBhKTxxU2XNutD7F8tmZztMkmu9j2H1bYveZsFXcCx57xWdj8dbb99y2gWNQSS4JkNmA78vkiqTSXInN+S19NzkB8ny7wBjRinMA4apXe05Zr8dINH2JAJmWSt43gHb9i+NCj8mt5o/NdiL3DoIsO4Mwcqr+UyDLazqz36FuvDHsigGrs7nALHfSACvmbf3oi9FiItadvc6QvN4PyucXrrSr7OPiPpkw/FmVHPl9esgd7ThJtfU0N18a2vLMVXVhg3mvzRg47Dn2GJ4scCptieAEFDap/iyoU6P/qRZCiqHfCY92NKl/aD8ZiQs+K+ss/7cJhDq58REqy54o/LyDIVlTEhIjyarQy4FuM1UFBEjWoXOlqFNGS70EfvczS2ERMIK5zo7KVYd5PiyO2XoA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC dalrock() {
		Location loc = new Location(Bukkit.getWorld("world"), -1007.5, 67, 1171.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "dalrock", loc);
		npc.setText("달록");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgxMDc3OTI3NCwKICAicHJvZmlsZUlkIiA6ICI5NDAwZjFlZGU0N2Q0YWQ3OThhNGJhMmFkMmUyYjdlYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdGF0ZU9mVGhlQXJ0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzYyNGRmNjY0ZmJmY2UzYzA5NzkyMmI4OTI0OTA1MWM5ZWYxMzAyNGU4YmM0ZDU3ZmUxOGRjZWJjYzY3NTk2NzAiCiAgICB9CiAgfQp9"
				, "SVjTzeueFFbHzHnn+HI/NVhUYUeRtaDLltwVW+LCp5aQEXHtCRjG2Y7Hn+p0EsdX1DeH4NQAUfZ4WwqKz/wJ+uKav2zpq3WZxc7YyY55Yulv10ggTxqwk+Erix4pcPEg63LF0yRV4LkZGIkzSzZnO1Y4aVBCbw13grnz1Kw97Iekrdrcp/E7pWOSVxryrakqnqvHdVleS4iC/vJPJLAyeprJfCZYLy3kwNZ4PA585UHxPXWL4D8WWFIV6ZPERvViWFHTPT+ffvRhbrpicUmro80/oE5KmNOBkrLTPUHrlehuudJG/6encajD/wwp30P5T2r96qt5PbacNcLTevQQ1bcj8xjGEt+hxuQJ2uhBXFZmB0PKVwTynxg4RNZbSOqswK6faT3QdzYBax2pI7V1jwfqlxvcwfIlMDbL1JRKwXOMYeZ2danks2RZjNYOrQ7uEqrEMkusr3c+XSrlLBMQfV6OOa1+GcOFfwEYm1FOpTryEF9VQgS83HIsgHEhMjzrtvdM9YvZLsKDieZ3Yo/WSLnp6eqp/f8yLkfset3yABBXpQq/U0mQmVrzea8X0WtHGlz0GoU76gBhtifbBFXZnSRPytTQeCAFuED/pS6Nf4gjv3f8OrbMpbWMRJ6KZI1e67bqWkWHDQKunmtoc0J2U31RlD55qTzyZewz3c9IrKA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC alrock() {
		Location loc = new Location(Bukkit.getWorld("world"), -1010.5, 67, 1174.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "alrock", loc);
		npc.setText("알록");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgxMDk1MzUyOCwKICAicHJvZmlsZUlkIiA6ICJlZjBiNDU1NjA0YzA0NWRhOWIzNDg4YTVkYThlZDZhZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHYXZsaSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9iYjRkYWYwZDY1NTc1YjdkMzBiNjY2NTMzNmNhMDc5ZWEwYzY1OGYwNzRlYWEyYTA3NzczZmYxNDA4ZWFiYmM3IgogICAgfQogIH0KfQ=="
				, "nlh9i86lXhWTXXNT1+An/BHP+R3I8ntn1Ijp9dZrUBw8ibUka87ft99lQbiLprshEbV7tfpJseB4bY6AFkoMvtXzFBWfKb0h6zC38WDRMvCUf/fjbGk8KIqFbL+FtHrfLmijGRQ1P874P8WX0YenNKLTtR319UuFgIjNlTlwh0HK8wwrO+8fA8o6vpLyD66H81bXdCfByQHqx7y/aS34nuTsfLXbf4FC+paywvafVKqZ0J/f2b4zj2hOJRSZMOOsx4FVEiqWYAIC4n5bsmBbdytJfkdSosJB9ZNCbNCrRD/td71E/No9XlU6g1tRQjuicET3UgukrbQJikAFM9doxoV8+kNQf1/CV6gSKMEjLlNfPVrcrQ6oBxNBHkTLYam2349l5yEZYe4Vg9Y8sYhQtxxbPNKZAkrXsym/F0SP27sjChX0oxF4h71bi3V8GlP7wnK/k5JxHnymWWs/RGIpgmY2lVl29+gSh6iwu/+MmsABYlIQLd4TQSnhqhGkL/1QEV6YwHaKw2BD7BDm+0lufMfkJKa44Vpttrz1wxc+ZqRMr9zTYvdmJWajJ2M6blOOk5/ejLV8WN2QSbemBkvSl7Xs0oRoCj2A5vSa0AuCptq3BMuKmqemxiAWQ04U1AZrl0JnQZpD13KIEhUU2BcBISdQ7S6S0MCR/lRBeRfZK4s="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC dimor() {
		Location loc = new Location(Bukkit.getWorld("world"), -1096.5, 90, 1295.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "dimor", loc);
		npc.setText("디모르포돈");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjU5MjkyMSwKICAicHJvZmlsZUlkIiA6ICIxMzdmMjg3MjUwOTE0ZmI4YjA0ZTYwYjg4MWUwZWE2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3JtYWxpc2luZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MzI5NTBlMmNhMTFlOTdjYWExOWNkNzZkYjEzNWJkYTY1NmJjZjgzY2E1NDQ3NDYwMTZkODg3OWEwZTEyMzlkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "l061ttJwoudc6LJPg/ouNsHo7tpuS8+4qZO07Z2H/9DaTA4/SxKMYXkxAQDEgnqIJsWWVeK9nBFn3qKzB/C6rcVrm95/bszf4CtlrGMFB6HSQD+kETxeXTtZRbEH5cFcvYmC9rJ4PS9CK/+Y0fCRQ/XnVteFrLx6Fca0nl4gqInHa4+xFwpNXl/XBgtDCDRW3g/V7p+K13SFZhT2Mg/QvhX2nCmNymnCJWbByZO8o4MJGME3Zvtj6YAic2ihVnd6rNpse8sY+G5Zjz/Q9ccD2D0wZaoWFvjCu1uI0xjDm7A6fIx8sawRGKADuK5B9uY/80b5WWKbmtWTu8HQvDvcyn8BRte5BicZrcBzIrvNStRQOpxNAbDNIJ6z5YSotlN30Y9f1wa6rAw4LwUul/hMrd9YaFeC+sg0dmpriUNOVOwtwMN/2HaOMKpSdQffnTXpf6aXpE9eAWOJuSGXr3vtRKb8KcQKs0qNh7H2uQgAiKLtEaIC2Ghu4AEzIjbsqUC4OW+no+hJsYD+DP/BGjCMnMh85/u6RLS8+QCiqr3olGEd9hpyZBabVnsnMd71R4raXaoET8674rkv8VVD9M3cRcxuPfdHeic6d455st2ohw4xNyz0Qgy27m/eHmP2EhC4PerBJ3ST0gocrkgaPyC1p3kVeGl79PoF8goi540EBBw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC alranka() {
		Location loc = new Location(Bukkit.getWorld("world"), -1103.5, 90, 1295.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "alranka", loc);
		npc.setText("알란카");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjkzMTI5OSwKICAicHJvZmlsZUlkIiA6ICI2NjI3NjU4MzhkMWQ0YmU0YjU1NmRkOTQwMmE1MDU0NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfTWF0dEd6ejI4OV8iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMmJhOTEwNWU0MGRiMTEyZWQ1M2U1ZTk3NjRlMjg5YzU1N2EzMTY2MTY2M2U4NTU4OTA0ODU2MTQ4Mzg5NjgxOSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "hoxJrPRuOUGGEUEASIjkQFKKxxPGzX9fZ1WucTDtxDQXZNMHTW+6M/Kyevujj2ocT54l8hVcTv5bki6E3+ZML663c/6vDSSkGwMPbwOnhu5btXMAs2vKQ7yJ0rwP9cnwSiYwNZI+haGi73a9H8+QK3bf7Dd0d0GN21ac9mfhQcyp1Xyt162vPzct7boQSDLXoxi4NSRwI+8M+0oNeyZSwa7cw+tT8U/vTv8j6DTxP1ee8nDv2SlPBYyB4QX5uoZfRh5p9hPSV9TF1eMttndl5w50Ac/FtdZrDmChNnlfX3ARfXxkkdIgfkxHkZ4C4ecuj3QAOc9NUAiA+zKzjqlby5JEl/X1npknHZBW36yxqy2WOOR8GzmmHaEb/gjDIY0UxdiPGYcQ8mC60CNK/DHGFx53ejw5oQkuKFhqdDbCjDSv2zOd6doYwBB+TEB3UMl84NRzRBFGhoyDUate/CGXOxxfMuB9dP4xXiIHfqVjmVSbzi+hd92ZMakfyvsCYYTo1g9EhcpW2zzawQnaP7TtFwEZSzvhamXOOry/TD2Wovnwd7n25ln3HpKCq9qdftQ7Za/AEryFT9TWPlOkqRqyTJVt5pcifgvzs8VeqMw6vYUK6XQW9IXETJ24WlILko1gp2JJivyzt5M+k6+Rx5kxl92bht03+V4ywmWh4Oad6ns="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC anurogu() {
		Location loc = new Location(Bukkit.getWorld("world"), -1105.5, 95, 1297.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "anurogu", loc);
		npc.setText("아누로그나투스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjk3NjI3MiwKICAicHJvZmlsZUlkIiA6ICJjYTU4NzNhYmY0Y2U0YWUxODAxZmVmODgzNjhlMWExNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRocm9uZXMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmZmOWNjYjI4ZTc1MzFiYjQ1MmQ3M2RlNzU4NzU1ZGEzZmI2MDMwMjE5YjkzNTRiYmEzZWU5ZDkwZTYwMDRmOCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "yN0DrK4KwV7K/0az8nDeLjPoPuxnUy9PDiBkWyg86y5j0OcLOTibVGB1Yk1/1Ev2KgHySPXllklmV1o06BLeUq2rnw66xisQQVQbPOUwCc2tQfAdB3+aI72J+jeB9/wHEEmojGAHqgErNK3nmE5EuLN96lAgJaZmDDdp7TmhkUIbBgFWeRjXZ1/4f/Nw4C12j3W8ILjrsbpx36Rn5Lwdz5CxYRAENlR90jmdHxXZ9dDgcriNZGgwmUitQRwyxzqjMzMif5oYcqieh8xHQP7pAn9um4PckBBYYFhGFUve8bE0HiXtXbOFDD38lzgg3msaTHjTuKCealHao9JiRyGBSpfRbK4OH8jzcEeLYD6WVe+lUQHF1ZVhhaBsyodSbJ5SBcLnClqcbQSN97cx8P5q2WnwHbrnr2b1Cd0Xi3UV4Y8AgtSAbwvTX38Ct+90qAy/fMd1N2PnTGdIeVuLxqr6oalL0n+6+cOJ3FSB22uj+JcANxJ+Ajh8hdNsTW38SYTrCIYUyGykQRQyknrHhpbRL5IHNpnnMncg94J43J+hdIOaP++YWjOXscilJKeLUqN595BOOci7WEu1KlicSlwDGxF3NusI1DCizSwOHQQMSG4Ke5EjynRU3SFwsDtryIz4KfJ5PLtlH9kDlbvtSgFiDS4RYVCsUefhMloDvWt0FKk="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC azudaruko() {
		Location loc = new Location(Bukkit.getWorld("world"), -1080.5, 88, 1230.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "azudaruko", loc);
		npc.setText("아즈다르코");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjY2NjQxMiwKICAicHJvZmlsZUlkIiA6ICIwOWQ3YmJjNGYxZmU0ZjlkYjRiZmE1MTY2NDA3OTcyYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJlemtkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YzY2U5ZWUyM2E1YTgzYThiYzg2MDhiYmEzOWQzNzYyOTRlYzkzYzllYzRlY2NhZWI0YmI1MTBkY2VlMjVlZGQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "nRE8YrpC6z1bVnYDIsC9d0HZ/UUf71uvG3ZSMEBFHlACctUruukQKeNor7REfI07fYSy4XqPaHcNx2gCIiw43I87FcpLFVGLDKqMptVYvl9wtKWIVKXi9sxQHE471E9NXCpKwr34fr8yZT9EKShGRgbQopgq+AKfwIs4v6eDh1bBZDKTGdEbf2fnGVKqea72bDKHJUR02gae38ogy1VOOtJIEfAjBf4SbwF97sT8Ow2853RWALesQCscs7jM0T5TOmfGNU49frYHwTWsl/yrA3MQQIQmX1tqH2RbqxT0u5bonCBMdjpxI+ZylLr39xJX/M/toaUqf8Kt98mbSzEG9rg94wEa1EVar/iTIAJVkXxzaglNNIyCsdqKZp6dQ6iHufBfmBIIqU6K0IJW/6Iwyl1S1p8KKlwrTdGJHbKlL8W9BR79oaUdxWbfDQp8atT0RvT3OeUVGBQeDlar+tfl64Hx8BtS/OWaqokraU/RpN8FO0fOoEedFdnzLEpz+DQ9NCgmISV7nUXygCbJXy8isN9uepJCJHf5WSEJPGUvVsr/o5YV6Pz8Vd66NSxbhdvLxY+gqwI4ieVtzXCrXQFEVlkHBE7V9K8Zf4OhCIRveg12yMfDWjZx+izQUZSXX4eSjQbCJWlBI2MkhZAPZPfbjM5EyO8TW11HL3FO7OQHt3U="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC kuteno() {
		Location loc = new Location(Bukkit.getWorld("world"), -1081.5, 94, 1215.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "kuteno", loc);
		npc.setText("크테노카스마");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzAyNzk3OCwKICAicHJvZmlsZUlkIiA6ICJmNWYyNDcyZGVhNDY0ODJhYWUwNDllYjM2ODE5ODU0NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXRhaWxlcnMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTg1NjNkZjUzNDViM2M3YTM5Y2I5YWJjNjJkMGJlNDc5M2UwZDBlZjU4OTVkNTZiYjA2MTkzNmNlYmQ0MmU2NyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "bbmXUr57CEtse4cl1HrtmuAD1AJL+iu38P+pl7qM53WKxDEkNLcWzqfRtlvjcuU3kDbataYnbNpOg1ZoS/ogMcyKYhv3KMAz76RRNZEucL/9OYZJXc+BFqhMGiBCuLUzjUayIkmm5f0zP/yzqR1fWxwqYc8EadtbtNEPsvlGR/0wqqb3B1dcUh6SX3BB7tOqZu1retwUJjjUlQocuq7CyXzgufTGVm3dbkL/kOP/KiX511IZXHrs18O4oYj/K5Nzjg94SLEI4sn2k62SUOZ38uM3CGq3ZGBg4e9R0EekSDRyxFb37TUNblTIc3QzNKTRYuCupYTTe4okLzDYuB1gGyVcBVabcPazrbCYmngtEhNITd6EwNslNpz42LSLiwy+PhlxsiO9qPHKxoz0j9qgG3x2xULXRe+0zLE/UsIsNs8VlMBvXETFMfW07u/yo3w2RPn758IjDv5arvAjnusIyBnVzfTGP20R5ArsmFKlGv4DlepM51znYdYMIq76N6tA9tn5M9/9DEcnJRo1UMiEpCR7COXmd+mlviPT8lGND2SeR4w5WbfM5rzkG9u3OFZdONajpZlMHYSzOFj3uZ6Cu9AINbGo1luAwvJg6io1Z7ReSC82BgRJsMswUk6GdrJnwWc+Pc6y0c6x3/EaM2ZRPry04avMahY3aWwalWSQoE0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC nickto() {
		Location loc = new Location(Bukkit.getWorld("world"), -1077.5, 94, 1236.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "nickto", loc);
		npc.setText("닉토사우루스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzA5MjA0NCwKICAicHJvZmlsZUlkIiA6ICJmNThkZWJkNTlmNTA0MjIyOGY2MDIyMjExZDRjMTQwYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnZlbnRpdmV0YWxlbnQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTlkZmQzYWUwOTNiNTBjY2E2YzY5YzIwYmRiOGY4ZTY3ZmIwOWQ5ZmQ0ODJmYjUyZTNmMDk0NTQ3YjNkMDQ2OCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "T++Ul72UXDU5kUBIs1e5b+A2oMAxPlExT/CbOqH2PgbMQo0kVm+gyf7E2D8Ji9LK4uEmvpV2EG486ukoHWqThwwoU66p1U3GjYQjzfvmyVn0ICuqzpk4iBChKLSw3DoPaIWFL6jRKvZub55kixNdgUvBOhS5BJQXAMbtOwK0qUm+CfqL+9+6i849W7wm4Eozd8YAeB6UOaBmy3SWI4KVZPqyWnuhJwUUMvBqkqml//YXAkU8nSameQ6X4AmjUqmR+dka7f1fAZoFzT5N1q65aHVaHtH2no1CTfAkysKuMHlFvkRe5ToHGXixX7jNAjKMcaSdBkP2AqewcxSvpts406gcSsbpoGuIk8kTKMVDwh4zJQJlsCekjCBZ4iYr4FjOuAdm8bZI5v9cZGf17arXRwxNxXdZZBT2nmIcVenkgdg+APIerOnGMaal+G7vNKbIOffDVgEqEaVSOTrKiugHltfUEByWS7NLJyewwLOF6qQjb5mToxlw3Ks64OL8DdWMyDNbBLuAkZeC06jLGaz0uotKQZ8PKw7kzvFZPqM3YFv13wzdlLa4JZ13D2RlVKRy/+xKRLJEc4r/icGodva+ZATz/kgF71SX4/BEs89gWbCyGShAz5uFT7gnpIHJmCR+kH1R1WK3n7n0Cahz1P4q8fI8HaAGvrUtK7erdewDwmU="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC ramporing() {
		Location loc = new Location(Bukkit.getWorld("world"), -1046.5, 88, 1282.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "ramporing", loc);
		npc.setText("람포링쿠스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNjcwODgxMywKICAicHJvZmlsZUlkIiA6ICJhYzM2YmVkZGQxNGQ0YjVmYmQyYzc5OThlMWMwOTg3ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJtYWlzYWthIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRlYTJiYWEwOWY1ODcwYWU5ZTc5MWExOGZlOTkzNTZhNzI0ZGQ4ZWYwMDkzODYwY2RhYTZmZGRlYWZiYWIwYzAiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "X82eEXAEueursXnjdSQB9ZofQHBwP9oDO4dbgBCB92CsVd83KfEXzLc55uDf18380CYlbRBIim28gRTQGKYvDFoT9WcTRjP5joaJCMt5mOL0bDGRkjEWg5GSddVZOLb5hcHvRQ+F/ICXyJ7N86rZWGjreWTaHewTjynNAlJkAImHh93XDIjFzGqDEE/gHgWV0p5L4Lebywd6xOITc/aQ6PIp3PxQWiQbesBjlouYE2Wce3kNIAzZkQjuPLflbcCN3w0j3+UB+xNIKFYARtCPRwodpZHG3kaYIaS2RWKv7T0UGHQL+3FwvbcwwRqVzy5I0KG5iPgj5v8BMj0CeGrLpUuiE1eL8eoX1371xX1hF1ZXWNI3eNesz056jyr3YslSTXH5TenRYO0a0itYqpJus2nucrx5yObuB80hqSowR0AH1GAOw3pBGMK1tXPgdGkEaYnJ9i/vqEwbbq4valt7yoFClNucMwId26IFbCXnzrJOwvt/waxsOCSiVsduD19UuUEvb2B+1xdk/YNVMIjBT3ww3Al+gA0FQrbOWzAJgBnfu3hwWWZ4ravsGFpa7sZTLXIICzKuU/BjP37Wfw3J72FhC9SOPX7bbxaufd+GclhCFjOeUAa7UmKVaKoEEPHsfOsgziwYDuNLd6PfqDoj4MQxLeiBZLpJsle3tw0lCVw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC putero() {
		Location loc = new Location(Bukkit.getWorld("world"), -1040.5, 88, 1281.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "putero", loc);
		npc.setText("프테로닥틸루스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzI2MzkzOCwKICAicHJvZmlsZUlkIiA6ICIyMWUzNjdkNzI1Y2Y0ZTNiYjI2OTJjNGEzMDBhNGRlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJHZXlzZXJNQyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMzZlY2NlYzRlNDZiZTcwMmVkNWMyOTMyOGY3ZjlmYjc1M2I4NWVjMmJjMzc0MWViMmYxMDgzODI4ZWM2YmUyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "eD2QFZOVccIAz5fQcmekJ6o5rp1iT/QiMOPh3PWzHD/0lGrxOZLJNVNGALuW6yVTqWtTOvp/LzuJ9FuIuuCALPYyR0wbgZggVF/VCw9wLAPqdz0D4EC/9rjvvG7Az/KCARSfNdw7AlcGNUcvBFnmc27rZkJqKbx5Szuj0VeYMTz1yVrBz9f098v4s9YV1XutWW5N+4Zh6fKW0qM4h+VDRU3YtYNiEuTOhjInXAxRw+uJvKEfy0LGVjceEDv8lD3276anJzDiVrmUjEHxjOAkFM8AMWheamE3958guuKt2fZSaQFHRkkI/gvu43fZ4hbikuqKAl4h7/mdYvgx500pnLzefBhWEM4j1pDf+pWO4IlSnzZolzWKaG93sy/M6o3zTSJbB7CJB8DKFOdK7qCbWGb23kMws0eifZ2Qv4wQpFOti58EWMqhpw8RgPO6g0ESEG7bD6lMMaPVw+iSg7LPD8K4zGYNaVvAmcOK5d/L7R6PQTzcZHfd5i0c1uehpBwtDIh9jn6WVy446h2OXUy5aOZFWVU3D4nqYpLrj0xAIvheaHepgWKIRCzWL/OWpY/b2OJd7L2L8Y15lLNY9/3WOjBFISJrrUlfgucKEnXbSSBHkHISeTvJg9/zsDbIPgHosyXnflCbkiNYe+ZC+O1aUu8MSyS2bPKvCYciELG/iNc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC tape() {
		Location loc = new Location(Bukkit.getWorld("world"), -1039.5, 88, 1285.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "tape", loc);
		npc.setText("타페야라");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzcyMTI5MiwKICAicHJvZmlsZUlkIiA6ICJlZTg4M2RmMjM0ZWI0YWM1YTFlNDEwODhhYzZkZWIxNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJUdW5lc0Jsb2NrIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2Y3MDlkMjg1ZmI4NWE4MzA4ZTU5MGZiZjIxMGQ3YmIxNGNmNTkzZDk2MWE1OTNiYWNmZTc0MWNlYTYxYTkxNTkiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "IXwhAkjEoLtyj3MBKNw0EC5qofdboWNdMI12cl2eeyI6abhbTl7EaHQTnQmkTvhv7Zsi5lVdCo2yhc0oW/Y2Gccrm/1woDRjM8StHMVBLGmQYy0B+03gRBHTM7JPZLrL+uQv+ae39EiDxls4iEsmUZcPuWphPWYNvm8Z1uBT84Z9kI8npmaBveUziD8GCAXgL/0zmbgTm2NEmO2IRNpxCXIQ/IZoqnq+1vsxBD04ERnrWOSfSqc7eJHZlyJ1CbSYuYki+KAdstfcrKpjH/TDvh2tbteG/d3Uo6CtBq6pRntkWZ34p5g3Uh8cg/MjvLsTgL07gUacHP8rJYWdYaES29UyuenBCKaEZQwLlvP2nqffLexAYzbsZ4Q/OhY/gW2iamLwTVx/WqpKtOhK+l9T2T0ITPKXvF1T7v7Y+syIpQ+7zIVgiwknDlLQmDZdFzUo0gKfbb6Wq9vS6U3a+8KECiBIr+vlXbNYsC5n7MdmSL4L9b4uOx6uBxYm70AX1aBG8N3vvLo/aH5zW7OE1UMMvFoF2VPPmyj20z+rhhLalEVDIpvU2TS2xggxv5q0JxdLvg0L4rUvNGVmIGA8Y1JKbR/ncvDcIzuRiCV+OFejKA5Z8lPaY2qphxzmwfZg0Xq2HW6GeyKThHLDNkPN89iJrI/vDk1dh0O7buWYu4jC2YQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC rang() {
		Location loc = new Location(Bukkit.getWorld("world"), -1182.5, 181, 1450.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "rang", loc);
		npc.setText("랑");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzc1NDkwOCwKICAicHJvZmlsZUlkIiA6ICI0M2NmNWJkNjUyMDM0YzU5ODVjMDIwYWI3NDE0OGQxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrYW1pbDQ0NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82NmYwY2M4ZGQ5ODQ3NTU0ZmJkMWU5ZDQxMzY5OWYwZTZlMTIxNGZiNzI1OWZiZDYyZGUxMGEzMTdlNzEzZWZhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "yS1r2HmeFmy9EgmqXalHGx2Y04JiObLcbCw/JDCaVzVw88Ub9Vndo+hde1AaQAA7ALrV/AispRuWQyQB8rNekftNMy0LcFIEehKSqvR3heJbegmoJIw5nXpQhysA80ySHhTNmIvMnK9/Q2OinNDeB51sBFv2sCCclM4dCHTlzuZi2Lb9svdgGkr/pbU30tL4wF/EVOe/ojbu13xdTjGFEz9re+cwTA4x0E0S8eZUMhk0Nm4tVKmi+b2j5w7PHPJQSTOyfVrMh2KcwxXnki/Y/8A/cOC5icoC3InyQPsrdVeIXI4HRWmIA0OJpIM2kSwRoH4X3WzepR9tONTOfbvtNN0YopL/RD96fpilkk8fLe7XG9KRNZUStFj7Qt3sAHeHtkmO0hY459yo/FLDMm/nVgMiw4Ga9s1M8LKEVPORIE2+wxmlCgizY4Km7d6nbyUhmZh28VsI5/9MVTMgmR8egKykUsguCHsMCkQksd5xbxd2peABWnte1GTzoQ14aL8gfZhlrDUTUxRMqCk2lZx4OxYJgVRHd1N/G/RRHkDn8DFFyaEDmictP6UEcXriZWm2tTcdrM7d9SsLOUGqZfwIcj8Q8/W5l/NyH/W1C2pu0tcXTbcLC4HviD4eg804WXE+/fIZQ+ZqOiwNJw0ilBciAZhfTdWOpN2ANVp854+3A5w="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC edga() {
		Location loc = new Location(Bukkit.getWorld("world"), -1184.5, 181, 1463.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "edga", loc);
		npc.setText("에드가");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgyNzk3MTIyMSwKICAicHJvZmlsZUlkIiA6ICJjMTNkYzkxZjg1YjA0ZWM4OGU2NDk5YzdjZDc4Zjk3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJjYXNzdGhlY3J5cHRpZCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYmQ4ODM0ZmRiMjkxMDY4MDBkYjY5Y2I0MjZmNDYyOGI5MjQ4MDg2ODQ5MzViMjJjNjZiMDhjNzgzOWE2ZWZiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "GneZoSHmX5GotVwBEmBn+Cy5clAITKVwTghHHTC86yxsU/f2kjDkXkplOT1VQclRBQFSPDrsYDGQJLghxm9lvkFiKHbtjYvD6W7vYPT7ZBbOpE6jcRbfdXv7h4biwvEO3SOOkELUjv1HFlTi/Fcd+9KoPNetE/+ZUbDeWB2Ch/Fw6Km5Mmkj7mKgtpPy+KBDiASxQbtc77I5xIPY3a8Q6p9998qgPFZYH42LFIF9dh30zyQFvR198JHdAzMaTzo5nevYcbtc+PyqeoTqBawC+HDwGWyreaWnMN1xnp7fOoSBvTW0DqG59iuwpINqjhMnphVUeTVTLcZwfXuR0sw5BzyA3wFhffBy818w6ROBdFgae7BNK/5PaEID+pDgtN5kQGxD8OnXcgpeQdfSd97j9cov/730w6HOJ/eDuzWgnpwdKpYMpTX+NUtfpoGlBOv0KXvyqom52yHurIWho4WzYpPRvJRXYFAAZzOZ8fKvwUa/RzRatw0+TayECA5Ol7m2j8o06nuDfXzC0+XTk5wlIpXbdQYFMRJ3r5PaPBD3I4QXLw3LiHnZd0rUDapcgCS2vWWpu4MSRZtGGWZP+fONN12SbKxdpcfP9hszZlapKxSFNp2mxSFa9jK1bOPPJWiozPzRHQ3j2rPxv/ve05ATRaSUp3iYm21KoROwu3C5tBc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC tesa() {
		Location loc = new Location(Bukkit.getWorld("world"), -1101.5, 85, 1292.5, 30, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "tesa", loc);
		npc.setText("태사다르");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMDk4NDIyNywKICAicHJvZmlsZUlkIiA6ICIzNWY3ZGVhNWU3ODE0ZDZhODM2Zjc3YzQxNGFlNDkwZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ5dW1laGFtYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mMjRlODk4M2Q0ZTlhZDU1ODEzZTNkOGI2M2E2MjExN2NhNzQ1Y2E0MWMwZmEwNTFiZjg1OTllOWEzMWE1YjYyIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "x44dXk999mVM4xZk6jqXNpDjxYutdQS4WRRhe00f2gAmO9FXMjbH48Gj4QzbcR2zpjtcZ13hemaFfaBE3CjKO6r37sCHtC7nti8SurBaFxicpXP6YjThR0BDsSuVP/BJEDiz/T7tzdQf/KvFWv+AOSlNUlNB669ET2Js2Sv6b0/nxrxyZtwn3y9rQxv78lK0AfHqJawpjS+8WSOhJUAi+B83/lg7zTxWUuzPK+EfyVJ5VLJnyB4ckFDZThKwKcHMO73ATCMwT9gCb/GtaKT3VFiriCFKRPV8IKlMxSElZuDE+x4ptP+7S1kpeUMnS5GhCETXCFM3Do4Vvom0oFO1wZXEGhnZZWyag24PZXdlxWPdQZ4NccokzSszGL2stzoY5JQLx9YVTAgWB6AdiOQsdTBHaHqp5qy3kUs5b7C+s8cRa5DGjS2fGSLpywyG8SLJoJYuI40l4SuwwoZMi+F45rN4PGkz42k5Jy1O2C1DFgup2CMhke3vleEF+BEsngs/Klx8hjXCdGceCJWmBVOCheABBX+RnZpfVVDZMgeD2fQoVNrGNdFOoCBC/CiWya4F42o2Pz2F52WOLG+cNeJLGFUK0jBeU7AzGR8P07tR7aVfLndUdu8mMr3sxBbdPkTpjjiozQ3EjQ7WPY15491Q6c6RCTqs2elokkljW4qj7NM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC phoenix() {
		Location loc = new Location(Bukkit.getWorld("world"), -1098.5, 85, 1295.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "phoenix", loc);
		npc.setText("피닉스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTA2MDM2MiwKICAicHJvZmlsZUlkIiA6ICIxMzdmMjg3MjUwOTE0ZmI4YjA0ZTYwYjg4MWUwZWE2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3JtYWxpc2luZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS83ODI4NGM1M2IxOGY1MTkwYjk3NmQ2YzZmZDE3MjY5YmZhOTIwMjU4M2EzODYyZjE2MzE2NGVmMzk4NzNkNzVhIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "SWwTKb8eh7Fu0eARehmldipdTHG/5FMhe2KdhoX9jB94WhrLdrFK5IHLkW6p/dVx1ywiDLvmjIdUNdf3bpExHkV6MopyUbEAMgK4MDzRMBiQoVIKVWRuNh2X2tuNN2bXBJOWBeJ9tWaABiYaAYfT6MtLhWmdBw7Bk4ldTZtAYWKIy48mhiNxpayXfjcjwoJaN3n6RTyRHDc5C3S8HWGkOZyol2VCQXP0E8759t4hW3ad7hmykBJe+C/2MhO9dqCw05TMrgCxcnqYzRy9h5H+kPPKuIRjw49vegBpzz5j1a8miBBaQeEUD+KILCryHztfvY1ST+w2Rlt34edtTWj5ki2iU2PsykFxfbfri06agwmRVsgUFkbj5Fk+ol9/g8ljphuV9/V4hwsl5o8Q6skzYA7oOE0djx8IrNRUCcdnZ1xthdpDn23VUuZDMjZyraZYumoa1d/W11OsWReObe6MlMed7taz/0Q9wIaPJIm3eLua6kjG54NNDLsDNw0uju8nP29g3vrJPMt31F+G9hvktf0IOqN3oAtqawpiRKpDxvU0Ifj/KZDnsbOsVJBe0TOfv5svLvNvN8WUB7FdxWnchi/mcF9WCCAVPBB8ATT8isL3lFXExCITMBGNImH1js2cEity8ln5RVmCjG5EricnF9NaaHzepSxVUFkKVFRC5LY="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC aruta() {
		Location loc = new Location(Bukkit.getWorld("world"), -1096.5, 85, 1293.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "aruta", loc);
		npc.setText("아르타니스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTA5NTgyNywKICAicHJvZmlsZUlkIiA6ICIxYmY4ZjBiZDRkZjc0Njg1ODQwNjU2NDc2ZGU0NmNmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnV6YWRhMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTc5YWYxZThhYTZjMDQ4ZTRlMGJmMjBjMjZkYjhmZTgwZWM5OWUwYTAyZGEzYzZkMTczM2I3MGVjZmNjZmMxNiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "mby7M148hnOCh/CrpCR0Mh7fZixsxzZAatFc8D7EsxDTzuZwxmbT9kgJ6kSnCX0P1RBN6pa0/eMXBKvmU2/BTnDLc/ydHgAiZvMbqNDDOmbqIftTdiocuI+VFCjnSY6bGJ3WiGoDYzs8di74DfSmCUVjLtNone2GhdVC0/7iy7dOfeI1//7Ol5yHo2TTodfiIhHH260yEmJNJCIAUuzNq3bL0qRF1Vn7xw6HFBNT1wlY1Ei3/4FjdJOt/LPb/NErRYzsMvl2f3GPj6O31UqGM/FYzFwpwpbU+WMwUBjEkn5N4XC72aS/sBlW+8t5WMKgK1PD1flQbqK+6lmElF7QNdd6agy+G5/5mOCI7OAoQhSGS4hTQ0x1n+3FWsEGCdWP1LmolfW7pawmJr8EWSomlF5aKLiXF5NtxWL8q4ge7DgoES4l18Dvt0PqU7kDQi0DyYMCiWPVwUWupEB/RQuneJsLjeRB9Efoy2TkDW0QVM6US0bT3nAHotpgPh89lPx1RRyMh9Xq9zvkj6PI/b1T6HmYjyMKzDu1hS6mK4gNvyjMk+aiYqTbPZpnFu84/6flpyx5IgtFGvdewqWSbYGkAcv5qPjX4oK3BBB6XEct8rMv+XF7hM5++M0FKvt9q6YEhgUWyB2SUcn48k5kLEewqhv/MVYprxcY7WtQwcTg6Qs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC rohana() {
		Location loc = new Location(Bukkit.getWorld("world"), -1085.5, 88, 1273.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "rohana", loc);
		npc.setText("로하나");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTEyOTg2MiwKICAicHJvZmlsZUlkIiA6ICIxZTVlZTE4ZWU2MzY0ODVmOTgzNDJkNzE0M2UxNzYxZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJXb2xmX0sxbmdWVCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS82OTUyMTY2NzI2OTNkZDkxOGFiMWZiNWI5MTg2OGYzNTA4YjM3ZWIzMzNkMTAwYTc4ODcwOGExMTUxOWYyNjY4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "nrub/sLwpoZ9/2bgd2kJTSBwvONB/SBFScviuNJ+RLGCKEFCb8dnLT4WhUGOEgnFhmp+NP/rKfeaNzj06NUf815nP7Ob2xs3MR3NRpvqJknHA8PGKfNDMpJNHzAe/xdQHUisEqZ7WQTmUXbTATTzr28GxLqonW28h+hc0Y4ua6+tjPdtNtEnAUG+8iHyMhnPwUIXO4UKn/C4PUy1JOyjnELDYIS2Fxv1dII6NNYoMIowqZ84LsWSTOPLNIT6SUX5oBOoYgOyhTupFQnUuahB74OZ+ddDUWaneNO1dDLCbzaXzC0lwKYYpDxRnbf44rV4ATssdzXMsbaV4SKJlFjPrwa9EqrKgc5Dw4KROWPekkG5A07Z+0ESioQboRGsbGr1FaLvWRE+Glx9OXJskStGnHn9sgdA08N4ZJEeQcrM6rfT9nFYCsxxzNyM1Y0TaC6yKxQFTTXuK7ut7Vq2uxIMRYaCKEKNuRwwKm6/ocXFvhCS8pFrUckD/S1vUv9gLoTl3nzE6Jp63d8VTXZ/KRhtqfvPnccLWcL2U2isC/aveUBkGRoxrmGgX/VwtHtLK9h9AnEGGm5Ysf8Z1+JYHfxhoUEJntiJzFDS+cqWEMP2rhKVX658LNgL76vNeaCOH/B4uLGdjGP2vBFqsx64x1jopDFUBqfNpI/CUdonIBPLDsc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC talran() {
		Location loc = new Location(Bukkit.getWorld("world"), -1085.5, 93, 1272.5, 30, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "talran", loc);
		npc.setText("탈란다르");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTE5MTgwMywKICAicHJvZmlsZUlkIiA6ICJhNTkyMjkwNDVjMjI0MGUyOTM0ZjMxZWFjMzNiY2IzNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTbHVnRGVhbGVyQWdhaW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDAxNjEwYzZlMDNlOWZiMmE4MGUzZGQwOGU5NjM0YWMwNjViNWJmODEyOGFlODE2YjdhM2I0OGE5ZGRkMWEwYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "c2rgRDTgrc+sHX83KNiAsQRrcPp8bsqcEXYubqeng3Oos2nfz3u46v6Q4RRiwXF0/ChDWVHMdfLgBPh5dz0NrqNgwF5h7O2OR9SNzXxO2NZtYsj+paqZDssoqjRN16DnWQf5p+3B8KbalCWGkh1oin1RCMUhAF6cuoVCFqthRLnD5aKWTAcrU/R0Rg0bkb+zNcB8++P0mK6+hvFpm+fXrVq9dH27sbX9OJ6RrTESZ8FgTS9kfhXLxLsvDrKsXoAXkhfz9ogmlZMgZ5JxSs5QSed7sIfGsPd+4cMlTtMXzCCx8kn67OzSwIMEBOHh1fRdPphd8V/kEIipVC1cBffzko9BcHLz9LG+HzSO8Y8xX/1B2W0kEhis+3DSwirweM6q69ohfdAAh8FVe2sggJekXjwoJr4PatA9liIfjOm/5ypsV5o61qe2c/C/Q2hM3q26UrLst5vE31nIPCuUuCIPmqYUE9du6S9/R/Jrum761AeIO1UnlBSyxTRRUf316WXRceSkqlr+QceGtufnjVm8/2CFe21Dh9BQZf+oTXx1HwOWTCpx9c/398iIEe9OQeceg0NRcsRRUS1xYZZNt7xzywyMq2CDKL2tB/oX8Auq0qmfFylxLaKiid+CoS45o14L7tezttc3gqlSjh3YOCWtjaLA05UC2dL07Y9P0Z1M2pc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC malrash() {
		Location loc = new Location(Bukkit.getWorld("world"), -1078.5, 93.5, 1275.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "malrash", loc);
		npc.setText("말라쉬");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTIyMjYxMywKICAicHJvZmlsZUlkIiA6ICIwZDZjODU0ODA3ZGQ0NWZkYmMxZDEyMzY2OGY1ZWQwZiIsCiAgInByb2ZpbGVOYW1lIiA6ICJXcWxmZnhJcmt0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzJlZmFmYzZmMGZiMjYwN2Y5NmFkZTllNzBjMDE0OGY0YjNjYTcwM2JmNzQyZjE4NGY2NjE3YmQyMTY0MjNjYmMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "qcBvpW1NACDbTsKC/uA1ozxu8swnWru8NtYx2/qhiBOCgg73ipAiittsVa0sYz1JsfAE4GnyI6v0gFni0lNLjkwxgOMNNPMjdChDQdN5J3tVi9RYUIndRN5wIdU7gHlYgOSAJts/1myPmwotjR7g7Rc7fQ7WlWRd97hCra9X/TMSt7HsMRvchN1COfGAP2OM1wxDlU9UffXY19kfm2eY7NOA3mNcXQvCswSpnhPziA2Yc1bcIauBFfFtC9dDRQCBRkjGsz6im5G1KxMUeELcGLjjqUp6dDq6RBVJFrmaIw/cE9OhPgFJdPOV2CnKrILaQkcxpWZhUiY5ByQnCCSU+2h/e9P41iDcrNNZjTUhVKSAhXuz/+jktkk+zu8vxq1ZaO/fczkq1DV/XSYE+HD4JfaXwP7NFOYKnoddd/ZXSvlcq+qjpPWIOPPhedV95TY1S1d07638TQ2qH4grW2EVl2ajBh3/dxqyLA3GvMFhikngn9K2a0RnjxiHE++fKLEEomCUV7mPnxfkTC6lGNFkcbWUbucVXfgvDH60AEBV3UcwN8+ZUtU3daPK4GHymP525bqpkWban+tRly3kldkTiE9H907NKXm7Rr2/BCP8adb/D5W+wSJmY+bI818MPJPBEmglFQMchm3KwkBq/tdL3FXeNUqdtAXVJJDHABfv7qQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC balentin() {
		Location loc = new Location(Bukkit.getWorld("world"), -1087.5, 88, 1257.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "balentin", loc);
		npc.setText("발렌틴");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTI1NjYzNywKICAicHJvZmlsZUlkIiA6ICIyNDY1ODI2NWVjMjg0NTY4YTg3MDJkOTVlYzdlYTc4MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJBcmdvc1oxMiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOWQ5YWRjZjlhZGYwN2Y0NzU2NTdjNWZkZmU1MGYyMmY5YjJmMzdkMmZmZWY5ZmI2MzVlYWFhNTkyODdiZmFlIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "kxf/K6CTXwiPOe3ZD6udKyjSZcvSz8bpszMeVNMjQL/HlP7FsrgJsllVtKOxwzcv9JlAyn/dcr1NxLoFW1xnBkPMZJ0f3qwIjPUUgTEJlK81+BBJYETdzbt7jqtGfrq9upBGNPhCzIaW/HquluIhZIbAJMOr9GiWi+UHpr46RavEftT5o5YDQ58BuLaPFayloZpeeuHScIAN4X7zv9H+i+OMcB/vEvE+P8xzk9rng5smI1f5gxOx9xBvEsVN0dHKVutMdneVjZwr6fkYajIG5fxSpDDx8/XnQttyFAVqvt9wCMPuB/kehCrWl7EJTcNcwotyrRqu2fGuJ8B9wn6g4FtBWzRoeRjSPU4QBmGO0z6wlQSacy7ENLwa6W+8zNWNWJdUT5Ii6V526J485vkBVpum96XfLPDjCq+re8ZGMpQQkfCUL8aMbcfEFCc5yiN36OsL034WE1fhrR66B4oJf8XRjfvxx4b25qEZX1bb9NkH2ZwlwCWkcf9bHcD73nq7FPyCmkgW024RByAIh9LewdGsQBlcDgu6pfx85CVUZ9Hy52Q8act1KV7e/GV0809Rs5SvNvW4as+jRGZSn5SvnE3F91LHGqjbX2IYwHehs9KvwTDpdRXdv723THTlYdst+r7x3BNTt/teUIxP6i2EanA+IWE1p9WrSdklllPWflk="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC tenma() {
		Location loc = new Location(Bukkit.getWorld("world"), -1093.5, 93, 1257.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "tenma", loc);
		npc.setText("텐마");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTI4Mzc2NCwKICAicHJvZmlsZUlkIiA6ICI3NTA5NzZmODRmMDE0NWFhYTc0MzAwYWJhMzc5MTIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICIwY2hlYXRzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzczMGI5NTY4MWZhNDcxZDE3NGFmMDdkYzNkODlmNjJiMGY0MmIxN2Q4NzI1NGJiYjUxYTE3MTNhODQ5M2U1ZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "BzzyiuUz3h9KY/0gIz1NuHbEwGadHJXoumo0YyhN7E+t9LpMdXSiUIJhIBnjrgAabrmv7LW7ThheVdz+N9e74CL7LC1M7JR/VOV5k8WViWxx/jtqhh0UkFPsGOBicrf9Ed96d3fYa1x8G5DCIPxVTJ01inp3C0lb9jwGlOJUnPHOf2rp9NDV1syIAvOqbaJf586y2DcYsUEoAwGtVS8V69h7ILgv1Q+UKTf+ACKbsjQ2ssQwqnZBBfknUhZc7BHumWSusBBEQMww7lYPKevVxNwElxFulNaDhFF2R/eXEEsXFaGIvkA2KcXa+99uMNtya34RYnxrRjjAl1dz/JjhXaFSfKTRy53gthRSVhI17CUeonx/qosyXQMPU4Wj1KswoeRAmvwmWUek1oa3g2zjR34y9HVB+ItArYJ/KZmMn36UxP/mUyN/UlAwkHnKHBSkSZzd0IHkfHW9gqU69Y0mLNmW402kCv5/sILrsiys4gFZDIMDc4b5NSgUHAcib2gGKNBjiQpkxb64f6FKg7eMc35NuUivwdiD9jwwyYgb08lOdJuEJ/pyPPQSSGc5+1bJN3Tdb+44GyA8d3ZQDT7iCVoqzkfCtKMx+/1E45n32gLjbcLfMsTAoUVce5h3hRQkw64kdDUf3xQ5/wW2UWQYmU9q+7/cIpNgJJCgUlpQoBQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC yujin() {
		Location loc = new Location(Bukkit.getWorld("world"), -1082.5, 98, 1255.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yujin", loc);
		npc.setText("유진");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTMxMTE5NSwKICAicHJvZmlsZUlkIiA6ICJhYzIzZmEzNzRhMmM0YjU2YmYzYzU2ZTVhODY3NjIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJxdWVlbnNoYW5pd2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWNiN2UzMGUzNWNmNjcyY2U3Y2ZlOTY3NmY1OTlmMThjMGEzZGI2NTUxMzMxMjg3Yjc2Mjk1MWE5ZDcxYjUwNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "M/fTiI+MamglldavNrgI/GgvRUmLvRHUQk53wKyFyVkW3X2xNGAoUZ5CahU5Go7FXOvOqTu/bTNrYulmUTm69SGv9TkEbdzescfykDRS3WyWaxXtq681IMNZzZFgSBfmp/o5G+J5uTpyi4j4KcZsivcX88pW6a5looM0BjFBJ4PRVlcQRG+LaWPnz+40sIswgnA4eSSk1mey4IAXJthcAXaQ3bWow/0UaB/dWu+xdNo1eO29wFoqIbR6bSVQcKc++zGktIsXrf98wiilJGpFpSiPv9hAkZrjsmaCiTGVcIEeOuyy45UDXtprxZET+OW+m9LiJA8NX6mMGAQ4tx900Dln5EG669XWpyhbU4knShnOpoIKhVpfjVldSXLrk3r87QozGYTnz/reuDzY/D9WJXacHXO5DA1RURwEO/fqOWmjV01vrsh8Ba4Ctlr8dBs9G15CYJDJO9RMZmCD03hGp0ESu/ZoLQ0ix1YsuC9ukf4NyNwD7+uLIzL40Glfs2/n8Si9ylRILkH1PpMztE+rJWJxqBdtBJzNPMasFhGqr145SCODSy/88fsoFNUvP/geFmk0WmLIpPBm9ioKGOHBSFiRLXXQGw/SlY0m+f7hi4YkjLlcwB2RFfp9gUDFnUOQL0h/E5zkLeW67MDuw/mTBCaOFenKfiauB8E9JHh56gQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC zera() {
		Location loc = new Location(Bukkit.getWorld("world"), -1125.5, 182, 1517.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "zera", loc);
		npc.setText("제라툴");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTM0Njc0NCwKICAicHJvZmlsZUlkIiA6ICJmY2JkZTVlNDAwMjc0NjE4OTE3NjE2MTY4ZTliYjdkZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJteXNuYXBweU5UMDk4MCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80NzM3NmIwOTg2MjhlOTI4YTk3NDM1NTAxMWI2MDJjZTU4MDMxOGI3OTFhMTc1YzhkZWI3NGZiMzFkNTk5ODBkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "QDWohkA5CBkrx3A/NEewTXDKDXFB5fD95V5scLvE7p/l622VSZLDSGFxKmyaZiW3wc+/NhMvRSIOye49GaZ1pgGrlyqlITjHj1NLcLW8B5ZjKufi9ZthOPeiGGJRcsELBhHE0hgHffX7kBx40fzkX7CF3Vz/P+tX9dX1PdK4tJ03EsK1GtDMIAraKM7L58MH7fgzqokmL2/f1I7GBdySxNSf+CRxnXRaz1Lx0GWZ8iVx9VRyuGkfUqLuK0fu3kSsRH2L6UxAMmMxY6+YqCDHWDjC7lpvTOu5KVb5S89M18GvPI0iekSDVwTJnuksY7a0ks3dv/Ta5Rz8fepcg3xyGBmGmORThGZB8HjNktINkG+udbp5B1yCcW6fNwAId5ns9gZzj7melaD2VQhHpBDgUcDHJV/WfF3EcxAicmJRpbzyTqAi1HxnowsuCPiQ3bf5MqpcGqwMTHx6I+Vib4P5UP5e4W4MoC9c5trMsgV24wReqP84ue8KTzSIdvrflDoF/dlQXAzzIjv5ie4KSNCBz37L3RnXV4bM/D/SgIYU9nTBdQmUIGa9LTgydlmMfzdoTMI/m0a/XChI84nSHAu/i5GyWqXqb9TF0pGr2d+Ba6VZ5aSCqLBE0+9ZdGHyyaAzycaqP20v9MFucDYJ9PhWab6dgEzZ3YpKZ161VI2BFFA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC alraraku() {
		Location loc = new Location(Bukkit.getWorld("world"), -1128.5, 182, 1528.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "alraraku", loc);
		npc.setText("알라라크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTM4MjQxNCwKICAicHJvZmlsZUlkIiA6ICJiYWRkZjIxZTFmNWE0ZGYzOGVjZmNkOTYwY2E0YzA5YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBbmRlckJUIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RlOWE0NTJkNmU4MmQ2OWFjMjg5NGExZDFkM2NmMmE3NTVmOWJhYzc0NDVhYzQ4ZmZlYzFjMDU0NDBmZjQ2MGMiCiAgICB9CiAgfQp9"
				, "EFuCELMzVt5gkT001Rj7wCsDlnv3DkH3IWILVFHEhiPGDt/wRmcQJMcxnp5fUlx2TBymDQoALGuUm9jNm2I4AdGCLL1nXFOQaplWDLkAuXEi2BP9nMTnVo+e/9fSn/r2ccslnRialIsUm4xIiV9r9JpaTyM+quSYlhXw46SWSGIEq70qlEfjxCQjYaPWhP6PcGd6hMDSrQdun3PjtYjQzgeN0bV35E3NsS5kVw7oNpEir2wqCrpAyLgccOQSO13CXdyP8JP4PTYusolyGNmS2Xk7O+CWKe3V8+x9xLhxnS9+9gyKerblFAvioMGXYPb2oRZEmqei+PPrQJ/8YISxLFEgHoKJYTFJwTwOxkD1/GNhg1TzttqMcDE+hBlCNKnNong1CoriHOkg8OZ3rhKSx1gbSQxdAYujwmHRVvUXoFc7/5l8h9Xxlw4HLQF7LEFR+hcY9Jztrcknl0YCLHuYbQND5Ga0XxYX9NNS/ba1jFjLCoy204CqD29/RL0OKQ2lXWF7DRuDIlCCj9gwCuOhbuvqmXf7WpozVj9a/T+MU/2XDb38gEJUmAygo5pnWjtyYMwEtV8+3l4kJPTNLNO5oQrROLOa2nfB/UrYwmXH7flPbbDvS5p2suFTrKZPm1ogkqAT4EXUAYtSgGTpAWd57n6hffm0TBCXPb0N/z8xD9s="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC akil() {
		Location loc = new Location(Bukkit.getWorld("world"), -1120.5, 182, 1523.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "akil", loc);
		npc.setText("아킬레");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTgzMTQxMDExOSwKICAicHJvZmlsZUlkIiA6ICJmMTkyZGU3MDUzMTQ0ODcxOTAwMjQ1MmIzZWE3MzA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZVhvU2V0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzQzZTBjZTQ2ZjNiMWE0OWU4MWMzY2Q0Y2E2ZjUzMDQxMWI4NTViNjk3OWE2Y2NkOTZlNzQyNTIwZTQ1M2NjZTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "reEy+WvSEHFh286niFFrP8IjKEz5SHLrnbxhwWJp9nKIY1iaoJ+MS0BqHaVNhzNfE9Y75U6c4CCvWLBcSL2V/0oNtpsW52TfpHz+subaUTXqo6F+4LAtFvX6VtSgccufk5Xg+NisZMUEUVQoSr+7tBREBDVVPCuy3J4yzeD+CPUZPda4N1ITPwD9FJFkL3d4okq/ZUjAzAWJ9F4XO3klfJTc2tpoKhZ/WcHVTOunJVG5Zr05yF5AQ7fm9yxf1aeU35BZHhX0c5AJqZ0kkwPkXUJ66L3aFUsih3TCB445eb6y8cwAV45ywnOFgrFi7ZeiTGH3mGgXCY9rrNavpNLJRhR871EWlx+itNgUB64rjVySpjV9lmEt6VWpz3jxDBlY4TpxKJuCJXx1U+p1N3KAe7O9ByLJL8Wg60CKDzrfUPD5JQFnKKTxMD63Ty5zs5WJ0RsxdZIZK4XZlMps1f7MJMmeSdwTYAAAToHm2YHsJUbUt2OWOZfdZHfx8oIHm9B4pB86bUpzIgXpvkijwvv/rFetGjcEHBSId4De27r2riXrnUpoqnU3hUHCJbmzktchA8hM9zoBftIIbbVjYfJHkg8ghMldhSam3tbuKkGg0Nm1m0QYFDGkibQ4iq72HB2/K+kY8AxcpxjseFlrs6zp6VsDJk6qOjH8r1GsoRMszBI="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC raimiraku() {
		Location loc = new Location(Bukkit.getWorld("world"), -1098.5, 71, 1237.5, 30, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "raimiraku", loc);
		npc.setText("라이미라크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTMzNzkwNiwKICAicHJvZmlsZUlkIiA6ICI5MWYwNGZlOTBmMzY0M2I1OGYyMGUzMzc1Zjg2ZDM5ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJTdG9ybVN0b3JteSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85OTA1YTAxODVjMmZhMWRiNTVmZjc1NzIxN2Q5N2IwNjhlY2NlYjM0ODY5N2Y2ZGY2YWYyOWVlYmJmM2NlZjJmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "f//YVj6bCsqwMYF8PCo2E7xc0T8YiDkjM33MlQAWitaVfY88jXdzmmNxhZapk9QcXzG0xIERxarJKudw7R3K5LDiuVP1ar/6KGCmBNWgdyJia5j9bFl+VHPq5Sw8TO6OFoLFPtbkiYJcXK6tECOtS2yiqQe5807jijO8gqDqbLBGDj5bSscvxhFwaKBcYpw47Myanw/0v8xWV9T9t0Nw4fxTUGt9zZORnVrrMqSRi6d8nVrbrIP6C5/ThpTQZP2FUmseBbSXYETfPdnKx9zrmpLOY79ghk04F0aet/k5GBsJYlJagHfQkm5Q9dMXqEJ5zFWoZhMRhoomiBn2gVPZI56yupg9Y52TUpv9xC3pJU+g/OMdcVx0PIkRyIU0swPspIrMrxeR8JTs5aMRsVJ2+301grDPRiGNcABM9UgeR13IJx0irZx2BKxSV6XtjIw9w4eNdxQqvLBGy38cdUfJ54ZOse49XX+dZGZfrG/tElTL4sofe99UBCbrkGGs4Yw9hhrH8WR8DR1mwRcF2+PcXl29pPAhVMLpunvGkRqWDtfWOdSgizNXIaSCnFycJxM/JqWSOoakuTGiofxfr//R6dCb5PN/4AAjZwqgNHraC3KKi7O+/cOZ8jGC0myPW9RtHpCjZ4G84DqDfssGgBlNiDZt+IS0cwDkflvIPMgCPBA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC hymiraku() {
		Location loc = new Location(Bukkit.getWorld("world"), -1097.5, 83, 1234.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "hymiraku", loc);
		npc.setText("하이미라크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTM2OTUzMCwKICAicHJvZmlsZUlkIiA6ICIwYzE1OTI3Yjc4OTY0MTA3OTA5MWQyMjkxN2U0NmIyYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJZb3VBcmVTY2FyeSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZGUzYzNjZTk0ODk4ZDg4NzM1ZTYwMjZlN2YzYjJhZTI1YzFkMWE5NzZjMjU1M2VhNWIwNDU3YmYzYThjMzU1IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "IaxVSZBv0Kzmq3SINnh5Ud/ZCZRY6dgrEbFCzaStJGx2AhBsltvjfhp/3QZWk/NQ6iRk4hqbHGVQ5owMiAMaVo1RqM0MNV+73eJ8sSa5pcCS5JO5EUF5fJwxq3epXcbuZsH2urHN2kfi7+AEmy9DwdSWxQvwU5e1ewRB+uqmooKFcLtU1K4bPd5kkXs6nWaGzSCMRkmU2ZC4mILSaJScIb9bDn5rHT2vXUp8Mcvk788Xu82y8q20gA7/Xj8ChDpU5o3RqavZ/rhnI7U9mEHO2m09tMbmeqwohClJiW5Mabk1zLAHOTGnVy3lLTnqgWYb+qWgzoO2GHtZnSx/LoJq0h2/1XlgS4GYJcxEY6t09hauqMX1qzwOe9oBafo/IeeUv5z4U9ePbpsly/M39uKKAREXo8HKXNFrvao9hSugNRzcWNHgtT5Fqt3YbAbhyDiaypCEf5WqgpoXAOTFLJHFNvNbLCdBI7eEJFPHaI2I5v4BScSQV0g1JBBp0XYyBN5PBHizZYwBJaeaaxMKb+wpKikHX0Ol+8tDBA4qUBTN3Uk1Y4dFjttS7Wq907TgPXFWgUzAqgx5bM5+YsXkWZNtLvgheu+1Jg+pOgGDtJGL76Kag/HfiKZQgTR2c2pPIYaseBDh5AHha2yDsjBvG1qosOl+ScmMLXJgO6B4GEBoz0Q="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC zemidaraku() {
		Location loc = new Location(Bukkit.getWorld("world"), -1103.5, 82.5, 1235.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "zemidaraku", loc);
		npc.setText("제미다라크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTQwNTk3MiwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjI5ODA1ZmQxZTI5YTYxNjA5ZDMxMjQyODJhYjY0YjIyYzgxYjg5Njk1ZjU1OTI4ZjA0NjljOTAzM2ZkYTU3NyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "LmVHsTdEJwXPHSxCz+Bq7YRkR0GwcI5+CFnfRX3e8NGyyohl42yLF4SJmKqUqQySrDfg9Y45Vm9QfZx9doCAOlUXv3bqS7NCZpBf4QDm16ckajQS59/JAAVBm7DTkViEnENxtc/m4BAEuiGuO30N/YBcb4vgwvIN4+KYxY5UW/04QfJf+iB4D+lZE4/gvNUID7m+L0aPKWEtIhumPIgqHQBNyxyj0vIHcIuSn9EmQ+RE9p+ME4ejrJ1vxPtFOTpJCLaGKlYAWlYxbdZTYvpBjwy2tGenuBpzwALcH3t2PWqF0b/XFxnJbDKmuHu3pUTYfS01cK5mmSgIYulfz77liStWQgitTxWj9srhRRy86/lxmyqWtiXgerYxLkmgH7RuFgcH+20IBxOI4jzALTu88tiVbImJOffkn9XKjZIBlholhxN7JWotv8QJqi/mLHj5OYOK/MwPKrRBEGStE+NxrjFgCOX7wo2fZP64B++4R38v4F1VA39v9FrSAz0JNUBP3ZqzpFq+nSBwQKOHn787gQ6WKxJ9SPubXd7cyYLPS56/1D5rMElFim1FNtYEfVluG1bWuD+6p1uSyxsSSah6PuisFmwQyy72V70Q6xgwrpFAS4qTnEkE14hZqmRoDQa1WE6aNn34Hz39Dc1pV+QD6Qu2skhZlB/YStieovZHalU="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC dehi() {
		Location loc = new Location(Bukkit.getWorld("world"), -1084.5, 88, 1264.5, 330, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "dehi", loc);
		npc.setText("데히트라");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTQ1MjM5NSwKICAicHJvZmlsZUlkIiA6ICIwMDc4NzVkOTI0ZWI0ZGMxODUxZGY5MWFiYTdmZjg3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXphMkIyVCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kY2M1NjU2OWNiYmFkYmFkZTU1MmUxNzM4YzkzMzM1ZjhiOWFlMjk3NTE4OTY4NDJmYTQwN2UwNTc1MjQ5NmJmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "aIFTL17311f6Jm05ry9QrpXGtSweJhdUTWIOxaZ1U7dkNLvSK6LXHOT8UwreQvjMcPa8d3b3Tihv9fFYhLx+NcG+QcmFGm6UoJ5dL0vkWOm/eTlBweHGQhj6CVKxBicDU+9RuQgcLTGGbYjsRs9pZB2B3mZ9jdXMpgoMFqUqEHqRb8TkGC3DrAkEqzcrkQpiXvtcmTXqxYNAGkC8aM51UGYex8fGDKenjJw82ddFPdtFl3/yysZP8d4hIs4g4MnhjabWtWC0ZUHuQtgBlieanG/r6ItFyNKO0IMEhpuMtv8fPR6IJhl8amp8LIO9UnZl9hPkRY9BJO1mGFi4PSUziIJfKQWo+WpIwjC7PKaCbWTGLzBYa6LgXV+DLkIPfrYu2YuIX9eAVaefp6UzoV7NFr5uqvHKgYCp13lQCdni3BWL/+Z8LzU/yro2NSbLr43AXOSsT8ueQUW9N7qYQmyUJwZzD0R/rAXfdj/7dkb+CNvblmENrm3Ntdk9FoD9nQE/NTD4FQp6+bqLMvfr9hqgr3+TYJUrWdEfh+7GXI7WMtYHxqyokdidag3r8+u5Opl+dmzceL2TnjtSjotQTqUpACT02LgasIu6OjweGR1+r6wmalT6S9QDggMS5dJhirCwMMOk2OzeO4YUlpGM3Z15wOixBu/avjJ8R+xJrzTfzv0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC atun() {
		Location loc = new Location(Bukkit.getWorld("world"), -1079.5, 93.0625, 1265.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "atun", loc);
		npc.setText("아튼시미니");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTQ4ODM1OSwKICAicHJvZmlsZUlkIiA6ICJjNWFjYjVmMzgxNTk0YjdjODQ3ODFjNWY3YTAzZjIzNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJBc3RlemEiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWVlN2UyYTI5NmQ4ODI0NTU4ZDU0ZjcwOWY1MmQyZTE1NjkxMzE4MjU0MTI2YzljYzdjMzU3OWM0Y2NiMTQyMiIKICAgIH0KICB9Cn0="
				, "YYLcNEEY0ac/Ouj8HI4OYXSwC+x+RVbm4zOtD7ZjxiMw8lJsNKxKmm/BFV5yKPjef/aDPwBiPIEK3NqZxsoKcF6ZUV3miDcDheKXXGXLZPCAnk3zhjZk/VrPFCLOciV4ZJl51QRDI2AKEvDaKjpGcXnR++2M8V3qWc7Nu5zZDcCc/oGjLIV/VIyHNJiWInfuaPn4JdXq6ZYG8x28jQ5CL5DjCu4lxT0V13h5YRFHKy1R1ct83hO7Dsw5W2qRjGyvjBXqQPBx85pwQI4dZRgwtGsTh5CVURdZ2WmP3zF4m5lFbDUClzHqIKJiur8sq+OasgtWQ7qbSINEectBMvyBaM2ZQ0t6aNJJimdUkkxaD7PwLrCLPtnqI0URgkh/jYt33JMvskzptgacp2OWf5sBPiUJCb7LkMG5DEAk6fTx7VHJz7mnH9uHbzKECh5GbiFDYQIytacVmyIxGi4RqzokR78WALNf85cUCyvUPoGOGbT7Gcd2oaXaXaqa5W+37U0ftz1mppfNN57YUTwFoXqb8iGRFZwZVF1jCznzOqIOGWvNNzhP8vwX9C+7UrcIeNg+kjglKgg83EiyW6lHlkNN0MIGC9bbVjIdbkKB9qtnDrvVI792g1DrslKI9i+SNgQ+EAkFAR0XOLJzxSBxK56N7Np5NTHTnTC6JrKqO8WcCPg="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC yume() {
		Location loc = new Location(Bukkit.getWorld("world"), -1078.5, 98.0625, 1266.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "yume", loc);
		npc.setText("유메하마");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDk2NDE1OCwKICAicHJvZmlsZUlkIiA6ICJlMzcxMWU2Y2E0ZmY0NzA4YjY5ZjhiNGZlYzNhZjdhMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNckJ1cnN0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2YzZjdkNDhmYWI2NWY3MDliNTk1OGNiNDIyMjA0YmE1ZWFkODNiODAzMTdkZTQ2Nzg1M2JlY2E4ZDA1MmY1NiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "OO94f80xDL4uCbPGF/eVeV2PjiVijbBcQo2IhQuBwHrwZ0A6TDPo28LHoJ78Hjds9o3P5/j6aLH2EoBwJNnJIDdeDAZXNrcFK6u8sfY58VkdtUM98a3LaU8aUecaRNEkGNJjbxBZ/NPt0lPkl2u3shcUe6oZs4DsY9WRgMV53bi0BupJHfqyqoHS8Nv77nEhD0vOBmxfyeMlNfj0SmwNJ1F5YEQ/ly9takBmTpXdgbUBATUhGDGHqiPxq2qsXlkX+981TMy51Wn9iBq37z6rB2mjtZ5eexabMcHSitjbvbw2/ThboC3RTJk0K4rwmK2I8uubllUx6jMLWt+eBgQimIh3nUzFOQwsUA9rmIaO1e5XhrkAyI22fCW3sa3dZ/4tDkIssIPDa/0fyzPBwnemf5H48rct9XwWYtBt+4NHrXRbPMEQHp5pV4gKGODNuPjotBNORwm+jfIci1QEA+95uWdQOMZhFzeVEfoBqFbgJis8IFN6MRnF9SiUwT0DmTSzDGVhS324LB2HbekbViszniA7dihKwFB1Xen9r89uO+7G7yLbgq8c+U+P5ffWJKPSPO4bfbYw0miC4uT7d8fybxY0E5nJACwG2dswNBDba+Hfk8jdO706wORRl+nOZBWHt1Nb6SkrOWDivdUvakxGUxQk0BqW0qreItbhHBukjMs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC sesil() {
		Location loc = new Location(Bukkit.getWorld("world"), -1058.5, 88, 1248.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "sesil", loc);
		npc.setText("세실");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTY2ODI5MCwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTljODk4NmVlOWNkZDZhYjBlNDA3NGM1ODA4N2FmOGNlODBhYmQ3YTU5ODRjOGQ2YTg4MDdlNmVkOTAzZjQzNyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "Mx51UeY/McOVdhVR8+iNIKJMoNnstnaQhQW5p/KKIvAdZSmirhxE3v+fL2t8tuF4ZVDhqGYhiZeT3x7eRlx49vJ3gk8Gfm4+dIdFs2dP4HfweLd33qlIDl9cfj14waBpv4UOs2nAMT/4u1KOgQCYJ8DHKf9bqToMeN69rH7sxh/V0xRdNWp6Mw8w+DspDnTaJ0W9wFvm5qc0FYTv18ckV0t5+qN6fsc+dHelybkgxK+KbfXHiIa8JoxpB66YuvxIB9uztWuccl8LD87uq44RQzxwa/48rKx3DUeCJQXeaUN7MBh8U/OYF8g3Bcpz3ZwtJhu/9mtb+FPxizH/guab4EuTkAd7btjpfO3gu+t9z8ITQhZT4U6T8jADxWTNMzgavdlEkqLaYZw2za+qevAYFgUc+lYEkYOYgqCraVebMuY0xfsUu8LWRfMjnNk/KFCxwp/48b6rdwGhHPURXDfLZCF+71zFypIt/qUTNC81awRQqNbA0inYHm8qVQdfLJywdQ7AYijJbitoYHGbnZJfLOCZm0SWIHW25rCvzTwJYU/Un24buDLIWILJdqEQ4rOZH2NtHf7JHE20ikmUKyQk/Uu18oFlbF0hy3Cd4QDcM2jtcKLNycvl3GpP6sBNnI28WJvviYZ3E5wgwCsQEQG2f5ZAelci5EJadusp/mHxado="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC mei() {
		Location loc = new Location(Bukkit.getWorld("world"), -1057.5, 105.5, 1236.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "mei", loc);
		npc.setText("메이");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTYwMDU2OSwKICAicHJvZmlsZUlkIiA6ICJmMTYwZTMxMzJjYWM0YjRiOWM5OTk2NDQ1OGIxOWM0ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJGYWNrX1JvbiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MThmODhhMTc3NzA0YmUzMGM5MjA5MDUzYTc4OWI5OTk2ZjViNDllZDIzNDMxNzYwMWZmMWZlNmQ3ODFkM2NmIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "QAf7RnMgViV8l/iDZTfujdwTBfOTC2GKCOjoxxvjJ8Bgrjj55fvzFiJ9xTF069GovzaxwExK2UDvptrk1y8NZlLGinNiZ1+vCN8ihF3ZkjIDMqzSirMJ3zVo1yFa4w42n+m4kNScwqYXC+NG8aqmv3eI++lgBjndxFwGAW196F+lS9X0Ql1E498xwB5MCeZBePcd+LCSDNZM/WyqvGX38rcNxS7a26uMNVtVgNeRFIBAihswV1qqYpGUUtzcEoaIkNkuZjcZqKQyWW2bKhXcwpX5PqSbnEW6cCzHqQgqzde7uY0DWW5157U4VgRhzLIMvzUqj0BlijpvMMuQBJYTRaKayRku+7ywadLwPfSTlmk1wCzCW3d5e9m/8LtvrxGJMMcJrQWe60mGS2uYqLE01ZrIUQHjR3Tt9c7+aYIS3pVHK/n9mTvHV8yOJRumM9WazYqGSl6QR6J7px/EuahSm2K7Bz1CuzAa81Dx2M/scp+LQl8o7YSBoPL9C2KhHNxPmk2ZA7oEY98P5IdiVDoSDug6QZ39dPMVfDuy5LMn6Ydn1GmKz3Nar2yMuA++UgjQNJU63coy/DDfxDz+0EdqPMfVgy4x0iW622HzvHmq6gxnEPaHcx3nxB/GD5AttPKC30MOcE4mIMUINWHiY3as7p+yVIgccNPfzwnH5Xxjg04="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC rowell() {
		Location loc = new Location(Bukkit.getWorld("world"), -1061.5, 87, 1243.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "rowell", loc);
		npc.setText("로웰");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTc3MDk2OCwKICAicHJvZmlsZUlkIiA6ICIyMDZlMWZkYjI5Yzk0NGYxOTQ5OTg4NzAwNTQxMGQ2NyIsCiAgInByb2ZpbGVOYW1lIiA6ICJoNHlsMzMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjM5ODg2OTQyNDBjOWUzNTA3ZTk4NzgwZjMzMzk2ZDBlYWMxMjE1ODNmNTJhZjdlMTk2MTU1NDQ2NmI3ZjZlYSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "rueqhAu3+pEwB8s61cZ3WBwcIUgNazSY5zm6FoxBye2EXRmmSq6v4FrVTrLJe+5sZJXPIww9ABKiBsWHbLpvyV/LattVqyVWc5n8qj+FkmoxoiovXZZDrDUA7HKQrv2xiCs+E225d0igXsZATun+is1YKnsHoPhnox2nQIJV62gW+xCx+Gqr1ZaAJxzUBfShNzgSZeVp1XLSaYeqhd8vriaNl+JBwPqvF5WCF0k1RVlcObNwvSRAtCeeZTCPjntJt2Alnw2dsIoSc+GYQECjoIOZd9fMRuCHAvWUX+W0ATnCbCMBfUIpvPe4gi9a3MeL+I9X62ydiUTROkM0BwyORHw5Iy6F7nmP96mNU0Izv0m8H6jSDOEQus6rbU/i3BvYtV3D+K1f3BAlNbFxFY++KBdAiTgcjCc8KbMTyjJUfFcYos+9WjkB/hUooPEz9kTaMmZEqDDt/mVaUaMdp/XlWxM6sKO9zweJK1oFJZJxaCh178FCr82Y0XqBWrd0DFEckD+BECsSI0JMR1wN+nE9H5q6pQ4gmhO75umGImc1L1mtRo3UlM++DiIIo7ROnwmMIeHHBBRL7vH+wpi4FKdDTRWJAHV5Wg8S8bUjd1OvRTYJcsrfqKB9Y/PUcTKHfEvdvZX9giJDo3VK0a4l8PGBeBTB1tNYdh2VJdGNQ7/9eb0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC mirisu() {
		Location loc = new Location(Bukkit.getWorld("world"), -1155.5, 181.0625, 1434.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "mirisu", loc);
		npc.setText("미리스");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTgwMTUxNywKICAicHJvZmlsZUlkIiA6ICIxMWY3ZTIxMDMyOGE0MjRmYTU0NmFlZDk1M2FkNGU3ZCIsCiAgInByb2ZpbGVOYW1lIiA6ICJ1bnR1bmVkMiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mZmNlN2VkYzQ3ODE4MmVmMTZkYTBjYWFjYzRmZjk0ODNmYWU5NjQ2YzVjNDBmNDUyZDI0YzI5Y2Y5Y2I0YWM2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "XCrWBavUFfPBROy1Q8g8+CYCrSVd/oOXVpqezyJP9XSTqIx9Tk1h/N+KUuvnQSF6WYrrbhqha4pROOaRZm1wqyUbuL2dM35TL2a/OxVzFxRe7OGLAE8u+dkCdHQA5aZOqDzzDZrMk7vnx1qRDXfAqrSX1PRl/WVOnWKrUvNvpjiWEIVsC7rB7yGN59+qdkfuOTpGaRKsa4vesjR8eDJdkjTa8ITDgYd/3yElIwrXMsy8uRyi/TP72NuSXNlcPQ0GlhRfsaXyB/sQGXoX3J7mDzEAKvxN0QAxfjkQBqk+58OgWXp4Iq5kltjn07dC6YNLAslf8rR8wfVoDMsYywiGvWBOqncIz4bBnTV6aymtK19831h/PXkGvS25g/IVYqwyl3FNef6wCkahvqwI2qR3EqkpkK6vQGA4BL9CEy3SHWB32SP0IKk9fr4Sd3j+gpEaBzM3SHkp3r/qWseX8ZCV0cWeKCH5f5jA2zwB7t8bIygdvFf3tjxNUilPVUE6dW4QTF09cNzYHUm5fWT1qQ9NtTPXKxmj0mRPNwf8Z/O+m5NA14w0A5O2Q+/xWpVHE5gW1TeWsSLWOdbaPCxziI76hl/ksEl9N1ygwgl8OdOqPwdSELcTIzhvDyAFf6kE2xGqHC2jemGCsRehjIsagfBAvBsUX7o8UbyB+TQKP1g7U3o="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC chun() {
		Location loc = new Location(Bukkit.getWorld("world"), -1148.5, 181.0625, 1421.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "chun", loc);
		npc.setText("춘");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTgzMTk0MSwKICAicHJvZmlsZUlkIiA6ICJiZDNhNWRmY2ZkZjg0NDczOTViZDJiZmUwNGY0YzAzMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJwcmVja3Jhc25vIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JlYTg4N2Y5YzRmMWIzZjY3MjllY2QyODcxNjk3MGJkMWNjMjcwMTFkMTQ0YzA2YjY3MmNmM2VhMjNhZWZhNWYiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "mF8DwMrWMQy+VSFLOVVizO2lYgu7exs0aPehYT5RsaP8f97Bn6CE1NAWsSAf61lKwq1JUm9onzj+TyaILCnu/BxD0ATVHAJvCUJTFd8duaduF82axlgeh5CPNXOanyVlid0W6hxxvJcKoLdbw07jjDMS4/29N0djHFGW7ECDeFPTAAO9AqUcCZCGP3lE2o5nTj1kktC0YbbDuVTFixvJ8XCzucHuVDKZdmIA0lex3emPdc3YQaRIblRpCQk2pBVdLvRqA6/3XPvOlLw+m5ZU7xyQnKcrVqE+S291YS7/PJ5lAgnV77WRx/0XGKLpj4evJPPwCsLPcm0Ce8N/jAys9tWqieKTTAYMJ7dFl91j3XllD7q6x47pAGVwFzXiqEx3DDIlOe/kZymr21mqMDkcW6PqDCAvCGwDekl81cWXIiNDciOWzfxR8T2xoiVqT4aX0s2BztHIYegPIxsD/3vy22ZGteG96TgD3foLc7Q+XCcUDwvywDCm67tM8MyZkjZZY6Z9HMSUS0INLzGNm/379qbxSF3IbM1bCN4QZT4lWmqO8YmLvC0xhrrpO3H1wIM9MxD2WolIt+ImLNBzo2IzWlPYk62fpD4FUeudcknoU5l00yHvsgssSVDd0+izVDKoKdGhWoI/gZvVAdV5uyr3qeDfaFosxu/YtPX5maysWRw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC xiao() {
		Location loc = new Location(Bukkit.getWorld("world"), -1131.5, 181, 1424, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "xiao", loc);
		npc.setText("샤오");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTkyOTg2OTg4MSwKICAicHJvZmlsZUlkIiA6ICJiZTQxNTM0NTFiYjQ0MmQ5ODMwNzRhYjRmNDhmMWY5NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJpdHNsZW1vbmNvbGFfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VmZTczNDcwNjg3OTBjM2NlMDUxMGUxNTE3YWYzYzA2YzBlOTc5NmYzYWVlNzYyY2FiNTc1Mzc0MzJhZThlMTIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "vPTm7Q9tY3yEowCAVHKvUWfYkOrdBlPEk5nCvl+SB5c/zTvUMDA7BLWgx+lAqbhJFOSsz9DNXSO1Qc8PkOa0kBQl6OjqBpueBSZPVDi6Jy8+0bACIkTUnxQgzxAJH5kwKYSoXrYx2HE6VMx75AmmgdoQRaoKLdiuVYADAINhAFXCuiDQspt7EK/0XQONuI2BCHcF2kdvrr0zwZq0Yzv3NR/3moKL5t6WRlVXhZGwaSyPPcFZGf9wyg4Isq1/yRQOqLrfWGrJP9PlyB5FkvR5Fj4TLi1dSBzjVHcQXFmpiULQNHDwsFILosGjZARY/rnXEOStnsRXxi5mIVF0rugzy5LJdYQXcj487DsQWFjgAM8RvrtzVntxdn0ZOb7EY/wr6UKYOLhJPxOMFcHDHKFm0F18gG8/WLrEyvLlZHU1CJrXsYScg1o7v+WcidIvZMzPwv3oWRYiRBphHPzocwXp/c9beNNBXEfm2diby3poz/zVn+i18Yf9I+NAeAakjBB8u5CVa1j0hOwso/wxdbKjnBhGyqvYGpnHRIDPaSPzNT/Tg3PN5QeaypswFQpuhyk3u8lJ/BFC3asCl3h10HOzmuLJ2RciBU8XLL1QAIvs4Me+2PKErly0/OyOlMGj1ELyiFo5UH1rYQRDuRE2lRv3x70PncRvP9LGz52K6nHEgiE="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC furua() {
		Location loc = new Location(Bukkit.getWorld("world"), -1087.5, 88, 1284.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "furua", loc);
		npc.setText("프루아");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTYyMTQ0NiwKICAicHJvZmlsZUlkIiA6ICIzYjgwOTg1YWU4ODY0ZWZlYjA3ODg2MmZkOTRhMTVkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJLaWVyYW5fVmF4aWxpYW4iLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTQxYzU3MTUwODgyZmQ4M2Q4Mzc3MTdkMGQzYWQzYTMxNDdkYzM2MWZiNmYwM2M2OWYxZjQ4YTk1ZWFiNDlhMyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "u7lm6nXRls7LwryefIsCthuLOugnJQ99zYGStbbKHI0+ZU8CVeLIx/TddwLDu3JMJrLDGqPeE+Ye+6wUA9bp/wjeWDj/VTaG12vFa3oSZdNJjZEH37YLPjtoY8qfgkPc9k47wpcz1XWUUoUyOO0ceRWZjFywBs2aNGtu4rM8p5QRDmTROe39a9gdAnT0Ah7cuVL4xyQgWRLkLG8NdJooA40yWlf5u/9AQIh7SdNHq/QTJDzjVpzdO1PRt5U1kEn8Y+GNoSGUcI32iGlKjql5rJ5R81NTC4gKRS6Fk7zSfEVYco28KPcj37NMYQiQWP84mV49jN1J6Geo3QnEF3BGqKdkd1ZVj2JxSHS/qAL+AEifThIkCq/jS1smUzUOYAOlbE6s2HYGp9IqO+ERJJxWsIxwKqz76VCI0ouJdBPHxN2iVImyT7zdt2XFG9nG8MLcxLP4DUmB8gjFwd1kVpu6zRSCVNMEXLRE/1a+XJeTV+GlojpjG7gXz1GRxTwU0c8MeDfZ7ht6Euia1B9c12doMxpNaQ5RfRCTxSvLIpmSFcA83dhShkkHP2x7BVyxzX7tD8eyQAi5KAiqDtm7rS+vE0i2jxcOPvPghtLyHXJfcywqMbKSgz7FZ9blv7fQW0lDZfYiP88oJs4doGap/GEsyRGwDZIUwXVRy5V7oZQH+ik="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC roberi() {
		Location loc = new Location(Bukkit.getWorld("world"), -1089.5, 88, 1285.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "roberi", loc);
		npc.setText("로베리");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTY3ODM1MiwKICAicHJvZmlsZUlkIiA6ICJmODJmNTQ1MDIzZDA0MTFkYmVlYzU4YWI4Y2JlMTNjNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZXNwb25kZW50cyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80MGEyYjM5OGEzOTU2YTY1MzE2NWM2MTkwMTk1MzgyMWFmYTIxZWE3Y2RiOTk3NzA3YTRiNGU4Mzk1ZTgxMGMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "CDONMU6r4ej3Y7I9bifU3cos0cFnTeE1bTlWwOhqs4z38Qst95QrUOg/Fgna4sQpNpiD5f91HXhY7FuVUvgu9BTMqSnQcZ5QfmYkYAXLh3cSvE6KbLoxchVYyxZAP3xSDYePxsjkS9k9eaYgjHtwcrRjyMsMtAeTGBaUJAbticpOiOo/fsy5czUSLXG3ntMR04NH3ToIgSBlO4eWo1R5zvgrQnjCIV3+Gin+7uQLHYfL/hWeNiEw8dNWyMqeaPKxUJn78C8KoT6/ERZabcDuGYIw1hNIp5jJUJuMlFUYkvLeafKlkN+U09C+77O9B+DHaotFAl+dHYiYWYYDMwkL4sq21ksS21QBU03R/V6TbCxA55A8Ci9WfTOI9Rw/WS9PAyAnJLQF4GJqqJcw2YBebWs+5j/tpJsRbUnFILH158LDBkURahxdJqJqlHwiD/xRX/PLxd5a794Uvtc+ioTB42xMNAQsEoGKerEJFvTaN7YUM6cewnpeO+xA4fpVj+mfe8wH7ONgQHO1rrRz1+86WGL4Ppe8rgEbV6v6vQDE0QXY+MgETVmh0Gb6YcEhbbErcukwwZxVbIUqVd6bKId35APcf4jAWFdvOXFz1AC8krnO056VimS8BmtpIG+lHB4Vxz/pbAs5speHrqnBa6mC02vuH5ANwVS7Bxkn4toE0cM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC ganon() {
		Location loc = new Location(Bukkit.getWorld("world"), -1089.5, 88, 1282.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "ganon", loc);
		npc.setText("가논돌프");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTcwNjczOCwKICAicHJvZmlsZUlkIiA6ICI3ODI2YmJkOTJjZWI0ODVlYmIyZTY3M2Q4Y2E1ZGQxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZW1hcmt5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2MxYTZiZDZlYzA0ZjhkZGU3MzIxMzdjMmZmNjg4YTMyOTkxNjJmZTU1MTk2MmViNjFkY2FkOWU5YTIxMmQ2OWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "jUntyDCeQCuXXh9Y4KNybi3DKn2E2qI5J4GXKsdciaqN3L0pQDAZ7Z+nwBzCirGFcniFcqv5gMOGxS3kurs3MztvLxIR7NuBfMjMc+Wf8fFpX9fpJzaU1VJGS8v3USYfVWezWcG9gMe0t7uvqKsXy6yGWF9AE4mtbna46CR4GK7o379aKCHJ/3gY7iiQ4Mp1a8dv8+n7MsuWou2xdoTQ7XkLqEuV8x3sQ1iWXVGKo3BT43gCGskwzaj9tFhyymtVfn7pHyMd35S7kFwZiK9mv5/QxI2DOkkpQuK0nkjLjudDN5AGg/ypHDthm4DjFzJytSJRQx4mykc+Q6PbUbgOux67Hxg4s5B7AnrlHs4HbfclKlBl6Y1jQRLxoxszlVqo+ujNw5cdHaONiUiQZ+wPKJ7Q0obq71YHGYhTG+ZuDKAH5sgmdghqn7qi1nsm842JcdTgdTLtKqFOmzdnhoiwm3DqRYOcu3ftichYKvyoNAnFfvZWr0bHxt4qVHUg5VC5jXevTa5q++8GESfLgSpbe2hdUxqoljeXVnNNnNaMKsKt1WyWFNC6uFEZMycWITiJ+ih1v84XQf07wgcfl+e6ToZRA8uezvRiGBE+cw2/CiI8gkGyQTYW2loyKSeGwGeu31cvlMIesnixawKK5qwqLmsbxwR7g4DL9etRHRI0sqs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC oing() {
		Location loc = new Location(Bukkit.getWorld("world"), -1041.5, 88, 1268.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "oing", loc);
		npc.setText("오잉크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTczODg0OCwKICAicHJvZmlsZUlkIiA6ICJmZDIwMGYwMDE4OTI0NzgxODI5OWIzZjE5Yzc4Y2E3MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJ0dXNnIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2U1M2Q3ZWJhNTUyMzZmNWM2Y2VkNjk4NGViYWRiMmM1MzBmNmRkY2M4ZmU0ZmMzYTcxM2ViNWZhNjUwNTYwZjMiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "FnNRDPJJ8OgViQbZXjIeQiFI0UIuyDM6+AHDybUyW4Sp0HLgwXSoIF89i/ED/cy9HDRnw5vt1ItV5scMrxT6kg19g/d3O4c1zg6pQrbr6r4zhGZilSTCAzd07xy/ioOp3+cbHEnDcLZSs1I8o3loxahyQJu5DE7wUIX0RxtuAbmOZV/3uEkuNvcOtcTyrMVP7zr1TNV0a34Hl3OFfYvKYGjtM/HoNgp2MXw4KsO6AuTyiGw6Tie6aaCOBjyLqOKnT9ijhHbVsQqu0h2ssLNQBkPgbqOUBhnKPCVVhlI0MYwBiEdm7QSlsXrtSeP195z1acUcK9HlpvUpVxGVXjYrqFuafR3EyJO82FHxouZ6iGuXw+8ulz3DgEkvEKUhECXAcP6nM1Od2fJ9HbOct+lI65DeGPILOmnhjjTgaBvK0LlK8BjKmn0z+YBKsuip3ALSraCB/bN9OPbwOmS6VNqw3H+YLkBIxuqi24s6SY6zsy2RGdTFdUd6M9cMdblNtxZ1peMYVZ2vM7Ny65jVCi6bqmlRYIevZiDS7zcVEbGESEYhbKn3OiamMKwjguWA+9yFK6GqzRs+3dU7+NynsFgjOYYnvJaszuOj/PDkohQiLs4vuHG+PJvteD1PK5rCJvK1Imwaai1NZD+EoumM8ZFSXVuQZ0JgWhco14WSXyzAo5s="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC zelda() {
		Location loc = new Location(Bukkit.getWorld("world"), -1043.5, 94, 1274.5, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "zelda", loc);
		npc.setText("젤다");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTc5MTcyMSwKICAicHJvZmlsZUlkIiA6ICI3YjQ2MTU1ZTIyYTY0ZmRkODkxMGQ0ZDcwM2I4ODNiNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJSYWxmb2xvdGwiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDAzYTZmMzg3MjFlZDJiOGFlN2RiZGNlYjY2YjhlYTQwYzRiYjRlMWQ0N2FiMzEwNmEzZDY3ZDgxMGUyMjZhNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "mVBore9u8JIvtUTVCuGJs35YIddiOLIILxxZwcrdlbMgUgsenmv5hVKA+cfGZjpUxozw6ilf9DfI4+iZI+YDM36SGs0Ni8k1mvK5SzRF4vgKId7giH2wZk/QFKFCXZUvzVM0iOyc2weU+TsjaFqhzeh3U1jLpXLPWpqGQHfjV2wIzxya9SweBAtTfgyIKuLZVO1R9qOe0AdmwfljCxK37dSsKL2PGMlxZM+BflomJVr0Cr6hftNCuaROGbOUSD1chwY3JrN15IBVNDqO+ccO6ktN1musmoVQTcM5rsHj1a6NkD/A+dSmdeVdH7gHfFbQhdZGqgZBtEatKMZE/tIjgcP6r9G3MluTYmYYZUakbwTwCYme8tLgzgl7oq1OynYv0v9OSDtmg2sMtHShhsFxm/HRWGPbmSCrR5AQTJmQcvhEEjLYgWRmbcTlz5SLN9uQBIYzdsHhQ0ItY2hfi3bTs7XFilDTsLI4egoU6ZF7TYcaokAIWXwIYzaD/5sRv1aZMP676bTeCPdstAV99fgN/40SGC/BGjhPXFJ9Ad4zyf5ihfQ38K9tIwhw48opHqd5VR1TrLtdxYKpMrVDzNJWeLKbCEojMr9egAhS91T6xmBFBwn5zTdy1ZrK22604ct+EQyrfqvrQq9VY2WNs48zpnkUFPiFf/bBlx2fBOGMe2U="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC dante() {
		Location loc = new Location(Bukkit.getWorld("world"), -1041.5, 94, 1269.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "dante", loc);
		npc.setText("단테");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTgxOTEwOSwKICAicHJvZmlsZUlkIiA6ICI0OWIzODUyNDdhMWY0NTM3YjBmN2MwZTFmMTVjMTc2NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJiY2QyMDMzYzYzZWM0YmY4IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVjOWZhN2M2YWVlYzhmZWJjNDQyNWQ1MWE3OTVjM2FmMjAwOTEzMDJlM2Q1OTlhODBlM2NlMzUyZWQ4MmIyNDUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "NseVMyANd/+I9TbBAP6STlI8qBiArlaczMBbgL/jtgfkVnDea9hAOyeFGPYVEzsa5zzHEO7G8ZP8p9XTqjMMXoeIIpZf/D4afxFQuhXshUwck92MCpHBxNodYR/fE+cOQpo9neHAJGFyjZnE0U8AOqJSz5KWvk7vadmGSSWXnhsPaHklnrfNYc7y8qSA2PZHODkwtnVtrjJo9494sw2+IPxqKry/Drrqi4OPJLycQGd/ene51CrWziSLPCg3pypW3BqLhjFCMv1WwxusAnp8UenupQAiCBiK0cvc32DrV8XTOf8yZUZe3IQpbTUg+FXE2FQbGFIrmx4k8jf6GLYTTG6yTwc5NiwvJZl8ruiqK6QbkOyGZZQDSakWyOFWGa1Ri10DORXDcro1azz61HuP5b8A58+IHxh9xDqTwbAcCzKKla4arXj+K9e5UD13XEWDnyar8/eMy5GIOk454YTKQ2/noxfBwX+m9Gfto3ApCfgKzGynvW6e63fEHhpvenBcAryud6F2IUo4M9YtX+wGu4C86AECd9ddQTtGiK1mnGUnsxlpSeJBVcxTSPUaluY+H8xO1N5XrSjv2F/HjiovV2YX+DocBnlynZlKasVag2/JaRS5vYWlU6AJ6rdXalI2KvVupU9qxamuMKxQ6kRqJOIjYoo8PzymDuxUoXDtKvk="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC pi() {
		Location loc = new Location(Bukkit.getWorld("world"), -1098.5, 94, 1319.5, 210, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "pi", loc);
		npc.setText("파이");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDEzMDIyNiwKICAicHJvZmlsZUlkIiA6ICI4YmM3MjdlYThjZjA0YWUzYTI4MDVhY2YzNjRjMmQyNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3RpbnZlbnRpdmUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMWI0ZWEwYzI2NmZlYTI2ZWM1YjE0NmU4MjIzYWJmNTJhZDNkNGJlMjg3Yzg2MGIyNjZhOWIyMGI5OWM4NzhlZCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "a2+HFILwu/mW5ToR8D7iyznK3VvlEjQ3spI1eJxbX0Zx9mfUeQqQPNwnIDrbu4cT0FpusROdeUR1RTd6K14nWqLvh3fR4Pxe9d+uy3epCyPwFHugz8zQqnkonXXYNNlBvXF5UnAaQa5MJjyYVtvD/R4UX+L7pqhZUk4XjJAPjzzkd7VjcvI/lolVwmkyDcWdiJDbeGG9RScyaoidoxZ0EIsVcvgRrnyZDU5nfFjOBsSGM0tapC/Dq5YYxjB50dxZ7d47TEtr+tYjAC4mPq7/aNyHM8vURARC1yxQEzQAXiyP+HTWaZD3UiHRqCngz+ZJrpBWBn06ZBqdAjJIoAL2sKogTe4bVx17RRyEMlLXdmF4mGLvPnOWWI3shRB001q3UpeBaMams19JoW6zSHFf7G7b7ZTsuD82lEAYM6C2jWN67ZD+RSQK+puKUDPtfPAAnSYzREmF6OTj4aZSsBCJTGq8ZEhl3DSSFiMtQZn7czQD6oH+GSaWPdKytT0ZJS4icfL2D6O1qrwRxzioBc6U9WuU0NWnghs+oxbmVRGY1ngMqz4J4KUCjEj4zKRVtEZKRELM0nmt9myeGFm82v03sJjw+4lMgnyy5JzjyqRV7HtsIxOFbcCEYMY0kI5l/Y4Bz2l9ssyGlPQpg8GzoDTlkZm0oTFLV/6KmWoPHLaVg2Y="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC girahim() {
		Location loc = new Location(Bukkit.getWorld("world"), -1093.5, 98, 1321.5, 210, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "girahim", loc);
		npc.setText("기라힘");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTc3MDM1MiwKICAicHJvZmlsZUlkIiA6ICJhYzIzZmEzNzRhMmM0YjU2YmYzYzU2ZTVhODY3NjIzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJxdWVlbnNoYW5pd2EiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2NhMzVkN2E5YTY0MmExYWYyMTM1OGRmOTI3YTM0OTlhYjA1MmY0Zjg1MzhkOWI3MWEwOWJmOGNlMjZlYTRiNCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "kGjhyOz2CWk2paT9i8bZb3eOATbhw9/K4ersbkngwuINVqPFKbrIeW1hEY7I+nP3f3pwc4hZRbNON5feK55Sqs9ebAd1/RyVhQL64etUcgFlbZaxY98DsJmvrxlKPSPw68HbjsVllT7z2qf72GwSmkav1QR2g5sIar7mdIUtP/N7B7s4jyK6QyC5xk+jO9xUy8oULCmCbQ4L8dUlo5k2gwzJxPekpKPfsYjemKxhvqPbuqeL432KoMNnPlF9aZ9Zyn/eET0WeWVnYIQ8T8r27qQVIFU1O5s/ckP/kqaMnok0cTYtMgUYcxYPr7rXf6k5pzwgSLM4x1LjXrSVcYP4kxDhRDZQp7D8IQn57yNQRfJhUfpusutxrj5hNUtLRV0xIed3jZPb/IsQgzN9vh8CDBqHVow1h5cAwg3s6NIBNzS8696TveIuRzIQnuCPyLM1kI8c7R6mu86ZlC/yz5af9AuidIXG6NpNoY0aIvlMvBL9RRVGRbuN52ndoOF0GRjqpewalSWxzhxm6zlGbkAjmVd/9vN1j+Rel14VnkD1vLCuMHZV4GcwyF2JUIugi2XlJyv/tjELwjIIkXMi9S0Y+akocpSjFShQeDQxd6Wp9G7YfkLN2IBL4KtTDPpmWQJ5asxANPZ5oXZ64F1R+2wkGgu7YVIPS55Hp3fcDUKdpgI="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC impa() {
		Location loc = new Location(Bukkit.getWorld("world"), -1096.5, 98, 1314.5, 120, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "impa", loc);
		npc.setText("임파");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTk1NTg5NywKICAicHJvZmlsZUlkIiA6ICJmODFhNzJhZWZjMjY0MjU0YTQ5NzE0OWYzMjJiZjJlNSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEZXJsYW5fODgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2MwYWJlOTBiNjZiMDJmMzQwYjY5MTAwOWVlOGM2MjJkNDczOGRiYjFkYWJhNzU2ZjU5YTBmZWIzNTYyYmMyYyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "RZTq6waGkX3uttI1YV/LRq/iyGmHfVIcMHs9KN/WY5OON6V+krnnWj7ptlQh8iQG/EOfoYKd3Ztz3s7B6p7cyDuCZ/9g2mBWfE5VllyzlamJP4rTCPfeaqmh4QUIJawbfxb2DMxClpmrVEttJQUSsG7METp1rvQe9+ajive5rXY8nthw4q/s9fnLJRsb20DzvXvHx09GuhjWrlknryO0OC6TaTH/whztSuTA9rvSftbJz6r7BTbSenhlvqw/W24dDy0CLm/0+PErjV81yiY5kGLAwkJFI3GF53YmoWeEssf5RH1mkEOixDW/rOK0RhVwGgdv/7d5e8uo0DC8X6pQuMRokJZ2yW/ykpnTJFF5LG1LJU3B6cNevaONWJ/whPs9oog71GKhFQB5xTv5EFsScjEGktXcZ0BkQs4Z4CP2c50UO5Ks7zfNV/kM+n7Wac/qxMI7Fi9lVqGNl8cTeaT/U00OslUKuJ0lrH06Do+BVj1b9xeYMIKfWMgulcOfNIL3SX8KKVJsWm/BkpHsqt2FIHl/aTGQx25FGZBlkz0yvSpjCbmuqDtKSlS5KaNUg2Sd26sowqZrrNCU1ZdZuDk2zvDSIrPSuEy8fnaZ1vGERqKlrL/WA7VfTvkwOBUTOqiaZWWjjtF6PHYKjxhNNhngvyDCRHuS6I3AJRGo/LlsJWk="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC midna() {
		Location loc = new Location(Bukkit.getWorld("world"), -1181.5, 191, 1515.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "midna", loc);
		npc.setText("미드나");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDIyNDI1MCwKICAicHJvZmlsZUlkIiA6ICJmZTE0M2FhZTVmNGE0YTdiYjM4MzcxM2U1Mjg0YmIxYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJKZWZveHk0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg0M2YzMDY1NGIyMTNiN2U4Mzg2Njg4NjZkODk2OTlhMGVkYTNkMzBmY2RkMWRkZDAyNDQ5NGJjM2Q1MjU0YWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "dKz+trTAn2KsTTEAl8TI1BrWNTWdZNGN13jMlTEhEX87+vOYjBfRnP1KjcsovtK1lr5foucGucojUMoYztvxZltrYgl/EXn2NkCgRIZAwf8hlcE4Uje43OKJzUSpuVBplcOPCXmDPVAm7hd9KNDoOzT0X85pMm+ixDI7jhIO40y1O5WCKPgbeNtPsXN+32sV6NJNV+mgiQZv6dVEpo1pbjdhLCf88boXaqHlLidYMBLSLIYGno0nYAZ12wJCh9Wvyynj6E+lyJw0DBn8XythxGOlHJBRXFxhSO1nPX8kyO1my4c8cbvQ77k9sKheYEaEiZiPcoyDpUWLBHB3ER9aDR6YoOdKJKtBymBmqJmEiBueqtsWkpLXUKs8vZxfYfAQfiAqoDMrK5cgnaN7PjaSp4CzELGsEJhzUVSpmkvZYj5l8LlkU5Kc0uJl190H4aUcK4TroSmLNJ0rlu9fkccowcwW94PL9YG9aLdwkaTObdCvSrxypxcMRBrPo21tHCtRbsOsHiwyeEgoQcc1AmOJfZv/whERKeTzvJdaNXS25kTMLGsM0AiTN4eSQtrSIQh5yeGI/QTFqE+Wv2LWaDsfyzxrYMOlDlzNUo0wlhw4VP5GjNjB54270zAN6tYXxDcWHgMwUvb1aF4YCOePXBNJQp3y8yEizFfzj0odByREsgw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC link() {
		Location loc = new Location(Bukkit.getWorld("world"), -1181.5, 191, 1511.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "link", loc);
		npc.setText("링크");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDAxODM5MSwKICAicHJvZmlsZUlkIiA6ICIwMGZiNTRiOWI4NDA0YTA0YTViMmJhMzBlYzBlYTAxMiIsCiAgInByb2ZpbGVOYW1lIiA6ICJrbGxveWQ3MCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80ZGJkNGZlMGZmMGVmOTMxNDdhYmY4ZjlkNmJiNGZjNmUzNmNhODMxOWVjMGIxZWFjMTkyZDM0YWIxNzA5ODk2IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "SlBn8pI74nYccf40hGnGxpb7BJoR7Z346MJFcWkyO2/YueKcjioy7Zzn6NZeQXszZ0J0RhgSZ+gCiFPpiobyINFnN+iNCv5WvBRRyVjKiLnuquUE0pfik/TjDclss6u2j1qxeScR6kD3wmJWe/i2QF+ox8B35aLZmKWBsr8uLAU9oP9dVyjrZH7SZ1eX7G1jUSk9w8WfiAoi7vVUusv7JXWPJeXtcU6YBJ+qbNtiNUM+fTIM/S79W8YNAClrTNH52U5I1Okj1yIHIwigFphc8/gqfB/WlWIk0c6aMQCETTh04po6YLRcJG9TkM1YIwWWcYst/E3wxd//qKjKGJ3gA0E1gB/wp8b+OaliRGXmpRZS4Tc6hHfB69P456ususmn3y1SlyVyzYOr5gXjNzhz+Sc1jir90J/WeUBaaXL9DjpA/LGZ/WvFYTt4pQKeHJrhgu5wiE5nNjCnY5meTquNX2tujlwafDTA8nXL92HXzlct2RW3hf6zwoh1C2+OTHgDI70eCvAF/3sV61QbyrT2sjZq8HKMKMdlaQbpKy5Vq5Kw6U2yPk1QqAlEo8HSgsp5YMiM00CKn1sAYOvfInel7DmiRGoM8VJ+JgdLrTz69RLjszTiMUarKUjUnzkTW0DB/Sp+Cy7Lz4jop1vKeoJ5/DSyThBS6p/JZTCqYAZ6WZU="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC wool() {
		Location loc = new Location(Bukkit.getWorld("world"), -1189.5, 191, 1511.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "wool", loc);
		npc.setText("울링");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAwOTkyMjQyOCwKICAicHJvZmlsZUlkIiA6ICIxYmY4ZjBiZDRkZjc0Njg1ODQwNjU2NDc2ZGU0NmNmMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcnV6YWRhMjIiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYmI4YmY1NDYxYmUxYWUxYjU3ODc5M2Q3OTY1ZDM2OGRiZGZiYTFmMTQ0N2JlMDVmYzQzNjZiMjNiYjgwNjY4IiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "NKLMQYqe0wf7dbndtogY19+ursGPq3CZf+Knpbi9Qy3ETAx/G+ddyaZLldxAOUwTdOrsnz1CH03MgZ+t8vbCuChVgpieLTWccXqy1/tVGSQLGkbamya8MApkCjV2+uw+czY1MTzCp/2sgK9DWykDKmu7Z1Kle5qXcEWFATaVsiVC7TkO/JB5FHsH6P9A+pgbKaLBn9wO5GlRpG96aAKofVeYQ8KJdzuzdL9eszGqMPg1JDf2qxFbB9q0XROid5i86P5grzxj/78T47Nllyjnbpe1uy6sW5Un608+QexIRJQLR5mz08MK6FT+gAPAEZFbDBkHLUQ//VmoxZTEA4eWUD4qxB7fGGGDHD8O9oqjuRDOyHvhq6U5UWF622DDlf2sURHRPi618quV5asoPGsjdFbBUtkbgiu0C2W6YqGJ9NFUeFqMekRJu0fGFDxNn79rAkW7f/MECcnub+GgMxmcLWayz0J9EwZMMa1tFV1N6lXQxOnQKmYpg95+X5br5GvlzGlqyShx+PwmdaceqHMAfK8aQ/hGuw63TsRIHXVFeaNLsa1YJNwjp3BJxlbMH4L8BdN85qfCCvWBRHMkJQoSzHa19M2NYgDo3aoHFQ44KmbPQxs9WPSNYIKJ2l+em3QVZiM5gou8EzlpKmG1DfDWWTLdJ31RkJqcVXfnn6qUrr8="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC herold() {
		Location loc = new Location(Bukkit.getWorld("world"), -1094.5, 186, 1457.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "herold", loc);
		npc.setText("헤롤드");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDI2MjUwMSwKICAicHJvZmlsZUlkIiA6ICIzNmMxODk4ZjlhZGE0NjZlYjk0ZDFmZWFmMjQ0MTkxMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJMdW5haWFuIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzVhMjk3YWJiNmVmNjc3NjMzNzgyYTI4Mjk2ZjAzNDJmM2NlN2Y0NmY0MzQ1NjQ4YWI5MDUyZmZkNmNmZDc2OGEiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "vQ2R6wVj6K2SDXAPABHZOvFT0J8/dgPgr3ykBVl8BwIynB7znPZUyQ9l9qQLxGLG+jK6Kro+rVh0c7CgamGCS3nrIPt5m0LLnsTRDPYwBJ81STsj9j9cM+LT5vs0fJvCQvAeSv/7bvpewLrZVvUXO8JYS4XkzbNG2TuqD0KdtvvKiaWqEFnet66lB4pLo8hBK9ZMDwnBSc177d1oJth5Cfon34lykibl/XVGd0yj2oDbHZtuNoSuz6hbcjPsFklckrZHpVR01g4mTqYVtcRzYAVzj5C1lg/FiUnxQN0e82VJcGZ4SJDWwnL9SMwCSRL5RurZroSL4t+n6XX3M+pvC/dXkdHbQglFaJPw+nnHllQ8u2LqsIgHhks+N+h11Eb9DxpRitSvwzTRHpvI6qJ6ozgrylpktQe8A4HMxWDr+GmGGjsLLfxqoE8VrUoZoEgoX69XZcZkYyktQIiNpwLmcXKoo9ShAZDCcAsklPhUaKlVKD6a7fE1UmR5hboT7XxgRDJOHS+Mw9SFxDCinXSX4UbvFvK+bkn/CgzJWqpYhBTKBr7Cr2QdvUXqkkzLbJje615J2AABFQm0RLqcD8QUFvBUbmYYRm+9V3lOFpAfhBqgfR1VaxDHlM/t1Sn3SxjITpDqkIo9yv77hdNoP/Uh4tXsCJIZZyRO0W6m7VCcB+c="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC olivie() {
		Location loc = new Location(Bukkit.getWorld("world"), -1086.5, 186, 1462.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "olivie", loc);
		npc.setText("올리비에");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDI5MzA1MSwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZXZlMjQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2U0YWQ5ZGYxMmZmYTdiOWViZTcyMzNhYjRlYTEwNjljNTE2YTZlYjhlZTk1NWE4ZmRmMTJjOWEzY2ZkZDA3NSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "xBRVPbFPQQ1nc7kNrOnzZ00dVAQAJto4vzmRT0f8xGT2DNupws+wQQJmUkArLWU+/ny2/08oOuBHomagg7ElhQAwc1jNzRRyQkoRByjPvnSsiWFlyUFtaMqwBBuAciHogIz2pkMDv5dnlooU/2OOLEgMXZUVLypEn9POxuiSGO7b1gvOVK5IZ7cLvj0MblCo7VG0V1UTKZx3LD6XAxxp3a0ZXr6ppvp20sMtoMyetMofxB5rAa7GZFW25OoInWEdi3wo8zJmPbjOOwlLbMnz6UUHU4FtVfGthHMQgf5Y6X5HbHGC/jDjCBgtM9RqtjtC1havTLsiEYLvQN3Y8Gba1OeBpeRAlahugFO5sO2rmej950dxQhoal+MqbkNNqnu/jRcHYowP8CAdymyEPze3PG8yTzj+9PK0SqM7RqmvCuEAx80YKX6SosYQW+s2kkEYXVD/P2qYQ68LIawNcVomf3ZQ9U2QwyExhI31asojG2hHqmrCFT+otM5s6cm4wR0uxbvHobAS8laqWbNXZkOAtR0GdrJ677B+dnVAIs9vNypVD+F/i44SD7gv7QwL3OzLmnYABPD4OHd+xKQj33ZQuOtd8wjMVEIDB3nddpXG1KLor02wr5AYbDawbPTxB9qLIXHU2fpjH85vidpIwqpJH8VF3m9uswUqRbyFeyGh8GM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC mirine() {
		Location loc = new Location(Bukkit.getWorld("world"), -1083.5, 186, 1458.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "mirine", loc);
		npc.setText("미리내");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDAxMDMyMjU1OSwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJHYXl0b3duIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzljMzI1OTdiMGNkODQwMjc4ODMzOWEyZDFhYTQ4MzRhNWMwNzliN2U2NjQ1YWYxZDgzMTdkNGY2ZTU2ZmE0MGIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "xAbteMdSqJwVZxG4Jj58jleqLiI+9M+g1x4+GfAinjaT5U86LRG3Nlls7tNk1SJWQomtMj1EaIZ36BJDfyaOedNGOhKKl5s8Cchh0Wf8SBkOJtnQM7+V0EdSM4K6Icj6K+60e0oCBE3KfIWf9/l0rakZCLani4e3y7KMPxkiXPfoFDdj0Ac3TqTOujzhxiye1QxeGn40gYyL7zM6vnFbPZJfaXIHptGlr5VLsjPWgtx+lIj8AZM0Ypy3vsF+Bc+o34cDGH2tYMFETWMi3HAyl3F7Dh7xpFpMFS1QFKD3QLAET79ay8m2mkeAvtcpKAVQUcBym1ltZ8I7szEgSEx5WnMkW20saj+kWQoeZDSM9O2UR6Q/ojjlXth8QtQpojDQl3X7MLiicJbEpw4prXi/Ht8w2NJ4yGlpHQPsuSrZfsPM57Mpwfa1m0V5wABb8ApP6V3K3sIx6hai8ArsM/pZp4jO3vcv4YGYpUvc9ANz51p755VxpWjXaCAQbEFlGIRXrZX1JL189kTEV1//OiDe6qvq9Z2rGTzktg8+lgBcCPq5S4b8qzslyhf/bDJ2ZBTInhLqqtMp2kpzSMaITx7kuNzy+TxbPt1fMAojxfLMh0w9d7RAYk2jn3cg1f35BO9osb9RMlrKcPLmJpRHtwfgPnQ4d8/QY6iNlw2gl7jdgxI="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC runo() {
		Location loc = new Location(Bukkit.getWorld("world"), -1008.5, 62, 1180.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "runo", loc);
		npc.setText("르노");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTYyMTIwMDgyNDIyNCwKICAicHJvZmlsZUlkIiA6ICIzM2ViZDMyYmIzMzk0YWQ5YWM2NzBjOTZjNTQ5YmE3ZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJEYW5ub0JhbmFubm9YRCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS85ZjM3MzU5MGY5N2RjNDA2NzE4NmI3MzRkOTg0NzY3MGNlYmQxNTQ5NWFiZTg1NjA3NjRiODMxMGFkNzI3Y2EzIgogICAgfQogIH0KfQ=="
				, "kViuYlTTDCG/3Th+JMkHpasGanB5V2/mm4dql58PXbWxNk5lV3kcwyQeMM/RKJDnLsPvTEAzIkndhDp6Ou292DFCymmoaZsHJED65Ps5dKzox6VcUzmo1D4ds7f06He2lDqL92UbRsH910HUn8BsmQQEbT6UFLNkSH9ejFl799BHSTKqSeYaZKS+Yb+4/zo9LiSn7LjN1GLtNB5Yx+gjzcsF558PdSH7OGus/c1BUKAyjLJ6Q4QKRaaKCjzTroJSa1klZ0/+6QMHvh5G1L/EQ2XKP/ybwfUHgvpAQMPkAuD01JdW1v5um1Rm8+R19CzEUjyI3JOoJruZEJaXblKsbED8hDgOAPjRdhJ22Hb1oJhpWPcPTPcXGsnxe+S+dxxDyBFTp38kc1zSJps1NbkKQB8YluvBIbAivK3QuT9g4jve6xDTtBNoTSTRcEeKJjbIDcwVrgR309a7V6O+qsHcw+36/M+HqFJxZJLobbr5JsWHMCa1Xj4WvwFuyCUFzKD8Wt10pUni2sdWfH2lf0qkjohPEZZZb2WUhifDa7rrMm9rOzNehcGdJh8raSaSO+r5ommvhLi6165bw8F06S111x0TH9/i+u+MxQNMc7ngIc/ICfXGGPvljoN97vsNjYW3FxozkjV6q43TYYAg/TvASyqvl3QKKsQ5StO1R7d8/KM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC bayaru() {
		Location loc = new Location(Bukkit.getWorld("world"), -1010.5, 66, 1184.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "bayaru", loc);
		npc.setText("바야르");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTczNzcxMzM1OCwKICAicHJvZmlsZUlkIiA6ICIxMzdmMjg3MjUwOTE0ZmI4YjA0ZTYwYjg4MWUwZWE2YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJub3JtYWxpc2luZyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS80NTcyNWRlZTc5NDBkMTViMjA1MGFkZmIzNGVkNThiMGEwYzMzZGJhMjMxMDQ2ZTQ4ZmU2NjZjMGExYmEwNGFkIgogICAgfQogIH0KfQ=="
				, "lFTGIWWpTialolq2yRUC1To2AUjOb5r7di5EuFj0l2yZlR8GXWwjw3dZ3LYlqes1g30Vn1cX+A0tDlbwaQ9SlGVYvIm905M+lcE2WhVk6NXMpTxxNu96UtSJpKk8VI/E9Vxa3j9VjwdPdHOVjMLoU+kaQZjZGPQOG+8fMCN5r9lzoxYQMCGXFX2/oIj7kau9sI6LiubmS7cO/d+BDyuQIuBaEuFkBM9bh5DgWEn1loCpZRJPXpcA+Wj2ItQ9GB4Jxoe6ETmtm97Gzwapef87Ua4/FzH1yYvxvIDXubaRKk6wRfdrmyTvH+EN+ZSgfQCUJTbrhiSmEj7Mmcr5P97WQ6t4FB/as8XJAUaXCE4Kp8O6RZxZst+g62TXUuK8ek5GQjnTJFNGnldCAGY3MhZ9inMQKKCUiZ6x8KXhvyhsM+h9lN0hchhqt9bYBrQdbBE3HQ4ad4wMEcRlVk6vL0XMcZfufMbihEGgt4OxHcXnp5VzIuAG7sn3Wn9VCoQDLSq7pa7jcMzPnctmCUYa2nkSttfDW+PbEpiAYp/IIYSKHaTmiO/kHH3uwe8Kkvr46DqJsl5Y3VEzuSiT+v3DTOJC2/jdCXP0E9gJhGcjfIu3kqFcqAsQTS73jkKGVHiigWJhYGFrG5QWCyxjY/p8DWLfUH+t9hURM2AVQtFeMDQRHm8="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC uzet() {
		Location loc = new Location(Bukkit.getWorld("world"), -1261.5, 62, 1453.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "uzet", loc);
		npc.setText("우제트");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTczODkwMDMyNSwKICAicHJvZmlsZUlkIiA6ICIyMzFmNmU0NWQ3YTc0ZTFlYWU3NGFhMWU5NmZlNDVlMyIsCiAgInByb2ZpbGVOYW1lIiA6ICJXaW5zdHJlYWtlcnMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDBhOGZjOGFjNTc1YzIxYmFiOTFkMjAzOTA3Mjc4Njc2ZjllMjA1NmJhZjg4ZGU5NjA5OThhNjRlMmNjMTMxYiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "OkJzwDDOOmC45FfgaJKtzTRdxsXZ3qSv63L0aue/O3F/Cfcv1hCe0WKYC+8sHLRePCr0og6yGW0yYaejdJ1DW7heYTjW9y0BJNHwsUxlRTxIfFT14OiUWxRCjdcs8MXZ8nQmN2wuZTwUzfOk8TnhTzUTcd/bFFpDNUaO23Y6zGTIhNONI2rUMxoian0vtY/fxDWFHqdIlzrYo6IbKZglonuZM/qbe5nQoXZ2dxF+I52sIXOLNemJz5u16bZuIW8GB61eFVaaAzDtWPL97kXpBxW3Rt7RUBaGrvkcNM01b16UD425LO5tjxglubJpc3HLiDTDuozzOMupFeSNsR9YSrKgX/dlGz7wHcdMWyf4+s7xv2RjJ6Jvr/8E3as7I0fl3BQ+ThTop+b6bye4Nyr2g/IgCO0e9W6Kaow1Te0IF/OJkatNFfwim2k7jYnrcul8jodNlNco1DUqzW9Xd4utcOC92POYPJZceFW9RKuBWbPe0dOswHpfoK3Kcb9RTbME9Yq8dVVWSmu45cd6HFlF66sZ9FCqvlZgy0FgV8wBjgYVRcEbHUylu2pu5vYd/h4gYP8dptfZfah0XS8/CCL+2EVczP9Ur5Ay1Ad6ajIB4Qh9wVMgWnl2zF4FQSE89a1KgwAEdMWERDBGoOA+yAHUJ9bbkM586tQxA6gd6vpn5CM="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC bada() {
		Location loc = new Location(Bukkit.getWorld("world"), -1119.5, 181, 1450.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "bada", loc);
		npc.setText("바다");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTgyMjczMTUyOCwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWIzYzRmNjk0NGNmYThhZDI4MGU2OWIyN2MzMzA0N2U2MGE5MGNmNWUzMDQzNjA1NjUxNTI3MmJhM2MzYWEyYiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "LjKTpHalseSIdk8aHDuUZUVWKrJ9r7vy94QRXy+huct860XvNG/+Xet28m9/ioIp2Dqi1RIWKDu7yzKzKcZPCoeHvDu2e/xp5Z9pWZ4Uy9NyQ/09Ebef82moUf48CgVk00iR7pp0P5uqJAH2XRZ47zjs+vVzw8CsLFo1b+GuBEdlSZLT3cNPHGtk+5QN2zS5vTKn/MGavzLkM76CySM2zUroL+b8A8itA8rpr1/4CopkJ74UeJJr1CUQPbtucZLc4BWHQO5q7IVk+ouJ3y0FXdGCF18qJ0g6ARL/blZhMYf5cDGCvAcXTnRymFIkOeCm+NBsym8xoz+NSguBV3mgJD+tiuNdASZ3NhFi6PCog62YhmxJ3HEHyLduMV28YfPl6OUfTHbPR/uNMGaZCBcla+A4lleftp3SlF03JyY2cM2PcCnP9ss/vzoeZ3ngt4LklZhZPWHNuzK3uZU1UCocvUwQnEZXOVtApNxdPCdiWgG1PWiTKPkNHAYuoGg8qugoA7w8+jYUM0vXFROsg9/538x8cSx9aFao8IbmOue5xVuWtjtxbfVpQSJvKCMglcxhpmnvbGFTc0aHvumkz90aVKAfxVyaW0S2IXRePn+DgkkRFebJl275oCX43n3gG4udbk6ltKgtf3AsUNSFWYBoJh7OAXGh8Oei5/ve6RYssM0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC marutina() {
		Location loc = new Location(Bukkit.getWorld("world"), -1117.5, 181, 1459.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "marutina", loc);
		npc.setText("마르티나");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTgyMjU2MDEwNCwKICAicHJvZmlsZUlkIiA6ICI3YmRhNDBlM2E1YjU0YzE0YWJmZGYzNGMyODY2NjQ0NiIsCiAgInByb2ZpbGVOYW1lIiA6ICJfRWdvcl9wbGF5XyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9hNDNkZWViMzU2NzM5Y2Q3ODdmZmVmOGJiNWEwYzM5YTA4NTVlODhiZTlhMWFiYmY2MGE4ODM1MzYzMmJlZWZiIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "Ii5NqG9bov9ivzp4lS4om8PGZpnzJ2UMDbHZFIs4O2OeI4PCjobszhyYg01iqn1rjyGUlgl7BOIWG1VxD9U8cuyfWdgOIEjV0SUfdKFWhmw1Nl1V0U+qpr3UHoYj8M1AQOaTaa2pQikoZfPhTo6C7+8L8qDSoYnxBpuwh8NDDKec7dsSnJICSFZq0ud6+2oQm6eg3Wsg7q5ZPaXY/9+A2iqiMSD1994dZHQbyevPkaxlax+b/4vEkj9JO0y/KguHS4N/lDGuR6cJcyUCvte6zTy55dtx/4k6wYIR714EgfAUGlRhmCmq0m2RYoMHlw8uo3zuA1SXlt+paoH5rYFyFUMC/nWQP02QNkzlqRQRmkEOFkNaPI/HWWCg1avqxh8P6hUdIcSucAQUMdSwgfEgIGAplvVxcy4liOheBi9m5NlY6HDHZlowILniBDnqPfhEn1UpY67aWaSPgX2H34+Jm3xXFnA/x1CBG+GzDy3MO5wBxUfULTDcZ9d8mkNVclN8uRI3PK3gW81JhHGrhWXZxBexiT/AMV50fKTefnhuRLtD5b8o2TBYATONSJcXPactr31eT7RVmH2R3z9tZ8AHOrnCYPWFS96IHeTm1jrgBIHlMWmIFwYq0Wc6vMkHegZPQtKU9RcJUpflno3MrbGKGpHXW/0L4rHxJonkUJJZaPU="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC nemo() {
		Location loc = new Location(Bukkit.getWorld("world"), -1118.5, 181.5, 1455, 90, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "nemo", loc);
		npc.setText("네모");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY0NTg3NDgwMzY5MCwKICAicHJvZmlsZUlkIiA6ICI0NDAzZGM1NDc1YmM0YjE1YTU0OGNmZGE2YjBlYjdkOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJDaGFvc0NvbXB1dHJDbHViIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzRhNWJhMTM5MTQ1OTAwNDZlZjE1NzJjMWNjY2M2YzRmYWQ1YWIwNWNhZTc4ZjBhMmNkYWZmZjhjNzc4MjY1NTciLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "riaNtenWHWqELMcGwAEQvZP0ycT7w+kceLXiso0dGDPcf4kt0ABcWjL1j3XsGetxV2MURc+E3x8A0GC5H38teK80r3DIFEM6bVumw0gaZSauKIAEasGEkuC9tRvrD390qUI9LVt6/63JeNf/fQkToIkVyT92TnymRPCFUnCDW9GwUoQ9V14zCIA8K+yw4loGfnSQerfxHPCfpyD/7pALgJr6UGOpp89K3sUOFK9nypwstMQk6jDTLNxG6y27E8gyVdj8NmCWVsoNnZyQ2h77DKZ1hASoP6lAiqczxogHdcAhLJ6DGWlSstejmj7ep+IzStP8jwlEA4ZCVyvpicb2xxsLc16ChJpGUJ1XCw1RRMF6cnuEPZIJ7HYMc1pL/8UvQ20ILw/VggSQEcLS6WQKkEyYk75yJIjxHiomr26l4stQ0kgWknAhOXTLf+pGdJk72zU4AvrVlYKrVTkWyRLMOLs3tPAjagxNS/2NmrPRYXuFbC0XZ3UT+gUa28ncnUyJVR5Ib836ORx8JmGYt1akN7mythOkeIwyYo545tmy3dkbSOZn+Q007KrpbELvvNi2qz/JQTuAisjn+F+2bzJY4FxPkHa58yE3LDopE1KSgAAzrMZexN4z+dOxWErrQMlAj/qaruMxNGduUVva0kQ7MDdj33LmpiWN4VMDgNnGvfg="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC upgradeNPC() {
		Location loc = new Location(Bukkit.getWorld("world"), -1105.5, 186, 1466.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "upgradeNPC", loc);
		npc.setText("승급 관리원");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDE3ODI1MTc0MywKICAicHJvZmlsZUlkIiA6ICJjNTZlMjI0MmNiZWY0MWE2ODdlMzI2MGRjMGNmOTM2MSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMSlI3MzEwMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mOWY0ZjBkMjc0M2M1MmM4N2E4NzA4ZTUyNzNmOWEwMGMwNmQyMDNiNmJhNmVhYmNhYmMzMWIwYjE5ODhlOWVkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "WtZRcqa6clkoNqTBW1fzyV8wxcXRS4GEZyFDPNv8BXYrPODLhZe3QdECvGXjMon4cKxqQ3HgUg8Q7V8WDzKXB+5ChJo0QRuD1q2wIAhibHIB3MHKj1Vo4FZZ1tyPIfNgjMJHqkboX8KMLwvBZx5w63+uTi/EuedE5LTdfW4d45wRzEp8kvnm3JS5c8UOipANHklR1UkmNnvyRpe8eOZ7OKGjFSzYaGDGhmaTGpLL8MlOH3MAZoigUYMtGEQTzAySPP4NZUqsQ8UF6cr753yLwulv0b5ayl8iXTXhaTsZcl4GpN9v+0SO3dpeV78FuuviuTvJwZW4ULaXAU6FI1p8Hm07px9nnR+Frxg3D1JuHRiTTzhHVv/BOcVZ4sCp6ZrUC1MtjTAVY9TZrFqCqRpb4bWe6onWfCEW9pCKWx2Hi0aLQw1iq/WnWsz02Va2rGIw919NHzbwdK+SCGrv7BS7lM1XSweXvCuDidCQ9XXqIjR1ac4vHLc5Kw77n8jkWOoBQ8nmGfh1/kuUNykWdhQJ6Dp6iIm7Cdym8XnvShc6sa67RpPaV5KsZbtIQ43Ci3Rx9AlZ14mHOcRXXG03OMZ1PhD4nF+ab/Cx0f1X+3Dy7Zpugw0z+E1B/p7QuWsiQLrqe5aYemP3v3/2/Lqc+efdAFstSW3vj1+m6vS0g+qkRnc="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1854.5, 70, 3009.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop1", loc);
		npc.setText("나오");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDQ0MzQ2MDIxOSwKICAicHJvZmlsZUlkIiA6ICI4N2YzOGM1MWE4Yzc0MmNmYTY2YTgxNWExZTI2NzMzYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJCZWR3YXJzQ3V0aWUiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2I0MGFmZDkwY2U5YmIwMDk5YWQzZDFlMDRkYmJhZmI2OGVkMDQ1NTQyNDIwZjU1NzAwN2VkOTY1YWRlZTBjMiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "RDrrJx5njj+GgnKQRIG3vBHyA9yb1wBLXRBd/c8cpisTh3hL208OtWcipL1+vua5U6yAHd5sey7e1G8dukRctPk3FWA4jSeFltMYr2B7b54MNQxZN2o/YivfYlZ+IVkGMebbTBZ8r7Z6vKBp8hV1GT1auiGJ5tx6P4AKfjfOdgg1W8Mv6+FyTd9KjBJdflI7mbOdtjHHkEJryRS9zZcjkaOWozH6wO63GNIBuCplGTfyy5kjB979TbkuBzCVbBCNbbiZGzlHBs1vn0/uo+sSDRsQmNxkcM45EIxpb2kCpOixPvyBoUUKadVjxKdgQes4zPRJYnrhMAgU++YpGAaYH+i/G87iEoItuIx75U/J5toYUOM1uPCkCnWnOkBZ2LzM9gYEIReYix3lmkVBTVUli1WjYWw+64iBHuyuK0/O7233otIEITDjqOrq5adTVq4BTlxSeg1kGdNlvdzDXqlm5Y5u6naTYoRqJT38V2WGt+9MtgrT5xSdpsmUs97kB1LEoCRNUSawBBIaXcBaRHFF9ylBvalqNh5ZEIquSlE3xh8HL3eTr9FDex/SCMR/32eG9A9zA/+DQCAp7O0jUCp1k7oV/xosNS9WVyjShq+34as4vMoB3jQJhWTAIWpyyOP1/uTbjW5fePhime1bJrD4+yGbTwAYtihjO5YxvO0tGRo="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop2() {
		Location loc = new Location(Bukkit.getWorld("world"), -1091.5, 68, 1189.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop2", loc);
		npc.setText("시계머리");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3OTU4ODkzODI4OCwKICAicHJvZmlsZUlkIiA6ICIzZmFhZDFiMWYxMzU0MDM2OGY3YjlmMThlM2Y5YzRiZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJKb3NlUGxheTE5IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2RmZTYwMjVmMDM1M2UyMjk3MWMxOGNlZGE3Y2Q4ZTc0OTgyNzAyOWUxYTgzOTM5MzcxZGU2NWE0MmZhY2I1OWUiCiAgICB9CiAgfQp9"
				, "NhGCwdU1IsoKyiEYYWzMdl6+00mI1LH1PT3EyyNr3RgYncVzgWZth0iGH0hncXweXfQ5LAtRwzeAz/g/rXgmdtPforJdngOAfJ9Doypw55UTD04CW9TcKrF2YvCowUL4P8KQ/ijBs71aslNsXgyTJtBt0mvclVJms3x5Nm6sthJ+zNQeBXz2zVJ7lU4xJOVQ7L++/MuNuI8OMHZUB5XkP+RepUHdeSO8N25ps6phXJVsQc6lTF4ldR4mrA/1NcfOKvp0ICQkb9hoU6R6CQW0/NnIAI/k7hcANJrGZtQkxosEValkjU9DNMsJUA3+K8besUulxn81r52UnMw9+UKnBEIMwH+WNWrI1IoqJEPJ5jOeqkjrxWlAtqdHDBZ940HqWU+aFDOLUnN6UZE5aEH7f0aF9cEPU/untJmIDxOFoZd4DPCc2kD0M9W9tf/u60ctmZniu7dvfpzHciG7LrFpt0q+o3TyzWTkjW1CED5dYzRC5+5nJPnBJF6WftPNJMY4DrlMLxzUzxa25gBz2/UP/HQiC+0accveDLg+E2HT5zwAJoIgviwuqYxhHXQwTsu6mILKJelDoN4yvj0axHAFpmMjEB7EziJWUoPwlg8VwYWUqPT9WcER3K/BsMFMNPDCyu6GPIKIRJPNwMw9nlVsFod9Wmxmlf8A2V7BEad2hms="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop3() {
		Location loc = new Location(Bukkit.getWorld("world"), -1053.5, 68, 1190.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop3", loc);
		npc.setText("돈키호테");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MDc5NjI0MTcwMSwKICAicHJvZmlsZUlkIiA6ICJiMjdjMjlkZWZiNWU0OTEyYjFlYmQ5NDVkMmI2NzE0YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJIRUtUMCIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8zYTcwYWY5ZmVkN2NmODIyZmIyNTk2YzU3MTQ2NzNiY2NkYzQ5NDAwYzkyNGM4ZGE1N2E4MTZhNDA0ZThkZjUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "JWd5ejvY4/6T8ClxFWLd4fFzwXW49wlyK1Hqi2O83/6OI0gA7sh5KBZP3wtShd/7v3HkcNsMTrEya5VJAAebAerrQ4+fjlcTDFtrI2kLaQsumRwiwMCKgONoHhbzZMxvLtw2W34Z9rOdoE642hvFjXAHwAXn4DAVGxGM/rRVe8HkW+hQuy2Bl8sLJHT43wzjg3vAiinCtUVy3QMboTdeYKJWEnMarVe2QFTriy5eg/lwU3HVsUOtA6X28QHRJbwx3oT3vYdgUzhGZTicVXVmQChXhZe8IGp/DCHicc+cnnfyLdfeVoVi8d7dI1F+M2hJITfUK5751RApY5bTA5uEP7HdZAgwPiqIlR18uMjwxvBWko7qWFqyXXB0YawHTs8FEKKPYw5p0Sfr0MRNKnkdoOIrkijZjJzrFKBNhHYmw2b5yuHnYB3soDDXP3zbiRWs5UmbxXEkhc8TYBtKt02n0YNEX80DJMPEMC1AeXHRGN6Cg1v7qNSFH1UvMXQ0T8BPxgU6aZVcok9aLq4vVNwTsD46xYm4oSt7AuJK758y6Tq/iBF2yrmthaKy2Oa4UrFljg7pvYIINcKufXc48jzR1tc7k1Y9slrtq1oKxbVnxSZZSb+txdOU2TylDAwxqiL68TquhP+Kbwrt2q+V/++FB0Sj0dxsvCEfuv+pdFkTX6I="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop4() {
		Location loc = new Location(Bukkit.getWorld("world"), -1055.5, 68, 1213.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop4", loc);
		npc.setText("료슈");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTA0MTExNjQ1MywKICAicHJvZmlsZUlkIiA6ICI5MGQ1NDY0OGEzNWE0YmExYTI2Yjg1YTg4NTU4OGJlOSIsCiAgInByb2ZpbGVOYW1lIiA6ICJFdW4wbWlhIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzg4ZWJhMjJmNTkwYTEwMDJmZDkxMTUyMzFmN2NhOGRlYmFlYTRiYjM1NjQ5N2ZiNWY5Yjc4OWUzMWE1Y2QzYmUiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "FDzXLDhdmsJQqET8F7KOHpH61OiHCGNXW+GkC04WUVm6aFSsNWP96Q7+0ij6XEulyqtlBB/CjIQMZoSOjQhgTfBQv9x5KK4H6HKf4qL2RXLpsLOP+/jw5k70EaFREq+ZM0l3v99DEBwIwwvhl3pPn2x2yDLxWPyHDqy0nYb7XncM0/zkgbUzbovf4Kxw5hsgn59BZgOw1PmA9XZ5jb2KQpq8ERCbfq77NSTtua9h2b9BCNYWECOBil0jlsnZP7UXDUcVeJsudbF2sxV053Hk6Ezr1S3tDZUhqwQYM2VPeCRIN+IbevssWIZXDd78+EPT/h8LtujlCqgv9qc/RJ9/e0Yw2Soj8uU5qIQXh55Yt5/f/F928CfQARI7pzxZICEvzlAvMdM4p2uawZU9+s28nxN9+8GguWSYDRmYVjy46Udirjy1QI8H16CA23/uNu/mcWvjT/izhEGdbxMXtE+Xo4TjMQkE4i0b6dXW9uXBMJXkXeC9V0FbBvma0h3wMXZunFsGkX13aAVlsa6wUnz3empYwEgGezeCj4cjbE5ffLlj7MojFerL/0BVdlWe8qG0PxJsOcUEk+5s7EOhv4kc1fTx8U3llQig3sdc1vjVCyqyXy00kZmFZk5PYVpPi4AOvkZTCcRvWttRnEXVTJewu14CHbvJPHogDKlYiK02IUE="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop5() {
		Location loc = new Location(Bukkit.getWorld("world"), -1063.5, 91, 1330.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop5", loc);
		npc.setText("비나");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTA1MDAxODMwNywKICAicHJvZmlsZUlkIiA6ICJmZDYwZjM2ZjU4NjE0ZjEyYjNjZDQ3YzJkODU1Mjk5YSIsCiAgInByb2ZpbGVOYW1lIiA6ICJSZWFkIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzljZGMyMTJmMWFhMTM5ZDc2NTdhZDg4Mjc5ODQxY2EyNzcwMGUxMjJmMmJkNjZlYTE2YzQ3N2M3ZWY4ZWM2ZWQiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "aLEkJzngYe89BwOCPw/4Eefs4dQ3dMnix0Nl2MZ2nRE1HafdI1Dejb/r1fnq5FgiB+mJFSG+NXZGDZIDJVAba/J80jjMKwIfbeBTpBrrImvsOq0x1X8PAJFqBKlEGTBL8I8MSl9Z5YSyEOm+SZTbVpaQcBip9xJ/mXZ3TO6k2iHsVzAViOTNZQi0EAK2GRhfvtoiyGJk0i8szESIFsbkRZuWfWBgn2LV4kgq0NVGZH2/zOYK4UNMHkKVa7pcnXm/uPPdLVwW6qPbqdCTSu23bGgx5Tr/tGGiD5+Q3JB9GzhfqHCmrt5UZpPDip6H/VDtlOgWCIrm+ALIFzGMC+lgf+TLcPUHZuQRVxqQI/R9CWkzXAvAnTof5+rjh270GAcxaQ2SU3ys22COdnamA3DWiismQzzeHXPaPcsTrloGJlBiVNQlr5gT9eAa4zG7Nbivn75lMoDCDxuDbpJ5hAC4OAiUtNogxNQAkssr6NwpqBb5b4Bg/kSQjJb1PI6hcnrN0KoQG6Ipcr22YV0KfWtd69gFXK8BwmmEJs6lZ7RGl5gFr2UbEJfSEbSpajvc4W7AxG5hZSoPYdJGlcjlU/g1QH/GqUObrNPrckVzHiDQCf1gm9kKUjcIT+JDckv2mfpvf05tD29xsMePM0i0ey14YpteZFjClTQWmTXVWQfiNMs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop6() {
		Location loc = new Location(Bukkit.getWorld("world"), -1071.5, 88, 1296.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop6", loc);
		npc.setText("티페리트");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY3ODAyODQ5OTg4NywKICAicHJvZmlsZUlkIiA6ICJlYmRhZjExM2Y5ZTQ0OTJiOGM2MzUxMTVmYmYxNzVjYSIsCiAgInByb2ZpbGVOYW1lIiA6ICJhbmRpeWFzIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzk3ODY1ZjY5OWRmMWQzMGMwYmM1ZDcwMjEzZDg3YjE0ZjIxNGRkZDFkZDQ4YmViNzMyMGQ1MWJhMzFjNzI3NzIiLAogICAgICAibWV0YWRhdGEiIDogewogICAgICAgICJtb2RlbCIgOiAic2xpbSIKICAgICAgfQogICAgfQogIH0KfQ=="
				, "XN7CI0di8kESToJQwkP8kzWAaZ5rRo4FM8gUo/k4FbV6gEsRDD9rWRaHlEY+ljSyY9gXIR9HMxUQtdVQw2hPENIuu8yW1OdtamOygsc6TeWUWd/pf2dLZYuwZb2w2dWpo9wls1P3plx0wdEM9DxkwxvacJt2f1iADiNiV1rSHTj5il5blBygqSMbxEI6U0syMEop/ZL1vXtAqTjcwYsGYzQV0fkM7owdrp/in8ql8bUUU5NW9pTfyOllh8qErDzVI2E+VDwLpz3w2b8kHickRgZrJeOFMcLOzRkMFPH1V3Ji3W5y+06LotEQkSHwLuCT+L7Lyo75pkQw7mbQwYnLPxHIEUpYmfUeW8lGyUmiULEG6AncDeI0Jzo6fBBXAcp3JuUIPQ/9IwRXypUDnxMkRoSuAhyNuonWokXq1jgidBB+e0glZXWufkyahlZn+8jvYfKbTRZvWRDl5gcoIM2O4tYoBeSnzPkhP2Y4NCasovU8n3lhD8VqbjBRkI0/C5Jt9Xa4ftbTsWwq27YnSGAZaPh+uNBV/XDTYGUoX9ZMEKVud9O+KY3y7MoN5ezyN+yBUqrFBeJHl2+CC3dkk2T/+XUfdHGyIWfwvD17eh9BPYX5nOW30XPVfc6tAVqBbUkDH591YV/dbWd7dPDPIjH9bLSD4eebaoaD0JJKIMuhP+0="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop7() {
		Location loc = new Location(Bukkit.getWorld("world"), -1091.5, 94, 1332.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop7", loc);
		npc.setText("호드");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTEyODQ4MzE1OSwKICAicHJvZmlsZUlkIiA6ICJlZDUzZGQ4MTRmOWQ0YTNjYjRlYjY1MWRjYmE3N2U2NiIsCiAgInByb2ZpbGVOYW1lIiA6ICI0MTQxNDE0MWgiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGZhNTY0OGJmYWZiYTI0Mzc4ZTZlZWNiNjJhMTFjMThhZTYyNTg2OWU4NmZlYTBkNDI0MWIzYzI1NTNmZmZjOCIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "lHpbICm6Anvp8sDY9GPLCDrHCSG8QB+kV/fczyf4Dw8XadJW5EKZmZVqbWJpaWvk7bjdABvPLBnOJBWzTpx+cezQ1LD1rC5anrVEtxBEHSt11wdftDL4g0QRax060S52TCsYprYxDWrYUU5GVDOnwLfwVZOiS+PlEr68toAcf4J5+uBdC7YK6Wzg5TKeZLGM8PpkrYD9FC/YJ6GlWrtQp1hpxY8NRdsbtoQ0eutuckW3gIPwCiPcloqXR4REXRyMtGbvgZiBNjwY97B66hx9Y8B6QUyHrfB9CtTG19fdo48rYd89s7omWdgNdJ2TRakHKqdqJv2NiKTvci4BZ5Y4qmLMKPCdz6xNAjUR7eCJeFoxp4qPC9uRH3HdyNAVlIGTXcgoIuSrhEXf7/zSQkSPs0CMoOUGXVRuoPIbMhM5eErJ23SVjnkM6mPS5SzQlC1hcR2tjhZj27NvM9JAYAqdEhFVK+Q75s2Q9cwt9C4+0yBeEKXpzNOCmy+EW1Ayar/Pz8OPPKdU+B3xbgVUo2UTRlWDiI0+S2ndSHgW/OJK5Uucnk0nUwATFnxDZtrk06qjfe50iQ56RNVkIeb7pKO5r2hZhH1rrJ8Lx8zey3C9F8q/PIjPNe+1kNSC1qgLOWYOGzWEOCQT8a9+aP6frY+wLb80IY4B79RrdZpNRdG56cw="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop8() {
		Location loc = new Location(Bukkit.getWorld("world"), -1151.5, 181, 1484.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop8", loc);
		npc.setText("벤자민");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTEyODM1NzY2NSwKICAicHJvZmlsZUlkIiA6ICI3NTE0NDQ4MTkxZTY0NTQ2OGM5NzM5YTZlMzk1N2JlYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJUaGFua3NNb2phbmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg1NGQ0NjBlZDMyMjk4MDAzNWZlZjI1YTA3MTQwMTYxNzdmNTA1NGM1ODMxZTJjZWM2ZDNmZDgwOTliNzhhZiIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "UZng5iyayV/B1vXz6BbN066FeL7Vx2Dku/g/M/fXueYDb3NStt6gyeI9FrHnis5tk9LGSjx+ZqYP+n3iXwyMIy6nnkQ96t/ulK2ExIAFaQO1vGsK5O+IvE7ygsVh2zDOvU14VZ5uwcg5hlCmpqysaYkUdnXY25bsbgzgvRmmpFvhYo+BQa7GLLJko8tP8qYWG6YdT3UrvgcB72pNKfB4Vb2RoER+hxIvidvw58mkPYIZM0eQ3MJbuDeTlK5VgziDuC5YiRIMFxoEQ56IT+3z31NoFWJ9vKSN2qCWDy1RF+qC+ZXPaK/up8cMiuKL5i+RtsWMTnNYBAukxRmCECC0VsZhyY1zIFFIr8H+GzFSjm5tjyRmE9g5+N4YYKbujHrrs4+jZkSqT+UITIDMgRxSYl/m7IabDsl3hxHQi0hKt1PLKTS2AkHNVEkwzReBeWinLY/KhHViKYWmOmk2nYDLkZfjzrEOBjxBu8PCEE8yldy/C57NnAThvH684kdnRZqAdjZYv01JYadYvYmOAt+PZIxb8EFClM7FEnWMZVy2XyaNoQZQIq4JsvLEB6srU4+GcNzZvrbWTrSdBGjSvpvvaSZ4JAG9sgWrgPwofyZpUbIrTjj/Mgtl9pEZR3u8eAEv5NAyyMEKgtpQOj9Nh4ffxltU5KkOkxby5IoXFB/yhqg="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop9() {
		Location loc = new Location(Bukkit.getWorld("world"), -1133.5, 181, 1483.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop9", loc);
		npc.setText("카르멘");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTEyODQxODE3MCwKICAicHJvZmlsZUlkIiA6ICI1NGVkNDlmMWUwODQ0NTU2OWMyMWYxOTRkNWJmZTNiNyIsCiAgInByb2ZpbGVOYW1lIiA6ICJfVDFfXyIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xZmJkYzU4NWExNWE0ODQ3ZmM2YWI3NGU5ZDBmZjE5MmNjZTI0MTlhYjAxMDFkMGFhMjlmMGI3ZTUwZWM5NmYwIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "La7Xkb0/1FqSbWW9lm7VApiW9yAfPp2HPGmcr/oU6QTHp4B76XkAUy52JezhFUu7ZB9HuR8oRhcCKIK1br5mYuMuPAjLZZC4YMvPlAvcCRCXqwOyurTwVUe9LTFIm+9FMt3IJ2xvDg0xuvHb/SAYEVMozgu4j1mduJSCU1JvgYjOSrMXh0HsmJxJG6qPdr0QNqNjAf2XvSkrNjk+ZfP6P3oUdGL9HW63w96VV8aWJfa6b/Q9BIu47CbpF30n2zaPS/5rXgZlDaO2n1k27hI49kSZ7PUODV4YrvxSjCPp8YgQNww83NrRMXAI4z8nk/rh3JQHSFviP5Ypa/wI1fqx03ZkOy2NH/oXEr356ZvDGETgvK1bgxmj4TFHdBUq1p5Tt8cDKRMZmlYbiG1T4FjEaWbGktJHqYawUa3bxpowtkxCmVyVULqNIelK6xjggstLGqYkbJIJW2tjMlJ2HKg8snoeZcNYgkjV4ij7ImY+P/lMQiQPvYicHn14dlNkQSgJOEIXemPxsTSpopgKnQwA5kbIYYK6i2WbokjyFnMRl//BilwxwFuIGUOvnOos6HBVP9I1xtNb37uIFwwx0mRmUObuAzjSH34iB9uxzsezHTXVFifaoQAm1yaLJ3yKRleKx5IRdjmpVub4+J3a9jy9LhehXD+8z2pCBiPmpDKK83E="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop10() {
		Location loc = new Location(Bukkit.getWorld("world"), -1152.5, 181, 1467.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop10", loc);
		npc.setText("아인");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTEyODI5MzQ3MCwKICAicHJvZmlsZUlkIiA6ICJlZDU0NDIxMDI0MTM0YjQ5YWQ5MjRmZDEzYWE2YWNiMSIsCiAgInByb2ZpbGVOYW1lIiA6ICJNYXJrdXpfRGlheiIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS8xYTBmOWYwZmVkNDA5OGU4MzYzY2QzOGQzYTkyYWRiY2U5OGNhZjk3ZDU3N2UxMGFjNDkyYjBiYTVmYzdlMTFkIiwKICAgICAgIm1ldGFkYXRhIiA6IHsKICAgICAgICAibW9kZWwiIDogInNsaW0iCiAgICAgIH0KICAgIH0KICB9Cn0="
				, "UFx4VyANxXvuVRVwVPRyfQeHxi33iqnRM96J9Sx83rd74D/yoJKntpWIopxMnLXlRBVXsUZKHfY6tp2M7lJf58cywZAOyGZ8dNnrTuQq30cuUK6gZ+irvkoxYiqnCid2p+Vxan5Mp6qz2TMPB8hTaegpnveqigt6lyzLQ8Kkni8a+L0DgKYl7U3ZuRaaE39KF0xFxJh+Q2tqipM51/BkCcotwlAF7YsWJnYTv9sSuVxQocyBV+X6kfMeYvkeU0eKU2Pujyuj3HIB2KJMLGlBKSzW5TiZxQR/IdaJiAlT/aVCABDgTPHc1Bw6UkjUv0HL5sa4zw70qnCGASXE96pYJZPv+HtOX6Ienf7465qNA3YJ9zymwMIZaOfRfzbq2dUvgR7WlkWl3Nk9kfqRu1xyfVkTUIkv3U7POl8/J7LzOMeXUHiRXtzTJWBI0xZzWELYwNVbhs8jBjuPdISTOHK8XaC9+N1KByKrDlIBb4zWgmaKgzfX07IlKPNXg4uZkUI3wjt7fKYO2/wlzUUCsfAhXjZsUqb++hRBONVr1wxUsf5eJuMgePvZE285UW5d+hfxA/RCs601LrO7z/iD/K43lnCQCYUcciPaGI4HH6e0scfnyP2QvmjGFRf5oAHwzkSSyFTJKf68g519azkPNOY+sAPb5eBHPFWzT0/YLNmfY5A="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop11() {
		Location loc = new Location(Bukkit.getWorld("world"), -1138.5, 72, 1301.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop11", loc);
		npc.setText("암거래상");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTA1MDkxOTk3OCwKICAicHJvZmlsZUlkIiA6ICJmMTkyZGU3MDUzMTQ0ODcxOTAwMjQ1MmIzZWE3MzA3NCIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZVhvU2V0IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2JjZTE2ZDk0MmY2MzYxZTg4YTk2Y2QxNzk5YjE5MGZiODZjMzQ4ZTI2MWEzNTgyMjQyMzYzYzgzNmQzY2VmZTgiCiAgICB9CiAgfQp9"
				, "ukZ2CsYgmAAqnN2CC/HQGXj2T478HaoXPbWo7rHF/9tcUtJikW2rPhHcHlnnDJLtQf1QqK9bxPqPLp7DvbVVfZTUNaSq1R074egMKpAvu+Vu5Tvi+ABkP8zM6z61HNYJw8LztEOF2lwWLzpcFYGyxthksWwyRjl0CcxCQsdp90uWUpnNGgf1/ptBC+Yl/tmvPgIQu0mpHo/076NqSARVwz3UbXh9DaVmwmjq7ZPJEGLN4SBIRjJljmBi7Q+0rLL3H4Pl3QQAYI/OxpLfGSphVDC7IxZrg95iUa0dvztXiELp332uzA+w/Wr/y40M7wymJqNK2JKg706jcu2cgkyALue28WupefB3e91yjr918b+yFnONoTHmMJTT436TrkwBErL/ynIpPKOBWkZcygICi4D1dkks8Usbx8UKzOEhwp8fMLdXI/9OYrICNw4lM2Q8hgaLcgWLqpIdI638CKXbOGM0j4NnypUkAFzUxonQQmBrP5Sufjyf8niC8RpCGiCwOOFNKR7Ym4XD9IRwDvk85tzN5fjsqKd+98ljZbJKHNwx+msM+BQ6Jddx7AjoalHkRh5wOEiCnN2waLhlz2ETk4s1o/t8rsUeDZgZ79NHi0zXcPYGqffGDuvPwWTIFplzGv/uQAuf4F4n0RB4Wmtqm4DbQL7xEUfMC0MsQIxVVt4="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop12() {
		Location loc = new Location(Bukkit.getWorld("world"), -1148.5, 80, 1343.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop12", loc);
		npc.setText("W사 영업사원");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTEyODEzOTU3NywKICAicHJvZmlsZUlkIiA6ICJhOGJhMGY1YTFmNjQ0MTgzODZkZGI3OWExZmY5ZWRlYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJDcmVlcGVyOTA3NSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9mN2Y3Y2U1ZjFjYmZjNDQwZTU5YmJmMmZkM2I1ODJhMjAzMGM4MGVhZmI4ZDE5Y2ZjODcxNGMzMmNiODVmY2QyIgogICAgfQogIH0KfQ=="
				, "axphD9+q4trHROedUUGirYEP4uMo4JLb0uTYlWCfhPTxjDHTJPj05tMS4PzsrI8WR8lpuKLaW+qGF2h3962VnK1aZA7o1Kmj/iezfvRyAs3sZdFhHyd2Ryvin7IWIZs2WxrYSRVOhuhzLjO4HuhyJl4T53CscoSWJCHA0bErqzO6WNyFMqEwl5zxqR66mWGGGqm14rxFcw2FamSnwdacD+JYM7RBSX17uqgB/xCKWy57frp6FrsTOrki6yZo7mUmAAwYwvo1QZ//dPeQnAk/mcdSNVNI5VA8G4zf5u6ABq6ovOqzqo13qaXMaISduhJ1zWZ2nTANm3lHVm4ti5BbBoFG8NZ5tJPgtL8adu4DAy4vYubPUMsUHfbgL0qg53YuY8Or1atG1tGEW6qbBut/s9kBGXJU6V0a876flQ3/2oj/260zIONXjzsHp9FmWbTlkFUXoWL6HDdPfbmLh/9GtK8lNUGCxHuF6uV18tvaX6eGAWg/X/m1MGMQwW9HaxqXnbHEd2ireYJbYKR19z5gwZp2JpizY+345PPpLUlDS+cQ4urK+6XdBoXxFdR5ZNnbm+GAf5/hsmNzisKCkdZqmI6gnyg7J5wtZOLY3rj+zy9lt7BmzwK5hA6AcwC3l6CqukHjdz4HKa4cQAndbgc5GrBS2ZOlYs7RyIetQartAkA="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop14() {
		Location loc = new Location(Bukkit.getWorld("world"), -1116.5, 192, 1444.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop14", loc);
		npc.setText("통조림 아가씨");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MzIwMjcxODcxNCwKICAicHJvZmlsZUlkIiA6ICJiMGQ0YjI4YmMxZDc0ODg5YWYwZTg2NjFjZWU5NmFhYiIsCiAgInByb2ZpbGVOYW1lIiA6ICJNaW5lU2tpbl9vcmciLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmY2MzgzYTVhNDlkYjJjOWZkMDdkYWY4MWUyZTk4ZjZjNzA1ODEzZjcwOThiNGQzODgxYjQ1ZTQ4YWQ3ODkzNSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "Jo3rzJJ/mIYiJHTF1on1yQJCt3cIC7rHWu9iWEX/Hg1IybpMfKjTBrZq0KJeJSTINHyGTqL/A0wQPdBIpTMZhb7k3kUImt1QRuTl4+CUYvHxf7iAQXv/KBgO/u4QMIewyeJUskbLPYTOtTiS90ilaQpuLQ+U0J65PBZFUQmqKK3p6PSeBk0K638bdIKVydJUvlJELTDrZ3MKrs8KfbTjpu+zGyt3Iu62zbg7mtlwL/621S1MHVN5+oXat17eLBve8jzE4xNSyjlLld3wK4Oa0y7oE/d5D7atMhwnUv85GQlBSDVVwMD8lgctKqjQ9IhuOWvNiWH0xj0PwRr2gJIFca5CZ+KPndzLfidl+5Fgt3jm1TD3Y45XXEcVfnoQhhWaQWBzijkYYGu6Smiv0BGcJLqlnIR7zPRqszj5bmyJsVxJTX/Bt0PlLS8mHpbfYDq+bJx4ztATKssBJrUrwUrRgLa7RF14krtjyxpeLTlcH6Udf2Fsj1CzLQxlaMnAFzYPXuFg7fTp6MerL5UbhK400ZClijfz9AvIlXED9SFfSKWY5/XYkuV400i6BKfR7lBzdnB4FMGpvXc/dSW9PxI1oxzhK5eDmAEOfCo6TNZWGqZuIczZzBafrGoSpgadPVvgSk0xHB51dfApWRAVsvkLZYLecmh/9v2ispaRKO+5zD4="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC shop15() {
		Location loc = new Location(Bukkit.getWorld("world"), -1080.5, 120, 1328.5, 270, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "shop15", loc);
		npc.setText("의문의 사서");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4NTUwODcyMzg2MywKICAicHJvZmlsZUlkIiA6ICJkMTE4NTk0MWE5OTY0OGQ1OGVhNzNhNTZkZTZkYjllYyIsCiAgInByb2ZpbGVOYW1lIiA6ICJOZWthU2hhbmRyYSIsCiAgInNpZ25hdHVyZVJlcXVpcmVkIiA6IHRydWUsCiAgInRleHR1cmVzIiA6IHsKICAgICJTS0lOIiA6IHsKICAgICAgInVybCIgOiAiaHR0cDovL3RleHR1cmVzLm1pbmVjcmFmdC5uZXQvdGV4dHVyZS9kYjkwNjJiNTU1ZDE4ZTgyZDFkNzI0YWU2Njk3ZDFmYjNiMTgxZTQ2YTkwYTYzN2Q4NmRjM2Q0ZWI3NjFkZmMwIgogICAgfQogIH0KfQ=="
				, "WtUOxnMQwEnC0LepnhWNmVViE/Tq8/vXQ9xnE1dItO7uZZdNVuu4rjRLhD4v4CXFStaS08RggQDue330qC8VnP+Pll3a0dIpO851h2DlVEjYDmIBtwaa70eJJG+1byf/FqGnNYvuXOw89joIrkZwdMfr/1ncr94oF3LsKl3lwqhyqfa1WHRvz0BtRmFpl8TS6FPZFL8ahH/Rw/eqcP9asGxqc9+poAJLLI6wgxrnR2iHigMQIhWCUvYvKt3Fk1BuD5j0ZjkWW8Czst/Wpmd185KGGrN+CF4yO4D+x/YMRHJp3/ShRa7+PyMrVnz8vsQIhg9+jEsIlsbW6GIwNyTQoAHmky7HzlXrej7ETg9W2mK/SFbtl/3a0+vDczYSojPAbRMEprHe4xiV5/kFbjDJF8/8RX7LAPSXqrIENd1mWELtdDgvx4RX53H7VcWeWlEve8zLnxvB48Kg3D5wXm/607ujpKx8HrhIGMGp9ZtMDxUzIKtjp7Cb0b2T3ExnrPnD65/5MimOyc190DNOadhXeUXz0FmJpFIaz3Tm6Fv58y8S9y6na3CFSvz9FFQhE4XOw2+3WFEHd3uUuJPwv6pgn5n5mfUOQAto8go69N9AjpACXCYBHyM2OAi0HvOOxUAbzPBbN0seY397mA8YsPsWDHQE1pfdCbSFwibO+gLNTgY="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC myo() {
		Location loc = new Location(Bukkit.getWorld("world"), -1176.5, 202, 1454.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "myo", loc);
		npc.setText("묘");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4MTczNjA4Njc1MywKICAicHJvZmlsZUlkIiA6ICJiYTBhMzYwZDM5ZDQ0N2JmOTNiZjBhMTU2ZDUzZTZjNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZW9sb3oxMDAiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOWU3NzUxMjA5ZGI1ZTk2MTg1ODdkYWY4ZjJlZTRiN2IwNWJkZjc5MWNjOGE4YzQ2MGRmNjg2ZDc1OGVkZjc3MyIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9"
				, "mScVyreTtwHbRDz1eDEmfyAYcaVrWpcPHxav5gD7hqv4f5xlfbHe8r8jJopmW9iGAgovwDObxkgckiUvpOG5vofuQryuAU58uSFuUTm3Z+IwcpZYrD2e+6dZiJ9/BOJ0Hi70KRGs+t2woJM6bm/RdGVjypf7iaqa8jYg7LPiHbi/npQBXiV/Cnyr4qOowvBMJ0Ou6stXXDJ+nvacgYk1GNgKXfzdF6J6JUlUfqBTt209CzWi8rnJztLFcPj2AjGKHUgJCFSpQrB5PHWc6tgLuLlK9ycPUbk7NfOnfjnw1qVDKeR5g/RnBrto9OOQKl266hpuMjydomWRgakVRl/uWxe+a6mPAe1sqUvIefLUtJRW/XRnRkFcE9IVAHmJ2FkeGSGe/btnH+1EW8Ln3ehGYDuLJsMmJqNTQ3iVoZUEEULONkGSQgyTk/aPYDKcF11SSD2+A3AV6v0sGGEAwOIbfCBmjGkcSztAw6c0EWqZI981tfMXOr1Npl6Tk+PNKzZHt1Ew22G8qza09wJT3rsTUiWE/3VjkN883PJ0qS31NJtuWHDk0gu4jDMw17BnrGpF/0pviPcCd4HHk99mBEa9ehbGfmMg+VoSYkGCq8/Pxx+c2Zkq6rhvpsXgmllXDfnLNNRJP9GftAuEOtzicmBJHcd4cKB9uQsw/yrlTm7Ydhs="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC guard1() {
		Location loc = new Location(Bukkit.getWorld("world"), -1115.5, 78, 1267.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "guard1", loc);
		npc.setText("일하기 귀찮은 경비원");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4NTQ0ODY5MTk3NiwKICAicHJvZmlsZUlkIiA6ICIxZGQ4YmU5YTljMDc0OGU4OTZjZjgwNDNjNTMxMWEzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaWdhQ2F0VG95IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyOWJlMzJiMDU5NmQ0MjZiZTU0ZTNjNzc1OGZmOGYxZDQ3MzAyYzk1NGZmMDc3Y2M0ZjZjYjAwNmJhYWJjYzUiCiAgICB9CiAgfQp9"
				, "fUUm8/x/u7XjRlJUYLpqoWDT9UQgkz1L9lV2uMNt9UP1V3Uzf6os+V82FHNOqjtCsjXE36daN5OqBN9ISLcAmrrmfDhj9iJ5EX4GfhGGTcJy55PvYSPGrKclf5y/KXufojMTV29rLpB41NtQ5nEqJZtb01Tgk0df+pVc6gBAh/wXjF2oeIrTfFSU9DcICeJaXKgOTTuyw9xZlImxnPgZuaYkxx1izBECa/bXQuNZMU/fYHvj9moK0osSP5POq7IK7HrRyVjwQG/EpJ5DoKQPpxjl++MmmzBeJ0vjfGFAK6zn5TaE2HD13h7FOdL6IwL886BIdct3DJmAAyA2odXP0F+pM3sdit5Ikx1kWQX+RxE1ntEiWq31oRWuBIkh4CBw0HB1mli9IywCjetJ6XawDnjGcLOH/pB7xthBZ2G5oIfCQpU3Mt5zN3DwqgJKCdzDHkicqA3fHiz3x7QRvdlaceOfKQx0KwaagcZFC7Z7knInq7R8MlH5ZKTveiDpJ4sHiQGYcdL7t+XpWaZ6GHSugQPoMPkc80eu6qNJ2xtKETe6ataiLzv/oLv0uOd/qTOPxYwMkyVwNzhOaSy7tVPUAVhLMYmoiAXv4RoQxsfE2MbQ604HuKVogG/0wJMoUqqlEk1/7NRWnBl4K/F8NJP2ffTq4AoNP5327c1RBFz6mVQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.CUT_SANDSTONE));
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC guard2() {
		Location loc = new Location(Bukkit.getWorld("world"), -1108.5, 78, 1267.5, 180, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "guard2", loc);
		npc.setText("뒷골목 출신 경비원");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4NTQ0ODY5MTk3NiwKICAicHJvZmlsZUlkIiA6ICIxZGQ4YmU5YTljMDc0OGU4OTZjZjgwNDNjNTMxMWEzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaWdhQ2F0VG95IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyOWJlMzJiMDU5NmQ0MjZiZTU0ZTNjNzc1OGZmOGYxZDQ3MzAyYzk1NGZmMDc3Y2M0ZjZjYjAwNmJhYWJjYzUiCiAgICB9CiAgfQp9"
				, "fUUm8/x/u7XjRlJUYLpqoWDT9UQgkz1L9lV2uMNt9UP1V3Uzf6os+V82FHNOqjtCsjXE36daN5OqBN9ISLcAmrrmfDhj9iJ5EX4GfhGGTcJy55PvYSPGrKclf5y/KXufojMTV29rLpB41NtQ5nEqJZtb01Tgk0df+pVc6gBAh/wXjF2oeIrTfFSU9DcICeJaXKgOTTuyw9xZlImxnPgZuaYkxx1izBECa/bXQuNZMU/fYHvj9moK0osSP5POq7IK7HrRyVjwQG/EpJ5DoKQPpxjl++MmmzBeJ0vjfGFAK6zn5TaE2HD13h7FOdL6IwL886BIdct3DJmAAyA2odXP0F+pM3sdit5Ikx1kWQX+RxE1ntEiWq31oRWuBIkh4CBw0HB1mli9IywCjetJ6XawDnjGcLOH/pB7xthBZ2G5oIfCQpU3Mt5zN3DwqgJKCdzDHkicqA3fHiz3x7QRvdlaceOfKQx0KwaagcZFC7Z7knInq7R8MlH5ZKTveiDpJ4sHiQGYcdL7t+XpWaZ6GHSugQPoMPkc80eu6qNJ2xtKETe6ataiLzv/oLv0uOd/qTOPxYwMkyVwNzhOaSy7tVPUAVhLMYmoiAXv4RoQxsfE2MbQ604HuKVogG/0wJMoUqqlEk1/7NRWnBl4K/F8NJP2ffTq4AoNP5327c1RBFz6mVQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.CUT_SANDSTONE));
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC guard3() {
		Location loc = new Location(Bukkit.getWorld("world"), -1018.5, 80, 1345.5, 0, 0);
		
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "guard3", loc);
		npc.setText("심심한 경비원");
		npc.setSkin("ewogICJ0aW1lc3RhbXAiIDogMTY4NTQ0ODY5MTk3NiwKICAicHJvZmlsZUlkIiA6ICIxZGQ4YmU5YTljMDc0OGU4OTZjZjgwNDNjNTMxMWEzNCIsCiAgInByb2ZpbGVOYW1lIiA6ICJHaWdhQ2F0VG95IiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2IyOWJlMzJiMDU5NmQ0MjZiZTU0ZTNjNzc1OGZmOGYxZDQ3MzAyYzk1NGZmMDc3Y2M0ZjZjYjAwNmJhYWJjYzUiCiAgICB9CiAgfQp9"
				, "fUUm8/x/u7XjRlJUYLpqoWDT9UQgkz1L9lV2uMNt9UP1V3Uzf6os+V82FHNOqjtCsjXE36daN5OqBN9ISLcAmrrmfDhj9iJ5EX4GfhGGTcJy55PvYSPGrKclf5y/KXufojMTV29rLpB41NtQ5nEqJZtb01Tgk0df+pVc6gBAh/wXjF2oeIrTfFSU9DcICeJaXKgOTTuyw9xZlImxnPgZuaYkxx1izBECa/bXQuNZMU/fYHvj9moK0osSP5POq7IK7HrRyVjwQG/EpJ5DoKQPpxjl++MmmzBeJ0vjfGFAK6zn5TaE2HD13h7FOdL6IwL886BIdct3DJmAAyA2odXP0F+pM3sdit5Ikx1kWQX+RxE1ntEiWq31oRWuBIkh4CBw0HB1mli9IywCjetJ6XawDnjGcLOH/pB7xthBZ2G5oIfCQpU3Mt5zN3DwqgJKCdzDHkicqA3fHiz3x7QRvdlaceOfKQx0KwaagcZFC7Z7knInq7R8MlH5ZKTveiDpJ4sHiQGYcdL7t+XpWaZ6GHSugQPoMPkc80eu6qNJ2xtKETe6ataiLzv/oLv0uOd/qTOPxYwMkyVwNzhOaSy7tVPUAVhLMYmoiAXv4RoQxsfE2MbQ604HuKVogG/0wJMoUqqlEk1/7NRWnBl4K/F8NJP2ffTq4AoNP5327c1RBFz6mVQ="
				);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.CUT_SANDSTONE));
		npc.show(); 
		npc.update();
		
		return npc;
	}
	
	public NPC why9196() {
		Location loc = new Location(Bukkit.getWorld("world"), -1850.5, 70, 3027.5, 180, 0);
		NPC.Global npc = NPCLib.getInstance().generateGlobalNPC(NPCLib.getInstance().getRegisteredPlugins().get(0), "why9196", loc);
		String[] name = getSkin("why9196");
		npc.setText("다른 차원의 세계를 구한 영웅");
		npc.setSkin(name[0], name[1]);
		npc.setCollidable(false);
		npc.setGazeTrackingType(GazeTrackingType.PLAYER);
		npc.setShowOnTabList(false);
		npc.setItem(Slot.MAINHAND, new ItemStack(Material.JUNGLE_LOG));
		npc.setItem(Slot.HEAD, new ItemStack(Material.NETHERITE_HELMET));
		npc.setItem(Slot.CHEST, new ItemStack(Material.NETHERITE_CHESTPLATE));
		npc.setItem(Slot.LEGS, new ItemStack(Material.NETHERITE_LEGGINGS));
		npc.setItem(Slot.FEET, new ItemStack(Material.NETHERITE_BOOTS));
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
		
		List<Location> list = new ArrayList<>();
		list.add(loc);
		list.add(loc.clone().add(2,0,0));
		list.add(loc.clone().add(-2,0,0));
		list.add(loc.clone().add(-2,0,-2));
		list.add(loc.clone().add(-2,0,2));
		npc.setRepetitivePath(list);

		
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
