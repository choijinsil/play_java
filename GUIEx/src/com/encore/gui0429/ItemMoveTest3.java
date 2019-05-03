package com.encore.gui0429;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ItemMoveTest3 extends JFrame {
   JList<String> left_list, right_list;
   
   JTextField left_tf, right_tf;
   JButton bt_right,bt_right_all, bt_left, bt_left_all;
   
   JPanel leftp, centerp, rightp;
   
   JScrollPane left_scrol, right_scrol;
   //스크롤바가 지원되는 패널 --->  보통 JList, JTextArea, JTable과 함께 사용
   
   //JList는 데이터를 String[] 또는 Vector로 따로 분리해서 저장!!
   Vector<String> leftV;//좌측 JList가 담을 데이터를 표현   
   Vector<String> rightV;//우측 JList가 담을 데이터를 표현   
   
   public ItemMoveTest3() {
	  leftV = new Vector<String>();
	  rightV = new Vector<String>();
	   
      left_list = new JList<String>();
      left_scrol = new JScrollPane(left_list);          
      
      right_list = new JList<String>();
      right_scrol = new JScrollPane(right_list);

      
      left_tf = new JTextField();     
      right_tf = new JTextField();
  
      //'ㅁ'한글입력 - 한자키 누름
      //확장된 부호찾기 - ▷ ▶ ◁ ◀
      bt_right = new JButton("▷");
      bt_right_all = new JButton("▶");
      bt_left = new JButton("◁");
      bt_left_all = new JButton("◀");
     
      leftp = new JPanel();
        leftp.setLayout(new BorderLayout());
        //leftp.add("Center",left_list);//JList붙이기
        leftp.add("Center",left_scrol);//스크롤바가 있는 JList붙이기
        leftp.add("South",left_tf);
      
      rightp = new JPanel();
        rightp.setLayout(new BorderLayout());
        //rightp.add("Center",right_list);
        rightp.add("Center",right_scrol);
        rightp.add("South",right_tf);
      
      centerp = new JPanel();
        centerp.setBackground(Color.YELLOW);
        /*
        centerp.setLayout(new GridLayout(6,3,10,10));
         
        centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_right);     centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_right_all); centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_left);    centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_left_all);centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
        */ 
        //너무 많은(필요없는) JLabel객체생성!! ===> Null레이아웃으로 해결!!
        
        centerp.setLayout(null);
          bt_right.setBounds(75, 30, 50, 40);
          bt_right_all.setBounds(75, 80, 50, 40);
          bt_left.setBounds(75, 130, 50, 40);
          bt_left_all.setBounds(75, 180, 50, 40);
        centerp.add(bt_right);
        centerp.add(bt_right_all);
        centerp.add(bt_left);
        centerp.add(bt_left_all);
        
        
      setTitle("Item움직이기");
      setLayout(new GridLayout(1,3));
      add(leftp);
      add(centerp);
      add(rightp);
      
      setSize(600, 300);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }//생성자
  
  
   public static void main(String[] args) {
	  new ItemMoveTest3();
   }
}




