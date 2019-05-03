package com.encore.j0418;

class B {
	//@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "안녕비";
//	}
}

public class ToStringTest {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		// 주소값이 다르다.
		// toString 은
		System.out.println("b1= " + b1);
	}
}
