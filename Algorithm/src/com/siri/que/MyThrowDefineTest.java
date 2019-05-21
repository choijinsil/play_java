package com.siri.que;


// runtimeException은 호출하는 곳에서 예외처리를 안해도 컴파일에러 없음.왜?
class A{
	
	void hello(String name) {
		//만약 name인자의 값이 null이라면 메소드를 문장들을 실행하지 않겠어!!
		if(name==null)
		  throw new NullPointerException();
		//강제 예외 발생!!, return문과 같이 메소드를 제어.
		
		System.out.println("안녕,"+name);
	}
}
class My{
	A a;//A a=null;
	
	public My() {
	   a = new A();
	}
	
	void callTest(String name) {
		try {
		a.hello(name);//NullPointerException발생!!
		//예외발생 요소? 1.a   2.hello   3.name    :  1(90%),3(10%)
		//a.b.c.d(e);  ==> a, b, c : 예외발생 요소!!
		}catch (NullPointerException e) {
			System.out.println("이름값을 전할하세요.");
		}
	}
}

public class MyThrowDefineTest {
   public static void main(String[] args) {
      My m = new My();
        String str=null;
//        if(str==null) {
//        	System.out.println("# 이름을 반드시 입력하세요!");
//        	return;
//        }
        m.callTest(str);
   }
}