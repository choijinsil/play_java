package com.encore.j0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameMenuTest2 {
  public static void main(String[] args) throws IOException {
	//�ݺ��Ǵ� �޴����(ȭ�� ��ó��)
	//��ȣ�Է��� ���� read() �Ǵ� readLine() ���ο��� ���  
	//�̸��Է��� ���� readLine() ���ο��� ���  
	
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 	  
   NameMenu2 menu = new NameMenu2();
   
   String no; 
  do {	  
	System.out.println("<�̸��޴�>");  
	System.out.println("1.�߰� 2.�˻� 3.���� 4.���� 5.����");  
	System.out.print("��ȣ�Է� ==> ");
	 no= in.readLine();//no= "1"  "2"   "3"   "4"   "5"
	 
	 System.out.println();
	 switch(no) {
	   case "1": {
		          System.out.print("�̸��Է�: ");
		          String name= in.readLine();
		          menu.add(name);
	             }
		          //�޼ҵ�ȣ�� : �޼ҵ��( ������  );
		         break;
	   case "2": menu.search();
		         break;
		         
	   case "3": System.out.print("�����̸��Է�: ");
                 String oldName= in.readLine();
       
                 System.out.print("�����̸��Է�: ");
                 String newName= in.readLine();
		         
                 menu.update(oldName, newName);
                 
		         break;
	   case "4": System.out.print("�����̸��Է�: ");
	             String delName = in.readLine();
	             
	             menu.delete(delName);//�޼ҵ��( ������ );
	 }//switch
	 
	 
	 System.out.println();
   }while(!no.equals("5"));//��ȣ�� 1,2,3,4�� �Է��ߴٸ�
    
   System.out.println("-- END --");
 /* 
    <NOT������>
     - ����������
     - ��ȣ '!' ���
     - ���:  !(��������)
           
     ��)   !true   ----> false
	    !false  ----> true
  */	    
	  
  }//main
}






