import java.text.DecimalFormat;
import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(df.format(input));
		
		
		
	}

}
