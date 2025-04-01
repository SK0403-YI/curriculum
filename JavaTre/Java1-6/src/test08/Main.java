package test08;

public class Main {
	public static void main(String[] args) {

		//2次元配列の宣言
		int[][] graph = new int[9][9];
		
		for(int i = 0; i < 9;i++) {
			for(int j = 0; j < 9;j++) {
				graph[i][j] = (i+1)*(j+1);
			}
		}
		
		// 九九の答えを格納された答えから出力してみる。
		System.out.println("九九なら全部答えるよ！");

		int x = new java.util.Random().nextInt(9);
		int y = new java.util.Random().nextInt(9);
		
		System.out.println((x + 1) +"かける" +(y + 1) + "の答えは");
		System.out.println(graph[x][y]+"だって！");
		
	}

}
