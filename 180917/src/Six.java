import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Average s = new Average();
		int [] a = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			a[i] = sc.nextInt();
		}
		s.SetNum(a);
		
		s.operation();
		
	}


}


class Average{
	int sum = 0;
	int[] i;
	float avg;
	
	public void SetNum(int [] arr) {
		i = arr;
	}
	
	public void operation() {
		for(int a = 0 ; a < i.length ; a++) {
			sum += i[a];
		}
		avg = sum/i.length;
		System.out.print(avg);
	}

}
