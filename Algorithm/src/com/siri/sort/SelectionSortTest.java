package com.siri.sort;

public class SelectionSortTest {

	void selectionSort(int[] a, int n) {

		for (int i = 0; i < n-1; i++) {

			int min = i;
			int temp;
			for (int j = 1; j < 5; j++) { // 5개의 데이터
				// 23,12,9,8,10
				if (a[j] < min) {
					min = a[j];
					// min = j ;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 23, 12, 9, 8, 10 };
		new SelectionSortTest().selectionSort(a, 5);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
