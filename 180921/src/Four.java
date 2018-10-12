import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 다음 스페이스 바 누르고 두번째 수 입력");
		String str = sc.nextLine();
		
		int idx = 0; //인덱스값 초기화
		String input1 = "", input2 = ""; //2개로 나누어 저장할 변수 초기화
		
		for(int i = 0 ; i <str.length() ; i++) { //공백값의 인덱스값 찾아 인덱스변수에 저장
			if(str.charAt(i) == ' ') {
				idx = i;
			}
		}
		
		for(int i = 0 ; i < idx ; i++) { // 인덱스 변수까지 첫번째 값 저장
			input1 = input1 + String.valueOf(str.charAt(i));
			
		}
		for(int i = idx+1 ; i <str.length() ; i++) { // 인덱스 변수부터 input값까지 두번째 값 저장
			input2 = input2 + String.valueOf(str.charAt(i));
		}
		
		int First = Integer.parseInt(input1); // 첫번째 값 int로 parsing
		int Second = Integer.parseInt(input2); // 두번째 값 int로 parsing

		boolean isPrime; //소수 판별 변수 생성
		for(int i = First ; i <= Second ; i++) {
			isPrime = false; //매 시작마다 초기화
			
			for(int j = 2 ; j < i ; j++ ) { // 소수판별
				if(i % j == 0) { 
					isPrime = true;
					break;
				}
			}
			
			if(isPrime == true) { //소수가 아닐 시 다음 반복문
				continue;
			}else {
				System.out.println(i);
			}
			

		}
		
		
		
		
		
		
		
	}

}
