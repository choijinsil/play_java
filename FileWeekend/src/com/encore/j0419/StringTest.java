package com.encore.j0419;

public class StringTest {
// 문자열 String클래스의 기능 살펴보기
	public static void main(String[] args) {
		// String 자바="abc";
		// String str=자바;

		// String 문자열 : 문자들의 나열!!
		String str = "JavaProgramming";

		// 문자열 길이(문자 갯수)
		System.out.println("str문자열길이(문자갯수): " + str.length());

		// 부분문자열 ----> "Pro"문자열 얻기
		System.out.println("str.substring(4,7)=" + str.substring(4, 7));
		// ==> str.substring(4,7) 는 4인덱스~6인덱스 에 해당하는 부분문자열

		// 부분문자열 ----> "Programming"문자열 얻기
		System.out.println("str.substring(4)=" + str.substring(4));
		// str.substring(beginIndex) : 시작인덱스 기준으로 끝인덱스 까지의 문자열

		// 특정인덱스의 문자 얻어오기: char str.charAt(int index)
		System.out.println("str.charAt(4)=" + str.charAt(4));
		// ==> 인덱스의 해당하는 한문자 리턴!!

		// String str="JavaProgramming";
		// 012345678901234

		// 특정문자의 인덱스 얻어오기: int str.indexOf(int ch)
		int index = str.indexOf('a');// 97);//아스키코드 97 은 'a'
		// ==> 'a'문자의 인덱스를 구할 수 있음. 가장 먼저 발견되어지는 a의 인덱스

		System.out.println("index=" + index);
		System.out.println(97 == 'a');// true
		// 컴퓨터는 'a'문자를 내부에서 아스키숫자코드 97로 인식.

		// String str="JavaProgramming";
		// 012345678901234
		// str에서 부분문자열"Programming"을 구하시오.

		// str.substring(4);와 동일하다.
		System.out.println(str.substring(str.indexOf('P')));

		// 세번째 'a'문자의 인덱스를 구하시오
		System.out.println("str.indexOf(am)=" + str.indexOf("am"));

		// 마지막 'a'의 인덱스를 구하시오. (str.lastIndexOf("a") <--뒤에서부터 검사)
		System.out.println("str.lastIndexOf(\"a\")=" + str.lastIndexOf("a"));

		// 문자열 치환(대체)
		System.out.println("str.replace(\"a\", \"o\")=" + str.replace("a", "o"));

		System.out.println(str);
		// JavaProgramming을 자바Programming으로 변경
		System.out.println(str.replace("Java", "자바"));

		// 문자열에 공백추가
		str = "  " + str + "  ";
		System.out.println("공백추가후 STR = " + str);
		System.out.println("공백추가후 STR문자열 길이 = " + str.length());

		// 좌우 공백 제거
		str = str.trim();
		System.out.println("공백제거 후 STR문자열 길이 = " + str.length());
		
		
		// str.replace(char oldChar,char newChar)
	}// main

}