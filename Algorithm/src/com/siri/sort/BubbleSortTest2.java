package com.siri.sort;

import java.util.Scanner;

public class BubbleSortTest2 {

	void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	void bubleSort(int[] a, int n) {
		int cnt = 0;
		for (int i = 0; i < n - 1; i++) { // 비교할 데이터 , 최솟값을 저장 1회 반복시

			int exchg = 0; // 교환은 0번
			for (int j = n - 1; j > i; j--) { // 비교할 오른쪽 데이터
				cnt++;
				if (a[j - 1] > a[j]) { // 반대 부등호로 한다면 내림차순을!
					exchg++;
					swap(a, j - 1, j); // 스왑이 일어나지 않는다면 실행되지 않는다 .이걸 개선한 Buble2~~
				}
			}
			if (exchg == 0) { // 개선된 loop
				break; // 반복문과 스위치문에만 사용가능한 break;
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("버블정렬");
		System.out.print("오소수: ");
		int num = scan.nextInt();
		int[] arr = new int[num];

		System.out.println("---------정렬전");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scan.nextInt();
		}

		BubbleSortTest2 bst = new BubbleSortTest2();
		bst.bubleSort(arr, num);
		System.out.println();
		System.out.println("---------정렬후");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
