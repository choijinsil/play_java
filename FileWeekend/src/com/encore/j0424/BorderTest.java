package com.encore.j0424;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//BorderLayout: 중앙을 기준으로 동서남북 위치를 설정
public class BorderTest extends Frame {
	// 클래스 안에는 변수선언, 생성자정의, 메소드 정의 세가지만 들어간다.
	// 메소드 정의 안에 지역변수 선언, 지역변수, 맴버변수 초기화, 메소드 호출, 조건문, 반복문
	// 필요한 객체(커모넌트, 컨테이너) 선언
	// this가 Frame이라 객체 생성하지 않아도 된다.
	Button b1, b2, b3, b4, b5;
	// b1=new Button("1");
	Button b6 = new Button("6");

	public BorderTest(String title) {
		// 상위클래스 생성자 호출
		// 슈퍼의 제약 절대 두번째 라인에 갈 수 없고 무조건 첫번째에 위치해야 한다.

		// super(title);// 1번째 방법
		setTitle("새로운타이틀"); // 2번쨰 방법 <-- 위치에 구애받지 않는당
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");

		// 속성설정(프레임에 대한 레이아웃, 붙이기)
		setLayout(new BorderLayout());// Frame.setLayout인데 Frame을 상속받았으니 this로 사용

		// this.adD(b1);
		// BorderLayout의 경우 컴포넌트를 붙일 위치를 함께 설정해야 한다. 철자가 틀리면 에러! 첫글자는꼭 대문자!
		add("North", b1);
		add("East", b2);
		add("South", b3);
		add("West", b4);
		add("Center", b5);

		// 마무리2개 (프레임 사이즈, 프레임보이기) <-- 프레임 = 윈도우창
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderTest("Border 테스트!");

	}

}
