package com.encore.j0422;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "JavaProgramming";

		// Ư�����ڿ��� �����ϴ� üũ boolean str.startsWith(String prefix)
		System.out.println("str�� 'Jav'�� �����ϴ°�? " + str.startsWith("Jav"));
		System.out.println("str�� 'av'�� �����ϴ°�? " + str.startsWith("av"));

		// Ư�����ڿ��� �������� üũ boolean str.endsWith(String suffix)
		System.out.println("str�� 'ing'�� �����°�? " + str.endsWith("ing"));

		// Ư�����ڿ��� ���ԵǾ����� üũ boolean str.contains(CharSequence s)
		System.out.println("str�� 'Pro'�� �����ϴ°�? " + str.contains("Pro"));

		String tel = "010-123-5678";
		// 0123456789012

		// tel���� 02-123-4567 �Ǵ� 053-123-5656 ���氡��

		// ����) String tel1, tel2, tel3������ �����ϰ� ���� "010", "1234", "5678"�� ���� ��
		// ȭ�鿡 �� ������ ���� ����Ͻÿ�.
		// ��Ʈ: substring()�޼ҵ�� indexOf()�޼ҵ带 ���.

		// String tel1="010";
		/*
		 * String tel1=tel.substring(0,3);// 0�ε���~2�ε��������� �κй��ڿ�!! String
		 * tel2=tel.substring(4,8);// 4�ε���~7�ε��������� �κй��ڿ�!! String
		 * tel3=tel.substring(9);// 9�ε������� ���ε��������� �κй��ڿ�!!
		 */
		// String tel="010-1234-5678";
		// 0123456789012

		int idx1 = tel.indexOf('-');// ù��° '-'�� ���� �ε��� ���ϱ�
		// int idx2= tel.indexOf('-',idx1+1);// �ι�° '-'�� ���� �ε��� ���ϱ�
		// tel.indexOf(int ch, int fromIndex)
		int idx2 = tel.lastIndexOf('-');// �ι�° '-'�� ���� �ε��� ���ϱ�

		String tel1 = tel.substring(0, idx1);// 0�ε���~2�ε��������� �κй��ڿ�!!
		String tel2 = tel.substring(idx1 + 1, idx2);// 4�ε���~7�ε��������� �κй��ڿ�!!
		String tel3 = tel.substring(idx2 + 1);// 9�ε������� ���ε��������� �κй��ڿ�!!

		System.out.println("Tel1=" + tel1);
		System.out.println("Tel2=" + tel2);
		System.out.println("Tel3=" + tel3);

	}// main
}
