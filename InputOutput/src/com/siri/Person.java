package com.siri;

import java.io.Serializable;

public class Person implements Serializable { // ��ü ����ȭ�� �ϰ���
	// ���� Person�� �Ϸķ� �����ϰڽ��ϴ�.
	String name = "���浿";
	int age = 13;
	// �տ� transitent
	String job = "�л�";
}

// Person��ü�� ���Ͽ� ���� �ֽ��ϱ�? <-- objectOutputStream ���!
