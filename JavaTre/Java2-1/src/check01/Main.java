package check01;


public class Main {
	
	//問題１スコープ1にint型の変数xとyを作成してください。
	
	int x;
	int Y;
	
	public static void main(String[] args) {
		
		//問題ン2inputメソッドとcalcメソッドを呼び出してください。
		//calcメソッドには、スコープ1のxトｙを使って処理を呼び出してください。
		
		input();
		calc(10,5);
		
	}
	
	
	


	//問題３スコープ1のｘとｙに値を代入する「いんぷと」メソッドを作成
	//calcメソッド内では、引数をint a,int bとして指定
	//[2a+3b]の計算結果を出力する計算を行ってください
	public static void input() {
		int x = 10;
		int y = 5;
	}
	
	public static void calc(int a,int b) {
		
		System.out.println(2 * a + 3 * b);
		
		
	}
}
