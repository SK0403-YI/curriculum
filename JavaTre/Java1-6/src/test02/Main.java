package test02;

public class Main {
	public static void main(String[] args) {
		
		int rainProbability = new java.util.Random().nextInt(101);
		
		while(rainProbability>5) {
			System.out.println("今日の降水確率は"+rainProbability+"だから外に出ない");
			rainProbability=new java.util.Random().nextInt(101);
		}
		
		System.out.println("今日の降水確率は"+rainProbability+"だ！");
		System.out.println("出かけるぞ！");
	}

}
