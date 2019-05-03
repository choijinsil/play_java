package com.encore.j0423.reviewww;

public class Splite {

	public static void main(String[] args) {
		String tel = "010-1234-5678- -";
		String tels[] = tel.split("-");

		for (int i = 0; i < tels.length; i++) {
			// split()메소드는 빈문자열"" 데이터도 저장해서 사용.
			System.out.println(tels[i]);
		}
	}
}
