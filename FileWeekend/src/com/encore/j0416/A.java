package com.encore.j0416;

public class A {
	// 메소드 정의
	public void hello() {
		System.out.println("A클래스 안녕?");
	}
	// 메소드 파라미터 테스트 m1~m6
	// 메소드 실행에 필요한 데이터를 외부에서 전달받기 위해 매개변수에 선언한다.

	public void m1(int su) {
		System.out.println("m1(): " + su);
	}

	public void m2(String name) {
		// main메소드에 a.m2("나길동") 실행되면
		// m2에서는 String name="나길동" 이
		// 가장먼저 실행됨
		System.out.println("m2(): " + name);
	}

	public void m3(int age, String name2) {
		System.out.println("이름: " + name2 + ", 나이: " + age);
	}

	public void m4(int i, int j, int k) { // 이안에 데이터 받았다!
		System.out.println(i + "," + j + "," + k);

	}

	public void m5(int[] suArr) {
		for (int i = 0; i < suArr.length; i++) {
			System.out.print(suArr[i] + ",");
		}
	}

	public void m6(String name, int age, String job) {
		System.out.println(name + "," + age + "," + job);
	}

	public void m6_2(Person p) {
		System.out.println("자바빈을 사용: " + p.getName() + "," + p.getAge() + "," + p.getJob());
		// 메소드 끝괄호 전에는 반드시 return문이 위치해야 한다.
		// 단 결과데이터가 없을때(return데이터가 없을때)는 생략이 가능함.
	}

	// 리턴데이터 테스트 m11~
	// 외부에 전달하기 위해 자료형 선언
	// 메소드에서 가장 마지막에 실행

	public int m11() {
		System.out.println("m11()");
		int su = 120;
		return su;
	}

	public String m12() {
		System.out.println("m12()");
		String name = "김유신";
		return name;
	}

	public int[] m13() {
		int ii = 50;
		int jj = 60;
		int kk = 70;

		int[] su = { ii, jj, kk };

		return su;

		// return과 ; 사이에는 데이터가 한개 위치해야 한다.
		// return ii,jj,kk <-- 절대에러
	}

	public Person m14() {
		System.out.println("m14콜");
		String name = "김유신";
		int age = 14;
		String job = "화랑";

		// 위의 변수 세개를 p에 담아준다.
		Person p = new Person(name, age, job);
		return p;
	}

	public My m15() {
		My m = new My();

		return m;
	}

	public Person[] m16() {
		System.out.println();
		System.out.println("m16호출 성공");
		Person p1 = new Person("김유신", 15, "화랑");
		Person p2 = new Person("이순신", 25, "장군");
		Person p3 = new Person("홍길동", 22, "번쩍");

		// p1~p3까지 받을 배열
		Person[] p = { p1, p2, p3 };
		return p;
	}

}
