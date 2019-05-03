package com.encore.j0419;

public class StringTest2 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "JaVA";

		// 문자열 s1, s2 비교하시오
		System.out.println(s1.equals(s2));

		// 대소문자 구분없이 s1과 s2철자를 비교하시오
		System.out.println("전체소문자(s1,s2) 변경후 비교 = " + s1.toLowerCase().equals(s2.toLowerCase()));
		System.out.println("대소문자 구분없이 s1과 s2 비교=" + s2.equals(s1.toUpperCase()));

		// 대소문자 무시하고 문자열 비교 equalsIgnoreCase
		System.out.println("대소문자 구분없이 문자열 비교 = " + s1.equalsIgnoreCase(s2));

		// 문제. str 문자열 안에 있는 숫자의 갯수를 화면에 출력
		String str = "Java3pro7gra9mm0ing"; // <-- 화면에 '4'출력 동적이여야 한다.
		/*
		 * '0' ---> 48 '1' ---> 49 '9' ---> 57 'a' --->97
		 */

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
			// 숫자의 아스키코드값 (48 ~ 57)
			if (ch >= '0' && ch <= '9') {
				// 숫자로 구성된 문자라면(0-9)
				cnt++;
			}
		}
		System.out.println("숫자의 개수: "+cnt);
	}	
}
