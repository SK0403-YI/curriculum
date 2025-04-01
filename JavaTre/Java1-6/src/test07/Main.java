package test07;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * 最も基本的なfor文
		 */
		System.out.println("基本形実行");
		for(int i = 0; i < 10; i++) {
			System.out.println("処理:" + i);
		}
		System.out.println("基本形終了");
		
		/*
		 * パターン1,ループ変数を1からスタートする。
		 */
		System.out.println("パターン1実行");
		for (int a = 1; a < 10; a++) {
			System.out.println("処理:" + a);
		}
		System.out.println("パターン1終了");

		/*
		 * パターン2,ループ変数を1から2ずつスタートする。
		 */
		System.out.println("パターン2実行");
		for (int b = 1; b < 10; b+=2) {
			System.out.println("処理:" + b);
		}
		System.out.println("パターン2終了");

		/*
		 * パターン3,ループ変数を10から1ずつ減らしていく。
		 */
		System.out.println("パターン3実行");
		for (int c = 10; c > 0; c--) {
			System.out.println("処理:" + c);

		}
		System.out.println("パターン3終了");

		/*
		 * パターン4,ループ変数を初期化しない。
		 */
		System.out.println("パターン4実行");
		int d = 0;
		for (; d < 10; d++) {
			System.out.println("処理:" + d);

		}
		System.out.println("パターン4終了");

		/*
		 * パターン5,繰り返し時の初期化処理を行わない。
		 */
		System.out.println("パターン5実行");
		for (int e = 1; e < 10;) {
			System.out.println("処理:" + e);
			e++;

		}
		System.out.println("パターン5終了");
	}

}
