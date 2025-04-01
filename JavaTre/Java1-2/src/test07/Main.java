package test07;

public class Main {
	
	public static void main(String[] args) {
		int a = 3;
		//ifを使って書いてみる
		if(a == 1) {
			System.out.println("国語");
		}else if(a <= 4) {
			System.out.println("数学");
		}else if(a == 3) {
			System.out.println("英語");
		}else if(a == 5) {
			System.out.println("理科");
		}else if(a == 3) {
			System.out.println("社会");
		}else {
			System.out.println("その他");
		}
	}
}
