package com.siri;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		/*
		 * <경로표현 방법> - 전체경로(드라이브명과 중간 폴더경로 전체, 절대경로), 상대적인 경로, 생략된 경로 - 자바의 경로는 '전체경로'가
		 * 기본!! ----> ImageIcon("경로"); ----> ImageIcon("image/left.gif"); ---> 이클립스의
		 * 프로젝트 중 JavaProject에서만 가능 - 자바의 경로안의 문자는 대소문자를 구분하지 않음.
		 * 
		 */

		// 파일의 속성을 얻어오는 클래스
		// File f = new File(String path);
		// File f = new File("a.txt");
		File f = new File("E:\\Siris\\workspaces\\eclipse-workspace");// 기본
		// '\\' ---> '\'가 확장(기능)문자가 아니라 파일과 디렉토리를 구분하는 역할의 문자로 사용!!

		System.out.println("f파일(디렉토리)존재 유무: " + f.exists());

		File f2 = new File("E:\\Siris\\workspaces\\eclipse-workspace\\FileWeekend\\a.txt");
		f2 = new File("a.txt");
		f2 = new File("."); // . 경로: current directory(현재 프로젝트의 경로)
		f2 = new File(".."); // .. 경로: parent directory( 부모경로)
		f2 = new File("../.."); // .. 경로: parent directory( 부모경로)
		System.out.println("f2.getPath(): " + f2.getPath());
		System.out.println("f2.getAbsolutePath(): " + f2.getAbsolutePath());
		System.out.println("f2.getCanonicalPath(): " + f2.getCanonicalPath());
		System.out.println();

		// b.txt 파일 속성 참조
		// File f3 = new File("src/com/siri/b.txt");
		File f3 = new File("bin/com/siri/b.txt");
		System.out.println("f3파일(디렉토리) 존재유무 " + f3.exists());
		// E:\Siris\workspaces\eclipse-workspace\InputOutput\src
		if (f3.isFile()) {
			System.out.println("f3은 파일!");
		}

		if (f3.isDirectory()) {
			System.out.println("f3은 디렉토리(폴더)!");
		}

		// song폴더에 c.txt파일을 생성해라
		// ** FileWriter, FileOutputStream은 파일을 생성하는 기능을 갖는다.
		// new FileReader("c.txt"); // 읽기 객체의 경우 명시된 파일이 없다면 에러가 발생한다.
		// new FileWriter("c.txt"); // 없는 파일의 경우 파일 생성
		// new FileWriter("song/c.txt"); // 존재하지 않는 폴더에 대해 에러 발생, 폴더까지는 존재해야 한다.
		String path = "song/gildong/juwon";
		String fileName = "c.txt";
		File f4 = new File(path);

		if (f4.exists()) { // f4가 존재합니까?
			System.out.println("디렉토리가 이미 존재합니다.");
		} else { // 폴더가 존재하지 않는다면?
			f4.mkdirs();
			System.out.println("# 디렉토리를 새로 생성함! ");
		}

		FileWriter fw = new FileWriter(path + "/" + fileName);
		fw.close(); // 자원 반환
		// 명시된 파일을 생성 !

		// File과 Database 사용이유? 데이터를 지속적으로 저장, 관리하기 위해서
		// File과 DB공통점? 데이터를 공유!
		File f5 = new File("song/gildong/juwon/c.txt");
		System.out.println("c.txt파일삭제: " + f5.delete()); // 실행이 안됨 왜? fw가 가지고 있기 때문에
		
		// juwon폴더 삭제
		// 파일 생성 후 폴더와 폴더 안에 있는 파일까지 함께 지울수는 없는지?
		File f6 = new File("song/gildong/juwon");
		System.out.println("f6디렉토리 삭제: "+f6.delete());
		// --> 빈 폴더 삭제 가능!
		
	}

}
