package com.siri.que;

public class RecursiveTest {

	int count = 1;

	void gildong() {
		System.out.println("������½ ������½");
		if (count >= 10)
			return;
		count++;
		gildong(); // ���ȣ��! : ������ ������ ���ٸ� StackOverFlowError�߻��Ѵ�.
		
	}

	public static void main(String[] args) {
		RecursiveTest rt = new RecursiveTest();
		rt.gildong();
	}

}
