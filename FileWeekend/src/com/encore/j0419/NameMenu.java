package com.encore.j0419;

public class NameMenu {
	String[] names; // 현재 null상태
	int cnt = 0;

	public NameMenu() {
		names = new String[5];
	}

	public void add(String name) { // create
		if (cnt == 5) {
			System.out.println("더 이상 입력할 수 없습니다");
			return; // 메인으로 되돌아 간다.
		}

		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println("#이미 입력된 이름입니다!!.");
				break;
			}
			// search에 없는 이름
			if (names[i] == null) {
				names[i] = name;
				cnt++;
				break;
			}
		}
	}

	public void search() { // read
		System.out.println("# 이름 목록");

		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i]);
			}
		}
	}

	public void update(String oldName, String newName) {// update
		for (int i = 0; i < names.length; i++) {
			if (oldName.equals(names[i])) { // 일치하는 이름을 찾았다면
				// if (oldName.equals(oldName) {
				// oldName에 null값은 절대 전달되지 않음.
				names[i] = newName; // 수정
				break;
			} else {
				System.out.println("#존재하지 않는 이름입니다!!");
				break;
			}
		}
	}

	public void delete(String delName) {// delete

		boolean isOk = true;
		for (int i = 0; i < names.length; i++) {

			if (names[i] != null) {
				if (delName.equals(names[i])) {
					names[i] = null;
					cnt--;
					break;
				}
			} else {
				isOk = false;
			}
		}
		if (!isOk) {
			System.out.println("존재하지 않는 이름입니다.");
		}

	}

	public boolean ckNum(String chNumString) { // 숫자가 맞는지 아닌지 체크
		boolean isOk = false;
		char ch;
		for (int i = 0; i < chNumString.length(); i++) {
			ch = chNumString.charAt(i);
			// 숫자의 아스키코드값 (48 ~ 57)
			if (ch >= '0' && ch <= '9') {
				// 숫자로 구성된 문자라면(0-9)
				isOk = true;
				// return true로 줘도 된다. return은 메소드를 종료하는 끝괄호의 역할을 한다.
			}
		}

		return isOk;
	}

}
