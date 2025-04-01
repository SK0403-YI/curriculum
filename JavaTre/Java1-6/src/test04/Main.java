package test04;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println("パターン１の場合");
		int i = 0;
		
		do {
			list.add(i*i);
			
			if(i<9) {
				System.out.println(" "+(i+1)+"回目の処理:\t"+list.get(i));
			}else {
				System.out.println((i+1)+"回目の処理:\t"+list.get(i));
			}
			i++;
		}while(i<50);
		
		System.out.println();
		System.out.println("パターン２の場合");
		
		i=0;
		
		do {
			list.add(i*i);
			
			if(i<9) {
				System.out.println(" "+(i+1)+"回目の処理:\t"+list.get(i));
			}else {
				System.out.println((i+1)+"回目の処理:\t"+list.get(i));
			}
			i++;
		}while(i==0);
	}

}
