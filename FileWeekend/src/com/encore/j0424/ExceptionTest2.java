package com.encore.j0424;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// 한꺼번에 임포트 컨트롤+쉬프트+o

		/*
		 * String[] args={"10","5"}; String[] args={"ab","cd"}; String[] args={"10"};
		 * String[] args={"10","0"};
		 * 
		 * su1 su2 ---------- 10 5 ab cd ==> NumberFormatException 10 X ==>
		 * ArrayIndexOutOfBoundsException 10 0 ==> ArithmeticException
		 */
		try {
			// 예외발생에 대해서 try~catch문 또는 throws를 사용하지 않고 처리하는 방법
			// RuntimeException의 자식Exception의 경우만 가능하다.
			// ab는 메소드간의 호출관계

			System.out.println("매개변수로 받은 두개의 수!!");
			int su1 = Integer.parseInt(args[0]);// new Number~, Array
			int su2 = Integer.parseInt(args[1]);// Number, Array
			System.out.println("su1=" + su1 + ", su2=" + su2);
			System.out.println("su1을 su2로 나눈 몫= " + (su1 / su2));// new Arithmetic
			System.out.println("나눗셈을 잘 실행하였습니다~!!");
		} catch (NumberFormatException e) {
			// e: 에러메시지 객체
//			e.printStackTrace();// 문제가 발생한 코드와 연관된 메소드들의 호출 관계를 표현
//			System.out.println("=======================");
//			System.out.println(e.toString()); // 예외 종류와 원인을 출력
//			System.out.println("======================");
//			System.out.println(e.getMessage());
			System.out.println("## 숫자만입력해주세요.");
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("## 두개의 숫자를 반드시 입력하시오");
		} catch (ArithmeticException e) {

			System.out.println("## 0으로 나눌수 없습니다.");

		} finally {
			System.out.println();
			System.out.println("예외 발생되도 안되어도 나는 실행되지롱~~~");
			// 보통 FileSystem객체 또는 DataBase관련된 객체에 대한 반환
			// fr.close가 많이 쓰인다.
		}
		System.out.println("마지막문장");
		// 이 세가지를 통틀어Exception으로 처리할 수 있다
	}// main
}
