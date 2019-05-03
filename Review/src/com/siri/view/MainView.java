package com.siri.view;

import java.awt.BorderLayout;
import java.awt.Panel;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.siri.model.Person;

public class MainView extends JFrame {

	public JTable table;
	public JButton bt_insert, bt_del, bt_update, bt_exit;
	JScrollPane scroll_table;
	Panel p;
	DefaultTableModel dtm;

	public MainView() {

		setTitle("MainView");
		setLayout(new BorderLayout());

		bt_insert = new JButton("입력");
		bt_update = new JButton("수정");
		bt_del = new JButton("삭제");
		bt_exit = new JButton("종료");
		p = new Panel();

		// 빈칸이 안나오게 하기 위해서 0,4
		Object[][] row = new Object[0][4];
		String[] columnTitle = { "번호", "이름", "나이", "직업" };

		dtm = new DefaultTableModel(row, columnTitle);
		table = new JTable(dtm) {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

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

	}

	public void displayPerson(Vector<Person> personv) {
		// DefaultTableModel 초기화
		dtm.setRowCount(0);
		for (int i = 0; i < personv.size(); i++) {
			Person p = personv.get(i);
			Object[] row = { p.getNo(), p.getName(), p.getAge(), p.getJob() };
			dtm.addRow(row);
		}
	}
}
