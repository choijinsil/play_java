package com.siri;

import java.util.Scanner;

public class SeqSearch {
	// �˻��� �����Ͱ� �����ϸ� �迭�ε��� ����, �ƴϸ� -1����
	int seqSerch(int[] arr, int n, int keyword) {
		// arr - ��ü������ n: ��ü ���� keyword: �˻��� ������
		int i = 0; // �迭�ε��� ǥ��
		if (i == n) {
			return -1;
		}

		while (true) {
			if (arr[i] == keyword) {
				return i;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt(); // ���� ��ȣ�� �迭���� ������ش�.
		}
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();

		SeqSearch search = new SeqSearch();
		int idx = search.seqSerch(arr, num, key);

		if(idx==-1) {
			System.out.println("�� ���� ��� �����ϴ�.");
		}
		else {
			System.out.println(key + "��(��) arr[" + idx + "]�� �ֽ��ϴ�.");
		}
	}

}
