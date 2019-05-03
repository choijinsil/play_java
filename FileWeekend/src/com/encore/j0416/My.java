package com.encore.j0416;

public class My {
	int su; // 맴버 변수, 필드 --> 클래스내의 서로 다른 메소드들이 공유할 데이터

	public My() {

	}

	public int juwon() {
		// 발생되는 데이터 : 300
		su = 300;
		// 발생된 데이터 주기
		return su;
	}

}

class You {
	public void lime(int su) {
		// 주원메소드의 300을 출력
		// System.out.println(su); // 클래스가 다르니 맴버 변수 사용이 안될 수밖에
		// 외부에서 데이터 받기

		System.out.println(su);
	}
}