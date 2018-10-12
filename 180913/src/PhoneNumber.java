import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		if(str.length() < 5 ||str.length() > 50) {
			System.out.println("5~50 ╪Ж ют╥б");
		}
		
		for(int i = 0 ; i < str.length() ; i++) {
			
			System.out.print(str.charAt(i));
			
			if(i == 2) {
				System.out.print("-");
				continue;
			}else if(i != 0 && (i+2) % 4 == 0){
				System.out.print("-");
			}
		}
		
		
	}
}
