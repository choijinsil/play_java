package com.encore.j0415;

public class A {
	// 맴버변수(필드) - 클래스 안에 직접 선언되어있는 변수
	// 기본값을 갖는다. 기본값: 0, 0.0, false, null (메모리할당이 아직 안되었음)
	String str; // 멤버변수

	A() { // 기본생성자 ( 인자가 없는 경우 )
		this("자바");
		System.out.println("기본생성자");
	}

	A(String str) { // 매개변수가 들어가는 경우를 오버로딩 생성자, str=지역변수
		System.out.println("오버로딩생성자");
		this.str = str; // <-- 맴버 변수를 표현한다는 것
		// this가 붙은 것은 클래스에 선언된 변수를 뜻한다.
		// 종종 이름을 같이 쓰는 경우가 있기에 this.를 사용한다.
		// this붙은 것은 맴버 변수를 뜻하고
		// =str은 지역변수를 의미한다.
		// 생성자끼리 호출관계를 가질 수 있다.
	}
}