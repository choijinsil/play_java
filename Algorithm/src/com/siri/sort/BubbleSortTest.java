package com.siri.sort;

import java.util.Scanner;

public class BubbleSortTest {

	void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	void bubleSort(int[] a, int n) {
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) { // ���� ������ , �ּڰ��� ���� 1ȸ �ݺ���

			for (int j = n - 1; j > i; j--) { // ���� ������ ������
				cnt++;
				if (a[j - 1] > a[j]) { // �ݴ� �ε�ȣ�� �Ѵٸ� ����������!
					swap(a, j - 1, j); // ������ �Ͼ�� �ʴ´ٸ� ������� �ʴ´� .�̰� ������ Buble2~~ 
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("��������");
		System.out.print("���Ҽ�: ");
		int num = scan.nextInt();
		int[] arr = new int[num];

		System.out.println("---------������");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}

		BubbleSortTest bst = new BubbleSortTest();
		bst.bubleSort(arr, num);
		System.out.println();
		System.out.println("---------������");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
