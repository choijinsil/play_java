package com.encore.j0416;

public class A {
	// �޼ҵ� ����
	public void hello() {
		System.out.println("AŬ���� �ȳ�?");
	}
	// �޼ҵ� �Ķ���� �׽�Ʈ m1~m6
	// �޼ҵ� ���࿡ �ʿ��� �����͸� �ܺο��� ���޹ޱ� ���� �Ű������� �����Ѵ�.

	public void m1(int su) {
		System.out.println("m1(): " + su);
	}

	public void m2(String name) {
		// main�޼ҵ忡 a.m2("���浿") ����Ǹ�
		// m2������ String name="���浿" ��
		// ������� �����
		System.out.println("m2(): " + name);
	}

	public void m3(int age, String name2) {
		System.out.println("�̸�: " + name2 + ", ����: " + age);
	}

	public void m4(int i, int j, int k) { // �̾ȿ� ������ �޾Ҵ�!
		System.out.println(i + "," + j + "," + k);

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
		// �޼ҵ� ����ȣ ������ �ݵ�� return���� ��ġ�ؾ� �Ѵ�.
		// �� ��������Ͱ� ������(return�����Ͱ� ������)�� ������ ������.
	}

	// ���ϵ����� �׽�Ʈ m11~
	// �ܺο� �����ϱ� ���� �ڷ��� ����
	// �޼ҵ忡�� ���� �������� ����

	public int m11() {
		System.out.println("m11()");
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

		// return�� ; ���̿��� �����Ͱ� �Ѱ� ��ġ�ؾ� �Ѵ�.
		// return ii,jj,kk <-- ���뿡��
	}

	public Person m14() {
		System.out.println("m14��");
		String name = "������";
		int age = 14;
		String job = "ȭ��";

		// ���� ���� ������ p�� ����ش�.
		Person p = new Person(name, age, job);
		return p;
	}

	public My m15() {
		My m = new My();

		return m;
	}

	public Person[] m16() {
		System.out.println();
		System.out.println("m16ȣ�� ����");
		Person p1 = new Person("������", 15, "ȭ��");
		Person p2 = new Person("�̼���", 25, "�屺");
		Person p3 = new Person("ȫ�浿", 22, "��½");

		// p1~p3���� ���� �迭
		Person[] p = { p1, p2, p3 };
		return p;
	}

}
