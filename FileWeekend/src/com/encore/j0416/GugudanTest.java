package com.encore.j0416;

import java.io.IOException;

public class GugudanTest {

	public static void main(String[] args) throws IOException {
		// main�� �� �ִ� Ŭ������ �ڹپ�, �ڹ� �������α׷����� �Ҹ���.
		// �ٸ� Ŭ������ ���������� ��� �� �� �ִ�.

		Gugudan g = new Gugudan();
		System.out.println("<<������>>");

		while (true) {
			int dan = g.inputDan();
			g.outputDan(dan);
			char yn = g.continueDan();

			if (yn == 'n')
				break;
			System.out.println();
		}
		// System.out.println("---END---");
	}
}
