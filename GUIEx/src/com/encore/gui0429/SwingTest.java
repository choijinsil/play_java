package com.encore.gui0429;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest extends JFrame{

	JButton bt;
	
	public SwingTest() {
	   setTitle("Swing�׽�Ʈ");
	   
	   bt = new JButton("<html><font size=20 color=blue face=�ü�ü>����ư</font></html>");
	   
	   setLayout(new FlowLayout());
	   add(bt);
	   
	   setSize(300,300);
	   setVisible(true);
	   //���� ������ ��������� X��ưŬ���� ���α׷� ���Ḹ �� ���̶�� �Ʒ��� �ڵ� ���!!
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //X��ư�� ��� �ο��� ���̸� addWindowListener() ���!!
	}
	
	public static void main(String[] args) {
		new SwingTest();
	}

}






