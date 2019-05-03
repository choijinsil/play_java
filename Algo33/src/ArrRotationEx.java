
public class ArrRotationEx {

	public static void main(String[] args) {
		int[][] p = new int[5][5];
		int[][] q = new int[5][5];
		int h = 0;
		int l = 0;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				h = h + 1;
				p[i][j] = h;
				System.out.print(p[i][j]);
			}
			System.out.println();
		}

		for (int i = 2; i > 0; i--) {

			for (int j = 0; j < q.length; j++) {

				for (h = 5; h < 5; h++) {
					l = 6 - h;
					if (i == 2) {
						q[i][j] = p[l][j];
					} else {
						p[j][h] = q[l][j];
					}
				}

			}
			
		}
		System.out.println();

	}

}
