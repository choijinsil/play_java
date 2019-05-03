package com.encore.gui0430;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/*
<�̺�Ʈ ó��> - ���(��ư����,���콺������,üũ�ϱ�,�ؽ�Ʈ�����) �߻��� ���(���๮��� ���)�߰�
1. �̺�Ʈ �ҽ�:  bt_new, bt_clear, bt_dap, bt_exit, tf
              ---------------------------------- ---
                    JButton                      JTextField
                   ���:      ��ư����                                     �ؽ�Ʈ�ʵ忡 ���Ͱ� �Է�   -----> Action�̺�Ʈ!!
                   
2. implements ActionListener
    ---> actionPerformed����
    
3. ������ ���
    ��ư��.addActionListener(this);
    �ؽ�Ʈ��.addActionListener(this);
 */

public class BaseBallGame2 extends JFrame implements ActionListener{
   JTextArea ta;
   JButton bt_new, bt_clear, bt_dap, bt_exit, bt_hint;
   JLabel la;
   JTextField tf;
   //JScrollPane: ������ ����� �����͸� ǥ��(JTextArea, JList, JTable)
   JScrollPane scroll_ta;
   
   JPanel panel;  
   
   int []com;
   int []user;
   Random r;
   int count;
   
   JFrame f;
   boolean start;//���� ���� ���� ǥ��
   
   public BaseBallGame2() {
	 setTitle("���ھ߱�����");
	 
	 f = this;
	 
	 com= new int[3]; //�迭��ü������!!
	 user= new int[3]; //����ڰ� �Է��� �����ͷ� �ʱ�ȭ
	          //{0,0,0}
	 
	 r = new Random();
	 
	 createNum();
	 	 
	 ta = new JTextArea();
	   ta.setFont(new Font("����ü", Font.BOLD , 17));
	   ta.setLineWrap(true);
	   //TextArea�� �ڵ� �ٹٲ�(���λ���� ����� �ؽ�Ʈ �߽߰�)
	   ta.setEditable(false);
	   //ta.setEnabled(false);
	 
	 //scroll_ta = new JScrollPane(��ũ�ѹٸ� �ʿ�� �ϴ� ������Ʈ);
	 scroll_ta = new JScrollPane(ta);
	 
	 bt_new = new JButton("������");
	 bt_clear = new JButton("�����");
	 bt_dap = new JButton("����");
	 bt_exit = new JButton("����");
	 bt_hint = new JButton("��Ʈ");
	 
	 la = new JLabel("�Է�:");
	 tf = new JTextField();
	 
	 //ta.setBounds(10, 10, 350, 300);
	 scroll_ta.setBounds(10, 10, 350, 300);
	 
	 bt_new.setBounds(380,40,90,40);
	 bt_clear.setBounds(380,100,90,40);
	 bt_dap.setBounds(380,160,90,40);	 
	 bt_hint.setBounds(380,220,90,40);
	 bt_exit.setBounds(380,280,90,40);
	 
	 la.setBounds(10, 320, 30,30);
	 tf.setBounds(50, 320, 310,30);
	 
	 panel = new JPanel();
	  panel.setLayout(null);
	  panel.setBackground(Color.ORANGE);
	  panel.add(scroll_ta);//(ta);
	  panel.add(bt_new);
	  panel.add(bt_clear);
	  panel.add(bt_dap);
	  panel.add(bt_hint);
	  panel.add(bt_exit);
	  panel.add(la);
	  panel.add(tf);
	 
	 add(panel);
	 setBounds(300,300, 500,410);
	 setVisible(true);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	 setResizable(false);//�����ӿ� ���� ������ ���� �Ұ�!!
	 
	 //Ư�� ������Ʈ�� ��Ŀ�� �̵�
	 tf.requestFocus();
	
	 endGame();//�ؽ�Ʈ�ʵ�, �����ư, ��Ʈ��ư ��Ȱ��ȭ
	 
	 ruleDescription();
	 
	 eventUp();//�̺�Ʈ�ҽ� ���(�̺�Ʈ�ҽ��� �̺�Ʈó���� ����)!!
   }//������

   private void eventUp() {
	 //��ư
	 bt_new.addActionListener(this);  //201ȣ
	 bt_clear.addActionListener(this); //202ȣ 
	 bt_dap.addActionListener(this);   //203ȣ
	 bt_exit.addActionListener(this);  //204ȣ
	 bt_hint.addActionListener(this);  //206ȣ
	   
	 //�ؽ�Ʈ�ʵ�
	 tf.addActionListener(this);  //205ȣ
	 
	 
	 tf.addMouseListener(new MouseAdapter() {
		 @Override
		public void mousePressed(MouseEvent e) {
		    //JOptionPane.showMessageDialog(f, "���ӽ����� ���� [������]��ư�� Ŭ��!!");
		   if(!start)//start==false)
			 showMsg("���ӽ����� ���� [������]��ư�� Ŭ��!!");	 
		}
	  });
	 /*
	  class BaseBallGame2 extends JFrame{//�ܺ�Ŭ���� 
	     new MouseAdapter()
	     {//�͸��� ����Ŭ���� ����      
	       
	       this  --->  JFrame X 
	       this  --->  MouseAdapter O 
	       
	     }//�͸��� ����Ŭ���� ��
	  }
	   ===========================================================
	   class My  extends MouseAdapter{
	             ---------------------
	                  ���� new ���� ���� �ڷ����� Ŭ������ extends, �������̽��� implements
	   }
	   
	   ==> ���� �ڵ�� My��� �̸��� Ŭ�������� �����Ƿ� �͸�(Anonymous)�̶���.
	   
	 */
	 
	 
	 
	 
   }//eventUp
   
   @Override
   public void actionPerformed(ActionEvent e) {//EventHandler(�̺�Ʈó����) - �������
	  //���� ����� �̺�Ʈ�߻� ������Ʈ�� ���� ���� ��ġ.
	   
	  Object ob =  e.getSource();//�̺�Ʈ�ҽ��� �ּ� ���.
	  if(ob == tf) {//�ؽ�Ʈ �ʵ忡 enter �Է½�
		 //����ڰ� �Է��� String�� com�迭�� ���� ���Ͽ� ȭ��(TextArea)�� ��� ���.
		  
		String str = tf.getText();//"369" ---> {3,6,9} ��ȯ�Ѵٸ� �񱳿���!!

		//str�� ��ȿ�� �˻�!!(���ڸ� ����)
		if(!str.matches("[\\d]{3}")) {//���ڸ� ���ڰ� �ƴ϶��
			showMsg("���ڸ����ڸ� �Է�!!");
			tf.setText("");
			return;
		}
		
		
		/*
	    int su = Integer.parseInt(str);//"369" ---> 369
	    user[0]=su/100;  // 369/100 ---> 3
	    user[1]=(su%100)/10;  // (369%100)/10 ---> 69/10 ---> 6
	    user[2]=(su%100)%10;  // (369%100)%10 ---> 69%10 ---> 9
		*/
		
		//String str="369";
		//     �ε���    012
		/*
		user[0]=str.charAt(0)-48; //user[0] = '3'-48  = 51-48 ?
		user[1]=str.charAt(1)-48;
		user[2]=str.charAt(2)-48;
		*/
	   for(int i=0; i<com.length; i++) {
		 user[i]=str.charAt(i)-48;
	   }
	   
	   if(duplicateNum()) {
			showMsg("�ߺ��� ���ڻ�����!!");
			tf.setText("");
			return;
		}
		
		
		count++; 
	   
	   
	   //==> com�迭�� ���� �� �ִ� ����� int[]user �迭 ���� ����
	   
	   
	   int strike=0,ball=0;
	   //��
	   for(int i=0; i<com.length; i++) {//com�迭 �ε���          [0]   [1]   [2]
		 for(int j=0; j<user.length; j++) {//user�迭 �ε���  [0]   [1]   [2] 
			//���� ��(��)�� �����Ѵٸ� ==> ��Ʈ����ũ �Ǵ� �� �ĺ�!!
			 if(com[i] == user[j]) {//���� �� �߰�!!
				 if(i==j) {//���� �ڸ���(��,��,��) ��� 
					strike++;//���� ��, ���� �ڸ� 
				 }else {
					ball++; //���� ��, �ٸ� �ڸ�
				 }
			 }
		 }//����for
	   }//�ٱ�for
	   
	    //9���� �񱳰� ������ ��� ���!!
	   
	   if(strike==3) {
	    ta.append("�������մϴ٢� ����[" + str +"]�� ���߼̽��ϴ�^^*\n");
	    endGame();
	   }else {
	    ta.append(count+": "+str+" �� " + strike +"Strike "+ ball+"Ball\n");
	   }
		  
	    tf.setText("");
	    
	  }else if(ob == bt_new) {//'������'��ư Ŭ����
		  startGame();
	  }else if(ob == bt_dap) {//'����'��ư Ŭ����
		 //com�迭�� ���� ta�� ���
		 ta.append("�� ������ ["+com[0]+com[1]+com[2]+"]�Դϴ�.\n" ); 
		 endGame();
	  }else if(ob == bt_clear) {//'�����'��ư Ŭ����
		 //�ؽ�Ʈ �����
		  ta.setText("");
		  tf.setText("");
	  }else if(ob == bt_hint) {
		  
		  JOptionPane.showMessageDialog(this, "��Ʈ["+ com[r.nextInt(3)]  +"]");
		  bt_hint.setEnabled(false);
	  }else if(ob == bt_exit) {//'����'��ư Ŭ����
		 //��ü���α׷�����
		  System.exit(0);
	  } 
	   
   }//actionPerformed
   
   public void createNum() {
     for(int i=0; i<com.length; i++) {//com�迭 �ε��� ǥ��
		 com[i]= r.nextInt(10);//0~9
		 for(int j=i-1;  j>=0; j--) {//�ߺ��˻�: i=1 --> 0������
	                                 //        i=2 --> 1����, 0���� ��
	      if(com[i] == com[j]) {//�ߺ��� �����Ͱ� �߰ߵȴٸ�
	           i--;
	           break;
	      }
 }//����for 
	  }//�ٱ���for   
   }//��ȣ����
   
   public boolean duplicateNum() {//�ߺ����� �߽߰� true����
	  if(user[0]== user[1] ||
	     user[0]== user[2] ||
	     user[1]== user[2]) {
		  return true;
	  }
	  return false; 
   }//duplicateNum
   
   
   public void ruleDescription() {//���� �� ����
	 ta.append("\n\n\t<���ھ߱�����>");  
	 ta.append("\n1. ���ӽ����� ���ؼ� �����ӹ�ư�� Ŭ��");  
	 ta.append("\n2. �Է¿� �ߺ������ʴ� ���ڸ����� �Է�   �� ����");  
	 ta.append("\n3. ���ڿ� �ڸ����� ���߸� Strike, ����  �� ���߸� Ball�� �߰��˴ϴ�.");  
	 ta.append("\n4. ������ ���� ������ �����ư�� Ŭ��");  
	 ta.append("\n5. ��Ÿ ���ǻ����� ������ �����ڿ���     �����ٶ�(02-754-7302)");  
   }//ruleDescription
   
   public void showMsg(String message) {
	   JOptionPane.showMessageDialog(this, message);
   }//showMsg
   
   //���� ����
   public void startGame() {
	  start=true; 
	   
	  createNum();
	  tf.setEnabled(true); 
	  ta.setText("");
	  count=0;
	  bt_dap.setEnabled(true);
	  bt_hint.setEnabled(true);
	  
	  tf.requestFocus();
   }//startGame
   
   //���� ��   
   public void endGame() {
	  start=false;  
	   
	  tf.setEnabled(false); 
	  bt_dap.setEnabled(false);
	  bt_hint.setEnabled(false);
   }
   
   public static void main(String[] args) {
	 new BaseBallGame2();
   }

}






