import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(); //input �� �Է�
		int length1 = (int)(Math.log10(input1)+1); // input�� �ڸ��� ����
		int input2 = sc.nextInt();
		int length2 = (int)(Math.log10(input2)+1);
		
		String trans = String.valueOf(input2); //�ι�° �� string�� ��ȯ
		
		char [] arr = trans.toCharArray(); // ��ȯ��  String char�迭 ��ȯ
		int [] arr2 = new int[arr.length]; // arr�� ���� int���� �ٲ� �迭
		int [] result = new int[arr2.length];//arr2�� ���� ù��° input���� ����Ͽ� ����

		
		if(length1 < 3 || length1 > 3) { //�ڸ��� �˻�
			System.out.println("�Է°��� �ڸ����� 3�ڸ�");
		}else if(length2 <3 || length2 > 3) {
			System.out.println("�Է°��� �ڸ����� 3�ڸ�");
		}
		for(int i = arr.length-1 ; i <= 0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
		for(int i = 0 ; i < arr2.length ; i++) { //int�� ��ȯ
			arr2[i] = arr[i] - '0';
		}
		
		
		int count = 100, sum = 0;
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = input1*arr2[i]; //����� ����
			sum += result[i] * count; // ����� ����
			count /= 10;
		}
		
		for(int i = result.length-1 ; i >= 0 ; i--) { // ���
			System.out.println(result[i]);
		}
		System.out.println(sum);
		
		
		
	}

}
