
public class DoWhileTest {

	public static void main(String[] args) {

		// ����) do~while���� ����Ͽ� "Hello World!"�� ȭ�鿡 3�� ����Ͻÿ�.

		boolean flag = true;
		int cnt = 1;
		do {
			System.out.println("Hello World!");
			if (cnt++ == 3) {
				
				break; // == flag=false; �� �ΰ����� ���� �Ȱ���
			}
		} while (flag);
		
		// do~while���� ����Ͽ� 1~10 ���� ����Ͻÿ�.
		int su = 1, sum = 0;

		// ������ ������ �ƴϴ�.
		do {
			sum += su;	// sum=sum+su
			// �������     3      1    2
			if(su<10) {
				su++;
				continue;
			}
			flag=false;
			
		} while (flag);
		System.out.println("1���� 10������ �� --->"+sum);
	}
}
