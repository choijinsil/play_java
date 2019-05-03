package com.encore.j0422;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector(5, 3); // ���� 5��� ���ڰ� �������
		// ������ <-- element(���)
		System.out.println("vector�� �뷮: " + v.capacity());
		System.out.println("vector�� ��� ����: " + v.size()); // �� �����ʹ� ��������.

		// ���ʹ� ��ü�� ����(a, new A())�� ��� �迭
		Integer su = new Integer(1); // ����1�� �޸𸮿� �ְ� �޸𸮸� ����Ű�� ���۷��� ���� ��� �Ѵ�.
		int su2 = 2;
		v.addElement(su);
		v.addElement(su2);

		System.out.println("�����ڷ�����: " + v.get(1).getClass());

		for (int i = 3; i < 10; i++) {
			v.addElement(i);
		}
		v.addElement(true);
		v.addElement(3.14);
		v.addElement("�ڹ�");
		// ���� �������� Ÿ���� ���� �� �ִ� ������ object�� �ڽĵ��̶�,,
		// vector�� object�� ��� Ŭ���� �̱� ������ ���� �����͸� ���� �� �ִ�.

		// ���;��� ������ ���Կ���
		if (v.contains(3.14)) {
			System.out.println("3.14���� �Ǿ���.");
		}

		// ���;��� ��� ��� ���
		Enumeration enu = v.elements();
		// Enumeration ������ �������̽� enu=[1,2,3,4,...."�ڹ�"]
		System.out.println("================");
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement()); // enu�ȿ� ���(������)�� ������ true����
		}
		System.out.println("================");
		System.out.println("�Ǿ��� ������: " + v.firstElement());
		System.out.println("�ǵ��� ������: " + v.lastElement());
	}

}
