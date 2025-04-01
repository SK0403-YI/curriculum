package test04;

public class Main {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b =　15;
		if (a<=b) {
			System.out.println("OK");
			
		}else {
			System.out.println("NG");
		}
		
		int a = 4;
		int b = 4;
		if(a>b) {
			System.out.println("OK");
		}
		
		String s = "hello world";
		String s2 = "hello";
		if(s == s2) {
			System.out.println("OK");
			
		}else {
			System.out.println("NG");
			
		}
		String s = "hello world";
		String s2 = "hello";
		if (s.contains(s2)) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
	}

}
