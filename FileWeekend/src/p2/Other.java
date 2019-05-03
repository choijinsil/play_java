package p2;

import p1.Parent;

public class Other {

	// 자식에서 부모클래스의 메소드 호출
	void callTest() {
		// 레퍼런스를 따로 만들어 호출해야 한다.
		
		Parent p = new Parent();

		p.m1();
		//p.m2(); <--에러: protected는 같은 패키지에서 접근 가능
		//p.m3();<-- 에러: 디폴트(생략)은 같은 패키지에서만 접근 가능
		// p.m4();<-- private는 자식도 상관관계가 아닌 클래스는 호출 불가
	}
}
