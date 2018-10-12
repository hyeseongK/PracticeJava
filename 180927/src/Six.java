import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("0~12미만 수 입력 : ");
		
		try {
			input = sc.nextInt();
		}catch(Exception e) {
			System.out.println("정수 입력해라");
		}
		
		if(input < 0 || input >= 12) {
			System.out.println("0~12미만 수를 입력하라");
			System.exit(1);
		}
		
		int factorial = 1;
		for(int i = 1 ; i <= input ; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}

}
