package com.encore.Ex0416;

public class Triangle extends Shape {

	@Override
	void draw() {
		// 부모에게 있는 메소드를 강제한다.
		System.out.println("삼각형이다아");
	}
}
