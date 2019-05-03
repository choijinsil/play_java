package com.encore.j0423.reviewww;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("a.txt");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 경로를 찾을수 없어요!!");
		} catch (IOException e) {
			System.out.println("입출력 IO에러 발생!!");
		}
	}
}
