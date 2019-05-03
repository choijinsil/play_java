package com.encore.j0419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ��ȿ�� �˻� - ��ȿ�� ��������?
/*
<NameMenu, NameMenuTest�߰�>
1. ��ȣ�� ���ھƴ� ���� �ԷµǴ� ���ooo
   ȭ�鿡 ----> #��ȣ�� �Է��ϼ���!!
   
2. �ߺ��̸��Է� ����
  ��) "ȫ�浿"�� �迭names�� ����Ǿ� �ִ� ��� ooo
   ȭ�鿡 ----> #�̹� �Էµ� �̸��Դϴ�!!
   
3. ������ �������� ���� �̸��� ���� üũooo
   ȭ�鿡 ----> #�������� �ʴ� �̸��Դϴ�!!
   
4. �迭�� 5���� �̸��� ���� �ԷµǾ��� �� �ʰ� �޽��� ���
   ȭ�鿡 ----> #�� �̻� �Է��� �� �����ϴ�
                           �� �� �̻��� �̸��� ���� ������ �� �Է��ϼ���!!    
                           */
public class NameMenuTest {
	public static void main(String[] args) throws IOException {

		// �ݺ��Ǵ� �޴� ���(ȭ�� �� ó��)
		// readLine �Է¹޴� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isOk;
		String no;
		NameMenu nm = new NameMenu(); // ���۷����޴�

		do {
			System.out.println();
			System.out.println("<�̸��޴�>");
			System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");
			System.out.print("��ȣ�Է� -->");
			no = br.readLine();
			// ��ȣ ���� �ƴ� ���� �ԷµǴ� ��� ��ȣ�� �Է��ϼ���!
			if (!nm.ckNum(no)) {	// if(!nm.matches("[0-9]")) 
				System.out.println("#��ȣ�� �Է��ϼ���!!");
				// return; <-- �޼ҵ� ����
				// break; <-- switch�� �ݺ��� ����
				// continue;  <-- �ݺ����� ��� �����Ѵ�.
				// for��(�����ڸ� ��ģ ���ǹ�), while(���ǽ�����), do~while(���ǽ�����)
			}

			switch (no) { // jdk 7�������� switch���� ���ǰ��� ����.

			case "1":
				// 5�� �Է½� �Է��� �� �� �����ϴ�.
				System.out.print("�̸��Է�: ");
				String name = br.readLine();
				nm.add(name);
				break;

			case "2":
				nm.search();
				break;

			case "3":
				// �ߺ��̸� �Է¹���
				System.out.print("�����̸��Է�: ");
				String oldName = br.readLine();

				System.out.print("�����̸��Է�: ");
				String newName = br.readLine();
				nm.update(oldName, newName);
				break;

			case "4":
				// ���� �̸� üũ
				System.out.print("������ �̸��Է�: ");
				String delName = br.readLine();

				nm.delete(delName);

				break;

			}
		} while (!no.equals("5")); // 1,2,3,4 �Է��ߴٸ�
	}

}
