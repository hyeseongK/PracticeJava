import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input, numeral;
		String a2, a8, a16;
		
		System.out.print("���� �Է� : ");
			input = sc.nextInt();
		System.out.println();
		
		System.out.print("�ٲٰ��� �ϴ� ����(2, 8, 16) : ");
			numeral = sc.nextInt();
		System.out.println();
		
		if(numeral == 2) {
			a2 = Integer.toBinaryString(input);
			System.out.println("2 ���� : " + a2);
		}else if(numeral == 8) {
			a8= Integer.toOctalString(input);
			System.out.println("8 ���� : " + a8);
		}else if(numeral == 16) {
			a16 = Integer.toHexString(input);
			System.out.println("16 ���� : " + a16);
		}else {
			System.out.println("������ �ٸ��� �Է��ϼ���.");
		}
		
	}

}
