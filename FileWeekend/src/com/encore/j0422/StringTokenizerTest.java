package com.encore.j0422;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	
   public static void main(String[] args) {
	  //StringTokenizer : ���ڿ� �����͸� Ư�� ������(delimiter)�� ���� �и����ִ� Ŭ����
	   
	  //StringTokenizer(String str, String delim) ������
	  //str--> ���ع��ڿ�(��ü���ڿ�),  delim ---> ������
	  //token(��ū) : �и��� ������ ������!!
	   
	  String tel="010--5678";
	  StringTokenizer st = new StringTokenizer(tel, "-");
	  //st = ["010", "1234" , "5678"]; ==>��ū ������
	  
	  //��ū ������ ��������  : String st.nextToken()
//	  System.out.println(st.nextToken());
//	  System.out.println(st.nextToken());
//	  System.out.println(st.nextToken());
//	  System.out.println(st.nextToken());//������ ��ū�����Ͱ� ���� �� �����߻�!!
	  
	  while(st.hasMoreTokens()) { //st�� ��ū�����͸� ������ �ִٸ� true����
		  System.out.println(st.nextToken());
	  }
	  //------------------------------------------------------------
	  //String tel="010-1234-5678";
	  //String[] tel.split(String regex) : Ư������(�Ű�����)�� ���� �����͸� �и� --->���:���ڿ��迭 
	  System.out.println("=========================");
	  //String [] tels= tel.split("-");//tels={"010", "" , "5678"};
	  //split()�޼ҵ�� ���ڿ�"" �����͵� �����ؼ� ���.
	  String [] tels= tel.split("-");//tels={"010", "1234" , "5678"};
	  for(int i=0; i<tels.length; i++) {//tels�迭 �ε���
		  System.out.println("tels["+i+"]="+ tels[i]);
	  }
	  
   }//main	

}








