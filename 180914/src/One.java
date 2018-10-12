
public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~20까지의 정수 중에 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		
		int tot = 0;
		for(int i = 1 ; i <= 20 ; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			tot += i;
		}
		System.out.println(tot);
		
		
		
	}

}
