package com.siri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	// FIleCopy꼭 하기

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com/index.html");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("호스트: " + url.getHost());
			System.out.println("서비스파일명: " + url.getFile());

			InputStream is = url.openStream();
			// 웹소스 읽기 ----------> 화면 콘솔 출력

			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String str;
//				  while(  (str=br.readLine()) != null  ) {
//					 System.out.println(str);  
//				  }

			// 미션) 읽어들인 웹소스를 파일(test.html)로 저장하고
			// 탐색기에서 'test.html'을 더블클릭해서 해당 사이트를 접속하시오.

			// 파일생성 ==> FileOutputStream, FileWriter
			// 폴더(디렉토리)생성==> File

			// FileWriter fw = new FileWriter("test.html"); ---> 문자집합 설정X
			// new OutputStreamWriter(OuputStream out, String charsetName)
			FileOutputStream fos = new FileOutputStream("test.html");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

			while ((str = br.readLine()) != null) {
				// fw.write(str);
				osw.write(str);
			}

			// fw.close();
			osw.close();
			System.out.println("파일(test.html)생성 성공!!");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main
}
