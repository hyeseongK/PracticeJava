import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int input = sc.nextInt();
		
		if(input >= 3600) {
			System.out.println("3600초 미만으로 입력하세요");
			System.exit(1);
		}
		int mok, namuzi;
		
		mok = input / 60;
		namuzi = input % 60;
		
		System.out.println(mok + ":" + namuzi);
		
	}

}
