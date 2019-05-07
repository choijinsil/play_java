package com.siri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteArrayInOutTest {

	public static void main(String[] args) throws Exception {
		// �ڹ� ������� �⺻
		// �̹���, ��������, ������ ���Ͽ� ���� ����¿� ����.
		FileInputStream fis = new FileInputStream("c.txt"); // ����: abcd
		FileOutputStream fos = new FileOutputStream("d.txt");

		byte[] b = new byte[2];
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
		System.out.println("======="); // <-- c.txt������ �о b�迭�� ����, ����: ���� ����Ʈ ��
		System.out.println(fis.read(b)); // -1, �ϱत ����Ʈ�� ���ٸ�

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
		System.out.println(fis.read(b));

		// offset<-- ���°���� ���ڸ� ������
		// fis,write(offset���� �����ؼ� length��ŭ)
		byte[] b2 = { 97, 98, 99, 100, 101 };
		// fos.write(b2);
		// fos.write(b2,0,3);//0�ε��� ���� 3��!!
		fos.write(b2, 1, 2);// 1�ε��� ���� 2��!!
	}

}
