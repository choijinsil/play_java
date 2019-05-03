package com.encore.gui0429;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class JRadioButtonTest extends JFrame{
	JRadioButton radio1,radio2,radio3;
	JPanel panel;
	
    public JRadioButtonTest() {
       ImageIcon icon1 = new ImageIcon("image/left.gif");  
   	   ImageIcon icon2 = new ImageIcon("image/leftrollover.gif");  
   	   ImageIcon icon3 = new ImageIcon("image/leftdown.gif");	
    	
    	
	   radio1 = new JRadioButton("����1", icon1);
	     radio1.setRolloverIcon(icon2);
	     radio1.setPressedIcon(icon3);
	     
	   radio2 = new JRadioButton("����2");
	     radio2.setToolTipText("����2������ ����~~");//ǳ������  
	   
	   radio3 = new JRadioButton("����3");
	   
	   ButtonGroup group = new ButtonGroup();
	   //�׷� �����ֱ�
	   group.add(radio1);
	   group.add(radio2);
	   group.add(radio3);
	   
	   
	   panel = new JPanel();
	   panel.setLayout(new GridLayout(3,1));
	     panel.add(radio1);
	     panel.add(radio2);
	     panel.add(radio3);
	   panel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), "�����׷�"));
	   
	   setTitle("������ư�׽�Ʈ");
	   add(panel);//BorderLayout, "Center"
	   
	   setSize(300,300);
	   setVisible(true);  
	   setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}//������
    public static void main(String[] args) {
		new JRadioButtonTest();
	}
}

