import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		int i,j;
		
		while(true) {
			System.out.println("1~3000 수 입력");
			for(i = 0 ; i < arr.length ; i++) {
				arr[i] = sc.nextInt();
				if(arr[i] >= 3000) {
					System.out.println("3000수 미만의 자연수를 입력하시오");
					break;
				}
			}
			break;
		}
		
		int max = 0;
		for(i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max  " + max);
		
		int min = 0;
		for(i = 0 ; i < arr.length ; i++) {
			if(i == 0) {
				min = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("min  " + min);
		
		System.out.println("total  " + (max-min));
		
		
	}

}
