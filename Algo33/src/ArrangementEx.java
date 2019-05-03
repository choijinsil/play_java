
public class ArrangementEx {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int input = 0; // 입력숫자ㅊ

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				input += 1;
				arr[i][j] = input;
				
			}
			
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%-4d",arr[i][j]);
			}

		}
	}

}
