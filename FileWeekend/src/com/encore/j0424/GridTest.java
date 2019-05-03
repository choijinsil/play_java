package com.encore.j0424;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest extends Frame {

	Button bt1, bt2, bt3, bt4, bt5;

	public GridTest() {
		// 객체 생성을 먼저 해야 null포인트 익셉션이 나지 않는다.
		bt1 = new Button("1");
		bt2 = new Button("2");
		bt3 = new Button("3");
		bt4 = new Button("4");
		bt5 = new Button("5");

		// 레이아웃설정, 붙이기
		// hgap 수평간격, vgap 수직간격
		// setLayout(new GridLayout(2, 3)); // 행렬정렬
		setLayout(new GridLayout(2, 3,10,0));
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);

		// 마무리(size, visible Setting)

		setSize(500, 300); 
		setVisible(true);

	}// 생성자: 초기화, 값할당

	public static void main(String[] args) {
		new GridTest();
	}
}
