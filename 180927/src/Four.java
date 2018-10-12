import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		int idx = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == ' ') {
				idx = i+1;
			}
			
		}
		String fir = "";
		for(int i = 0 ; i < idx - 1 ; i++) {
			fir += arr[i];
		}
		int num1 = Integer.parseInt(fir);
		
		String sec = "";
		for(int i = idx ; i < arr.length ; i++) {
			sec += arr[i];
		}
		int num2 = Integer.parseInt(sec);
		
		int temp = 0;
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("%d%s%d%s%d",num1," - ",num2," = ",(num1-num2));
		
	}

}
