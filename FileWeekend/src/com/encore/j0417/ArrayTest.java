package com.encore.j0417;

public class ArrayTest {

	public static void main(String[] args) {

		// 1.�迭����� �ʱ�ȭ
		// int []su;
		// su= {1,2,3,4,5};
		// �����߻� : �ݵ�� ����� �ʱ�ȭ�� �Բ� ���!!

		int[] su = { 1, 2, 3, 4, 5 };// ����� �ʱ�ȭ�� �ݵ�� �Բ� ���!!
		// su[0] su[1] su[2] su[3] su[4]

		for (int i = 0; i < su.length; i++) {// �迭�� �ε��� ǥ��(0~4)
			System.out.println("su[" + i + "]����=" + su[i]);
		}

		System.out.println("===================");

		int[][] su2 = { { 1, 2, 3 }, { 4, 5 ,6,7,8} };

		System.out.println("su2�迭�� �� ����=" + su2.length);//2
		System.out.println("su2�迭 ù��°���� ��(������)����=" + su2[0].length);//3
		System.out.println("su2�迭 �ι�°���� ��(������)����=" + su2[1].length);//5

		// ��ü ������ ��ȸ
		for (int i = 0; i < su2.length; i++) {// ���ε��� i = 0, 1
			for (int j = 0; j < su2[i].length; j++) {// ���ε��� j = 0, 1, 2
				System.out.println("su2[" + i + "][" + j + "]=" + su2[i][j]);
			}
		}
	}// main

}
