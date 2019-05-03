package com.encore.j0423;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonMenuTest {

	public static void main(String[] args) {
		// ����޴�
		// 1.�߰� 2. �˻� 3. ���� 4. ���� 5. ����

		// 1. �߰� -readline���, �̸�, ����, ����
		// 3. ��ȣ �Է½� ����, ���� ����
		// 4. ������ ��ȣ�Է½� ����
		// 5. ���α׷�����
		// �ݺ����� �޴� ���
		// vector�� �߰��� �������, ������ ��ȣ�� �������, ������ ��ȣ ����� �Է��Ѵ�.
		// ���õ� ��ȣ�� ���� PersonMenu���� �޼ҵ带 ȣ��,

		Scanner scan = new Scanner(System.in);
		PersonMenu menu = new PersonMenu();

		int input;

		boolean isOk = true;
		while (isOk) {
			qq(); // ����
			input = scan.nextInt(); // �Է¹޴´�.
			

			if (input == 1) {
				System.out.print("�̸� :");
				String name = scan.next();
				System.out.print("���� :");
				int age = scan.nextInt();
				System.out.print("���� :");
				String job = scan.next();

				Person p = new Person(input, name, age, job);

				menu.insert(p);

			} else if (input == 2) { // ��ȸ
				menu.select();

			} else if (input == 3) { // ����
				System.out.print("������ ��ȣ: ");
				int no = scan.nextInt();
				System.out.print("���� :");
				int age = scan.nextInt();
				System.out.print("���� :");
				String job = scan.next();

				Person p = new Person();
				p.setAge(age);
				p.setJob(job);
				p.setNo(no);
				// input�� �� p��ü�� no�� �־�� �Ѵ�.
				menu.update(p);

			} else if (input == 4) { // ����
				System.out.print("������ ��ȣ: ");
				int no = scan.nextInt();
				Person p = new Person();
				p.setNo(no);
				//p.setAge(age);
				menu.delete(p);

			} else if (input == 5) { // ����
				System.out.println("�����Ͽ����ϴ�.");
				isOk = false;
			}
		}
	}

	public static void qq() {
		System.out.println();
		System.out.println("<����޴�>");
		System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
		System.out.print("��ȣ�Է� ==> ");
	}
}
