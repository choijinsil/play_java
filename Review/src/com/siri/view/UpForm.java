package com.siri.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpForm extends JFrame {

	// ��ü ����
	JLabel jName;
	JLabel jAge;
	JLabel jJob;
	JLabel space;
	
	public int upNo;

	public JTextField tf_name;
	public JTextField tf_age;
	public JTextField tf_job;

	public JButton bt_submit;
	public JButton bt_cancel;

	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;

	public UpForm() {

		// ��ü ����
		jName = new JLabel("�̸�");
		jAge = new JLabel("����");
		jJob = new JLabel("����");
		space = new JLabel("\n");

		tf_name = new JTextField(10);
		tf_age = new JTextField(10);
		tf_job = new JTextField(10);

		bt_submit = new JButton("����");
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
		//setVisible(true);
		setSize(300, 300);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);

		// tf_name.setEditable(false); // �ؽ�Ʈ �����ȵ�
		tf_name.setEnabled(false); // <-- ��ư�� �� �۵��ȵǰ�

		// ��ҹ�ư Ŭ���� â�� ���
		
	}
}
