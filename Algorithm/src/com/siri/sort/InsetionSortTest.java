package com.siri.sort;

public class InsetionSortTest {
	void insertionSort(int[] a, int n) {
		// int[]a= {6,4,1,7,3,9,8};

		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
		}
	}

	public static void main(String[] args) {

	}
}
