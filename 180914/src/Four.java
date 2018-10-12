
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0,j = 0;
		
		/*for(i = 0 ; i <= 10 ; i++) {
			for(j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/ 
		// 위 for문을 while문으로 변환
		
		while(i < 10) {
			j = 0;
			while(j <= 4) {
				System.out.print("*");
				j++;
			}
			
			System.out.print("-");
			i++;
		}
		
		
		
		
		
	}

}
