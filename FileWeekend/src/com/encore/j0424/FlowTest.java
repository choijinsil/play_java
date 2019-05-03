package com.encore.j0424;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

// 컴포넌트 버튼 객체 생성 --> 컨테이너(도화지) 붙이기
public class FlowTest {
	// 컴포넌트 선언, 컨테이너 선언
	Button bt1, bt2, bt3; // 기본값은 null <-- 맴버변수에 선언되었으니까
	Frame f;

	public FlowTest() {
		Color c = new Color(242, 65, 215);
		// 컴포인트, 컨테이너 객체 생성 (선언된 맴버변수 수만큼)
		// 하지 않는다면 Null포인트 익셉션 나옴
		bt1 = new Button("행복버튼");
		bt2 = new Button("슬픔버튼");
		bt3 = new Button("그냥버튼");

		f = new Frame("Flow 테스트");
		
		// 속성 설정 <-- 버튼의 색상, 사이즈 등, layout설정, 컴포넌트 붙이기
		f.add(bt1); // 프레임에 붙여라 버튼을
		bt1.setBackground(c);
		f.add(bt2);
		f.add(bt3);
//		FlowLayout f1= new FlowLayout();
//		f.setLayout(f1);	// 가운데 정렬
		f.setLayout(new FlowLayout()); // <--위의 두 줄을 줄인것!

		// 마무리메소드 호출2: 컨테이너 사이즈(가로, 세로 길이)설정, 컨테이너 보이기 설정
		f.setSize(300, 300);
		f.setVisible(true);

	}

	public static void main(String[] args) { // 최대한 간략화
		// 메인이 빠지더라도 전체 프로그램에 영향을 미치지 않도록
		// FlowTest ft = new FlowTest();
		new FlowTest();

	}

}
