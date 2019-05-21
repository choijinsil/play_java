package com.siri.que;

class Aa {
	void hello(String name) {
		if (name == null)
			throw new NullPointerException();
		// 강제 예외 발생
		System.out.println("안녕, " + name);
	}
}

class Mym {
	Aa a;

	public Mym() {
		a = new Aa();
	}

	void callTest(String name) {
		try {
			a.hello(name);
		} catch (NullPointerException e) {
			System.out.println("내가 바로 트라이캐치");
		}
	}
}

public class Hehe {
	public static void main(String[] args) {
		Mym m = new Mym();
		String str = null;
//		if (str == null) {
//			System.out.println("이름을 반드시 입력!");
//			return;
//		}
		m.callTest(str);
	}

}
