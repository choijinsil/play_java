package com.encore.Ex0416;

public class MethodCallTest {

	public static void main(String[] args) {
		A a = new A();
		a.hello();

		int su = 100;
		String name = "길동";
		a.m1(su);
		a.m2(name);

		String name2 = "길라임";
		int age = 15;
		a.m3(age, name2);

		int[] suArr = { 11, 22, 33 };
		a.m5(suArr);

		String name3 = "김주원";
		int age2 = 10;
		String job = "학생";
		a.m6(name3, age2, job);

		Person p = new Person();
		p.setName(name3);
		p.setAge(age2);
		p.setJob(job);

		Person p2 = new Person(name3, age2, job);

		a.m6_2(p);

		Person p1 = new Person("너길동", 15, "학생");
		Person p3 = new Person("차라임", 17, "학생");

		Person[] persons = { p1, p2, new Person("고주원", 19, "학생") };

		int num = a.m11();
		System.out.println("결과: " + num);

		int[] suArray = a.m13();
		System.out.println("결과..");

		for (int i = 0; i < suArray.length; i++) {
			System.out.println(suArray[i]);
		}

		Person pp = a.m14();
		System.out.println("이름: " + pp.getName());
		System.out.println("이름: " + pp.getAge());
		System.out.println("이름: " + pp.getJob());

		My2 m = a.m15();
		int ju = m.juwon();
		System.out.println(ju);

		Person[] per = a.m16();
		for (int i = 0; i < per.length; i++) {
			System.out.println("이름: " + per[i].getName());
			System.out.println("나이: " + per[i].getAge());
			System.out.println("직업: " + per[i].getJob());
		}
	}

}
