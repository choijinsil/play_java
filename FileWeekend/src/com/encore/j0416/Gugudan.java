package com.encore.j0416;

import java.io.IOException;

public class Gugudan {

	// 기능정의
	int inputDan() throws IOException { // <-- main에게 처리를 넘긴다.
		System.out.print("원하는 단?");
		int dan = System.in.read() - 48;
		System.in.read();
		System.in.read();

		return dan;
	}

	void outputDan(int dan) {
		// 전달받은 dan에 대한 출력
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}

	char continueDan() throws IOException {
		System.out.println("계속 (y/n) ?");
		char yn = (char) System.in.read();
		System.in.read();
		System.in.read();

		return yn; // <--char의 default값!
	}
}
