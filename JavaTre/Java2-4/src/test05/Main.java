package test05;

import java.util.Scanner;

import test05.Sub;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			Sub.subA();
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			Sub.subB();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			subC();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void subC() throws Exception{
		System.out.println("同じクラスでthrowしても動きは同じです");
		throw new Exception("subCが実行されています");
		
	}

}
