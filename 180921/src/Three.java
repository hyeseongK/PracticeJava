import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Input A size : ");
		int [] A = new int[sc.nextInt()];
		System.out.print("Input X : ");
		int X = sc.nextInt();
	
		if(A.length < 1 || X > 10000) { //A,X의 입력조건
			System.out.println("should be A >= 1 and X <= 10000 ");
			System.exit(1);
		}
		
		Loop1:for(int i = 0 ; i < A.length ; i++) { //입력된 A의 값을 배열의 크기로 생성하고 각 인덱스 값 저장
			System.out.print("Input " + (i+1) + " : ");
			int j = sc.nextInt();
			if(j > 10000) {
				System.out.println("must be i <= 10000");
				break Loop1;
			}else {
				A[i] = j;
			}
			
		}
		
		System.out.print("Result : ");
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] < X) { // 배열 내 인덱스 값의 요소가 X보다 작은것들을 출력
				System.out.print(A[i] + " ");
			}
		}
		
		
	}

}
