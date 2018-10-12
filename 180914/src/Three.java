
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 + (-2) + 3 + (-4) + ... 으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하라
		
		int sum=0;
		int i=1;
		while(true) {
			
			if(i%2 == 0) {
				sum += -(i);
			}else {
				sum += i;
			}
			if(sum >= 100) {
				break;
			}else {
				i++;
			}
		}
		System.out.println(i);
		
		
		
	}

}
