import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		String input = sc.nextLine();
		
		char [] arr = input.toCharArray();
		
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) {
				count++;
			}else if(arr[i] >= 65 && arr[i] <= 90) {
				count++;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
			
		}
		System.out.println();
		System.out.println(count);
		
		
		
	}

}
