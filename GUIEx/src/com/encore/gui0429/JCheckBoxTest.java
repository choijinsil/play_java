package com.encore.gui0429;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class JCheckBoxTest extends JFrame {
   JCheckBox cb1,cb2,cb3;
   JPanel panel;
	
   public JCheckBoxTest() {
	 ImageIcon icon1 = new ImageIcon("image/left.gif");  
	 ImageIcon icon2 = new ImageIcon("image/leftrollover.gif");  
	 ImageIcon icon3 = new ImageIcon("image/leftdown.gif");
	 
	 ImageIcon icon4 = new ImageIcon("image/right.gif");  
	 ImageIcon icon5 = new ImageIcon("image/rightrollover.gif");  
	 ImageIcon icon6 = new ImageIcon("image/rightdown.gif");  
	   
	 //JCheckBox(String text, Icon icon)  
	 cb1 = new JCheckBox("ù��°üũ�ڽ�", icon1);   
	   cb1.setRolloverIcon(icon2);//üũ�ڽ� ���� ���콺�� �÷�������
	   cb1.setSelectedIcon(icon3);//üũ�ڽ��� ���õǾ�����
	   
	 cb2 = new JCheckBox("�ι�°üũ�ڽ�", icon4);   
	   cb2.setRolloverIcon(icon5);
	   cb2.setSelectedIcon(icon6);
	 
	 cb3 = new JCheckBox("����°üũ�ڽ�");
	 
	 panel = new JPanel();
	   panel.setLayout(new GridLayout(3, 1));
	   panel.add(cb1);
	   panel.add(cb2);
	   panel.add(cb3);
	 
	 //panel.setBorder(new TitledBorder("�г�Ÿ��Ʋ"));  
	 //panel.setBorder(new BevelBorder(BevelBorder.RAISED));//�簢
	 //panel.setBorder(new BevelBorder(BevelBorder.LOWERED));//����
	 panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED) , "�г�Ÿ��Ʋ") );  
	   
	 
	 setTitle("üũ�ڽ��׽�Ʈ");
	 add(panel);//JFrame - BorderLayout�⺻���̾ƿ�
	            //         "Center"�⺻��ġ
	 
	 setSize(300,300);
	 setVisible(true);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
   }//������
   
   public static void main(String[] args) {
	  new JCheckBoxTest();
   }
}
