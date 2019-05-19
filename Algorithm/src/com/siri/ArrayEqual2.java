package com.siri;

import java.util.Scanner;

public class ArrayEqual2 {
	public static void main(String[] args) {

		// �迭���̰� ������ �ٸ��� true false
		// ���̰� ���� �迭���� ������ true

		
		ArrayEqual2 ae = new ArrayEqual2();
		int[]c= ae.arrayGenerate("c");
		int[]d= ae.arrayGenerate("d");
				
		if (ae.equals(c,d)) { // �ΰ��� �迭�� �־��ְ�
			System.out.println("c d�� ���ƿ�.");
		} else {
			System.out.println("c d�� �޶��");
		}

	}

	public int[] arrayGenerate(String arrName) { // �迭��ü ����
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭 " + arrName + "�� ��� ����: ");
		int size1 = scan.nextInt();

		int[] a = new int[size1];
		for (int i = 0; i < a.length; i++) {
			System.out.print(arrName + "[" + i + "]: ");
			a[i] = scan.nextInt();
		}
		return a;
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
