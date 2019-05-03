package com.encore.person.model;

import java.util.Vector;

public class Model {
	// ���� ��ȸ���� ��찡 ����.
	// vector�ȿ� person�� ���پ� �Է¹޴´�.
	// ����Ʈ �����ϴ°�� <-- ���� Ŭ������
	public Vector<Person> personv;
	private int no;// �Էµ� Pweaon�� ������ ��ȣ �ο�

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
		// ��ü ���� ��ȸ
		for (int i = 0; i < personv.size(); i++) {
			if (personv.get(i).getNo() == no) { // ��ġ��ȣã�Ҵٸ�
				return personv.get(i);
			}
		}
		return null;
	}

	public Vector<Person> selectAll() {
		return personv;
	} // �뵵: JTable���

}
