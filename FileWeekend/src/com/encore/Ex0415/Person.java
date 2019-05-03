package com.encore.Ex0415;

public class Person {
	private String name;
	private int age;
	private String job;
	private String addr;
	private String pNum;
	
	public Person() {
		// TODO Auto-generated constructor stub
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public Person(String name, int age, String job, String addr, String pNum) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.addr = addr;
		this.pNum = pNum;
	}
	

}
