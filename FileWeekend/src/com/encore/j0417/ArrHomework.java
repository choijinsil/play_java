package com.encore.j0417;

public class ArrHomework {
	public static void main(String[] args) {
		mission1();
		mission2();
		mission3();
		mission4();
		mission5();
		mission6();
		mission7();
	}

	public static void mission1() {
		// [예시] int []su={ 1, 2, 3, 4, 5}; //번지 [0] [1] [2] [3] [4]
		int[] su = { 1, 2, 3, 4, 5 };
		System.out.println("과제 1. 순서대로 출력! \n 나는 향상된 for문을 이용했지롱");
		for (int i : su) { // for(변수타입 변수이름 : 배열이름) --> 변수 이름만 출력시 배열값이 변수에 담아서 나옴
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void mission2() {
		// 문제2) 위 배열의 데이터를 역순으로 출력하시오. (4번지~0번지)
		int[] su = { 1, 2, 3, 4, 5 };
		System.out.println("과제2. 역순으로 출력!");
		// for (int i = 4; i < 0; i--) {
		for (int i = su.length - 1; i > -1; i--) {
			System.out.print(su[i]);
			if (i > 0)
				System.out.print(",");
		}
		System.out.println();
	}

	public static void mission3() {
		// 문제3) int su2[][]={ {1}, {1,2}, {1,2,3}}; su2배열의 데이터를 번지값과 함께 출력하시오. ---> 예)
		// su2[0][0]번지 = 1 행 열
		System.out.println(" 과제3. 2중배열 데이터를 번지값과 함게 출력하기!");
		int su2[][] = { { 1 }, { 1, 2 }, { 1, 2, 3 } };

		for (int i = 0; i < su2.length; i++) {
			for (int j = 0; j < su2[i].length; j++) {
				System.out.println("su2[" + i + "][" + j + "]=" + su2[i][j]);
			}
		}
	}

	public static void mission4() {
		System.out.println("과제4.");
		// 문제4) su3 이라는 배열을 새롭게 만들어서 [예시]su배열의 값을 복사하시오. su3 = su;
		// (X) su3[2]=33; System.out.println(su[2]); // 3 출력
		int[] su = { 1, 2, 3, 4, 5 };
		int[] su3 = new int[su.length];
		// su3 = su; // su의 주소가 su3으로 전달이 된다. <-- 같은 메모리를 공유하는 것이라 값이 바뀜
		// 수와 수3이 동일한 메모리를 참조

		for (int i = 0; i < su.length; i++) {
			su3[i] = su[i]; // 값복사
		}

		// su3과 su는 같은 값을 참조하기 때문에 둘중 하나로 값이 바뀌면 둘다 바뀐다.
		su3[2] = 33;

		for (int i = 0; i < su3.length; i++) {
			System.out.println("su3[" + i + "]=" + su3[i]);
		}

		System.out.println();
		System.out.println("원본 su출력");
		for (int i = 0; i < su.length; i++) {
			System.out.println("su[" + i + "]=" + su[i]);
		}
	}

	public static void mission5() {
		System.out.println();
		System.out.println("문제 5. ");
		// 문제5) [예시]su배열을 ----> for문을 통해 [0]번지~[4]번지까지 출력을 했을때 5 4 3 2 1 과 같이 출력되도록 하시오.
		// [0]번지와 [4]번지 데이터 교환 [1]번지와 [3]번지 데이터 교환 후 출력!!
		int[] su = { 1, 2, 3, 4, 5 };

		// j: 교환할 오른쪽 데이터 인덱스 4,3
		int temp;
		for (int i = 0, j = su.length - 1; i < su.length / 2; i++, j--) {
			temp = su[i];
			su[i] = su[j];
			su[j] = temp;
		}

		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + "  ");
		}

//		for (int i = 0; i < su.length; i++) {
//			for (int j = i + 1; j < su.length; j++) {
//				temp = su[i];
//				su[i] = su[j];
//				su[j] = temp;
//			}
//			System.out.print(su[i] + "  ");
//		}
		System.out.println();
	}

	public static void mission6() {
		// 문제6) su배열의 홀수번지를 출력하시오.
		System.out.println();
		System.out.println("홀수번지 출력");
		int[] su = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < su.length; i++) {
			if (su[i] % 2 == 0) {
				System.out.println("su[" + i + "]");
			}
		}
	}

	public static void mission7() {
		// 문제7) su배열의 홀수값을 출력하시오.
		System.out.println();
		System.out.println("홀수값 출력");
		int[] su = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < su.length; i++) {
			if (su[i] % 2 == 1) {
				System.out.print(su[i] + "  ");
			}
		}
	}
}
