package com.encore.j0425;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollPane;

public class ScrollChoiceListTest extends Frame implements ActionListener{
	Label la;
	List list;
	Choice cho;
	Scrollbar sb;
	Panel topp, small, bottomp;
	Point point;

	public ScrollChoiceListTest() {

		setTitle("�����������Ʈ �׽�Ʈ");
		setLayout(new GridLayout(3, 1));

		la = new Label("�ʷ�");
		// multiful�������� ���߼��� ����
		list = new List(4, true);
		cho = new Choice();
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		bottomp = new Panel();

		// point.getX(), point.getY()

		System.out.println(sb.getValue());
		small = new Panel();
		small.setLayout(new BorderLayout());
		small.add("West", la);
		small.add("Center", sb);

		topp = new Panel();
		topp.setLayout(new GridLayout(3, 1, 0,10));
		topp.setBackground(Color.GREEN);
		topp.add(new Label());
		topp.add(small);
		topp.add(new Label());

		// famen����( �⺻���̾ƿ�: BorderLayout);

		list.add("�߱�");
		list.add("�౸");
		list.add("��");
		list.add("�豸");
		bottomp.add(list);
		cho.setBackground(Color.ORANGE);

		cho.add("����");
		cho.add("�뱸");
		cho.add("�λ�");
		cho.add("����");
		cho.add("�뱸");

		// ��׶��� ����

		add(topp);
		add(cho);
		// add(list);
		add(bottomp);
		
		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScrollChoiceListTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �޼ҵ� ���� �������
		// �ڵ�
		
		// ������ �����ڸ޼ҵ� ȣ�� ���
		
		
	}

}
