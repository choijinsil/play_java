package com.encore.j0415;

public interface MenuPan { // 메뉴판

	/*public static final*/int COIN =500;
	// final은 유지할 고정값을 명시해야 한다.

	// public안씀 디폴트 인데,

	// 이름만 정의 되어 있는 메소드 - Abstract method
	/* public abstract 고정 */void Jajang(); // 명시는 public만 가능하다. 메뉴판은 private하면 안되지

	/* public 고정 */abstract void Jambbong(); // 선언된 메소드: abstract method, abstract는 생략 가능하다.

	public abstract void rice();

}
