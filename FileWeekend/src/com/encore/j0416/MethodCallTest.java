package com.encore.j0416;

// �޼ҵ带 ��Ƹ���
public class MethodCallTest {
	public static void main(String[] args) {
		A a = new A();
		a.hello();

		// �߿�! ���Ǵ� �޼ҵ� ȣ���� ����
		// ���� �޼ҵ� ������ �߻� ������ : 100
		int su = 100;
		String name = "���浿";
		// m1() �޼ҵ忡�� su�� �����ϰ� �ʹ�.
		a.m1(su);// �޼ҵ� ȣ��() �Ұ�ȣ �ȿ� ������ ǥ��

		a.m2(name);

		String name2 = "�����";
		int age = 15;
		a.m3(age, name2);

		int i = 10;
		int j = 20;
		int k = 30;
		// m4�޼ҵ忡�� ������ 10, 20, 30 ����!
		a.m4(i, j, k);

		int[] suArr = { 11, 22, 33 };
		a.m5(suArr);

		String name3 = "���ֿ�";
		int age2 = 10;
		String job = "�л�";
		a.m6(name3, age, job);

		Person p = new Person();
		p.setName(name3);
		p.setAge(age2);
		p.setJob(job);
		// <-- 3���� �����Ͱ� p��� �Ѱ��� ���������� ��������.

		Person p2 = new Person(name3, age2, job);
		// ���� �Ͱ� �Ʒ� �Ͱ� ���� �ڵ��̴�.

		a.m6_2(p); // ������ �����Ͱ� ���ÿ� ������ �ȴ�.

		Person p1 = new Person("�ʱ浿", 15, "�л�");
		Person p3 = new Person("������", 17, "�л�");

		// �迭��) �ڷ��� []�迭�� = {value_list};
		Person[] persons = { p1, p2, new Person("���ֿ�", 19, "�л�") }; // �� 9���� ���� 3���� ���� �ذ� �迭 �ȿ� �迭�� �������ִ�.

		int num = a.m11();
		System.out.println("���: " + num);

		int[] suArray = a.m13();
		System.out.println("���...");

		// �迭 == ��ü! , �������� <-- ���������� �����͵� ��� �ɹ��ʵ� �޼ҵ带 ����Ҽ� �ִ�. .�� ����Ͽ�
		for (int l = 0; l < suArray.length; l++) {
			System.out.println("suArray[0]= " + suArray[l]);
		}

		Person pp = a.m14();
		System.out.println("�̸�: " + pp.getName());
		System.out.println("����: " + pp.getAge());
		System.out.println("����: " + pp.getJob());

		My m = a.m15(); // My m�� ���Ӱ� ������ ��
		int ju = m.juwon();
		System.out.println("ju=" + ju);

		Person[] per = a.m16();
		for (int z = 0; z < per.length; z++) {
			// p1 == per[0]
			// p2 == per[1]
			System.out.println("�̸�: " + per[z].getName());
			System.out.println("����: " + per[z].getAge());
			System.out.println("����: " + per[z].getJob());
		}

	}

}
