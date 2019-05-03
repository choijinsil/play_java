package com.encore.j0416;

// 메소드를 잡아먹자
public class MethodCallTest {
	public static void main(String[] args) {
		A a = new A();
		a.hello();

		// 중요! 정의는 메소드 호출은 메인
		// 메인 메소드 실행중 발생 데이터 : 100
		int su = 100;
		String name = "나길동";
		// m1() 메소드에게 su를 전달하고 싶다.
		a.m1(su);// 메소등 호출() 소괄호 안에 데이터 표시

		a.m2(name);

		String name2 = "길라임";
		int age = 15;
		a.m3(age, name2);

		int i = 10;
		int j = 20;
		int k = 30;
		// m4메소드에게 정수값 10, 20, 30 전달!
		a.m4(i, j, k);

		int[] suArr = { 11, 22, 33 };
		a.m5(suArr);

		String name3 = "김주원";
		int age2 = 10;
		String job = "학생";
		a.m6(name3, age, job);

		Person p = new Person();
		p.setName(name3);
		p.setAge(age2);
		p.setJob(job);
		// <-- 3개의 데이터가 p라는 한개의 변수명으로 묶여진다.

		Person p2 = new Person(name3, age2, job);
		// 위의 것과 아래 것과 같은 코드이다.

		a.m6_2(p); // 세개의 데이터가 동시에 전달이 된다.

		Person p1 = new Person("너길동", 15, "학생");
		Person p3 = new Person("차라임", 17, "학생");

		// 배열식) 자료형 []배열명 = {value_list};
		Person[] persons = { p1, p2, new Person("고주원", 19, "학생") }; // 총 9개의 값을 3개씩 묶어 준것 배열 안에 배열을 쓸수도있다.

		int num = a.m11();
		System.out.println("결과: " + num);

		int[] suArray = a.m13();
		System.out.println("결과...");

		// 배열 == 객체! , 참조변수 <-- 참조변수는 데이터도 담고 맴버필드 메소드를 사용할수 있다. .을 사용하여
		for (int l = 0; l < suArray.length; l++) {
			System.out.println("suArray[0]= " + suArray[l]);
		}

		Person pp = a.m14();
		System.out.println("이름: " + pp.getName());
		System.out.println("나이: " + pp.getAge());
		System.out.println("직업: " + pp.getJob());

		My m = a.m15(); // My m을 새롭게 선언한 것
		int ju = m.juwon();
		System.out.println("ju=" + ju);

		Person[] per = a.m16();
		for (int z = 0; z < per.length; z++) {
			// p1 == per[0]
			// p2 == per[1]
			System.out.println("이름: " + per[z].getName());
			System.out.println("나이: " + per[z].getAge());
			System.out.println("직업: " + per[z].getJob());
		}

	}

}
