package com.siri;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfYear {

	int[][] mdays= {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	
	public static int isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1;
		}
		return 0;
	}
	
	public int dayOfYear(int y, int m, int d) {
		//isLeap 호출 , 윤년이면 1헹 호출
		
		return 0;
	}
	// 배열을 사용하지 않았음...
	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("그 해 경과 일수를 구합니다.");
			System.out.print("년: ");
			int year = sc.nextInt();

			System.out.print("월: ");
			int month = sc.nextInt();

			System.out.print("일: ");
			int day = sc.nextInt();

			// 월의 1월 1일
			Calendar toDay = Calendar.getInstance(); // 오늘날짜
			Calendar yDay = Calendar.getInstance(); // 지난 날짜

			yDay.set(year, 1, 1); // 지난날짜 년도만 세팅
			toDay.set(year, month, day); // 현재날짜 세팅

			// 월 차이 계산
			long sec = (toDay.getTimeInMillis() - yDay.getTimeInMillis()) / 1000;
			long secToDay = sec / (60 * 60 * 24);
			isLeap(year);
			
			if(isLeap(year)==1) {
				System.out.println(year+" 년은 윤년입니다.");
			}else {
				System.out.println(year+" 년은 평년입니다.");
			}
			
			System.out.println("그 해 " + secToDay + "일째 입니다.");
			System.out.println();

			System.out.println("한번 더 할까요? (1. 예 / 0. 아니오) :");

			int conti = sc.nextInt();
			if (conti == 0) {
				break;
			}
			System.out.println();
		}
	}
}
