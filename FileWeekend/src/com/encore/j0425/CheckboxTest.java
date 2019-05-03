package com.encore.j0425;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class CheckboxTest extends Frame {
	// �ü���� �������ִ� ��ư
	// ������ �ü������ ��ư ����� �޶��� �� �ִ�.
	// swing�� ���� �ڹ� ���� ����� ���ִ�.
	Checkbox cb1, cb2;
	Label la;
	Panel northp;
	Panel southp;
	TextArea ta;
	ButtonGroup group;
	JRadioButton cb3, cb4;

	// ������ ������ ã��
	public CheckboxTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		cb1 = new Checkbox("���");
		cb2 = new Checkbox("����");
		cb3 = new JRadioButton("����");
		cb4 = new JRadioButton("����");
		group = new ButtonGroup();
		// static Final�̶� �÷��� �빮�ڷ� ǥ�õȴ�.
		cb3.setBackground(Color.ORANGE);
		cb4.setBackground(Color.ORANGE);

		ta = new TextArea();
		la = new Label("����");
		group.add(cb3);
		group.add(cb4);

		northp = new Panel();
		northp.setLayout(new FlowLayout());
		// �г� �⺻���� FlowLayout�̶� �����ص� ����.
		northp.setBackground(Color.yellow);
		northp.add(cb1);
		northp.add(cb2);

		southp = new Panel();
		southp.setLayout(new FlowLayout());
		southp.setBackground(Color.ORANGE);
		southp.add(la);
		southp.add(cb3);
		southp.add(cb4);

//		public void add(Compoent com) {
//			if(com==null)
//				throw new NullPointerException();
//		}

		// setLayout(new BorderLayout());<--Frame�⺻ ���̾ƿ� ����

		add("Center", ta); // center�����̶� center�� �����ص� ��� ��ġ�Ѵ�.
		add("North", northp);
		add("South", southp);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxTest();
	}

}
