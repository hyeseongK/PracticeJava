import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		try {
			for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = sc.nextInt();
			}
		}catch(Exception e) {
			System.out.println("정수를 입력하라");
		}
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
