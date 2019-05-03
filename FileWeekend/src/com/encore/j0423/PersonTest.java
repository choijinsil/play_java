package com.encore.j0423;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setNo(1);
		p.setName("학생");
		p.setAge(111);
		p.setJob("학생");
		Person p2=new Person(2,"길라임",17,"학생");
		
		System.out.println(p2.getNo()+": [ "+p2.getName()+","+p2.getAge()+","+p2.getJob()+"]");
		
		//클래스 내의 toString()메소드란?
		// 현재 어떤 값을 가지고 있는지 출력해주는 용도
		
		System.out.println(p2.toString());
		System.out.println(p.toString());
	}
}
