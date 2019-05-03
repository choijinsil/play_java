package com.siri.model;

import java.util.Vector;

public class Model {

	// public
	public Vector<Person> personv;
	private int no;

	public Model() {
		personv = new Vector<Person>();
	}

	public void insert(Person p) {
		no++;
		p.setNo(no);
		personv.add(p);

	}

	public void update(Person newp) {

		for (int i = 0; i < personv.size(); i++) {

			if (personv.get(i).getNo() == newp.getNo()) {
				personv.get(i).setAge(newp.getAge());
				personv.get(i).setJob(newp.getJob());
				break;
			}
		}
	}

	public void delete(int no) {
		for (int i = 0; i < personv.size(); i++) {
			if(personv.get(i).getNo()==no) {
				
			}
		}
	}

	public Person select(int no) {
		return null;

	}

	public Vector<Person> selectAll() {
		return personv;
	}

}
