package com.siri.que;


// runtimeException�� ȣ���ϴ� ������ ����ó���� ���ص� �����Ͽ��� ����.��?
class A{
	
	void hello(String name) {
		//���� name������ ���� null�̶�� �޼ҵ带 ������� �������� �ʰھ�!!
		if(name==null)
		  throw new NullPointerException();
		//���� ���� �߻�!!, return���� ���� �޼ҵ带 ����.
		
		System.out.println("�ȳ�,"+name);
	}
}
class My{
	A a;//A a=null;
	
	public My() {
	   a = new A();
	}
	
	void callTest(String name) {
		try {
		a.hello(name);//NullPointerException�߻�!!
		//���ܹ߻� ���? 1.a   2.hello   3.name    :  1(90%),3(10%)
		//a.b.c.d(e);  ==> a, b, c : ���ܹ߻� ���!!
		}catch (NullPointerException e) {
			System.out.println("�̸����� �����ϼ���.");
		}
	}
}

public class MyThrowDefineTest {
   public static void main(String[] args) {
      My m = new My();
        String str=null;
//        if(str==null) {
//        	System.out.println("# �̸��� �ݵ�� �Է��ϼ���!");
//        	return;
//        }
        m.callTest(str);
   }
}