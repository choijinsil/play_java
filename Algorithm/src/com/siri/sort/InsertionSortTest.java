package com.siri.sort;

import java.util.Scanner;

public class InsertionSortTest {
	void insertionSort(int[] a, int n) {// a:������ �迭, n:��ü��Ұ���
		// int[]a= {6, 4, 1, 7, 3, 9, 8};
		// �ε��� 0 1 2 3 4 5 6

		// �����ε��� 1, tmp=4
		// a[0] > tmp {4, 6 : 1, 7, 3, 9, 8};

		// �����ε��� 2: tmp=1
		// a[1] > tmp {4, 6 : 6, 7, 3, 9, 8};
		// a[0] > tmp {4, 4 : 6, 7, 3, 9, 8};
		// for�� ����� {1, 4 , 6 : 7, 3, 9, 8};

		// �����ε��� 3: tmp=7 {1, 4 , 6 : 7, 3, 9, 8};
		// for�� �����(6>7����) {1, 4 , 6 , 7 : 3, 9, 8};

		// �����ε��� 4: tmp=3 {1, 4 , 6 , 7 : 3, 9, 8};
		// a[3] > tmp {1, 4 , 6 , 7 : 7, 9, 8};
		// a[2] > tmp {1, 4 , 6 , 6 : 7, 9, 8};
		// a[1] > tmp {1, 4 , 4 , 6 : 7, 9, 8};
		// for�� �����(1>3����) {1, 3 , 4 , 6 ,7 : 9, 8};

		// �����ε��� 5: tmp=9 {1, 3 , 4 , 6 ,7 : 9, 8};
		// for�� �����(7>9����) {1, 3 , 4 , 6 ,7 , 9: 8};

		// �����ε��� 6: tmp=8 {1, 3 , 4 , 6 ,7 : 9, 8};
		// a[5] > tmp {1, 3 , 4 , 6 ,7 : 8, 9};
		// for�� �����(7>8����) {1, 3 , 4 , 6 ,7 , 8: 9}; ==> ��ü ���� ��

		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];// ������ shift(�̵�)����
			} // ���� for��
			a[j] = tmp;
		} // �ٱ�for

	}// insertionSort

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

		InsertionSortTest ist = new InsertionSortTest();
		ist.insertionSort(array, num);
		System.out.println("===== �������� �� ��� =====");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i]);
		}
	}// main
}
