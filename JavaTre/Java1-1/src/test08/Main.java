package test08;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 1,変換が不可能な値を無理やり入れるパターン
		 */
		String dataString = "1000";
		
		int dataInt = 0;
		
		//文字列は数字として取り扱うことができないため、
		//実行しようとするとエラーになります。
		dataInt = Integer.parseInt(dataString);
		
		System.out.println(dataInt+":"+dataString);
		
		
	}

}
