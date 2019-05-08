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
	// FIleCopy�� �ϱ�

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.naver.com/index.html");
			System.out.println("��������: " + url.getProtocol());
			System.out.println("ȣ��Ʈ: " + url.getHost());
			System.out.println("�������ϸ�: " + url.getFile());

			InputStream is = url.openStream();
			// ���ҽ� �б� ----------> ȭ�� �ܼ� ���

			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String str;
//				  while(  (str=br.readLine()) != null  ) {
//					 System.out.println(str);  
//				  }

			// �̼�) �о���� ���ҽ��� ����(test.html)�� �����ϰ�
			// Ž���⿡�� 'test.html'�� ����Ŭ���ؼ� �ش� ����Ʈ�� �����Ͻÿ�.

			// ���ϻ��� ==> FileOutputStream, FileWriter
			// ����(���丮)����==> File

			// FileWriter fw = new FileWriter("test.html"); ---> �������� ����X
			// new OutputStreamWriter(OuputStream out, String charsetName)
			FileOutputStream fos = new FileOutputStream("test.html");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");

			while ((str = br.readLine()) != null) {
				// fw.write(str);
				osw.write(str);
			}

			// fw.close();
			osw.close();
			System.out.println("����(test.html)���� ����!!");

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main
}
