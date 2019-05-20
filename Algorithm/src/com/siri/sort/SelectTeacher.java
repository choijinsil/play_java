package com.siri.sort;

import java.util.Scanner;

public class SelectTeacher {
	void swap(int[] a, int idx1, int idx2) {// �迭�� ������ ��ȯ
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}// swap

	void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {//
			int min = i;// min�ε��� 0 , 1, 2, 3 (�Ǿչ����� �ּҰ��̶�� ����)
			for (int j = i + 1; j < n; j++) {// �ּҰ� ���ϱ� j= 1 , 2, 3, 4
				// [23,12,9,8,10]
				// 0 1 2 3 4
				if (a[j] < a[min]) {// �����ּҰ� ���� ���� ���� �߽߰�
					min = j;
				}
			}
			swap(a, i, min);
			// [8,12,9,23,10]
			// 0 1 2 3 4
		}
	}// selectionSort

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("==��������==");
		System.out.print("��Ҽ�: ");
		int num = scan.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "]:");
			array[i] = scan.nextInt();
		}

		SelectTeacher sst = new SelectTeacher();
		sst.selectionSort(array, num);
		System.out.println("===== �������� �� ��� =====");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i]);
		}
	}
}
