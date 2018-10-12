import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int mid = input.length() / 2;

		if(mid % 2 != 0) {
			char a = input.charAt(mid);
			System.out.println(a);
		}else {
			char a = input.charAt(--mid);
			char b = input.charAt(++mid);
			System.out.print(a);System.out.print(b);
		}
		
		
		
		
		
		
		
		
	}

}
