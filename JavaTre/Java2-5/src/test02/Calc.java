package test02;

public class Calc {
	public int tasizan(int a, int b) {
		return a + b;
	}
	public int hikizan(int a, int b) {
		return a - b;
	}
	public int kakezan(int a, int b) {
		return a * b;
	}
	public int warizan(int a, int b) {
		return a / b;
	}
	
	public int warizanB(int a,int b) {
		try {
			return a / b;
		}catch(ArithmeticException e) {
			return 0;
		}
	}

}
