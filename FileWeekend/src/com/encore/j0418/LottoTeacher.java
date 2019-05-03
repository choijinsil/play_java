package com.encore.j0418;

import java.util.Arrays;
import java.util.Random;

public class LottoTeacher {
   int []lotto;//null
   Random r;//null
	
   public LottoTeacher() {//������: �ʱ�ȭ �޼ҵ�, �����۾�
	 lotto = new int[6];
	 r = new Random();
   }//������
   
   //��ȣ��� ���(�迭�� ����� �� ���)   
   public void printNum() {
	  for (int i = 0; i < lotto.length; i++) {//�ݺ� 6�� :�ε��� 0~5
		  System.out.print(lotto[i]);//6��
		  if(i < 5)System.out.print(", ");//5��
	  } 
   }//printNum
   
   //�ζǹ�ȣ���� ���
   public void generateNum() {
	   for (int i = 0; i < lotto.length; i++) {//�ݺ� 6�� :�ε��� 0~5
		   lotto[i]=r.nextInt(45)+1; //1~45
		   //boolean flag = duplicateNum(3);
		   //if(flag)i--;
		   if(duplicateNum(i))i--;
		   
	   }//for
	   // ����
	   Arrays.sort(lotto);
   }//generateNum
   
   //�ߺ����� üũ ���
   public boolean duplicateNum(int idx) {//�ߺ����� �߽߰� true����
	   /*   �����ε���(idx)  ���ε���(for)
	          1            0
	          2            1 0
	          3            2 1 0
	          4            3 2 1 0
	          5            4 3 2 1 0
	    */
	   for(int i=idx-1; i>-1; i--) {
		  if(lotto[idx] ==  lotto[i]) return true;
		    //�ߺ��� �����͸� �߰��ߴٸ�
	   }//for
	  return false;
   }//duplicateNum
	
	
   public static void main(String[] args) {
	   LottoTeacher lotto = new LottoTeacher();
	   for (int i = 1; i < 6; i++) {
		   System.out.print(i+"ȸ: ");
		   lotto.generateNum();
		   lotto.printNum();
		   System.out.println();
	}
	  
   }
}




