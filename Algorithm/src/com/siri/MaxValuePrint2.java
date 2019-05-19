package com.siri;

import java.util.Vector;

class Bean {// Person, Car, Animal <---- �Ӽ��� ��� Ŭ����
	// public int su;

	private int su;

	public int getSu() {
		return su;
	}

	public void setSu(int su) {
		this.su = su;
	}

}

public class MaxValuePrint2 {

	public int maxOf(int su1, int su2, int su3) {
		int max = su1;
		if (su2 > max)
			max = su2;
		if (su3 > max)
			max = su3;

		return max;
	}// maxOf

	public int maxOf(int[] arr) {
		int max = arr[0];
		if (arr[1] > max)
			max = arr[1];
		if (arr[2] > max)
			max = arr[2];

		return max;
	}// maxOf

	public int maxOf(Vector<Integer> v) {
		int max = v.get(0);
		if (v.get(1) > max)
			max = v.get(1);
		if (v.get(1) > max)
			max = v.get(2);

		return max;
	}// maxOf

	public int maxOf(Bean b1, Bean b2, Bean b3) {
		// int max= b1.su;
		int max = b1.getSu();
		// if(b2.su>max) max=b2.su;
		if (b2.getSu() > max)
			max = b2.getSu();
		// if(b3.su>max) max=b3.su;
		if (b3.getSu() > max)
			max = b3.getSu();

		return max;
	}// maxOf

	public int maxOf2(Vector<Bean> beanV) {

		int max = beanV.get(0).getSu();

		if (beanV.get(1).getSu() > max)
			max = beanV.get(1).getSu();

		if (beanV.get(2).getSu() > max)
			max = beanV.get(2).getSu();

		return max;
	}// maxOf

	public static void main(String[] args) {
		MaxValuePrint2 mvp = new MaxValuePrint2();
		// ===================<����>=======================
		int su1 = 100, su2 = 150, su3 = 130;
		int max1 = mvp.maxOf(su1, su2, su3);// �޼ҵ�ȣ��: �޼ҵ��(������);

		System.out.println("�ִ밪1=" + max1);
		// ===================<�迭>=======================
		int[] arr = { su1, su2, su3 };
		// su1�� �迭arr�� ����Ǵ� ���� arr[0]��� ���ο� �������� ���!!
		int max2 = mvp.maxOf(arr);
		System.out.println("�ִ밪2=" + max2);

		// ===================<����>=======================
		Vector<Integer> v = new Vector<Integer>();
		// su1�� ����v�� ����Ǵ� ���� v.get(0)��� ���ο� �������� ���!!
		v.add(su1);
		v.add(su2);
		v.add(su3);

		int max3 = mvp.maxOf(v);
		System.out.println("�ִ밪3=" + max3);

		// ===================<����>=======================
		Bean b1 = new Bean(); // b.su=0
		Bean b2 = new Bean(); // b.su=0
		Bean b3 = new Bean(); // b.su=0
		// b1.su=su1;//su1�� �ڹٺ� ����Ǵ� ���� b1.su ��� ���ο� �������� ���!!
		// b2.su=su2;
		// b3.su=su3;
		b1.setSu(su1);// su1�� �ڹٺ� ����Ǵ� ���� b1.getSu() ��� ���ο� �������� ���!!
		b2.setSu(su2);
		b3.setSu(su3);
		int max4 = mvp.maxOf(b1, b2, b3);
		System.out.println("�ִ밪4=" + max4);
		// ===================<���;��� ����>=======================
		Vector<Bean> beanV = new Vector<Bean>();
		beanV.add(b1);// b1�� ���Ϳ� ����Ǵ� ���� beanV.get(0).getSu()��� ���ο� �������� ���!!
		beanV.add(b2);
		beanV.add(b3);

		int max5 = mvp.maxOf2(beanV);
		System.out.println("max5=" + max5);

	}
}
