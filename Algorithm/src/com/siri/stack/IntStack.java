package com.siri.stack;

class EmptyInstackExcepion extends RuntimeException { // ExceptionŬ������ ��
	public EmptyInstackExcepion() {

	} // ����ִ� ����Ŭ����

}

class OverFlowInstackEception extends RuntimeException {

}// ��ħ ���� Ŭ����

public class IntStack {
	private int max;
	private int pointer; // 1 ����, ���������� �Է´��
	private int[] stack;

	public IntStack(int capcacity) {

		try {
			max = capcacity; // capacity 10�� ���޵Ǹ�
			stack = new int[max]; // ���� 10���� ���޹����� �ִ� ���� ������ �ְڴ�.

		} catch (OutOfMemoryError e) {
			// �޸� ������ �̺κ��� ����ȴ�.
			max = 0;
		}
	}

	// ���� Ǫ��
	public int push(int x) throws OverFlowInstackEception {
		if (pointer >= max) { // pull �̰ų� overflow�� ���
			throw new OverFlowInstackEception();
		}
		return stack[pointer++] = x;

	}

	// ���� ��
	public int pop() {
		if (pointer <= 0) {// <=0 , ==0�ᵵ �ȴ�. �迭�� -�� �����ϱ�.
			throw new EmptyInstackExcepion(); // throw: ���� �����޼��� ��ܿ� ��ġ�Ҷ� throws ��ȣ ���� throw
		}
		
		return stack[--pointer];
	} // ���� pop�� �ڿ� peek�� �����ϸ�

	// ���� ���� �ִ� �����͸� �鿩�� ���� ���, �� �������� ���� �����Ͱ� ��������
	public int peek() {
		return stack[pointer - 1];

	}

	// x�����Ͱ� ���� �ε��� ����! x�����Ͱ� ���ٸ� ���� -1
	public int indexOf(int x) {

		for (int i = pointer - 1; i >= 0; i--) {
			if (stack[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// ������ �뷮(�ִ� �Է°���)
	public int capacity() {
		return max;
	}

	// ���ؿ� �׿� �ִ� ������ ���� ��ȯ
	public int size() {// 5���� Ǫ�� 3�� ��
		return pointer;
	}

	// ������ �����
	public boolean isEmpty() {
		return pointer <= 0;
	}

	// ������ �� �� ����
	public boolean isFull() {
		return pointer >= max;
	}

	// ���ϴ� Ư�������� ��� ������ ��� bottom -> top���·�
	public void dump() {

		if (isEmpty()) { // ���ؿ� �����Ͱ� ���ٸ� ����� �ʿ䰡 ����.
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			for (int i = 0; i < pointer; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	} // dump
}
