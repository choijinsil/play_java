package com.encore.j0416;

public class AbstractTest {

	void feel(Shape s) {
		// Shape s; // <-- 인터페이스, 추상클래스는 앞에 new를 못붙인다.
		s.draw();
	}

	public static void main(String[] args) {
		// 클래스와 별도로 보는게 좋다.
		// class 와 main은 member가 아니다.
		AbstractTest at = new AbstractTest();
		at.feel(new Triangle());
		at.feel(new Rectangle());
		at.feel(new Circle());
	}
}


		