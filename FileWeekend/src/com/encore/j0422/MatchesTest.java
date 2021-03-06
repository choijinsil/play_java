package com.encore.j0422;

public class MatchesTest {

	// String클래스 --> boolean str.matches(String regex);
	// regex ----> regular expression (정규 표현식, 정규식)
	// regex를 통해 전달되는 패턴에 str이 부합(match)된다면 true를 리턴.
	// 출현(발생)횟수에 관련된 부호: ?(0,1) , *(0~ 무한대), +(1~무한대)
	// 부호없음 <-- 1번 출현
	public static void main(String[] args) {
		String str = "";
		str = "a";
		str = "aaaa";
		str = "aaaaaaaaaaa";

		// matches(패턴문자열)
		System.out.println("부호없음: " + str.matches("[a]")); // a문자: 한번
		System.out.println("?부호: " + str.matches("[a]?")); // a문자: 0,1 <-- 생략도 true로 봄
		System.out.println("*부호 : " + str.matches("[a]*")); // a문자: 0 ~ 무한대
		System.out.println("+부호 : " + str.matches("[a]+"));// a문자: 1~무한대
		System.out.println("======================");
		System.out.println(str.matches("[abc]")); // a또는 b또는 c문자중 1번 출연한다면 true
		System.out.println(str.matches("[abc+]")); // a,b,c문자가 조합되어 여러번 발생

		String name = "gildongOO";
		// name변수에 대한 영문자 체크!
		System.out.println("name변수의 이름체크(영문자)체크: " + name.matches("[a-zA-z]+"));
		System.out.println("name변수의 이름체크(영문자)체크: " + name.matches("[A-z]+"));

		// 수 변수에 대한 숫자 체크
		String su = "34567";
		System.out.println("su변수의 숫자체크: " + su.matches("[0-9]+"));

		String hangul = "가나";
		// 한글 변수에 대한 한글 체크!
		System.out.println("한글체크: " + hangul.matches("[ㄱ-힣]+"));

		String id = "jinsil1106";
		// 아이디는 8~12자리 입니다. 영문자와 숫자 조합입니다.
		String idPattern = "[A-z0-9]{8,12}"; // 문자열 길이가 최소 8~12
		// {8,12} 8이상 12 이하{8, }: 최소 8이상 {8} : 8번
		System.out.println("아이디체크: " + id.matches(idPattern));

		String juminBunho = "960309-3012345";
		String juminPattern =  "[\\d]{6}-[\\d]{7}"; // <-- \사용시 \\를 써주면 역슬래시로 봐준다. 아니라면 문자열로 봄
		System.out.println("주민번호 체크: " + juminBunho.matches(juminPattern));

		
	}
}
