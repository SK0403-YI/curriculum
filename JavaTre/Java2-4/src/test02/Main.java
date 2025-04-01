package test02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);

		System.out.println("FileReader or FileWriter?");
		System.out.println("FR : 1 , FW : 2");
		String choice = sc.nextLine();

		if (choice.equals("1")) {
			//ファイルの読み取りメソッドを呼び出す
			fileReader();
		} else if (choice.equals("2")) {
			System.out.println("Whats Write?");
			String input = sc.nextLine();
			//ファイルの書き取りメソッドを呼び出す
			fileWriter(input);
		}
		sc.close();

	}

	//ファイルの読み取りを行うメソッド
	public static void fileReader() {
		System.out.println("fileReader処理開始");		
		//Exceptionが発生する可能性がある処理をtryで囲む
		try {
			FileReader fr = new FileReader("./src/test02/data.txt");
			int input = fr.read();
			while (input != -1) {
				System.out.print((char) input);
				input = fr.read();
			}
			System.out.println();
			fr.close();

		} catch (IOException e) {
			System.out.println("エラーをキャッチしました\r\n");
			//Exceptionの名称を出力する時はe.getClass()で出力ができる
			System.out.println("発生したエラーは"+e.getClass()+"です");
			
			//エラーメッセージを出力する時はe.getMessage()で出力ができる
			System.out.println("エラーメッセージを表示します\r\n"+e.getMessage());
			
			//e.printStackTrace()でエラーを全て出力できる。
			System.out.println("トレースメッセージを出力します。");
			e.printStackTrace();
			System.out.println();
		}
		System.out.println("fileReader処理完了");
	}

	//ファイルの書き込みを行うメソッド
	public static void fileWriter(String input) {
		System.out.println("fileReader処理開始");		
		try {
			FileWriter fw = new FileWriter("./src/test02/data.txt");
			fw.write(input);
			fw.close();
		} catch (Exception e) {
			System.out.println("エラーをキャッチしました\r\n");
			//Exceptionの名称を出力する時はe.getClass()で出力ができる
			System.out.println("発生したエラーは"+e.getClass()+"です");
			
			//エラーメッセージを出力する時はe.getMessage()で出力ができる
			System.out.println("エラーメッセージを表示します\r\n"+e.getMessage());
			
			//e.printStackTrace()でエラーを全て出力できる。
			System.out.println("トレースメッセージを出力します。");
			e.printStackTrace();
			System.out.println();
		}
		System.out.println("fileReader処理完了");
	}
}
