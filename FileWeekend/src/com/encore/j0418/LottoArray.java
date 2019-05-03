package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
	public static void main(String[] args) {
		int[] lotto = new int[45];
		// ù��°�� ~ �������� ���� �Է�: 1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 0��° �濡�� 1�� , 1����° �濡�� 2 ��
		}

		Random r = new Random();
		// ���ڸ� �����ֱ�
		int temp;

		// �����̿��ؼ� �ϴ°Ŷ� �ߺ� ó���� �ʿ䰡 ����.
		for (int i = 0; i < lotto.length; i++) { // ��ȣ���ڸ� �����ִ� Ƚ��
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
