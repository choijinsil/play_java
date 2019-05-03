package com.encore.j0417;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		int[] su = { 345, 678, 19, 234, 200 };

		Arrays.sort(su);

		for (int i = 0; i < su.length; i++) {
			System.out.println("su[" + i + "]=" + su[i]);
		}

		System.out.println("======");
		char[] ch = { 'j', 'a', 'v', 'a', 'l', 'i', 'k', 'e' };
		Arrays.sort(ch);

		for (int i = 0; i < ch.length; i++) {
			System.out.println("ch[" + i + "]=" + ch[i]);
		}

		System.out.println("======");
		String[] names = { "È«±æµ¿", "±æ¶óÀÓ", "±èÁÖ¿ø", "ÀÌ¼ø½Å", "±èÀ¯½Å" };
		Arrays.sort(names);

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]=" + names[i]);
		}
	}// main
}
