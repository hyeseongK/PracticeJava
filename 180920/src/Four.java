import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : "); int a = sc.nextInt();
		System.out.print("Input : "); int b = sc.nextInt();
		if(a < 2 || a > 9) {
			System.out.println("2~9 정수 입력하세요");
		}else if(b < 2 || b > 9) {
			System.out.println("2~9 정수 입력하세요");
		}

		Cal cal = new Cal(a,b);
		
		if(a < b) {
			cal.Ascending();
		}else if(b > a) {
			cal.Descending();
		}
		
		
		
	}

}

class Cal {
	int num1,num2;
	
	Cal(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	

	void Ascending() {
		int count = 0;
		for(int i = num1 ; i <= num2 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				int mul = i*j;
				System.out.printf("%d%s%d%s%2d",i," * ",j," = ",mul);
				System.out.print("   ");
				count++;
				if(count != 0 && count % 3 == 0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	
	public void Descending() {
		int count = 0;
		for(int i = num2 ; i >= num1 ; i--) {
			for(int j = 1 ; j <= 9 ; j++) {
				int mul = i*j;
				System.out.printf("%d%s%d%s%2d",i," * ",j," = ",mul);
				System.out.print("   ");
				count++;
				if(count != 0 && count % 3 == 0) {
					System.out.println();
				}
				
			}
			System.out.println();
		}
		
	}
	
	
	
	
}

