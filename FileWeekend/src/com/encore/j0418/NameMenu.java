package com.encore.j0418;

public class NameMenu {

	String[] names = new String[5];
	// String[] names = {null,null,null,null,null};

//	public NameMenu() {
//		// init();
//		// String[] names = {"","","","",""};
//	}

//	public void init() {
//		for (int i = 0; i < names.length; i++) {
//			names[i] = null;
//		}
//	}

	public void insert(String name) { // ����

		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void select() {
		System.out.println("#�̸����");
		for (int i = 0; i < names.length; i++) { // �� ���� ���� �Էµ��� ������?
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	public void update(String oldName, String newName) { // �����̸� �Է¹�����
		for (int i = 0; i < names.length; i++) {

			if (names[i].equals(oldName)) {
				names[i] = newName;
				break;
			}
		}
	}

	public void delete(String name) { // ����

		for (int i = 0; i < names.length; i++) {

			if (names[i].equals(name)) {
				names[i] = null;
				break;
			}
		}
	}
}

/*- �̸��� ���� �߰�, �˻�, ����, ���� ��ɸ޼ҵ带 ����
   - �ɹ��ʵ�: �迭��ü(String names[])   

/*
 * <�̸��޴�> 1. �߰� 2. �˻� 3. ���� 4. ���� 5. ���� ��ȣ�Է� -->
 */