package com.siri;

import java.util.Scanner;

public class ArrayEqual2 {
	public static void main(String[] args) {

		// 배열길이가 같은지 다른지 true false
		// 길이가 같고 배열값이 같으면 true

		
		ArrayEqual2 ae = new ArrayEqual2();
		int[]c= ae.arrayGenerate("c");
		int[]d= ae.arrayGenerate("d");
				
		if (ae.equals(c,d)) { // 두개의 배열을 넣어주고
			System.out.println("c d는 같아요.");
		} else {
			System.out.println("c d는 달라요");
		}

	}

	public int[] arrayGenerate(String arrName) { // 배열객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 " + arrName + "의 요소 갯수: ");
		int size1 = scan.nextInt();

		int[] a = new int[size1];
		for (int i = 0; i < a.length; i++) {
			System.out.print(arrName + "[" + i + "]: ");
			a[i] = scan.nextInt();
		}
		return a;
	}

	private boolean equals(int[] a, int[] b) {

		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;

	}

}
