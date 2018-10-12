
public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345; // int 타입 변우 num이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		int sum = 0;    

		int length = (int)(Math.log10(num)+1);	// num의 자릿수 계산
		int ten = 10;
		int j = 0;
		
		for(int i = 1 ; i <= length ; i++) {
			
			if(i == 1) {
				j = num % 10;
				sum += j;
			}else {
				j = (num / ten) % 10;
				ten = ten*10;
				
				sum += j;
			}
		}
		
		System.out.println("sum = " + sum);
		
	}

}
