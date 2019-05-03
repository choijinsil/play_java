package calc.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcView extends JFrame {
	public JTextField tf_su1, tf_su2;
	public JComboBox<String> cb_oper;
	public JButton bt_calc;
	public JLabel la_result;

	public void init() {
		
		tf_su1.setText("");
		tf_su2.setText("");
	}

	// 넓이와 너비의 차이는?
	public CalcView() {
		tf_su1 = new JTextField(5); // 너비 지정
		tf_su2 = new JTextField(5);

		cb_oper = new JComboBox<>();
		cb_oper.addItem("+");
		cb_oper.addItem("-");
		cb_oper.addItem("*");
		cb_oper.addItem("/");

		bt_calc = new JButton("계산");
		la_result = new JLabel("결과값: 2+3=5");

		setTitle("MVC계산기");
		setLayout(new FlowLayout());
		add(tf_su1);
		add(tf_su2);
		add(cb_oper);
		add(bt_calc);
		add(la_result);

		setBounds(300, 200, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new CalcView();
	}
}
