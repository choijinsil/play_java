package com.encore.j0415;

// �������ϸ�.class���� public�� ���� �� �ִ�.
public class ThisTest {
	// �Ѱ��� ���Ͽ� �ΰ��̻��� Ŭ������ �����ϴ� ���
	// �������ϸ� �ش��ϴ� Ŭ�����տ��� public�� ���� ���������ڸ� ����� �� �ִ�.

	public static void main(String[] args) {
		A a = new A(); // �⺻������ ȣ��
		System.out.println("�⺻ STR=" + a.str);

		System.out.println("============");

		A a2 = new A("���̽�");
		System.out.println("�����ε�STR=" + a2.str);
	}
}
