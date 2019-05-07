package com.siri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopySpeedTest {
	// ����Ʈ ���� �����
	FileInputStream fis;
	FileOutputStream fos;

	// ���ڴ��� �����
	FileReader fr;
	FileWriter fw;

	// ���δ��� ����� <-- ���ڵ��� ���ۿ� ��Ҵٰ� �ѹ��� �а� ����
	BufferedReader br;
	BufferedWriter bw;

	// 4) ����Ʈ ���� �����(byte�迭 ���)
	FileInputStream fis2;
	FileOutputStream fos2;

	public FileCopySpeedTest() throws Exception {
		fis = new FileInputStream("a.txt");// FROM
		fos = new FileOutputStream("b.txt");// TO
		// fis.read()//�� ����Ʈ �б�
		int i;

		long start = System.currentTimeMillis();
		while ((i = fis.read()) != -1) {// ���� ����Ʈ�� �ִٸ�
			fos.write(i);
			// b.txt���Ͽ� ��� ������
		}
		long end = System.currentTimeMillis();

		System.out.println("[byte����]���Ϻ��� ����!!^^*: " + (end - start));

		fos.close();// ����°�ü �ڿ� ��ȯ (�ٸ� ��� �Ǵ� �������α׷����� ����� �� �ֱ� ������)
		fis.close();// ����°�ü �ڿ� ��ȯ
		// =====================<���ڴ��� �����>=============================
		fr = new FileReader("a.txt");
		fw = new FileWriter("b.txt");

		start = System.currentTimeMillis();
		while ((i = fr.read()) != -1) {
			fw.write(i);
			// ��� ��� i(�� �ش��ϴ� ����)�� �о
		}
		end = System.currentTimeMillis();

		System.out.println("[���ڴ���]���Ϻ��� ����!!^^*: " + (end - start));
		fw.close();
		fr.close();
		// =====================<���۴��� �����>=============================
		br = new BufferedReader(new FileReader("a.txt"));
		bw = new BufferedWriter(new FileWriter("b.txt"));

		String str;

		start = System.currentTimeMillis();
		while ((str = br.readLine()) != null) {// ���� ������ �ִٸ�
			bw.write(str);
			// 2. b.txt���Ͽ� ��� 1.str�� �о
		}
		end = System.currentTimeMillis();
		System.out.println("[���ۻ��]���Ϻ��� ����!!^^*: " + (end - start));

		bw.close();
		br.close();

		// =====================<����Ʈ���� �����>=============================
		fis2 = new FileInputStream("a.txt");
		fos2 = new FileOutputStream("b.txt");

		byte[] b = new byte[1024];
		start = System.currentTimeMillis();
		while ((i = fis2.read(b)) != -1) {
			// a.txt�� �о b�迭�� ����
			fos2.write(b, 0, i);
			// b�迭�� �о b.txt�� ����
			
		}
		end = System.currentTimeMillis();
		System.out.println("[����Ʈ����, �迭���]���Ϻ��� ����!!^^*: " + (end - start));
		fos2.close();
		fis2.close();

	}

	public static void main(String[] args) throws Exception { // ***
		// ���� ����� ���翡 �ɸ��� �ð��� üũ
		// a.txt ������ �о b.txt: FileCopy
		new FileCopySpeedTest();
	}
}
