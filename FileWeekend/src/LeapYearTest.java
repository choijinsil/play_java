
public class LeapYearTest {

	public static void main(String[] args) {
		// command
		int year = 2016;
		// true - ����, false - ���
		// (year % 4) ==0; <-- false
		boolean status1 = (year % 4) == 0;
		boolean status2 = year % 100 != 0;
		boolean status3 = year % 400 == 0;

		boolean result = (status1 && status2) || status3;
		
		if(!result) { // result==false <-- ! �� Not Result
			System.out.println(year+"���� ����Դϴ�.");
		}else {
			System.out.println(year+"���� �����Դϴ�.");
		}
		
		F f = new F();
		f.hello(1);

	}
}


class F {
	void hello(int su) {
		if (su == 1) {
			System.out.println("�ȳ�?");
		}
		if (su == 2) {
			System.out.println("��¥��");
		}
		if (su == 3) {
			System.out.println("Hello");
		}
	}
}

