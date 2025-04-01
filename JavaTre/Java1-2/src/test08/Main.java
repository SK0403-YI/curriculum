package test08;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("今日の勉強科目を決めます");
		int kamoku = new java.util.Random().nextInt(5)+1;
		
		//switch-case文
		switch(kamoku) {
		case 1:
			System.out.println("国語");
			break;
		case 2:
			System.out.println("数学");
			break;
		case 3:
			System.out.println("英語");
			break;
		case 4:
			System.out.println("社会");
			break;
		case 5:
			System.out.println("理科");
			break;
		default:
			System.out.println("メッセージは出ないはずだよ");
			break;
		}tfc
		
	}

}
