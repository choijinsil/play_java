package com.encore.Ex0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseTest {
	public static void main(String[] args) throws IOException {
		System.out.print("원하는 달: ");
		// 달 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		String month = null;

		// 입력을 받은 후 시간을 잼
		long startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			switch (input) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
			default:
				month = "unknown";
				break;
			} // switch문 종료
		} // for문 종료

		System.out.println(month);

		// 작업 종료 시간
		long finalTime = System.nanoTime();

		// 걸린시간
		long time = finalTime - startTime;

		System.out.println("걸린 시간: " + time + " 나노초");
	}
}
