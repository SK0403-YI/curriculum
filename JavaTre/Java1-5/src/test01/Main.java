package test01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("実験1");
		
		LocalDate date = LocalDate.now();
		System.out.println("年月日" + date);
		
		System.out.println();
		
		System.out.println("実験2");
		
		date = LocalDate.of(2050, 12, 25);
		System.out.println("年月日" + date);
		
		System.out.println();
		
		System.out.println("実験3");
		
		date = LocalDate.of(2050, Month.JULY, 25);
		System.out.println("年月日" + date);
		
		System.out.println();
		
		System.out.println("1月:" + Month.JANUARY);
		System.out.println("1月:" + Month.JANUARY.getValue());
		
		System.out.println();
		
		System.out.println("実験4");

		//今の時間を再取得してdateに格納
		date = LocalDate.now();
		
		//年を取得する。
		int year = date.getYear();
		
		//int型の月を取得する。
		int month = date.getMonthValue();
		
		//Month型の月を取得する。
		Month monthEn = date.getMonth();
		
		//String型で月を取得する事も可能。
		String monthEnString = date.getMonth().toString();
		
		//日を取得する。
		int day = date.getDayOfMonth();
		
		//曜日を取得する。（曜日はDayOfWeekで取得可能）
		DayOfWeek week = date.getDayOfWeek();
		
		//String型で月を取得することも可能
		String weekString = date.getDayOfWeek().toString();

		System.out.println(" 年          ：" + year);
		System.out.println(" 月(int)     ：" + month);
		System.out.println(" 月(Month)   ：" + monthEn);
		System.out.println(" 月(String)  ：" + monthEnString);
		System.out.println(" 日          ：" + day);
		System.out.println(" 曜日        ：" + week);
		System.out.println(" 曜日(String)：" + weekString);
		
		System.out.println();
		
		/*
		 * 実験5、存在しない日を入れようとしてみる
		 */
		System.out.println("実験5");

		//存在しない日をdateに格納
		date = LocalDate.of(2025, 2, 29);
		//処理しようとすると失敗する。
		System.out.println(" 年月日" + date);
		
		
	}
}
