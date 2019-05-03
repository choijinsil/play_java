package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		// 첫번째방 ~ 마지막방 숫자 입력: 1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 0번째 방에는 1이 , 1ㅂ번째 방에는 2 가
		}

		Random r = new Random();
		// 숫자를 섞어주기
		int temp;

		// 정렬이용해서 하는거라 중복 처리할 필요가 없다.
		for (int i = 0; i < lotto.length; i++) { // 번호숫자를 섞어주는 횟수
			int randomIdx = r.nextInt(44) + 1;
			temp = lotto[i];
			lotto[i] = lotto[randomIdx];
			lotto[randomIdx] = temp;

		}

		for (int i = 0; i < 6; i++) {
			System.out.println("lotto[" + i + "] = " + lotto[i]);

		}

	}

}
