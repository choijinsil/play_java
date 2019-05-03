package com.encore.j0423.review;

import java.util.Vector;

public class PersonMenu {
	Vector<Person> personsV; // null<-- ������ �����(����: Person)
	int no; // ����: ������ ��ȣ�� �־��ֱ� ���켭

	public PersonMenu() { // �ʱ�ȭ, �ɹ����� �ʱ�ȭ
		personsV = new Vector<Person>(); // ��ٱ��ϻ��� ��
	}

	// ����
	public void insert(Person p) {
		// no++;
		// �ΰ� �̻��� �����͸� �ʿ�� �ϴ� ��쿡�� ��� ���°� �Ϲ����̴�.
		p.setNo(++no); // ������ ��ȣ �ο�
		personsV.add(p);
	}

	// ��ȸ
	public void select() {
		System.out.println("# ������");
		for (int i = 0; i < personsV.size(); i++) { // ���� �ε��� ǥ��
			// Person p= personsV.get(i);
			System.out.println(personsV.get(i));
		}
	}

	// ����
	public void update(Person newP) {

		for (int i = 0; i < personsV.size(); i++) {

			// p== person[0] == v.get(0)
			// personsV.get(i) == p
			Person oldP = personsV.get(i);
			// ���Ϳ� ����� ������ �������
			if (oldP.getNo() == newP.getNo()) { // ��ġ�ϴ� ��ȣ�� ã�Ҵٸ�
				oldP.setAge(newP.getAge());
				oldP.setJob(newP.getJob());
				break;
			}
		}
	}
	
	
	// ����
	public void delete(int delNo) {

		// ��ü ���� ���� �� PErson�� ���� ��ȣ�� delNo�� ��
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
