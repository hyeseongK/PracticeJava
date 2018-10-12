import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Summary s = new Summary();
		int [] a = new int[10];
		
		for(int i = 0 ; i < 10 ; i++) {
			a[i] = sc.nextInt();
		}
		s.SetNum(a);
		
		s.operation();
		
	}


}


class Summary{
	int sum = 0;
	int[] i;
	
	public void SetNum(int [] arr) {
		i = arr;
	}
	
	public void operation() {
		for(int a = 0 ; a < i.length ; a++) {
			sum += i[a];
		}
		System.out.print(sum);
	}
}