package test05;

public class SuperCalc {
	private int x;
	private int y:
		
		public void calc(int ch) {
		switch(ch) {
		case 1:
			addition();
			break;
		case 2:
			Subtraction();
			break;
		case 3:
			Multiplication();
			break;
		case 4:
			Division();
			break;
		}
	}
	
	private int addition() {
		return this.x + this.y;
	}
	
	private int Subtraction() {
		return this.x - this.y;
	}
	
	private int Multiplication() {
		return this.x * this.y;
	}
	
	private int Division() {
		return this.x / this.y;
	}

}
