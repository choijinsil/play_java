package com.encore.Ex0416;

public class A {
	// 1. a, 2. Person 3. Method
	public void hello() {
		System.out.println("aŬ������ �ȳ�?");
	}

	public void m1(int su) {
		System.out.println("m1() : " + su);
	}

	public void m2(String name) {
		System.out.println("m2() : " + name);
	}

	public void m3(int age, String name2) {
		System.out.println(name2 + "," + age);
	}

	public void m4(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	public void m5(int[] suArr) {
		for (int i = 0; i < suArr.length; i++) {
			System.out.print(suArr[i] + ",");

		}
	}

	public void m6(String name, int age, String job) {
		System.out.println(name + "," + age + "," + job);
	}

	public void m6_2(Person p) {
		System.out.println("�ڹٺ��� ���: " + p.getName() + "," + p.getAge() + "," + p.getJob());
	}

	public int m11() {
		System.out.println("m11() ");
		int su = 120;
		return su;
	}

	public String m12() {
		System.out.println("m12()");
		String name = "������";
		return name;
	}

	public int[] m13() {
		int ii = 50;
		int jj = 60;
		int kk = 70;
		int[] su = { ii, jj, kk };
		return su;
	}

	public Person m14() {
		System.out.println("m14 ��");
		String name = "������";
		int age = 14;
		String job = "ȭ��";
		Person p = new Person(name, age, job);
		return p;
	}

	public My2 m15() {
		My2 m = new My2();
		return m;
	}

	public Person[] m16() {
		System.out.println();
		System.out.println("m16ȣ�� ����");
		Person p1 = new Person("������", 15, "ȭ��");
		Person p2 = new Person("�̼���", 15, "�屺");
		Person p3 = new Person("ȫ�浿", 15, "��½");

		Person[] p = { p1, p2, p3 };
		return p;
	}

}
