package com.encore.j0415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan {
	// 기능 정의

	// 단 입력
	int inputDan() throws IOException {

		System.out.println("<<구구단>>");
		// read() readline()사용
		System.out.print("원하는 단?");
		String input = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());

		return dan; // 입력값을 받았다.
	}

	// 단 출력
	void outputDan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);

		}
	}

	// 계속 여부
	char continueDan() throws IOException {
		// read또는 readline사용
		System.out.println();
		System.out.println("더 진행하시겠습니까? y/n");
		// "y".charAt(0) ----> 'y'

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char conti = br.readLine().charAt(0); // String -> char 형변환 방법
		return conti;
	}

}
