package test03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("実験１");
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("時間:" + dateTime);
		
		System.out.println();
		
		System.out.println("実験2-1");
		
		dateTime = LocalDateTime.of(2024, 1, 12, 11, 23);
		System.out.println("時間" + dateTime);
		
		System.out.println();
		
		System.out.println("実験2－4");
		
		LocalDate date = LocalDate.of(2025, 1, 9);
		LocalTime time = LocalTime.of(15, 20);
		dateTime = LocalDateTime.of(date, time);
		System.out.println("時間:"　+ dateTime);
		
		System.out.println("実験2-5");
		
		dateTime = LocalDateTime.of(2025, Month.JULY,9,5,12);
		System.out.println("時間:" + dateTime);
		
		System.out.println();
		
		System.out.println("実験3");
		dateTime = LocalDateTime.now();
		
		int year = dateTime.getYear();
		
		int month = dateTime.getMonthValue();
		
		Month monthEn = dateTime.getMonth();
		
		String monthEnString = dateTime.getMonth().toString();
		
		int day = dateTime.getDayOfMonth();
		
		DayOfWeek week = dateTime.getDayOfWeek();
		
		String weeString = dateTime.getDayOfWeek().toString();
		
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		int nano = dateTime.getNano();
		System.out.println("year    :" + year);
		System.out.println(" month(int)   ：" + month);
		System.out.println(" month(Month) ：" + monthEn);
		System.out.println(" month(String)：" + monthEnString);
		System.out.println(" day          ：" + day);
		System.out.println(" week         ：" + week);
		System.out.println(" week(String) ：" + weekString);
		System.out.println(" hour         ：" + hour);
		System.out.println(" minute       ：" + minute);
		System.out.println(" second       ：" + second);
		System.out.println(" nano         ：" + nano);
		
		System.out.println();
		
		dateTime = LocalDateTime.of(2024, 1,12,11,60);
		System.out.println("時間:" + dateTime);
		
		
		
		
		
	}

}
