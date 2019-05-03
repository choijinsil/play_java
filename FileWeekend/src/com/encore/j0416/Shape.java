package com.encore.j0416;

public abstract class Shape {
	
	abstract void draw(); //<--����� �޼ҵ�: �ڽ�Ŭ�������� �����ϴ� ����
	
	public void hello() {
		System.out.println("���긣");
	}
}

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("�ﰢ���׸���");	
	}
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("�簢�� �׸���");	
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("�� �׸���");	
	}
}
