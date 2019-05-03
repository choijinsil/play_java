package com.encore.j0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonMenuTest {

	public static void main(String[] args) {
		// 사람메뉴
		// 1.추가 2. 검색 3. 수정 4. 삭제 5. 종료

		// 1. 추가 -readline사용, 이름, 나이, 직업
		// 3. 번호 입력시 나이, 직업 변경
		// 4. 삭제할 번호입력시 삭제
		// 5. 프로그램종료
		// 반복적인 메뉴 출력
		// vector에 추가할 사람정보, 수정할 번호와 사람정보, 삭제할 번호 등등을 입력한다.
		// 선택된 번호에 따라 PersonMenu들의 메소드를 호출,

		Scanner scan = new Scanner(System.in);
		PersonMenu menu = new PersonMenu();

		int input;

		boolean isOk = true;
		while (isOk) {
			qq(); // 질문
			input = scan.nextInt(); // 입력받는다.
			

			if (input == 1) {
				System.out.print("이름 :");
				String name = scan.next();
				System.out.print("나이 :");
				int age = scan.nextInt();
				System.out.print("직업 :");
				String job = scan.next();

				Person p = new Person(input, name, age, job);

				menu.insert(p);

			} else if (input == 2) { // 조회
				menu.select();

			} else if (input == 3) { // 수정
				System.out.print("수정할 번호: ");
				int no = scan.nextInt();
				System.out.print("나이 :");
				int age = scan.nextInt();
				System.out.print("직업 :");
				String job = scan.next();

				Person p = new Person();
				p.setAge(age);
				p.setJob(job);
				p.setNo(no);
				// input엔 이 p객체의 no를 넣어야 한다.
				menu.update(p);

			} else if (input == 4) { // 삭제
				System.out.print("삭제할 번호: ");
				int no = scan.nextInt();
				Person p = new Person();
				p.setNo(no);
				//p.setAge(age);
				menu.delete(p);

			} else if (input == 5) { // 종료
				System.out.println("종료하였습니다.");
				isOk = false;
			}
		}
	}

	public static void qq() {
		System.out.println();
		System.out.println("<사람메뉴>");
		System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
		System.out.print("번호입력 ==> ");
	}
}
