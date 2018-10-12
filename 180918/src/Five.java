import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr = new Triangle(); 
		tr.input();
		tr.output();
	}

}

class Triangle {
	int bot, height;
	int area;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**** ªÔ∞¢«¸¿« ≥–¿Ã ±∏«œ±‚ ****");
		System.out.print("πÿ∫Ø : ");
		bot = sc.nextInt();
		System.out.println("");
		System.out.print("≥–¿Ã : ");
		height = sc.nextInt();
	}
	void Cal() {
		area = (bot * height) / 2;
	}
	void output() {
		Cal();
		System.out.println("--√‚∑¬--");
		System.out.println("≥–¿Ã : " + area);
		
	}
	
	
}