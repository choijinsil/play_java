package com.encore.person.model;

import java.util.Vector;

public class Model {
	// 모델은 일회성인 경우가 많다.
	// vector안에 person을 한줄씩 입력받는다.
	// 임포트 생략하는경우 <-- 같은 클래스내
	public Vector<Person> personv;
	private int no;// 입력된 Pweaon에 유일한 번호 부여

	public Model() {
		personv = new Vector<Person>();
	}

	public void insert(Person p) {
		no++;
		p.setNo(no);
		personv.add(p);
	}

	public void update(Person newp) {

		for (int i = 0; i < personv.size(); i++) {

			if (personv.get(i).getNo() == newp.getNo()) {
				personv.get(i).setAge(newp.getAge());
				personv.get(i).setJob(newp.getJob());
				break;
			}
		}
	}

	public void delete(int no) {
		for (int i = 0; i < personv.size(); i++) {

			if (personv.get(i).getNo() == no) {
				personv.remove(i);
				break;
			}
		}
	}

	public Person select(int no) {
		// 전체 벡터 조회
		for (int i = 0; i < personv.size(); i++) {
			if (personv.get(i).getNo() == no) { // 일치번호찾았다면
				return personv.get(i);
			}
		}
		return null;
	}

	public Vector<Person> selectAll() {
		return personv;
	} // 용도: JTable출력

}
