package test05;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		calc();
		calc(2);
		calc(2,2);
		calc(2,2,2);
		calc(2,2,2,2);
		calc(2,2,2,2,2);
		calc(2,2,2,2,2,2);
		calc(2,2,2,2,2,2,2);
		
		int test1 = 1;
		String test2 = "1";
		byte test3 = 1;
		float test4 =1.0f;
		char test5 = '1';
		int[] test6 = {1};
		List<String>test7 = new ArrayList<String>();
		test7.add("1");
		
		print(test7);
		print(test6);
		print(test5);
		print(test4);
		print(test3);
		print(test2);
		print(test1);
		
		//引数の順番がバラバラになっているcalcBメソッドを実行してみる。
		calcB(2,2,2);
		calcB("2",2,2);
		calcB(2,"2",2);
		calcB(2,2,"2");
		calcB("2","2",2);
		calcB("2",2,"2");
		calcB(2,"2","2");
		calcB("2","2","2");

	}
	
	/*
	 * オーバーロードを使って掛け算の引数のバリエーションを増やしてみる
	 */
	//受け取る引数の数が違うためJava上でどのメソッドを使えばいいのかを判断してくれる。
	public static void calc() {
		int ans = 1 *1;
		System.out.println("計算(引数1):"+ans);
	}
	public static void calc(int a) {
		int ans = a *1;
		System.out.println("計算(引数1):"+ans);
	}
	public static void calc(int a,int b) {
		int ans = a *b;
		System.out.println("計算(引数2):"+ans);
	}
	public static void calc(int a,int b,int c) {
		int ans = a *b*c;
		System.out.println("計算(引数3):"+ans);
	}
	public static void calc(int a,int b,int c,int d) {
		int ans = a *b*c*d;
		System.out.println("計算(引数4):"+ans);
	}
	public static void calc(int a,int b,int c,int d,int e) {
		int ans = a *b*c*d*e;
		System.out.println("計算(引数5):"+ans);
	}
	public static void calc(int a,int b,int c,int d,int e,int f) {
		int ans = a *b*c*d*e*f;
		System.out.println("計算(引数6):"+ans);
	}
	public static void calc(int a,int b,int c,int d,int e,int f,int g) {
		System.out.println("計算(引数7)もう計算したくない");
	}
	
	/*
	 * 引数の型を変えたオーバーロード
	 */
	
	//引数の型が違っていてもPCはどのメソッドを使うのか判断ができるため、これもOK
	public static void print(int out) {
		System.out.println("出力1:"+out);
	}
	public static void print(String out) {
		System.out.println("出力2:"+out);
	}
	public static void print(byte out) {
		System.out.println("出力3:"+out);
	}
	public static void print(float out) {
		System.out.println("出力4:"+out);
	}
	public static void print(char out) {
		System.out.println("出力5:"+out);
	}
	public static void print(int[] out) {
		System.out.println("出力6:"+out[0]);
	}
	public static void print(List<String> out) {
		System.out.println("出力7:"+out);
	}
	/*
	 * オーバーロードできないパターン
	 * <>の型は別の型だが、そもそもの型はどちらもList型なので
	 * Java上でどのメソッドを使うか判断ができず、エラーとなる。
	 */
//	public static void print(List<String> out) {
//		System.out.println("出力1:"+out);
//	}
//	public static void print(List<Integer> out) {
//		System.out.println("出力1:"+out);
//	}

	/*
	 * 引数の型順を変えたオーバーロード
	 * ※Integer.parseInt()は文字列を数字に変換する処理
	 */	
	public static void calcB(int a,int b,int c) {
		int ans = a *b*c;
		System.out.println("計算(int    :int    :int    ):"+ans);
	}
	public static void calcB(String a,int b,int c) {
		int ans = Integer.parseInt(a) *b*c;
		System.out.println("計算(String :int    :int    ):"+ans);
	}
	public static void calcB(int a,String b,int c) {
		int ans = a *Integer.parseInt(b)*c;
		System.out.println("計算(int    :String :int    ):"+ans);
	}
	public static void calcB(int a,int b,String c) {
		int ans = a *b*Integer.parseInt(c);
		System.out.println("計算(int    :int    :String ):"+ans);
	}
	public static void calcB(String a,String b,int c) {
		int ans = Integer.parseInt(a)*Integer.parseInt(b)*c;
		System.out.println("計算(String :String :int    ):"+ans);
	}
	public static void calcB(String a,int b,String c) {
		int ans = Integer.parseInt(a)*b*Integer.parseInt(c);
		System.out.println("計算(String :int    :String ):"+ans);
	}
	public static void calcB(int a,String b,String c) {
		int ans = a*Integer.parseInt(b)*Integer.parseInt(c);
		System.out.println("計算(int    :String :String ):"+ans);
	}
	public static void calcB(String a,String b,String c) {
		int ans = Integer.parseInt(a)*Integer.parseInt(b)*Integer.parseInt(c);
		System.out.println("計算(String :String :String ):"+ans);
	
	}

}
