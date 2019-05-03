package p1;

public class Other {

	// 자식에서 부모클래스의 메소드 호출
	void callTest() {
		// 레퍼런스를 따로 만들어 호출해야 한다.
		
		Parent p = new Parent();

		p.m1();
		p.m2();
		p.m3();
		// p.m4();<-- private는 자식도 상관관계가 아닌 클래스는 호출 불가
	}
}
