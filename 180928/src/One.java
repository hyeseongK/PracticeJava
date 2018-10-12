import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner str = new Scanner(System.in);
		System.out.println("Input First Number");
		long input1 = sc.nextLong();
		
		System.out.println("Input Operater(+ or *)");
		String operater = str.next();
		char ch = operater.charAt(0);
		
		System.out.println("Input Second Number");
		long input2 = sc.nextLong();

		long sum = 0,time = 0;

		if(input2 % 10 != 0) {
			System.out.println("Second Number는 10의 배수로 입력");
			System.exit(1);
		}
		
		if(ch == '+') {
			sum = input1 + input2;
			System.out.println(sum);
		}else if(ch == '*') {
			time = input1 * input2;
			System.out.println(time);
		}else {
			System.out.println("Input right operater(+ or *)");
		}

	}

}
