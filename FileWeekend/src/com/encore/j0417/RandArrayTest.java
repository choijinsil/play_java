package com.encore.j0417;

import java.util.Random;

public class RandArrayTest {
	int[] su;
	Random r;

	public RandArrayTest() {// ������: �ʱ�ȭ �޼ҵ�(public, Ŭ�����Ͱ�����)
		// Ŭ������ �̸��� ���� ���ϰ��� ������
		su = new int[5];// [0]����~[4]���� ����!!
		r = new Random();
	}

	public void inputArray() {
		// ����(������ ����)���� �߻��ؼ� �迭�ȿ� �Է�

		for (int i = 0; i < su.length; i++) {// i=0 1 2 3 4
			// su[i] = (int) (Math.random() * 100);// 0.0 ~ 0.9999999999
			// 0.0 ~ 99.9999999999
			// -----
			// ĳ���ÿ�����(����ȯ������)
			su[i] = r.nextInt(1000); // 0~999����
		}
	}

	public void printArray() {
		for (int i = 0; i < su.length; i++) {// �迭�ε���ǥ��
			// System.out.println("su[" + i + "]=" + su[i]);
		}
		System.out.println("-------------------------");

		// 2�����迭
		int[][] su2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < su2.length; i++) { // ���ε��� i=0,1
			for (int j = 0; j < su2[i].length; j++) { // ���ε��� j=0,1,2
				System.out.println("su2[" + i + "][" + j + "] =" + su2[i][j]);
			}
		}
	}

	public void sortArray() {
		int temp = 0;

		for (int i = 0; i < su.length; i++) {
			for (int j = i + 1; j < su.length; j++) {

				if (su[i] > su[j]) { // �������� �������� ���� ����
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
		rat.inputArray();// ���� �����͸� �迭�� �Է�
		rat.sortArray();
		rat.printArray();// �迭�� ���

	}
}
