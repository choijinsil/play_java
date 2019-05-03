package com.encore.j0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

class A {
	void hello() {
		System.out.println("AŬ���� �ȳ�?");
	}

}

public class VectorTest2 {

	public static void main(String[] args) {


		Vector v = new Vector();
		v.add("�ȳ�"); // �ε��� 0 �ο�
		v.add(new A()); // ���� ��ü�� �ּҸ� ��� Ŭ������ ���������� ���� �� �ִ�.

		Object ob = v.get(1); // �ι�° ������ ���
		// �ڽ�Ŭ������ ĳ���� �ؾ� �Ѵ�.
		A a = (A) ob;
		a.hello();

		Vector<String> v2 = new Vector<String>(); // jdk7�������� ������<> �� ��ȣ ����
		v2.add("ȫ�浿");

		Vector<A> v3 = new Vector<A>();
		v3.add(new A()); // �ε��� 0
		A obj = new A();
		v3.add(obj);

		// ���� v3�� �ι�°�� ����� AŬ������ hell()�޼ҵ�
		A a2 = v3.get(1); // ���׸��� ����������� ����: �ڽ�Ŭ������ ĳ������ �ʿ䰡 ����.
		a2.hello();

		// v2.add(new A()); <-- StringŸ������ �޴´� �߱� ������ ������ ����.

		// Ŭ���� ���� < > �� ���׸� Ÿ���̶� �Ѵ�. <-- ��� �ڷ����� ������� ����ϴ� ���̴�. <-- ��Ἲ�� ��������. jdk 5��������
		// <E> : element(���) �� � �ڷ����� ��������� ���.
		// <K> : key�� � �ڷ����� ������� ���
		// <V> : value�� ��� �ڷ����� ����� �� ���
		// <T> : type�� � �ڷ����� ������� ���

	}

}
