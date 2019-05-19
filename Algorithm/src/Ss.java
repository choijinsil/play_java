import java.util.Arrays;

public class Ss {

	public static void main(String[] args) {
		//Arrays.binarySearch(arg0, arg1);
		
	}

	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				// ���� ã���� �̰� ����
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pl <= pr);

		// ���� ��ã�´ٸ� -1 ����( while�� ����ٴ� ���̴�.)
		return -1;

	}
}
