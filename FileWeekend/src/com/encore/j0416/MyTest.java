package com.encore.j0416;

public class MyTest {

	public static void main(String[] args) {
		My my= new My();
		my.juwon(); // <-- �� �޼ҵ带 ���� �����ؾ� 300�� ��µȴ�.
		// ������ lime�� ���� �����ϸ� 0�� ��µȴ�.
		//my.lime();
	
		int su= my.juwon();
		
		You you= new You();
		you.lime(su);
	}
}
