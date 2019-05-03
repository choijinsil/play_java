package com.encore.j0425;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

import javax.swing.JScrollPane;

public class ScrollChoiceListTest extends Frame implements ActionListener{
	Label la;
	List list;
	Choice cho;
	Scrollbar sb;
	Panel topp, small, bottomp;
	Point point;

	public ScrollChoiceListTest() {

		setTitle("비쥬얼컴포넌트 테스트");
		setLayout(new GridLayout(3, 1));

		la = new Label("초록");
		// multiful설정으로 다중선택 가능
		list = new List(4, true);
		cho = new Choice();
		sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
		bottomp = new Panel();

		// point.getX(), point.getY()

		System.out.println(sb.getValue());
		small = new Panel();
		small.setLayout(new BorderLayout());
		small.add("West", la);
		small.add("Center", sb);

		topp = new Panel();
		topp.setLayout(new GridLayout(3, 1, 0,10));
		topp.setBackground(Color.GREEN);
		topp.add(new Label());
		topp.add(small);
		topp.add(new Label());

		// famen설정( 기본레이아웃: BorderLayout);

		list.add("야구");
		list.add("축구");
		list.add("농구");
		list.add("배구");
		bottomp.add(list);
		cho.setBackground(Color.ORANGE);

		cho.add("서울");
		cho.add("대구");
		cho.add("부산");
		cho.add("광주");
		cho.add("대구");

		// 백그라운드 지정

		add(topp);
		add(cho);
		// add(list);
		add(bottomp);
		
		

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ScrollChoiceListTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 메소드 구현 기능정의
		// 코드
		
		// 감시자 연결자메소드 호출 등록
		
		
	}

}
