package com.encore.gui0429;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ItemMoveTest extends JFrame implements ActionListener{
   //JList<String> left_list, right_list;
   List left_list, right_list;
	
   JTextField left_tf, right_tf;
   JButton bt_right,bt_right_all, bt_left, bt_left_all;
   
   JPanel leftp, centerp, rightp;
   

   public ItemMoveTest() {
//      left_list = new JList<String>();
//      right_list = new JList<String>();
      left_list = new List();
      right_list = new List();
      
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
        leftp.add("Center",left_list);
        leftp.add("South",left_tf);
      
      rightp = new JPanel();
        rightp.setLayout(new BorderLayout());
        rightp.add("Center",right_list);
        rightp.add("South",right_tf);
      
      centerp = new JPanel();
        centerp.setBackground(Color.YELLOW);
        centerp.setLayout(new GridLayout(6,3,10,10));
        centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_right);     centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_right_all); centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_left);    centerp.add(new JLabel());
        centerp.add(new JLabel());centerp.add(bt_left_all);centerp.add(new JLabel());
        //centerp.add(new JLabel());centerp.add(new JLabel());centerp.add(new JLabel());
        
        
      setTitle("Item�����̱�");
      setLayout(new GridLayout(1,3));
      add(leftp);
      add(centerp);
      add(rightp);
      
      setSize(600, 300);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
      eventUp();
   }//������
   
   private void eventUp() {//�̺�Ʈ �ҽ� ���
	  //��ư
	  bt_left.addActionListener(this);//bt_left�� �׼��� �����ϴٰ� �ڵ鷯 ȣ��.
	  bt_left_all.addActionListener(this);
	  bt_right.addActionListener(this);
	  bt_right_all.addActionListener(this);
	  
	  //�ؽ�Ʈ�ʵ�
	  left_tf.addActionListener(this);
	  right_tf.addActionListener(this);
   }
   
  @Override
   public void actionPerformed(ActionEvent e) {//�ڵ鷯(����߰�)
      //�׼�: ��ư������, �ؽ�Ʈ�ʵ忡 enter�Է�
	  //System.out.println("action");   
	  Object ob = e.getSource();//�̺�Ʈ �߻���Ų �̺�Ʈ�ҽ��� �ּ� ���.
      if(ob==left_tf) {//���� �ؽ�Ʈ�ʵ忡 �����Է½�
		 //1.������ ���
    	  String str = left_tf.getText();
    	  
    	  if(str.trim().equals("")) {//str�� ����� ���ٸ�!!
    		  left_tf.setText("");
    		  return;
    	  }   	  
    	  
    	 //2.������ ����
    	  left_list.add(str);
    	 //3.���������� ����
    	  left_tf.setText("");
	  }else if(ob==right_tf) {//���� �ؽ�Ʈ�ʵ忡 �����Է½�
		 //1.������ ���
		  String str = right_tf.getText();
		  
		  if(str.trim().length()<1) {//str�� ����� ���ٸ�!!
			  right_tf.setText("");
    		  return;
    	  }
		  
    	 //2.������ ����   
		  right_list.add(str);
    	 //3.���������� ����
		  right_tf.setText("");
	  }else if(ob==bt_right) {//ù��°��ư(bt_left) Ŭ����
		 //1.(���õȾ�����) ������ ���
		  String str = left_list.getSelectedItem();
		              //���õ� �������� ������ null ����!!
		  
		  if(str==null) {
			//JOptionPane.showMessageDialog(Component parentComponent,Object message);
			//parentComponent: ��ȭ���ڰ� �÷����� ����(����) ������Ʈ
			//message: ���� �޽���
			  //JOptionPane.showMessageDialog(left_list,"�̵��� ������ ����!!");  
			  JOptionPane.showMessageDialog(this,"�̵��� ������ ����!!");  
			 return;//���� �޼ҵ� ����!!
		  }
		  
		 //2.������ ����   
		  right_list.add(str);
		 //3.���������� ����
		  left_list.remove(str);
		  
	  }else if(ob==bt_right_all) {//�ι�°��ư(bt_left_all) Ŭ����
		  //1.(��ü)������ ���  [���ʸ���Ʈ ---> �����ʸ���Ʈ]
		  //2.������ ����    	 
		  //3.����(��ü)������ ����
		  //��ü ������ ī��Ʈ, �ε��� ���� ----> for�� ������ ����
		  for(int i=0; i<left_list.getItemCount(); i++) {
			  System.out.println("getItem("+i+")="+ left_list.getItem(i));
			  right_list.add(left_list.getItem(i));//1,2
		  }
		  
		  left_list.removeAll();//3.���簡 ��ü ���� ��  ���� ����Ʈ ��ü �����͸� �����.		
		  
	  }else if(ob==bt_left) {//����°��ư(bt_right) Ŭ����
		//1.(���õȾ�����) ������ ���
		  String str = right_list.getSelectedItem();
		  
		  if(str==null) {//���õ� �������� ���ٸ�
			  JOptionPane.showMessageDialog(this,"�̵��� ������ ����!!");  
			  return;//���� �޼ҵ� ����!!
		  }
		  
		 //2.������ ����   
		  left_list.add(str);
		 //3.���������� ����
		  right_list.remove(str);
		  
	  }else {//if(ob==bt_left_all) {//�׹�°��ư(bt_right_all) Ŭ����
		  for(int i=0; i<right_list.getItemCount(); i++) {
			  left_list.add(right_list.getItem(i));//1,2
		  }		  
		  right_list.removeAll();//3.���簡 ��ü ���� ��  ���� ����Ʈ ��ü �����͸� �����.
		  
	  }
	  
   }//actionPerformed
  
   public static void main(String[] args) {
	  new ItemMoveTest();
   }
}




