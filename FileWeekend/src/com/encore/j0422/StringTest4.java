package com.encore.j0422;

public class StringTest4 {
	public static void main(String[] args) {
		String str = "JavaProgramming";

		// 특정문자열로 시작하는 체크 boolean str.startsWith(String prefix)
		System.out.println("str은 'Jav'로 시작하는가? " + str.startsWith("Jav"));
		System.out.println("str은 'av'로 시작하는가? " + str.startsWith("av"));

		// 특정문자열로 끝나는지 체크 boolean str.endsWith(String suffix)
		System.out.println("str은 'ing'로 끝나는가? " + str.endsWith("ing"));

		// 특정문자열이 포함되었는지 체크 boolean str.contains(CharSequence s)
		System.out.println("str이 'Pro'를 포함하는가? " + str.contains("Pro"));

		String tel = "010-123-5678";
		// 0123456789012

		// tel값은 02-123-4567 또는 053-123-5656 변경가능

		// 문제) String tel1, tel2, tel3변수를 선언하고 각각 "010", "1234", "5678"을 저장 후
		// 화면에 각 변수의 값을 출력하시오.
		// 힌트: substring()메소드와 indexOf()메소드를 사용.

		// String tel1="010";
		/*
		 * String tel1=tel.substring(0,3);// 0인덱스~2인덱스까지의 부분문자열!! String
		 * tel2=tel.substring(4,8);// 4인덱스~7인덱스까지의 부분문자열!! String
		 * tel3=tel.substring(9);// 9인덱스부터 끝인덱스까지의 부분문자열!!
		 */
		// String tel="010-1234-5678";
		// 0123456789012

		int idx1 = tel.indexOf('-');// 첫번째 '-'에 대한 인덱스 구하기
		// int idx2= tel.indexOf('-',idx1+1);// 두번째 '-'에 대한 인덱스 구하기
		// tel.indexOf(int ch, int fromIndex)
		int idx2 = tel.lastIndexOf('-');// 두번째 '-'에 대한 인덱스 구하기

		String tel1 = tel.substring(0, idx1);// 0인덱스~2인덱스까지의 부분문자열!!
		String tel2 = tel.substring(idx1 + 1, idx2);// 4인덱스~7인덱스까지의 부분문자열!!
		String tel3 = tel.substring(idx2 + 1);// 9인덱스부터 끝인덱스까지의 부분문자열!!

		System.out.println("Tel1=" + tel1);
		System.out.println("Tel2=" + tel2);
		System.out.println("Tel3=" + tel3);

	}// main
}
