import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] cal = input.split("\\.");
		
		for(int i = 0 ; i < cal.length ; i++) {
			if(cal[i].length() < 2) {
				String temp = cal[i];
				cal[i] = "0";
				cal[i] += temp;
			}
		}
		String result = "";
		for(int i = 0 ; i < cal.length ; i++) {
			result += cal[i];
			if(i == cal.length-1) {
				break;
			}else {
				result +=".";
			}
		}
		System.out.println(result);
		
	
	}
	
}
