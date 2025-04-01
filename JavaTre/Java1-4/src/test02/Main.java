package test02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("注文の多い料理店");
		list.add("銀河鉄道の夜");
		list.add("風の又三郎");
		list.add("雨ニモ負ケズ");
		list.add("蜘蛛とナメクジと狸");
		
		System.out.println("取得した本は" + list.get(2) +"です");
		
		list.set(2, "鹿踊りの始まり");
		
		System.out.println("取得した本は" + list.get(2) + "です");
		
		System.out.println("取得した本は"+ list.get(3) + "です");
		
		list.remove(3);
		
		System.out.println("取得した本は" + list.get(3) + "です");
	}

}
