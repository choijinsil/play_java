package com.encore.j0415;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfTest {
	public static void main(String[] args) throws IOException {
		System.out.print("���ϴ� �� : ");
		// �� �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		String month = null; 
		
		// �Է��� ���� �� �ð��� ��
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
		} // for�� ����
		
		System.out.println(month);
		
		// �۾� ���� �ð�
		long finalTime = System.nanoTime(); 

		// �ɸ��ð�
		long time = finalTime - startTime; 

		System.out.println("�ɸ� �ð�: " + time + " ������");
	}

}
