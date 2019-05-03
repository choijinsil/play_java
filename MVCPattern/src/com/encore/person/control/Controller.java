package com.encore.person.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.encore.person.model.Model;
import com.encore.person.model.Person;
import com.encore.person.view.InputForm;
import com.encore.person.view.MainView;
import com.encore.person.view.UpForm;

public class Controller implements ActionListener {

	InputForm inForm;
	UpForm upForm;
	MainView view;
	Model m; // 모델등록시 vecter<Person>도 등록되는 것으로 보면 된다.

	public Controller() {
		inForm = new InputForm();
		upForm = new UpForm();
		view = new MainView();
		m = new Model();
		eventUp();
	}

	private void eventUp() {
		// MainView
		view.bt_insert.addActionListener(this);
		view.bt_del.addActionListener(this);
		view.bt_update.addActionListener(this);
		view.bt_exit.addActionListener(this);

		// InputForm
		inForm.bt_submit.addActionListener(this);
		inForm.bt_cancel.addActionListener(this);
		inForm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				inForm.setVisible(false);
				view.setVisible(true);
			}
		});
		
		// UpForm
		upForm.bt_submit.addActionListener(this);
		upForm.bt_cancel.addActionListener(this);
		upForm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				upForm.setVisible(false);
				view.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == view.bt_insert) {
			view.setVisible(false);
			inForm.setVisible(true);

		} else if (ob == view.bt_update) { // 데이터 수정을 위한 폼 이동
			// 기존 입력된 정보 가져오기
			int no = (int) view.table.getValueAt(view.table.getSelectedRow(), 0);
			Person oldP = m.select(no);
			upForm.tf_name.setText(oldP.getName());
			upForm.tf_age.setText(oldP.getAge() + "");
			upForm.tf_job.setText(oldP.getJob());

			// 나중에 수정을 위해 upNo에 번호 저장
			upForm.upNo = oldP.getNo();

			view.setVisible(false);
			upForm.setVisible(true);

		} else if (ob == view.bt_del) {
			JOptionPane pane = new JOptionPane();
			String input = pane.showInputDialog("삭제할 번호");

			m.delete(Integer.parseInt(input));
			Vector<Person> personv = m.selectAll();
			view.displayTable(personv);

		} else if (ob == upForm.bt_submit) { // 수정요청<--
			// int no = (int) view.table.getValueAt(view.table.getSelectedRow(), 0);

			int age = Integer.parseInt(upForm.tf_age.getText());
			String job = upForm.tf_job.getText();

			Person p = new Person(upForm.upNo, "", age, job);
			m.update(p);

			Vector<Person> personv = m.selectAll();
			view.displayTable(personv);

			upForm.setVisible(false);
			view.setVisible(true);
			

		} else if (ob == inForm.bt_submit) { // 입력요청

			String name = inForm.tf_name.getText();
			int age = Integer.parseInt(inForm.tf_age.getText());
			String job = inForm.tf_job.getText();
			Person p = new Person(0, name, age, job);
			m.insert(p);
			Vector<Person> personv = m.selectAll();
			view.displayTable(personv);

			inForm.setVisible(false);
			view.setVisible(true);

		} else if (ob == view.bt_exit) { // 종료할때 모두
			// System.exit(0);
		} else if (ob == inForm.bt_cancel) {

		} else if (ob == upForm.bt_cancel) {

		}

	}

	public static void main(String[] args) {
		new Controller();

	}
}
