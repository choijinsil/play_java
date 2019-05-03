package com.encore.Ex0415;

public class CallTest {

	public static void main(String[] args) {
		A a = new A();

		String name = "siri";
		int age = 11;
		String job = "student";
		String addr = "seoul";
		String pNum = "0108787xxx";

		Person p = new Person(name, age, job, addr, pNum);
		a.mm(p);
	}
}
