package com.encore.j0418;

public class SwitchTest {

	public static void main(String[] args) {

		final int SEARCH = 1;
		final int INCREMENT = 2;
		final int DECREMENT = 3;
		final int EXIT = 4;

		int su = 1;

		switch (su) {
		case SEARCH:
			System.out.println("�˻�");
			break;
		case INCREMENT:
			System.out.println("����");
			break;
		case DECREMENT:
			System.out.println("����");
			break;
		case EXIT:
			System.out.println("����");
			break;

		default:
			break;
		}
		// ���׿����� ���ǽ�? A : b
		// ���ǽ��� ����� true������ A����, ����� false������ B����
		// ��) boolean b = ���ǽ�1 ? true: false;
	}

}
