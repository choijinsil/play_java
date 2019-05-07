package com.siri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopySpeedTest {
	// 바이트 단위 입출력
	FileInputStream fis;
	FileOutputStream fos;

	// 문자단위 입출력
	FileReader fr;
	FileWriter fw;

	// 라인단위 입출력 <-- 문자들을 버퍼에 담았다가 한번에 읽고 쓰기
	BufferedReader br;
	BufferedWriter bw;

	// 4) 바이트 단위 입출력(byte배열 사용)
	FileInputStream fis2;
	FileOutputStream fos2;

	public FileCopySpeedTest() throws Exception {
		fis = new FileInputStream("a.txt");// FROM
		fos = new FileOutputStream("b.txt");// TO
		// fis.read()//한 바이트 읽기
		int i;

		long start = System.currentTimeMillis();
		while ((i = fis.read()) != -1) {// 읽을 바이트가 있다면
			fos.write(i);
			// b.txt파일에 써라 무엇을
		}
		long end = System.currentTimeMillis();

		System.out.println("[byte단위]파일복사 성공!!^^*: " + (end - start));

		fos.close();// 입출력객체 자원 반환 (다른 사람 또는 응용프로그램에서 사용할 수 있기 때문에)
		fis.close();// 입출력객체 자원 반환
		// =====================<문자단위 입출력>=============================
		fr = new FileReader("a.txt");
		fw = new FileWriter("b.txt");

		start = System.currentTimeMillis();
		while ((i = fr.read()) != -1) {
			fw.write(i);
			// 어디에 써라 i(에 해당하는 문자)를 읽어서
		}
		end = System.currentTimeMillis();

		System.out.println("[문자단위]파일복사 성공!!^^*: " + (end - start));
		fw.close();
		fr.close();
		// =====================<버퍼단위 입출력>=============================
		br = new BufferedReader(new FileReader("a.txt"));
		bw = new BufferedWriter(new FileWriter("b.txt"));

		String str;

		start = System.currentTimeMillis();
		while ((str = br.readLine()) != null) {// 읽을 라인이 있다면
			bw.write(str);
			// 2. b.txt파일에 출력 1.str을 읽어서
		}
		end = System.currentTimeMillis();
		System.out.println("[버퍼사용]파일복사 성공!!^^*: " + (end - start));

		bw.close();
		br.close();

		// =====================<바이트단위 입출력>=============================
		fis2 = new FileInputStream("a.txt");
		fos2 = new FileOutputStream("b.txt");

		byte[] b = new byte[1024];
		start = System.currentTimeMillis();
		while ((i = fis2.read(b)) != -1) {
			// a.txt를 읽어서 b배열에 복사
			fos2.write(b, 0, i);
			// b배열을 읽어서 b.txt에 쓰기
			
		}
		end = System.currentTimeMillis();
		System.out.println("[바이트단위, 배열사용]파일복사 성공!!^^*: " + (end - start));
		fos2.close();
		fis2.close();

	}

	public static void main(String[] args) throws Exception { // ***
		// 파일 복사와 복사에 걸리는 시간을 체크
		// a.txt 파일을 읽어서 b.txt: FileCopy
		new FileCopySpeedTest();
	}
}
