import java.util.Scanner;

public class SumJungsu {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� A�Է�");
		int a = sc.nextInt();
		System.out.println("���� B�Է�");
		int b = sc.nextInt();
		
		if(a <= 1 || b >= 1000) {
			System.out.println("1~1000���� ���� �Է��϶�");
			
		}else {
			System.out.println(a+b);
		}
		
		
		
	}
	
	
	
}
