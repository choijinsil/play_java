package com.encore.j0425;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class EventTest extends Frame implements ActionListener {
	Button btn;
	int cnt = 0;
	Random r = new Random();

	public EventTest() {
		setTitle("��ư�̺�Ʈ");
		btn = new Button("����ư");
		setLayout(new FlowLayout());
		add(btn);
		setSize(300, 300);
		setVisible(true);

		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�ȳ�?");
		setTitle("��ư�̺�Ʈ" + (++cnt));
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);

		Button btn1 = new Button("�߰���ư[" + cnt + "]");
		btn1.setBackground(new Color(red, green, blue));

		add(btn1);
		setVisible(true);

		setBackground(new Color(r.nextInt(999999)));
	} // �̺�Ʈó����(Event Handler): �������

	public static void main(String[] args) {
		new EventTest();

	}

}
