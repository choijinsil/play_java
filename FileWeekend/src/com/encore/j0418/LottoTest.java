package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		System.out.println("** ���� ����� �ζǹ�ȣ **");
		// �ζ� ����Ѵ�.
		for (int i = 0; i < 6; i++) {
			System.out.print((i + 1) + "ȸ��: ");
			autoLotto();
		}

	}

	public static void autoLotto() {
		int lotto[] = new int[6];

		Random random = new Random();

		for (int i = 0; i < lotto.length; i++) { // �ζ� 6�ڸ� �̱�
			lotto[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) { // �ζ�1���� == �ζ�0���� ���ؼ� ������ i ��ĭ �ڷ� ����
				if (lotto[i] == lotto[j]) { // �� �ߺ��˻�
					i--;
				}
			}
			// �ߺ��˻� ��
		}
		Arrays.sort(lotto); // �ζ� �����ϱ�

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "  ");
		}
		System.out.println();
	}

}

/*
 * < ����� �ζ� ������ > 1. ���� ��ġ�� �ʴ� (�ߺ����� �ʴ�) ���� 6�� ���� 2. �� ���ڴ� 1~45 �������� ���� 3. �Ź�
 * ����� �ٸ� ���� ��� --> ������: RandomŬ���� - nextInt(int bound) ��� 4. �ټ�ȸ ��� 5. �� ��ȣ��
 * �������� ���� --> ArraysŬ���� sort()�޼ҵ� ���.
 * 
 * �������) ���� ����� �ζǹ�ȣ ** 1ȸ: 2, 12, 15, 34, 36, 42 2ȸ: 1, 2, 9, ... 3ȸ:
 */