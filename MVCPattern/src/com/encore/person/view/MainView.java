package com.encore.person.view;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.encore.person.model.Person;

public class MainView extends JFrame implements Runnable {

	public JTable table;
	public JButton bt_insert, bt_del, bt_update, bt_exit;
	JScrollPane scroll_table;
	Panel p;
	DefaultTableModel dtm;

	JLabel label;

	public MainView() {
		setTitle("MainView");
		setLayout(new BorderLayout());

		bt_insert = new JButton("입력");
		bt_update = new JButton("수정");
		bt_del = new JButton("삭제");
		bt_exit = new JButton("종료");
		p = new Panel();
		// 자바에서 시간날짜 관련된 클래스: Date(버그), Calendar
		// Calendar calendar = new GregorianCalendar();

		label = new JLabel();

		Object[][] rowData = new Object[0][4];
		// 0열 1열 2열
//		{ "홍길동", 13, "학생" }, // 첫째행 0행
		String[] columnTitle = { "번호", "이름", "나이", "직업" };
		// dtm생성이유? dtm내의 addRow(), removeRow() 사용하기 위해서
		dtm = new DefaultTableModel(rowData, columnTitle);
		Thread t = new Thread(this);
		table = new JTable(dtm) { // only view
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		// 생성이유? 테이블을 벗어나는 데이터 스크롤!
		scroll_table = new JScrollPane(table);

		t.start();

		p.add(bt_insert);
		p.add(bt_update);
		p.add(bt_del);
		p.add(bt_exit);

		add(label, BorderLayout.NORTH);
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
	// vector는 p1, p2를 얻어온다.
	// Vector<Person> personv = new Vector<Person>();

	// 벡터 안에 저장된 Person정보를 JTable에 출력하는 기능
	// zhongyao~!
	public void displayTable(Vector<Person> personv) {
		dtm.setRowCount(0);
		for (int i = 0; i < personv.size(); i++) {
			Person p = personv.get(i);
			Object[] rowData = { p.getNo(), p.getName(), p.getAge(), p.getJob() };
			dtm.addRow(rowData);
		}
	}
//	// 두가지 방법이 있다.
//	Object[] rowData = { 1, "나길동", 13, "학생" };
//	dtm.addRow(rowData);
//
//	Vector<Object> rowData2 = new Vector<Object>();
//	rowData2.add(2);
//	rowData2.add("siri");
//	rowData2.add(29);
//	rowData2.add("백수");
//	dtm.addRow(rowData2);

	public void run() {
		// threow Exception하면 안된다. 왜? 오버라이드 되어 있어서
		// 동시 실행할 문장들
		try {
			while (true) {
				Thread.sleep(1000);
				Calendar cal = Calendar.getInstance();
				int year = cal.get(Calendar.YEAR);
				int mm = cal.get(Calendar.MONTH) + 1;
				int day = cal.get(Calendar.DATE);
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				int min = cal.get(Calendar.MINUTE);
				int second = cal.get(Calendar.SECOND);
				label.setText("현재시간: " + year + "년" + mm + "월" + day + "일  " + hour + "시" + min + "분" + second + "초");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
