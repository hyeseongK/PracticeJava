import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = null;
		System.out.println("40자 이내로 문자를 입력");
		while(true) {	//40자 이내로 입력
			input = sc.nextLine();
			if(input.length() > 40) {
				System.out.println("40자 이내로 문자입력하시오");
			}else {
				break;
			}
		}
		
		char [] arr = input.toCharArray(); //입력 값 char배열로 변환
		char [] copy = new char[arr.length]; // 변경 전 배열 출력위해 복사 
		
		for(int i = 0 ; i < copy.length ; i++) { // 복사
			copy[i] = arr[i];
		}
		
		Loop1 : for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 97 && arr[i] <= 122) { //인덱스 값들이 아스키코드 소문자 값 범위내 있을 시 32를 빼주어 대문자로 변환하여 저장
				int a = arr[i] - 32;
				char b = (char)(a);
				arr[i] = b;
			}
			if(i >= 1) { // 공백 중복여부 검사
				if(arr[i] == ' ') {
					if(arr[i] == arr[i-1] || arr[i] == arr[i+1]) {
						System.out.println("공백을 연속되어 입력하지 마세요");
						break Loop1;
					}
				}
			}else {
				continue;
			}

		}
		
		System.out.print("변경 전 : "); // 출력
		for(int j = 0 ; j < copy.length ; j++) {
			System.out.print(copy[j]);
		}
		System.out.println();
		System.out.print("변경 후 : ");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
		}
	
		
		
		
	}

}
