package com.encore.j0423;

public class Person {
	// �ڹٺ���(���� �����ִ� �Ӽ����� ǥ���ϴ� Ŭ����)
	// - �Ӽ�: ��ȣ, �̸�, ����, ����
	// public�� ���� ���� �޼ҵ�
	// �����ڴ� ���û���
	private int no;//1
	private String name;
	private int age;
	private String job;
	
	// public�� �����ָ� ���� Ŭ���� �������� ��밡���ϴ�. 
	public Person() {	// �⺻������
		
		
	}

	public Person(int no, String name, int age, String job) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.job = job;
	}


	// �⺻�����ڰ� �����Ƿ� �̰� ������.
	public int getNo() {
		return no;
	}


	// �ٲٰ� ���� ������ ����� �ȴ�.
	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	// ���̺����ֱ� �ȴٸ� ����� ��
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
		// getNo�� toString�� �����̴�. ���������� �̸����� �ȴ�. 
		//1: [ȫ�浿,13,�л�]
		return no+": ["  + name +", " + age + ",  " + job + "]";
	}

	
}
