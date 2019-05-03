package com.encore.j0424;

class NestingClass {

	int i = 11;

	void hello() {
		// 내부클래스 자원 사용
		System.out.println("안냥?");
		NestedClass nc = new NestedClass();
		nc.print();
	}
	// -----------------------------------------------

	class NestedClass { // 내부클래스
		int j = 22;

		void print() {
			System.out.println("프린트!!");
		}

		// 외부 클래스 자원을 내것처럼 사용
		void callTest() {
			hello();
			System.out.println("i= " + i);
		}
	}
}

public class NestedClassTest {

	public static void main(String[] args) { // 내부클래스 테스트
		// 외부클래스 - int i, hello, 내부클래스
		// 내부클래스 - int j, print(), callTest()
		NestingClass nesting = new NestingClass();
		nesting.hello();
		System.out.println("======================");
		// 내부클래스 메소드를 메인에서 직접 호출
		NestingClass.NestedClass innerN = new NestingClass().new NestedClass();
		innerN.print();
	}

}
