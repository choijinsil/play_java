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
		// 출력객체들은 flush()메소드 갖음. (참고, 입력객체는 flush() 메소드 없음)
		// flush <-- 버퍼를 비우는 역할, 버퍼의 내용을  push하는 역할

//		char[] ch = str.toCharArray();
//
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
//		String str2 = new String(ch);
//		System.out.println(str2);

	}
}
