package com.encore.j0423;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setNo(1);
		p.setName("�л�");
		p.setAge(111);
		p.setJob("�л�");
		Person p2=new Person(2,"�����",17,"�л�");
		
		System.out.println(p2.getNo()+": [ "+p2.getName()+","+p2.getAge()+","+p2.getJob()+"]");
		
		//Ŭ���� ���� toString()�޼ҵ��?
		// ���� � ���� ������ �ִ��� ������ִ� �뵵
		
		System.out.println(p2.toString());
		System.out.println(p.toString());
	}
}
