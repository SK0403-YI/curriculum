package test03;


import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		Map<String,Integer>prefs = new HashMap<String,Integer>();
		
		prefs.put("銀河鉄道の夜", 9737);
		prefs.put("注文の多い料理店", 3829);
		prefs.put("風の又三郎", 1542);
		prefs.put("宮沢賢治詩集", 1094);
		prefs.put("セロ弾きのゴージュ", 842);
		
		System.out.println("人気度を確認します");
		
		int popularity = prefs.get("銀河鉄道の夜");
		
		System.out.println(popularity + "いいね");
		
		prefs.replace("銀河鉄道の夜",10524);
		
		System.out.println("人気を確認します");
		
		popularity = prefs.get("銀河鉄道の夜");
		
		System.out.println(popularity + "いいね");
		
		prefs.put("グスコーブドリの伝記", 530);
		prefs.put("よだかの星", 1035);
		
		System.out.println(popularity + "いいね");
		
		//本を削除してみて、消された本が取得できてしまうのかを確認する。
				prefs.remove("グスコーブドリの伝記");
				System.out.println("人気度を確認します。");		
				//存在しないものを検索するとどうなるか
				int popularity2 = prefs.get("グスコーブドリの伝記");
				System.out.println(popularity2 + "いいね");
		
		
		
	}

}
