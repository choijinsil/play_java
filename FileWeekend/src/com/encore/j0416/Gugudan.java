package com.encore.j0416;

import java.io.IOException;

public class Gugudan {

	// �������
	int inputDan() throws IOException { // <-- main���� ó���� �ѱ��.
		System.out.print("���ϴ� ��?");
		int dan = System.in.read() - 48;
		System.in.read();
		System.in.read();

		return dan;
	}

	void outputDan(int dan) {
		// ���޹��� dan�� ���� ���
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

	char continueDan() throws IOException {
		System.out.println("��� (y/n) ?");
		char yn = (char) System.in.read();
		System.in.read();
		System.in.read();

		return yn; // <--char�� default��!
	}
}
