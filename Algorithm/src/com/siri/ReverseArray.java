package com.siri;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int su = scan.nextInt();
		int temp = 0;

		int[] a = new int[su];

		for (int i = 0; i < a.length; i++) {

			System.out.print("x[" + i + "]: ");
			a[i] = scan.nextInt();
		} // �� �Է� �޾Ҵ�

		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			// 0���� 4��
			// 1���� 3��
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void swap(int[] a, int idx1, int idx2) {

	}

}
