package com.encore.j0423.reviewww;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMenuTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;
		PersonMenu menu = new PersonMenu();
		boolean isOk = true;

		while (isOk) {
			qq();
			num = br.readLine();

			if ("1".equals(num)) {

				System.out.print("이름: ");
				String name = br.readLine();
				System.out.print("나이: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("직업: ");
				String job = br.readLine();

				Person p = new Person(0, name, age, job);
				menu.insert(p);

			} else if ("2".equals(num)) {
				menu.select();
			} else if ("3".equals(num)) {
				System.out.print("수정할 번호: ");
				int no = Integer.parseInt(br.readLine());
				System.out.print("나이: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("직업: ");
				String job = br.readLine();

				Person p = new Person(no, null, age, job);
				menu.update(p);
			} else if ("4".equals(num)) {
				System.out.print("삭제할 번호 : ");
				int delNo = Integer.parseInt(br.readLine());
				menu.delete(delNo);

			} else if ("5".equals(num)) {
				System.out.println("종료하였습니다.");
				isOk = false;
				break;
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}
	}

	public static void qq() { // 왜 static을 해줘야 하는지?
		System.out.println();
		System.out.println("<사람메뉴>");
		System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
		System.out.print("번호입력 ===>");
	}
}
