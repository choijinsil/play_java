package com.encore.j0422;

public class StringConvertTest {

	public void convert1() {
		String s1 = "우리나라";
		String s2 = "대한민국 만세!!";
		s1 = s1 + s2;
		System.out.println(s1);

		// Striㅎg클래스: 고정길이 문자열()
		// 1. String클레스 겍체 생성
		// 문자열 변환이해서 임시로 StringBuffer클래스 객체 생성
		// 3. append()메소드 호출
		// 4. sttomgBuffer의 객체를 sStrinag 객체로 변환
		// 5. 임시생성된 SrtnigBuffer객체를 소멸
	}
	// Arrays.sort(배열);

	public void convert2() {
		StringBuffer s1 = new StringBuffer("우리나라");
		s1.append("대한민국 만세!!");
		// String Buffer: 가변(길이) 문자열!

		System.out.println(s1);
	}

	public static void main(String[] args) {
		StringConvertTest sct = new StringConvertTest();
		sct.convert1();
		sct.convert2();
	}

}
