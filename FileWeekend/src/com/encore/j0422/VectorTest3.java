package com.encore.j0422;

import java.util.Vector;

public class VectorTest3 {

	public static void main(String[] args) {
		// 아주~~~~~~~~~~~~중요하다.
		// vector에 데이터 추가, 삭제, 수정, 검색하기!
		Vector<String> v = new Vector<String>();

		// 데이터 추가
		v.add("자바");
		v.add("SQL");
		v.add("HTML");
		v.add("JavaScript");
		v.add("JSP");
		v.add("자바");

		// 데이터 삭제
		// v.clear();
		//		v.remove(int index);
		//		v.remove(Object o);
		//		v.remove(0);	// 1번째 데이터 삭제
		v.remove("자바"); // 맨처음 인덱스의 자바만 삭제 해준다.

		// 데이터 수정
		v.set(4, "자바프로그래밍"); // x번재 배열을 ""로 바꾸세용
		// element: 변경(대체)할 데이터

		// 데이터 조회
		// System.out.println("다섯번째 데이터: "+v.get(4));
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
