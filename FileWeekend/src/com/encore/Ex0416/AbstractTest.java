package com.encore.Ex0416;

public class AbstractTest {

	void feel(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// 클래스와 별도로 보는게 좋다.
		// 클래스와 메인은 맴버가 아니다.
		AbstractTest at = new AbstractTest();

		Rectangle r = new Rectangle();
		at.feel(new Triangle());
		at.feel(r);
		at.feel(new Circle());
	}
}
