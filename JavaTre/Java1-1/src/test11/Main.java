package test11;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * パターン１、通常の文字列をそのまま出力してみる。
		 */
		String test1 = "test";
		
		System.out.println("パターン1:" + test1);
		
		/*
		 * パターン2、出力時に文字に対して大文字で出力する。
		 */
		String test2 = "test";
		
		System.out.println("パターン2:" + test2.toUpperCase());
		
		/*
		 * パターン３、出力前に文字に対して大文字の処理を入れる。
		 */
		String test3 = "test";
		
		test3.toUpperCase();
		
		System.out.println("パターン３:" + test3);
		
		/*
		 * パターン４、変換した文字を変数に入れて出力する。
		 */
		String test4 = "test";
		
		test4 = test4.toUpperCase();
		
		System.out.println("パターン４:" + test4);
		
	}

}
