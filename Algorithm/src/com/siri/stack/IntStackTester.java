package com.siri.stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		IntStack iStack = new IntStack(100);
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("<정수스택>");
			System.out.println("1.푸시 2.팝 3.피크 4.덤프 0.종료");
			System.out.print("번호 --> ");
			num = scan.nextInt();

			switch (num) {
			case 1: // 데이터 입력
				System.out.print("데이터: ");
				iStack.push(scan.nextInt());
				break;
			case 2: // 데이터 출력
				try {
					int popData = iStack.pop();
					System.out.println(popData + "출력  되었습니다.");
				} catch (EmptyInstackExcepion e) {
					System.out.println("스텍이 비어있습니다.");
				}
				break;
			case 3: // top에 존재하는 데이터 출력
				try {
					int topData = iStack.peek();
					System.out.println("피크한 데이터는 " + topData + "입니다.");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("# 스텍이 비어있음");
				}
				break;
			case 4: // 전체 데이터 출력
				iStack.dump();
			}
			System.out.println();
		} while (num != 0);
		System.out.println("----END----");
	}

}
