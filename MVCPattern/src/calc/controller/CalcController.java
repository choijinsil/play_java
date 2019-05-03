package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import calc.model.Calculator;
import calc.view.CalcView;

public class CalcController implements ActionListener {
	CalcView view;
	/*
	 * *******************************����********************************************
	 * *
	 * ******************************�߿���********************************************
	 * ��Ʈ�ѷ��� ���� - ��ü ���α׷��� ���� �帧 ����! 1. 2. 3. 4. 5. 1. (�並 ���� ��û��) �������
	 * ��û�м�:if(ob==btn_new) 2. (����ڰ�) �Էµ� ������ ������: tf.getText(); 3, ��Ŭ���� ��ü
	 * ����:Calculator c=new Calculator(); ���ϵȵ����͸� ������ ����, �޼ҵ� ȣ�� 4. ������ �̵�(ȭ�� �ϳ�),
	 * �̵��� ������ ����(������) : f1.setVisivle(false); f2.setVisible(true) <-- ������ �̵����� 5.
	 * ��ȿ���˻�( ���û���): ���� �ȵ�� ���� ��. �信�� �˻��ϱ⵵ ��.
	 */

	public CalcController() {
		view = new CalcView();
		view.bt_calc.addActionListener(this);
	}

	public static void main(String[] args) {
		new CalcController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.bt_calc) {
			// ��꿡 �ʿ��� ������ ���

			String su1Str = view.tf_su1.getText();
			String su2Str = view.tf_su2.getText();
			// oper�� Sting���� ����ȯ�ϰų�, toString���� �ٿ��� ����ȯ �ص� �ȴ�.
			// String oper = view.cb_oper.getSelectedItem().toString();
			String oper = (String) view.cb_oper.getSelectedItem();

			// ��ȿ���˻�
			if (!su1Str.matches("[0-9]+") || !su2Str.matches("[\\d]+")) {
				view.la_result.setText("���ڸ� �Է��ϼ���");
				// JOptionPane.showMessageDialog(view, "���ڸ� �Է��ϼ���");
				return;
			} else if (oper.equals("/") && su2Str.equals("0")) {
				view.la_result.setText("0���� ������ �����ϴ�.");
				return;
			}

			// 3. �𵨰�ü����
			Calculator calc = new Calculator(Integer.parseInt(su1Str), Integer.parseInt(su2Str), oper);

			// 3-1 �޼ҵ� ȣ��, ����
			String result = calc.getResult();

			view.la_result.setText(result);
			view.init();

		}
	}
}
