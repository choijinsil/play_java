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
<이벤트 처리> - 사건(버튼눌림,마우스움직임,체크하기,텍스트쓰기등) 발생시 기능(실행문장들 기술)추가
1. 이벤트 소스:  bt_new, bt_clear, bt_dap, bt_exit, tf
              ---------------------------------- ---
                    JButton                      JTextField
                   사건:      버튼눌림                                     텍스트필드에 엔터가 입력   -----> Action이벤트!!
                   
2. implements ActionListener
    ---> actionPerformed구현
    
3. 연결자 등록
    버튼명.addActionListener(this);
    텍스트명.addActionListener(this);
 */

public class BaseBallGame2 extends JFrame implements ActionListener{
   JTextArea ta;
   JButton bt_new, bt_clear, bt_dap, bt_exit, bt_hint;
   JLabel la;
   JTextField tf;
   //JScrollPane: 범위를 벗어나는 데이터를 표현(JTextArea, JList, JTable)
   JScrollPane scroll_ta;
   
   JPanel panel;  
   
   int []com;
   int []user;
   Random r;
   int count;
   
   JFrame f;
   boolean start;//게임 시작 상태 표현
   
   public BaseBallGame2() {
	 setTitle("숫자야구게임");
	 
	 f = this;
	 
	 com= new int[3]; //배열객체생성식!!
	 user= new int[3]; //사용자가 입력한 데이터로 초기화
	          //{0,0,0}
	 
	 r = new Random();
	 
	 createNum();
	 	 
	 ta = new JTextArea();
	   ta.setFont(new Font("굴림체", Font.BOLD , 17));
	   ta.setLineWrap(true);
	   //TextArea에 자동 줄바꿈(가로사이즈를 벗어나는 텍스트 발견시)
	   ta.setEditable(false);
	   //ta.setEnabled(false);
	 
	 //scroll_ta = new JScrollPane(스크롤바를 필요로 하는 컴포넌트);
	 scroll_ta = new JScrollPane(ta);
	 
	 bt_new = new JButton("새게임");
	 bt_clear = new JButton("지우기");
	 bt_dap = new JButton("정답");
	 bt_exit = new JButton("종료");
	 bt_hint = new JButton("힌트");
	 
	 la = new JLabel("입력:");
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
	 
	 setResizable(false);//프레임에 대한 사이즈 변경 불가!!
	 
	 //특정 컴포넌트에 포커스 이동
	 tf.requestFocus();
	
	 endGame();//텍스트필드, 정답버튼, 힌트버튼 비활성화
	 
	 ruleDescription();
	 
	 eventUp();//이벤트소스 등록(이벤트소스와 이벤트처리부 연결)!!
   }//생성자

   private void eventUp() {
	 //버튼
	 bt_new.addActionListener(this);  //201호
	 bt_clear.addActionListener(this); //202호 
	 bt_dap.addActionListener(this);   //203호
	 bt_exit.addActionListener(this);  //204호
	 bt_hint.addActionListener(this);  //206호
	   
	 //텍스트필드
	 tf.addActionListener(this);  //205호
	 
	 
	 tf.addMouseListener(new MouseAdapter() {
		 @Override
		public void mousePressed(MouseEvent e) {
		    //JOptionPane.showMessageDialog(f, "게임시작을 위해 [새게임]버튼을 클릭!!");
		   if(!start)//start==false)
			 showMsg("게임시작을 위해 [새게임]버튼을 클릭!!");	 
		}
	  });
	 /*
	  class BaseBallGame2 extends JFrame{//외부클래스 
	     new MouseAdapter()
	     {//익명의 내부클래스 시작      
	       
	       this  --->  JFrame X 
	       this  --->  MouseAdapter O 
	       
	     }//익명의 내부클래스 끝
	  }
	   ===========================================================
	   class My  extends MouseAdapter{
	             ---------------------
	                  위의 new 다음 오는 자료형이 클래스면 extends, 인터페이스면 implements
	   }
	   
	   ==> 위의 코드는 My라는 이름의 클래스명이 없으므로 익명(Anonymous)이라함.
	   
	 */
	 
	 
	 
	 
   }//eventUp
   
   @Override
   public void actionPerformed(ActionEvent e) {//EventHandler(이벤트처리부) - 기능정의
	  //가장 빈번한 이벤트발생 컴포넌트를 가장 위에 위치.
	   
	  Object ob =  e.getSource();//이벤트소스의 주소 얻기.
	  if(ob == tf) {//텍스트 필드에 enter 입력시
		 //사용자가 입력한 String과 com배열의 값을 비교하여 화면(TextArea)에 결과 출력.
		  
		String str = tf.getText();//"369" ---> {3,6,9} 변환한다면 비교용이!!

		//str의 유효성 검사!!(세자리 숫자)
		if(!str.matches("[\\d]{3}")) {//세자리 숫자가 아니라면
			showMsg("세자리숫자만 입력!!");
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
		//     인덱스    012
		/*
		user[0]=str.charAt(0)-48; //user[0] = '3'-48  = 51-48 ?
		user[1]=str.charAt(1)-48;
		user[2]=str.charAt(2)-48;
		*/
	   for(int i=0; i<com.length; i++) {
		 user[i]=str.charAt(i)-48;
	   }
	   
	   if(duplicateNum()) {
			showMsg("중복된 숫자사용금지!!");
			tf.setText("");
			return;
		}
		
		
		count++; 
	   
	   
	   //==> com배열과 비교할 수 있는 대등한 int[]user 배열 값이 생성
	   
	   
	   int strike=0,ball=0;
	   //비교
	   for(int i=0; i<com.length; i++) {//com배열 인덱스          [0]   [1]   [2]
		 for(int j=0; j<user.length; j++) {//user배열 인덱스  [0]   [1]   [2] 
			//같은 수(값)가 존재한다면 ==> 스트라이크 또는 볼 후보!!
			 if(com[i] == user[j]) {//같은 수 발견!!
				 if(i==j) {//같은 자릿수(백,십,일) 라면 
					strike++;//같은 수, 같은 자리 
				 }else {
					ball++; //같은 수, 다른 자리
				 }
			 }
		 }//안쪽for
	   }//바깥for
	   
	    //9번의 비교가 끝난후 결과 출력!!
	   
	   if(strike==3) {
	    ta.append("♥축하합니다♥ 정답[" + str +"]을 맞추셨습니다^^*\n");
	    endGame();
	   }else {
	    ta.append(count+": "+str+" ▶ " + strike +"Strike "+ ball+"Ball\n");
	   }
		  
	    tf.setText("");
	    
	  }else if(ob == bt_new) {//'새게임'버튼 클릭시
		  startGame();
	  }else if(ob == bt_dap) {//'정답'버튼 클릭시
		 //com배열의 값을 ta에 출력
		 ta.append("▣ 정답은 ["+com[0]+com[1]+com[2]+"]입니다.\n" ); 
		 endGame();
	  }else if(ob == bt_clear) {//'지우기'버튼 클릭시
		 //텍스트 지우기
		  ta.setText("");
		  tf.setText("");
	  }else if(ob == bt_hint) {
		  
		  JOptionPane.showMessageDialog(this, "힌트["+ com[r.nextInt(3)]  +"]");
		  bt_hint.setEnabled(false);
	  }else if(ob == bt_exit) {//'종료'버튼 클릭시
		 //전체프로그램종료
		  System.exit(0);
	  } 
	   
   }//actionPerformed
   
   public void createNum() {
     for(int i=0; i<com.length; i++) {//com배열 인덱스 표현
		 com[i]= r.nextInt(10);//0~9
		 for(int j=i-1;  j>=0; j--) {//중복검사: i=1 --> 0번지비교
	                                 //        i=2 --> 1번지, 0번지 비교
	      if(com[i] == com[j]) {//중복된 데이터가 발견된다면
	           i--;
	           break;
	      }
 }//안쪽for 
	  }//바깥쪽for   
   }//번호생성
   
   public boolean duplicateNum() {//중복숫자 발견시 true리턴
	  if(user[0]== user[1] ||
	     user[0]== user[2] ||
	     user[1]== user[2]) {
		  return true;
	  }
	  return false; 
   }//duplicateNum
   
   
   public void ruleDescription() {//게임 룰 설명
	 ta.append("\n\n\t<숫자야구게임>");  
	 ta.append("\n1. 게임시작을 위해서 새게임버튼을 클릭");  
	 ta.append("\n2. 입력에 중복되지않는 세자리수를 입력   후 엔터");  
	 ta.append("\n3. 숫자와 자릿수를 맞추면 Strike, 숫자  만 맞추면 Ball이 추가됩니다.");  
	 ta.append("\n4. 정답을 보고 싶으면 정답버튼을 클릭");  
	 ta.append("\n5. 기타 문의사항이 있으면 관리자에게     연락바람(02-754-7302)");  
   }//ruleDescription
   
   public void showMsg(String message) {
	   JOptionPane.showMessageDialog(this, message);
   }//showMsg
   
   //게임 시작
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
   
   //게임 끝   
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






