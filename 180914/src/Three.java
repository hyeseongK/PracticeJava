
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 + (-2) + 3 + (-4) + ... ���� ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���϶�
		
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
