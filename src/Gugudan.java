import java.util.Scanner;

public class Gugudan {
	// 사용자로부터 입력받은 구구단 단수의 결과값을 배열에 입력하는 메서드
	public static int[] calculate(int times) {
		int[] result = new int[9]; // 0~8의 인덱스를 갖는 배열 생성
		
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	// 사용자로부터 입력받은 구구단 단수의 데이터를 저장한 배열을 출력하는 함수
	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); 
		}
	}
}
