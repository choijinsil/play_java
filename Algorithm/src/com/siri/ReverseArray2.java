package com.siri;

import java.util.Scanner;

public class ReverseArray2 {
	// �迭�� ��ҿ� ���� ���� ���ġ
	// 1. ������ �迭 �����Ϳ� ���� ���ġ
	// 2. �ܼ��� ���� �迭 �����͸� �Է¹ޱ�
	// 3. �޼ҵ��� �����ϱ� swap(int[]a, int idx1, int idx2), reverse(int[]a) ����
	// 4. ��� �� �Է¿� ���� �迭 ũ�� ����

	public void swap(int[] a, int idx1, int idx2) {// �����͸� ��ȯ�ϴ� ���
		// [0] [4]
		// [1] [3]
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}// swap

	public int[] reverse(int[] a) {// ����Ƚ��(������/2) swap()ȣ�� ���
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			swap(a, i, j);
		}
		return a;// ������ ����
	}// reverse

	public static void main(String[] args) {
		ReverseArray2 rev = new ReverseArray2();
		Scanner scan = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int su = scan.nextInt();

		int[] x = new int[su];
		// = { 10, 73, 2, -5, 42 };
		// [0] [1] [2] [3] [4]

		// ���α׷� ������ ������ �Է�
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}

		x = rev.reverse(x);// ���� ���ġ ����� ������
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		// ���� ���ġ //x[0]=x[4], x[4]=x[0]
		// x[1]=x[3], x[3]=x[1]
//		int temp;
//		//int j=4;
//		for(int i=0,j=x.length-1; i<x.length/2; i++,j--) {
//			//��ȯ �� ���� ������(0,1,2,....)  ---> i
//			//��ȯ �� ������ ������(4,3,2,....) ---> j
//			temp = x[i];
//			x[i] = x[j];
//			x[j] = temp;
//		}

		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");

	}// main
}
