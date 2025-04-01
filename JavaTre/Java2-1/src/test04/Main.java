package test04;

public class Main {
	
	public static void main(String[] args) {
		int dataA;
		int dataB;
		
		//データ投入メソッド
		dataA = putNumberA();
		dataB = putNumberB();
		
		//取得された値を確認してみる
		System.out.println("dataA" + dataA);
		System.out.println("dataB" + dataB);
		
		//文字列を返り値としてもらう
		String s = putString();
		System.out.println("これは" + s);
		
		int answer;
		
		//値が返却されないメソッドはこの記載ができません
		//answer = calcA(dataA,dataB);
		
		//voidメソッド計算
		calcA(dataA,dataB);
		
		answer = calcB(dataA, dataB);
		System.out.println(answer);
		
		answer = calcC(dataA, dataB);
		System.out.println(answer);
		
		//パターン1応用
		checkAndCalc(0 ,1);
		
	}
	
	//値を返却するメソッド
	//いままで「void」と記載されている個所をintにする。
	public static int putNumberA() {
		System.out.println("値返却処理");
		return 10;
		
	}
	
	//値を返却するメソッド
	//[void]の部分をstringにする。
	public static String putString() {
		return "String文字列です。";
	}
	
	//パターン1、値を返却しない計算メソッドでもreturn
	public static void calcA(int x, int y) {
		System.out.println(x + y);
		return;
	}

	//パターン1の応用(掛け算編)
	public static void checkAndCalc(int x, int y) {
		if (x == 0 || y == 0) {
			System.out.println("計算しても0になるからcheckAndCalcは中断");
			return;
		}
		System.out.println("計算結果" + (x * y));
	}

	//パターン2，計算結果を返却するメソッド
	public static int calcB(int x, int y) {
		int ans = x + y;
		return ans;
	}

	//パターン3，計算結果の返却を簡略化
	public static int calcC(int x, int y) {
		return x + y;
	}
		
	}