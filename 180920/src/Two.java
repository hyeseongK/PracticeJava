import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ют╥б : ");
		String str = sc.nextLine();
		
		
		str = str.replace("%20", " ");
		str = str.replace("%21", "!");
		str = str.replace("%24", "$");
		str = str.replace("%25", "%");
		str = str.replace("%28", "(");
		str = str.replace("%29", ")");
		str = str.replace("%2a", "*");
		
		System.out.println(str);
		
	}

}
