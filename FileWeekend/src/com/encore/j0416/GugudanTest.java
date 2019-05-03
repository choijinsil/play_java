package com.encore.j0416;

import java.io.IOException;

public class GugudanTest {

	public static void main(String[] args) throws IOException {
		// main이 들어가 있는 클래스는 자바앱, 자바 응용프로그램으로 불린다.
		// 다른 클래스와 독립적으로 운영을 할 수 있다.

		Gugudan g = new Gugudan();
		System.out.println("<<구구단>>");

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
