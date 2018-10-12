import java.util.Scanner;

public class Num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int idx = 0;
		Loop1:for(int i = 0 ; i< input.length() ; i++) { // 공백 값의 인덱스 찾기
			if(input.charAt(i) == ' ') {
				idx = i;
				break Loop1;
			}
		}
		
		String num = "";
		for(int i = 0 ; i < idx ; i++) { //인덱스 값까지 string 추가
			num += String.valueOf(input.charAt(i));
		}
		String num2 = "";
		for(int i = idx+1 ; i < input.length() ; i++) { // 인덱스값 다음부터 입력값 끝까지 String 추가
			num2 += input.charAt(i);
		}
		int Natural = Integer.parseInt(num); //나누어진 입력값들 parsing
		int Jinsu = Integer.parseInt(num2);
		
		if(Jinsu == 2) { //진수별로 변환 출력
			System.out.println(Integer.toBinaryString(Natural));
		}else if(Jinsu == 8) {
			System.out.println(Integer.toOctalString(Natural));
		}else if(Jinsu == 16) {
			System.out.println(Integer.toHexString(Natural));
		}else {
			System.out.println("2,8,16진수 중 입력");
			System.exit(1);
		}
		
		
		
	}

}
