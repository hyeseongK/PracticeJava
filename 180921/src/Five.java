import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("100�� ���� �Է�");
		String str = sc.nextLine();
		if(str.length() > 100) {
			System.out.println("100�� �̸����� �Է��ϼ���");
			System.exit(1);
		}

		for(int i = 0 ; i < str.length() ; i++) {
			if(i % 10 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(str.charAt(i));
		}
		
		
		
		
		
		
	}

}
