package com.encore.Ex0416;

public class MyTest {

	public static void main(String[] args) {
		My2 my2 = new My2();
		my2.juwon(); // ���ϰ��� ������ 300�� ���
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
//		a.hello(); // <--null.hello() <-- NullPointerException�߻�
//
//		a = new A(); // a���� �޸� �ּ������� ����
//		a.hello(); // ���� Ok
//	}
//
//	public static void main(String[] args) {
//		Test t = new Test();
//		t.print();
//	}
//}
