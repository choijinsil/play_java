package com.encore.j0423.reviewww;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMenuTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;
		PersonMenu menu = new PersonMenu();
		boolean isOk = true;

		while (isOk) {
			qq();
			num = br.readLine();

			if ("1".equals(num)) {

				System.out.print("�̸�: ");
				String name = br.readLine();
				System.out.print("����: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("����: ");
				String job = br.readLine();

				Person p = new Person(0, name, age, job);
				menu.insert(p);

			} else if ("2".equals(num)) {
				menu.select();
			} else if ("3".equals(num)) {
				System.out.print("������ ��ȣ: ");
				int no = Integer.parseInt(br.readLine());
				System.out.print("����: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("����: ");
				String job = br.readLine();

				Person p = new Person(no, null, age, job);
				menu.update(p);
			} else if ("4".equals(num)) {
				System.out.print("������ ��ȣ : ");
				int delNo = Integer.parseInt(br.readLine());
				menu.delete(delNo);

			} else if ("5".equals(num)) {
				System.out.println("�����Ͽ����ϴ�.");
				isOk = false;
				break;
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
		}
	}

	public static void qq() { // �� static�� ����� �ϴ���?
		System.out.println();
		System.out.println("<����޴�>");
		System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
		System.out.print("��ȣ�Է� ===>");
	}
}
