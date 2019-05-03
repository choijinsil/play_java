package com.encore.j0415;

public class InterfaceTest {

	public static void main(String[] args) {
		// 손님
		MenuPan menu = new HongKong(); // 인터페이스는 new를 사용못한다.
		menu.Jambbong();
		menu.Jajang();
		// menu.menu();
		// static 맴버는 클래스명으로 접근!
		System.out.println("코인값: " + MenuPan.COIN);
	}
}
