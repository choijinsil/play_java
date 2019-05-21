package com.siri.sort;
/*
<퀵정렬>

          pl---->             x            <----- pr  
         [0]  [1]  [2]  [3]  [4]  [5]  [6]  [7]  [8]
   arr = {5,   7,   1,   4,   6,   2,   3,   9,   8}

pl(왼쪽 포인터)
pr(오른쪽 포인터)
x(피벗 기준!!)

작업1) arr[pl] >= x  조건성립되는 요소(데이터) 찾을때 까지 pl을 오른쪽으로 스캔  pl++

작업2) arr[pr] <= x  조건성립되는 요소(데이터) 찾을때 까지 pr을 왼쪽으로 스캔    pr-- 

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
		int pl = left; // 왼쪽 포인터(인덱스)
		int pr = right; // 오른쪽 포인터(인덱스)
		int x = arr[(pl + pr) / 2]; // 피벗 데이터(pivot기준)
		// 인덱스 0 1 2 3 4 5 6 7 8
		// arr[]={5,8,4,2,6,1,3,9,7}

		// x = arr[(0+8)/2] arr[4] 6
		// x = 6

		do {
			while (arr[pl] < x)
				pl++; // 피벗기준 큰값 찾기
			while (arr[pr] > x)
				pr--; // 피벗기준 작은값 찾기

			// pl? 1
			// pr? 6

			if (pl <= pr) {
				// 데이터 교환
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
		System.out.println("#퀵정렬후 su배열");

		System.out.print("[");
		for (int i = 0; i < su.length; i++) {// 0~7
			System.out.print(su[i]);
			if (i < su.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");
	}// main
}
