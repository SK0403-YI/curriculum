package test04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Human implements HumanInterface{
	private String name;
	private int hp;
	private int mp;
	private int[] saveData;
	private List<String>list;
	private Map<String, Integer>weapon;
	private Map<String,Integer> guard;
	
	public Human() {
		this.name = "勇者";
		this.hp = 100;
		this.mp = 10;
		
	}
	public Human(String name,int hp,int mp) {
		this.name = "勇者";
		this.hp = hp;
		this.mp = mp;
	}
	public void save() {
		this.saveData = new int[4];
		this.saveData[0] = 12468912;
		this.saveData[1] = 12246;
		this.saveData[2] = 9744311;
		this.saveData[3] = 346714689;
		
	}
	public void haveItem() {
		this.list = new ArrayList<String>();
		this.list.add("きのこ");
		this.list.add("雑草");
		this.list.add("石ころ");
	}
	
	public void weapon() {
		this.weapon = new HashMap<String,Integer>();
		this.weapon.put("ひのきの棒",5);
		this.weapon.put("お土産の木刀",6);
		this.weapon.put("ハンドスピナー", 2);
		this.weapon.put("水鉄砲", 1);
	}
	
	public void haveGuard() {
		guard = new LinkedHashMap<String,Integer>();
		this.guard.put("木の盾", 5);
		this.guard.put("あああああ", 6);
		this.guard.put("お鍋のふた", 2);
		this.guard.put("画用紙", 1);
	}
	
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public int[] getSavedata() {
		return this.saveData;
	}
	public List<String> getList() {
		return this.list;
	}
	public Map<String,Integer> getWeapon() {
		return this.weapon;
	}
	public Map<String,Integer> getGuard() {
		return this.guard;
	}
}

