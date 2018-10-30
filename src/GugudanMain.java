import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		// 사용자에게 출력할 구구단 단수를 입력받는다
		System.out.print("출력하고자 하는 구구단 단수는? :");
		Scanner sr = new Scanner(System.in);
		int num = sr.nextInt();
		int[] result = Gugudan.calculate(num);
		Gugudan.print(result);
	}
}
