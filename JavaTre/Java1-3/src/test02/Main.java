package test02;

public class Main{
	
	public static void main(String[] args) {
		//各科目を入れるための配列
		int[] scores;
		
		//配列を宣言
		//この状態だと、21個の箱を入れる、という意味になる。
		scores = new int[21];
		
		//配列の数を確認する
		System.out.println("現在の配列数は"+ scores.length + "です");
		
		//以下の科目の点数を入れてみる。
		//科目[61]_現代文
		scores[0] = 61;
		
		//科目[43]_古文
		scores[1] = 43;
		
		//科目[90]_数学A
		scores[2] = 90;
		
		//科目[85]＿数学Ⅰ
		scores[3] = 85;
		
		//科目[60]_英語
		scores[4] = 60;
		
		//科目[70] = コミュニケーション学
		scores[5] = 70;
		
		//科目[20]_生物
		scores[6] = 20;
		
		//科目[80]_科学
		scores[7] = 80;
		
		//科目[10] _世界史
		scores[8] = 10;
		
		//科目[5] _日本史
		scores[9] = 5;
		
		//科目[4] _社会学
		scores[10] = 4;
		
		//科目[14]_経済学
		scores[11] = 14;
		
		//科目[80] _クラッシック音楽
		scores[12] = 80;
		
		//科目[76]_軽音楽
		scores[13] = 76;
		
		//科目[47]_雅楽
		scores[14] = 47;
		
		//科目[31]_書道
		scores[15] = 31;
		
		//科目[96] _美術
		scores[16] = 96;
		
		//科目[3] _体育
		scores[17] = 3;
		
		//科目[61] _保険
		scores[18] = 61;
		
		//科目[86]_コンピューター学
		scores[19] = 86;
		
		//科目[100] _Java
		scores[20] = 100;
		
		//合計を出してみる。（計算パターン1
		int sumA = scores[0] + scores[1] + scores[2] + scores[3] + scores[4]+ scores[5] + scores[6] + scores[7]
				+ scores[8] + scores[9] + scores[10] + scores[11] + scores[12] + scores[13] + scores[14] + scores[15]
				+ scores[16] + scores[17] + scores[18] + scores[19] + scores[20];
		System.out.println("パターン1：合計は" + sumA);
		
		//平均を出してみる。（計算パターン１
		int avgA = sumA / 21;
		System.out.println("パターン１：平均は" + avgA);
		
		//配列の合計を一気に出してみる。（計算パターン２
		int sumB = java.util.stream.IntStream.of(scores).sum();
		System.out.println("パターン２：合計は" + sumB);
		
		//配列の平均を一気に出してみる。（計算パターン２
		int avgB = sumB / scores.length;
		System.out.println("パターン２：平均は" + avgB);
		
		
		
	}
}