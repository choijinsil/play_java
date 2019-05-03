package com.encore.j0424;

// class MyException{} <--����� ���� Ŭ����, Object��.
class MyException extends Exception { // ����� ���� ����Ŭ����
	public MyException(String msg) {
		// �θ�Ŭ������ ��Ʈ���� ������ �ִ� �����ڱ��� ȣ��
		// ����� ȣ��
		// �θ� �����ڰ� ���� ����� ����

		super(msg);
	}
}

public class ExceptionTest3 {

	static int su = 100;

	public static void main(String[] args) {
		boolean conditions = true;
		System.out.println(su);

		try {
			if (conditions) {
				// ������ ȣ���ϴ°� �´�.
				// throw new MyException("����� ���� ���� �޼���!!!");
				MyException m = new MyException("����� ���� ���� �޼���!!!");
				throw m; // <-- ���� m~~! 2��° ���
			}
		} catch (MyException e) {
			e.printStackTrace();

		}

	}
}
