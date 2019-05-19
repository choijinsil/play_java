package com.siri;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfYear2 {

	int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����϶�
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // ������
	};

	int isLeap2(int year) {
		// ���׿�����: (���ǽ�)? A : B
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0;
	}

	int isLeap(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return 1;
		}
		return 0;
	}

	int dayOfYear(int y, int m, int d) {
		// isLeap ȣ�� , �����̸� 1�� ȣ��
		int leap = isLeap(y);
		int sum = d; // �����Ǵ� �� ǥ��
		for (int i = 0; i < m - 1; i++) {
			sum += mdays[leap][i];
		}

		return sum;
	}

	// �迭�� ������� �ʾ���...
	public static void main(String[] args) {
		System.out.println("�� �� ����ϼ��� ���մϴ�.");
		Scanner sc = new Scanner(System.in);
		DayOfYear2 doy2 = new DayOfYear2();

		int retry;
		do {
			System.out.print("��: ");
			int y = sc.nextInt();
			System.out.print("��: ");
			int m = sc.nextInt();
			System.out.print("��: ");
			int d = sc.nextInt();

			System.out.println("���� " + doy2.dayOfYear(y, m, d) + "��°�Դϴ�.");
			System.out.println("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�): ");
			retry = sc.nextInt();

		} while (retry == 1);
	}
}
