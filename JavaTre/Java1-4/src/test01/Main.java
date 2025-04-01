package test01;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("注文の多い料理店");
		list.add("銀河鉄道の夜");
		list.add("風の又三郎");
		list.add("雨にも負けず");
		list.add("雲とナメクジと狸");
		
		int book = list.size();
		System.out.println("現在の本の所持数は" + book + "冊です");
		
		System.out.println("最初の本は" + list.get(0) + "です");
		System.out.println("2冊目の本は" + list.get(1) + "です");
		
		list.add("氷と後光");
		list.add("こゝろの影を恐るなと");
		list.add("さるのこしかけ");

		//見やすいように何も入っていないSystem.out.println()を入れる。
		System.out.println();
		System.out.println("新しく本が追加されました");
		
		//今入っているリストの数を確認する。
		book = list.size();
		System.out.println("現在の本の所持数は"+ book +"冊です");

		//追加された本があるか確認する。
		System.out.println("追加された1冊目は" + list.get(5) + "です");
		System.out.println("2冊目の本は" + list.get(6) + "です");
		System.out.println("3冊目の本は" + list.get(7) + "です");
	}
	
	

}
