package com.siri.stack;

import java.util.Scanner;

public class IntStackTester {
	public static void main(String[] args) {
		IntStack iStack = new IntStack(100);
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("<��������>");
			System.out.println("1.Ǫ�� 2.�� 3.��ũ 4.���� 0.����");
			System.out.print("��ȣ --> ");
			num = scan.nextInt();

			switch (num) {
			case 1: // ������ �Է�
				System.out.print("������: ");
				iStack.push(scan.nextInt());
				break;
			case 2: // ������ ���
				try {
					int popData = iStack.pop();
					System.out.println(popData + "���  �Ǿ����ϴ�.");
				} catch (EmptyInstackExcepion e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 3: // top�� �����ϴ� ������ ���
				try {
					int topData = iStack.peek();
					System.out.println("��ũ�� �����ʹ� " + topData + "�Դϴ�.");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("# ������ �������");
				}
				break;
			case 4: // ��ü ������ ���
				iStack.dump();
			}
			System.out.println();
		} while (num != 0);
		System.out.println("----END----");
	}

}
