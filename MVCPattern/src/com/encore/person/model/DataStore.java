package com.encore.person.model;

import java.util.Vector;

public class DataStore {
	// ������ ����� ( �޸�, ���Ͻý���, DB)
	// ������ ����� ������ ��ȣ �߻�
	Vector<Person> personV = new Vector<Person>();
	private int no;

	public int getNo() {
		return ++no;
	}	
	
}
