package com.encore.Ex0416;

public class zz {
	public static void main(String[] args) {
		int[][] su2 = { { 1, 2, 3 }, { 4, 5, 6, 7, 8 } ,{9,10}};
		
		for (int i = 0; i < su2.length; i++) {
			for (int j = 0; j < su2[i].length; j++) {
				System.out.print(su2[i][j]);
			}
			System.out.println();	
		}
	}
}
