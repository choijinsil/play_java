package com.encore.j0416;

public class MadeStar {

	public static void main(String[] args) {
		mission2(); // �ﰢ��

		System.out.println("----------------");

		for (int i = 0; i < 3; i++) { // ���ﰢ��

			for (int j = 0; j < 3 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void mission2() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void a(String greeting) {

	}

	String b(int su) {
		return "�ȳ��ϼ���!";
	}

	int c() {
		return 500;
	}

}
