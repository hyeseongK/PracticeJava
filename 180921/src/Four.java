import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �� ���� �����̽� �� ������ �ι�° �� �Է�");
		String str = sc.nextLine();
		
		int idx = 0; //�ε����� �ʱ�ȭ
		String input1 = "", input2 = ""; //2���� ������ ������ ���� �ʱ�ȭ
		
		for(int i = 0 ; i <str.length() ; i++) { //���鰪�� �ε����� ã�� �ε��������� ����
			if(str.charAt(i) == ' ') {
				idx = i;
			}
		}
		
		for(int i = 0 ; i < idx ; i++) { // �ε��� �������� ù��° �� ����
			input1 = input1 + String.valueOf(str.charAt(i));
			
		}
		for(int i = idx+1 ; i <str.length() ; i++) { // �ε��� �������� input������ �ι�° �� ����
			input2 = input2 + String.valueOf(str.charAt(i));
		}
		
		int First = Integer.parseInt(input1); // ù��° �� int�� parsing
		int Second = Integer.parseInt(input2); // �ι�° �� int�� parsing

		boolean isPrime; //�Ҽ� �Ǻ� ���� ����
		for(int i = First ; i <= Second ; i++) {
			isPrime = false; //�� ���۸��� �ʱ�ȭ
			
			for(int j = 2 ; j < i ; j++ ) { // �Ҽ��Ǻ�
				if(i % j == 0) { 
					isPrime = true;
					break;
				}
			}
			
			if(isPrime == true) { //�Ҽ��� �ƴ� �� ���� �ݺ���
				continue;
			}else {
				System.out.println(i);
			}
			

		}
		
		
		
		
		
		
		
	}

}
