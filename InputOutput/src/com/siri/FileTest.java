package com.siri;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		/*
		 * <���ǥ�� ���> - ��ü���(����̺��� �߰� ������� ��ü, ������), ������� ���, ������ ��� - �ڹ��� ��δ� '��ü���'��
		 * �⺻!! ----> ImageIcon("���"); ----> ImageIcon("image/left.gif"); ---> ��Ŭ������
		 * ������Ʈ �� JavaProject������ ���� - �ڹ��� ��ξ��� ���ڴ� ��ҹ��ڸ� �������� ����.
		 * 
		 */

		// ������ �Ӽ��� ������ Ŭ����
		// File f = new File(String path);
		// File f = new File("a.txt");
		File f = new File("E:\\Siris\\workspaces\\eclipse-workspace");// �⺻
		// '\\' ---> '\'�� Ȯ��(���)���ڰ� �ƴ϶� ���ϰ� ���丮�� �����ϴ� ������ ���ڷ� ���!!

		System.out.println("f����(���丮)���� ����: " + f.exists());

		File f2 = new File("E:\\Siris\\workspaces\\eclipse-workspace\\FileWeekend\\a.txt");
		f2 = new File("a.txt");
		f2 = new File("."); // . ���: current directory(���� ������Ʈ�� ���)
		f2 = new File(".."); // .. ���: parent directory( �θ���)
		f2 = new File("../.."); // .. ���: parent directory( �θ���)
		System.out.println("f2.getPath(): " + f2.getPath());
		System.out.println("f2.getAbsolutePath(): " + f2.getAbsolutePath());
		System.out.println("f2.getCanonicalPath(): " + f2.getCanonicalPath());
		System.out.println();

		// b.txt ���� �Ӽ� ����
		// File f3 = new File("src/com/siri/b.txt");
		File f3 = new File("bin/com/siri/b.txt");
		System.out.println("f3����(���丮) �������� " + f3.exists());
		// E:\Siris\workspaces\eclipse-workspace\InputOutput\src
		if (f3.isFile()) {
			System.out.println("f3�� ����!");
		}

		if (f3.isDirectory()) {
			System.out.println("f3�� ���丮(����)!");
		}

		// song������ c.txt������ �����ض�
		// ** FileWriter, FileOutputStream�� ������ �����ϴ� ����� ���´�.
		// new FileReader("c.txt"); // �б� ��ü�� ��� ��õ� ������ ���ٸ� ������ �߻��Ѵ�.
		// new FileWriter("c.txt"); // ���� ������ ��� ���� ����
		// new FileWriter("song/c.txt"); // �������� �ʴ� ������ ���� ���� �߻�, ���������� �����ؾ� �Ѵ�.
		String path = "song/gildong/juwon";
		String fileName = "c.txt";
		File f4 = new File(path);

		if (f4.exists()) { // f4�� �����մϱ�?
			System.out.println("���丮�� �̹� �����մϴ�.");
		} else { // ������ �������� �ʴ´ٸ�?
			f4.mkdirs();
			System.out.println("# ���丮�� ���� ������! ");
		}

		FileWriter fw = new FileWriter(path + "/" + fileName);
		fw.close(); // �ڿ� ��ȯ
		// ��õ� ������ ���� !

		// File�� Database �������? �����͸� ���������� ����, �����ϱ� ���ؼ�
		// File�� DB������? �����͸� ����!
		File f5 = new File("song/gildong/juwon/c.txt");
		System.out.println("c.txt���ϻ���: " + f5.delete()); // ������ �ȵ� ��? fw�� ������ �ֱ� ������
		
		// juwon���� ����
		// ���� ���� �� ������ ���� �ȿ� �ִ� ���ϱ��� �Բ� ������� ������?
		File f6 = new File("song/gildong/juwon");
		System.out.println("f6���丮 ����: "+f6.delete());
		// --> �� ���� ���� ����!
		
	}

}
