package com.encore.j0418;

class B {
	//@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "�ȳ��";
//	}
}

public class ToStringTest {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		// �ּҰ��� �ٸ���.
		// toString ��
		System.out.println("b1= " + b1);
	}
}
