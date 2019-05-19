package com.siri;

import java.util.Scanner;

public class SeqSearch {
	// 검색한 데이터가 존재하면 배열인덱스 리턴, 아니면 -1리턴
	int seqSerch(int[] arr, int n, int keyword) {
		// arr - 전체데이터 n: 전체 갯수 keyword: 검색할 데이터
		int i = 0; // 배열인덱스 표현
		if (i == n) {
			return -1;
		}

		while (true) {
			if (arr[i] == keyword) {
				return i;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = sc.nextInt(); // 방의 번호가 배열명을 대신해준다.
		}
		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		SeqSearch search = new SeqSearch();
		int idx = search.seqSerch(arr, num, key);

		if(idx==-1) {
			System.out.println("그 값의 오쇼가 없습니다.");
		}
		else {
			System.out.println(key + "은(는) arr[" + idx + "]에 있습니다.");
		}
	}

}
