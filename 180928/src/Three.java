import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner str1 = new Scanner(System.in);
		
		System.out.println("입력할 개수 입력");
		int count = sc.nextInt(); 

		String [] str = new String[count]; //입력값을 기준으로 배열크기 생성
		String [][] copy = new String[str.length][7]; // 배열 복사를 위해 생성
		
		for(int i = 0 ; i < count ; i++){
			System.out.println(i);
			str[i] = str1.nextLine();
			copy[i] = str[i].split(" "); // 공백을 없애고 복사
		}
		
		int [][] num = new int[copy.length][7];
		
		for(int i = 0 ; i < num.length ; i++) { //split된 배열 copy[][]를 int형으로 변환 저장
			for(int j = 0 ; j < num[i].length ; j++) {
				num[i][j] = Integer.parseInt(copy[i][j]);
				
			}
		}
		
		int	min = 0;int sum = 0;int count1 = 0;
		for(int i = 0 ; i < num.length ; i++) {
			min = 0;sum = 0; // 한바퀴 돌때마다 초기화
			for(int j = 0 ; j < num[i].length ; j++) {
				if(num[i][j] % 2 == 0) { // 짝수 더하기
					sum += num[i][j];
					count1++; //배열의 첫번째 짝수를 찾기 위한 변수
					if(count1 == 1) { // 첫 번째 짝수 저장
						min = num[i][j];
					}else if(num[i][j] < min){ // 최소값 비교대조
						min = num[i][j];
					}
				}			
			}
			System.out.print((i+1)+ "번째" + "합 : " + sum + ", 최소값 : " + min);
			System.out.println();
		}

		
	}

}
