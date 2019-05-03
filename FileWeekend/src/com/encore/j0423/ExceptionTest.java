package com.encore.j0423;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 <�ڹ�I/O�� 4�� Ŭ����>
 
 �ڹ�IO�� �߻�Ŭ����
 
 �б� InputStream(byte����)    Reader(���ڴ���) 
 ���� OutputStream                 Writer(���ڴ���)
 */
public class ExceptionTest {
	public static void main(String[] args) {
		// �ؽ�Ʈ����(a.txt)�� �о �� ������ �ܼ�(�����)�� ����Ѵ�.
		// a.txt�� FileWeekend�� �߰��Ѵ�. ��Ű���� ���� �ʵ��� ����!

		try {
			FileReader fr = new FileReader("a.txt");
			/*
			 * System.out.println(fr.read()); System.out.println(fr.read());
			 * System.out.println(fr.read()); System.out.println(fr.read());
			 */
			int i;
			while ((i = fr.read()) != -1) { // ���� ���ڰ� �ִٸ�
				System.out.print((char) i);
			}
			System.out.println("# ���� �б� ����^^ ");
		} catch (FileNotFoundException e) {
			System.out.println("���ϰ�θ� Ȯ���ϼ���");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("����¿����� �߻��߽��ϴ�.");
			// e.printStackTrace();
		}
	}
}
