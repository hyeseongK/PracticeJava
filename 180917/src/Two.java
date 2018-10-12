
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int [] counter = new int[4];
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.print(answer[i] + " : ");
			
			for(int j = 0 ; j < answer[i] ; j++) {
			
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
