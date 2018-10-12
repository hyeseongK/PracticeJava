import java.util.Scanner;

public class HapNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = String.valueOf(sc.nextInt());
		char [] carr = str.toCharArray();
		
		int sum = 0;
		
		for(int i = 0 ; i < carr.length ; i++) {
			
			int a = carr[i] - '0';
			sum += a;
			
		}
		
		System.out.println(sum);

	}

}
