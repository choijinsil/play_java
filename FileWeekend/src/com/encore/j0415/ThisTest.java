package com.encore.j0415;

// 저장파일명.class에만 public을 붙일 수 있다.
public class ThisTest {
	// 한개의 파일에 두개이상의 클래스를 정의하는 경우
	// 저장파일명에 해당하는 클래스앞에만 public과 같은 접근제한자를 명시할 수 있다.

	public static void main(String[] args) {
		A a = new A(); // 기본생성자 호출
		System.out.println("기본 STR=" + a.str);

		System.out.println("============");

		A a2 = new A("파이썬");
		System.out.println("오버로딩STR=" + a2.str);
	}
}
