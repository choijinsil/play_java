package com.encore.j0423;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 <자바I/O의 4대 클래스>
 
 자바IO의 추상클래스
 
 읽기 InputStream(byte단위)    Reader(문자단위) 
 쓰기 OutputStream                 Writer(문자단위)
 */
public class ExceptionTest {
	public static void main(String[] args) {
		// 텍스트파일(a.txt)를 읽어서 그 내용을 콘솔(모니터)에 출력한다.
		// a.txt를 FileWeekend에 추가한다. 패키지에 들어가지 않도록 주의!

		try {
			FileReader fr = new FileReader("a.txt");
			/*
			 * System.out.println(fr.read()); System.out.println(fr.read());
			 * System.out.println(fr.read()); System.out.println(fr.read());
			 */
			int i;
			while ((i = fr.read()) != -1) { // 읽을 문자가 있다면
				System.out.print((char) i);
			}
			System.out.println("# 파일 읽기 성공^^ ");
		} catch (FileNotFoundException e) {
			System.out.println("파일경로를 확인하세요");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력에러가 발생했습니다.");
			// e.printStackTrace();
		}
	}
}
