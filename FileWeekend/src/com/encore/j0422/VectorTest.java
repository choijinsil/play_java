package com.encore.j0422;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector v = new Vector(5, 3); // 앞의 5라는 숫자가 방사이즈
		// 데이터 <-- element(요소)
		System.out.println("vector의 용량: " + v.capacity());
		System.out.println("vector의 요소 갯수: " + v.size()); // 들어간 데이터는 아직없다.

		// 벡터는 객체의 참조(a, new A())를 담는 배열
		Integer su = new Integer(1); // 숫자1은 메모리에 있고 메모리를 가르키는 레퍼런스 수를 써야 한다.
		int su2 = 2;
		v.addElement(su);
		v.addElement(su2);

		System.out.println("벡터자료형은: " + v.get(1).getClass());

		for (int i = 3; i < 10; i++) {
			v.addElement(i);
		}
		v.addElement(true);
		v.addElement(3.14);
		v.addElement("자바");
		// 여러 데이터의 타입을 받을 수 있는 이유는 object의 자식들이라서,,
		// vector는 object를 담는 클래스 이기 때문에 여러 데이터를 담을 수 있다.

		// 벡터안의 데이터 포함여부
		if (v.contains(3.14)) {
			System.out.println("3.14포함 되었다.");
		}

		// 벡터안의 모든 요소 출력
		Enumeration enu = v.elements();
		// Enumeration 열거형 인터페이스 enu=[1,2,3,4,...."자바"]
		System.out.println("================");
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement()); // enu안에 요소(데이터)가 있으면 true리턴
		}
		System.out.println("================");
		System.out.println("맨앞의 데이터: " + v.firstElement());
		System.out.println("맨뒤의 데이터: " + v.lastElement());
	}

}
