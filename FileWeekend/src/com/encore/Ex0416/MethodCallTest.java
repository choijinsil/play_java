package com.encore.Ex0416;

public class MethodCallTest {

	public static void main(String[] args) {
		A a = new A();
		a.hello();

		int su = 100;
		String name = "�浿";
		a.m1(su);
		a.m2(name);

		String name2 = "�����";
		int age = 15;
		a.m3(age, name2);

		int[] suArr = { 11, 22, 33 };
		a.m5(suArr);

		String name3 = "���ֿ�";
		int age2 = 10;
		String job = "�л�";
		a.m6(name3, age2, job);

		Person p = new Person();
		p.setName(name3);
		p.setAge(age2);
		p.setJob(job);

		Person p2 = new Person(name3, age2, job);

		a.m6_2(p);

		Person p1 = new Person("�ʱ浿", 15, "�л�");
		Person p3 = new Person("������", 17, "�л�");

		Person[] persons = { p1, p2, new Person("���ֿ�", 19, "�л�") };

		int num = a.m11();
		System.out.println("���: " + num);

		int[] suArray = a.m13();
		System.out.println("���..");

		for (int i = 0; i < suArray.length; i++) {
			System.out.println(suArray[i]);
		}

		Person pp = a.m14();
		System.out.println("�̸�: " + pp.getName());
		System.out.println("�̸�: " + pp.getAge());
		System.out.println("�̸�: " + pp.getJob());

		My2 m = a.m15();
		int ju = m.juwon();
		System.out.println(ju);

		Person[] per = a.m16();
		for (int i = 0; i < per.length; i++) {
			System.out.println("�̸�: " + per[i].getName());
			System.out.println("����: " + per[i].getAge());
			System.out.println("����: " + per[i].getJob());
		}
	}

}
