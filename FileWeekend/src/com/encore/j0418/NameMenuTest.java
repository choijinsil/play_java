package com.encore.j0418;

import java.io.BufferedReader;
import java.util.Scanner;

public class NameMenuTest {

	public static void main(String[] args) {

		NameMenu nm = new NameMenu(); // 클래스 생성자
		boolean isOk = true; // 종료할때 필요한 변수
		Scanner sc = new Scanner(System.in); // 입력
		String input;

		while (isOk) {
			qq();
			input = sc.next();

			if ("1".equals(input)) { // 추가

				System.out.print("이름입력: ");
				input = sc.next();
				nm.insert(input);
				System.out.println();

			} else if ("2".equals(input)) { // 조회
				nm.select();

			} else if ("3".equals(input)) { // 수정

				System.out.print("기존 이름 입력: ");
				input = sc.next();
				System.out.print("변경이름입력: ");
				String input2 = sc.next();
				nm.update(input, input2);

			} else if ("4".equals(input)) { // 삭제
				System.out.print("삭제이름입력: ");
				input = sc.next();
				nm.delete(input);

			} else if ("5".equals(input)) { // 끝
				System.out.println("종료되었습니다.");
				isOk = false;

			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}

	public static void qq() {
		System.out.println();
		System.out.println("<이름메뉴>");
		System.out.println("1.추가  2.검색  3.수정  4.삭제  5.종료");
		System.out.print("번호입력 --> ");
	}
}

/*
 * - main()포함 --> 반복되는 메뉴 출력 --> 번호입력(1~5) , 추가 수정 삭제에 필요한 이름 입력 --> 즉, 입력은 모두
 * 메인에서 받겠다.
 */
