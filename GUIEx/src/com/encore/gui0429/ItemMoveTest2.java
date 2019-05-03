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

public class ItemMoveTest2 extends JFrame implements ActionListener{
   JList<String> left_list, right_list;
   
   JTextField left_tf, right_tf;
   JButton bt_right,bt_right_all, bt_left, bt_left_all;
   
   JPanel leftp, centerp, rightp;
   
   JScrollPane left_scrol, right_scrol;
   //��ũ�ѹٰ� �����Ǵ� �г� --->  ���� JList, JTextArea, JTable�� �Բ� ���
   
   //JList�� �����͸� String[] �Ǵ� Vector�� ���� �и��ؼ� ����!!
   Vector<String> leftV;//���� JList�� ���� �����͸� ǥ��   
   Vector<String> rightV;//���� JList�� ���� �����͸� ǥ��   
   
   public ItemMoveTest2() {
	  leftV = new Vector<String>();
	  rightV = new Vector<String>();
	   
      left_list = new JList<String>();
      //left_scrol = new JScrollPane(��ũ�ѹٸ� �ʿ�� �ϴ� ������Ʈ);
      left_scrol = new JScrollPane(left_list);
      /*
      
      <JList�� ������ �߰����>
      left_list.setListData(String[] listData);
      left_list.setListData(Vector listData);
      
      */
      
//      String[] listData = {"ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�",
//    		  "ȫ�浿","�����","���ֿ�"              
//    		               };
//      left_list.setListData(listData);
      
        
      
      
      right_list = new JList<String>();
      right_scrol = new JScrollPane(right_list);
      
//      Vector<String> v = new Vector<>();
//       v.add("������");
//       v.add("�̼���");
//       v.add("������");
//      right_list.setListData(v);  
    
      
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
    	  leftV.add(str);//���Ϳ� ���
    	  left_list.setListData(leftV);//���� �����͸� JList�� �ݿ�
    	  
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
		  rightV.add(str);//���Ϳ� ���
    	  right_list.setListData(rightV);//���� �����͸� JList�� �ݿ�
		  
    	 //3.���������� ����
		  right_tf.setText("");
	  }else if(ob==bt_right) {//ù��°��ư(bt_left) Ŭ����
		 //1.(���õȾ�����) ������ ���
		  String str = left_list.getSelectedValue();
		              //���õ� �������� ������ null ����!!
		  
		  if(str==null) {
			//JOptionPane.showMessageDialog(Component parentComponent,Object message);
			//parentComponent: ��ȭ���ڰ� �÷����� ����(����) ������Ʈ
			//message: ���� �޽���
			  //JOptionPane.showMessageDialog(left_list,"�̵��� ������ ����!!");  
			  JOptionPane.showMessageDialog(this,"�̵��� ������ ����!!");  
			 return;//���� �޼ҵ� ����!!
		  }
		  
		 //2.������ ���� (���� Vector�� ����)
		    rightV.add(str);//������ ���Ϳ� ������ �߰�
		    right_list.setListData(rightV);//���Ͱ��� �����ʸ���Ʈ�� ����(�ݿ�)
		  
		 //3.���������� ����
		    leftV.remove(str);//���� ���Ϳ� ������ ����
		    left_list.setListData(leftV);//���� ������ ����(����)�� ������ ���� ����Ʈ�� �ݿ�
		    
		  
	  }else if(ob==bt_right_all) {//�ι�°��ư(bt_left_all) Ŭ����
		  //���� ���̿��� ������ ����
          //���ʺ��� ��ü ������   ---------->  �����ʺ��Ϳ� ����
		  for(int i=0; i<leftV.size(); i++) {
			 rightV.add(leftV.get(i));
		  }
		  
		  //���ʺ��� ������ ��ü ����
		  leftV.clear();
		  //--------------------------------------------
		  
		  
		  //�� ����Ʈ�� ����� ���ͳ����� refresh!!
		  left_list.setListData(leftV);
		  right_list.setListData(rightV);
		  
		  
		  
	  }else if(ob==bt_left) {//����°��ư(bt_right) Ŭ����
		//1.(���õȾ�����) ������ ���
		  String str = right_list.getSelectedValue();
		              //���õ� �������� ������ null ����!!
		  
		  if(str==null) {
			  JOptionPane.showMessageDialog(this,"�̵��� ������ ����!!");  
			 return;//���� �޼ҵ� ����!!
		  }
		  
		 //2.������ ���� (���� Vector�� ����)
		    leftV.add(str);//���� ���Ϳ� ������ �߰�
		    left_list.setListData(leftV);//���Ͱ��� ���ʸ���Ʈ�� ����(�ݿ�)
		  
		 //3.���������� ����
		    rightV.remove(str);//������ ���Ϳ� ������ ����
		    right_list.setListData(rightV);//������ ������ ����(����)�� ������ ������ ����Ʈ�� �ݿ�
		  
		  
	  }else {//if(ob==bt_left_all) {//�׹�°��ư(bt_right_all) Ŭ����
		  //���� ���̿��� ������ ����
          //�����ʺ��� ��ü ������   ---------->  ���ʺ��Ϳ� ����
		  for(int i=0; i<rightV.size(); i++) {
			 leftV.add(rightV.get(i));
		  }
		  
		  //�����ʺ��� ������ ��ü ����
		  rightV.clear();
		  //--------------------------------------------
		  
		  
		  //�� ����Ʈ�� ����� ���ͳ����� refresh!!
		  left_list.setListData(leftV);
		  right_list.setListData(rightV);
		  
	  }
	  
   }//actionPerformed
  
   public static void main(String[] args) {
	  new ItemMoveTest2();
   }
}




