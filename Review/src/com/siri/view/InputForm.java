package com.siri.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InputForm extends JFrame {
	// �����ϸ� �迭, ����ġ ������ ����

	// ��ü ����

	JLabel jName;
	JLabel jAge;
	JLabel jJob;
	JLabel space;

	public JTextField tf_name;
	public JTextField tf_age;
	public JTextField tf_job;

	public JButton bt_submit;
	public JButton bt_cancel;

	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;

	public InputForm() {
		// ��ü ����
		

		jName = new JLabel("�̸�");
		jAge = new JLabel("����");
		jJob = new JLabel("����");
		space = new JLabel("\n");

		tf_name = new JTextField(10);
		tf_age = new JTextField(10);
		tf_job = new JTextField(10);

		bt_submit = new JButton("�Է�");
		bt_cancel = new JButton("���");

		panel4 = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		setLayout(new GridLayout(5, 1));
		// �̸�
		panel1.setLayout(new FlowLayout());
		panel1.add(jName);
		panel1.add(tf_name);
		// ����
		panel2.setLayout(new FlowLayout());
		panel2.add(jAge);
		panel2.add(tf_age);
		// ����
		panel3.setLayout(new FlowLayout());
		panel3.add(jJob);
		panel3.add(tf_job);
		// �Է� ��� ��ư
		panel4.setLayout(new FlowLayout());
		panel4.add(bt_submit);
		panel4.add(bt_cancel);

		// ��������!
		add(space);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);

		// ��������
		setSize(250, 300);
		// setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE); // ��ü �ڹ� ���� ���α׷��ǹ�

	}
}
