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
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.print("�غ� : ");
		bot = sc.nextInt();
		System.out.println("");
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	void Cal() {
		area = (bot * height) / 2;
	}
	void output() {
		Cal();
		System.out.println("--���--");
		System.out.println("���� : " + area);
		
	}
	
	
}