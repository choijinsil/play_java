package com.encore.j0424;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridTest extends Frame {

	Button bt1, bt2, bt3, bt4, bt5;

	public GridTest() {
		// ��ü ������ ���� �ؾ� null����Ʈ �ͼ����� ���� �ʴ´�.
		bt1 = new Button("1");
		bt2 = new Button("2");
		bt3 = new Button("3");
		bt4 = new Button("4");
		bt5 = new Button("5");

		// ���̾ƿ�����, ���̱�
		// hgap ���򰣰�, vgap ��������
		// setLayout(new GridLayout(2, 3)); // �������
		setLayout(new GridLayout(2, 3,10,0));
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);

		// ������(size, visible Setting)

		setSize(500, 300); 
		setVisible(true);

	}// ������: �ʱ�ȭ, ���Ҵ�

	public static void main(String[] args) {
		new GridTest();
	}
}
