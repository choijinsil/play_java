package com.encore.j0424;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TextFieldAreaTest extends Frame {

	TextField tf1;
	TextField tf2;
	TextArea ta;
	Label la;
	Panel southp, northp;
	Button bt, bt2;

	public TextFieldAreaTest() {

		setTitle("TextFieldArea �׽�Ʈ");

		bt = new Button("����");
		bt2 = new Button("����÷��");
		tf1 = new TextField("�⺻��", 10);
		ta = new TextArea();
		tf2 = new TextField(10);
		la = new Label("�����̸�");
		la.setForeground(Color.RED);

		southp = new Panel();

		southp.setLayout(new FlowLayout());
		southp.add(la);
		southp.add(tf2);
		southp.add(bt2);

		northp = new Panel();
		northp.add(tf1);
		northp.add(bt);
		// setLayout(new BorderLayout()); <-- frame�� �⺻ ���̾ƿ��̶� ���� ����
		northp.setBackground(Color.GREEN);
		add("Center", ta);
		add("North", northp);
		add("South", southp);
		southp.setBackground(Color.pink);
//		add("South", tf2);
//		add("South", la);

		// btŬ���� alertâ ����
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {
				JOptionPane.showMessageDialog(null, "���۹�ư�� Ŭ���߾��!", "�˸��޼���", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		// bt2�� Ŭ���� ���� ÷�� â������
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg) {

				JFileChooser chooser = new JFileChooser(); // ��ü ����
				int ret = chooser.showOpenDialog(null); // ����â ����

				if (ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "��θ� ���������ʾҽ��ϴ�.", "���", JOptionPane.WARNING_MESSAGE);
					return;
				}

				String filePath = chooser.getSelectedFile().getPath(); // ���ϰ�θ� ������
				System.out.println(filePath); // ���

				JOptionPane.showMessageDialog(null, "������ ����÷�εǾ����!", "�˸��޼���", JOptionPane.INFORMATION_MESSAGE);

			}
		});

		// ������2�� (������ ������, �����Ӻ��̱�) <-- ������ = ������â
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldAreaTest();
	}

}
