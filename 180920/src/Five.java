import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int a = sc.nextInt(); // �Է�
		
		int length = (int)(Math.log10(a)); //�Է°� �ڸ��� ���
		
		int big = (int)(Math.pow(10, length)); // a�� �ڸ��� ��ŭ 10�� �ش� �ڸ��� ����
		int small = (int)(Math.pow(10, (length-1))); // a-1 �ڸ��� ��ŭ �ش� �ڸ��� ����
		int count = 0;
		
		for(int i = big ; i < a ; i++) { // input���� 3�ڸ���� 100���� �����ؼ� input������ 1�� �ݺ�
			for(int j = small ; j < big -1 ; j++) { //2�ڸ����� 2�ڸ��� ������ �ִ� �ִ밪, big-1���� 1�� �����ϸ� �ݺ�
			
				if((i+j) == a) { // big+small == input�̶�� count++
					count++;
				}
				
			}
		}
		
		System.out.println(count); // Ƚ�� ���
		for(int i = big ; i < a ; i++) { // input���� 3�ڸ���� 100���� �����ؼ� input������ 1�� �ݺ�
			for(int j = small ; j < big -1 ; j++) { //2�ڸ����� 2�ڸ��� ������ �ִ� �ִ밪, big-1���� 1�� �����ϸ� �ݺ�
			
				if((i+j) == a) { // big+small == input�̶�� ���
					
					System.out.printf("%2d%2s%2d%2s%2d",i," + ", j," = ", (i+j));
					System.out.println();
				}
				
			}
		}
		
		
	}

}
