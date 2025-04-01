package test03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	//スコープ1
	//Mainクラス配下の一つ目の｛｝内に変数を入れてみます。
	public static List<String> allList = new ArrayList<String>();
	
	public static void main(String[] args) {
		//スコープ1の｛｝の範囲に含まれているので変数を使えます。
		allList.add("こんにちは");
		
		//スコープ２
		//Mainクラス配下の｛｝内、さらにmainメソッド内の｛｝で２つ囲われています。
		//この変数はmainメソッドでのみ使うことができます。
		int x = 30;
		int y = 20;
		System.out.println(x + y);
		
	}
	
	public static void Sub() {
		//スコープ1の｛｝の範囲に含まれているので変数を使えます。
		allList.add("どーもどーも");
		
		//スコープ２
		//Mainクラス配下の{}内、更にmainメソッド内の｛｝で２つ囲われています。
		//この変数はSubメソッドでのみ使うことができます。
		int x = 30;
		int y = 20;
		System.out.println(x + y);
	}
	
	public static void Stay() {
		//スコープ1の｛｝の範囲に含まれているので変数を使えます。
		allList.add("滞在します");
	}
	
	public static void Test() {
		//スコープ２
		int a =0;
		if(a == 0) {
			//スコープ3
			int b = 0;
			if(a == 0 && b ==0) {
				//スコープ４
				int c = 0;
				if(a == 0 && b == 0 && c == 0) {
					//スコープ５
					int d = 0;
					System.out.println(d);
					/*
					 * スコープは基本的に{}の数だけ奥に奥に範囲が狭まってきます。
					 * {}より内側であれば変数はずっと使えるので、この処理のように
					 * 何重にも処理が重なったとしても問題なく変数として使えます。
					 * ただし、最初に「a」のint型を宣言しているので、
					 * int bやint cの場所に再度int aを宣言することはできません。
					 */
				}
			}
		}
	}
	
	public static void Loop() {
		for(int i = 0;i <9;i++) {
			//int iはこのforの｛｝中では使用することができます。
		}
		//下行にある「i = 10;」のコメントを外すとコンパイルエラーが起こせます。
		//{}の外側で値を使おうとすると変数は外側の｛｝には存在しないためエラーになります。
		
		//i = 10;
	}
}