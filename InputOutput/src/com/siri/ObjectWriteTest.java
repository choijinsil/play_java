package com.siri;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {// ��ü ���� �׽�Ʈ
	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("person.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person p = new Person();
		

		Person p2 = new Person();
		p2.name = "�����";
		p2.age = 15;
		p2.job = "����Ʈ���";

		oos.writeObject(p);
		oos.writeObject(p2);
		oos.writeObject("����ȭ �ȳ�~!!");
		oos.writeInt(300);
		oos.writeBoolean(true);
		oos.close();
		fos.close();

		System.out.println("��ü���� ����!!");
	}// main
}
