import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		if(input.length() < 8) {
			System.out.println("8�� �̻����� �Է��Ͻÿ�");
			System.exit(1);
		}
		
		int big = 0, small = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) {
				small++;
			}else if(arr[i] >= 65 && arr[i] <= 90) {
				big++;
			}else {
				System.out.println("��ҹ��� �ƴѰ� ����");
				System.exit(1);
			}
		}
		if(big == 0 || small == 0) {
			System.out.println("��ҹ��� �� �ϳ��� �ԷµǾ����");
		}else {
			System.out.println("YES");
		}
		
		
		
	}

}
