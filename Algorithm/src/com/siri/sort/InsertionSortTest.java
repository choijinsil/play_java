package com.siri.sort;

import java.util.Scanner;

public class InsertionSortTest {
	void insertionSort(int[] a, int n) {// a:정렬할 배열, n:전체요소갯수
		// int[]a= {6, 4, 1, 7, 3, 9, 8};
		// 인덱스 0 1 2 3 4 5 6

		// 기준인덱스 1, tmp=4
		// a[0] > tmp {4, 6 : 1, 7, 3, 9, 8};

		// 기준인덱스 2: tmp=1
		// a[1] > tmp {4, 6 : 6, 7, 3, 9, 8};
		// a[0] > tmp {4, 4 : 6, 7, 3, 9, 8};
		// for문 벗어나고 {1, 4 , 6 : 7, 3, 9, 8};

		// 기준인덱스 3: tmp=7 {1, 4 , 6 : 7, 3, 9, 8};
		// for문 벗어나고(6>7거짓) {1, 4 , 6 , 7 : 3, 9, 8};

		// 기준인덱스 4: tmp=3 {1, 4 , 6 , 7 : 3, 9, 8};
		// a[3] > tmp {1, 4 , 6 , 7 : 7, 9, 8};
		// a[2] > tmp {1, 4 , 6 , 6 : 7, 9, 8};
		// a[1] > tmp {1, 4 , 4 , 6 : 7, 9, 8};
		// for문 벗어나고(1>3거짓) {1, 3 , 4 , 6 ,7 : 9, 8};

		// 기준인덱스 5: tmp=9 {1, 3 , 4 , 6 ,7 : 9, 8};
		// for문 벗어나고(7>9거짓) {1, 3 , 4 , 6 ,7 , 9: 8};

		// 기준인덱스 6: tmp=8 {1, 3 , 4 , 6 ,7 : 9, 8};
		// a[5] > tmp {1, 3 , 4 , 6 ,7 : 8, 9};
		// for문 벗어나고(7>8거짓) {1, 3 , 4 , 6 ,7 , 8: 9}; ==> 전체 정렬 끝

		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];// 오른쪽 shift(이동)구현
			} // 안쪽 for문
			a[j] = tmp;
		} // 바깥for

	}// insertionSort

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("==삽입정렬==");
		System.out.print("요소수: ");
		int num = scan.nextInt();
		int[] array = new int[num];

		for (int i = 0; i < array.length; i++) {
			System.out.print("array[" + i + "]:");
			array[i] = scan.nextInt();
		}

		InsertionSortTest ist = new InsertionSortTest();
		ist.insertionSort(array, num);
		System.out.println("===== 삽입정렬 후 결과 =====");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i]);
		}
	}// main
}
