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
	// ActionListener상속한 이유? 뷰내의 버튼의 눌림(액션)을 체크하기 위해서!!

	// 전체뷰등록
	MainView mainView;
	InputForm form;
	UpForm upForm;

	// 데이터 저장소
	DataStore store;// 벡터<Person>, 번호생성기

	public Controller2() {
		store = new DataStore();

		mainView = new MainView();
		form = new InputForm();
		upForm = new UpForm();

		eventUp();
	}// 생성자

	private void eventUp() {// 이벤트 소스 등록
		/////////// MainView이벤트 소스 ////////////////
		mainView.bt_insert.addActionListener(this);
		mainView.bt_update.addActionListener(this);
		mainView.bt_del.addActionListener(this);
		mainView.bt_exit.addActionListener(this);

		/////////// InputForm이벤트 소스 ////////////////
		form.bt_submit.addActionListener(this);
		form.bt_cancel.addActionListener(this);
		form.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 입력폼 ----> 메인뷰 이동
				form.setVisible(false);
				mainView.setVisible(true);
			}
		});

		/////////// UpForm이벤트 소스 ////////////////
		upForm.bt_submit.addActionListener(this);
		upForm.bt_cancel.addActionListener(this);
		upForm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 수정폼 ----> 메인뷰 이동
				upForm.setVisible(false);
				mainView.setVisible(true);
			}
		});
	}// eventUp

	@Override
	public void actionPerformed(ActionEvent e) {// 기능정의 메소드: 이벤트 핸들러
		Object ob = e.getSource();

		if (ob == mainView.bt_insert) {// 메인폼:입력버튼
			form.initText();
			mainView.setVisible(false);
			form.setVisible(true);
		} else if (ob == form.bt_submit) {// 입력폼: 입력버튼
			Person p = new Person(0, form.tf_name.getText(), Integer.parseInt(form.tf_age.getText()),
					form.tf_job.getText());
			Model2 m2 = new Model2(store);
			m2.insert(p);

			// 벡터의 변경된 내용을 JTable에 반영
			mainView.displayTable(m2.selectAll());
			form.setVisible(false);
			mainView.setVisible(true);
		} else if (ob == mainView.bt_update) {// 메인뷰: 수정버튼

			int row = mainView.table.getSelectedRow();
			Object data = mainView.table.getValueAt(row, 0);// 수정할 번호 얻기
			// 0: 번호 컬럼

			// Object data = new Integer(5);

			// Integer.parseInt("숫자로 구성된 문자열");
			int no = Integer.parseInt(data.toString());
			// int no = (Integer)data;

			/*
			 * int su = 300; Integer su2 = new Integer(300); int su3 = new Integer(500);
			 * Integer su4 = 500;
			 */

			Model2 m2 = new Model2(store);
			Person p = m2.select(no);// 번호 일치하는 Person 한개

			upForm.upNo = p.getNo();// 왜? 나중에 벡터에 대한 수정을 할때 필요!!
			upForm.tf_name.setText(p.getName());
			upForm.tf_age.setText(p.getAge() + "");
			upForm.tf_job.setText(p.getJob());

			mainView.setVisible(false);
			upForm.setVisible(true);
		} else if (ob == upForm.bt_submit) {// 수정폼: 수정버튼

			Person newp = new Person(upForm.upNo, null, Integer.parseInt(upForm.tf_age.getText()),
					upForm.tf_job.getText());

			Model2 m2 = new Model2(store);
			m2.update(newp);

			// 벡터의 변경된 내용을 JTable에 반영
			mainView.displayTable(m2.selectAll());
			upForm.setVisible(false);
			mainView.setVisible(true);
		} else if (ob == mainView.bt_del) {// 메인뷰: 삭제버튼
			String noStr = JOptionPane.showInputDialog(mainView, "삭제할 번호:");

			int state = JOptionPane.showConfirmDialog(mainView, "정말 삭제?");
			// state=0 : '예'클릭

			if (state == 0) {
				Model2 m2 = new Model2(store);
				m2.delete(Integer.parseInt(noStr));// 실제 삭제

				// 벡터의 변경된 내용을 JTable에 반영
				mainView.displayTable(m2.selectAll());
			}

		} else if (ob == mainView.bt_exit) {// 메인뷰: 종료버튼
			System.exit(0);
		}

	}// actionPerformed

	public static void main(String[] args) {
		new Controller2();
	}

}
