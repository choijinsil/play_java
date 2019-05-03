package com.siris;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupParser {

	/*
	 * Document Ŭ���� : �����ؼ� ���� HTML ��ü ���� Element Ŭ���� : Documnet�� HTML ��� Elements
	 * Ŭ���� : Element�� ���� �ڷ���
	 */

	public static void main(String[] args) {
		// Jsoup�� �̿��ؼ� ���̹� ������ ũ�Ѹ�
		String url = "https://sports.news.naver.com/wfootball/index.nhn";
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// �ֿ� ������ ������ �±׸� ã�Ƽ� ���������� �Ѵ�.
		// Ŭ���� �̸�
		Elements element = doc.select("div.home_news");

		// 1. ��� �κ��� ������ �����´�.
		// �ֿ䴺�� �±�.text().
		// �ֿ䴺�� �ױ��ڸ� ������!
		String title = element.select("h2").text().substring(0, 4);

		System.out.println("============================================================");
		System.out.println(title);
		System.out.println("============================================================");

		// liŬ����
		for (Element el : element.select("li")) { // ���� ���� ������ for�� ���鼭 ���
			System.out.println(el.text());
		}
		System.out.println("============================================================");
	}

}
