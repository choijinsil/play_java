package com.encore.j0415;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest {
	public static void main(String[] args) throws IOException {
		System.out.print("원하는 달 : ");
		// 달 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		String month = null; 
		
		// 입력을 받은 후 시간을 잼
		long startTime = System.nanoTime(); 

		for (int i = 0; i < 10000; i++) {
			if (input == 1)
				month = "January";
			else if (input == 2)
				month = "February";
			else if (input == 3)
				month = "March";
			else if (input == 4)
				month = "April";
			else if (input == 5)
				month = "May";
			else if (input == 6)
				month = "June";
			else if (input == 7)
				month = "July";
			else if (input == 8)
				month = "August";
			else if (input == 9)
				month = "September";
			else if (input == 10)
				month = "October";
			else if (input == 11)
				month = "November";
			else if (input == 12)
				month = "December";
		} // for문 종료
		
		System.out.println(month);
		
		// 작업 종료 시간
		long finalTime = System.nanoTime(); 

		// 걸린시간
		long time = finalTime - startTime; 

		System.out.println("걸린 시간: " + time + " 나노초");
	}

}
