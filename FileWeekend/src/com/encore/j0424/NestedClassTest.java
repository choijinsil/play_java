package com.encore.j0424;

class NestingClass {

	int i = 11;

	void hello() {
		// ����Ŭ���� �ڿ� ���
		System.out.println("�ȳ�?");
		NestedClass nc = new NestedClass();
		nc.print();
	}
	// -----------------------------------------------

	class NestedClass { // ����Ŭ����
		int j = 22;

		void print() {
			System.out.println("����Ʈ!!");
		}

		// �ܺ� Ŭ���� �ڿ��� ����ó�� ���
		void callTest() {
			hello();
			System.out.println("i= " + i);
		}
	}
}

public class NestedClassTest {

	public static void main(String[] args) { // ����Ŭ���� �׽�Ʈ
		// �ܺ�Ŭ���� - int i, hello, ����Ŭ����
		// ����Ŭ���� - int j, print(), callTest()
		NestingClass nesting = new NestingClass();
		nesting.hello();
		System.out.println("======================");
		// ����Ŭ���� �޼ҵ带 ���ο��� ���� ȣ��
		NestingClass.NestedClass innerN = new NestingClass().new NestedClass();
		innerN.print();
	}

}
