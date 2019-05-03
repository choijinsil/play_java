package com.encore.j0423;

import java.util.Vector;

public class PersonMenu {
	// ����� �����ϴ� �޼ҵ�
	// ���ʹ� ���������� ����� ���ϱ� ������ public class�� �������� �ʿ䰡 ����.
	// v.get(1) �� p�� ���� ������ �Ѵ�,.
	Vector<Person> person = new Vector<Person>();
	int no; // ���Ϳ� �ԷµǴ� person���� �������� ��ȣ �ο�
	Person p = new Person();
	// (create find modify remove)

	public void insert(Person p) { // ���� �Է�
		no++;
		p.setNo(no);
		person.add(p);
	}

	public void select() { // ���� ��ȸ

		System.out.println("#������");
		for (int i = 0; i < person.size(); i++) {
			System.out.println(person.get(i));
		}
	}

	public void update(Person p) {
		// ���ڸ� �Է¹޾� ���̿� ����

		boolean flag = false;
		for (int i = 0; i < person.size(); i++) {
			// ���� �Էµ� ���ڰ� person.get(i) �� �����ϴٸ�
			if (person.get(i).getNo() == p.getNo()) {

				person.get(i).setAge(p.getAge());
				person.get(i).setJob(p.getJob());
				flag = true;
				break; // �´� ������ ������ break
			}
		}

		if (!flag) {
			System.out.println("��ȣ�� �߸��Է��߾��.");
		}
	}

	public void delete(Person p) {
		// ��ȣ �Է½� ����
		for (int i = 0; i < person.size(); i++) {
			// ���� �Էµ� ���ڰ� person.get(i)�� �����ϴٸ�
			// �迭�� ����� ������ �����Ѵ�.
			if (person.get(i).getNo() == p.getNo()) {

				person.remove(i);

				break;
			}
		}
		no--;
	}

}
