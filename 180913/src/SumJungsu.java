import java.util.Scanner;

public class SumJungsu {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 A입력");
		int a = sc.nextInt();
		System.out.println("정수 B입력");
		int b = sc.nextInt();
		
		if(a <= 1 || b >= 1000) {
			System.out.println("1~1000사이 수를 입력하라");
			
		}else {
			System.out.println(a+b);
		}
		
		
		
	}
	
	
	
}
