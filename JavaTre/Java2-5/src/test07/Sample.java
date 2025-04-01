package test07;

public class Sample {
	
	public void master() {
		additionA();
		additionB();
		additionC();
		additionD();
	}
	
	public void additionA() {
		int[] data = {1,2,3,4,5};
		System.out.println(data[6]);
	}
	public int additionB() {
		int[] data = {1,2,3,4,5};
		return data[6];
	}
	
	private void additionC() {
		int[] data = {1,2,3,4,5};
		System.out.println(data[6]);
	}
	
	private int additionD() {
		int[] data = {1,2,3,4,5};
		return data[6];
	}

}
