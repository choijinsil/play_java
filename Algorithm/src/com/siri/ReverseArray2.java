package com.siri;

import java.util.Scanner;

public class ReverseArray2 {
	// 배열의 요소에 대한 역순 재배치
	// 1. 임의의 배열 데이터에 역순 재배치
	// 2. 콘솔을 통해 배열 데이터를 입력받기
	// 3. 메소드기능 정의하기 swap(int[]a, int idx1, int idx2), reverse(int[]a) 정의
	// 4. 요소 수 입력에 따른 배열 크기 지정

	public void swap(int[] a, int idx1, int idx2) {// 데이터를 교환하는 기능
		// [0] [4]
		// [1] [3]
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}// swap

	public int[] reverse(int[] a) {// 일정횟수(사이즈/2) swap()호출 기능
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			swap(a, i, j);
		}
		return a;// 실행결과 리턴
	}// reverse

	public static void main(String[] args) {
		ReverseArray2 rev = new ReverseArray2();
		Scanner scan = new Scanner(System.in);
		System.out.print("요소수 : ");
		int su = scan.nextInt();

		int[] x = new int[su];
		// = { 10, 73, 2, -5, 42 };
		// [0] [1] [2] [3] [4]

		// 프로그램 실행중 데이터 입력
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}

		x = rev.reverse(x);// 역순 재배치 결과를 재저장
		System.out.println("요소를 역순으로 정렬했습니다.");
		// 역순 재배치 //x[0]=x[4], x[4]=x[0]
		// x[1]=x[3], x[3]=x[1]
//		int temp;
//		//int j=4;
//		for(int i=0,j=x.length-1; i<x.length/2; i++,j--) {
//			//교환 할 왼쪽 데이터(0,1,2,....)  ---> i
//			//교환 할 오른쪽 데이터(4,3,2,....) ---> j
//			temp = x[i];
//			x[i] = x[j];
//			x[j] = temp;
//		}

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");

	}// main
}
