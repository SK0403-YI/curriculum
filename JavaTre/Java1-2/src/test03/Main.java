package test03;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 文字列の比較
		 * ※NGなパターン
		 */
		
		String hoge = "Hello";
		String fuga = "Hello";
		hoge +="!";
		fuga +="!";
		
		if(hoge == fuga) {
			System.out.println("hogeとfugaとは等しい");
		}else {
			System.out.println("hogeトhugaは違う");
		}
		
		/*
		 * OKなパターン
		 */
		if(hoge.equals(fuga)) {
			System.out.println("hogeとhugaとは等しい");
		}else {
			System.out.println("hogeとfugaは違う");
			
		}
		
	}

}
