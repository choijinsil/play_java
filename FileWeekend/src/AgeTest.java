
public class AgeTest {

	public static void main(String[] args) {
		// 10대, 20대, 30대 출력!!
		int age = 45;// 가정) 사람의 나이는 10~39만 입력

		if (age < 10 || age > 39) {
			System.out.println("범위밖의 나이입니다^^: " + age);
		} else // 10~39
		if (age < 20) {// (age >= 10 && age <= 19){
			// ( 10 <= age <= 19){ 에러: age변수를 동시에 10과 19 비교를 할수 없다!!
			System.out.println("10대입니다~!!");
		} else // 20~39
		if (age < 30) {
			System.out.println("20대입니다~!!");
		} else { // 30~39
			// if(age >=30 && age <=39){
			System.out.println("30대입니다~!!");
		}
	}// main
}