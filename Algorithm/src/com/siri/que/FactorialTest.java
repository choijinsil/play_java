package com.siri.que;

import java.util.Scanner;

public class FactorialTest {

	int factorial(int n) {
		if (n > 0) {
			
			return n * factorial(n - 1); // ���ȣ��
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1 �̻��� ������ �Է��ϼ���. :");

		FactorialTest ft = new FactorialTest();
		System.out.println("n�� ���丮�� ����" + ft.factorial(scan.nextInt()));
	}

}
