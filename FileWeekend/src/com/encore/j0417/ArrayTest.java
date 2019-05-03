package com.encore.j0417;

public class ArrayTest {

	public static void main(String[] args) {

		// 1.배열선언과 초기화
		// int []su;
		// su= {1,2,3,4,5};
		// 에러발생 : 반드시 선언과 초기화를 함께 기술!!

		int[] su = { 1, 2, 3, 4, 5 };// 선언과 초기화를 반드시 함께 기술!!
		// su[0] su[1] su[2] su[3] su[4]

		for (int i = 0; i < su.length; i++) {// 배열의 인덱스 표현(0~4)
			System.out.println("su[" + i + "]번지=" + su[i]);
		}

		System.out.println("===================");

		int[][] su2 = { { 1, 2, 3 }, { 4, 5 ,6,7,8} };

		System.out.println("su2배열의 행 갯수=" + su2.length);//2
		System.out.println("su2배열 첫번째행의 열(데이터)갯수=" + su2[0].length);//3
		System.out.println("su2배열 두번째행의 열(데이터)갯수=" + su2[1].length);//5

		// 전체 데이터 조회
		for (int i = 0; i < su2.length; i++) {// 행인덱스 i = 0, 1
			for (int j = 0; j < su2[i].length; j++) {// 열인덱스 j = 0, 1, 2
				System.out.println("su2[" + i + "][" + j + "]=" + su2[i][j]);
			}
		}
	}// main

}
