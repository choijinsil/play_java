package com.encore.Ex0415;

public class HongKong implements Menu{	// 주방
	// implements 구현의 약속
	// 인터페이스에 선언된 만큼 명시가 되어야 에러가 안나요..
	// 주문한건 다 만드는 주방입니다.
	
	public void Jambbong() {
		System.out.println("매콤한 짬뽕쓰");
	}

	@Override
	// @ 어노테이션은 JDK5버전부터 지원된다.
	// 잇는것과 없는 것의 차이점은 부모와 자식을 비교해서
	// 이름 리턴값을 체크해 준다.
	// 오버라이드를 안하게 되면 이름값이 달라도 체크를
	// 안하게 된다
	public void Jajang() {
		System.out.println("짜장하다해?");
		
	}

	@Override
	public void rice() {
		System.out.println("나는 밥이다요");
		// TODO Auto-generated method stub
		
	}
	
	
	

}
