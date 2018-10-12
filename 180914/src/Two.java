
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+(1+2)+(1+2+3)+(1+2+3+...+10)의 결과 계산
		
		int tot = 0, sum = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
			tot += sum;
		}
		System.out.println(tot);
		
		
		
	}

}
