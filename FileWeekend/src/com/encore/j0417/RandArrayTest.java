package com.encore.j0417;

import java.util.Random;

public class RandArrayTest {
	int[] su;
	Random r;

	public RandArrayTest() {// 생성자: 초기화 메소드(public, 클래스와같은것)
		// 클래스와 이름이 같고 리턴값이 없으면
		su = new int[5];// [0]번지~[4]번지 생성!!
		r = new Random();
	}

	public void inputArray() {
		// 랜덤(임의의 난수)수를 발생해서 배열안에 입력

		for (int i = 0; i < su.length; i++) {// i=0 1 2 3 4
			// su[i] = (int) (Math.random() * 100);// 0.0 ~ 0.9999999999
			// 0.0 ~ 99.9999999999
			// -----
			// 캐스팅연산자(형변환연산자)
			su[i] = r.nextInt(1000); // 0~999까지
		}
	}

	public void printArray() {
		for (int i = 0; i < su.length; i++) {// 배열인덱스표현
			// System.out.println("su[" + i + "]=" + su[i]);
		}
		System.out.println("-------------------------");

		// 2차원배열
		int[][] su2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < su2.length; i++) { // 행인덱스 i=0,1
			for (int j = 0; j < su2[i].length; j++) { // 열인덱스 j=0,1,2
				System.out.println("su2[" + i + "][" + j + "] =" + su2[i][j]);
			}
		}
	}

	public void sortArray() {
		int temp = 0;

		for (int i = 0; i < su.length; i++) {
			for (int j = i + 1; j < su.length; j++) {

				if (su[i] > su[j]) { // 오름차순 내림차순 정렬 조건
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
			System.out.print(su[i] + " ");
		}
	}

	public static void main(String[] args) {
		RandArrayTest rat = new RandArrayTest();
		rat.inputArray();// 난수 데이터를 배열에 입력
		rat.sortArray();
		rat.printArray();// 배열값 출력

	}
}
