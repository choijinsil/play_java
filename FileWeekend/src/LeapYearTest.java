
public class LeapYearTest {

	public static void main(String[] args) {
		// command
		int year = 2016;
		// true - 윤년, false - 평달
		// (year % 4) ==0; <-- false
		boolean status1 = (year % 4) == 0;
		boolean status2 = year % 100 != 0;
		boolean status3 = year % 400 == 0;

		boolean result = (status1 && status2) || status3;
		
		if(!result) { // result==false <-- ! 는 Not Result
			System.out.println(year+"년은 평년입니다.");
		}else {
			System.out.println(year+"년은 윤년입니다.");
		}
		
		F f = new F();
		f.hello(1);

	}
}


class F {
	void hello(int su) {
		if (su == 1) {
			System.out.println("안녕?");
		}
		if (su == 2) {
			System.out.println("신짜오");
		}
		if (su == 3) {
			System.out.println("Hello");
		}
	}
}

