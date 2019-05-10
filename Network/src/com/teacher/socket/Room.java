package com.teacher.socket;


import java.util.Vector;

public class Room {//대화방의 정보표현 객체
	
    String title;//방제목
    int count;//방 인원수
    String boss;//방장(방 개설자)
    Vector<Service> userV;//userV: 같은 방에 접속한 Client정보 저장
                          
    // 룸을 만들어 들어가면 wailtRomm엔 - 해주고 ... 나가기를 누르면 remove시켜주고
    public Room() {
    	userV = new Vector<>();
	} 
}
