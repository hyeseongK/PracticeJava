import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = null;
		System.out.println("40�� �̳��� ���ڸ� �Է�");
		while(true) {	//40�� �̳��� �Է�
			input = sc.nextLine();
			if(input.length() > 40) {
				System.out.println("40�� �̳��� �����Է��Ͻÿ�");
			}else {
				break;
			}
		}
		
		char [] arr = input.toCharArray(); //�Է� �� char�迭�� ��ȯ
		char [] copy = new char[arr.length]; // ���� �� �迭 ������� ���� 
		
		for(int i = 0 ; i < copy.length ; i++) { // ����
			copy[i] = arr[i];
		}
		
		Loop1 : for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) { //�ε��� ������ �ƽ�Ű�ڵ� �ҹ��� �� ������ ���� �� 32�� ���־� �빮�ڷ� ��ȯ�Ͽ� ����
				int a = arr[i] - 32;
				char b = (char)(a);
				arr[i] = b;
			}
			if(i >= 1) { // ���� �ߺ����� �˻�
				if(arr[i] == ' ') {
					if(arr[i] == arr[i-1] || arr[i] == arr[i+1]) {
						System.out.println("������ ���ӵǾ� �Է����� ������");
						break Loop1;
					}
				}
			}else {
				continue;
			}

		}
		
		System.out.print("���� �� : "); // ���
		for(int j = 0 ; j < copy.length ; j++) {
			System.out.print(copy[j]);
		}
		System.out.println();
		System.out.print("���� �� : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}
	
		
		
		
	}

}
