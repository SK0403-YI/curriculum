package test10;

public class Main {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			if( i != 3) {
				System.out.println(i);
				continue;
			}
			System.out.println("finish");
			break;
		}
	}
}