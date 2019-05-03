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
   //��ũ�ѹٰ� �����Ǵ� �г� --->  ���� JList, JTextArea, JTable�� �Բ� ���
   
   //JList�� �����͸� String[] �Ǵ� Vector�� ���� �и��ؼ� ����!!
   Vector<String> leftV;//���� JList�� ���� �����͸� ǥ��   
   Vector<String> rightV;//���� JList�� ���� �����͸� ǥ��   
   
   public ItemMoveTest3() {
	  leftV = new Vector<String>();
	  rightV = new Vector<String>();
	   
      left_list = new JList<String>();
      left_scrol = new JScrollPane(left_list);          
      
      right_list = new JList<String>();
      right_scrol = new JScrollPane(right_list);

      
      left_tf = new JTextField();     
      right_tf = new JTextField();
  
      //'��'�ѱ��Է� - ����Ű ����
      //Ȯ��� ��ȣã�� - �� �� �� ��
      bt_right = new JButton("��");
      bt_right_all = new JButton("��");
      bt_left = new JButton("��");
      bt_left_all = new JButton("��");
     
      leftp = new JPanel();
        leftp.setLayout(new BorderLayout());
        //leftp.add("Center",left_list);//JList���̱�
        leftp.add("Center",left_scrol);//��ũ�ѹٰ� �ִ� JList���̱�
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
        //�ʹ� ����(�ʿ����) JLabel��ü����!! ===> Null���̾ƿ����� �ذ�!!
        
        centerp.setLayout(null);
          bt_right.setBounds(75, 30, 50, 40);
          bt_right_all.setBounds(75, 80, 50, 40);
          bt_left.setBounds(75, 130, 50, 40);
          bt_left_all.setBounds(75, 180, 50, 40);
        centerp.add(bt_right);
        centerp.add(bt_right_all);
        centerp.add(bt_left);
        centerp.add(bt_left_all);
        
        
      setTitle("Item�����̱�");
      setLayout(new GridLayout(1,3));
      add(leftp);
      add(centerp);
      add(rightp);
      
      setSize(600, 300);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }//������
  
  
   public static void main(String[] args) {
	  new ItemMoveTest3();
   }
}




