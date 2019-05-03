package com.siri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {
	// �̼� �ڹ� �޸��� �����
	// textarea �ִ°� save�ϸ� ����ǰԲ�
	// from to�� �ϸ� �ȴ�.
	
	public static void main(String[] args) throws IOException {
		// a.txt������ �о �� ������ ȭ�鿡 ���
		FileReader fr = new FileReader("a.txt");

		// From<-- �Է� , To<-- ���
		// FileWriter, OutputStream��� ����. �̹��� ��½� OutputStream�� ����ؾ� �Ѵ�.
		FileWriter fw = new FileWriter("b.txt");

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i); // ȭ�����
			fw.write(i);
		}
		
		// ����� ������ ���� �ڿ� ��ȯ�� �ؾ� �Ѵ�.
		fw.close();
		fr.close();
	}
}
