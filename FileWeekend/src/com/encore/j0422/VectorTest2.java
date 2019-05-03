package com.encore.j0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

class A {
	void hello() {
		System.out.println("A클래스 안녕?");
	}

}

public class VectorTest2 {

	public static void main(String[] args) {


		Vector v = new Vector();
		v.add("안녕"); // 인덱스 0 부여
		v.add(new A()); // 벡터 자체가 주소를 담는 클래스라 참조변수도 담을 수 있다.

		Object ob = v.get(1); // 두번째 데이터 얻기
		// 자식클래스를 캐스팅 해야 한다.
		A a = (A) ob;
		a.hello();

		Vector<String> v2 = new Vector<String>(); // jdk7버젼부터 생성자<> 빈 괄호 지원
		v2.add("홍길동");

		Vector<A> v3 = new Vector<A>();
		v3.add(new A()); // 인덱스 0
		A obj = new A();
		v3.add(obj);

		// 벡터 v3에 두번째로 저장된 A클래스의 hell()메소드
		A a2 = v3.get(1); // 제네릭을 사용했을때의 이점: 자식클래스로 캐스팅할 필요가 없다.
		a2.hello();

		// v2.add(new A()); <-- String타입으로 받는다 했기 때문에 에러가 난다.

		// 클래스 옆의 < > 를 제네릭 타입이라 한다. <-- 어던 자료형을 사용할지 명시하는 것이다. <-- 명료성을 높여주자. jdk 5버젼부터
		// <E> : element(요소) 가 어떤 자료형을 사용할지를 명시.
		// <K> : key가 어떤 자료형을 사용할지 명시
		// <V> : value가 어던 자료형을 사용할 지 명시
		// <T> : type에 어떤 자료형을 사용할지 명시

	}

}
