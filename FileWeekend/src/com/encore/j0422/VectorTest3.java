package com.encore.j0422;

import java.util.Vector;

public class VectorTest3 {

	public static void main(String[] args) {
		// ����~~~~~~~~~~~~�߿��ϴ�.
		// vector�� ������ �߰�, ����, ����, �˻��ϱ�!
		Vector<String> v = new Vector<String>();

		// ������ �߰�
		v.add("�ڹ�");
		v.add("SQL");
		v.add("HTML");
		v.add("JavaScript");
		v.add("JSP");
		v.add("�ڹ�");

		// ������ ����
		// v.clear();
		//		v.remove(int index);
		//		v.remove(Object o);
		//		v.remove(0);	// 1��° ������ ����
		v.remove("�ڹ�"); // ��ó�� �ε����� �ڹٸ� ���� ���ش�.

		// ������ ����
		v.set(4, "�ڹ����α׷���"); // x���� �迭�� ""�� �ٲټ���
		// element: ����(��ü)�� ������

		// ������ ��ȸ
		// System.out.println("�ټ���° ������: "+v.get(4));
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
