package test01;

public class Calc {
	
	public static void addition(int x, int y) {
		int answer = x + y;
		System.out.println("足し算の結果は・・・");
		System.out.println(answer + "です！");
	}
	
	public static void subtraction(int y,int x) {
		int answer = x-y;
		System.out.println("引き算の結果は・・・");
		System.out.println(answer + "です！");
	}
	
	public static void multiplication(int x, int y) {
		int answer = x * y;
		System.out.println("掛け算の結果は・・・");
		System.out.println(answer + "です！");
	}

	//割り算をするメソッド
	public static void division(int y, int x) {
		int answer = x / y;
		System.out.println("割り算の結果は・・・");
		System.out.println(answer + "です！");
	}

	//文字加工をするメソッド
	public static void characterConversion(String s) {
		String answer = s.trim();
		answer = answer.substring(0, 1).toUpperCase() + answer.substring(1, s.length() - 1).toLowerCase();
		System.out.println("文字を加工した結果・・・");
		System.out.println(answer + "です！");
	}

	//1文字めの言葉だけ別の言葉に置き換えるメソッド
	public static void FirstCharacterConversion(String s, int x) {
		String answer = s.trim();
		char header = (char) x;
		answer = answer.replaceFirst(answer.substring(0, 1), String.valueOf(header));
		System.out.println("文字を加工した結果・・・");
		System.out.println(answer + "です！");
	}

	//配列の中身をまとめて合計を出力するメソッド
	//メソッドに指定する引数はListやMap、配列やクラスを渡す事も可能
	public static void sumArray(int[] arr) {
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		System.out.println("この配列の合計は・・・");
		System.out.println(sum + "です！");
	}

}
