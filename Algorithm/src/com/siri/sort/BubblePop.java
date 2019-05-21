package com.siri.sort;

public class BubblePop {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 4, 7, 8, 9 };
		new BubblePop().bubbleSort(a);
	}

	void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
