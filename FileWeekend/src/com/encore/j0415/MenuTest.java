package com.encore.j0415;
import java.io.IOException;

// ��Ű�� ����
// ����Ʈ ����

public class MenuTest {

	// public, protected, default, private
	public static void main(String[] args) throws IOException {
		int num = 0; // �⺻���� �ݵ�� �־���� �Ѵ�. ���� �����̱� ������

		do {
			System.out.println("<<�޴�>>");
			System.out.println("1.�˻� 2.���� 3.���� 4.����");
			System.out.println("��ȣ--->");
			num = System.in.read() - 48; // ��ȣ �Է�
			System.in.read();
			System.in.read();

			switch (num) {

			case 1:
				System.out.println("#�˻����: " + num);
				break;
			case 2:
				num++;
				System.out.println("1�����Ͽ����ϴ�.");
				break;
			case 3:
				num--;
				System.out.println("1�����Ͽ����ϴ�.");
				break;
			}
			System.out.println();

		} while (num != 4); // ��ȯ�� ����
		System.out.println("--------END--------");

	}
}
