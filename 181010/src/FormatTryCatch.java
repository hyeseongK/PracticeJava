
public class FormatTryCatch {
	
	public static void main(String [] args) {
		String sNum = "123";
		String nNum = "h";
		
		try {
			int a = Integer.parseInt(sNum);
			System.out.println(a);
		}catch(NumberFormatException ee) {
			System.out.println("int 인지 확인");
			System.err.println(ee.getMessage());
		}catch(Exception ee) {
			System.out.println("제대로 넣어라");
		}finally {
			System.out.println("난 잘 수행되어야만 한다.");
		}
	}
}
