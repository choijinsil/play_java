package com.siris;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupMedicion {

	/*
	 * Document Ŭ���� : �����ؼ� ���� HTML ��ü ���� Element Ŭ���� : Documnet�� HTML ��� Elements
	 * Ŭ���� : Element�� ���� �ڷ���
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		// Jsoup�� �̿��� �� �˻��� ���̸� ��������.

		String url = "https://terms.naver.com/medicineSearch.nhn?mode=nameSearch&query=" + input;
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// �ֿ� ������ ������ �±׸� ã�Ƽ� ���������� �Ѵ�.
		// Ŭ���� �̸�
		// Elements element = doc.select("list_wrap");
		Elements element = doc.select("div.list_wrap");

		// 1. ��� �κ��� ������ �����´�.
		// �ֿ䴺�� �±�.text().
		// �ֿ䴺�� �ױ��ڸ� ������!
		// String title = element.select("h2").text().substring(0, 4);

		System.out.println("============================================================");
		System.out.println(input+"���� �� ����"); // ������ ������ ������ ��������.
		System.out.println("============================================================");

		// liŬ����
		for (Element el : element.select("strong")) { // ���� a�±��� ������� ���
			System.out.println(el.text());
		}
		System.out.println("============================================================");
	}

}
