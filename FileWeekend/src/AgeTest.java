
public class AgeTest {

	public static void main(String[] args) {
		// 10��, 20��, 30�� ���!!
		int age = 45;// ����) ����� ���̴� 10~39�� �Է�

		if (age < 10 || age > 39) {
			System.out.println("�������� �����Դϴ�^^: " + age);
		} else // 10~39
		if (age < 20) {// (age >= 10 && age <= 19){
			// ( 10 <= age <= 19){ ����: age������ ���ÿ� 10�� 19 �񱳸� �Ҽ� ����!!
			System.out.println("10���Դϴ�~!!");
		} else // 20~39
		if (age < 30) {
			System.out.println("20���Դϴ�~!!");
		} else { // 30~39
			// if(age >=30 && age <=39){
			System.out.println("30���Դϴ�~!!");
		}
	}// main
}