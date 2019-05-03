package com.encore.j0423;

import java.util.Vector;

public class PersonMenu {
	// 기능을 정의하는 메소드
	// 벡터는 접근제한자 사용을 안하기 떄문에 public class를 생성해줄 필요가 없다.
	// v.get(1) 이 p와 같은 역할을 한다,.
	Vector<Person> person = new Vector<Person>();
	int no; // 벡터에 입력되는 person내에 순차적인 번호 부여
	Person p = new Person();
	// (create find modify remove)

	public void insert(Person p) { // 정보 입력
		no++;
		p.setNo(no);
		person.add(p);
	}

	public void select() { // 정보 조회

		System.out.println("#사람목록");
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}
	}

	public void update(Person p) {
		// 숫자를 입력받아 나이와 직업

		boolean flag = false;
		for (int i = 0; i < person.size(); i++) {
			// 만약 입력된 숫자가 person.get(i) 와 동일하다면
			if (person.get(i).getNo() == p.getNo()) {

				person.get(i).setAge(p.getAge());
				person.get(i).setJob(p.getJob());
				flag = true;
				break; // 맞는 조건을 만나면 break
			}
		}

		if (!flag) {
			System.out.println("번호를 잘못입력했어요.");
		}
	}

	public void delete(Person p) {
		// 번호 입력시 삭제
		for (int i = 0; i < person.size(); i++) {
			// 만약 입력된 숫자가 person.get(i)와 동일하다면
			// 배열에 저장된 정보를 삭제한다.
			if (person.get(i).getNo() == p.getNo()) {

				person.remove(i);

				break;
			}
		}
		no--;
	}

}
