import java.text.DecimalFormat;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InOutput io = new InOutput();
		io.input();
		io.output();
		
		
	}

}



class InOutput{
	String name,str;
	int kor,eng,mat,sum;
	float avg;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Name : ");
		name = sc.nextLine();
		System.out.print("Input Kor : ");
		kor = sc.nextInt();
		System.out.print("Input Eng : ");
		eng = sc.nextInt();
		System.out.print("Input Mat : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = (kor + eng + mat) / 3;
		
		DecimalFormat format = new DecimalFormat(".##");
		str = format.format(avg);
		
	}
	
	void output() {
		System.out.println("-------------------------");
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum);
		System.out.println("평균 점수 : " + str);
		
	}
	
}