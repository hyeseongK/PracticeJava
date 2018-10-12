
public class Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		
		for(int i = 1 ; i <= arr.length ; i++) {
			arr[i-1] = i;
		}
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i%2 != 0) {
				sum += i*i;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
