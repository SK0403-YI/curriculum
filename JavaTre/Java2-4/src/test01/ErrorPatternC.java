package test01;

public class ErrorPatternC {
	public static void main(String[]args) {
		int x = 3;
		int y = 5;
		int a = calc(x,y);
		System.out.println(x + y + "足し算は"+a);
	}
	private static int calc(int x,int y) {
		x += x + y;
		return x;
	}

}
