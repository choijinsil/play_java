package com.encore.j0415;

import java.io.IOException;

public class GugudanTest {

	public static void main(String[] args) throws IOException {
		// �ݺ����� ���� while �Ǵ� do ~ while��
		// �ݺ��� ������ GugudanŬ�������� �޼ҵ���� ������ ȣ��
		boolean isOk = true;
		Gugudan gugu = new Gugudan();

		do{
			gugu.outputDan(gugu.inputDan());
			
			if (gugu.continueDan() == 'n') {
				System.out.println("����Ǿ����ϴ�.");
				isOk = false;
			}
			
		}while(isOk);
		
//		while (isOk) {
//
//			gugu.outputDan(gugu.inputDan());
//
//			if (gugu.continueDan() == 'n') {
//				System.out.println("����Ǿ����ϴ�.");
//				isOk = false;
//			}
//		}
	}
}
