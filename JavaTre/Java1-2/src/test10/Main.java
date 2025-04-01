package test10;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("攻撃！");
		
		int hit = new java.util.Random().nextInt() +1;
		
		switch(hit) {
		case 10:
		case 9:
		case 8:
			System.out.println("急所にあたった！");
			break;
		case 7:
		case 6:
		case 5:
		case 4:
			System.out.println("あたった！");
			break;
		case 3:
		case 2:
		case 1:
			System.out.println("あたらなかった・・・");
		default:
			break;
		}
	}

}
