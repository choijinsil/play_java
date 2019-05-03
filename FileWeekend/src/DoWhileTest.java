
public class DoWhileTest {

	public static void main(String[] args) {

		// 문제) do~while문을 사용하여 "Hello World!"를 화면에 3번 출력하시오.

		boolean flag = true;
		int cnt = 1;
		do {
			System.out.println("Hello World!");
			if (cnt++ == 3) {
				
				break; // == flag=false; 이 두가지의 뜻은 똑같당
			}
		} while (flag);
		
		// do~while문을 사용하여 1~10 합을 출력하시오.
		int su = 1, sum = 0;

		// 적합한 순서는 아니다.
		do {
			sum += su;	// sum=sum+su
			// 실행순서     3      1    2
			if(su<10) {
				su++;
				continue;
			}
			flag=false;
			
		} while (flag);
		System.out.println("1부터 10까지의 합 --->"+sum);
	}
}
