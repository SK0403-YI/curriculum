package check1;

public interface Main {
	
	public static void main(String[] args) {
	
	/*
	 * 頭文字だけが大文字で出力されるプログラムを作成しなさい。
	 */
	
	String mozi = "goodmorning";
	
	//1変数を3つ作成してください。作成した変数は、頭文字用、文字用、回答用の変数としてください。
	//頭文字
	String kasiramoji;
	
	//文字
	String mojimoji;
	
	//回答用
	String kaitouyou;
	
	//2mojiから最初の一文字を抜き出して頭文字変数に格納する。
	//格納した文字は大文字に変換する。
	kasiramoji = mozi.substring(0,1);
	kasiramoji = kasiramoji.toUpperCase();
	//3mojiから最初以外の文字を抜き出して文字変数に変換する。
	mojimoji = mozi.substring(1,11);
	//4頭文字と文字を回答用文字列に格納する。
	kaitouyou = (kasiramoji + mojimoji);
	System.out.println(kaitouyou);
	
	}
	

}
