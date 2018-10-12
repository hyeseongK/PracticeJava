import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 수 개수 입력");
		int a = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0 ; i < a ; i++) {
				System.out.println("1000~215000 정수 입력");
				arr.add(sc.nextInt());
				
			if(arr.get(i)<1000 || arr.get(i)>215000) {
				System.out.println("1000~215000 정수 입력하세요.");
				break;
			}
		}
		
		DecimalFormat df = new DecimalFormat("#,###");
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.println(df.format(arr.get(i)));
		}

	}

}
