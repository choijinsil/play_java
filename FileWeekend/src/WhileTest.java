
public class WhileTest {

	public static void main(String[] args) {

		// while문을 사용해서 1~10가지 더한 값을 화면에 출력하세요.
		int sum = 0; // 데이터 누적
		int su = 0; // 1씩증가
		boolean flag = true; // 논리값

		while (flag) { // flag의 논리값이 true일 경우에만 실행하자. false면 break
			sum = sum + su; // sum=0+1, sum=1+2, sum=3+4...

			su++; // 1씩 증가하기 때문에 su를 증가시켜준다.
			// System.out.println(su); // su가 제대로 증가하는지 찍어보기

			if (su > 10) // 만약 수가 10이상이라면 flag는 false로 바꾼다. 그렇다면 while문 실행이 멈추겟지?
				flag = false;

			// 이곳에 System.out.println(sum)을 하면 값이 총 10번 찍히겠지?

		} // while문 끝났다.

		System.out.println("sum은--->" + sum); // while문을 마치면 sum의 최종값을 출력한다.

	}
}
