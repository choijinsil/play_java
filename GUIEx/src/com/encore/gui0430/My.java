package com.encore.gui0430;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


class You extends JButton{
	
	public You(String text) {
	  super(text);	
	}
}

class A{
   void hello() {
	   System.out.println("�ȳ�~!!");
   }
}



public class My extends JFrame{
	
   JButton bt;
   You you;
   
   public My() {
	 bt = new JButton("��ư1");
	 you = new You("��ư2");
	 
	 setLayout(new FlowLayout());
	 add(bt);
	 add(you);
	 
	 setSize(300,300);
	 setVisible(true);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
	
   public static void main(String[] args) {
	  new My();
	  
	  A a = new A() {
		  
		  @Override
		  public void hello() {
			  System.out.println("��¥��~!!");
		  }
		  
	  };
	    a.hello();
	  
   }
}









