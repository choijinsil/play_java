package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoTeacher {
   int []lotto;//null
   Random r;//null
	
   public LottoTeacher() {//생성자: 초기화 메소드, 선행작업
	 lotto = new int[6];
	 r = new Random();
   }//생성자
   
   //번호출력 기능(배열에 저장된 값 출력)   
   public void printNum() {
	  for (int i = 0; i < lotto.length; i++) {//반복 6번 :인덱스 0~5
		  System.out.print(lotto[i]);//6번
		  if(i < 5)System.out.print(", ");//5번
	  } 
   }//printNum
   
   //로또번호생성 기능
   public void generateNum() {
	   for (int i = 0; i < lotto.length; i++) {//반복 6번 :인덱스 0~5
		   lotto[i]=r.nextInt(45)+1; //1~45
		   //boolean flag = duplicateNum(3);
		   //if(flag)i--;
		   if(duplicateNum(i))i--;
		   
	   }//for
	   // 정렬
	   Arrays.sort(lotto);
   }//generateNum
   
   //중복숫자 체크 기능
   public boolean duplicateNum(int idx) {//중복숫자 발견시 true리턴
	   /*   기준인덱스(idx)  비교인덱스(for)
	          1            0
	          2            1 0
	          3            2 1 0
	          4            3 2 1 0
	          5            4 3 2 1 0
	    */
	   for(int i=idx-1; i>-1; i--) {
		  if(lotto[idx] ==  lotto[i]) return true;
		    //중복된 데이터를 발견했다면
	   }//for
	  return false;
   }//duplicateNum
	
	
   public static void main(String[] args) {
	   LottoTeacher lotto = new LottoTeacher();
	   for (int i = 1; i < 6; i++) {
		   System.out.print(i+"회: ");
		   lotto.generateNum();
		   lotto.printNum();
		   System.out.println();
	}
	  
   }
}




