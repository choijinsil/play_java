package com.encore.j0422;

public class StringTest2 {

	public static void main(String[] args) {
		/*
		 * byte < --���� ������ ���� �ڵ带 ��°����� ����Ѵ�. ���ڿ� ���εǴ� ������ ���ڸ� �����ϴ� �뵵�� ����ϱ� �����̴�. int��
		 * ���� ���� ������ ���α׷� ���� 2byte�� �Ѿ�� ��Ȳ�� ����ϱ� ���� ���̴�.
		 * 
		 */
		String str = "abc";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println("b���~~! = " + b[i]);
		}
		
		System.out.println("===============");
		String str2 = new String(b);
		System.out.println(str2);
		System.out.println("===============");
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(ch[i]);
		}

		// �������� ��Ģ - Ŭ������ �̸��� ���� ���� Ÿ���� ������� �ʴ´�.

	}

}
