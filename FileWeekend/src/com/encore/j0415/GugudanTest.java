package com.encore.j0415;

import java.io.IOException;

public class GugudanTest {

	public static void main(String[] args) throws IOException {
		// 반복적인 실행 while 또는 do ~ while문
		// 반복문 내에서 Gugudan클래스내의 메소드들을 적당히 호출
		boolean isOk = true;
		Gugudan gugu = new Gugudan();

		do{
			gugu.outputDan(gugu.inputDan());
			
			if (gugu.continueDan() == 'n') {
				System.out.println("종료되었습니다.");
				isOk = false;
			}
			
		}while(isOk);
		
//		while (isOk) {
//
//			gugu.outputDan(gugu.inputDan());
//
//			if (gugu.continueDan() == 'n') {
//				System.out.println("종료되었습니다.");
//				isOk = false;
//			}
//		}
	}
}
