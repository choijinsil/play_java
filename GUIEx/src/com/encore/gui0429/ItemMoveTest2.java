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
   //스크롤바가 지원되는 패널 --->  보통 JList, JTextArea, JTable과 함께 사용
   
   //JList는 데이터를 String[] 또는 Vector로 따로 분리해서 저장!!
   Vector<String> leftV;//좌측 JList가 담을 데이터를 표현   
   Vector<String> rightV;//우측 JList가 담을 데이터를 표현   
   
   public ItemMoveTest2() {
	  leftV = new Vector<String>();
	  rightV = new Vector<String>();
	   
      left_list = new JList<String>();
      //left_scrol = new JScrollPane(스크롤바를 필요로 하는 컴포넌트);
      left_scrol = new JScrollPane(left_list);
      /*
      
      <JList에 데이터 추가방법>
      left_list.setListData(String[] listData);
      left_list.setListData(Vector listData);
      
      */
      
//      String[] listData = {"홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원",
//    		  "홍길동","길라임","김주원"              
//    		               };
//      left_list.setListData(listData);
      
        
      
      
      right_list = new JList<String>();
      right_scrol = new JScrollPane(right_list);
      
//      Vector<String> v = new Vector<>();
//       v.add("김유신");
//       v.add("이순신");
//       v.add("강감찬");
//      right_list.setListData(v);  
    
      
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
    	  leftV.add(str);//벡터에 담고
    	  left_list.setListData(leftV);//벡터 데이터를 JList에 반영
    	  
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
		  rightV.add(str);//벡터에 담고
    	  right_list.setListData(rightV);//벡터 데이터를 JList에 반영
		  
    	 //3.원본데이터 삭제
		  right_tf.setText("");
	  }else if(ob==bt_right) {//첫번째버튼(bt_left) 클릭시
		 //1.(선택된아이템) 데이터 얻기
		  String str = left_list.getSelectedValue();
		              //선택된 아이템이 없을시 null 리턴!!
		  
		  if(str==null) {
			//JOptionPane.showMessageDialog(Component parentComponent,Object message);
			//parentComponent: 대화상자가 올려지는 바탕(기준) 컴포넌트
			//message: 전달 메시지
			  //JOptionPane.showMessageDialog(left_list,"이동할 아이템 선택!!");  
			  JOptionPane.showMessageDialog(this,"이동할 아이템 선택!!");  
			 return;//현재 메소드 종료!!
		  }
		  
		 //2.데이터 복사 (우측 Vector에 전달)
		    rightV.add(str);//오른쪽 벡터에 데이터 추가
		    right_list.setListData(rightV);//벡터값을 오른쪽리스트에 전달(반영)
		  
		 //3.원본데이터 삭제
		    leftV.remove(str);//왼쪽 벡터에 데이터 삭제
		    left_list.setListData(leftV);//왼쪽 벡터의 변경(삭제)된 내용을 왼쪽 리스트에 반영
		    
		  
	  }else if(ob==bt_right_all) {//두번째버튼(bt_left_all) 클릭시
		  //벡터 사이에서 데이터 전달
          //왼쪽벡터 전체 데이터   ---------->  오른쪽벡터에 전달
		  for(int i=0; i<leftV.size(); i++) {
			 rightV.add(leftV.get(i));
		  }
		  
		  //왼쪽벡터 데이터 전체 삭제
		  leftV.clear();
		  //--------------------------------------------
		  
		  
		  //각 리스트는 변경된 벡터내용을 refresh!!
		  left_list.setListData(leftV);
		  right_list.setListData(rightV);
		  
		  
		  
	  }else if(ob==bt_left) {//세번째버튼(bt_right) 클릭시
		//1.(선택된아이템) 데이터 얻기
		  String str = right_list.getSelectedValue();
		              //선택된 아이템이 없을시 null 리턴!!
		  
		  if(str==null) {
			  JOptionPane.showMessageDialog(this,"이동할 아이템 선택!!");  
			 return;//현재 메소드 종료!!
		  }
		  
		 //2.데이터 복사 (좌측 Vector에 전달)
		    leftV.add(str);//왼쪽 벡터에 데이터 추가
		    left_list.setListData(leftV);//벡터값을 왼쪽리스트에 전달(반영)
		  
		 //3.원본데이터 삭제
		    rightV.remove(str);//오른쪽 벡터에 데이터 삭제
		    right_list.setListData(rightV);//오른쪽 벡터의 변경(삭제)된 내용을 오른쪽 리스트에 반영
		  
		  
	  }else {//if(ob==bt_left_all) {//네번째버튼(bt_right_all) 클릭시
		  //벡터 사이에서 데이터 전달
          //오른쪽벡터 전체 데이터   ---------->  왼쪽벡터에 전달
		  for(int i=0; i<rightV.size(); i++) {
			 leftV.add(rightV.get(i));
		  }
		  
		  //오른쪽벡터 데이터 전체 삭제
		  rightV.clear();
		  //--------------------------------------------
		  
		  
		  //각 리스트는 변경된 벡터내용을 refresh!!
		  left_list.setListData(leftV);
		  right_list.setListData(rightV);
		  
	  }
	  
   }//actionPerformed
  
   public static void main(String[] args) {
	  new ItemMoveTest2();
   }
}




