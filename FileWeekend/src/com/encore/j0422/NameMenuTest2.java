package com.encore.j0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest2 {
  public static void main(String[] args) throws IOException {
	//반복되는 메뉴출력(화면 뷰처리)
	//번호입력을 위한 read() 또는 readLine() 메인에서 사용  
	//이름입력을 위한 readLine() 메인에서 사용  
	
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 	  
   NameMenu2 menu = new NameMenu2();
   
   String no; 
  do {	  
	System.out.println("<이름메뉴>");  
	System.out.println("1.추가 2.검색 3.수정 4.삭제 5.종료");  
	System.out.print("번호입력 ==> ");
	 no= in.readLine();//no= "1"  "2"   "3"   "4"   "5"
	 
	 System.out.println();
	 switch(no) {
	   case "1": {
		          System.out.print("이름입력: ");
		          String name= in.readLine();
		          menu.add(name);
	             }
		          //메소드호출 : 메소드명( 데이터  );
		         break;
	   case "2": menu.search();
		         break;
		         
	   case "3": System.out.print("기존이름입력: ");
                 String oldName= in.readLine();
       
                 System.out.print("변경이름입력: ");
                 String newName= in.readLine();
		         
                 menu.update(oldName, newName);
                 
		         break;
	   case "4": System.out.print("삭제이름입력: ");
	             String delName = in.readLine();
	             
	             menu.delete(delName);//메소드명( 데이터 );
	 }//switch
	 
	 
	 System.out.println();
   }while(!no.equals("5"));//번호에 1,2,3,4번 입력했다면
    
   System.out.println("-- END --");
 /* 
    <NOT연산자>
     - 부정연산자
     - 부호 '!' 사용
     - 사용:  !(논리데이터)
           
     예)   !true   ----> false
	    !false  ----> true
  */	    
	  
  }//main
}






