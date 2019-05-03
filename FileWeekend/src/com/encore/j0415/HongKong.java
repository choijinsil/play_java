package com.encore.j0415;

public class HongKong implements MenuPan { // 주방
	// implements - 구현의 약속
	// 인터페이스에 선언된 만큼 명시가 되어야 에러가 안난다.
	// 주문한건 다 만들어야지! 나는 주방이다.

	public void Jambbong() {
		System.out.println("매콤한 짬뽕쓰");
	}

	@Override // <--@ 어노테이션 JDK5버젼부터 지원
				// 있는 것과 없는 것의 차이점은 부모와 자식을 비교해서 이름값과 리턴값을 체크
				// @Override를 안하게 되면 이름값이 달라도 체크를 안하게 된다.
	public void Jajang() {
		System.out.println("달달한 짜장면");
	}
	
	@Override
	public void rice() {
	}

	// 추가되는 것은 상관 없다. 서비스
	public void chobab() {
		System.out.println("추가된 초밥");
	}

}
