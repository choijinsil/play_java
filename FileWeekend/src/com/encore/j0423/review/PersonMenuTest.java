package com.encore.j0423.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMenuTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num;
		PersonMenu menu = new PersonMenu();

		do {
			System.out.println("<����޴�");
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
			System.out.print("��ȣ�Է� ===>");
			num = br.readLine(); // 1~5������ ���ڿ� �Է��� �޴´�.

			switch (num) {
			case "1": {
				System.out.print("�̸�: ");
				String name = br.readLine();
				System.out.print("����: ");
				int age = Integer.parseInt(br.readLine());
				System.out.print("����: ");
				String job = br.readLine();
//				String[] arr= {name,age,job};
//				menu.insert(name,age,job);
				Person p = new Person(0, name, age, job);
				menu.insert(p);
				// �޼ҵ��() <-- �޼ҵ� ȣ�� ȣ��ڿ��� ������
			}
				break;
			case "2":
				menu.select();
				break;
			case "3":
				System.out.print("������ ��ȣ: ");
				int no = Integer.parseInt(br.readLine());
				System.out.print("����: ");
				int age = Integer.parseInt(br.readLine()); // case1���� �̹� age�� job�� ����ϱ� ������ �̸��� �ٲٴ���, case1�� ��ȣ�� �ݾ��ִ���!
				System.out.print("����: ");
				String job = br.readLine();

				// ������ ���� ������ �Ѻ����� ���´�.
				// Person p = new Person(no,null, age, job); // ���� ���� ���ڴ� null�� ���ų� �Ʒ�ó�� �����Ͽ�
				// �����͸� �����ص��ȴ�.
				Person p = new Person();
				p.setNo(no);
				p.setAge(age);
				p.setJob(job);
				menu.update(p); // 3, null, 19, "�屺"
				break;

			case "4":
				
				System.out.print("������ ��ȣ : ");
				int delNo = Integer.parseInt(br.readLine());
				menu.delete(delNo);
				break;
			case "5":

			}
		} while (!num.equals("5"));
		System.out.println("--- END ---");

	}

}
