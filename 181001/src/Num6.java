import java.util.Scanner;

public class Num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int input = sc.nextInt();
		
		int pi = 0, a = 0, b = 1;
		Loop1 :for(int i = 0 ; i <= input ; i++) {

			pi = a + b;
			a = b;
			b = pi;
			
			if(pi > input) {
				break Loop1;
			}else {
				System.out.print(pi + " ");
			}
			
		}
		
				
		
		
		
		
		
		
	}

}
