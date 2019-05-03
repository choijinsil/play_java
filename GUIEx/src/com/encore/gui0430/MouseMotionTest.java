package com.encore.gui0430;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseMotionTest extends JFrame implements MouseMotionListener{
	//���콺���(�����̱�,�巡���ϱ�) �̺�Ʈ �����ϱ�
	
	JLabel green,red;
	
    public MouseMotionTest() {
       setTitle("���콺Motion�׽�Ʈ");
       
	   green = new JLabel("MOVE");
	     green.setBackground(Color.GREEN);//���� ������ ������ default
	     green.setOpaque(true);//������ ����
	     
	   red = new JLabel("DRAG");
	     red.setBackground(Color.RED);
	     red.setOpaque(true);//������ ����
	   
	   //green.setLocation(30,30);
	   //green.setSize(80, 30);
	     
	   green.setBounds(30, 30, 80, 30);//x,y��ǥ  ����,���α���
	   red.setBounds(30, 80, 80, 30);//x,y��ǥ  ����,���α���
	   
	   setLayout(null);
	    add(green);
	    add(red);
	   
	   setBounds(300,200,  600,600);
	   setVisible(true);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	   
	   addMouseMotionListener(this);//�������������� ���콺 ������!! 
	}//������
    @Override
    public void mouseDragged(MouseEvent e) {//���콺�� ���� ��ư�� Ŭ���� ���¿��� �̵�
       //System.out.println("mouseDragged");
    	red.setLocation(e.getX(), e.getY()-30);
    }
    @Override
    public void mouseMoved(MouseEvent e) {//���콺 �ܼ� �̵�
       //System.out.println("mouseMoved");
       int x = e.getX();
       int y = e.getY();
       green.setLocation(x, y-30);       
    }
    
    public static void main(String[] args) {
		new MouseMotionTest();
	}
}



