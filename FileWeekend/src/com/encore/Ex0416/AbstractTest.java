package com.encore.Ex0416;

public class AbstractTest {

	void feel(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// Ŭ������ ������ ���°� ����.
		// Ŭ������ ������ �ɹ��� �ƴϴ�.
		AbstractTest at = new AbstractTest();

		Rectangle r = new Rectangle();
		at.feel(new Triangle());
		at.feel(r);
		at.feel(new Circle());
	}
}
