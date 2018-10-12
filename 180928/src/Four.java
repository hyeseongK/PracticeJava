import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.length() > 3) {
			System.out.println("2자만 입력하고 사이에 공백은 하나만 입력하시오");
			System.exit(1);
		}
		
		char [] arr = input.toCharArray();
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}
