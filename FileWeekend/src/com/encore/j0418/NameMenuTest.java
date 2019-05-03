package com.encore.j0418;

import java.io.BufferedReader;
import java.util.Scanner;

public class NameMenuTest {

	public static void main(String[] args) {

		NameMenu nm = new NameMenu(); // Ŭ���� ������
		boolean isOk = true; // �����Ҷ� �ʿ��� ����
		Scanner sc = new Scanner(System.in); // �Է�
		String input;

		while (isOk) {
			qq();
			input = sc.next();

			if ("1".equals(input)) { // �߰�

				System.out.print("�̸��Է�: ");
				input = sc.next();
				nm.insert(input);
				System.out.println();

			} else if ("2".equals(input)) { // ��ȸ
				nm.select();

			} else if ("3".equals(input)) { // ����

				System.out.print("���� �̸� �Է�: ");
				input = sc.next();
				System.out.print("�����̸��Է�: ");
				String input2 = sc.next();
				nm.update(input, input2);

			} else if ("4".equals(input)) { // ����
				System.out.print("�����̸��Է�: ");
				input = sc.next();
				nm.delete(input);

			} else if ("5".equals(input)) { // ��
				System.out.println("����Ǿ����ϴ�.");
				isOk = false;

			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}
	}

	public static void qq() {
		System.out.println();
		System.out.println("<�̸��޴�>");
		System.out.println("1.�߰�  2.�˻�  3.����  4.����  5.����");
		System.out.print("��ȣ�Է� --> ");
	}
}

/*
 * - main()���� --> �ݺ��Ǵ� �޴� ��� --> ��ȣ�Է�(1~5) , �߰� ���� ������ �ʿ��� �̸� �Է� --> ��, �Է��� ���
 * ���ο��� �ްڴ�.
 */
