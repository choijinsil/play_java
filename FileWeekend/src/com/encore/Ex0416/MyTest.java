package com.encore.Ex0416;

public class MyTest {

	public static void main(String[] args) {
		My2 my2 = new My2();
		my2.juwon(); // 리턴값이 있으니 300이 출력
		int su = my2.juwon();
		You you = new You();
		you.lime(su);
	}
}

//class A {
//	void hello() {
//
//	}
//}
//
//class Test {
//	A a;// null
//
//	void print() {
//		a.hello(); // <--null.hello() <-- NullPointerException발생
//
//		a = new A(); // a에는 메모리 주소정보가 저장
//		a.hello(); // 실행 Ok
//	}
//
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.print();
//	}
//}
