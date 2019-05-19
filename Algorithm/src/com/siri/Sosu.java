package com.siri;

public class Sosu {

	// 2~1000사이의 소수를 화면에 출력하기
	public static void main(String[] args) {
		for (int base = 2; base <= 1000; base++) {// 기준수(소수인지 혹은 합성수인지 파악)
			int j;
			for (j = 2; j < base; j++) {// 나눌수
				if (base % j == 0) {// 1과 자신의 수를 제외하고 나뉘어 진다면
					break;
				}
			}
			// System.out.println("base="+base+", j="+j)
			/*
			 * base j 2 2 3 3 4 2 5 5 6 2 7 7 8 2
			 */
			if (base == j)
				System.out.print(base + "   ");
		} // 바깥 for문
	}// main
}
