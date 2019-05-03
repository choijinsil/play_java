package com.encore.j0422;

import java.util.Vector;

public class NameMenu2 {
	Vector<String> names;
	// String[] names;// null

	public NameMenu2() {
		names = new Vector<String>();
	}

	public void add(String name) {// 배열에 이름 저장 Create
		// 빈방(==null)에 이름 저장하기
		names.add(name);
	}

	public void search() {// 현재 배열내의 이름들 조회 Read
		System.out.println("#이름목록");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

	public void update(String oldName, String newName) {// 배열에 저장된 이름을 변경 Update
		// oldName과 일치하는 이름을 배열에서 찾기
		for (int i = 0; i < names.size(); i++) {
			if (oldName.equals(names.get(i))) {
				names.set(i, newName);
				break;
			}
		}
	}// update

	public void delete(String delName) {// 배열에 저장된 이름을 삭제 Delete

		for (int i = 0; i < names.size(); i++) {
			if (delName.equals(names.get(i))) {
				System.out.println(names.get(i) + "님 삭제 되었습니다.");
				names.remove(i);
				break;
			} else {
				System.out.println("# 일치하는 이름이 없습니다.!");
			}
		}

	}// delete

}// class NameMenu
