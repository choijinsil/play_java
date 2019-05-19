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
				// 값을 찾으면 이걸 리턴
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pl <= pr);

		// 값을 못찾는다면 -1 리턴( while을 벗어났다는 것이다.)
		return -1;

	}
}
