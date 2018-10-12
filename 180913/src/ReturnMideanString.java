import java.util.Scanner;

public class ReturnMideanString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int j;
		
		
		if(str.length() % 2 == 0) {
			
			j = str.length() / 2;
			System.out.print(str.charAt(j-1));
			System.out.print(str.charAt(j));
			
		}else {
			
			j = str.length() / 2;
			System.out.print(str.charAt(j));
			
		}

	}

}
