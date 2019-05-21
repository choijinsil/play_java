package com.siri.sort;

public class SortTeacher {

	public void bubbleSort(int[] arr) { // 버블 정렬

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = arr.length - 1; j > i; j--) {

				if (arr[j - 1] > arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
	} // 버블끝

	public void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) { // 최솟값 기준 인덱스
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}

	public void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			int home = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > home) {
					arr[j + 1] = arr[j];
					arr[j] = home;
				}
			}

		}
	}

	public void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void main(String[] args) {
		int[] a = { 10, 3, 6, 2, 7, 8, 9 };
		int[] b = { 6, 4, 8, 3, 1, 9, 7 };
		int[] c = { 1, 4, 6, 7, 3, 9, 8 };
		SortTeacher st = new SortTeacher();
		st.bubbleSort(a);
		st.bubbleSort(b);

		System.out.println("# 버블 정렬후 a배열 출력");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < 6) {
				System.out.print(", ");
			}
		}

		System.out.println();
		System.out.println("# 선택 정렬후 a배열 출력");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i < 6) {
				System.out.print(", ");
			}
		}
	}

}
