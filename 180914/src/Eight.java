
public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = "12o34"; // 문자열이 숫자인지를 판별하는 프로그램작성
		char ch = ' ';
		boolean isNumber = true;

		//반복문과 charAt(int i)를 이용해서 문자열의 문자를
		//하나씩 읽어서 검사한다
		for(int i = 0 ; i < value.length() ; i++) {
			ch = value.charAt(i);
			if( ch < 48 || ch > 57){ //아스키 코드 값이 48 ~ 57사이면 0과 9사이의 문자이다.
				isNumber = false;
				break;
			}
		}
		
		if(isNumber) {
			System.out.println(value + "는 숫자입니다.");
		}else {
			System.out.println(value + "는 숫자가 아닙니다."); 
		}
		
	}
}
