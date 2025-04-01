package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println("実験パターン1回目");
			String s = sc.nextLine();
			int a = Integer.parseInt(s);
			System.out.println("OK");
			
			System.out.println("実験パターン2回目");
			
			int b = sc.nextInt();
			System.out.println(a+b);
			System.out.println("OK");
			
		}catch(NumberFormatException e) {
			System.out.println("実験パターン１で失敗");
		}catch(InputMismatchException e) {
			System.out.println("実験パターン２で失敗");
		}finally {
			sc.close();
		}
	}

}
