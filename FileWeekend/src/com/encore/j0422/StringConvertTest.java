package com.encore.j0422;

public class StringConvertTest {

	public void convert1() {
		String s1 = "�츮����";
		String s2 = "���ѹα� ����!!";
		s1 = s1 + s2;
		System.out.println(s1);

		// Stri��gŬ����: �������� ���ڿ�()
		// 1. StringŬ���� ��ü ����
		// ���ڿ� ��ȯ���ؼ� �ӽ÷� StringBufferŬ���� ��ü ����
		// 3. append()�޼ҵ� ȣ��
		// 4. sttomgBuffer�� ��ü�� sStrinag ��ü�� ��ȯ
		// 5. �ӽû����� SrtnigBuffer��ü�� �Ҹ�
	}
	// Arrays.sort(�迭);

	public void convert2() {
		StringBuffer s1 = new StringBuffer("�츮����");
		s1.append("���ѹα� ����!!");
		// String Buffer: ����(����) ���ڿ�!

		System.out.println(s1);
	}

	public static void main(String[] args) {
		StringConvertTest sct = new StringConvertTest();
		sct.convert1();
		sct.convert2();
	}

}
