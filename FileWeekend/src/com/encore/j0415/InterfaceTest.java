package com.encore.j0415;

public class InterfaceTest {

	public static void main(String[] args) {
		// �մ�
		MenuPan menu = new HongKong(); // �������̽��� new�� �����Ѵ�.
		menu.Jambbong();
		menu.Jajang();
		// menu.menu();
		// static �ɹ��� Ŭ���������� ����!
		System.out.println("���ΰ�: " + MenuPan.COIN);
	}
}
