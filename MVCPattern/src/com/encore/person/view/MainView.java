package com.encore.person.view;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.encore.person.model.Person;

public class MainView extends JFrame {

	public JTable table;
	public JButton bt_insert, bt_del, bt_update, bt_exit;
	JScrollPane scroll_table;
	Panel p;
	DefaultTableModel dtm;

	public MainView() {
		setTitle("MainView");
		setLayout(new BorderLayout());

		bt_insert = new JButton("�Է�");
		bt_update = new JButton("����");
		bt_del = new JButton("����");
		bt_exit = new JButton("����");
		p = new Panel();

		Object[][] rowData = new Object[0][4];
		// 0�� 1�� 2��
//		{ "ȫ�浿", 13, "�л�" }, // ù°�� 0��
		String[] columnTitle = { "��ȣ", "�̸�", "����", "����" };
		// dtm��������? dtm���� addRow(), removeRow() ����ϱ� ���ؼ�
		dtm = new DefaultTableModel(rowData, columnTitle);

		table = new JTable(dtm) { // only view
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		// ��������? ���̺��� ����� ������ ��ũ��!
		scroll_table = new JScrollPane(table);

		p.add(bt_insert);
		p.add(bt_update);
		p.add(bt_del);
		p.add(bt_exit);

		add(scroll_table, BorderLayout.CENTER);// (table);
		add(p, BorderLayout.SOUTH);

		setSize(300, 300);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		bt_exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
	}
	// vector�� p1, p2�� ���´�.
	// Vector<Person> personv = new Vector<Person>();

	// ���� �ȿ� ����� Person������ JTable�� ����ϴ� ���
	// zhongyao~!
	public void displayTable(Vector<Person> personv) {
		dtm.setRowCount(0);
		for (int i = 0; i < personv.size(); i++) {
			Person p = personv.get(i);
			Object[] rowData = { p.getNo(), p.getName(), p.getAge(), p.getJob() };
			dtm.addRow(rowData);
		}
	}
//	// �ΰ��� ����� �ִ�.
//	Object[] rowData = { 1, "���浿", 13, "�л�" };
//	dtm.addRow(rowData);
//
//	Vector<Object> rowData2 = new Vector<Object>();
//	rowData2.add(2);
//	rowData2.add("siri");
//	rowData2.add(29);
//	rowData2.add("���");
//	dtm.addRow(rowData2);

}