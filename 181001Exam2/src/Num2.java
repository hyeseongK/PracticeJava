import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); //�ڿ��� �Է�
		String a = String.valueOf(input); // String��ȯ
		char [] trans = a.toCharArray(); // char�� �ɰ��� ��ȯ
		int [] copy = new int[trans.length]; // char -> int�� �ٲ� �迭 ����
		
		for(int i = 0 ; i < trans.length ; i++) { // char -> int �迭 ����
			copy[i] = trans[i] - '0';
		}
		
		int sum = 0; //sum �ʱ�ȭ
		for(int i = 0 ; i < copy.length ; i++) {
			sum += copy[i]; //int�迭 ���ϱ�
		}
		System.out.println(sum);
		
		
		
		
	}

}
