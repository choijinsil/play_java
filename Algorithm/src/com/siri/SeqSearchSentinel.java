package com.siri;

import java.util.Scanner;

public class SeqSearchSentinel {
	// �˻��� �����Ͱ� �����ϸ� �迭�ε��� ����, �ƴϸ� -1����
	int seqSerch(int[] arr, int n, int keyword) {
		// arr - ��ü������ n: ��ü ���� keyword: �˻��� ������
		arr[n] = keyword;
		int i = 0; // �迭�ε��� ǥ��
		if (i == n) {
			return -1;
		}

		while (true) {
			// �ټ����� �������� ���������� ã�� Ű���带 �ְ� �ֱ� ������ �������� �극��ũ��
			// ����� ���ۿ� ���� �����̴�.
			if (arr[i] == keyword) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] arr = new int[num + 1]; // 1 �� �߰��� ������ ���� ������ ǥ���ϱ� ����

		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt(); // ���� ��ȣ�� �迭���� ������ش�.
		}
		System.out.print("�˻��� ��: ");
		int key = sc.nextInt();

		SeqSearchSentinel search = new SeqSearchSentinel();
		int idx = search.seqSerch(arr, num, key);

		if (idx == -1) {
			System.out.println("�� ���� ��� �����ϴ�.");
		} else {
			System.out.println(key + "��(��) arr[" + idx + "]�� �ֽ��ϴ�.");
		}
	}

}
