package com.siri.stack;

class EmptyInstackExcepion extends RuntimeException { // Exception클래스가 됨
	public EmptyInstackExcepion() {

	} // 비어있는 예외클래스

}

class OverFlowInstackEception extends RuntimeException {

}// 넘침 예외 클래스

public class IntStack {
	private int max;
	private int pointer; // 1 증가, 다음데이터 입력대기
	private int[] stack;

	public IntStack(int capcacity) {

		try {
			max = capcacity; // capacity 10이 전달되면
			stack = new int[max]; // 정수 10개를 전달받을수 있는 수를 정의해 주겠다.

		} catch (OutOfMemoryError e) {
			// 메모리 부족시 이부분이 실행된다.
			max = 0;
		}
	}

	// 스택 푸시
	public int push(int x) throws OverFlowInstackEception {
		if (pointer >= max) { // pull 이거나 overflow인 경우
			throw new OverFlowInstackEception();
		}
		return stack[pointer++] = x;

	}

	// 스텍 팝
	public int pop() {
		if (pointer <= 0) {// <=0 , ==0써도 된다. 배열은 -가 없으니까.
			throw new EmptyInstackExcepion(); // throw: 리턴 에러메세지 상단에 위치할땐 throws 괄호 안은 throw
		}
		
		return stack[--pointer];
	} // 만약 pop한 뒤에 peek를 실행하면

	// 스택 정상에 있는 데이터를 들여다 보는 기능, 맨 마지막에 쌓인 데이터가 무엇인지
	public int peek() {
		return stack[pointer - 1];

	}

	// x데이터가 갖는 인덱스 리턴! x데이터가 없다면 리턴 -1
	public int indexOf(int x) {

		for (int i = pointer - 1; i >= 0; i--) {
			if (stack[i] == x) {
				return i;
			}
		}
		return -1;
	}

	// 스텍의 용량(최대 입력갯수)
	public int capacity() {
		return max;
	}

	// 스텍에 쌓여 있는 데이터 수를 반환
	public int size() {// 5번의 푸쉬 3의 팝
		return pointer;
	}

	// 스텍의 빈상태
	public boolean isEmpty() {
		return pointer <= 0;
	}

	// 스텍이 꽉 찬 상태
	public boolean isFull() {
		return pointer >= max;
	}

	// 원하는 특정구간의 모든 데이터 출력 bottom -> top상태로
	public void dump() {

		if (isEmpty()) { // 스텍에 데이터가 없다면 출력할 필요가 없다.
			System.out.println("스텍이 비어있습니다.");
		} else {
			for (int i = 0; i < pointer; i++) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	} // dump
}
