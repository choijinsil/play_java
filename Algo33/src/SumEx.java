
public class SumEx {

	public static void main(String[] args) {
		int a = 0, sum = 0;

		while (a < 10) {
			System.out.println(a % 2);
			System.out.println(a % 2 == 1);
			a++;

			if (a % 2 == 1) {
				continue;
			}
			sum += a;
		}
		System.out.println(sum);

	}

}
