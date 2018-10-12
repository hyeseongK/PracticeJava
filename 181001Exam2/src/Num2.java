import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //자연수 입력
		String a = String.valueOf(input); // String변환
		char [] trans = a.toCharArray(); // char로 쪼개서 변환
		int [] copy = new int[trans.length]; // char -> int로 바꿀 배열 복사
		
		for(int i = 0 ; i < trans.length ; i++) { // char -> int 배열 복사
			copy[i] = trans[i] - '0';
		}
		
		int sum = 0; //sum 초기화
		for(int i = 0 ; i < copy.length ; i++) {
			sum += copy[i]; //int배열 더하기
		}
		System.out.println(sum);
		
		
		
		
	}

}
