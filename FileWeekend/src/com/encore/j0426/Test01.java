package com.encore.j0426;

class A {
	// 가까운데부터 찾는다 없으면 부모없으면 부모
	// gui swing
	@Override
	public String toString() {

		return "A클래스안녕";
	}
}

public class Test01 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
	}
}
