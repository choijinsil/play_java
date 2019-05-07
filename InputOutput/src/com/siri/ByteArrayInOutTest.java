package com.siri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteArrayInOutTest {

	public static void main(String[] args) throws Exception {
		// 자바 입출력의 기본
		// 이미지, 실행파일, 동영상 파일에 대한 입출력에 용이.
		FileInputStream fis = new FileInputStream("c.txt"); // 내용: abcd
		FileOutputStream fos = new FileOutputStream("d.txt");

		byte[] b = new byte[2];
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
		System.out.println("======="); // <-- c.txt파일을 읽어서 b배열에 복사, 리턴: 읽은 바이트 수
		System.out.println(fis.read(b)); // -1, 일긍ㄴ 바이트가 없다면

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=" + b[i]);
		}
		System.out.println(fis.read(b));

		// offset<-- 몇번째부터 숫자를 셀건지
		// fis,write(offset부터 시작해서 length만큼)
		byte[] b2 = { 97, 98, 99, 100, 101 };
		// fos.write(b2);
		// fos.write(b2,0,3);//0인덱스 부터 3개!!
		fos.write(b2, 1, 2);// 1인덱스 부터 2개!!
	}

}
