import java.util.Scanner;

public class Gugudan {
	// ����ڷκ��� �Է¹��� ������ �ܼ��� ������� �迭�� �Է��ϴ� �޼���
	public static int[] calculate(int times) {
		int[] result = new int[9]; // 0~8�� �ε����� ���� �迭 ����
		
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	// ����ڷκ��� �Է¹��� ������ �ܼ��� �����͸� ������ �迭�� ����ϴ� �Լ�
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); 
		}
	}
}
