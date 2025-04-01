package test07;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 小さい値から大きな値への変換
		 */
		//byte型
		byte dataByte = 15;
		
		//int型
		int answerInt;
		
		//int型はbyte型よりも大きいため、値をそのまま入れることができます。
		answerInt = dataByte;
		
		System.out.println(answerInt);
		
		/*
		 * 他の方での変換（cast版）
		 */
		//int型
		int dataInt = 15;
		
		//byte型
		byte answerByte;
		
		//値の前に（byte）を入れることで値をbyte型の値として扱うことができます。
		answerByte = (byte)dataInt;
		
		System.out.println(answerByte);
		
	}

}
