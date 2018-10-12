
public class FinallyTryCatch {
	
	public static void main(String [] args) {
		try {
			int x = 5;
			int y = 20 / (5-x);
			System.out.println(y);
		}catch(ArithmeticException e) {
			System.out.println("==> 0 으로 나누었나 확인");
		}finally {
			System.out.println("수행 되어야 한다.");
		}
		
		
		
		
	}
	
	
}
