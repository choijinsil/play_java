package com.encore.j0419;

public class NameMenu {
	String[] names; // ���� null����
	int cnt = 0;

	public NameMenu() {
		names = new String[5];
	}

	public void add(String name) { // create
		if (cnt == 5) {
			System.out.println("�� �̻� �Է��� �� �����ϴ�");
			return; // �������� �ǵ��� ����.
		}

		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println("#�̹� �Էµ� �̸��Դϴ�!!.");
				break;
			}
			// search�� ���� �̸�
			if (names[i] == null) {
				names[i] = name;
				cnt++;
				break;
			}
		}
	}

	public void search() { // read
		System.out.println("# �̸� ���");

		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	public void update(String oldName, String newName) {// update
		for (int i = 0; i < names.length; i++) {
			if (oldName.equals(names[i])) { // ��ġ�ϴ� �̸��� ã�Ҵٸ�
				// if (oldName.equals(oldName) {
				// oldName�� null���� ���� ���޵��� ����.
				names[i] = newName; // ����
				break;
			} else {
				System.out.println("#�������� �ʴ� �̸��Դϴ�!!");
				break;
			}
		}
	}

	public void delete(String delName) {// delete

		boolean isOk = true;
		for (int i = 0; i < names.length; i++) {

			if (names[i] != null) {
				if (delName.equals(names[i])) {
					names[i] = null;
					cnt--;
					break;
				}
			} else {
				isOk = false;
			}
		}
		if (!isOk) {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}

	}

	public boolean ckNum(String chNumString) { // ���ڰ� �´��� �ƴ��� üũ
		boolean isOk = false;
		char ch;
		for (int i = 0; i < chNumString.length(); i++) {
			ch = chNumString.charAt(i);
			// ������ �ƽ�Ű�ڵ尪 (48 ~ 57)
			if (ch >= '0' && ch <= '9') {
				// ���ڷ� ������ ���ڶ��(0-9)
				isOk = true;
				// return true�� �൵ �ȴ�. return�� �޼ҵ带 �����ϴ� ����ȣ�� ������ �Ѵ�.
			}
		}

		return isOk;
	}

}
