import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// ����ڿ��� ����� ������ �ܼ��� �Է¹޴´�
		System.out.print("����ϰ��� �ϴ� ������ �ܼ���? :");
		Scanner sr = new Scanner(System.in);  // Scanner�� ����ڷκ��� ���� �Է¹��� �� �ִ� Ŭ����
		int num = sr.nextInt();
		int[] result = Gugudan.calculate(num);
		Gugudan.print(result);
	}
}
