import java.util.Scanner;

public class First {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[10];
		int [] copy = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) { // �Է�
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		for(int i = 0 ; i < arr.length ; i++) { //�迭 �������� ����
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
				}
	        }
		}
		
		System.out.println("----------ASCENDING-----------"); // �������� ���
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------DESCENDING-----------"); // �������� ���
		for(int i = arr.length-1 ; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}
	
	
	
}
