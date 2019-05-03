package com.encore.j0426;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ColorChangeTest extends Frame implements AdjustmentListener {
	Scrollbar sb_red, sb_blue, sb_green;
	TextArea ta;

	Panel bigp, p1, p2, p3;

	public ColorChangeTest() {
		setTitle("���ٲٱ�");

		// new Scrollbar(orientation, value, visible, minimum, maximum)
		sb_red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sb_blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);
		sb_green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 265);

		ta = new TextArea();
		ta.setBackground(Color.BLACK);
		// new Color(sb_red.getValue(), sb_blue.getValue(), sb_green.getValue())
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		bigp = new Panel();

		// �Ӽ�����
		p1.setLayout(new BorderLayout());
		p1.add("West", new Label("����"));
		p1.add("Center", sb_red);

		p2.setLayout(new BorderLayout());
		p2.add("West", new Label("�Ķ�"));
		p2.add("Center", sb_blue);

		p3.setLayout(new BorderLayout());
		p3.add("West", new Label("�ʷ�"));
		p3.add("Center", sb_green);

		bigp.setLayout(new GridLayout(5, 1, 0, 10));
		bigp.setBackground(Color.orange);
		bigp.add(new Label());
		bigp.add(p1);
		bigp.add(p2);
		bigp.add(p3);

		setLayout(new GridLayout());
		add(bigp);
		add(ta);

		setSize(600, 300);
		setVisible(true);

		eventUp();

	}// ������

	private void eventUp() {

		sb_red.addAdjustmentListener(this);
		sb_blue.addAdjustmentListener(this);
		sb_green.addAdjustmentListener(this);

		addWindowListener(new WindowAdapter() {// �͸��� ����Ŭ����
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new ColorChangeTest();
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent arg0) { // ��ũ���� �����϶� �Ϸη�
		// textfield.. setText ��� / textarea.. setText, append��밡��
		System.out
				.println(" red= " + sb_red.getValue() + " green= " + sb_green.getValue() + " blue =" + sb_blue.getValue());

		ta.setBackground(new Color(sb_red.getValue(), sb_green.getValue(), sb_blue.getValue()));
		ta.append("red= " + sb_red.getValue() + " green= " + sb_green.getValue() + " blue =" + sb_blue.getValue()+"\n");
		
	}
}
