package com.encore.gui0429;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseEventTest extends JFrame implements MouseListener{
	//Mouse�� ������ ---> �̺�Ʈ  
	//            ---> ���� ������Ʈ�� ���������� ������ �� �ִ� �̺�Ʈ
	JButton bt;
	
	
    public MouseEventTest() {
         bt = new JButton("����ư");
         
         setLayout(null);//Null���̾ƿ�!!
                         //==> �����̳ʿ� �����Ǵ� ������Ʈ�� ��ġ(x,y)�� ������(����,����)�� �����ؾ� ��.
         //bt.setLocation(int x, int y);
         //bt.setLocation(100,50);
         //bt.setSize(int width,int height);
         //bt.setSize( 100, 100);//���簢��
         
         //bt.setBounds(int x,int y,int width,int height);
         bt.setBounds(80,50,100,100); // x, y, ����, ����
         
         add(bt);
         
         setTitle("���콺�̺�Ʈ");
         //setSize(300,300);
         setBounds(600, 200, 300, 300);
         setVisible(true);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
         bt.addMouseListener(this);
	}//������
    
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




