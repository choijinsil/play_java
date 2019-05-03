package com.encore.j0419;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JaVA";

		// ���ڿ� s1, s2 ���Ͻÿ�
		System.out.println(s1.equals(s2));

		// ��ҹ��� ���о��� s1�� s2ö�ڸ� ���Ͻÿ�
		System.out.println("��ü�ҹ���(s1,s2) ������ �� = " + s1.toLowerCase().equals(s2.toLowerCase()));
		System.out.println("��ҹ��� ���о��� s1�� s2 ��=" + s2.equals(s1.toUpperCase()));

		// ��ҹ��� �����ϰ� ���ڿ� �� equalsIgnoreCase
		System.out.println("��ҹ��� ���о��� ���ڿ� �� = " + s1.equalsIgnoreCase(s2));

		// ����. str ���ڿ� �ȿ� �ִ� ������ ������ ȭ�鿡 ���
		String str = "Java3pro7gra9mm0ing"; // <-- ȭ�鿡 '4'��� �����̿��� �Ѵ�.
		/*
		 * '0' ---> 48 '1' ---> 49 '9' ---> 57 'a' --->97
		 */

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
			// ������ �ƽ�Ű�ڵ尪 (48 ~ 57)
			if (ch >= '0' && ch <= '9') {
				// ���ڷ� ������ ���ڶ��(0-9)
				cnt++;
			}
		}
		System.out.println("������ ����: "+cnt);
	}	
}
