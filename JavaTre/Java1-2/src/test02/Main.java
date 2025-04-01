package test02;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 数字をいろんな方法で比較してみる
		 */
		
		int a = 3;
		int b = 3;
		int c = 4;
		
		//パターン1
		System.out.println("pattern:a==b");
		if(a==b) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
		}
		
		//パターン２
		System.out.println("pattern:a!=b");
		if(a != b) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
		}
		
		//パターン３
		System.out.println("pattern:a>c");
		if(a>c) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
			
		}
		
		//パターン４
		System.out.println("pattern:a<c");
		if(a<c) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
		}
		
		//パターン５
		System.out.println("pattern:a>=b");
		if(a>=b) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
			
		}
		
		//パターン６
		System.out.println("pattern:a>=c");
		if(a>=c) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
			
		}
		
		//パターン７
		System.out.println("pattern:a<=b");
		if(a<=b) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
			
		}
		
		//パターン８
		System.out.println("pattern:a<=c");
		if(a<=c) {
			System.out.println("結果:TRUE");
		}else {
			System.out.println("結果:FALSE");
		}
		
		
		
	}

}
