package com.siri;

import java.util.Scanner;

public class ArrayEqual {
	public static void main(String[] args) {

		// 배열길이가 같은지 다른지 true false
		// 길이가 같고 배열값이 같으면 true
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 a의 요소 갯수: ");
		int size1 = scan.nextInt();

		int[] a = new int[size1];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
		}

		System.out.print("배열 b의 요소 갯수: ");
		int size2 = scan.nextInt();
		int[] b = new int[size2];
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
		}

		ArrayEqual ae = new ArrayEqual();
		if (ae.equals(a, b)) { // 두개의 배열을 넣어주고
			System.out.println("a b는 같아요.");
		} else {
			System.out.println("a b는 달라요");
		}

//		if (a.length == b.length) {
//			System.out.println(a.length == b.length);
//		} else {
//			System.out.println(a.length == b.length);
//		}
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
