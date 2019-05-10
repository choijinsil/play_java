package com.encore.person.model;

import java.util.Vector;

public class DataStore {
	// 데이터 저장소 ( 메모리, 파일시스템, DB)
	// 데이터 저장소 유일한 번호 발생
	Vector<Person> personV = new Vector<Person>();
	private int no;

	public int getNo() {
		return ++no;
	}	
	
}
