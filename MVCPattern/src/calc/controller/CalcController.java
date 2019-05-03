package calc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import calc.model.Calculator;
import calc.view.CalcView;

public class CalcController implements ActionListener {
	CalcView view;
	/*
	 * *******************************아주********************************************
	 * *
	 * ******************************중요함********************************************
	 * 컨트롤러의 역할 - 전체 프로그램에 대한 흐름 제어! 1. 2. 3. 4. 5. 1. (뷰를 통해 요청된) 사용자의
	 * 요청분석:if(ob==btn_new) 2. (사용자가) 입력된 데이터 얻어오기: tf.getText(); 3, 모델클래스 객체
	 * 생성:Calculator c=new Calculator(); 리턴된데이터를 변수에 저장, 메소드 호출 4. 페이지 이동(화면 하나),
	 * 이동할 페이지 선택(프레임) : f1.setVisivle(false); f2.setVisible(true) <-- 페이지 이동개념 5.
	 * 유효성검사( 선택사항): 들어가도 안들어 가도 됨. 뷰에서 검사하기도 함.
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
			// 계산에 필요한 데이터 얻기

			String su1Str = view.tf_su1.getText();
			String su2Str = view.tf_su2.getText();
			// oper를 Sting으로 형변환하거나, toString으로 붙여서 형변환 해도 된다.
			// String oper = view.cb_oper.getSelectedItem().toString();
			String oper = (String) view.cb_oper.getSelectedItem();

			// 유효성검사
			if (!su1Str.matches("[0-9]+") || !su2Str.matches("[\\d]+")) {
				view.la_result.setText("숫자만 입력하세요");
				// JOptionPane.showMessageDialog(view, "숫자만 입력하세요");
				return;
			} else if (oper.equals("/") && su2Str.equals("0")) {
				view.la_result.setText("0으로 나눌수 없습니다.");
				return;
			}

			// 3. 모델객체생성
			Calculator calc = new Calculator(Integer.parseInt(su1Str), Integer.parseInt(su2Str), oper);

			// 3-1 메소드 호출, 저장
			String result = calc.getResult();

			view.la_result.setText(result);
			view.init();

		}
	}
}
