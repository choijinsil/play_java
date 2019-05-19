package com.siri;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfYear2 {

	int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년일때
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년일
	};

	int isLeap2(int year) {
		// 삼항연산자: (조건식)? A : B
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}

	int isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1;
		}
		return 0;
	}

	int dayOfYear(int y, int m, int d) {
		// isLeap 호출 , 윤년이면 1헹 호출
		int leap = isLeap(y);
		int sum = d; // 누적되는 날 표현
		for (int i = 0; i < m - 1; i++) {
			sum += mdays[leap][i];
		}

		return sum;
	}

	// 배열을 사용하지 않았음...
	public static void main(String[] args) {
		System.out.println("그 해 경과일수를 구합니다.");
		Scanner sc = new Scanner(System.in);
		DayOfYear2 doy2 = new DayOfYear2();

		int retry;
		do {
			System.out.print("년: ");
			int y = sc.nextInt();
			System.out.print("월: ");
			int m = sc.nextInt();
			System.out.print("일: ");
			int d = sc.nextInt();

			System.out.println("그해 " + doy2.dayOfYear(y, m, d) + "일째입니다.");
			System.out.println("한번 더 할까요? (1.예/0.아니오): ");
			retry = sc.nextInt();

		} while (retry == 1);
	}
}
