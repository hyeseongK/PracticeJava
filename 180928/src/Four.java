import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.length() > 3) {
			System.out.println("2�ڸ� �Է��ϰ� ���̿� ������ �ϳ��� �Է��Ͻÿ�");
			System.exit(1);
		}
		
		char [] arr = input.toCharArray();
		
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}
