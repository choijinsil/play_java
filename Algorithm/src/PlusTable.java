
public class PlusTable {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 4; i <= 12; i++) {
			sum = i;
			for (int j = 0; j < 6; j++) {
				sum = sum + j;
				System.out.printf("%4d", sum);
			}
			System.out.println();

		}

		System.out.println();
		System.out.println("===============================");

//		for (int i = 4; i <= 12; i++) {
//			for (int j = 0; sum=i; j<=5; j++,sum+=j;) {
//				System.out.println("%-4d",sum);
//			}
//		}

		System.out.println("===============================");

	}
}
