package com.siri.que;

class Aa {
	void hello(String name) {
		if (name == null)
			throw new NullPointerException();
		// ���� ���� �߻�
		System.out.println("�ȳ�, " + name);
	}
}

class Mym {
	Aa a;

	public Mym() {
		a = new Aa();
	}

	void callTest(String name) {
		try {
			a.hello(name);
		} catch (NullPointerException e) {
			System.out.println("���� �ٷ� Ʈ����ĳġ");
		}
	}
}

public class Hehe {
	public static void main(String[] args) {
		Mym m = new Mym();
		String str = null;
//		if (str == null) {
//			System.out.println("�̸��� �ݵ�� �Է�!");
//			return;
//		}
		m.callTest(str);
	}

}
