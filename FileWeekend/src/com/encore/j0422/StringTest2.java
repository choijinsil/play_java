package com.encore.j0422;

public class StringTest2 {

	public static void main(String[] args) {
		/*
		 * byte < --문자 고유의 숫자 코드를 담는것으로 사용한다. 문자에 매핑되는 고유의 숫자를 저장하는 용도로 사용하기 때문이다. int를
		 * 많이 쓰는 이유는 프로그램 사용시 2byte를 넘어서는 상황을 대비하기 위한 것이다.
		 * 
		 */
		String str = "abc";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println("b출력~~! = " + b[i]);
		}
		
		System.out.println("===============");
		String str2 = new String(b);
		System.out.println(str2);
		System.out.println("===============");
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < b.length; i++) {
			System.out.println(ch[i]);
		}

		// 생성자의 규칙 - 클래스와 이름이 같고 리턴 타입을 명시하지 않는다.

	}

}
