package com.encore.j0423.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMenuTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;
		PersonMenu menu = new PersonMenu();

		do {
			System.out.println("<사람메뉴");
			System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");
			System.out.print("번호입력 ===>");
			num = br.readLine(); // 1~5까지의 문자열 입력을 받는다.

			switch (num) {
			case "1": {
				System.out.print("이름: ");
				String name = br.readLine();
				System.out.print("나이: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("직업: ");
				String job = br.readLine();
//				String[] arr= {name,age,job};
//				menu.insert(name,age,job);
				Person p = new Person(0, name, age, job);
				menu.insert(p);
				// 메소드명() <-- 메소드 호출 호출뒤에는 데이터
			}
				break;
			case "2":
				menu.select();
				break;
			case "3":
				System.out.print("수정할 번호: ");
				int no = Integer.parseInt(br.readLine());
				System.out.print("나이: ");
				int age = Integer.parseInt(br.readLine()); // case1에서 이미 age와 job을 사용하기 때문에 이름을 바꾸던지, case1의 괄호를 닫아주던지!
				System.out.print("직업: ");
				String job = br.readLine();

				// 세개의 위의 변수를 한변수로 묶는다.
				// Person p = new Person(no,null, age, job); // 전달 안할 문자는 null을 쓰거나 아래처럼 나열하여
				// 데이터를 삽입해도된다.
				Person p = new Person();
				p.setNo(no);
				p.setAge(age);
				p.setJob(job);
				menu.update(p); // 3, null, 19, "장군"
				break;

			case "4":
				
				System.out.print("삭제할 번호 : ");
				int delNo = Integer.parseInt(br.readLine());
				menu.delete(delNo);
				break;
			case "5":

			}
		} while (!num.equals("5"));
		System.out.println("--- END ---");

	}

}
