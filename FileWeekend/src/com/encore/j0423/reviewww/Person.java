package com.encore.j0423.reviewww;

public class Person {
	private int no;
	private String name;
	private int age;
	private String job;

	// Person p = new Person(int no, String name, int age, String job)<--�̷��� ����Ϸ���!
	// Using field�� ����ϴ� ����
	public Person(int no, String name, int age, String job) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		return no + "." + "[ name=" + name + ", age=" + age + ", job=" + job + "]";
	}

}
