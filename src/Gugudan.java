import java.util.Scanner;

public class Gugudan {
	
	//예를 들어 사용자가 “8,7”과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 … 2 * 7, 3 * 1 … 3 * 7, … , 8 * 1 … 8 * 7 까지 구현
	public static void calculate(int first, int second) {  
		//[] result = new int[times];  // 사용자가 입력한 숫자크기만큼 크기의 배열생성
		
		for (int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
}
