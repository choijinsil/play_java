package com.encore.j0419;

public class StringTest {
// ���ڿ� StringŬ������ ��� ���캸��
	public static void main(String[] args) {
		// String �ڹ�="abc";
		// String str=�ڹ�;

		// String ���ڿ� : ���ڵ��� ����!!
		String str = "JavaProgramming";

		// ���ڿ� ����(���� ����)
		System.out.println("str���ڿ�����(���ڰ���): " + str.length());

		// �κй��ڿ� ----> "Pro"���ڿ� ���
		System.out.println("str.substring(4,7)=" + str.substring(4, 7));
		// ==> str.substring(4,7) �� 4�ε���~6�ε��� �� �ش��ϴ� �κй��ڿ�

		// �κй��ڿ� ----> "Programming"���ڿ� ���
		System.out.println("str.substring(4)=" + str.substring(4));
		// str.substring(beginIndex) : �����ε��� �������� ���ε��� ������ ���ڿ�

		// Ư���ε����� ���� ������: char str.charAt(int index)
		System.out.println("str.charAt(4)=" + str.charAt(4));
		// ==> �ε����� �ش��ϴ� �ѹ��� ����!!

		// String str="JavaProgramming";
		// 012345678901234

		// Ư�������� �ε��� ������: int str.indexOf(int ch)
		int index = str.indexOf('a');// 97);//�ƽ�Ű�ڵ� 97 �� 'a'
		// ==> 'a'������ �ε����� ���� �� ����. ���� ���� �߰ߵǾ����� a�� �ε���

		System.out.println("index=" + index);
		System.out.println(97 == 'a');// true
		// ��ǻ�ʹ� 'a'���ڸ� ���ο��� �ƽ�Ű�����ڵ� 97�� �ν�.

		// String str="JavaProgramming";
		// 012345678901234
		// str���� �κй��ڿ�"Programming"�� ���Ͻÿ�.

		// str.substring(4);�� �����ϴ�.
		System.out.println(str.substring(str.indexOf('P')));

		// ����° 'a'������ �ε����� ���Ͻÿ�
		System.out.println("str.indexOf(am)=" + str.indexOf("am"));

		// ������ 'a'�� �ε����� ���Ͻÿ�. (str.lastIndexOf("a") <--�ڿ������� �˻�)
		System.out.println("str.lastIndexOf(\"a\")=" + str.lastIndexOf("a"));

		// ���ڿ� ġȯ(��ü)
		System.out.println("str.replace(\"a\", \"o\")=" + str.replace("a", "o"));

		System.out.println(str);
		// JavaProgramming�� �ڹ�Programming���� ����
		System.out.println(str.replace("Java", "�ڹ�"));

		// ���ڿ��� �����߰�
		str = "  " + str + "  ";
		System.out.println("�����߰��� STR = " + str);
		System.out.println("�����߰��� STR���ڿ� ���� = " + str.length());

		// �¿� ���� ����
		str = str.trim();
		System.out.println("�������� �� STR���ڿ� ���� = " + str.length());
		
		
		// str.replace(char oldChar,char newChar)
	}// main

}