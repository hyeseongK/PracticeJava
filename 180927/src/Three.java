import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		if(input.length() < 8) {
			System.out.println("8자 이상으로 입력하시오");
			System.exit(1);
		}
		
		int big = 0, small = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) {
				small++;
			}else if(arr[i] >= 65 && arr[i] <= 90) {
				big++;
			}else {
				System.out.println("대소문자 아닌게 있음");
				System.exit(1);
			}
		}
		if(big == 0 || small == 0) {
			System.out.println("대소문자 중 하나가 입력되어야함");
		}else {
			System.out.println("YES");
		}
		
		
		
	}

}
