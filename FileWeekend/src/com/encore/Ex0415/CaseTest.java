package com.encore.Ex0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseTest {
	public static void main(String[] args) throws IOException {
		System.out.print("���ϴ� ��: ");
		// �� �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		String month = null;

		// �Է��� ���� �� �ð��� ��
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
			} // switch�� ����
		} // for�� ����

		System.out.println(month);

		// �۾� ���� �ð�
		long finalTime = System.nanoTime();

		// �ɸ��ð�
		long time = finalTime - startTime;

		System.out.println("�ɸ� �ð�: " + time + " ������");
	}
}
