package com.encore.j0422;

import java.util.Vector;

public class NameMenu2 {
	Vector<String> names;
	// String[] names;// null

	public NameMenu2() {
		names = new Vector<String>();
	}

	public void add(String name) {// �迭�� �̸� ���� Create
		// ���(==null)�� �̸� �����ϱ�
		names.add(name);
	}

	public void search() {// ���� �迭���� �̸��� ��ȸ Read
		System.out.println("#�̸����");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

	public void update(String oldName, String newName) {// �迭�� ����� �̸��� ���� Update
		// oldName�� ��ġ�ϴ� �̸��� �迭���� ã��
		for (int i = 0; i < names.size(); i++) {
			if (oldName.equals(names.get(i))) {
				names.set(i, newName);
				break;
			}
		}
	}// update

	public void delete(String delName) {// �迭�� ����� �̸��� ���� Delete

		for (int i = 0; i < names.size(); i++) {
			if (delName.equals(names.get(i))) {
				System.out.println(names.get(i) + "�� ���� �Ǿ����ϴ�.");
				names.remove(i);
				break;
			} else {
				System.out.println("# ��ġ�ϴ� �̸��� �����ϴ�.!");
			}
		}

	}// delete

}// class NameMenu
