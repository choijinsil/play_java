package com.encore.j0416;

public class MyTest {

	public static void main(String[] args) {
		My my= new My();
		my.juwon(); // <-- 이 메소드를 먼저 실행해야 300이 출력된다.
		// 하지만 lime을 먼저 실행하면 0이 출력된다.
		//my.lime();
	
		int su= my.juwon();
		
		You you= new You();
		you.lime(su);
	}
}
