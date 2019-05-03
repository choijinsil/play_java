package com.encore.j0417;

public class SwapTest {
	public static void main(String[] args) {
		int su1 = 50;
		int su2 = 30;
		int temp = 0;

		temp = su1;
		su1 = su2;
		su2 = temp;

		System.out.println("su1=" + su1);
		System.out.println("su2=" + su2);

		// 배열 값 변경
		int[] arr = { 300, 100 };
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("arr[0]번째 값 <- " + arr[0]);
		System.out.println("arr[1]번째 값 <- " + arr[1]);
	}
}
