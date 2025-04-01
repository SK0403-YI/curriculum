package test05;

public class Main {
	public static void main(String[] args) {

		/*
		 * 10回まで繰り返す処理を5回で中断してみる。
		 */
		
		//処理開始
		System.out.println("処理開始");

		int i = 0;
		
		//while確認
		while(i <= 10) {
			System.out.println(i+ "回目");
			
			//iが5になった時だけ実行される条件文
			if(i == 5) {
				System.out.println("処理上限に達しました。");
				System.out.println("処理を中断します。");
				
				//breakをすることで、whileで実行されているループ処理を強制的にやめさせることができる。
				//i++は実行されない。
				break;
			}
			i++;
		}
		//完全に処理が終わったら出力される。
		System.out.println("処理終了");
			
		/*
		 * iが20になるまで繰り返す処理、3の倍数の時だけ挙動を変えてみる。
		 */
		
		//処理開始
		System.out.println("処理開始");
		
		i=1;

		//while確認
		while(i <= 10) {
			System.out.println(i+ "回目");
			i++;
			//iが5になった時だけ実行される条件文
			if((i % 5)==0) {
				System.out.println("次は5の倍数です。");
				//continueをすることで、i++は実行されないまま、
				//次のループに入る
				continue;
			}
			System.out.println("次は普通の数字です");
		}
	}

}
