package com.encore.j0425;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class CheckboxTest extends Frame {
	// 운영체제가 지원해주는 버튼
	// 문제는 운영체제마다 버튼 모양이 달라질 수 있다.
	// swing은 순수 자바 언어로 만들어 져있다.
	Checkbox cb1, cb2;
	Label la;
	Panel northp;
	Panel southp;
	TextArea ta;
	ButtonGroup group;
	JRadioButton cb3, cb4;

	// 생성자 쪽으로 찾기
	public CheckboxTest() {
		setTitle("체크박스 테스트");
		cb1 = new Checkbox("사과");
		cb2 = new Checkbox("딸기");
		cb3 = new JRadioButton("남자");
		cb4 = new JRadioButton("여자");
		group = new ButtonGroup();
		// static Final이라 컬러는 대문자로 표시된다.
		cb3.setBackground(Color.ORANGE);
		cb4.setBackground(Color.ORANGE);

		ta = new TextArea();
		la = new Label("성별");
		group.add(cb3);
		group.add(cb4);

		northp = new Panel();
		northp.setLayout(new FlowLayout());
		// 패널 기본값이 FlowLayout이라 생략해도 좋다.
		northp.setBackground(Color.yellow);
		northp.add(cb1);
		northp.add(cb2);

		southp = new Panel();
		southp.setLayout(new FlowLayout());
		southp.setBackground(Color.ORANGE);
		southp.add(la);
		southp.add(cb3);
		southp.add(cb4);

//		public void add(Compoent com) {
//			if(com==null)
//				throw new NullPointerException();
//		}

		// setLayout(new BorderLayout());<--Frame기본 레이아웃 생략

		add("Center", ta); // center기준이라 center는 생략해도 가운데 위치한다.
		add("North", northp);
		add("South", southp);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckboxTest();
	}

}
