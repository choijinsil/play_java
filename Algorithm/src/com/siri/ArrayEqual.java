package com.siri;

import java.util.Scanner;

public class ArrayEqual {
	public static void main(String[] args) {

		// �迭���̰� ������ �ٸ��� true false
		// ���̰� ���� �迭���� ������ true
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭 a�� ��� ����: ");
		int size1 = scan.nextInt();

		int[] a = new int[size1];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
		}

		System.out.print("�迭 b�� ��� ����: ");
		int size2 = scan.nextInt();
		int[] b = new int[size2];
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
		}

		ArrayEqual ae = new ArrayEqual();
		if (ae.equals(a, b)) { // �ΰ��� �迭�� �־��ְ�
			System.out.println("a b�� ���ƿ�.");
		} else {
			System.out.println("a b�� �޶��");
		}

//		if (a.length == b.length) {
//			System.out.println(a.length == b.length);
//		} else {
//			System.out.println(a.length == b.length);
//		}
	}

	private boolean equals(int[] a, int[] b) {
		
		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;

	}

}
