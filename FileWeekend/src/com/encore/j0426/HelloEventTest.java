package com.encore.j0426;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class HelloEventTest extends Frame implements ActionListener {
	Button btnHi, btnDel, btnExit;
	Panel northp, southp, centerp;
	TextField tf;
	ButtonGroup group;
	JRadioButton jLow, jMid, jHight;

	// �ȳ�Ŭ���� �����ڽ�+�ȳ�~!!, get, set����
	public HelloEventTest() {
		setTitle("�ȳ��̺�Ʈ");

		// ��ü ����
		btnHi = new Button("�ȳ�");
		btnDel = new Button("�����");
		btnExit = new Button("����");

		northp = new Panel();
		southp = new Panel();
		centerp = new Panel();

		tf = new TextField(10);

		group = new ButtonGroup();

		jLow = new JRadioButton("�ڹ��ʱ�", true);
		jMid = new JRadioButton("�ڹ��߱�", false);
		jHight = new JRadioButton("�ڹٰ��", false);

		// �׷쿡 �ڹ� ���߰�� �߰�
		group.add(jLow);
		group.add(jMid);
		group.add(jHight);

		// southp ���� �ȳ� ����� ���� �߰�
		southp.setLayout(new FlowLayout());
		southp.setBackground(Color.PINK);
		southp.add(btnHi);
		southp.add(btnDel);
		southp.add(btnExit);

		// northp ���� �ȳ� ����� ���� �߰�
		northp.setLayout(new FlowLayout());
		northp.setBackground(Color.ORANGE);
		northp.add(tf);

		// centerp�� ���
		centerp.setLayout(new GridLayout(3, 1));
		centerp.add(jLow);
		centerp.add(jMid);
		centerp.add(jHight);

		// add("Center",group);
		add("North", northp);
		add("South", southp);
		add("Center", centerp);

		// â������� ȭ�� ���̱� ����
		setSize(400, 400);
		setVisible(true);

		// addActionListener�� actionPerformed�� ȣ���ϴ� �޼���
		btnHi.addActionListener(this);
		btnDel.addActionListener(this);
		btnExit.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/*
	 * private void eventUp() { // �̺�Ʈ ���(�̺�Ʈ �ҽ��� ���� ������!)
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new HelloEventTest();
	}

	// ���� ��ư Ŭ���� Ŭ���� ������
	// �ؽ�Ʈ�� setText�ϴ� ��� �˾ƺ���
	// ���� ������ ����ǰ� �ϱ�

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource(); // �̺�Ʈ�� �߻���Ų �ҽ��� ��������(�ּ�)�� ������.

		if (ob == btnHi) {

			// ���� ��ư�� üũ �Ǿ����� ���������������

			if (jLow.isSelected()) {
				tf.setText(jLow.getText() + "siri?");

			} else if (jMid.isSelected()) {
				tf.setText(jMid.getText() + "hana?");

			} else if (jHight.isSelected()) {
				tf.setText(jHight.getText() + "youna?");
			}

		} else if (ob == btnDel) {
			tf.setText("");

		} else if (ob == btnExit) {
			System.exit(0);
		}
	}
}
