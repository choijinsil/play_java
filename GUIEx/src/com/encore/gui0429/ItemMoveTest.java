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
  
      //'ㅁ'한글입력 - 한자키 누름
      //확장된 부호찾기 - ▷ ▶ ◁ ◀
      bt_right = new JButton("▷");
      bt_right_all = new JButton("▶");
      bt_left = new JButton("◁");
      bt_left_all = new JButton("◀");
     
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
        
        
      setTitle("Item움직이기");
      setLayout(new GridLayout(1,3));
      add(leftp);
      add(centerp);
      add(rightp);
      
      setSize(600, 300);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
      eventUp();
   }//생성자
   
   private void eventUp() {//이벤트 소스 등록
	  //버튼
	  bt_left.addActionListener(this);//bt_left에 액션을 감지하다가 핸들러 호출.
	  bt_left_all.addActionListener(this);
	  bt_right.addActionListener(this);
	  bt_right_all.addActionListener(this);
	  
	  //텍스트필드
	  left_tf.addActionListener(this);
	  right_tf.addActionListener(this);
   }
   
  @Override
   public void actionPerformed(ActionEvent e) {//핸들러(기능추가)
      //액션: 버튼누르기, 텍스트필드에 enter입력
	  //System.out.println("action");   
	  Object ob = e.getSource();//이벤트 발생시킨 이벤트소스의 주소 얻기.
      if(ob==left_tf) {//좌측 텍스트필드에 엔터입력시
		 //1.데이터 얻기
    	  String str = left_tf.getText();
    	  
    	  if(str.trim().equals("")) {//str이 공백과 같다면!!
    		  left_tf.setText("");
    		  return;
    	  }   	  
    	  
    	 //2.데이터 복사
    	  left_list.add(str);
    	 //3.원본데이터 삭제
    	  left_tf.setText("");
	  }else if(ob==right_tf) {//우측 텍스트필드에 엔터입력시
		 //1.데이터 얻기
		  String str = right_tf.getText();
		  
		  if(str.trim().length()<1) {//str이 공백과 같다면!!
			  right_tf.setText("");
    		  return;
    	  }
		  
    	 //2.데이터 복사   
		  right_list.add(str);
    	 //3.원본데이터 삭제
		  right_tf.setText("");
	  }else if(ob==bt_right) {//첫번째버튼(bt_left) 클릭시
		 //1.(선택된아이템) 데이터 얻기
		  String str = left_list.getSelectedItem();
		              //선택된 아이템이 없을시 null 리턴!!
		  
		  if(str==null) {
			//JOptionPane.showMessageDialog(Component parentComponent,Object message);
			//parentComponent: 대화상자가 올려지는 바탕(기준) 컴포넌트
			//message: 전달 메시지
			  //JOptionPane.showMessageDialog(left_list,"이동할 아이템 선택!!");  
			  JOptionPane.showMessageDialog(this,"이동할 아이템 선택!!");  
			 return;//현재 메소드 종료!!
		  }
		  
		 //2.데이터 복사   
		  right_list.add(str);
		 //3.원본데이터 삭제
		  left_list.remove(str);
		  
	  }else if(ob==bt_right_all) {//두번째버튼(bt_left_all) 클릭시
		  //1.(전체)데이터 얻기  [왼쪽리스트 ---> 오른쪽리스트]
		  //2.데이터 복사    	 
		  //3.원본(전체)데이터 삭제
		  //전체 데이터 카운트, 인덱스 존재 ----> for문 적용이 가능
		  for(int i=0; i<left_list.getItemCount(); i++) {
			  System.out.println("getItem("+i+")="+ left_list.getItem(i));
			  right_list.add(left_list.getItem(i));//1,2
		  }
		  
		  left_list.removeAll();//3.복사가 전체 끝난 후  원본 리스트 전체 데이터를 지우기.		
		  
	  }else if(ob==bt_left) {//세번째버튼(bt_right) 클릭시
		//1.(선택된아이템) 데이터 얻기
		  String str = right_list.getSelectedItem();
		  
		  if(str==null) {//선택된 아이템이 없다면
			  JOptionPane.showMessageDialog(this,"이동할 아이템 선택!!");  
			  return;//현재 메소드 종료!!
		  }
		  
		 //2.데이터 복사   
		  left_list.add(str);
		 //3.원본데이터 삭제
		  right_list.remove(str);
		  
	  }else {//if(ob==bt_left_all) {//네번째버튼(bt_right_all) 클릭시
		  for(int i=0; i<right_list.getItemCount(); i++) {
			  left_list.add(right_list.getItem(i));//1,2
		  }		  
		  right_list.removeAll();//3.복사가 전체 끝난 후  원본 리스트 전체 데이터를 지우기.
		  
	  }
	  
   }//actionPerformed
  
   public static void main(String[] args) {
	  new ItemMoveTest();
   }
}




