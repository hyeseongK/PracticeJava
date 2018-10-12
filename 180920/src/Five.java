import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int a = sc.nextInt(); // 입력
		
		int length = (int)(Math.log10(a)); //입력값 자릿수 계산
		
		int big = (int)(Math.pow(10, length)); // a의 자릿수 만큼 10에 해당 자릿수 제곱
		int small = (int)(Math.pow(10, (length-1))); // a-1 자릿수 만큼 해당 자릿수 제공
		int count = 0;
		
		for(int i = big ; i < a ; i++) { // input값이 3자리라면 100부터 시작해서 input값까지 1씩 반복
			for(int j = small ; j < big -1 ; j++) { //2자리부터 2자리가 가질수 있는 최대값, big-1까지 1씩 증가하며 반복
			
				if((i+j) == a) { // big+small == input이라면 count++
					count++;
				}
				
			}
		}
		
		System.out.println(count); // 횟수 출력
		for(int i = big ; i < a ; i++) { // input값이 3자리라면 100부터 시작해서 input값까지 1씩 반복
			for(int j = small ; j < big -1 ; j++) { //2자리부터 2자리가 가질수 있는 최대값, big-1까지 1씩 증가하며 반복
			
				if((i+j) == a) { // big+small == input이라면 출력
					
					System.out.printf("%2d%2s%2d%2s%2d",i," + ", j," = ", (i+j));
					System.out.println();
				}
				
			}
		}
		
		
	}

}
