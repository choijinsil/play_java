package com.encore.j0418;

public class NameMenu {

	String[] names = new String[5];
	// String[] names = {null,null,null,null,null};

//	public NameMenu() {
//		// init();
//		// String[] names = {"","","","",""};
//	}

//	public void init() {
//		for (int i = 0; i < names.length; i++) {
//			names[i] = null;
//		}
//	}

	public void insert(String name) { // 삽입

		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	public void select() {
		System.out.println("#이름목록");
		for (int i = 0; i < names.length; i++) { // 다 같은 값이 입력되지 않을까?
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	public void update(String oldName, String newName) { // 기존이름 입력받은것
		for (int i = 0; i < names.length; i++) {

			if (names[i].equals(oldName)) {
				names[i] = newName;
				break;
			}
		}
	}

	public void delete(String name) { // 삭제

		for (int i = 0; i < names.length; i++) {

			if (names[i].equals(name)) {
				names[i] = null;
				break;
			}
		}
	}
}

/*- 이름에 대한 추가, 검색, 수정, 삭제 기능메소드를 정의
   - 맴버필드: 배열객체(String names[])   

/*
 * <이름메뉴> 1. 추가 2. 검색 3. 수정 4. 삭제 5. 종료 번호입력 -->
 */