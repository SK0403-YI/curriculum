package test14;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 基本的なsubstringの使い方
		 */
		
		
		String name = "山田太郎";
		//substring()
		//3文字目から左側2文字を切り取って3文字目以降を取得します。
		//なお、最初の一文字目は0です。
		name = name.substring(2);
		System.out.println(name);
		
		/*
		 * よくある使用方法
		 */
		String input = "大事な一言は和";
		String output;
		
		// length()を使って文字数を取得
		int moziLength = input.length();
		//使用されている文字数から最後の一文字（－１）を取得
		output = input.substring(moziLength-1);
		System.out.println(output);
		
				
		
	}

}
