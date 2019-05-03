package com.siri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest {
	// 미션 자바 메모장 만들기
	// textarea 있는걸 save하면 저장되게끔
	// from to만 하면 된다.
	
	public static void main(String[] args) throws IOException {
		// a.txt파일을 읽어서 그 내용을 화면에 출력
		FileReader fr = new FileReader("a.txt");

		// From<-- 입력 , To<-- 출력
		// FileWriter, OutputStream사용 가능. 이미지 출력시 OutputStream을 출력해야 한다.
		FileWriter fw = new FileWriter("b.txt");

		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i); // 화면출력
			fw.write(i);
		}
		
		// 사용이 끝나고 나면 자원 반환을 해야 한다.
		fw.close();
		fr.close();
	}
}
