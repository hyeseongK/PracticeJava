import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner str1 = new Scanner(System.in);
		
		System.out.println("�Է��� ���� �Է�");
		int count = sc.nextInt(); 

		String [] str = new String[count]; //�Է°��� �������� �迭ũ�� ����
		String [][] copy = new String[str.length][7]; // �迭 ���縦 ���� ����
		
		for(int i = 0 ; i < count ; i++){
			System.out.println(i);
			str[i] = str1.nextLine();
			copy[i] = str[i].split(" "); // ������ ���ְ� ����
		}
		
		int [][] num = new int[copy.length][7];
		
		for(int i = 0 ; i < num.length ; i++) { //split�� �迭 copy[][]�� int������ ��ȯ ����
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = Integer.parseInt(copy[i][j]);
				
			}
		}
		
		int	min = 0;int sum = 0;int count1 = 0;
		for(int i = 0 ; i < num.length ; i++) {
			min = 0;sum = 0; // �ѹ��� �������� �ʱ�ȭ
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] % 2 == 0) { // ¦�� ���ϱ�
					sum += num[i][j];
					count1++; //�迭�� ù��° ¦���� ã�� ���� ����
					if(count1 == 1) { // ù ��° ¦�� ����
						min = num[i][j];
					}else if(num[i][j] < min){ // �ּҰ� �񱳴���
						min = num[i][j];
					}
				}			
			}
			System.out.print((i+1)+ "��°" + "�� : " + sum + ", �ּҰ� : " + min);
			System.out.println();
		}

		
	}

}
