import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("First Input");
		String input1 = sc.nextLine();
		System.out.println("Second Input");
		String input2 = sc.nextLine();
		
		boolean bol = false;
		
		if(input1.replace(input2, " ") != input1) { //input1값에 input2가 들어있다면 해당 값이 공백으로 바껴 초기 input1값과 같지 않게 된다
			bol = true;								//그 말은 input2가 들어있다는 것을 의미하므로 true 출력
		}
		
		if(bol) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}

}
