package p1;

public class Child extends Parent {

	// 자식에서 부모클래스의 메소드 호출
	void callTest() {
		m1();
		m2();
		m3();
		// m4();<--private으로 감춰져 있어 볼 수 없다.
	}
}
