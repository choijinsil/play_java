package com.siri.sort;
/*
<������>

          pl---->             x            <----- pr  
         [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]
   arr = {5,   7,   1,   4,   6,   2,   3,   9,   8}

pl(���� ������)
pr(������ ������)
x(�ǹ� ����!!)

�۾�1) arr[pl] >= x  ���Ǽ����Ǵ� ���(������) ã���� ���� pl�� ���������� ��ĵ  pl++

�۾�2) arr[pr] <= x  ���Ǽ����Ǵ� ���(������) ã���� ���� pr�� �������� ��ĵ    pr-- 

 */

public class QuickSortTest {

	public void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}// swap

	public void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {// 0~7
			System.out.print(arr[i]);
			if (i < arr.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}

	public void quickSort(int[] arr, int left, int right) {
		int pl = left; // ���� ������(�ε���)
		int pr = right; // ������ ������(�ε���)
		int x = arr[(pl + pr) / 2]; // �ǹ� ������(pivot����)
		// �ε��� 0 1 2 3 4 5 6 7 8
		// arr[]={5,8,4,2,6,1,3,9,7}

		// x = arr[(0+8)/2] arr[4] 6
		// x = 6

		do {
			while (arr[pl] < x)
				pl++; // �ǹ����� ū�� ã��
			while (arr[pr] > x)
				pr--; // �ǹ����� ������ ã��

			// pl? 1
			// pr? 6

			if (pl <= pr) {
				// ������ ��ȯ
				swap(arr, pl++, pr--);
				// arr[]={5,3,4,2,6,1,8,9,7}
			}
		} while (pl <= pr);

		if (left < pr)
			quickSort(arr, left, pr);
		;
		if (pl < right)
			quickSort(arr, pl, right);

	}// quickSort

	public static void main(String[] args) {
		QuickSortTest qst = new QuickSortTest();

		int[] su = { 5, 7, 1, 4, 6, 2, 3, 9, 8 };
		qst.quickSort(su, 0, su.length - 1);
		System.out.println("#�������� su�迭");

		System.out.print("[");
		for (int i = 0; i < su.length; i++) {// 0~7
			System.out.print(su[i]);
			if (i < su.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}// main
}
