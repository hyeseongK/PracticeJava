import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char a = input.charAt(0);
		
		if(a == 'A') {
			input = "1���";
		}else if(a == 'B') {
			input = "2���";
		}else if(a == 'C') {
			input = "3���";
		}else {
			input = "��� ��";
		}
		System.out.println(input);
		
		
		
		
	}

}
