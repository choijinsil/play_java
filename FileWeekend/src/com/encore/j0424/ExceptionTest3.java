package com.encore.j0424;

// class MyException{} <--사용자 정의 클래스, Object다.
class MyException extends Exception { // 사용자 정의 예외클래스
	public MyException(String msg) {
		// 부모클래스에 스트링을 받을수 있는 생성자까지 호출
		// 명시적 호출
		// 부모 생성자가 갖는 기능을 실행

		super(msg);
	}
}

public class ExceptionTest3 {

	static int su = 100;

	public static void main(String[] args) {
		boolean conditions = true;
		System.out.println(su);

		try {
			if (conditions) {
				// 생성자 호출하는것 맞다.
				// throw new MyException("사용자 정의 예외 메세지!!!");
				MyException m = new MyException("사용자 정의 예외 메세지!!!");
				throw m; // <-- 리턴 m~~! 2번째 방법
			}
		} catch (MyException e) {
			e.printStackTrace();

		}

	}
}
