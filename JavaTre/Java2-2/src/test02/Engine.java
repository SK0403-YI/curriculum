package test02;

public class Engine {
	//エンジン種類
		public String driveSystem = "4サイクルエンジン";
		//部品数
		public int parts = 128;
		//現在の排気量(cc)
		public int requiredGas = 0;
		//最大排気量(cc)
		final public int MaxrequiredGas = 360;
		//エンジン名称
		public String engineName = "TanakaDX";
		//エンジンの製品番号
		public String productNo = "原型";
		//エンジン起動状態
		boolean condition = false;
		//初期化済みチェック
		boolean initializate = false;

		//手動で行う初期化メソッド
		public void initialization(String tmpProductNo) {
			//初期化を実行
			productNo = tmpProductNo;
			requiredGas = 0;
			condition = false;
			//初期化が完了したのでフラグをtrueに変更
			initializate = true;

			System.out.println(engineName + productNo + "のエンジンを初期化");
		}

		/*
		 * エンジンを起動するメソッド
		 */
		public void run() {
			
			//エンジンが初期化済みか確認
			//初期化されている場合は起動を試みる
			if (initializate) {
				
				//実際の起動内容
				System.out.println(engineName + productNo + "の");
				System.out.println("エンジンを起動して動かします。");
				int startProbability = new java.util.Random().nextInt(100) + 1;
				if (startProbability >= 5) {
					condition = true;
					System.out.println("エンジンの起動に成功しました。");
					conditionCheck(startProbability);
				} else {
					System.out.println("エンジンの起動に失敗しました");
				}
				
				//エンジンの起動状態を確認
				//起動できている場合は排気ガスを出すように処理する。
				//起動できていない場合は再度起動をかける
				if (condition) {
					requiredGas = MaxrequiredGas;
				} else {
					System.out.println("再度エンジンを起動します。");
					startProbability = new java.util.Random().nextInt(100) + 1;
					if (startProbability >= 5) {
						condition = true;
						requiredGas = MaxrequiredGas;
						System.out.println("エンジンの起動に成功しました。");
						conditionCheck(startProbability);
					} else {
						System.out.println("エンジンの起動に失敗しました");
					}
				}
			} else {
				//エンジンの初期化がされていない時に実行する処理
				System.out.println("エンジンは初期化されていません。");
				System.out.println("初期化を行ってから起動してください。");
			}

			System.out.println();
		}

		//エンジンの状態を確認するためのメソッド
		public void conditionCheck(int startProbability) {
			if (condition && startProbability >= 90) {
				System.out.println("エンジンは最高の状態で起動しています。");
			} else if (condition && startProbability >= 20) {
				System.out.println("エンジンは良好です。");
			} else if (condition) {
				System.out.println("なんとか起動できました");
			} else if (condition != true) {
				System.out.println("エンジンは稼働していません");
			} else {
				System.out.println("起動時に予期せぬ動作が発生しています");
			}
		}
		//エンジンの状態を確認するためのメソッド
		public void conditionCheck(boolean condition,boolean initializate) {
			System.out.println(engineName + productNo + "の状態を確認します");
			if(initializate && condition ) {
				System.out.println("エンジンは起動済みです。");
			} else if(initializate) {
				System.out.println("エンジンは未起動です");
			} else if(initializate != true) {
				System.out.println("初期化が完了していません");
			}
			System.out.println();
		}

		//エンジンの名称確認メソッド
		public void nameCheck() {
			System.out.println("このエンジンは" + engineName + "です");
			System.out.println("個体番号は" + productNo + "です");
		}

}
