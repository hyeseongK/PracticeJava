import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First Input");
		String input1 = sc.nextLine();
		System.out.println("Second Input");
		String input2 = sc.nextLine();
		
		boolean bol = false;
		
		if(input1.replace(input2, " ") != input1) { //input1���� input2�� ����ִٸ� �ش� ���� �������� �ٲ� �ʱ� input1���� ���� �ʰ� �ȴ�
			bol = true;								//�� ���� input2�� ����ִٴ� ���� �ǹ��ϹǷ� true ���
		}
		
		if(bol) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
