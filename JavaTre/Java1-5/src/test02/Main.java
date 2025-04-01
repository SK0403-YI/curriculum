package test02;

import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("実験1");
		
		LocalTime time = LocalTime.now();
		System.out.println();
		
		System.out.println("実験2－1");
		
		/*
		 * 実験2－1　時間の中身を指定（ｈｈ。ｍｍ）
		 */
		
		System.out.println("実験2－1");
		
		time = LocalTime.of(11, 23);
		System.out.println("時間" + time);
		
		System.out.println();
		
		/*
		 * 実験2－2、時間の中身を指定(hh,mm,ss)
		 */
		System.out.println("実験2－2");
		
		time = LocalTime.of(11, 23, 15);
		System.out.println("時間" + time);
		
		System.out.println();
		
		/*
		 * 実験3、時間の各値を取得してみる。
		 */
		System.out.println("実験3");

		//今の時間を再取得してtimeに格納
		time = LocalTime.now();

		//時間を取得する。
		int hour = time.getHour();

		//分を取得する。
		int minute = time.getMinute();

		//秒を取得する。
		int second = time.getSecond();

		//ナノ秒を取得する。
		int nano = time.getNano();

		System.out.println(" hour  ：" + hour);
		System.out.println(" minute：" + minute);
		System.out.println(" second：" + second);
		System.out.println(" nano  ：" + nano);

		System.out.println();

		/*
		 * 実験4、存在しない日を入れようとしてみる
		 */
		System.out.println("実験4");

		//存在しない時間をtimeに格納
		time = LocalTime.of(11, 61, 15, 100051);
		//処理しようとすると失敗する。
		System.out.println("時間:" + time);
	}

}
