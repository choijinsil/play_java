package com.encore.j0423.review;

import java.util.Vector;

public class PersonMenu {
	Vector<Person> personsV; // null<-- 데이터 저장소(단위: Person)
	int no; // 목적: 유일한 번호를 넣어주기 위헤서

	public PersonMenu() { // 초기화, 맴버변수 초기화
		personsV = new Vector<Person>(); // 빈바구니생성 끝
	}

	// 저장
	public void insert(Person p) {
		// no++;
		// 두개 이상의 데이터를 필요로 하는 경우에는 빈즈가 들어가는게 일반적이다.
		p.setNo(++no); // 유일한 번호 부여
		personsV.add(p);
	}

	// 조회
	public void select() {
		System.out.println("# 사람목록");
		for (int i = 0; i < personsV.size(); i++) { // 벡터 인덱스 표현
			// Person p= personsV.get(i);
			System.out.println(personsV.get(i));
		}
	}

	// 수정
	public void update(Person newP) {

		for (int i = 0; i < personsV.size(); i++) {

			// p== person[0] == v.get(0)
			// personsV.get(i) == p
			Person oldP = personsV.get(i);
			// 벡터에 저장된 개개의 사람정보
			if (oldP.getNo() == newP.getNo()) { // 일치하는 번호를 찾았다면
				oldP.setAge(newP.getAge());
				oldP.setJob(newP.getJob());
				break;
			}
		}
	}
	
	
	// 삭제
	public void delete(int delNo) {

		// 전체 백터 내의 각 PErson이 갖는 번호와 delNo과 비교
		for (int i = 0; i < personsV.size(); i++) {
			Person oldP = personsV.get(i);
			if (oldP.getNo() == delNo) {
				personsV.remove(i);
				break;
			}
		}
		--no;
	}
}
