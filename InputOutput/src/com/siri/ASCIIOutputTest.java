package com.siri;

public class ASCIIOutputTest {
	public static void main(String[] args) {
		
		ASCIIGetByTest();
	}

	public static void ASCIIGetByTest() {
		String str = "hi java stream!!!";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.write(b[i]);
			if(i%3==2) {
				System.out.write('\n');
			}
			System.out.flush();
		}
		// ��°�ü���� flush()�޼ҵ� ����. (����, �Է°�ü�� flush() �޼ҵ� ����)
		// flush <-- ���۸� ���� ����, ������ ������  push�ϴ� ����

//		char[] ch = str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
//		String str2 = new String(ch);
//		System.out.println(str2);

	}
}
