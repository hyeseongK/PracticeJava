import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt(); //input 값 입력
		int length1 = (int)(Math.log10(input1)+1); // input값 자릿수 저장
		int input2 = sc.nextInt();
		int length2 = (int)(Math.log10(input2)+1);
		
		String trans = String.valueOf(input2); //두번째 값 string형 변환
		
		char [] arr = trans.toCharArray(); // 변환된  String char배열 변환
		int [] arr2 = new int[arr.length]; // arr의 값을 int형을 바꿀 배열
		int [] result = new int[arr2.length];//arr2의 값을 첫번째 input값과 계산하여 저장

		
		if(length1 < 3 || length1 > 3) { //자릿수 검사
			System.out.println("입력값의 자릿수는 3자리");
		}else if(length2 <3 || length2 > 3) {
			System.out.println("입력값의 자릿수는 3자리");
		}
		for(int i = arr.length-1 ; i <= 0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
		for(int i = 0 ; i < arr2.length ; i++) { //int형 변환
			arr2[i] = arr[i] - '0';
		}
		
		
		int count = 100, sum = 0;
		for(int i = 0 ; i < result.length ; i++) {
			result[i] = input1*arr2[i]; //계산결과 저장
			sum += result[i] * count; // 계산결과 저장
			count /= 10;
		}
		
		for(int i = result.length-1 ; i >= 0 ; i--) { // 출력
			System.out.println(result[i]);
		}
		System.out.println(sum);
		
		
		
	}

}
