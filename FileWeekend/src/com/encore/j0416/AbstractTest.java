package com.encore.j0416;

public class AbstractTest {

	void feel(Shape s) {
		// Shape s; // <-- �������̽�, �߻�Ŭ������ �տ� new�� �����δ�.
		s.draw();
	}

	public static void main(String[] args) {
		// Ŭ������ ������ ���°� ����.
		// class �� main�� member�� �ƴϴ�.
		AbstractTest at = new AbstractTest();
		at.feel(new Triangle());
		at.feel(new Rectangle());
		at.feel(new Circle());
	}
}


		