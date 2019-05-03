package com.encore.Ex0415;

public interface Menu { // 메뉴판
	
	/*public static final*/ int COIN=500;
	// final은 유지할 고정값을 명시해야 한다.
	//public안쓴다. 디폴트 인데
	// 이름만 정의 되어 있는 메소드 - Abstract method
	/*public abstract 고정*/void Jajang();
	// 명사는 public만 가능하다. 메뉴는 private하면 안되니까

	/*public 고정*/ abstract void Jambbong();
	// 선언된 메소드: abstract method, abstract는 생략 가능하다.
	
	public abstract void rice();
	
}
