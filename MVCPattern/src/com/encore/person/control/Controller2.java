package com.encore.person.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.encore.person.model.DataStore;
import com.encore.person.model.Model;
import com.encore.person.model.Model2;
import com.encore.person.model.Person;
import com.encore.person.view.InputForm;
import com.encore.person.view.MainView;
import com.encore.person.view.UpForm;

public class Controller2 implements ActionListener {
	// ActionListener����� ����? �䳻�� ��ư�� ����(�׼�)�� üũ�ϱ� ���ؼ�!!

	// ��ü����
	MainView mainView;
	InputForm form;
	UpForm upForm;

	// ������ �����
	DataStore store;// ����<Person>, ��ȣ������

	public Controller2() {
		store = new DataStore();

		mainView = new MainView();
		form = new InputForm();
		upForm = new UpForm();

		eventUp();
	}// ������

	private void eventUp() {// �̺�Ʈ �ҽ� ���
		/////////// MainView�̺�Ʈ �ҽ� ////////////////
		mainView.bt_insert.addActionListener(this);
		mainView.bt_update.addActionListener(this);
		mainView.bt_del.addActionListener(this);
		mainView.bt_exit.addActionListener(this);

		/////////// InputForm�̺�Ʈ �ҽ� ////////////////
		form.bt_submit.addActionListener(this);
		form.bt_cancel.addActionListener(this);
		form.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// �Է��� ----> ���κ� �̵�
				form.setVisible(false);
				mainView.setVisible(true);
			}
		});

		/////////// UpForm�̺�Ʈ �ҽ� ////////////////
		upForm.bt_submit.addActionListener(this);
		upForm.bt_cancel.addActionListener(this);
		upForm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// ������ ----> ���κ� �̵�
				upForm.setVisible(false);
				mainView.setVisible(true);
			}
		});
	}// eventUp

	@Override
	public void actionPerformed(ActionEvent e) {// ������� �޼ҵ�: �̺�Ʈ �ڵ鷯
		Object ob = e.getSource();

		if (ob == mainView.bt_insert) {// ������:�Է¹�ư
			form.initText();
			mainView.setVisible(false);
			form.setVisible(true);
		} else if (ob == form.bt_submit) {// �Է���: �Է¹�ư
			Person p = new Person(0, form.tf_name.getText(), Integer.parseInt(form.tf_age.getText()),
					form.tf_job.getText());
			Model2 m2 = new Model2(store);
			m2.insert(p);

			// ������ ����� ������ JTable�� �ݿ�
			mainView.displayTable(m2.selectAll());
			form.setVisible(false);
			mainView.setVisible(true);
		} else if (ob == mainView.bt_update) {// ���κ�: ������ư

			int row = mainView.table.getSelectedRow();
			Object data = mainView.table.getValueAt(row, 0);// ������ ��ȣ ���
			// 0: ��ȣ �÷�

			// Object data = new Integer(5);

			// Integer.parseInt("���ڷ� ������ ���ڿ�");
			int no = Integer.parseInt(data.toString());
			// int no = (Integer)data;

			/*
			 * int su = 300; Integer su2 = new Integer(300); int su3 = new Integer(500);
			 * Integer su4 = 500;
			 */

			Model2 m2 = new Model2(store);
			Person p = m2.select(no);// ��ȣ ��ġ�ϴ� Person �Ѱ�

			upForm.upNo = p.getNo();// ��? ���߿� ���Ϳ� ���� ������ �Ҷ� �ʿ�!!
			upForm.tf_name.setText(p.getName());
			upForm.tf_age.setText(p.getAge() + "");
			upForm.tf_job.setText(p.getJob());

			mainView.setVisible(false);
			upForm.setVisible(true);
		} else if (ob == upForm.bt_submit) {// ������: ������ư

			Person newp = new Person(upForm.upNo, null, Integer.parseInt(upForm.tf_age.getText()),
					upForm.tf_job.getText());

			Model2 m2 = new Model2(store);
			m2.update(newp);

			// ������ ����� ������ JTable�� �ݿ�
			mainView.displayTable(m2.selectAll());
			upForm.setVisible(false);
			mainView.setVisible(true);
		} else if (ob == mainView.bt_del) {// ���κ�: ������ư
			String noStr = JOptionPane.showInputDialog(mainView, "������ ��ȣ:");

			int state = JOptionPane.showConfirmDialog(mainView, "���� ����?");
			// state=0 : '��'Ŭ��

			if (state == 0) {
				Model2 m2 = new Model2(store);
				m2.delete(Integer.parseInt(noStr));// ���� ����

				// ������ ����� ������ JTable�� �ݿ�
				mainView.displayTable(m2.selectAll());
			}

		} else if (ob == mainView.bt_exit) {// ���κ�: �����ư
			System.exit(0);
		}

	}// actionPerformed

	public static void main(String[] args) {
		new Controller2();
	}

}
