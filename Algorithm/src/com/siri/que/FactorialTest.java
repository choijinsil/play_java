package com.siri.que;

import java.util.Scanner;

public class FactorialTest {

	int factorial(int n) {
		if (n > 0) {
			
			return n * factorial(n - 1); // 재귀호출
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1 이상의 정수를 입력하세요. :");

		FactorialTest ft = new FactorialTest();
		System.out.println("n의 팩토리얼 값은" + ft.factorial(scan.nextInt()));
	}

}
