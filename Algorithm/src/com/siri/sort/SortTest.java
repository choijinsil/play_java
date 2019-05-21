package com.siri.sort;

public class SortTest {
	public static void main(String[] args) {

		SortTest st = new SortTest();
		int[] a = { 10, 3, 6, 2, 7, 8, 9 };
		int[] b = { 6, 4, 8, 3, 1, 9, 7 };
		int[] c = { 1, 4, 6, 7, 3, 9, 8 };

		st.bubbleSort(a);
		st.selectionSort(b);
		st.insertionSort(c);
	}

	void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					swap(arr, j + 1, j);
				}
			}
		}
		System.out.println("버블정렬");
		ff(arr);
	}

	// 선택 정렬
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = i + 1; j < arr.length; j++) {
//
//			if (arr[i] > arr[j]) {
//				swap(arr, i, j);
//			}
//		}
//	}

	void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			swap(arr, min, i);
		}
		System.out.println("선택정렬");
		ff(arr);

	}

	void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int j;
			int tmp = arr[i];
			for (j = i; j > 0 && arr[j - 1] > tmp; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = tmp;
		}

		System.out.println("삽입정렬");
		ff(arr);
	}

	// for문 출력하는 메소드
	void ff(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	// 값 치환하는 메소드
	void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

}
