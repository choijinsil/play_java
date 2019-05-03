package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		System.out.println("** 금주 행운의 로또번호 **");
		// 로또 출력한다.
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + "회차: ");
			autoLotto();
		}

	}

	public static void autoLotto() {
		int lotto[] = new int[6];

		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) { // 로또 6자리 뽑기
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) { // 로또1번방 == 로또0번방 비교해서 같으면 i 한칸 뒤로 가기
				if (lotto[i] == lotto[j]) { // 즉 중복검사
					i--;
				}
			}
			// 중복검사 끝
		}
		Arrays.sort(lotto); // 로또 정렬하기

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		System.out.println();
	}

}

/*
 * < 행운의 로또 생성기 > 1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성 2. 각 숫자는 1~45 범위내의 숫자 3. 매번
 * 실행시 다른 숫자 출력 --> 랜덤수: Random클래스 - nextInt(int bound) 사용 4. 다섯회 출력 5. 각 번호는
 * 오름차순 정렬 --> Arrays클래스 sort()메소드 사용.
 * 
 * 출력형태) 금주 행운의 로또번호 ** 1회: 2, 12, 15, 34, 36, 42 2회: 1, 2, 9, ... 3회:
 */