import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print((i+1) + "¹øÂ° Input : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
