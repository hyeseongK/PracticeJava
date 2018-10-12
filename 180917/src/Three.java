
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count = 0;
		for(int i = 0 ; i < 4 ; i++ ) {
				
			if(count < 2) {
				
				for(int k = 0 ; k < 2 ; k++) {
					System.out.print("*");
				}
				count++;
			}else {
					
				for(int k = 0 ; k < 5 ; k++) {
					System.out.print("*");
				}
				
			}	
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		count = 0;
		for(int i = 5 ; i > 0 ; i--) {
			if(count < 2) {
				
				for(int j = 0 ; j < 4 ; j++) {
					System.out.print("*");
					
				}
				count++;
			}else {
				for(int j = 0 ; j < 2 ; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
