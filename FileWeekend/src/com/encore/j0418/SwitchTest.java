package com.encore.j0418;

public class SwitchTest {

	public static void main(String[] args) {

		final int SEARCH = 1;
		final int INCREMENT = 2;
		final int DECREMENT = 3;
		final int EXIT = 4;

		int su = 1;

		switch (su) {
		case SEARCH:
			System.out.println("검색");
			break;
		case INCREMENT:
			System.out.println("증가");
			break;
		case DECREMENT:
			System.out.println("감소");
			break;
		case EXIT:
			System.out.println("종료");
			break;

		default:
			break;
		}
		// 삼항연산자 조건식? A : b
		// 조건식의 결과가 true였을때 A리턴, 결과가 false였을때 B리턴
		// 예) boolean b = 조건식1 ? true: false;
	}

}
