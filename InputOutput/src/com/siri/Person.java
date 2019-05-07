package com.siri;

import java.io.Serializable;

public class Person implements Serializable { // 객체 직렬화를 하겠음
	// 나는 Person을 일렬로 나열하겠습니다.
	String name = "나길동";
	int age = 13;
	// 앞에 transitent
	String job = "학생";
}

// Person객체를 파일에 쓸수 있습니까? <-- objectOutputStream 사용!
