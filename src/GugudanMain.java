import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// ����ڿ��� ����� ������ �ܼ��� �Է¹޴´�
		System.out.print("����ϰ��� �ϴ� ������ �ܼ���? :");
		Scanner sr = new Scanner(System.in);  // Scanner�� ����ڷκ��� ���� �Է¹��� �� �ִ� Ŭ����
		String inputValue = sr.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
	
		Gugudan.calculate(first, second);
	}	
}
