package com.encore.j0423.reviewww;

public class Splite {

	public static void main(String[] args) {
		String tel = "010-1234-5678- -";
		String tels[] = tel.split("-");

		for (int i = 0; i < tels.length; i++) {
			// split()�޼ҵ�� ���ڿ�"" �����͵� �����ؼ� ���.
			System.out.println(tels[i]);
		}
	}
}
