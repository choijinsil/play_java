package com.encore.j0423.reviewww;

import java.util.Vector;

public class PersonMenu {
	// vector�ȿ� person�� ���پ� �Է¹޴´�.
	Vector<Person> persons = new Vector<Person>();
	int no;

	public void insert(Person p) {
		++no;
		p.setNo(no);
		persons.add(p);
	}

	public void select() {
		System.out.println("#�̸���ȸ���");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}
	}

	public void update(Person p) {

		for (int i = 0; i < persons.size(); i++) {
			if (p.getNo() == persons.get(i).getNo()) {
				persons.get(i).setAge(p.getAge());
				persons.get(i).setJob(p.getJob());
				break;
			}
		}
	}

	public void delete(int delNo) {
		for (int i = 0; i < persons.size(); i++) {
			if (delNo == persons.get(i).getNo()) {
				persons.remove(i);
			}
		}

	}
}
