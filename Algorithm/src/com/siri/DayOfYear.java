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
		//isLeap ȣ�� , �����̸� 1�� ȣ��
		
		return 0;
	}
	// �迭�� ������� �ʾ���...
	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
			System.out.print("��: ");
			int year = sc.nextInt();

			System.out.print("��: ");
			int month = sc.nextInt();

			System.out.print("��: ");
			int day = sc.nextInt();

			// ���� 1�� 1��
			Calendar toDay = Calendar.getInstance(); // ���ó�¥
			Calendar yDay = Calendar.getInstance(); // ���� ��¥

			yDay.set(year, 1, 1); // ������¥ �⵵�� ����
			toDay.set(year, month, day); // ���糯¥ ����

			// �� ���� ���
			long sec = (toDay.getTimeInMillis() - yDay.getTimeInMillis()) / 1000;
			long secToDay = sec / (60 * 60 * 24);
			isLeap(year);
			
			if(isLeap(year)==1) {
				System.out.println(year+" ���� �����Դϴ�.");
			}else {
				System.out.println(year+" ���� ����Դϴ�.");
			}
			
			System.out.println("�� �� " + secToDay + "��° �Դϴ�.");
			System.out.println();

			System.out.println("�ѹ� �� �ұ��? (1. �� / 0. �ƴϿ�) :");

			int conti = sc.nextInt();
			if (conti == 0) {
				break;
			}
			System.out.println();
		}
	}
}
