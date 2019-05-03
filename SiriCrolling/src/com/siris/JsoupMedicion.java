package com.siris;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupMedicion {

	/*
	 * Document 클래스 : 연결해서 얻어온 HTML 전체 문서 Element 클래스 : Documnet의 HTML 요소 Elements
	 * 클래스 : Element가 모인 자료형
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		// Jsoup을 이용해 약 검색시 약이름 가져오기.

		String url = "https://terms.naver.com/medicineSearch.nhn?mode=nameSearch&query=" + input;
		Document doc = null;

		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 주요 뉴스로 나오는 태그를 찾아서 가져오도록 한다.
		// 클래스 이름
		// Elements element = doc.select("list_wrap");
		Elements element = doc.select("div.list_wrap");

		// 1. 헤더 부분의 제목을 가져온다.
		// 주요뉴스 태그.text().
		// 주요뉴스 네글자만 나오게!
		// String title = element.select("h2").text().substring(0, 4);

		System.out.println("============================================================");
		System.out.println(input+"관련 약 정보"); // 정으로 끝나는 정보만 가져오기.
		System.out.println("============================================================");

		// li클래스
		for (Element el : element.select("strong")) { // 하위 a태그의 내용들을 출력
			System.out.println(el.text());
		}
		System.out.println("============================================================");
	}

}
