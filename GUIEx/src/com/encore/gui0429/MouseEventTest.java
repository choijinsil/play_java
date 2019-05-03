package com.encore.gui0429;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventTest extends JFrame implements MouseListener{
	//Mouse의 움직임 ---> 이벤트  
	//            ---> 여러 컴포넌트에 공통적으로 적용할 수 있는 이벤트
	JButton bt;
	
	
    public MouseEventTest() {
         bt = new JButton("나버튼");
         
         setLayout(null);//Null레이아웃!!
                         //==> 컨테이너에 부착되는 컴포넌트는 위치(x,y)와 사이즈(가로,세로)를 설정해야 함.
         //bt.setLocation(int x, int y);
         //bt.setLocation(100,50);
         //bt.setSize(int width,int height);
         //bt.setSize( 100, 100);//정사각형
         
         //bt.setBounds(int x,int y,int width,int height);
         bt.setBounds(80,50,100,100); // x, y, 넓이, 높이
         
         add(bt);
         
         setTitle("마우스이벤트");
         //setSize(300,300);
         setBounds(600, 200, 300, 300);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         bt.addMouseListener(this);
	}//생성자
    
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");	}
	
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");	}
	
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");	}
	
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");}
	
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited"); }
    
    public static void main(String[] args) {
		new MouseEventTest();
	}

	
}




