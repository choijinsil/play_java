package com.encore.j0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {
	// ��� ����

	// �� �Է�
	int inputDan() throws IOException {

		System.out.println("<<������>>");
		// read() readline()���
		System.out.print("���ϴ� ��?");
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());

		return dan; // �Է°��� �޾Ҵ�.
	}

	// �� ���
	void outputDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);

		}
	}

	// ��� ����
	char continueDan() throws IOException {
		// read�Ǵ� readline���
		System.out.println();
		System.out.println("�� �����Ͻðڽ��ϱ�? y/n");
		// "y".charAt(0) ----> 'y'

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char conti = br.readLine().charAt(0); // String -> char ����ȯ ���
		return conti;
	}

}
