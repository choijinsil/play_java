package com.encore.j0423;

public class Person {
	// 자바빈즈(서로 관련있는 속성들을 표현하는 클래스)
	// - 속성: 번호, 이름, 나이, 직업
	// public한 게터 세터 메소드
	// 생성자는 선택사항
	private int no;//1
	private String name;
	private int age;
	private String job;
	
	// public을 지워주면 같은 클래스 내에서만 사용가능하다. 
	public Person() {	// 기본생성자
		
		
	}

	public Person(int no, String name, int age, String job) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
	}


	// 기본생성자가 없으므로 이걸 쓰세요.
	public int getNo() {
		return no;
	}


	// 바꾸고 싶지 않으면 지우면 된다.
	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	// 나이보여주기 싫다면 지우면 됨
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		// getNo와 toString은 가족이다. 가족끼리는 이름쓰면 된다. 
		//1: [홍길동,13,학생]
		return no+": ["  + name +", " + age + ",  " + job + "]";
	}

	
}
