import java.util.Scanner;

public class Gugudan {
	
	//���� ��� ����ڰ� ��8,7���� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�. ��ĥ���� 2 * 1 �� 2 * 7, 3 * 1 �� 3 * 7, �� , 8 * 1 �� 8 * 7 ���� ����
	public static void calculate(int first, int second) {  
		//[] result = new int[times];  // ����ڰ� �Է��� ����ũ�⸸ŭ ũ���� �迭����
		
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
}
